package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY01 extends zzZ1I {
    private zzXZU zzWTH;

    public zzY01(Document document, zzYE2 zzye2, zzZ1H zzz1h, zzXZU zzxzu) {
        super(document, false, true, false, zzye2, zzz1h);
        this.zzWTH = zzxzu;
    }

    @Override // com.aspose.words.zzZ1I
    public final void zzU(FieldSeparator fieldSeparator) {
    }

    @Override // com.aspose.words.zzZ1I
    public final int zzW(FormField formField) {
        this.zzWTH.zzT(1, "FormField nodes are not supported in XAML yet.");
        return 0;
    }
}
