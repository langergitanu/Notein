package com.aspose.slides.internal.p464vq;

import com.aspose.slides.internal.p532yu.C13129ny;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.n3 */
/* JADX INFO: loaded from: classes4.dex */
public class C11781n3 extends AbstractC11815sz {

    /* JADX INFO: renamed from: k4 */
    public static final C11801r5 f39792k4 = new C11801r5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionHeaders");

    /* JADX INFO: renamed from: kk */
    public static final C13129ny f39793kk;

    /* JADX INFO: renamed from: x1 */
    public static final String[] f39794x1;

    static {
        String[] strArr = {"sml-sharedWorkbookRevisions.xsd"};
        f39794x1 = strArr;
        f39793kk = AbstractC11739f5.m55334k4(strArr);
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: k4 */
    public String mo55273k4() {
        return "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml";
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: to */
    public final C13129ny mo55274to() {
        return f39793kk;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: x1 */
    public C11801r5 mo55275x1() {
        return f39792k4;
    }
}
