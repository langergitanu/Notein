package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZE4 implements zzZAC {
    private zzZE7 zzZEa;

    public zzZE4(zzZE7 zzze7) {
        this.zzZEa = zzze7;
    }

    @Override // com.aspose.words.zzZAC
    public final void endDocument() {
        this.zzZEa.zzp();
    }

    @Override // com.aspose.words.zzZAC
    public final void endElement(String str) {
        this.zzZEa.endElement(str);
    }

    @Override // com.aspose.words.zzZAC
    public final void writeString(String str) {
        this.zzZEa.writeString(str);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzH(zzPS zzps) {
        this.zzZEa.zzH(zzps);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzW(String str) {
        this.zzZEa.zzZN(str, 1);
        this.zzZEa.endElement(str);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzX(String str) {
        this.zzZEa.zzY(str, false);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzY(String str) {
        this.zzZEa.zzZN(str, 0);
    }

    @Override // com.aspose.words.zzZAC
    public final boolean zzYXn() {
        return true;
    }

    @Override // com.aspose.words.zzZAC
    public final void zzZ(String str) {
        this.zzZEa.zzZN(str, 0);
    }

    @Override // com.aspose.words.zzZAC
    public final void zzp() {
        this.zzZEa.zzp();
    }

    @Override // com.aspose.words.zzZAC
    public final void zzX(String str, String str2) {
        this.zzZEa.zzX(str, str2);
    }
}
