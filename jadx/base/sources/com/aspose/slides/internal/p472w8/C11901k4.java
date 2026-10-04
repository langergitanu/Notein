package com.aspose.slides.internal.p472w8;

import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11901k4 extends C11898h4 implements IDisposable {

    /* JADX INFO: renamed from: ck */
    private float f40081ck;

    /* JADX INFO: renamed from: fa */
    private float f40082fa;

    /* JADX INFO: renamed from: jd */
    private boolean f40083jd;

    /* JADX INFO: renamed from: up */
    private float f40084up;

    public C11901k4(float f, float f2) {
        this(f, f2, true);
    }

    /* JADX INFO: renamed from: ks */
    private void m55653ks() {
        if (this.f40083jd) {
            this.f40069h4 = m55654rv();
        } else {
            this.f40073m9 = m55655x6();
        }
    }

    /* JADX INFO: renamed from: rv */
    private C11896dy m55654rv() {
        float f = this.f40084up * 0.5f;
        float f2 = this.f40081ck;
        float f3 = this.f40082fa;
        C11896dy c11896dy = new C11896dy();
        float f4 = -f2;
        c11896dy.m55574x1(-f, f4, 0.0f, 0.0f);
        c11896dy.m55574x1(0.0f, 0.0f, f, f4);
        if (f3 != 0.0f) {
            c11896dy.m55574x1(f, f4, 0.0f, f3 + f4);
        }
        c11896dy.m55567m9();
        return c11896dy;
    }

    /* JADX INFO: renamed from: x6 */
    private C11896dy m55655x6() {
        float f = this.f40084up * 0.5f;
        float f2 = this.f40081ck;
        C11896dy c11896dy = new C11896dy();
        float f3 = -f2;
        c11896dy.m55574x1(-f, f3, 0.0f, 0.0f);
        c11896dy.m55574x1(0.0f, 0.0f, f, f3);
        return c11896dy;
    }

    /* JADX INFO: renamed from: yj */
    private void m55656yj() {
        this.f40075x1 = this.f40081ck / this.f40084up;
    }

    @Override // com.aspose.slides.internal.p472w8.C11898h4, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11901k4 c11901k4 = new C11901k4(this.f40084up, this.f40081ck, this.f40083jd);
        C11898h4.m55591k4(this, c11901k4);
        c11901k4.f40082fa = this.f40082fa;
        return c11901k4;
    }

    /* JADX INFO: renamed from: du */
    public void m55657du() {
        m55602jd();
        this.f40071k4 = 3;
        this.f40075x1 = 1.0f;
        this.f40074to = 1.0f;
        this.f40083jd = true;
        this.f40082fa = 0.0f;
        this.f40084up = 0.0f;
        this.f40081ck = 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public float m55658k4() {
        return this.f40081ck;
    }

    /* JADX INFO: renamed from: kk */
    public float m55661kk() {
        return this.f40082fa;
    }

    /* JADX INFO: renamed from: to */
    public float m55663to() {
        return this.f40084up;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55664x1(float f) {
        if (f != this.f40082fa) {
            this.f40082fa = f;
            m55653ks();
        }
    }

    public C11901k4(float f, float f2, boolean z) {
        m55657du();
        this.f40084up = f;
        this.f40081ck = f2;
        this.f40083jd = z;
        m55656yj();
        m55653ks();
    }

    /* JADX INFO: renamed from: k4 */
    public void m55659k4(float f) {
        if (f != this.f40081ck) {
            this.f40081ck = f;
            m55656yj();
            m55653ks();
        }
    }

    /* JADX INFO: renamed from: kk */
    public void m55662kk(float f) {
        if (f != this.f40084up) {
            this.f40084up = f;
            m55656yj();
            m55653ks();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55665x1() {
        return this.f40083jd;
    }

    public C11901k4(C11898h4 c11898h4) {
        C11898h4.m55591k4(c11898h4, this);
        if (c11898h4 instanceof C11901k4) {
            C11901k4 c11901k4 = (C11901k4) c11898h4;
            m55662kk(c11901k4.m55663to());
            m55659k4(c11901k4.m55658k4());
            m55660k4(c11901k4.m55665x1());
            m55664x1(c11901k4.m55661kk());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55660k4(boolean z) {
        this.f40083jd = z;
    }
}
