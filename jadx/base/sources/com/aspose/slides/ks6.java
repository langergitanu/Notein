package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class ks6 implements InterfaceC14374r4 {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f45853to = new C7017h4("image/jpeg", "image/emf", "image/bmp", "image/png", "image/wmf", "image/gif");

    /* JADX INFO: renamed from: k4 */
    private String f45854k4;

    /* JADX INFO: renamed from: kk */
    private int f45855kk;

    /* JADX INFO: renamed from: x1 */
    private String f45856x1;

    public ks6(String str) {
        this(str, "Images");
    }

    /* JADX INFO: renamed from: du */
    private String m64135du() {
        String strM67402k4 = C14113y2.m67402k4("{0}_{1}.png", "Image", Integer.valueOf(m64142to()));
        m64138k4(m64142to() + 1);
        return strM67402k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3977ck m64136k4(String str) {
        C3977ck c3977ckM15678dy = C3977ck.m15678dy();
        int iM27428k4 = f45853to.m27428k4(str);
        return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 4 ? iM27428k4 != 5 ? c3977ckM15678dy : C3977ck.m15680h4() : C3977ck.m15679fa() : C3977ck.m15681jd() : C3977ck.m15682kk() : C3977ck.m15684to() : C3977ck.m15678dy();
    }

    /* JADX INFO: renamed from: kk */
    private String m64140kk() {
        return this.f45856x1;
    }

    /* JADX INFO: renamed from: to */
    private int m64142to() {
        return this.f45855kk;
    }

    /* JADX INFO: renamed from: x1 */
    private String m64144x1() {
        return this.f45854k4;
    }

    public ks6(String str, String str2) {
        m64145x1(C14113y2.m67402k4("./{0}/", str2));
        m64141kk(C3141rv.m13412x1(str, m64144x1()));
        C3142to.m13416k4(m64140kk());
        m64138k4(1);
    }

    /* JADX INFO: renamed from: kk */
    private void m64141kk(String str) {
        this.f45856x1 = str;
    }

    /* JADX INFO: renamed from: to */
    private String m64143to(String str) {
        String strM67402k4 = C14113y2.m67402k4("{0}_{1}.{2}", "Image", Integer.valueOf(m64142to()), str);
        m64138k4(m64142to() + 1);
        return strM67402k4;
    }

    /* JADX INFO: renamed from: x1 */
    private void m64145x1(String str) {
        this.f45854k4 = str;
    }

    @Override // com.aspose.slides.InterfaceC14374r4
    /* JADX INFO: renamed from: k4 */
    public final String mo64146k4() {
        return m64144x1();
    }

    @Override // com.aspose.slides.InterfaceC14374r4
    /* JADX INFO: renamed from: k4 */
    public final String mo64147k4(IPPImage iPPImage) throws Throwable {
        C3977ck c3977ckM64136k4 = m64136k4(iPPImage.getContentType());
        String strM64137k4 = m64137k4(c3977ckM64136k4);
        m64139k4(strM64137k4, ((PPImage) iPPImage).m2131k4(), c3977ckM64136k4);
        return strM64137k4;
    }

    @Override // com.aspose.slides.InterfaceC14374r4
    /* JADX INFO: renamed from: k4 */
    public final String mo64148k4(IShape iShape) {
        String strM64143to = m64143to("svg");
        C3130fa c3130faM13349h4 = C3131h4.m13349h4(C14113y2.m67408k4(m64140kk(), strM64143to));
        try {
            ((Shape) iShape).m2589x1(c3130faM13349h4);
            return strM64143to;
        } finally {
            if (c3130faM13349h4 != null) {
                c3130faM13349h4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m64137k4(C3977ck c3977ck) {
        return m64143to(C14113y2.m67368h4(c3977ck.toString()));
    }

    @Override // com.aspose.slides.InterfaceC14374r4
    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public final String mo64149k4(AbstractC12002ck abstractC12002ck) throws Throwable {
        C3977ck c3977ckM15681jd = C3977ck.m15681jd();
        String strM64135du = m64135du();
        m64139k4(strM64135du, abstractC12002ck, c3977ckM15681jd);
        return strM64135du;
    }

    /* JADX INFO: renamed from: k4 */
    private void m64138k4(int i) {
        this.f45855kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m64139k4(String str, AbstractC12002ck abstractC12002ck, C3977ck c3977ck) throws Throwable {
        abstractC12002ck.m56340k4(C14113y2.m67408k4(m64140kk(), str), c3977ck);
        m64138k4(m64142to() + 1);
    }
}
