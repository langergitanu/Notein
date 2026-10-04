package com.aspose.slides.internal.p223ka;

import Oooo0o0.C21009OooOooO;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p353q7.C9782qm;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ka.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5659x1 {

    /* JADX INFO: renamed from: du */
    private float f15639du;

    /* JADX INFO: renamed from: dy */
    private float f15640dy;

    /* JADX INFO: renamed from: h4 */
    private float f15641h4;

    /* JADX INFO: renamed from: k4 */
    private C9790ts f15642k4;

    /* JADX INFO: renamed from: kk */
    private int f15643kk;

    /* JADX INFO: renamed from: m9 */
    private int f15644m9;

    /* JADX INFO: renamed from: to */
    private float f15645to;

    /* JADX INFO: renamed from: x1 */
    private float f15646x1;

    public C5659x1(float f, int i, C9790ts c9790ts) {
        this(f, i, c9790ts, 1);
    }

    /* JADX INFO: renamed from: c5 */
    public final float m23111c5() {
        return this.f15645to;
    }

    /* JADX INFO: renamed from: ck */
    public final float m23112ck() {
        return this.f15645to + this.f15639du;
    }

    /* JADX INFO: renamed from: du */
    public final int m23113du() {
        return this.f15644m9;
    }

    /* JADX INFO: renamed from: dy */
    public final float m23114dy() {
        return this.f15646x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m23115h4() {
        return this.f15640dy;
    }

    /* JADX INFO: renamed from: jd */
    public final float m23116jd() {
        return this.f15639du;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m23117k4(char c) {
        if (this.f15644m9 != 2 || !C14117yj.m67517dy(c)) {
            return this.f15642k4.m48194k4(c, this.f15646x1);
        }
        return ((this.f15642k4.m48194k4(C14117yj.m67541u4(c), this.f15646x1) * 1000.0f) * this.f15640dy) / 1000.0f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m23122kk() {
        return (this.f15643kk & 1) != 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m23123m9() {
        return this.f15642k4.m48202k4();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m23124to() {
        return (this.f15643kk & 2) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m23125x1() {
        return this.f15643kk;
    }

    public C5659x1(float f, int i, C9790ts c9790ts, int i2) {
        if (c9790ts == null) {
            throw new ArgumentNullException("trueTypeFont");
        }
        this.f15642k4 = c9790ts;
        this.f15646x1 = f;
        this.f15643kk = i;
        this.f15645to = c9790ts.m48195k4(c9790ts.m48191jd(), this.f15646x1);
        this.f15639du = this.f15642k4.m48195k4(r1.m48177ck(), this.f15646x1);
        this.f15641h4 = this.f15642k4.m48195k4(r1.m48234up(), this.f15646x1);
        this.f15644m9 = i2;
        if (i2 == 2) {
            float fM48131k4 = C9782qm.m48131k4(this.f15642k4) * 1000;
            float fM48132x1 = C9782qm.m48132x1(this.f15642k4) * 1000;
            this.f15640dy = C21009OooOooO.OooO00o(fM48132x1, 0.1f, fM48132x1, fM48131k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final float m23118k4(String str) {
        return this.f15644m9 == 1 ? this.f15642k4.m48197k4(str, this.f15646x1) : m23119k4(str, 0, str.length());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12015qq m23126x1(String str) {
        return new C12015qq(m23118k4(str), m23112ck());
    }

    /* JADX INFO: renamed from: k4 */
    public final float m23119k4(String str, int i, int i2) {
        float fM48197k4;
        if (this.f15644m9 == 1) {
            return this.f15642k4.m48198k4(str, i, i2, this.f15646x1);
        }
        C5658to c5658to = new C5658to(C14113y2.m67443x1(str, i, i2));
        float f = 0.0f;
        while (true) {
            float f2 = 1000.0f;
            if (!c5658to.hasNext()) {
                return f / 1000.0f;
            }
            if (c5658to.next().m23107k4()) {
                fM48197k4 = this.f15642k4.m48197k4(C14113y2.m67371jd(c5658to.next().m23108x1()), this.f15646x1) * 1000.0f;
                f2 = this.f15640dy;
            } else {
                fM48197k4 = this.f15642k4.m48197k4(c5658to.next().m23108x1(), this.f15646x1);
            }
            f += fM48197k4 * f2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m23120k4() {
        return this.f15642k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23121k4(float f) {
        this.f15646x1 = f;
    }
}
