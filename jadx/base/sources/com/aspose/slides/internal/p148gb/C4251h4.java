package com.aspose.slides.internal.p148gb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3782c5;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p324oq.InterfaceC7137k4;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: renamed from: com.aspose.slides.internal.gb.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4251h4 extends C3182du implements InterfaceC3186k4, InterfaceC7137k4 {
    public C4251h4() {
        this.f9456h4 = DrawToolFactory.LASSO_TYPE_RECT;
        this.f9458kk.addItem("x", "0");
        this.f9458kk.addItem("y", "0");
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m17082ak() {
        return C10307du.m50262k4(this.f9461x1.m13681k4(new String[]{"rx", "ry"}), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10307du m17083b3() {
        return C10307du.m50262k4(this.f9461x1.get_Item("x"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: c6 */
    public final C10307du m17084c6() {
        return C10307du.m50262k4(this.f9461x1.get_Item("height"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m17085dq() {
        return C10307du.m50262k4(this.f9461x1.m13681k4(new String[]{"ry", "rx"}), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: du */
    public final void m17086du(C10307du c10307du) {
        this.f9461x1.set_Item("height", c10307du.toString());
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        return new C12007ix(c3786fa.m15125k4(m17083b3(), "x", this, c12015qq.Clone()), c3786fa.m15125k4(m17089wy(), "y", this, c12015qq.Clone()), c3786fa.m15125k4(m17091xk(), "width", this, c12015qq.Clone()), c3786fa.m15125k4(m17084c6(), "height", this, c12015qq.Clone()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m17087kk(C10307du c10307du) {
        this.f9461x1.set_Item("y", c10307du.toString());
    }

    /* JADX INFO: renamed from: to */
    public final void m17088to(C10307du c10307du) {
        this.f9461x1.set_Item("width", c10307du.toString());
    }

    /* JADX INFO: renamed from: wy */
    public final C10307du m17089wy() {
        return C10307du.m50262k4(this.f9461x1.get_Item("y"), C10307du.m50263kk(0.0f));
    }

    @Override // com.aspose.slides.internal.p324oq.InterfaceC7137k4
    /* JADX INFO: renamed from: x1 */
    public final List<C3785dy> mo17081x1(C3786fa c3786fa, C12015qq c12015qq) {
        String strM67402k4;
        C12007ix c12007ixClone = mo13679k4(c3786fa, c12015qq.Clone()).Clone();
        float fM15122kk = C3786fa.m15122kk() * c12007ixClone.m56557jd();
        float fM15122kk2 = C3786fa.m15122kk() * c12007ixClone.m56551ck();
        float fM15122kk3 = C3786fa.m15122kk() * c12007ixClone.m56550c5();
        float fM15122kk4 = C3786fa.m15122kk() * c12007ixClone.m56575x1();
        if (fM15122kk3 <= 0.0f || fM15122kk4 <= 0.0f) {
            return new List<>();
        }
        if (C14116yg.m67480k4(m17082ak().m50265k4()) < 0.001f || C14116yg.m67480k4(m17085dq().m50265k4()) < 0.001f) {
            strM67402k4 = C14113y2.m67402k4("M {0} {1} h {2} v {3} h -{2} z", C10308dy.m50272k4(fM15122kk), C10308dy.m50272k4(fM15122kk2), C10308dy.m50272k4(fM15122kk3), C10308dy.m50272k4(fM15122kk4));
        } else {
            float fM15122kk5 = C3786fa.m15122kk() * c3786fa.m15125k4(m17082ak(), "rx", this, c12015qq.Clone());
            float fM15122kk6 = C3786fa.m15122kk() * c3786fa.m15125k4(m17085dq(), "ry", this, c12015qq.Clone());
            float f = fM15122kk3 / 2.0f;
            if (fM15122kk5 > f) {
                fM15122kk5 = f;
            }
            float f2 = fM15122kk4 / 2.0f;
            if (fM15122kk6 > f2) {
                fM15122kk6 = f2;
            }
            C6765kp c6765kp = new C6765kp();
            float f3 = fM15122kk + fM15122kk5;
            c6765kp.m26796k4("M {0} {1}", Float.valueOf(f3), Float.valueOf(fM15122kk2));
            float f4 = fM15122kk3 + fM15122kk;
            float f5 = f4 - fM15122kk5;
            c6765kp.m26796k4("H {0}", Float.valueOf(f5));
            float f6 = fM15122kk2 + fM15122kk6;
            c6765kp.m26796k4("A {0} {1} 0 0 1 {2} {3}", Float.valueOf(fM15122kk5), Float.valueOf(fM15122kk6), Float.valueOf(f4), Float.valueOf(f6));
            float f7 = fM15122kk4 + fM15122kk2;
            float f8 = f7 - fM15122kk6;
            c6765kp.m26796k4("V {0}", Float.valueOf(f8));
            c6765kp.m26796k4("A {0} {1} 0 0 1 {2} {3}", Float.valueOf(fM15122kk5), Float.valueOf(fM15122kk6), Float.valueOf(f5), Float.valueOf(f7));
            c6765kp.m26796k4("H {0}", Float.valueOf(f3));
            c6765kp.m26796k4("A {0} {1} 0 0 1 {2} {3}", Float.valueOf(fM15122kk5), Float.valueOf(fM15122kk6), Float.valueOf(fM15122kk), Float.valueOf(f8));
            c6765kp.m26796k4("V {0}", Float.valueOf(f6));
            c6765kp.m26796k4("A {0} {1} 0 0 1 {2} {3}", Float.valueOf(fM15122kk5), Float.valueOf(fM15122kk6), Float.valueOf(f3), Float.valueOf(fM15122kk2));
            c6765kp.m26796k4("Z", new Object[0]);
            c6765kp.m26781k4(',', FilenameUtils.EXTENSION_SEPARATOR);
            strM67402k4 = c6765kp.toString();
        }
        return C3782c5.m15111k4(strM67402k4, c3786fa);
    }

    /* JADX INFO: renamed from: xk */
    public final C10307du m17091xk() {
        return C10307du.m50262k4(this.f9461x1.get_Item("width"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17090x1(C10307du c10307du) {
        this.f9461x1.set_Item("x", c10307du.toString());
    }
}
