package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p508xq.C12599kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.nh */
/* JADX INFO: loaded from: classes4.dex */
public class C11785nh extends AbstractC11819tq {

    /* JADX INFO: renamed from: qq */
    private static final C7017h4 f39799qq = new C7017h4("application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml", "application/vnd.openxmlformats-officedocument.presentationml.notesSlide+xml", "application/vnd.openxmlformats-officedocument.presentationml.notesMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.handoutMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.slide+xml", "application/vnd.openxmlformats-officedocument.vmlDrawing", "application/vnd.openxmlformats-officedocument.presentationml.tags+xml", "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml", "application/vnd.openxmlformats-officedocument.extended-properties+xml", "application/vnd.openxmlformats-package.core-properties+xml", "application/vnd.openxmlformats-officedocument.custom-properties+xml", "application/vnd.openxmlformats-officedocument.presentationml.presProps+xml", "application/vnd.openxmlformats-officedocument.presentationml.viewProps+xml", "application/vnd.openxmlformats-officedocument.theme+xml");

    /* JADX INFO: renamed from: c5 */
    private List<C11791os> f39800c5;

    /* JADX INFO: renamed from: ck */
    private List<C11791os> f39801ck;

    /* JADX INFO: renamed from: du */
    private List<C11791os> f39802du;

    /* JADX INFO: renamed from: dy */
    private List<C11791os> f39803dy;

    /* JADX INFO: renamed from: fa */
    private List<C11791os> f39804fa;

    /* JADX INFO: renamed from: h4 */
    private List<C11791os> f39805h4;

    /* JADX INFO: renamed from: ix */
    private C11791os f39806ix;

    /* JADX INFO: renamed from: jd */
    private List<C11791os> f39807jd;

    /* JADX INFO: renamed from: kk */
    private List<C11791os> f39808kk;

    /* JADX INFO: renamed from: ks */
    private C11791os f39809ks;

    /* JADX INFO: renamed from: m9 */
    private List<C11791os> f39810m9;

    /* JADX INFO: renamed from: ne */
    private C11791os f39811ne;

    /* JADX INFO: renamed from: rv */
    private C11791os f39812rv;

    /* JADX INFO: renamed from: to */
    private List<C11791os> f39813to;

    /* JADX INFO: renamed from: u4 */
    private C11791os f39814u4;

    /* JADX INFO: renamed from: up */
    private C11791os f39815up;

    /* JADX INFO: renamed from: uz */
    private C11791os f39816uz;

    /* JADX INFO: renamed from: wl */
    private C11791os f39817wl;

    /* JADX INFO: renamed from: x6 */
    private C11791os f39818x6;

    /* JADX INFO: renamed from: yj */
    private C11791os f39819yj;

    public C11785nh() {
        m55389ck();
    }

    /* JADX INFO: renamed from: ar */
    public final C11791os m55354ar() {
        return this.f39811ne;
    }

    /* JADX INFO: renamed from: b3 */
    public final C11791os m55355b3() {
        return this.f39818x6;
    }

    /* JADX INFO: renamed from: bv */
    public final C11791os m55356bv() {
        return this.f39814u4;
    }

