package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzE {
    public static byte[] zzZ(zzG zzg, float f, zzPV zzpv, int i, zzJ8 zzj8, zzZQ4 zzzq4) throws Exception {
        zzG zzg2 = (zzG) zzg.zz1();
        new zzZE().zzZ(zzg2, i, 1);
        zzH zzh = new zzH();
        if (zzzq4.isEmpty()) {
            zzzq4 = zzh.zzZ((zzZL) zzg2);
        }
        return zzZ(zzg2, zzzq4, f, zzpv, zzj8);
    }

    public static byte[] zzZ(zzG zzg, float f, zzPV zzpv, int i, zzH6 zzh6, zzZQ4 zzzq4) throws Exception {
        return zzZ(zzg, f, zzpv, i, new zzJ8(zzh6), zzzq4);
    }

    public static byte[] zzZ(zzZL zzzl, zzZQ4 zzzq4, float f, zzH6 zzh6) throws Exception {
        return zzZ((zzG) zzzl.zz1(), zzzq4, f, null, new zzJ8(zzh6));
    }

    private static byte[] zzZ(zzG zzg, zzZQ4 zzzq4, float f, zzPV zzpv, zzJ8 zzj8) throws Exception {
        double d = f;
        int iZzW = zzSA.zzW(zzzq4.getWidth(), d);
        int iZzW2 = zzSA.zzW(zzzq4.getHeight(), d);
        if (iZzW == 0 || iZzW2 == 0) {
            return null;
        }
        if (zzg.zzZO() == null) {
            OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzY(-zzzq4.getX(), -zzzq4.getY(), 1);
        zzXN zzxn = new zzXN(iZzW, iZzW2, f, f);
        try {
            zzIY zziy = new zzIY(zzxn);
            if (zzpv != null) {
                try {
                    zziy.zzZ(zzpv, zzxn.getWidth(), zzxn.getHeight());
                } catch (Throwable th) {
                    zziy.dispose();
                    throw th;
                }
            }
            zziy.zzGF();
            zzj8.zzZ(zzg, zziy);
            zziy.dispose();
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
}
