package com.aspose.slides.internal.p294n9;

import androidx.core.text.util.LocalePreferences;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.TableStyleOptions;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.UserConstants;
import com.vivo.penengine.impl.BuildConfig;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C6788yd extends C6767lr {

    /* JADX INFO: renamed from: k4 */
    protected static final Dictionary<String, Integer> f18796k4 = new Dictionary<>(AbstractC14070jw.m66789to());

    /* JADX INFO: renamed from: x1 */
    protected static final Dictionary<Integer, String> f18800x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    protected static final Dictionary<Integer, String> f18797kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    protected static final ReentrantReadWriteLock f18799to = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: du */
    private static final String f18791du = C14113y2.m67408k4("437", "arabic", "asmo-708", "big5", "big5-hkscs", "ccsid00858", "ccsid00924", "ccsid01140", "ccsid01141", "ccsid01142", "ccsid01143", "ccsid01144", "ccsid01145", "ccsid01146", "ccsid01147", "ccsid01148", "ccsid01149", LocalePreferences.CalendarType.CHINESE, "cn-big5", "cn-gb", "cp00858", "cp00924", "cp01140", "cp01141", "cp01142", "cp01143", "cp01144", "cp01145", "cp01146", "cp01147", "cp01148", "cp01149", "cp037", "cp1025", "cp1026", "cp1252", "cp1256", "cp273", "cp278", "cp280", "cp284", "cp285", "cp290", "cp297", "cp420", "cp423", "cp424", "cp437", "cp500", "cp50227", "cp850", "cp852", "cp855", "cp857", "cp858", "cp860", "cp861", "cp862", "cp863", "cp864", "cp865", "cp866", "cp869", "cp870", "cp871", "cp875", "cp880", "cp905", "csbig5", "cseuckr", "cseucpkdfmtjapanese", "csgb2312", "csgb231280", "csibm037", "csibm1026", "csibm273", "csibm277", "csibm278", "csibm280", "csibm284", "csibm285", "csibm290", "csibm297", "csibm420", "csibm423", "csibm424", "csibm500", "csibm870", "csibm871", "csibm880", "csibm905", "csibmthai", "csiso2022jp", "csiso2022kr", "csiso58gb231280", "csisolatin2", "csisolatin3", "csisolatin4", "csisolatin5", "csisolatin9", "csisolatinarabic", "csisolatincyrillic", "csisolatingreek", "csisolatinhebrew", "cskoi8r", "csksc56011987", "cspc8codepage437", "csshiftjis", "cswindows31j", "cyrillic", "din_66003", "dos-720", "dos-862", "dos-874", "ebcdic-cp-ar1", "ebcdic-cp-be", "ebcdic-cp-ca", "ebcdic-cp-ch", "ebcdic-cp-dk", "ebcdic-cp-es", "ebcdic-cp-fi", "ebcdic-cp-fr", "ebcdic-cp-gb", "ebcdic-cp-gr", "ebcdic-cp-he", "ebcdic-cp-is", "ebcdic-cp-it", "ebcdic-cp-nl", "ebcdic-cp-no", "ebcdic-cp-roece", "ebcdic-cp-se", "ebcdic-cp-tr", "ebcdic-cp-us", "ebcdic-cp-wt", "ebcdic-cp-yu", "ebcdic-cyrillic", "ebcdic-de-273+euro", "ebcdic-dk-277+euro", "ebcdic-es-284+euro", "ebcdic-fi-278+euro", "ebcdic-fr-297+euro", "ebcdic-gb-285+euro", "ebcdic-international-500+euro", "ebcdic-is-871+euro", "ebcdic-it-280+euro", "ebcdic-jp-kana", "ebcdic-latin9--euro", "ebcdic-no-277+euro", "ebcdic-se-278+euro", "ebcdic-us-37+euro", "ecma-114", "ecma-118", "elot_928", "euc-cn", "euc-jp", "euc-kr", "extended_unix_code_packed_format_for_japanese", "gb18030", "gb2312", "gb2312-80", "gb231280", "gb_2312-80", "gbk", "german", "greek", "greek8", LocalePreferences.CalendarType.HEBREW, "hz-gb-2312", "ibm-thai", "ibm00858", "ibm00924", "ibm01047", "ibm01140", "ibm01141", "ibm01142", "ibm01143", "ibm01144", "ibm01145", "ibm01146", "ibm01147", "ibm01148", "ibm01149", "ibm037", "ibm1026", "ibm273", "ibm277", "ibm278", "ibm280", "ibm284", "ibm285", "ibm290", "ibm297", "ibm420", "ibm423", "ibm424", "ibm437", "ibm500", "ibm737", "ibm775", "ibm850", "ibm852", "ibm855", "ibm857", "ibm860", "ibm861", "ibm862", "ibm863", "ibm864", "ibm865", "ibm866", "ibm869", "ibm870", "ibm871", "ibm880", "ibm905", "irv", "iso-2022-jp", "iso-2022-jpeuc", "iso-2022-kr", "iso-2022-kr-7", "iso-2022-kr-7bit", "iso-2022-kr-8", "iso-2022-kr-8bit", "iso-8859-11", "iso-8859-13", "iso-8859-15", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", "iso-8859-8 visual", "iso-8859-8-i", "iso-8859-9", "iso-ir-101", "iso-ir-109", "iso-ir-110", "iso-ir-126", "iso-ir-127", "iso-ir-138", "iso-ir-144", "iso-ir-148", "iso-ir-149", "iso-ir-58", "iso8859-2", "iso_8859-15", "iso_8859-2", "iso_8859-2:1987", "iso_8859-3", "iso_8859-3:1988", "iso_8859-4", "iso_8859-4:1988", "iso_8859-5", "iso_8859-5:1988", "iso_8859-6", "iso_8859-6:1987", "iso_8859-7", "iso_8859-7:1987", "iso_8859-8", "iso_8859-8:1988", "iso_8859-9", "iso_8859-9:1989", "johab", "koi", "koi8", "koi8-r", "koi8-ru", "koi8-u", "koi8r", "korean", "ks-c-5601", "ks-c5601", "ks_c_5601", "ks_c_5601-1987", "ks_c_5601-1989", "ks_c_5601_1987", "ksc5601", "ksc_5601", "l2", "l3", "l4", "l5", "l9", "latin2", "latin3", "latin4", "latin5", "latin9", "logical", "macintosh", "ms_kanji", "norwegian", "ns_4551-1", "pc-multilingual-850+euro", "sen_850200_b", "shift-jis", "shift_jis", "sjis", "swedish", "tis-620", "visual", "windows-1250", "windows-1251", "windows-1252", "windows-1253", "windows-1254", "windows-1255", "windows-1256", "windows-1257", "windows-1258", "windows-874", "x-ansi", "x-chinese-cns", "x-chinese-eten", "x-cp1250", "x-cp1251", "x-cp20001", "x-cp20003", "x-cp20004", "x-cp20005", "x-cp20261", "x-cp20269", "x-cp20936", "x-cp20949", "x-cp50227", "x-ebcdic-koreanextended", "x-euc", "x-euc-cn", "x-euc-jp", "x-europa", "x-ia5", "x-ia5-german", "x-ia5-norwegian", "x-ia5-swedish", "x-iscii-as", "x-iscii-be", "x-iscii-de", "x-iscii-gu", "x-iscii-ka", "x-iscii-ma", "x-iscii-or", "x-iscii-pa", "x-iscii-ta", "x-iscii-te", "x-mac-arabic", "x-mac-ce", "x-mac-chinesesimp", "x-mac-chinesetrad", "x-mac-croatian", "x-mac-cyrillic", "x-mac-greek", "x-mac-hebrew", "x-mac-icelandic", "x-mac-japanese", "x-mac-korean", "x-mac-romanian", "x-mac-thai", "x-mac-turkish", "x-mac-ukrainian", "x-ms-cp932", "x-sjis", "x-x-big5", "");

    /* JADX INFO: renamed from: h4 */
    private static final int[] f18794h4 = {0, 3, 9, 17, 21, 31, 41, 51, 61, 71, 81, 91, 101, 111, 121, 131, 141, 151, 158, 165, 170, 177, 184, 191, 198, 205, 212, 219, 226, 233, 240, StyleIdentifier.LIGHT_LIST_ACCENT_6, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, StyleIdentifier.COLORFUL_GRID_ACCENT_6, StyleIdentifier.BIBLIOGRAPHY, StyleIdentifier.PLAIN_TABLE_5, StyleIdentifier.GRID_TABLE_5_DARK, StyleIdentifier.GRID_TABLE_4_ACCENT_1, StyleIdentifier.GRID_TABLE_2_ACCENT_2, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3, 303, 308, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, StyleIdentifier.GRID_TABLE_4_ACCENT_6, StyleIdentifier.LIST_TABLE_2, StyleIdentifier.LIST_TABLE_7_COLORFUL, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_2, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4, StyleIdentifier.LIST_TABLE_4_ACCENT_5, StyleIdentifier.LIST_TABLE_2_ACCENT_6, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, StyleIdentifier.UNRESOLVED_MENTION, 380, 385, 390, 395, 400, 405, 410, 415, 420, 425, 430, 435, 440, 446, 453, 472, 480, 490, 498, 507, 515, 523, 531, 539, 547, 555, 563, 571, 579, 587, 595, 603, 611, 619, 627, 635, 644, 655, 666, 681, 692, 703, 714, 725, 736, 752, 770, 785, 801, 808, 821, 837, 847, 859, 867, 876, 883, 890, 897, 910, 922, 934, 946, 958, 970, 982, 994, 1006, PointerIconCompat.TYPE_ZOOM_IN, EditingLanguage.DANISH, EditingLanguage.KOREAN, EditingLanguage.THAI, EditingLanguage.VIETNAMESE, EditingLanguage.AFRIKAANS, EditingLanguage.BANGLA_INDIA, EditingLanguage.TIBETAN_CHINA, 1117, 1129, EditingLanguage.HAWAIIAN, EditingLanguage.MAORI, 1168, 1186, 1204, 1222, 1240, 1258, 1276, 1305, 1323, 1341, 1355, 1374, 1392, 1410, 1427, 1435, 1443, 1451, 1457, 1463, 1469, 1514, 1521, 1527, TableStyleOptions.DEFAULT_2003, 1544, 1554, 1557, 1563, 1568, 1574, 1580, 1590, 1598, 1606, 1614, 1622, 1630, 1638, 1646, 1654, 1662, 1670, 1678, 1686, 1694, 1702, 1708, 1715, 1721, 1727, 1733, 1739, 1745, 1751, 1757, 1763, 1769, 1775, 1781, 1787, 1793, 1799, 1805, 1811, 1817, 1823, 1829, 1835, 1841, 1847, 1853, 1859, 1865, 1871, 1877, 1883, 1889, 1895, 1901, 1904, 1915, 1929, 1940, 1953, 1969, 1982, 1998, CommonConstant.RETCODE.SIGN_IN_AUTH_SERVER_FAILED, CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS, 2041, 2051, 2061, 2071, 2081, 2091, 2101, EditingLanguage.PUNJABI_PAKISTAN, 2130, 2140, 2150, 2160, 2170, 2180, 2190, 2200, 2210, 2220, 2230, 2239, 2248, 2259, 2269, 2284, 2294, 2309, 2319, 2334, 2344, 2359, 2369, 2384, 2394, 2409, 2419, 2434, 2444, 2459, 2464, 2467, 2471, 2477, 2484, 2490, 2495, 2501, 2510, 2518, 2527, 2541, 2555, 2569, 2576, 2584, 2586, 2588, 2590, 2592, 2594, 2600, 2606, 2612, 2618, 2624, 2631, 2640, 2648, 2657, 2666, 2690, 2702, 2711, 2720, 2724, 2731, 2738, 2744, 2756, 2768, 2780, 2792, 2804, 2816, 2828, 2840, 2852, 2863, 2869, 2882, 2896, 2904, 2912, 2921, 2930, 2939, 2948, 2957, 2966, 2975, 2984, 2993, 3016, 3021, 3029, 3037, 3045, 3050, 3062, 3077, 3090, 3100, 3110, 3120, 3130, 3140, 3150, 3160, 3170, 3180, 3190, 3202, 3210, 3227, 3244, 3258, 3272, 3283, 3295, 3310, 3324, 3336, 3350, 3360, 3373, 3388, 3398, 3404, 3412};

    /* JADX INFO: renamed from: m9 */
    private static final int[] f18798m9 = {437, 28596, 708, 950, 950, 858, 20924, EditingLanguage.GUARANI, EditingLanguage.HAWAIIAN, EditingLanguage.LATIN, EditingLanguage.SOMALI, EditingLanguage.f50775YI, EditingLanguage.PAPIAMENTU, EditingLanguage.MAPUDUNGUN_CHILE, 1147, EditingLanguage.MOHAWK, 1149, 936, 950, 936, 858, 20924, EditingLanguage.GUARANI, EditingLanguage.HAWAIIAN, EditingLanguage.LATIN, EditingLanguage.SOMALI, EditingLanguage.f50775YI, EditingLanguage.PAPIAMENTU, EditingLanguage.MAPUDUNGUN_CHILE, 1147, EditingLanguage.MOHAWK, 1149, 37, 21025, EditingLanguage.BULGARIAN, 1252, 1256, 20273, 20278, 20280, 20284, 20285, 20290, 20297, 20420, 20423, 20424, 437, 500, 50227, 850, 852, 855, 857, 858, 860, 861, 862, 863, 864, 865, 866, 869, 870, 20871, 875, 20880, 20905, 950, 51949, 51932, 936, 936, 37, EditingLanguage.BULGARIAN, 20273, 20277, 20278, 20280, 20284, 20285, 20290, 20297, 20420, 20423, 20424, 500, 870, 20871, 20880, 20905, 20838, 50221, 50225, 936, 28592, 28593, 28594, 28599, 28605, 28596, 28595, 28597, 28598, 20866, 949, 437, 932, 932, 28595, 20106, 720, 862, 874, 20420, 500, 37, 500, 20277, 20284, 20278, 20297, 20285, 20423, 20424, 20871, 20280, 37, 20277, 870, 20278, 20905, 37, 37, 870, 20880, EditingLanguage.HAWAIIAN, EditingLanguage.LATIN, EditingLanguage.PAPIAMENTU, EditingLanguage.SOMALI, 1147, EditingLanguage.MAPUDUNGUN_CHILE, EditingLanguage.MOHAWK, 1149, EditingLanguage.f50775YI, 20290, 20924, EditingLanguage.LATIN, EditingLanguage.SOMALI, EditingLanguage.GUARANI, 28596, 28597, 28597, 51936, 51932, 51949, 51932, 54936, 936, 936, 936, 936, 936, 20106, 28597, 28597, 28598, 52936, 20838, 858, 20924, EditingLanguage.ROMANSH, EditingLanguage.GUARANI, EditingLanguage.HAWAIIAN, EditingLanguage.LATIN, EditingLanguage.SOMALI, EditingLanguage.f50775YI, EditingLanguage.PAPIAMENTU, EditingLanguage.MAPUDUNGUN_CHILE, 1147, EditingLanguage.MOHAWK, 1149, 37, EditingLanguage.BULGARIAN, 20273, 20277, 20278, 20280, 20284, 20285, 20290, 20297, 20420, 20423, 20424, 437, 500, 737, 775, 850, 852, 855, 857, 860, 861, 862, 863, 864, 865, 866, 869, 870, 20871, 20880, 20905, 20105, 50220, 51932, 50225, 50225, 50225, 51949, 51949, 874, 28603, 28605, 28592, 28593, 28594, 28595, 28596, 28597, 28598, 28598, 38598, 28599, 28592, 28593, 28594, 28597, 28596, 28598, 28595, 28599, 949, 936, 28592, 28605, 28592, 28592, 28593, 28593, 28594, 28594, 28595, 28595, 28596, 28596, 28597, 28597, 28598, 28598, 28599, 28599, 1361, 20866, 20866, 20866, 21866, 21866, 20866, 949, 949, 949, 949, 949, 949, 949, 949, 949, 28592, 28593, 28594, 28599, 28605, 28592, 28593, 28594, 28599, 28605, 28598, 10000, 932, 20108, 20108, 858, 20107, 932, 932, 932, 20107, 874, 28598, 1250, 1251, 1252, 1253, 1254, 1255, 1256, 1257, 1258, 874, 1252, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 20002, 1250, 1251, 20001, 20003, 20004, 20005, 20261, 20269, 20936, 20949, 50227, 20833, 51932, 51936, 51932, 29001, 20105, 20106, 20108, 20107, 57006, 57003, 57002, 57010, 57008, 57009, 57007, 57011, 57004, 57005, 10004, 10029, 10008, UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL, 10082, BuildConfig.VERSION_CODE, 10006, 10005, 10079, UserConstants.ERROR_CODE_AVATAR_RESOLUTION_LIMIT, UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK, 10010, 10021, 10081, 10017, 932, 932, 950};

    /* JADX INFO: renamed from: dy */
    private static final int[] f18792dy = {37, 437, 500, 708, 720, 737, 775, 850, 852, 855, 857, 858, 860, 861, 862, 863, 864, 865, 866, 869, 870, 874, 875, 932, 936, 949, 950, EditingLanguage.BULGARIAN, EditingLanguage.ROMANSH, EditingLanguage.GUARANI, EditingLanguage.HAWAIIAN, EditingLanguage.LATIN, EditingLanguage.SOMALI, EditingLanguage.f50775YI, EditingLanguage.PAPIAMENTU, EditingLanguage.MAPUDUNGUN_CHILE, 1147, EditingLanguage.MOHAWK, 1149, 1250, 1251, 1252, 1253, 1254, 1255, 1256, 1257, 1258, 1361, 10000, UserConstants.ERROR_CODE_AVATAR_RESOLUTION_LIMIT, UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL, UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK, 10004, 10005, 10006, BuildConfig.VERSION_CODE, 10008, 10010, 10017, 10021, 10029, 10079, 10081, 10082, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 20001, 20002, 20003, 20004, 20005, 20105, 20106, 20107, 20108, 20261, 20269, 20273, 20277, 20278, 20280, 20284, 20285, 20290, 20297, 20420, 20423, 20424, 20833, 20838, 20866, 20871, 20880, 20905, 20924, 20932, 20936, 20949, 21025, 21866, 28592, 28593, 28594, 28595, 28596, 28597, 28598, 28599, 28603, 28605, 29001, 38598, 50220, 50221, 50222, 50225, 50227, 51932, 51936, 51949, 52936, 54936, 57002, 57003, 57004, 57005, 57006, 57007, 57008, 57009, 57010, 57011};

    /* JADX INFO: renamed from: c5 */
    private static final String f18789c5 = C14113y2.m67408k4("ibm037", "ibm437", "ibm500", "asmo-708", "dos-720", "ibm737", "ibm775", "ibm850", "ibm852", "ibm855", "ibm857", "ibm00858", "ibm860", "ibm861", "dos-862", "ibm863", "ibm864", "ibm865", "cp866", "ibm869", "ibm870", "windows-874", "cp875", "shift_jis", "gb2312", "ks_c_5601-1987", "big5", "ibm1026", "ibm01047", "ibm01140", "ibm01141", "ibm01142", "ibm01143", "ibm01144", "ibm01145", "ibm01146", "ibm01147", "ibm01148", "ibm01149", "windows-1250", "windows-1251", "windows-1252", "windows-1253", "windows-1254", "windows-1255", "windows-1256", "windows-1257", "windows-1258", "johab", "macintosh", "x-mac-japanese", "x-mac-chinesetrad", "x-mac-korean", "x-mac-arabic", "x-mac-hebrew", "x-mac-greek", "x-mac-cyrillic", "x-mac-chinesesimp", "x-mac-romanian", "x-mac-ukrainian", "x-mac-thai", "x-mac-ce", "x-mac-icelandic", "x-mac-turkish", "x-mac-croatian", "x-chinese-cns", "x-cp20001", "x-chinese-eten", "x-cp20003", "x-cp20004", "x-cp20005", "x-ia5", "x-ia5-german", "x-ia5-swedish", "x-ia5-norwegian", "x-cp20261", "x-cp20269", "ibm273", "ibm277", "ibm278", "ibm280", "ibm284", "ibm285", "ibm290", "ibm297", "ibm420", "ibm423", "ibm424", "x-ebcdic-koreanextended", "ibm-thai", "koi8-r", "ibm871", "ibm880", "ibm905", "ibm00924", "euc-jp", "x-cp20936", "x-cp20949", "cp1025", "koi8-u", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", "iso-8859-9", "iso-8859-13", "iso-8859-15", "x-europa", "iso-8859-8-i", "iso-2022-jp", "csiso2022jp", "iso-2022-jp", "iso-2022-kr", "x-cp50227", "euc-jp", "euc-cn", "euc-kr", "hz-gb-2312", "gb18030", "x-iscii-de", "x-iscii-be", "x-iscii-ta", "x-iscii-te", "x-iscii-as", "x-iscii-or", "x-iscii-ka", "x-iscii-ma", "x-iscii-gu", "x-iscii-pa", "");

    /* JADX INFO: renamed from: jd */
    private static final int[] f18795jd = {0, 6, 12, 18, 26, 33, 39, 45, 51, 57, 63, 69, 77, 83, 89, 96, 102, 108, 114, 119, 125, 131, 142, 147, 156, 162, 176, 180, 187, 195, 203, 211, 219, 227, 235, 243, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.COLORFUL_GRID_ACCENT_6, StyleIdentifier.PLAIN_TABLE_1, StyleIdentifier.GRID_TABLE_3, StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3, StyleIdentifier.GRID_TABLE_4_ACCENT_5, StyleIdentifier.LIST_TABLE_2, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3, StyleIdentifier.LIST_TABLE_3_ACCENT_5, StyleIdentifier.SMART_LINK, 383, 388, 397, 411, 428, 440, 452, 464, 475, 489, 506, 520, 535, 545, 553, 568, 581, 595, 608, 617, 631, 640, 649, 658, 663, 675, 688, 703, 712, 721, 727, 733, 739, 745, 751, 757, 763, 769, 775, 781, 787, 810, 818, 824, 830, 836, 842, 850, 856, 865, 874, 880, 886, 896, 906, 916, 926, 936, 946, 956, 966, 977, 988, 996, 1008, PointerIconCompat.TYPE_ZOOM_OUT, EditingLanguage.DANISH, EditingLanguage.JAPANESE, 1052, EditingLanguage.ESTONIAN, EditingLanguage.ARMENIAN, EditingLanguage.TSONGA, EditingLanguage.GEORGIAN, EditingLanguage.KISWAHILI, EditingLanguage.ORIYA, EditingLanguage.WELSH, EditingLanguage.CHEROKEE, EditingLanguage.EDO, EditingLanguage.IGBO, EditingLanguage.MAPUDUNGUN_CHILE, EditingLanguage.ALSATIAN, 1166, 1176, 1186, 1196};

    /* JADX INFO: renamed from: ck */
    private static final String f18790ck = C14113y2.m67408k4("IBM EBCDIC (US-Canada)", "OEM United States", "IBM EBCDIC (International)", "Arabic (ASMO 708)", "Arabic (DOS)", "Greek (DOS)", "Baltic (DOS)", "Western European (DOS)", "Central European (DOS)", "OEM Cyrillic", "Turkish (DOS)", "OEM Multilingual Latin I", "Portuguese (DOS)", "Icelandic (DOS)", "Hebrew (DOS)", "French Canadian (DOS)", "Arabic (864)", "Nordic (DOS)", "Cyrillic (DOS)", "Greek, Modern (DOS)", "IBM EBCDIC (Multilingual Latin-2)", "Thai (Windows)", "IBM EBCDIC (Greek Modern)", "Japanese (Shift-JIS)", "Chinese Simplified (GB2312)", "Korean", "Chinese Traditional (Big5)", "IBM EBCDIC (Turkish Latin-5)", "IBM Latin-1", "IBM EBCDIC (US-Canada-Euro)", "IBM EBCDIC (Germany-Euro)", "IBM EBCDIC (Denmark-Norway-Euro)", "IBM EBCDIC (Finland-Sweden-Euro)", "IBM EBCDIC (Italy-Euro)", "IBM EBCDIC (Spain-Euro)", "IBM EBCDIC (UK-Euro)", "IBM EBCDIC (France-Euro)", "IBM EBCDIC (International-Euro)", "IBM EBCDIC (Icelandic-Euro)", "Central European (Windows)", "Cyrillic (Windows)", "Western European (Windows)", "Greek (Windows)", "Turkish (Windows)", "Hebrew (Windows)", "Arabic (Windows)", "Baltic (Windows)", "Vietnamese (Windows)", "Korean (Johab)", "Western European (Mac)", "Japanese (Mac)", "Chinese Traditional (Mac)", "Korean (Mac)", "Arabic (Mac)", "Hebrew (Mac)", "Greek (Mac)", "Cyrillic (Mac)", "Chinese Simplified (Mac)", "Romanian (Mac)", "Ukrainian (Mac)", "Thai (Mac)", "Central European (Mac)", "Icelandic (Mac)", "Turkish (Mac)", "Croatian (Mac)", "Chinese Traditional (CNS)", "TCA Taiwan", "Chinese Traditional (Eten)", "IBM5550 Taiwan", "TeleText Taiwan", "Wang Taiwan", "Western European (IA5)", "German (IA5)", "Swedish (IA5)", "Norwegian (IA5)", "T.61", "ISO-6937", "IBM EBCDIC (Germany)", "IBM EBCDIC (Denmark-Norway)", "IBM EBCDIC (Finland-Sweden)", "IBM EBCDIC (Italy)", "IBM EBCDIC (Spain)", "IBM EBCDIC (UK)", "IBM EBCDIC (Japanese katakana)", "IBM EBCDIC (France)", "IBM EBCDIC (Arabic)", "IBM EBCDIC (Greek)", "IBM EBCDIC (Hebrew)", "IBM EBCDIC (Korean Extended)", "IBM EBCDIC (Thai)", "Cyrillic (KOI8-R)", "IBM EBCDIC (Icelandic)", "IBM EBCDIC (Cyrillic Russian)", "IBM EBCDIC (Turkish)", "IBM Latin-1", "Japanese (JIS 0208-1990 and 0212-1990)", "Chinese Simplified (GB2312-80)", "Korean Wansung", "IBM EBCDIC (Cyrillic Serbian-Bulgarian)", "Cyrillic (KOI8-U)", "Central European (ISO)", "Latin 3 (ISO)", "Baltic (ISO)", "Cyrillic (ISO)", "Arabic (ISO)", "Greek (ISO)", "Hebrew (ISO-Visual)", "Turkish (ISO)", "Estonian (ISO)", "Latin 9 (ISO)", "Europa", "Hebrew (ISO-Logical)", "Japanese (JIS)", "Japanese (JIS-Allow 1 byte Kana)", "Japanese (JIS-Allow 1 byte Kana - SO/SI)", "Korean (ISO)", "Chinese Simplified (ISO-2022)", "Japanese (EUC)", "Chinese Simplified (EUC)", "Korean (EUC)", "Chinese Simplified (HZ)", "Chinese Simplified (GB18030)", "ISCII Devanagari", "ISCII Bengali", "ISCII Tamil", "ISCII Telugu", "ISCII Assamese", "ISCII Oriya", "ISCII Kannada", "ISCII Malayalam", "ISCII Gujarati", "ISCII Punjabi", "");

    /* JADX INFO: renamed from: fa */
    private static final int[] f18793fa = {0, 22, 39, 65, 82, 94, 105, 117, 139, 161, 173, 186, 210, 226, 241, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, StyleIdentifier.GRID_TABLE_2, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5, StyleIdentifier.LIST_TABLE_3_ACCENT_1, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_6, StyleIdentifier.length, 403, 423, 450, 456, 482, 510, 521, 548, 573, 605, 637, 660, 683, 703, 727, 758, 785, 811, 829, 855, 870, 887, 903, 919, 935, 955, 969, 991, 1005, EditingLanguage.DANISH, EditingLanguage.KOREAN, EditingLanguage.THAI, EditingLanguage.VIETNAMESE, EditingLanguage.ISI_ZULU, EditingLanguage.UZBEK_LATIN, EditingLanguage.SINHALESE, 1129, EditingLanguage.f50775YI, 1154, 1176, 1191, 1204, 1218, 1243, 1253, 1279, 1293, 1308, 1319, 1341, 1353, 1366, 1381, 1385, 1393, 1413, 1440, 1467, 1485, 1503, 1518, 1548, 1567, 1586, 1604, 1623, 1651, 1668, 1685, 1707, 1736, 1756, 1767, 1805, 1835, 1849, 1888, 1905, 1927, 1940, 1952, 1966, 1978, 1989, CommonConstant.RETCODE.INVALID_AT_ERROR, 2021, 2035, 2048, 2054, EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO, 2088, 2120, 2160, 2172, 2201, 2215, 2239, 2251, 2274, 2302, 2318, 2331, 2342, 2354, 2368, 2379, 2392, 2407, 2421, 2434};

    /* JADX INFO: renamed from: k4 */
    public static int m26855k4(String str, String str2, int i, int i2) {
        int length = str.length();
        if (length > i2) {
            length = i2;
        }
        int i3 = 0;
        while (i3 < length && str.charAt(i3) == str2.charAt(i + i3)) {
            i3++;
        }
        return i3 < length ? str.charAt(i3) - str2.charAt(i + i3) : str.length() - i2;
    }

    /* JADX INFO: renamed from: kk */
    public static int m26857kk(String str) {
        int i;
        int length = f18794h4.length - 2;
        String strM67361du = C14113y2.m67361du(str);
        int i2 = 0;
        while (true) {
            int i3 = length - i2;
            if (i3 <= 3) {
                while (i2 <= length) {
                    String str2 = f18791du;
                    int[] iArr = f18794h4;
                    int i4 = iArr[i2];
                    int i5 = i2 + 1;
                    if (m26855k4(strM67361du, str2, i4, iArr[i5] - i4) == 0) {
                        i = f18798m9[i2];
                    } else {
                        i2 = i5;
                    }
                }
                return 0;
            }
            int i6 = (i3 / 2) + i2;
            String str3 = f18791du;
            int[] iArr2 = f18794h4;
            int i7 = iArr2[i6];
            int iM26855k4 = m26855k4(strM67361du, str3, i7, iArr2[i6 + 1] - i7);
            if (iM26855k4 == 0) {
                i = f18798m9[i6];
                break;
            }
            if (iM26855k4 < 0) {
                length = i6;
            } else {
                i2 = i6;
            }
        }
        return i & 65535;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m26859x1(String str) {
        int iIntValue = 0;
        if (str == null) {
            return 0;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f18799to;
        reentrantReadWriteLock.readLock().lock();
        try {
            Integer[] numArr = {0};
            Dictionary<String, Integer> dictionary = f18796k4;
            boolean zTryGetValue = dictionary.tryGetValue(str, numArr);
            int iIntValue2 = numArr[0].intValue();
            if (!zTryGetValue) {
                iIntValue2 = m26857kk(str);
                if (iIntValue2 != 0) {
                    reentrantReadWriteLock.readLock().unlock();
                    reentrantReadWriteLock.writeLock().lock();
                    try {
                        Integer[] numArr2 = {0};
                        boolean zTryGetValue2 = dictionary.tryGetValue(str, numArr2);
                        iIntValue = numArr2[0].intValue();
                        if (zTryGetValue2) {
                            reentrantReadWriteLock.readLock().lock();
                            reentrantReadWriteLock.writeLock().unlock();
                        } else {
                            dictionary.addItem(str, Integer.valueOf(iIntValue2));
                            reentrantReadWriteLock.readLock().lock();
                            reentrantReadWriteLock.writeLock().unlock();
                        }
                    } catch (Throwable th) {
                        ReentrantReadWriteLock reentrantReadWriteLock2 = f18799to;
                        reentrantReadWriteLock2.readLock().lock();
                        reentrantReadWriteLock2.writeLock().unlock();
                        throw th;
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                return iIntValue;
            }
            reentrantReadWriteLock.readLock().unlock();
            return iIntValue2;
        } catch (Throwable th2) {
            f18799to.readLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m26856k4(int i, String str, int[] iArr, Dictionary<Integer, String> dictionary) {
        int i2 = 0;
        while (true) {
            int[] iArr2 = f18792dy;
            if (i2 >= iArr2.length) {
                return null;
            }
            if ((iArr2[i2] & 65535) == i) {
                String[] strArr = {null};
                boolean zTryGetValue = dictionary.tryGetValue(Integer.valueOf(i), strArr);
                String str2 = strArr[0];
                if (zTryGetValue) {
                    return str2;
                }
                int i3 = iArr[i2];
                String strM67443x1 = C14113y2.m67443x1(str, i3, iArr[i2 + 1] - i3);
                String[] strArr2 = {null};
                boolean zTryGetValue2 = dictionary.tryGetValue(Integer.valueOf(i), strArr2);
                String str3 = strArr2[0];
                if (zTryGetValue2) {
                    return str3;
                }
                dictionary.addItem(Integer.valueOf(i), strM67443x1);
                return strM67443x1;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static String m26858kk(int i) {
        return m26856k4(i, f18790ck, f18793fa, f18797kk);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m26860x1(int i) {
        return m26856k4(i, f18789c5, f18795jd, f18800x1);
    }
}
