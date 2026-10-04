package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYU5 implements zzZAC {
    private zzYU6 zzXSu;

    public zzYU5(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this.zzXSu = new zzYU6(zzzop, new com.aspose.words.internal.zzZNI(false), true, false);
    }

    @Override // com.aspose.words.zzZAC
    public final void endDocument() {
        this.zzXSu.endDocument();
    }

    @Override // com.aspose.words.zzZAC
    public final void endElement(String str) {
        this.zzXSu.zzo();
    }

    @Override // com.aspose.words.zzZAC
    public final void writeString(String str) {
        this.zzXSu.writeString(str);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzH(zzPS zzps) {
    }

    @Override // com.aspose.words.zzZAC
    public final void zzW(String str) {
        this.zzXSu.zzZ(str, (String) null);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzX(String str) {
        this.zzXSu.zzX(str);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzY(String str) {
        this.zzXSu.zzY(str);
    }

    @Override // com.aspose.words.zzZAC
    public final boolean zzYXn() {
        return false;
    }

    @Override // com.aspose.words.zzZAC
    public final void zzZ(String str) {
        this.zzXSu.zzZ(str);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzp() {
        this.zzXSu.zzp();
    }

    @Override // com.aspose.words.zzZAC
    public final void zzX(String str, String str2) {
        this.zzXSu.zzX(str, str2);
    }
}
