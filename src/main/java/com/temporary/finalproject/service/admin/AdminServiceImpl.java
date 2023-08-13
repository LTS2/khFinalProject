package com.temporary.finalproject.service.admin;

import com.temporary.finalproject.model.dao.admin.AdminDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class AdminServiceImpl implements AdminService{
	private AdminDAO adminDAO;


	// 아래는 예시 메서드 입니다.
	@Override
	@Transactional // 트랜잭션 처리
	public void addSomething(String something) {
		adminDAO.addSomething(something);
	}
}
