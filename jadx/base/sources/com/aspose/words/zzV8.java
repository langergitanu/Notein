package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzV8 extends zzV9 implements zzZBI {
    private int zzL4;

    private boolean zzJ(int i, Object obj) {
        return zzZ(i, obj, 3200, 3110, 3130, this.zzZvQ.isFirstRow(), this.zzZvQ.isLastRow());
    }

    private boolean zzK(int i, Object obj) {
        return zzZ(i, obj, 3210, 3120, 3140, this.zzZvQ.zzXZE(), this.zzZvQ.zzXZD());
    }

    @Override // com.aspose.words.zzV9
    public final void zzNk(int i) {
        ConditionalStyle conditionalStyleZzkg = this.zzZvQ.zzkg(i);
        if (conditionalStyleZzkg == null || !conditionalStyleZzkg.zzZYb()) {
            return;
        }
        this.zzL4 = i;
        conditionalStyleZzkg.zz6G().zzZ(this.zzZvP, this);
    }

    @Override // com.aspose.words.zzZBI
    public final void zzZ(zzZS zzzs, int i, Object obj) {
        zzV8 zzv8;
        int i2;
        Object obj2;
        zzV8 zzv82;
        switch (this.zzL4) {
            case 1:
            case 3:
                zzv8 = this;
                i2 = i;
                obj2 = obj;
                if (zzK(i2, obj2)) {
                    return;
                }
                break;
            case 2:
            case 4:
                zzv8 = this;
                i2 = i;
                obj2 = obj;
                if (zzJ(i2, obj2)) {
                    return;
                }
                break;
            case 5:
            case 7:
                i2 = i;
                obj2 = obj;
                boolean zZzK = zzK(i2, obj2);
                if (zZzK || this.zzZvQ.zzXZy() <= 1) {
                    zzv8 = this;
                } else {
                    zzv8 = this;
                    zZzK = zzv8.zzZ(i2, obj2, 3200, 3110, 3130, this.zzZvQ.zzXZC(), this.zzZvQ.zzXZB());
                }
                if (zZzK) {
                    return;
                }
                break;
            case 6:
            case 8:
                boolean zZzJ = zzJ(i, obj);
                if (zZzJ || this.zzZvQ.zzXZx() <= 1) {
                    i2 = i;
                    obj2 = obj;
                    zzv82 = this;
                } else {
                    i2 = i;
                    obj2 = obj;
                    zZzJ = zzZ(i2, obj2, 3210, 3120, 3140, this.zzZvQ.zzXZA(), this.zzZvQ.zzXZz());
                    zzv82 = this;
                }
                zzv8 = zzv82;
                if (zZzJ) {
                    return;
                }
                break;
            default:
                zzv8 = this;
                i2 = i;
                obj2 = obj;
                break;
        }
        zzv8.zzZvP.set(i2, obj2);
    }

    private boolean zzZ(int i, Object obj, int i2, int i3, int i4, boolean z, boolean z2) {
        if (i == i3) {
            if (z) {
                this.zzZvP.set(i3, obj);
            }
            return true;
        }
        if (i == i4) {
            if (z2) {
                this.zzZvP.set(i4, obj);
            }
            return true;
        }
        boolean z3 = false;
        if (i != i2) {
            return false;
        }
        if (!z2) {
            this.zzZvP.set(i4, obj);
            z3 = true;
        }
        if (!z) {
            if (z3) {
                obj = ((Border) obj).zz8H();
            }
            this.zzZvP.set(i3, obj);
        }
        return true;
    }
}
