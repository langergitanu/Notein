package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.k4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13387k4 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private byte f44776k4;

    /* JADX INFO: renamed from: kk */
    private byte f44777kk;

    /* JADX INFO: renamed from: to */
    private byte f44778to;

    /* JADX INFO: renamed from: x1 */
    private byte f44779x1;

    public C13387k4() {
    }

    /* JADX INFO: renamed from: du */
    public final C12003du m62172du() {
        return C12003du.m56398k4(m62173k4() & 255, m62177to() & 255, m62175kk() & 255, m62179x1() & 255);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13387k4.class) && m62171k4((C13387k4) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 4;
    }

    public int hashCode() {
        return (((((C14098up.m67317k4(this.f44776k4) * 397) ^ C14098up.m67317k4(this.f44779x1)) * 397) ^ C14098up.m67317k4(this.f44777kk)) * 397) ^ C14098up.m67317k4(this.f44778to);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m62173k4() {
        return this.f44776k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m62175kk() {
        return this.f44777kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m62177to() {
        return this.f44778to;
    }

    public String toString() {
        return C14113y2.m67402k4("Alpha: {0}, Blue: {1}, Green: {2}, Red: {3}", Byte.valueOf(this.f44776k4), Byte.valueOf(this.f44779x1), Byte.valueOf(this.f44777kk), Byte.valueOf(this.f44778to));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m62179x1() {
        return this.f44779x1;
    }

    public C13387k4(C12003du c12003du) {
        this.f44776k4 = c12003du.m56501c5();
        this.f44779x1 = c12003du.m56505fa();
        this.f44777kk = c12003du.m56502ck();
        this.f44778to = c12003du.m56507jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62174k4(byte b) {
        this.f44776k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62176kk(byte b) {
        this.f44777kk = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m62178to(byte b) {
        this.f44778to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62180x1(byte b) {
        this.f44779x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62171k4(C13387k4 c13387k4) {
        return this.f44776k4 == c13387k4.f44776k4 && this.f44779x1 == c13387k4.f44779x1 && this.f44777kk == c13387k4.f44777kk && this.f44778to == c13387k4.f44778to;
    }
}
