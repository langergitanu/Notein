package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz4 implements zzH5 {
    private void zzZ(zzPY zzpy) throws Exception {
        if (zzpy == null) {
            return;
        }
        zzpy.zzZ(this);
    }

    public final void zzY(zzZG zzzg) throws Exception {
        if (zzzg.zzZ2() != null) {
            zzZ(zzzg.zzZ2().zzZ1());
        }
        if (zzzg.zzZ1() != null) {
            zzZ(zzzg.zzZ1());
        }
    }

    @Override // com.aspose.words.internal.zzH5
    public abstract zzPV zzZ(zzPV zzpv);

    public abstract void zzZ(zzEI zzei) throws Exception;

    @Override // com.aspose.words.internal.zzH5
    public final byte[] zzZ(byte[] bArr) throws Exception {
        try {
            zzEI zzei = new zzEI(bArr);
            try {
                zzZ(zzei);
                zzei.zzDU();
                return zzei.getImageBytes();
            } finally {
                zzei.dispose();
            }
        } catch (Exception unused) {
            return zzEF.zzDL();
        }
    }

    public final void zzY(zzZU zzzu) {
        zzzu.zzY(zzZ(zzzu.zzZy()));
        zzzu.zzX(zzZ(zzzu.zzZq()));
    }
}
