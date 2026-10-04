package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.AbstractC4615c6;
import com.aspose.slides.internal.p396sc.C10202um;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C6097xk extends AbstractC6047c6 {

    /* JADX INFO: renamed from: k4 */
    private int f17223k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f17224kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4615c6 f17225x1;

    public C6097xk() {
        m24449x1((short) 16392);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m24689c5() {
        return this.f17223k4;
    }

    /* JADX INFO: renamed from: ck */
    public final byte[] m24690ck() {
        return this.f17224kk;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m24691dy() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24696k4((C6097xk) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return m24692jd().mo19017h4();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (m24689c5() * 397) ^ (m24692jd() != null ? m24692jd().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC4615c6 m24692jd() {
        return this.f17225x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24693k4(byte b) {
        mo24437k4((short) (mo24431G_() & (-32513)));
        mo24437k4((short) (((short) ((b & 255) << 8)) | mo24431G_()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m24697kk(int i) {
        this.f17223k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final byte m24699to() {
        return (byte) ((mo24431G_() & 32512) >> 8);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, IsContinuable: {1}, ObjectType: {2}, ObjectId: {3}, TotalObjectSize: {4}, ObjectData: \n[{5}]", super.toString(), Boolean.valueOf(m24698kk()), C14042ak.m66410k4(C10202um.class, m24699to()), Byte.valueOf(m24691dy()), Integer.valueOf(m24689c5()), m24692jd());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24700x1(byte b) {
        m24444to(b);
    }

    public C6097xk(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24694k4(AbstractC4615c6 abstractC4615c6) {
        this.f17225x1 = abstractC4615c6;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24698kk() {
        return m24433h4(15);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24695k4(byte[] bArr) {
        this.f17224kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24696k4(C6097xk c6097xk) {
        return m24689c5() == c6097xk.m24689c5() && C14067j2.m66728k4(m24692jd(), c6097xk.m24692jd());
    }
}
