package com.aspose.slides.internal.p159h0;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.ai */
/* JADX INFO: loaded from: classes.dex */
public class C4428ai extends AbstractC7020m9<C4428ai> {

    /* JADX INFO: renamed from: k4 */
    private float f12150k4;

    /* JADX INFO: renamed from: kk */
    private float f12151kk;

    /* JADX INFO: renamed from: to */
    private float f12152to;

    /* JADX INFO: renamed from: x1 */
    private float f12153x1;

    public C4428ai() {
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C4428ai Clone() {
        C4428ai c4428ai = new C4428ai();
        CloneTo(c4428ai);
        return c4428ai;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4428ai) {
            return m18042x1((C4428ai) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f12150k4), Float.valueOf(this.f12153x1), Float.valueOf(this.f12151kk), Float.valueOf(this.f12152to));
    }

    /* JADX INFO: renamed from: k4 */
    public final float m18044k4() {
        return this.f12150k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m18047kk() {
        return this.f12151kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m18049to() {
        return this.f12152to;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m18051x1() {
        return this.f12153x1;
    }

    public C4428ai(float f, float f2, float f3, float f4) {
        m18045k4(f);
        m18052x1(f2);
        m18048kk(f3);
        m18050to(f4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4428ai m18036k4(C4428ai c4428ai, float f) {
        return new C4428ai(c4428ai.m18044k4() * f, c4428ai.m18051x1() * f, c4428ai.m18047kk() * f, c4428ai.m18049to() * f);
    }

    /* JADX INFO: renamed from: x1 */
    public static C4428ai m18039x1(C4428ai c4428ai, float f) {
        return new C4428ai(c4428ai.m18044k4() / f, c4428ai.m18051x1() / f, c4428ai.m18047kk() / f, c4428ai.m18049to() / f);
    }

    /* JADX INFO: renamed from: kk */
    public final void m18048kk(float f) {
        this.f12151kk = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m18050to(float f) {
        this.f12152to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4428ai m18037k4(C4428ai c4428ai, C4428ai c4428ai2) {
        return new C4428ai(c4428ai2.m18044k4() + c4428ai.m18044k4(), c4428ai2.m18051x1() + c4428ai.m18051x1(), c4428ai2.m18047kk() + c4428ai.m18047kk(), c4428ai2.m18049to() + c4428ai.m18049to());
    }

    /* JADX INFO: renamed from: x1 */
    public static C4428ai m18040x1(C4428ai c4428ai, C4428ai c4428ai2) {
        return new C4428ai(c4428ai.m18044k4() - c4428ai2.m18044k4(), c4428ai.m18051x1() - c4428ai2.m18051x1(), c4428ai.m18047kk() - c4428ai2.m18047kk(), c4428ai.m18049to() - c4428ai2.m18049to());
    }

    /* JADX INFO: renamed from: k4 */
    public static C4428ai m18038k4(C4428ai c4428ai, C4489zj c4489zj) {
        return new C4428ai(c4489zj.m18506k4() + c4428ai.m18044k4(), c4489zj.m18511x1() + c4428ai.m18051x1(), c4489zj.m18508kk() + c4428ai.m18047kk(), c4428ai.m18049to());
    }

    /* JADX INFO: renamed from: x1 */
    public static C4428ai m18041x1(C4428ai c4428ai, C4489zj c4489zj) {
        return new C4428ai(c4489zj.m18506k4() * c4428ai.m18044k4(), c4489zj.m18511x1() * c4428ai.m18051x1(), c4489zj.m18508kk() * c4428ai.m18047kk(), c4428ai.m18049to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18045k4(float f) {
        this.f12150k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18052x1(float f) {
        this.f12153x1 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m18042x1(C4428ai c4428ai) {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4428ai c4428ai) {
        c4428ai.f12152to = this.f12152to;
        c4428ai.f12150k4 = this.f12150k4;
        c4428ai.f12153x1 = this.f12153x1;
        c4428ai.f12151kk = this.f12151kk;
    }
}
