package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY03 extends zzZ1L {
    private zzXZU zzWTH;

    public zzY03(zzXZU zzxzu) {
        this.zzWTH = zzxzu;
    }

    @Override // com.aspose.words.zzZ1L
    public final void zzW(BookmarkEnd bookmarkEnd) {
    }

    @Override // com.aspose.words.zzZ1L
    public final boolean zzZ3Z() {
        return true;
    }

    @Override // com.aspose.words.zzZ1L
    public final void zzW(BookmarkStart bookmarkStart) {
        this.zzWTH.zzT(1, "Bookmarks are not supported in XAML yet.");
    }
}
