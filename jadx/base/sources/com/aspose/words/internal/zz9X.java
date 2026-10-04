package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9X extends zzA0 {
    public zz9X(zzA1 zza1) {
        super(zza1, false);
    }

    private static zzG zzZ(byte[] bArr, long j) {
        zzZP zzzp = new zzZP(0L, j, bArr);
        zzG zzg = new zzG();
        zzg.zzX(zzzp);
        return zzg;
    }

    private static long zzZL(long j) {
        int i = (int) j;
        boolean zZzf = zzAN.zzf(Float.intBitsToFloat(i));
        boolean zZzf2 = zzAN.zzf(zzZPW.zzYz(j));
        return (!zZzf || zZzf2) ? (zZzf || !zZzf2) ? zZzf ? zzZPW.zzG(96.0f, 96.0f) : j : zzZPW.zzG(Float.intBitsToFloat(i), Float.intBitsToFloat(i)) : zzZPW.zzG(zzZPW.zzYz(j), zzZPW.zzYz(j));
    }

    @Override // com.aspose.words.internal.zzA0
    public final zzG zzAb() throws Exception {
        try {
            long jZzZL = zzZL(zzZPW.zzG(zzA8().getHorizontalResolution(), zzA8().getVerticalResolution()));
            zzA8().zzR1().zzH(0L);
            byte[] bArrZzZ = zzXM.zzZ(zzA8().zzR1(), jZzZL, zzKp().zzMk());
            long jZzYA = zzZPX.zzYA(zzEF.zzZT(bArrZzZ).getSize());
            zzG zzgZzZ = zzZ(bArrZzZ, jZzYA);
            zzgZzZ.zzW(zzP9.zzZ(new zzZQ4(0L, jZzYA), zzZQ4.zzN(zzA8().zzyQ())));
            return zzgZzZ;
        } catch (Exception e) {
            zzKp().zzI().zzZ(2, 3, "GDI+ failed to process the metafile: {0}", e.getMessage());
            zzZR(true);
            byte[] bArrZzDL = zzEF.zzDL();
            return zzZ(bArrZzDL, zzZPX.zzYA(zzEF.zzZT(bArrZzDL).getSize()));
        }
    }
}
