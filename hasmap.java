import java.util.*;

public class hasmap {
    public static void main(String[] args) {
        Map<Integer, String> rollNumberVSNameMap = new HashMap<>();
        rollNumberVSNameMap.put(null, "test");
        rollNumberVSNameMap.put(1, "A");
        rollNumberVSNameMap.put(2, "b" );
        rollNumberVSNameMap.put(3,"C");


        //compute if present
        rollNumberVSNameMap.putIfAbsent(0, "test");
        rollNumberVSNameMap.putIfAbsent(0, "ZERO");

        //iterate on map
        for(Map.Entry<Integer, String> entryMap : rollNumberVSNameMap.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: "+ key + " and " + "value: " + value);
        }

         System.out.println("----------------------------------------------------------------------------------");

        //isEmpty -> return true if map contains no key-value mapping else false
        System.out.println("isEmpty(): " + rollNumberVSNameMap.isEmpty());

        System.out.println("----------------------------------------------------------------------------------");

        //size -> returns the number of key-value mapping present
        System.out.println("size: " + rollNumberVSNameMap.size());

         System.out.println("----------------------------------------------------------------------------------");

        //containsKey -> if given key is already presnt in the map returns true else false
        System.out.println("containsKey(3): " + rollNumberVSNameMap.containsKey(3));

         System.out.println("----------------------------------------------------------------------------------");

        //get(key) -> returns the value to which this key is mapped
        System.out.println("gey(1): " + rollNumberVSNameMap.get(1));
        
         System.out.println("----------------------------------------------------------------------------------");

        //getorDefault(key,"some defaulValue") -> if key does not exist or value is null, it reutrn the default value
        System.out.println("get(8): " + rollNumberVSNameMap.getOrDefault(9, "defaul value"));

         System.out.println("----------------------------------------------------------------------------------");

        //remove(key) -> removes the key-value mapping from the map for the specified key
        System.out.println("remove(null): " + rollNumberVSNameMap.remove(null));

         System.out.println("----------------------------------------------------------------------------------");

        //keySet -> returns the set view of key conatinsed in the map
        for(Integer key : rollNumberVSNameMap.keySet()){
            System.out.println("key: " + key);
        }

         System.out.println("----------------------------------------------------------------------------------");

        //values -> 
        Collection<String> values  = rollNumberVSNameMap.values();
        for(String value : values){
            System.out.println("value: " + value);
        }
    }
}
