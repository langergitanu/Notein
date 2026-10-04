package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.q6 */
/* JADX INFO: loaded from: classes.dex */
public class C5028q6 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: du */
    private String f13807du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f13808h4;

    /* JADX INFO: renamed from: k4 */
    private long f13809k4;

    /* JADX INFO: renamed from: kk */
    private long f13810kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13811to;

    /* JADX INFO: renamed from: x1 */
    private long f13812x1;

    public C5028q6(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21379k4((C5028q6) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 397) ^ ((int) this.f13809k4)) * 397) ^ ((int) this.f13812x1)) * 397) ^ ((int) this.f13810kk)) * 397;
        byte[] bArr = this.f13811to;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        String str = this.f13807du;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr2 = this.f13808h4;
        return iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21376k4() {
        return this.f13812x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21380kk(long j) {
        this.f13810kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21381x1() {
        return this.f13810kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21377k4(long j) {
        this.f13809k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21382x1(long j) {
        this.f13812x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21378k4(byte[] bArr) {
        this.f13811to = bArr;
        this.f13807du = AbstractC6747ar.m26643rv().mo26682x1(this.f13811to, 0, (int) this.f13812x1);
        byte[] bArr2 = new byte[(int) this.f13810kk];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f13811to), (int) this.f13812x1, AbstractC14092to.m67208k4((Object) bArr2), 0, (int) this.f13810kk);
        this.f13808h4 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21379k4(C5028q6 c5028q6) {
        return m21559k4((C5061vw) c5028q6) && this.f13809k4 == c5028q6.f13809k4 && this.f13812x1 == c5028q6.f13812x1 && this.f13810kk == c5028q6.f13810kk && C3022m9.m12719k4(this.f13811to, c5028q6.f13811to) && C14113y2.m67363du(this.f13807du, c5028q6.f13807du) && C3022m9.m12719k4(this.f13808h4, c5028q6.f13808h4);
    }
}
