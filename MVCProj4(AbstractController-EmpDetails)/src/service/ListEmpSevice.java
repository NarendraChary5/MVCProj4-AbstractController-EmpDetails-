package service;

import java.util.ArrayList;
import java.util.List;

import bo.EmpBO;
import dao.ListEmpDAO;
import dto.EmpDTO;

public class ListEmpSevice {
	private ListEmpDAO dao;

	public void setDao(ListEmpDAO dao) {
		this.dao = dao;
	}
	
	public List<EmpDTO> getEmpDetails()
	{
		List<EmpBO> listbo=dao.retriveEmpDetails();
		//convert bo to dto
		List<EmpDTO> listdto = new ArrayList<EmpDTO>();
		for (EmpBO bo : listbo) {
			EmpDTO dto = new EmpDTO();
			dto.setId(bo.getId());
			dto.setName(bo.getName());
			dto.setDesg(bo.getDesg());
			dto.setSalary(bo.getSalary());
			listdto.add(dto);
		}
		return listdto;
	}
}