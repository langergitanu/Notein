package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.mp */
/* JADX INFO: loaded from: classes3.dex */
class C13845mp {

    /* JADX INFO: renamed from: k4 */
    private final IExternalResourceResolver f46283k4;

    /* JADX INFO: renamed from: x1 */
    private final C1232hy f46284x1 = C1232hy.f5593k4;

    public C13845mp(IExternalResourceResolver iExternalResourceResolver) {
        this.f46283k4 = iExternalResourceResolver;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 m64934k4(String str) {
        if (this.f46284x1.m7329k4(null, str) != null) {
            return this.f46284x1.m7328k4(str);
        }
        IExternalResourceResolver iExternalResourceResolver = this.f46283k4;
        if (iExternalResourceResolver != null) {
            return ((ExternalResourceResolver) iExternalResourceResolver).getEntityInternal(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public String m64935k4(String str, String str2) {
        IExternalResourceResolver iExternalResourceResolver;
        String strM7329k4 = this.f46284x1.m7329k4(str, str2);
        return (strM7329k4 != null || (iExternalResourceResolver = this.f46283k4) == null) ? strM7329k4 : iExternalResourceResolver.resolveUri(str, str2);
    }
}
