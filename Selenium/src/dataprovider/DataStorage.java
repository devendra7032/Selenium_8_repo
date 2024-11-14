package dataprovider;



import org.testng.annotations.DataProvider;

public class DataStorage 
{
	@DataProvider
	public String[][] loginData()
	{
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}
	@DataProvider
	public String[][] registerData()
	{
		String[][] data= {
				{"virat","kohli","virat@133gmail.com","virat122","virat122"},
				{"rohit","sharma","rohit@122gmail.com","rohit133","rohit133"},
				{"jasprit","bumrah","bumrah133@gmail.com","bumrah122","bumrah122"},
				{"mohmad","siraj","siraj133@gmail.com","siraj122","siraj122"},
				{"kl","rahul","rahul133@gmail.com","rahul122","rahul122"}
					
				
					
				
					
				
				
		};
	return data;
	}

}
