package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz7S extends zz53 implements zzZCG {
    protected zz2C zzZjd;
    private zz7X zzZjf;

    public final zz7X getFill() {
        if (this.zzZjf == null) {
            this.zzZjf = new zz19();
        }
        return this.zzZjf;
    }

    public final void setFill(zz7X zz7x) {
        this.zzZjf = zz7x;
    }

    @Override // com.aspose.words.zz53
    public zz53 zzY(boolean z, zzZA5 zzza5) {
        zz7S zz7s = (zz7S) super.zzY(z, zzza5);
        zz7X zz7x = this.zzZjf;
        if (zz7x != null) {
            zz7s.zzZjf = zz7x.zzZQ6();
        }
        zz2C zz2c = this.zzZjd;
        if (zz2c != null) {
            zz7s.zzZjd = zz2c.zzZuX();
        }
        return zz7s;
    }

    public void zzZ(zz2C zz2c) {
        this.zzZjd = zz2c;
    }

    public boolean zzZFk() throws Exception {
        if (getFill() == null || getFill().zzZQ4() == 3) {
            return false;
        }
        return getFill().getOpacity() < 1.0d || getFill().zzZBv() < 1.0d;
    }

    @Override // com.aspose.words.zzZCG
    public final zz7X zzZMY() {
        if (!(getFill() instanceof zz70)) {
            return getFill();
        }
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(zzZye(), ShapeBase.class);
        if (shapeBase == null || !(shapeBase.zzY9i() instanceof zzZCG)) {
            return null;
        }
        return ((zzZCG) shapeBase.zzY9i()).zzZMY();
    }

    public zz2C zzZTe() {
        return this.zzZjd;
    }
}
