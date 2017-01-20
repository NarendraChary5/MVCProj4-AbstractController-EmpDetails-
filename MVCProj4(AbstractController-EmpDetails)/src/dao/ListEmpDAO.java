package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bo.EmpBO;

public class ListEmpDAO {
	public static final String GET_EMP_DETAILS="SELECT ID,NAME,DESG,SALARY FROM EMP";
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public List<EmpBO> retriveEmpDetails()
	{
		List<EmpBO> listbo=jt.query(GET_EMP_DETAILS, new RowMapper<EmpBO>()
				{
					@Override
					public EmpBO mapRow(ResultSet rs, int pos) throws SQLException {
						EmpBO bo = new EmpBO();
						bo.setId(rs.getInt(1));
						bo.setName(rs.getString(2));
						bo.setDesg(rs.getString(3));
						bo.setSalary(rs.getInt(4));
						/*List<EmpBO> listbo2= new ArraList<EmpBO>();
						while(rs.next())
						{
							EmpBO bo = new EmpBO();
							bo.setId(rs.getInt(1));
							bo.setName(rs.getString(2));
							bo.setDesg(rs.getString(3));
							bo.setSalary(rs.getInt(4));
							
						}*/
						return bo;
					}			
				});
		return listbo;
	}
}