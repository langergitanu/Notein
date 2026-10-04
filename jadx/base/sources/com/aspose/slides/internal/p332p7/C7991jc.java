package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jc */
/* JADX INFO: loaded from: classes4.dex */
public class C7991jc extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25081h4 = new C7017h4("meth", "id", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr", "variation", "extLst");

    /* JADX INFO: renamed from: du */
    private C8397nz f25082du;

    /* JADX INFO: renamed from: k4 */
    private int f25083k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f25084kk;

    /* JADX INFO: renamed from: to */
    private List<C7372c2> f25085to;

    /* JADX INFO: renamed from: x1 */
    private long f25086x1;

    public C7991jc() {
        m34641du();
    }

    /* JADX INFO: renamed from: du */
    private void m34641du() {
        this.f25083k4 = 0;
        this.f25086x1 = 4294967295L;
        this.f25084kk = new List<>();
        this.f25085to = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m34648k4() {
        return this.f25083k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7372c2[] m34649kk() {
        return this.f25085to.toArray(new C7372c2[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m34650x1() {
        return this.f25084kk;
    }

    public C7991jc(final AbstractC13912i5 abstractC13912i5) {
        m34641du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7991jc.f25081h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7991jc.this.f25083k4 = C8320na.m37337k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7991jc.this.f25086x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C7991jc.f25081h4.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        C9395zr c9395zr = new C9395zr(abstractC13912i5);
                        list = C7991jc.this.f25084kk;
                        c7394ca = new C7394ca("scrgbClr", c9395zr);
                        break;
                    case 3:
                        C7670fk c7670fk = new C7670fk(abstractC13912i5);
                        list = C7991jc.this.f25084kk;
                        c7394ca = new C7394ca("srgbClr", c7670fk);
                        break;
                    case 4:
                        C9052vm c9052vm = new C9052vm(abstractC13912i5);
                        list = C7991jc.this.f25084kk;
                        c7394ca = new C7394ca("hslClr", c9052vm);
                        break;
                    case 5:
                        C7939il c7939il = new C7939il(abstractC13912i5);
                        list = C7991jc.this.f25084kk;
                        c7394ca = new C7394ca("sysClr", c7939il);
                        break;
                    case 6:
                        C8732s1 c8732s1 = new C8732s1(abstractC13912i5);
                        list = C7991jc.this.f25084kk;
                        c7394ca = new C7394ca("schemeClr", c8732s1);
                        break;
                    case 7:
                        C8065k9 c8065k9 = new C8065k9(abstractC13912i5);
                        list = C7991jc.this.f25084kk;
                        c7394ca = new C7394ca("prstClr", c8065k9);
                        break;
                    case 8:
                        C7991jc.this.f25085to.addItem(new C7372c2(abstractC13912i5));
                        return true;
                    case 9:
                        C7991jc.this.f25082du = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(TranslateLanguage.CZECH, str2, "http://schemas.microsoft.com/office/drawing/2012/chartStyle");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        c3059ii.m12955x1("meth", C8320na.m37338k4(this.f25083k4));
        long j = this.f25086x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("id", C13850af.m65147x1(j));
        }
        List.Enumerator<C7394ca> it = this.f25084kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25081h4.m27428k4(next.m29539k4())) {
                    case 2:
                        ((C9395zr) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C7670fk) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C9052vm) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C7939il) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8732s1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8065k9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
        List.Enumerator<C7372c2> it2 = this.f25085to.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4(TranslateLanguage.CZECH, c3059ii, "variation");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        C8397nz c8397nz = this.f25082du;
        if (c8397nz != null) {
            c8397nz.mo6846k4(TranslateLanguage.CZECH, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
