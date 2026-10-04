package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class pk1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28454x1 = new C7017h4("name", "charset", "family", "b", ContextChain.TAG_INFRA, "strike", "outline", "shadow", "condense", "extend", "color", "sz", "u", "vertAlign", "scheme");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f28455k4;

    public pk1() {
        m38959x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38959x1() {
        this.f28455k4 = new List<>();
    }

    public pk1(final AbstractC13912i5 abstractC13912i5) {
        m38959x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pk1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (pk1.f28454x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        ubb ubbVar = new ubb(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("name", ubbVar);
                        break;
                    case 1:
                        xxx xxxVar = new xxx(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("charset", xxxVar);
                        break;
                    case 2:
                        xxx xxxVar2 = new xxx(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("family", xxxVar2);
                        break;
                    case 3:
                        dcz dczVar = new dcz(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("b", dczVar);
                        break;
                    case 4:
                        dcz dczVar2 = new dcz(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca(ContextChain.TAG_INFRA, dczVar2);
                        break;
                    case 5:
                        dcz dczVar3 = new dcz(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("strike", dczVar3);
                        break;
                    case 6:
                        dcz dczVar4 = new dcz(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("outline", dczVar4);
                        break;
                    case 7:
                        dcz dczVar5 = new dcz(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("shadow", dczVar5);
                        break;
                    case 8:
                        dcz dczVar6 = new dcz(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("condense", dczVar6);
                        break;
                    case 9:
                        dcz dczVar7 = new dcz(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("extend", dczVar7);
                        break;
                    case 10:
                        bz0 bz0Var = new bz0(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("color", bz0Var);
                        break;
                    case 11:
                        x4y x4yVar = new x4y(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("sz", x4yVar);
                        break;
                    case 12:
                        v5j v5jVar = new v5j(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("u", v5jVar);
                        break;
                    case 13:
                        gb6 gb6Var = new gb6(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("vertAlign", gb6Var);
                        break;
                    case 14:
                        put putVar = new put(abstractC13912i5);
                        list = pk1.this.f28455k4;
                        c7394ca = new C7394ca("scheme", putVar);
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
        xxx xxxVar;
        String strM29539k4;
        dcz dczVar;
        String strM29539k42;
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f28455k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28454x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((ubb) next.m29541kk()).mo6846k4("ssml", c3059ii, next.m29539k4());
                        break;
                    case 1:
                        xxxVar = (xxx) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        xxxVar.mo6846k4("ssml", c3059ii, strM29539k4);
                        break;
                    case 2:
                        xxxVar = (xxx) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        xxxVar.mo6846k4("ssml", c3059ii, strM29539k4);
                        break;
                    case 3:
                        dczVar = (dcz) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        dczVar.mo6846k4("ssml", c3059ii, strM29539k42);
                        break;
                    case 4:
                        dczVar = (dcz) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        dczVar.mo6846k4("ssml", c3059ii, strM29539k42);
                        break;
                    case 5:
                        dczVar = (dcz) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        dczVar.mo6846k4("ssml", c3059ii, strM29539k42);
                        break;
                    case 6:
                        dczVar = (dcz) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        dczVar.mo6846k4("ssml", c3059ii, strM29539k42);
                        break;
                    case 7:
                        dczVar = (dcz) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        dczVar.mo6846k4("ssml", c3059ii, strM29539k42);
                        break;
                    case 8:
                        dczVar = (dcz) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        dczVar.mo6846k4("ssml", c3059ii, strM29539k42);
                        break;
                    case 9:
                        dczVar = (dcz) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        dczVar.mo6846k4("ssml", c3059ii, strM29539k42);
                        break;
                    case 10:
                        ((bz0) next.m29541kk()).mo6846k4("ssml", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((x4y) next.m29541kk()).mo6846k4("ssml", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((v5j) next.m29541kk()).mo6846k4("ssml", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((gb6) next.m29541kk()).mo6846k4("ssml", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((put) next.m29541kk()).mo6846k4("ssml", c3059ii, next.m29539k4());
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
