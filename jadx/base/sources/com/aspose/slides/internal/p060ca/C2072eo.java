package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.eo */
/* JADX INFO: loaded from: classes3.dex */
public class C2072eo extends AbstractC2047di {
    public C2072eo() {
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public C2412zn mo10365k4(C2317u4 c2317u4) {
        return new C2043d6(c2317u4);
    }

    public C2072eo(C2052dp c2052dp) {
        super(c2052dp);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public void mo10367k4(C2412zn c2412zn) {
        C2043d6 c2043d6 = (C2043d6) c2412zn;
        int iM10355k4 = c2043d6.m10355k4();
        if (iM10355k4 == 0) {
            String strM10357to = c2043d6.m10357to();
            if (strM10357to == null) {
                m10368k4(strM10357to);
                return;
            } else {
                m10364k4().mo10395k4(strM10357to);
                return;
            }
        }
        if (iM10355k4 == 1) {
            this.f7073to.m11121k4(c2043d6.m10358x1());
        } else {
            if (iM10355k4 != 2) {
                return;
            }
            this.f7073to.m11121k4(c2043d6.m10356kk());
        }
    }
}
