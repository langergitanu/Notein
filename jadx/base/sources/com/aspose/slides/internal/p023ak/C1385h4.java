package com.aspose.slides.internal.p023ak;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.C3513ck;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.AbstractC10778k4;
import com.aspose.slides.internal.p409sv.AbstractC10779kk;
import com.aspose.slides.internal.p409sv.C10768c5;
import com.aspose.slides.internal.p409sv.C10775h4;
import com.aspose.slides.internal.p409sv.C10776ix;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ak.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1385h4 {

    /* JADX INFO: renamed from: du */
    private int f6012du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3511c5 f6013k4;

    /* JADX INFO: renamed from: kk */
    private int f6014kk;

    /* JADX INFO: renamed from: to */
    private int f6015to;

    /* JADX INFO: renamed from: x1 */
    private int f6016x1;

    public C1385h4(AbstractC3511c5 abstractC3511c5, int i, int i2) {
        this(abstractC3511c5, i, i, i2, -1);
    }

    public boolean equals(Object obj) {
        if (!C7019kk.m27469x1(obj, C1385h4.class)) {
            return false;
        }
        C1385h4 c1385h4 = (C1385h4) obj;
        return c1385h4.m8217k4() == this.f6013k4 && c1385h4.m8221x1() == this.f6014kk && c1385h4.m8219kk() == this.f6015to;
    }

    public int hashCode() {
        AbstractC3511c5 abstractC3511c5 = this.f6013k4;
        int iHashCode = abstractC3511c5 != null ? abstractC3511c5.hashCode() : 0;
        int i = (this.f6014kk ^ iHashCode) + (iHashCode << 19);
        return (this.f6015to ^ i) + (i << 11);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3511c5 m8217k4() {
        return this.f6013k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m8219kk() {
        return this.f6015to;
    }

    /* JADX INFO: renamed from: to */
    public final void m8220to() {
        if (C7019kk.m27469x1(this.f6013k4, C3513ck.class)) {
            C3513ck c3513ck = (C3513ck) this.f6013k4;
            int i = this.f6012du;
            int i2 = this.f6014kk;
            int i3 = this.f6016x1;
            c3513ck.m14146k4(i, i2 - i3, this.f6015to - i3);
            return;
        }
        if (C7019kk.m27469x1(this.f6013k4, C10768c5.class)) {
            ((C10768c5) this.f6013k4).m14327to(this.f6012du);
            return;
        }
        if (C7019kk.m27469x1(this.f6013k4, AbstractC10779kk.class)) {
            ((AbstractC10779kk) this.f6013k4).m14327to(this.f6012du);
        } else if (C7019kk.m27469x1(this.f6013k4, AbstractC10778k4.class)) {
            ((AbstractC10778k4) this.f6013k4).m14327to(this.f6012du);
        } else if (C7019kk.m27469x1(this.f6013k4, C10776ix.class)) {
            ((C10776ix) this.f6013k4).m14327to(this.f6012du);
        }
    }

    public final String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26780k4(C7019kk.m27469x1(this.f6013k4, C3513ck.class) ? 'T' : C7019kk.m27469x1(this.f6013k4, C10768c5.class) ? 'C' : C7019kk.m27469x1(this.f6013k4, C10775h4.class) ? 'B' : C7019kk.m27469x1(this.f6013k4, AbstractC10779kk.class) ? '#' : C7019kk.m27469x1(this.f6013k4, AbstractC10778k4.class) ? 'G' : C7019kk.m27469x1(this.f6013k4, C10776ix.class) ? 'L' : '?');
        c6765kp.m26792k4(C14113y2.m67408k4("[", C14057f9.m66591x1(this.f6014kk), ",", C14057f9.m66591x1(this.f6015to), "][", C14057f9.m66591x1(this.f6016x1), "](", C14057f9.m66591x1(this.f6012du), ")"));
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8221x1() {
        return this.f6014kk;
    }

    public C1385h4(AbstractC3511c5 abstractC3511c5, int i, int i2, int i3, int i4) {
        this.f6013k4 = abstractC3511c5;
        this.f6016x1 = i;
        this.f6014kk = i2;
        this.f6015to = i3;
        this.f6012du = i4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8218k4(int i) {
        this.f6012du = i;
    }
}
