package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12381h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.e2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2061e2 {

    /* JADX INFO: renamed from: kk */
    private static C12380dy f7114kk = new C12380dy("\\/FontName[^\\/]*?\\/((.)*?)((\\Wdef)|(\\Wreadonly def))", 0);

    /* JADX INFO: renamed from: k4 */
    private AbstractC2011be f7115k4;

    /* JADX INFO: renamed from: x1 */
    private C2033cj f7116x1;

    /* JADX INFO: renamed from: k4 */
    public final C2033cj m10445k4(AbstractC2011be abstractC2011be) {
        try {
            this.f7115k4 = abstractC2011be;
            m10444k4();
            return this.f7116x1;
        } catch (C2096ga e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new C2149jo("Unexpected font parsing exception", e2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m10444k4() {
        String strMo57995kk = C14113y2.f47374k4;
        AbstractC3150x6 abstractC3150x6Mo10245x1 = this.f7115k4.mo10245x1();
        try {
            abstractC3150x6Mo10245x1.setPosition(0L);
            byte[] bArr = new byte[(int) abstractC3150x6Mo10245x1.getLength()];
            abstractC3150x6Mo10245x1.read(bArr, 0, (int) abstractC3150x6Mo10245x1.getLength());
            C12381h4 c12381h4M57986kk = f7114kk.m57986kk(AbstractC6747ar.m26650yj().m26681x1(bArr));
            if (c12381h4M57986kk.m57991k4() > 0) {
                strMo57995kk = c12381h4M57986kk.m57992k4(0).m58004du().m58000k4(1).mo57995kk();
            }
            this.f7116x1 = new C2033cj(strMo57995kk, strMo57995kk, 1, new C2299sz(this.f7115k4));
            AbstractC2011be abstractC2011be = this.f7115k4;
            if (abstractC2011be == null || !abstractC2011be.m10244to()) {
                return;
            }
            abstractC3150x6Mo10245x1.close();
        } catch (Throwable th) {
            AbstractC2011be abstractC2011be2 = this.f7115k4;
            if (abstractC2011be2 != null && abstractC2011be2.m10244to()) {
                abstractC3150x6Mo10245x1.close();
            }
            throw th;
        }
    }
}
