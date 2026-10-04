package com.aspose.slides.internal.p339pk;

import com.aspose.slides.OooO00o;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.internal.p085dk.C3170du;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9457m9 implements InterfaceC9461x1 {

    /* JADX INFO: renamed from: c5 */
    private int f34403c5;

    /* JADX INFO: renamed from: k4 */
    private int f34408k4;

    /* JADX INFO: renamed from: kk */
    private int f34409kk = 0;

    /* JADX INFO: renamed from: to */
    private int f34411to = 0;

    /* JADX INFO: renamed from: du */
    private int f34404du = 0;

    /* JADX INFO: renamed from: x1 */
    private int f34412x1 = 0;

    /* JADX INFO: renamed from: h4 */
    private boolean f34406h4 = false;

    /* JADX INFO: renamed from: m9 */
    private boolean f34410m9 = false;

    /* JADX INFO: renamed from: dy */
    private boolean f34405dy = false;

    /* JADX INFO: renamed from: jd */
    private String f34407jd = "Microsoft Sans Serif";

    /* JADX INFO: renamed from: c5 */
    private float m46376c5() {
        if (this.f34409kk != 0) {
            return C14116yg.m67482k4(r0);
        }
        return 12.0f;
    }

    /* JADX INFO: renamed from: dy */
    private int m46377dy() {
        int i = this.f34412x1;
        if (i != 0) {
            return i;
        }
        if (this.f34404du >= 700) {
            this.f34412x1 = i | 1;
        }
        if (this.f34406h4) {
            this.f34412x1 |= 2;
        }
        if (this.f34410m9) {
            this.f34412x1 |= 4;
        }
        if (this.f34405dy) {
            this.f34412x1 |= 8;
        }
        return this.f34412x1;
    }

    /* JADX INFO: renamed from: jd */
    private void m46378jd() {
        if (C14113y2.m67448x1(this.f34407jd, "@")) {
            this.f34409kk = OooO00o.OooO00o(this.f34409kk, 0.8d, 14);
            String str = this.f34407jd;
            this.f34407jd = OooO0OO.OooO00o(1, 1, str, str);
        }
    }

    /* JADX INFO: renamed from: du */
    public final float m46379du() {
        return this.f34411to / 10.0f;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m46380h4() {
        return this.f34407jd;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final int mo46244k4() {
        return 6;
    }

    /* JADX INFO: renamed from: kk */
    public final C5659x1 m46384kk() {
        return C9763ck.m48030to().m48332k4(this.f34407jd, m46376c5(), m46377dy(), "Microsoft Sans Serif");
    }

    /* JADX INFO: renamed from: m9 */
    public final int m46385m9() {
        return this.f34403c5;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6747ar m46386to() {
        return C12555c5.m58552k4(C3170du.m13550k4(m46385m9(), 1252));
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: x1 */
    public final int mo46249x1() {
        return this.f34408k4;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final void mo46246k4(int i) {
        this.f34408k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46381k4(C9456ks c9456ks) {
        this.f34408k4 = c9456ks.m13386x6();
        this.f34409kk = c9456ks.m13386x6();
        c9456ks.m13386x6();
        this.f34411to = c9456ks.m13386x6();
        c9456ks.m13386x6();
        this.f34404du = c9456ks.m13386x6();
        this.f34406h4 = c9456ks.m13383up();
        this.f34410m9 = c9456ks.m13383up();
        this.f34405dy = c9456ks.m13383up();
        this.f34403c5 = c9456ks.m13387yj() & 255;
        c9456ks.m13387yj();
        c9456ks.m13387yj();
        c9456ks.m13387yj();
        c9456ks.m13387yj();
        this.f34407jd = C11240k4.m54221x1(c9456ks.m46370kk(32));
        m46378jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46382k4(C9458rv c9458rv) {
        this.f34409kk = c9458rv.m13381rv();
        c9458rv.m13381rv();
        this.f34411to = c9458rv.m13381rv();
        c9458rv.m13381rv();
        this.f34404du = c9458rv.m13381rv();
        this.f34406h4 = c9458rv.m13383up();
        this.f34410m9 = c9458rv.m13383up();
        this.f34405dy = c9458rv.m13383up();
        this.f34403c5 = c9458rv.m13387yj() & 255;
        c9458rv.m13387yj();
        c9458rv.m13387yj();
        c9458rv.m13387yj();
        c9458rv.m13387yj();
        this.f34407jd = C11240k4.m54221x1(c9458rv.m46391k4(32, m46386to()));
        m46378jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46383k4(String str) {
        this.f34407jd = str;
    }
}
