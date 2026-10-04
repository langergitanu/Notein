package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5K {
    private zz9K zzZ1q;
    private zz9K zzZ1r;
    private zz8Z zzZ7J;
    private zz5J zzZ1p = new zz5J();
    private zz5J zzZ1o = new zz5J();
    private zzZZY zzZ1H = new zzZZY(this, 19);
    private zzZZY zzZ1G = new zzZZY(this, 9);
    private zzZZY zzZ1F = new zzZZY(this, 24);
    private zzZZY zzZ1E = new zzZZY(this, 32);
    private zzZZY zzZ1D = new zzZZY(this, 11);
    private zzZZY zzZ1C = new zzZZY(this, 2);
    private zz67 zzZ1B = zzHN(21);
    private zz67 zzZ1A = zzHN(10);
    private zz67 zzZ1z = zzHN(26);
    private zz67 zzZ1y = zzHN(34);
    private zz67 zzZ1x = zzHN(12);
    private zz67 zzZ1w = zzHN(7);
    private zz67 zzZ1v = zzHN(63);
    private zz67 zzZ1u = zzHN(18);
    private zzZZX zzZ1t = new zzZZX(61, this);
    private zzZZX zzZ1s = new zzZZX(16, this);

    public zz5K(zz9K zz9k, zz9K zz9k2, zz8Z zz8z) {
        this.zzZ1r = zz9k;
        this.zzZ1q = zz9k2;
        this.zzZ7J = zz8z;
        this.zzZ1p.zzZyt().setType(19);
        this.zzZ1p.zzZys().setType(61);
        this.zzZ1o.zzZyt().setType(32);
        this.zzZ1o.zzZys().setType(16);
        zzZyD();
    }

    private zz67 zzHK(int i) {
        if (i == 2) {
            return this.zzZ1w;
        }
        if (i == 9) {
            return this.zzZ1A;
        }
        if (i == 11) {
            return this.zzZ1x;
        }
        if (i == 16) {
            return this.zzZ1u;
        }
        if (i == 19) {
            return this.zzZ1B;
        }
        if (i == 24) {
            return this.zzZ1z;
        }
        if (i == 32) {
            return this.zzZ1y;
        }
        if (i == 61) {
            return this.zzZ1v;
        }
        throw new IllegalStateException("Unexpected constraint type.");
    }

    private zzZC9 zzHL(int i) {
        if (i == 2) {
            return this.zzZ1C;
        }
        if (i == 9) {
            return this.zzZ1G;
        }
        if (i == 11) {
            return this.zzZ1D;
        }
        if (i == 16) {
            return this.zzZ1s;
        }
        if (i == 19) {
            return this.zzZ1H;
        }
        if (i == 24) {
            return this.zzZ1F;
        }
        if (i == 32) {
            return this.zzZ1E;
        }
        if (i == 61) {
            return this.zzZ1t;
        }
        throw new IllegalStateException("Unexpected constraint type.");
    }

    private zzBE zzHM(int i) {
        return new zzBE(i, this.zzZ1q.zzZDW());
    }

    private zz67 zzHN(int i) {
        return new zz67(zzHM(i), this.zzZ1r);
    }

    private void zzZyD() {
        zz5J zz5j = this.zzZ1p;
        zz5j.zzZ(zzHK(zz5j.zzZyt().getType()));
        zz5J zz5j2 = this.zzZ1p;
        zz5j2.zzY(zzHK(zz5j2.zzZys().getType()));
        zz5J zz5j3 = this.zzZ1o;
        zz5j3.zzZ(zzHK(zz5j3.zzZyt().getType()));
        zz5J zz5j4 = this.zzZ1o;
        zz5j4.zzY(zzHK(zz5j4.zzZys().getType()));
    }

    public final void scale(float f, float f2) {
        zzZ(this.zzZ1p.zzZyt(), f);
        zzZ(this.zzZ1p.zzZys(), f);
        zzZ(this.zzZ1o.zzZyt(), f2);
        zzZ(this.zzZ1o.zzZys(), f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float zzHI(int i) {
        if (i != 2) {
            if (i != 9) {
                if (i != 11 && i != 16) {
                    if (i != 19 && i != 24) {
                        if (i != 32) {
                            if (i != 61) {
                                throw new IllegalStateException("Unexpected constraint type.");
                            }
                        }
                    }
                }
                if (this.zzZ1o.zzHH(i)) {
                }
            }
            if (this.zzZ1p.zzHH(i)) {
                return this.zzZ1p.zzHG(i);
            }
        } else if (this.zzZ1o.zzHH(i)) {
            return this.zzZ1o.zzHG(i);
        }
        return zzHJ(i);
    }

    public final float zzHJ(int i) {
        if (i == 2) {
            return this.zzZ1o.zzZyx();
        }
        if (i == 9) {
            return this.zzZ1p.zzZyy();
        }
        if (i == 11) {
            return this.zzZ1o.zzZyy();
        }
        if (i == 16) {
            return this.zzZ1o.getSize();
        }
        if (i == 19) {
            return this.zzZ1p.zzZyz();
        }
        if (i == 24) {
            return this.zzZ1p.zzZyx();
        }
        if (i == 32) {
            return this.zzZ1o.zzZyz();
        }
        if (i == 61) {
            return this.zzZ1p.getSize();
        }
        throw new IllegalStateException("Unexpected constraint type.");
    }

    public final void zzP(int i, float f) {
        if (i != 2) {
            if (i != 9) {
                if (i != 11 && i != 16) {
                    if (i != 19 && i != 24) {
                        if (i != 32) {
                            if (i != 61) {
                                throw new IllegalStateException("Unexpected constraint type.");
                            }
                        }
                    }
                }
            }
            this.zzZ1p.zzP(i, f);
            return;
        }
        this.zzZ1o.zzP(i, f);
    }

    public final void zzR(int i, int i2, boolean z) {
        if (z) {
            this.zzZ1p.zzZyt().setType(i);
            this.zzZ1p.zzZys().setType(i2);
        } else {
            this.zzZ1o.zzZyt().setType(i);
            this.zzZ1o.zzZys().setType(i2);
        }
        zzZyD();
    }

    public final void zzZ(zz64 zz64Var) {
        zz64Var.zzZ(this.zzZ1H);
        zz64Var.zzZ(this.zzZ1B);
        zz64Var.zzZ(this.zzZ1G);
        zz64Var.zzZ(this.zzZ1A);
        zz64Var.zzZ(this.zzZ1F);
        zz64Var.zzZ(this.zzZ1z);
        zz64Var.zzZ(this.zzZ1E);
        zz64Var.zzZ(this.zzZ1y);
        zz64Var.zzZ(this.zzZ1D);
        zz64Var.zzZ(this.zzZ1x);
        zz64Var.zzZ(this.zzZ1C);
        zz64Var.zzZ(this.zzZ1w);
        zz64Var.zzZ(this.zzZ1t);
        zz64Var.zzZ(this.zzZ1v);
        zz64Var.zzZ(this.zzZ1s);
        zz64Var.zzZ(this.zzZ1u);
    }

    public final com.aspose.words.internal.zzZQ4 zzZSh() {
        float fZzZyz = this.zzZ1p.zzZyz();
        float fZzZyz2 = this.zzZ1o.zzZyz();
        if (Float.isInfinite(fZzZyz)) {
            fZzZyz = 0.0f;
        }
        if (Float.isInfinite(fZzZyz2)) {
            fZzZyz2 = 0.0f;
        }
        return new com.aspose.words.internal.zzZQ4(fZzZyz, fZzZyz2, this.zzZ1p.getSize(), this.zzZ1o.getSize());
    }

    public final void zzZyA() {
        this.zzZ7J.zzZCH().zzZ(this.zzZ1p.getSize(), this.zzZ1q);
        this.zzZ7J.zzZCH().zzY(this.zzZ1o.getSize(), this.zzZ1q);
    }

    public final void zzZyB() {
        this.zzZ1p.zzra();
        this.zzZ1o.zzra();
    }

    public final void zzZyC() {
        this.zzZ7J.zzZCH().zzZ(Float.intBitsToFloat((int) this.zzZ1q.zzZDQ()) - this.zzZ1v.zzZzq(), this.zzZ1t);
        this.zzZ7J.zzZCH().zzZ(com.aspose.words.internal.zzZPW.zzYz(this.zzZ1q.zzZDQ()) - this.zzZ1u.zzZzq(), this.zzZ1s);
    }

    public final zz9K zzZyE() {
        return this.zzZ1r;
    }

    public final zz9K zzZyF() {
        return this.zzZ1q;
    }

    private void zzZ(zz5I zz5i, float f) {
        this.zzZ7J.zzZCH().zzZ(zz5i.zzZze() * f, zzHL(zz5i.getType()));
    }
}
