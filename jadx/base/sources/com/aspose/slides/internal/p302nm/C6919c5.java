package com.aspose.slides.internal.p302nm;

import com.aspose.slides.C22216OooOooO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6919c5 {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Integer, Integer> f18856k4;

    static {
        Dictionary<Integer, Integer> dictionary = new Dictionary<>();
        f18856k4 = dictionary;
        Integer numOooO00o = C22216OooOooO.OooO00o(6, dictionary, 1, 2);
        dictionary.addItem(numOooO00o, 5);
        dictionary.addItem(5, numOooO00o);
        dictionary.addItem(3, 3);
        dictionary.addItem(4, 4);
    }

    /* JADX INFO: renamed from: k4 */
    private static C3982jd m27119k4(C3977ck c3977ck) {
        C3982jd[] c3982jdArrM15697k4 = C3982jd.m15697k4();
        for (int i = 0; i < c3982jdArrM15697k4.length; i++) {
            if (C14047bz.m66535k4(c3982jdArrM15697k4[i].m15698du(), c3977ck.m15685k4())) {
                return c3982jdArrM15697k4[i];
            }
        }
        throw new ArgumentException(C14113y2.m67407k4("Cannot find a codec for ", c3977ck, "."));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27120k4(AbstractC12002ck abstractC12002ck, AbstractC3150x6 abstractC3150x6, int i) {
        C3982jd c3982jdM27119k4 = m27119k4(C3977ck.m15678dy());
        C3986m9 c3986m9 = new C3986m9();
        c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10783du, i);
        try {
            abstractC12002ck.m56334k4(abstractC3150x6, c3982jdM27119k4, c3986m9);
        } catch (RuntimeException unused) {
            abstractC3150x6.setPosition(0L);
            C12009k4 c12009k4 = new C12009k4(abstractC12002ck);
            try {
                c12009k4.m56334k4(abstractC3150x6, c3982jdM27119k4, c3986m9);
            } finally {
                c12009k4.dispose();
            }
        }
    }
}