    /* JADX INFO: renamed from: ix */
    public final C11791os[] m55357ix() {
        return this.f39800c5.toArray(new C11791os[0]);
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11819tq
    /* JADX INFO: renamed from: k4 */
    public void mo55278k4(IGenericList<C11791os> iGenericList) {
        if (this.f39800c5 == null) {
            this.f39800c5 = new List<>();
        }
        if (this.f39808kk == null) {
            this.f39808kk = new List<>();
        }
        if (this.f39813to == null) {
            this.f39813to = new List<>();
        }
        if (this.f39802du == null) {
            this.f39802du = new List<>();
        }
        if (this.f39805h4 == null) {
            this.f39805h4 = new List<>();
        }
        if (this.f39810m9 == null) {
            this.f39810m9 = new List<>();
        }
        if (this.f39803dy == null) {
            this.f39803dy = new List<>();
        }
        if (this.f39807jd == null) {
            this.f39807jd = new List<>();
        }
        if (this.f39801ck == null) {
            this.f39801ck = new List<>();
        }
        if (this.f39804fa == null) {
            this.f39804fa = new List<>();
        }
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
        C11791os c11791os = this.f39811ne;
        if (c11791os == null) {
            throw new C11726dl("Can't find presentation part.");
        }
        C11709bg[] c11709bgArrM55309k4 = c11791os.m55377up().m55309k4(C11866z7.f39962k4);
        this.f39806ix = m55392h4(c11709bgArrM55309k4.length > 0 ? c11709bgArrM55309k4[0].m55292k4() : "/ppt/tableStyles.xml");
        C11709bg[] c11709bgArrM55309k42 = this.f39811ne.m55377up().m55309k4(C11831uw.f39896k4);
        if (c11709bgArrM55309k42.length > 0) {
            this.f39814u4 = m55392h4(c11709bgArrM55309k42[0].m55292k4());
        }
    }

    /* JADX INFO: renamed from: ks */
    public final C11791os[] m55358ks() {
        return this.f39802du.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: lr */
    public final C11791os m55359lr() {
        return this.f39817wl;
    }

    /* JADX INFO: renamed from: ne */
    public final C11791os[] m55360ne() {
        return this.f39803dy.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: qq */
    public final C11791os m55361qq() {
        return this.f39815up;
    }

    /* JADX INFO: renamed from: rv */
    public final C11791os[] m55362rv() {
        return this.f39805h4.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: u4 */
    public final C11791os[] m55363u4() {
        return this.f39804fa.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: um */
    public final C11791os m55364um() {
        return this.f39806ix;
    }

    /* JADX INFO: renamed from: up */
    public final C11791os[] m55365up() {
        return this.f39808kk.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: uz */
    public final C11791os m55366uz() {
        return this.f39809ks;
    }

    /* JADX INFO: renamed from: v4 */
    public final C11791os m55367v4() {
        return this.f39816uz;
    }

    /* JADX INFO: renamed from: wl */
    public final C11791os m55368wl() {
        return this.f39819yj;
    }

    /* JADX INFO: renamed from: x6 */
    public final C11791os[] m55369x6() {
        return this.f39810m9.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: yd */
    public final C11791os m55370yd() {
        return this.f39812rv;
    }

    /* JADX INFO: renamed from: yj */
    public final C11791os[] m55371yj() {
        return this.f39813to.toArray(new C11791os[0]);
    }

    public C11785nh(AbstractC3150x6 abstractC3150x6, AbstractC3174jd abstractC3174jd) {
        m55397k4(abstractC3150x6, abstractC3174jd);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    @Override // com.aspose.slides.internal.p464vq.AbstractC11819tq
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo55279k4(C11791os c11791os) {
        List<C11791os> list;
        if (this.f39800c5 == null) {
            this.f39800c5 = new List<>();
        }
        if (this.f39808kk == null) {
            this.f39808kk = new List<>();
        }
        if (this.f39813to == null) {
            this.f39813to = new List<>();
        }
        if (this.f39802du == null) {
            this.f39802du = new List<>();
        }
        if (this.f39805h4 == null) {
            this.f39805h4 = new List<>();
        }
        if (this.f39810m9 == null) {
            this.f39810m9 = new List<>();
        }
        if (this.f39803dy == null) {
            this.f39803dy = new List<>();
        }
        if (this.f39807jd == null) {
            this.f39807jd = new List<>();
        }
        if (this.f39801ck == null) {
            this.f39801ck = new List<>();
        }
        if (this.f39804fa == null) {
            this.f39804fa = new List<>();
        }
        if (!C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11714bv.class)) {
            if (C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11747gf.class)) {
                this.f39800c5.addItem(c11791os);
                return;
            }
            if (C7019kk.m27469x1(c11791os.m55372fa(), C11835v6.class)) {
                this.f39816uz = c11791os;
                return;
            } else if (C7019kk.m27469x1(c11791os.m55372fa(), C11782n5.class)) {
                this.f39817wl = c11791os;
                return;
            } else {
                if (c11791os.m55372fa() == null) {
                    c11791os.m55378x1(new C11731dx());
                    return;
                }
                return;
            }
        }
        switch (f39799qq.m27428k4(c11791os.m55372fa().mo55273k4())) {
            case 0:
                list = this.f39802du;
                list.addItem(c11791os);
                break;
            case 1:
                list = this.f39813to;
                list.addItem(c11791os);
                break;
            case 2:
                list = this.f39805h4;
                list.addItem(c11791os);
                break;
            case 3:
                list = this.f39810m9;
                list.addItem(c11791os);
                break;
            case 4:
                list = this.f39803dy;
                list.addItem(c11791os);
                break;
            case 5:
                list = this.f39808kk;
                list.addItem(c11791os);
                break;
            case 6:
                list = this.f39807jd;
                list.addItem(c11791os);
                break;
            case 7:
                list = this.f39801ck;
                list.addItem(c11791os);
                break;
            case 8:
                list = this.f39804fa;
                list.addItem(c11791os);
                break;
            case 9:
                if (this.f39815up != null) {
                    c11791os.m55422k4(true);
                } else {
                    this.f39815up = c11791os;
                }
                break;
            case 10:
                if (this.f39819yj == null) {
                    this.f39819yj = c11791os;
                    break;
                }
                break;
            case 11:
                this.f39809ks = c11791os;
                break;
            case 12:
                this.f39812rv = c11791os;
                break;
            case 13:
                this.f39818x6 = c11791os;
                break;
            case 14:
                if (this.f39814u4 == null) {
                    this.f39814u4 = c11791os;
                }
                break;
        }
        if (C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11817tl.class)) {
            this.f39811ne = c11791os;
        }
    }

    public C11785nh(AbstractC3150x6 abstractC3150x6, boolean z, AbstractC3174jd abstractC3174jd) {
        m55407x1(abstractC3150x6, z, abstractC3174jd);
    }

    public C11785nh(C12599kk c12599kk, AbstractC3174jd abstractC3174jd) {
        m55401k4(c12599kk, abstractC3174jd);
    }
}
