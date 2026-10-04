package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.iu */
/* JADX INFO: loaded from: classes4.dex */
public class C7961iu extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24942x1 = new C7017h4("effectStyle");

    /* JADX INFO: renamed from: k4 */
    private List<C7366c0> f24943k4;

    public C7961iu() {
        m34464to();
    }

    /* JADX INFO: renamed from: to */
    private void m34464to() {
        this.f24943k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C7366c0[] m34466x1() {
        return this.f24943k4.toArray(new C7366c0[0]);
    }

    public C7961iu(final AbstractC13912i5 abstractC13912i5) {
        m34464to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.iu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7961iu.f24942x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7961iu.this.f24943k4.addItem(new C7366c0(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7366c0 m34465k4() {
        C7366c0 c7366c0 = new C7366c0();
        this.f24943k4.addItem(c7366c0);
        return c7366c0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7366c0> it = this.f24943k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "effectStyle");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
