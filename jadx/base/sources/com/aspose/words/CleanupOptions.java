package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class CleanupOptions {
    private boolean zzZvZ = true;
    private boolean zzZvY = true;
    private boolean zzZvX = false;
    private boolean zzZvW = false;

    public boolean getDuplicateStyle() {
        return this.zzZvX;
    }

    public boolean getUnusedBuiltinStyles() {
        return this.zzZvW;
    }

    public boolean getUnusedLists() {
        return this.zzZvZ;
    }

    public boolean getUnusedStyles() {
        return this.zzZvY;
    }

    public void setDuplicateStyle(boolean z) {
        this.zzZvX = z;
    }

    public void setUnusedBuiltinStyles(boolean z) {
        this.zzZvW = z;
    }

    public void setUnusedLists(boolean z) {
        this.zzZvZ = z;
    }

    public void setUnusedStyles(boolean z) {
        this.zzZvY = z;
    }
}
