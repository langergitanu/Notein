package com.aspose.slides.internal.p488x0;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p394s9.C10166k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.internal.p500xi.C12533kk;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12331c5 extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12340kk f41210k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f41211kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f41212x1;

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
        return m57633k4((C12331c5) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m57629h4() {
        return this.f41211kk;
    }

    public int hashCode() {
        AbstractC12340kk abstractC12340kk = this.f41210k4;
        int iHashCode = (abstractC12340kk != null ? abstractC12340kk.hashCode() : 0) * 397;
        byte[] bArr = this.f41212x1;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        byte[] bArr2 = this.f41211kk;
        return iHashCode2 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12340kk m57630k4() {
        return this.f41210k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57635kk() {
        if (C7019kk.m27469x1(m57630k4(), C12346to.class)) {
            return ((C12346to) C7019kk.m27452k4((Object) m57630k4(), C12346to.class)).m57802h4() & 65535;
        }
        if (C7019kk.m27469x1(m57630k4(), C12333du.class)) {
            return ((C12333du) C7019kk.m27452k4((Object) m57630k4(), C12333du.class)).m57654h4();
        }
        throw new ArgumentException("Unknown Header type.");
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m57637to() {
        return this.f41212x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57638x1() {
        if (C7019kk.m27469x1(m57630k4(), C12346to.class)) {
            return ((C12346to) C7019kk.m27452k4((Object) m57630k4(), C12346to.class)).m57805to() & 65535;
        }
        if (C7019kk.m27469x1(m57630k4(), C12333du.class)) {
            return ((C12333du) C7019kk.m27452k4((Object) m57630k4(), C12333du.class)).m57662to();
        }
        throw new ArgumentException("Unknown Header type.");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57631k4(AbstractC12340kk abstractC12340kk) {
        this.f41210k4 = abstractC12340kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m57636kk(C12533kk c12533kk) {
        return C10166k4.m50000k4(m57639x1(c12533kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final C12009k4 m57639x1(C12533kk c12533kk) {
        try {
            return (C12009k4) AbstractC12002ck.m56312k4(new C3152yj(m57634k4(c12533kk)));
        } catch (RuntimeException unused) {
            C6005k4.m24263kk("Error:Unable to convert DIB to Bitmap");
            return new C12009k4(m57638x1(), C14116yg.m67482k4(m57635kk()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57632k4(byte[] bArr) {
        this.f41212x1 = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57640x1(byte[] bArr) {
        this.f41211kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57633k4(C12331c5 c12331c5) {
        return C14067j2.m66728k4(this.f41210k4, c12331c5.f41210k4) && C12530dy.m58330k4(this.f41212x1, c12331c5.f41212x1) && C12530dy.m58330k4(this.f41211kk, c12331c5.f41211kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m57634k4(C12533kk c12533kk) {
        if (m57630k4().m57759kk() == 1 && ((m57637to() == null || m57637to().length == 0) && m57630k4().m57759kk() == 1)) {
            m57632k4(new byte[]{0, 0, 0, 0, -1, -1, -1, 0});
        }
        if (m57630k4().m57759kk() == 8 && ((m57637to() == null || m57637to().length == 0) && c12533kk != null)) {
            m57632k4(new byte[c12533kk.m58353kk() * 4]);
            int i = 0;
            int i2 = 0;
            while (i < c12533kk.m58353kk() * 4) {
                C12003du c12003duClone = c12533kk.m58354x1()[i2].Clone();
                m57637to()[i] = c12003duClone.m56505fa();
                m57637to()[i + 1] = c12003duClone.m56502ck();
                m57637to()[i + 2] = c12003duClone.m56507jd();
                m57637to()[i + 3] = 0;
                i += 4;
                i2++;
            }
        }
        byte[] bArr = this.f41212x1;
        int length = bArr != null ? bArr.length : 0;
        int iM57756k4 = (int) ((((((this.f41210k4.m57756k4() & 4294967295L) + 14) & 4294967295L) + ((long) length)) & 4294967295L) + ((long) this.f41211kk.length));
        byte[] bArr2 = new byte[iM57756k4];
        C3152yj c3152yj = new C3152yj(bArr2);
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                C12339k4 c12339k4 = new C12339k4();
                c12339k4.m57748k4(iM57756k4);
                c12339k4.m57755x1(((int) this.f41210k4.m57756k4()) + 14 + length);
                c12339k4.m57749k4(c3149x1);
                this.f41210k4.mo57657k4(c3149x1);
                if (length > 0) {
                    c3149x1.m13450k4(this.f41212x1);
                }
                c3149x1.m13450k4(this.f41211kk);
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
