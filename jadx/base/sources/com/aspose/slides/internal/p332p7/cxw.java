package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class cxw extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21366x1 = new C7017h4("file-entry");

    /* JADX INFO: renamed from: k4 */
    private List<w6f> f21367k4;

    public cxw() {
        m29971x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29971x1() {
        this.f21367k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final w6f m29972k4() {
        w6f w6fVar = new w6f();
        this.f21367k4.addItem(w6fVar);
        return w6fVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29973k4(w6f w6fVar) {
        this.f21367k4.addItem(w6fVar);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("manifest", str2, "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0");
        List.Enumerator<w6f> it = this.f21367k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("manifest", c3059ii, "file-entry");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
