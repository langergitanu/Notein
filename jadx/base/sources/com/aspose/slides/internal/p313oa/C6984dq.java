package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.dq */
/* JADX INFO: loaded from: classes4.dex */
class C6984dq extends AbstractC7008wy {

    /* JADX INFO: renamed from: k4 */
    private float[] f18991k4 = new float[9];

    /* JADX INFO: renamed from: x1 */
    private AbstractC6981c5[] f18992x1 = new AbstractC6981c5[3];

    @Override // com.aspose.slides.internal.p313oa.AbstractC7008wy
    /* JADX INFO: renamed from: k4 */
    public void mo27326k4() {
        if (m27411to().m27423x1().f19015h4 != 1482250784) {
            throw new C6993kk();
        }
        super.mo27326k4();
        m27328k4(1918392666, (byte) 0, (byte) 3, (byte) 6);
        m27328k4(1733843290, (byte) 1, (byte) 4, (byte) 7);
        m27328k4(1649957210, (byte) 2, (byte) 5, (byte) 8);
        if (m27407du()) {
            this.f18992x1[0] = m27408k4(1918128707);
            this.f18992x1[1] = m27408k4(1733579331);
            this.f18992x1[2] = m27408k4(1649693251);
        } else {
            this.f18992x1[0] = m27413x1(1918128707);
            this.f18992x1[1] = m27413x1(1733579331);
            this.f18992x1[2] = m27413x1(1649693251);
            if (!C6979b3.m27313x1(this.f18991k4)) {
                throw new C7004up();
            }
        }
        this.f18992x1[0].m27316k4();
        this.f18992x1[1].m27316k4();
        this.f18992x1[2].m27316k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m27328k4(int i, byte b, byte b2, byte b3) {
        C7012yd c7012yd = (C7012yd) m27411to().m27420k4(i);
        if (c7012yd == null) {
            throw new C6997ne();
        }
        this.f18991k4[C7019kk.m27462to(Byte.valueOf(b), 6)] = c7012yd.m27424up().f19006k4;
        this.f18991k4[C7019kk.m27462to(Byte.valueOf(b2), 6)] = c7012yd.m27424up().f19008x1;
        this.f18991k4[C7019kk.m27462to(Byte.valueOf(b3), 6)] = c7012yd.m27424up().f19007kk;
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7008wy
    /* JADX INFO: renamed from: k4 */
    public void mo27327k4(float[] fArr) {
        m27414x1(fArr);
        if (m27407du()) {
            float fMo27315k4 = this.f18992x1[0].mo27315k4(fArr[0]);
            float fMo27315k42 = this.f18992x1[1].mo27315k4(fArr[1]);
            float fMo27315k43 = this.f18992x1[2].mo27315k4(fArr[2]);
            float[] fArr2 = this.f18991k4;
            fArr[0] = C6999rv.m27383k4((fArr2[2] * fMo27315k43) + (fArr2[1] * fMo27315k42) + (fArr2[0] * fMo27315k4));
            float[] fArr3 = this.f18991k4;
            fArr[1] = C6999rv.m27383k4((fArr3[5] * fMo27315k43) + (fArr3[4] * fMo27315k42) + (fArr3[3] * fMo27315k4));
            float[] fArr4 = this.f18991k4;
            fArr[2] = C6999rv.m27383k4((fArr4[8] * fMo27315k43) + (fArr4[7] * fMo27315k42) + (fArr4[6] * fMo27315k4));
        } else {
            float fM27394x1 = C6999rv.m27394x1(fArr[0]);
            float fM27394x12 = C6999rv.m27394x1(fArr[1]);
            float fM27394x13 = C6999rv.m27394x1(fArr[2]);
            AbstractC6981c5 abstractC6981c5 = this.f18992x1[0];
            float[] fArr5 = this.f18991k4;
            fArr[0] = abstractC6981c5.mo27315k4(C6979b3.m27309kk((fArr5[2] * fM27394x13) + (fArr5[1] * fM27394x12) + (fArr5[0] * fM27394x1)));
            AbstractC6981c5 abstractC6981c52 = this.f18992x1[1];
            float[] fArr6 = this.f18991k4;
            fArr[1] = abstractC6981c52.mo27315k4(C6979b3.m27309kk((fArr6[5] * fM27394x13) + (fArr6[4] * fM27394x12) + (fArr6[3] * fM27394x1)));
            AbstractC6981c5 abstractC6981c53 = this.f18992x1[2];
            float[] fArr7 = this.f18991k4;
            fArr[2] = abstractC6981c53.mo27315k4(C6979b3.m27309kk((fArr7[8] * fM27394x13) + (fArr7[7] * fM27394x12) + (fArr7[6] * fM27394x1)));
        }
        m27410kk(fArr);
    }
}
