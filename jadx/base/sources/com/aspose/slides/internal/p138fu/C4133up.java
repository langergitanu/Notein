package com.aspose.slides.internal.p138fu;

import com.aspose.slides.C22216OooOooO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p302nm.C6926m9;
import com.aspose.slides.internal.p302nm.C6928x1;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.up */
/* JADX INFO: loaded from: classes.dex */
public class C4133up implements IDisposable {

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<Integer, Integer> f11308x1;

    /* JADX INFO: renamed from: du */
    private C3986m9 f11309du;

    /* JADX INFO: renamed from: h4 */
    private boolean f11310h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f11311k4 = false;

    /* JADX INFO: renamed from: kk */
    private int f11312kk;

    /* JADX INFO: renamed from: to */
    private AbstractC12002ck f11313to;

    static {
        Dictionary<Integer, Integer> dictionary = new Dictionary<>();
        f11308x1 = dictionary;
        Integer numOooO00o = C22216OooOooO.OooO00o(6, dictionary, 1, 2);
        dictionary.addItem(numOooO00o, 5);
        dictionary.addItem(5, numOooO00o);
        dictionary.addItem(3, 3);
        dictionary.addItem(4, 4);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m16577k4(int i) {
        Integer[] numArr = {0};
        f11308x1.tryGetValue(Integer.valueOf(i), numArr);
        return numArr[0].intValue();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m16581k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    private static C3986m9 m16578k4(int i, boolean z) {
        C3981h4 c3981h4 = new C3981h4(C3978du.f10788kk, m16577k4(i));
        if (!z) {
            C3986m9 c3986m9 = new C3986m9();
            c3986m9.m15744k4()[0] = c3981h4;
            return c3986m9;
        }
        C3986m9 c3986m92 = new C3986m9(2);
        c3986m92.m15744k4()[0] = new C3981h4(C3978du.f10789m9, 18L);
        c3986m92.m15744k4()[1] = c3981h4;
        return c3986m92;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12009k4 m16579k4(C12009k4 c12009k4, int i) {
        return ((i == 2 || i == 3 || i == 4) && c12009k4.mo15753jd() != 196865) ? new C6928x1().m27194x1(c12009k4) : c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16580k4(C12009k4 c12009k4, AbstractC3150x6 abstractC3150x6, int i, boolean z) {
        this.f11312kk = i;
        this.f11313to = m16579k4(c12009k4, i);
        C3982jd c3982jdM27185k4 = C6926m9.m27185k4(C3977ck.m15676ck());
        C3986m9 c3986m9M16578k4 = m16578k4(i, z);
        this.f11309du = c3986m9M16578k4;
        this.f11313to.m56334k4(abstractC3150x6, c3982jdM27185k4, c3986m9M16578k4);
        this.f11310h4 = this.f11313to != c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16581k4(boolean z) {
        AbstractC12002ck abstractC12002ck;
        if (this.f11311k4) {
            return;
        }
        if (this.f11310h4 && (abstractC12002ck = this.f11313to) != null) {
            abstractC12002ck.dispose();
            this.f11313to = null;
        }
        this.f11311k4 = true;
    }
}
