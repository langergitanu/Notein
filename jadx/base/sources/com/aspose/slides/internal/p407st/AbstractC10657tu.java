package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p456v5.C11604du;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.tu */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10657tu extends AbstractC10669uo {

    /* JADX INFO: renamed from: jd */
    public long f37415jd;

    /* JADX INFO: renamed from: k4 */
    private C14047bz f37416k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f37417x1;

    public AbstractC10657tu(int i, byte b) {
        super(i, b);
        this.f37416k4 = new C14047bz();
        this.f37415jd = 0L;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14047bz m51774x1(C3134k4 c3134k4) {
        return new C14047bz(c3134k4.m13372dy(16));
    }

    /* JADX INFO: renamed from: c5 */
    public final int m51775c5() {
        return (m51409um().m51923to() & 65535) - 61464;
    }

    /* JADX INFO: renamed from: dy */
    public final byte[] m51776dy() {
        return this.f37417x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public abstract int mo50440k4();

    /* JADX INFO: renamed from: k4 */
    public final void m51777k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f37416k4);
    }

    /* JADX INFO: renamed from: kk */
    public abstract byte[] mo50778kk();

    /* JADX INFO: renamed from: m9 */
    public final C14047bz m51779m9() {
        return this.f37416k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51778k4(byte[] bArr) {
        this.f37417x1 = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51780x1(byte[] bArr) {
        C11604du.m54651k4(bArr).CloneTo(this.f37416k4);
    }
}
