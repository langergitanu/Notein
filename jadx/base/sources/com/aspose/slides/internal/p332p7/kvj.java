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
public class kvj extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25993x1 = new C7017h4("f");

    /* JADX INFO: renamed from: k4 */
    private List<ik7> f25994k4;

    public kvj() {
        m35745to();
    }

    /* JADX INFO: renamed from: to */
    private void m35745to() {
        this.f25994k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final ik7[] m35747x1() {
        return this.f25994k4.toArray(new ik7[0]);
    }

    public kvj(final AbstractC13912i5 abstractC13912i5) {
        m35745to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kvj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (kvj.f25993x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                kvj.this.f25994k4.addItem(new ik7(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final ik7 m35746k4() {
        ik7 ik7Var = new ik7();
        this.f25994k4.addItem(ik7Var);
        return ik7Var;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<ik7> it = this.f25994k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("v", c3059ii, "f");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
