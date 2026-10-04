package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C13604kk extends AbstractC7020m9<C13604kk> {

    /* JADX INFO: renamed from: du */
    static final /* synthetic */ boolean f45168du = true;

    /* JADX INFO: renamed from: k4 */
    public byte[] f45169k4;

    /* JADX INFO: renamed from: kk */
    public int f45170kk;

    /* JADX INFO: renamed from: to */
    public String f45171to;

    /* JADX INFO: renamed from: x1 */
    public int f45172x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m62749x1(C13604kk c13604kk) {
        return C14067j2.m66728k4(c13604kk.f45169k4, this.f45169k4) && c13604kk.f45172x1 == this.f45172x1 && c13604kk.f45170kk == this.f45170kk && C14067j2.m66728k4(c13604kk.f45171to, this.f45171to);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f45168du && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C13604kk) {
            return m62749x1((C13604kk) obj);
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.f45169k4;
        int iHashCode = (((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f45172x1) * 31) + this.f45170kk) * 31;
        String str = this.f45171to;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C13604kk Clone() {
        C13604kk c13604kk = new C13604kk();
        CloneTo(c13604kk);
        return c13604kk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13604kk c13604kk) {
        c13604kk.f45169k4 = this.f45169k4;
        c13604kk.f45172x1 = this.f45172x1;
        c13604kk.f45170kk = this.f45170kk;
        c13604kk.f45171to = this.f45171to;
    }
}
