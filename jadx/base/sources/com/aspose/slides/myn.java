package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class myn implements InterfaceC14825y0 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC0933ea f47456k4;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, IGenericList<C14539tb>> f47457x1 = new Dictionary<>();

    public myn(InterfaceC0933ea interfaceC0933ea) {
        this.f47456k4 = interfaceC0933ea;
    }

    /* JADX INFO: renamed from: k4 */
    private void m67815k4(InterfaceC1124fx interfaceC1124fx) {
        if (C7019kk.m27469x1(interfaceC1124fx, a9h.class)) {
            ((a9h) interfaceC1124fx).m3447ne();
        }
        if (C7019kk.m27469x1(interfaceC1124fx, wdt.class)) {
            ((wdt) interfaceC1124fx).m72689ks().m3447ne();
        }
    }

    /* JADX INFO: renamed from: to */
    private C14539tb m67817to(String str, C0909dp c0909dp) {
        if (!this.f47457x1.containsKey(str)) {
            return null;
        }
        IGenericEnumerator<C14539tb> it = this.f47457x1.get_Item(str).iterator();
        while (it.hasNext()) {
            try {
                C14539tb next = it.next();
                if (next.m71048k4().m5203to(c0909dp)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private void m67818x1(InterfaceC1124fx interfaceC1124fx) {
        if (C7019kk.m27469x1(interfaceC1124fx, a9h.class)) {
            ((a9h) interfaceC1124fx).m3434ix();
        }
        if (C7019kk.m27469x1(interfaceC1124fx, wdt.class)) {
            ((wdt) interfaceC1124fx).m72689ks().m3434ix();
        }
    }

    @Override // com.aspose.slides.InterfaceC14825y0
    /* JADX INFO: renamed from: kk */
    public final void mo67822kk(String str, C0909dp c0909dp) {
        C6005k4.m24261k4(!C14113y2.m67411k4(str));
        C6005k4.m24261k4(c0909dp != null && c0909dp.mo3722to());
        if (this.f47457x1.containsKey(str)) {
            IGenericEnumerator<C14539tb> it = this.f47457x1.get_Item(str).iterator();
            while (it.hasNext()) {
                try {
                    C14539tb next = it.next();
                    if (!next.m71048k4().m5203to(c0909dp)) {
                        InterfaceC1124fx interfaceC1124fxMo5428x1 = this.f47456k4.mo5384k4(str).mo5428x1(next.m71048k4().m5204x1().m4031x1(), next.m71048k4().m5202kk().m5607x1());
                        IGenericEnumerator<InterfaceC0761as> it2 = next.m71050x1().iterator();
                        while (it2.hasNext()) {
                            try {
                                InterfaceC0761as next2 = it2.next();
                                if (C7019kk.m27469x1(next2, C0909dp.class)) {
                                    C0909dp c0909dp2 = (C0909dp) next2;
                                    if ((c0909dp2.m5204x1().m4031x1() == c0909dp.m5204x1().m4031x1() && c0909dp2.m5202kk().m5607x1() == c0909dp.m5202kk().m5607x1() && C14113y2.m67363du(c0909dp2.mo3720k4(), c0909dp.mo3720k4())) || next2.mo3721kk(c0909dp)) {
                                        m67818x1(interfaceC1124fxMo5428x1);
                                    }
                                }
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    @Override // com.aspose.slides.InterfaceC14825y0
    /* JADX INFO: renamed from: k4 */
    public final void mo67819k4(String str) {
        if (this.f47457x1.containsKey(str)) {
            this.f47457x1.removeItemByKey(str);
        }
    }

    @Override // com.aspose.slides.InterfaceC14825y0
    /* JADX INFO: renamed from: x1 */
    public final void mo67823x1(String str, C0909dp c0909dp) {
        if (this.f47457x1.containsKey(str)) {
            IGenericList<C14539tb> iGenericList = this.f47457x1.get_Item(str);
            for (int i = 0; i < iGenericList.size(); i++) {
                C14539tb c14539tb = iGenericList.get_Item(i);
                if (!c14539tb.m71048k4().m5203to(c0909dp)) {
                    InterfaceC1124fx interfaceC1124fxMo5428x1 = this.f47456k4.mo5384k4(str).mo5428x1(c14539tb.m71048k4().m5204x1().m4031x1(), c14539tb.m71048k4().m5202kk().m5607x1());
                    IGenericEnumerator<InterfaceC0761as> it = c14539tb.m71050x1().iterator();
                    while (it.hasNext()) {
                        try {
                            InterfaceC0761as next = it.next();
                            if (C7019kk.m27469x1(next, C0909dp.class)) {
                                C0909dp c0909dp2 = (C0909dp) next;
                                if (c0909dp2.m5204x1().m4031x1() == c0909dp.m5204x1().m4031x1() && c0909dp2.m5202kk().m5607x1() == c0909dp.m5202kk().m5607x1() && C14113y2.m67363du(c0909dp2.mo3720k4(), c0909dp.mo3720k4())) {
                                    m67815k4(interfaceC1124fxMo5428x1);
                                }
                            } else if (next.mo3721kk(c0909dp)) {
                                m67815k4(interfaceC1124fxMo5428x1);
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.InterfaceC14825y0
    /* JADX INFO: renamed from: k4 */
    public final void mo67820k4(String str, C0909dp c0909dp) {
        C14539tb next;
        if (this.f47457x1.containsKey(str)) {
            IGenericList<C14539tb> iGenericList = this.f47457x1.get_Item(str);
            IGenericEnumerator<C14539tb> it = iGenericList.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (next.m71048k4().m5203to(c0909dp)) {
                            break;
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (next != null) {
                iGenericList.removeItem(next);
            }
        }
    }

    @Override // com.aspose.slides.InterfaceC14825y0
    /* JADX INFO: renamed from: k4 */
    public final void mo67821k4(String str, C0909dp c0909dp, IGenericList<InterfaceC0761as> iGenericList) {
        List list;
        if (iGenericList != null) {
            list = new List();
            IGenericEnumerator<InterfaceC0761as> it = iGenericList.iterator();
            while (it.hasNext()) {
                try {
                    list.addItem(it.next().mo3718k4(c0909dp));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } else {
            list = null;
        }
        C14539tb c14539tbM67817to = m67817to(str, c0909dp);
        if (c14539tbM67817to != null) {
            m67816k4(str, c14539tbM67817to, list);
            return;
        }
        C14539tb c14539tb = new C14539tb(c0909dp, list);
        if (this.f47457x1.containsKey(str)) {
            this.f47457x1.get_Item(str).addItem(c14539tb);
            return;
        }
        List list2 = new List();
        list2.addItem(c14539tb);
        this.f47457x1.addItem(str, list2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m67816k4(String str, C14539tb c14539tb, IGenericList<InterfaceC0761as> iGenericList) {
        if (iGenericList == null || iGenericList.size() == 0) {
            this.f47457x1.get_Item(str).removeItem(c14539tb);
        } else {
            c14539tb.m71049k4(iGenericList);
        }
    }
}
