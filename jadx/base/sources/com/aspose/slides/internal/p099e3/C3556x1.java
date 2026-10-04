package com.aspose.slides.internal.p099e3;

import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.e3.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3556x1 extends C3182du implements InterfaceC3186k4 {
    public C3556x1() {
        this.f9456h4 = "g";
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        C12007ix c12007ix = new C12007ix();
        for (int i = 0; i < m13628ar().m13697k4(); i++) {
            InterfaceC3186k4 interfaceC3186k4 = (InterfaceC3186k4) C7019kk.m27452k4((Object) m13628ar().m13702x1(i), InterfaceC3186k4.class);
            if (interfaceC3186k4 != null) {
                C12007ix c12007ixClone = interfaceC3186k4.mo13679k4(c3786fa, c12015qq.Clone()).Clone();
                if (!c12007ix.m56568kk() || !c12007ixClone.m56568kk()) {
                    if (c12007ix.m56568kk()) {
                        c12007ixClone.CloneTo(c12007ix);
                    } else if (!c12007ixClone.m56568kk()) {
                        c12007ixClone = C12007ix.m56549x1(c12007ix.Clone(), c12007ixClone.Clone());
                        c12007ixClone.CloneTo(c12007ix);
                    }
                }
            }
        }
        return c12007ix;
    }
}
