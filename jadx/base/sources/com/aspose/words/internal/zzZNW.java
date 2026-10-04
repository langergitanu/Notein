package com.aspose.words.internal;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.UserConstants;
import com.vivo.penengine.impl.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZNW extends zzZOC {
    private static final Map<Integer, String> zzZWb = new HashMap<Integer, String>() { // from class: com.aspose.words.internal.zzZNW.1
        {
            put(874, "x-windows-874");
            put(932, "windows-31j");
            put(936, "x-mswin-936");
            put(949, "x-windows-949");
            put(950, "x-windows-950");
            put(1361, "x-Johab");
            put(10000, "MacRoman");
            put(Integer.valueOf(UserConstants.ERROR_CODE_AVATAR_RESOLUTION_LIMIT), "windows-31j");
            put(Integer.valueOf(UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL), "Big5");
            put(10005, "x-MacHebrew");
            put(10006, "x-MacGreek");
            put(Integer.valueOf(BuildConfig.VERSION_CODE), "x-MacCyrillic");
            put(10008, "GB2312");
            put(10010, "x-MacRomania");
            put(10017, "x-MacUkraine");
            put(10021, "x-MacThai");
            put(10029, "x-MacCentralEurope");
            put(10079, "x-MacIceland");
            put(10081, "x-MacTurkish");
            put(38598, "ISO-8859-8");
            put(50220, "x-windows-50220");
            put(50221, "x-windows-50221");
            put(50222, "ISO-2022-JP");
            put(50225, "ISO-2022-KR");
        }
    };

    private static boolean zzY(zzZNZ zzznz) {
        int i = zzznz.zzZWk;
        return i == 936 || i == 10008 || i == 54936;
    }

    private static zzZOD zzZ(int i, String str, String str2, String str3, String str4, int i2) {
        zzZNZ zzznz = new zzZNZ(i, str, str2, str3, str4, i2, zzZWb.get(Integer.valueOf(i)));
        return zzY(zzznz) ? new zzZOB(zzznz) : !zzznz.zzhN() ? new zzZOA(zzznz, false) : new zzZOD(zzznz);
    }

    private static zzZOD[] zzhM() {
        return new zzZOD[]{zzZ(37, "IBM037", "IBM037", "IBM037", "IBM037", 1252), zzZ(437, "IBM437", "IBM437", "IBM437", "IBM437", 1252), zzZ(500, "IBM500", "IBM500", "IBM500", "IBM500", 1252), zzZ(708, "ASMO-708", "ASMO-708", "ASMO-708", "ASMO-708", 1256), zzZ(737, "ibm737", "ibm737", "ibm737", "ibm737", 1253), zzZ(775, "ibm775", "ibm775", "ibm775", "ibm775", 1257), zzZ(850, "ibm850", "ibm850", "ibm850", "ibm850", 1252), zzZ(852, "ibm852", "ibm852", "ibm852", "ibm852", 1250), zzZ(855, "IBM855", "IBM855", "IBM855", "IBM855", 1252), zzZ(857, "ibm857", "ibm857", "ibm857", "ibm857", 1254), zzZ(858, "IBM00858", "IBM00858", "IBM00858", "IBM00858", 1252), zzZ(860, "IBM860", "IBM860", "IBM860", "IBM860", 1252), zzZ(861, "ibm861", "ibm861", "ibm861", "ibm861", 1252), zzZ(863, "IBM863", "IBM863", "IBM863", "IBM863", 1252), zzZ(864, "IBM864", "IBM864", "IBM864", "IBM864", 1256), zzZ(865, "IBM865", "IBM865", "IBM865", "IBM865", 1252), zzZ(869, "ibm869", "ibm869", "ibm869", "ibm869", 1253), zzZ(870, "IBM870", "IBM870", "IBM870", "IBM870", 1250), zzZ(874, "windows-874", "windows-874", "windows-874", "windows-874", 874), zzZ(875, "cp875", "cp875", "cp875", "cp875", 1253), zzZ(932, "shift_jis", "iso-2022-jp", "iso-2022-jp", "shift_jis", 932), zzZ(936, "gb2312", "gb2312", "gb2312", "gb2312", 936), zzZ(949, "ks_c_5601-1987", "ks_c_5601-1987", "ks_c_5601-1987", "ks_c_5601-1987", 949), zzZ(950, "big5", "big5", "big5", "big5", 950), zzZ(EditingLanguage.BULGARIAN, "IBM1026", "IBM1026", "IBM1026", "IBM1026", 1254), zzZ(EditingLanguage.ROMANSH, "IBM01047", "IBM01047", "IBM01047", "IBM01047", 1252), zzZ(EditingLanguage.GUARANI, "IBM01140", "IBM01140", "IBM01140", "IBM01140", 1252), zzZ(EditingLanguage.HAWAIIAN, "IBM01141", "IBM01141", "IBM01141", "IBM01141", 1252), zzZ(EditingLanguage.LATIN, "IBM01142", "IBM01142", "IBM01142", "IBM01142", 1252), zzZ(EditingLanguage.SOMALI, "IBM01143", "IBM01143", "IBM01143", "IBM01143", 1252), zzZ(EditingLanguage.f50775YI, "IBM01144", "IBM01144", "IBM01144", "IBM01144", 1252), zzZ(EditingLanguage.PAPIAMENTU, "IBM01145", "IBM01145", "IBM01145", "IBM01145", 1252), zzZ(EditingLanguage.MAPUDUNGUN_CHILE, "IBM01146", "IBM01146", "IBM01146", "IBM01146", 1252), zzZ(1147, "IBM01147", "IBM01147", "IBM01147", "IBM01147", 1252), zzZ(EditingLanguage.MOHAWK, "IBM01148", "IBM01148", "IBM01148", "IBM01148", 1252), zzZ(1149, "IBM01149", "IBM01149", "IBM01149", "IBM01149", 1252), zzZ(1361, "Johab", "Johab", "Johab", "Johab", 949), zzZ(10000, "macintosh", "macintosh", "macintosh", "macintosh", 1252), zzZ(UserConstants.ERROR_CODE_AVATAR_RESOLUTION_LIMIT, "x-mac-japanese", "x-mac-japanese", "x-mac-japanese", "x-mac-japanese", 932), zzZ(UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL, "x-mac-chinesetrad", "x-mac-chinesetrad", "x-mac-chinesetrad", "x-mac-chinesetrad", 950), zzZ(UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK, "x-mac-korean", "x-mac-korean", "x-mac-korean", "x-mac-korean", 949), zzZ(10004, "x-mac-arabic", "x-mac-arabic", "x-mac-arabic", "x-mac-arabic", 1256), zzZ(10005, "x-mac-hebrew", "x-mac-hebrew", "x-mac-hebrew", "x-mac-hebrew", 1255), zzZ(10006, "x-mac-greek", "x-mac-greek", "x-mac-greek", "x-mac-greek", 1253), zzZ(BuildConfig.VERSION_CODE, "x-mac-cyrillic", "x-mac-cyrillic", "x-mac-cyrillic", "x-mac-cyrillic", 1251), zzZ(10008, "x-mac-chinesesimp", "x-mac-chinesesimp", "x-mac-chinesesimp", "x-mac-chinesesimp", 936), zzZ(10010, "x-mac-romanian", "x-mac-romanian", "x-mac-romanian", "x-mac-romanian", 1250), zzZ(10017, "x-mac-ukrainian", "x-mac-ukrainian", "x-mac-ukrainian", "x-mac-ukrainian", 1251), zzZ(10021, "x-mac-thai", "x-mac-thai", "x-mac-thai", "x-mac-thai", 874), zzZ(10029, "x-mac-ce", "x-mac-ce", "x-mac-ce", "x-mac-ce", 1250), zzZ(10079, "x-mac-icelandic", "x-mac-icelandic", "x-mac-icelandic", "x-mac-icelandic", 1252), zzZ(10081, "x-mac-turkish", "x-mac-turkish", "x-mac-turkish", "x-mac-turkish", 1254), zzZ(10082, "x-mac-croatian", "x-mac-croatian", "x-mac-croatian", "x-mac-croatian", 1250), zzZ(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, "x-Chinese-CNS", "x-Chinese-CNS", "x-Chinese-CNS", "x-Chinese-CNS", 950), zzZ(20001, "x-cp20001", "x-cp20001", "x-cp20001", "x-cp20001", 950), zzZ(20002, "x-Chinese-Eten", "x-Chinese-Eten", "x-Chinese-Eten", "x-Chinese-Eten", 950), zzZ(20003, "x-cp20003", "x-cp20003", "x-cp20003", "x-cp20003", 950), zzZ(20004, "x-cp20004", "x-cp20004", "x-cp20004", "x-cp20004", 950), zzZ(20005, "x-cp20005", "x-cp20005", "x-cp20005", "x-cp20005", 950), zzZ(20105, "x-IA5", "x-IA5", "x-IA5", "x-IA5", 1252), zzZ(20106, "x-IA5-German", "x-IA5-German", "x-IA5-German", "x-IA5-German", 1252), zzZ(20107, "x-IA5-Swedish", "x-IA5-Swedish", "x-IA5-Swedish", "x-IA5-Swedish", 1252), zzZ(20108, "x-IA5-Norwegian", "x-IA5-Norwegian", "x-IA5-Norwegian", "x-IA5-Norwegian", 1252), zzZ(20127, "us-ascii", "us-ascii", "us-ascii", "us-ascii", 1252), zzZ(20261, "x-cp20261", "x-cp20261", "x-cp20261", "x-cp20261", 1252), zzZ(20269, "x-cp20269", "x-cp20269", "x-cp20269", "x-cp20269", 1252), zzZ(20273, "IBM273", "IBM273", "IBM273", "IBM273", 1252), zzZ(20277, "IBM277", "IBM277", "IBM277", "IBM277", 1252), zzZ(20278, "IBM278", "IBM278", "IBM278", "IBM278", 1252), zzZ(20280, "IBM280", "IBM280", "IBM280", "IBM280", 1252), zzZ(20284, "IBM284", "IBM284", "IBM284", "IBM284", 1252), zzZ(20285, "IBM285", "IBM285", "IBM285", "IBM285", 1252), zzZ(20290, "IBM290", "IBM290", "IBM290", "IBM290", 932), zzZ(20297, "IBM297", "IBM297", "IBM297", "IBM297", 1252), zzZ(20420, "IBM420", "IBM420", "IBM420", "IBM420", 1256), zzZ(20423, "IBM423", "IBM423", "IBM423", "IBM423", 1253), zzZ(20424, "IBM424", "IBM424", "IBM424", "IBM424", 1255), zzZ(20833, "x-EBCDIC-KoreanExtended", "x-EBCDIC-KoreanExtended", "x-EBCDIC-KoreanExtended", "x-EBCDIC-KoreanExtended", 949), zzZ(20838, "IBM-Thai", "IBM-Thai", "IBM-Thai", "IBM-Thai", 874), zzZ(20866, "koi8-r", "koi8-r", "koi8-r", "koi8-r", 1251), zzZ(20871, "IBM871", "IBM871", "IBM871", "IBM871", 1252), zzZ(20880, "IBM880", "IBM880", "IBM880", "IBM880", 1251), zzZ(20905, "IBM905", "IBM905", "IBM905", "IBM905", 1254), zzZ(20924, "IBM00924", "IBM00924", "IBM00924", "IBM00924", 1252), zzZ(20932, "EUC-JP", "EUC-JP", "EUC-JP", "EUC-JP", 932), zzZ(20936, "x-cp20936", "x-cp20936", "x-cp20936", "x-cp20936", 936), zzZ(20949, "x-cp20949", "x-cp20949", "x-cp20949", "x-cp20949", 949), zzZ(21025, "cp1025", "cp1025", "cp1025", "cp1025", 1251), zzZ(21866, "koi8-u", "koi8-u", "koi8-u", "koi8-u", 1251), zzZ(28591, "iso-8859-1", "iso-8859-1", "iso-8859-1", "iso-8859-1", 1252), zzZ(28592, "iso-8859-2", "iso-8859-2", "iso-8859-2", "iso-8859-2", 1250), zzZ(28593, "iso-8859-3", "iso-8859-3", "iso-8859-3", "iso-8859-3", 1254), zzZ(28594, "iso-8859-4", "iso-8859-4", "iso-8859-4", "iso-8859-4", 1257), zzZ(28595, "iso-8859-5", "iso-8859-5", "iso-8859-5", "iso-8859-5", 1251), zzZ(28596, "iso-8859-6", "iso-8859-6", "iso-8859-6", "iso-8859-6", 1256), zzZ(28597, "iso-8859-7", "iso-8859-7", "iso-8859-7", "iso-8859-7", 1253), zzZ(28598, "iso-8859-8", "iso-8859-8", "iso-8859-8", "iso-8859-8", 1255), zzZ(28599, "iso-8859-9", "iso-8859-9", "iso-8859-9", "iso-8859-9", 1254), zzZ(28603, "iso-8859-13", "iso-8859-13", "iso-8859-13", "iso-8859-13", 1257), zzZ(28605, "iso-8859-15", "iso-8859-15", "iso-8859-15", "iso-8859-15", 1252), zzZ(29001, "x-Europa", "x-Europa", "x-Europa", "x-Europa", 1252), zzZ(38598, "iso-8859-8-i", "iso-8859-8-i", "iso-8859-8-i", "iso-8859-8-i", 1255), zzZ(50220, "iso-2022-jp", "iso-2022-jp", "iso-2022-jp", "iso-2022-jp", 932), zzZ(50221, "csISO2022JP", "iso-2022-jp", "iso-2022-jp", "csISO2022JP", 932), zzZ(50222, "iso-2022-jp", "iso-2022-jp", "iso-2022-jp", "iso-2022-jp", 932), zzZ(50225, "iso-2022-kr", "iso-2022-kr", "euc-kr", "iso-2022-kr", 949), zzZ(50227, "x-cp50227", "x-cp50227", "x-cp50227", "x-cp50227", 936), zzZ(51932, "euc-jp", "euc-jp", "euc-jp", "euc-jp", 932), zzZ(51936, "EUC-CN", "EUC-CN", "EUC-CN", "EUC-CN", 936), zzZ(51949, "euc-kr", "euc-kr", "euc-kr", "euc-kr", 949), zzZ(52936, "hz-gb-2312", "hz-gb-2312", "hz-gb-2312", "hz-gb-2312", 936), zzZ(54936, "GB18030", "GB18030", "GB18030", "GB18030", 936), zzZ(57002, "x-iscii-de", "x-iscii-de", "x-iscii-de", "x-iscii-de", 57002), zzZ(57003, "x-iscii-be", "x-iscii-be", "x-iscii-be", "x-iscii-be", 57003), zzZ(57004, "x-iscii-ta", "x-iscii-ta", "x-iscii-ta", "x-iscii-ta", 57004), zzZ(57005, "x-iscii-te", "x-iscii-te", "x-iscii-te", "x-iscii-te", 57005), zzZ(57006, "x-iscii-as", "x-iscii-as", "x-iscii-as", "x-iscii-as", 57006), zzZ(57007, "x-iscii-or", "x-iscii-or", "x-iscii-or", "x-iscii-or", 57007), zzZ(57008, "x-iscii-ka", "x-iscii-ka", "x-iscii-ka", "x-iscii-ka", 57008), zzZ(57009, "x-iscii-ma", "x-iscii-ma", "x-iscii-ma", "x-iscii-ma", 57009), zzZ(57010, "x-iscii-gu", "x-iscii-gu", "x-iscii-gu", "x-iscii-gu", 57010), zzZ(57011, "x-iscii-pa", "x-iscii-pa", "x-iscii-pa", "x-iscii-pa", 57011)};
    }

    @Override // com.aspose.words.internal.zzZOC
    public final Map<Integer, zzZO0> zzii() {
        HashMap map = new HashMap();
        zzZOD[] zzzodArrZzhM = zzhM();
        for (int i = 0; i < 122; i++) {
            zzZOD zzzod = zzzodArrZzhM[i];
            map.put(Integer.valueOf(zzzod.zzZWr.zzZWk), zzzod);
        }
        return map;
    }
}
