package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKK {
    private static int zzYzN = 7;
    private Object[] zzYtB = new Object[zzYzN];

    public zzZKK(byte[] bArr) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr));
        int iZzXc = zzzox.zzXc() / 6;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < iZzXc; i3++) {
            zzo(zzzox);
            int iZzo = zzo(zzzox);
            int iZzo2 = zzo(zzzox);
            zzo(zzzox);
            String strZzn = zzn(zzzox);
            zzn(zzzox);
            if (iZzo2 == 0) {
                i2 = iZzo >= i ? i2 + 1 : i2;
                com.aspose.words.internal.zzD3 zzd3 = (com.aspose.words.internal.zzD3) this.zzYtB[i2];
                if (zzd3 == null) {
                    zzd3 = new com.aspose.words.internal.zzD3();
                    this.zzYtB[i2] = zzd3;
                }
                zzd3.add(iZzo, strZzn);
                i = iZzo;
            }
        }
    }

    private static String zzn(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzXa();
        zzzox.zzXa();
        int iZzXc = zzzox.zzXc();
        byte[] bArrZzn = zzzox.zzn(iZzXc * 2);
        if (iZzXc % 2 != 0) {
            zzzox.zzq().zzH(zzzox.zzq().getPosition() + 2);
        }
        return com.aspose.words.internal.zzZO0.zzhU().zzR(bArrZzn, 0, bArrZzn.length - 2);
    }

    private static int zzo(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzXa();
        zzzox.zzXa();
        return zzzox.zzXc();
    }

    public final String zzWZ(int i, int i2) {
        com.aspose.words.internal.zzD3 zzd3 = (com.aspose.words.internal.zzD3) this.zzYtB[i];
        if (zzd3 != null) {
            return (String) zzd3.get(i2);
        }
        return null;
    }
}
