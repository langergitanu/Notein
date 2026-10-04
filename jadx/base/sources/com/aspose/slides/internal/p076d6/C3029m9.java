package com.aspose.slides.internal.p076d6;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d6.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3029m9 extends AbstractC3028kk {

    /* JADX INFO: renamed from: k4 */
    static final String f8870k4 = C14113y2.m67408k4("Use of this API is highly discouraged, ", "it selects legacy-mode LM/NTLM authentication, which sends ", "your password in very weak encryption over the wire even if ", "the server supports the more secure NTLMv2 / NTLMv2 Session. ", "You need to use the new `Type3Message (Type2Message)' constructor ", "to use the more secure NTLMv2 / NTLMv2 Session authentication modes. ", "These require the Type 2 message from the server to compute the response.");

    /* JADX INFO: renamed from: c5 */
    private byte[] f8871c5;

    /* JADX INFO: renamed from: du */
    private String f8872du;

    /* JADX INFO: renamed from: dy */
    private C3026h4 f8873dy;

    /* JADX INFO: renamed from: h4 */
    private String f8874h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f8875jd;

    /* JADX INFO: renamed from: kk */
    private byte[] f8876kk;

    /* JADX INFO: renamed from: m9 */
    private String f8877m9;

    /* JADX INFO: renamed from: to */
    private String f8878to;

    /* JADX INFO: renamed from: x1 */
    private int f8879x1;

    @Deprecated
    public C3029m9() {
        super(3);
        if (m12755to() != 0) {
            throw new InvalidOperationException(C14113y2.m67408k4("Refusing to use legacy-mode LM/NTLM authentication ", "unless explicitly enabled using DefaultAuthLevel."));
        }
        this.f8872du = C14052dq.m66562h4();
        this.f8878to = C14052dq.m66576x1();
        this.f8874h4 = C14052dq.m66572m9();
        this.f8879x1 = 0;
        m12750k4(33281);
    }

    /* JADX INFO: renamed from: k4 */
    private String m12754k4(byte[] bArr, int i, int i2) {
        return ((m12749k4() & 1) != 0 ? AbstractC6747ar.m26643rv() : AbstractC6747ar.m26650yj()).mo26682x1(bArr, i, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: to */
    public static int m12755to() {
        return C3030to.m12760k4();
    }

    public void finalize() throws Throwable {
        byte[] bArr = this.f8876kk;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
        byte[] bArr2 = this.f8871c5;
        if (bArr2 != null) {
            AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
        }
        byte[] bArr3 = this.f8875jd;
        if (bArr3 != null) {
            AbstractC14092to.m67225k4(bArr3, 0, bArr3.length);
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: kk */
    public void m12758kk(String str) {
        this.f8874h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12759x1(String str) {
        this.f8877m9 = str;
    }

    public C3029m9(C3026h4 c3026h4) {
        super(3);
        this.f8873dy = c3026h4;
        this.f8879x1 = m12755to();
        this.f8876kk = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) c3026h4.m12740to()).deepClone(), byte[].class);
        this.f8872du = c3026h4.m12738du();
        this.f8878to = C14052dq.m66576x1();
        this.f8874h4 = C14052dq.m66572m9();
        m12750k4(33280);
        m12750k4((c3026h4.m12749k4() & 1) != 0 ? m12749k4() | 1 : m12749k4() | 2);
        if ((c3026h4.m12749k4() & 524288) != 0) {
            m12750k4(m12749k4() | 524288);
        }
    }

    /* JADX INFO: renamed from: to */
    private byte[] m12756to(String str) {
        return str == null ? new byte[0] : (m12749k4() & 1) != 0 ? AbstractC6747ar.m26643rv().mo26677to(str) : AbstractC6747ar.m26650yj().mo26677to(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12757k4(String str) {
        if (str == null) {
            str = "";
        }
        m12750k4("".equals(str) ? m12749k4() & (-4097) : m12749k4() | 4096);
        this.f8872du = str;
    }

    @Override // com.aspose.slides.internal.p076d6.AbstractC3028kk
    /* JADX INFO: renamed from: kk */
    public byte[] mo12736kk() {
        byte[] bArrM12747k4;
        byte[] bArrM12748x1;
        byte[] bArrM12756to = m12756to(this.f8872du);
        byte[] bArrM12756to2 = m12756to(this.f8874h4);
        byte[] bArrM12756to3 = m12756to(this.f8878to);
        C3026h4 c3026h4 = this.f8873dy;
        if (c3026h4 != null) {
            byte[][] bArr = {null};
            byte[][] bArr2 = {null};
            C3031x1.m12761k4(c3026h4, this.f8879x1, this.f8874h4, this.f8877m9, this.f8872du, bArr, bArr2);
            bArrM12747k4 = bArr[0];
            bArrM12748x1 = bArr2[0];
        } else {
            if (this.f8879x1 != 0) {
                throw new InvalidOperationException(C14113y2.m67408k4("Refusing to use legacy-mode LM/NTLM authentication ", "unless explicitly enabled using DefaultAuthLevel."));
            }
            C3027k4 c3027k4 = new C3027k4(this.f8877m9, this.f8876kk);
            try {
                bArrM12747k4 = c3027k4.m12747k4();
                bArrM12748x1 = c3027k4.m12748x1();
            } finally {
                c3027k4.dispose();
            }
        }
        int length = bArrM12747k4 != null ? bArrM12747k4.length : 0;
        int length2 = bArrM12748x1 != null ? bArrM12748x1.length : 0;
        byte[] bArrM12753x1 = m12753x1(bArrM12756to.length + 64 + bArrM12756to2.length + bArrM12756to3.length + length + length2);
        short sM27468x1 = C7019kk.m27468x1(Integer.valueOf(bArrM12756to.length + 64 + bArrM12756to2.length + bArrM12756to3.length), 9);
        bArrM12753x1[12] = C7019kk.m27442k4(Integer.valueOf(length), 9);
        bArrM12753x1[13] = C7019kk.m27442k4((Object) 0, 9);
        bArrM12753x1[14] = C7019kk.m27442k4(Integer.valueOf(length), 9);
        bArrM12753x1[15] = C7019kk.m27442k4((Object) 0, 9);
        bArrM12753x1[16] = C7019kk.m27442k4(Short.valueOf(sM27468x1), 7);
        bArrM12753x1[17] = C7019kk.m27442k4(Integer.valueOf(sM27468x1 >> 8), 9);
        short sM27468x12 = C7019kk.m27468x1(Integer.valueOf(length + sM27468x1), 9);
        bArrM12753x1[20] = C7019kk.m27442k4(Integer.valueOf(length2), 9);
        int i = length2 >> 8;
        bArrM12753x1[21] = C7019kk.m27442k4(Integer.valueOf(i), 9);
        bArrM12753x1[22] = C7019kk.m27442k4(Integer.valueOf(length2), 9);
        bArrM12753x1[23] = C7019kk.m27442k4(Integer.valueOf(i), 9);
        bArrM12753x1[24] = C7019kk.m27442k4(Short.valueOf(sM27468x12), 7);
        bArrM12753x1[25] = C7019kk.m27442k4(Integer.valueOf(sM27468x12 >> 8), 9);
        short sM27468x13 = C7019kk.m27468x1(Integer.valueOf(bArrM12756to.length), 9);
        bArrM12753x1[28] = C7019kk.m27442k4(Short.valueOf(sM27468x13), 7);
        byte bM27442k4 = C7019kk.m27442k4(Integer.valueOf(sM27468x13 >> 8), 9);
        bArrM12753x1[29] = bM27442k4;
        bArrM12753x1[30] = bArrM12753x1[28];
        bArrM12753x1[31] = bM27442k4;
        bArrM12753x1[32] = C7019kk.m27442k4((Object) (short) 64, 7);
        bArrM12753x1[33] = C7019kk.m27442k4((Object) 0, 9);
        short sM27468x14 = C7019kk.m27468x1(Integer.valueOf(bArrM12756to2.length), 9);
        short sM27468x15 = C7019kk.m27468x1(Integer.valueOf(sM27468x13 + 64), 9);
        bArrM12753x1[36] = C7019kk.m27442k4(Short.valueOf(sM27468x14), 7);
        byte bM27442k42 = C7019kk.m27442k4(Integer.valueOf(sM27468x14 >> 8), 9);
        bArrM12753x1[37] = bM27442k42;
        bArrM12753x1[38] = bArrM12753x1[36];
        bArrM12753x1[39] = bM27442k42;
        bArrM12753x1[40] = C7019kk.m27442k4(Short.valueOf(sM27468x15), 7);
        bArrM12753x1[41] = C7019kk.m27442k4(Integer.valueOf(sM27468x15 >> 8), 9);
        short sM27468x16 = C7019kk.m27468x1(Integer.valueOf(bArrM12756to3.length), 9);
        short sM27468x17 = C7019kk.m27468x1(Integer.valueOf(sM27468x14 + sM27468x15), 9);
        bArrM12753x1[44] = C7019kk.m27442k4(Short.valueOf(sM27468x16), 7);
        byte bM27442k43 = C7019kk.m27442k4(Integer.valueOf(sM27468x16 >> 8), 9);
        bArrM12753x1[45] = bM27442k43;
        bArrM12753x1[46] = bArrM12753x1[44];
        bArrM12753x1[47] = bM27442k43;
        bArrM12753x1[48] = C7019kk.m27442k4(Short.valueOf(sM27468x17), 7);
        bArrM12753x1[49] = C7019kk.m27442k4(Integer.valueOf(sM27468x17 >> 8), 9);
        short sM27468x18 = C7019kk.m27468x1(Integer.valueOf(bArrM12753x1.length), 9);
        bArrM12753x1[56] = C7019kk.m27442k4(Short.valueOf(sM27468x18), 7);
        bArrM12753x1[57] = C7019kk.m27442k4(Integer.valueOf(sM27468x18 >> 8), 9);
        int iM12749k4 = m12749k4();
        bArrM12753x1[60] = C7019kk.m27442k4(Integer.valueOf(iM12749k4), 9);
        bArrM12753x1[61] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(iM12749k4), 9)), 10) >> 8), 10)), 10);
        bArrM12753x1[62] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(iM12749k4), 9)), 10) >> 16), 10)), 10);
        bArrM12753x1[63] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(iM12749k4), 9)), 10) >> 24), 10)), 10);
        C14058fa.m66596k4(bArrM12756to, 0, bArrM12753x1, 64, bArrM12756to.length);
        C14058fa.m66596k4(bArrM12756to2, 0, bArrM12753x1, (int) sM27468x15, bArrM12756to2.length);
        C14058fa.m66596k4(bArrM12756to3, 0, bArrM12753x1, (int) sM27468x17, bArrM12756to3.length);
        if (bArrM12747k4 != null) {
            C14058fa.m66596k4(bArrM12747k4, 0, bArrM12753x1, (int) sM27468x1, bArrM12747k4.length);
            AbstractC14092to.m67225k4(bArrM12747k4, 0, bArrM12747k4.length);
        }
        C14058fa.m66596k4(bArrM12748x1, 0, bArrM12753x1, (int) sM27468x12, bArrM12748x1.length);
        AbstractC14092to.m67225k4(bArrM12748x1, 0, bArrM12748x1.length);
        return bArrM12753x1;
    }

    @Override // com.aspose.slides.internal.p076d6.AbstractC3028kk
    /* JADX INFO: renamed from: k4 */
    public void mo12735k4(byte[] bArr) {
        super.mo12735k4(bArr);
        this.f8877m9 = null;
        m12750k4(bArr.length >= 64 ? C7019kk.m27462to(Long.valueOf(C14069jd.m66784x1(bArr, 60)), 10) : 33281);
        int iM27462to = C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 12)), 8);
        int iM27462to2 = C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 16)), 8);
        byte[] bArr2 = new byte[iM27462to];
        this.f8871c5 = bArr2;
        C14058fa.m66596k4(bArr, iM27462to2, bArr2, 0, iM27462to);
        int iM27462to3 = C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 20)), 8);
        int iM27462to4 = C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 24)), 8);
        byte[] bArr3 = new byte[iM27462to3];
        this.f8875jd = bArr3;
        C14058fa.m66596k4(bArr, iM27462to4, bArr3, 0, iM27462to3);
        this.f8872du = m12754k4(bArr, C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 32)), 8), C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 28)), 8));
        this.f8874h4 = m12754k4(bArr, C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 40)), 8), C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 36)), 8));
        this.f8878to = m12754k4(bArr, C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 48)), 8), C7019kk.m27462to(Integer.valueOf(C14069jd.m66769k4(bArr, 44)), 8));
    }
}
