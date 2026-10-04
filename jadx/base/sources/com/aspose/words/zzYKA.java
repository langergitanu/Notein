package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKA extends zzTI {
    @Override // com.aspose.words.zzYI
    public final int zz9w() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final String zzL(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        if (zzyi.zzkz() == 17) {
            if (((zzYCN) zzyi).zzYUR().size() > 0) {
                zzY(zzyi);
            }
            return true;
        }
        if (zzyi.zzkz() == 12) {
            zzyi = new zzZUF();
        }
        zzY(zzyi).zz9O();
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '>';
    }

    @Override // com.aspose.words.zzYI
    public final String zzb(String str, int i) {
        int length;
        String strZzb = super.zzb(str, i);
        if (strZzb.length() > 0 && (length = strZzb.length() + i) < str.length()) {
            char cCharAt = str.charAt(length);
            if (com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
                return com.aspose.words.internal.zzZKN.format("{0}{1}", strZzb, Character.valueOf(cCharAt));
            }
        }
        return strZzb;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 3;
    }

    @Override // com.aspose.words.zzYI
    public final String zzc(String str, int i) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return zze(str, i) && zz9C().length() != 0 && zz9y() <= 3;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 18;
    }
}
