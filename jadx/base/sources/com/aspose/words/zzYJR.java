package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJR {
    private boolean zzYDe;
    private int zzYQi;
    private zzYMD zzYgm;
    private zzUZ zzZvp;

    public zzYJR(zzUZ zzuz) {
        this.zzZvp = zzuz;
        if (zzuz.isEmpty()) {
            this.zzZvp = null;
        }
        this.zzYgm = null;
        this.zzYQi = 2;
        this.zzYDe = true;
    }

    private static zzYMD zzT(zzYMD zzymd, boolean z) {
        return z ? zzymd.zz5Z() : zzymd.zz5Y();
    }

    public static zzYAD zzZ(zzYMD zzymd, boolean z, int i, zzWT zzwt) throws Exception {
        zzWT zzwtZzO;
        zzYAD zzyadZzZ;
        while (zzymd != null) {
            zzymd = zzZ(false, zzymd, z, zzwt);
            zzWT zzwt2 = (zzWT) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzWT.class);
            if (zzwt2 != null && zzwt2.isEmpty() && ((((zzWV) zzwt2.zza9()).zz6m() == 2 || ((zzWV) zzwt2.zza9()).zz6m() == 3) && (zzyadZzZ = zzZ((zzwtZzO = zzWK.zzO(zzwt2)), z, i, zzwtZzO)) != null)) {
                return zzyadZzZ;
            }
            if ((zzymd instanceof zzYAU) && ((zzYAU) zzymd).zzY7n() == i) {
                break;
            }
        }
        return (zzYAD) zzymd;
    }

    public final zzYAD zzYlX() throws Exception {
        zzUZ zzuz = this.zzZvp;
        if (zzuz == null) {
            return null;
        }
        if (this.zzYgm == null) {
            this.zzYgm = this.zzYDe ? zzuz.zz6x() : zzuz.zz6w();
        }
        zzYAD zzyadZzZ = zzZ(this.zzYgm, this.zzYDe, this.zzYQi, (zzWT) null);
        this.zzYgm = zzyadZzZ;
        if (zzyadZzZ == null) {
            this.zzZvp = null;
        }
        return zzyadZzZ;
    }

    private static zzYMD zzZ(boolean z, zzYMD zzymd, boolean z2, zzWT zzwt) {
        while (zzymd != null) {
            int iZz60 = zzymd.zz60();
            if (iZz60 != 8) {
                if (iZz60 == 16) {
                    zzWT zzwt2 = (zzWT) zzymd;
                    if (!z && !zzwt2.isEmpty()) {
                        return z2 ? zzwt2.zz6x() : zzwt2.zz6w();
                    }
                    if (zzwt2 == zzwt) {
                        return null;
                    }
                    zzYMD zzymdZzT = zzT(zzymd, z2);
                    if (zzymdZzT != null) {
                        return zzymdZzT;
                    }
                    zzymd = (zzYIA) zzwt2.zzZZJ();
                } else if (iZz60 == 32) {
                    zzZ55 zzz55 = (zzZ55) zzymd;
                    if (!z) {
                        if (z2) {
                            return (zzYAU) zzz55.zz6x();
                        }
                        return (zzYAU) zzz55.zz6w();
                    }
                    zzYMD zzymdZzT2 = zzT(zzymd, z2);
                    if (zzymdZzT2 != null) {
                        return zzymdZzT2;
                    }
                    zzymd = zzz55.zzZZJ();
                } else {
                    if (iZz60 != 64) {
                        return null;
                    }
                    zzYAU zzyau = (zzYAU) zzymd;
                    zzYMD zzymdZzT3 = zzT(zzymd, z2);
                    if (zzymdZzT3 != null) {
                        return zzymdZzT3;
                    }
                    zzymd = (zzZ55) zzyau.zzZZJ();
                }
                z = true;
            } else {
                zzYIA zzyia = (zzYIA) zzymd;
                if (!z) {
                    if (z2) {
                        return (zzWT) zzyia.zz6x();
                    }
                    return (zzWT) zzyia.zz6w();
                }
                zzYMD zzymdZzT4 = zzT(zzymd, z2);
                if (zzymdZzT4 != null) {
                    return zzymdZzT4;
                }
                zzymd = zzyia.zzZZJ();
            }
        }
        return zzymd;
    }
}
