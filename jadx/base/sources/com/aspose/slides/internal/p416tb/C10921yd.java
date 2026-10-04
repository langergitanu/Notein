package com.aspose.slides.internal.p416tb;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p443ul.C11445kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C10921yd {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f37997k4;

    /* JADX INFO: renamed from: x1 */
    private C11445kk f37998x1;

    public C10921yd(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        this.f37997k4 = abstractC3150x6;
        this.f37998x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m52636k4(float f, float f2) {
        return C7019kk.m27462to(Float.valueOf(C14116yg.m67481k4(C14116yg.m67480k4(f), C14116yg.m67480k4(f2)) / 32767.0f), 13) + 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m52639x1(float f) {
        return C9574to.m46747x1(f);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m52640c5() {
        m52650k4(">>");
    }

    /* JADX INFO: renamed from: du */
    public final void m52641du() {
        this.f37997k4.close();
    }

    /* JADX INFO: renamed from: dy */
    public final void m52643dy() {
        m52650k4("<<");
    }

    /* JADX INFO: renamed from: h4 */
    public final void m52644h4() {
        m52650k4(" ");
    }

    /* JADX INFO: renamed from: kk */
    public final void m52665kk(String str) {
        m52650k4(str);
        m52667m9();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m52667m9() {
        m52650k4(IOUtils.LINE_SEPARATOR_WINDOWS);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC3150x6 m52668to() {
        return this.f37997k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m52637k4(C5656k4 c5656k4) {
        return C14113y2.m67402k4("{0} {1} {2}", m52639x1(c5656k4.m23102kk() / 255.0f), m52639x1(c5656k4.m23104to() / 255.0f), m52639x1(c5656k4.m23099du() / 255.0f));
    }

    /* JADX INFO: renamed from: du */
    public final void m52642du(String str) {
        for (int i = 0; i < str.length(); i++) {
            m52671x1((byte) str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m52666kk(String str, String str2) {
        if (C12565ks.m58630x1(str2)) {
            m52650k4(str);
            m52644h4();
            m52650k4(str2);
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m52669to(String str) {
        String str2;
        if (this.f37998x1 != null) {
            byte[] bArr = new byte[(str.length() * 2) + 2];
            bArr[0] = -2;
            bArr[1] = -1;
            AbstractC6747ar.m26649x6().mo26659k4(str, 0, str.length(), bArr, 2);
            byte[] bArrM54504k4 = this.f37998x1.m54504k4(bArr);
            m52650k4("<");
            m52650k4(C12565ks.m58611k4(bArrM54504k4));
            str2 = ">";
        } else {
            m52650k4("(");
            m52645k4((byte) -2);
            m52645k4((byte) -1);
            for (int i = 0; i < str.length(); i++) {
                m52647k4((int) str.charAt(i));
            }
            str2 = ")";
        }
        m52650k4(str2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52671x1(byte b) {
        if (b == 13) {
            m52650k4("\\015");
            return;
        }
        if (b != 92 && b != 40 && b != 41) {
            m52645k4(b);
        } else {
            m52645k4((byte) 92);
            m52645k4(b);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m52638k4(boolean z) {
        return z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
    }

    /* JADX INFO: renamed from: to */
    public final void m52670to(String str, String str2) {
        if (C12565ks.m58630x1(str2)) {
            m52650k4(str);
            m52669to(str2);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52672x1(String str) {
        m52650k4(str);
        m52644h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52645k4(byte b) {
        this.f37997k4.writeByte(b);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52673x1(String str, String str2) {
        m52665kk(C14113y2.m67402k4(str, str2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52646k4(float f) {
        m52650k4(m52639x1(f));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52674x1(String str, String str2, String str3) {
        m52665kk(C14113y2.m67402k4(str, str2, str3));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52647k4(int i) {
        m52671x1((byte) (i >> 8));
        m52671x1((byte) i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52648k4(C4317dy c4317dy) {
        m52646k4(c4317dy.m17347to());
        m52644h4();
        m52646k4(c4317dy.m17329du());
        m52644h4();
        m52646k4(c4317dy.m17331h4());
        m52644h4();
        m52646k4(c4317dy.m17346m9());
        m52644h4();
        m52646k4(c4317dy.m17330dy());
        m52644h4();
        m52646k4(c4317dy.m17328c5());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52649k4(C11445kk c11445kk) {
        this.f37998x1 = c11445kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52650k4(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.f37997k4.writeByte((byte) str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52651k4(String str, float f) {
        m52666kk(str, m52639x1(f));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52652k4(String str, int i) {
        m52666kk(str, C9574to.m46742k4(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52653k4(String str, C4317dy c4317dy) {
        m52650k4(str);
        m52644h4();
        m52650k4("[");
        m52648k4(c4317dy);
        m52650k4("]");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52654k4(String str, C12007ix c12007ix) {
        m52650k4(str);
        m52644h4();
        m52650k4("[");
        m52646k4(c12007ix.m56571to());
        m52644h4();
        m52646k4(c12007ix.m56554dy());
        m52644h4();
        m52646k4(c12007ix.m56556h4());
        m52644h4();
        m52646k4(c12007ix.m56558k4());
        m52650k4("]");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52655k4(String str, C14084qq c14084qq) {
        if (C14084qq.m67112m9(c14084qq, C14084qq.f47299x1)) {
            return;
        }
        m52659k4(str, C14113y2.m67402k4("D:{0}", C9574to.m46749x1(c14084qq.Clone())), true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52656k4(String str, String str2) {
        m52650k4(C14113y2.m67402k4(str, str2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52657k4(String str, String str2, String str3) {
        m52650k4(C14113y2.m67402k4(str, str2, str3));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52658k4(String str, String str2, String str3, String str4) {
        m52650k4(C14113y2.m67402k4(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52659k4(String str, String str2, boolean z) {
        String str3;
        if (C12565ks.m58630x1(str2)) {
            m52650k4(str);
            if (this.f37998x1 != null) {
                byte[] bArr = new byte[str2.length()];
                AbstractC6747ar.m26650yj().mo26659k4(str2, 0, str2.length(), bArr, 0);
                byte[] bArrM54504k4 = this.f37998x1.m54504k4(bArr);
                m52650k4("<");
                m52650k4(C12565ks.m58611k4(bArrM54504k4));
                str3 = ">";
            } else {
                m52650k4("(");
                if (z) {
                    m52642du(str2);
                } else {
                    m52650k4(str2);
                }
                str3 = ")";
            }
            m52650k4(str3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52660k4(String str, boolean z) {
        m52666kk(str, m52638k4(z));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52661k4(String str, int[] iArr) {
        m52650k4(str);
        m52644h4();
        m52664k4(iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52662k4(byte[] bArr, int i, int i2) {
        this.f37997k4.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52663k4(float[] fArr) {
        m52650k4("[");
        for (int i = 0; i < fArr.length; i++) {
            m52646k4(fArr[i]);
            if (i < fArr.length - 1) {
                m52644h4();
            }
        }
        m52650k4("]");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52664k4(int[] iArr) {
        m52650k4("[");
        for (int i = 0; i < iArr.length; i++) {
            m52650k4(C9574to.m46742k4(iArr[i]));
            if (i < iArr.length - 1) {
                m52644h4();
            }
        }
        m52650k4("]");
    }
}
