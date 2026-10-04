package com.aspose.slides.internal.p076d6;

import com.aspose.slides.internal.p174hz.AbstractC4720he;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.d6.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3026h4 extends AbstractC3028kk {

    /* JADX INFO: renamed from: k4 */
    private byte[] f8858k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f8859kk;

    /* JADX INFO: renamed from: x1 */
    private String f8860x1;

    public C3026h4() {
        super(2);
        this.f8858k4 = new byte[8];
        AbstractC4720he.m19622k4().mo19624k4(this.f8858k4);
        m12750k4(33281);
    }

    /* JADX INFO: renamed from: du */
    public String m12738du() {
        return this.f8860x1;
    }

    public void finalize() throws Throwable {
        byte[] bArr = this.f8858k4;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
        super.finalize();
    }

    /* JADX INFO: renamed from: h4 */
    public byte[] m12739h4() {
        return (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) this.f8859kk).deepClone(), byte[].class);
    }

    @Override // com.aspose.slides.internal.p076d6.AbstractC3028kk
    /* JADX INFO: renamed from: k4 */
    public void mo12735k4(byte[] bArr) {
        super.mo12735k4(bArr);
        m12750k4(C7019kk.m27462to(Long.valueOf(C14069jd.m66784x1(bArr, 20)), 10));
        C14058fa.m66596k4(bArr, 24, this.f8858k4, 0, 8);
        int iM66769k4 = C14069jd.m66769k4(bArr, 12);
        int iM66769k42 = C14069jd.m66769k4(bArr, 16);
        if (C7019kk.m27457kk(Integer.valueOf(iM66769k4), 8) > 0) {
            this.f8860x1 = ((m12749k4() & 2) != 0 ? AbstractC6747ar.m26650yj() : AbstractC6747ar.m26643rv()).mo26682x1(bArr, C7019kk.m27462to(Integer.valueOf(iM66769k42), 8), C7019kk.m27462to(Integer.valueOf(iM66769k4), 8));
        }
        if (bArr.length >= 48) {
            int iM66769k43 = C14069jd.m66769k4(bArr, 40);
            int iM66769k44 = C14069jd.m66769k4(bArr, 44);
            if (C7019kk.m27457kk(Integer.valueOf(iM66769k43), 8) > 0) {
                this.f8859kk = new byte[C7019kk.m27457kk(Integer.valueOf(iM66769k43), 8)];
                C14058fa.m66596k4(bArr, C7019kk.m27462to(Integer.valueOf(iM66769k44), 8), this.f8859kk, 0, C7019kk.m27462to(Integer.valueOf(iM66769k43), 8));
            }
        }
    }

    @Override // com.aspose.slides.internal.p076d6.AbstractC3028kk
    /* JADX INFO: renamed from: kk */
    public byte[] mo12736kk() {
        byte[] bArrM12753x1 = m12753x1(40);
        short sM27468x1 = C7019kk.m27468x1(Integer.valueOf(bArrM12753x1.length), 9);
        bArrM12753x1[16] = C7019kk.m27442k4(Short.valueOf(sM27468x1), 7);
        bArrM12753x1[17] = C7019kk.m27442k4(Integer.valueOf(sM27468x1 >> 8), 9);
        bArrM12753x1[20] = (byte) m12749k4();
        bArrM12753x1[21] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(m12749k4()), 10) >> 8), 10)), 10);
        bArrM12753x1[22] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(m12749k4()), 10) >> 16), 10)), 10);
        bArrM12753x1[23] = C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(m12749k4()), 10) >> 24), 10)), 10);
        byte[] bArr = this.f8858k4;
        C14058fa.m66596k4(bArr, 0, bArrM12753x1, 24, bArr.length);
        return bArrM12753x1;
    }

    /* JADX INFO: renamed from: to */
    public byte[] m12740to() {
        return (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) this.f8858k4).deepClone(), byte[].class);
    }

    public C3026h4(byte[] bArr) {
        super(2);
        this.f8858k4 = new byte[8];
        mo12735k4(bArr);
    }
}
