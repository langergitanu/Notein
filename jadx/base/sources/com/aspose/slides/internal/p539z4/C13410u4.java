package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13410u4 extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private byte[] f44861k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f44862kk;

    /* JADX INFO: renamed from: to */
    private byte[] f44863to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f44864x1;

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
        return m62353k4((C13410u4) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 1024;
    }

    public int hashCode() {
        return ((((((m62354k4() != null ? AbstractC14092to.m67208k4((Object) m62354k4()).hashCode() : 0) * 397) ^ (m62360x1() != null ? AbstractC14092to.m67208k4((Object) m62360x1()).hashCode() : 0)) * 397) ^ (m62356kk() != null ? AbstractC14092to.m67208k4((Object) m62356kk()).hashCode() : 0)) * 397) ^ (m62358to() != null ? AbstractC14092to.m67208k4((Object) m62358to()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62352k4(byte[] bArr) {
        this.f44861k4 = bArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62355kk(byte[] bArr) {
        this.f44862kk = bArr;
    }

    /* JADX INFO: renamed from: to */
    public final void m62357to(byte[] bArr) {
        this.f44863to = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62359x1(byte[] bArr) {
        this.f44864x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62353k4(C13410u4 c13410u4) {
        return C3022m9.m12719k4(m62354k4(), c13410u4.m62354k4()) && C3022m9.m12719k4(m62360x1(), c13410u4.m62360x1()) && C3022m9.m12719k4(m62356kk(), c13410u4.m62356kk()) && C3022m9.m12719k4(m62358to(), c13410u4.m62358to());
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m62356kk() {
        return this.f44862kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m62358to() {
        return this.f44863to;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m62360x1() {
        return this.f44864x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m62354k4() {
        return this.f44861k4;
    }
}
