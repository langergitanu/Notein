package com.aspose.slides.internal.p419tg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10934du {

    /* JADX INFO: renamed from: k4 */
    protected String f38027k4;

    /* JADX INFO: renamed from: kk */
    protected C12842x1 f38028kk;

    /* JADX INFO: renamed from: x1 */
    protected boolean f38029x1;

    public C10934du() {
        this.f38029x1 = false;
    }

    /* JADX INFO: renamed from: du */
    public C12842x1 m52721du() {
        if (this.f38028kk == null) {
            mo25218x1();
        }
        return this.f38028kk;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C10934du c10934du = obj instanceof C10934du ? (C10934du) obj : null;
        if (c10934du == null || this.f38029x1 != c10934du.f38029x1 || !C14113y2.m67363du(this.f38027k4, c10934du.f38027k4) || this.f38028kk.m59716kk() != c10934du.f38028kk.m59716kk()) {
            return false;
        }
        for (int i = 0; i < this.f38028kk.m59716kk(); i++) {
            if (this.f38028kk.m59710k4(i) != c10934du.f38028kk.m59710k4(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f38027k4.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25217k4() {
    }

    /* JADX INFO: renamed from: kk */
    public String m52722kk() {
        return this.f38027k4;
    }

    /* JADX INFO: renamed from: to */
    public boolean m52723to() {
        return this.f38029x1;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        int iM59716kk = this.f38028kk.m59716kk() >> 3;
        int iM59716kk2 = this.f38028kk.m59716kk() - (iM59716kk << 3);
        int i = 0;
        for (int i2 = 0; i2 < iM59716kk; i2++) {
            m52720k4(c6765kp, 8, i);
            i += 8;
        }
        m52720k4(c6765kp, iM59716kk2, i);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public void mo25218x1() {
    }

    public C10934du(C10934du c10934du) {
        if (c10934du == null) {
            throw new ArgumentNullException("extension");
        }
        if (c10934du.m52721du() == null || c10934du.m52721du().m59718x1() != 4 || c10934du.m52721du().m59709k4() != 1) {
            throw new ArgumentException(C14113y2.m67402k4("Invalid X.509 extension.", new Object[0]));
        }
        this.f38027k4 = c10934du.m52722kk();
        this.f38029x1 = c10934du.m52723to();
        this.f38028kk = c10934du.m52721du();
        mo25217k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m52720k4(C6765kp c6765kp, int i, int i2) {
        byte[] bArrM59717to = this.f38028kk.m59717to();
        int i3 = 0;
        int i4 = i2;
        for (int i5 = 0; i5 < 8; i5++) {
            if (i5 < i) {
                c6765kp.m26792k4(C14098up.m67321k4(bArrM59717to[i4], "X2", C11697x1.m55250kk()));
                c6765kp.m26792k4(" ");
                i4++;
            } else {
                c6765kp.m26792k4("   ");
            }
        }
        c6765kp.m26792k4("  ");
        while (i3 < i) {
            int i6 = i2 + 1;
            byte b = bArrM59717to[i2];
            if ((b & 255) < 32) {
                c6765kp.m26792k4(".");
            } else {
                c6765kp.m26780k4(C14080ne.m67033x1(Byte.valueOf(b)));
            }
            i3++;
            i2 = i6;
        }
        c6765kp.m26792k4(C14052dq.f47188k4);
    }

    public C10934du(C12842x1 c12842x1) {
        boolean z = false;
        if (c12842x1.m59718x1() != 48 || c12842x1.m59709k4() < 2) {
            throw new ArgumentException(C14113y2.m67402k4("Invalid X.509 extension.", new Object[0]));
        }
        if (c12842x1.m59710k4(0).m59718x1() != 6) {
            throw new ArgumentException(C14113y2.m67402k4("Invalid X.509 extension.", new Object[0]));
        }
        this.f38027k4 = C12828kk.m59652x1(c12842x1.m59710k4(0));
        if (c12842x1.m59710k4(1).m59718x1() == 1 && (c12842x1.m59710k4(1).m59717to()[0] & 255) == 255) {
            z = true;
        }
        this.f38029x1 = z;
        C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(c12842x1.m59709k4() - 1);
        this.f38028kk = c12842x1M59710k4;
        if (c12842x1M59710k4.m59718x1() == 4 && this.f38028kk.m59716kk() > 0 && this.f38028kk.m59709k4() == 0) {
            try {
                C12842x1 c12842x12 = new C12842x1(this.f38028kk.m59717to());
                this.f38028kk.m59713k4((byte[]) null);
                this.f38028kk.m59712k4(c12842x12);
            } catch (Exception unused) {
            }
        }
        mo25217k4();
    }
}
