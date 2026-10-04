package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p205ji.C5449c5;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11696up;
import com.aspose.slides.internal.p527yk.C12851kk;
import com.aspose.slides.internal.p527yk.C12853to;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.EditingLanguage;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.UserConstants;
import com.orion.notein.domain.models.backup.BackupFile;
import com.vivo.penengine.impl.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11697x1 implements InterfaceC14059g8, InterfaceC14073kp, Cloneable {

    /* JADX INFO: renamed from: ix */
    private static HashSet<Integer> f39640ix;

    /* JADX INFO: renamed from: ne */
    private static HashMap<String, Integer> f39642ne;

    /* JADX INFO: renamed from: u4 */
    private static HashMap<Integer, C11696up.k4> f39644u4;

    /* JADX INFO: renamed from: x6 */
    private static C11697x1 f39645x6;

    /* JADX INFO: renamed from: c5 */
    private Boolean f39646c5;

    /* JADX INFO: renamed from: ck */
    private boolean f39647ck;

    /* JADX INFO: renamed from: dy */
    private String f39648dy;

    /* JADX INFO: renamed from: fa */
    private Locale f39649fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC11694rv f39650h4;

    /* JADX INFO: renamed from: jd */
    private boolean f39651jd;

    /* JADX INFO: renamed from: k4 */
    C11696up f39652k4;

    /* JADX INFO: renamed from: ks */
    private C11683c5 f39653ks;

    /* JADX INFO: renamed from: m9 */
    private AbstractC11694rv[] f39654m9;

    /* JADX INFO: renamed from: rv */
    private boolean f39655rv;

    /* JADX INFO: renamed from: up */
    private C11691kk f39656up;

    /* JADX INFO: renamed from: x1 */
    C11690k4 f39657x1;

    /* JADX INFO: renamed from: yj */
    private Integer f39658yj;

    /* JADX INFO: renamed from: kk */
    private static HashMap f39641kk = new HashMap();

    /* JADX INFO: renamed from: to */
    private static HashMap f39643to = new HashMap();

    /* JADX INFO: renamed from: du */
    private static final Object f39639du = new Object();

    static {
        HashMap<String, Integer> map = new HashMap<>();
        f39642ne = map;
        map.put("", 127);
        f39642ne.put(TranslateLanguage.AFRIKAANS, 54);
        f39642ne.put("af-ZA", Integer.valueOf(EditingLanguage.AFRIKAANS));
        f39642ne.put("am-ET", Integer.valueOf(EditingLanguage.AMHARIC));
        f39642ne.put(TranslateLanguage.ARABIC, 1);
        f39642ne.put("ar-AE", Integer.valueOf(EditingLanguage.ARABIC_UAE));
        f39642ne.put("ar-BH", Integer.valueOf(EditingLanguage.ARABIC_BAHRAIN));
        f39642ne.put("ar-DZ", Integer.valueOf(EditingLanguage.ARABIC_ALGERIA));
        f39642ne.put("ar-EG", Integer.valueOf(EditingLanguage.ARABIC_EGYPT));
        f39642ne.put("ar-IQ", Integer.valueOf(EditingLanguage.ARABIC_IRAQ));
        f39642ne.put("ar-JO", Integer.valueOf(EditingLanguage.ARABIC_JORDAN));
        f39642ne.put("ar-KW", Integer.valueOf(EditingLanguage.ARABIC_KUWAIT));
        f39642ne.put("ar-LB", Integer.valueOf(EditingLanguage.ARABIC_LEBANON));
        f39642ne.put("ar-LY", Integer.valueOf(EditingLanguage.ARABIC_LIBYA));
        f39642ne.put("ar-MA", Integer.valueOf(EditingLanguage.ARABIC_MOROCCO));
        f39642ne.put("arn-CL", Integer.valueOf(EditingLanguage.MAPUDUNGUN_CHILE));
        f39642ne.put("ar-OM", Integer.valueOf(EditingLanguage.ARABIC_OMAN));
        f39642ne.put("ar-QA", Integer.valueOf(EditingLanguage.ARABIC_QATAR));
        f39642ne.put("ar-SA", 1025);
        f39642ne.put("ar-SY", Integer.valueOf(EditingLanguage.ARABIC_SYRIA));
        f39642ne.put("ar-TN", Integer.valueOf(EditingLanguage.ARABIC_TUNISIA));
        f39642ne.put("ar-YE", Integer.valueOf(EditingLanguage.ARABIC_YEMEN));
        f39642ne.put("as-IN", Integer.valueOf(EditingLanguage.ASSAMESE));
        f39642ne.put("az", 44);
        f39642ne.put("az-Cyrl-AZ", Integer.valueOf(EditingLanguage.AZERBAIJANI_CYRILLIC));
        f39642ne.put("az-Latn-AZ", Integer.valueOf(EditingLanguage.AZERBAIJANI_LATIN));
        f39642ne.put("ba-RU", Integer.valueOf(EditingLanguage.BASHKIR));
        f39642ne.put(TranslateLanguage.BELARUSIAN, 35);
        f39642ne.put("be-BY", Integer.valueOf(EditingLanguage.BELARUSIAN));
        f39642ne.put(TranslateLanguage.BULGARIAN, 2);
        f39642ne.put("bg-BG", Integer.valueOf(EditingLanguage.BULGARIAN));
        f39642ne.put("bn-BD", Integer.valueOf(EditingLanguage.BANGLA_BANGLADESH));
        f39642ne.put("bn-IN", Integer.valueOf(EditingLanguage.BANGLA_INDIA));
        f39642ne.put("bo-CN", Integer.valueOf(EditingLanguage.TIBETAN_CHINA));
        f39642ne.put("br-FR", Integer.valueOf(EditingLanguage.BRETON));
        f39642ne.put("bs-Cyrl-BA", Integer.valueOf(EditingLanguage.BOSNIAN_CYRILLIC));
        f39642ne.put("bs-Latn-BA", Integer.valueOf(EditingLanguage.BOSNIAN_LATIN));
        f39642ne.put(TranslateLanguage.CATALAN, 3);
        f39642ne.put("ca-ES", Integer.valueOf(EditingLanguage.CATALAN));
        f39642ne.put("co-FR", Integer.valueOf(EditingLanguage.CORSICAN));
        f39642ne.put(TranslateLanguage.CZECH, 5);
        f39642ne.put("cs-CZ", Integer.valueOf(EditingLanguage.CZECH));
        f39642ne.put("cy-GB", Integer.valueOf(EditingLanguage.WELSH));
        f39642ne.put(TranslateLanguage.DANISH, 6);
        f39642ne.put("da-DK", Integer.valueOf(EditingLanguage.DANISH));
        f39642ne.put(TranslateLanguage.GERMAN, 7);
        f39642ne.put("de-AT", Integer.valueOf(EditingLanguage.GERMAN_AUSTRIA));
        f39642ne.put("de-CH", Integer.valueOf(EditingLanguage.GERMAN_SWITZERLAND));
        f39642ne.put("de-DE", Integer.valueOf(EditingLanguage.GERMAN_GERMANY));
        f39642ne.put("de-LI", Integer.valueOf(EditingLanguage.GERMAN_LIECHTENSTEIN));
        f39642ne.put("de-LU", Integer.valueOf(EditingLanguage.GERMAN_LUXEMBOURG));
        f39642ne.put("dsb-DE", 2094);
        f39642ne.put("dv", 101);
        f39642ne.put("dv-MV", Integer.valueOf(EditingLanguage.DIVEHI));
        f39642ne.put(TranslateLanguage.GREEK, 8);
        f39642ne.put("el-GR", Integer.valueOf(EditingLanguage.GREEK));
        f39642ne.put(TranslateLanguage.ENGLISH, 9);
        f39642ne.put("en-029", Integer.valueOf(EditingLanguage.ENGLISH_CARIBBEAN));
        f39642ne.put("en-AU", Integer.valueOf(EditingLanguage.ENGLISH_AUSTRALIA));
        f39642ne.put("en-BZ", Integer.valueOf(EditingLanguage.ENGLISH_BELIZE));
        f39642ne.put("en-CA", Integer.valueOf(EditingLanguage.ENGLISH_CANADA));
        f39642ne.put("en-GB", Integer.valueOf(EditingLanguage.ENGLISH_UK));
        f39642ne.put("en-IE", Integer.valueOf(EditingLanguage.ENGLISH_IRELAND));
        f39642ne.put("en-IN", Integer.valueOf(EditingLanguage.ENGLISH_INDIA));
        f39642ne.put("en-JM", Integer.valueOf(EditingLanguage.ENGLISH_JAMAICA));
        f39642ne.put("en-MY", Integer.valueOf(EditingLanguage.ENGLISH_MALAYSIA));
        f39642ne.put("en-NZ", Integer.valueOf(EditingLanguage.ENGLISH_NEW_ZEALAND));
        f39642ne.put("en-PH", Integer.valueOf(EditingLanguage.ENGLISH_PHILIPPINES));
        f39642ne.put("en-SG", Integer.valueOf(EditingLanguage.ENGLISH_SINGAPORE));
        f39642ne.put("en-TT", Integer.valueOf(EditingLanguage.ENGLISH_TRINIDAD_AND_TOBAGO));
        f39642ne.put("en-US", Integer.valueOf(EditingLanguage.ENGLISH_US));
        f39642ne.put("en-ZA", Integer.valueOf(EditingLanguage.ENGLISH_SOUTH_AFRICA));
        f39642ne.put("en-ZW", Integer.valueOf(EditingLanguage.ENGLISH_ZIMBABWE));
        f39642ne.put(TranslateLanguage.SPANISH, 10);
        f39642ne.put("es-AR", Integer.valueOf(EditingLanguage.SPANISH_ARGENTINA));
        f39642ne.put("es-BO", Integer.valueOf(EditingLanguage.SPANISH_BOLIVIA));
        f39642ne.put("es-CL", Integer.valueOf(EditingLanguage.SPANISH_CHILE));
        f39642ne.put("es-CO", Integer.valueOf(EditingLanguage.SPANISH_COLOMBIA));
        f39642ne.put("es-CR", Integer.valueOf(EditingLanguage.SPANISH_COSTA_RICA));
        f39642ne.put("es-DO", Integer.valueOf(EditingLanguage.SPANISH_DOMINICAN_REPUBLIC));
        f39642ne.put("es-EC", Integer.valueOf(EditingLanguage.SPANISH_ECUADOR));
        f39642ne.put("es-ES", Integer.valueOf(EditingLanguage.SPANISH_SPAIN_MODERN_SORT));
        f39642ne.put("es-GT", Integer.valueOf(EditingLanguage.SPANISH_GUATEMALA));
        f39642ne.put("es-HN", Integer.valueOf(EditingLanguage.SPANISH_HONDURAS));
        f39642ne.put("es-MX", Integer.valueOf(EditingLanguage.SPANISH_MEXICO));
        f39642ne.put("es-NI", Integer.valueOf(EditingLanguage.SPANISH_NICARAGUA));
        f39642ne.put("es-PA", Integer.valueOf(EditingLanguage.SPANISH_PANAMA));
        f39642ne.put("es-PE", Integer.valueOf(EditingLanguage.SPANISH_PERU));
        f39642ne.put("es-PR", Integer.valueOf(EditingLanguage.SPANISH_PUERTO_RICO));
        f39642ne.put("es-PY", Integer.valueOf(EditingLanguage.SPANISH_PARAGUAY));
        f39642ne.put("es-SV", Integer.valueOf(EditingLanguage.SPANISH_EL_SALVADOR));
        f39642ne.put("es-US", 21514);
        f39642ne.put("es-UY", Integer.valueOf(EditingLanguage.SPANISH_URUGUAY));
        f39642ne.put("es-VE", Integer.valueOf(EditingLanguage.SPANISH_VENEZUELA));
        f39642ne.put(TranslateLanguage.ESTONIAN, 37);
        f39642ne.put("et-EE", Integer.valueOf(EditingLanguage.ESTONIAN));
        f39642ne.put("eu", 45);
        f39642ne.put("eu-ES", Integer.valueOf(EditingLanguage.BASQUE));
        f39642ne.put(TranslateLanguage.PERSIAN, 41);
        f39642ne.put("fa-IR", Integer.valueOf(EditingLanguage.PERSIAN));
        f39642ne.put(TranslateLanguage.FINNISH, 11);
        f39642ne.put("fi-FI", Integer.valueOf(EditingLanguage.FINNISH));
        f39642ne.put("fil-PH", Integer.valueOf(EditingLanguage.FILIPINO));
        f39642ne.put("fo", 56);
        f39642ne.put("fo-FO", Integer.valueOf(EditingLanguage.FAEROESE));
        f39642ne.put(TranslateLanguage.FRENCH, 12);
        f39642ne.put("fr-BE", Integer.valueOf(EditingLanguage.FRENCH_BELGIUM));
        f39642ne.put("fr-CA", Integer.valueOf(EditingLanguage.FRENCH_CANADA));
        f39642ne.put("fr-CH", Integer.valueOf(EditingLanguage.FRENCH_SWITZERLAND));
        f39642ne.put("fr-FR", Integer.valueOf(EditingLanguage.FRENCH_FRANCE));
        f39642ne.put("fr-LU", Integer.valueOf(EditingLanguage.FRENCH_LUXEMBOURG));
        f39642ne.put("fr-MC", Integer.valueOf(EditingLanguage.FRENCH_MONACO));
        f39642ne.put("fy-NL", Integer.valueOf(EditingLanguage.FRISIAN));
        f39642ne.put("ga-IE", Integer.valueOf(EditingLanguage.IRISH));
        f39642ne.put("gd-GB", Integer.valueOf(EditingLanguage.SCOTTISH_GAELIC));
        f39642ne.put(TranslateLanguage.GALICIAN, 86);
        f39642ne.put("gl-ES", Integer.valueOf(EditingLanguage.GALICIAN));
        f39642ne.put("gsw-FR", Integer.valueOf(EditingLanguage.ALSATIAN));
        f39642ne.put(TranslateLanguage.GUJARATI, 71);
        f39642ne.put("gu-IN", Integer.valueOf(EditingLanguage.GUJARATI));
        f39642ne.put("ha-Latn-NG", Integer.valueOf(EditingLanguage.HAUSA));
        f39642ne.put(TranslateLanguage.HEBREW, 13);
        f39642ne.put("he-IL", Integer.valueOf(EditingLanguage.HEBREW));
        f39642ne.put(TranslateLanguage.HINDI, 57);
        f39642ne.put("hi-IN", Integer.valueOf(EditingLanguage.HINDI));
        f39642ne.put(TranslateLanguage.CROATIAN, 26);
        f39642ne.put("hr-BA", Integer.valueOf(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA));
        f39642ne.put("hr-HR", 1050);
        f39642ne.put("hsb-DE", Integer.valueOf(EditingLanguage.SORBIAN));
        f39642ne.put(TranslateLanguage.HUNGARIAN, 14);
        f39642ne.put("hu-HU", Integer.valueOf(EditingLanguage.HUNGARIAN));
        f39642ne.put("hy", 43);
        f39642ne.put("hy-AM", Integer.valueOf(EditingLanguage.ARMENIAN));
        f39642ne.put("id", 33);
        f39642ne.put("id-ID", Integer.valueOf(EditingLanguage.INDONESIAN));
        f39642ne.put("ig-NG", Integer.valueOf(EditingLanguage.IGBO));
        f39642ne.put("ii-CN", Integer.valueOf(EditingLanguage.f50775YI));
        f39642ne.put(TranslateLanguage.ICELANDIC, 15);
        f39642ne.put("is-IS", Integer.valueOf(EditingLanguage.ICELANDIC));
        f39642ne.put(TranslateLanguage.ITALIAN, 16);
        f39642ne.put("it-CH", Integer.valueOf(EditingLanguage.ITALIAN_SWITZERLAND));
        f39642ne.put("it-IT", Integer.valueOf(EditingLanguage.ITALIAN_ITALY));
        f39642ne.put("iu-Cans-CA", 1117);
        f39642ne.put("iu-Latn-CA", 2141);
        f39642ne.put(TranslateLanguage.JAPANESE, 17);
        f39642ne.put("ja-JP", Integer.valueOf(EditingLanguage.JAPANESE));
        f39642ne.put(TranslateLanguage.GEORGIAN, 55);
        f39642ne.put("ka-GE", Integer.valueOf(EditingLanguage.GEORGIAN));
        f39642ne.put("kk", 63);
        f39642ne.put("kk-KZ", Integer.valueOf(EditingLanguage.KAZAKH));
        f39642ne.put("kl-GL", Integer.valueOf(EditingLanguage.GREENLANDIC));
        f39642ne.put("km-KH", Integer.valueOf(EditingLanguage.KHMER));
        f39642ne.put(TranslateLanguage.KANNADA, 75);
        f39642ne.put("kn-IN", Integer.valueOf(EditingLanguage.KANNADA));
        f39642ne.put(TranslateLanguage.KOREAN, 18);
        f39642ne.put("kok", 87);
        f39642ne.put("kok-IN", Integer.valueOf(EditingLanguage.KONKANI));
        f39642ne.put("ko-KR", Integer.valueOf(EditingLanguage.KOREAN));
        f39642ne.put("ky", 64);
        f39642ne.put("ky-KG", Integer.valueOf(EditingLanguage.KYRGYZ));
        f39642ne.put("lb-LU", Integer.valueOf(EditingLanguage.LUXEMBOUGISH));
        f39642ne.put("lo-LA", Integer.valueOf(EditingLanguage.LAO));
        f39642ne.put(TranslateLanguage.LITHUANIAN, 39);
        f39642ne.put("lt-LT", Integer.valueOf(EditingLanguage.LITHUANIAN));
        f39642ne.put(TranslateLanguage.LATVIAN, 38);
        f39642ne.put("lv-LV", Integer.valueOf(EditingLanguage.LATVIAN));
        f39642ne.put("mi-NZ", Integer.valueOf(EditingLanguage.MAORI));
        f39642ne.put(TranslateLanguage.MACEDONIAN, 47);
        f39642ne.put("mk-MK", Integer.valueOf(EditingLanguage.MACEDONIAN));
        f39642ne.put("ml-IN", Integer.valueOf(EditingLanguage.MALAYALAM));
        f39642ne.put("mn", 80);
        f39642ne.put("mn-MN", Integer.valueOf(EditingLanguage.MONGOLIAN_CYRILLIC));
        f39642ne.put("mn-Mong-CN", Integer.valueOf(EditingLanguage.MONGOLIAN_MONGOLIAN));
        f39642ne.put("moh-CA", Integer.valueOf(EditingLanguage.MOHAWK));
        f39642ne.put(TranslateLanguage.MARATHI, 78);
        f39642ne.put("mr-IN", Integer.valueOf(EditingLanguage.MARATHI));
        f39642ne.put(TranslateLanguage.MALAY, 62);
        f39642ne.put("ms-BN", Integer.valueOf(EditingLanguage.MALAY_BRUNEI_DARUSSALAM));
        f39642ne.put("ms-MY", Integer.valueOf(EditingLanguage.MALAY_MALAYSIA));
        f39642ne.put("mt-MT", Integer.valueOf(EditingLanguage.MALTESE));
        f39642ne.put("nb-NO", Integer.valueOf(EditingLanguage.NORWEGIAN_BOKMAL));
        f39642ne.put("ne-NP", Integer.valueOf(EditingLanguage.NEPALI));
        f39642ne.put(TranslateLanguage.DUTCH, 19);
        f39642ne.put("nl-BE", Integer.valueOf(EditingLanguage.DUTCH_BELGIUM));
        f39642ne.put("nl-NL", Integer.valueOf(EditingLanguage.DUTCH_NETHERLANDS));
        f39642ne.put("nn-NO", Integer.valueOf(EditingLanguage.NORWEGIAN_NYNORSK));
        f39642ne.put(TranslateLanguage.NORWEGIAN, 20);
        f39642ne.put("ns-ZA", 1132);
        f39642ne.put("nso-ZA", 1132);
        f39642ne.put("oc-FR", 1154);
        f39642ne.put("or-IN", Integer.valueOf(EditingLanguage.ORIYA));
        f39642ne.put("pa", 70);
        f39642ne.put("pa-IN", Integer.valueOf(EditingLanguage.PUNJABI_INDIA));
        f39642ne.put(TranslateLanguage.POLISH, 21);
        f39642ne.put("pl-PL", Integer.valueOf(EditingLanguage.POLISH));
        f39642ne.put("prs-AF", 1164);
        f39642ne.put("ps-AF", Integer.valueOf(EditingLanguage.PASHTO));
        f39642ne.put(TranslateLanguage.PORTUGUESE, 22);
        f39642ne.put("pt-BR", Integer.valueOf(EditingLanguage.PORTUGUESE_BRAZIL));
        f39642ne.put("pt-PT", Integer.valueOf(EditingLanguage.PORTUGUESE_PORTUGAL));
        f39642ne.put("qut-GT", 1158);
        f39642ne.put("quz-BO", Integer.valueOf(EditingLanguage.QUECHUA_BOLIVIA));
        f39642ne.put("quz-EC", Integer.valueOf(EditingLanguage.QUECHUA_ECUADOR));
        f39642ne.put("quz-PE", Integer.valueOf(EditingLanguage.QUECHUA_PERU));
        f39642ne.put("rm-CH", Integer.valueOf(EditingLanguage.ROMANSH));
        f39642ne.put(TranslateLanguage.ROMANIAN, 24);
        f39642ne.put("ro-RO", Integer.valueOf(EditingLanguage.ROMANIAN));
        f39642ne.put(TranslateLanguage.RUSSIAN, 25);
        f39642ne.put("ru-RU", 1049);
        f39642ne.put("rw-RW", Integer.valueOf(EditingLanguage.KINYARWANDA));
        f39642ne.put("sa", 79);
        f39642ne.put("sah-RU", Integer.valueOf(EditingLanguage.SAKHA));
        f39642ne.put("sa-IN", Integer.valueOf(EditingLanguage.SANSKRIT));
        f39642ne.put("se-FI", Integer.valueOf(EditingLanguage.NORTHERN_SAMI_FINLAND));
        f39642ne.put("se-NO", Integer.valueOf(EditingLanguage.NORTHERN_SAMI_NORWAY));
        f39642ne.put("se-SE", Integer.valueOf(EditingLanguage.NORTHERN_SAMI_SWEDEN));
        f39642ne.put("si-LK", Integer.valueOf(EditingLanguage.SINHALESE));
        f39642ne.put(TranslateLanguage.SLOVAK, 27);
        f39642ne.put("sk-SK", 1051);
        f39642ne.put(TranslateLanguage.SLOVENIAN, 36);
        f39642ne.put("sl-SI", Integer.valueOf(EditingLanguage.SLOVENIAN));
        f39642ne.put("sma-NO", 6203);
        f39642ne.put("sma-SE", 7227);
        f39642ne.put("smj-NO", Integer.valueOf(EditingLanguage.LULE_SAMI_NORWAY));
        f39642ne.put("smj-SE", Integer.valueOf(EditingLanguage.LULE_SAMI_SWEDEN));
        f39642ne.put("smn-FI", Integer.valueOf(EditingLanguage.INARI_SAMI_FINLAND));
        f39642ne.put("sms-FI", 8251);
        f39642ne.put(TranslateLanguage.ALBANIAN, 28);
        f39642ne.put("sq-AL", 1052);
        f39642ne.put("sr", 31770);
        f39642ne.put("sr-Cyrl-BA", Integer.valueOf(EditingLanguage.SERBIAN_CYRILLIC_BOSNIA_AND_HERZEGOVINA));
        f39642ne.put("sr-Cyrl-CS", Integer.valueOf(EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO));
        f39642ne.put("sr-Cyrl-ME", 12314);
        f39642ne.put("sr-Cyrl-RS", 10266);
        f39642ne.put("sr-Latn-BA", Integer.valueOf(EditingLanguage.SERBIAN_LATIN_BOSNIA_AND_HERZEGOVINA));
        f39642ne.put("sr-Latn-CS", Integer.valueOf(EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO));
        f39642ne.put("sr-Latn-ME", 11290);
        f39642ne.put("sr-Latn-RS", 9242);
        f39642ne.put(TranslateLanguage.SWEDISH, 29);
        f39642ne.put("sv-FI", Integer.valueOf(EditingLanguage.SWEDISH_FINLAND));
        f39642ne.put("sv-SE", 1053);
        f39642ne.put(TranslateLanguage.SWAHILI, 65);
        f39642ne.put("sw-KE", Integer.valueOf(EditingLanguage.KISWAHILI));
        f39642ne.put("syr", 90);
        f39642ne.put("syr-SY", Integer.valueOf(EditingLanguage.SYRIAC));
        f39642ne.put(TranslateLanguage.TAMIL, 73);
        f39642ne.put("ta-IN", Integer.valueOf(EditingLanguage.TAMIL));
        f39642ne.put("te", 74);
        f39642ne.put("te-IN", Integer.valueOf(EditingLanguage.TELUGU));
        f39642ne.put("tg-Cyrl-TJ", Integer.valueOf(EditingLanguage.TAJIK));
        f39642ne.put(TranslateLanguage.THAI, 30);
        f39642ne.put("th-TH", Integer.valueOf(EditingLanguage.THAI));
        f39642ne.put("tk-TM", Integer.valueOf(EditingLanguage.TURKMEN));
        f39642ne.put("tn-ZA", Integer.valueOf(EditingLanguage.TSWANA));
        f39642ne.put(TranslateLanguage.TURKISH, 31);
        f39642ne.put("tr-TR", 1055);
        f39642ne.put("tt", 68);
        f39642ne.put("tt-RU", Integer.valueOf(EditingLanguage.TATAR));
        f39642ne.put("tzm-Latn-DZ", Integer.valueOf(EditingLanguage.TAMAZIGHT_LATIN));
        f39642ne.put("ug-CN", 1152);
        f39642ne.put(TranslateLanguage.UKRAINIAN, 34);
        f39642ne.put("uk-UA", Integer.valueOf(EditingLanguage.UKRAINIAN));
        f39642ne.put(TranslateLanguage.URDU, 32);
        f39642ne.put("ur-PK", Integer.valueOf(EditingLanguage.URDU));
        f39642ne.put("uz", 67);
        f39642ne.put("uz-Cyrl-UZ", Integer.valueOf(EditingLanguage.UZBEK_CYRILLIC));
        f39642ne.put("uz-Latn-UZ", Integer.valueOf(EditingLanguage.UZBEK_LATIN));
        f39642ne.put(TranslateLanguage.VIETNAMESE, 42);
        f39642ne.put("vi-VN", Integer.valueOf(EditingLanguage.VIETNAMESE));
        f39642ne.put("wo-SN", 1160);
        f39642ne.put("xh-ZA", Integer.valueOf(EditingLanguage.ISI_XHOSA));
        f39642ne.put("yo-NG", Integer.valueOf(EditingLanguage.YORUBA));
        f39642ne.put("zh-CHS", 4);
        f39642ne.put("zh-CHT", 31748);
        f39642ne.put("zh-CN", 2052);
        f39642ne.put("zh-HK", Integer.valueOf(EditingLanguage.CHINESE_HONG_KONG));
        f39642ne.put("zh-MO", Integer.valueOf(EditingLanguage.CHINESE_MACAO));
        f39642ne.put("zh-SG", Integer.valueOf(EditingLanguage.CHINESE_SINGAPORE));
        f39642ne.put("zh-TW", Integer.valueOf(EditingLanguage.CHINESE_TAIWAN));
        f39642ne.put("zu-ZA", Integer.valueOf(EditingLanguage.ISI_ZULU));
        f39640ix = new HashSet<>(f39642ne.values());
        f39644u4 = new HashMap<>();
        m55248k4(127, 1252, 37, 10000, 437, ',', false);
        m55248k4(54, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.AFRIKAANS, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.AMHARIC, 0, 500, 2, 1, (char) 4963, false);
        m55248k4(1, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_UAE, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_BAHRAIN, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_ALGERIA, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_EGYPT, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_IRAQ, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_JORDAN, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_KUWAIT, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_LEBANON, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_LIBYA, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_MOROCCO, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.MAPUDUNGUN_CHILE, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ARABIC_OMAN, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_QATAR, 1256, 20420, 10004, 720, ';', true);
        m55248k4(1025, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_SYRIA, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_TUNISIA, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ARABIC_YEMEN, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.ASSAMESE, 0, 500, 2, 1, ',', false);
        m55248k4(44, 1254, 20905, 10081, 857, ';', false);
        m55248k4(EditingLanguage.AZERBAIJANI_CYRILLIC, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.AZERBAIJANI_LATIN, 1254, 20905, 10081, 857, ';', false);
        m55248k4(EditingLanguage.BASHKIR, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(35, 1251, 500, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.BELARUSIAN, 1251, 500, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(2, 1251, 20420, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.BULGARIAN, 1251, 20420, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.BANGLA_BANGLADESH, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.BANGLA_INDIA, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.TIBETAN_CHINA, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.BRETON, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.BOSNIAN_CYRILLIC, 1251, 870, 10082, 855, ';', false);
        m55248k4(EditingLanguage.BOSNIAN_LATIN, 1250, 870, 10082, 852, ';', false);
        m55248k4(3, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.CATALAN, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.CORSICAN, 1252, 20297, 10000, 850, ';', false);
        m55248k4(5, 1250, 500, 10029, 852, ';', false);
        m55248k4(EditingLanguage.CZECH, 1250, 500, 10029, 852, ';', false);
        m55248k4(EditingLanguage.WELSH, 1252, 20285, 10000, 850, ',', false);
        m55248k4(6, 1252, 20277, 10000, 850, ';', false);
        m55248k4(EditingLanguage.DANISH, 1252, 20277, 10000, 850, ';', false);
        m55248k4(7, 1252, 20273, 10000, 850, ';', false);
        m55248k4(EditingLanguage.GERMAN_AUSTRIA, 1252, 20273, 10000, 850, ';', false);
        m55248k4(EditingLanguage.GERMAN_SWITZERLAND, 1252, 20273, 10000, 850, ';', false);
        m55248k4(EditingLanguage.GERMAN_GERMANY, 1252, 20273, 10000, 850, ';', false);
        m55248k4(EditingLanguage.GERMAN_LIECHTENSTEIN, 1252, 20273, 10000, 850, ';', false);
        m55248k4(EditingLanguage.GERMAN_LUXEMBOURG, 1252, 20273, 10000, 850, ';', false);
        m55248k4(2094, 1252, 870, 10000, 850, ';', false);
        m55248k4(101, 0, 500, 2, 1, (char) 1548, true);
        m55248k4(EditingLanguage.DIVEHI, 0, 500, 2, 1, (char) 1548, true);
        m55248k4(8, 1253, 20273, 10006, 737, ';', false);
        m55248k4(EditingLanguage.GREEK, 1253, 20273, 10006, 737, ';', false);
        m55248k4(9, 1252, 37, 10000, 437, ',', false);
        m55248k4(EditingLanguage.ENGLISH_CARIBBEAN, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ENGLISH_AUSTRALIA, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ENGLISH_BELIZE, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.ENGLISH_CANADA, 1252, 37, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ENGLISH_UK, 1252, 20285, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ENGLISH_IRELAND, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ENGLISH_INDIA, 1252, 37, 10000, 437, ',', false);
        m55248k4(EditingLanguage.ENGLISH_JAMAICA, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ENGLISH_MALAYSIA, 1252, 37, 10000, 437, ',', false);
        m55248k4(EditingLanguage.ENGLISH_NEW_ZEALAND, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ENGLISH_PHILIPPINES, 1252, 500, 10000, 437, ',', false);
        m55248k4(EditingLanguage.ENGLISH_SINGAPORE, 1252, 37, 10000, 437, ',', false);
        m55248k4(EditingLanguage.ENGLISH_TRINIDAD_AND_TOBAGO, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.ENGLISH_US, 1252, 37, 10000, 437, ',', false);
        m55248k4(EditingLanguage.ENGLISH_SOUTH_AFRICA, 1252, 500, 10000, 437, ',', false);
        m55248k4(EditingLanguage.ENGLISH_ZIMBABWE, 1252, 500, 10000, 437, ',', false);
        m55248k4(10, 1252, 20284, 10000, 850, ';', false);
        m55248k4(EditingLanguage.SPANISH_ARGENTINA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_BOLIVIA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_CHILE, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_COLOMBIA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_COSTA_RICA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_DOMINICAN_REPUBLIC, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_ECUADOR, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_SPAIN_MODERN_SORT, 1252, 20284, 10000, 850, ';', false);
        m55248k4(EditingLanguage.SPANISH_GUATEMALA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_HONDURAS, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_MEXICO, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_NICARAGUA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_PANAMA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_PERU, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_PUERTO_RICO, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_PARAGUAY, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_EL_SALVADOR, 1252, 20284, 10000, 850, ',', false);
        m55248k4(21514, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_URUGUAY, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SPANISH_VENEZUELA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(37, 1257, 500, 10029, 775, ';', false);
        m55248k4(EditingLanguage.ESTONIAN, 1257, 500, 10029, 775, ';', false);
        m55248k4(45, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.BASQUE, 1252, 500, 10000, 850, ';', false);
        m55248k4(41, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.PERSIAN, 1256, 20420, 10004, 720, ';', true);
        m55248k4(11, 1252, 20278, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FINNISH, 1252, 20278, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FILIPINO, 1252, 500, 10000, 437, ',', false);
        m55248k4(56, 1252, 20277, 10079, 850, ';', false);
        m55248k4(EditingLanguage.FAEROESE, 1252, 20277, 10079, 850, ';', false);
        m55248k4(12, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FRENCH_BELGIUM, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FRENCH_CANADA, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FRENCH_SWITZERLAND, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FRENCH_FRANCE, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FRENCH_LUXEMBOURG, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FRENCH_MONACO, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.FRISIAN, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.IRISH, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.SCOTTISH_GAELIC, 1252, 20285, 10000, 850, ',', false);
        m55248k4(86, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.GALICIAN, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ALSATIAN, 1252, 20297, 10000, 850, ';', false);
        m55248k4(71, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.GUJARATI, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.HAUSA, 1252, 37, 10000, 437, ',', false);
        m55248k4(13, 1255, 500, 10005, 862, ',', true);
        m55248k4(EditingLanguage.HEBREW, 1255, 500, 10005, 862, ',', true);
        m55248k4(57, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.HINDI, 0, 500, 2, 1, ',', false);
        m55248k4(26, 1250, 500, 10082, 852, ';', false);
        m55248k4(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA, 1250, 870, 10082, 852, ';', false);
        m55248k4(1050, 1250, 500, 10082, 852, ';', false);
        m55248k4(EditingLanguage.SORBIAN, 1252, 870, 10000, 850, ';', false);
        m55248k4(14, 1250, 500, 10029, 852, ';', false);
        m55248k4(EditingLanguage.HUNGARIAN, 1250, 500, 10029, 852, ';', false);
        m55248k4(43, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.ARMENIAN, 0, 500, 2, 1, ',', false);
        m55248k4(33, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.INDONESIAN, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.IGBO, 1252, 37, 10000, 437, ',', false);
        m55248k4(EditingLanguage.f50775YI, 0, 500, 2, 1, ',', false);
        m55248k4(15, 1252, 20871, 10079, 850, ';', false);
        m55248k4(EditingLanguage.ICELANDIC, 1252, 20871, 10079, 850, ';', false);
        m55248k4(16, 1252, 20280, 10000, 850, ';', false);
        m55248k4(EditingLanguage.ITALIAN_SWITZERLAND, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.ITALIAN_ITALY, 1252, 20280, 10000, 850, ';', false);
        m55248k4(1117, 0, 500, 2, 1, ',', false);
        m55248k4(2141, 1252, 37, 10000, 437, ',', false);
        m55248k4(17, 932, 20290, UserConstants.ERROR_CODE_AVATAR_RESOLUTION_LIMIT, 932, ',', false);
        m55248k4(EditingLanguage.JAPANESE, 932, 20290, UserConstants.ERROR_CODE_AVATAR_RESOLUTION_LIMIT, 932, ',', false);
        m55248k4(55, 0, 500, 2, 1, ';', false);
        m55248k4(EditingLanguage.GEORGIAN, 0, 500, 2, 1, ';', false);
        m55248k4(63, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.KAZAKH, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.GREENLANDIC, 1252, 20277, 10000, 850, ';', false);
        m55248k4(EditingLanguage.KHMER, 0, 500, 2, 1, ',', false);
        m55248k4(75, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.KANNADA, 0, 500, 2, 1, ',', false);
        m55248k4(18, 949, 20833, UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK, 949, ',', false);
        m55248k4(87, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.KONKANI, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.KOREAN, 949, 20833, UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK, 949, ',', false);
        m55248k4(64, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.KYRGYZ, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.LUXEMBOUGISH, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.LAO, 0, 500, 2, 1, ',', false);
        m55248k4(39, 1257, 500, 10029, 775, ';', false);
        m55248k4(EditingLanguage.LITHUANIAN, 1257, 500, 10029, 775, ';', false);
        m55248k4(38, 1257, 500, 10029, 775, ';', false);
        m55248k4(EditingLanguage.LATVIAN, 1257, 500, 10029, 775, ';', false);
        m55248k4(EditingLanguage.MAORI, 0, 500, 2, 1, ',', false);
        m55248k4(47, 1251, 500, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.MACEDONIAN, 1251, 500, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.MALAYALAM, 0, 500, 2, 1, ',', false);
        m55248k4(80, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.MONGOLIAN_CYRILLIC, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.MONGOLIAN_MONGOLIAN, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.MOHAWK, 1252, 37, 10000, 850, ',', false);
        m55248k4(78, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.MARATHI, 0, 500, 2, 1, ',', false);
        m55248k4(62, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.MALAY_MALAYSIA, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.MALTESE, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.NORWEGIAN_BOKMAL, 1252, 20277, 10000, 850, ';', false);
        m55248k4(EditingLanguage.NEPALI, 0, 500, 2, 1, ',', false);
        m55248k4(19, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.DUTCH_BELGIUM, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.DUTCH_NETHERLANDS, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.NORWEGIAN_NYNORSK, 1252, 20277, 10000, 850, ';', false);
        m55248k4(20, 1252, 20277, 10000, 850, ';', false);
        m55248k4(1132, 1252, 500, 10000, 850, ',', false);
        m55248k4(1154, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.ORIYA, 0, 500, 2, 1, ',', false);
        m55248k4(70, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.PUNJABI_INDIA, 0, 500, 2, 1, ',', false);
        m55248k4(21, 1250, 20880, 10029, 852, ';', false);
        m55248k4(EditingLanguage.POLISH, 1250, 20880, 10029, 852, ';', false);
        m55248k4(1164, 1256, 20420, 10004, 720, ';', false);
        m55248k4(EditingLanguage.PASHTO, 0, 500, 2, 1, ';', false);
        m55248k4(22, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.PORTUGUESE_BRAZIL, 1252, 500, 10000, 850, ';', false);
        m55248k4(EditingLanguage.PORTUGUESE_PORTUGAL, 1252, 500, 10000, 850, ';', false);
        m55248k4(1158, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.QUECHUA_BOLIVIA, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.QUECHUA_ECUADOR, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.QUECHUA_PERU, 1252, 20284, 10000, 850, ',', false);
        m55248k4(EditingLanguage.ROMANSH, 1252, 20273, 10000, 850, ';', false);
        m55248k4(24, 1250, 20880, 10029, 852, ';', false);
        m55248k4(EditingLanguage.ROMANIAN, 1250, 20880, 10029, 852, ';', false);
        m55248k4(25, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(1049, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.KINYARWANDA, 1252, 37, 10000, 437, ';', false);
        m55248k4(79, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.SAKHA, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.SANSKRIT, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.NORTHERN_SAMI_FINLAND, 1252, 20278, 10000, 850, ';', false);
        m55248k4(EditingLanguage.NORTHERN_SAMI_NORWAY, 1252, 20277, 10000, 850, ';', false);
        m55248k4(EditingLanguage.NORTHERN_SAMI_SWEDEN, 1252, 20278, 10000, 850, ';', false);
        m55248k4(EditingLanguage.SINHALESE, 0, 500, 2, 1, ',', false);
        m55248k4(27, 1250, 20880, 10029, 852, ';', false);
        m55248k4(1051, 1250, 20880, 10029, 852, ';', false);
        m55248k4(36, 1250, 20880, 10029, 852, ';', false);
        m55248k4(EditingLanguage.SLOVENIAN, 1250, 20880, 10029, 852, ';', false);
        m55248k4(6203, 1252, 20277, 10000, 850, ';', false);
        m55248k4(7227, 1252, 20278, 10000, 850, ';', false);
        m55248k4(EditingLanguage.LULE_SAMI_NORWAY, 1252, 20277, 10000, 850, ';', false);
        m55248k4(EditingLanguage.LULE_SAMI_SWEDEN, 1252, 20278, 10000, 850, ';', false);
        m55248k4(EditingLanguage.INARI_SAMI_FINLAND, 1252, 20278, 10000, 850, ';', false);
        m55248k4(8251, 1252, 20278, 10000, 850, ';', false);
        m55248k4(28, 1250, 20880, 10029, 852, ';', false);
        m55248k4(1052, 1250, 20880, 10029, 852, ';', false);
        m55248k4(31770, 1251, 21025, BuildConfig.VERSION_CODE, 855, ';', false);
        m55248k4(EditingLanguage.SERBIAN_CYRILLIC_BOSNIA_AND_HERZEGOVINA, 1251, 21025, BuildConfig.VERSION_CODE, 855, ';', false);
        m55248k4(EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO, 1251, 21025, BuildConfig.VERSION_CODE, 855, ';', false);
        m55248k4(12314, 1251, 21025, BuildConfig.VERSION_CODE, 855, ';', false);
        m55248k4(10266, 1251, 21025, BuildConfig.VERSION_CODE, 855, ';', false);
        m55248k4(EditingLanguage.SERBIAN_LATIN_BOSNIA_AND_HERZEGOVINA, 1250, 870, 10082, 852, ';', false);
        m55248k4(EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO, 1250, 500, 10029, 852, ';', false);
        m55248k4(11290, 1250, 500, 10029, 852, ';', false);
        m55248k4(9242, 1250, 500, 10029, 852, ';', false);
        m55248k4(29, 1252, 20278, 10000, 850, ';', false);
        m55248k4(EditingLanguage.SWEDISH_FINLAND, 1252, 20278, 10000, 850, ';', false);
        m55248k4(1053, 1252, 20278, 10000, 850, ';', false);
        m55248k4(65, 1252, 500, 10000, 437, ',', false);
        m55248k4(EditingLanguage.KISWAHILI, 1252, 500, 10000, 437, ',', false);
        m55248k4(90, 0, 500, 2, 1, ',', true);
        m55248k4(EditingLanguage.SYRIAC, 0, 500, 2, 1, ',', true);
        m55248k4(73, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.TAMIL, 0, 500, 2, 1, ',', false);
        m55248k4(74, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.TELUGU, 0, 500, 2, 1, ',', false);
        m55248k4(EditingLanguage.TAJIK, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(30, 874, 20838, 10021, 874, ',', false);
        m55248k4(EditingLanguage.THAI, 874, 20838, 10021, 874, ',', false);
        m55248k4(EditingLanguage.TURKMEN, 1250, 20880, 10029, 852, ';', false);
        m55248k4(EditingLanguage.TSWANA, 1252, 500, 10000, 850, ',', false);
        m55248k4(31, 1254, 20905, 10081, 857, ';', false);
        m55248k4(1055, 1254, 20905, 10081, 857, ';', false);
        m55248k4(68, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.TATAR, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.TAMAZIGHT_LATIN, 1252, 20297, 10000, 850, ';', false);
        m55248k4(1152, 1256, 20420, 10004, 720, ',', false);
        m55248k4(34, 1251, 500, 10017, 866, ';', false);
        m55248k4(EditingLanguage.UKRAINIAN, 1251, 500, 10017, 866, ';', false);
        m55248k4(32, 1256, 20420, 10004, 720, ';', true);
        m55248k4(EditingLanguage.URDU, 1256, 20420, 10004, 720, ';', true);
        m55248k4(67, 1254, 500, 10029, 857, ';', false);
        m55248k4(EditingLanguage.UZBEK_CYRILLIC, 1251, 20880, BuildConfig.VERSION_CODE, 866, ';', false);
        m55248k4(EditingLanguage.UZBEK_LATIN, 1254, 500, 10029, 857, ';', false);
        m55248k4(42, 1258, 500, 10000, 1258, ',', false);
        m55248k4(EditingLanguage.VIETNAMESE, 1258, 500, 10000, 1258, ',', false);
        m55248k4(1160, 1252, 20297, 10000, 850, ';', false);
        m55248k4(EditingLanguage.ISI_XHOSA, 1252, 500, 10000, 850, ',', false);
        m55248k4(EditingLanguage.YORUBA, 1252, 37, 10000, 437, ',', false);
        m55248k4(4, 936, 500, 10008, 936, ',', false);
        m55248k4(31748, 950, 500, UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL, 950, ',', false);
        m55248k4(2052, 936, 500, 10008, 936, ',', false);
        m55248k4(EditingLanguage.CHINESE_HONG_KONG, 950, 500, UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL, 950, ',', false);
        m55248k4(EditingLanguage.CHINESE_MACAO, 950, 500, UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL, 950, ',', false);
        m55248k4(EditingLanguage.CHINESE_SINGAPORE, 936, 500, 10008, 936, ',', false);
        m55248k4(EditingLanguage.CHINESE_TAIWAN, 950, 500, UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL, 950, ',', false);
        m55248k4(EditingLanguage.ISI_ZULU, 1252, 500, 10000, 850, ',', false);
        C11697x1 c11697x1 = new C11697x1(127, false);
        c11697x1.f39651jd = true;
        f39645x6 = c11697x1;
    }

    private C11697x1() {
        this.f39652k4 = null;
        this.f39651jd = false;
        this.f39647ck = true;
        this.f39649fa = null;
        this.f39656up = null;
        this.f39658yj = -1;
        this.f39655rv = true;
    }

    /* JADX INFO: renamed from: kk */
    private static int m55249kk(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (str.length() == 0) {
            return 127;
        }
        Integer num = f39642ne.get(str);
        if (num == null) {
            for (String str2 : f39642ne.keySet()) {
                if (str2.equalsIgnoreCase(str)) {
                    num = f39642ne.get(str2);
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        throw new ArgumentException(C14113y2.m67402k4("Culture Name: {0} is not a supported culture", str));
    }

    /* JADX INFO: renamed from: to */
    public static C11697x1 m55252to() {
        return C5449c5.m22523k4().m22531h4();
    }

    /* JADX INFO: renamed from: x1 */
    private static C11683c5 m55254x1(C11697x1 c11697x1) {
        return new C11683c5(c11697x1.m55262dy(), false);
    }

    /* JADX INFO: renamed from: c5 */
    public String m55259c5() {
        return this.f39648dy;
    }

    /* JADX INFO: renamed from: ck */
    public C11696up m55260ck() {
        if (this.f39652k4 == null) {
            int iM55262dy = m55262dy();
            C11696up.k4 k4Var = f39644u4.get(Integer.valueOf(iM55262dy));
            if (k4Var == null) {
                throw new NullPointerException("textInfoData is null for " + m55259c5());
            }
            this.f39652k4 = new C11696up(this, iM55262dy, k4Var);
        }
        return this.f39652k4;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11697x1 c11697x1 = (C11697x1) m55272yj();
        if (m55264h4() && this.f39647ck) {
            return c11697x1;
        }
        c11697x1.m55267k4((C11683c5) m55263fa().deepClone());
        c11697x1.m55268k4((C11691kk) m55261du().deepClone());
        return c11697x1;
    }

    /* JADX INFO: renamed from: du */
    public C11691kk m55261du() {
        C11691kk c11691kk = this.f39656up;
        if (c11691kk != null) {
            return c11691kk;
        }
        int iM55262dy = m55262dy();
        C11691kk c11691kk2 = new C11691kk();
        if (!m55264h4() && m55251kk(m55262dy())) {
            C12851kk c12851kkM59914x1 = C12853to.m59914x1(iM55262dy);
            c11691kk2.m55158du(c12851kkM59914x1.f43299to.f43286x1);
            c11691kk2.m55196to(c12851kkM59914x1.f43299to.f43272k4);
            c11691kk2.m55203up(c12851kkM59914x1.f43299to.f43273kk);
            c11691kk2.m55217yj(c12851kkM59914x1.f43299to.f43279to);
            c11691kk2.m55181k4(c12851kkM59914x1.f43299to.f43266du);
            c11691kk2.m55151c5(c12851kkM59914x1.f43299to.f43269h4);
            c11691kk2.m55185kk(c12851kkM59914x1.f43299to.f43275m9);
            c11691kk2.m55160du(c12851kkM59914x1.f43299to.f43267dy);
            c11691kk2.m55175jd(c12851kkM59914x1.f43299to.f43264c5);
            c11691kk2.m55191m9(c12851kkM59914x1.f43299to.f43271jd);
            c11691kk2.m55155ck(c12851kkM59914x1.f43299to.f43265ck);
            c11691kk2.m55179k4(c12851kkM59914x1.f43299to.f43268fa);
            c11691kk2.m55209x1(c12851kkM59914x1.f43299to.f43282up);
            c11691kk2.m55184kk(c12851kkM59914x1.f43299to.f43288yj);
            c11691kk2.m55197to(c12851kkM59914x1.f43299to.f43274ks);
            c11691kk2.m55154ck(c12851kkM59914x1.f43299to.f43278rv);
            c11691kk2.m55159du(c12851kkM59914x1.f43299to.f43287x6);
            c11691kk2.m55163dy(c12851kkM59914x1.f43299to.f43276ne);
            c11691kk2.m55170h4(c12851kkM59914x1.f43299to.f43270ix);
            c11691kk2.m55190m9(c12851kkM59914x1.f43299to.f43280u4);
            c11691kk2.m55166fa(c12851kkM59914x1.f43299to.f43283uz);
            c11691kk2.m55216yj(c12851kkM59914x1.f43299to.f43277qq);
            c11691kk2.m55202up(c12851kkM59914x1.f43299to.f43285wl);
            c11691kk2.m55150c5(c12851kkM59914x1.f43299to.f43262ar);
            c11691kk2.m55174jd(c12851kkM59914x1.f43299to.f43281um);
            c11691kk2.m55167fa(c12851kkM59914x1.f43299to.f43263bv);
            c11691kk2.m55180k4(c12851kkM59914x1.f43299to.f43284v4);
        }
        c11691kk2.m55162dy(iM55262dy);
        this.f39656up = c11691kk2;
        return c11691kk2;
    }

    /* JADX INFO: renamed from: dy */
    public int m55262dy() {
        return this.f39658yj.intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11697x1 c11697x1 = (C11697x1) obj;
        boolean z = c11697x1.m55262dy() == m55262dy() && c11697x1.f39647ck == this.f39647ck && C14113y2.m67363du(c11697x1.f39648dy, this.f39648dy);
        return (!z || (m55264h4() && this.f39647ck)) ? z : m55263fa().equals(c11697x1.m55263fa()) && m55261du().equals(c11697x1.m55261du());
    }

    /* JADX INFO: renamed from: fa */
    public C11683c5 m55263fa() {
        if (m55264h4() && this.f39647ck) {
            throw new NotSupportedException(C14113y2.m67408k4("Culture \"", m55259c5(), "\" is ", "a neutral culture. It can not be used in formatting ", "and parsing and therefore cannot be set as the thread's ", "current culture."));
        }
        if (this.f39653ks == null) {
            this.f39653ks = m55254x1(this);
        }
        return this.f39653ks;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m55264h4() {
        return m55253to(m55262dy());
    }

    public int hashCode() {
        AbstractC11694rv abstractC11694rv = this.f39650h4;
        int iHashCode = (abstractC11694rv != null ? abstractC11694rv.hashCode() : 0) * 31;
        AbstractC11694rv[] abstractC11694rvArr = this.f39654m9;
        int iHashCode2 = (iHashCode + (abstractC11694rvArr != null ? Arrays.hashCode(abstractC11694rvArr) : 0)) * 31;
        C11696up c11696up = this.f39652k4;
        int iHashCode3 = (iHashCode2 + (c11696up != null ? c11696up.hashCode() : 0)) * 31;
        C11690k4 c11690k4 = this.f39657x1;
        int iHashCode4 = (iHashCode3 + (c11690k4 != null ? c11690k4.hashCode() : 0)) * 31;
        String str = this.f39648dy;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f39646c5;
        int iHashCode6 = (((((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.f39651jd ? 1 : 0)) * 31) + (this.f39647ck ? 1 : 0)) * 31;
        Locale locale = this.f39649fa;
        int iHashCode7 = (iHashCode6 + (locale != null ? locale.hashCode() : 0)) * 31;
        C11691kk c11691kk = this.f39656up;
        int iHashCode8 = (iHashCode7 + (c11691kk != null ? c11691kk.hashCode() : 0)) * 31;
        Integer num = this.f39658yj;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        C11683c5 c11683c5 = this.f39653ks;
        return ((iHashCode9 + (c11683c5 != null ? c11683c5.hashCode() : 0)) * 31) + (this.f39655rv ? 1 : 0);
    }

    /* JADX INFO: renamed from: jd */
    public AbstractC11694rv[] m55265jd() {
        if (this.f39654m9 == null) {
            this.f39654m9 = C12853to.m59913to(m55262dy());
        }
        return this.f39654m9;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC11694rv m55266k4() {
        if (this.f39650h4 == null) {
            this.f39650h4 = C12853to.m59909kk(m55262dy());
        }
        return this.f39650h4;
    }

    /* JADX INFO: renamed from: ks */
    public boolean m55269ks() {
        Boolean bool = this.f39646c5;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m55270m9() {
        return this.f39651jd;
    }

    public String toString() {
        return m55259c5();
    }

    /* JADX INFO: renamed from: up */
    public C11690k4 m55271up() {
        if (this.f39657x1 == null) {
            this.f39657x1 = new C11690k4(this);
        }
        return this.f39657x1;
    }

    /* JADX INFO: renamed from: yj */
    public Object m55272yj() {
        C11697x1 c11697x1 = new C11697x1();
        c11697x1.f39658yj = this.f39658yj;
        c11697x1.f39655rv = this.f39655rv;
        c11697x1.f39650h4 = this.f39650h4;
        c11697x1.f39654m9 = (AbstractC11694rv[]) m55265jd().clone();
        c11697x1.f39652k4 = (C11696up) m55260ck().clone();
        c11697x1.f39648dy = m55259c5();
        c11697x1.f39646c5 = Boolean.valueOf(m55269ks());
        c11697x1.f39647ck = this.f39647ck;
        return c11697x1;
    }

    public C11697x1(int i) {
        this(i, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11697x1 m55244k4(String str) {
        return new C11697x1(str);
    }

    /* JADX INFO: renamed from: kk */
    public static C11697x1 m55250kk() {
        return f39645x6;
    }

    /* JADX INFO: renamed from: to */
    private boolean m55253to(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 47, 54, 55, 56, 57, 62, 63, 64, 65, 67, 68, 70, 71, 73, 74, 75, 78, 79, 80, 86, 87, 90, 101, 31748, 31770};
        for (int i2 = 0; i2 < 68; i2++) {
            if (i == iArr[i2]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static C11697x1 m55255x1() {
        return C5449c5.m22523k4().m22537m9();
    }

    public C11697x1(int i, boolean z) {
        this.f39652k4 = null;
        this.f39651jd = false;
        this.f39647ck = true;
        this.f39649fa = null;
        this.f39656up = null;
        this.f39658yj = -1;
        this.f39655rv = true;
        this.f39648dy = m55257x1(i);
        this.f39658yj = Integer.valueOf(i);
        this.f39646c5 = Boolean.valueOf(z);
        if (!m55251kk(this.f39658yj.intValue())) {
            throw new ArgumentException(C14113y2.m67402k4("Culture ID: {0} is not a supported culture", this.f39658yj));
        }
        m55247k4(this.f39658yj.intValue());
    }

    /* JADX INFO: renamed from: k4 */
    public static C11697x1 m55245k4(Locale locale) {
        if (locale == null) {
            return null;
        }
        return new C11697x1(false, m55258x1(locale));
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m55251kk(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 47, 54, 55, 56, 57, 62, 63, 64, 65, 67, 68, 70, 71, 73, 74, 75, 78, 79, 80, 86, 87, 90, 101, 127, 1025, EditingLanguage.BULGARIAN, EditingLanguage.CATALAN, EditingLanguage.CHINESE_TAIWAN, EditingLanguage.CZECH, EditingLanguage.DANISH, EditingLanguage.GERMAN_GERMANY, EditingLanguage.GREEK, EditingLanguage.ENGLISH_US, EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT, EditingLanguage.FINNISH, EditingLanguage.FRENCH_FRANCE, EditingLanguage.HEBREW, EditingLanguage.HUNGARIAN, EditingLanguage.ICELANDIC, EditingLanguage.ITALIAN_ITALY, EditingLanguage.JAPANESE, EditingLanguage.KOREAN, EditingLanguage.DUTCH_NETHERLANDS, EditingLanguage.NORWEGIAN_BOKMAL, EditingLanguage.POLISH, EditingLanguage.PORTUGUESE_BRAZIL, EditingLanguage.ROMANSH, EditingLanguage.ROMANIAN, 1049, 1050, 1051, 1052, 1053, EditingLanguage.THAI, 1055, EditingLanguage.URDU, EditingLanguage.INDONESIAN, EditingLanguage.UKRAINIAN, EditingLanguage.BELARUSIAN, EditingLanguage.SLOVENIAN, EditingLanguage.ESTONIAN, EditingLanguage.LATVIAN, EditingLanguage.LITHUANIAN, EditingLanguage.TAJIK, EditingLanguage.PERSIAN, EditingLanguage.VIETNAMESE, EditingLanguage.ARMENIAN, EditingLanguage.AZERBAIJANI_LATIN, EditingLanguage.BASQUE, EditingLanguage.SORBIAN, EditingLanguage.MACEDONIAN, EditingLanguage.TSWANA, EditingLanguage.ISI_XHOSA, EditingLanguage.ISI_ZULU, EditingLanguage.AFRIKAANS, EditingLanguage.GEORGIAN, EditingLanguage.FAEROESE, EditingLanguage.HINDI, EditingLanguage.MALTESE, EditingLanguage.NORTHERN_SAMI_NORWAY, EditingLanguage.MALAY_MALAYSIA, EditingLanguage.KAZAKH, EditingLanguage.KYRGYZ, EditingLanguage.KISWAHILI, EditingLanguage.TURKMEN, EditingLanguage.UZBEK_LATIN, EditingLanguage.TATAR, EditingLanguage.BANGLA_INDIA, EditingLanguage.PUNJABI_INDIA, EditingLanguage.GUJARATI, EditingLanguage.ORIYA, EditingLanguage.TAMIL, EditingLanguage.TELUGU, EditingLanguage.KANNADA, EditingLanguage.MALAYALAM, EditingLanguage.ASSAMESE, EditingLanguage.MARATHI, EditingLanguage.SANSKRIT, EditingLanguage.MONGOLIAN_CYRILLIC, EditingLanguage.TIBETAN_CHINA, EditingLanguage.WELSH, EditingLanguage.KHMER, EditingLanguage.LAO, EditingLanguage.GALICIAN, EditingLanguage.KONKANI, EditingLanguage.SYRIAC, EditingLanguage.SINHALESE, 1117, EditingLanguage.AMHARIC, EditingLanguage.NEPALI, EditingLanguage.FRISIAN, EditingLanguage.PASHTO, EditingLanguage.FILIPINO, EditingLanguage.DIVEHI, EditingLanguage.HAUSA, EditingLanguage.YORUBA, EditingLanguage.QUECHUA_BOLIVIA, 1132, EditingLanguage.BASHKIR, EditingLanguage.LUXEMBOUGISH, EditingLanguage.GREENLANDIC, EditingLanguage.IGBO, EditingLanguage.f50775YI, EditingLanguage.MAPUDUNGUN_CHILE, EditingLanguage.MOHAWK, EditingLanguage.BRETON, 1152, EditingLanguage.MAORI, 1154, EditingLanguage.CORSICAN, EditingLanguage.ALSATIAN, EditingLanguage.SAKHA, 1158, EditingLanguage.KINYARWANDA, 1160, 1164, EditingLanguage.SCOTTISH_GAELIC, EditingLanguage.ARABIC_IRAQ, 2052, EditingLanguage.GERMAN_SWITZERLAND, EditingLanguage.ENGLISH_UK, EditingLanguage.SPANISH_MEXICO, EditingLanguage.FRENCH_BELGIUM, EditingLanguage.ITALIAN_SWITZERLAND, EditingLanguage.DUTCH_BELGIUM, EditingLanguage.NORWEGIAN_NYNORSK, EditingLanguage.PORTUGUESE_PORTUGAL, EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO, EditingLanguage.SWEDISH_FINLAND, EditingLanguage.AZERBAIJANI_CYRILLIC, 2094, EditingLanguage.NORTHERN_SAMI_SWEDEN, EditingLanguage.IRISH, EditingLanguage.MALAY_BRUNEI_DARUSSALAM, EditingLanguage.UZBEK_CYRILLIC, EditingLanguage.BANGLA_BANGLADESH, EditingLanguage.MONGOLIAN_MONGOLIAN, 2141, EditingLanguage.TAMAZIGHT_LATIN, EditingLanguage.QUECHUA_ECUADOR, EditingLanguage.ARABIC_EGYPT, EditingLanguage.CHINESE_HONG_KONG, EditingLanguage.GERMAN_AUSTRIA, EditingLanguage.ENGLISH_AUSTRALIA, EditingLanguage.SPANISH_SPAIN_MODERN_SORT, EditingLanguage.FRENCH_CANADA, EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO, EditingLanguage.NORTHERN_SAMI_FINLAND, EditingLanguage.QUECHUA_PERU, EditingLanguage.ARABIC_LIBYA, EditingLanguage.CHINESE_SINGAPORE, EditingLanguage.GERMAN_LUXEMBOURG, EditingLanguage.ENGLISH_CANADA, EditingLanguage.SPANISH_GUATEMALA, EditingLanguage.FRENCH_SWITZERLAND, EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA, EditingLanguage.LULE_SAMI_NORWAY, EditingLanguage.ARABIC_ALGERIA, EditingLanguage.CHINESE_MACAO, EditingLanguage.GERMAN_LIECHTENSTEIN, EditingLanguage.ENGLISH_NEW_ZEALAND, EditingLanguage.SPANISH_COSTA_RICA, EditingLanguage.FRENCH_LUXEMBOURG, EditingLanguage.BOSNIAN_LATIN, EditingLanguage.LULE_SAMI_SWEDEN, EditingLanguage.ARABIC_MOROCCO, EditingLanguage.ENGLISH_IRELAND, EditingLanguage.SPANISH_PANAMA, EditingLanguage.FRENCH_MONACO, EditingLanguage.SERBIAN_LATIN_BOSNIA_AND_HERZEGOVINA, 6203, EditingLanguage.ARABIC_TUNISIA, EditingLanguage.ENGLISH_SOUTH_AFRICA, EditingLanguage.SPANISH_DOMINICAN_REPUBLIC, EditingLanguage.SERBIAN_CYRILLIC_BOSNIA_AND_HERZEGOVINA, 7227, EditingLanguage.ARABIC_OMAN, EditingLanguage.ENGLISH_JAMAICA, EditingLanguage.SPANISH_VENEZUELA, EditingLanguage.BOSNIAN_CYRILLIC, 8251, EditingLanguage.ARABIC_YEMEN, EditingLanguage.ENGLISH_CARIBBEAN, EditingLanguage.SPANISH_COLOMBIA, 9242, EditingLanguage.INARI_SAMI_FINLAND, EditingLanguage.ARABIC_SYRIA, EditingLanguage.ENGLISH_BELIZE, EditingLanguage.SPANISH_PERU, 10266, EditingLanguage.ARABIC_JORDAN, EditingLanguage.ENGLISH_TRINIDAD_AND_TOBAGO, EditingLanguage.SPANISH_ARGENTINA, 11290, EditingLanguage.ARABIC_LEBANON, EditingLanguage.ENGLISH_ZIMBABWE, EditingLanguage.SPANISH_ECUADOR, 12314, EditingLanguage.ARABIC_KUWAIT, EditingLanguage.ENGLISH_PHILIPPINES, EditingLanguage.SPANISH_CHILE, EditingLanguage.ARABIC_UAE, EditingLanguage.SPANISH_URUGUAY, EditingLanguage.ARABIC_BAHRAIN, EditingLanguage.SPANISH_PARAGUAY, EditingLanguage.ARABIC_QATAR, EditingLanguage.ENGLISH_INDIA, EditingLanguage.SPANISH_BOLIVIA, EditingLanguage.ENGLISH_MALAYSIA, EditingLanguage.SPANISH_EL_SALVADOR, EditingLanguage.ENGLISH_SINGAPORE, EditingLanguage.SPANISH_HONDURAS, EditingLanguage.SPANISH_NICARAGUA, EditingLanguage.SPANISH_PUERTO_RICO, 21514, 31748, 31770};
        for (int i2 = 0; i2 < 280; i2++) {
            if (i == iArr[i2]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static C11697x1 m55256x1(String str) {
        C11697x1 c11697x1;
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        synchronized (f39639du) {
            try {
                c11697x1 = (C11697x1) f39641kk.get(str.toLowerCase());
                if (c11697x1 == null) {
                    c11697x1 = new C11697x1(str, false);
                }
                f39643to.put(Integer.valueOf(c11697x1.m55262dy()), c11697x1);
                f39641kk.put(str.toLowerCase(), c11697x1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11697x1;
    }

    public C11697x1(String str) {
        this(str, true);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m55257x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Positive number required");
        }
        if (f39640ix.contains(Integer.valueOf(i))) {
            for (Map.Entry<String, Integer> entry : f39642ne.entrySet()) {
                if (entry.getValue().intValue() == i) {
                    return entry.getKey();
                }
            }
        }
        throw new ArgumentException(C14113y2.m67402k4("Culture ID: {0} is not a supported culture", Integer.valueOf(i)));
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14073kp
    /* JADX INFO: renamed from: k4 */
    public Object mo55052k4(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5.m66751kk(C7019kk.m27443k4((Class<?>) C11683c5.class))) {
            return m55263fa();
        }
        if (abstractC14068j5.m66751kk(C7019kk.m27443k4((Class<?>) C11691kk.class))) {
            return m55261du();
        }
        return null;
    }

    public C11697x1(String str, boolean z) {
        this.f39652k4 = null;
        this.f39651jd = false;
        this.f39647ck = true;
        this.f39649fa = null;
        this.f39656up = null;
        this.f39658yj = -1;
        this.f39655rv = true;
        this.f39648dy = str;
        this.f39646c5 = Boolean.valueOf(z);
        Integer numValueOf = Integer.valueOf(m55249kk(str));
        this.f39658yj = numValueOf;
        if (!m55251kk(numValueOf.intValue())) {
            throw new ArgumentException(C14113y2.m67402k4("Culture ID: {0} is not a supported culture", this.f39658yj));
        }
        m55247k4(this.f39658yj.intValue());
    }

    /* JADX INFO: renamed from: k4 */
    public static Locale m55246k4(C11697x1 c11697x1) {
        String str;
        if (c11697x1 == null) {
            return null;
        }
        if (c11697x1.f39649fa == null) {
            int iIndexOf = c11697x1.f39648dy.indexOf(45);
            String strSubstring = "";
            String strSubstring2 = c11697x1.f39648dy;
            if (iIndexOf >= 0) {
                strSubstring2 = strSubstring2.substring(0, iIndexOf);
                String strSubstring3 = c11697x1.f39648dy.substring(iIndexOf + 1);
                int iIndexOf2 = strSubstring3.indexOf(45);
                if (iIndexOf2 >= 0) {
                    strSubstring = strSubstring3.substring(0, iIndexOf2);
                    strSubstring3 = strSubstring3.substring(iIndexOf2 + 1);
                }
                String str2 = strSubstring;
                strSubstring = strSubstring3;
                str = str2;
            } else {
                str = "";
            }
            c11697x1.f39649fa = new Locale(strSubstring2, strSubstring, str);
        }
        return c11697x1.f39649fa;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m55258x1(Locale locale) {
        String lowerCase = locale.toString().toLowerCase();
        return lowerCase.equals("ar_sd") ? TranslateLanguage.ARABIC : lowerCase.equals("el_cy") ? TranslateLanguage.GREEK : lowerCase.equals("en_mt") ? TranslateLanguage.ENGLISH : lowerCase.equals(TranslateLanguage.IRISH) ? "ga-IE" : lowerCase.equals("iw") ? TranslateLanguage.HEBREW : lowerCase.equals("iw_il") ? "he-IL" : lowerCase.equals(BackupFile.EXTENSION_NOTEIN_FILE) ? "id" : lowerCase.equals("in_id") ? "id-ID" : (lowerCase.equals("ja_jp_jp") || lowerCase.equals("ja_jp_jp_#u-ca-japanese")) ? "ja-JP" : lowerCase.equals(TranslateLanguage.MALTESE) ? "mt-MT" : (lowerCase.equals("no_no") || lowerCase.equals("no_no_ny")) ? TranslateLanguage.NORWEGIAN : (lowerCase.equals("sh") || lowerCase.equals("sh_yu") || lowerCase.equals("sr__#latn") || lowerCase.equals("sr_yu")) ? "sr" : lowerCase.equals("sr_ba_#latn") ? "sr-Latn-BA" : lowerCase.equals("sr_me_#latn") ? "sr-Latn-ME" : lowerCase.equals("sr_rs_#latn") ? "sr-Latn-RS" : (lowerCase.equals("th_th_th") || lowerCase.equals("th_th_th_#u-nu-thai")) ? "th-TH" : lowerCase.equals(TranslateLanguage.CHINESE) ? "zh-CN" : locale.toString().replace('_', '-');
    }

    public C11697x1(boolean z, String str) {
        this.f39652k4 = null;
        this.f39651jd = false;
        this.f39647ck = true;
        this.f39649fa = null;
        this.f39656up = null;
        this.f39658yj = -1;
        this.f39655rv = true;
        this.f39647ck = z;
        this.f39648dy = str;
        this.f39646c5 = Boolean.TRUE;
        Integer numValueOf = Integer.valueOf(m55249kk(str));
        this.f39658yj = numValueOf;
        if (m55251kk(numValueOf.intValue())) {
            m55247k4(this.f39658yj.intValue());
            return;
        }
        throw new ArgumentException("Culture ID: " + this.f39658yj + " is not a supported culture");
    }

    /* JADX INFO: renamed from: k4 */
    private void m55247k4(int i) {
        this.f39650h4 = C12853to.m59909kk(i);
        boolean zM55253to = m55253to(i);
        this.f39655rv = zM55253to;
        if (zM55253to && !this.f39647ck) {
            i = C12853to.m59904k4(i);
        }
        if (this.f39655rv && this.f39647ck) {
            return;
        }
        this.f39653ks = new C11683c5(i, false);
        this.f39656up = new C11691kk(false);
        C12851kk c12851kkM59914x1 = C12853to.m59914x1(i);
        this.f39656up.m55158du(c12851kkM59914x1.f43299to.f43286x1);
        this.f39656up.m55196to(c12851kkM59914x1.f43299to.f43272k4);
        this.f39656up.m55203up(c12851kkM59914x1.f43299to.f43273kk);
        this.f39656up.m55217yj(c12851kkM59914x1.f43299to.f43279to);
        this.f39656up.m55181k4(c12851kkM59914x1.f43299to.f43266du);
        this.f39656up.m55151c5(c12851kkM59914x1.f43299to.f43269h4);
        this.f39656up.m55185kk(c12851kkM59914x1.f43299to.f43275m9);
        this.f39656up.m55160du(c12851kkM59914x1.f43299to.f43267dy);
        this.f39656up.m55175jd(c12851kkM59914x1.f43299to.f43264c5);
        this.f39656up.m55191m9(c12851kkM59914x1.f43299to.f43271jd);
        this.f39656up.m55155ck(c12851kkM59914x1.f43299to.f43265ck);
        this.f39656up.m55179k4(c12851kkM59914x1.f43299to.f43268fa);
        this.f39656up.m55209x1(c12851kkM59914x1.f43299to.f43282up);
        this.f39656up.m55184kk(c12851kkM59914x1.f43299to.f43288yj);
        this.f39656up.m55197to(c12851kkM59914x1.f43299to.f43274ks);
        this.f39656up.m55154ck(c12851kkM59914x1.f43299to.f43278rv);
        this.f39656up.m55159du(c12851kkM59914x1.f43299to.f43287x6);
        this.f39656up.m55163dy(c12851kkM59914x1.f43299to.f43276ne);
        this.f39656up.m55170h4(c12851kkM59914x1.f43299to.f43270ix);
        this.f39656up.m55190m9(c12851kkM59914x1.f43299to.f43280u4);
        this.f39656up.m55166fa(c12851kkM59914x1.f43299to.f43283uz);
        this.f39656up.m55216yj(c12851kkM59914x1.f43299to.f43277qq);
        this.f39656up.m55202up(c12851kkM59914x1.f43299to.f43285wl);
        this.f39656up.m55150c5(c12851kkM59914x1.f43299to.f43262ar);
        this.f39656up.m55174jd(c12851kkM59914x1.f43299to.f43281um);
        this.f39656up.m55167fa(c12851kkM59914x1.f43299to.f43263bv);
        this.f39656up.m55180k4(c12851kkM59914x1.f43299to.f43284v4);
        this.f39656up.m55162dy(this.f39658yj.intValue());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m55248k4(int i, int i2, int i3, int i4, int i5, char c, boolean z) {
        f39644u4.put(Integer.valueOf(i), new C11696up.k4(i2, i3, i4, i5, c));
    }

    /* JADX INFO: renamed from: k4 */
    public void m55267k4(C11683c5 c11683c5) {
        this.f39653ks = c11683c5;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55268k4(C11691kk c11691kk) {
        this.f39656up = c11691kk;
    }
}
