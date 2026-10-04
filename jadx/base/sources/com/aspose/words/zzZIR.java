package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIR {
    private int zzDt;
    private zzZIG zzYrw;
    private String zzkc;

    public zzZIR(zzZIG zzzig, int i) {
        this.zzYrw = zzzig;
        this.zzDt = i;
        this.zzkc = zzV(zzzig);
    }

    public static zzZIR zzKQ(String str) throws Exception {
        return zzZ(str, new zzZRE(), false, false);
    }

    private static String zzU(zzZIG zzzig) {
        zzZK9 zzzk9ZzL6;
        zzZK9 zzzk9ZzL62;
        int i;
        if (!"meta".equals(zzzig.getName()) || (zzzk9ZzL6 = zzzig.zzZ2B().zzL6("http-equiv")) == null || !com.aspose.words.internal.zzZYD.zzi(zzzk9ZzL6.getValue(), "content-language") || (zzzk9ZzL62 = zzzig.zzZ2B().zzL6(FirebaseAnalytics.Param.CONTENT)) == null) {
            return "";
        }
        String value = zzzk9ZzL62.getValue();
        int i2 = 0;
        if (com.aspose.words.internal.zzZYD.zzX(value, ",", false)) {
            return "";
        }
        int i3 = 0;
        while (i3 < value.length() && zzZDY.isWhitespace(value.charAt(i3))) {
            i3++;
        }
        while (true) {
            i = i3 + i2;
            if (i >= value.length() || zzZDY.isWhitespace(value.charAt(i))) {
                break;
            }
            i2++;
        }
        return value.substring(i3, i);
    }

    private static String zzV(zzZIG zzzig) {
        zzZE5 zzze5 = new zzZE5(zzzig);
        String str = "";
        while (zzze5.moveNext()) {
            zzZIG zzzig2 = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(zzze5.zzYXo(), zzZIG.class);
            if (zzze5.zzZou() && zzzig2 != null) {
                String strZzU = zzU(zzzig2);
                if (!com.aspose.words.internal.zzZKN.equals(strZzU, "")) {
                    str = strZzU;
                }
            }
        }
        return str;
    }

    public static zzZIR zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0, zzZRE zzzre, boolean z, boolean z2) throws Exception {
        return zzZ(new com.aspose.words.internal.zzZOO(zzzop, zzzo0), zzzre, z, z2);
    }

    public static zzZIR zzZ6(com.aspose.words.internal.zzZOP zzzop) {
        zzZIR zzzirZzYI = zzXZS.zzYI(zzzop);
        zzzirZzYI.zzYrw.zzZ0f();
        return zzzirZzYI;
    }

    public final int getMode() {
        return this.zzDt;
    }

    public final zzZIG zzZ31() {
        return this.zzYrw;
    }

    public static zzZIR zzZ(String str, zzZRE zzzre, boolean z, boolean z2) throws Exception {
        com.aspose.words.internal.zzZOM zzzom = new com.aspose.words.internal.zzZOM(str);
        try {
            return zzZ(zzzom, zzzre, z, z2);
        } finally {
            zzzom.close();
        }
    }

    private static zzZIR zzZ(com.aspose.words.internal.zzZOK zzzok, zzZRE zzzre, boolean z, boolean z2) throws Exception {
        zzZIR zzzirZzZ = zzZE6.zzZ(new zzZE8(zzzok.zziv(), zzzre), z, z2);
        zzzirZzZ.zzYrw.zzZ0f();
        return zzzirZzZ;
    }
}
