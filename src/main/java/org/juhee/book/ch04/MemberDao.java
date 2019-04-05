package org.juhee.book.ch04;

import java.util.HashMap;
import java.util.Map;

import org.juhee.book.ch03.Member;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

	Map<String, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}