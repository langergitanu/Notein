package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ49 {
    private com.aspose.words.internal.zzD3<zzZ47> zzYbT = new com.aspose.words.internal.zzD3<>();

    public final zzZ47 zzO(List list) {
        zzZ47 zzz47 = this.zzYbT.get(list.zzYP8());
        if (zzz47 != null) {
            return zzz47;
        }
        zzZ47 zzz472 = new zzZ47(list);
        this.zzYbT.set(list.zzYP8(), zzz472);
        return zzz472;
    }

    public final zzZ47 zzY(List list, int i) {
        zzZ47 zzz47ZzO = zzO(list);
        zzz47ZzO.zzZ(list, i, true);
        return zzz47ZzO;
    }

    public final void zzwV(int i) {
        for (zzZ47 zzz47 : this.zzYbT.zzCJ()) {
            if (zzz47.zzYPa().isRestartAtEachSection()) {
                zzz47.init(i);
            }
        }
    }
}
