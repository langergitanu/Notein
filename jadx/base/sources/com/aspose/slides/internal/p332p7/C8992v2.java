package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.v2 */
/* JADX INFO: loaded from: classes4.dex */
public class C8992v2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31492kk = new C7017h4("oMathParaPr", "oMath");

    /* JADX INFO: renamed from: k4 */
    private C7429cp f31493k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7211a4> f31494x1;

    public C8992v2() {
        m42659du();
    }

    /* JADX INFO: renamed from: du */
    private void m42659du() {
        this.f31494x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C7211a4[] m42665kk() {
        return this.f31494x1.toArray(new C7211a4[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C7429cp m42666x1() {
        return this.f31493k4;
    }

    public C8992v2(final AbstractC13912i5 abstractC13912i5) {
        m42659du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.v2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8992v2.f31492kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8992v2.this.f31493k4 = new C7429cp(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8992v2.this.f31494x1.addItem(new C7211a4(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7211a4 m42663k4() {
        C7211a4 c7211a4 = new C7211a4();
        this.f31494x1.addItem(c7211a4);
        return c7211a4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42664k4(C7429cp c7429cp) {
        this.f31493k4 = c7429cp;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7429cp c7429cp = this.f31493k4;
        if (c7429cp != null) {
            c7429cp.mo6846k4("m", c3059ii, "oMathParaPr");
        }
        List.Enumerator<C7211a4> it = this.f31494x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("m", c3059ii, "oMath");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
