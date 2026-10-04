package com.aspose.slides.internal.p339pk;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9447c5 implements InterfaceC9461x1 {

    /* JADX INFO: renamed from: h4 */
    private byte[] f34344h4;

    /* JADX INFO: renamed from: to */
    private int f34348to;

    /* JADX INFO: renamed from: k4 */
    private int f34345k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private float f34349x1 = 1.0f;

    /* JADX INFO: renamed from: kk */
    private C5656k4 f34346kk = C5656k4.f15518dy;

    /* JADX INFO: renamed from: du */
    private int f34343du = 0;

    /* JADX INFO: renamed from: m9 */
    private int f34347m9 = 1;

    /* JADX INFO: renamed from: kk */
    private void m46241kk() {
        if ((this.f34345k4 & 15) == 5) {
            this.f34347m9 = 0;
        }
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final int mo46244k4() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: x1 */
    public final int mo46249x1() {
        return this.f34348to;
    }

    /* JADX INFO: renamed from: kk */
    private static void m46242kk(C4320jd c4320jd, int i) {
        int i2;
        if (i == 0) {
            i2 = 2;
        } else if (i == 4096) {
            i2 = 1;
        } else {
            if (i != 8192) {
                throw new InvalidOperationException("Unknown pen join style.");
            }
            i2 = 0;
        }
        c4320jd.m17374to(i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4320jd m46245k4(C5656k4 c5656k4) {
        int i = this.f34347m9;
        if (i == 0) {
            return null;
        }
        C4320jd c4320jd = i != 2 ? i != 3 ? new C4320jd(this.f34346kk, this.f34349x1) : new C4320jd(new C4327up(this.f34344h4, 0), this.f34349x1) : new C4320jd(new C4316du(this.f34343du, this.f34346kk, c5656k4), this.f34349x1);
        m46240k4(c4320jd, this.f34345k4 & 15);
        m46243x1(c4320jd, this.f34345k4 & 3840);
        m46242kk(c4320jd, this.f34345k4 & 61440);
        return c4320jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46250x1(int i) {
        this.f34345k4 = i;
        m46241kk();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m46243x1(C4320jd c4320jd, int i) {
        int i2;
        if (i == 0) {
            i2 = 2;
        } else if (i == 256) {
            i2 = 1;
        } else {
            if (i != 512) {
                throw new InvalidOperationException("Unknown pen end cap style.");
            }
            i2 = 0;
        }
        c4320jd.m17377x1(i2);
        c4320jd.m17371kk(i2);
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final void mo46246k4(int i) {
        this.f34348to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m46240k4(C4320jd c4320jd, int i) {
        if (i == 0) {
            c4320jd.m17363h4(0);
            return;
        }
        if (i == 1) {
            c4320jd.m17363h4(1);
            return;
        }
        if (i == 2) {
            c4320jd.m17363h4(2);
        } else if (i == 3) {
            c4320jd.m17363h4(3);
        } else {
            if (i != 4) {
                return;
            }
            c4320jd.m17363h4(4);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46251x1(C5656k4 c5656k4) {
        this.f34346kk = c5656k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46247k4(C9456ks c9456ks) {
        this.f34348to = c9456ks.m13386x6();
        this.f34345k4 = c9456ks.m13386x6();
        this.f34349x1 = C14116yg.m67483k4(c9456ks.m13386x6(), 1);
        c9456ks.m13386x6();
        this.f34346kk = c9456ks.m46361du();
        m46241kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46252x1(C9456ks c9456ks) {
        this.f34348to = c9456ks.m13386x6();
        c9456ks.m13386x6();
        int iM13386x6 = c9456ks.m13386x6();
        c9456ks.m13386x6();
        int iM13386x62 = c9456ks.m13386x6();
        this.f34345k4 = (int) c9456ks.m13384uz();
        this.f34349x1 = C14116yg.m67483k4(c9456ks.m13386x6(), 1);
        int iM13384uz = (int) c9456ks.m13384uz();
        if (iM13384uz == 0 || iM13384uz == 2) {
            this.f34346kk = c9456ks.m46361du();
        } else {
            c9456ks.m13386x6();
        }
        this.f34343du = c9456ks.m13386x6();
        if ((iM13384uz & 2) == 2) {
            this.f34347m9 = 2;
        }
        c9456ks.m46367k4();
        if (iM13384uz == 6) {
            this.f34347m9 = 3;
            c9456ks.m13386x6();
            this.f34344h4 = C12549du.m58504k4(c9456ks, iM13386x6, iM13386x62);
        }
        m46241kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46248k4(C9458rv c9458rv, int i) {
        this.f34345k4 = c9458rv.m13381rv();
        short sM13381rv = c9458rv.m13381rv();
        if (sM13381rv != 0 || i == Integer.MIN_VALUE || i == Integer.MAX_VALUE) {
            i = C14116yg.m67489k4(sM13381rv, (short) 1);
        }
        this.f34349x1 = i;
        c9458rv.m13381rv();
        this.f34346kk = c9458rv.m46389h4();
        m46241kk();
    }
}
