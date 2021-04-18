package ClassExample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Chapter16CollectionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void autoBoxing (){
        int theAge = 15;
        Integer age = theAge;
    }
    @Test
    void autoUnBoxing (){
        Double theBalance = Double.valueOf(2.5f);
        double balance =theBalance;
    }
    @Test
    void pentalist(){
        List<String> pentax = new ArrayList<>();
        pentax.add("tutus");
        pentax.add("shola");
        pentax.add("onyi");

        assertTrue(pentax.size()==3);
        pentax.remove("shola");
        assertTrue(pentax.size()==2);
        assertTrue(pentax.contains("titus"));
        //String.missAgbo = pentax.get(1);
        assertTrue(pentax.isEmpty());


        List<Integer>testCoverage = new Vector<>();
        testCoverage.add(0);
        testCoverage.add(10);
        testCoverage.add(12);

    }
    @Test
    void color(){
        List<String> color = new ArrayList<>();
        color.add("red");
        color.add("blue");
    color.add("purple");
    color.add("yellow");

    color.remove("red");
    assertTrue(color.size()==3);
    color.get(2);
    assertTrue(color.add("pink"));
    }


    @Test
    void pentaxSet(){
        Set<String>lasyuites = new HashSet<>();
        lasyuites.add("Mr. 19%");
        lasyuites.add("Deji");
        lasyuites.add("Chijioke");
        assertTrue(lasyuites.size() == 3);
        lasyuites.add("Chijioke");
        assertTrue(lasyuites.size()== 2);
        Iterator<String>wimps = lasyuites.iterator();
        while (wimps.hasNext())
            System.out.println(wimps.hasNext());


        Set<Integer>testCoverage = new TreeSet<>();

    }

    @Test
    void pentaxMap() {
        Map<String, String> pentaxWimps = new HashMap<>();
        pentaxWimps.put("SCV5001", "Dami");
        pentaxWimps.put("SCV50010", "Kenny");
        pentaxWimps.put("SCV50020", "Peter");
        pentaxWimps.put("SCV5002", "Badmus");
        pentaxWimps.put("SCV5012", "sunkumi");


        Set<String> pentaxIds = pentaxWimps.keySet();
        assertTrue(pentaxIds.size() == 3);
        Iterator<String> keys = pentaxIds.iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = pentaxWimps.get(key);
            System.out.println(key + "is mapped to " + value);
        }
        Collection<String> values = pentaxWimps.values();
        for(String value : values)
            System.out.println(value);

//        PentaxWimps.clear();
//        assrtTrue
    }


 }