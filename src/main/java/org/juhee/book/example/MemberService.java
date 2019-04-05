package org.juhee.book.example;

import org.juhee.book.example.MemberDao;

public class MemberService {

	MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void registerMember() {
		memberDao.getMember();
	}
}