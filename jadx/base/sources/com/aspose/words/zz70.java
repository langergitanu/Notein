package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz70 extends zz7X {
    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final boolean getOn() {
        return false;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final double getOpacity() {
        return 0.0d;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void setOn(boolean z) {
        if (z) {
            zzZBt().setFill(new zz1C());
        }
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void setOpacity(double d) {
    }

    @Override // com.aspose.words.zz7X
    public final void zzP(zzBW zzbw) {
        zzZBt().setFill(new zz1C(zzbw));
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final Shading zzX(zzGR zzgr) throws Exception {
        zz7X zz7xZzZMY = zzgr.zzZPM().zzZMY();
        if (zz7xZzZMY != null) {
            return zz7xZzZMY.zzX(zzgr);
        }
        return null;
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPV zzY(zzGR zzgr) throws Exception {
        zz7X zz7xZzZMY = zzgr.zzZPM().zzZMY();
        return zz7xZzZMY == null ? com.aspose.words.internal.zzPV.zzHZ : zz7xZzZMY.zzY(zzgr);
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPY zzZ(zzGR zzgr) throws Exception {
        zz7X zz7xZzZMY = zzgr.zzZPM().zzZMY();
        return zz7xZzZMY == null ? com.aspose.words.internal.zzPY.zzPJ() : zz7xZzZMY.zzZ(zzgr);
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBn() {
        return null;
    }

    @Override // com.aspose.words.zz7X
    public final int zzZQ4() {
        return 2;
    }

    @Override // com.aspose.words.zz7X
    public final zz7X zzZQ6() {
        return new zz70();
    }
}
