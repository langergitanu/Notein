package com.aspose.slides.internal.p397sd;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10223m9 {

    /* JADX INFO: renamed from: du */
    private final C10221k4 f36630du;

    /* JADX INFO: renamed from: k4 */
    private final k4[] f36631k4;

    /* JADX INFO: renamed from: kk */
    private final int f36632kk;

    /* JADX INFO: renamed from: to */
    private final int f36633to;

    /* JADX INFO: renamed from: x1 */
    private final short[] f36634x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.sd.m9$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        public int f36635du;

        /* JADX INFO: renamed from: k4 */
        public short f36636k4;

        /* JADX INFO: renamed from: kk */
        public short f36637kk;

        /* JADX INFO: renamed from: to */
        public short f36638to;

        /* JADX INFO: renamed from: x1 */
        public short f36639x1;

        private k4() {
        }
    }

    public C10223m9(C10221k4 c10221k4, int i) {
        this.f36630du = c10221k4;
        this.f36633to = i;
        m50081kk(i - 1);
        if (i <= 256 || i >= 512) {
            this.f36632kk = 0;
        } else {
            this.f36632kk = m50081kk(i - 257);
        }
        this.f36634x1 = new short[i];
        int i2 = i * 2;
        this.f36631k4 = new k4[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f36631k4[i3] = new k4();
        }
        for (int i4 = 2; i4 < i2; i4++) {
            k4 k4Var = this.f36631k4[i4];
            k4Var.f36636k4 = (short) (i4 / 2);
            k4Var.f36635du = 1;
        }
        for (int i5 = 1; i5 < i; i5++) {
            k4 k4Var2 = this.f36631k4[i5];
            int i6 = i5 * 2;
            k4Var2.f36639x1 = (short) i6;
            k4Var2.f36637kk = (short) (i6 + 1);
        }
        for (int i7 = 0; i7 < i; i7++) {
            k4[] k4VarArr = this.f36631k4;
            k4VarArr[i7].f36638to = (short) -1;
            int i8 = i + i7;
            k4 k4Var3 = k4VarArr[i8];
            k4Var3.f36638to = (short) i7;
            k4Var3.f36639x1 = (short) -1;
            k4Var3.f36637kk = (short) -1;
            this.f36634x1[i7] = (short) i8;
        }
        m50082to(1);
        if (this.f36632kk == 0) {
            for (int i9 = 0; i9 < 2; i9++) {
                for (int i10 = 0; i10 < i; i10++) {
                    m50079du(this.f36634x1[i10]);
                }
            }
            return;
        }
        m50079du(this.f36634x1[256]);
        m50079du(this.f36634x1[257]);
        for (int i11 = 0; i11 < 12; i11++) {
            m50079du(this.f36634x1[i - 3]);
        }
        for (int i12 = 0; i12 < 6; i12++) {
            m50079du(this.f36634x1[i - 2]);
        }
    }

    /* JADX INFO: renamed from: du */
    private void m50079du(int i) {
        while (true) {
            k4[] k4VarArr = this.f36631k4;
            if (i == 1) {
                k4VarArr[i].f36635du++;
                return;
            }
            int i2 = k4VarArr[i].f36635du;
            int i3 = i - 1;
            if (k4VarArr[i3].f36635du == i2) {
                while (true) {
                    int i4 = i3 - 1;
                    if (this.f36631k4[i4].f36635du != i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                if (i3 > 1) {
                    m50080k4(i, i3);
                    i = i3;
                }
            }
            k4 k4Var = this.f36631k4[i];
            k4Var.f36635du = i2 + 1;
            i = k4Var.f36636k4;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static int m50081kk(int i) {
        int i2 = 32;
        while (i2 > 1 && ((1 << (i2 - 1)) & i) == 0) {
            i2--;
        }
        return i2;
    }

    /* JADX INFO: renamed from: to */
    private int m50082to(int i) {
        k4 k4Var = this.f36631k4[i];
        if (k4Var.f36638to < 0) {
            k4Var.f36635du = m50082to(k4Var.f36639x1) + m50082to(this.f36631k4[i].f36637kk);
        }
        return this.f36631k4[i].f36635du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m50083k4(int i) {
        short s = this.f36634x1[i];
        int i2 = 0;
        do {
            i2++;
            s = this.f36631k4[s].f36636k4;
        } while (s != 1);
        return i2 << 16;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50084x1(int i) {
        int i2;
        short s = this.f36634x1[i];
        boolean[] zArr = new boolean[50];
        short s2 = s;
        int i3 = 0;
        while (true) {
            k4[] k4VarArr = this.f36631k4;
            short s3 = k4VarArr[s2].f36636k4;
            i2 = i3 + 1;
            zArr[i3] = k4VarArr[s3].f36637kk == s2;
            if (s3 == 1) {
                break;
            }
            s2 = s3;
            i3 = i2;
        }
        do {
            i2--;
            this.f36630du.m50067k4(zArr[i2]);
        } while (i2 > 0);
        m50079du(s);
    }

    /* JADX INFO: renamed from: k4 */
    private void m50080k4(int i, int i2) {
        k4[] k4VarArr = this.f36631k4;
        k4 k4Var = k4VarArr[i];
        short s = k4Var.f36636k4;
        k4 k4Var2 = k4VarArr[i2];
        short s2 = k4Var2.f36636k4;
        k4VarArr[i] = k4Var2;
        k4VarArr[i2] = k4Var;
        k4 k4Var3 = k4VarArr[i];
        k4Var3.f36636k4 = s;
        k4Var.f36636k4 = s2;
        short s3 = k4Var3.f36638to;
        if (s3 < 0) {
            short s4 = (short) i;
            k4VarArr[k4Var3.f36639x1].f36636k4 = s4;
            k4VarArr[k4Var3.f36637kk].f36636k4 = s4;
        } else {
            this.f36634x1[s3] = (short) i;
        }
        short s5 = k4Var.f36638to;
        if (s5 >= 0) {
            this.f36634x1[s5] = (short) i2;
            return;
        }
        short s6 = (short) i2;
        k4VarArr[k4Var.f36639x1].f36636k4 = s6;
        k4VarArr[k4Var.f36637kk].f36636k4 = s6;
    }
}
