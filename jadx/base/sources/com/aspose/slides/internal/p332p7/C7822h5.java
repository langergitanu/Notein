package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.h5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7822h5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f23866to = new C7017h4(Constants.MessagePayloadKeys.FROM, "ext", "sp", "grpSp", "graphicFrame", "cxnSp", "pic");

    /* JADX INFO: renamed from: k4 */
    private C7460d5 f23867k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f23868kk;

    /* JADX INFO: renamed from: x1 */
    private C7258al f23869x1;

    public C7822h5() {
        this.f23867k4 = new C7460d5();
        this.f23869x1 = new C7258al();
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m33078kk() {
        return this.f23868kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7258al m33079x1() {
        return this.f23869x1;
    }

    public C7822h5(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.h5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7822h5 c7822h5;
                C7394ca c7394ca;
                switch (C7822h5.f23866to.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7822h5.this.f23867k4 = new C7460d5(abstractC13912i5);
                        return true;
                    case 1:
                        C7822h5.this.f23869x1 = new C7258al(abstractC13912i5);
                        return true;
                    case 2:
                        c7822h5 = C7822h5.this;
                        c7394ca = new C7394ca("sp", new C8641qz(abstractC13912i5));
                        break;
                    case 3:
                        c7822h5 = C7822h5.this;
                        c7394ca = new C7394ca("grpSp", new C8247m7(abstractC13912i5));
                        break;
                    case 4:
                        c7822h5 = C7822h5.this;
                        c7394ca = new C7394ca("graphicFrame", new C8910tz(abstractC13912i5));
                        break;
                    case 5:
                        c7822h5 = C7822h5.this;
                        c7394ca = new C7394ca("cxnSp", new C8299mz(abstractC13912i5));
                        break;
                    case 6:
                        c7822h5 = C7822h5.this;
                        c7394ca = new C7394ca("pic", new C8776si(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c7822h5.f23868kk = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7460d5 m33077k4() {
        return this.f23867k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f23867k4.mo6846k4("cdr", c3059ii, Constants.MessagePayloadKeys.FROM);
        this.f23869x1.mo6846k4("cdr", c3059ii, "ext");
        C7394ca c7394ca = this.f23868kk;
        if (c7394ca != null) {
            int iM27428k4 = f23866to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((C8641qz) this.f23868kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f23868kk.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C8247m7) this.f23868kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f23868kk.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C8910tz) this.f23868kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f23868kk.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C8299mz) this.f23868kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f23868kk.m29539k4());
            } else if (iM27428k4 == 6) {
                ((C8776si) this.f23868kk.m29541kk()).mo6846k4("cdr", c3059ii, this.f23868kk.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
