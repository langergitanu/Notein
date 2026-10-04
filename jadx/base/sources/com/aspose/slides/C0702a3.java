package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.a3 */
/* JADX INFO: loaded from: classes3.dex */
class C0702a3 {

    /* JADX INFO: renamed from: du */
    private double f3749du;

    /* JADX INFO: renamed from: k4 */
    private final bay f3750k4;

    /* JADX INFO: renamed from: kk */
    private double f3751kk = Double.NaN;

    /* JADX INFO: renamed from: to */
    private double f3752to;

    /* JADX INFO: renamed from: x1 */
    private final int f3753x1;

    public C0702a3(bay bayVar, int i, double d, double d2) {
        this.f3750k4 = bayVar;
        this.f3753x1 = i;
        this.f3749du = d;
        this.f3752to = d2;
    }

    /* JADX INFO: renamed from: du */
    private double m3168du() {
        if (C14044b3.m66437kk(this.f3751kk)) {
            return -1.7976931348623157E308d;
        }
        return this.f3751kk;
    }

    /* JADX INFO: renamed from: to */
    private double m3169to() {
        if (C14044b3.m66437kk(this.f3749du)) {
            return Double.MAX_VALUE;
        }
        return this.f3749du;
    }

    /* JADX INFO: renamed from: k4 */
    public final bay m3170k4() {
        return this.f3750k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m3172kk() {
        return this.f3752to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m3174x1() {
        return this.f3753x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3171k4(double d) {
        if (m3168du() >= d || d >= m3169to()) {
            return;
        }
        this.f3751kk = d;
        if (C14044b3.m66437kk(this.f3752to) || this.f3752to < d) {
            m3173kk(d);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m3173kk(double d) {
        int i;
        if (m3168du() <= d) {
            if (yz6.m74166k4(this.f3753x1) || (i = this.f3753x1) == 63 || i == 17) {
                if (C14116yg.m67475k4(d) <= C14116yg.m67475k4(m3169to())) {
                    this.f3752to = d;
                }
            } else if (d <= m3169to()) {
                this.f3752to = d;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3175x1(double d) {
        if (m3168du() >= d || d >= m3169to()) {
            return;
        }
        this.f3749du = d;
        if (C14044b3.m66437kk(this.f3752to) || C14116yg.m67475k4(this.f3752to) > C14116yg.m67475k4(d)) {
            m3173kk(d);
        }
    }
}
