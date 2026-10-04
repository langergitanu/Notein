package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0H extends zzZ0J {
    private int zzY0X = 0;
    private int zzY0Y;

    public zzZ0H(int i) {
        if (i != 7 && i != 8 && i != 11 && i != 12 && i != 14 && i != 16 && i != 24 && i != 25) {
            throw new IllegalStateException("Please report exception");
        }
        this.zzY0Y = i;
    }

    @Override // com.aspose.words.zzZ0J
    public final int getMathObjectType() {
        return this.zzY0Y;
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzT(Node node) {
        return zzZ0J.zzYM(node);
    }

    public final int zzYF2() {
        return this.zzY0X;
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzYF3() {
        return false;
    }

    @Override // com.aspose.words.zzZ0J
    public final boolean zzYF4() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[PHI: r0
      0x0003: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzuC(int i) {
        int i2 = -2;
        if (i < -2) {
            i = i2;
        } else {
            i2 = 2;
            if (i > 2) {
            }
        }
        if (i != 0) {
            this.zzY0X = i;
        }
    }
}
