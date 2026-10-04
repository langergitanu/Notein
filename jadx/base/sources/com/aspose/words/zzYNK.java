package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNK extends zzZ4G {
    @Override // com.aspose.words.zzZ4G
    public final int zz7c() {
        int iMax = Math.max(3, zz9z()) + zz9y();
        return (isEmpty() || zzMH(0).zzkz() == 24) ? iMax : iMax + zzMH(0).zzfa();
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return com.aspose.words.internal.zzZYD.isDigit(c) || c == '.' || c == ')';
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i) || zz9C().length() < 2 || zz9y() > 3 || !com.aspose.words.internal.zzZYD.isDigit(zz9C().charAt(0))) {
            return false;
        }
        int length = zz9C().length();
        int i2 = length - 1;
        if (com.aspose.words.internal.zzZKU.zzG(zz9C().charAt(i2))) {
            i2 = length - 2;
        }
        if (i2 > 9 || com.aspose.words.internal.zzZKN.zzZ(zz9C(), new char[]{FilenameUtils.EXTENSION_SEPARATOR, ')'}) != i2) {
            return false;
        }
        if (zz9C().length() + i < str.length() && !com.aspose.words.internal.zzZKU.zzG(zz9C().charAt(zz9C().length() - 1))) {
            return false;
        }
        setAction(3);
        zzxg(zzZ1N.zzYE(zz9C().charAt(i2)));
        setStartAt(com.aspose.words.internal.zzJB.parseInt(zz9C().substring(0, i2)));
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 27;
    }
}
