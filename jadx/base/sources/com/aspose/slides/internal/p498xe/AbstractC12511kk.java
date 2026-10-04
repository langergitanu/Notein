package com.aspose.slides.internal.p498xe;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.kk */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12511kk extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private long f41889k4;

    /* JADX INFO: renamed from: kk */
    private int f41890kk;

    /* JADX INFO: renamed from: x1 */
    private int f41891x1;

    /* JADX INFO: renamed from: k4 */
    public final long m58172k4() {
        return this.f41889k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo58090k4(C3149x1 c3149x1);

    /* JADX INFO: renamed from: kk */
    public final int m58175kk() {
        return this.f41890kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m58176x1() {
        return this.f41891x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58173k4(int i) {
        if ((65535 & i) != 1) {
            throw new ArgumentOutOfRangeException("value", "This value MUST be 0x0001");
        }
        this.f41891x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58177x1(int i) {
        this.f41890kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58174k4(long j) {
        this.f41889k4 = j;
    }
}
