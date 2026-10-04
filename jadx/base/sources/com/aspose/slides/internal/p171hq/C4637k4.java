package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4637k4 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private byte f12923k4;

    /* JADX INFO: renamed from: kk */
    private byte f12924kk;

    /* JADX INFO: renamed from: to */
    private byte f12925to;

    /* JADX INFO: renamed from: x1 */
    private byte f12926x1;

    public C4637k4() {
    }

    /* JADX INFO: renamed from: du */
    public final C12003du m19174du() {
        return C12003du.m56398k4(m19175k4() & 255, m19179to() & 255, m19177kk() & 255, m19181x1() & 255);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4637k4.class) && m19173k4((C4637k4) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 4;
    }

    public int hashCode() {
        return (((((C14098up.m67317k4(this.f12923k4) * 397) ^ C14098up.m67317k4(this.f12926x1)) * 397) ^ C14098up.m67317k4(this.f12924kk)) * 397) ^ C14098up.m67317k4(this.f12925to);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m19175k4() {
        return this.f12923k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m19177kk() {
        return this.f12924kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m19179to() {
        return this.f12925to;
    }

    public String toString() {
        return C14113y2.m67402k4("Alpha: {0}, Blue: {1}, Green: {2}, Red: {3}", Byte.valueOf(this.f12923k4), Byte.valueOf(this.f12926x1), Byte.valueOf(this.f12924kk), Byte.valueOf(this.f12925to));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m19181x1() {
        return this.f12926x1;
    }

    public C4637k4(C12003du c12003du) {
        this.f12923k4 = c12003du.m56501c5();
        this.f12926x1 = c12003du.m56505fa();
        this.f12924kk = c12003du.m56502ck();
        this.f12925to = c12003du.m56507jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19176k4(byte b) {
        this.f12923k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19178kk(byte b) {
        this.f12924kk = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m19180to(byte b) {
        this.f12925to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19182x1(byte b) {
        this.f12926x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19173k4(C4637k4 c4637k4) {
        return this.f12923k4 == c4637k4.f12923k4 && this.f12926x1 == c4637k4.f12926x1 && this.f12924kk == c4637k4.f12924kk && this.f12925to == c4637k4.f12925to;
    }
}
