package jh_package;


public class MemberService {

	MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void registerMember() {
		memberDao.getMember();
	}
}