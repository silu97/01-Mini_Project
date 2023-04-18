package com.silu.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.silu.entity.CitizenPlan;
import com.silu.search.SearchRequest;



public interface ReportService {
	
	public List<String> getPlanNames();

	public List<String> getPlanStatuses();

	public List<CitizenPlan> search(SearchRequest request);

	public boolean exportExcel(HttpServletResponse response) throws Exception;

	public boolean exportPdf(HttpServletResponse response) throws Exception;

}
