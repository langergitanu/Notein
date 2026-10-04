package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZK5 extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "right", "all", "both");

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.getAttributeValue("clear", "")));
        if (iZzTP == 0) {
            zzpr.zzV(new zzM3("clear", zzL4.zzZmH, (byte) 0));
            return;
        }
        if (iZzTP == 1) {
            zzpr.zzV(new zzM3("clear", zzL4.zzZmG, (byte) 0));
        } else if (iZzTP == 2 || iZzTP == 3) {
            zzpr.zzV(new zzM3("clear", zzL4.zzZlP, (byte) 0));
        }
    }
}
