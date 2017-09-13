# AuditModule
spring-boot-demo 2



#####develop ####

jdk : 1.8
tomcat: 8.x
spring-boot:1.5.6
mysql:5.x
centos 7

package  :mvn -Dmaven.test.skip=true package

run jar : java -jar webModule.jar

run port : 8012







########   API #################

#登录：

 GET请求： http://localhost:8012/AuditModule/user/login?userName=wbliu&password=e10adc3949ba59abbe56e057f20f883e

 响应：success 或者 error
   
   
 -----------------------------------------
 

#注册：
  
 POST请求： http://localhost:8012/AuditModule/user/register
 
 参数：{"userName":"test001","password":"123456"}
 
 响应：success 或者 error 或者 User already exist


备注：暂时改成了GET请求，类似于登录功能；



#登出
GET 请求：http://localhost:8012/AuditModule/user/loginOut?userName=wbliu

响应：success 或者 error


------------------------------------
#获得用户的所有“申请单”记录；
GET请求：http://localhost:8012/AuditModule/business/getRequestNote/{userName}

响应：
[
    {
        "formId": "27bfe9758f65430cb6908a9f43d19f31",
        "requestName": "test002",
        "requestUserId": "111111",
        "companyName": "company",
        "illustration": "test",
        "content": "select * from test",
        "status": 0,
        "userName": "wbliu"
    },
    {
        "formId": "64ad45370ab745b9b7e58daf7fcd7eb1",
        "requestName": "test002",
        "requestUserId": "111111",
        "companyName": "company",
        "illustration": "test",
        "content": "select * from test",
        "status": 0,
        "userName": "wbliu"
    },
    {
        "formId": "f3b2a9031f03410d90bfacd11f434745",
        "requestName": "test",
        "requestUserId": "111111",
        "companyName": "company",
        "illustration": "test",
        "content": "select * from test",
        "status": 0,
        "userName": "wbliu"
    }
]


-------------------------------------------------

#根据‘申请单号’，获得用户的所有“申请单”记录；

GET请求：http://localhost:8012/AuditModule/business/getRequestNoteByRequestNoteId/{requestNoteId}

返回：[
       {
           "formId": "27bfe9758f65430cb6908a9f43d19f31",
           "requestName": "test002",
           "requestUserId": "111111",
           "companyName": "company",
           "illustration": "test",
           "content": "select * from test",
           "status": 0,
           "userName": "wbliu"
       }
   ]




-------------------------------------------------

#根据‘申请单号’，修改“申请单”的状态；

PUT请求：http://localhost:8012/AuditModule/business/updateRequestNoteStatus/{requestNoteId}/{statusCode}

返回：27bfe9758f65430cb6908a9f43d19f31:2 或者 update error

---------------------------------------------------------










