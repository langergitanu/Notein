package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOU {
    private static char[] zzXKG = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', ControlChar.LINE_BREAK_CHAR, '\f', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.COLUMN_BREAK_CHAR, 15, 16, 17, 18, ControlChar.FIELD_START_CHAR, ControlChar.FIELD_SEPARATOR_CHAR, ControlChar.FIELD_END_CHAR, 22, 23, 24, 25, 26, 27, 28, 29, ControlChar.NON_BREAKING_HYPHEN_CHAR, ControlChar.OPTIONAL_HYPHEN_CHAR, '\"', '<', '>', '|'};
    private static com.aspose.words.internal.zzZNR zzXKF = new com.aspose.words.internal.zzZNR("[^_A-Za-zÀ-ÖØ-öø-ÿĀ-ıĴ-ľŁ-ňŊ-žƀ-ǃǍ-ǰǴ-ǵǺ-ȗɐ-ʨʻ-ˁΆΈ-ΊΌΎ-ΡΣ-ώϐ-ϖϚϜϞϠϢ-ϳЁ-ЌЎ-яё-ќў-ҁҐ-ӄӇ-ӈӋ-ӌӐ-ӫӮ-ӵӸ-ӹԱ-Ֆՙա-ֆא-תװ-ײء-غف-يٱ-ڷں-ھۀ-ێې-ۓەۥ-ۦअ-हऽक़-ॡঅ-ঌএ-ঐও-নপ-রলশ-হড়-ঢ়য়-ৡৰ-ৱਅ-ਊਏ-ਐਓ-ਨਪ-ਰਲ-ਲ਼ਵ-ਸ਼ਸ-ਹਖ਼-ੜਫ਼ੲ-ੴઅ-ઋઍએ-ઑઓ-નપ-રલ-ળવ-હઽૠଅ-ଌଏ-ଐଓ-ନପ-ରଲ-ଳଶ-ହଽଡ଼-ଢ଼ୟ-ୡஅ-ஊஎ-ஐஒ-கங-சஜஞ-டண-தந-பம-வஷ-ஹఅ-ఌఎ-ఐఒ-నప-ళవ-హౠ-ౡಅ-ಌಎ-ಐಒ-ನಪ-ಳವ-ಹೞೠ-ೡഅ-ഌഎ-ഐഒ-നപ-ഹൠ-ൡก-ฮะา-ำเ-ๅກ-ຂຄງ-ຈຊຍດ-ທນ-ຟມ-ຣລວສ-ຫອ-ຮະາ-ຳຽເ-ໄཀ-ཇཉ-ཀྵႠ-Ⴥა-ჶᄀᄂ-ᄃᄅ-ᄇᄉᄋ-ᄌᄎ-ᄒᄼᄾᅀᅌᅎᅐᅔ-ᅕᅙᅟ-ᅡᅣᅥᅧᅩᅭ-ᅮᅲ-ᅳᅵᆞᆨᆫᆮ-ᆯᆷ-ᆸᆺᆼ-ᇂᇫᇰᇹḀ-ẛẠ-ỹἀ-ἕἘ-Ἕἠ-ὅὈ-Ὅὐ-ὗὙὛὝὟ-ώᾀ-ᾴᾶ-ᾼιῂ-ῄῆ-ῌῐ-ΐῖ-Ίῠ-Ῥῲ-ῴῶ-ῼΩK-Å℮ↀ-ↂぁ-ゔァ-ヺㄅ-ㄬ가-힣一-龥〇〡-〩]", 0);
    private static com.aspose.words.internal.zzZNR zzXKE = new com.aspose.words.internal.zzZNR("[^\\.\\-_A-Za-zÀ-ÖØ-öø-ÿĀ-ıĴ-ľŁ-ňŊ-žƀ-ǃǍ-ǰǴ-ǵǺ-ȗɐ-ʨʻ-ˁΆΈ-ΊΌΎ-ΡΣ-ώϐ-ϖϚϜϞϠϢ-ϳЁ-ЌЎ-яё-ќў-ҁҐ-ӄӇ-ӈӋ-ӌӐ-ӫӮ-ӵӸ-ӹԱ-Ֆՙա-ֆא-תװ-ײء-غف-يٱ-ڷں-ھۀ-ێې-ۓەۥ-ۦअ-हऽक़-ॡঅ-ঌএ-ঐও-নপ-রলশ-হড়-ঢ়য়-ৡৰ-ৱਅ-ਊਏ-ਐਓ-ਨਪ-ਰਲ-ਲ਼ਵ-ਸ਼ਸ-ਹਖ਼-ੜਫ਼ੲ-ੴઅ-ઋઍએ-ઑઓ-નપ-રલ-ળવ-હઽૠଅ-ଌଏ-ଐଓ-ନପ-ରଲ-ଳଶ-ହଽଡ଼-ଢ଼ୟ-ୡஅ-ஊஎ-ஐஒ-கங-சஜஞ-டண-தந-பம-வஷ-ஹఅ-ఌఎ-ఐఒ-నప-ళవ-హౠ-ౡಅ-ಌಎ-ಐಒ-ನಪ-ಳವ-ಹೞೠ-ೡഅ-ഌഎ-ഐഒ-നപ-ഹൠ-ൡก-ฮะา-ำเ-ๅກ-ຂຄງ-ຈຊຍດ-ທນ-ຟມ-ຣລວສ-ຫອ-ຮະາ-ຳຽເ-ໄཀ-ཇཉ-ཀྵႠ-Ⴥა-ჶᄀᄂ-ᄃᄅ-ᄇᄉᄋ-ᄌᄎ-ᄒᄼᄾᅀᅌᅎᅐᅔ-ᅕᅙᅟ-ᅡᅣᅥᅧᅩᅭ-ᅮᅲ-ᅳᅵᆞᆨᆫᆮ-ᆯᆷ-ᆸᆺᆼ-ᇂᇫᇰᇹḀ-ẛẠ-ỹἀ-ἕἘ-Ἕἠ-ὅὈ-Ὅὐ-ὗὙὛὝὟ-ώᾀ-ᾴᾶ-ᾼιῂ-ῄῆ-ῌῐ-ΐῖ-Ίῠ-Ῥῲ-ῴῶ-ῼΩK-Å℮ↀ-ↂぁ-ゔァ-ヺㄅ-ㄬ가-힣一-龥〇〡-〩0-9٠-٩۰-۹०-९০-৯੦-੯૦-૯୦-୯௧-௯౦-౯೦-೯൦-൯๐-๙໐-໙༠-༩̀-͠ͅ-҃͡-֑҆-֣֡-ֹֻ-ֽֿׁ-ׂًׄ-ْٰۖ-ۜ\u06dd-۟۠-ۤۧ-۪ۨ-ۭँ-ः़ा-ौ्॑-॔ॢ-ॣঁ-ঃ়ািী-ৄে-ৈো-্ৗৢ-ৣਂ਼ਾਿੀ-ੂੇ-ੈੋ-੍ੰ-ੱઁ-ઃ઼ા-ૅે-ૉો-્ଁ-ଃ଼ା-ୃେ-ୈୋ-୍ୖ-ୗஂ-ஃா-ூெ-ைொ-்ௗఁ-ఃా-ౄె-ైొ-్ౕ-ౖಂ-ಃಾ-ೄೆ-ೈೊ-್ೕ-ೖം-ഃാ-ൃെ-ൈൊ-്ൗัิ-ฺ็-๎ັິ-ູົ-ຼ່-ໍ༘-༹༙༵༷༾༿ཱ-྄྆-ྋྐ-ྕྗྙ-ྭྱ-ྷྐྵ⃐-〪⃜⃡-゙゚〯·ːˑ·ـๆໆ々〱-〵ゝ-ゞー-ヾ]", 0);
    private static com.aspose.words.internal.zzZNR zzXKD = new com.aspose.words.internal.zzZNR("_[0-9A-Fa-f]{1,4}_", 0);
    private static char[] zzXKC = {IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("table-of-content", "alphabetical-index", "illustration-index", "table-index", "object-index", "user-index", "bibliography", "I", ContextChain.TAG_INFRA, C18385v2.f56336h, "a", "ArrowShortNarrow", "ArrowMediumNarrow", "ArrowLongNarrow", "ArrowShortMedium", "ArrowMediumMedium", "ArrowLongMedium", "ArrowShortWide", "ArrowMediumWide", "ArrowLongWide", "DiamondShortMedium", "DiamondMediumMedium", "DiamondLongNarrow", "DiamondShortNarrow", "DiamondMediumNarrow", "DiamondMediumWide", "DiamondShortWide", "DiamondLongMedium", "DiamondLongWide", "OpenShortMedium", "OpenMediumMedium", "OpenLongNarrow", "OpenShortNarrow", "OpenMediumNarrow", "OpenMediumWide", "OpenShortWide", "OpenLongMedium", "OpenLongWide", "OvalShortMedium", "OvalMediumMedium", "OvalLongNarrow", "OvalShortNarrow", "OvalMediumNarrow", "OvalMediumWide", "OvalShortWide", "OvalLongMedium", "OvalLongWide", "BlockShortMedium", "BlockMediumMedium", "BlockLongNarrow", "BlockShortNarrow", "BlockMediumNarrow", "BlockMediumWide", "BlockShortWide", "BlockLongMedium", "BlockLongWide");

    private static int zz8(String str, boolean z) {
        double d = com.aspose.words.internal.zzZKN.zzW(str, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? com.aspose.words.internal.zzJB.parseDouble(str.replace("%", "")) / 100.0d : com.aspose.words.internal.zzJB.parseDouble(str);
        if (z) {
            d = 1.0d - d;
        }
        return com.aspose.words.internal.zzSA.zzl(d);
    }

    public static int zzDA(String str) {
        return com.aspose.words.internal.zzSA.zzl(ImageData.zzWO((zzDx(str) / 2.0d) + 0.5d));
    }

    public static String zzDB(String str) {
        String str2 = ("path".equals(str) || "full".equals(str)) ? ContextChain.TAG_PRODUCT : null;
        return str2 == null ? "FILENAME" : com.aspose.words.internal.zzZKN.format("FILENAME \\* \\{0} \\*", str2);
    }

    public static String zzDC(String str) {
        return com.aspose.words.internal.zzZKN.zzT(str, " \\p ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) != -1 ? "full" : "name-and-extension";
    }

    public static String zzDD(String str) {
        switch (zzUR.zzTP(str)) {
            case 7:
                return " \\* ROMAN";
            case 8:
                return " \\* roman";
            case 9:
                return " \\* ALPHABETIC";
            case 10:
                return " \\* alphabetic";
            default:
                return null;
        }
    }

    public static String zzDE(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzT(str, "\\*", i) == -1) {
            return null;
        }
        if (com.aspose.words.internal.zzZKN.zzT(str, "ROMAN", i) != -1) {
            return "I";
        }
        if (com.aspose.words.internal.zzZKN.zzT(str, "roman", i) != -1) {
            return ContextChain.TAG_INFRA;
        }
        if (com.aspose.words.internal.zzZKN.zzT(str, "ALPHABETIC", i) != -1) {
            return C18385v2.f56336h;
        }
        if (com.aspose.words.internal.zzZKN.zzT(str, "alphabetic", i) != -1) {
            return "a";
        }
        return null;
    }

    public static String zzDF(String str) {
        int i;
        int iZzT;
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || (iZzT = com.aspose.words.internal.zzZKN.zzT(str, "SET ", (i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8))) == -1) {
            return "";
        }
        String strZzS = com.aspose.words.internal.zzZKN.zzS(str.substring(iZzT + 4), ControlChar.SPACE_CHAR);
        int iZzT2 = com.aspose.words.internal.zzZKN.zzT(strZzS, "\"", i);
        if (iZzT2 == -1) {
            iZzT2 = com.aspose.words.internal.zzZKN.zzT(strZzS, " ", i);
        }
        if (iZzT2 == -1) {
            iZzT2 = strZzS.length();
        }
        return com.aspose.words.internal.zzZKN.zzS(com.aspose.words.internal.zzZKN.zzS(strZzS.substring(0, iZzT2), ControlChar.SPACE_CHAR), '\"');
    }

    public static String zzDG(String str) {
        int iZzW;
        int iZzW2;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        int iZzT = com.aspose.words.internal.zzZKN.zzT(str, "\\@", i);
        if (iZzT == -1 || (iZzW2 = com.aspose.words.internal.zzZKN.zzW(str, "\"", (iZzW = com.aspose.words.internal.zzZKN.zzW(str, "\"", iZzT, i) + 1), i)) == -1) {
            return null;
        }
        return C22241OooO0Oo.OooO00o(iZzW2, iZzW, iZzW, iZzW, str);
    }

    public static int zzDH(String str) {
        String strReplace = str.replace("grad", "").replace("rad", "").replace("deg", "");
        double d = com.aspose.words.internal.zzJB.parseDouble(strReplace);
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzSA.zzl(com.aspose.words.internal.zzZKN.zzW(str, "grad", i) ? d * 0.9d : com.aspose.words.internal.zzZKN.zzW(str, "rad", i) ? (d * 180.0d) / 3.141592653589793d : com.aspose.words.internal.zzJB.parseDouble(strReplace));
    }

    public static int zzDI(String str) {
        return com.aspose.words.internal.zzSA.zzl(com.aspose.words.internal.zzJB.parseDouble(str));
    }

    public static boolean zzDJ(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private static boolean zzDk(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && com.aspose.words.internal.zzZKN.zzZ(str, zzXKG) == -1;
    }

    public static boolean zzDl(String str) {
        return "/content.xml".equals(str) || "/meta.xml".equals(str) || "/settings.xml".equals(str) || "/styles.xml".equals(str);
    }

    public static String zzDm(String str) {
        return com.aspose.words.internal.zzZKN.zzU(str, IOUtils.DIR_SEPARATOR_UNIX);
    }

    public static String zzDn(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzS(str, "super", i) ? "super" : com.aspose.words.internal.zzZKN.zzS(str, "sub", i) ? "sub" : "";
    }

    public static String zzDo(String str) {
        return com.aspose.words.internal.zzZVR.zzWk(str);
    }

    public static boolean zzDp(String str) {
        return !"none".equals(str) && zzYSF.zzFX(com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR)[1]) > 0;
    }

    public static String zzDq(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!com.aspose.words.internal.zzZYD.isLetter(cCharAt) && ((!com.aspose.words.internal.zzZYD.isDigit(cCharAt) || i == 0) && (cCharAt != '_' || i == 0))) {
                com.aspose.words.internal.zzZNS zzznsZzUW = zzXKF.zzUW(str.substring(0, 1));
                String strReplace = zzznsZzUW.getCount() > 0 ? com.aspose.words.internal.zzZKN.format("{0}{1}", com.aspose.words.internal.zzZKN.format("_{0}_", com.aspose.words.internal.zzJB.zzWy(zzznsZzUW.zzQw(0).getValue().charAt(0))), str.substring(1)) : str;
                for (com.aspose.words.internal.zzZNT zzznt : zzXKE.zzUW(str.substring(1))) {
                    strReplace = strReplace.replace(zzznt.getValue(), com.aspose.words.internal.zzZKN.format("_{0}_", com.aspose.words.internal.zzJB.zzWy(zzznt.getValue().charAt(0))));
                }
                return strReplace;
            }
        }
        return str;
    }

    public static String zzDr(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return str;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (!com.aspose.words.internal.zzZYD.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                    break;
                }
                if (cCharAt == '_') {
                    i2++;
                }
                i++;
            } else if (i2 < 2) {
                return str;
            }
        }
        Iterator<com.aspose.words.internal.zzZNT> it = zzXKD.zzUW(str).iterator();
        while (it.hasNext()) {
            String value = it.next().getValue();
            if (com.aspose.words.internal.zzZYD.zzXk(value)) {
                str = str.replace(value, Character.toString((char) com.aspose.words.internal.zzJB.zzZe(com.aspose.words.internal.zzZKN.zzS(value, '_'))));
            }
        }
        return str;
    }

    public static int zzDs(String str) {
        return zz8(str, true);
    }

    public static int zzDt(String str) {
        return zz8(str, false);
    }

    public static com.aspose.words.internal.zzPV zzDu(String str) {
        if ("transparent".equals(str)) {
            return com.aspose.words.internal.zzPV.zzI0;
        }
        if (str.charAt(0) != '#') {
            return com.aspose.words.internal.zzPV.zzHZ;
        }
        String strZzU = com.aspose.words.internal.zzZKN.zzU(str, '#');
        return strZzU.length() == 6 ? new com.aspose.words.internal.zzPV(com.aspose.words.internal.zzJB.zzZe(strZzU.substring(0, 2)), com.aspose.words.internal.zzJB.zzZe(strZzU.substring(2, 4)), com.aspose.words.internal.zzJB.zzZe(strZzU.substring(4, 6))) : strZzU.length() == 8 ? new com.aspose.words.internal.zzPV(com.aspose.words.internal.zzJB.zzZe(strZzU.substring(0, 2)), com.aspose.words.internal.zzJB.zzZe(strZzU.substring(2, 4)), com.aspose.words.internal.zzJB.zzZe(strZzU.substring(4, 6)), com.aspose.words.internal.zzJB.zzZe(strZzU.substring(6, 8))) : com.aspose.words.internal.zzPV.zzHZ;
    }

    public static zzZU zzDv(String str) {
        return "italic".equals(str) ? zzZU.zzZF6 : zzZU.zzZF7;
    }

    public static int zzDw(String str) {
        return com.aspose.words.internal.zzJB.zzZ7(str) ? com.aspose.words.internal.zzSA.zzr(12.0d) : com.aspose.words.internal.zzZKN.zzW(str, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? com.aspose.words.internal.zzSA.zzr((com.aspose.words.internal.zzJB.parseDouble(str.replace("%", "")) / 100.0d) * 12.0d) : zzYSF.zzFX(str);
    }

    private static double zzDx(String str) {
        return com.aspose.words.internal.zzJB.parseDouble(str.replace("%", "")) / 100.0d;
    }

    public static int zzDy(String str) {
        return com.aspose.words.internal.zzSA.zzl(zzDx(str));
    }

    public static int zzDz(String str) {
        return com.aspose.words.internal.zzSA.zzl(zzDx(str) / 2.0d);
    }

    public static String zzJ(String str, String str2, boolean z) {
        String strZzWv;
        if (!z) {
            str = zzZQX.zzM7(str).getHRef();
        }
        if (com.aspose.words.internal.zzZVR.zzWw(str)) {
            return str;
        }
        if (!zzDk(str)) {
            return "";
        }
        if (com.aspose.words.internal.zzZVR.zzWF(str)) {
            strZzWv = com.aspose.words.internal.zzZVR.zzWv(str);
        } else {
            if (!com.aspose.words.internal.zzZKL.zzZH(str2, str)) {
                str = com.aspose.words.internal.zzZVR.zz7(str2, com.aspose.words.internal.zzZKN.zzX(str, zzXKC));
            }
            strZzWv = com.aspose.words.internal.zzZVR.zzWl(str);
        }
        return strZzWv.replace("\\", "/");
    }

    public static zzZU zzM(zzYQ7 zzyq7, String str) {
        if ("normal".equals(str)) {
            return zzZU.zzZF7;
        }
        if (!"bold".equals(str)) {
            zzyq7.zzv("style:text-properties", "fo:font-weight", str);
        }
        return zzZU.zzZF6;
    }

    public static String zzN(zzYQ7 zzyq7, String str) {
        for (zzYR5 zzyr5 : zzyq7.zzYux()) {
            if (com.aspose.words.internal.zzZKN.equals(zzyr5.zzYvG(), str)) {
                return zzyr5.zzYZ5();
            }
        }
        return null;
    }

    public static zzUD zzO(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzYu = zzaa.zzYu("\u0001CompObj");
        if (zzzorZzYu == null || zzzorZzYu.getLength() < 32) {
            return null;
        }
        return zzUD.zzY(zzaa);
    }

    public static String zzP(Shading shading) {
        com.aspose.words.internal.zzPV zzpvZzYbJ = shading.zzYbJ();
        com.aspose.words.internal.zzPV zzpvZzYbK = shading.zzYbK();
        int texture = shading.getTexture();
        if (texture != 0 && texture != 65535) {
            double dZzsk = zzYS3.zzsk(texture);
            return com.aspose.words.internal.zzZKN.format("#{0}{1}{2}{3}", (zzpvZzYbJ.zzPD() == 255 || zzpvZzYbJ.zzPD() == 0) ? "" : zzZ(zzpvZzYbJ, zzpvZzYbK, zzpvZzYbJ.zzPD(), zzpvZzYbK.zzPD(), dZzsk), zzZ(zzpvZzYbJ, zzpvZzYbK, zzpvZzYbJ.zzPC(), zzpvZzYbK.zzPC(), dZzsk), zzZ(zzpvZzYbJ, zzpvZzYbK, zzpvZzYbJ.zzPB(), zzpvZzYbK.zzPB(), dZzsk), zzZ(zzpvZzYbJ, zzpvZzYbK, zzpvZzYbJ.zzPA(), zzpvZzYbK.zzPA(), dZzsk));
        }
        if (zzpvZzYbK.isEmpty() || com.aspose.words.internal.zzPV.zzZ(zzpvZzYbK, com.aspose.words.internal.zzPV.zzI0)) {
            return null;
        }
        return zzV(zzpvZzYbK, true);
    }

    public static int zzR(int i, double d) {
        return (int) (((double) i) * d);
    }

    public static String zzV(com.aspose.words.internal.zzPV zzpv, boolean z) {
        String strZzWv = "";
        if (z && zzpv.isEmpty()) {
            zzpv = com.aspose.words.internal.zzPV.zzKa;
        } else {
            if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzI0)) {
                return "transparent";
            }
            if (zzpv.isEmpty()) {
                return "";
            }
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, new com.aspose.words.internal.zzPV(239, 240, 2, 0))) {
            return "#ffffff";
        }
        if (zzpv.zzPD() != 255 && zzpv.zzPD() != 0) {
            strZzWv = com.aspose.words.internal.zzJB.zzWv(zzpv.zzPD());
        }
        return com.aspose.words.internal.zzZKN.format("#{0}{1}{2}{3}", strZzWv, com.aspose.words.internal.zzJB.zzWv(zzpv.zzPC()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPB()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPA()));
    }

    public static double zzWr(int i, int i2) {
        double d;
        double d2 = ((double) i2) / 8.0d;
        if (i == 3) {
            return d2 * 3.0d;
        }
        if (i == 24 || i == 25) {
            return d2 * 1.5d;
        }
        switch (i) {
            case 10:
                return d2 * 5.0d;
            case 11:
            case 12:
                d = 2.5d;
                break;
            case 13:
                return d2 * 1.5d;
            case 14:
            case 15:
                d = 2.0d;
                break;
            case 16:
                return d2 * 3.0d;
            case 17:
            case 18:
                d = 3.25d;
                break;
            case 19:
                return d2 * 3.0d;
            case 20:
                return d2 * 3.0d;
            case 21:
                return d2 * 5.0d;
            default:
                return d2;
        }
        return d2 * d;
    }

    private static boolean zzWs(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        return i < 500000 || i2 < 500000;
    }

    public static double zzWt(int i, int i2) {
        if (!zzWs(i, i2)) {
            return 1.0d;
        }
        if (i >= i2) {
            i = i2;
        }
        if (i == 0) {
            return 1.0d;
        }
        return 1000000.0d / ((double) i);
    }

    private static String zzWx(double d) {
        return com.aspose.words.internal.zzJB.zzZZ(com.aspose.words.internal.zzZKQ.zzZa(d * 100.0d)) + "%";
    }

    private static double zzY(Paragraph paragraph, AbsolutePositionTab absolutePositionTab) {
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        if (absolutePositionTab.zzc1() == 0) {
            int iZzHT = zzymxZzZYj.zzHT();
            dZzYM7 = zzymxZzZYj.zzYM7() > iZzHT ? ((double) (zzymxZzZYj.zzYM7() - iZzHT)) / 20.0d : 0.0d;
            if (Math.abs(zzymxZzZYj.zzYMa()) > iZzHT) {
                dZzYM7 = ((double) (Math.abs(zzymxZzZYj.zzYMa()) - iZzHT)) / 20.0d;
            }
            if (absolutePositionTab.getAlignment() == 2) {
                return (((double) zzymxZzZYj.zzYM4()) / 20.0d) + dZzYM7;
            }
        }
        return dZzYM7;
    }

    public static boolean zzYC(Paragraph paragraph) {
        for (Node node : paragraph.getChildNodes(0, false)) {
            if (node.getNodeType() != 18 && node.getNodeType() != 17) {
                return false;
            }
        }
        return true;
    }

    public static String zzYc(String str, String str2) {
        int i;
        int iZzT;
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || (iZzT = com.aspose.words.internal.zzZKN.zzT(str, str2, (i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8))) == -1) {
            return "";
        }
        int length = str2.length() + iZzT;
        int iZzW = com.aspose.words.internal.zzZKN.zzW(str, com.aspose.words.internal.zzZKN.zzW(str, "\"", length, i) != -1 ? "\"" : " ", length, i);
        if (iZzW == -1) {
            return "";
        }
        int i2 = iZzW + 1;
        int iZzW2 = com.aspose.words.internal.zzZKN.zzW(str, "\"", i2, i);
        if (iZzW2 == -1) {
            iZzW2 = com.aspose.words.internal.zzZKN.zzW(str, " ", i2, i);
        }
        if (iZzW2 == -1) {
            iZzW2 = str.length();
        }
        return C22241OooO0Oo.OooO00o(iZzW2, i2, i2, i2, str);
    }

    public static String zzYd(String str, String str2) {
        int i;
        int iZzT;
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || (iZzT = com.aspose.words.internal.zzZKN.zzT(str, str2, (i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8))) == -1) {
            return "";
        }
        int length = str2.length() + iZzT;
        int iZzW = com.aspose.words.internal.zzZKN.zzW(str, "\\", length, i);
        if (iZzW == -1) {
            iZzW = str.length();
        }
        return com.aspose.words.internal.zzZKN.zzS(C22241OooO0Oo.OooO00o(iZzW, length, length, length, str), ControlChar.SPACE_CHAR);
    }

    public static String zzYf(String str) {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("/", str);
    }

    public static double zzZ(Paragraph paragraph, AbsolutePositionTab absolutePositionTab) {
        double dZzY = zzY(paragraph, absolutePositionTab);
        Section parentSection = paragraph.getParentSection();
        int alignment = absolutePositionTab.getAlignment();
        if (alignment == 0) {
            return 0.0d;
        }
        if (alignment == 1) {
            return zzZ(paragraph, parentSection, dZzY);
        }
        if (alignment == 2) {
            return ((double) parentSection.getPageSetup().zzYRX()) + dZzY;
        }
        throw new IllegalStateException("Unexpected alignment value.");
    }

    public static String zzZ9(Object obj) {
        return com.aspose.words.internal.zzZKN.format("{0}pt", com.aspose.words.internal.zzJB.zzZZ(((double) ((Integer) obj).intValue()) / 2.0d));
    }

    public static String zzZQ(com.aspose.words.internal.zzPV zzpv) {
        return zzV(zzpv, true);
    }

    private static String zzZu(int i, boolean z) {
        double dZzZa = com.aspose.words.internal.zzZKQ.zzZa((((double) i) / 65536.0d) * 100.0d);
        if (z) {
            dZzZa = 100.0d - dZzZa;
        }
        return com.aspose.words.internal.zzZKN.format("{0}%", com.aspose.words.internal.zzJB.zzZZ(dZzZa));
    }

    public static boolean zzq(FieldChar fieldChar) {
        return fieldChar.getFieldType() == 8 || fieldChar.getFieldType() == 13;
    }

    public static String zzrm(int i) {
        return zzZu(i, true);
    }

    public static String zzrn(int i) {
        return zzZu(i, false);
    }

    public static String zzro(int i) {
        return zzWx(((double) i) / 65536.0d);
    }

    public static String zzrp(int i) {
        return zzWx(((double) (i * 2)) / 65536.0d);
    }

    public static String zzrq(int i) {
        return zzWx((ImageData.zzWP(((double) i) / 65536.0d) - 0.5d) * 2.0d);
    }

    public static String zzrr(int i) {
        return com.aspose.words.internal.zzJB.zzZT(((double) i) / 65536.0d);
    }

    public static String zzrs(int i) {
        return com.aspose.words.internal.zzJB.zzZT((((((double) i) / 65536.0d) + ((double) (i < 0 ? 180 : 0))) % 360.0d) * 10.0d);
    }

    public static int zzrt(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalStateException("Unexpected alignment value.");
    }

    public static int zzru(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalStateException("Unexpected leader character value.");
    }

    public static boolean zzrv(int i) {
        return zzY0C.zzzG(i) == 2 || com.aspose.words.internal.zzZVS.zzS2(i);
    }

    private static int zzs(double d) {
        int iZzZG = com.aspose.words.internal.zzAN.zzZG(8.0d * d);
        if (iZzZG != 0 || d <= 0.0d) {
            return iZzZG;
        }
        return 1;
    }

    public static String zzv(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        int iZzZG = iIntValue == 0 ? 0 : com.aspose.words.internal.zzAN.zzZG((((double) ((Integer) obj).intValue()) * 100.0d) / ((double) iIntValue));
        if (Math.abs(iZzZG) > 100) {
            iZzZG = Integer.signum(iZzZG) * 100;
        }
        return com.aspose.words.internal.zzZKN.format("{0}% 100%", com.aspose.words.internal.zzJB.zzZZ(iZzZG));
    }

    private static zzYR1 zzR(String str, String str2, String str3, String str4) {
        zzYR1 zzyr1 = new zzYR1();
        zzyr1.setName(str);
        zzyr1.setDisplayName(str2);
        zzyr1.zzEu(str3);
        zzyr1.zzEt(str4);
        return zzyr1;
    }

    public static int zzZ9(String str, int i) {
        int iZzT = com.aspose.words.internal.zzZKN.zzT(str, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
        if (com.aspose.words.internal.zzZYD.zzXk(zzDn(str)) || iZzT == -1) {
            return 0;
        }
        return com.aspose.words.internal.zzAN.zzZG(((double) (com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzJB.parseDouble(str.substring(0, iZzT))) * i)) / 100.0d);
    }

    private static double zzZ(Paragraph paragraph, Section section, double d) {
        double width;
        if (paragraph.isInCell() && paragraph.zzZex() != null) {
            CellFormat cellFormat = paragraph.zzZex().getCellFormat();
            width = (cellFormat.getWidth() - cellFormat.getLeftPadding()) - cellFormat.getRightPadding();
        } else {
            zzYCZ zzyczZzYvR = section.zzYvR();
            double dZzYRX = section.getPageSetup().zzYRX();
            double dZzYco = ((double) zzyczZzYvR.zzYco()) / 20.0d;
            int columnsCount = zzyczZzYvR.getColumnsCount();
            width = (dZzYRX - (dZzYco * ((double) (columnsCount - 1)))) / ((double) columnsCount);
        }
        return (width / 2.0d) + d;
    }

    public static zzYR1 zzY(zzYC3 zzyc3, int i, boolean z) {
        int i2 = z ? 467 : 469;
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.format("{0}{1}", zzYS3.zzsd(i), Integer.valueOf(zzyc3.contains(i2) ? ((Integer) zzyc3.zzPk(i2)).intValue() : 1)))) {
            case 11:
                return zzR("msArrowEnd_20_1", "msArrowEnd 1", "0 0 140 140", "m70 0 70 140h-140z");
            case 12:
                return zzR("msArrowEnd_20_2", "msArrowEnd 2", "0 0 140 210", "m70 0 70 210h-140z");
            case 13:
                return zzR("msArrowEnd_20_3", "msArrowEnd 3", "0 0 140 350", "m70 0 70 350h-140z");
            case 14:
                return zzR("msArrowEnd_20_4", "msArrowEnd 4", "0 0 210 140", "m105 0 105 140h-210z");
            case 15:
                return zzR("msArrowEnd_20_5", "msArrowEnd 5", "0 0 210 210", "m105 0 105 210h-210z");
            case 16:
                return zzR("msArrowEnd_20_6", "msArrowEnd 6", "0 0 210 350", "m105 0 105 350h-210z");
            case 17:
                return zzR("msArrowEnd_20_7", "msArrowEnd 7", "0 0 350 140", "m175 0 175 140h-350z");
            case 18:
                return zzR("msArrowEnd_20_8", "msArrowEnd 8", "0 0 350 210", "m175 0 175 210h-350z");
            case 19:
                return zzR("msArrowEnd_20_9", "msArrowEnd 9", "0 0 350 350", "m175 0 175 350h-350z");
            case 20:
                return zzR("msArrowDiamondEnd_20_1", "msArrowDiamondEnd 1", "0 0 140 140", "m70 0 70 70-70 70-70-70z");
            case 21:
                return zzR("msArrowDiamondEnd_20_2", "msArrowDiamondEnd 2", "0 0 140 210", "m70 0 70 105-70 105-70-105z");
            case 22:
                return zzR("msArrowDiamondEnd_20_3", "msArrowDiamondEnd 3", "0 0 140 350", "m70 0 70 175-70 175-70-175z");
            case 23:
                return zzR("msArrowDiamondEnd_20_4", "msArrowDiamondEnd 4", "0 0 210 140", "m105 0 105 70-105 70-105-70z");
            case 24:
                return zzR("msArrowDiamondEnd_20_5", "msArrowDiamondEnd 5", "0 0 210 210", "m105 0 105 105-105 105-105-105z");
            case 25:
                return zzR("msArrowDiamondEnd_20_6", "msArrowDiamondEnd 6", "0 0 210 350", "m105 0 105 175-105 175-105-175z");
            case 26:
                return zzR("msArrowDiamondEnd_20_7", "msArrowDiamondEnd 7", "0 0 350 140", "m175 0 175 70-175 70-175-70z");
            case 27:
                return zzR("msArrowDiamondEnd_20_8", "msArrowDiamondEnd 8", "0 0 350 210", "m175 0 175 105-175 105-175-105z");
            case 28:
                return zzR("msArrowDiamondEnd_20_9", "msArrowDiamondEnd 9", "0 0 350 350", "m175 0 175 175-175 175-175-175z");
            case 29:
                return zzR("msArrowOpenEnd_20_1", "msArrowOpenEnd 1", "0 0 245 245", "m123 0 122 223-37 22-85-157-86 157-37-22z");
            case 30:
                return zzR("msArrowOpenEnd_20_2", "msArrowOpenEnd 2", "0 0 245 315", "m123 0 122 287-37 28-85-202-86 202-37-28z");
            case 31:
                return zzR("msArrowOpenEnd_20_3", "msArrowOpenEnd 3", "0 0 245 420", "m123 0 122 382-37 38-85-269-86 269-37-38z");
            case 32:
                return zzR("msArrowOpenEnd_20_4", "msArrowOpenEnd 4", "0 0 315 245", "m158 0 157 223-47 22-110-157-111 157-47-22z");
            case 33:
                return zzR("msArrowOpenEnd_20_5", "msArrowOpenEnd 5", "0 0 315 315", "m158 0 157 287-47 28-110-202-111 202-47-28z");
            case 34:
                return zzR("msArrowOpenEnd_20_6", "msArrowOpenEnd 6", "0 0 315 420", "m158 0 157 382-47 38-110-269-111 269-47-38z");
            case 35:
                return zzR("msArrowOpenEnd_20_7", "msArrowOpenEnd 7", "0 0 420 245", "m210 0 210 223-63 22-147-157-147 157-63-22z");
            case 36:
                return zzR("msArrowOpenEnd_20_8", "msArrowOpenEnd 8", "0 0 420 315", "m210 0 210 287-63 28-147-202-147 202-63-28z");
            case 37:
                return zzR("msArrowOpenEnd_20_9", "msArrowOpenEnd 9", "0 0 420 420", "m210 0 210 382-63 38-147-269-147 269-63-38z");
            case 38:
                return zzR("msArrowOvalEnd_20_1", "msArrowOvalEnd 1", "0 0 140 140", "m140 0c0-38-32-70-70-70s-70 32-70 70 32 70 70 70 70-32 70-70z");
            case 39:
                return zzR("msArrowOvalEnd_20_2", "msArrowOvalEnd 2", "0 0 140 210", "m140 0c0-57-32-105-70-105s-70 48-70 105 32 105 70 105 70-48 70-105z");
            case 40:
                return zzR("msArrowOvalEnd_20_3", "msArrowOvalEnd 3", "0 0 140 350", "m140 0c0-96-32-175-70-175s-70 79-70 175 32 175 70 175 70-79 70-175z");
            case 41:
                return zzR("msArrowOvalEnd_20_4", "msArrowOvalEnd 4", "0 0 210 140", "m210 0c0-38-48-70-105-70s-105 32-105 70 48 70 105 70 105-32 105-70z");
            case 42:
                return zzR("msArrowOvalEnd_20_5", "msArrowOvalEnd 5", "0 0 210 210", "m210 0c0-57-48-105-105-105s-105 48-105 105 48 105 105 105 105-48 105-105z");
            case 43:
                return zzR("msArrowOvalEnd_20_6", "msArrowOvalEnd 6", "0 0 210 350", "m210 0c0-96-48-175-105-175s-105 79-105 175 48 175 105 175 105-79 105-175z");
            case 44:
                return zzR("msArrowOvalEnd_20_7", "msArrowOvalEnd 7", "0 0 350 140", "m350 0c0-38-79-70-175-70s-175 32-175 70 79 70 175 70 175-32 175-70z");
            case 45:
                return zzR("msArrowOvalEnd_20_8", "msArrowOvalEnd 8", "0 0 350 210", "m350 0c0-57-79-105-175-105s-175 48-175 105 79 105 175 105 175-48 175-105z");
            case 46:
                return zzR("msArrowOvalEnd_20_9", "msArrowOvalEnd 9", "0 0 350 350", "m350 0c0-96-79-175-175-175s-175 79-175 175 79 175 175 175 175-79 175-175z");
            case 47:
                return zzR("msArrowStealthEnd_20_1", "msArrowStealthEnd 1", "0 0 140 140", "m70 0 70 140-70-56-70 56z");
            case 48:
                return zzR("msArrowStealthEnd_20_2", "msArrowStealthEnd 2", "0 0 140 210", "m70 0 70 210-70-84-70 84z");
            case 49:
                return zzR("msArrowStealthEnd_20_3", "msArrowStealthEnd 3", "0 0 140 350", "m70 0 70 350-70-140-70 140z");
            case 50:
                return zzR("msArrowStealthEnd_20_4", "msArrowStealthEnd 4", "0 0 210 140", "m105 0 105 140-105-56-105 56z");
            case 51:
                return zzR("msArrowStealthEnd_20_5", "msArrowStealthEnd 5", "0 0 210 210", "m105 0 105 210-105-84-105 84z");
            case 52:
                return zzR("msArrowStealthEnd_20_6", "msArrowStealthEnd 6", "0 0 210 350", "m105 0 105 350-105-140-105 140z");
            case 53:
                return zzR("msArrowStealthEnd_20_7", "msArrowStealthEnd 7", "0 0 350 140", "m175 0 175 140-175-56-175 56z");
            case 54:
                return zzR("msArrowStealthEnd_20_8", "msArrowStealthEnd 8", "0 0 350 210", "m175 0 175 210-175-84-175 84z");
            case 55:
                return zzR("msArrowStealthEnd_20_9", "msArrowStealthEnd 9", "0 0 350 350", "m175 0 175 350-175-140-175 140z");
            default:
                return zzR("msArrowEnd_20_5", "msArrowEnd 5", "0 0 210 210", "m105 0 105 210h-210z");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzZ(Border border, double d) {
        double d2;
        int lineStyle = border.getLineStyle();
        if (lineStyle != 3) {
            if (lineStyle != 24 && lineStyle != 25) {
                switch (lineStyle) {
                    case 10:
                    case 21:
                        d /= 5.0d;
                        break;
                    case 11:
                    case 12:
                        d2 = 2.5d;
                        d /= d2;
                        break;
                    case 14:
                    case 15:
                        d2 = 2.0d;
                        d /= d2;
                        break;
                    case 17:
                    case 18:
                        d2 = 3.25d;
                        d /= d2;
                        break;
                }
            } else {
                d /= 1.5d;
            }
        } else {
            d /= 3.0d;
        }
        return zzs(d * 28.34645669291339d);
    }

    public static Shading zzZ(String str, Shading shading) {
        if (shading == null) {
            shading = new Shading();
        }
        shading.zzZK("transparent".equals(str) ? com.aspose.words.internal.zzPV.zzHZ : zzDu(str));
        return shading;
    }

    private static String zzZ(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2, int i, int i2, double d) {
        if (com.aspose.words.internal.zzAN.zzL(d, 1.0d)) {
            if (zzpv.isEmpty()) {
                i = i2;
            }
            return com.aspose.words.internal.zzJB.zzWv(i);
        }
        if (i == 0 && i2 == 0) {
            if (zzpv.isEmpty() && !zzpv2.isEmpty()) {
                double d2 = i2;
                return com.aspose.words.internal.zzJB.zzWv(((byte) (d2 - (d * d2))) & 255);
            }
            return com.aspose.words.internal.zzJB.zzWv(((byte) (255.0d - (d * 255.0d))) & 255);
        }
        if (i == 255) {
            return com.aspose.words.internal.zzJB.zzWv(i2);
        }
        return com.aspose.words.internal.zzJB.zzWv(((byte) (((double) Math.max(i, i2)) - (((double) Math.abs(i - i2)) * d))) & 255);
    }

    public static String zzZ(zzZU zzzu, zzZ9G zzz9g, int i, String str) {
        return zzZ(zzzu, zzz9g, i, str, (String) null);
    }

    public static String zzZ(zzZU zzzu, zzZ9G zzz9g, int i, String str, String str2) {
        Object objZzY = zzzu.zzY(zzz9g, i);
        if (objZzY != null) {
            return ((Boolean) objZzY).booleanValue() ? str : str2;
        }
        return null;
    }

    public static boolean zzZ(zzYQO zzyqo, ArrayList<zzYR5> arrayList) {
        if (arrayList == null) {
            return false;
        }
        for (zzYR5 zzyr5 : arrayList) {
            if (com.aspose.words.internal.zzZKN.equals(zzyr5.zzxf(), zzyqo.getName())) {
                return zzyr5.isEncrypted();
            }
        }
        return false;
    }
}
