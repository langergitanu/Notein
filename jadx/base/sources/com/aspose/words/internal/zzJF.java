package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJF {
    private static final zzZHW zzUR;
    private static zzZYF zzzJ;
    private static zzZYI zzzO;
    private static String[] zzzR = {"Arial", "Times New Roman", "Courier New", "Symbol", "Wingdings"};
    private static String[] zzzQ = {"Consolas", "Courier New", "Lucida Console", "DotumChe"};
    private static String[] zzzP = {"Times New Roman", "Verdana", "Calibri", "Calibri Light", "Arial", "Arabic Typesetting", "Cambria"};
    private static Object zzzN = new Object();
    private static zzD4 zzzM = new zzD4();
    private static zzZYJ zzzL = new zzZYJ();
    private static zzZYI zzzK = new zzZYI();

    static {
        zzHh();
        zzHg();
        zzHf();
        zzHc();
        zzUR = new zzZHW("BATANG", "明朝");
    }

    private static boolean zzB(char c) {
        return c >= ' ' && c <= 255;
    }

    private static boolean zzC(char c) {
        return c >= 61472 && c <= 61695;
    }

    public static char zzD(char c) {
        if (c != 61692) {
            return c;
        }
        return (char) 10003;
    }

    public static char zzE(char c) {
        return zzB(c) ? (char) (c + 61440) : c;
    }

    public static char zzF(char c) {
        return zzC(c) ? (char) (c - 61440) : c;
    }

    private static void zzHc() {
        zzZYF zzzyf = new zzZYF((char) 0);
        zzzJ = zzzyf;
        zzzyf.add("Courier", "Courier New");
        zzzJ.add("David Transparent", "David");
        zzzJ.add("Fixed Miriam Transparent", "Miriam Fixed");
        zzzJ.add("KaiTi_GB2312", "KaiTi");
        zzzJ.add("楷体_GB2312", "KaiTi");
        zzzJ.add("Miriam Transparent", "Miriam");
        zzzJ.add("Rod Transparent", "Rod");
        zzzJ.add("Times", "Times New Roman");
        zzzJ.add("FangSong_GB2312", "FangSong");
        zzzJ.add("仿宋_GB2312", "FangSong");
    }

    public static zzZYF zzHd() {
        return zzzJ;
    }

    private static void zzHe() {
        if (zzzO == null) {
            synchronized (zzzN) {
                try {
                    if (zzzO == null) {
                        zzZYI zzzyi = new zzZYI();
                        zzzO = zzzyi;
                        zzzyi.add("Courier New", 600);
                        zzzO.add("Consolas", 550);
                        zzzO.add("Lucida Console", 575);
                        zzzO.add("Arial", 100);
                        zzzO.add("Century", 100);
                        zzzO.add("Century Gothic", 100);
                        zzzO.add("SimSun", 500);
                        zzzO.add("Verdana", StyleIdentifier.GRID_TABLE_2_ACCENT_2);
                        zzzO.add("DotumChe", 500);
                        zzzO.add("Comic Sans MS", 160);
                        zzzO.add("Comic Sans MS Bold", 425);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static void zzHf() {
        zzzK.add("(Arabic)", 178);
        zzzK.add("CE", 238);
        zzzK.add("Cyr", 204);
        zzzK.add("(Vietnamese)", 163);
        zzzK.add("Western", 0);
        zzzK.add("(Hebrew)", 177);
        zzzK.add("Tur", 162);
        zzzK.add("Greek", 161);
        zzzK.add("Baltic", 186);
        zzzK.add("(Thai)", 222);
    }

    private static void zzHg() {
        zzzL.zzH("iso-8859-1", 0);
        zzzL.zzH("macintosh", 77);
        zzzL.zzH("shift_jis", 128);
        zzzL.zzH("ks_c-5601-1987", 129);
        zzzL.zzH("KS C-5601-1992", 130);
        zzzL.zzH("GBK", 134);
        zzzL.zzH("Big5", 136);
        zzzL.zzH("windows-1253", 161);
        zzzL.zzH("iso-8859-9", 162);
        zzzL.zzH("windows-1258", 163);
        zzzL.zzH("windows-1255", 177);
        zzzL.zzH("windows-1256", 178);
        zzzL.zzH("windows-1257", 186);
        zzzL.zzH("windows-1251", 204);
        zzzL.zzH("windows-874", 222);
        zzzL.zzH("windows-1250", 238);
    }

    private static void zzHh() {
        zzzM.add(1252, 0);
        zzzM.add(932, 128);
        zzzM.add(949, 129);
        zzzM.add(936, 134);
        zzzM.add(950, 136);
        zzzM.add(1253, 161);
        zzzM.add(1254, 162);
        zzzM.add(1258, 163);
        zzzM.add(1255, 177);
        zzzM.add(1256, 178);
        zzzM.add(1257, 186);
        zzzM.add(1251, 204);
        zzzM.add(874, 222);
        zzzM.add(1250, 238);
    }

    public static zzZXH zzHi() {
        try {
            zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.Fanwood.ttf");
            try {
                return new zzZXF().zzW(zzZYQ.zzZX(zzzopZzX1), (String) null);
            } finally {
                if (zzzopZzX1 != null) {
                    zzzopZzX1.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int zzP(String str, String str2) {
        int iZzZE = zzZE(str);
        return iZzZE != -1 ? iZzZE : zzZG(str2);
    }

    public static int zzWG(int i) {
        int i2 = zzzM.get(i);
        if (zzD4.zzWm(i2)) {
            return 0;
        }
        return i2;
    }

    public static String zzWH(int i) {
        return zzzL.zzO(i, "");
    }

    public static int zzWI(int i) {
        if (i < -31681 || i > 31681) {
            return 24;
        }
        if (i < 2) {
            return i < 0 ? 3276 : 2;
        }
        if (i > 3276) {
            return 3276;
        }
        return i;
    }

    public static boolean zzWJ(int i) {
        return i < 2 || i > 3276;
    }

    private static int zzX(zzPM zzpm) {
        String strZzPh = (zzpm.zzPk() & 1) == 0 ? zzpm.zzPh() : zzZKN.format("{0} Bold", zzpm.zzPh());
        String strZzPh2 = zzpm.zzPh();
        if (zzzO.containsKey(strZzPh)) {
            return zzzO.get(strZzPh);
        }
        if (zzzO.containsKey(strZzPh2)) {
            return zzzO.get(strZzPh2);
        }
        return 0;
    }

    public static boolean zzZ(zzGQ zzgq, String str) throws Exception {
        return zzgq.zzN(str, 0).zzI7();
    }

    public static boolean zzZA(String str) {
        return "Calibri".equals(str) || "Calibri Light".equals(str) || "MS Gothic".equals(str);
    }

    public static boolean zzZB(String str) {
        String[] strArr = zzzP;
        return zzZKV.zzZ(strArr, str, strArr.length) != -1;
    }

    public static boolean zzZC(String str) {
        String[] strArr = zzzQ;
        return zzZKV.zzZ(strArr, str, strArr.length) != -1;
    }

    public static boolean zzZD(String str) {
        String[] strArr = zzzR;
        return zzZKV.zzZ(strArr, str, strArr.length) != -1;
    }

    private static int zzZE(String str) {
        if (!zzZYD.zzXk(str)) {
            return -1;
        }
        int iZzXo = zzzL.zzXo(str);
        if (!zzZYJ.zzWm(iZzXo)) {
            return iZzXo;
        }
        zzZO0 zzzo0ZzZz = zzZz(str);
        if (zzzo0ZzZz != null) {
            return zzWG(zzzo0ZzZz.zzi4());
        }
        return -1;
    }

    public static String zzZF(String str) {
        String strSubstring = str.substring(zzZKN.zzV(str, " ", zzZOF.ORDINAL$4894b8c8) + 1);
        if (!zzZYD.zzXk(strSubstring) || !zzzK.containsKey(strSubstring)) {
            return str;
        }
        int length = strSubstring.length();
        return str.length() + (-1) > length ? str.substring(0, (r1 - length) - 1) : str;
    }

    public static int zzZG(String str) {
        String strSubstring = str.substring(zzZKN.zzV(str, " ", zzZOF.ORDINAL$4894b8c8) + 1);
        if (zzzK.containsKey(strSubstring)) {
            return zzzK.get(strSubstring);
        }
        int iZzTP = zzUR.zzTP(strSubstring.toUpperCase());
        if (iZzTP != 0) {
            return iZzTP != 1 ? -1 : 128;
        }
        return 129;
    }

    public static String zzZH(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(zzE(str.charAt(i)));
        }
        return sb.toString();
    }

    public static String zzZI(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(zzF(str.charAt(i)));
        }
        return sb.toString();
    }

    public static String zzZJ(String str) {
        return "Helv".equals(str) ? "Arial" : ("Tms Rmn".equals(str) || "MS Serif".equals(str)) ? "Times New Roman" : "MS Sans Serif".equals(str) ? "Microsoft Sans Serif" : "Courier".equals(str) ? "Courier New" : str;
    }

    public static boolean zzZK(String str) {
        if (zzZKN.zzX(str, "Segoe UI Symbol", zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            return false;
        }
        int i = zzZOF.ORDINAL$4894b8c8;
        return zzZKN.zzW(str, "Symbol", 0, i) >= 0 || zzZKN.zzW(str, "Webdings", 0, i) >= 0 || zzZKN.zzW(str, "Wingdings", 0, i) >= 0 || zzZKN.zzW(str, "Dingbats", 0, i) >= 0;
    }

    private static zzZO0 zzZz(String str) {
        try {
            return zzZO0.zzV3(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int zzZ(int i, zzPM zzpm, boolean z) {
        if (z) {
            zzHe();
            return (i * zzX(zzpm)) / 1000;
        }
        if (zzpm.zzP0() <= 0.5f) {
            return i / 2;
        }
        if (zzpm.zzP0() >= 1.0f) {
            return 0;
        }
        return (int) ((1.0f - zzpm.zzP0()) * i);
    }
}
