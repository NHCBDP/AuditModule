package NHCBDP.auditModule.Controllers;

import NHCBDP.auditModule.Domain.RequestNote;
import NHCBDP.auditModule.Domain.TableFieldBean;
import NHCBDP.auditModule.Services.DataSourceService;
import NHCBDP.auditModule.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wbliu
 * @create 2017-09-05 15:26
 **/

@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    UserService userService;

    @Autowired
    DataSourceService dataSourceService;


    @RequestMapping(value = "/getRequestNote/{userName}",method = RequestMethod.GET)
    public List<RequestNote>  getRequestNote(@PathVariable("userName") String userName){
        return dataSourceService.getRequestNote(userName);
    }

    @RequestMapping(value = "/getRequestNoteByRequestNoteId/{requestNoteId}",method = RequestMethod.GET)
    public List<RequestNote>  getRequestNoteByRequestNoteId(@PathVariable("requestNoteId") String requestNoteId){
        return dataSourceService.getRequestNoteByRequsetNoteId(requestNoteId);
    }

    @RequestMapping(value = "/updateRequestNoteStatus/{requestNoteId}/{statusCode}",method = RequestMethod.PUT)
    public String updateRequestNoteStatus(@PathVariable("requestNoteId") String requestNoteId, @PathVariable("statusCode") int statusCode){
        return dataSourceService.updateRequestNoteStatus(requestNoteId,statusCode);
    }






}
