package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFG extends zzZGQ {
    public zzZFG(Paragraph paragraph, zzOJ zzoj, zzOJ zzoj2, zzOJ zzoj3, zzOJ zzoj4, boolean z, boolean z2) {
        super(paragraph, zzoj, zzoj2, zzoj3, zzoj4, z, z2);
    }

    @Override // com.aspose.words.zzZGQ
    public final zzOJ zzZ(zzOJ zzoj, zzOJ zzoj2, ListLevel listLevel) {
        if (!zzZ1n() || listLevel == null) {
            if (com.aspose.words.internal.zzAN.zzZD(zzoj2.getValue())) {
                return null;
            }
            return zzOJ.zzZ(zzOJ.zzZ(zzZ1q(), zzoj), zzoj2);
        }
        if (listLevel.getTrailingCharacter() == 0) {
            return zzOJ.zzZ(zzOJ.zzZ(zzOJ.zzZ(zzZ1q(), zzoj), zzZ1o()), zzoj2);
        }
        return null;
    }
}
