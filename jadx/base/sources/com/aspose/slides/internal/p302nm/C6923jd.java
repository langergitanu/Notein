package com.aspose.slides.internal.p302nm;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p138fu.C4124fa;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6923jd {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC3150x6 m27136k4() {
        return C4124fa.m16496k4("/Aspose/Foundation/Resources/NoImage.png");
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m27138x1() {
        AbstractC3150x6 abstractC3150x6M27136k4 = m27136k4();
        try {
            return C12565ks.m58632x1(abstractC3150x6M27136k4);
        } finally {
            if (abstractC3150x6M27136k4 != null) {
                abstractC3150x6M27136k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m27137k4(byte[] bArr, C12007ix c12007ix) {
        AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(new C3152yj(bArr));
        try {
            C4230to c4230to = abstractC12536x1M58363k4.mo13625x1() == 1 ? new C4230to(C12003du.f40505to.Clone(), new C12023wl(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13))) : new C4230to(C12003du.f40505to.Clone());
            c4230to.m17053k4(new C14093tq<>(0));
            c4230to.m17060x1(new C14093tq<>(0));
            c4230to.m17055kk(new C14093tq<>(3));
            c4230to.m17059to(new C14093tq<>(0));
            c4230to.m17046du(new C14093tq<>(3));
            c4230to.m17049h4(new C14093tq<>(3));
            c4230to.m17057m9(new C14093tq<>(4));
            C12009k4 c12009k4Mo17028k4 = AbstractC4229kk.m17035k4(abstractC12536x1M58363k4, c4230to).mo17028k4(c12007ix.m56550c5() * 4.0f, c12007ix.m56575x1() * 4.0f);
            try {
                C3152yj c3152yj = new C3152yj();
                try {
                    c12009k4Mo17028k4.m56333k4(c3152yj, C3977ck.m15681jd());
                    c3152yj.setPosition(0L);
                    int length = (int) c3152yj.getLength();
                    byte[] bArr2 = new byte[length];
                    c3152yj.read(bArr2, 0, length);
                    c3152yj.setLength(0L);
                    c12009k4Mo17028k4.dispose();
                    abstractC12536x1M58363k4.dispose();
                    return bArr2;
                } finally {
                    c3152yj.dispose();
                }
            } catch (Throwable th) {
                if (c12009k4Mo17028k4 != null) {
                    c12009k4Mo17028k4.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC12536x1M58363k4 != null) {
                abstractC12536x1M58363k4.dispose();
            }
            throw th2;
        }
    }
}
