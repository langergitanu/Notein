package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0C extends zzZ0J {
    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return 6;
    }

    public final void zzT3(boolean z) {
        zzX(15210, Boolean.valueOf(z), !z);
    }

    public final boolean zzYEO() {
        return zzPk(15210) == null || ((Boolean) zzPj(15210)).booleanValue();
    }

    public final char zzYEP() {
        return ((Character) zzPj(15200)).charValue();
    }

    public final char zzYEQ() {
        return ((Character) zzPj(15190)).charValue();
    }

    public final char zzYER() {
        return ((Character) zzPj(15180)).charValue();
    }

    public final void zzYh(char c) {
        zzX(15200, Character.valueOf(c), c != 9474);
    }

    public final void zzYi(char c) {
        zzX(15190, Character.valueOf(c), c != ')');
    }

    public final void zzYj(char c) {
        zzX(15180, Character.valueOf(c), c != '(');
    }

    public final void zzuy(int i) {
        zzX(15220, Integer.valueOf(i), i != 0);
    }
}
