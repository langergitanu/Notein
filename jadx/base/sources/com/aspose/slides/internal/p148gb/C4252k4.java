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
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.gb.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4252k4 extends C3182du implements InterfaceC3186k4, InterfaceC7137k4 {
    public C4252k4() {
        this.f9456h4 = "circle";
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m17092ak() {
        return C10307du.m50262k4(this.f9461x1.get_Item("r"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10307du m17093b3() {
        return C10307du.m50262k4(this.f9461x1.get_Item("cx"), C10307du.m50263kk(0.0f));
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        float fM15125k4 = c3786fa.m15125k4(m17093b3(), "cx", this, c12015qq.Clone());
        float fM15125k42 = c3786fa.m15125k4(m17094wy(), TranslateLanguage.WELSH, this, c12015qq.Clone());
        float fM15125k43 = c3786fa.m15125k4(m17092ak(), "xy", this, c12015qq.Clone());
        if (fM15125k43 <= 0.0f) {
            return new C12007ix();
        }
        float f = fM15125k4 - fM15125k43;
        float f2 = fM15125k42 - fM15125k43;
        float f3 = fM15125k43 * 2.0f;
        return new C12007ix(f, f2, f3, f3);
    }

    /* JADX INFO: renamed from: wy */
    public final C10307du m17094wy() {
        return C10307du.m50262k4(this.f9461x1.get_Item(TranslateLanguage.WELSH), C10307du.m50263kk(0.0f));
    }

    @Override // com.aspose.slides.internal.p324oq.InterfaceC7137k4
    /* JADX INFO: renamed from: x1 */
    public final List<C3785dy> mo17081x1(C3786fa c3786fa, C12015qq c12015qq) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("M {0} {1} ", Float.valueOf(m17093b3().m50265k4()), Float.valueOf(m17094wy().m50265k4()));
        c6765kp.m26796k4("m {0} 0 ", Float.valueOf(-m17092ak().m50265k4()));
        c6765kp.m26796k4("a {0} {1} ", Float.valueOf(m17092ak().m50265k4()), Float.valueOf(m17092ak().m50265k4()));
        c6765kp.m26796k4("0 1 0 {0} ", Float.valueOf(m17092ak().m50265k4() * 2.0f));
        c6765kp.m26796k4(" 0 a {0} {1} ", Float.valueOf(m17092ak().m50265k4()), Float.valueOf(m17092ak().m50265k4()));
        c6765kp.m26796k4("0 1 0 {0} 0 ", Float.valueOf(m17092ak().m50265k4() * (-2.0f)));
        return C3782c5.m15111k4(c6765kp.toString(), c3786fa);
    }
}
