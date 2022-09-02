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

public class Sednasas2 {

	public static void main(String[] args) {

		
		  JSONParser parser = new JSONParser();
			try {

				Object obj = parser
						.parse(new FileReader("C:\\Users\\skasam\\OneDrive - Teleflora LLC\\Desktop\\test.json"));
				JSONObject jsonObject = (JSONObject) obj;

				ServiceBusSenderClient sender = new ServiceBusClientBuilder().connectionString(
						"Endpoint=sb://if-international-integrations-sb-dev-uks.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=07/5YqtPSUnhU4xFzbNByVzPLDogA4DTjEryFXO49O0=")
						.sender().queueName("if-international-integrations-order-inbound-sbq-dev-uks").buildClient();

				for (int i = 02; i < 03; i++) {
					String rep = "GAED" + "01" + i;
					String mes = jsonObject.toString().replace("GBOXU212", rep);
					sender.sendMessage(new ServiceBusMessage(mes));
				}
				sender.close();

			} catch (Exception e) {
			e.printStackTrace();
		}
		 
	
	}

}
