package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz3G extends zz3H {
    public zz3G(zzJO zzjo) {
        super(zzjo);
    }

    @Override // com.aspose.words.internal.zz3H
    public final int zzTV(int i) {
        if (zzug().zzPl().zzpC().zzVE(i)) {
            return zzug().zzPl().zzpC().get(i).intValue();
        }
        return 0;
    }

    @Override // com.aspose.words.internal.zz3H
    public final zzZYV<Integer> zzuc() {
        zzZYV<Integer> zzzyv = new zzZYV<>(zzug().zzHn().getCount());
        for (int i = 0; i < zzug().zzHn().getCount(); i++) {
            int iZzT3 = zzug().zzHn().zzT3(i);
            zzzyv.set(zzTV(iZzT3), Integer.valueOf(iZzT3));
        }
        return zzzyv;
    }

    @Override // com.aspose.words.internal.zz3H
    public final zzZYV<Integer> zzud() {
        zzZYV<Integer> zzzyv = new zzZYV<>(zzug().zzTt().getCount());
        for (int i = 0; i < zzug().zzTt().getCount(); i++) {
            zzzyv.set(zzug().zzTt().zzT3(i), Integer.valueOf(zzTV(zzug().zzTt().zzVY(i).intValue())));
        }
        return zzzyv;
    }
}
