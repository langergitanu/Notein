package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzP6 implements zzH2 {
    private boolean zzGV;
    private float zzGW;
    private boolean zzZK;
    private zzZQ4 zzZL = zzZQ4.zz2T;

    private zzZQ4 zzL(zzZQ4 zzzq4) {
        float f;
        float f2 = this.zzGW;
        if (this.zzGV) {
            float f3 = zzzq4.getHeight() == 0.0f ? 0.0f : f2;
            if (zzzq4.getWidth() == 0.0f) {
                f2 = 0.0f;
            }
            float f4 = f3;
            f = f2;
            f2 = f4;
        } else {
            f = f2;
        }
        return zzZQ4.zzX(zzzq4, f2, f);
    }

    public static zzZQ4 zzS(zzP8 zzp8) throws Exception {
        return zzZ(zzp8, 0.0f, false);
    }

    public static zzZQ4 zzV(zzP5 zzp5) throws Exception {
        zzP6 zzp6 = new zzP6();
        zzp5.zzY(zzp6);
        return zzp6.zzZL;
    }

    public static zzZQ4 zzX(zzP8 zzp8, float f) throws Exception {
        return zzZ(zzp8, f, true);
    }

    public static zzZQ4 zzY(zzP8 zzp8, float f) throws Exception {
        return zzZ(zzp8, f, false);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        return true;
    }

    public static zzZQ4 zzY(zzOW zzow) throws Exception {
        zzP6 zzp6 = new zzP6();
        zzow.zzZ(zzp6);
        return zzp6.zzZL;
    }

    private static zzZQ4 zzZ(zzP8 zzp8, float f, boolean z) throws Exception {
        zzP6 zzp6 = new zzP6();
        zzp6.zzGW = f;
        zzp6.zzGV = z;
        zzp8.zzY(zzp6);
        return zzp6.zzZL;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        if (zzp5.isClosed() && zzp5.zzNY().size() > 0) {
            zzY(zzJ6.zzU(new long[]{zzp5.zzPQ(), zzp5.zzPR()}));
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        zzY(zzJ6.zzU(zzos.zzNu()));
        return true;
    }

    private void zzY(zzZQ4 zzzq4) {
        zzZQ4 zzzq4ZzL = zzL(zzzq4);
        if (this.zzZK) {
            zzZQ4 zzzq42 = this.zzZL;
            zzZQ4 zzzq43 = zzZQ4.zz2T;
            if (zzZQ4.zzV(zzzq42, zzzq43)) {
                this.zzZL = zzzq4ZzL;
                return;
            } else {
                if (zzZQ4.zzV(zzzq4ZzL, zzzq43)) {
                    return;
                }
                this.zzZL = zzZQ4.zzT(this.zzZL, zzzq4ZzL);
                return;
            }
        }
        this.zzZL = zzzq4ZzL;
        this.zzZK = true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        zzY(new zzQ3().zzY(zzpz));
        return true;
    }
}
