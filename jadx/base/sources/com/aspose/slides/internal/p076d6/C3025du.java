package com.aspose.slides.internal.p076d6;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d6.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3025du extends AbstractC3028kk {

    /* JADX INFO: renamed from: k4 */
    private String f8856k4;

    /* JADX INFO: renamed from: x1 */
    private String f8857x1;

    public C3025du() {
        super(1);
        this.f8857x1 = C14052dq.m66562h4();
        this.f8856k4 = C14052dq.m66576x1();
        m12750k4(45575);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12734k4(String str) {
        if (str == null) {
            str = "";
        }
        m12750k4("".equals(str) ? m12749k4() & (-4097) : m12749k4() | 4096);
        this.f8857x1 = str;
    }

    @Override // com.aspose.slides.internal.p076d6.AbstractC3028kk
    /* JADX INFO: renamed from: kk */
    public byte[] mo12736kk() {
        short sM27468x1 = C7019kk.m27468x1(Integer.valueOf(this.f8857x1.length()), 9);
        short sM27468x12 = C7019kk.m27468x1(Integer.valueOf(this.f8856k4.length()), 9);
        byte[] bArrM12753x1 = m12753x1(sM27468x1 + 32 + sM27468x12);
        bArrM12753x1[12] = (byte) m12749k4();
        bArrM12753x1[13] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(m12749k4()), 10) >> 8), 10)), 10);
        bArrM12753x1[14] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(m12749k4()), 10) >> 16), 10)), 10);
        bArrM12753x1[15] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(m12749k4()), 10) >> 24), 10)), 10);
        short sM27468x13 = C7019kk.m27468x1(Integer.valueOf(sM27468x12 + 32), 9);
        bArrM12753x1[16] = C7019kk.m27442k4(Short.valueOf(sM27468x1), 7);
        byte bM27442k4 = C7019kk.m27442k4(Integer.valueOf(sM27468x1 >> 8), 9);
        bArrM12753x1[17] = bM27442k4;
        bArrM12753x1[18] = bArrM12753x1[16];
        bArrM12753x1[19] = bM27442k4;
        bArrM12753x1[20] = C7019kk.m27442k4(Short.valueOf(sM27468x13), 7);
        bArrM12753x1[21] = C7019kk.m27442k4(Integer.valueOf(sM27468x13 >> 8), 9);
        bArrM12753x1[24] = C7019kk.m27442k4(Short.valueOf(sM27468x12), 7);
        byte bM27442k42 = C7019kk.m27442k4(Integer.valueOf(sM27468x12 >> 8), 9);
        bArrM12753x1[25] = bM27442k42;
        bArrM12753x1[26] = bArrM12753x1[24];
        bArrM12753x1[27] = bM27442k42;
        bArrM12753x1[28] = 32;
        bArrM12753x1[29] = 0;
        byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to(C14113y2.m67444x1(this.f8856k4, C11697x1.m55250kk()));
        C14058fa.m66596k4(bArrMo26677to, 0, bArrM12753x1, 32, bArrMo26677to.length);
        byte[] bArrMo26677to2 = AbstractC6747ar.m26650yj().mo26677to(C14113y2.m67444x1(this.f8857x1, C11697x1.m55250kk()));
        C14058fa.m66596k4(bArrMo26677to2, 0, bArrM12753x1, (int) sM27468x13, bArrMo26677to2.length);
        return bArrM12753x1;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12737x1(String str) {
        if (str == null) {
            str = "";
        }
        m12750k4("".equals(str) ? m12749k4() & (-8193) : m12749k4() | 8192);
        this.f8856k4 = str;
    }

    @Override // com.aspose.slides.internal.p076d6.AbstractC3028kk
    /* JADX INFO: renamed from: k4 */
    public void mo12735k4(byte[] bArr) {
        super.mo12735k4(bArr);
        m12750k4(C7019kk.m27462to(Long.valueOf(C14069jd.m66784x1(bArr, 12)), 10));
        int iM27462to = C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 16)), 8);
        this.f8857x1 = AbstractC6747ar.m26650yj().mo26682x1(bArr, C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 20)), 8), iM27462to);
        this.f8856k4 = AbstractC6747ar.m26650yj().mo26682x1(bArr, 32, C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 24)), 8));
    }
}
