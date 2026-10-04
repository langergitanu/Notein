package com.aspose.slides.internal.p527yk;

import Oooo0o0.C21009OooOooO;
import com.aspose.slides.C22207OooOOoo;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.internal.p463vm.AbstractC11694rv;
import com.aspose.slides.internal.p463vm.C11684ck;
import com.aspose.slides.internal.p463vm.C11685du;
import com.aspose.slides.internal.p463vm.C11686dy;
import com.aspose.slides.internal.p463vm.C11688h4;
import com.aspose.slides.internal.p463vm.C11692ks;
import com.aspose.slides.internal.p463vm.C11693m9;
import com.aspose.slides.internal.p463vm.C11695to;
import com.aspose.slides.internal.p463vm.C11698yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.core.resources.C14141k4;
import com.aspose.slides.p559ms.core.resources.C14142x1;
import com.aspose.slides.p559ms.core.resources.ResourcesLoader;
import com.aspose.words.EditingLanguage;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.aspose.slides.internal.yk.to */
/* JADX INFO: loaded from: classes5.dex */
public final class C12853to {

    /* JADX INFO: renamed from: du */
    private static HashMap<Integer, Integer> f43327du;

    /* JADX INFO: renamed from: k4 */
    private static final HashMap<Integer, C12851kk> f43328k4 = new HashMap<>();

    /* JADX INFO: renamed from: kk */
    private static final HashMap<Integer, AbstractC11694rv[]> f43329kk;

    /* JADX INFO: renamed from: to */
    private static final HashMap<Integer, Integer> f43330to;

    /* JADX INFO: renamed from: x1 */
    private static final HashMap<Integer, AbstractC11694rv> f43331x1;

