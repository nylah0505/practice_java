package day14;

public class Member {
	public int id;
	
	public Member(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id == member.id) {
				return true;
			}
		}
		return false;
	}
}
