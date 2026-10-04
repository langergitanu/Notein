package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYX0 {
    private String zzZh;
    private String zzZpX;

    private zzYX0(String str, String str2) {
        this.zzZpX = str;
        this.zzZh = str2;
    }

    private static String zzE(zzL4 zzl4) {
        if (zzl4.getValueType() == 0) {
            return com.aspose.words.internal.zzZKN.zzU2(((zzOT) zzl4).getValue());
        }
        return null;
    }

    private static String zzF(zzL4 zzl4) {
        if (zzl4.getValueType() == 6) {
            return ((zzL6) zzl4).getValue();
        }
        return null;
    }

    private static zzYX0 zzG(zzL4 zzl4) {
        String strZzE = zzE(zzl4);
        if (strZzE != null) {
            return new zzYX0("", strZzE);
        }
        return null;
    }

    public static zzYX0 zzR(zzMP zzmp) {
        int count = zzmp.getCount();
        if (count == 1) {
            return zzG(zzmp.zzMl(0));
        }
        if (count != 2) {
            return null;
        }
        zzYX0 zzyx0ZzV = zzV(zzmp.zzMl(0), zzmp.zzMl(1));
        return zzyx0ZzV == null ? zzV(zzmp.zzMl(1), zzmp.zzMl(0)) : zzyx0ZzV;
    }

    private static zzYX0 zzV(zzL4 zzl4, zzL4 zzl42) {
        String strZzE;
        String strZzF = zzF(zzl4);
        if (strZzF == null || (strZzE = zzE(zzl42)) == null) {
            return null;
        }
        return new zzYX0(strZzF, strZzE);
    }

    public boolean equals(Object obj) {
        zzYX0 zzyx0 = (zzYX0) com.aspose.words.internal.zzZKW.zzZ(obj, zzYX0.class);
        return !com.aspose.words.internal.zzZKO.zzA(zzyx0, null) && com.aspose.words.internal.zzZKN.equals(this.zzZpX, zzyx0.zzZpX) && com.aspose.words.internal.zzZKN.equals(this.zzZh, zzyx0.zzZh);
    }

    public final String getId() {
        return this.zzZh;
    }

    public final String getUrl() {
        return this.zzZpX;
    }

    public int hashCode() {
        int iHashCode = ((this.zzZpX == null ? 0 : r0.hashCode()) - 139452514) * (-1521134295);
        String str = this.zzZh;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
