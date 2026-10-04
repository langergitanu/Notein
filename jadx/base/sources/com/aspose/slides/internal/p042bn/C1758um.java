package com.aspose.slides.internal.p042bn;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p075d5.C3023to;

/* JADX INFO: renamed from: com.aspose.slides.internal.bn.um */
/* JADX INFO: loaded from: classes3.dex */
public class C1758um extends C3023to {

    /* JADX INFO: renamed from: du */
    private int f6563du;

    /* JADX INFO: renamed from: h4 */
    private long f6564h4;

    /* JADX INFO: renamed from: k4 */
    private int f6565k4;

    /* JADX INFO: renamed from: kk */
    private int f6566kk;

    /* JADX INFO: renamed from: m9 */
    private int f6567m9;

    /* JADX INFO: renamed from: to */
    private long f6568to;

    /* JADX INFO: renamed from: x1 */
    private int f6569x1;

    /* JADX INFO: renamed from: du */
    public final void m9442du(int i) {
        if ((65535 & i) != 0) {
            throw new ArgumentException("SHOULD be 0x0000");
        }
        this.f6567m9 = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m9443dy() {
        return this.f6567m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m9444h4() {
        return this.f6563du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m9445k4() {
        return this.f6565k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m9448kk() {
        return this.f6566kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m9450m9() {
        return this.f6564h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m9451to() {
        return this.f6568to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m9453x1() {
        return this.f6569x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9446k4(int i) {
        this.f6565k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m9449kk(int i) {
        this.f6566kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m9452to(int i) {
        this.f6563du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9454x1(int i) {
        this.f6569x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9447k4(long j) {
        this.f6568to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9455x1(long j) {
        this.f6564h4 = j;
    }
}
