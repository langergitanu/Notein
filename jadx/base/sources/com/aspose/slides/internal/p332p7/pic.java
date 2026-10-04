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
public class pic extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28429x1 = new C7017h4("row");

    /* JADX INFO: renamed from: k4 */
    private List<ipw> f28430k4;

    public pic() {
        m38924to();
    }

    /* JADX INFO: renamed from: to */
    private void m38924to() {
        this.f28430k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final ipw[] m38926x1() {
        return this.f28430k4.toArray(new ipw[0]);
    }

    public pic(final AbstractC13912i5 abstractC13912i5) {
        m38924to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pic.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (pic.f28429x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                pic.this.f28430k4.addItem(new ipw(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final ipw m38925k4() {
        ipw ipwVar = new ipw();
        this.f28430k4.addItem(ipwVar);
        return ipwVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<ipw> it = this.f28430k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "row");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
