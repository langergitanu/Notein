package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.sq */
/* JADX INFO: loaded from: classes4.dex */
public class C10640sq extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private byte f37372k4;

    /* JADX INFO: renamed from: kk */
    private byte f37373kk;

    /* JADX INFO: renamed from: to */
    private short f37374to;

    /* JADX INFO: renamed from: x1 */
    private short f37375x1;

    public C10640sq() {
        m51409um().m51917k4(4114);
        m51409um().m51920k4((short) 1);
        m51409um().m51916k4((byte) 1);
    }

    /* JADX INFO: renamed from: du */
    public final short m51695du() {
        return this.f37374to;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final short m51696kk() {
        return this.f37375x1;
    }

    /* JADX INFO: renamed from: to */
    public final byte m51697to() {
        return this.f37373kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m51698x1() {
        return this.f37372k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37372k4 = c3134k4.m13387yj();
        this.f37375x1 = (short) (((c3134k4.m13387yj() & 255) * 60) + (c3134k4.m13387yj() & 255));
        c3134k4.m13387yj();
        this.f37373kk = c3134k4.m13387yj();
        this.f37374to = (short) (((c3134k4.m13387yj() & 255) * 60) + (c3134k4.m13387yj() & 255));
        c3134k4.m13387yj();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13443k4(this.f37372k4);
        c3149x1.m13443k4((byte) (this.f37375x1 / 60));
        c3149x1.m13443k4((byte) (this.f37375x1 % 60));
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4(m51697to());
        c3149x1.m13443k4((byte) (this.f37374to / 60));
        c3149x1.m13443k4((byte) (this.f37374to % 60));
        c3149x1.m13443k4((byte) 0);
    }
}
