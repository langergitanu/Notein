package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class fbr extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22777kk = new C7017h4("custData", "tags");

    /* JADX INFO: renamed from: k4 */
    private List<lwx> f22778k4;

    /* JADX INFO: renamed from: x1 */
    private xar f22779x1;

    public fbr() {
        m31720h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m31720h4() {
        this.f22778k4 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final lwx[] m31724kk() {
        return this.f22778k4.toArray(new lwx[0]);
    }

    /* JADX INFO: renamed from: to */
    public final xar m31725to() {
        return this.f22779x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final xar m31726x1() {
        if (this.f22779x1 != null) {
            throw new Exception("Only one <tags> element can be added.");
        }
        xar xarVar = new xar();
        this.f22779x1 = xarVar;
        return xarVar;
    }

    public fbr(final AbstractC13912i5 abstractC13912i5) {
        m31720h4();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fbr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = fbr.f22777kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    fbr.this.f22778k4.addItem(new lwx(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    fbr.this.f22779x1 = new xar(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final lwx m31723k4() {
        lwx lwxVar = new lwx();
        this.f22778k4.addItem(lwxVar);
        return lwxVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<lwx> it = this.f22778k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "custData");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        xar xarVar = this.f22779x1;
        if (xarVar != null) {
            xarVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tags");
        }
        c3059ii.mo21898jd();
    }
}
