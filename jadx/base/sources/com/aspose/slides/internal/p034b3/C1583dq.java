package com.aspose.slides.internal.p034b3;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p022ai.C1371ck;
import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p022ai.C1377k4;
import com.aspose.slides.internal.p022ai.C1378kk;
import com.aspose.slides.internal.p022ai.C1379m9;
import com.aspose.slides.internal.p048bv.C1856c5;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10015kk;
import com.aspose.slides.internal.p393s7.C10155jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.dq */
/* JADX INFO: loaded from: classes3.dex */
public class C1583dq {

    /* JADX INFO: renamed from: k4 */
    private static final to[] f6126k4 = new to[55];

    /* JADX INFO: renamed from: com.aspose.slides.internal.b3.dq$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private int f6127du;

        /* JADX INFO: renamed from: dy */
        private C4265c5.kk f6128dy;

        /* JADX INFO: renamed from: h4 */
        private int f6129h4;

        /* JADX INFO: renamed from: k4 */
        public boolean f6130k4;

        /* JADX INFO: renamed from: m9 */
        private int f6132m9;

        /* JADX INFO: renamed from: x1 */
        private C12003du f6134x1 = C12003du.f40505to.Clone();

        /* JADX INFO: renamed from: kk */
        private String f6131kk = null;

        /* JADX INFO: renamed from: to */
        private C1856c5 f6133to = null;

        /* JADX INFO: renamed from: dy */
        private String m8525dy() {
            int iM8534kk = m8534kk();
            if (iM8534kk == 96) {
                return "no-repeat";
            }
            switch (iM8534kk) {
                case 112:
                    return "repeat";
                case 113:
                    return "repeat-x";
                case 114:
                    return "repeat-y";
                default:
                    throw new ArgumentOutOfRangeException(C14113y2.m67408k4("Illegal repeat style: ", C14057f9.m66591x1(m8534kk())));
            }
        }

        /* JADX INFO: renamed from: du */
        public final C1856c5 m8526du() {
            return this.f6133to;
        }

        /* JADX INFO: renamed from: h4 */
        public final C4265c5.kk m8527h4() {
            return this.f6128dy;
        }

        /* JADX INFO: renamed from: k4 */
        public final C12003du m8528k4() {
            return this.f6134x1;
        }

        /* JADX INFO: renamed from: kk */
        public final int m8534kk() {
            return this.f6127du;
        }

        /* JADX INFO: renamed from: m9 */
        public final int m8536m9() {
            return this.f6132m9;
        }

        /* JADX INFO: renamed from: to */
        public final String m8537to() {
            return this.f6131kk;
        }

        public String toString() {
            C6765kp c6765kp = new C6765kp();
            if (!this.f6134x1.m56504dy()) {
                c6765kp.m26792k4("color=").m26792k4(C10015kk.m49155k4(this.f6134x1.Clone()));
            }
            if (this.f6131kk != null) {
                if (!this.f6134x1.m56504dy()) {
                    c6765kp.m26792k4(",");
                }
                c6765kp.m26792k4("url=").m26792k4(this.f6131kk);
                c6765kp.m26792k4(",repeat=").m26792k4(m8525dy());
                c6765kp.m26792k4(",horiz=").m26805kk(this.f6129h4);
                c6765kp.m26792k4(",vertical=").m26805kk(this.f6132m9);
            }
            return c6765kp.toString();
        }

