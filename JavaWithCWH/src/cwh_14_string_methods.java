public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "simran";
        //System.out.println(name);
        int len = name.length();
        System.out.println(len);

        /*String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String b = new String("simey");
        System.out.println(b);

        String nonTrimmedString = "     Simran        ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(nonTrimmedString.trim());*/

        /*System.out.println(name.substring(1));
        System.out.println(name.substring(2,6));

        System.out.println(name.replace('a','u'));
        System.out.println(name.replace("ran","ey"));

        System.out.println(name.startsWith("sim"));
        System.out.println(name.endsWith("sim"));

        System.out.println(name.charAt(2));*/

        /*String modiName = "Simranan";
        System.out.println(name.indexOf("an"));
        System.out.println(modiName.indexOf("an",5));
        System.out.println(modiName.lastIndexOf("an",5));*/

        System.out.println(name.equals("Simran"));
        System.out.println(name.equalsIgnoreCase("sIMRAN"));

        System.out.println("I am escape sequence \\ double quote");

    }
}
