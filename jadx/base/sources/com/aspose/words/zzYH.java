package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH {
    private static byte[] zzZCW = {18, 21, 16, 17, 15, 26, 27, 24, 25, 22, 12, 13, 14};
    private com.aspose.words.internal.zzD3<zzYI> zzZCY = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzDB zzZCX = new com.aspose.words.internal.zzDB();

    public zzYH() {
        zz9u();
    }

    private zzYI zzZ(String str, int i, byte b) {
        zzYI zzyiZzo = this.zzZCY.get(b);
        if (zzyiZzo == null) {
            zzyiZzo = zzZ2A.zzo(b);
        }
        if (zzyiZzo.zzf(str, i)) {
            this.zzZCY.set(b, null);
            return zzyiZzo;
        }
        this.zzZCY.set(b, zzyiZzo);
        return null;
    }

    public final void zz9u() {
        if (this.zzZCX.getCount() == zzZCW.length) {
            return;
        }
        this.zzZCX.clear();
        for (byte b : zzZCW) {
            this.zzZCX.add(b);
        }
    }

    public final zzYI zza(String str, int i) {
        for (int i2 = 0; i2 < this.zzZCX.getCount(); i2++) {
            zzYI zzyiZzZ = zzZ(str, i, (byte) this.zzZCX.get(i2));
            if (zzyiZzZ != null) {
                return zzyiZzZ;
            }
        }
        return null;
    }

    public final void zzy(byte b) {
        this.zzZCX.zzVG(b);
    }
}
