package com.aspose.slides.internal.p111em;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.em.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3759k4 implements InterfaceC3760kk {

    /* JADX INFO: renamed from: k4 */
    public List<C3758jd> f10279k4 = new List<>();

    @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
    /* JADX INFO: renamed from: c5 */
    public final String mo15076c5(int i) {
        return this.f10279k4.get_Item(i).Clone().f10277to;
    }

    @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
    /* JADX INFO: renamed from: ck */
    public final String mo15077ck(int i) {
        return this.f10279k4.get_Item(i).Clone().f10276kk;
    }

    @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
    /* JADX INFO: renamed from: dy */
    public final String mo15078dy(int i) {
        return this.f10279k4.get_Item(i).Clone().f10278x1;
    }

    @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
    /* JADX INFO: renamed from: jd */
    public final String mo15079jd(int i) {
        return this.f10279k4.get_Item(i).Clone().f10275k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC3760kk m15080k4() {
        this.f10279k4.trimExcess();
        return this;
    }

    @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
    /* JADX INFO: renamed from: to */
    public final String mo15082to(String str) {
        List.Enumerator<C3758jd> it = this.f10279k4.iterator();
        while (it.hasNext()) {
            try {
                C3758jd next = it.next();
                if (C14113y2.m67363du(next.f10275k4, str)) {
                    return next.f10276kk;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    @Override // com.aspose.slides.internal.p111em.InterfaceC3760kk
    /* JADX INFO: renamed from: yj */
    public final int mo15083yj() {
        return this.f10279k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15081k4(String str, String str2, String str3, String str4, String str5) {
        C3758jd c3758jd = new C3758jd();
        c3758jd.f10278x1 = str;
        c3758jd.f10277to = str2;
        c3758jd.f10275k4 = str3;
        c3758jd.f10276kk = str5;
        c3758jd.f10274du = str4;
        this.f10279k4.addItem(c3758jd.Clone());
    }
}
