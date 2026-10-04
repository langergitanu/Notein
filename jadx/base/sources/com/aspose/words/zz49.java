package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz49 extends zz80 implements Cloneable {
    private static zzZCA zzZ9l = new zz6Q(zz48.zzZx8());
    private boolean zzZ0F;
    private zz30 zzZ0G;
    private zzZCB zzZf9;

    public static class zzZ implements zzZCA, Cloneable {
        private zzZCB zzZ2X;

        public zzZ(zz49 zz49Var, zz0N zz0n) {
            this.zzZ2X = zz0n.zzGF(zz49Var.getLevel()).zzZf9;
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

    public zz49() {
        zz6R zz6r = new zz6R();
        this.zzZf9 = zz6r;
        zz6r.zzZ(zzZ9l);
    }

    private int getCount() {
        return this.zzZf9.getCount();
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

    public final int getAlignment() {
        return ((Integer) zzLv(1)).intValue();
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public final com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return (com.aspose.words.internal.zzZYG) zzLv(20);
    }

    public final int getLevel() {
        return ((Integer) zzLv(0)).intValue();
    }

    public final boolean isEmpty() {
        return getCount() == 0 && !this.zzZ0F && zzZHc().getCount() == 0;
    }

    public final void setAlignment(int i) {
        zzL(1, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zz80, com.aspose.words.zzZCH
    public final void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        zzL(20, zzzyg);
    }

    public final void setLevel(int i) {
        zzL(0, Integer.valueOf(i));
    }

    public final void zzHi(int i) {
        zzL(9, Integer.valueOf(i));
    }

    public final void zzHj(int i) {
        zzL(8, Integer.valueOf(i));
    }

    public final void zzHk(int i) {
        zzL(6, Integer.valueOf(i));
    }

    public final void zzHl(int i) {
        zzL(4, Integer.valueOf(i));
    }

    public final void zzHm(int i) {
        zzL(2, Integer.valueOf(i));
    }

    public final Object zzLu(int i) {
        return this.zzZf9.zzLu(i);
    }

    public final void zzWS(boolean z) {
        this.zzZ0F = z;
    }

    public final void zzWT(boolean z) {
        zzL(10, Boolean.valueOf(z));
    }

    public final void zzWU(boolean z) {
        zzL(7, Boolean.valueOf(z));
    }

    public final void zzWV(boolean z) {
        zzL(5, Boolean.valueOf(z));
    }

    public final void zzWW(boolean z) {
        zzL(3, Boolean.valueOf(z));
    }

    public final void zzX(zz30 zz30Var) {
        this.zzZ0G = zz30Var;
    }

    public final void zzZ(zz49 zz49Var) {
        zzY(new zz6Q(zz49Var.zzZf9));
    }

    public final zz30 zzZHc() {
        if (this.zzZ0G == null) {
            this.zzZ0G = new zz30();
        }
        return this.zzZ0G;
    }

    public final int zzZRh() {
        return ((Integer) zzLv(9)).intValue();
    }

    public final int zzZRi() {
        return ((Integer) zzLv(8)).intValue();
    }

    public final boolean zzZx9() {
        return this.zzZ0F;
    }

    public final boolean zzZxa() {
        return (zzZxl() == null || zzZxl().zzZth() == 0) ? false : true;
    }

    public final zz0E zzZxb() {
        return (zz0E) zzLv(14);
    }

    public final zz0E zzZxc() {
        return (zz0E) zzLv(13);
    }

    public final zz0E zzZxd() {
        return (zz0E) zzLv(12);
    }

    public final boolean zzZxe() {
        return ((Boolean) zzLv(10)).booleanValue();
    }

    public final int zzZxf() {
        return ((Integer) zzLv(6)).intValue();
    }

    public final int zzZxg() {
        return ((Integer) zzLv(4)).intValue();
    }

    public final int zzZxh() {
        return ((Integer) zzLv(2)).intValue();
    }

    public final zz0U zzZxi() {
        return (zz0U) zzLv(18);
    }

    public final zz0T zzZxj() {
        return (zz0T) zzLv(16);
    }

    public final zz0V zzZxk() {
        return (zz0V) zzLv(17);
    }

    public final zz0W zzZxl() {
        return (zz0W) zzLv(15);
    }

    public final zz49 zzZxm() {
        zz49 zz49Var = (zz49) memberwiseClone();
        zzZCB zzzcb = this.zzZf9;
        if (zzzcb != null) {
            zz49Var.zzZf9 = zzzcb.zzZzY();
        }
        zz30 zz30Var = this.zzZ0G;
        if (zz30Var != null) {
            zz49Var.zzZ0G = zz30Var.zzZw2();
        }
        zz0W zz0w = (zz0W) zzLu(15);
        if (zz0w != null) {
            zz49Var.zzL(15, zz0w.zzZtl());
        }
        zz0V zz0v = (zz0V) zzLu(17);
        if (zz0v != null) {
            zz49Var.zzL(17, zz0v.zzZte());
        }
        zz0T zz0t = (zz0T) zzLu(16);
        if (zz0t != null) {
            zz49Var.zzL(16, zz0t.zzZtb());
        }
        zz0U zz0u = (zz0U) zzLu(18);
        if (zz0u != null) {
            zz49Var.zzL(18, zz0u.zzZtc());
        }
        zz0E zz0e = (zz0E) zzLu(12);
        if (zz0e != null) {
            zz49Var.zzL(12, zz0e.zzZwA());
        }
        zz0E zz0e2 = (zz0E) zzLu(13);
        if (zz0e2 != null) {
            zz49Var.zzL(13, zz0e2.zzZwA());
        }
        zz0E zz0e3 = (zz0E) zzLu(14);
        if (zz0e3 != null) {
            zz49Var.zzL(14, zz0e3.zzZwA());
        }
        TabStopCollection tabStopCollection = (TabStopCollection) zzLu(19);
        if (tabStopCollection != null) {
            zz49Var.zzL(19, tabStopCollection.zzY0t());
        }
        if (hasExtensions()) {
            zz49Var.setExtensions(zzZBz());
        }
        return zz49Var;
    }

    public final void zzX(zz0E zz0e) {
        zzL(14, zz0e);
    }

    public final void zzY(zz0N zz0n) {
        zzY(new zzZ(this, zz0n));
    }

    public final void zzZ(zz0W zz0w) {
        zzL(15, zz0w);
    }

    public final void zzY(zzZCA zzzca) {
        this.zzZf9.zzZ(zzzca);
    }

    public final void zzZ(zz0V zz0v) {
        zzL(17, zz0v);
    }

    public final void zzY(zz0E zz0e) {
        zzL(13, zz0e);
    }

    public final void zzZ(zz0T zz0t) {
        zzL(16, zz0t);
    }

    public final void zzZ(zz0U zz0u) {
        zzL(18, zz0u);
    }

    public final void zzZ(zz0E zz0e) {
        zzL(12, zz0e);
    }

    public final void zzZ(TabStopCollection tabStopCollection) {
        zzL(19, tabStopCollection);
    }
}
