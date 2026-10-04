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
public class ysr extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33489x1 = new C7017h4("reply");

    /* JADX INFO: renamed from: k4 */
    private List<eng> f33490k4;

    public ysr() {
        m45112to();
    }

    /* JADX INFO: renamed from: to */
    private void m45112to() {
        this.f33490k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final eng[] m45114x1() {
        return this.f33490k4.toArray(new eng[0]);
    }

    public ysr(final AbstractC13912i5 abstractC13912i5) {
        m45112to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ysr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ysr.f33489x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                ysr.this.f33490k4.addItem(new eng(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final eng m45113k4() {
        eng engVar = new eng();
        this.f33490k4.addItem(engVar);
        return engVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<eng> it = this.f33490k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("p188", c3059ii, "reply");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
