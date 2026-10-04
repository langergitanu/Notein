package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.jm */
/* JADX INFO: loaded from: classes4.dex */
public class C10497jm extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private byte f37107du;

    /* JADX INFO: renamed from: k4 */
    private String f37108k4;

    /* JADX INFO: renamed from: kk */
    private byte f37109kk;

    /* JADX INFO: renamed from: to */
    private byte f37110to;

    /* JADX INFO: renamed from: x1 */
    private byte f37111x1;

    public C10497jm() {
        m51409um().m51917k4(4023);
    }

    /* JADX INFO: renamed from: du */
    public final byte m51019du() {
        return (byte) (this.f37107du & 240);
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m51020h4() {
        return (byte) (this.f37107du & 15);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 68;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m51023kk() {
        return this.f37111x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m51025m9() {
        return this.f37107du;
    }

    /* JADX INFO: renamed from: to */
    public final byte m51026to() {
        return this.f37109kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m51028x1() {
        return this.f37108k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51021k4(byte b) {
        this.f37111x1 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51024kk(byte b) {
        this.f37110to = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m51027to(byte b) {
        this.f37107du = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51029x1(byte b) {
        this.f37109kk = b;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37108k4 = "";
        String strM67405k4 = C14113y2.m67405k4(new C6773ss().m26671k4(c3134k4.m13372dy(64)));
        this.f37108k4 = strM67405k4;
        int iM67429to = C14113y2.m67429to(strM67405k4, (char) 0);
        if (iM67429to > -1) {
            this.f37108k4 = C14113y2.m67443x1(this.f37108k4, 0, iM67429to);
        }
        this.f37111x1 = c3134k4.m13387yj();
        this.f37109kk = c3134k4.m13387yj();
        this.f37110to = c3134k4.m13387yj();
        this.f37107du = c3134k4.m13387yj();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        byte[] bArrM26683x1 = new C6773ss().m26683x1(C14113y2.m67365dy(this.f37108k4.length() > 31 ? C14113y2.m67443x1(this.f37108k4, 0, 31) : this.f37108k4));
        byte[] bArr = new byte[64];
        System.arraycopy(bArrM26683x1, 0, bArr, 0, bArrM26683x1.length);
        c3149x1.m13450k4(bArr);
        c3149x1.m13443k4(this.f37111x1);
        c3149x1.m13443k4(this.f37109kk);
        c3149x1.m13443k4(this.f37110to);
        c3149x1.m13443k4(this.f37107du);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51022k4(String str) {
        this.f37108k4 = str;
    }
}
