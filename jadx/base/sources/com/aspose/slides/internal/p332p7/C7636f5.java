package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.f5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7636f5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22666to = new C7017h4("tblPr", "tblGrid", TranslateLanguage.TURKISH);

    /* JADX INFO: renamed from: k4 */
    private C7311bb f22667k4;

    /* JADX INFO: renamed from: kk */
    private List<C8459oo> f22668kk;

    /* JADX INFO: renamed from: x1 */
    private C7687fp f22669x1;

    public C7636f5() {
        m31616m9();
        this.f22669x1 = new C7687fp();
    }

    /* JADX INFO: renamed from: m9 */
    private void m31616m9() {
        this.f22668kk = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C8459oo[] m31617du() {
        return this.f22668kk.toArray(new C8459oo[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final C7311bb m31619kk() {
        return this.f22667k4;
    }

    /* JADX INFO: renamed from: to */
    public final C7687fp m31620to() {
        return this.f22669x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8459oo m31621x1() {
        C8459oo c8459oo = new C8459oo();
        this.f22668kk.addItem(c8459oo);
        return c8459oo;
    }

    public C7636f5(final AbstractC13912i5 abstractC13912i5) {
        m31616m9();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7636f5.f22666to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7636f5.this.f22667k4 = new C7311bb(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7636f5.this.f22669x1 = new C7687fp(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7636f5.this.f22668kk.addItem(new C8459oo(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7311bb m31618k4() {
        if (this.f22667k4 != null) {
            throw new Exception("Only one <tblPr> element can be added.");
        }
        C7311bb c7311bb = new C7311bb();
        this.f22667k4 = c7311bb;
        return c7311bb;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("a", str2, "http://schemas.openxmlformats.org/drawingml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/math") == null) {
            c3059ii.m12954to("xmlns", "m", null, "http://schemas.openxmlformats.org/officeDocument/2006/math");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/wordprocessingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "w", null, "http://schemas.openxmlformats.org/wordprocessingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing") == null) {
            c3059ii.m12954to("xmlns", "wp", null, "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/drawing/2010/main") == null) {
            c3059ii.m12954to("xmlns", "a14", null, "http://schemas.microsoft.com/office/drawing/2010/main");
        }
        C7311bb c7311bb = this.f22667k4;
        if (c7311bb != null) {
            c7311bb.mo6846k4("a", c3059ii, "tblPr");
        }
        this.f22669x1.mo6846k4("a", c3059ii, "tblGrid");
        List.Enumerator<C8459oo> it = this.f22668kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, TranslateLanguage.TURKISH);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
