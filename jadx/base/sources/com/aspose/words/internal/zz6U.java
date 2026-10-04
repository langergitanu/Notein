package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6U {
    private boolean zzmk;
    private zzZYT<Integer> zzml = new zzZYT<>(false);
    private int zzmm;
    private int zzmn;
    private int zzmo;

    public final boolean getCreateMissingOutlineLevels() {
        return this.zzmk;
    }

    public final int getDefaultBookmarksOutlineLevel() {
        return this.zzmm;
    }

    public final int getExpandedOutlineLevels() {
        return this.zzmn;
    }

    public final int getHeadingsOutlineLevels() {
        return this.zzmo;
    }

    public final void setCreateMissingOutlineLevels(boolean z) {
        this.zzmk = z;
    }

    public final void setDefaultBookmarksOutlineLevel(int i) {
        this.zzmm = i;
    }

    public final void setExpandedOutlineLevels(int i) {
        this.zzmn = i;
    }

    public final void setHeadingsOutlineLevels(int i) {
        this.zzmo = i;
    }

    public final zzZYT<Integer> zzx5() {
        return this.zzml;
    }
}
