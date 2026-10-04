package com.aspose.slides.internal.p498xe;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p075d5.C3021kk;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12502c5 extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12511kk f41834k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f41835kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f41836x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m58071k4((C12502c5) obj);
    }

    public int hashCode() {
        AbstractC12511kk abstractC12511kk = this.f41834k4;
        int iHashCode = (abstractC12511kk != null ? abstractC12511kk.hashCode() : 0) * 397;
        byte[] bArr = this.f41836x1;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        byte[] bArr2 = this.f41835kk;
        return iHashCode2 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12511kk m58068k4() {
        return this.f41834k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m58073kk() {
        if (C7019kk.m27469x1(m58068k4(), C12517to.class)) {
            return ((C12517to) C7019kk.m27452k4((Object) m58068k4(), C12517to.class)).m58218h4() & 65535;
        }
        if (C7019kk.m27469x1(m58068k4(), C12504du.class)) {
            return ((C12504du) C7019kk.m27452k4((Object) m58068k4(), C12504du.class)).m58088h4();
        }
        throw new ArgumentException("Unknown Header type.");
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m58074to() {
        return this.f41836x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m58075x1() {
        if (C7019kk.m27469x1(m58068k4(), C12517to.class)) {
            return ((C12517to) C7019kk.m27452k4((Object) m58068k4(), C12517to.class)).m58221to() & 65535;
        }
        if (C7019kk.m27469x1(m58068k4(), C12504du.class)) {
            return ((C12504du) C7019kk.m27452k4((Object) m58068k4(), C12504du.class)).m58095to();
        }
        throw new ArgumentException("Unknown Header type.");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58069k4(AbstractC12511kk abstractC12511kk) {
        this.f41834k4 = abstractC12511kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12009k4 m58076x1(C3021kk c3021kk) {
        try {
            return (C12009k4) AbstractC12002ck.m56312k4(new C3152yj(m58072k4(c3021kk)));
        } catch (RuntimeException unused) {
            C6005k4.m24263kk("Error:Unable to convert DIB to Bitmap");
            return new C12009k4(m58075x1(), C14116yg.m67482k4(m58073kk()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58070k4(byte[] bArr) {
        this.f41836x1 = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58077x1(byte[] bArr) {
        this.f41835kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58071k4(C12502c5 c12502c5) {
        return C14067j2.m66728k4(this.f41834k4, c12502c5.f41834k4) && C3022m9.m12719k4(this.f41836x1, c12502c5.f41836x1) && C3022m9.m12719k4(this.f41835kk, c12502c5.f41835kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m58072k4(C3021kk c3021kk) {
        if (m58068k4().m58175kk() == 1 && ((m58074to() == null || m58074to().length == 0) && m58068k4().m58175kk() == 1)) {
            m58070k4(new byte[]{0, 0, 0, 0, -1, -1, -1, 0});
        }
        if (m58068k4().m58175kk() == 8 && ((m58074to() == null || m58074to().length == 0) && c3021kk != null)) {
            m58070k4(new byte[c3021kk.m12714kk() * 4]);
            int i = 0;
            int i2 = 0;
            while (i < c3021kk.m12714kk() * 4) {
                C12003du c12003duClone = c3021kk.m12715x1()[i2].Clone();
                m58074to()[i] = c12003duClone.m56505fa();
                m58074to()[i + 1] = c12003duClone.m56502ck();
                m58074to()[i + 2] = c12003duClone.m56507jd();
                m58074to()[i + 3] = 0;
                i += 4;
                i2++;
            }
        }
        byte[] bArr = this.f41836x1;
        int length = bArr != null ? bArr.length : 0;
        int iM58172k4 = (int) ((((((this.f41834k4.m58172k4() & 4294967295L) + 14) & 4294967295L) + ((long) length)) & 4294967295L) + ((long) this.f41835kk.length));
        byte[] bArr2 = new byte[iM58172k4];
        C3152yj c3152yj = new C3152yj(bArr2);
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                C12510k4 c12510k4 = new C12510k4();
                c12510k4.m58164k4(iM58172k4);
                c12510k4.m58171x1(((int) this.f41834k4.m58172k4()) + 14 + length);
                c12510k4.m58165k4(c3149x1);
                this.f41834k4.mo58090k4(c3149x1);
                if (length > 0) {
                    c3149x1.m13450k4(this.f41836x1);
                }
                c3149x1.m13450k4(this.f41835kk);
                c3149x1.dispose();
                return bArr2;
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }
}
