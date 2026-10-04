package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p026an.C1500um;
import com.aspose.slides.internal.p539z4.AbstractC13365c6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C11040xk extends AbstractC10990c6 {

    /* JADX INFO: renamed from: k4 */
    private int f38372k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f38373kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13365c6 f38374x1;

    public C11040xk() {
        m53208x1((short) 16392);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC13365c6 m53438c5() {
        return this.f38374x1;
    }

    /* JADX INFO: renamed from: dy */
    public final int m53439dy() {
        return this.f38372k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53442k4((C11040xk) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (m53439dy() * 397) ^ (m53438c5() != null ? m53438c5().hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53440k4(AbstractC13365c6 abstractC13365c6) {
        this.f38374x1 = abstractC13365c6;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53443kk(int i) {
        this.f38372k4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m53445m9() {
        return m53199ix();
    }

    /* JADX INFO: renamed from: to */
    public final byte m53446to() {
        return (byte) ((au_() & 32512) >> 8);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, IsContinuable: {1}, ObjectType: {2}, ObjectId: {3}, TotalObjectSize: {4}, ObjectData: \n[{5}]", super.toString(), Boolean.valueOf(m53444kk()), C14042ak.m66410k4(C1500um.class, m53446to()), Byte.valueOf(m53445m9()), Integer.valueOf(m53439dy()), m53438c5());
    }

    public C11040xk(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53441k4(byte[] bArr) {
        this.f38373kk = bArr;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53444kk() {
        return m53198h4(15);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53442k4(C11040xk c11040xk) {
        return m53439dy() == c11040xk.m53439dy() && C14067j2.m66728k4(m53438c5(), c11040xk.m53438c5());
    }
}
