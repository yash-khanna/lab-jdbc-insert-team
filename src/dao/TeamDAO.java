package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	public void createTeam(Team team){
		String sql="insert into team(name,coach,captain,city) values(?,?,?,?)";
		ConnectionManager c=new ConnectionManager();
		try {
			Connection con=c.getConnection();
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1,team.getName());
			st.setString(2,team.getCoach());
			st.setString(3,team.getCaptain());
			st.setString(4,team.getCity());
			System.out.println(sql);
			st.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

