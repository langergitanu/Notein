package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz30 extends zz80 implements zzZAB, Cloneable {
    private static zzZCA zzYZC = new zz6Q(zz2Z.zzZvJ());
    private zzZCB zzZf9;
    private zz2C zzZjd;

    public static class zzZ implements zzZCA, Cloneable {
        private zzZCB zzZ2X;

        public zzZ(zz4A zz4a, zz0N zz0n) {
            this.zzZ2X = zz0n.zzGF(zz4a.zzZxp().getLevel()).zzZHc().zzZf9;
        }

        private Object memberwiseClone() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCA zzZOl() {
            zzZ zzz = (zzZ) memberwiseClone();
            zzZCB zzzcb = this.zzZ2X;
            if (zzzcb != null) {
                zzz.zzZ2X = zzzcb.zzZzY();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            return this.zzZ2X;
        }
    }

    public zz30() {
        zz6R zz6r = new zz6R();
        this.zzZf9 = zz6r;
        zz6r.zzZ(zzYZC);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zzL(int i, Object obj) {
        this.zzZf9.zzL(i, obj);
    }

    private Object zzLv(int i) {
        return this.zzZf9.zzLv(i);
    }

    public final boolean getBold() {
        return ((Boolean) zzLv(1)).booleanValue();
    }

    @Override // com.aspose.words.zzZAB
    public final int getCount() {
        return this.zzZf9.getCount();
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public final com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return (com.aspose.words.internal.zzZYG) zzLv(34);
    }

    public final zz7X getFill() {
        return (zz7X) zzLv(19);
    }

    public final zz4G getOutline() {
        return (zz4G) zzLv(20);
    }

    public final int getUnderline() {
        return ((Integer) zzLv(18)).intValue();
    }

    public final void isDirty(boolean z) {
        zzL(5, Boolean.valueOf(z));
    }

    public final boolean isEmpty() {
        return this.zzZf9.getCount() == 0;
    }

    public final void remove(int i) {
        this.zzZf9.remove(i);
    }

    public final void removeAll() {
        this.zzZf9.removeAll();
    }

    public final void setBold(boolean z) {
        zzL(1, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public final void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        zzL(34, zzzyg);
    }

    public final void setFill(zz7X zz7x) {
        zzL(19, zz7x);
    }

    public final void setNoProofing(boolean z) {
        zzL(11, Boolean.valueOf(z));
    }

    public final void setOutline(zz4G zz4g) {
        zzL(20, zz4g);
    }

    public final void setUnderline(int i) {
        zzL(18, Integer.valueOf(i));
    }

    public final void zzH5(int i) {
        zzL(16, Integer.valueOf(i));
    }

    public final void zzH6(int i) {
        zzL(14, Integer.valueOf(i));
    }

    public final void zzH7(int i) {
        zzL(4, Integer.valueOf(i));
    }

    public final void zzH8(int i) {
        zzL(0, Integer.valueOf(i));
    }

    public final boolean zzLh(int i) {
        return this.zzZf9.zzLh(i);
    }

    public final Object zzLu(int i) {
        return this.zzZf9.zzLu(i);
    }

    public final void zzOn(String str) {
        zzL(3, str);
    }

    public final void zzP(zz4G zz4g) {
        zzL(31, zz4g);
    }

    public final void zzRe(int i) {
        zzL(10, Integer.valueOf(i));
    }

    public final int zzTu() {
        return ((Integer) zzLv(10)).intValue();
    }

    public final void zzU(zz30 zz30Var) {
        this.zzZf9.zzZ(new zz6Q(zz30Var.zzZf9));
    }

    public final void zzV(zz30 zz30Var) {
        zz30Var.zzZf9 = this.zzZf9.zzZzY();
        zz2C zz2c = this.zzZjd;
        if (zz2c != null) {
            zz30Var.zzZjd = zz2c.zzZuX();
        }
        zz0K zz0k = (zz0K) zzLu(8);
        if (zz0k != null) {
            zz30Var.zzL(8, zz0k.zzZsB());
        }
        zz0K zz0k2 = (zz0K) zzLu(15);
        if (zz0k2 != null) {
            zz30Var.zzL(15, zz0k2.zzZsB());
        }
        zz0K zz0k3 = (zz0K) zzLu(17);
        if (zz0k3 != null) {
            zz30Var.zzL(17, zz0k3.zzZsB());
        }
        zz7X zz7x = (zz7X) zzLu(19);
        if (zz7x != null) {
            zz30Var.zzL(19, zz7x.zzZQ6());
        }
        zz4G zz4g = (zz4G) zzLu(20);
        if (zz4g != null) {
            zz30Var.zzL(20, zz4g.zzZxK());
        }
        zzBW zzbw = (zzBW) zzLu(21);
        if (zzbw != null) {
            zz30Var.zzL(21, zzbw.zzZHt());
        }
        zz7P zz7p = (zz7P) zzLu(22);
        if (zz7p != null) {
            zz30Var.zzL(22, zz7p.zzZAZ());
        }
        zz7P zz7p2 = (zz7P) zzLu(23);
        if (zz7p2 != null) {
            zz30Var.zzL(23, zz7p2.zzZAZ());
        }
        zz7P zz7p3 = (zz7P) zzLu(24);
        if (zz7p3 != null) {
            zz30Var.zzL(24, zz7p3.zzZAZ());
        }
        zz7P zz7p4 = (zz7P) zzLu(25);
        if (zz7p4 != null) {
            zz30Var.zzL(25, zz7p4.zzZAZ());
        }
        zz6P zz6p = (zz6P) zzLu(26);
        if (zz6p != null) {
            zz30Var.zzL(26, zz6p.zzZzV());
        }
        zz6P zz6p2 = (zz6P) zzLu(27);
        if (zz6p2 != null) {
            zz30Var.zzL(27, zz6p2.zzZzV());
        }
        zz7X zz7x2 = (zz7X) zzLu(29);
        if (zz7x2 != null) {
            zz30Var.zzL(29, zz7x2.zzZQ6());
        }
        zz4G zz4g2 = (zz4G) zzLu(31);
        if (zz4g2 != null) {
            zz30Var.zzL(31, zz4g2.zzZxK());
        }
    }

    public final void zzW(zz7P zz7p) {
        zzL(25, zz7p);
    }

    public final void zzWL(boolean z) {
        zzL(13, Boolean.valueOf(z));
    }

    public final void zzWM(boolean z) {
        zzL(12, Boolean.valueOf(z));
    }

    public final void zzWN(boolean z) {
        zzL(9, Boolean.valueOf(z));
    }

    public final void zzWO(boolean z) {
        zzL(7, Boolean.valueOf(z));
    }

    public final void zzWP(boolean z) {
        zzL(6, Boolean.valueOf(z));
    }

    public final void zzX(zz0K zz0k) {
        zzL(17, zz0k);
    }

    public final void zzXu(double d) {
        zzL(2, Double.valueOf(d));
    }

    public final void zzY(zz0K zz0k) {
        zzL(15, zz0k);
    }

    public final void zzZ(zz4A zz4a, zz0N zz0n) {
        this.zzZf9.zzZ(new zzZ(zz4a, zz0n));
    }

    public final zz2C zzZTe() {
        return this.zzZjd;
    }

    public final void zzZvK() {
        zzL(33, Boolean.TRUE);
    }

    public final void zzZvL() {
        zzL(32, Boolean.TRUE);
    }

    public final void zzZvM() {
        zzL(30, Boolean.TRUE);
    }

    public final zz7P zzZvN() {
        return (zz7P) zzLv(25);
    }

    public final zz7P zzZvO() {
        return (zz7P) zzLv(24);
    }

    public final zz7P zzZvP() {
        return (zz7P) zzLv(23);
    }

    public final zz7P zzZvQ() {
        return (zz7P) zzLv(22);
    }

    public final zzBW zzZvR() {
        return (zzBW) zzLv(21);
    }

    public final zz0K zzZvS() {
        return (zz0K) zzLv(17);
    }

    public final int zzZvT() {
        return ((Integer) zzLv(16)).intValue();
    }

    public final zz0K zzZvU() {
        return (zz0K) zzLv(15);
    }

    public final zz0K zzZvV() {
        return (zz0K) zzLv(8);
    }

    public final boolean zzZvW() {
        return ((Boolean) zzLv(7)).booleanValue();
    }

    public final int zzZvX() {
        return ((Integer) zzLv(4)).intValue();
    }

    public final double zzZvY() {
        return ((Double) zzLv(2)).doubleValue();
    }

    public final int zzZvZ() {
        return ((Integer) zzLv(0)).intValue();
    }

    @Override // com.aspose.words.zzZAB
    public final boolean zzZw0() {
        return true;
    }

    public final zz7P zzZw1() {
        zz7P zz7p = (zz7P) zzLu(22);
        if (zz7p != null) {
            return zz7p;
        }
        zz7P zz7p2 = (zz7P) zzLu(23);
        if (zz7p2 != null) {
            return zz7p2;
        }
        zz7P zz7p3 = (zz7P) zzLu(25);
        if (zz7p3 != null) {
            return zz7p3;
        }
        zz7P zz7p4 = (zz7P) zzLu(24);
        return zz7p4 != null ? zz7p4 : zzZvQ();
    }

    public final zz30 zzZw2() {
        zz30 zz30Var = (zz30) memberwiseClone();
        zzV(zz30Var);
        if (hasExtensions()) {
            zz30Var.setExtensions(zzZBz());
        }
        return zz30Var;
    }

    public final boolean zzr(int[] iArr) {
        return this.zzZf9.zzZ(iArr, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int zzza() {
        boolean bold = getBold();
        ?? r0 = bold;
        if (getUnderline() != 0) {
            r0 = (bold ? 1 : 0) | 4;
        }
        ?? r02 = r0;
        if (zzZvW()) {
            r02 = (r0 == true ? 1 : 0) | 2;
        }
        return zzZvT() != 0 ? r02 | 8 : r02;
    }

    public final void zzL(zzBW zzbw) {
        zzL(21, zzbw);
    }

    public final void zzW(zz7X zz7x) {
        zzL(29, zz7x);
    }

    public final void zzX(zz7P zz7p) {
        zzL(24, zz7p);
    }

    public final void zzY(zz7P zz7p) {
        zzL(23, zz7p);
    }

    public final void zzZ(zz0K zz0k) {
        zzL(8, zz0k);
    }

    public final void zzY(zz6P zz6p) {
        zzL(27, zz6p);
    }

    public final void zzZ(zz7P zz7p) {
        zzL(22, zz7p);
    }

    public final void zzZ(zz2C zz2c) {
        this.zzZjd = zz2c;
    }

    public final void zzZ(zz6P zz6p) {
        zzL(26, zz6p);
    }
}
