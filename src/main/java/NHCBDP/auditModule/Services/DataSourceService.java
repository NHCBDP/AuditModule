package NHCBDP.auditModule.Services;


import NHCBDP.auditModule.Domain.RequestNote;
import NHCBDP.auditModule.Domain.TableFieldBean;

import java.util.List;
import java.util.Map;

/**
 * @author wbliu
 * @create 2017-09-05 16:34
 **/

public interface DataSourceService {
    List getTableDescribe(String tableName);

    List  getAllTableDescribe(String dbName);

    Map<String,List<Map<String,List<TableFieldBean>>>>  getAllTableDescribe();

    String   commitRequestNote(RequestNote requestNote);

    List<RequestNote>  getRequestNote(String userName);

    List<RequestNote>  getRequestNoteByRequsetNoteId(String requestNoteId);
}
