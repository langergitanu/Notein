package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ70 extends zzZ6S {
    private boolean zzYgx;
    private com.aspose.words.internal.zzZQ4 zzYgy;
    private int zzYgz;

    public zzZ70(zzWT zzwt, boolean z) throws Exception {
        super(zzwt);
        this.zzYgz = 0;
        this.zzYgy = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzYgx = z;
        zzYTM();
    }

    public static com.aspose.words.internal.zzZQ4 zzJ(zzWT zzwt) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzW = zzWU.zzW(zzwt);
        zzZ6M zzz6m = new zzZ6M((zzYIA) zzwt.zzZZJ());
        return new com.aspose.words.internal.zzZQ4(zzzq4ZzW.getX() + (zzwt.getX() / 1000.0f) + zzz6m.zzZm(), zzzq4ZzW.getY() + (zzwt.getY() / 1000.0f) + zzz6m.zzZo(), zzzq4ZzW.getWidth(), zzzq4ZzW.getHeight());
    }

    public static boolean zzK(zzWT zzwt) {
        zzWV zzwv = (zzWV) zzwt.zza9();
        return ((zzYIC) zzwv.zza9()).zzYk4() && ((zzZ3B) zzwv.zzYTt()).getBottomPadding() < ((zzYIA) ((zzYIC) zzwv.zza9()).zz6x()).zzYjI();
    }

    public static Border zzV(zzWT zzwt, int i) {
        return zz5.zzZ(zzZ(i, zzwt), i, ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk4() ? 16 : 32);
    }

    private void zzYTM() throws Exception {
        int iZz6m = ((zzWV) ((zzWT) this.zzYgm).zza9()).zz6m();
        if (iZz6m == 0) {
            this.zzYgz = 1;
        } else if (iZz6m == 1) {
            this.zzYgz = ((zzWT) this.zzYgm).zzZZJ().zzYnY() ? 1 : 2;
        } else if (iZz6m == 2) {
            this.zzYgz = ((zzWT) this.zzYgm).zzZZJ().zzYnY() ? 3 : 2;
        } else {
            if (iZz6m != 3) {
                throw new IllegalStateException("Unexpected cell merge type.");
            }
            this.zzYgz = 3;
        }
        zzYIC zzyicZza5 = ((zzWT) this.zzYgm).zza4().zza5();
        if (this.zzYgz == 2 && zzyicZza5.zzBz() && this.zzYgx && !zzyicZza5.zzYTn() && !((zzYIC) zzyicZza5.zzYTp()).zzBz()) {
            this.zzYgz = 3;
        }
        if (this.zzYgz == 2) {
            zzWV zzwvZza4 = ((zzWT) this.zzYgm).zza4();
            do {
                zzwvZza4 = zzwvZza4.zz6n();
                if (zzwvZza4 != null && ((zzYIA) zzwvZza4.zz6t().zzZZJ()).getHeight() <= 0) {
                    if (zzwvZza4.zz6m() == 3) {
                        break;
                    }
                } else {
                    return;
                }
            } while (!((zzYIA) zzwvZza4.zz6t().zzZZJ()).zzYnY());
            this.zzYgz = 3;
        }
    }

    private static zzZ3D zzZ(int i, zzWV zzwv, boolean z, boolean z2) {
        zzZ3D zzz3dZzwz = (z || !z2) ? ((zzZ3B) zzwv.zzYTt()).zzYMV().zzwz(i) : zzZ3D.zzYaA;
        if (!zzz3dZzwz.isAmbient()) {
            return zzz3dZzwz;
        }
        if (!z || ((zzYIC) zzwv.zza9()).zzYk4()) {
            i = 4;
        }
        return ((zzYIC) zzwv.zza9()).zzYk1().zzYMV().zzwz(i);
    }

    public final Shading getShading() {
        zzZ34 zzz34ZzYMW = ((zzZ3B) ((zzWV) ((zzWT) this.zzYgm).zza9()).zzYTt()).zzYMW();
        Shading shading = new Shading();
        shading.zzZJ(zzz34ZzYMW.zzOL());
        shading.zzZK(zzz34ZzYMW.zzOK());
        shading.setTexture(zzz34ZzYMW.getTexture());
        return shading;
    }

    public final boolean zz2M() {
        int i = this.zzYgz;
        return i == 1 || i == 4;
    }

    public final boolean zz6c() {
        return ((zzWV) ((zzWT) this.zzYgm).zza9()).zz6c();
    }

    public final boolean zzYTN() throws Exception {
        if (((zzYIA) ((zzWT) this.zzYgm).zzZZJ()).getHeight() <= 0) {
            return false;
        }
        int i = this.zzYgz;
        return i == 1 || i == 2 || i == 3;
    }

    public final int zzYTO() {
        return this.zzYgz;
    }

    public final com.aspose.words.internal.zzZQ4 zzYTP() throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzYTQ = zzYTQ();
        return new com.aspose.words.internal.zzZQ4(zzzq4ZzYTQ.getX() + zzZm(), zzzq4ZzYTQ.getY() + zzZo(), zzzq4ZzYTQ.getWidth(), zzzq4ZzYTQ.getHeight());
    }

    public final com.aspose.words.internal.zzZQ4 zzYTQ() throws Exception {
        if (this.zzYgy.isEmpty()) {
            this.zzYgy = zzWU.zzX((zzWT) this.zzYgm);
        }
        return this.zzYgy;
    }

    @Override // com.aspose.words.zzZ6S
    public final com.aspose.words.internal.zzZQ4 zzbL() throws Exception {
        return zzYTQ();
    }

    public zzZ70(zzWT zzwt, zzWT zzwt2) throws Exception {
        super(zzwt);
        this.zzYgz = 0;
        this.zzYgy = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzYgz = 4;
        zzZ0(zzZm() - ((((zzYIA) zzwt2.zzZZJ()).getX() - this.zzYgm.zzZZJ().getX()) / 1000.0f));
        zzZ1(zzZo() - ((((zzYIA) zzwt2.zzZZJ()).getY() - this.zzYgm.zzZZJ().getY()) / 1000.0f));
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        ((zzWT) this.zzYgm).isVirtual();
        zzz61.zzX(this);
        if (zz2M()) {
            zzZ6S.zzZ(zzz61, ((zzWT) this.zzYgm).zz6x());
            zzZ6S.zzZ(zzz61, ((zzWT) this.zzYgm).zzYF(false));
        }
        zzz61.zzW(this);
    }

    public static zzZ3D zzZ(int i, zzWT zzwt) {
        boolean zZzYk4 = ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk4();
        zzZ3D zzz3dZzwz = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).zzYMV().zzwz(i);
        boolean zZzac = zzwt.zzqh(23554).zzac();
        int iZz6m = ((zzWV) zzwt.zza9()).zz6m();
        if (i == 0) {
            boolean z = ((zzYIA) zzwt.zzZZJ()).zzYjG() || !zZzac;
            boolean z2 = iZz6m == 2 || iZz6m == 1;
            if (zzK(zzwt)) {
                return zzZ3D.zzYaA;
            }
            return zzZ(i, (zzWV) zzwt.zza9(), z, z2);
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzZ(i, (zzWV) zzwt.zza9(), ((zzYIA) zzwt.zzZZJ()).zzYjH() && !((zzYIA) zzwt.zzZZJ()).zzYjB(), iZz6m == 2 || iZz6m == 3);
                }
            } else if (zZzYk4 && zzz3dZzwz.isAmbient() && ((zzWV) zzwt.zza9()).zz8s()) {
                return ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk1().zzYMV().zzwz(5);
            }
        } else if (zZzYk4 && zzz3dZzwz.isAmbient() && ((zzWV) zzwt.zza9()).zz8t()) {
            return ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk1().zzYMV().zzwz(5);
        }
        return zzz3dZzwz;
    }
}
