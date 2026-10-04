package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZR implements zzFT {
    private int zzdh;
    private Object zzdi;
    private Object zzdj;

    public zzZZR() {
    }

    public static zzZZR zzj(Object obj) {
        return new zzZZR(obj, obj);
    }

    @Override // com.aspose.words.internal.zzFT
    public final int zzEU() {
        return this.zzdh;
    }

    @Override // com.aspose.words.internal.zzFT
    public final Object zzEV() {
        return this.zzdi;
    }

    @Override // com.aspose.words.internal.zzFT
    public final Object zzEW() {
        return this.zzdj;
    }

    public final void zzh(Object obj) {
        this.zzdi = obj;
    }

    public final void zzi(Object obj) {
        this.zzdj = obj;
    }

    public final boolean zzrP() {
        return zzZKO.equals(this.zzdj, this.zzdi);
    }

    public final void zzrQ() {
        this.zzdh = 1;
    }

    public zzZZR(Object obj) {
        this.zzdj = obj;
    }

    public zzZZR(Object obj, boolean z) {
        this.zzdj = obj;
        if (z) {
            this.zzdh = 2;
        }
    }

    private zzZZR(Object obj, Object obj2) {
        this.zzdj = obj;
        this.zzdi = obj2;
    }

    public zzZZR(zzZZR zzzzr) {
        this.zzdj = zzzzr.zzdj;
        this.zzdi = zzzzr.zzdi;
        this.zzdh = zzzzr.zzdh;
    }
}
