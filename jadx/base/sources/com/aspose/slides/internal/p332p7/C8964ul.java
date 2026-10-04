package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ul */
/* JADX INFO: loaded from: classes4.dex */
public class C8964ul extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31356kk = new C7017h4("blend", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill");

    /* JADX INFO: renamed from: k4 */
    private int f31357k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f31358x1;

    public C8964ul() {
    }

    /* JADX INFO: renamed from: k4 */
    public final int m42483k4() {
        return this.f31357k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m42486x1() {
        return this.f31358x1;
    }

    public C8964ul(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ul.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8964ul.f31356kk.m27428k4(str) != 0) {
                    return false;
                }
                C8964ul.this.f31357k4 = C9264y9.m44858k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ul.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8964ul c8964ul;
                C7394ca c7394ca;
                switch (C8964ul.f31356kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        c8964ul = C8964ul.this;
                        c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                        break;
                    case 2:
                        c8964ul = C8964ul.this;
                        c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                        break;
                    case 3:
                        c8964ul = C8964ul.this;
                        c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                        break;
                    case 4:
                        c8964ul = C8964ul.this;
                        c7394ca = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                        break;
                    case 5:
                        c8964ul = C8964ul.this;
                        c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                        break;
                    case 6:
                        c8964ul = C8964ul.this;
                        c7394ca = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c8964ul.f31358x1 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42484k4(String str) {
        C7394ca c7394ca;
        if (this.f31358x1 != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        switch (f31356kk.m27428k4(str)) {
            case 1:
                c7394ca = new C7394ca("noFill", new C8130kt());
                break;
            case 2:
                c7394ca = new C7394ca("solidFill", new C8256md());
                break;
            case 3:
                c7394ca = new C7394ca("gradFill", new C8403o4());
                break;
            case 4:
                c7394ca = new C7394ca("blipFill", new C9220xo());
                break;
            case 5:
                c7394ca = new C7394ca("pattFill", new C7416cl());
                break;
            case 6:
                c7394ca = new C7394ca("grpFill", new C9112wh());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f31358x1 = c7394ca;
        return this.f31358x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42485k4(int i) {
        this.f31357k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("blend", C9264y9.m44859k4(this.f31357k4));
        C7394ca c7394ca = this.f31358x1;
        if (c7394ca != null) {
            switch (f31356kk.m27428k4(c7394ca.m29539k4())) {
                case 1:
                    ((C8130kt) this.f31358x1.m29541kk()).mo6846k4("a", c3059ii, this.f31358x1.m29539k4());
                    break;
                case 2:
                    ((C8256md) this.f31358x1.m29541kk()).mo6846k4("a", c3059ii, this.f31358x1.m29539k4());
                    break;
                case 3:
                    ((C8403o4) this.f31358x1.m29541kk()).mo6846k4("a", c3059ii, this.f31358x1.m29539k4());
                    break;
                case 4:
                    ((C9220xo) this.f31358x1.m29541kk()).mo6846k4("a", c3059ii, this.f31358x1.m29539k4());
                    break;
                case 5:
                    ((C7416cl) this.f31358x1.m29541kk()).mo6846k4("a", c3059ii, this.f31358x1.m29539k4());
                    break;
                case 6:
                    ((C9112wh) this.f31358x1.m29541kk()).mo6846k4("a", c3059ii, this.f31358x1.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
