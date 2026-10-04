package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class kp9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25863kk = new C7017h4("_AnyElement", "_TEXT");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f25864k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f25865x1;

    public kp9() {
        m35600x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35600x1() {
        this.f25864k4 = new List<>();
        this.f25865x1 = new List<>();
    }

    public kp9(AbstractC13912i5 abstractC13912i5) {
        m35600x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kp9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                kp9.f25863kk.m27428k4(str);
                return false;
            }
        });
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
                    f25863kk.m27428k4(abstractC13912i5.mo65023fa());
                    this.f25865x1.addItem(new C7394ca("_AnyElement", new C8249m9(abstractC13912i5)));
                    if (abstractC13912i5.mo65015ar()) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    OooOO0O.OooO0O0("_TEXT", abstractC13912i5.mo65042rv(), this.f25865x1);
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f25864k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                c3059ii.m12955x1(next.m29539k4(), (String) next.m29541kk());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f25865x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next2 = it.next();
                int iM27428k4 = f25863kk.m27428k4(next2.m29539k4());
                if (iM27428k4 == 0) {
                    ((C8249m9) next2.m29541kk()).mo6846k4("", c3059ii, next2.m29539k4());
                } else if (iM27428k4 == 1) {
                    c3059ii.mo21918x1((String) next2.m29541kk());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        c3059ii.mo21898jd();
    }
}
