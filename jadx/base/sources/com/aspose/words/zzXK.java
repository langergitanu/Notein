package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXK extends zzZ4G {
    @Override // com.aspose.words.zzZ4G
    public final int zz7c() {
        int iMax = Math.max(2, zz9z()) + zz9y();
        return (isEmpty() || zzMH(0).zzkz() == 24) ? iMax : iMax + zzMH(0).zzfa();
    }

    @Override // com.aspose.words.zzYI
    public final int zz9w() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '-' || c == '+' || c == '*';
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i) || zz9C().length() == 0 || zz9y() > 3) {
            return false;
        }
        if (zz9C().length() + i < str.length() && !com.aspose.words.internal.zzZKU.zzG(zz9C().charAt(zz9C().length() - 1))) {
            return false;
        }
        setAction(3);
        zzxg(zzZ1N.zzYE(zz9C().charAt(0)));
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 26;
    }
}
