import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class GofudServer implements EventBroker {
  // maps a topic to a list of subscribers
  // feel free to change/add data structures
  private Map<String, ArrayList<Subscriber>> topics;

  public GofudServer() {
    this.topics = new HashMap<>();
  }

  // TODO: method when server/broker is sending an event through a topic
  public void sendEvent(String topic, Event event) {
    ArrayList<Subscriber> subs = this.topics.get(topic);
    for (Subscriber sub : subs) {
      sub.onEvent(event);
    }
  }
  
  // TODO: method when a subscriber wants to subscribe to a topic
  public void addSubscriber(String topic, Subscriber subscriber) {
    if (!topics.containsKey(topic)) {
      ArrayList<Subscriber> newArray = new ArrayList<Subscriber>();
      newArray.add(subscriber);

      this.topics.put(topic, newArray);
    } else {
      this.topics.get(topic).add(subscriber);
    }
  }
}