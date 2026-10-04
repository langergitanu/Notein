package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class xyf extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33156kk = new C7017h4("generator", NoteMeta.PROPERTY_TITLE, "description", "subject", "keyword", "initial-creator", "creator", "printed-by", "creation-date", "date", "print-date", "template", "auto-reload", "hyperlink-behaviour", "language", "editing-cycles", "editing-duration", "document-statistic", "user-defined");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f33157k4;

    /* JADX INFO: renamed from: x1 */
    private List<C8249m9> f33158x1;

    public xyf() {
        m44748x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m44748x1() {
        this.f33157k4 = new List<>();
        this.f33158x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m44749k4() {
        return this.f33157k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r2.addItem(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        r2.addItem(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xyf(AbstractC13912i5 abstractC13912i5) {
        String strMo65042rv;
        List<C7394ca> list;
        String str;
        List<C7394ca> list2;
        C7394ca c7394ca;
        List<C7394ca> list3;
        C7394ca c7394ca2;
        m44748x1();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f33156kk.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 0:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "generator";
                            break;
                        case 1:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = NoteMeta.PROPERTY_TITLE;
                            break;
                        case 2:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "description";
                            break;
                        case 3:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "subject";
                            break;
                        case 4:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "keyword";
                            break;
                        case 5:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "initial-creator";
                            break;
                        case 6:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "creator";
                            break;
                        case 7:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "printed-by";
                            break;
                        case 8:
                            abstractC13912i5.mo65026h4();
                            C14084qq c14084qqClone = C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16).Clone();
                            list2 = this.f33157k4;
                            c7394ca = new C7394ca("creation-date", c14084qqClone.Clone());
                            break;
                        case 9:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "date";
                            break;
                        case 10:
                            abstractC13912i5.mo65026h4();
                            C14084qq c14084qqClone2 = C14084qq.m67089k4(abstractC13912i5.mo65042rv(), C11697x1.m55252to(), 16).Clone();
                            list2 = this.f33157k4;
                            c7394ca = new C7394ca("print-date", c14084qqClone2.Clone());
                            break;
                        case 11:
                            s5e s5eVar = new s5e(abstractC13912i5);
                            list2 = this.f33157k4;
                            c7394ca = new C7394ca("template", s5eVar);
                            break;
                        case 12:
                            lyj lyjVar = new lyj(abstractC13912i5);
                            list2 = this.f33157k4;
                            c7394ca = new C7394ca("auto-reload", lyjVar);
                            break;
                        case 13:
                            snk snkVar = new snk(abstractC13912i5);
                            list2 = this.f33157k4;
                            c7394ca = new C7394ca("hyperlink-behaviour", snkVar);
                            break;
                        case 14:
                            abstractC13912i5.mo65026h4();
                            strMo65042rv = abstractC13912i5.mo65042rv();
                            list = this.f33157k4;
                            str = "language";
                            break;
                        case 15:
                            abstractC13912i5.mo65026h4();
                            this.f33157k4.addItem(new C7394ca("editing-cycles", Long.valueOf(AbstractC7361bz.m29295ne(abstractC13912i5.mo65042rv()))));
                            break;
                        case 16:
                            abstractC13912i5.mo65026h4();
                            C14077m4 c14077m4Clone = AbstractC7361bz.m29294ks(abstractC13912i5.mo65042rv()).Clone();
                            list3 = this.f33157k4;
                            c7394ca2 = new C7394ca("editing-duration", c14077m4Clone.Clone());
                            break;
                        case 17:
                            v9z v9zVar = new v9z(abstractC13912i5);
                            list3 = this.f33157k4;
                            c7394ca2 = new C7394ca("document-statistic", v9zVar);
                            break;
                        case 18:
                            t7u t7uVar = new t7u(abstractC13912i5);
                            list3 = this.f33157k4;
                            c7394ca2 = new C7394ca("user-defined", t7uVar);
                            break;
                        default:
                            this.f33158x1.addItem(new C8249m9(abstractC13912i5));
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                    }
                    return;
                }
            }
            OooOO0O.OooO0O0(str, strMo65042rv, list);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44750k4(C7394ca c7394ca) {
        this.f33157k4.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        String str3;
        String str4;
        String strM65108k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f33157k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f33156kk.m27428k4(next.m29539k4())) {
                    case 0:
                        str3 = "meta";
                        str4 = "generator";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 1:
                        str3 = AzureActiveDirectorySlice.DC_PARAMETER;
                        str4 = NoteMeta.PROPERTY_TITLE;
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 2:
                        str3 = AzureActiveDirectorySlice.DC_PARAMETER;
                        str4 = "description";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 3:
                        str3 = AzureActiveDirectorySlice.DC_PARAMETER;
                        str4 = "subject";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 4:
                        str3 = "meta";
                        str4 = "keyword";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 5:
                        str3 = "meta";
                        str4 = "initial-creator";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 6:
                        str3 = AzureActiveDirectorySlice.DC_PARAMETER;
                        str4 = "creator";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 7:
                        str3 = "meta";
                        str4 = "printed-by";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 8:
                        str3 = "meta";
                        str4 = "creation-date";
                        strM65108k4 = C13850af.m65108k4(((C14084qq) C7019kk.m27464to(next.m29541kk(), C14084qq.class)).Clone(), "yyyy-MM-ddTHH:mm:ss.fffffffK");
                        break;
                    case 9:
                        str3 = AzureActiveDirectorySlice.DC_PARAMETER;
                        str4 = "date";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 10:
                        str3 = "meta";
                        str4 = "print-date";
                        strM65108k4 = C13850af.m65108k4(((C14084qq) C7019kk.m27464to(next.m29541kk(), C14084qq.class)).Clone(), "yyyy-MM-ddTHH:mm:ss.fffffffK");
                        break;
                    case 11:
                        ((s5e) next.m29541kk()).mo6846k4("meta", c3059ii, next.m29539k4());
                        continue;
                    case 12:
                        ((lyj) next.m29541kk()).mo6846k4("meta", c3059ii, next.m29539k4());
                        continue;
                    case 13:
                        ((snk) next.m29541kk()).mo6846k4("meta", c3059ii, next.m29539k4());
                        continue;
                    case 14:
                        str3 = AzureActiveDirectorySlice.DC_PARAMETER;
                        str4 = "language";
                        strM65108k4 = (String) next.m29541kk();
                        break;
                    case 15:
                        str3 = "meta";
                        str4 = "editing-cycles";
                        strM65108k4 = C13850af.m65147x1(((Long) C7019kk.m27464to(next.m29541kk(), Long.TYPE)).longValue());
                        break;
                    case 16:
                        str3 = "meta";
                        str4 = "editing-duration";
                        strM65108k4 = AbstractC7361bz.m29288k4(((C14077m4) C7019kk.m27464to(next.m29541kk(), C14077m4.class)).Clone());
                        break;
                    case 17:
                        ((v9z) next.m29541kk()).mo6846k4("meta", c3059ii, next.m29539k4());
                        continue;
                    case 18:
                        ((t7u) next.m29541kk()).mo6846k4("meta", c3059ii, next.m29539k4());
                        continue;
                }
                m29301k4(str3, c3059ii, str4, strM65108k4, false);
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
        List.Enumerator<C8249m9> it2 = this.f33158x1.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("", c3059ii, "");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
