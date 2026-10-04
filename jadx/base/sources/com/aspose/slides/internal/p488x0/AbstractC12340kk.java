package com.aspose.slides.internal.p488x0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.kk */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12340kk extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private long f41265k4;

    /* JADX INFO: renamed from: kk */
    private int f41266kk;

    /* JADX INFO: renamed from: x1 */
    private int f41267x1;

    /* JADX INFO: renamed from: k4 */
    public final long m57756k4() {
        return this.f41265k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo57657k4(C3149x1 c3149x1);

    /* JADX INFO: renamed from: kk */
    public final int m57759kk() {
        return this.f41266kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57760x1() {
        return this.f41267x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57757k4(int i) {
        if ((65535 & i) != 1) {
            throw new ArgumentOutOfRangeException("value", "This value MUST be 0x0001");
        }
        this.f41267x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57761x1(int i) {
        this.f41266kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57758k4(long j) {
        this.f41265k4 = j;
    }
}
