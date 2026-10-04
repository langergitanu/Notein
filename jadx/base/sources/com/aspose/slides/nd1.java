package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
class nd1 {

    /* JADX INFO: renamed from: k4 */
    private tbp f47520k4 = new tbp(Double.NaN, Double.NaN);

    /* JADX INFO: renamed from: x1 */
    private tbp f47523x1 = new tbp(Double.NaN, Double.NaN);

    /* JADX INFO: renamed from: kk */
    private float f47521kk = Float.NaN;

    /* JADX INFO: renamed from: to */
    private byte f47522to = -1;

    /* JADX INFO: renamed from: du */
    private byte f47519du = -1;

    /* JADX INFO: renamed from: du */
    public final byte m67980du() {
        return this.f47519du;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m67981h4() {
        return C14044b3.m66437kk(this.f47520k4.f49090k4) && C14044b3.m66437kk(this.f47520k4.f49091x1) && C14044b3.m66437kk(this.f47523x1.f49090k4) && C14044b3.m66437kk(this.f47523x1.f49091x1) && C14044b3.m66437kk((double) this.f47521kk) && this.f47522to == -1 && this.f47519du == -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final tbp m67982k4() {
        return this.f47520k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m67988kk() {
        return this.f47521kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m67989to() {
        return this.f47522to;
    }

    /* JADX INFO: renamed from: x1 */
    public final tbp m67990x1() {
        return this.f47523x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67983k4(byte b) {
        this.f47522to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m67991x1(byte b) {
        this.f47519du = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67984k4(float f) {
        this.f47521kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public void m67992x1(tbp tbpVar) {
        tbpVar.CloneTo(this.f47523x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67985k4(float f, byte b, byte b2) {
        this.f47521kk = f;
        this.f47522to = b;
        this.f47519du = b2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67986k4(C1258im c1258im) {
        m67985k4(c1258im.f5734x1, c1258im.f5733to ? (byte) 1 : (byte) 0, c1258im.f5732kk ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67987k4(tbp tbpVar) {
        tbpVar.CloneTo(this.f47520k4);
    }
}
