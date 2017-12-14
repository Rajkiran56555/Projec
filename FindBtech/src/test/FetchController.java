package test;

import java.sql.*;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FetchController {
 
	@RequestMapping("/home")
	public ModelAndView homePage()
	{
		ModelAndView model=new ModelAndView("FindCollege");
		return model;
	}
	
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(@RequestParam("rank")String rank,@RequestParam("gender")String gender,@RequestParam("district")String district,@RequestParam("category")String category)
	{
		ArrayList<College> colleges=prepareCollege(rank,gender,district,category);
		ModelAndView model=new ModelAndView("FindCollege","colleges",colleges);
		
		
		return model;
	}
	
	public ArrayList<College> prepareCollege(String rank,String gender,String district,String category)
	{
		
		ArrayList<College> list=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://cvcorp.chan2viov052.us-east-1.rds.amazonaws.com/findBtech","root","shivudu3");
			
			category=category+"_"+'B';
			
			PreparedStatement pst=conn.prepareStatement("select * from college where "+category+">? && dist=?");
			pst.setInt(1, Integer.parseInt(rank));
			pst.setString(2, district);
		  ResultSet rs= pst.executeQuery();
		  list=new ArrayList<College>();
		  College college;
		  while(rs.next())
		  {
			  college=new College(rs.getString(1),rs.getString(2),rs.getString(19),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),
					  rs.getInt(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getInt(12),rs.getInt(13),rs.getInt(14),rs.getInt(15),rs.getInt(16),rs.getInt(17),rs.getInt(18)
					 );
		
			  list.add(college);
		  }
		  rs.close();
		  pst.close();
		  conn.close();
			
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return list;
	}
}
