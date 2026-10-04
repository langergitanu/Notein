package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zz1K {
    private HashMap<zzOH, byte[]> zzfJ = new HashMap<>();

    private static byte[] zzS(zzOH zzoh) throws Exception {
        zzXN zzxn = new zzXN(zzoh);
        try {
            zzZOR zzzor = new zzZOR();
            try {
                zzxn.zzZ(zzzor, 6);
                return zzZYQ.zzZX(zzzor);
            } finally {
                zzzor.close();
            }
        } finally {
            zzxn.dispose();
        }
    }

    private byte[] zzT(zzOH zzoh) {
        byte[] bArr = (byte[]) zzQW.zzZ(this.zzfJ, zzoh);
        if (bArr != null) {
            return bArr;
        }
        for (Map.Entry<zzOH, byte[]> entry : this.zzfJ.entrySet()) {
            if (zzZ(entry.getKey(), zzoh)) {
                return entry.getValue();
            }
        }
        return null;
    }

    private static boolean zzU(zzOH zzoh) {
        return (zzoh.zzNf() != -3.4028235E38f && zzoh.zzNf() < 1.0f) || zzoh.zzNe() != null;
    }

    private static boolean zzV(zzOH zzoh) throws Exception {
        int iZzZU = zzEF.zzZU(zzoh.getImageBytes());
        zzEG zzegZzO = zzEF.zzO(zzoh.getImageBytes(), iZzZU);
        if (zzEF.zzVW(iZzZU) || zzU(zzoh)) {
            return true;
        }
        return zzZ(zzoh.zzNd(), zzegZzO);
    }

    private static boolean zzY(zzPV[] zzpvArr, zzPV[] zzpvArr2) {
        if (zzpvArr == null && zzpvArr2 == null) {
            return true;
        }
        if (zzpvArr == null || zzpvArr2 == null || zzpvArr.length != zzpvArr2.length) {
            return false;
        }
        for (int i = 0; i < zzpvArr.length; i++) {
            if (!zzPV.zzZ(zzpvArr[i], zzpvArr2[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZ(zzZQ4 zzzq4, zzEG zzeg) {
        if (zzzq4.isEmpty()) {
            return false;
        }
        return (zzzq4.zzZm() == 0.0f && zzzq4.zzZo() == 0.0f && zzzq4.getWidth() == ((float) zzeg.getWidth()) && zzzq4.getHeight() == ((float) zzeg.getHeight())) ? false : true;
    }

    public final zzOH zzW(zzOH zzoh) throws Exception {
        if (!zzV(zzoh)) {
            return zzoh;
        }
        byte[] bArrZzT = zzT(zzoh);
        if (bArrZzT == null) {
            bArrZzT = zzS(zzoh);
            this.zzfJ.put(zzoh, bArrZzT);
        }
        return zzZ(zzoh, bArrZzT);
    }

    private static boolean zzW(zzZQ4 zzzq4, zzZQ4 zzzq42) {
        if (zzzq4.isEmpty() && zzzq42.isEmpty()) {
            return true;
        }
        return zzZQ4.zzV(zzzq4, zzzq42);
    }

    private static boolean zzZ(zzOH zzoh, zzOH zzoh2) {
        if (zzoh == zzoh2) {
            return true;
        }
        return zzoh.getImageBytes() == zzoh2.getImageBytes() && zzoh.zzNf() == zzoh2.zzNf() && zzY(zzoh.zzNe(), zzoh2.zzNe()) && zzW(zzoh.zzNd(), zzoh2.zzNd());
    }

    private static zzOH zzZ(zzOH zzoh, byte[] bArr) {
        zzOH zzoh2 = new zzOH(bArr, zzoh.zzNa());
        zzoh2.zzL(zzoh.zzNb());
        return zzoh2;
    }
}
