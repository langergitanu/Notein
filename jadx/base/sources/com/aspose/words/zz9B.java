package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zz9B extends zz9F {
    private zzHX zzZ5J;

    public zz9B(zz8Z zz8z) {
        super(zz8z);
        this.zzZ5J = new zzHX();
    }

    private int zzZDl() {
        Iterator<zz93> it = zzZDT().iterator();
        int i = 0;
        while (it.hasNext()) {
            int iZzZ = zzZDL().zzZEk().zzZ(it.next());
            if (iZzZ > i) {
                i = iZzZ;
            }
        }
        return i;
    }

    private zz2O zzZDm() {
        zz2O zz2oZzZDq = zzZDq();
        if (zz2oZzZDq == null) {
            return null;
        }
        zzS(zz2oZzZDq);
        if (zz2oZzZDq.zzZAk() != null) {
            zz2oZzZDq.zzZAk().zzZ(zzU(zz2oZzZDq));
        }
        return zz2oZzZDq;
    }

    private boolean zzZDn() throws Exception {
        zz8O zz8oZzZDp = zzZDp();
        if (zzZDL().zzZCF().zzZ(zz8oZzZDp)) {
            return zzZDL().zzZCF().zzY(zz8oZzZDp);
        }
        return zzZDL().zzZCF().zzZ(zz8oZzZDp, zzZDm());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzS(zz2O zz2o) {
        if (zzZDT().size() == 0) {
            return;
        }
        zzHY zzhy = new zzHY(zzZDR());
        int i = 0;
        int iZzZ = zzZDL().zzZEk().zzZ(zzZDT().get(0));
        int i2 = 1;
        Object[] objArr = zzZDl() == iZzZ && !this.zzZ5J.zzZR7();
        zz0J zz0j = new zz0J();
        zz2o.zzY(zz0j);
        zz0j.zzX(new zz11());
        zz0j.zzZCZ().zzZtK().zzZ(new zz2K());
        zz0j.zzZCZ().zzZtK().zzWF(false);
        zz0j.zzZCZ().zzZtK().zzGH(0);
        zz0j.zzZCZ().zzZtK().setColumnNumber(1);
        zz0j.zzZCZ().zzZtK().zzGQ(zzhy.zzZRg());
        zz0j.zzZCZ().zzZtK().zzGR(zzhy.zzZRf());
        zz0j.zzZCZ().zzZtK().zzGO(zzhy.zzZRi());
        zz0j.zzZCZ().zzZtK().zzGP(zzhy.zzZRh());
        zz0j.zzZCZ().zzZtK().zzGJ(this.zzZ5J.zzZR2());
        zz10 zz10VarZzZtK = zz0j.zzZCZ().zzZtK();
        zzHX zzhx = this.zzZ5J;
        zz10VarZzZtK.zzWJ(objArr != false ? zzhx.zzZR6() : zzhx.zzZR5());
        zz10 zz10VarZzZtK2 = zz0j.zzZCZ().zzZtK();
        zzHX zzhx2 = this.zzZ5J;
        zz10VarZzZtK2.zzGN(objArr != false ? zzhx2.zzZR4() : zzhx2.zzZR3());
        int iZzZR9 = objArr != false ? this.zzZ5J.zzZR9() : this.zzZ5J.zzZR8();
        for (zz93 zz93Var : zzZDT()) {
            if (zz93Var.zzZCZ() != null) {
                int iZzZ2 = zzZDL().zzZEk().zzZ(zz93Var);
                Iterator<zz4A> it = zz93Var.zzZCZ().zzMi().iterator();
                while (it.hasNext()) {
                    zz4A zz4aZzZxr = it.next().zzZxr();
                    zz0j.zzZCZ().zzY(zz4aZzZxr);
                    zz4aZzZxr.zzZxp().setLevel((iZzZ2 - iZzZ) + (this.zzZ5J.zzZR7() ? 1 : 0));
                    int i3 = zz4aZzZxr.zzZxp().getLevel() == 0 ? i2 : i;
                    zz0K zz0kZzXh = zz0K.zzXh(i3 != 0 ? zzhy.zzZRk() : zzhy.zzZRj());
                    zzZDL().zzZCM().zzZ(zz2o, zz4aZzZxr, zzZDV());
                    zz0J zz0j2 = zz0j;
                    zz4aZzZxr.zzZxp().zzHm((int) (zz0kZzXh.zzZsz() * 3.5d));
                    zz4aZzZxr.zzZxp().zzZ(new zz0W());
                    zz4aZzZxr.zzZxp().setAlignment(iZzZR9);
                    if (i3 != 0) {
                        zz4aZzZxr.zzZxp().zzZxl().zzGG(i);
                        zz4aZzZxr.zzZxp().zzZ(this.zzZ5J.zzZRa());
                        zz4aZzZxr.zzZxp().zzY(this.zzZ5J.zzZRc());
                        zz4aZzZxr.zzZxp().zzX(new zz3X(0.0d));
                    } else {
                        zz4aZzZxr.zzZxp().zzZxl().zzGG(2);
                        zz4aZzZxr.zzZxp().zzZxl().zzOj("••");
                        double dZzZsz = zz0kZzXh.zzZsz() * 0.7300000190734863d;
                        zz4aZzZxr.zzZxp().zzHj((int) (((double) zz4aZzZxr.zzZxp().getLevel()) * dZzZsz));
                        zz4aZzZxr.zzZxp().zzHk((int) (-dZzZsz));
                        zz4aZzZxr.zzZxp().zzZ(this.zzZ5J.zzZRb());
                        zz4aZzZxr.zzZxp().zzY(this.zzZ5J.zzZRd());
                        zz4aZzZxr.zzZxp().zzX(new zz3X(0.0d));
                    }
                    Iterator<zz47> it2 = zz4aZzZxr.zzMf().iterator();
                    while (it2.hasNext()) {
                        it2.next().zzZx5().zzX(zz0kZzXh);
                    }
                    zz0j = zz0j2;
                    i = 0;
                    i2 = 1;
                }
            }
        }
    }

    public zz07 zzU(zz2O zz2o) {
        return zzZ(zz2o.zzZTf(), zz2o.zzZTh(), this.zzZ5J.zzZRe());
    }

    @Override // com.aspose.words.zz9K
    public final void zzW(com.aspose.words.internal.zzZYT<String> zzzyt) {
        this.zzZ5J.zzX(zzzyt);
    }

    @Override // com.aspose.words.zz9K
    public final void zzZ(zz8Y zz8y) {
        zzZ(zzZDm(), zz8y);
    }

    public zz8O zzZDp() {
        return new zz8O(this, new zzHY(zzZDR()), zz8N.zzZ(zzZDQ(), new zzHK()));
    }

    public zz2O zzZDq() {
        return zzZDZ();
    }

    @Override // com.aspose.words.zz9K
    public final void zzZE0() {
        super.zzZE0();
        zzZDR().zzHW(22);
        zzZDR().zzHW(27);
        zzZDR().zzHW(20);
        zzZDR().zzHW(25);
        zzZDR().zzHW(33);
        zzZDR().zzHW(6);
    }

    @Override // com.aspose.words.zz9F, com.aspose.words.zz9K
    public final void zzZE3() throws Exception {
        super.zzZE3();
        zzXp(zzZDn());
        zzZDL().zzZCI().zzT(this);
    }

    public static zz07 zzZ(zz7H zz7h, zz07 zz07Var, int i) {
        double d;
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(zz07Var.zzZCC().zzZQQ());
        boolean z = false;
        if (i == 1) {
            d = 0.0d;
        } else {
            if (dZzZJ <= 45.0d || dZzZJ >= 135.0d) {
                if (dZzZJ < 135.0d || dZzZJ > 225.0d) {
                    d = (dZzZJ > 225.0d && dZzZJ < 315.0d) ? -270.0d : -90.0d;
                    d = 0.0d;
                } else {
                    d = -180.0d;
                }
            }
            z = true;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zz7h, com.aspose.words.internal.zzZPW.zzG((float) zz07Var.getWidth(), (float) zz07Var.getHeight()));
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX() + ((float) zz07Var.zzQb()), zzzq4ZzZ.getY() + ((float) zz07Var.zzYm()), zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight());
        long jZzNV = zz07Var.zzNV();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        int i2 = (int) jZzNV;
        zzp9.zzY(-Float.intBitsToFloat(i2), -com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        zzp9.zzX((float) dZzZJ, 1);
        zzp9.zzY(Float.intBitsToFloat(i2), com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        long jZzR = zzp9.zzR(com.aspose.words.internal.zzJ6.zzB(zzzq4));
        float height = z ? zzzq4.getHeight() : zzzq4.getWidth();
        float width = z ? zzzq4.getWidth() : zzzq4.getHeight();
        zz07 zz07Var2 = new zz07();
        zz07Var2.zzX(zzHK.zzYR(d));
        zz07Var2.setWidth(height);
        zz07Var2.setHeight(width);
        zz07Var2.zzW(Float.intBitsToFloat((int) jZzR) - (height / 2.0f));
        zz07Var2.zzV(com.aspose.words.internal.zzZPY.zzYC(jZzR) - (width / 2.0f));
        return zz07Var2;
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zz7H zz7h, long j) {
        zz7h.zzZAP().zzp(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPW.zzYz(j));
        com.aspose.words.internal.zzZQ4 zzzq4ZzZAL = zz7h.zzZAL();
        return zzzq4ZzZAL.isEmpty() ? new com.aspose.words.internal.zzZQ4(0L, j) : zzzq4ZzZAL;
    }
}
