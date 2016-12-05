package com.fatmazaman.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import com.fatmazaman.dto.model.EmpDTO;
import com.fatmazaman.dto.model.DeptDTO;

import ch.qos.logback.classic.Logger;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RestController
@RequestMapping
@Api(value = "Emp_Dept")


public class FatmaZamanController {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(FatmaZamanController.class);
	
	
	@ResponseBody
	@RequestMapping(value = "fatmazaman/id", method = RequestMethod.GET, produces = "fatmazaman/json")
	@ApiOperation(value = "Get Employee details employe id", response = EmpDTO.class)
	@ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Success", response = EmpDTO.class),
	            @ApiResponse(code = 401, message = "Unauthorized"),
	            @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Failure")})  
	public EmpDTO infobyemployeename(@PathVariable String name)  {
		logger.info(name);
		if((name.isEmpty())){
			logger.error("name is not correct");
		}
		logger.debug("name of employee:" +name);
		EmpDTO emp_id = fatzamaninterfaces.infobyemployeename(name);
		
		return emp_id;
		}
	@ResponseBody
	@RequestMapping(value = "/fatmazaman/manager_name", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Employee Salary")
	@ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EmpDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	
	public EmpDTO updatemployee(@RequestBody String manager_name)  {
		logger.info("update employee");
		logger.debug("manager name from employee details:" +manager_name);
		if(manager_name == null){
			logger.error("value is not valid");
		}
		return fatzamaninterfaces.newemployee(manager_name);
		}
	@ResponseBody
	@RequestMapping(value = "/fatmazaman/manager_name", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Salary")
	@ApiResponses(value = { 
	@ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EmpDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	
	public EmpDTO updateSalary(@RequestBody int sal)  {
		logger.info("salary updation");
		logger.debug("Salary details:" +sal);
		if(sal == 0){
			logger.error("value is not valid");
		}
		
		return fatzamaninterfaces.updateSalary(sal);
		}
	@ResponseBody
	@RequestMapping(value = "/fatmazaman/id", method = RequestMethod.POST)
	@ApiOperation(value = "Create Employee ")
	@ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EmpDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public EmpDTO createmployee(@RequestBody  String  manager_name )  {
		logger.info("create employee");
		logger.debug("create employee" +manager_name);
		if(manager_name == null){
			logger.error("wrong input");
		}
		return fatzamaninterfaces.createmployee(manager_name);

		}	
	
	@ResponseBody
	@RequestMapping(value = "/fatmazaman/id", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Employee ")
	@ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EmpDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	
	public EmpDTO deletemployee(@PathVariable  String name )  {
		logger.info("name of the employee to delete");
		if(name == null){
			logger.error("wrong input");
		}
		logger.debug("Delete employee" +name);
		
		fatzamaninterfaces.deletemployee(name);
		return null;
		}
	@ResponseBody
	@RequestMapping(value = "/fatmazaman/id", method = RequestMethod.POST)
	@ApiOperation(value = "Create Employee ")
	@ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EmpDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public EmpDTO createmployee1(@RequestBody  String  manager_name )  {
		logger.info("create employee");
		logger.debug("create employee" +manager_name);
		if(manager_name == null){
			logger.error("wrong input");
		}
		return fatzamaninterfaces.createmployee(manager_name);
		}	

	@ResponseBody
	@RequestMapping(value = "fatmazaman/id", method = RequestMethod.GET, produces = "fatmazaman/json")
	@ApiOperation(value = "Get Department details - id", response = DeptDTO.class)
	@ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = DeptDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public DeptDTO departmentinfo(@PathVariable String name)  {
		logger.info(name);
		if((name.isEmpty())){
			logger.error("name is not correct");
		}
		logger.debug("name of employee:" +name);
		DeptDTO dept_id = fatzamaninterfaces.infobydepartment(name);
		
		return dept_id;
		}
	@ResponseBody
	@RequestMapping(value = "/fatmazaman/id", method = RequestMethod.POST)
	@ApiOperation(value = "Create Department ")
	@ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EmpDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public DeptDTO createdepartment(@RequestBody  DeptDTO dept_name )  {
		logger.info("create department");
		logger.debug("create department" +dept_name);
		if(dept_name == null){
			logger.error("wrong input");
		}
		return fatzamaninterfaces.createdepartment(dept_name);
		
		}
	
}
