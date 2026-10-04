package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.n7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8315n7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27158to = new C7017h4("ax:name", "ax:value", "font", IDToken.PICTURE);

    /* JADX INFO: renamed from: k4 */
    private String f27159k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f27160kk;

    /* JADX INFO: renamed from: x1 */
    private String f27161x1;

    public C8315n7() {
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m37297kk() {
        return this.f27160kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m37299x1() {
        return this.f27161x1;
    }

    public C8315n7(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.n7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8315n7.f27158to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8315n7.this.f27159k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8315n7.this.f27161x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.n7.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8315n7 c8315n7;
                C7394ca c7394ca;
                int iM27428k4 = C8315n7.f27158to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    c8315n7 = C8315n7.this;
                    c7394ca = new C7394ca("font", new C7397cc(abstractC13912i5));
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    c8315n7 = C8315n7.this;
                    c7394ca = new C7394ca(IDToken.PICTURE, new C7628f2(abstractC13912i5));
                }
                c8315n7.f27160kk = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37295k4(String str) {
        C7394ca c7394ca;
        if (this.f27160kk != null) {
            throw new Exception("FontOrPicture already is initialized.");
        }
        int iM27428k4 = f27158to.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("font", new C7397cc());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca(IDToken.PICTURE, new C7628f2());
        }
        this.f27160kk = c7394ca;
        return this.f27160kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m37298kk(String str) {
        this.f27161x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m37296k4() {
        return this.f27159k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37300x1(String str) {
        this.f27159k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("ax:name", this.f27159k4);
        String str3 = this.f27161x1;
        if (str3 != null) {
            c3059ii.m12955x1("ax:value", str3);
        }
        C7394ca c7394ca = this.f27160kk;
        if (c7394ca != null) {
            int iM27428k4 = f27158to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((C7397cc) this.f27160kk.m29541kk()).mo6846k4("ax", c3059ii, this.f27160kk.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C7628f2) this.f27160kk.m29541kk()).mo6846k4("ax", c3059ii, this.f27160kk.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
