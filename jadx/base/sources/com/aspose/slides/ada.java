package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class ada {

    /* JADX INFO: renamed from: m9 */
    private static final boolean[][] f3879m9 = {new boolean[]{true, false, false, false, false, false, false, false, false, false, false, false}, new boolean[]{false, false, true, true, true, true, true, false, false, false, false, false}};

    /* JADX INFO: renamed from: h4 */
    private xlm f3881h4;

    /* JADX INFO: renamed from: k4 */
    ge7 f3882k4;

    /* JADX INFO: renamed from: kk */
    jkd f3883kk;

    /* JADX INFO: renamed from: to */
    jkd f3884to;

    /* JADX INFO: renamed from: du */
    private int f3880du = 2;

    /* JADX INFO: renamed from: x1 */
    C1104fl f3885x1 = new C1104fl();

    public ada(ge7 ge7Var) {
        this.f3882k4 = ge7Var;
    }

    /* JADX INFO: renamed from: c5 */
    private void m3483c5() {
        m3498x1(8);
    }

    /* JADX INFO: renamed from: ck */
    private void m3484ck() {
        do {
            m3488jd();
        } while (m3494kk(1));
    }

    /* JADX INFO: renamed from: du */
    private void m3485du() {
        m3498x1(4);
    }

    /* JADX INFO: renamed from: dy */
    private void m3486dy() {
        m3498x1(7);
    }

    /* JADX INFO: renamed from: h4 */
    private void m3487h4() {
        m3498x1(5);
    }

    /* JADX INFO: renamed from: jd */
    private void m3488jd() {
        int i = this.f3884to.f45515k4;
        if (i == 2) {
            String[] strArr = {null};
            m3490k4(strArr);
            this.f3881h4.m73485k4(strArr[0]);
            return;
        }
        if (i == 3) {
            String[] strArr2 = {null};
            String[] strArr3 = {null};
            m3491k4(strArr2, strArr3);
            this.f3881h4.m73486k4(strArr2[0], strArr3[0]);
            return;
        }
        if (i == 4) {
            String[] strArr4 = {null};
            m3499x1(strArr4);
            this.f3881h4.m73488x1(strArr4[0]);
            return;
        }
        if (i == 5) {
            String[] strArr5 = {null};
            m3493kk(strArr5);
            this.f3881h4.m73487kk(strArr5[0]);
            return;
        }
        if (i != 6) {
            m3489k4(11);
            return;
        }
        String[] strArr6 = {null};
        String[] strArr7 = {null};
        m3500x1(strArr6, strArr7);
        this.f3881h4.m73489x1(strArr6[0], strArr7[0]);
    }

    /* JADX INFO: renamed from: kk */
    private void m3492kk() {
        m3498x1(2);
    }

    /* JADX INFO: renamed from: m9 */
    private void m3495m9() {
        m3498x1(6);
    }

    /* JADX INFO: renamed from: to */
    private void m3496to() {
        m3498x1(3);
    }

    /* JADX INFO: renamed from: x1 */
    private void m3497x1() {
        while (true) {
            this.f3883kk = this.f3884to;
            jkd jkdVarM6560k4 = this.f3882k4.m6560k4();
            this.f3884to = jkdVarM6560k4;
            if (jkdVarM6560k4.f45515k4 <= 10) {
                this.f3880du++;
                return;
            }
            this.f3884to = this.f3883kk;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3501k4() {
        jkd jkdVar = new jkd();
        this.f3884to = jkdVar;
        jkdVar.f45514h4 = "";
        m3497x1();
        m3484ck();
        m3498x1(0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m3489k4(int i) {
        if (this.f3880du >= 2) {
            C1104fl c1104fl = this.f3885x1;
            jkd jkdVar = this.f3884to;
            c1104fl.m6191k4(jkdVar.f45513du, jkdVar.f45518to, i);
        }
        this.f3880du = 0;
    }

    /* JADX INFO: renamed from: kk */
    private void m3493kk(String[] strArr) {
        m3487h4();
        m3486dy();
        m3498x1(1);
        strArr[0] = this.f3883kk.f45514h4;
        m3483c5();
    }

    /* JADX INFO: renamed from: x1 */
    private void m3498x1(int i) {
        if (this.f3884to.f45515k4 == i) {
            m3497x1();
        } else {
            m3489k4(i);
        }
    }

    /* JADX INFO: renamed from: kk */
    private boolean m3494kk(int i) {
        return f3879m9[i][this.f3884to.f45515k4];
    }

    /* JADX INFO: renamed from: x1 */
    private void m3499x1(String[] strArr) {
        m3485du();
        m3486dy();
        m3498x1(1);
        strArr[0] = this.f3883kk.f45514h4;
        m3483c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3502k4(xlm xlmVar) {
        this.f3881h4 = xlmVar;
    }

    /* JADX INFO: renamed from: k4 */
    private void m3490k4(String[] strArr) {
        m3492kk();
        m3486dy();
        m3498x1(1);
        strArr[0] = this.f3883kk.f45514h4;
        m3483c5();
    }

    /* JADX INFO: renamed from: x1 */
    private void m3500x1(String[] strArr, String[] strArr2) {
        m3495m9();
        m3486dy();
        m3498x1(1);
        strArr2[0] = "0";
        strArr[0] = this.f3883kk.f45514h4;
        while (this.f3884to.f45515k4 == 1) {
            m3497x1();
            strArr2[0] = this.f3883kk.f45514h4;
        }
        m3483c5();
    }

    /* JADX INFO: renamed from: k4 */
    private void m3491k4(String[] strArr, String[] strArr2) {
        m3496to();
        m3486dy();
        m3498x1(1);
        String str = this.f3883kk.f45514h4;
        strArr[0] = str;
        strArr2[0] = str;
        while (this.f3884to.f45515k4 == 9) {
            m3497x1();
            m3498x1(1);
            strArr2[0] = this.f3883kk.f45514h4;
        }
        m3483c5();
    }
}
