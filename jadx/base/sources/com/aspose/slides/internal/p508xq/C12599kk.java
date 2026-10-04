package com.aspose.slides.internal.p508xq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p085dk.C3179x1;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12599kk extends AbstractC12594du {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f42146k4 = new C7017h4("xmlData", "binaryData");

    public C12599kk() {
    }

    /* JADX INFO: renamed from: k4 */
    private static C12596h4 m58810k4(C3179x1 c3179x1) {
        String strM13611k4 = c3179x1.m13611k4("name", C14113y2.f47374k4);
        String strM13611k42 = c3179x1.m13611k4("contentType", C14113y2.f47374k4);
        c3179x1.m13611k4("compression", "store");
        C12596h4 c12596h4 = new C12596h4(strM13611k4, strM13611k42);
        c3179x1.m13613k4("part");
        int iM27428k4 = f42146k4.m27428k4(c3179x1.m13609du());
        if (iM27428k4 == 0) {
            C3123ar c3123ar = new C3123ar(c12596h4.m58803to());
            c3179x1.m13613k4("xmlData");
            c3123ar.mo13304k4(c3179x1.m13616to());
            c3123ar.mo13308kk();
        } else if (iM27428k4 == 1) {
            byte[] bArrM66934jd = C14080ne.m66934jd(c3179x1.m13615kk());
            c12596h4.m58803to().write(bArrM66934jd, 0, bArrM66934jd.length);
        }
        c12596h4.m58803to().setPosition(0L);
        return c12596h4;
    }

    /* JADX INFO: renamed from: kk */
    private void m58811kk(AbstractC3150x6 abstractC3150x6) {
        C3179x1 c3179x1 = new C3179x1(abstractC3150x6);
        while (c3179x1.m13613k4("package")) {
            if ("part".equals(c3179x1.m13609du())) {
                m58793x1().m58814k4(m58810k4(c3179x1));
            } else {
                c3179x1.m13612k4();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m58812x1(AbstractC3150x6 abstractC3150x6) {
        m58811kk(abstractC3150x6);
        m58789k4();
    }

    public C12599kk(AbstractC3150x6 abstractC3150x6) {
        m58812x1(abstractC3150x6);
    }

    @Override // com.aspose.slides.internal.p508xq.AbstractC12594du
    /* JADX INFO: renamed from: k4 */
    public void mo58790k4(AbstractC3150x6 abstractC3150x6) {
        C3175k4 c3175k4 = new C3175k4(abstractC3150x6, true);
        c3175k4.m13581k4().mo65747x1(true);
        c3175k4.m13581k4().mo21907k4("mso-application", "progid=\"PowerPoint.Show\"");
        c3175k4.m13593x1("pkg:package");
        c3175k4.m13590kk("xmlns:pkg", "http://schemas.microsoft.com/office/2006/xmlPackage");
        IGenericEnumerator<C12596h4> it = m58793x1().iterator();
        while (it.hasNext()) {
            try {
                C12596h4 next = it.next();
                next.m58803to().setPosition(0L);
                c3175k4.m13593x1("pkg:part");
                c3175k4.m13590kk("pkg:name", next.m58800k4());
                c3175k4.m13590kk("pkg:contentType", next.m58802kk());
                if (C14113y2.m67424kk(next.m58802kk(), "xml")) {
                    String strM57987kk = new C12380dy("<\\?.*\\?>").m57987kk(new C3148wl(next.m58803to()).mo13427dy(), C14113y2.f47374k4);
                    c3175k4.m13593x1("pkg:xmlData");
                    c3175k4.m13589kk(strM57987kk);
                } else {
                    c3175k4.m13590kk("pkg:compression", "store");
                    c3175k4.m13593x1("pkg:binaryData");
                    c3175k4.m13583k4(next.m58803to());
                }
                c3175k4.m13588kk();
                c3175k4.m13588kk();
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3175k4.m13592x1();
    }
}
