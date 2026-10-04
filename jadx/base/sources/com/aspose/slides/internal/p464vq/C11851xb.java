package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.C3171dy;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.xb */
/* JADX INFO: loaded from: classes4.dex */
public class C11851xb extends AbstractC11819tq {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f39935ck = new C7017h4("application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml", "application/vnd.openxmlformats-officedocument.vmlDrawing");

    /* JADX INFO: renamed from: c5 */
    private C11791os f39936c5;

    /* JADX INFO: renamed from: dy */
    private C11791os f39938dy;

    /* JADX INFO: renamed from: jd */
    private C11791os f39940jd;

    /* JADX INFO: renamed from: kk */
    private List<C11791os> f39941kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<C11791os> f39943to = new List<>();

    /* JADX INFO: renamed from: du */
    private List<C11791os> f39937du = new List<>();

    /* JADX INFO: renamed from: h4 */
    private List<C11791os> f39939h4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    private List<C11791os> f39942m9 = new List<>();

    public C11851xb() {
        m55389ck();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r4.f39938dy = r1;
     */
    @Override // com.aspose.slides.internal.p464vq.AbstractC11819tq
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo55278k4(IGenericList<C11791os> iGenericList) {
        boolean zM27456k4;
        IGenericEnumerator<C11791os> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                mo55279k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (this.f39942m9.size() == 0) {
            it = iGenericList.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11791os next = it.next();
                    if ("/theme/theme/theme1.xml".equals(next.m55427x1())) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        if (this.f39942m9.size() > 1) {
            for (int i = 0; i < this.f39942m9.size(); i++) {
                if (!C14113y2.m67359c5(this.f39942m9.get_Item(i).m55427x1(), "variant")) {
                    List<C11791os> list = this.f39942m9;
                    list.insertItem(0, list.get_Item(i));
                    this.f39942m9.removeAt(i + 1);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ks */
    public final C11791os m55435ks() {
        return this.f39938dy;
    }

    /* JADX INFO: renamed from: rv */
    public final C11791os m55436rv() {
        return this.f39936c5;
    }

    /* JADX INFO: renamed from: up */
    public final C11791os[] m55437up() {
        return this.f39941kk.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: x6 */
    public final C11791os m55438x6() {
        return this.f39940jd;
    }

    /* JADX INFO: renamed from: yj */
    public final List<C11791os> m55439yj() {
        return this.f39942m9;
    }

    public C11851xb(AbstractC3150x6 abstractC3150x6, boolean z) {
        m55407x1(abstractC3150x6, z, C3171dy.f9427k4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.aspose.slides.internal.p464vq.AbstractC11819tq
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo55279k4(C11791os c11791os) {
        List<C11791os> list;
        if (!C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11714bv.class)) {
            if (C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11747gf.class)) {
                this.f39937du.addItem(c11791os);
                return;
            }
            if (C7019kk.m27469x1(c11791os.m55372fa(), C11835v6.class)) {
                this.f39936c5 = c11791os;
                return;
            } else if (C7019kk.m27469x1(c11791os.m55372fa(), C11782n5.class)) {
                this.f39940jd = c11791os;
                return;
            } else {
                if (c11791os.m55372fa() == null) {
                    c11791os.m55378x1(new C11731dx());
                    return;
                }
                return;
            }
        }
        int iM27428k4 = f39935ck.m27428k4(c11791os.m55372fa().mo55273k4());
        if (iM27428k4 == 0) {
            list = this.f39943to;
        } else {
            if (iM27428k4 != 1) {
                if (iM27428k4 == 2) {
                    list = this.f39939h4;
                }
                if (C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11817tl.class)) {
                    return;
                }
                this.f39942m9.addItem(c11791os);
                return;
            }
            list = this.f39941kk;
        }
        list.addItem(c11791os);
        if (C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11817tl.class)) {
        }
    }
}
