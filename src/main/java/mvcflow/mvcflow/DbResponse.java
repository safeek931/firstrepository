package mvcflow.mvcflow;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbResponse {

	public List<PrimaryData> getPrimaryDBResponse() {

		List<PrimaryData> primaryList = new ArrayList<PrimaryData>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/primarydb", "root",
					"admin");
			Statement statement = connection.createStatement();

			ResultSet res = statement.executeQuery("select * from primarydata");

			while (res.next()) {

				int id = res.getInt("id");
				String name = res.getString("name");

				PrimaryData primaryData = new PrimaryData();
				primaryData.setId(id);
				primaryData.setName(name);

				primaryList.add(primaryData);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return primaryList;

	}

	public List<SecondaryData> getSecondaryDBResponse() {

		List<SecondaryData> secondaryList = new ArrayList<SecondaryData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/secondarydb", "root",
					"admin");
			Statement statement = connection.createStatement();

			ResultSet res = statement.executeQuery("select * from secondarydata");

			while (res.next()) {

				int id = res.getInt("id");
				String name = res.getString("name");

				SecondaryData secondaryData = new SecondaryData();
				secondaryData.setId(id);
				secondaryData.setName(name);

				secondaryList.add(secondaryData);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return secondaryList;

	}

}
