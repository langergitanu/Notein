package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2Y extends zzAX {
    private boolean zzhh;
    private int zzhi = -1;
    private zz5V zzhj;

    public zz2Y(zz5V zz5v) {
        this.zzhj = zz5v;
    }

    private boolean zzX(zzB6 zzb6) {
        return (zzb6.getOutlineLevel() == 9 || this.zzhh) ? false : true;
    }

    private static boolean zzY(zzB3 zzb3) {
        zzB1 zzb1;
        zzB2 zzb2;
        return (zzb3.getCount() == 0 || (zzb1 = (zzB1) zzZKW.zzZ(zzb3.zzVl(0), zzB1.class)) == null || zzb1.getCount() == 0 || (zzb2 = (zzB2) zzZKW.zzZ(zzb1.zzVl(0), zzB2.class)) == null || zzb2.zzBy() || zzb2.zzBz()) ? false : true;
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBD zzbd) {
        if (zzZYD.zzXk(zzbd.zzBC())) {
            return;
        }
        this.zzhj.zzwq();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzB3 zzb3) {
        if (!zzZYD.zzXk(zzb3.zzBC())) {
            this.zzhj.zzwp();
        }
        if (zzY(zzb3)) {
            this.zzhj.zzwn();
        }
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBB zzbb) {
        if (zzZYD.zzXk(zzbb.zzBC())) {
            return;
        }
        this.zzhj.zzwo();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzB6 zzb6) {
        if (zzX(zzb6)) {
            if (zzb6.getOutlineLevel() > this.zzhi && zzb6.getOutlineLevel() != this.zzhi + 1) {
                this.zzhj.zzwm();
                this.zzhh = true;
            }
            this.zzhi = zzb6.getOutlineLevel();
        }
    }
}
