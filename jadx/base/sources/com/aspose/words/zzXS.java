package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXS {
    zzXV zzZBA;
    zzXV zzZBB;
    zzXV zzZBC;
    zzXV zzZBz;

    public zzXS(zzPS zzps) {
        this.zzZBC = new zzXV(zzps, 3, "padding-top");
        this.zzZBB = new zzXV(zzps, 2, "padding-right");
        this.zzZBA = new zzXV(zzps, 0, "padding-bottom");
        this.zzZBz = new zzXV(zzps, 1, "padding-left");
    }

    public final boolean isVisible() {
        return this.zzZBC.isVisible() || this.zzZBB.isVisible() || this.zzZBA.isVisible() || this.zzZBz.isVisible();
    }

    public final boolean zz7I() {
        return isVisible() || this.zzZBC.zz84() || this.zzZBB.zz84() || this.zzZBA.zz84() || this.zzZBz.zz84();
    }

    public final void zzY(BorderCollection borderCollection) throws Exception {
        this.zzZBC.zzP(borderCollection.getTop());
        this.zzZBB.zzP(borderCollection.getRight());
        this.zzZBA.zzP(borderCollection.getBottom());
        this.zzZBz.zzP(borderCollection.getLeft());
    }

    public final void zzZ(BorderCollection borderCollection) throws Exception {
        this.zzZBC.zzQ(borderCollection.getTop());
        this.zzZBB.zzQ(borderCollection.getRight());
        this.zzZBA.zzQ(borderCollection.getBottom());
        this.zzZBz.zzQ(borderCollection.getLeft());
    }
}
