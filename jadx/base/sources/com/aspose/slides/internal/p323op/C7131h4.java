package com.aspose.slides.internal.p323op;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p479wm.InterfaceC12212x1;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.op.h4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7131h4 implements InterfaceC12212x1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck f19241k4;

    /* JADX INFO: renamed from: kk */
    private final String f19242kk = m27673m9();

    /* JADX INFO: renamed from: to */
    private boolean f19243to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f19244x1;

    public C7131h4(AbstractC12002ck abstractC12002ck) {
        this.f19241k4 = abstractC12002ck;
    }

    /* JADX INFO: renamed from: m9 */
    private String m27673m9() {
        return C14047bz.m66536x1().m66538k4("N");
    }

    /* JADX INFO: renamed from: du */
    public final byte[] m27674du() {
        if (m27679to()) {
            return this.f19244x1;
        }
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p479wm.InterfaceC12212x1
    public final long getWeight() {
        Integer numValueOf;
        if (m27679to()) {
            numValueOf = Integer.valueOf(this.f19244x1.length);
        } else {
            if (!m27680x1()) {
                return 0L;
            }
            numValueOf = Integer.valueOf(this.f19241k4.mo15760yj() * this.f19241k4.mo15757m9());
        }
        return C7019kk.m27461m9(numValueOf, 9);
    }

    /* JADX INFO: renamed from: h4 */
    public final String m27675h4() {
        return this.f19242kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27676k4(AbstractC12002ck abstractC12002ck) {
        this.f19241k4 = abstractC12002ck;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC12002ck m27678kk() {
        if (m27680x1()) {
            return this.f19241k4;
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m27679to() {
        return this.f19244x1 != null;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m27680x1() {
        return this.f19241k4 != null;
    }

    public C7131h4(AbstractC12002ck abstractC12002ck, boolean z) {
        this.f19241k4 = abstractC12002ck;
        this.f19243to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27677k4() {
        return this.f19243to;
    }

    public C7131h4(AbstractC12002ck abstractC12002ck, byte[] bArr) {
        this.f19241k4 = abstractC12002ck;
        this.f19244x1 = bArr;
    }

    public C7131h4(byte[] bArr) {
        this.f19244x1 = bArr;
    }
}
