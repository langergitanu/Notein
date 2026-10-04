package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZO extends zzZKT {
    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '#';
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i) || zz9y() > 3 || zz9C().length() <= 0 || zz9C().length() > 6) {
            return false;
        }
        if (zz9A().length() > 0 && !com.aspose.words.internal.zzZYD.zzZ1(zz9A().charAt(0))) {
            return false;
        }
        com.aspose.words.internal.zzZQG.zzZ(zzYUR(), zz9A());
        setLevel(zz9C().length());
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 16;
    }
}
