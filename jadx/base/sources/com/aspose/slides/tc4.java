package com.aspose.slides;

import com.aspose.slides.exceptions.MethodAccessException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14069jd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class tc4 {

    /* JADX INFO: renamed from: m9 */
    private static final AbstractC14542k4 f49094m9 = m71075jd();

    /* JADX INFO: renamed from: du */
    private final byte[] f49095du;

    /* JADX INFO: renamed from: h4 */
    private int f49096h4 = -1;

    /* JADX INFO: renamed from: k4 */
    private final int f49097k4;

    /* JADX INFO: renamed from: kk */
    private float f49098kk;

    /* JADX INFO: renamed from: to */
    private float f49099to;

    /* JADX INFO: renamed from: x1 */
    private final int f49100x1;

    /* JADX INFO: renamed from: com.aspose.slides.tc4$k4 */
    public static abstract class AbstractC14542k4 {
        private AbstractC14542k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public static C12009k4 m71089k4(C12009k4 c12009k4, int i) {
            if (c12009k4.mo15753jd() == i) {
                return c12009k4;
            }
            C12009k4 c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), i);
            c12009k42.m56332k4(C12567ne.m58657k4(c12009k4), C12567ne.m58660x1(c12009k4));
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56486y6().Clone());
            abstractC12008jdM56582k4.mo17495k4(1);
            abstractC12008jdM56582k4.mo17589x1(c12009k4, 0, 0);
            abstractC12008jdM56582k4.dispose();
            return c12009k42;
        }

        /* JADX INFO: renamed from: k4 */
        public abstract C12009k4 mo71090k4(tc4 tc4Var);

        /* JADX INFO: renamed from: k4 */
        public abstract tc4 mo71091k4(C12009k4 c12009k4);
    }

    /* JADX INFO: renamed from: com.aspose.slides.tc4$kk */
    public static class C14543kk extends AbstractC14542k4 {
        private C14543kk() {
            super();
        }

        @Override // com.aspose.slides.tc4.AbstractC14542k4
        /* JADX INFO: renamed from: k4 */
        public C12009k4 mo71090k4(tc4 tc4Var) {
            int i = tc4Var.f49097k4;
            int i2 = tc4Var.f49100x1;
            tc4Var.m71081du();
            C12009k4 c12009k4 = new C12009k4(i, i2, tc4Var.m71084k4() ? 2498570 : 139273);
            if (tc4Var.m71084k4()) {
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    for (int i5 = 0; i5 < i; i5++) {
                        c12009k4.m56604k4(i5, i4, C12003du.m56398k4(tc4Var.f49095du[i3 + 3] & 255, tc4Var.f49095du[i3 + 2] & 255, tc4Var.f49095du[i3 + 1] & 255, tc4Var.f49095du[i3] & 255).Clone());
                        i3 += 4;
                    }
                }
            } else {
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    for (int i8 = 0; i8 < i; i8++) {
                        c12009k4.m56604k4(i8, i7, C12003du.m56397k4(tc4Var.f49095du[i6 + 2] & 255, tc4Var.f49095du[i6 + 1] & 255, tc4Var.f49095du[i6] & 255).Clone());
                        i6 += 4;
                    }
                }
            }
            return c12009k4;
        }

        @Override // com.aspose.slides.tc4.AbstractC14542k4
        /* JADX INFO: renamed from: k4 */
        public tc4 mo71091k4(C12009k4 c12009k4) {
            int iMo15760yj = c12009k4.mo15760yj();
            int iMo15757m9 = c12009k4.mo15757m9();
            tc4 tc4Var = new tc4(iMo15760yj, iMo15757m9);
            boolean zM56321kk = AbstractC12002ck.m56321kk(c12009k4.mo15753jd());
            if (!zM56321kk) {
                tc4Var.m71086m9();
            }
            int i = 0;
            for (int i2 = 0; i2 < iMo15757m9; i2++) {
                for (int i3 = 0; i3 < iMo15760yj; i3++) {
                    C12003du c12003duClone = c12009k4.m56609x1(i3, i2).Clone();
                    tc4Var.f49095du[i] = c12003duClone.m56505fa();
                    tc4Var.f49095du[i + 1] = c12003duClone.m56502ck();
                    tc4Var.f49095du[i + 2] = c12003duClone.m56507jd();
                    tc4Var.f49095du[i + 3] = zM56321kk ? c12003duClone.m56501c5() : (byte) -1;
                    i += 4;
                }
            }
            return tc4Var;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.tc4$to */
    public static class C14544to extends AbstractC14542k4 {
        private C14544to() {
            super();
        }

        @Override // com.aspose.slides.tc4.AbstractC14542k4
        /* JADX INFO: renamed from: k4 */
        public C12009k4 mo71090k4(tc4 tc4Var) {
            tc4Var.m71081du();
            C12009k4 c12009k4 = new C12009k4(tc4Var.f49097k4, tc4Var.f49100x1, tc4Var.m71084k4() ? 2498570 : 139273);
            C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 2, c12009k4.mo15753jd());
            C3914k4.m15621k4(tc4Var.f49095du, 0, c3983k4M56597k4.m15721to(), tc4Var.f49095du.length);
            c12009k4.m56605k4(c3983k4M56597k4);
            return c12009k4;
        }

        @Override // com.aspose.slides.tc4.AbstractC14542k4
        /* JADX INFO: renamed from: k4 */
        public tc4 mo71091k4(C12009k4 c12009k4) {
            int i = AbstractC12002ck.m56321kk(c12009k4.mo15753jd()) ? 2498570 : 139273;
            int iM56311k4 = AbstractC12002ck.m56311k4(c12009k4.mo15753jd()) / 8;
            if (c12009k4.mo15753jd() != i && iM56311k4 != 3) {
                c12009k4 = AbstractC14542k4.m71089k4(c12009k4, i);
                iM56311k4 = 4;
            }
            C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
            tc4 tc4Var = new tc4(c12009k4.mo15760yj(), c12009k4.mo15757m9());
            int iM15715du = c3983k4M56597k4.m15715du() - (c12009k4.mo15760yj() * iM56311k4);
            int iM15716k4 = c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15715du();
            byte[] bArr = iM15715du == 0 ? tc4Var.f49095du : new byte[iM15716k4];
            C3914k4.m15618k4(c3983k4M56597k4.m15721to(), bArr, 0, iM15716k4);
            c12009k4.m56605k4(c3983k4M56597k4);
            if (iM15715du == 0 && iM56311k4 == 3) {
                for (int length = bArr.length - 1; length > 0; length -= 4) {
                    int i2 = ((length + 1) * iM56311k4) / 4;
                    bArr[length] = -1;
                    bArr[length - 1] = bArr[i2 - 1];
                    bArr[length - 2] = bArr[i2 - 2];
                    bArr[length - 3] = bArr[i2 - 3];
                }
            }
            if (iM15715du > 0) {
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < tc4Var.f49100x1; i5++) {
                    for (int i6 = 0; i6 < tc4Var.f49097k4; i6++) {
                        tc4Var.f49095du[i3] = bArr[i4];
                        tc4Var.f49095du[i3 + 1] = bArr[i4 + 1];
                        tc4Var.f49095du[i3 + 2] = bArr[i4 + 2];
                        byte[] bArr2 = tc4Var.f49095du;
                        int i7 = i3 + 3;
                        if (iM56311k4 == 4) {
                            bArr2[i7] = bArr[i4 + 3];
                        } else {
                            bArr2[i7] = -1;
                        }
                        i3 += 4;
                        i4 += iM56311k4;
                    }
                    i4 += iM15715du;
                }
            }
            return tc4Var;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.tc4$x1 */
    public static class C14545x1 extends AbstractC14542k4 {

        /* JADX INFO: renamed from: k4 */
        private static final C14543kk f49101k4 = new C14543kk();

        /* JADX INFO: renamed from: com.aspose.slides.tc4$x1$k4 */
        public static class k4 extends AbstractC7020m9<k4> {

            /* JADX INFO: renamed from: du */
            byte[] f49102du;

            /* JADX INFO: renamed from: k4 */
            int f49103k4;

            /* JADX INFO: renamed from: kk */
            int f49104kk;

            /* JADX INFO: renamed from: to */
            int f49105to;

            /* JADX INFO: renamed from: x1 */
            int f49106x1;

            /* JADX INFO: renamed from: x1 */
            private boolean m71093x1(k4 k4Var) {
                return k4Var.f49103k4 == this.f49103k4 && k4Var.f49106x1 == this.f49106x1 && k4Var.f49104kk == this.f49104kk && k4Var.f49105to == this.f49105to && C14067j2.m66728k4(k4Var.f49102du, this.f49102du);
            }

            public Object clone() {
                return Clone();
            }

            public boolean equals(Object obj) {
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof k4) {
                    return m71093x1((k4) obj);
                }
                return false;
            }

            public int hashCode() {
                return Arrays.hashCode(this.f49102du) + (C12569rv.m58664k4(Integer.valueOf(this.f49103k4), Integer.valueOf(this.f49106x1), Integer.valueOf(this.f49104kk), Integer.valueOf(this.f49105to)) * 31);
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public k4 Clone() {
                k4 k4Var = new k4();
                CloneTo(k4Var);
                return k4Var;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void CloneTo(k4 k4Var) {
                k4Var.f49103k4 = this.f49103k4;
                k4Var.f49106x1 = this.f49106x1;
                k4Var.f49104kk = this.f49104kk;
                k4Var.f49105to = this.f49105to;
                k4Var.f49102du = this.f49102du;
            }
        }

        private C14545x1() {
            super();
        }

        @Override // com.aspose.slides.tc4.AbstractC14542k4
        /* JADX INFO: renamed from: k4 */
        public C12009k4 mo71090k4(tc4 tc4Var) {
            return f49101k4.mo71090k4(tc4Var);
        }

        @Override // com.aspose.slides.tc4.AbstractC14542k4
        /* JADX INFO: renamed from: k4 */
        public tc4 mo71091k4(C12009k4 c12009k4) {
            C3152yj c3152yj;
            int i = AbstractC12002ck.m56321kk(c12009k4.mo15753jd()) ? 2498570 : 137224;
            if (c12009k4.mo15753jd() != i) {
                c12009k4 = AbstractC14542k4.m71089k4(c12009k4, i);
            }
            int i2 = 0;
            if (c12009k4.mo15753jd() == 2498570) {
                tc4 tc4Var = new tc4(c12009k4.mo15760yj(), c12009k4.mo15757m9());
                k4 k4Var = new k4();
                c3152yj = new C3152yj();
                try {
                    c12009k4.m56333k4(c3152yj, C3977ck.m15682kk());
                    k4Var.f49102du = c3152yj.toArray();
                    k4[] k4VarArr = {k4Var};
                    m71092k4(k4VarArr, 4);
                    k4VarArr[0].CloneTo(k4Var);
                    c3152yj.close();
                    while (i2 < c12009k4.mo15757m9()) {
                        int i3 = k4Var.f49105to - (k4Var.f49104kk * i2);
                        int i4 = i2 + 1;
                        int i5 = tc4Var.f49097k4 * i4 * 4;
                        int i6 = i2 * tc4Var.f49097k4 * 4;
                        while (i6 < i5) {
                            tc4Var.f49095du[i6] = k4Var.f49102du[i3 + 3];
                            tc4Var.f49095du[i6 + 1] = k4Var.f49102du[i3 + 2];
                            tc4Var.f49095du[i6 + 2] = k4Var.f49102du[i3 + 1];
                            tc4Var.f49095du[i6 + 3] = k4Var.f49102du[i3];
                            i6 += 4;
                            i3 += 4;
                        }
                        i2 = i4;
                    }
                    return tc4Var;
                } finally {
                }
            }
            tc4 tc4Var2 = new tc4(c12009k4.mo15760yj(), c12009k4.mo15757m9());
            tc4Var2.m71086m9();
            k4 k4Var2 = new k4();
            c3152yj = new C3152yj();
            try {
                c12009k4.m56333k4(c3152yj, C3977ck.m15682kk());
                k4Var2.f49102du = c3152yj.toArray();
                k4[] k4VarArr2 = {k4Var2};
                m71092k4(k4VarArr2, 3);
                k4VarArr2[0].CloneTo(k4Var2);
                c3152yj.close();
                while (i2 < c12009k4.mo15757m9()) {
                    int i7 = k4Var2.f49105to - (k4Var2.f49104kk * i2);
                    int i8 = i2 + 1;
                    int i9 = tc4Var2.f49097k4 * i8 * 4;
                    int i10 = i2 * tc4Var2.f49097k4 * 4;
                    while (i10 < i9) {
                        tc4Var2.f49095du[i10] = k4Var2.f49102du[i7 + 2];
                        tc4Var2.f49095du[i10 + 1] = k4Var2.f49102du[i7 + 1];
                        tc4Var2.f49095du[i10 + 2] = k4Var2.f49102du[i7];
                        tc4Var2.f49095du[i10 + 3] = -1;
                        i10 += 4;
                        i7 += 3;
                    }
                    i2 = i8;
                }
                return tc4Var2;
            } finally {
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m71092k4(k4[] k4VarArr, int i) {
            k4 k4Var = k4VarArr[0];
            k4Var.f49103k4 = C14069jd.m66765du(k4Var.f49102du, 18);
            k4 k4Var2 = k4VarArr[0];
            k4Var2.f49106x1 = C14069jd.m66765du(k4Var2.f49102du, 22);
            k4 k4Var3 = k4VarArr[0];
            int i2 = k4Var3.f49103k4 * i;
            k4Var3.f49104kk = i2;
            if (i2 % 4 > 0) {
                k4Var3.f49104kk = (4 - (i2 % 4)) + i2;
            }
            k4Var3.f49105to = ((r5.f49106x1 - 1) * k4VarArr[0].f49104kk) + C14069jd.m66765du(k4Var3.f49102du, 10);
        }
    }

    public tc4(int i, int i2) {
        this.f49097k4 = i;
        this.f49100x1 = i2;
        this.f49095du = new byte[i * i2 * 4];
    }

    /* JADX INFO: renamed from: jd */
    private static AbstractC14542k4 m71075jd() {
        try {
            C14544to c14544to = new C14544to();
            c14544to.mo71091k4(new C12009k4(16, 16, 2498570));
            return c14544to;
        } catch (MethodAccessException e) {
            C3085sv.m13082k4(e);
            return new C14545x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static tc4 m71076k4(C12009k4 c12009k4) {
        tc4 tc4VarMo71091k4 = f49094m9.mo71091k4(c12009k4);
        tc4VarMo71091k4.f49098kk = C12567ne.m58657k4(c12009k4);
        tc4VarMo71091k4.f49099to = C12567ne.m58660x1(c12009k4);
        return tc4VarMo71091k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final C12009k4 m71080c5() {
        C12009k4 c12009k4Mo71090k4 = f49094m9.mo71090k4(this);
        float f = this.f49098kk;
        if (f != 0.0f) {
            float f2 = this.f49099to;
            if (f2 != 0.0f) {
                c12009k4Mo71090k4.m56332k4(f, f2);
            }
        }
        return c12009k4Mo71090k4;
    }

    /* JADX INFO: renamed from: du */
    public final void m71081du() {
        if (this.f49096h4 >= 0) {
            return;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f49095du;
            if (i >= bArr.length) {
                this.f49096h4 = 0;
                return;
            } else {
                if ((bArr[i + 3] & 255) != 255) {
                    this.f49096h4 = 1;
                    return;
                }
                i += 4;
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    public final void m71082dy() {
        this.f49096h4 = -1;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m71083h4() {
        this.f49096h4 = 1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m71085kk() {
        return this.f49100x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m71086m9() {
        this.f49096h4 = 0;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m71087to() {
        return this.f49095du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m71088x1() {
        return this.f49097k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m71084k4() {
        return this.f49096h4 != 0;
    }
}
