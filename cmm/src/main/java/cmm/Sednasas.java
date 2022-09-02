package cmm;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusMessageBatch;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

import reactor.core.publisher.Flux;

public class Sednasas {

	public static void main(String[] args) {

		
		  JSONParser parser = new JSONParser();
			try {

				Object obj = parser
						.parse(new FileReader("C:\\Users\\skasam\\OneDrive - Teleflora LLC\\Desktop\\test.json"));
				JSONObject jsonObject = (JSONObject) obj;

				ServiceBusSenderClient sender = new ServiceBusClientBuilder().connectionString(
						"Endpoint=sb://if-camsintegration-svcbus-sandbox-uks.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=2mK/h7FtuQPq6lJWKijfmznTa2KktD8KPqrzwvYf6y8=")
						.sender().queueName("testqueue").buildClient();

//				for (int i = 01; i < 101; i++) {
//					String rep = "GBOAA" + "90" + i;
//					String mes = jsonObject.toString().replace("GBOXU212", rep);
				System.out.println("line 36" +jsonObject );
					sender.sendMessage(new ServiceBusMessage(jsonObject.toString()));
//				}
				sender.close();

			} catch (Exception e) {
			e.printStackTrace();
		}
		 
	
	}

}
