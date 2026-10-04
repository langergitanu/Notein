package com.aspose.slides.internal.p042bn;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p498xe.C12518u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.bn.ts */
/* JADX INFO: loaded from: classes3.dex */
public class C1756ts extends C3023to {

    /* JADX INFO: renamed from: du */
    private int f6553du;

    /* JADX INFO: renamed from: h4 */
    private short f6554h4;

    /* JADX INFO: renamed from: k4 */
    private long f6555k4;

    /* JADX INFO: renamed from: kk */
    private C12518u4 f6556kk;

    /* JADX INFO: renamed from: to */
    private int f6557to;

    /* JADX INFO: renamed from: x1 */
    private short f6558x1;

    /* JADX INFO: renamed from: k4 */
    public final C12518u4 m9425k4() {
        return this.f6556kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int m9430kk() {
        return 22;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m9431x1() {
        return this.f6557to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9426k4(int i) {
        this.f6557to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9432x1(int i) {
        if (i != 0) {
            throw new ArgumentException("MUST be 0x00000000");
        }
        this.f6553du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9427k4(long j) {
        if ((4294967295L & j) != 2596720087L) {
            throw new ArgumentException("This value MUST be 0x9AC6CDD7");
        }
        this.f6555k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9433x1(short s) {
        this.f6554h4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9428k4(C12518u4 c12518u4) {
        this.f6556kk = c12518u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9429k4(short s) {
        this.f6558x1 = s;
    }
}
