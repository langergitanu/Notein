package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKH extends zzYI {
    private boolean zzZ4u() {
        if (zz9C().length() < 3) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < zz9C().length(); i2++) {
            char cCharAt = zz9C().charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != zz9C().charAt(0)) {
                    return false;
                }
                i++;
            }
        }
        return i >= 3;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '-' || c == '_' || c == '*' || c == ' ';
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 2;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (zze(str, i) && zz9A().length() <= 0 && zz9y() <= 3) {
            return zzZ4u();
        }
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 15;
    }

    @Override // com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) throws Exception {
        zzz1t.zzT(this);
        zzz1t.zzZ3K().insertHorizontalRule();
        zzz1t.zzS(this);
    }
}
