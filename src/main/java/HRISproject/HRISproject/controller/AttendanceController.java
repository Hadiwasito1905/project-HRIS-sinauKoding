package HRISproject.HRISproject.controller;

import HRISproject.HRISproject.common.RestResult;
import HRISproject.HRISproject.common.StatusCode;
import HRISproject.HRISproject.entity.Attendance;
import HRISproject.HRISproject.service.AttendanceService;
import HRISproject.HRISproject.utils.DateUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/attendance")
public class AttendanceController extends BaseController {

    @Autowired
    private AttendanceService service;

    @GetMapping
    public RestResult get(@RequestParam(value = "param", required = false) String param,
                          @RequestParam(value = "offset") int offset,
                          @RequestParam(value = "limit") int limit) throws JsonProcessingException {

        Attendance attendance = param != null ? new ObjectMapper().readValue(param, Attendance.class) : null;
        Long rows = service.count(attendance);

        return new RestResult(rows > 0 ? service.find(attendance, offset, limit) : new ArrayList<>(), rows);

    }

    @GetMapping("/by-date")
    public RestResult findByDate(@RequestParam(value = "param", required = false) String param,
                                 @RequestParam(value = "start-date") String startDate,
                                 @RequestParam(value = "end-date") String endDate) throws JsonProcessingException {
        RestResult result = new RestResult(StatusCode.OPERATION_FAILED);

        Attendance attendance = param != null ? new ObjectMapper().readValue(param, Attendance.class) : null;

        result.setData(service.findByDate(attendance,
                DateUtils.fromString(startDate),
                DateUtils.fromString(endDate)));
        result.setRows((long) service.findByDate(attendance,
                DateUtils.fromString(startDate),
                DateUtils.fromString(endDate)).size());

        return result;

    }

    @PostMapping
    public RestResult save(@RequestBody Attendance param) {
        RestResult result = new RestResult(StatusCode.OPERATION_FAILED);

        if (param != null) {
            result.setData(service.save(param));
            result.setStatus(StatusCode.SAVE_SUCCESS);
        }

        return result;
    }

    @PutMapping
    public RestResult update(@RequestBody Attendance attendance) {
        RestResult result = new RestResult(StatusCode.OPERATION_FAILED);

        if (attendance != null) {
            result.setData(service.update(attendance));
            result.setStatus(StatusCode.UPDATE_SUCCESS);
        }

        return result;
    }

    @PutMapping("/start-rest")
    public RestResult startRest(@RequestBody Attendance param) {
        RestResult result = new RestResult(StatusCode.OPERATION_FAILED);

        if (param != null) {
            result.setData(service.startRest(param));
            result.setStatus(StatusCode.UPDATE_SUCCESS);
        }

        return result;
    }

    @PutMapping("/end-rest")
    public RestResult endRest(@RequestBody Attendance param) {
        RestResult result = new RestResult(StatusCode.OPERATION_FAILED);

        if (param != null) {
            result.setData(service.endRest(param));
            result.setStatus(StatusCode.UPDATE_SUCCESS);
        }

        return result;
    }

    @DeleteMapping(value = "{id}")
    public RestResult delete(@PathVariable Long id) {
        boolean deleted = false;
        Attendance entity = service.findById(id);

        if (entity != null) {
            service.updateDeleteStatus(id);
            deleted = service.delete(id);
        }

        return new RestResult(deleted ? StatusCode.DELETE_SUCCESS : StatusCode.DELETE_FAILED);
    }

}