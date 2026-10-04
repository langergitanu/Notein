package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p436u8.C11289k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.qq */
/* JADX INFO: loaded from: classes5.dex */
public final class C13399qq extends AbstractC13421x1 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f44840k4;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13399qq.class) && m62305k4((C13399qq) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        if (m62307kk() != null) {
            return m62307kk().length;
        }
        return 0;
    }

    public int hashCode() {
        if (m62307kk() != null) {
            return AbstractC14092to.m67208k4((Object) m62307kk()).hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo62121k4() {
        return (C12009k4) AbstractC12002ck.m56312k4(new C3152yj(m62307kk()));
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m62307kk() {
        return this.f44840k4;
    }

    public String toString() {
        return C14113y2.m67402k4("CompressedImageData: {0}", m62307kk());
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC11290x1 mo62129x1() {
        return new C11289k4(mo62121k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62306k4(byte[] bArr) {
        this.f44840k4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62305k4(C13399qq c13399qq) {
        return C3022m9.m12719k4(m62307kk(), c13399qq.m62307kk());
    }
}
