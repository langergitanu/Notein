package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ly */
/* JADX INFO: loaded from: classes.dex */
public class C5011ly extends AbstractC5023o3 {

    /* JADX INFO: renamed from: du */
    private String f13744du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f13745h4;

    /* JADX INFO: renamed from: k4 */
    private long f13746k4;

    /* JADX INFO: renamed from: kk */
    private long f13747kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13748to;

    /* JADX INFO: renamed from: x1 */
    private long f13749x1;

    public C5011ly(C5061vw c5061vw) {
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
        return m21245k4((C5011ly) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 397) ^ ((int) this.f13746k4)) * 397) ^ ((int) this.f13749x1)) * 397) ^ ((int) this.f13747kk)) * 397;
        byte[] bArr = this.f13748to;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        String str = this.f13744du;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr2 = this.f13745h4;
        return iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21242k4() {
        return this.f13749x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21246kk(long j) {
        this.f13747kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21247x1() {
        return this.f13747kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21243k4(long j) {
        this.f13746k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21248x1(long j) {
        this.f13749x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21244k4(byte[] bArr) {
        this.f13748to = bArr;
        this.f13744du = AbstractC6747ar.m26650yj().mo26682x1(this.f13748to, 0, (int) this.f13749x1);
        byte[] bArr2 = new byte[(int) this.f13747kk];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f13748to), (int) this.f13749x1, AbstractC14092to.m67208k4((Object) bArr2), 0, (int) this.f13747kk);
        this.f13745h4 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21245k4(C5011ly c5011ly) {
        return m21559k4((C5061vw) c5011ly) && this.f13746k4 == c5011ly.f13746k4 && this.f13749x1 == c5011ly.f13749x1 && this.f13747kk == c5011ly.f13747kk && C3022m9.m12719k4(this.f13748to, c5011ly.f13748to) && C14113y2.m67363du(this.f13744du, c5011ly.f13744du) && C3022m9.m12719k4(this.f13745h4, c5011ly.f13745h4);
    }
}
