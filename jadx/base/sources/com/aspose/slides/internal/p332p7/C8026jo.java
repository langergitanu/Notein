package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jo */
/* JADX INFO: loaded from: classes4.dex */
public class C8026jo extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25270x1 = new C7017h4("lineSketchNone", "lineSketchCurved", "lineSketchFreehand", "lineSketchScribble");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f25271k4;

    public C8026jo() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m34850k4() {
        return this.f25271k4;
    }

    public C8026jo(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8026jo c8026jo;
                C7394ca c7394ca;
                int iM27428k4 = C8026jo.f25270x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c8026jo = C8026jo.this;
                    c7394ca = new C7394ca("lineSketchNone", new C7589eo(abstractC13912i5));
                } else if (iM27428k4 == 1) {
                    c8026jo = C8026jo.this;
                    c7394ca = new C7394ca("lineSketchCurved", new C7589eo(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    c8026jo = C8026jo.this;
                    c7394ca = new C7394ca("lineSketchFreehand", new C7589eo(abstractC13912i5));
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    c8026jo = C8026jo.this;
                    c7394ca = new C7394ca("lineSketchScribble", new C7589eo(abstractC13912i5));
                }
                c8026jo.f25271k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m34851k4(String str) {
        C7394ca c7394ca;
        if (this.f25271k4 != null) {
            throw new Exception("LineSketchType already is initialized.");
        }
        int iM27428k4 = f25270x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("lineSketchNone", new C7589eo());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("lineSketchCurved", new C7589eo());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("lineSketchFreehand", new C7589eo());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("lineSketchScribble", new C7589eo());
        }
        this.f25271k4 = c7394ca;
        return this.f25271k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        int iM27428k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f25271k4;
        if (c7394ca != null && ((iM27428k4 = f25270x1.m27428k4(c7394ca.m29539k4())) == 0 || iM27428k4 == 1 || iM27428k4 == 2 || iM27428k4 == 3)) {
            ((C7589eo) this.f25271k4.m29541kk()).mo6846k4("ask", c3059ii, this.f25271k4.m29539k4());
        }
        c3059ii.mo21898jd();
    }
}
