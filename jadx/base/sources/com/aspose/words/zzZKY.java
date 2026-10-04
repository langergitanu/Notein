package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZKY extends zzYBL {
    private int zzYtN;
    private int zzYtO;
    private zzZKY zzYtP;

    public zzZKY() throws Exception {
        zzZ4Y();
    }

    private boolean zzAi(int i) throws Exception {
        isHeader();
        if (((zzYN8) zzZZJ()).zzYqo() == i) {
            return false;
        }
        return zzZNC.zzZ(this, this);
    }

    private void zzAj(int i) {
        isHeader();
        this.zzYtN = i;
    }

    private void zzAk(int i) {
        isHeader();
        this.zzYtN = i;
    }

    public static boolean zzT(zzTC zztc) {
        zzZKY zzzky = (zzZKY) com.aspose.words.internal.zzZKW.zzZ(zztc.zzZZJ(), zzZKY.class);
        if (zzzky == null) {
            return false;
        }
        return (((zzZKV) zzzky.zzaa()).zzZ4D() ? ((zzYN8) zzzky.zzZZJ()).zzYqq() : ((zzYN8) zzzky.zzZZJ()).zzYqp()) != zzzky;
    }

    private boolean zzX0(int i, int i2) throws Exception {
        isHeader();
        if (getY() == i) {
            return false;
        }
        if (i2 != ((zzYN8) zzZZJ()).zzYqn() && zzZNC.zzZ(this, ((zzYN8) zzZZJ()).zzYqq())) {
            ((zzYN8) zzZZJ()).zzYqq().zzYU(false);
        }
        boolean zZzZ = zzZNC.zzZ(this, this);
        if (zZzZ) {
            zzZ4J();
        }
        return zZzZ;
    }

    private boolean zzX1(int i, int i2) throws Exception {
        if (zza7().zzZYM()) {
            return zzX0(i, i2);
        }
        int y = getY();
        setY(i);
        zzX0(y, i2);
        return false;
    }

    private void zzZ(zzYBK zzybk) throws Exception {
        boolean zZzZ;
        do {
            zZzZ = zzybk.zzZ((zzYBL) this, this.zzYtO, true, false);
            zza7();
        } while (zZzZ);
    }

    private int zzZ4F() throws Exception {
        zzYMD zzymdZzY8k = zzY8k();
        if (zzymdZzY8k != null) {
            return Math.max(0, zzymdZzY8k.getBottom());
        }
        return 0;
    }

    private boolean zzZ4G() {
        return this.zzYtO < 1073741823;
    }

    private void zzZ4H() throws Exception {
        for (zzZNO zzzno : ((zzYN8) zzZZJ()).zzYF(true)) {
            if (zzzno.zzZ93().zzaa() == zzaa() && zzzno.zzZ8T()) {
                ((zzYN8) zzZZJ()).zzYG(true).zzZ(zzzno, true, true);
                zzzno.zzZ8Q();
            }
        }
        ((zzYN8) zzZZJ()).zzYG(true).zzq(null);
    }

    private void zzZ4I() throws Exception {
        if (!zza7().zzZYM() && this.zzYtO >= 1073741823) {
            this.zzYtO = (int) (((double) ((zzYN8) zzZZJ()).getHeight()) * (zzZ4X() ? 1.0d : 0.5d));
        }
    }

    private void zzZ4J() {
        zzYU(false);
        for (zzYMD zzymdZz6x = zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
            zzymdZz6x.zzYU(false);
        }
    }

    private void zzZ4K() throws Exception {
        zza7();
        int iZzYJ7 = isHeader() ? ((zzZ2D) ((zzYN8) zzZZJ()).zza9()).zzYJ7() : ((zzZ2D) ((zzYN8) zzZZJ()).zza9()).zzYJ6();
        getHeight();
        if (getHeight() <= iZzYJ7) {
            return;
        }
        this.zzYtO = iZzYJ7;
        zzZ4H();
        zzZ4J();
    }

    private boolean zzZ4L() throws Exception {
        zzZZJ();
        if (!((zzYN8) zzZZJ()).zza7().zzZYM()) {
            return false;
        }
        zzZKY zzzkyZzYqq = ((zzYN8) zzZZJ()).zzYqq();
        zzZKY zzzkyZzYqp = ((zzYN8) zzZZJ()).zzYqp();
        int height = zzzkyZzYqq != null ? zzzkyZzYqq.getHeight() : 0;
        int height2 = zzzkyZzYqp != null ? zzzkyZzYqp.getHeight() : 0;
        if ((zzzkyZzYqq != null && zzzkyZzYqq.zzZ4G()) || (zzzkyZzYqp != null && zzzkyZzYqp.zzZ4G())) {
            return false;
        }
        zzZ2D zzz2d = (zzZ2D) ((zzYN8) zzZZJ()).zza9();
        return height + height2 > zzz2d.zzYJ7() + zzz2d.zzYJ6();
    }

    private boolean zzZ4M() throws Exception {
        if (!zzZ4L()) {
            return false;
        }
        zzZKY zzzkyZzYqq = ((zzYN8) zzZZJ()).zzYqq();
        if (zzzkyZzYqq != null) {
            zzzkyZzYqq.zzZ4K();
        }
        zzZKY zzzkyZzYqp = ((zzYN8) zzZZJ()).zzYqp();
        if (zzzkyZzYqp == null) {
            return true;
        }
        zzzkyZzYqp.zzZ4K();
        return zzzkyZzYqp.zzZ4G();
    }

    private void zzZ4N() throws Exception {
        zzY8l();
        zzab().zzZ((zzYBL) this);
        for (zzZNO zzzno : ((zzYN8) zzZZJ()).zzYF(true)) {
            if (zzzno.zzZ99() == 25604 && ((zzYBL) zzzno.zzZ8E().zzZZJ()) == this) {
                zzzno.zzVJ(false);
            }
        }
    }

    private boolean zzZ4O() {
        Iterator<zzZNO> it = ((zzYN8) zzZZJ()).zzYF(true).iterator();
        while (it.hasNext()) {
            if (it.next().zzZ93().zzaa() == zzaa()) {
                return true;
            }
        }
        return false;
    }

    private void zzZ4P() throws Exception {
        setX(((zzYN8) zzZZJ()).zz5X());
        long jZzZN = ((zzZKV) zzaa()).zzZ4C().zzZN(2, false);
        setWidth(Math.max(0, ((int) (jZzZN >> 32)) - ((int) jZzZN)));
        zzZ35 zzz35 = (zzZ35) ((zzZKV) zzaa()).zzZ4C().zzYTt();
        if (isHeader()) {
            setY(Math.max(0, zzz35.zzYLy()));
        } else if (getY() == Integer.MIN_VALUE) {
            setY(((zzYN8) zzZZJ()).zzYqm());
            setY(Math.max(getY(), ((zzYN8) zzZZJ()).zzYqo()));
        }
        zzZ4I();
    }

    public final boolean isHeader() {
        return ((zzZKV) zzaa()).zzZ4D();
    }

    @Override // com.aspose.words.zzYMD
    public final void remove() {
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 1024;
    }

    public final boolean zzAl(int i) throws Exception {
        zzaa();
        if (((zzYN8) zzZZJ()).zzYqo() == i || ((zzYN8) zzZZJ()).zzYqq() == null) {
            return false;
        }
        boolean zZzZ = zzZNC.zzZ(((zzYN8) zzZZJ()).zzYqq(), this);
        if (zZzZ) {
            zzYU(false);
        }
        return zZzZ;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final boolean zzNd(int i) throws Exception {
        if (super.zzNd(i)) {
            return true;
        }
        zzY44.zzZ(i, this);
        return false;
    }

    public final int zzZ4Q() {
        return this.zzYtO;
    }

    public final zzZKY zzZ4R() {
        return this.zzYtP;
    }

    public final void zzZ4S() throws Exception {
        if (this.zzYtP == null) {
            this.zzYtP = (zzZKY) zz0s();
        }
    }

    public final int zzZ4T() {
        isHeader();
        return this.zzYtN;
    }

    public final int zzZ4U() {
        isHeader();
        return this.zzYtN;
    }

    public final boolean zzZ4V() {
        return this.zzYtN != Integer.MIN_VALUE;
    }

    public final boolean zzZ4W() {
        zzZKY zzzky = this.zzYtP;
        return (zzzky == null || zzzky.isEmpty()) ? false : true;
    }

    public final boolean zzZ4X() {
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) ((zzYN8) zzZZJ()).zza9()).zzYTt();
        return (((zzZKV) zzaa()).zzZ4D() ? zzz35.zzZRg() : zzz35.zzZRf()) < 0;
    }

    public final void zzZ4Y() throws Exception {
        setY(Integer.MIN_VALUE);
        setHeight(Integer.MIN_VALUE);
        this.zzYtN = Integer.MIN_VALUE;
        this.zzYtO = 1073741823;
    }

    @Override // com.aspose.words.zzYMD
    public final zzYN8 zzZ8m() {
        return (zzYN8) zzZZJ();
    }

    @Override // com.aspose.words.zzYMD
    public final zzTF zzZZJ() {
        zzTF zztfZzZZJ = super.zzZZJ();
        if (zztfZzZZJ != null) {
            return zztfZzZZJ;
        }
        if (zza9() != null) {
            zza9().zza9();
        }
        return ((zzZKV) zzaa()).zzZ8m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZoN() throws Exception {
        boolean zZzZ4M;
        int i;
        zzZ4P();
        boolean zZzZYM = ((zzYN8) zzZZJ()).zza7().zzZYM();
        int iZzYqm = ((zzYN8) zzZZJ()).zzYqm();
        zzZ35 zzz35 = (zzZ35) ((zzZKV) zzaa()).zzZ4C().zzYTt();
        zzYBK zzybk = new zzYBK();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 2;
        while (true) {
            zzZ4N();
            int iZzYqo = ((zzZKV) zzaa()).zzZ4D() ? ((zzYN8) zzZZJ()).zzYqo() : ((zzYN8) zzZZJ()).zzYqn();
            zzZ(zzybk);
            int i6 = i3 + 1;
            int height = getHeight();
            setHeight(zzZ4F());
            if (((zzZKV) zzaa()).zzZ4D()) {
                if (!zzZ4V()) {
                    zzAk(getY() + getHeight());
                }
                i = ((((zzYN8) zzZZJ()).zzYqp() == null ? zzZ4M() : i2) != 0 || zzAi(iZzYqo)) ? 1 : i2;
            } else {
                int iMax = Math.max(i2, (zzz35.getPageHeight() - zzz35.zzYLx()) - getHeight());
                getY();
                getHeight();
                if ((i6 == 1 ? 1 : i2) != 0) {
                    if (((zZzZYM && zzZ4O()) ? 1 : i2) == 0) {
                        i4 = 1;
                        zzAj(iMax);
                    } else if (getY() == ((zzYN8) zzZZJ()).zzYqo()) {
                        ((zzYN8) zzZZJ()).zzYqo();
                        i5 = 1;
                        i4 = 1;
                        zzAj(iMax);
                    } else {
                        if (iMax < ((zzYN8) zzZZJ()).zzYqo()) {
                            iMax = ((zzYN8) zzZZJ()).zzYqo();
                            i4 = 3;
                        } else {
                            i4 = 2;
                        }
                        zzAj(iMax);
                    }
                } else {
                    int y = getY();
                    if (!zZzZYM || i6 > i5) {
                        iMax = y;
                    } else {
                        boolean z = zzZ4G() ? false : false;
                        if (!z) {
                        }
                    }
                }
                if (getY() == iMax || i6 >= i4) {
                    zZzZ4M = zzZ4M();
                    if (zZzZ4M) {
                        iMax = zzZ4T();
                        i5 = i3 + 2;
                    }
                } else {
                    zZzZ4M = false;
                }
                i = (zZzZ4M || zzX1(iMax, iZzYqo)) ? 1 : 0;
                setY(iMax);
            }
            if (i == 0) {
                break;
            }
            i3 = i6;
            i2 = 0;
        }
        zzYU(true);
        zzZKY zzzky = this.zzYtP;
        if (zzzky != null) {
            zzzky.zzYU(true);
        }
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (super.zzbF() == null) {
            com.aspose.words.internal.zzG zzgZzZ = zz5.zzZ((zzTF) this, false);
            zzgZzZ.zzZ(com.aspose.words.internal.zzP8.zzM(com.aspose.words.internal.zzSA.zzY(zz5.zzZ(this, getHeight()))));
            super.zzF(zzgZzZ);
        }
        return super.zzbF();
    }
}
