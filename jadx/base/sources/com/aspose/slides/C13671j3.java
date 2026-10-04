package com.aspose.slides;

import OooO0o.C20424OooO0Oo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.j3 */
/* JADX INFO: loaded from: classes3.dex */
class C13671j3 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: kk */
    private C13847mr f45410kk;

    /* JADX INFO: renamed from: x1 */
    private d6s f45412x1;

    /* JADX INFO: renamed from: k4 */
    private List<C13711k3> f45409k4 = new List<>();

    /* JADX INFO: renamed from: to */
    private List<C14177nd> f45411to = new List<>();

    public C13671j3(C13847mr c13847mr, AbstractC14763x3 abstractC14763x3) {
        this.f45412x1 = (d6s) abstractC14763x3;
        this.f45410kk = c13847mr;
        List.Enumerator<C0886d8> it = c13847mr.m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                C13711k3 c13711k3 = new C13711k3(next);
                this.f45409k4.addItem(c13711k3);
                m73215k4(c13711k3);
                if (!next.m4983dy() && next.m5003ks() != null && next.m5003ks().m4569up()) {
                    C14357qr c14357qr = new C14357qr(c13711k3);
                    this.f45411to.addItem(c14357qr);
                    m73215k4(c14357qr);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private float m63208to() {
        return this.f45410kk.m64945h4().getGapWidth() / 100.0f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        List.Enumerator<C14177nd> it = this.f45409k4.iterator();
        double dM4989k4 = 0.0d;
        while (it.hasNext()) {
            try {
                C13711k3 next = it.next();
                if (next.m6926yj().m4989k4() > dM4989k4) {
                    dM4989k4 = next.m6926yj().m4989k4();
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
        List.Enumerator<C13711k3> it2 = this.f45409k4.iterator();
        while (it2.hasNext()) {
            try {
                C13711k3 next2 = it2.next();
                if (next2.m6926yj().m4989k4() <= 0.0d) {
                    next2.mo63967x1(false);
                    next2.m73210fa(new C14713vw(0.0f, 0.0f));
                }
                next2.m73210fa(new C14713vw((float) ((next2.m6926yj().m4989k4() / dM4989k4) * ((double) c14713vw.m72555k4())), C20424OooO0Oo.OooO0O0(this.f45412x1.m4965kp(), m63208to(), 2.0f, this.f45412x1.m4965kp())));
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
        it = this.f45411to.iterator();
        while (it.hasNext()) {
            try {
                C14177nd next3 = it.next();
                next3.m73210fa(next3.m67979yj());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (int i = 0; i < this.f45409k4.size(); i++) {
            this.f45409k4.get_Item(i).m73208du((c14713vw.m72555k4() / 2.0f) - (this.f45409k4.get_Item(i).m73225wy() / 2.0f));
            this.f45409k4.get_Item(i).m73212h4(((this.f45412x1.m4965kp() / 2.0f) + (i * this.f45412x1.m4965kp())) - (this.f45409k4.get_Item(i).m73203ak() / 2.0f));
            this.f45409k4.get_Item(i).m73220ss();
        }
        List.Enumerator<C14177nd> it = this.f45411to.iterator();
        while (it.hasNext()) {
            try {
                C14357qr c14357qr = (C14357qr) it.next();
                c14357qr.m73208du((c14713vw.m72555k4() / 2.0f) - (c14357qr.m73225wy() / 2.0f));
                c14357qr.m73212h4(((c14357qr.m69726to().m73203ak() / 2.0f) + c14357qr.m69726to().m73219qm()) - (c14357qr.m73203ak() / 2.0f));
                if (c14357qr.m73225wy() > c14357qr.m69726to().m73225wy()) {
                    c14357qr.m67970k4(false);
                }
                c14357qr.m73220ss();
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
