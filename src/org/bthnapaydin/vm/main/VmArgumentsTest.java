package org.bthnapaydin.vm.main;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

/**
 * Created by bapaydin on 30.08.2016.
 */
public class VmArgumentsTest {
    public static void main(String[] args) {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> arguments = runtimeMXBean.getInputArguments();

        for(String argument : arguments){
            System.out.println("Argument : " + argument);
        }
    }
}
