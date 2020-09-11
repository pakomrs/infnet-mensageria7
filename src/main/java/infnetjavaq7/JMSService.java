package infnetjavaq7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JMSService {

	@Autowired 
	private JmsTemplate jmsTemplate;
	
	//envia msg para a fila activemq
	public void enviaJMS() {
		jmsTemplate.convertAndSend("queue.activemq-fila", "Oi, eu sou uma msg JMS");
	}
	
	//recebe mensagem da fila do activemq
	@JmsListener(destination = "queue.activemq-fila")
	public void onReceiverQueue(String msg) {
		System.out.println( "Mensagem Recebida na fila do activemq: " + msg );
	}
}
