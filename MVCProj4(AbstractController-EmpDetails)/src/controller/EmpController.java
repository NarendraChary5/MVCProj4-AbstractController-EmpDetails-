package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dto.EmpDTO;
import service.ListEmpSevice;

public class EmpController extends AbstractController{
	private ListEmpSevice service;
	public void setService(ListEmpSevice service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<EmpDTO> listdto = service.getEmpDetails();
		return new ModelAndView("listEmp","empList",listdto);
	}
}