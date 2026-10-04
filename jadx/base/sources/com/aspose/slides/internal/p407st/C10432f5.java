package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.f5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10432f5 extends AbstractC10657tu {

    /* JADX INFO: renamed from: k4 */
    C14047bz f36984k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f36985x1;

    public C10432f5() {
        super(61468, (byte) 0);
        this.f36984k4 = new C14047bz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10657tu, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int length = m51776dy().length;
        return (m51409um().m51922kk() & 1) > 0 ? length + 32 : length + 16;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10657tu
    /* JADX INFO: renamed from: kk */
    public byte[] mo50778kk() {
        if (this.f36985x1 == null) {
            AbstractC3150x6 abstractC3150x6M21998k4 = C5133k4.m21998k4("resources", "NotSupported.emf");
            C3152yj c3152yj = new C3152yj();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = abstractC3150x6M21998k4.read(bArr, 0, 4096);
                    if (i <= 0) {
                        break;
                    }
                    c3152yj.write(bArr, 0, i);
                }
                this.f36985x1 = c3152yj.toArray();
                c3152yj.dispose();
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
        return this.f36985x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        m51777k4(AbstractC10657tu.m51774x1(c3134k4).Clone());
        int iM51914du = m51409um().m51914du();
        int i = iM51914du - 16;
        if ((m51409um().m51922kk() & 1) > 0) {
            AbstractC10657tu.m51774x1(c3134k4).CloneTo(this.f36984k4);
            i = iM51914du - 32;
        }
        m51778k4(c3134k4.m13372dy(i));
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13450k4(m51779m9().m66539k4());
        if ((m51409um().m51922kk() & 1) > 0) {
            c3149x1.m13450k4(this.f36984k4.m66539k4());
        }
        c3149x1.m13450k4(m51776dy());
    }
}
