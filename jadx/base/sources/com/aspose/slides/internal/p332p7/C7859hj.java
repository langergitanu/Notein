package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hj */
/* JADX INFO: loaded from: classes4.dex */
public class C7859hj extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f24176h4 = new C7017h4("latin", "ea", TranslateLanguage.CZECH, "font", "extLst");

    /* JADX INFO: renamed from: du */
    private C8397nz f24177du;

    /* JADX INFO: renamed from: k4 */
    private C9235xv f24178k4;

    /* JADX INFO: renamed from: kk */
    private C9235xv f24179kk;

    /* JADX INFO: renamed from: to */
    private List<C9248xz> f24180to;

    /* JADX INFO: renamed from: x1 */
    private C9235xv f24181x1;

    public C7859hj() {
        m33468dy();
        this.f24178k4 = new C9235xv();
        this.f24181x1 = new C9235xv();
        this.f24179kk = new C9235xv();
    }

    /* JADX INFO: renamed from: dy */
    private void m33468dy() {
        this.f24180to = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C9248xz[] m33475du() {
        return this.f24180to.toArray(new C9248xz[0]);
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC7414ck m33476h4() {
        return this.f24177du;
    }

    /* JADX INFO: renamed from: kk */
    public final C9235xv m33479kk() {
        return this.f24181x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9235xv m33480to() {
        return this.f24179kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9235xv m33481x1() {
        return this.f24178k4;
    }

    public C7859hj(final AbstractC13912i5 abstractC13912i5) {
        m33468dy();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7859hj.f24176h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7859hj.this.f24178k4 = new C9235xv(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7859hj.this.f24181x1 = new C9235xv(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7859hj.this.f24179kk = new C9235xv(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7859hj.this.f24180to.addItem(new C9248xz(abstractC13912i5));
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C7859hj.this.f24177du = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9248xz m33477k4() {
        C9248xz c9248xz = new C9248xz();
        this.f24180to.addItem(c9248xz);
        return c9248xz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33478k4(AbstractC7414ck abstractC7414ck) {
        this.f24177du = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f24178k4.mo6846k4("a", c3059ii, "latin");
        this.f24181x1.mo6846k4("a", c3059ii, "ea");
        this.f24179kk.mo6846k4("a", c3059ii, TranslateLanguage.CZECH);
        List.Enumerator<C9248xz> it = this.f24180to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "font");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8397nz c8397nz = this.f24177du;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
