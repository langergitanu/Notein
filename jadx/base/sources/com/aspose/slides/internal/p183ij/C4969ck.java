package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4969ck extends AbstractC5023o3 {

    /* JADX INFO: renamed from: du */
    private byte[] f13574du;

    /* JADX INFO: renamed from: h4 */
    private String f13575h4;

    /* JADX INFO: renamed from: k4 */
    private long f13576k4;

    /* JADX INFO: renamed from: kk */
    private long f13577kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f13578m9;

    /* JADX INFO: renamed from: to */
    private long f13579to;

    /* JADX INFO: renamed from: x1 */
    private long f13580x1;

    public C4969ck(C5061vw c5061vw) {
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
        return m20894k4((C4969ck) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((((super.hashCode() * 397) ^ ((int) this.f13576k4)) * 397) ^ ((int) this.f13580x1)) * 397) ^ ((int) this.f13577kk)) * 397) ^ ((int) this.f13579to)) * 397;
        byte[] bArr = this.f13574du;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        String str = this.f13575h4;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr2 = this.f13578m9;
        return iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20891k4() {
        return this.f13577kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m20895kk(long j) {
        this.f13577kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m20896to(long j) {
        this.f13579to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m20897x1() {
        return this.f13579to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20892k4(long j) {
        this.f13576k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20898x1(long j) {
        this.f13580x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20893k4(byte[] bArr) {
        this.f13574du = bArr;
        this.f13575h4 = AbstractC6747ar.m26643rv().mo26682x1(this.f13574du, 0, (int) this.f13577kk);
        byte[] bArr2 = new byte[(int) this.f13579to];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f13574du), (int) this.f13577kk, AbstractC14092to.m67208k4((Object) bArr2), 0, (int) this.f13579to);
        this.f13578m9 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20894k4(C4969ck c4969ck) {
        return m21559k4((C5061vw) c4969ck) && this.f13576k4 == c4969ck.f13576k4 && this.f13580x1 == c4969ck.f13580x1 && this.f13577kk == c4969ck.f13577kk && this.f13579to == c4969ck.f13579to && C3022m9.m12719k4(this.f13574du, c4969ck.f13574du) && C14113y2.m67363du(this.f13575h4, c4969ck.f13575h4) && C3022m9.m12719k4(this.f13578m9, c4969ck.f13578m9);
    }
}
