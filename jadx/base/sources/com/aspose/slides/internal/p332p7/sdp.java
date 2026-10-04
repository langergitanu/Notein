package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class sdp extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30083x1 = new C7017h4("cm");

    /* JADX INFO: renamed from: k4 */
    private List<bjs> f30084k4;

    public sdp() {
        m40970to();
    }

    /* JADX INFO: renamed from: to */
    private void m40970to() {
        this.f30084k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final bjs[] m40972x1() {
        return this.f30084k4.toArray(new bjs[0]);
    }

    public sdp(final AbstractC13912i5 abstractC13912i5) {
        m40970to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sdp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (sdp.f30083x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                sdp.this.f30084k4.addItem(new bjs(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final bjs m40971k4() {
        bjs bjsVar = new bjs();
        this.f30084k4.addItem(bjsVar);
        return bjsVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("p188", str2, "http://schemas.microsoft.com/office/powerpoint/2018/8/main");
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2013/main/command") == null) {
            c3059ii.m12954to("xmlns", "pc", null, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/drawing/2013/main/command") == null) {
            c3059ii.m12954to("xmlns", "ac", null, "http://schemas.microsoft.com/office/drawing/2013/main/command");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
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
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
            c3059ii.m12954to("xmlns", ContextChain.TAG_PRODUCT, null, "http://schemas.openxmlformats.org/presentationml/2006/main");
        }
        List.Enumerator<bjs> it = this.f30084k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("p188", c3059ii, "cm");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
