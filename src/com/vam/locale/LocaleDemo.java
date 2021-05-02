package com.vam.locale;

import java.util.*; 
class LocaleDemo
{ 
    public static void main(String arg[])
    { 
     Locale l = Locale.getDefault();
     System.out.println(l.getCountry()+"..."+l.getLanguage()); 
     System.out.println(l.getDisplayCountry()+"..."+l.getDisplayLanguage());
     Locale l2 = new Locale("pa","IN"); 
     Locale.setDefault(l2);
     System.out.println("Locale l2 :" +l2);
     String s3[] = Locale.getISOLanguages();
     for (String s4: s3)
     {
      System.out.println("ISOLanguages : " +s4);
     }
     String s5[] = Locale.getISOCountries();
     for (String s6: s5)
     {
      System.out.println("ISOCountries : " +s6);
     }
     Locale l3[] = Locale.getAvailableLocales();
     for (Locale l4: l3)
     {
      System.out.println("Locales : "+l4);
      System.out.println(l4.getDisplayCountry()+"....."+l4.getDisplayLanguage());
     }
    } 
    
}