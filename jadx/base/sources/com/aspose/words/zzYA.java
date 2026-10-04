package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYA extends zzYW0 {
    private String zzZCG;
    private boolean zzZCH;

    public zzYA(zzYWB zzywb, String str) {
        super(zzywb, 2, false);
        this.zzZCG = str;
    }

    private boolean zz9a() {
        return next().getNodeType() == 10 && com.aspose.words.internal.zzZKN.equals(((BookmarkEnd) next()).getName(), this.zzZCG);
    }

    private boolean zz9b() {
        return next().getNodeType() == 9 && com.aspose.words.internal.zzZKN.equals(((BookmarkStart) next()).getName(), this.zzZCG);
    }

    public final boolean hasBookmark() {
        return this.zzZCH;
    }

    @Override // com.aspose.words.zzYW0, com.aspose.words.zzYVW
    public final void zz9c() {
        if (zz9b()) {
            zzYzJ();
            super.zz9c();
            this.zzZCH = true;
        } else if (!zz9a()) {
            super.zz9c();
        } else {
            super.zz9c();
            zzYzI();
        }
    }
}
