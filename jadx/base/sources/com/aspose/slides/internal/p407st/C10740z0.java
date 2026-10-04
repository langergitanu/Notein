package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.z0 */
/* JADX INFO: loaded from: classes4.dex */
public class C10740z0 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37555k4;

    /* JADX INFO: renamed from: x1 */
    private long f37556x1;

    public C10740z0() {
        super(61448, (byte) 0);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final long m52120kk() {
        return this.f37555k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m52121x1() {
        return C3085sv.m13073k4(m51409um().m51922kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52118k4(int i) {
        if ((65535 & i) > 4079) {
            throw new ArgumentOutOfRangeException("value", "Value MUST be less than or equal to 0xFFE.");
        }
        m51409um().m51920k4((short) i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52122x1(long j) {
        this.f37556x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52119k4(long j) {
        this.f37555k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37555k4 = c3134k4.m13384uz();
        this.f37556x1 = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37555k4);
        c3149x1.m13447k4(this.f37556x1 & 4294967295L);
    }
}
