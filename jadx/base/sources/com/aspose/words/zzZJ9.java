package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJ9 {
    public static void zzY(zzZDN zzzdn) {
        zzZ(zzzdn, false);
    }

    private static void zzZ(zzZDN zzzdn, boolean z) {
        Iterator<zzZDK> it = zzzdn.zzYXk().iterator();
        while (it.hasNext()) {
            zzZDN zzzdn2 = (zzZDN) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZDN.class);
            if (zzzdn2 != null) {
                zzZ(zzzdn2, true);
            }
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = "";
        while (i <= zzzdn.zzYXk().getCount()) {
            String strZzZ = i < zzzdn.zzYXk().getCount() ? zzZ(zzzdn.zzYXk().zzyy(i)) : "";
            if (com.aspose.words.internal.zzZKN.equals(strZzZ, str)) {
                i2++;
            } else {
                if (!com.aspose.words.internal.zzZKN.equals(str, "") && i2 > 1) {
                    zzZ(zzzdn.zzYXk(), i3, i2);
                    if (i3 == 0 && i2 == zzzdn.zzYXk().getCount() && z) {
                        zzzdn.zzYXj().remove("dir");
                        zzzdn.zzYXj().zzZ(new zzZDQ("dir", str));
                    } else {
                        zzZ(zzzdn.zzYXk(), i3, i2, str);
                        i = i3 + 1;
                    }
                }
                i3 = i;
                i2 = 1;
                str = strZzZ;
            }
            i++;
        }
    }

    private static String zzZ(zzZDK zzzdk) {
        zzZDN zzzdn = (zzZDN) com.aspose.words.internal.zzZKW.zzZ(zzzdk, zzZDN.class);
        return zzzdn != null ? zzzdn.getAttributeValue("dir", "") : "";
    }

    private static void zzZ(zzZAP zzzap, int i, int i2, String str) {
        zzzap.zzF("span", i, i2).zzYXj().zzZ(new zzZDQ("dir", str));
    }

    private static void zzZ(zzZAP zzzap, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            zzZDN zzzdn = (zzZDN) com.aspose.words.internal.zzZKW.zzZ(zzzap.zzyy(i + i3), zzZDN.class);
            if (zzzdn != null && zzzdn.getRole() != 1) {
                zzzdn.zzYXj().remove("dir");
            }
        }
    }
}
