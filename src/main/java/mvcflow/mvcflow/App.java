package mvcflow.mvcflow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		DbResponse dbResponse = new DbResponse();

		List<PrimaryData> primaryResponse = dbResponse.getPrimaryDBResponse();
		List<SecondaryData> secondaryResponse = dbResponse.getSecondaryDBResponse();

		Map<Integer, PrimaryData> primaryMap = new HashMap<Integer, PrimaryData>();

		if (!primaryResponse.isEmpty()) {
			for (PrimaryData primaryData : primaryResponse) {
				if (primaryData != null) {

					primaryMap.put(primaryData.getId(), primaryData);
				}

			}
		}

		if (!secondaryResponse.isEmpty()) {

			for (SecondaryData secondaryData : secondaryResponse) {

				if (secondaryData != null) {
					
					PrimaryData pd= primaryMap.get(secondaryData.getId());
					
					System.out.println("ID:"+pd.getId()+" "+"UserName:"+pd.getName()+" "+"ProductName:"+secondaryData.getName());

				}
			}
		}
	}
}
