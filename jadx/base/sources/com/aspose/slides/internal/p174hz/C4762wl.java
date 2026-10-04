package com.aspose.slides.internal.p174hz;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.wl */
/* JADX INFO: loaded from: classes.dex */
public class C4762wl extends AbstractC7020m9<C4762wl> {

    /* JADX INFO: renamed from: c5 */
    static final /* synthetic */ boolean f13301c5 = true;

    /* JADX INFO: renamed from: du */
    public byte[] f13302du;

    /* JADX INFO: renamed from: dy */
    public byte[] f13303dy;

    /* JADX INFO: renamed from: h4 */
    public byte[] f13304h4;

    /* JADX INFO: renamed from: k4 */
    public int f13305k4;

    /* JADX INFO: renamed from: kk */
    public byte[] f13306kk;

    /* JADX INFO: renamed from: m9 */
    public byte[] f13307m9;

    /* JADX INFO: renamed from: to */
    public byte[] f13308to;

    /* JADX INFO: renamed from: x1 */
    public byte[] f13309x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m19790x1(C4762wl c4762wl) {
        return c4762wl.f13305k4 == this.f13305k4 && C14067j2.m66728k4(c4762wl.f13309x1, this.f13309x1) && C14067j2.m66728k4(c4762wl.f13306kk, this.f13306kk) && C14067j2.m66728k4(c4762wl.f13308to, this.f13308to) && C14067j2.m66728k4(c4762wl.f13302du, this.f13302du) && C14067j2.m66728k4(c4762wl.f13304h4, this.f13304h4) && C14067j2.m66728k4(c4762wl.f13307m9, this.f13307m9) && C14067j2.m66728k4(c4762wl.f13303dy, this.f13303dy);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f13301c5 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4762wl) {
            return m19790x1((C4762wl) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f13305k4 * 31;
        byte[] bArr = this.f13309x1;
        int iHashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.f13306kk;
        int iHashCode2 = (iHashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        byte[] bArr3 = this.f13308to;
        int iHashCode3 = (iHashCode2 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31;
        byte[] bArr4 = this.f13302du;
        int iHashCode4 = (iHashCode3 + (bArr4 != null ? Arrays.hashCode(bArr4) : 0)) * 31;
        byte[] bArr5 = this.f13304h4;
        int iHashCode5 = (iHashCode4 + (bArr5 != null ? Arrays.hashCode(bArr5) : 0)) * 31;
        byte[] bArr6 = this.f13307m9;
        int iHashCode6 = (iHashCode5 + (bArr6 != null ? Arrays.hashCode(bArr6) : 0)) * 31;
        byte[] bArr7 = this.f13303dy;
        return iHashCode6 + (bArr7 != null ? Arrays.hashCode(bArr7) : 0);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4762wl Clone() {
        C4762wl c4762wl = new C4762wl();
        CloneTo(c4762wl);
        return c4762wl;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4762wl c4762wl) {
        c4762wl.f13305k4 = this.f13305k4;
        c4762wl.f13309x1 = this.f13309x1;
        c4762wl.f13306kk = this.f13306kk;
        c4762wl.f13308to = this.f13308to;
        c4762wl.f13302du = this.f13302du;
        c4762wl.f13304h4 = this.f13304h4;
        c4762wl.f13307m9 = this.f13307m9;
        c4762wl.f13303dy = this.f13303dy;
    }
}
