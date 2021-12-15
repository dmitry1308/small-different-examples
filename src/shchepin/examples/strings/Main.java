package shchepin.examples.strings;

import jdk.nashorn.internal.objects.annotations.ScriptClass;

@ScriptClass
public class Main {
    public static void main(String[] args) {
        String s = "pal_5002000716_ps_V-17275";
        int    ps_ = s.indexOf("ps_");
        System.out.println(ps_);

        int i = s.lastIndexOf("_");
        String substring = s.substring(i+1);
        System.out.println(substring);


        String pal = s.replace("pal_", "");
        int indexOf = pal.indexOf("_");
        String substring1 = pal.substring(0,indexOf);
        System.out.println(substring1);

    }
}
