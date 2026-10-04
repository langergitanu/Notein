package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldSet extends Field {
    private zzZR8 zzZch() {
        return zzZgq().zzDH(1);
    }

    public String getBookmarkName() {
        return zzZgq().zzDG(0);
    }

    public String getBookmarkText() {
        return zzZgq().zzDG(1);
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setBookmarkText(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZOZ(this, getBookmarkName(), zzZch());
    }
}
