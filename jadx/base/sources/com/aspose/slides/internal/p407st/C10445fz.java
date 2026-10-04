package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.fz */
/* JADX INFO: loaded from: classes4.dex */
public class C10445fz extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private float f37007du;

    /* JADX INFO: renamed from: dy */
    private byte f37008dy;

    /* JADX INFO: renamed from: h4 */
    private float f37009h4;

    /* JADX INFO: renamed from: k4 */
    private int f37010k4;

    /* JADX INFO: renamed from: kk */
    private float f37011kk;

    /* JADX INFO: renamed from: m9 */
    private float f37012m9;

    /* JADX INFO: renamed from: to */
    private float f37013to;

    /* JADX INFO: renamed from: x1 */
    private float f37014x1;

    public C10445fz() {
        m51409um().m51917k4(61753);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m50802c5() {
        return (this.f37010k4 & 1) == 1;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m50803ck() {
        return (this.f37010k4 & 4) == 4;
    }

    /* JADX INFO: renamed from: du */
    public final float m50804du() {
        return this.f37007du;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m50806dy() {
        return this.f37008dy;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m50807fa() {
        return (this.f37010k4 & 8) == 8;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m50808h4() {
        return this.f37009h4;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m50810jd() {
        return (this.f37010k4 & 2) == 2;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 32;
    }

    /* JADX INFO: renamed from: kk */
    public final float m50814kk() {
        return this.f37011kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m50817m9() {
        return this.f37012m9;
    }

    /* JADX INFO: renamed from: to */
    public final float m50818to() {
        return this.f37013to;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m50821x1() {
        return this.f37014x1;
    }

    /* JADX INFO: renamed from: du */
    public final void m50805du(float f) {
        this.f37009h4 = f;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m50809h4(float f) {
        this.f37012m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50811k4(byte b) {
        this.f37008dy = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50815kk(float f) {
        this.f37013to = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m50819to(float f) {
        this.f37007du = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50822x1(float f) {
        this.f37011kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50812k4(float f) {
        this.f37014x1 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50816kk(boolean z) {
        this.f37010k4 = z ? this.f37010k4 | 4 : this.f37010k4 & (-5);
    }

    /* JADX INFO: renamed from: to */
    public final void m50820to(boolean z) {
        this.f37010k4 = z ? this.f37010k4 | 8 : this.f37010k4 & (-9);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50823x1(boolean z) {
        this.f37010k4 = z ? this.f37010k4 | 2 : this.f37010k4 & (-3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37010k4 = c3134k4.m13386x6();
        this.f37014x1 = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37011kk = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37013to = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37007du = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37009h4 = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37012m9 = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37008dy = c3134k4.m13387yj();
        c3134k4.m13372dy(3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37010k4);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37014x1), 0) & 4294967295L);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37011kk), 0) & 4294967295L);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37013to), 0) & 4294967295L);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37007du), 0) & 4294967295L);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37009h4), 0) & 4294967295L);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37012m9), 0) & 4294967295L);
        c3149x1.m13443k4(this.f37008dy);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50813k4(boolean z) {
        this.f37010k4 = z ? this.f37010k4 | 1 : this.f37010k4 & (-2);
    }
}
