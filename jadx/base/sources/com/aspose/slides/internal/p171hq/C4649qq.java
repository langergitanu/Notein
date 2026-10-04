package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.qq */
/* JADX INFO: loaded from: classes.dex */
public final class C4649qq extends AbstractC4671x1 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f12987k4;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4649qq.class) && m19312k4((C4649qq) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        if (m19314to() != null) {
            return m19314to().length;
        }
        return 0;
    }

    public int hashCode() {
        if (m19314to() != null) {
            return AbstractC14092to.m67208k4((Object) m19314to()).hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo19122k4() {
        return (C12009k4) AbstractC12002ck.m56312k4(new C3152yj(m19314to()));
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: kk */
    public byte[] mo19127kk() {
        return m19314to();
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m19314to() {
        return this.f12987k4;
    }

    public String toString() {
        return C14113y2.m67402k4("CompressedImageData: {0}", m19314to());
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC6888dy mo19130x1() {
        return new C6895to(mo19122k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19313k4(byte[] bArr) {
        this.f12987k4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19312k4(C4649qq c4649qq) {
        return C12530dy.m58330k4(m19314to(), c4649qq.m19314to());
    }
}
