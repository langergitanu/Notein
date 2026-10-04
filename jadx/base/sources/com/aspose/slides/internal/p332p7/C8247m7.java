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
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.m7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8247m7 extends AbstractC9290yj {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26705to = new C7017h4("nvGrpSpPr", "grpSpPr", "sp", "AlternateContent", "grpSp", "graphicFrame", "cxnSp", "pic");

    /* JADX INFO: renamed from: k4 */
    private C7383c7 f26706k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f26707kk;

    /* JADX INFO: renamed from: x1 */
    private C7664fe f26708x1;

    public C8247m7() {
        m36719h4();
        this.f26706k4 = new C7383c7();
        this.f26708x1 = new C7664fe();
    }

    /* JADX INFO: renamed from: h4 */
    private void m36719h4() {
        this.f26707kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: kk */
    public List<C7394ca> mo28601kk() {
        return this.f26707kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: x1 */
    public C7664fe mo28603x1() {
        return this.f26708x1;
    }

    public C8247m7(final AbstractC13912i5 abstractC13912i5) {
        m36719h4();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.m7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C8247m7.f26705to.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8247m7.this.f26706k4 = new C7383c7(abstractC13912i5);
                        return true;
                    case 1:
                        C8247m7.this.f26708x1 = new C7664fe(abstractC13912i5);
                        return true;
                    case 2:
                        C8641qz c8641qz = new C8641qz(abstractC13912i5);
                        list = C8247m7.this.f26707kk;
                        c7394ca = new C7394ca("sp", c8641qz);
                        break;
                    case 3:
                        C7639f6 c7639f6 = new C7639f6(abstractC13912i5);
                        list = C8247m7.this.f26707kk;
                        c7394ca = new C7394ca("AlternateContent", c7639f6);
                        break;
                    case 4:
                        C8247m7 c8247m7 = new C8247m7(abstractC13912i5);
                        list = C8247m7.this.f26707kk;
                        c7394ca = new C7394ca("grpSp", c8247m7);
                        break;
                    case 5:
                        C8910tz c8910tz = new C8910tz(abstractC13912i5);
                        list = C8247m7.this.f26707kk;
                        c7394ca = new C7394ca("graphicFrame", c8910tz);
                        break;
                    case 6:
                        C8299mz c8299mz = new C8299mz(abstractC13912i5);
                        list = C8247m7.this.f26707kk;
                        c7394ca = new C7394ca("cxnSp", c8299mz);
                        break;
                    case 7:
                        C8776si c8776si = new C8776si(abstractC13912i5);
                        list = C8247m7.this.f26707kk;
                        c7394ca = new C7394ca("pic", c8776si);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public C7394ca mo28598k4(String str) {
        C7394ca c7394ca;
        switch (f26705to.m27428k4(str)) {
            case 2:
                c7394ca = new C7394ca("sp", new C8641qz());
                break;
            case 3:
                c7394ca = new C7394ca("AlternateContent", new C7639f6());
                break;
            case 4:
                c7394ca = new C7394ca("grpSp", new C8247m7());
                break;
            case 5:
                c7394ca = new C7394ca("graphicFrame", new C8910tz());
                break;
            case 6:
                c7394ca = new C7394ca("cxnSp", new C8299mz());
                break;
            case 7:
                c7394ca = new C7394ca("pic", new C8776si());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f26707kk.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public AbstractC8125ks mo28599k4() {
        return this.f26706k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f26706k4.mo6846k4("cdr", c3059ii, "nvGrpSpPr");
        this.f26708x1.mo6846k4("cdr", c3059ii, "grpSpPr");
        List.Enumerator<C7394ca> it = this.f26707kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f26705to.m27428k4(next.m29539k4())) {
                    case 2:
                        ((C8641qz) next.m29541kk()).mo6846k4("cdr", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C7639f6) next.m29541kk()).mo6846k4("mc", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C8247m7) next.m29541kk()).mo6846k4("cdr", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C8910tz) next.m29541kk()).mo6846k4("cdr", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8299mz) next.m29541kk()).mo6846k4("cdr", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8776si) next.m29541kk()).mo6846k4("cdr", c3059ii, next.m29539k4());
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
