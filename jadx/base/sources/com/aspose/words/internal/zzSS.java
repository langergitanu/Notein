package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSS extends zzJ1 {
    public boolean zzPg;
    public byte[] zzPh;
    public byte[] zzPi;

    private static int zzS(short s) {
        int i = zzXU.zzZ(s, (short) 1) ? 4 : 2;
        return zzXU.zzZ(s, (short) 8) ? i + 2 : zzXU.zzZ(s, (short) 64) ? i + 4 : zzXU.zzZ(s, (short) 128) ? i + 8 : i;
    }

    public static zzSS zzX(zzY0 zzy0) throws Exception {
        zzSS zzss = new zzSS();
        short sZzXa = zzy0.zzXa();
        zzss.zzz1 = sZzXa;
        if (sZzXa >= 0) {
            throw new IllegalStateException("Invalid contours number.");
        }
        zzss.zzBm = zzy0.zzXa();
        zzss.zzBl = zzy0.zzXa();
        zzss.zzBk = zzy0.zzXa();
        zzss.zzBj = zzy0.zzXa();
        zzss.zzW(zzy0);
        if (zzss.zzPg) {
            zzss.zzPh = zzy0.zzn(zzy0.zzX9() & 65535);
        }
        return zzss;
    }

    public final void zzW(zzY0 zzy0) throws Exception {
        short sZzX9;
        zzZOR zzzor = new zzZOR();
        try {
            zzXZ zzxz = new zzXZ(zzzor);
            do {
                sZzX9 = zzy0.zzX9();
                short sZzX92 = zzy0.zzX9();
                byte[] bArrZzn = zzy0.zzn(zzS(sZzX9));
                zzxz.zzi(sZzX9 & 65535);
                zzxz.zzi(sZzX92 & 65535);
                zzxz.zzW(bArrZzn, bArrZzn.length);
            } while (zzXU.zzZ(sZzX9, (short) 32));
            this.zzPg = zzXU.zzZ(sZzX9, (short) 256);
            this.zzPi = zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    @Override // com.aspose.words.internal.zzJ1
    public final void zzX(zzXZ zzxz) throws Exception {
        super.zzX(zzxz);
        byte[] bArr = this.zzPi;
        zzxz.zzW(bArr, bArr.length);
        if (this.zzPg) {
            zzxz.zzi(this.zzPh.length);
            byte[] bArr2 = this.zzPh;
            zzxz.zzW(bArr2, bArr2.length);
        }
    }
}
