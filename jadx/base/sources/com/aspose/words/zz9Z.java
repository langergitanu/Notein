package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18374u4;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zz9Z {
    private static com.aspose.words.internal.zzZYJ zzZ6Y = zz83.zzZ(new String[]{"parOf", "presOf", "presParOf", "unknownRelationship"}, new int[]{0, 1, 2, 3});
    private static com.aspose.words.internal.zzZYJ zzZ6X = zz83.zzZ(new String[]{"node", "asst", "doc", "pres", "parTrans", "sibTrans"}, new int[]{2, 0, 1, 4, 3, 5});
    private static com.aspose.words.internal.zzZYJ zzZ6W = zz83.zzZ(new String[]{"b", "t"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6V = zz83.zzZ(new String[]{"composite", "conn", "cycle", "hierChild", "hierRoot", "lin", "pyra", "snake", "sp", "tx"}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    private static com.aspose.words.internal.zzZYJ zzZ6U = zz83.zzZ(new String[]{"ancst", "ancstOrSelf", "ch", "des", "desOrSelf", "follow", "followSib", "none", "par", "preced", "precedSib", "root", "self"}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
    private static com.aspose.words.internal.zzZYJ zzZ6T = zz83.zzZ(new String[]{"all", "asst", "doc", "node", "nonAsst", "nonNorm", "norm", "parTrans", "pres", "sibTrans"}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    private static com.aspose.words.internal.zzZYJ zzZ6S = zz83.zzZ(new String[]{"equ", "gte", "lte", "none"}, new int[]{1, 2, 3, 0});
    private static com.aspose.words.internal.zzZYJ zzZ6R = zz83.zzZ(new String[]{"ch", "des", "self"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6Q = zz83.zzZ(new String[]{"norm", "rev"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6P = zz83.zzZ(new String[]{"hang", C18374u4.f56270c, "l", "r", "std"}, new int[]{2, 4, 0, 1, 3});
    private static com.aspose.words.internal.zzZYJ zzZ6O = zz83.zzZ(new String[]{"branch", "none", "one"}, new int[]{2, 0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6N = zz83.zzZ(new String[]{"ctr", "lvl", "none"}, new int[]{2, 1, 0});
    private static com.aspose.words.internal.zzZYJ zzZ6M = zz83.zzZ(new String[]{"exact", "rel"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6L = zz83.zzZ(new String[]{"cnt", "depth", "maxDepth", "pos", "posEven", "posOdd", "revPos", "var"}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    private static com.aspose.words.internal.zzZYJ zzZ6K = zz83.zzZ(new String[]{"animLvl", "animOne", "bulEnabled", "chMax", "chPref", "dir", "hierBranch", "none", "orgChart", "resizeHandles"}, new int[]{1, 2, 3, 4, 5, 6, 7, 0, 8, 9});
    private static com.aspose.words.internal.zzZYJ zzZ6J = zz83.zzZ(new String[]{"equ", "gt", "gte", TranslateLanguage.LITHUANIAN, "lte", "neq"}, new int[]{0, 1, 2, 3, 4, 5});
    private static com.aspose.words.internal.zzZYJ zzZ6I = zz83.zzZ(new String[]{"cycle", "repeat", "span"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6H = zz83.zzZ(new String[]{"cw", "ccw"}, new int[]{1, 0});
    private static com.aspose.words.internal.zzZYJ zzZ6G = zz83.zzZ(new String[]{"ctr", "l", "r"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6F = zz83.zzZ(new String[]{"b", "mid", "t"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6E = zz83.zzZ(new String[]{"1D", "2D"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6D = zz83.zzZ(new String[]{"ctr", "l", "none", "r"}, new int[]{0, 1, 2, 3});
    private static com.aspose.words.internal.zzZYJ zzZ6C = zz83.zzZ(new String[]{"b", "mid", "none", "t"}, new int[]{0, 1, 2, 3});
    private static com.aspose.words.internal.zzZYJ zzZ6B = zz83.zzZ(new String[]{"bal", "endCnv", "fixed"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6A = zz83.zzZ(new String[]{"ctr", "off"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6z = zz83.zzZ(new String[]{"revDir", "sameDir"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6y = zz83.zzZ(new String[]{"none", "upr", "grav"}, new int[]{0, 2, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6x = zz83.zzZ(new String[]{"l", "ctr", "r"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6w = zz83.zzZ(new String[]{"ctr", "none"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6v = zz83.zzZ(new String[]{"b", "mid", "t"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6u = zz83.zzZ(new String[]{"horz", "vert"}, new int[]{0, 1});
    private static com.aspose.words.internal.zzZYJ zzZ6t = zz83.zzZ(new String[]{"none", "alignOff", "begMarg", "bendDist", "begPad", "b", "bMarg", "bOff", "ctrX", "ctrXOff", "ctrY", "ctrYOff", "connDist", "diam", "endMarg", "endPad", C18773h.f57233c, "hArH", "hOff", "l", "lMarg", "lOff", "r", "rMarg", "rOff", "primFontSz", "pyraAcctRatio", "secFontSz", "sibSp", "secSibSp", "sp", "stemThick", "t", "tMarg", "tOff", "userA", "userB", "userC", "userD", "userE", "userF", "userG", "userH", "userI", "userJ", "userK", "userL", "userM", "userN", "userO", "userP", "userQ", "userR", "userS", "userT", "userU", "userV", "userW", "userX", "userY", "userZ", "w", "wArH", "wOff"}, new int[]{0, 1, 3, 5, 4, 2, 6, 7, 9, 10, 11, 12, 8, 13, 14, 15, 16, 17, 18, 19, 20, 21, 24, 25, 26, 22, 23, 27, 29, 28, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63});
    private static com.aspose.words.internal.zzZYJ zzZ6s = zz83.zzZ(new String[]{"1D", "2D", "cust"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6r = zz83.zzZ(new String[]{"auto", "bCtr", "bL", "bR", "ctr", "midL", "midR", "radial", "tCtr", "tL", "tR"}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    private static com.aspose.words.internal.zzZYJ zzZ6q = zz83.zzZ(new String[]{"arr", "auto", "noArr"}, new int[]{0, 1, 2});
    private static com.aspose.words.internal.zzZYJ zzZ6p = zz83.zzZ(new String[]{"bend", "curve", "longCurve", "stra"}, new int[]{0, 1, 2, 3});

    public static String zzJ4(int i) {
        return zzZ6t.zzO(i, "");
    }

    public static String zzJ5(int i) {
        return zzZ6H.zzO(i, "");
    }

    public static String zzJ6(int i) {
        return zzZ6I.zzO(i, "");
    }

    public static String zzJ7(int i) {
        return zzZ6J.zzO(i, "");
    }

    public static String zzJ8(int i) {
        return zzZ6K.zzO(i, "");
    }

    public static String zzJ9(int i) {
        return zzZ6L.zzO(i, "");
    }

    public static String zzJa(int i) {
        return zzZ6M.zzO(i, "");
    }

    public static String zzJb(int i) {
        return zzZ6N.zzO(i, "");
    }

    public static String zzJc(int i) {
        return zzZ6O.zzO(i, "");
    }

    public static String zzJd(int i) {
        return zzZ6P.zzO(i, "");
    }

    public static String zzJe(int i) {
        return zzZ6Q.zzO(i, "");
    }

    public static String zzJf(int i) {
        return zzZ6R.zzO(i, "");
    }

    public static String zzJg(int i) {
        return zzZ6S.zzO(i, "");
    }

    public static String zzJh(int i) {
        return zzZ6T.zzO(i, "");
    }

    private static String zzJi(int i) {
        return zzZ6U.zzO(i, "");
    }

    public static String zzJj(int i) {
        return zzZ6V.zzO(i, "");
    }

    public static String zzJk(int i) {
        return zzZ6W.zzO(i, "");
    }

    public static String zzJl(int i) {
        return zzZ6X.zzO(i, "");
    }

    public static String zzJm(int i) {
        return zzZ6Y.zzO(i, "");
    }

    public static int zzPK(String str) {
        return zzZ6p.zzG(str, 3);
    }

    public static int zzPL(String str) {
        return zzZ6q.zzG(str, 1);
    }

    public static int zzPM(String str) {
        return zzZ6r.zzG(str, 0);
    }

    public static int zzPN(String str) {
        return zzZ6s.zzG(str, 1);
    }

    public static int zzPO(String str) {
        return zzZ6t.zzG(str, 0);
    }

    public static int zzPP(String str) {
        return zzZ6u.zzG(str, 0);
    }

    public static int zzPQ(String str) {
        return zzZ6v.zzG(str, 1);
    }

    public static int zzPR(String str) {
        return zzZ6w.zzG(str, 1);
    }

    public static int zzPS(String str) {
        return zzZ6x.zzG(str, 1);
    }

    public static int zzPT(String str) {
        return zzZ6y.zzG(str, 2);
    }

    public static int zzPU(String str) {
        return zzZ6z.zzG(str, 1);
    }

    public static int zzPV(String str) {
        return zzZ6A.zzG(str, 1);
    }

    public static int zzPW(String str) {
        return zzZ6B.zzG(str, 1);
    }

    public static int zzPX(String str) {
        return zzZ6C.zzG(str, 2);
    }

    public static int zzPY(String str) {
        return zzZ6D.zzG(str, 2);
    }

    public static int zzPZ(String str) {
        return zzZ6E.zzG(str, 0);
    }

    public static String zzQ(zz5A zz5a) {
        zz58 zz58Var = (zz58) com.aspose.words.internal.zzZKW.zzZ(zz5a, zz58.class);
        if (zz58Var != null) {
            return zz58Var.toString();
        }
        zz59 zz59Var = (zz59) com.aspose.words.internal.zzZKW.zzZ(zz5a, zz59.class);
        if (zz59Var == null) {
            return "";
        }
        return "{" + zz59Var.toString().toUpperCase() + "}";
    }

    public static int zzQ0(String str) {
        return zzZ6F.zzG(str, 0);
    }

    public static int zzQ1(String str) {
        return zzZ6G.zzG(str, 0);
    }

    public static int zzQ2(String str) {
        return zzZ6H.zzG(str, 1);
    }

    public static int zzQ3(String str) {
        return zzZ6I.zzG(str, 2);
    }

    public static int zzQ4(String str) {
        return zzZ6J.zzG(str, 0);
    }

    public static int zzQ5(String str) {
        return zzZ6K.zzG(str, 0);
    }

    public static int zzQ6(String str) {
        return zzZ6L.zzG(str, 0);
    }

    public static boolean zzQ7(String str) {
        return !com.aspose.words.internal.zzZYJ.zzWm(zzZ6M.zzXo(str));
    }

    public static int zzQ8(String str) {
        return zzZ6M.zzG(str, 1);
    }

    public static boolean zzQ9(String str) {
        return !com.aspose.words.internal.zzZYJ.zzWm(zzZ6N.zzXo(str));
    }

    public static int zzQa(String str) {
        return zzZ6N.zzG(str, 0);
    }

    public static boolean zzQb(String str) {
        return !com.aspose.words.internal.zzZYJ.zzWm(zzZ6O.zzXo(str));
    }

    public static int zzQc(String str) {
        return zzZ6O.zzG(str, 1);
    }

    public static boolean zzQd(String str) {
        return !com.aspose.words.internal.zzZYJ.zzWm(zzZ6P.zzXo(str));
    }

    public static int zzQe(String str) {
        return zzZ6P.zzG(str, 3);
    }

    public static boolean zzQf(String str) {
        return !com.aspose.words.internal.zzZYJ.zzWm(zzZ6Q.zzXo(str));
    }

    public static int zzQg(String str) {
        return zzZ6Q.zzG(str, 0);
    }

    public static int zzQh(String str) {
        return zzZ6R.zzG(str, 2);
    }

    public static int zzQi(String str) {
        return zzZ6S.zzG(str, 0);
    }

    public static int[] zzQj(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR);
        int[] iArr = new int[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            iArr[i] = zzQk(strArrZzR[i]);
        }
        return iArr;
    }

    public static int zzQk(String str) {
        return zzZ6T.zzG(str, 0);
    }

    public static int[] zzQl(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR);
        int[] iArr = new int[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            iArr[i] = zzQm(strArrZzR[i]);
        }
        return iArr;
    }

    private static int zzQm(String str) {
        return zzZ6U.zzG(str, 7);
    }

    public static int zzQn(String str) {
        return zzZ6V.zzG(str, 0);
    }

    public static int zzQo(String str) {
        return zzZ6W.zzG(str, 0);
    }

    public static int zzQp(String str) {
        return zzZ6X.zzG(str, 2);
    }

    public static int zzQq(String str) {
        return zzZ6Y.zzG(str, 0);
    }

    public static zz5A zzQr(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(str);
        return iZzZo == Integer.MIN_VALUE ? new zz59(new com.aspose.words.internal.zzZOZ(str)) : new zz58(iZzZo);
    }

    public static int[] zzQs(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR);
        int[] iArr = new int[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            iArr[i] = com.aspose.words.internal.zzJB.zzZv(strArrZzR[i]);
        }
        return iArr;
    }

    public static boolean[] zzQt(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR);
        boolean[] zArr = new boolean[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            zArr[i] = com.aspose.words.internal.zzO.zzN(strArrZzR[i]);
        }
        return zArr;
    }

    public static String zzY(boolean[] zArr) {
        StringBuilder sb = new StringBuilder();
        for (boolean z : zArr) {
            com.aspose.words.internal.zzZNH.zzU(sb, z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
            sb.append(ControlChar.SPACE_CHAR);
        }
        return com.aspose.words.internal.zzZKN.zzTX(sb.toString());
    }

    public static String zzx(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzJh(i));
            sb.append(ControlChar.SPACE_CHAR);
        }
        return com.aspose.words.internal.zzZKN.zzTX(sb.toString());
    }

    public static String zzy(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzJi(i));
            sb.append(ControlChar.SPACE_CHAR);
        }
        return com.aspose.words.internal.zzZKN.zzTX(sb.toString());
    }

    public static String zzz(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(i);
            sb.append(ControlChar.SPACE_CHAR);
        }
        return com.aspose.words.internal.zzZKN.zzTX(sb.toString());
    }
}
