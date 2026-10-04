package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWX extends zzZ7S {
    private int zzUG = 1;

    public final int getAlignment() {
        zzWX zzwx = this;
        while (true) {
            zzY71 zzy71 = (zzY71) zzwx.zzz((byte) 21);
            if (zzy71 == null || zzwx.getIndex() >= zzy71.getColumnsCount()) {
                break;
            }
            zzwx = (zzWX) zzy71.zzXZW().zzMH(zzwx.getIndex());
        }
        return zzwx.zzUG;
    }

    @Override // com.aspose.words.zzYI
    public final int getLength() {
        return Math.min(zz9B().length(), 1) + zz9A().length() + zz9C().length() + zz9D().length();
    }

    public final boolean zz6E() {
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(zz9A());
        boolean z = false;
        for (int i = 0; i < strZzTX.length(); i++) {
            char cCharAt = strZzTX.charAt(i);
            if (cCharAt == '-') {
                z = true;
            } else {
                if (cCharAt != ':') {
                    return false;
                }
                if (i == 0) {
                    this.zzUG = 0;
                } else {
                    if (i != strZzTX.length() - 1) {
                        return false;
                    }
                    this.zzUG = this.zzUG != 0 ? 2 : 1;
                }
            }
        }
        return z;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zz9v() {
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zz9w() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        while (i <= i2 && !zzZv(str.charAt(i))) {
            i++;
        }
        return i > i2 ? "" : str.substring(i, (i2 - i) + 1 + i);
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) throws Exception {
        if (getIndex() >= ((zzY71) zzz((byte) 21)).getColumnsCount()) {
            return;
        }
        super.zzZ(zzz1t);
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '|';
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 2;
    }

    @Override // com.aspose.words.zzYI
    public final String zzc(String str, int i) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i)) {
            return false;
        }
        if (zz9C().length() == 0 && zz9B().length() == 0) {
            return false;
        }
        if (zz9C().length() != 0 && zz9B().length() == 0 && com.aspose.words.internal.zzZKN.zzTX(zz9A()).length() == 0) {
            return false;
        }
        com.aspose.words.internal.zzZQG.zzZ(zzYUR(), zz9A());
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 19;
    }

    @Override // com.aspose.words.zzZ7S, com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        switch (zzyi.zzkz()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return super.zzZ(zzyi);
            default:
                return false;
        }
    }
}
