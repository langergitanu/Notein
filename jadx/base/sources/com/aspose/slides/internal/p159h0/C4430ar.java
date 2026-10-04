package com.aspose.slides.internal.p159h0;

import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.ar */
/* JADX INFO: loaded from: classes.dex */
public class C4430ar implements InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: du */
    private float f12157du;

    /* JADX INFO: renamed from: k4 */
    private C4489zj f12159k4 = new C4489zj();

    /* JADX INFO: renamed from: x1 */
    private C4489zj f12162x1 = new C4489zj();

    /* JADX INFO: renamed from: kk */
    private C4489zj f12160kk = new C4489zj();

    /* JADX INFO: renamed from: to */
    private C4489zj f12161to = new C4489zj();

    /* JADX INFO: renamed from: h4 */
    private C4489zj f12158h4 = new C4489zj();

    /* JADX INFO: renamed from: m9 */
    public static C4430ar m18055m9() {
        C4430ar c4430ar = new C4430ar();
        c4430ar.m18062k4(new C4489zj(0.1f, 0.1f, 0.1f));
        c4430ar.m18068x1(new C4489zj(1.0f, 1.0f, 1.0f));
        c4430ar.m18064kk(new C4489zj(-1.0f, -3.0f, -2.0f).m18510to().Clone());
        c4430ar.m18066to(new C4489zj(1.0f, 1.0f, 1.0f));
        c4430ar.m18061k4(45.0f);
        c4430ar.m18057du(new C4489zj(0.0f, 0.0f, 0.0f));
        return c4430ar;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return m18058dy();
    }

    /* JADX INFO: renamed from: du */
    public final float m18056du() {
        return this.f12157du;
    }

    /* JADX INFO: renamed from: dy */
    public Object m18058dy() {
        try {
            C4430ar c4430ar = (C4430ar) super.clone();
            C4489zj c4489zj = this.f12159k4;
            if (c4489zj != null) {
                c4430ar.f12159k4 = c4489zj.Clone();
            }
            C4489zj c4489zj2 = this.f12162x1;
            if (c4489zj2 != null) {
                c4430ar.f12162x1 = c4489zj2.Clone();
            }
            C4489zj c4489zj3 = this.f12160kk;
            if (c4489zj3 != null) {
                c4430ar.f12160kk = c4489zj3.Clone();
            }
            C4489zj c4489zj4 = this.f12158h4;
            if (c4489zj4 != null) {
                c4430ar.f12158h4 = c4489zj4.Clone();
            }
            C4489zj c4489zj5 = this.f12161to;
            if (c4489zj5 != null) {
                c4430ar.f12161to = c4489zj5.Clone();
            }
            return c4430ar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final C4430ar m18059h4() {
        m18064kk(m18063kk().m18510to().Clone());
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4489zj m18060k4() {
        return this.f12159k4.Clone();
    }

    /* JADX INFO: renamed from: kk */
    public final C4489zj m18063kk() {
        return this.f12160kk.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final C4489zj m18065to() {
        return this.f12161to.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final C4489zj m18067x1() {
        return this.f12162x1.Clone();
    }

    /* JADX INFO: renamed from: du */
    public final void m18057du(C4489zj c4489zj) {
        this.f12158h4 = c4489zj.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18061k4(float f) {
        this.f12157du = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m18064kk(C4489zj c4489zj) {
        this.f12160kk = c4489zj.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final void m18066to(C4489zj c4489zj) {
        this.f12161to = c4489zj.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18068x1(C4489zj c4489zj) {
        this.f12162x1 = c4489zj.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18062k4(C4489zj c4489zj) {
        this.f12159k4 = c4489zj.Clone();
    }
}
