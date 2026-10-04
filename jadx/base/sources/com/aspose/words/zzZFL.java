package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFL extends zzZGQ {
    public zzZFL(Paragraph paragraph, zzOJ zzoj, zzOJ zzoj2, zzOJ zzoj3, zzOJ zzoj4, boolean z, boolean z2) {
        super(paragraph, zzoj, zzoj2, zzoj3, zzoj4, z, z2);
    }

    @Override // com.aspose.words.zzZGQ
    public final zzOJ zzW(zzOJ zzoj, zzOJ zzoj2) {
        zzOJ zzojZzW = super.zzW(zzoj, zzoj2);
        return zzZ1n() ? zzojZzW : zzOJ.zzZ(zzOJ.zzZ(zzOJ.zzZ(zzojZzW, zzZ1p()), zzZ1o()), zzoj2);
    }

    @Override // com.aspose.words.zzZGQ
    public final zzOJ zzZ(zzOJ zzoj, zzOJ zzoj2, ListLevel listLevel) {
        if (zzZ1n()) {
            return zzOJ.zzZ(zzOJ.zzZ(zzOJ.zzZ(super.zzW(zzoj, zzoj2), zzZ1p()), zzZ1o()), zzoj2);
        }
        return null;
    }
}
