package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZF1 {
    private static String zzU(zzZDN zzzdn) {
        if (zzzdn.zzYXj().getCount() == 0) {
            return "";
        }
        com.aspose.words.internal.zzZYT zzzyt = new com.aspose.words.internal.zzZYT();
        for (zzZDS zzzds : zzzdn.zzYXj()) {
            zzzyt.zzB(zzzds.getName(), zzzds.getValue());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zzzyt.getCount(); i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzzyt.zzV4(i));
            com.aspose.words.internal.zzZNH.zzU(sb, "=\"");
            com.aspose.words.internal.zzZNH.zzU(sb, (String) zzzyt.zzVY(i));
            com.aspose.words.internal.zzZNH.zzU(sb, "\" ");
        }
        return sb.toString();
    }

    public static void zzY(zzZDN zzzdn) {
        String text;
        StringBuilder sb = new StringBuilder();
        zzZDN zzzdn2 = null;
        String str = "";
        int i = 0;
        while (i <= zzzdn.zzYXk().getCount()) {
            zzZDN zzzdn3 = i < zzzdn.zzYXk().getCount() ? (zzZDN) com.aspose.words.internal.zzZKW.zzZ(zzzdn.zzYXk().zzyy(i), zzZDN.class) : null;
            int i2 = i + 1;
            if (zzzdn3 != null && "span".equals(zzzdn3.getName()) && zzzdn3.zzYXk().getCount() <= 1) {
                if (zzzdn3.zzYXk().getCount() == 1) {
                    zzZDI zzzdi = (zzZDI) com.aspose.words.internal.zzZKW.zzZ(zzzdn3.zzYXk().zzyy(0), zzZDI.class);
                    text = zzzdi != null ? zzzdi.getText() : null;
                } else {
                    text = "";
                }
                String strZzU = zzU(zzzdn3);
                if (text != null) {
                    if (zzzdn2 == null || !com.aspose.words.internal.zzZKN.equals(strZzU, str)) {
                        zzZ(zzzdn2, sb.toString());
                        sb.setLength(0);
                        zzzdn2 = zzzdn3;
                        i = i2;
                        str = strZzU;
                    } else {
                        zzzdn3.zzYXe().zzYXk().zzW(zzzdn3);
                    }
                    com.aspose.words.internal.zzZNH.zzU(sb, text);
                }
            }
            zzZ(zzzdn2, sb.toString());
            if (zzzdn3 != null) {
                zzY(zzzdn3);
            }
            zzzdn2 = null;
            i = i2;
        }
    }

    private static void zzZ(zzZDN zzzdn, String str) {
        if (zzzdn != null) {
            if (zzzdn.zzYXk().getCount() > 0) {
                zzzdn.zzYXk().zzW(zzzdn.zzYXk().zzyy(0));
            }
            zzzdn.zzYXk().zzX(new zzZDI(str));
        }
    }
}
