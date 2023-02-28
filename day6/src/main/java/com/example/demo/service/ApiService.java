package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.models.Child;
import com.example.demo.repositories.ChildRepo;

@Service
public class ApiService {
	@Autowired
	ChildRepo repository;
	public boolean addChild(Child child) {
		repository.save(child);
		return true;
	}
	public List<Child> getSortedChild(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<Child> getChildWithPagination(int offset,int pagesize){
		Page<Child> child=repository.findAll(PageRequest.of(offset, pagesize));
		return child.getContent();
	}
	public List<Child> getChildWithSortedPagination(int offset,int pagesize,String field){
		Page<Child> child=repository.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
		return child.getContent();
	}
}
