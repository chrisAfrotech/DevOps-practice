package FactoryPackage ;
import java.io.*;

public class selectNetwork {
    /**
     * @param plantype
     * @return
     */
    public cellularPlan getPlan(String plantype){
        if(plantype == null){
            return null;
        }
        if(plantype.equalsIgnoreCase("abcNetwork")){
            return new abcNetwork();
        }
        else if (plantype.equalsIgnoreCase("xyzNetwork")){
            return new xyzNetwork();
        }
        else if(plantype.equalsIgnoreCase("pqrNetwork")){
            return new pqrNetwork();
        }
    }
}