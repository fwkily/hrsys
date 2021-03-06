/** 
* <p>application name： sample1</p> 
* <p>application describing： this class handels the request of the client</p> 
* <p>copyright： Copyright ® 2016 大连民族大学版权所有</p> 
* <p>company： dlnu</p> 
* <p>time： 2016.06.27</p> 
* 
* @author 莫绍聪 
* @version ver 3.1 
*/

package dlnu.hrsys.employee.leaveDao;

import java.sql.Date;
import java.util.List;

import dlnu.hrsys.employee.leave.Leave;
import dlnu.hrsys.util.DBUtil.DBException;

public interface LeaveDao {
	
	//添加并删除
	public boolean addLeave(Leave l);
	//输入添加信息
	public Leave inputAdd(int id, Date leave_time, int leave_reason_id,
			String destination) throws DBException;
	//修改
	public boolean updLeave(Leave l);
	//全部查询
	public List<Leave> findAll();
	//员工简略信息查询
	public List<Leave> findSketchy();
	//员工详细信息查询
	public Leave findDetail(int id);
	//模糊查询
	public List<Leave> findEveryThing(int employee_id, String name, String department,
			String job, int leave_reason_id, Date leave_time1, Date leave_time2);
	//入职部门名称查询
	public List<Leave> findE_Department(String department);
	//入职员工编号查询
	public List<Leave> findE_Employee_id(int employee_id);
	//入职员工姓名查询
	public List<Leave> findE_Name(String name);
	//离职日期查询
	public List<Leave> findL_Leave_time(Date B_leave_time, Date F_leave_time);
}



