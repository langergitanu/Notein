package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRD extends zzV4 {
    private String zzYHG;

    public final String getInfo() {
        return this.zzYHG;
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        return "";
    }

    @Override // com.aspose.words.zzZ7S, com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 12 || bZzkz == 14) {
            com.aspose.words.internal.zzZQG.zzZ(zzYUR(), com.aspose.words.internal.zzZYD.zzE(zzyi.zz9A(), zz9y()));
            zz9O();
            return true;
        }
        switch (bZzkz) {
            case 16:
            case 17:
            case 18:
                break;
            default:
                switch (bZzkz) {
                    case 24:
                    case 26:
                    case 27:
                        break;
                    case 25:
                        if (zzyi.zz9C().length() < zz9C().length() || zz9C().charAt(0) != zzyi.zz9C().charAt(0)) {
                            zzyi.setAction(2);
                            return false;
                        }
                        if (((zzZRD) zzyi).zzYHG.length() > 0) {
                            zzyi.setAction(2);
                            return false;
                        }
                        close();
                        return true;
                    default:
                        return super.zzZ(zzyi);
                }
                break;
        }
        zzyi.setAction(2);
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '`' || c == '~';
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i) || zz9C().length() < 3 || zz9y() > 3 || com.aspose.words.internal.zzZYD.zzZ(zz9C(), zz9C().charAt(0), 1) != -1) {
            return false;
        }
        if (zz9C().charAt(0) == '`' && zz9A().indexOf(96) != -1) {
            return false;
        }
        String strZzTZ = com.aspose.words.internal.zzZKN.zzTZ(zz9A());
        this.zzYHG = strZzTZ;
        int iZzXe = com.aspose.words.internal.zzZYD.zzXe(strZzTZ);
        if (iZzXe != -1) {
            this.zzYHG = this.zzYHG.substring(0, iZzXe);
        }
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 25;
    }
}
