package com.aspose.slides.internal.p132fj;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.fj.um */
/* JADX INFO: loaded from: classes.dex */
public class C4053um extends C12535to {

    /* JADX INFO: renamed from: du */
    private int f11073du;

    /* JADX INFO: renamed from: h4 */
    private long f11074h4;

    /* JADX INFO: renamed from: k4 */
    private int f11075k4;

    /* JADX INFO: renamed from: kk */
    private int f11076kk;

    /* JADX INFO: renamed from: m9 */
    private int f11077m9;

    /* JADX INFO: renamed from: to */
    private long f11078to;

    /* JADX INFO: renamed from: x1 */
    private int f11079x1;

    /* JADX INFO: renamed from: du */
    public final void m16109du(int i) {
        if ((65535 & i) != 0) {
            throw new ArgumentException("SHOULD be 0x0000");
        }
        this.f11077m9 = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m16110dy() {
        return this.f11077m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m16111h4() {
        return this.f11073du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m16112k4() {
        return this.f11075k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m16115kk() {
        return this.f11076kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m16117m9() {
        return this.f11074h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m16118to() {
        return this.f11078to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m16120x1() {
        return this.f11079x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16113k4(int i) {
        this.f11075k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m16116kk(int i) {
        this.f11076kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m16119to(int i) {
        this.f11073du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m16121x1(int i) {
        this.f11079x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16114k4(long j) {
        this.f11078to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m16122x1(long j) {
        this.f11074h4 = j;
    }
}
