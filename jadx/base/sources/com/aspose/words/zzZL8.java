package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL8 {
    private int zzYuj = 0;

    public final void add(int i) {
        this.zzYuj = i | this.zzYuj;
    }

    public final boolean isAuto() {
        return this.zzYuj == 1;
    }

    public final boolean isSet(int i) {
        return (this.zzYuj & i) == i;
    }

    public final void zzW(PreferredWidth preferredWidth) {
        int type = preferredWidth.getType();
        if (type == 1) {
            add(1);
        } else if (type == 2) {
            add(4);
        } else {
            if (type != 3) {
                throw new IllegalStateException("Unexpected cell width type.");
            }
            add(2);
        }
    }

    public final boolean zzZXi() {
        return this.zzYuj == 0;
    }
}
