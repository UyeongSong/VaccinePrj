package com.kosa.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements IMemberService{

	@Autowired
	IMemberRepository memberRepository;
	
	@Override
	public MemberVO selectMember(String userId) {
	
		return memberRepository.selectMember(userId);
	}
	
}
