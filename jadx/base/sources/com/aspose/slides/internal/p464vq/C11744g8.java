package com.aspose.slides.internal.p464vq;

import com.aspose.slides.internal.p532yu.C13129ny;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C11744g8 extends AbstractC11714bv {

    /* JADX INFO: renamed from: k4 */
    public static final C11801r5 f39741k4 = new C11801r5("http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/signature");

    /* JADX INFO: renamed from: kk */
    public static final C13129ny f39742kk;

    /* JADX INFO: renamed from: x1 */
    public static final String[] f39743x1;

    static {
        String[] strArr = {"opc-digSig.xsd"};
        f39743x1 = strArr;
        f39742kk = AbstractC11739f5.m55334k4(strArr);
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: k4 */
    public String mo55273k4() {
        return "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml";
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: to */
    public final C13129ny mo55274to() {
        return f39742kk;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: x1 */
    public C11801r5 mo55275x1() {
        return f39741k4;
    }
}
