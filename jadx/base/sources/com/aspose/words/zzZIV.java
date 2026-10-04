package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIV extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmt, (byte) 0));
        int i = 0;
        for (zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q(); zzzbmZzZ2Q != null && i < 2; zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q()) {
            if ("ol".equals(zzzbmZzZ2Q.zzZTQ()) || "ul".equals(zzzbmZzZ2Q.zzZTQ()) || "dir".equals(zzzbmZzZ2Q.zzZTQ()) || "menu".equals(zzzbmZzZ2Q.zzZTQ())) {
                i++;
            }
        }
        zzpr.zzV(new zzM3("list-style-type", i != 0 ? i != 1 ? zzL4.zzZm2 : zzL4.zzZm3 : zzL4.zzZm4, (byte) 0));
        zzpr.zzV(new zzM3("-aw-padding-start", new zzOI(40.0d, 6), (byte) 0));
    }
}
