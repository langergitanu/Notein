package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10008c5;
import com.aspose.slides.internal.p486wy.C12324up;
import com.aspose.slides.internal.p513xw.AbstractC12727to;
import com.aspose.slides.internal.p513xw.AbstractC12729ts;
import com.aspose.slides.internal.p513xw.C12696f9;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.um */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11672um extends AbstractC12727to implements InterfaceC11646ar {

    /* JADX INFO: renamed from: c5 */
    private C1606x1 f39413c5;

    /* JADX INFO: renamed from: ks */
    protected C12724ss f39414ks;

    /* JADX INFO: renamed from: yj */
    protected C1375h4 f39415yj;

    public AbstractC11672um(AbstractC3524ks abstractC3524ks) {
        super(abstractC3524ks);
        this.f39415yj = C1375h4.f5962k4;
    }

    /* JADX INFO: renamed from: ak */
    public C4272f9 mo54960ak() {
        return null;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: du */
    public final String mo54798du(C12717os c12717os) {
        C12717os c12717osMo58860kk = c12717os.mo58860kk();
        return ((InterfaceC11646ar) c12717osMo58860kk.m59077to()).mo54798du(c12717osMo58860kk);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: dy */
    public int mo48944dy() {
        InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9();
        if (interfaceC12711lrMo54977m9 != null) {
            return interfaceC12711lrMo54977m9.mo48944dy();
        }
        return 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final C12724ss m54962e0() {
        return this.f39414ks;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean mo54963h4(boolean z) {
        return false;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> mo54799k4(List<InterfaceC1861h4> list) {
        return mo54803x1(list, 0);
    }

    /* JADX INFO: renamed from: kk */
    public final void m54967kk(C1606x1 c1606x1) {
        this.f39413c5 = c1606x1;
    }

    /* JADX INFO: renamed from: ts */
    public final C1606x1 m54968ts() {
        return this.f39413c5;
    }

    /* JADX INFO: renamed from: wy */
    public C4272f9 mo54969wy() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: x1 */
    public final List<InterfaceC1861h4> mo54803x1(List<InterfaceC1861h4> list, int i) {
        int i2 = i + 1;
        C12717os c12717osM59134uz = ((AbstractC12729ts) new C1869to(list, list.size()).mo9756du()).m59134uz();
        InterfaceC11646ar interfaceC11646ar = c12717osM59134uz != null ? (InterfaceC11646ar) c12717osM59134uz.m59075k4(i2) : null;
        if (interfaceC11646ar == null) {
            return list;
        }
        List<InterfaceC1861h4> listMo54803x1 = interfaceC11646ar.mo54803x1(list, i2);
        C1869to c1869to = new C1869to(listMo54803x1);
        while (c1869to.mo9764x1()) {
            AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
            C12717os c12717osM59134uz2 = abstractC12729ts.m59134uz();
            if ((c12717osM59134uz2 != null ? (InterfaceC11646ar) c12717osM59134uz2.m59075k4(i) : null) != this) {
                abstractC12729ts.m59132k4(mo54973k4(new C12696f9(this, abstractC12729ts.m59134uz())));
            }
        }
        return listMo54803x1;
    }

    /* JADX INFO: renamed from: du */
    public boolean mo54961du(boolean z) {
        return false;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54772k4(List<InterfaceC1861h4> list, int i) {
        return mo54800k4(list, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: kk */
    public final boolean mo54802kk(List<InterfaceC1861h4> list, int i) {
        C1869to c1869to = new C1869to(list);
        int i2 = i + 1;
        InterfaceC11646ar interfaceC11646ar = null;
        boolean z = false;
        int iMo9761m9 = 0;
        while (c1869to.mo9764x1()) {
            C12717os c12717osM59134uz = ((AbstractC12729ts) c1869to.mo9760kk()).m59134uz();
            InterfaceC11646ar interfaceC11646ar2 = c12717osM59134uz == null ? null : (InterfaceC11646ar) c12717osM59134uz.m59075k4(i2);
            if (interfaceC11646ar == null) {
                interfaceC11646ar = interfaceC11646ar2;
            }
            if (interfaceC11646ar2 != interfaceC11646ar || !c1869to.mo9764x1()) {
                if (interfaceC11646ar != this && interfaceC11646ar2 != this) {
                    if (c1869to.mo9764x1()) {
                        z = interfaceC11646ar.mo54802kk(list.getRange(iMo9761m9, c1869to.mo9761m9()), i2) || z;
                        iMo9761m9 = c1869to.mo9761m9();
                    } else if (interfaceC11646ar2 == interfaceC11646ar) {
                        z = (interfaceC11646ar != null && interfaceC11646ar.mo54802kk(list.getRange(iMo9761m9, list.size()), i2)) || z;
                    } else {
                        z = interfaceC11646ar.mo54802kk(list.getRange(iMo9761m9, c1869to.mo9761m9()), i2) || z;
                        if (interfaceC11646ar2 != null) {
                            if (interfaceC11646ar2.mo54802kk(list.getRange(c1869to.mo9761m9(), list.size()), i2) || z) {
                            }
                        }
                    }
                }
                interfaceC11646ar = interfaceC11646ar2;
            }
        }
        return z;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: x1 */
    public final boolean mo54804x1(List<InterfaceC1861h4> list) {
        return mo54802kk(list, 0);
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54800k4(List<InterfaceC1861h4> list, int i, int i2) {
        List<InterfaceC1861h4> listMo54800k4;
        C1869to c1869to = new C1869to(list);
        int i3 = i2 + 1;
        List list2 = new List();
        List<InterfaceC1861h4> list3 = new List<>();
        int iMo9761m9 = 0;
        InterfaceC11646ar interfaceC11646ar = null;
        while (c1869to.mo9764x1()) {
            C12717os c12717osM59134uz = ((AbstractC12729ts) ((InterfaceC1861h4) c1869to.mo9760kk()).mo9727k4()).m59134uz();
            InterfaceC11646ar interfaceC11646ar2 = c12717osM59134uz == null ? null : (InterfaceC11646ar) c12717osM59134uz.m59075k4(i3);
            if (interfaceC11646ar == null) {
                interfaceC11646ar = interfaceC11646ar2;
            }
            if (interfaceC11646ar2 != interfaceC11646ar || !c1869to.mo9764x1()) {
                if (c1869to.mo9764x1()) {
                    C10008c5.m49137k4(list2, interfaceC11646ar.mo54800k4(list.getRange(iMo9761m9, (c1869to.mo9761m9() - iMo9761m9) + 1), i, i3));
                    iMo9761m9 = c1869to.mo9761m9();
                    interfaceC11646ar = interfaceC11646ar2;
                } else {
                    if (interfaceC11646ar2 == interfaceC11646ar) {
                        listMo54800k4 = interfaceC11646ar.mo54800k4(list.getRange(iMo9761m9, (list.size() - iMo9761m9) + 1), i, i3);
                    } else {
                        C10008c5.m49137k4(list2, interfaceC11646ar.mo54800k4(list.getRange(iMo9761m9, (c1869to.mo9761m9() - iMo9761m9) + 1), i, i3));
                        if (interfaceC11646ar2 != null) {
                            listMo54800k4 = interfaceC11646ar2.mo54800k4(list.getRange(c1869to.mo9761m9(), (list.size() - c1869to.mo9761m9()) + 1), i, i3);
                        }
                    }
                    C10008c5.m49137k4(list2, listMo54800k4);
                }
            }
        }
        C1869to c1869to2 = new C1869to(list2);
        while (c1869to2.mo9764x1()) {
            AbstractC12729ts abstractC12729ts = (AbstractC12729ts) ((InterfaceC1861h4) c1869to2.mo9760kk()).mo9727k4();
            abstractC12729ts.m59132k4(mo54973k4(new C12696f9(this, abstractC12729ts.m59134uz())));
            list3.addItem(abstractC12729ts);
        }
        return list3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m54964k4(C1606x1 c1606x1, C1375h4 c1375h4, double d) {
        int iM8161to;
        if (c1375h4 == null) {
            return;
        }
        int iM8163x1 = c1375h4.m8163x1();
        if (d <= 0.0d) {
            if (d < 0.0d) {
                iM8161to = c1375h4.m8161to();
            }
            if (iM8163x1 == 0) {
                C12324up c12324up = new C12324up();
                c12324up.m8679x1(iM8163x1);
                int iM8672m9 = c1606x1.m8672m9();
                if (iM8672m9 >= 0) {
                    c12324up.m8676to(iM8672m9);
                }
                c1606x1.mo8582k4((C1606x1) c12324up);
                return;
            }
            return;
        }
        iM8161to = c1375h4.m8149du();
        iM8163x1 += C7019kk.m27462to(Double.valueOf(((double) iM8161to) * d), 14);
        if (iM8163x1 == 0) {
        }
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public final void mo54801k4(C12717os c12717os, C11666ne c11666ne) {
        C12717os c12717osMo58860kk = c12717os.mo58860kk();
        ((InterfaceC11646ar) c12717osMo58860kk.m59077to()).mo54801k4(c12717osMo58860kk, c11666ne);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54965k4(C12724ss c12724ss) {
        this.f39414ks = c12724ss;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo54966k4(boolean z, boolean z2) {
    }
}
