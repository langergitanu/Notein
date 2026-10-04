package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHG extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzY(zzZAS zzzas, zzPR zzpr) {
        int i = 0;
        for (zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q(); zzzbmZzZ2Q != null && i < 5; zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q()) {
            if ("article".equals(zzzbmZzZ2Q.zzZTQ()) || "aside".equals(zzzbmZzZ2Q.zzZTQ()) || "nav".equals(zzzbmZzZ2Q.zzZTQ()) || "section".equals(zzzbmZzZ2Q.zzZTQ())) {
                i++;
            }
        }
        zzpr.zzV(new zzM3("font-size", i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new zzOI(0.67d, 7) : new zzOI(0.83d, 7) : new zzOI(1.0d, 7) : new zzOI(1.17d, 7) : new zzOI(1.5d, 7) : new zzOI(2.0d, 7), (byte) 0));
        zzpr.zzV(new zzM3("font-weight", zzL4.zzZn3, (byte) 0));
    }

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmt, (byte) 0));
        zzZII.zzZ((zzZBM) zzzas, zzpr, false);
    }
}
