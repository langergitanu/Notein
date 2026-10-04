package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz54 extends zz7X {
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
    public final Shading zzX(zzGR zzgr) {
        return null;
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPV zzY(zzGR zzgr) {
        return com.aspose.words.internal.zzPV.zzHZ;
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBn() {
        return null;
    }

    @Override // com.aspose.words.zz7X
    public final int zzZQ4() {
        return 3;
    }

    @Override // com.aspose.words.zz7X
    public final zz7X zzZQ6() {
        return new zz54();
    }
}
