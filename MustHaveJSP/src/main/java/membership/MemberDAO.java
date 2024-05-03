package membership;

import common.JDBConnect;

public class MemberDAO extends JDBConnect{
	
	public static void main(String[] args) {
		String drv = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/musthave";
		String id = "user";
		String pwd = "1234";
		MemberDAO dao = new MemberDAO(drv,url,id,pwd);
		
		MemberDTO dto=dao.getMemberDTO("musthave","1234");
		System.out.println(dto);
	}	

	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw); //super()는 부모클래스의 생성자, 생성자가 호출되면 DB연결이 완료됩니다.
	}

	public MemberDTO getMemberDTO(String uid, String upass) {
		MemberDTO dto = new MemberDTO();
		String query = "SELECT * FROM member WHERE id=? AND pass=?";
		//매개변수로 받은 아이디/패스워드와 일치하는 회원을 찾아 MemberDTO형태로 호출
		
		try {
			psmt = con.prepareStatement(query); //동적쿼리문을 실행하기위한 PrepareStatement 객체 생성
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			rs=psmt.executeQuery();

			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return dto;
	}

}
