package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.xh */
/* JADX INFO: loaded from: classes4.dex */
public class C10712xh extends AbstractC10620rm {

    /* JADX INFO: renamed from: k4 */
    protected byte[] f37504k4;

    public C10712xh(C10395d2 c10395d2) {
        super(c10395d2);
        this.f37504k4 = new byte[0];
        m51409um().m51917k4(4008);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f37504k4.length;
    }

    /* JADX INFO: renamed from: x1 */
    public String mo51804x1() {
        byte[] bArr = this.f37504k4;
        if (bArr.length <= 0) {
            return "";
        }
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < m51409um().m51914du(); i++) {
            cArr[i] = (char) (this.f37504k4[i] & 255);
        }
        return C14113y2.m67405k4(cArr);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37504k4 = c3134k4.m13372dy(m51409um().m51914du());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13450k4(this.f37504k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo51803k4(String str) {
        if (str == null) {
            return;
        }
        this.f37504k4 = new byte[str.length()];
        int i = 0;
        while (true) {
            byte[] bArr = this.f37504k4;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = (byte) (str.charAt(i) & 255);
            i++;
        }
    }
}
