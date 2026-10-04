package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14096u4;

/* JADX INFO: loaded from: classes3.dex */
class gmx extends fml {
    public gmx(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
    }

    /* JADX INFO: renamed from: k4 */
    private LineFormat m6764k4(AbstractC1164gw abstractC1164gw) {
        return (LineFormat) ((abstractC1164gw.m6926yj().m4988jd().m586k4() == null || abstractC1164gw.m6926yj().m4988jd().m586k4().getLine().isFormatNotDefined()) ? m6220yj().m64945h4().getFormat() : abstractC1164gw.m6926yj().m4988jd().getFormat()).getLine();
    }

    /* JADX INFO: renamed from: kk */
    private void m6766kk(List<AbstractC1164gw> list) {
        C11896dy c11896dy = new C11896dy();
        m6220yj().m64941c5().m69870wy().mo64335fa().Clone().m56561k4(10.0f, 10.0f);
        for (int i = 1; i < list.size(); i++) {
            c11896dy.m55547k4(list.get_Item(i - 1).m73223ts().Clone().Clone(), list.get_Item(i).m73223ts().Clone().Clone());
            if (i == list.size() - 1 || m6765k4(list.get_Item(i), list.get_Item(i + 1))) {
                m6220yj().m64966x1(list.get_Item(i).m6926yj().m5014wl().Clone(), c11896dy, m6764k4(list.get_Item(i)), im9.m7680k4(m6220yj().m64945h4().getChart()));
                m6220yj().m64950k4(list.get_Item(i).m6926yj().m5014wl().Clone(), c11896dy, m6764k4(list.get_Item(i)), im9.m7680k4(m6220yj().m64945h4().getChart()));
                c11896dy.m55527fa();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m6767x1(List<AbstractC1164gw> list) {
        C12025x6 c12025x6;
        byte b;
        int i = list.get_Item(0) == ((fml) this).f5072x1.get_Item(0) ? 1 : 0;
        boolean z = OooO0O0.OooO00o(list, 1) == OooO0O0.OooO00o(((fml) this).f5072x1, 1);
        C12025x6 c12025x62 = new C12025x6();
        C12025x6 c12025x63 = new C12025x6();
        if (i != 0) {
            c12025x6 = new C12025x6(((fml) this).f5072x1.get_Item(0).m73223ts().m56897x1(), ((fml) this).f5072x1.get_Item(0).m73223ts().m56895kk());
            b = (byte) 1;
        } else {
            c12025x6 = c12025x62;
            b = 0;
        }
        if (z) {
            b = (byte) ((b & 255) + 1);
            c12025x63 = new C12025x6(((AbstractC1164gw) OooO0O0.OooO00o(((fml) this).f5072x1, 1)).m73223ts().m56897x1(), ((AbstractC1164gw) OooO0O0.OooO00o(((fml) this).f5072x1, 1)).m73223ts().m56895kk());
        }
        C11896dy c11896dy = new C11896dy();
        C11896dy c11896dy2 = new C11896dy();
        C12025x6[] c12025x6Arr = (C12025x6[]) list.convertAll(new AbstractC14096u4<AbstractC1164gw, C12025x6>() { // from class: com.aspose.slides.gmx.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14096u4
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public C12025x6 mo6770k4(AbstractC1164gw abstractC1164gw) {
                return abstractC1164gw.m73223ts();
            }
        }).toArray(new C12025x6[0]);
        C12025x6[] c12025x6Arr2 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c12025x6Arr.length + (b & 255)));
        c12025x6.CloneTo(c12025x6Arr2[0]);
        c12025x63.CloneTo(c12025x6Arr2[c12025x6Arr2.length - 1]);
        AbstractC14092to.m67208k4((Object) c12025x6Arr).copyTo(AbstractC14092to.m67208k4((Object) c12025x6Arr2), i);
        for (int i2 = 1; i2 < list.size(); i2++) {
            int i3 = i2 - 1;
            c11896dy.m55547k4(c12025x6Arr2[i3].Clone(), c12025x6Arr2[i2].Clone());
            if (c12025x6Arr2.length > 2) {
                if (i != 0) {
                    i3 = i2;
                }
                if ((i != 0 && i3 == 1) || i3 == 0) {
                    c11896dy2.m55582x1(C14873z5.m74329k4(c12025x6Arr2[i3].Clone(), c12025x6Arr2[i3].Clone(), c12025x6Arr2[i3 + 1].Clone(), c12025x6Arr2[i3 + 2].Clone()));
                } else if (i3 == c12025x6Arr2.length - 2) {
                    C12025x6 c12025x6Clone = c12025x6Arr2[i3 - 1].Clone();
                    C12025x6 c12025x6Clone2 = c12025x6Arr2[i3].Clone();
                    int i4 = i3 + 1;
                    c11896dy2.m55582x1(C14873z5.m74329k4(c12025x6Clone, c12025x6Clone2, c12025x6Arr2[i4].Clone(), c12025x6Arr2[i4].Clone()));
                } else {
                    try {
                        c11896dy2.m55582x1(C14873z5.m74329k4(c12025x6Arr2[i3 - 1].Clone(), c12025x6Arr2[i3].Clone(), c12025x6Arr2[i3 + 1].Clone(), c12025x6Arr2[i3 + 2].Clone()));
                    } catch (RuntimeException unused) {
                        throw new Exception();
                    }
                }
            }
            if (i2 == list.size() - 1 || m6765k4(list.get_Item(i2), list.get_Item(i2 + 1))) {
                m6220yj().m64950k4(list.get_Item(i2).m6926yj().m5014wl().Clone(), c12025x6Arr2.length > 2 ? c11896dy2 : c11896dy, m6764k4(list.get_Item(i2)), im9.m7680k4(m6220yj().m64945h4().getChart()));
                c11896dy.m55527fa();
                c11896dy2.m55527fa();
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final float m6769m9() {
        return C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14464sp.class) ? ((C1195hd) C7019kk.m27452k4((Object) m6216ks().f45392kk, C1195hd.class)).m7099um() : C7019kk.m27469x1(m6216ks().f45392kk, C13785ll.class) ? ((C13785ll) C7019kk.m27452k4((Object) m6216ks().f45392kk, C13785ll.class)).m64459kp() : m73225wy() / ((fml) this).f5072x1.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6768k4(List<AbstractC1164gw> list) {
        if (!m6220yj().m64945h4().getSmooth() || list.size() <= 2) {
            m6766kk(list);
        } else {
            m6767x1(list);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m6765k4(AbstractC1164gw abstractC1164gw, AbstractC1164gw abstractC1164gw2) {
        return !m6764k4(abstractC1164gw).equals((ILineFormat) m6764k4(abstractC1164gw2));
    }
}
