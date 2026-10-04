package com.aspose.words;

import com.microsoft.identity.client.internal.MsalUtils;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zzEW {
    private static com.aspose.words.internal.zzZNR zzZcy = new com.aspose.words.internal.zzZNR("K|[ghHmst]{1,2}|z{1,3}|[dM]{1,4}|y{1,5}|[fF]{1,7}");
    private static com.aspose.words.internal.zzZNR zzZcx = new com.aspose.words.internal.zzZNR("%");
    private static com.aspose.words.internal.zzZNR zzZcw = new com.aspose.words.internal.zzZNR("(h{1,2}([-\\$\\+\\(:\\^'\\{<=/\\)!&~}>\\s]|(\".*\")|(\\\\\\S))*)(M{1,2})", 0);
    private static com.aspose.words.internal.zzZNR zzZcv = new com.aspose.words.internal.zzZNR("(M{1,2})(([-\\$\\+\\(:\\^'\\{<=/\\)!&~}>\\s]|(\".*\")|(\\\\\\S))*s{1,2})");
    private static com.aspose.words.internal.zzZNR zzZcu = new com.aspose.words.internal.zzZNR("(\".*\")|(\\\\\\S)", 0);
    private static com.aspose.words.internal.zzZNR zzZct = new com.aspose.words.internal.zzZNR("\\[\\$-\\w*\\]");
    private static com.aspose.words.internal.zzZNR zzZcs = new com.aspose.words.internal.zzZNR("\\[\\W*\\w*\\]");
    private static com.aspose.words.internal.zzZNR zzZcr = new com.aspose.words.internal.zzZNR("\\[\\$-F800]");
    private static com.aspose.words.internal.zzZNR zzZcq = new com.aspose.words.internal.zzZNR("\\[\\$-F400]");

    private static String zzD(String str, boolean z) {
        com.aspose.words.internal.zzZNR zzznr = z ? zzZcw : zzZcv;
        int i = z ? 5 : 1;
        com.aspose.words.internal.zzZNT zzzntZzUX = zzznr.zzUX(str);
        if (!com.aspose.words.internal.zzZYD.zzXk(zzzntZzUX.getValue())) {
            return str;
        }
        String strOooO00o = OooO0O0.OooO00o(zzzntZzUX, i);
        return str.replace(zzzntZzUX.getValue(), zzzntZzUX.getValue().replace(strOooO00o, strOooO00o.toLowerCase()));
    }

    public static boolean zzRq(String str) {
        if (zzRu(str)) {
            return false;
        }
        return zzZcx.zzUV(zzZcu.zzZS(str, ""));
    }

    public static boolean zzRr(String str) {
        if (!zzRs(str) || str.contains("d") || str.contains("y")) {
            return false;
        }
        int i = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzT(str, C18773h.f57233c, i) >= 0 || com.aspose.words.internal.zzZKN.zzT(str, "s", i) >= 0;
    }

    public static boolean zzRs(String str) {
        if (zzRu(str)) {
            return false;
        }
        return zzZcy.zzUV(zzZcu.zzZS(str, ""));
    }

    public static String zzRt(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return str;
        }
        if (com.aspose.words.internal.zzZYD.zzi(str, "general") || com.aspose.words.internal.zzZYD.zzi(str, "standard") || com.aspose.words.internal.zzZYD.zzi(str, "estandar") || com.aspose.words.internal.zzZYD.zzi(str, "standaard")) {
            return "general";
        }
        String strZzN = com.aspose.words.internal.zzZNR.zzN(com.aspose.words.internal.zzZNR.zzN(com.aspose.words.internal.zzZNR.zzN(com.aspose.words.internal.zzZNR.zzN(com.aspose.words.internal.zzZNR.zzN(str, "\\[([Bb]lack|[Ww]hite|[Rr]ed|[Gg]reen|[Bb]lue|[Yy]ellow|[Mm]agenta|[Cc]yan)\\]", ""), "\\[([Cc]olor\\s*\\d+)\\]", ""), "\\[(\\#\\d+)\\]", ""), "\\[\\$(\\S{1})-\\d+\\]", "$1").replace(MsalUtils.QUERY_STRING_SYMBOL, "#"), "\\*.", "");
        return com.aspose.words.internal.zzZNR.zzN("@".equals(strZzN) ? "" : strZzN, "_.", " ");
    }

    public static boolean zzRu(String str) {
        return !com.aspose.words.internal.zzZYD.zzXk(str) || com.aspose.words.internal.zzZYD.zzi(str, "general");
    }

    public static String zzRv(String str) {
        return com.aspose.words.internal.zzZYD.zzi(str, "m/d/yyyy") ? com.aspose.words.internal.zzZXR.zzpZ().zzjc().getShortDatePattern() : str;
    }

    public static String zzRw(String str) {
        return zzZcs.zzZS(zzZct.zzZS(str, "").replace("[$]", ""), "").replace(";@", "");
    }

    public static String zzRx(String str) {
        String strReplace = zzD(zzD(com.aspose.words.internal.zzZKN.zzZ(str, 'm', 'M'), true), false).replace("AM/PM", "tt");
        if (zzZcr.zzUV(strReplace)) {
            return "D";
        }
        if (zzZcq.zzUV(strReplace)) {
            return "T";
        }
        String strReplace2 = strReplace.replace("g", "");
        if (!strReplace2.contains("tt")) {
            strReplace2 = com.aspose.words.internal.zzZKN.zzZ(strReplace2, 'h', 'H');
        }
        return zzRw(strReplace2);
    }

    public static com.aspose.words.internal.zzZP1 zzVq(String str) {
        com.aspose.words.internal.zzZP1 zzzp1ZzpZ = com.aspose.words.internal.zzZP1.zzpZ();
        com.aspose.words.internal.zzZNT zzzntZzUX = zzZct.zzUX(str);
        if (zzzntZzUX.getLength() != 0) {
            int iZzVU = com.aspose.words.internal.zzZQB.zzVU(com.aspose.words.internal.zzZNR.zzN(zzzntZzUX.getValue(), "\\[\\$(\\w*)-", "0x").replace("]", ""));
            if (zzZ3X.isDefined(iZzVU)) {
                return com.aspose.words.internal.zzZP1.zzQQ(iZzVU);
            }
        }
        return zzzp1ZzpZ;
    }

    public static String zzZ(String str, boolean z, String str2, String str3) {
        return (zzRu(str) || z) ? str2 == null ? str3 : str2 : str;
    }
}
