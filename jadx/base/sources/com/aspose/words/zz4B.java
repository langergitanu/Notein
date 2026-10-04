package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes6.dex */
final class zz4B {
    private static void zzY(String str, zz4G zz4g, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean zEquals = "w14:textOutline".equals(str);
        zzzydZzZlV.zzY(str);
        if ("a14:hiddenLine".equals(str)) {
            zzzydZzZlV.zz0("xmlns:a14", "http://schemas.microsoft.com/office/drawing/2010/main");
        }
        Object objZzLu = zz4g.zzLu(0);
        if (objZzLu != null) {
            zzzydZzZlV.zzP(zEquals ? "w14:w" : "w", (Double) objZzLu);
        }
        Object objZzLu2 = zz4g.zzLu(3);
        if (objZzLu2 != null) {
            zzzydZzZlV.zzA(zEquals ? "w14:cap" : "cap", zz84.zzIM(((Integer) objZzLu2).intValue()), "flat");
        }
        Object objZzLu3 = zz4g.zzLu(2);
        if (objZzLu3 != null) {
            zzzydZzZlV.zzA(zEquals ? "w14:cmpd" : "cmpd", zz84.zzIL(((Integer) objZzLu3).intValue()), "sng");
        }
        Object objZzLu4 = zz4g.zzLu(4);
        if (objZzLu4 != null) {
            zzzydZzZlV.zzA(zEquals ? "w14:algn" : "algn", ((Boolean) objZzLu4).booleanValue() ? BackupFile.EXTENSION_NOTEIN_FILE : "ctr", "ctr");
        }
        Object objZzLu5 = zz4g.zzLu(9);
        if (objZzLu5 != null) {
            zz7T.zzZ((zz7X) objZzLu5, zzzxr, zEquals);
        }
        zzZ(zz4g, zzzydZzZlV, zEquals, zzzxr.getCompliance());
        zzY(zz4g, zzzydZzZlV, zEquals, zzzxr.getCompliance());
        Object objZzLu6 = zz4g.zzLu(7);
        if (objZzLu6 != null) {
            zzZ((zz5V) objZzLu6, (zzYU6) zzzydZzZlV, true, zEquals);
        }
        Object objZzLu7 = zz4g.zzLu(8);
        if (objZzLu7 != null) {
            zzZ((zz5V) objZzLu7, (zzYU6) zzzydZzZlV, false, zEquals);
        }
        Object objZzLu8 = zz4g.zzLu(10);
        if (objZzLu8 != null) {
            zz7Z.zzZ((com.aspose.words.internal.zzZYG<zz82>) objZzLu8, zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    public static void zzZ(String str, zz4G zz4g, zzZXR zzzxr) throws Exception {
        if (zz4g == null || zz4g.zzZxz() <= 0) {
            return;
        }
        zzY(str, zz4g, zzzxr);
    }

    private static void zzZ(zz5V zz5v, zzYU6 zzyu6, boolean z, boolean z2) {
        if (zz5v == null) {
            return;
        }
        zzyu6.zzY(com.aspose.words.internal.zzZKN.format(z ? "{0}:headEnd" : "{0}:tailEnd", z2 ? "w14" : "a"));
        zzyu6.zzA(z2 ? "w14:type" : C18437z2.f56754h, zz84.zzIP(zz5v.getType()), "none");
        zzyu6.zzA(z2 ? "w14:w" : "w", zz84.zzIR(zz5v.getWidth()), "med");
        zzyu6.zzA(z2 ? "w14:len" : "len", zz84.zzIQ(zz5v.getLength()), "med");
        zzyu6.zzo();
    }

    private static void zzZ(zz4G zz4g, zzYU6 zzyu6, boolean z, int i) {
        Object objZzLu = zz4g.zzLu(5);
        if (objZzLu != null) {
            zzAX zzax = (zzAX) objZzLu;
            int iZzZEW = zzax.zzZEW();
            if (iZzZEW == 0) {
                zzZ((zzAY) zzax, zzyu6, z, i);
            } else {
                if (iZzZEW == 1) {
                    zzZ((zz3G) zzax, zzyu6, z);
                    return;
                }
                throw new IllegalArgumentException("Unexpected Dml dash type.");
            }
        }
    }

    private static void zzZ(zz3G zz3g, zzYU6 zzyu6, boolean z) {
        zzyu6.zzX(z ? "w14:prstDash" : "a:prstDash", z ? "w14:val" : "val", zz84.zzIK(zz3g.zzZwm()));
    }

    private static void zzZ(zzAY zzay, zzYU6 zzyu6, boolean z, int i) {
        boolean z2 = i == 2;
        zzyu6.zzY(z ? "w14:custDash" : "a:custDash");
        for (zzAW zzaw : zzay.zzZEX()) {
            zzyu6.zzX(z ? "w14:ds" : "a:ds", z ? "w14:d" : "d", zz3W.zzS(zzaw.zzZEV(), z2), z ? "w14:sp" : "sp", zz3W.zzS(zzaw.zzZEU(), z2));
        }
        zzyu6.zzo();
    }

    private static void zzY(zz4G zz4g, zzYU6 zzyu6, boolean z, int i) {
        boolean z2 = i == 2;
        Object objZzLu = zz4g.zzLu(6);
        if (objZzLu != null) {
            int iIntValue = ((Integer) objZzLu).intValue();
            if (iIntValue == 0) {
                zzyu6.zzZ(z ? "w14:bevel" : "a:bevel", (String) null);
                return;
            }
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    return;
                }
                zzyu6.zzZ(z ? "w14:round" : "a:round", (String) null);
            } else if (z) {
                zzyu6.zzX("w14:miter", "w14:lim", Double.valueOf(zz3W.zzXy(zz4g.zzZxG())));
            } else {
                zzyu6.zzX("a:miter", "lim", zz3W.zzS(zz4g.zzZxG(), z2));
            }
        }
    }
}
