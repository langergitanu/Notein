package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzY {
    private boolean zzV;

    public zzY(boolean z) {
        this.zzV = z;
    }

    public static String zzV(int i) {
        String strZzS7 = zzZVS.zzS7(i);
        return zzZKN.format("{0}{1}", zzJB.zzWu(strZzS7.charAt(0)), strZzS7.length() > 1 ? zzJB.zzWu(strZzS7.charAt(1)) : "");
    }

    public static void zzY(zzZOP zzzop, String str) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            zzzop.writeByte((byte) str.charAt(i));
        }
        zzzop.writeByte((byte) 13);
        zzzop.writeByte((byte) 10);
    }

    public abstract void zzZ(zzZOP zzzop) throws Exception;

    public final void zzZ(zzZOP zzzop, String str) throws Exception {
        zzY(zzzop, "/CIDInit /ProcSet findresource begin");
        zzY(zzzop, "11 dict begin");
        zzY(zzzop, "begincmap");
        zzY(zzzop, "/CIDSystemInfo");
        zzY(zzzop, "<< /Registry (Adobe)");
        zzY(zzzop, "/Ordering (UCS)");
        zzY(zzzop, "/Supplement 0");
        zzY(zzzop, ">> def");
        zzZ(zzzop, "/CMapName /{0} def", str);
        zzZ(zzzop, "/CMapType {0} def", this.zzV ? "2" : "1");
        zzY(zzzop, "1 begincodespacerange");
        zzY(zzzop, "<0000><FFFF>");
        zzY(zzzop, "endcodespacerange");
        zzZ(zzzop);
        zzY(zzzop, "endcmap");
        zzY(zzzop, "CMapName currentdict /CMap defineresource pop");
        zzY(zzzop, "end");
        zzY(zzzop, "end");
    }

    public static void zzZ(zzZOP zzzop, String str, String str2) throws Exception {
        zzY(zzzop, zzZKN.format(str, str2));
    }

    public static void zzZ(zzZOP zzzop, String str, String str2, String str3) throws Exception {
        zzY(zzzop, zzZKN.format(str, str2, str3));
    }

    public static String zzZ(int[] iArr) {
        if (iArr.length == 1) {
            return zzV(iArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            zzZNH.zzU(sb, zzV(i));
        }
        return sb.toString();
    }
}
