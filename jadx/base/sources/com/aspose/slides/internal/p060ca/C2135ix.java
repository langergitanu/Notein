package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ix */
/* JADX INFO: loaded from: classes3.dex */
class C2135ix {

    /* JADX INFO: renamed from: du */
    private int f7387du;

    /* JADX INFO: renamed from: k4 */
    private byte[] f7388k4;

    /* JADX INFO: renamed from: kk */
    private boolean f7389kk;

    /* JADX INFO: renamed from: to */
    private int f7390to;

    /* JADX INFO: renamed from: x1 */
    private int f7391x1;

    public C2135ix(byte[] bArr) {
        this(bArr, false);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m10790kk() {
        int i = this.f7387du - 1;
        this.f7387du = i;
        if (i < 0) {
            this.f7390to = C7019kk.m27462to(Byte.valueOf(this.f7388k4[this.f7391x1]), 6);
            this.f7391x1++;
            this.f7387du = 7;
        }
        byte b = (byte) (1 << this.f7387du);
        return (this.f7390to & C7019kk.m27462to(Byte.valueOf(b), 6)) == C7019kk.m27462to(Byte.valueOf(b), 6);
    }

    /* JADX INFO: renamed from: to */
    private boolean m10791to() {
        int i = this.f7387du + 1;
        this.f7387du = i;
        if (i > 7) {
            this.f7390to = C7019kk.m27462to(Byte.valueOf(this.f7388k4[this.f7391x1]), 6);
            this.f7391x1++;
            this.f7387du = 0;
        }
        byte b = (byte) (1 << this.f7387du);
        return (this.f7390to & C7019kk.m27462to(Byte.valueOf(b), 6)) == C7019kk.m27462to(Byte.valueOf(b), 6);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10792k4() {
        return this.f7391x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10794x1(int i) {
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            i2 <<= 1;
            if (m10795x1()) {
                i2 |= 1;
            }
        }
        return i2;
    }

    public C2135ix(byte[] bArr, boolean z) {
        this.f7388k4 = bArr;
        this.f7389kk = z;
        this.f7387du = z ? 7 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10793k4(int i) {
        if (i < 0) {
            throw new ArgumentException("Position cannot be less than zero");
        }
        if (i > this.f7388k4.length) {
            throw new ArgumentException("Position is out of data bounds");
        }
        this.f7391x1 = i;
        this.f7387du = this.f7389kk ? 7 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m10795x1() {
        return this.f7389kk ? m10791to() : m10790kk();
    }
}
