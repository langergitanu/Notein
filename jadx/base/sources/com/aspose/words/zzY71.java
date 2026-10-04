package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY71 extends zzTI {
    private zzYIF zzX6V = new zzYIF();

    public final int getColumnsCount() {
        return this.zzX6V.getCount();
    }

    @Override // com.aspose.words.zzYI
    public final int getLength() {
        return this.zzX6V.getLength();
    }

    public final zzYIF zzXZW() {
        return this.zzX6V;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 13) {
            zzY(zzyi).zz9O();
            return true;
        }
        if (bZzkz != 14) {
            if (bZzkz != 20) {
                return false;
            }
            zzY((zzYIF) zzyi);
            return true;
        }
        zzYMS zzyms = (zzYMS) zzyi;
        zzyms.zzYUR().size();
        zzYIF zzyif = new zzYIF(zzyms.zzYUR().get(0));
        if (zzyif.isEmpty()) {
            return false;
        }
        zzY(zzyif);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '|' || c == '-' || c == ':' || c == ' ';
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 3;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!this.zzX6V.zzf(str, i)) {
            return false;
        }
        setAction(2);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzfa() {
        return this.zzX6V.zzfa();
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 21;
    }

    public final boolean zzZ(zzYMS zzyms) {
        if (zzyms.zzYUR().size() == 0) {
            return false;
        }
        if (!zzyms.zz9F() || (zzyms.zzYUR().size() <= 1 && zzyms.zzYT(true) == null)) {
            return this.zzX6V.getCount() == zzYIF.zzCE(zzyms.zzYUR().get(zzyms.zzYUR().size() - 1)).size();
        }
        return false;
    }
}
