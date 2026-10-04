package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYMS extends zzZ7S {
    private static zzZ4G zzO(zzYI zzyi) {
        for (zzZ4G zzz4g = zzyi.zzYD(26, 27) ? (zzZ4G) zzyi : (zzZ4G) zzyi.zzYE(26, 27); zzz4g != null; zzz4g = (zzZ4G) zzz4g.zzYE(26, 27)) {
            if (zzz4g.getAction() == 3) {
                return zzz4g;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzZ7S, com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzZ4G zzz4g;
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 17) {
            ((zzYCN) zzyi).zzZ((zzZ7S) this);
            setAction(1);
            zz9O();
            return false;
        }
        if (bZzkz == 21) {
            zzYUR().size();
            ((zzY71) zzyi).zzY(new zzYIF(zzYUR().get(zzYUR().size() - 1)));
            zzYUR().remove(zzYUR().size() - 1);
            if (zzYUR().size() == 0) {
                setAction(1);
            }
            zz9O();
            return false;
        }
        if (bZzkz != 27) {
            return super.zzZ(zzyi);
        }
        if (((zzYNK) zzyi).getStartAt() != 1 && ((zzz4g = (zzZ4G) zzYE(26, 27)) == null || (!zzz4g.zz9E() && zzO(zzz4g) != null))) {
            open();
            zzyi.setAction(2);
        }
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final String zzb(String str, int i) {
        return "";
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
    public final String zzd(String str, int i) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i)) {
            return false;
        }
        com.aspose.words.internal.zzZQG.zzZ(zzYUR(), zz9A());
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzfa() {
        return zz9x();
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 14;
    }
}
