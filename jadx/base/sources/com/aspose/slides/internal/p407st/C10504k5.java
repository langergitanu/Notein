package com.aspose.slides.internal.p407st;

import com.aspose.slides.PptException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p138fu.C4129ks;
import com.aspose.slides.internal.p482wr.C12250c6;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.k5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10504k5 extends AbstractC10571o4 implements InterfaceC10673uw {

    /* JADX INFO: renamed from: k4 */
    private long f37136k4;

    /* JADX INFO: renamed from: kk */
    private long f37137kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f37138x1;

    public C10504k5() {
        m51409um().m51917k4(4113);
        m51409um().m51920k4((short) 1);
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: dy */
    public final long mo51092dy() {
        return this.f37136k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        if (!m51096x1()) {
            return m51095kk().length;
        }
        byte[] bArr = this.f37138x1;
        return ((int) (bArr != null ? ((long) bArr.length) & 4294967295L : 0L)) + 4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m51095kk() {
        try {
            return C4129ks.m16569k4(this.f37138x1, (int) this.f37137kk, 1);
        } catch (C12250c6 e) {
            C3085sv.m13082k4(e);
            return C4129ks.m16569k4(this.f37138x1, (int) this.f37137kk, 0);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m51096x1() {
        return m51409um().m51922kk() == 1;
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: k4 */
    public final void mo51093k4(long j) {
        this.f37136k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        if (!m51096x1()) {
            m51094k4(c3134k4.m13372dy(m51409um().m51914du()));
        } else {
            this.f37137kk = c3134k4.m13384uz();
            this.f37138x1 = c3134k4.m13372dy(m51409um().m51914du() - 4);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        if (this.f37138x1 == null) {
            throw new PptException("Serialization of external storage with empty data. View [ms-ppt] 2.10.34 ExOleObjStg, 2.10.37 ExControlStg, 2.10.40 VbaProjectStg.");
        }
        if (!m51096x1()) {
            c3149x1.m13450k4(m51095kk());
        } else {
            c3149x1.m13447k4(this.f37137kk);
            c3149x1.m13450k4(this.f37138x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51094k4(byte[] bArr) {
        this.f37138x1 = null;
        this.f37137kk = 0L;
        if (bArr != null) {
            this.f37138x1 = C4129ks.m16568k4(bArr, 1);
            this.f37137kk = ((long) bArr.length) & 4294967295L;
        }
        m51409um().m51925x1(mo50440k4());
    }
}
