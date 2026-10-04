package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class skr extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30209h4 = new C7017h4("form:name", "form:control-implementation", "form:label", "form:text-style-name", "text", "textarea", "formatted-text", "number", "date", "combobox", "listbox", "checkbox");

    /* JADX INFO: renamed from: du */
    private List<C7394ca> f30210du;

    /* JADX INFO: renamed from: k4 */
    private String f30211k4;

    /* JADX INFO: renamed from: kk */
    private String f30212kk;

    /* JADX INFO: renamed from: to */
    private String f30213to;

    /* JADX INFO: renamed from: x1 */
    private String f30214x1;

    public skr() {
        m41102x1();
    }

    public skr(final AbstractC13912i5 abstractC13912i5) {
        m41102x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.skr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = skr.f30209h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    skr.this.f30211k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    skr.this.f30214x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    skr.this.f30212kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                skr.this.f30213to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.skr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (skr.f30209h4.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        k8h k8hVar = new k8h(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("text", k8hVar);
                        break;
                    case 5:
                        vbi vbiVar = new vbi(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("textarea", vbiVar);
                        break;
                    case 6:
                        ack ackVar = new ack(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("formatted-text", ackVar);
                        break;
                    case 7:
                        lma lmaVar = new lma(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("number", lmaVar);
                        break;
                    case 8:
                        eem eemVar = new eem(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("date", eemVar);
                        break;
                    case 9:
                        csi csiVar = new csi(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("combobox", csiVar);
                        break;
                    case 10:
                        zwj zwjVar = new zwj(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("listbox", zwjVar);
                        break;
                    case 11:
                        giy giyVar = new giy(abstractC13912i5);
                        list = skr.this.f30210du;
                        c7394ca = new C7394ca("checkbox", giyVar);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m41102x1() {
        this.f30210du = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30211k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f30214x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        String str5 = this.f30212kk;
        if (str5 != null) {
            c3059ii.m12955x1("form:label", str5);
        }
        String str6 = this.f30213to;
        if (str6 != null) {
            c3059ii.m12955x1("form:text-style-name", str6);
        }
        List.Enumerator<C7394ca> it = this.f30210du.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f30209h4.m27428k4(next.m29539k4())) {
                    case 4:
                        ((k8h) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((vbi) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((ack) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((lma) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((eem) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((csi) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((zwj) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((giy) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
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
