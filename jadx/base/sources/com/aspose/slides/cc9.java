package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12569rv;

/* JADX INFO: loaded from: classes3.dex */
final class cc9 {

    /* JADX INFO: renamed from: du */
    private long f4306du;

    /* JADX INFO: renamed from: to */
    private boolean f4309to;

    /* JADX INFO: renamed from: k4 */
    private double f4307k4 = Double.NaN;

    /* JADX INFO: renamed from: x1 */
    private double f4310x1 = Double.NaN;

    /* JADX INFO: renamed from: kk */
    private int f4308kk = -1;

    public cc9(boolean z) {
        this.f4309to = z;
    }

    /* JADX INFO: renamed from: h4 */
    private void m4539h4() {
        this.f4306du++;
    }

    /* JADX INFO: renamed from: du */
    public final long m4540du() {
        return this.f4306du;
    }

    public boolean equals(Object obj) {
        if (obj == null || ((ShapeBevel) C7019kk.m27452k4(obj, ShapeBevel.class)) == null) {
            return false;
        }
        return m4550x1((ShapeBevel) obj);
    }

    public int hashCode() {
        return C12569rv.m58664k4(Double.valueOf(this.f4307k4), Double.valueOf(this.f4310x1), Integer.valueOf(this.f4308kk), Boolean.valueOf(this.f4309to));
    }

    /* JADX INFO: renamed from: k4 */
    public final double m4541k4() {
        return this.f4307k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m4546kk() {
        return this.f4308kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m4547to() {
        return this.f4309to;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m4548x1() {
        return this.f4310x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4542k4(double d) {
        this.f4307k4 = d;
        m4539h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4549x1(double d) {
        this.f4310x1 = d;
        m4539h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4543k4(int i) {
        this.f4308kk = i;
        m4539h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m4550x1(ShapeBevel shapeBevel) {
        if (shapeBevel == null) {
            return false;
        }
        return this.f4307k4 == shapeBevel.getWidth() && this.f4310x1 == shapeBevel.getHeight() && this.f4308kk == shapeBevel.getBevelType() && this.f4309to == shapeBevel.m2602to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4544k4(ShapeBevel shapeBevel) {
        this.f4307k4 = shapeBevel.getWidth();
        this.f4310x1 = shapeBevel.getHeight();
        this.f4308kk = shapeBevel.getBevelType();
        this.f4309to = shapeBevel.m2602to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4545k4(ofw ofwVar) {
        this.f4307k4 = ofwVar.getWidth();
        this.f4310x1 = ofwVar.getHeight();
        this.f4308kk = ofwVar.getBevelType();
        this.f4309to = ofwVar.f47771k4;
    }
}
