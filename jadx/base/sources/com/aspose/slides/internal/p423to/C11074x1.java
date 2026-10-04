package com.aspose.slides.internal.p423to;

import com.aspose.slides.exceptions.SystemException;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p505xn.C12558dy;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.to.x1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11074x1 {

    /* JADX INFO: renamed from: k4 */
    private int f38396k4;

    /* JADX INFO: renamed from: m9 */
    private int f38398m9;

    /* JADX INFO: renamed from: to */
    private int f38399to;

    /* JADX INFO: renamed from: x1 */
    private C12023wl f38400x1 = new C12023wl();

    /* JADX INFO: renamed from: kk */
    private C12023wl f38397kk = new C12023wl();

    /* JADX INFO: renamed from: du */
    private k4 f38393du = new k4();

    /* JADX INFO: renamed from: h4 */
    private C6884yj f38395h4 = new C6884yj(96.0f, 17);

    /* JADX INFO: renamed from: dy */
    private boolean f38394dy = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.to.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f38401k4;

        /* JADX INFO: renamed from: kk */
        private int f38402kk;

        /* JADX INFO: renamed from: x1 */
        private int f38403x1;

        public k4() {
            m53526k4(8);
            m53530x1(0);
            m53528kk(0);
        }

        /* JADX INFO: renamed from: k4 */
        public final int m53525k4() {
            return this.f38401k4;
        }

        /* JADX INFO: renamed from: kk */
        public final int m53527kk() {
            return this.f38403x1;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m53529x1() {
            return this.f38402kk;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m53526k4(int i) {
            this.f38401k4 = i;
        }

        /* JADX INFO: renamed from: kk */
        public final void m53528kk(int i) {
            this.f38403x1 = i;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m53530x1(int i) {
            this.f38402kk = i;
        }
    }

    /* JADX INFO: renamed from: jd */
    private static C12023wl m53509jd() {
        return C12558dy.m58577k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static C11074x1 m53510k4() {
        C11074x1 c11074x1 = new C11074x1();
        c11074x1.m53515k4(7);
        try {
            c11074x1.m53517k4(m53509jd().Clone());
        } catch (SystemException unused) {
            c11074x1.m53517k4(new C12023wl(1024, ViewUtils.EDGE_TO_EDGE_FLAGS));
        }
        c11074x1.m53524x1(c11074x1.m53518kk().Clone());
        c11074x1.m53523x1(c11074x1.m53518kk().m56865x1() >= c11074x1.m53518kk().m56862kk() ? 1 : 0);
        return c11074x1;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m53511c5() {
        return this.f38394dy;
    }

    /* JADX INFO: renamed from: du */
    public final C12023wl m53512du() {
        return this.f38397kk;
    }

    /* JADX INFO: renamed from: dy */
    public final int m53513dy() {
        return this.f38398m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final k4 m53514h4() {
        return this.f38393du;
    }

    /* JADX INFO: renamed from: kk */
    public final C12023wl m53518kk() {
        return this.f38400x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6884yj m53520m9() {
        return this.f38395h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m53521to() {
        return this.f38399to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m53522x1() {
        return this.f38396k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53515k4(int i) {
        this.f38396k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53519kk(int i) {
        this.f38398m9 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53523x1(int i) {
        this.f38399to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53516k4(C6884yj c6884yj) {
        this.f38395h4 = c6884yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53524x1(C12023wl c12023wl) {
        c12023wl.CloneTo(this.f38397kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53517k4(C12023wl c12023wl) {
        c12023wl.CloneTo(this.f38400x1);
    }
}
