package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzDF {
    private zzE4 zzv3;
    private zzE4 zzv4;
    private zzE4 zzv5;
    private int zzv6 = -1;
    private zzDL zzv7;

    public zzDF(zzDL zzdl) {
        this.zzv7 = zzdl;
        int iZzVM = zzdl.zzD4().zzVM(0);
        int iZzVM2 = zzdl.zzD4().zzVM(1);
        this.zzv5 = (zzE4) this.zzv7.zzD1()[iZzVM];
        this.zzv4 = (zzE4) this.zzv7.zzD1()[iZzVM2];
        int iZzVM3 = zzdl.zzD4().zzVM(3);
        this.zzv3 = iZzVM3 >= 0 ? (zzE4) this.zzv7.zzD1()[iZzVM3] : null;
    }

    public final int getCount() {
        return this.zzv5.getCount();
    }

    public final boolean moveNext() {
        int i = this.zzv6 + 1;
        this.zzv6 = i;
        return i < this.zzv7.zzD2();
    }

    public float zzDp() {
        return this.zzv4.get(this.zzv6);
    }

    public float zzDq() {
        return this.zzv5.get(this.zzv6);
    }

    public float zzDr() {
        zzE4 zze4 = this.zzv3;
        if (zze4 == null) {
            return Float.NaN;
        }
        return zze4.get(this.zzv6);
    }

    public long zzDs() {
        return zzZPY.zzG(zzDq(), zzDp());
    }
}
