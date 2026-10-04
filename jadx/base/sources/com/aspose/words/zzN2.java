package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzN2 extends zzOO {
    public zzN2() {
        super("page-break-inside", false, zzL4.zzZng, zzL3.zzX(zzL4.zzZnf, zzL4.zzZng));
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Row row) {
        zzmp.getCount();
        row.getRowFormat().setAllowBreakAcrossPages(zzmp.zzZVx().zzP(zzL4.zzZng));
    }
}
