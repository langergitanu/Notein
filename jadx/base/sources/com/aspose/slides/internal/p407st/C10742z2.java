package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.z2 */
/* JADX INFO: loaded from: classes4.dex */
public class C10742z2 extends AbstractC10402dj {

    /* JADX INFO: renamed from: k4 */
    private String f37557k4;

    public C10742z2() {
        m50673k4(3);
    }

    /* JADX INFO: renamed from: du */
    public final String m52123du() {
        if (this.f37557k4 == null) {
            mo50573to();
        }
        return this.f37557k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10402dj
    /* JADX INFO: renamed from: to */
    public void mo50573to() {
        char[] cArrM26671k4 = new C6773ss().m26671k4(m50675kk());
        if (cArrM26671k4 != null) {
            this.f37557k4 = C14113y2.m67362du(C14113y2.m67405k4(cArrM26671k4), 0);
        }
    }

    public C10742z2(String str) {
        m50673k4(3);
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int iM27441k4 = C7019kk.m27441k4(4) * str.length();
        byte[] bArr = new byte[iM27441k4 + 2];
        int i = 0;
        int i2 = 0;
        while (i < cArrM67365dy.length) {
            bArr[i2] = (byte) cArrM67365dy[i];
            i++;
            i2 += 2;
        }
        bArr[iM27441k4] = 0;
        bArr[iM27441k4 + 1] = 0;
        m50674k4(bArr);
    }
}
