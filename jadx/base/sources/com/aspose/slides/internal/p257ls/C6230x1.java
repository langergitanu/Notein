package com.aspose.slides.internal.p257ls;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.ls.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6230x1 extends C10934du {

    /* JADX INFO: renamed from: to */
    private int f17654to;

    public C6230x1() {
        this.f38027k4 = "2.5.29.15";
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: k4 */
    public void mo25217k4() {
        C12842x1 c12842x1 = new C12842x1(this.f38028kk.m59717to());
        if (c12842x1.m59718x1() != 3) {
            throw new ArgumentException("Invalid KeyUsage extension");
        }
        for (int i = 1; i < c12842x1.m59717to().length; i++) {
            this.f17654to = (this.f17654to << 8) + c12842x1.m59717to()[i];
        }
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m25225k4(128)) {
            c6765kp.m26792k4("Digital Signature");
        }
        if (m25225k4(64)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Non-Repudiation");
        }
        if (m25225k4(32)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Key Encipherment");
        }
        if (m25225k4(16)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Data Encipherment");
        }
        if (m25225k4(8)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Key Agreement");
        }
        if (m25225k4(4)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Certificate Signing");
        }
        if (m25225k4(2)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("CRL Signing");
        }
        if (m25225k4(1)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Encipher Only ");
        }
        if (m25225k4(2048)) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(" , ");
            }
            c6765kp.m26792k4("Decipher Only");
        }
        c6765kp.m26792k4("(");
        c6765kp.m26792k4(C14057f9.m66588k4(this.f17654to, "X2", C11697x1.m55250kk()));
        c6765kp.m26792k4(")");
        c6765kp.m26792k4(C14052dq.f47188k4);
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: x1 */
    public void mo25218x1() {
        int i;
        C12842x1 c12842x1 = new C12842x1((byte) 4);
        this.f38028kk = c12842x1;
        int i2 = this.f17654to;
        if ((65535 & i2) <= 0) {
            c12842x1.m59712k4(new C12842x1((byte) 3, new byte[]{7, 0}));
            return;
        }
        byte b = 15;
        while (true) {
            i = b & 255;
            if (i <= 0 || (i2 & 32768) == 32768) {
                break;
            }
            i2 <<= 1;
            b = (byte) (b - 1);
        }
        int i3 = this.f17654to;
        if (i3 > 255) {
            this.f38028kk.m59712k4(new C12842x1((byte) 3, new byte[]{(byte) (i - 8), (byte) i3, (byte) (i3 >> 8)}));
        } else {
            this.f38028kk.m59712k4(new C12842x1((byte) 3, new byte[]{b, (byte) i3}));
        }
    }

    public C6230x1(C10934du c10934du) {
        super(c10934du);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m25225k4(int i) {
        int iM66999m9 = C14080ne.m66999m9(Integer.valueOf(i), C11697x1.m55250kk());
        return (this.f17654to & iM66999m9) == iM66999m9;
    }
}
