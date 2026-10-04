package com.aspose.slides.internal.p039be;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.be.x1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1689x1 extends AbstractC10914up {

    /* JADX INFO: renamed from: du */
    private int f6403du;

    /* JADX INFO: renamed from: h4 */
    private String f6404h4;

    /* JADX INFO: renamed from: k4 */
    protected C9790ts f6405k4;

    /* JADX INFO: renamed from: kk */
    protected boolean f6406kk;

    /* JADX INFO: renamed from: to */
    private int f6407to;

    public AbstractC1689x1(C10898dy c10898dy, int i, C9790ts c9790ts, int i2) {
        super(c10898dy);
        this.f6407to = i;
        this.f6405k4 = c9790ts;
        this.f6403du = i2;
    }

    /* JADX INFO: renamed from: du */
    public final int m9117du() {
        return -m9121k4(this.f6405k4.m48177ck());
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: fa */
    public int mo9118fa() {
        return 1;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m9119h4() {
        return m9121k4(this.f6405k4.m48191jd());
    }

    /* JADX INFO: renamed from: ix */
    public final int m9120ix() {
        return this.f6403du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m9121k4(int i) {
        return OooO.OooO00o((i * 1000.0f) / this.f6405k4.m48175c5(), 14);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract byte[] mo9089k4();

    /* JADX INFO: renamed from: kk */
    public final boolean m9123kk() {
        return (this.f6407to & 1) != 0 && (this.f6405k4.m48183dy() & 1) == 0;
    }

    /* JADX INFO: renamed from: ks */
    public final int m9124ks() {
        return m9121k4(this.f6405k4.m48189ix());
    }

    /* JADX INFO: renamed from: ne */
    public final float m9125ne() {
        return this.f6405k4.m48236uz();
    }

    /* JADX INFO: renamed from: rv */
    public final int m9126rv() {
        return ((this.f6405k4.m48183dy() & 2) != 0 ? 64 : 0) | 32 | ((this.f6405k4.m48183dy() & 1) != 0 ? 262144 : 0);
    }

    /* JADX INFO: renamed from: to */
    public final String m9127to() {
        if (this.f6404h4 == null) {
            this.f6404h4 = m9131wl();
        }
        return this.f6404h4;
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m9128u4() {
        return this.f6406kk;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: up */
    public String mo9129up() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("F");
        String strM67402k4 = C14113y2.m67402k4("{0:D5}", Integer.valueOf(m52567dy()));
        for (int i = 0; i < strM67402k4.length(); i++) {
            c6765kpOooO00o.m26780k4((char) (strM67402k4.charAt(i) + 17));
        }
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: uz */
    public final String m9130uz() {
        String strM48180du = this.f6405k4.m48180du();
        return strM48180du == null ? C14113y2.m67401k4(this.f6405k4.m48228to(), " ", "#20") : strM48180du;
    }

    /* JADX INFO: renamed from: wl */
    public String m9131wl() {
        String str;
        C6765kp c6765kp = new C6765kp();
        if (!m9128u4()) {
            c6765kp.m26792k4(m52566ck());
            c6765kp.m26792k4("+");
        }
        c6765kp.m26792k4(m9130uz());
        if (m9123kk() && m9132x1()) {
            str = ",BoldItalic";
        } else {
            if (!m9123kk()) {
                if (m9132x1()) {
                    str = ",Italic";
                }
                return c6765kp.m26794k4(" ", C14113y2.f47374k4).toString();
            }
            str = ",Bold";
        }
        c6765kp.m26792k4(str);
        return c6765kp.m26794k4(" ", C14113y2.f47374k4).toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m9132x1() {
        return (this.f6407to & 2) != 0 && (this.f6405k4.m48183dy() & 2) == 0;
    }

    /* JADX INFO: renamed from: x6 */
    public final C12007ix m9133x6() {
        return new C12007ix(m9121k4(this.f6405k4.m48249yj()), m9121k4(this.f6405k4.m48218ks()), m9121k4(this.f6405k4.m48226rv() - this.f6405k4.m48249yj()), m9121k4(this.f6405k4.m48246x6() - this.f6405k4.m48218ks()));
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC1689x1 m9116k4(C10898dy c10898dy, int i, C9790ts c9790ts, int i2, int i3) {
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            return new C1684jd(c10898dy, i, c9790ts, i2, i3);
        }
        if (i2 == 3) {
            return new C1682dy(c10898dy, i, c9790ts, i2, i3);
        }
        throw new InvalidOperationException("Unexpected font type.");
    }

    /* JADX INFO: renamed from: k4 */
    public void mo9087k4(AbstractC3150x6 abstractC3150x6) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9122k4(boolean z) {
        this.f6406kk = z;
    }
}
