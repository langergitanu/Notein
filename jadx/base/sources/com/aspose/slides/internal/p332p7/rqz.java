package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class rqz extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f29456x1 = new C7017h4("par", "seq", "excl", "anim", "animClr", "animEffect", "animMotion", "animRot", "animScale", "cmd", "set", "audio", "video");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f29457k4;

    public rqz() {
        m40175kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m40175kk() {
        this.f29457k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m40177k4() {
        return this.f29457k4;
    }

    public rqz(final AbstractC13912i5 abstractC13912i5) {
        m40175kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rqz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (rqz.f29456x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        rx0 rx0Var = new rx0(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("par", rx0Var);
                        break;
                    case 1:
                        rvh rvhVar = new rvh(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("seq", rvhVar);
                        break;
                    case 2:
                        qca qcaVar = new qca(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("excl", qcaVar);
                        break;
                    case 3:
                        it6 it6Var = new it6(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("anim", it6Var);
                        break;
                    case 4:
                        nbb nbbVar = new nbb(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("animClr", nbbVar);
                        break;
                    case 5:
                        i4y i4yVar = new i4y(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("animEffect", i4yVar);
                        break;
                    case 6:
                        glt gltVar = new glt(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("animMotion", gltVar);
                        break;
                    case 7:
                        u4g u4gVar = new u4g(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("animRot", u4gVar);
                        break;
                    case 8:
                        s0t s0tVar = new s0t(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("animScale", s0tVar);
                        break;
                    case 9:
                        zv9 zv9Var = new zv9(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("cmd", zv9Var);
                        break;
                    case 10:
                        oeg oegVar = new oeg(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("set", oegVar);
                        break;
                    case 11:
                        c6b c6bVar = new c6b(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("audio", c6bVar);
                        break;
                    case 12:
                        hgn hgnVar = new hgn(abstractC13912i5);
                        list = rqz.this.f29457k4;
                        c7394ca = new C7394ca("video", hgnVar);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m40178k4(String str) {
        C7394ca c7394ca;
        switch (f29456x1.m27428k4(str)) {
            case 0:
                c7394ca = new C7394ca("par", new rx0());
                break;
            case 1:
                c7394ca = new C7394ca("seq", new rvh());
                break;
            case 2:
                c7394ca = new C7394ca("excl", new qca());
                break;
            case 3:
                c7394ca = new C7394ca("anim", new it6());
                break;
            case 4:
                c7394ca = new C7394ca("animClr", new nbb());
                break;
            case 5:
                c7394ca = new C7394ca("animEffect", new i4y());
                break;
            case 6:
                c7394ca = new C7394ca("animMotion", new glt());
                break;
            case 7:
                c7394ca = new C7394ca("animRot", new u4g());
                break;
            case 8:
                c7394ca = new C7394ca("animScale", new s0t());
                break;
            case 9:
                c7394ca = new C7394ca("cmd", new zv9());
                break;
            case 10:
                c7394ca = new C7394ca("set", new oeg());
                break;
            case 11:
                c7394ca = new C7394ca("audio", new c6b());
                break;
            case 12:
                c7394ca = new C7394ca("video", new hgn());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f29457k4.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40179k4(C7394ca c7394ca) {
        this.f29457k4.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f29457k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f29456x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((rx0) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 1:
                        ((rvh) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((qca) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((it6) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((nbb) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((i4y) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((glt) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((u4g) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((s0t) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((zv9) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((oeg) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((c6b) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((hgn) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                        break;
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
        c3059ii.mo21898jd();
    }
}
