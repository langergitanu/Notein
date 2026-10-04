package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNK extends zzNM {
    private zzN6 zzFz;

    public zzNK(byte[] bArr, zzN6 zzn6) {
        super(bArr);
        this.zzFz = zzn6;
    }

    @Override // com.aspose.words.internal.zzNM
    public final zzZL zzME() throws Exception {
        zzA6 zza6 = new zzA6(this.zzFz.zzKp().zzAt().zzFE());
        zza6.setRenderingMode(1);
        zza6.setEmfPlusDualRenderingMode(1);
        zza6.setEmulateRasterOperations(this.zzFz.zzKp().getEmulateRasterOperations());
        zzA3 zza3ZzZ = zzA3.zzZ(new zz8T(getBytes()), zza6, 0L);
        zzG zzgZzAj = zza3ZzZ.zzAj();
        if (zzgZzAj.zzZO() == null) {
            OooO0O0.OooO00o(zzgZzAj);
        }
        zzgZzAj.zzZO().zzZ(zzP9.zzZ(zza3ZzZ.zzAg().zzzh(), zzZQ4.zzN(zza3ZzZ.zzAg().zzyQ())), 0);
        if (zza3ZzZ.zzML()) {
            this.zzFz.zz1("Embedded metafile contains not supported records.");
        }
        return zzgZzAj;
    }
}
