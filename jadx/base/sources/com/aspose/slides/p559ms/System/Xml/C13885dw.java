package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p103eb.C3592kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.AbstractC11956my;
import com.aspose.slides.internal.p474wg.AbstractC11994yg;
import com.aspose.slides.internal.p474wg.C11975um;
import com.aspose.slides.internal.p474wg.InterfaceC11926c6;
import com.aspose.slides.internal.p474wg.InterfaceC11968sv;
import com.aspose.slides.p559ms.System.C14062gk;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.dw */
/* JADX INFO: loaded from: classes5.dex */
public class C13885dw {

    /* JADX INFO: renamed from: k4 */
    private Hashtable f46447k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3150x6 m65270x1(C14062gk c14062gk, InterfaceC11926c6 interfaceC11926c6, InterfaceC11968sv interfaceC11968sv, C3592kk c3592kk) {
        AbstractC11994yg abstractC11994ygM56282k4 = AbstractC11994yg.m56282k4(c14062gk);
        if (interfaceC11926c6 != null) {
            abstractC11994ygM56282k4.mo56215k4(interfaceC11926c6);
        }
        if (interfaceC11968sv != null) {
            abstractC11994ygM56282k4.mo56218k4(interfaceC11968sv);
        }
        AbstractC11956my abstractC11956myMo56227qq = abstractC11994ygM56282k4.mo56227qq();
        C11975um c11975um = (C11975um) C7019kk.m27452k4((Object) abstractC11994ygM56282k4, C11975um.class);
        if (c11975um == null) {
            return abstractC11956myMo56227qq.mo56080h4();
        }
        synchronized (this) {
            try {
                if (this.f46447k4 == null) {
                    this.f46447k4 = new Hashtable();
                }
                C13916j2 c13916j2 = (C13916j2) this.f46447k4.get_Item(c11975um.m56209k4().m66678du());
                if (c13916j2 == null) {
                    c13916j2 = new C13916j2();
                }
                if (c13916j2.f46577k4 >= c11975um.m56236wl().m55963x1() - 1) {
                    return new C13914ii(abstractC11956myMo56227qq.mo56083x1(), abstractC11956myMo56227qq.mo56080h4());
                }
                if (c13916j2.f46577k4 == 0) {
                    this.f46447k4.addItem(c11975um.m56209k4().m66678du(), c13916j2);
                }
                c13916j2.f46577k4++;
                return new C13999v6(abstractC11956myMo56227qq.mo56080h4(), this, c11975um.m56209k4().m66678du());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m65271k4(C14062gk c14062gk, InterfaceC11926c6 interfaceC11926c6, InterfaceC11968sv interfaceC11968sv, C3592kk c3592kk) {
        return "file".equals(c14062gk.m66689ks()) ? new C3130fa(c14062gk.m66677ck(), 3, 1, 1, 1) : m65270x1(c14062gk, interfaceC11926c6, interfaceC11968sv, c3592kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65272k4(String str) {
        synchronized (this) {
            try {
                C13916j2 c13916j2 = (C13916j2) this.f46447k4.get_Item(str);
                if (c13916j2 != null) {
                    int i = c13916j2.f46577k4 - 1;
                    c13916j2.f46577k4 = i;
                    if (i == 0) {
                        this.f46447k4.removeItem(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
