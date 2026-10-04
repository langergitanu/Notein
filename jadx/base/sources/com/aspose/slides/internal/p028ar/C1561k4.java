package com.aspose.slides.internal.p028ar;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p444um.C11449x1;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ar.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1561k4 {

    /* JADX INFO: renamed from: du */
    private int f6065du;

    /* JADX INFO: renamed from: k4 */
    private boolean f6066k4;

    /* JADX INFO: renamed from: kk */
    private boolean f6067kk;

    /* JADX INFO: renamed from: to */
    private int f6068to;

    /* JADX INFO: renamed from: x1 */
    private boolean f6069x1;

    /* JADX INFO: renamed from: k4 */
    public static C1561k4 m8348k4(String str) {
        boolean z;
        int iM66582k4;
        C1561k4 c1561k4 = new C1561k4();
        C11449x1 c11449x1 = new C11449x1(str);
        try {
            int iM48782to = c11449x1.m48782to();
            if (iM48782to == 1) {
                iM48782to = c11449x1.m48782to();
                z = true;
                iM66582k4 = 1;
            } else if (iM48782to == 2) {
                iM48782to = c11449x1.m48782to();
                iM66582k4 = -1;
                z = true;
            } else {
                if (iM48782to == 5) {
                    return m8348k4("2n+1");
                }
                if (iM48782to == 6) {
                    return m8348k4("2n");
                }
                z = false;
                iM66582k4 = 1;
            }
            if (iM48782to == 3) {
                iM66582k4 *= C14057f9.m66582k4(c11449x1.m48780kk());
                iM48782to = c11449x1.m48782to();
                z = true;
            }
            if (iM48782to == -1) {
                c1561k4.f6065du = iM66582k4;
                c1561k4.f6067kk = true;
                return c1561k4;
            }
            if (iM48782to == 4) {
                if (z) {
                    c1561k4.f6068to = iM66582k4;
                    c1561k4.f6066k4 = true;
                }
                c1561k4.f6069x1 = true;
                iM48782to = c11449x1.m48782to();
            }
            if (iM48782to == -1) {
                return c1561k4;
            }
            if (iM48782to == 1) {
                c1561k4.f6067kk = true;
                c11449x1.m48782to();
                c1561k4.f6065du = C14057f9.m66582k4(c11449x1.m48780kk());
            } else if (iM48782to == 2) {
                c1561k4.f6067kk = true;
                c11449x1.m48782to();
                c1561k4.f6065du = -C14057f9.m66582k4(c11449x1.m48780kk());
            }
            return c1561k4;
        } finally {
            c11449x1.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m8349k4() {
        C6765kp c6765kp = new C6765kp();
        if (this.f6066k4) {
            c6765kp.m26805kk(this.f6068to);
        }
        if (this.f6069x1) {
            c6765kp.m26780k4('N');
        }
        if (this.f6067kk) {
            if (this.f6065du >= 0) {
                c6765kp.m26792k4("+");
            }
            c6765kp.m26805kk(this.f6065du);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8350k4(int i) {
        if (!this.f6069x1) {
            return i == this.f6065du;
        }
        boolean z = this.f6066k4;
        if (z && this.f6068to == 0) {
            return this.f6067kk && i == this.f6065du;
        }
        float f = i;
        if (this.f6067kk) {
            f -= this.f6065du;
        }
        if (z) {
            f /= this.f6068to;
        }
        return f >= 0.0f && f - ((float) C7019kk.m27462to(Float.valueOf(f), 13)) == 0.0f;
    }
}