    static {
        HashMap<Integer, AbstractC11694rv> map = new HashMap<>();
        f43331x1 = map;
        HashMap<Integer, AbstractC11694rv[]> map2 = new HashMap<>();
        f43329kk = map2;
        HashMap<Integer, Integer> map3 = new HashMap<>();
        f43330to = map3;
        f43327du = new HashMap<>();
        map.put(1, new C11688h4());
        Integer numOooO0O0 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, 2, 3), 4);
        Integer numOooO0O02 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O0, 5), 6), 7);
        Integer numOooO0O03 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O02, 8), 9);
        Integer numOooO0O04 = C21009OooOooO.OooO0O0(1, map, numOooO0O03, 10);
        Integer numOooO0O05 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O04, 11), 12);
        Integer numOooO0O06 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O05, 13), 14), 15), 16);
        Integer numOooO0O07 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O06, 17), 18), 19);
        Integer numOooO0O08 = C21009OooOooO.OooO0O0(1, map, numOooO0O07, 20);
        Integer numOooO0O09 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O08, 21), 22);
        Integer numOooO0O010 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O09, 24), 25), 26);
        Integer numOooO0O011 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O010, 27), 28), 29);
        map.put(C21009OooOooO.OooO0O0(1, map, numOooO0O011, 30), new C11698yj());
        Integer numOooO0O012 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(12, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, 31, 32), 33), 34), 35), 36), 37), 38), 39), 41), 42), 43), 44);
        map.put(C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O012, 45), 47), 54), 55), 56), 57), 62), 63), 64), 65), 67), 68), 70), 71), 73), 74), 75), 78), 79), 80), 86), 87), 90), 101), new C11688h4());
        map.put(C21009OooOooO.OooO0O0(1, map, 127, 1025), new C11688h4());
        map.put(C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, Integer.valueOf(EditingLanguage.BULGARIAN), EditingLanguage.CATALAN), EditingLanguage.CHINESE_TAIWAN), EditingLanguage.CZECH), EditingLanguage.DANISH), EditingLanguage.GERMAN_GERMANY), EditingLanguage.GREEK), EditingLanguage.ENGLISH_US), EditingLanguage.FINNISH), EditingLanguage.FRENCH_FRANCE), EditingLanguage.HEBREW), EditingLanguage.HUNGARIAN), EditingLanguage.ICELANDIC), EditingLanguage.ITALIAN_ITALY), EditingLanguage.JAPANESE), EditingLanguage.KOREAN), EditingLanguage.DUTCH_NETHERLANDS), EditingLanguage.NORWEGIAN_BOKMAL), EditingLanguage.POLISH), EditingLanguage.PORTUGUESE_BRAZIL), EditingLanguage.ROMANIAN), 1049), 1050), 1051), 1052), 1053), EditingLanguage.THAI), new C11698yj());
        map.put(C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(12, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, 1055, EditingLanguage.URDU), EditingLanguage.INDONESIAN), EditingLanguage.UKRAINIAN), EditingLanguage.BELARUSIAN), EditingLanguage.SLOVENIAN), EditingLanguage.ESTONIAN), EditingLanguage.LATVIAN), EditingLanguage.LITHUANIAN), EditingLanguage.PERSIAN), EditingLanguage.VIETNAMESE), EditingLanguage.ARMENIAN), EditingLanguage.AZERBAIJANI_LATIN), EditingLanguage.BASQUE), EditingLanguage.MACEDONIAN), EditingLanguage.AFRIKAANS), EditingLanguage.GEORGIAN), EditingLanguage.FAEROESE), EditingLanguage.HINDI), EditingLanguage.MALAY_MALAYSIA), EditingLanguage.KAZAKH), EditingLanguage.KYRGYZ), EditingLanguage.KISWAHILI), EditingLanguage.UZBEK_LATIN), EditingLanguage.TATAR), EditingLanguage.PUNJABI_INDIA), EditingLanguage.GUJARATI), EditingLanguage.TAMIL), EditingLanguage.TELUGU), EditingLanguage.KANNADA), EditingLanguage.MARATHI), EditingLanguage.SANSKRIT), EditingLanguage.MONGOLIAN_CYRILLIC), EditingLanguage.GALICIAN), EditingLanguage.KONKANI), EditingLanguage.SYRIAC), EditingLanguage.DIVEHI), new C11688h4());
        Integer numOooO0O013 = C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, Integer.valueOf(EditingLanguage.ARABIC_IRAQ), 2052), EditingLanguage.GERMAN_SWITZERLAND), EditingLanguage.ENGLISH_UK), EditingLanguage.SPANISH_MEXICO), EditingLanguage.FRENCH_BELGIUM), EditingLanguage.ITALIAN_SWITZERLAND), EditingLanguage.DUTCH_BELGIUM), EditingLanguage.NORWEGIAN_NYNORSK), EditingLanguage.PORTUGUESE_PORTUGAL), EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO), EditingLanguage.SWEDISH_FINLAND), EditingLanguage.AZERBAIJANI_CYRILLIC), EditingLanguage.MALAY_BRUNEI_DARUSSALAM), EditingLanguage.UZBEK_CYRILLIC), EditingLanguage.ARABIC_EGYPT), EditingLanguage.CHINESE_HONG_KONG), EditingLanguage.GERMAN_AUSTRIA), EditingLanguage.ENGLISH_AUSTRALIA), EditingLanguage.SPANISH_SPAIN_MODERN_SORT), EditingLanguage.FRENCH_CANADA), EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO), EditingLanguage.ARABIC_LIBYA), EditingLanguage.CHINESE_SINGAPORE), EditingLanguage.GERMAN_LUXEMBOURG), EditingLanguage.ENGLISH_CANADA), EditingLanguage.SPANISH_GUATEMALA), EditingLanguage.FRENCH_SWITZERLAND), EditingLanguage.ARABIC_ALGERIA), EditingLanguage.CHINESE_MACAO), EditingLanguage.GERMAN_LIECHTENSTEIN), EditingLanguage.ENGLISH_NEW_ZEALAND), EditingLanguage.SPANISH_COSTA_RICA), EditingLanguage.FRENCH_LUXEMBOURG), EditingLanguage.ARABIC_MOROCCO), EditingLanguage.ENGLISH_IRELAND), EditingLanguage.SPANISH_PANAMA), EditingLanguage.FRENCH_MONACO), EditingLanguage.ARABIC_TUNISIA), EditingLanguage.ENGLISH_SOUTH_AFRICA), EditingLanguage.SPANISH_DOMINICAN_REPUBLIC), EditingLanguage.ARABIC_OMAN), EditingLanguage.ENGLISH_JAMAICA), EditingLanguage.SPANISH_VENEZUELA), EditingLanguage.ARABIC_YEMEN), EditingLanguage.ENGLISH_CARIBBEAN), EditingLanguage.SPANISH_COLOMBIA), EditingLanguage.ARABIC_SYRIA), EditingLanguage.ENGLISH_BELIZE), EditingLanguage.SPANISH_PERU), EditingLanguage.ARABIC_JORDAN), EditingLanguage.ENGLISH_TRINIDAD_AND_TOBAGO), EditingLanguage.SPANISH_ARGENTINA), EditingLanguage.ARABIC_LEBANON), EditingLanguage.ENGLISH_ZIMBABWE), EditingLanguage.SPANISH_ECUADOR), EditingLanguage.ARABIC_KUWAIT), EditingLanguage.ENGLISH_PHILIPPINES), EditingLanguage.SPANISH_CHILE), EditingLanguage.ARABIC_UAE), EditingLanguage.SPANISH_URUGUAY), EditingLanguage.ARABIC_BAHRAIN), EditingLanguage.SPANISH_PARAGUAY), EditingLanguage.ARABIC_QATAR), EditingLanguage.SPANISH_BOLIVIA), EditingLanguage.SPANISH_EL_SALVADOR), EditingLanguage.SPANISH_HONDURAS), EditingLanguage.SPANISH_NICARAGUA), EditingLanguage.SPANISH_PUERTO_RICO), 31748);
        map.put(C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, C21009OooOooO.OooO0O0(1, map, numOooO0O013, 31770), 6203), EditingLanguage.SERBIAN_CYRILLIC_BOSNIA_AND_HERZEGOVINA), EditingLanguage.ISI_ZULU), EditingLanguage.ISI_XHOSA), EditingLanguage.FRISIAN), EditingLanguage.TSWANA), EditingLanguage.NORTHERN_SAMI_SWEDEN), 7227), EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA), EditingLanguage.INARI_SAMI_FINLAND), EditingLanguage.QUECHUA_PERU), EditingLanguage.NORTHERN_SAMI_FINLAND), 8251), EditingLanguage.WELSH), EditingLanguage.BOSNIAN_LATIN), EditingLanguage.BOSNIAN_CYRILLIC), EditingLanguage.FILIPINO), EditingLanguage.LULE_SAMI_NORWAY), EditingLanguage.MAPUDUNGUN_CHILE), 2141), EditingLanguage.MAORI), EditingLanguage.QUECHUA_ECUADOR), EditingLanguage.IRISH), EditingLanguage.SERBIAN_LATIN_BOSNIA_AND_HERZEGOVINA), EditingLanguage.MOHAWK), EditingLanguage.LULE_SAMI_SWEDEN), EditingLanguage.LUXEMBOUGISH), 1132), EditingLanguage.QUECHUA_BOLIVIA), EditingLanguage.NORTHERN_SAMI_NORWAY), EditingLanguage.MALTESE), EditingLanguage.ROMANSH), new C11695to(1));
        map2.put(1, new AbstractC11694rv[]{new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(1), new C11695to(12)});
        map2.put(2, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(3, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O0, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(5, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(6, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O02, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(8, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O03, new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(numOooO0O04, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(11, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O05, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(13, new AbstractC11694rv[]{new C11695to(1), new C11685du()});
        map2.put(14, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(15, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O06, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(17, new AbstractC11694rv[]{new C11695to(1), new C11693m9(), new C11695to(2)});
        map2.put(18, new AbstractC11694rv[]{new C11695to(1), new C11686dy(), new C11695to(2)});
        map2.put(numOooO0O07, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O08, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(21, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O09, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(24, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(25, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O010, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(27, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(28, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O011, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(30, new AbstractC11694rv[]{new C11698yj(), new C11695to(1)});
        map2.put(31, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(32, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(33, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(34, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(35, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(36, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(37, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(38, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(39, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(41, new AbstractC11694rv[]{new C11695to(12), new C11695to(2), new C11695to(1), new C11688h4(), new C11695to(11)});
        map2.put(42, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(43, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O012, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(45, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(47, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(54, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(55, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(56, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(57, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(62, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(63, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(64, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(65, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(67, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(68, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(70, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(71, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(73, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(74, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(75, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(78, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(79, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(80, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(86, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(87, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(90, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(101, new AbstractC11694rv[]{new C11688h4(), new C11695to(1)});
        map2.put(127, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(1025, new AbstractC11694rv[]{new C11688h4(), new C11692ks(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(1), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.BULGARIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.CATALAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.CHINESE_TAIWAN), new AbstractC11694rv[]{new C11695to(1), new C11695to(2), new C11684ck()});
        map2.put(Integer.valueOf(EditingLanguage.CZECH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.DANISH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GERMAN_GERMANY), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GREEK), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_US), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.FINNISH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FRENCH_FRANCE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.HEBREW), new AbstractC11694rv[]{new C11695to(1), new C11685du()});
        map2.put(Integer.valueOf(EditingLanguage.HUNGARIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ICELANDIC), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ITALIAN_ITALY), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.JAPANESE), new AbstractC11694rv[]{new C11695to(1), new C11693m9(), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.KOREAN), new AbstractC11694rv[]{new C11695to(1), new C11686dy(), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.DUTCH_NETHERLANDS), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.NORWEGIAN_BOKMAL), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.POLISH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.PORTUGUESE_BRAZIL), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ROMANIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(1049, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(1050, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(1051, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(1052, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(1053, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.THAI), new AbstractC11694rv[]{new C11698yj(), new C11695to(1)});
        map2.put(1055, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.URDU), new AbstractC11694rv[]{new C11695to(1), new C11695to(2), new C11688h4()});
        map2.put(Integer.valueOf(EditingLanguage.INDONESIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.UKRAINIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.BELARUSIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SLOVENIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ESTONIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.LATVIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.LITHUANIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.PERSIAN), new AbstractC11694rv[]{new C11695to(12), new C11695to(2), new C11695to(1), new C11688h4(), new C11695to(11)});
        map2.put(Integer.valueOf(EditingLanguage.VIETNAMESE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARMENIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.AZERBAIJANI_LATIN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.BASQUE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MACEDONIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.AFRIKAANS), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GEORGIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FAEROESE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.HINDI), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MALAY_MALAYSIA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.KAZAKH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.KYRGYZ), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.KISWAHILI), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.UZBEK_LATIN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.TATAR), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.PUNJABI_INDIA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GUJARATI), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.TAMIL), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.TELUGU), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.KANNADA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MARATHI), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SANSKRIT), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MONGOLIAN_CYRILLIC), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GALICIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.KONKANI), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SYRIAC), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.DIVEHI), new AbstractC11694rv[]{new C11688h4(), new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_IRAQ), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(11), new C11695to(12)});
        map2.put(2052, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GERMAN_SWITZERLAND), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_UK), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_MEXICO), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FRENCH_BELGIUM), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ITALIAN_SWITZERLAND), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.DUTCH_BELGIUM), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.NORWEGIAN_NYNORSK), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.PORTUGUESE_PORTUGAL), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SWEDISH_FINLAND), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.AZERBAIJANI_CYRILLIC), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MALAY_BRUNEI_DARUSSALAM), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.UZBEK_CYRILLIC), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_EGYPT), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.CHINESE_HONG_KONG), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GERMAN_AUSTRIA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_AUSTRALIA), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_SPAIN_MODERN_SORT), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FRENCH_CANADA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_LIBYA), new AbstractC11694rv[]{new C11695to(1), new C11688h4(), new C11692ks(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.CHINESE_SINGAPORE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GERMAN_LUXEMBOURG), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_CANADA), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_GUATEMALA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FRENCH_SWITZERLAND), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_ALGERIA), new AbstractC11694rv[]{new C11695to(1), new C11688h4(), new C11692ks(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(11)});
        map2.put(Integer.valueOf(EditingLanguage.CHINESE_MACAO), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.GERMAN_LIECHTENSTEIN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_NEW_ZEALAND), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_COSTA_RICA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FRENCH_LUXEMBOURG), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_MOROCCO), new AbstractC11694rv[]{new C11695to(1), new C11688h4(), new C11692ks(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(11)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_IRELAND), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_PANAMA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FRENCH_MONACO), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_TUNISIA), new AbstractC11694rv[]{new C11695to(1), new C11688h4(), new C11692ks(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(11)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_SOUTH_AFRICA), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_DOMINICAN_REPUBLIC), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_OMAN), new AbstractC11694rv[]{new C11695to(1), new C11688h4(), new C11692ks(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_JAMAICA), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_VENEZUELA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_YEMEN), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_CARIBBEAN), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_COLOMBIA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_SYRIA), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(11), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_BELIZE), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_PERU), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_JORDAN), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(11), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_TRINIDAD_AND_TOBAGO), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_ARGENTINA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_LEBANON), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(11), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_ZIMBABWE), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_ECUADOR), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_KUWAIT), new AbstractC11694rv[]{new C11695to(1), new C11688h4(), new C11692ks(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.ENGLISH_PHILIPPINES), new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_CHILE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_UAE), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_URUGUAY), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_BAHRAIN), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_PARAGUAY), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ARABIC_QATAR), new AbstractC11694rv[]{new C11695to(1), new C11692ks(), new C11688h4(), new C11695to(2), new C11695to(9), new C11695to(10), new C11695to(12)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_BOLIVIA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_EL_SALVADOR), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_HONDURAS), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_NICARAGUA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SPANISH_PUERTO_RICO), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(numOooO0O013, new AbstractC11694rv[]{new C11695to(1), new C11695to(2)});
        map2.put(31770, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(6203, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SERBIAN_CYRILLIC_BOSNIA_AND_HERZEGOVINA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ISI_ZULU), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ISI_XHOSA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FRISIAN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.TSWANA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.NORTHERN_SAMI_SWEDEN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(7227, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.INARI_SAMI_FINLAND), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.QUECHUA_PERU), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.NORTHERN_SAMI_FINLAND), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(8251, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.WELSH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.BOSNIAN_LATIN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.BOSNIAN_CYRILLIC), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.FILIPINO), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.LULE_SAMI_NORWAY), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MAPUDUNGUN_CHILE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(2141, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MAORI), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.QUECHUA_ECUADOR), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.IRISH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.SERBIAN_LATIN_BOSNIA_AND_HERZEGOVINA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MOHAWK), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.LULE_SAMI_SWEDEN), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.LUXEMBOUGISH), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(1132, new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.QUECHUA_BOLIVIA), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.NORTHERN_SAMI_NORWAY), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.MALTESE), new AbstractC11694rv[]{new C11695to(1)});
        map2.put(Integer.valueOf(EditingLanguage.ROMANSH), new AbstractC11694rv[]{new C11695to(1)});
        map3.put(1, 127);
        map3.put(2, 127);
        map3.put(3, 127);
        map3.put(numOooO0O0, numOooO0O0);
        OooO00o.OooO00o(5, map3, 127, 6, 127);
        map3.put(numOooO0O02, 127);
        map3.put(8, 127);
        map3.put(numOooO0O03, 127);
        map3.put(numOooO0O04, 127);
        map3.put(11, 127);
        map3.put(numOooO0O05, 127);
        map3.put(13, 127);
        OooO00o.OooO00o(14, map3, 127, 15, 127);
        map3.put(numOooO0O06, 127);
        map3.put(17, 127);
        map3.put(18, 127);
        map3.put(numOooO0O07, 127);
        map3.put(numOooO0O08, 127);
        map3.put(21, 127);
        map3.put(numOooO0O09, 127);
        map3.put(24, 127);
        map3.put(25, 127);
        map3.put(numOooO0O010, 127);
        OooO00o.OooO00o(27, map3, 127, 28, 127);
        map3.put(numOooO0O011, 127);
        map3.put(30, 127);
        OooO00o.OooO00o(31, map3, 127, 32, 127);
        OooO00o.OooO00o(33, map3, 127, 34, 127);
        OooO00o.OooO00o(35, map3, 127, 36, 127);
        OooO00o.OooO00o(37, map3, 127, 38, 127);
        OooO00o.OooO00o(39, map3, 127, 41, 127);
        OooO00o.OooO00o(42, map3, 127, 43, 127);
        map3.put(numOooO0O012, 127);
        map3.put(45, 127);
        OooO00o.OooO00o(47, map3, 127, 54, 127);
        OooO00o.OooO00o(55, map3, 127, 56, 127);
        OooO00o.OooO00o(57, map3, 127, 62, 127);
        OooO00o.OooO00o(63, map3, 127, 64, 127);
        OooO00o.OooO00o(65, map3, 127, 67, 127);
        OooO00o.OooO00o(68, map3, 127, 70, 127);
        OooO00o.OooO00o(71, map3, 127, 73, 127);
        OooO00o.OooO00o(74, map3, 127, 75, 127);
        OooO00o.OooO00o(78, map3, 127, 79, 127);
        OooO00o.OooO00o(80, map3, 127, 86, 127);
        OooO00o.OooO00o(87, map3, 127, 90, 127);
        map3.put(101, 127);
        map3.put(127, 127);
        map3.put(1025, 1);
        map3.put(C22207OooOOoo.OooO00o(2, map3, Integer.valueOf(EditingLanguage.BULGARIAN), EditingLanguage.CATALAN), 3);
        map3.put(Integer.valueOf(EditingLanguage.CHINESE_TAIWAN), numOooO0O013);
        map3.put(C22207OooOOoo.OooO00o(5, map3, Integer.valueOf(EditingLanguage.CZECH), EditingLanguage.DANISH), 6);
        map3.put(Integer.valueOf(EditingLanguage.GERMAN_GERMANY), numOooO0O02);
        map3.put(Integer.valueOf(EditingLanguage.GREEK), 8);
        map3.put(Integer.valueOf(EditingLanguage.ENGLISH_US), numOooO0O03);
        map3.put(Integer.valueOf(EditingLanguage.FINNISH), 11);
        map3.put(Integer.valueOf(EditingLanguage.FRENCH_FRANCE), numOooO0O05);
        map3.put(C22207OooOOoo.OooO00o(14, map3, C22207OooOOoo.OooO00o(13, map3, Integer.valueOf(EditingLanguage.HEBREW), EditingLanguage.HUNGARIAN), EditingLanguage.ICELANDIC), 15);
        map3.put(Integer.valueOf(EditingLanguage.ITALIAN_ITALY), numOooO0O06);
        map3.put(C22207OooOOoo.OooO00o(17, map3, Integer.valueOf(EditingLanguage.JAPANESE), EditingLanguage.KOREAN), 18);
        map3.put(Integer.valueOf(EditingLanguage.DUTCH_NETHERLANDS), numOooO0O07);
        map3.put(Integer.valueOf(EditingLanguage.NORWEGIAN_BOKMAL), numOooO0O08);
        map3.put(Integer.valueOf(EditingLanguage.POLISH), 21);
        map3.put(Integer.valueOf(EditingLanguage.PORTUGUESE_BRAZIL), numOooO0O09);
        map3.put(C22207OooOOoo.OooO00o(24, map3, Integer.valueOf(EditingLanguage.ROMANIAN), 1049), 25);
        map3.put(1050, numOooO0O010);
        map3.put(C22207OooOOoo.OooO00o(27, map3, 1051, 1052), 28);
        map3.put(1053, numOooO0O011);
        map3.put(C22207OooOOoo.OooO00o(42, map3, C22207OooOOoo.OooO00o(41, map3, C22207OooOOoo.OooO00o(39, map3, C22207OooOOoo.OooO00o(38, map3, C22207OooOOoo.OooO00o(37, map3, C22207OooOOoo.OooO00o(36, map3, C22207OooOOoo.OooO00o(35, map3, C22207OooOOoo.OooO00o(34, map3, C22207OooOOoo.OooO00o(33, map3, C22207OooOOoo.OooO00o(32, map3, C22207OooOOoo.OooO00o(31, map3, C22207OooOOoo.OooO00o(30, map3, Integer.valueOf(EditingLanguage.THAI), 1055), EditingLanguage.URDU), EditingLanguage.INDONESIAN), EditingLanguage.UKRAINIAN), EditingLanguage.BELARUSIAN), EditingLanguage.SLOVENIAN), EditingLanguage.ESTONIAN), EditingLanguage.LATVIAN), EditingLanguage.LITHUANIAN), EditingLanguage.PERSIAN), EditingLanguage.VIETNAMESE), EditingLanguage.ARMENIAN), 43);
        map3.put(Integer.valueOf(EditingLanguage.AZERBAIJANI_LATIN), numOooO0O012);
        map3.put(C22207OooOOoo.OooO00o(90, map3, C22207OooOOoo.OooO00o(87, map3, C22207OooOOoo.OooO00o(86, map3, C22207OooOOoo.OooO00o(80, map3, C22207OooOOoo.OooO00o(79, map3, C22207OooOOoo.OooO00o(78, map3, C22207OooOOoo.OooO00o(75, map3, C22207OooOOoo.OooO00o(74, map3, C22207OooOOoo.OooO00o(73, map3, C22207OooOOoo.OooO00o(71, map3, C22207OooOOoo.OooO00o(70, map3, C22207OooOOoo.OooO00o(68, map3, C22207OooOOoo.OooO00o(67, map3, C22207OooOOoo.OooO00o(65, map3, C22207OooOOoo.OooO00o(64, map3, C22207OooOOoo.OooO00o(63, map3, C22207OooOOoo.OooO00o(62, map3, C22207OooOOoo.OooO00o(57, map3, C22207OooOOoo.OooO00o(56, map3, C22207OooOOoo.OooO00o(55, map3, C22207OooOOoo.OooO00o(54, map3, C22207OooOOoo.OooO00o(47, map3, C22207OooOOoo.OooO00o(45, map3, Integer.valueOf(EditingLanguage.BASQUE), EditingLanguage.MACEDONIAN), EditingLanguage.AFRIKAANS), EditingLanguage.GEORGIAN), EditingLanguage.FAEROESE), EditingLanguage.HINDI), EditingLanguage.MALAY_MALAYSIA), EditingLanguage.KAZAKH), EditingLanguage.KYRGYZ), EditingLanguage.KISWAHILI), EditingLanguage.UZBEK_LATIN), EditingLanguage.TATAR), EditingLanguage.PUNJABI_INDIA), EditingLanguage.GUJARATI), EditingLanguage.TAMIL), EditingLanguage.TELUGU), EditingLanguage.KANNADA), EditingLanguage.MARATHI), EditingLanguage.SANSKRIT), EditingLanguage.MONGOLIAN_CYRILLIC), EditingLanguage.GALICIAN), EditingLanguage.KONKANI), EditingLanguage.SYRIAC), EditingLanguage.DIVEHI), 101);
        map3.put(Integer.valueOf(EditingLanguage.ARABIC_IRAQ), 1);
        OooO00o.OooO00o(2052, map3, numOooO0O0, EditingLanguage.GERMAN_SWITZERLAND, numOooO0O02);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_UK, map3, numOooO0O03, EditingLanguage.SPANISH_MEXICO, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.FRENCH_BELGIUM, map3, numOooO0O05, EditingLanguage.ITALIAN_SWITZERLAND, numOooO0O06);
        OooO00o.OooO00o(EditingLanguage.DUTCH_BELGIUM, map3, numOooO0O07, EditingLanguage.NORWEGIAN_NYNORSK, numOooO0O08);
        map3.put(Integer.valueOf(EditingLanguage.PORTUGUESE_PORTUGAL), numOooO0O09);
        map3.put(Integer.valueOf(EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO), 31770);
        map3.put(Integer.valueOf(EditingLanguage.SWEDISH_FINLAND), numOooO0O011);
        map3.put(Integer.valueOf(EditingLanguage.AZERBAIJANI_CYRILLIC), numOooO0O012);
        map3.put(C22207OooOOoo.OooO00o(62, map3, Integer.valueOf(EditingLanguage.MALAY_BRUNEI_DARUSSALAM), EditingLanguage.UZBEK_CYRILLIC), 67);
        map3.put(Integer.valueOf(EditingLanguage.ARABIC_EGYPT), 1);
        OooO00o.OooO00o(EditingLanguage.CHINESE_HONG_KONG, map3, numOooO0O013, EditingLanguage.GERMAN_AUSTRIA, numOooO0O02);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_AUSTRALIA, map3, numOooO0O03, EditingLanguage.SPANISH_SPAIN_MODERN_SORT, numOooO0O04);
        map3.put(Integer.valueOf(EditingLanguage.FRENCH_CANADA), numOooO0O05);
        map3.put(Integer.valueOf(EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO), 31770);
        map3.put(Integer.valueOf(EditingLanguage.ARABIC_LIBYA), 1);
        OooO00o.OooO00o(EditingLanguage.CHINESE_SINGAPORE, map3, numOooO0O0, EditingLanguage.GERMAN_LUXEMBOURG, numOooO0O02);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_CANADA, map3, numOooO0O03, EditingLanguage.SPANISH_GUATEMALA, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.FRENCH_SWITZERLAND, map3, numOooO0O05, EditingLanguage.ARABIC_ALGERIA, 1);
        OooO00o.OooO00o(EditingLanguage.CHINESE_MACAO, map3, numOooO0O013, EditingLanguage.GERMAN_LIECHTENSTEIN, numOooO0O02);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_NEW_ZEALAND, map3, numOooO0O03, EditingLanguage.SPANISH_COSTA_RICA, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.FRENCH_LUXEMBOURG, map3, numOooO0O05, EditingLanguage.ARABIC_MOROCCO, 1);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_IRELAND, map3, numOooO0O03, EditingLanguage.SPANISH_PANAMA, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.FRENCH_MONACO, map3, numOooO0O05, EditingLanguage.ARABIC_TUNISIA, 1);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_SOUTH_AFRICA, map3, numOooO0O03, EditingLanguage.SPANISH_DOMINICAN_REPUBLIC, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.ARABIC_OMAN, map3, 1, EditingLanguage.ENGLISH_JAMAICA, numOooO0O03);
        OooO00o.OooO00o(EditingLanguage.SPANISH_VENEZUELA, map3, numOooO0O04, EditingLanguage.ARABIC_YEMEN, 1);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_CARIBBEAN, map3, numOooO0O03, EditingLanguage.SPANISH_COLOMBIA, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.ARABIC_SYRIA, map3, 1, EditingLanguage.ENGLISH_BELIZE, numOooO0O03);
        OooO00o.OooO00o(EditingLanguage.SPANISH_PERU, map3, numOooO0O04, EditingLanguage.ARABIC_JORDAN, 1);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_TRINIDAD_AND_TOBAGO, map3, numOooO0O03, EditingLanguage.SPANISH_ARGENTINA, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.ARABIC_LEBANON, map3, 1, EditingLanguage.ENGLISH_ZIMBABWE, numOooO0O03);
        OooO00o.OooO00o(EditingLanguage.SPANISH_ECUADOR, map3, numOooO0O04, EditingLanguage.ARABIC_KUWAIT, 1);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_PHILIPPINES, map3, numOooO0O03, EditingLanguage.SPANISH_CHILE, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.ARABIC_UAE, map3, 1, EditingLanguage.SPANISH_URUGUAY, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.ARABIC_BAHRAIN, map3, 1, EditingLanguage.SPANISH_PARAGUAY, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.ARABIC_QATAR, map3, 1, EditingLanguage.SPANISH_BOLIVIA, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.SPANISH_EL_SALVADOR, map3, numOooO0O04, EditingLanguage.SPANISH_HONDURAS, numOooO0O04);
        OooO00o.OooO00o(EditingLanguage.SPANISH_NICARAGUA, map3, numOooO0O04, EditingLanguage.SPANISH_PUERTO_RICO, numOooO0O04);
        map3.put(numOooO0O013, numOooO0O013);
        map3.put(31770, 127);
        OooO00o.OooO00o(EditingLanguage.AMHARIC, map3, 127, EditingLanguage.TAMAZIGHT_LATIN, 127);
        OooO00o.OooO00o(2141, map3, 127, 6203, 127);
        OooO00o.OooO00o(EditingLanguage.MONGOLIAN_MONGOLIAN, map3, 127, EditingLanguage.SCOTTISH_GAELIC, 127);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_MALAYSIA, map3, numOooO0O03, 1164, 127);
        OooO00o.OooO00o(EditingLanguage.BANGLA_BANGLADESH, map3, 127, 1160, 127);
        OooO00o.OooO00o(EditingLanguage.KINYARWANDA, map3, 127, 1158, 127);
        OooO00o.OooO00o(EditingLanguage.SAKHA, map3, 127, EditingLanguage.ALSATIAN, 127);
        OooO00o.OooO00o(EditingLanguage.CORSICAN, map3, 127, 1154, 127);
        OooO00o.OooO00o(EditingLanguage.MAORI, map3, 127, EditingLanguage.IRISH, 127);
        OooO00o.OooO00o(EditingLanguage.NORTHERN_SAMI_SWEDEN, map3, 127, EditingLanguage.BRETON, 127);
        OooO00o.OooO00o(EditingLanguage.INARI_SAMI_FINLAND, map3, 127, EditingLanguage.MOHAWK, 127);
        OooO00o.OooO00o(EditingLanguage.MAPUDUNGUN_CHILE, map3, 127, EditingLanguage.f50775YI, 127);
        OooO00o.OooO00o(2094, map3, 127, EditingLanguage.IGBO, 127);
        OooO00o.OooO00o(EditingLanguage.GREENLANDIC, map3, 127, EditingLanguage.LUXEMBOUGISH, 127);
        OooO00o.OooO00o(EditingLanguage.BASHKIR, map3, 127, 1132, 127);
        OooO00o.OooO00o(EditingLanguage.QUECHUA_BOLIVIA, map3, 127, EditingLanguage.YORUBA, 127);
        OooO00o.OooO00o(EditingLanguage.HAUSA, map3, 127, EditingLanguage.FILIPINO, 127);
        OooO00o.OooO00o(EditingLanguage.PASHTO, map3, 127, EditingLanguage.FRISIAN, 127);
        OooO00o.OooO00o(EditingLanguage.NEPALI, map3, 127, EditingLanguage.NORTHERN_SAMI_NORWAY, 127);
        OooO00o.OooO00o(1117, map3, 127, 9242, 127);
        OooO00o.OooO00o(EditingLanguage.SINHALESE, map3, 127, 10266, 127);
        OooO00o.OooO00o(EditingLanguage.LAO, map3, 127, EditingLanguage.KHMER, 127);
        OooO00o.OooO00o(EditingLanguage.WELSH, map3, 127, EditingLanguage.TIBETAN_CHINA, 127);
        OooO00o.OooO00o(8251, map3, 127, EditingLanguage.ASSAMESE, 127);
        OooO00o.OooO00o(EditingLanguage.MALAYALAM, map3, 127, EditingLanguage.ENGLISH_INDIA, numOooO0O03);
        OooO00o.OooO00o(EditingLanguage.ORIYA, map3, 127, EditingLanguage.BANGLA_INDIA, 127);
        OooO00o.OooO00o(EditingLanguage.TURKMEN, map3, 127, EditingLanguage.BOSNIAN_LATIN, 127);
        OooO00o.OooO00o(EditingLanguage.MALTESE, map3, 127, 12314, 127);
        OooO00o.OooO00o(EditingLanguage.NORTHERN_SAMI_FINLAND, map3, 127, EditingLanguage.ISI_ZULU, 127);
        OooO00o.OooO00o(EditingLanguage.ISI_XHOSA, map3, 127, EditingLanguage.TSWANA, 127);
        OooO00o.OooO00o(EditingLanguage.SORBIAN, map3, 127, EditingLanguage.BOSNIAN_CYRILLIC, 127);
        OooO00o.OooO00o(EditingLanguage.TAJIK, map3, 127, EditingLanguage.SERBIAN_LATIN_BOSNIA_AND_HERZEGOVINA, 127);
        OooO00o.OooO00o(EditingLanguage.LULE_SAMI_NORWAY, map3, 127, EditingLanguage.ROMANSH, 127);
        OooO00o.OooO00o(EditingLanguage.LULE_SAMI_SWEDEN, map3, 127, EditingLanguage.QUECHUA_ECUADOR, 127);
        OooO00o.OooO00o(EditingLanguage.QUECHUA_PERU, map3, 127, EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA, numOooO0O010);
        OooO00o.OooO00o(11290, map3, 127, 7227, 127);
        OooO00o.OooO00o(EditingLanguage.ENGLISH_SINGAPORE, map3, numOooO0O03, 1152, 127);
        OooO00o.OooO00o(EditingLanguage.SERBIAN_CYRILLIC_BOSNIA_AND_HERZEGOVINA, map3, 127, 21514, numOooO0O04);
        f43327du.put(1, 1025);
        f43327du.put(2, Integer.valueOf(EditingLanguage.BULGARIAN));
        f43327du.put(3, Integer.valueOf(EditingLanguage.CATALAN));
        f43327du.put(numOooO0O0, 2052);
        f43327du.put(5, Integer.valueOf(EditingLanguage.CZECH));
        f43327du.put(6, Integer.valueOf(EditingLanguage.DANISH));
        f43327du.put(numOooO0O02, Integer.valueOf(EditingLanguage.GERMAN_GERMANY));
        f43327du.put(8, Integer.valueOf(EditingLanguage.GREEK));
        f43327du.put(numOooO0O03, Integer.valueOf(EditingLanguage.ENGLISH_US));
        f43327du.put(numOooO0O04, Integer.valueOf(EditingLanguage.SPANISH_SPAIN_MODERN_SORT));
        f43327du.put(11, Integer.valueOf(EditingLanguage.FINNISH));
        f43327du.put(numOooO0O05, Integer.valueOf(EditingLanguage.FRENCH_FRANCE));
        f43327du.put(13, Integer.valueOf(EditingLanguage.HEBREW));
        f43327du.put(14, Integer.valueOf(EditingLanguage.HUNGARIAN));
        f43327du.put(15, Integer.valueOf(EditingLanguage.ICELANDIC));
        f43327du.put(numOooO0O06, Integer.valueOf(EditingLanguage.ITALIAN_ITALY));
        f43327du.put(17, Integer.valueOf(EditingLanguage.JAPANESE));
        f43327du.put(18, Integer.valueOf(EditingLanguage.KOREAN));
        f43327du.put(numOooO0O07, Integer.valueOf(EditingLanguage.DUTCH_NETHERLANDS));
        f43327du.put(numOooO0O08, Integer.valueOf(EditingLanguage.NORWEGIAN_BOKMAL));
        f43327du.put(21, Integer.valueOf(EditingLanguage.POLISH));
        f43327du.put(numOooO0O09, Integer.valueOf(EditingLanguage.PORTUGUESE_BRAZIL));
        f43327du.put(24, Integer.valueOf(EditingLanguage.ROMANIAN));
        f43327du.put(25, 1049);
        f43327du.put(numOooO0O010, 1050);
        f43327du.put(27, 1051);
        f43327du.put(28, 1052);
        f43327du.put(numOooO0O011, 1053);
        f43327du.put(30, Integer.valueOf(EditingLanguage.THAI));
        f43327du.put(31, 1055);
        f43327du.put(32, Integer.valueOf(EditingLanguage.URDU));
        f43327du.put(33, Integer.valueOf(EditingLanguage.INDONESIAN));
        f43327du.put(34, Integer.valueOf(EditingLanguage.UKRAINIAN));
        f43327du.put(35, Integer.valueOf(EditingLanguage.BELARUSIAN));
        f43327du.put(36, Integer.valueOf(EditingLanguage.SLOVENIAN));
        f43327du.put(37, Integer.valueOf(EditingLanguage.ESTONIAN));
        f43327du.put(38, Integer.valueOf(EditingLanguage.LATVIAN));
        f43327du.put(39, Integer.valueOf(EditingLanguage.LITHUANIAN));
        f43327du.put(41, Integer.valueOf(EditingLanguage.PERSIAN));
        f43327du.put(42, Integer.valueOf(EditingLanguage.VIETNAMESE));
        f43327du.put(43, Integer.valueOf(EditingLanguage.ARMENIAN));
        f43327du.put(numOooO0O012, Integer.valueOf(EditingLanguage.NORWEGIAN_BOKMAL));
        f43327du.put(45, Integer.valueOf(EditingLanguage.BASQUE));
        f43327du.put(47, Integer.valueOf(EditingLanguage.MACEDONIAN));
        f43327du.put(54, Integer.valueOf(EditingLanguage.AFRIKAANS));
        f43327du.put(55, Integer.valueOf(EditingLanguage.GEORGIAN));
        f43327du.put(56, Integer.valueOf(EditingLanguage.FAEROESE));
        f43327du.put(57, Integer.valueOf(EditingLanguage.HINDI));
        f43327du.put(62, Integer.valueOf(EditingLanguage.MALAY_MALAYSIA));
        f43327du.put(63, Integer.valueOf(EditingLanguage.KAZAKH));
        f43327du.put(64, Integer.valueOf(EditingLanguage.KYRGYZ));
        f43327du.put(65, Integer.valueOf(EditingLanguage.KISWAHILI));
        f43327du.put(67, Integer.valueOf(EditingLanguage.UZBEK_LATIN));
        f43327du.put(68, Integer.valueOf(EditingLanguage.TATAR));
        f43327du.put(70, Integer.valueOf(EditingLanguage.PUNJABI_INDIA));
        f43327du.put(71, Integer.valueOf(EditingLanguage.GUJARATI));
        f43327du.put(73, Integer.valueOf(EditingLanguage.TAMIL));
        f43327du.put(74, Integer.valueOf(EditingLanguage.TELUGU));
        f43327du.put(75, Integer.valueOf(EditingLanguage.KANNADA));
        f43327du.put(78, Integer.valueOf(EditingLanguage.MARATHI));
        f43327du.put(79, Integer.valueOf(EditingLanguage.SANSKRIT));
        f43327du.put(80, Integer.valueOf(EditingLanguage.MONGOLIAN_CYRILLIC));
        f43327du.put(86, Integer.valueOf(EditingLanguage.GALICIAN));
        f43327du.put(87, Integer.valueOf(EditingLanguage.KONKANI));
        f43327du.put(90, Integer.valueOf(EditingLanguage.SYRIAC));
        f43327du.put(101, Integer.valueOf(EditingLanguage.DIVEHI));
        f43327du.put(numOooO0O013, Integer.valueOf(EditingLanguage.CHINESE_HONG_KONG));
        f43327du.put(31770, Integer.valueOf(EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO));
    }

    /* JADX INFO: renamed from: du */
    private static C12851kk m59903du(int i) {
        C14141k4 c14141k4M67702k4 = C14142x1.m67702k4(ResourcesLoader.loadResource("System.Globalization", "patterns.dat"), i + ".xml");
        if (c14141k4M67702k4 == null) {
            return null;
        }
        return m59905k4(m59908k4(c14141k4M67702k4));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m59904k4(int i) {
        return f43327du.get(Integer.valueOf(i)).intValue();
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC11694rv m59909kk(int i) {
        HashMap<Integer, AbstractC11694rv> map = f43331x1;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : new C11695to();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    private static HashMap<Character, String[]> m59912to(Element element, String str) {
        HashMap<Character, String[]> map = new HashMap<>();
        String[] strArrM67414k4 = C14113y2.m67414k4(str, IOUtils.DIR_SEPARATOR_UNIX);
        NodeList childNodes = ((Element) element.getElementsByTagName(strArrM67414k4[0]).item(0)).getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                Element element2 = (Element) nodeItem;
                if (element2.getTagName().equals(strArrM67414k4[1]) && element2.getAttribute("Format") != null) {
                    ArrayList arrayList = new ArrayList();
                    Character chValueOf = Character.valueOf(element2.getAttribute("Format").charAt(0));
                    NodeList childNodes2 = nodeItem.getChildNodes();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node nodeItem2 = childNodes2.item(i2);
                        if (nodeItem2.getNodeType() == 1 && ((Element) nodeItem2).getTagName().equals(strArrM67414k4[2])) {
                            arrayList.add(m59907k4(nodeItem2));
                        }
                    }
                    map.put(chValueOf, arrayList.toArray(new String[0]));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12851kk m59914x1(int i) {
        C12851kk c12851kk;
        HashMap<Integer, C12851kk> map = f43328k4;
        synchronized (map) {
            try {
                if (!map.containsKey(Integer.valueOf(i))) {
                    C12851kk c12851kkM59903du = m59903du(i);
                    if (c12851kkM59903du == null) {
                        throw new FileNotFoundException(i + ".xml");
                    }
                    map.put(Integer.valueOf(i), c12851kkM59903du);
                }
                c12851kk = map.get(Integer.valueOf(i));
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12851kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12851kk m59905k4(Element element) {
        if (!element.getTagName().equals("CultureInfo")) {
            return null;
        }
        C12851kk c12851kk = new C12851kk();
        c12851kk.f43297k4 = element.getAttribute("Name");
        c12851kk.f43300x1 = Integer.parseInt(element.getAttribute("LCID"));
        boolean z = Boolean.parseBoolean(element.getAttribute("IsNeutralCulture"));
        c12851kk.f43298kk = z;
        if (!z) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1) {
                    Element element2 = (Element) nodeItem;
                    if (element2.getTagName().equals("DateTimeFormat")) {
                        c12851kk.f43299to = m59910kk(element2);
                    } else if (element2.getTagName().equals("NumberFormat")) {
                        c12851kk.f43296du = m59915x1(element2);
                    }
                }
            }
        }
        return c12851kk;
    }

    /* JADX INFO: renamed from: kk */
    private static C12848du m59910kk(Element element) {
        C12848du c12848du = new C12851kk().f43299to;
        c12848du.f43272k4 = Integer.parseInt(m59906k4(element, "FirstDayOfWeek"));
        c12848du.f43286x1 = Integer.parseInt(m59906k4(element, "CalendarWeekRule"));
        c12848du.f43273kk = m59916x1(element, "EraNames/EraName");
        c12848du.f43279to = m59916x1(element, "AbbreviatedEraNames/AbbreviatedEraName");
        c12848du.f43266du = m59916x1(element, "AbbreviatedDayNames/AbbreviatedDayName");
        c12848du.f43269h4 = m59916x1(element, "AbbreviatedMonthGenitiveNames/AbbreviatedMonthGenitiveName");
        c12848du.f43275m9 = m59916x1(element, "AbbreviatedMonthNames/AbbreviatedMonthName");
        c12848du.f43267dy = m59916x1(element, "DayNames/DayName");
        c12848du.f43264c5 = m59916x1(element, "MonthGenitiveNames/MonthGenitiveName");
        c12848du.f43271jd = m59916x1(element, "MonthNames/MonthName");
        c12848du.f43265ck = m59916x1(element, "ShortestDayNames/ShortestDayName");
        c12848du.f43268fa = m59906k4(element, "AMDesignator");
        c12848du.f43282up = m59906k4(element, "PMDesignator");
        c12848du.f43288yj = m59906k4(element, "DateSeparator");
        c12848du.f43274ks = m59906k4(element, "TimeSeparator");
        c12848du.f43278rv = m59906k4(element, "FullDateTimePattern");
        c12848du.f43287x6 = m59906k4(element, "LongDatePattern");
        c12848du.f43276ne = m59906k4(element, "LongTimePattern");
        c12848du.f43270ix = m59906k4(element, "ShortDatePattern");
        c12848du.f43280u4 = m59906k4(element, "ShortTimePattern");
        c12848du.f43283uz = m59906k4(element, "RFC1123Pattern");
        c12848du.f43285wl = m59906k4(element, "SortableDateTimePattern");
        c12848du.f43277qq = m59906k4(element, "UniversalSortableDateTimePattern");
        c12848du.f43262ar = m59906k4(element, "MonthDayPattern");
        c12848du.f43281um = m59906k4(element, "YearMonthPattern");
        c12848du.f43263bv = m59916x1(element, "AllDateTimePatterns/DateTimePattern");
        c12848du.f43284v4 = m59912to(element, "AllStandardDateTimePatterns/StandardDateTimePattern/DateTimePattern");
        return c12848du;
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC11694rv[] m59913to(int i) {
        HashMap<Integer, AbstractC11694rv[]> map = f43329kk;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : new AbstractC11694rv[]{new C11695to()};
    }

    /* JADX INFO: renamed from: x1 */
    private static C12852m9 m59915x1(Element element) {
        C12852m9 c12852m9 = new C12851kk().f43296du;
        c12852m9.f43311k4 = Integer.parseInt(m59906k4(element, "CurrencyDecimalDigits"));
        c12852m9.f43324x1 = m59906k4(element, "CurrencyDecimalSeparator");
        c12852m9.f43312kk = m59906k4(element, "CurrencyGroupSeparator");
        c12852m9.f43305du = Integer.parseInt(m59906k4(element, "CurrencyNegativePattern"));
        c12852m9.f43308h4 = Integer.parseInt(m59906k4(element, "CurrencyPositivePattern"));
        c12852m9.f43314m9 = m59906k4(element, "CurrencySymbol");
        c12852m9.f43307fa = Integer.parseInt(m59906k4(element, "NumberDecimalDigits"));
        c12852m9.f43321up = m59906k4(element, "NumberDecimalSeparator");
        c12852m9.f43326yj = m59906k4(element, "NumberGroupSeparator");
        c12852m9.f43317rv = Integer.parseInt(m59906k4(element, "NumberNegativePattern"));
        c12852m9.f43325x6 = Integer.parseInt(m59906k4(element, "PercentDecimalDigits"));
        c12852m9.f43315ne = m59906k4(element, "PercentDecimalSeparator");
        c12852m9.f43309ix = m59906k4(element, "PercentGroupSeparator");
        c12852m9.f43322uz = Integer.parseInt(m59906k4(element, "PercentNegativePattern"));
        c12852m9.f43323wl = Integer.parseInt(m59906k4(element, "PercentPositivePattern"));
        c12852m9.f43316qq = m59906k4(element, "PercentSymbol");
        c12852m9.f43306dy = m59906k4(element, "NaNSymbol");
        c12852m9.f43310jd = m59906k4(element, "NegativeInfinitySymbol");
        c12852m9.f43320um = m59906k4(element, "PositiveInfinitySymbol");
        c12852m9.f43304ck = m59906k4(element, "NegativeSign");
        c12852m9.f43302bv = m59906k4(element, "PositiveSign");
        c12852m9.f43301ar = m59906k4(element, "PerMilleSymbol");
        c12852m9.f43303c5 = m59916x1(element, "NativeDigits/NativeDigit");
        c12852m9.f43313ks = m59911kk(element, "NumberGroupSizes/NumberGroupSize");
        c12852m9.f43313ks = m59911kk(element, "NumberGroupSizes/NumberGroupSize");
        c12852m9.f43319u4 = m59911kk(element, "PercentGroupSizes/PercentGroupSize");
        c12852m9.f43318to = m59911kk(element, "CurrencyGroupSizes/CurrencyGroupSize");
        return c12852m9;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m59906k4(Element element, String str) {
        return m59907k4(element.getElementsByTagName(str).item(0));
    }

    /* JADX INFO: renamed from: kk */
    private static int[] m59911kk(Element element, String str) {
        String[] strArrM67414k4 = C14113y2.m67414k4(str, IOUtils.DIR_SEPARATOR_UNIX);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        NodeList childNodes = ((Element) element.getElementsByTagName(strArrM67414k4[0]).item(0)).getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem.getNodeType() == 1 && ((Element) nodeItem).getTagName().equals(strArrM67414k4[1])) {
                arrayList.add(Integer.valueOf(Integer.parseInt(m59907k4(nodeItem))));
            }
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: x1 */
    private static String[] m59916x1(Element element, String str) {
        String[] strArrM67414k4 = C14113y2.m67414k4(str, IOUtils.DIR_SEPARATOR_UNIX);
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = ((Element) element.getElementsByTagName(strArrM67414k4[0]).item(0)).getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && ((Element) nodeItem).getTagName().equals(strArrM67414k4[1])) {
                arrayList.add(m59907k4(nodeItem));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m59907k4(Node node) {
        Node firstChild = node.getFirstChild();
        return firstChild == null ? C14113y2.f47374k4 : firstChild.getNodeValue();
    }

    /* JADX INFO: renamed from: k4 */
    private static Element m59908k4(C14141k4 c14141k4) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c14141k4.m67700k4().toInputStream()).getDocumentElement();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
