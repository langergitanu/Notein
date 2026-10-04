package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10008c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C12715ne {
    /* JADX INFO: renamed from: k4 */
    public static int m59059k4(List<InterfaceC1861h4> list) {
        return m59060k4(list, 0, list.size() - 1);
    }

    /* JADX INFO: renamed from: kk */
    public static int m59063kk(List<InterfaceC1861h4> list, int i) {
        int i2 = i - 1;
        while (i2 >= 0) {
            AbstractC12729ts abstractC12729ts = (AbstractC12729ts) list.get_Item(i2);
            if (abstractC12729ts.mo59086y_() && abstractC12729ts.mo59085x6() < 1000) {
                break;
            }
            i2--;
        }
        return i2;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m59065to(List<InterfaceC1861h4> list) {
        AbstractC12723s7 abstractC12723s7 = (AbstractC12723s7) C10008c5.m49136k4(list);
        if (!abstractC12723s7.mo59086y_() || ((C12718qm) abstractC12723s7).mo59085x6() >= 1000) {
            return C7019kk.m27469x1(abstractC12723s7, C12722rv.class) && ((C12722rv) abstractC12723s7).m59130m9() < 1000;
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m59066x1(List<InterfaceC1861h4> list) {
        InterfaceC1861h4 interfaceC1861h4 = (InterfaceC1861h4) C10008c5.m49136k4(list);
        if (!interfaceC1861h4.mo9728kk()) {
            interfaceC1861h4 = interfaceC1861h4.mo9730x1().get_Item(0);
        }
        return interfaceC1861h4.mo9727k4().mo59082dy();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m59060k4(List<InterfaceC1861h4> list, int i, int i2) {
        C1869to c1869to = new C1869to(list);
        int i3 = (i2 - i) + 1;
        int iM59252rv = 0;
        while (c1869to.mo9764x1()) {
            AbstractC12723s7 abstractC12723s7Mo9727k4 = ((InterfaceC1861h4) c1869to.mo9760kk()).mo9727k4();
            if (abstractC12723s7Mo9727k4.mo58895yj() || abstractC12723s7Mo9727k4.mo58932x_()) {
                iM59252rv = ((AbstractC12729ts) abstractC12723s7Mo9727k4).m59252rv() + iM59252rv;
            }
            i3--;
            if (i3 == 0) {
                break;
            }
        }
        return iM59252rv;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m59064kk(List<InterfaceC1861h4> list) {
        if (list.size() == 0) {
            return false;
        }
        InterfaceC1861h4 interfaceC1861h4 = list.get_Item(0);
        if (!interfaceC1861h4.mo9728kk()) {
            interfaceC1861h4 = interfaceC1861h4.mo9730x1().get_Item(0);
        }
        return interfaceC1861h4.mo9727k4().mo59082dy();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m59067x1(List<InterfaceC1861h4> list, int i) {
        return m59062k4(list, i, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m59061k4(List<InterfaceC1861h4> list, int i) {
        return m59062k4(list, i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static boolean m59062k4(List<InterfaceC1861h4> list, int i, boolean z) {
        int iM59252rv;
        C1869to c1869to = new C1869to(list, z ? list.size() : 0);
        int iM59252rv2 = 0;
        do {
            if (z) {
                if (!c1869to.mo9762to()) {
                    return true;
                }
            } else if (!c1869to.mo9764x1()) {
                return true;
            }
            AbstractC12723s7 abstractC12723s7Mo9727k4 = ((InterfaceC1861h4) (z ? c1869to.mo9756du() : c1869to.mo9760kk())).mo9727k4();
            if (abstractC12723s7Mo9727k4.mo59086y_()) {
                C12718qm c12718qm = (C12718qm) abstractC12723s7Mo9727k4;
                if (c12718qm.mo59085x6() < 1000) {
                    c1869to.mo9759k4(new C12718qm(c12718qm.m59252rv(), 1000, c12718qm.m59083m9(), c12718qm.m59134uz(), c12718qm.m59251ks()));
                }
            } else if (abstractC12723s7Mo9727k4.mo58932x_()) {
                iM59252rv2 += ((C12694e0) abstractC12723s7Mo9727k4).m59252rv();
                if (!z) {
                    c1869to.mo9756du();
                }
                AbstractC12723s7 abstractC12723s7 = (AbstractC12723s7) c1869to.mo9756du();
                c1869to.mo9760kk();
                if (abstractC12723s7.mo58895yj()) {
                    c1869to.mo9763x1(new C12718qm(0, 1000, false, null, false));
                }
                if (!z) {
                    c1869to.mo9760kk();
                }
            } else {
                if (!abstractC12723s7Mo9727k4.mo59133u4()) {
                    iM59252rv = ((AbstractC12729ts) abstractC12723s7Mo9727k4).m59252rv();
                } else if (C7019kk.m27469x1(abstractC12723s7Mo9727k4, C12722rv.class)) {
                    C12722rv c12722rv = (C12722rv) abstractC12723s7Mo9727k4;
                    if (c12722rv.m59130m9() < 1000) {
                        c12722rv.m59129k4(1000);
                    }
                } else if (C7019kk.m27469x1(abstractC12723s7Mo9727k4, AbstractC12716nv.class)) {
                    iM59252rv = ((AbstractC12716nv) abstractC12723s7Mo9727k4).m59070jd().m8163x1();
                }
                iM59252rv2 += iM59252rv;
            }
        } while (iM59252rv2 < i);
        return false;
    }
}
