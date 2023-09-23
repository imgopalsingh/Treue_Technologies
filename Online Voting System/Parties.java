import java.util.*;

public class Parties {
    public static final int ABC_PARTY=0;
    public static final int XYZ_PARTY=1;
    public static final int NEW_PARTY=2;
    public static final int OLD_PARTY=3;

    public static final Map<Integer,Integer> partyMap=new HashMap<>();
    static{
        partyMap.put(ABC_PARTY, 0);
        partyMap.put(XYZ_PARTY, 0);
        partyMap.put(NEW_PARTY, 0);
        partyMap.put(OLD_PARTY, 0);

    }

  
    public static final Map<String,String> voterList=new HashMap<>();

   
}
