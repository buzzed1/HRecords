import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



public class databaseCon 
{
	
		public static void main(String args[]) throws ClassNotFoundException {
			
			final String DATABASE_URL = "jdbc:mysql://localhost:3306/healthrecords";
			final String SELECT_QUERY = "SELECT id, medicaidID, firstname, lastname FROM consumers";
			
			System.out.println("connecting to database....");
	
			
	try {	
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(DATABASE_URL, "root", "SudoRenice-12");
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
	
		ResultSetMetaData metaData = resultSet.getMetaData();
		int numberOfColumns = metaData.getColumnCount();
		
		for (int i = 1; i <= numberOfColumns; i++)
				System.out.printf("-%-8s\t", metaData.getColumnName(i));
		System.out.println();
		
		while (resultSet.next())
			{
			for (int i = 1; i <= numberOfColumns; i++)
				System.out.printf("%-8s\t", resultSet.getObject(i));
			System.out.println();
			
			}
		System.out.println();
		System.out.println("Total Columns " + numberOfColumns);
		conn.close();
		System.out.println("connection to database closed..");
		}
	catch(SQLException sqlException) {
			sqlException.printStackTrace();
			}	
	
		}
	}





