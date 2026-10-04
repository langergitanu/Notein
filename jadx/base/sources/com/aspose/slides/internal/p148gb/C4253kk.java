package com.aspose.slides.internal.p148gb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p081de.C3153k4;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3782c5;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p324oq.InterfaceC7137k4;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gb.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4253kk extends C3182du implements InterfaceC3186k4, InterfaceC7137k4 {
    public C4253kk() {
        this.f9456h4 = "line";
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m17095ak() {
        return C10307du.m50262k4(this.f9461x1.get_Item("x2"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10307du m17096b3() {
        return C10307du.m50262k4(this.f9461x1.get_Item("x1"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m17097dq() {
        return C10307du.m50262k4(this.f9461x1.get_Item("y2"), C10307du.m50263kk(0.0f));
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        return C3153k4.m13468k4(mo17081x1(c3786fa, c12015qq.Clone())).m55523c5();
    }

    /* JADX INFO: renamed from: wy */
    public final C10307du m17098wy() {
        return C10307du.m50262k4(this.f9461x1.get_Item("y1"), C10307du.m50263kk(0.0f));
    }

    @Override // com.aspose.slides.internal.p324oq.InterfaceC7137k4
    /* JADX INFO: renamed from: x1 */
    public final List<C3785dy> mo17081x1(C3786fa c3786fa, C12015qq c12015qq) {
        return C3782c5.m15111k4(C14113y2.m67402k4("M {0} {1} L {2} {3}", C10308dy.m50272k4(C3786fa.m15122kk() * c3786fa.m15125k4(m17096b3(), "x1", this, c12015qq.Clone())), C10308dy.m50272k4(C3786fa.m15122kk() * c3786fa.m15125k4(m17098wy(), "y1", this, c12015qq.Clone())), C10308dy.m50272k4(C3786fa.m15122kk() * c3786fa.m15125k4(m17095ak(), "x2", this, c12015qq.Clone())), C10308dy.m50272k4(C3786fa.m15122kk() * c3786fa.m15125k4(m17097dq(), "y2", this, c12015qq.Clone()))), c3786fa);
    }
}
