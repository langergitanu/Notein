package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yc */
/* JADX INFO: loaded from: classes4.dex */
public class C9271yc extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33310to = new C7017h4(Constants.MessagePayloadKeys.FROM, "to", "sp", "grpSp", "graphicFrame", "cxnSp", "pic");

    /* JADX INFO: renamed from: k4 */
    private C7460d5 f33311k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f33312kk;

    /* JADX INFO: renamed from: x1 */
    private C7460d5 f33313x1;

    public C9271yc() {
        this.f33311k4 = new C7460d5();
        this.f33313x1 = new C7460d5();
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m44916kk() {
        return this.f33312kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7460d5 m44917x1() {
        return this.f33313x1;
    }

    public C9271yc(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9271yc c9271yc;
                C7394ca c7394ca;
                switch (C9271yc.f33310to.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C9271yc.this.f33311k4 = new C7460d5(abstractC13912i5);
                        return true;
                    case 1:
                        C9271yc.this.f33313x1 = new C7460d5(abstractC13912i5);
                        return true;
                    case 2:
                        c9271yc = C9271yc.this;
                        c7394ca = new C7394ca("sp", new C8641qz(abstractC13912i5));
                        break;
                    case 3:
                        c9271yc = C9271yc.this;
                        c7394ca = new C7394ca("grpSp", new C8247m7(abstractC13912i5));
                        break;
                    case 4:
                        c9271yc = C9271yc.this;
                        c7394ca = new C7394ca("graphicFrame", new C8910tz(abstractC13912i5));
                        break;
                    case 5:
                        c9271yc = C9271yc.this;
                        c7394ca = new C7394ca("cxnSp", new C8299mz(abstractC13912i5));
                        break;
                    case 6:
                        c9271yc = C9271yc.this;
                        c7394ca = new C7394ca("pic", new C8776si(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c9271yc.f33312kk = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m44914k4(String str) {
        C7394ca c7394ca;
        if (this.f33312kk != null) {
            throw new Exception("Shape already is initialized.");
        }
        int iM27428k4 = f33310to.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("sp", new C8641qz());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("grpSp", new C8247m7());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("graphicFrame", new C8910tz());
        } else if (iM27428k4 == 5) {
            c7394ca = new C7394ca("cxnSp", new C8299mz());
        } else {
            if (iM27428k4 != 6) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("pic", new C8776si());
        }
        this.f33312kk = c7394ca;
        return this.f33312kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7460d5 m44915k4() {
        return this.f33311k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f33311k4.mo6846k4("cdr", c3059ii, Constants.MessagePayloadKeys.FROM);
        this.f33313x1.mo6846k4("cdr", c3059ii, "to");
        C7394ca c7394ca = this.f33312kk;
        if (c7394ca != null) {
            int iM27428k4 = f33310to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((C8641qz) this.f33312kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f33312kk.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C8247m7) this.f33312kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f33312kk.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C8910tz) this.f33312kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f33312kk.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C8299mz) this.f33312kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f33312kk.m29539k4());
            } else if (iM27428k4 == 6) {
                ((C8776si) this.f33312kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f33312kk.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
