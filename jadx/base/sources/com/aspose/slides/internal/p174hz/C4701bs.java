package com.aspose.slides.internal.p174hz;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.bs */
/* JADX INFO: loaded from: classes.dex */
public class C4701bs extends AbstractC7020m9<C4701bs> {

    /* JADX INFO: renamed from: c5 */
    static final /* synthetic */ boolean f13115c5 = true;

    /* JADX INFO: renamed from: du */
    public byte[] f13116du;

    /* JADX INFO: renamed from: dy */
    public byte[] f13117dy;

    /* JADX INFO: renamed from: h4 */
    public byte[] f13118h4;

    /* JADX INFO: renamed from: k4 */
    public byte[] f13119k4;

    /* JADX INFO: renamed from: kk */
    public byte[] f13120kk;

    /* JADX INFO: renamed from: m9 */
    public byte[] f13121m9;

    /* JADX INFO: renamed from: to */
    public byte[] f13122to;

    /* JADX INFO: renamed from: x1 */
    public byte[] f13123x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m19570x1(C4701bs c4701bs) {
        return C14067j2.m66728k4(c4701bs.f13119k4, this.f13119k4) && C14067j2.m66728k4(c4701bs.f13123x1, this.f13123x1) && C14067j2.m66728k4(c4701bs.f13120kk, this.f13120kk) && C14067j2.m66728k4(c4701bs.f13122to, this.f13122to) && C14067j2.m66728k4(c4701bs.f13116du, this.f13116du) && C14067j2.m66728k4(c4701bs.f13118h4, this.f13118h4) && C14067j2.m66728k4(c4701bs.f13121m9, this.f13121m9) && C14067j2.m66728k4(c4701bs.f13117dy, this.f13117dy);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f13115c5 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4701bs) {
            return m19570x1((C4701bs) obj);
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.f13119k4;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        byte[] bArr2 = this.f13123x1;
        int iHashCode2 = (iHashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        byte[] bArr3 = this.f13120kk;
        int iHashCode3 = (iHashCode2 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31;
        byte[] bArr4 = this.f13122to;
        int iHashCode4 = (iHashCode3 + (bArr4 != null ? Arrays.hashCode(bArr4) : 0)) * 31;
        byte[] bArr5 = this.f13116du;
        int iHashCode5 = (iHashCode4 + (bArr5 != null ? Arrays.hashCode(bArr5) : 0)) * 31;
        byte[] bArr6 = this.f13118h4;
        int iHashCode6 = (iHashCode5 + (bArr6 != null ? Arrays.hashCode(bArr6) : 0)) * 31;
        byte[] bArr7 = this.f13121m9;
        int iHashCode7 = (iHashCode6 + (bArr7 != null ? Arrays.hashCode(bArr7) : 0)) * 31;
        byte[] bArr8 = this.f13117dy;
        return iHashCode7 + (bArr8 != null ? Arrays.hashCode(bArr8) : 0);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4701bs Clone() {
        C4701bs c4701bs = new C4701bs();
        CloneTo(c4701bs);
        return c4701bs;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4701bs c4701bs) {
        c4701bs.f13119k4 = this.f13119k4;
        c4701bs.f13123x1 = this.f13123x1;
        c4701bs.f13120kk = this.f13120kk;
        c4701bs.f13122to = this.f13122to;
        c4701bs.f13116du = this.f13116du;
        c4701bs.f13118h4 = this.f13118h4;
        c4701bs.f13121m9 = this.f13121m9;
        c4701bs.f13117dy = this.f13117dy;
    }
}
