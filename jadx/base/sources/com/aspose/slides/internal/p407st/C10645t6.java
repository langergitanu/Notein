package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.t6 */
/* JADX INFO: loaded from: classes4.dex */
class C10645t6 {

    /* JADX INFO: renamed from: du */
    public byte f37388du;

    /* JADX INFO: renamed from: h4 */
    public long f37389h4;

    /* JADX INFO: renamed from: k4 */
    public long f37390k4;

    /* JADX INFO: renamed from: kk */
    public int f37391kk;

    /* JADX INFO: renamed from: m9 */
    public String f37392m9;

    /* JADX INFO: renamed from: to */
    public byte f37393to;

    /* JADX INFO: renamed from: x1 */
    public long f37394x1;

    /* JADX INFO: renamed from: k4 */
    public int m51723k4() {
        return (this.f37392m9.length() * 2) + 18;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10645t6 m51722k4(AbstractC3150x6 abstractC3150x6) {
        C10645t6 c10645t6 = new C10645t6();
        c10645t6.f37390k4 = C3110yd.m13255x1(abstractC3150x6);
        c10645t6.f37394x1 = C3110yd.m13255x1(abstractC3150x6);
        c10645t6.f37391kk = C3110yd.m13239k4(abstractC3150x6);
        c10645t6.f37393to = (byte) abstractC3150x6.readByte();
        c10645t6.f37388du = (byte) abstractC3150x6.readByte();
        c10645t6.f37389h4 = C3110yd.m13255x1(abstractC3150x6);
        c10645t6.f37392m9 = C14113y2.m67406k4(new C6773ss().m26672kk(C3110yd.m13260x1(abstractC3150x6, ((c10645t6.f37393to & 255) * 2) + 2), 0, ((c10645t6.f37393to & 255) * 2) + 2), 0, c10645t6.f37393to & 255);
        return c10645t6;
    }

    /* JADX INFO: renamed from: k4 */
    public void m51724k4(int i, byte[] bArr) {
        C3110yd.m13258x1(bArr, i, (int) (this.f37390k4 & 4294967295L));
        C3110yd.m13258x1(bArr, i + 4, (int) (this.f37394x1 & 4294967295L));
        C3110yd.m13246k4(bArr, i + 8, (short) (this.f37391kk & 65535));
        bArr[i + 10] = this.f37393to;
        bArr[i + 11] = this.f37388du;
        byte[] bArrM26683x1 = new C6773ss().m26683x1(C14113y2.m67365dy(this.f37392m9));
        int i2 = i + 16;
        System.arraycopy(bArrM26683x1, 0, bArr, i2, bArrM26683x1.length);
        C3110yd.m13246k4(bArr, i2 + bArrM26683x1.length, (short) 0);
    }
}
