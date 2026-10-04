package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz3F extends zz3H {
    public zz3F(zzJO zzjo) {
        super(zzjo);
    }

    @Override // com.aspose.words.internal.zz3H
    public final int zzTV(int i) {
        return zzug().zzHn().zzW(i, 0).intValue();
    }

    @Override // com.aspose.words.internal.zz3H
    public final zzZYV<Integer> zzuc() {
        zzZYV<Integer> zzzyv = new zzZYV<>(zzug().zzHn().getCount());
        for (int i = 0; i < zzug().zzHn().getCount(); i++) {
            zzzyv.set(zzug().zzHn().zzVY(i).intValue(), Integer.valueOf(zzug().zzHn().zzT3(i)));
        }
        return zzzyv;
    }

    @Override // com.aspose.words.internal.zz3H
    public final zzZYV<Integer> zzud() {
        return zzug().zzTt();
    }
}
