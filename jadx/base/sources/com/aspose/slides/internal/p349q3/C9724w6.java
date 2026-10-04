package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p260ly.C6268c5;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.w6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9724w6 extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private C6268c5 f35146k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f35147kk;

    /* JADX INFO: renamed from: to */
    private String f35148to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f35149x1;

    public C9724w6(C3180k4 c3180k4) {
        super(c3180k4);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47773k4((C9724w6) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6268c5 c6268c5 = this.f35146k4;
        int iHashCode2 = (iHashCode ^ (c6268c5 != null ? c6268c5.hashCode() : 0)) * 397;
        byte[] bArr = this.f35149x1;
        int iHashCode3 = (iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        byte[] bArr2 = this.f35147kk;
        int iHashCode4 = (iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0)) * 397;
        String str = this.f35148to;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6268c5 m47769k4() {
        return this.f35146k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m47774kk() {
        return this.f35147kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m47775to() {
        return this.f35148to;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, EmfHeader: {1}, EmfHeaderRecordBuffer: {2}, EmfDescriptionBuffer: {3}, EmfDescription: {4}", super.toString(), this.f35146k4, this.f35149x1, this.f35147kk, this.f35148to);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47776x1(byte[] bArr) {
        this.f35147kk = bArr;
    }

    public C9724w6(C9723vw c9723vw) {
        super(c9723vw);
        m47770k4(new C6268c5());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47770k4(C6268c5 c6268c5) {
        this.f35146k4 = c6268c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m47777x1() {
        return this.f35149x1;
    }

    public C9724w6(C9724w6 c9724w6) {
        super(c9724w6);
        m47771k4(c9724w6.m47775to());
        m47776x1(c9724w6.m47774kk());
        m47770k4(c9724w6.m47769k4());
        m47772k4(c9724w6.m47777x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47771k4(String str) {
        this.f35148to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47772k4(byte[] bArr) {
        this.f35149x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47773k4(C9724w6 c9724w6) {
        return m47765k4((C9723vw) c9724w6) && C14067j2.m66728k4(this.f35146k4, c9724w6.f35146k4) && C12530dy.m58330k4(this.f35149x1, c9724w6.f35149x1) && C12530dy.m58330k4(this.f35147kk, c9724w6.f35147kk) && C14113y2.m67363du(this.f35148to, c9724w6.f35148to);
    }
}
