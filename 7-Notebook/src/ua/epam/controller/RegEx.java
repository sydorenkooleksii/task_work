package ua.epam.controller;

/**
 * Created by Oleksii_Sydorenko on 9/22/2016.
 */
interface RegEx {

    public static final String REG_TEXT = "^[A-Z][a-z]+";
    public static final String REG_TEXT_AND_NUMBER_SHORT = "^[A-Za-z][A-Za-z0-9_]{1,20}$";
    public static final String REG_TEXT_AND_NUMBER_AND_SYMBOL = "[\\S\\s]{1,150}$";
    public static final String REG_HOMEPHONE = "(\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2})?(\\d{10,12})?(^[+]\\d{3,12})?";
    public static final String REG_CELLPHONE = "(\\(\\d{3}\\)-\\d{2}-\\d{2}-\\d{3})?(\\d{10,12})?(^[+]\\d{3,12})?";
    public static final String REG_EMAIL = "[\\w.%-_]+@[\\w]+\\.[A-Za-z]{2,4}";
    public static final String REG_GROUP = "(HOME)|(WORK)|(SHOP)|(SERVICE)";
    public static final String REG_DATA = "(\\d{2}/\\d{2}/\\d{4})|(\\d{2}):(\\d{2}):(\\d{4})";
    public static final String REG_ADRESS = "\\d{1,5}/([A-Z][a-z]+)/([A-Z][a-z]+)/\\d{1,5}/\\d{1,5}";


}
