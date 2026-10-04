package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCN extends zzZKT {
    private String zzXnD;

    private void zzN(zzYI zzyi) {
        this.zzXnD = zz9D();
        zzTm(zzyi.zz9D());
    }

    public static boolean zzY(zzZ7S zzz7s) {
        if (zzz7s.zz9F() && zzz7s.zzYT(true) != null) {
            return false;
        }
        zzZ4G zzz4g = (zzZ4G) zzz7s.zzYE(26, 27);
        return zzz4g == null || zzz4g.getAction() == 3;
    }

    private String zzYbL() {
        String str = this.zzXnD;
        return str == null ? zz9D() : str;
    }

    @Override // com.aspose.words.zzYI
    public final int getLength() {
        return zz9C().length() + zzYbL().length();
    }

    public final void zzZ(zzZ7S zzz7s) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzYUR(), (Iterable) zzz7s.zzYUR());
        zzN(zzz7s);
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '=' || c == '-';
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i) || zz9y() > 3 || zz9C().length() == 0) {
            return false;
        }
        char cCharAt = zz9C().charAt(0);
        for (int i2 = 1; i2 < zz9C().length(); i2++) {
            if (zz9C().charAt(i2) != cCharAt) {
                return false;
            }
        }
        if (!com.aspose.words.internal.zzZYD.zzXh(zz9A()) || !com.aspose.words.internal.zzZYD.zzXh(zz9B())) {
            return false;
        }
        setAction(2);
        setLevel(cCharAt == '=' ? 1 : 2);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzfa() {
        String str;
        int iZzXf;
        int iZz9y = zz9y();
        return (zzYUR().size() <= 0 || (iZzXf = com.aspose.words.internal.zzZYD.zzXf((str = zzYUR().get(0)))) == -1) ? iZz9y : iZz9y + zzZ1N.zzIx(str.substring(0, iZzXf));
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 17;
    }
}
