package com.aspose.slides.internal.p260ly;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C6272fa extends C6269ck {

    /* JADX INFO: renamed from: k4 */
    private byte[] f17794k4;

    /* JADX INFO: renamed from: kk */
    private String f17795kk;

    /* JADX INFO: renamed from: to */
    private String f17796to;

    /* JADX INFO: renamed from: x1 */
    private String f17797x1;

    public C6272fa(C6269ck c6269ck) {
        m25469k4(c6269ck.m25467k4());
        m25486x1(c6269ck.m25484x1());
        m25475kk(c6269ck.m25473kk());
        m25482to(c6269ck.m25480to());
        m25461du(c6269ck.m25464h4());
        m25468k4(c6269ck.m25477m9());
        m25485x1(c6269ck.m25462dy());
        m25474kk(c6269ck.m25458c5());
        m25481to(c6269ck.m25466jd());
        m25460du(c6269ck.m25459ck());
        m25465h4(c6269ck.m25463fa());
        m25478m9(c6269ck.m25483up());
        m25470k4(c6269ck.m25487yj());
        m25471k4(c6269ck.m25476ks());
    }

    @Override // com.aspose.slides.internal.p260ly.C6269ck
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
        return m25500k4((C6272fa) obj);
    }

    @Override // com.aspose.slides.internal.p260ly.C6269ck
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        String str = this.f17797x1;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        String str2 = this.f17795kk;
        int iHashCode3 = (iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 397;
        String str3 = this.f17796to;
        return iHashCode3 ^ (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ix */
    public final String m25498ix() {
        return this.f17796to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25499k4(byte[] bArr) {
        this.f17794k4 = bArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25501kk(String str) {
        this.f17795kk = str;
    }

    /* JADX INFO: renamed from: ne */
    public final String m25502ne() {
        return this.f17795kk;
    }

    /* JADX INFO: renamed from: to */
    public final void m25503to(String str) {
        this.f17796to = str;
    }

    @Override // com.aspose.slides.internal.p260ly.C6269ck
    public String toString() {
        return C14113y2.m67402k4("{0}, FullName: {1}, Style: {2}, Script: {3}", super.toString(), m25506x6(), m25502ne(), m25498ix());
    }

    /* JADX INFO: renamed from: u4 */
    public final byte[] m25504u4() {
        return this.f17794k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25505x1(String str) {
        this.f17797x1 = str;
    }

    /* JADX INFO: renamed from: x6 */
    public final String m25506x6() {
        return this.f17797x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25500k4(C6272fa c6272fa) {
        return m25472k4((C6269ck) c6272fa) && C14113y2.m67363du(this.f17797x1, c6272fa.f17797x1) && C14113y2.m67363du(this.f17795kk, c6272fa.f17795kk) && C14113y2.m67363du(this.f17796to, c6272fa.f17796to);
    }
}
