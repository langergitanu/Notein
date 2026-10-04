package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.xo */
/* JADX INFO: loaded from: classes3.dex */
public class C2372xo implements InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private double[] f8216k4;

    public C2372xo() {
        this.f8216k4 = new double[]{1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d};
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return new C2372xo(C2027c5.m10305k4(this.f8216k4));
    }

    /* JADX INFO: renamed from: du */
    public final double m11682du() {
        return this.f8216k4[4];
    }

    /* JADX INFO: renamed from: h4 */
    public final double m11684h4() {
        return this.f8216k4[5];
    }

    /* JADX INFO: renamed from: k4 */
    public final double m11686k4() {
        return this.f8216k4[0];
    }

    /* JADX INFO: renamed from: kk */
    public final double m11690kk() {
        return this.f8216k4[2];
    }

    /* JADX INFO: renamed from: to */
    public final double m11692to() {
        return this.f8216k4[3];
    }

    /* JADX INFO: renamed from: x1 */
    public final double m11694x1() {
        return this.f8216k4[1];
    }

    public C2372xo(double[] dArr) {
        if (dArr.length != 6) {
            throw new ArgumentException();
        }
        this.f8216k4 = dArr;
    }

    /* JADX INFO: renamed from: du */
    public final void m11683du(double d) {
        this.f8216k4[4] = d;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m11685h4(double d) {
        this.f8216k4[5] = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2372xo m11687k4(C2372xo c2372xo) {
        C2372xo c2372xo2 = new C2372xo();
        c2372xo2.m11688k4((c2372xo.m11690kk() * m11694x1()) + (c2372xo.m11686k4() * m11686k4()));
        c2372xo2.m11695x1((c2372xo.m11692to() * m11694x1()) + (c2372xo.m11694x1() * m11686k4()));
        c2372xo2.m11691kk((c2372xo.m11690kk() * m11692to()) + (c2372xo.m11686k4() * m11690kk()));
        c2372xo2.m11693to((c2372xo.m11692to() * m11692to()) + (c2372xo.m11694x1() * m11690kk()));
        c2372xo2.m11683du(c2372xo.m11682du() + (c2372xo.m11690kk() * m11684h4()) + (c2372xo.m11686k4() * m11682du()));
        c2372xo2.m11685h4(c2372xo.m11684h4() + (c2372xo.m11692to() * m11684h4()) + (c2372xo.m11694x1() * m11682du()));
        return c2372xo2;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11691kk(double d) {
        this.f8216k4[2] = d;
    }

    /* JADX INFO: renamed from: to */
    public final void m11693to(double d) {
        this.f8216k4[3] = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11695x1(double d) {
        this.f8216k4[1] = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11688k4(double d) {
        this.f8216k4[0] = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11689k4(double d, double d2, double[] dArr, double[] dArr2) {
        dArr[0] = m11682du() + (m11690kk() * d2) + (m11686k4() * d);
        dArr2[0] = m11684h4() + (m11692to() * d2) + (m11694x1() * d);
    }
}
