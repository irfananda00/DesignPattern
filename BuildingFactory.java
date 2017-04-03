import java.util.HashMap;
import java.util.Map;

public class BuildingFactory{
  private static Map<String, Building> instances;
  static{
    instances = new HashMap<>();

    instances.put("House", new House());
    instances.put("Office", new Office());
  }

  public static <T extends Building> T getBuilding(String type){
    return (T) instances.get(type);
  }
}
