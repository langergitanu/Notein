package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUF extends zzYI {
    @Override // com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 13) {
            zzTI zztiZzYT = zzYT(false);
            if (zztiZzYT != null) {
                zzZ81 zzz81 = (zzZ81) com.aspose.words.internal.zzZKW.zzZ(zztiZzYT.zzZY2(), zzZ81.class);
                if (zzz81 != null) {
                    com.aspose.words.internal.zzZQG.zzZ(zzz81.zzYUR(), zzyi.zz9A());
                    zz9O();
                    return true;
                }
                zzYMS zzyms = (zzYMS) zztiZzYT.zzx((byte) 14);
                if (zzyms != null) {
                    zzyms.close();
                }
                zz9M();
            }
            return false;
        }
        if (bZzkz == 21) {
            if (zz9J().zzkz() != 14) {
                return false;
            }
            zzYMS zzyms2 = (zzYMS) zz9J();
            if (((zzY71) zzyi).zzZ(zzyms2)) {
                zzyi.setAction(0);
                return false;
            }
            if (zzyms2.zz9F()) {
                zzTI zztiZzYT2 = (zzYKA) zzyms2.zzz((byte) 18);
                int size = zzyms2.zzYUR().size() - 1;
                if (!zztiZzYT2.isOpened() && size > 0) {
                    zztiZzYT2.zzZY4();
                    zzTI zztiZz9J = zzyms2.zzYS(false).zz9J();
                    zzYMS zzyms3 = new zzYMS();
                    zzyms3.zzf(zzyms2.zzYUR().get(size), 0);
                    zztiZz9J.zzY(zzyms3).close();
                    zzyms2.zzYUR().remove(size);
                    while (zztiZzYT2 != null) {
                        zztiZz9J = (zzTI) zztiZz9J.zzY(new zzYKA());
                        zztiZzYT2 = zztiZzYT2.zzYT(false);
                    }
                }
            }
            return false;
        }
        if (bZzkz == 17) {
            if (zz9J().zzkz() == 14 && zzYCN.zzY((zzZ7S) zz9J())) {
                zzyi.setAction(0);
            }
            return false;
        }
        if (bZzkz != 18) {
            zz9M();
            zzTI zztiZzYS = zzYS(false);
            if (zztiZzYS != null) {
                zztiZzYS.zzYz(14);
            }
            if (zzyi.zzkz() == 14 && zz9J().zzkz() == 22) {
                zz9J().close();
            }
            return false;
        }
        zzYKA zzyka = (zzYKA) zzYS(true);
        if (zzyka == null) {
            zz9O();
            return false;
        }
        zzyka.close();
        zzTI zztiZz9J2 = zzyka.zz9J();
        if (zztiZz9J2.zzkz() == 18 && zztiZz9J2.isOpened()) {
            zzyka.zzZY4();
            return false;
        }
        if ((zztiZz9J2.zzkz() != 26 && zztiZz9J2.zzkz() != 27) || zztiZz9J2.getAction() == 3) {
            return true;
        }
        zzyka.zzZY4();
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZt(char c) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 0;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return i == str.length();
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 13;
    }
}
