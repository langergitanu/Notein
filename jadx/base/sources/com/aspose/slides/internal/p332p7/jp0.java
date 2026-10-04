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
public class jp0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25288x1 = new C7017h4("name", "enabled", "calcOnExit", "entryMacro", "exitMacro", "helpText", "statusText", "checkBox", "ddList", "textInput");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f25289k4;

    public jp0() {
        m34868x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34868x1() {
        this.f25289k4 = new List<>();
    }

    public jp0(final AbstractC13912i5 abstractC13912i5) {
        m34868x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jp0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (jp0.f25288x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        c3c c3cVar = new c3c(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("name", c3cVar);
                        break;
                    case 1:
                        vsx vsxVar = new vsx(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("enabled", vsxVar);
                        break;
                    case 2:
                        vsx vsxVar2 = new vsx(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("calcOnExit", vsxVar2);
                        break;
                    case 3:
                        m2n m2nVar = new m2n(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("entryMacro", m2nVar);
                        break;
                    case 4:
                        m2n m2nVar2 = new m2n(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("exitMacro", m2nVar2);
                        break;
                    case 5:
                        dle dleVar = new dle(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("helpText", dleVar);
                        break;
                    case 6:
                        ybu ybuVar = new ybu(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("statusText", ybuVar);
                        break;
                    case 7:
                        y7w y7wVar = new y7w(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("checkBox", y7wVar);
                        break;
                    case 8:
                        ee2 ee2Var = new ee2(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("ddList", ee2Var);
                        break;
                    case 9:
                        tlk tlkVar = new tlk(abstractC13912i5);
                        list = jp0.this.f25289k4;
                        c7394ca = new C7394ca("textInput", tlkVar);
                        break;
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
        vsx vsxVar;
        String strM29539k4;
        m2n m2nVar;
        String strM29539k42;
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f25289k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25288x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((c3c) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 1:
                        vsxVar = (vsx) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        vsxVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 2:
                        vsxVar = (vsx) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        vsxVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 3:
                        m2nVar = (m2n) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        m2nVar.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 4:
                        m2nVar = (m2n) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        m2nVar.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 5:
                        ((dle) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((ybu) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((y7w) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((ee2) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((tlk) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
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
