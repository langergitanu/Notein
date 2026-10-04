package com.aspose.slides.internal.p464vq;

import com.aspose.slides.internal.p532yu.C13129ny;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C11866z7 extends AbstractC11769kp {

    /* JADX INFO: renamed from: k4 */
    public static final C11801r5 f39962k4 = new C11801r5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableStyles");

    /* JADX INFO: renamed from: kk */
    public static final C13129ny f39963kk;

    /* JADX INFO: renamed from: x1 */
    public static final String[] f39964x1;

    static {
        String[] strArr = {"dml-tableStyle.xsd"};
        f39964x1 = strArr;
        f39963kk = AbstractC11739f5.m55334k4(strArr);
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: k4 */
    public String mo55273k4() {
        return "application/vnd.openxmlformats-officedocument.presentationml.tableStyles+xml";
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: to */
    public C13129ny mo55274to() {
        return f39963kk;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: x1 */
    public C11801r5 mo55275x1() {
        return f39962k4;
    }
}
