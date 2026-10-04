package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ81 extends zzV4 {
    @Override // com.aspose.words.zzV4, com.aspose.words.zzZ7S
    public final String zz0O() {
        return com.aspose.words.internal.zzZKN.zzT(super.zz0O(), ControlChar.LINE_BREAK_CHAR);
    }

    @Override // com.aspose.words.zzYI
    public final int zz9w() {
        return 4;
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzZ7S, com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        byte bZzkz = zzyi.zzkz();
        if (bZzkz != 12) {
            if (bZzkz == 14) {
                return false;
            }
            if (bZzkz != 24) {
                return super.zzZ(zzyi);
            }
            com.aspose.words.internal.zzZQG.zzZ(zzYUR(), zzyi.zz9A());
            zz9O();
            return true;
        }
        if (zz9F()) {
            if (zzYT(false) == null) {
                zz9N();
                return false;
            }
            zz9O();
        }
        com.aspose.words.internal.zzZQG.zzZ(zzYUR(), com.aspose.words.internal.zzZYD.zzE(zzyi.zz9A(), 4));
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == ' ' || c == '\t';
    }

    @Override // com.aspose.words.zzYI
    public final String zzc(String str, int i) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final String zzd(String str, int i) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i) || zz9z() <= 3 || com.aspose.words.internal.zzZYD.zzXh(zz9A())) {
            return false;
        }
        com.aspose.words.internal.zzZQG.zzZ(zzYUR(), zz9A());
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzfa() {
        return zz9z() + zz9x();
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 24;
    }
}
