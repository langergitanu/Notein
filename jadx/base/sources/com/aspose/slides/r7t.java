package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;

/* JADX INFO: loaded from: classes3.dex */
class r7t implements InterfaceC3793to {

    /* JADX INFO: renamed from: k4 */
    private final IExternalResourceResolver f48545k4;

    /* JADX INFO: renamed from: x1 */
    private final String f48546x1;

    public r7t(IExternalResourceResolver iExternalResourceResolver, String str) {
        this.f48545k4 = iExternalResourceResolver;
        this.f48546x1 = str;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5815xk
    /* JADX INFO: renamed from: k4 */
    public final C5801ss mo14413k4(Object obj, C5811wp c5811wp) {
        String strResolveUri;
        AbstractC3150x6 abstractC3150x6FromJava;
        IExternalResourceResolver iExternalResourceResolver = this.f48545k4;
        if (iExternalResourceResolver == null || (strResolveUri = iExternalResourceResolver.resolveUri(this.f48546x1, c5811wp.m23710k4())) == null || (abstractC3150x6FromJava = AbstractC3150x6.fromJava(this.f48545k4.getEntity(strResolveUri))) == null) {
            return null;
        }
        return new C5801ss(m70035k4(abstractC3150x6FromJava));
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m70035k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = new byte[32768];
        C3152yj c3152yj = new C3152yj();
        while (true) {
            try {
                int i = abstractC3150x6.read(bArr, 0, 32768);
                if (i <= 0) {
                    byte[] array = c3152yj.toArray();
                    c3152yj.dispose();
                    return array;
                }
                c3152yj.write(bArr, 0, i);
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
    }
}
