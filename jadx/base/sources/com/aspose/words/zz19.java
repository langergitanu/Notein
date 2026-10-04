package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz19 extends zz7X {
    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final boolean getOn() {
        if (zzZBt() == null) {
            return false;
        }
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(zzZBt(), ShapeBase.class);
        return shapeBase == null || ((zzZCL) shapeBase.zzY9i()).zzZTj() != null;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final double getOpacity() {
        return super.getOpacity();
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void setOn(boolean z) {
        if (!(zzZBt() instanceof ShapeBase)) {
            super.setOn(z);
        } else if (!z) {
            ((zzZCL) ((ShapeBase) zzZBt()).zzY9i()).zzZ(null);
        } else {
            if (getOn()) {
                return;
            }
            ((zzZCL) ((ShapeBase) zzZBt()).zzY9i()).zzZ(new zz1K());
        }
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void setOpacity(double d) {
        zz1C zz1c = new zz1C(zzZBn());
        zzZBt().setFill(zz1c);
        zz1c.setOpacity(d);
    }

    @Override // com.aspose.words.zz7X
    public final void zzP(zzBW zzbw) {
        zzZBt().setFill(new zz1C(zzbw));
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final Shading zzX(zzGR zzgr) throws Exception {
        return zzgr.zzZTj().zzW(zzgr).zzX(zzgr);
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPV zzY(zzGR zzgr) throws Exception {
        return zzgr.zzZTj().zzW(zzgr).zzY(zzgr);
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPY zzZ(zzGR zzgr) throws Exception {
        return zzgr.zzZTj().zzW(zzgr).zzZ(zzgr);
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBn() {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(zzZBt(), Shape.class);
        if (shape == null) {
            return null;
        }
        zzZCL zzzcl = (zzZCL) shape.zzY9i();
        if (zzzcl.zzZTj() != null) {
            return zzzcl.zzZTj().zzZu6().zzZQX();
        }
        return null;
    }

    @Override // com.aspose.words.zz7X
    public final int zzZQ4() {
        return 6;
    }

    @Override // com.aspose.words.zz7X
    public final zz7X zzZQ6() {
        return new zz19();
    }
}
