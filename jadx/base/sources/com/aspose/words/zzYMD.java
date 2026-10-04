package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYMD extends zzYS implements Cloneable {
    private zzYMD zzXFB;
    private zzYMD zzXFC;
    private zzTE zzXFD;
    private zzTF zzXFE;
    protected int zzdp = Integer.MIN_VALUE;
    protected int zzdo = Integer.MIN_VALUE;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void zzU(zzYMD zzymd, boolean z) throws Exception {
        if (zzymd == null || !zzymd.isActive()) {
            return;
        }
        zzYS.zzZ(zzymd, z ? 8 : 9);
    }

    private static void zzV(zzYMD zzymd, boolean z) throws Exception {
        zzYC4 zzyc4;
        if ((zzymd.getX() == Integer.MIN_VALUE || zzymd.getY() == Integer.MIN_VALUE) && (zzyc4 = (zzYC4) com.aspose.words.internal.zzZKW.zzZ(zzymd.zzqh(2048), zzYC4.class)) != null) {
            zzZ(zzyc4, 1, z, false);
        }
    }

    public static void zzq(zzYMD zzymd) throws Exception {
        zzU(zzymd, false);
    }

    public static void zzr(zzYMD zzymd) throws Exception {
        zzU(zzymd, true);
    }

    public static void zzs(zzYMD zzymd) {
        if (zzymd == null) {
            return;
        }
        zzymd.zzF(null);
        zzTF zztf = (zzTF) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzTF.class);
        if (zztf != null) {
            for (zzYMD zzymdZz6x = zztf.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
                zzs(zzymdZz6x);
            }
        }
    }

    public final int getBottom() throws Exception {
        return getY() + getHeight();
    }

    public int getContentHeight() throws Exception {
        return getHeight();
    }

    public abstract int getHeight() throws Exception;

    public final int getRight() throws Exception {
        return getX() + getWidth();
    }

    public final long getSize() throws Exception {
        return com.aspose.words.internal.zzZPX.zzZm(getWidth(), getHeight());
    }

    public abstract int getWidth() throws Exception;

    public int getX() {
        return this.zzdp;
    }

    public int getY() throws Exception {
        return this.zzdo;
    }

    public final boolean isActive() {
        return zza9() != null;
    }

    public void remove() throws Exception {
        if (zzZZJ() != null) {
            zzZZJ().zzY(this, true);
        }
        if (zza9() != null) {
            zza9().zzB(this);
        }
    }

    public abstract void setHeight(int i) throws Exception;

    public abstract void setWidth(int i);

    public final void setX(int i) {
        this.zzdp = i;
    }

    public final void setY(int i) {
        this.zzdo = i;
    }

    public zzTF zz0s() throws Exception {
        zzTF zztf = (zzTF) zz5R();
        zza9().zzZ(this, this.zzXFC, zztf, true);
        return zztf;
    }

    public int zz0t() throws Exception {
        throw new IllegalStateException("WrapHeight is not available for parts of " + getClass().getName() + " type.");
    }

    public void zz0u() {
    }

    public zzTE zz0v() {
        return null;
    }

    public zzYMD zz5R() {
        zzYMD zzymd = (zzYMD) memberwiseClone();
        zzymd.zzZ((zzTE) null);
        zzymd.zzY(null);
        zzymd.zzZ((zzZ6T) null);
        zzymd.zzXFC = null;
        zzymd.zzXFB = null;
        zzymd.zzZ((zzY9C) null);
        return zzymd;
    }

    public zzYMD zz5Y() {
        return null;
    }

    public zzYMD zz5Z() {
        return null;
    }

    public abstract int zz60();

    public void zzF(com.aspose.words.internal.zzZL zzzl) {
        if (zzzl != null) {
            throw new IllegalStateException("Derived class must implement SetAps.");
        }
    }

    public final void zzN(zzTF zztf) throws Exception {
        zzZZJ();
        zzZZJ().zzZ(this, zztf);
    }

    public abstract boolean zzNd(int i) throws Exception;

    public final void zzO(zzTF zztf) throws Exception {
        zzZZJ();
        zzZZJ().zzY(this, zztf);
    }

    public void zzP(zzTF zztf) throws Exception {
        zzNd(1);
    }

    public final void zzY(zzTF zztf) {
        if (zztf == null) {
            this.zzXFD = null;
            this.zzXFE = null;
        } else if (zztf.zz0v() == null) {
            this.zzXFE = zztf;
            this.zzXFD = null;
        } else {
            this.zzXFD = zztf.zz0v();
            this.zzXFE = null;
        }
    }

    public final long zzYK() throws Exception {
        return com.aspose.words.internal.zzZPZ.zzZm(getX(), getY());
    }

    public boolean zzYQq() {
        return this == zzZZJ().zz6w() && zzZZJ().zzYQq();
    }

    public boolean zzYQr() {
        return this == zzZZJ().zz6x() && zzZZJ().zzYQr();
    }

    public final boolean zzYTm() {
        zza9();
        zzYMD zzymd = this.zzXFB;
        if (zzymd != null) {
            zzymd.zza9();
        }
        zzYMD zzymd2 = this.zzXFB;
        return zzymd2 == null || zzymd2.zza9() != zza9();
    }

    public final boolean zzYTn() {
        zza9();
        zzYMD zzymd = this.zzXFC;
        if (zzymd != null) {
            zzymd.zza9();
        }
        zzYMD zzymd2 = this.zzXFC;
        return zzymd2 == null || zzymd2.zza9() != zza9();
    }

    public final void zzYnV() throws Exception {
        zzaa();
        if (zzac()) {
            if (zzab() == null || zzab().zzZoR() == null || zzaa().zzZoB().zzYlW()) {
                zzNd(3);
            } else {
                zzZ(this, new zzYZC(this, 3, -1));
            }
        }
    }

    public final zzWT zzYnW() {
        return (zzWT) (zzZZJ() == null ? null : zzZZJ().zzqh(16));
    }

    public final zzWT zzYnX() {
        return (zzWT) zzqh(16);
    }

    public final boolean zzYnY() {
        return zzZZJ() != null && zzZZJ().zz6w() == this;
    }

    public final boolean zzYnZ() {
        return zzZZJ() != null && zzZZJ().zz6x() == this;
    }

    public final zzYMD zzYo0() {
        return this.zzXFB;
    }

    public final zzYMD zzYo1() {
        return this.zzXFC;
    }

    public long zzYqr() throws Exception {
        return zzZ(this, 1, false, false);
    }

    public void zzZ(zzTE zzte) {
    }

    public zzYN8 zzZ8m() {
        return (zzYN8) zzqh(1);
    }

    public void zzZXO() {
    }

    public zzTF zzZZJ() {
        zzTE zzte = this.zzXFD;
        return zzte != null ? zzte.zzZZJ() : this.zzXFE;
    }

    @Override // com.aspose.words.zzYS
    public final zzY9C zzaa() {
        if (super.zza9() == null) {
            return null;
        }
        return super.zza9().zzaa();
    }

    public com.aspose.words.internal.zzZL zzbF() throws Exception {
        throw new IllegalStateException("Derived class must implement GetAps.");
    }

    public zzYMD zzqh(int i) {
        if ((zz60() & i) != 0) {
            return this;
        }
        if (zzZZJ() != null) {
            return zzZZJ().zzqh(i);
        }
        return null;
    }

    public final void zzt(zzYMD zzymd) {
        this.zzXFB = zzymd;
    }

    public final void zzu(zzYMD zzymd) {
        this.zzXFC = zzymd;
    }

    public void zzxF(int i) {
    }

    @Override // com.aspose.words.zzYS
    public final void zzZ(zzYZC zzyzc) throws Exception {
        if (zza9() != null) {
            zzNd(3);
        }
    }

    public static long zzZ(zzYMD zzymd, int i, boolean z, boolean z2) throws Exception {
        zzTC zztc;
        int x = 0;
        zzYMD zzymdZzZZJ = zzymd;
        int y = 0;
        while (true) {
            if (zzymdZzZZJ == null || (zzymdZzZZJ.zz60() & i) != 0) {
                break;
            }
            if (z2) {
                zzV(zzymdZzZZJ, z);
            }
            zzZNO zzznoZzZXN = zzymdZzZZJ instanceof zzTC ? ((zzTC) zzymdZzZZJ).zzZXN() : null;
            if (zzznoZzZXN != null && zzznoZzZXN.zzZ8T()) {
                long jZzZE = zzznoZzZXN.zzZ8V().zzZE();
                x += (int) jZzZE;
                y += (int) (jZzZE >> 32);
                if (!zzznoZzZXN.zzhk()) {
                    long jZzYK = zzymdZzZZJ.zzZZJ().zzYK();
                    x -= (int) jZzYK;
                    y -= (int) (jZzYK >> 32);
                }
            }
            if (z && (zztc = (zzTC) com.aspose.words.internal.zzZKW.zzZ(zzymdZzZZJ, zzTC.class)) != null && zztc.zzZXQ() != 0) {
                y += zztc.zzZXQ();
            }
            if (zzymdZzZZJ.zzZZJ() == null && zzymdZzZZJ.zz60() == 2048 && i == 1) {
                zzY9X zzy9xZzY8N = ((zzYC4) zzymdZzZZJ).zzY8N();
                while (zzy9xZzY8N.zzaa().getStoryType() == 5) {
                    zzy9xZzY8N = ((zzYC4) zzy9xZzY8N.zzaa().zz6x()).zzY8N();
                }
                long jZzYqr = zzy9xZzY8N.zzYqr();
                x += (int) jZzYqr;
                y += (int) (jZzYqr >> 32);
            } else {
                if (zzymdZzZZJ.getX() != Integer.MIN_VALUE) {
                    zzymdZzZZJ.getY();
                }
                x += zzymdZzZZJ.getX();
                y += zzymdZzZZJ.getY();
                zzymdZzZZJ = zzymdZzZZJ.zzZZJ();
            }
        }
        if (zzymdZzZZJ != null) {
            return com.aspose.words.internal.zzZPZ.zzZm(x, y);
        }
        throw new IllegalStateException("Cannot translate from '" + zzymd.zz60() + "' in '" + zzymd.zzaa().getStoryType() + "' to '" + i + "'.");
    }
}