        /* JADX INFO: renamed from: x1 */
        public final int m8538x1() {
            return this.f6129h4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m8529k4(int i) {
            this.f6129h4 = i;
        }

        /* JADX INFO: renamed from: kk */
        public final void m8535kk(int i) {
            this.f6132m9 = i;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m8539x1(int i) {
            this.f6127du = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m8530k4(C1856c5 c1856c5) {
            this.f6133to = c1856c5;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m8531k4(C4265c5.kk kkVar) {
            this.f6128dy = kkVar;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m8532k4(C12003du c12003du) {
            c12003du.CloneTo(this.f6134x1);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m8533k4(String str) {
            this.f6131kk = str;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.b3.dq$kk */
    public static class kk {

        /* JADX INFO: renamed from: k4 */
        private String f6135k4;

        /* JADX INFO: renamed from: x1 */
        private String f6136x1;

        public kk(String str, String str2) {
            m8541k4(str);
            m8543x1(str2);
        }

        /* JADX INFO: renamed from: k4 */
        public final String m8540k4() {
            return this.f6135k4;
        }

        public String toString() {
            C6765kp c6765kp = new C6765kp();
            c6765kp.m26792k4("pvKey=").m26792k4(this.f6135k4);
            c6765kp.m26792k4(",idRef=").m26792k4(this.f6136x1);
            return c6765kp.toString();
        }

        /* JADX INFO: renamed from: x1 */
        public final String m8542x1() {
            return this.f6136x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m8541k4(String str) {
            this.f6135k4 = str;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m8543x1(String str) {
            this.f6136x1 = str;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.b3.dq$to */
    public static class to {

        /* JADX INFO: renamed from: k4 */
        private String f6137k4;

        /* JADX INFO: renamed from: x1 */
        private AbstractC14068j5 f6138x1;

        public to(String str, AbstractC14068j5 abstractC14068j5) {
            this.f6137k4 = str;
            this.f6138x1 = abstractC14068j5;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.b3.dq$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private String f6139k4;

        /* JADX INFO: renamed from: x1 */
        private boolean f6140x1;

        public x1(String str, boolean z) {
            this.f6139k4 = str;
            this.f6140x1 = z;
        }

        /* JADX INFO: renamed from: k4 */
        public final String m8544k4() {
            return this.f6139k4;
        }

        public String toString() {
            C6765kp c6765kp = new C6765kp(64);
            c6765kp.m26792k4("newWindow=").m26797k4(this.f6140x1);
            c6765kp.m26792k4(",dest=").m26792k4(this.f6139k4);
            return c6765kp.toString();
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m8545x1() {
            return this.f6140x1;
        }
    }

    static {
        m8524k4(37, new to("structure-tree-element", C7019kk.m27443k4((Class<?>) String.class)));
        m8524k4(1, new to("internal-link", C7019kk.m27443k4((Class<?>) kk.class)));
        m8524k4(2, new to("external-link", C7019kk.m27443k4((Class<?>) x1.class)));
        m8524k4(3, new to("font", C7019kk.m27443k4((Class<?>) C10155jd.class)));
        Class cls = Integer.TYPE;
        m8524k4(4, new to("font-size", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(7, new to("color", C7019kk.m27443k4((Class<?>) C12003du.class)));
        m8524k4(8, new to("prod-id", C7019kk.m27443k4((Class<?>) String.class)));
        m8524k4(9, new to("background", C7019kk.m27443k4((Class<?>) k4.class)));
        Class cls2 = Boolean.TYPE;
        m8524k4(10, new to("underline-score", C7019kk.m27443k4((Class<?>) cls2)));
        m8524k4(34, new to("underline-score-color", C7019kk.m27443k4((Class<?>) C12003du.class)));
        m8524k4(11, new to("overline-score", C7019kk.m27443k4((Class<?>) cls2)));
        m8524k4(35, new to("overline-score-color", C7019kk.m27443k4((Class<?>) C12003du.class)));
        m8524k4(12, new to("through-score", C7019kk.m27443k4((Class<?>) cls2)));
        m8524k4(36, new to("through-score-color", C7019kk.m27443k4((Class<?>) C12003du.class)));
        m8524k4(33, new to("blink", C7019kk.m27443k4((Class<?>) cls2)));
        m8524k4(15, new to("border-start", C7019kk.m27443k4((Class<?>) C1377k4.class)));
        m8524k4(16, new to("border-end", C7019kk.m27443k4((Class<?>) C1377k4.class)));
        m8524k4(17, new to("border-before", C7019kk.m27443k4((Class<?>) C1377k4.class)));
        m8524k4(18, new to("border-after", C7019kk.m27443k4((Class<?>) C1377k4.class)));
        m8524k4(19, new to("padding-start", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(20, new to("padding-end", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(21, new to("padding-before", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(22, new to("padding-after", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(23, new to("space-start", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(24, new to("space-end", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(27, new to("start-indent", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(28, new to("end-indent", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(29, new to("space-before", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(30, new to("space-after", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(31, new to("is-reference-area", C7019kk.m27443k4((Class<?>) cls2)));
        m8524k4(32, new to("is-viewport-area", C7019kk.m27443k4((Class<?>) cls2)));
        m8524k4(38, new to("writing-mode", C7019kk.m27443k4((Class<?>) C1374fa.class)));
        m8524k4(39, new to("inline-progression-direction", C7019kk.m27443k4((Class<?>) C1378kk.class)));
        m8524k4(40, new to("block-progression-direction", C7019kk.m27443k4((Class<?>) C1378kk.class)));
        m8524k4(42, new to("shift-direction", C7019kk.m27443k4((Class<?>) C1378kk.class)));
        m8524k4(43, new to("z-index", C7019kk.m27443k4((Class<?>) InterfaceC1986to.class)));
        m8524k4(46, new to("control-type", C7019kk.m27443k4((Class<?>) InterfaceC1986to.class)));
        m8524k4(47, new to("control-part", C7019kk.m27443k4((Class<?>) InterfaceC1986to.class)));
        m8524k4(44, new to("outline", C7019kk.m27443k4((Class<?>) C1379m9.class)));
        m8524k4(45, new to("visibility", C7019kk.m27443k4((Class<?>) C1371ck.class)));
        m8524k4(49, new to("control-height", C7019kk.m27443k4((Class<?>) cls)));
        m8524k4(48, new to("control-width", C7019kk.m27443k4((Class<?>) cls)));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8524k4(int i, to toVar) {
        f6126k4[i] = toVar;
    }
}
