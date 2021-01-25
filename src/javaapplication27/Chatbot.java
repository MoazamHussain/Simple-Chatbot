/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author Moazam
 */
import java.io.*;
import java.util.*;
import java.sql.*;

public class Chatbot {
    
    public static void main(String args[])throws IOException
    {
        String begin="",fname="",lname="",gender="",status="",addr="",phno="",city="",dob="",insurance="",state="",pcode="",country="";
        int eid=0,basic=0,da=0,hra=0,convey=0,allow=0,med=0,tds=0,esi=0,pf=0,leaves=0,tax=0,labour=0,net=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nWelcome to chatbot\n");
        System.out.println("\nWould u like to use the chatbot?? (y / n)\n");
        begin=br.readLine();
        
        if(begin.equalsIgnoreCase("y"))
        {
            System.out.println("\nEmployee Personal Details\n");
            
            
            System.out.println("\nFirstname\n");
            fname=br.readLine();
            if(!(fname.equals("")))
            {
                System.out.println("\nLastname\n");
            lname=br.readLine();
            if(!(lname.equals("")))
            {
                System.out.println("\nGender (m/f)\n");
            gender=br.readLine();
            if(!(gender.equals("")))
            {
                System.out.println("\nStatus (married / single)\n");
            status=br.readLine();
            if(!(status.equals("")))
            {
                System.out.println("\nAddress\n");
            addr=br.readLine();
            if(!(addr.equals("")))
            {
                System.out.println("\nPhone number (10 digits only)\n");
            phno=br.readLine();
            if(!(phno.equals("")))
            {
                System.out.println("\nCity\n");
            city=br.readLine();
            if(!(city.equals("")))
            {
                System.out.println("\nDate of Birth (dd/mm/yyyy)\n");
            dob=br.readLine();
            if(!(dob.equals("")))
            {
                System.out.println("\nInsurance (health / life)\n");
            insurance=br.readLine();
            if(!(insurance.equals("")))
            {
                System.out.println("\nState\n");
            state=br.readLine();
            if(!(state.equals("")))
            {
                System.out.println("\nPostal code (6 digits only)\n");
            pcode=br.readLine();
            if(!(pcode.equals("")))
            {
                System.out.println("\nCountry\n");
            country=br.readLine();
            if(!(country.equals("")))
            {
                System.out.println("\nEmployee ID( 100 > )\n");
            eid=Integer.parseInt(br.readLine());
            if(eid>0)
            {
                System.out.println("\n-----------------------------------------------------------\n");
                System.out.println("\nEmployee salary details\n");
                System.out.println("\nBasic\n");
            basic=Integer.parseInt(br.readLine());
            if(basic>0)
            {
                System.out.println("\nDA\n");
            da=Integer.parseInt(br.readLine());
            if(da>0)
            {
                System.out.println("\nHRA\n");
            hra=Integer.parseInt(br.readLine());
            if(hra>0)
            {
                System.out.println("\nConveyance\n");
            convey=Integer.parseInt(br.readLine());
            if(convey>0)
            {
                System.out.println("\nAllowance\n");
            allow=Integer.parseInt(br.readLine());
            if(allow>0)
            {
                System.out.println("\nMedical\n");
            med=Integer.parseInt(br.readLine());
            if(med>0)
            {
                System.out.println("\nTDS\n");
            tds=Integer.parseInt(br.readLine());
            if(tds>0)
            {
                System.out.println("\nESI\n");
            esi=Integer.parseInt(br.readLine());
            if(esi>0)
            {
                System.out.println("\nPF\n");
            pf=Integer.parseInt(br.readLine());
            if(pf>0)
            {
                System.out.println("\nLeaves\n");
            leaves=Integer.parseInt(br.readLine());
            if(leaves>0)
            {
                System.out.println("\nTax\n");
            tax=Integer.parseInt(br.readLine());
            if(tax>0)
            {
                System.out.println("\nLabour\n");
            labour=Integer.parseInt(br.readLine());
            if(labour>0)
            {
                System.out.println("\nAll details entered successfully\n");
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            }
            else
            {
                System.exit(0);
            }
            
        }
        else
        {
            System.exit(0);
        }
        int add=0,sub=0;
        add=add+da+hra+convey+allow+med;
        sub=sub-tds-esi-pf-leaves-tax-labour;
        net=net+basic+add-sub;
        
       try
       {
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payslip","root",""); 
    
        
  String sql=("INSERT INTO emp(firstname,lastname,gender, "
          + "status,address,phno,city,dob,insurance,state,postalcode,country,join_date,username,password,emp_id) "
          + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,CURDATE(),?,?,?)");
  PreparedStatement ps=con.prepareStatement(sql);
  
   ps.setString(1,fname);
       ps.setString(2,lname);
       ps.setString(3,gender);
       ps.setString(4,status);
       ps.setString(5,addr);
       ps.setString(6,phno);
       ps.setString(7,city);
       ps.setString(8,dob);
       ps.setString(9,insurance);
       ps.setString(10,state);
       ps.setString(11,pcode);
       ps.setString(12,country);
       ps.setString(13,fname);
       ps.setString(14,phno);
       ps.setInt(15,eid);
       ps.executeUpdate();
       
       
       String sql1=("INSERT INTO login(username,password,type) VALUES (?,?,?)");
       
       PreparedStatement ps1=con.prepareStatement(sql1);
       ps1.setString(1,fname);
       ps1.setString(2,phno);
       ps1.setString(3,"Employee");
       ps1.executeUpdate();
       
       
       String sql3=("INSERT INTO salary(emp_id,basic,da,hra,conveyance,allowance,medical,tds,esi,pf,leaves,tax,labour,net_sal) "
          + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
  PreparedStatement ps3=con.prepareStatement(sql3);
  
   ps3.setInt(1,eid);
       ps3.setInt(2,basic);
       ps3.setInt(3,da);
       ps3.setInt(4,hra);
       ps3.setInt(5,convey);
       ps3.setInt(6,allow);
       ps3.setInt(7,med);
       ps3.setInt(8,tds);
       ps3.setInt(9,esi);
       ps3.setInt(10,pf);
       ps3.setInt(11,leaves);
       ps3.setInt(12,tax);
       ps3.setInt(13,labour);
       ps3.setInt(14,net);
       
       ps3.executeUpdate();
  
  
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }

  }  

  


        
    }
    

