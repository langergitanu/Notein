package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.g6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10446g6 extends AbstractC10621rp {

    /* JADX INFO: renamed from: k4 */
    String f37015k4;

    /* JADX INFO: renamed from: x1 */
    String f37016x1;

    public C10446g6(C10395d2 c10395d2) {
        super(c10395d2);
        this.f37015k4 = null;
        this.f37016x1 = null;
        m51409um().m51917k4(4117);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10621rp, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 132;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m50824x1() {
        return this.f37016x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10621rp, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        m51627k4(c3134k4.m13386x6());
        char[] cArrM26671k4 = new C6773ss().m26671k4(c3134k4.m13372dy(m51409um().m51914du() - 4));
        int i = 0;
        while (i < cArrM26671k4.length) {
            int i2 = i + 1;
            if (cArrM26671k4[i2] == 0) {
                break;
            } else {
                i = i2;
            }
        }
        String strM67406k4 = C14113y2.m67406k4(cArrM26671k4, 0, i);
        this.f37015k4 = strM67406k4;
        this.f37016x1 = C14113y2.m67401k4(strM67406k4, "'", "");
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10621rp, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(m51628kk());
        byte[] bArrMo26677to = new C6773ss().mo26677to(this.f37015k4);
        int length = bArrMo26677to.length < 128 ? bArrMo26677to.length : 128;
        for (int i = 0; i < length; i++) {
            c3149x1.m13443k4(bArrMo26677to[i]);
        }
        while (length < 128) {
            c3149x1.m13443k4((byte) 0);
            length++;
        }
    }
}
