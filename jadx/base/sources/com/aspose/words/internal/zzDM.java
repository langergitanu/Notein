package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDM implements zzGM {
    private zzP9 zzvc;
    private zzHS zzvo;
    private int zzw0 = 12700;
    private zzG zzvd = new zzG();

    private zzDM(zzHS zzhs, int i, zzP9 zzp9) {
        this.zzvo = zzhs;
        this.zzvc = zzp9;
    }

    private zzZG zzX(zzDL zzdl) {
        zzDR zze3;
        zzDZ zzdz = new zzDZ(zzdl, this.zzw0, this.zzvc);
        int iZzDK = zzdl.zzD3().zzDK();
        if (iZzDK == 0) {
            zze3 = new zzE3(zzdz, zzdl.zzD3(), this.zzvo, this.zzw0);
        } else {
            if (iZzDK != 1) {
                return null;
            }
            zze3 = new zzDN(zzdz, zzdl.zzD3(), this.zzvo, this.zzw0);
        }
        return zze3.zzDd();
    }

    public static zzG zzZ(zzDW zzdw, zzHS zzhs, zzP9 zzp9) {
        zzDM zzdm = new zzDM(zzhs, 12700, zzp9);
        zzdw.zzZ(zzdm);
        return zzdm.zzvd;
    }

    @Override // com.aspose.words.internal.zzGM
    public final void zzZ(zzDL zzdl) {
        this.zzvd.zzX(zzX(zzdl));
    }
}
