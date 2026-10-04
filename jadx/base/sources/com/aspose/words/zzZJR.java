package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJR extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("top", "left", "right", "bottom");

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmh, (byte) 0));
        zzpr.zzV(new zzM3("text-align", zzL4.zzZmF, (byte) 0));
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("align", "")));
        if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) {
            zzpr.zzV(new zzM3("caption-side", zzL4.zzZmY, (byte) 0));
        } else {
            if (iZzTP != 3) {
                return;
            }
            zzpr.zzV(new zzM3("caption-side", zzL4.zzZmX, (byte) 0));
        }
    }
}
