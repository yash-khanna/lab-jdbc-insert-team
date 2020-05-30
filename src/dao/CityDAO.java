package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) {
		String sql="select * from city where name=(?)";
		ConnectionManager c=new ConnectionManager();
		try {
			Connection con=c.getConnection();
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1,name);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				System.out.println("City ID   : "+rs.getString("id"));
				System.out.println("City Name : "+rs.getString("name"));
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
