package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1L extends zz2D {
    private zz1M zzYYq;

    public zz1L(zz1M zz1m, zz89 zz89Var) {
        super(zz89Var);
        this.zzYYq = zz1m;
    }

    private byte[] zzZ(com.aspose.words.internal.zzG zzg, float f) throws Exception {
        com.aspose.words.internal.zzG zzgZzZ = zz1D.zzZ(zzg, (float) this.zzYYq.zzZPS());
        int iZzXq = zzXq(this.zzYYq.zzZPS() * ((double) (f / 96.0f)));
        if (iZzXq <= 2 && !com.aspose.words.internal.zzAN.zzS(f, 96.0f)) {
            iZzXq = zzXq(this.zzYYq.zzZPS());
            f = 96.0f;
        }
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(zzZ(zzgZzZ, f, com.aspose.words.internal.zzPV.zzIs));
        try {
            zzxn.zzZ(new com.aspose.words.internal.zzTM(com.aspose.words.internal.zzPV.zzIs, 0));
            com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn);
            zzei.zzK(iZzXq, false);
            return zzei.getImageBytes();
        } finally {
            zzxn.dispose();
        }
    }

    private byte[] zze(com.aspose.words.internal.zzG zzg) throws Exception {
        return zzZuZ().zzZFk() ? zz03.zzZ(zzt(zzg), zzXq(this.zzYYq.zzZPS()), com.aspose.words.internal.zzPV.zzKa, zzZuY()) : zzZuZ().getDmlEffectsRenderingMode() == 0 ? zzZ(zzg, 48.0f) : zzZ(zzg, 96.0f);
    }

    @Override // com.aspose.words.zz2D, com.aspose.words.zzZC1
    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        if (!com.aspose.words.internal.zzAN.zzZD(this.zzYYq.zzZPS())) {
            com.aspose.words.internal.zzG[] zzgArrZzZ = zzB0.zzZ(zzg, 32768);
            byte[] bArrZzZ = zzZ(zzgArrZzZ[0], 200.0f, com.aspose.words.internal.zzPV.zzHZ);
            if (bArrZzZ != null) {
                byte[] bArrZzZ2 = zzZ(bArrZzZ, zze(zzgArrZzZ[0]), false);
                com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZMR().zzZ((com.aspose.words.internal.zzZL) zzgArrZzZ[0]);
                com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(zzzq4ZzZ.zzZE(), zzzq4ZzZ.getSize(), bArrZzZ2);
                com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
                zzg2.zzX(zzzp);
                com.aspose.words.internal.zzG zzg3 = zzgArrZzZ[1];
                if (zzg3 != null) {
                    zzg2.zzX((com.aspose.words.internal.zzZL) zzg3);
                }
                return zzg2;
            }
        }
        return zzg;
    }

    public static byte[] zzZ(byte[] bArr, byte[] bArr2, boolean z) throws Exception {
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(bArr);
        try {
            com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(zzxn.getWidth(), zzxn.getHeight());
            try {
                zzxn = new com.aspose.words.internal.zzXN(bArr2);
                try {
                    zzxn.zzZ(new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), zzxn2, new com.aspose.words.internal.zzZQ5(0, 0, zzxn2.getWidth(), zzxn2.getHeight()));
                    zzxn.dispose();
                    com.aspose.words.internal.zzXQ zzxqZzWz = zzxn2.zzWz();
                    com.aspose.words.internal.zzXQ zzxqZzWz2 = zzxn.zzWz();
                    int iZzWP = zzxqZzWz.zzWP();
                    for (int i = 0; i < iZzWP; i++) {
                        byte bZz4 = z ? (byte) (255 - (zzxqZzWz.zz4(i) & 255)) : zzxqZzWz.zz4(i);
                        if ((zzxqZzWz2.zz4(i) & 255) > (bZz4 & 255)) {
                            zzxqZzWz2.zzL(i, bZz4);
                        }
                    }
                    zzxqZzWz.zzWQ();
                    zzxqZzWz2.zzWQ();
                    zzxn2.dispose();
                    com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                    try {
                        zzxn.zzZ(zzzor, 6);
                        return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
                    } finally {
                        zzzor.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                zzxn2.dispose();
                throw th;
            }
        } finally {
        }
    }
}
