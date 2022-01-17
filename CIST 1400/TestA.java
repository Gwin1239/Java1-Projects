import java.util.*;

class Example
{
    public static void main (String[] args)
    {
        String[] strings = {
            "2002-10-24T13:51:25.417",
            "2001-03-25T23:41:24.234",
            "2008-10-05T04:41:56.004",
            "2013-04-10T22:14:06.852",
            "2005-08-24T05:05:01.080",
            "2015-11-20T17:32:27.303",
            "2003-07-16T06:32:07.703",
            "2005-03-20T08:28:18.440",
            "2009-04-17T13:20:09.499",
            "2002-11-04T06:39:55.287"
        };
        Arrays.sort(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}