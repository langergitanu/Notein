package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2J extends zz1Z {
    private zzZYV<zz1X> zzgo;

    public zz2J(int i) {
        super(i);
        this.zzgo = new zzZYV<>();
    }

    @Override // com.aspose.words.internal.zz1Z
    public final void zzC(zzFY zzfy) throws Exception {
        zzfy.writeInt(zzw7());
        zzfy.zzFf();
        if (this.zzgo.getCount() > 0) {
            int iZzT3 = this.zzgo.zzT3(r0.getCount() - 1);
            for (int i = 0; i <= iZzT3; i++) {
                if (this.zzgo.zzVE(i)) {
                    zzfy.zzZ(this.zzgo.get(i));
                } else {
                    zzfy.zzF8();
                }
                if (i != iZzT3) {
                    zzfy.zzFh();
                }
            }
        }
        zzfy.zzFe();
    }

    public final void zzZ(int i, zz1X zz1x) {
        this.zzgo.set(i, zz1x);
    }
}
