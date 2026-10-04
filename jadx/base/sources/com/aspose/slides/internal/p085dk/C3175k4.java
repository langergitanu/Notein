package com.aspose.slides.internal.p085dk;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4135yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.dk.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3175k4 {

    /* JADX INFO: renamed from: k4 */
    private final C13991ub f9443k4;

    /* JADX INFO: renamed from: x1 */
    private final C6765kp f9444x1;

    public C3175k4(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar, boolean z) {
        if (abstractC6747ar.mo26673ks() == 65000 && abstractC6747ar.mo26655dy().length == 0) {
            byte[] bArrM13551k4 = C3170du.m13551k4();
            abstractC3150x6.write(bArrM13551k4, 0, bArrM13551k4.length);
        }
        C13991ub c13991ubM16585k4 = C4135yj.m16585k4(abstractC3150x6, abstractC6747ar);
        this.f9443k4 = c13991ubM16585k4;
        this.f9444x1 = new C6765kp(2048);
        c13991ubM16585k4.m66260kk(false);
        if (z) {
            c13991ubM16585k4.m66258k4(1);
            c13991ubM16585k4.m66262x1(1);
            c13991ubM16585k4.m66261x1('\t');
        }
    }

    /* JADX INFO: renamed from: h4 */
    private static boolean m13578h4(String str) {
        if (!C12565ks.m58630x1(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int iCharAt = str.charAt(i);
            if (C14117yj.m67514du(str.charAt(i))) {
                iCharAt = C14117yj.m67525k4(str.charAt(i), str.charAt(i + 1));
            }
            if (!m13579k4(iCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final String m13580du(String str) {
        return m13582k4(str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13991ub m13581k4() {
        return this.f9443k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m13588kk() {
        this.f9443k4.mo21898jd();
    }

    /* JADX INFO: renamed from: to */
    public final void m13591to(String str) {
        this.f9443k4.mo21918x1(m13580du(str));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13592x1() {
        this.f9443k4.mo21898jd();
        this.f9443k4.m66257k4();
        this.f9443k4.mo21896h4();
    }

    public C3175k4(AbstractC3150x6 abstractC3150x6, boolean z) {
        this(abstractC3150x6, AbstractC6747ar.m26635ix(), z);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13582k4(String str, boolean z) {
        if (!m13578h4(str)) {
            return str;
        }
        int i = 0;
        this.f9444x1.m26801k4(0);
        while (i < str.length()) {
            boolean zM67514du = C14117yj.m67514du(str.charAt(i));
            int iCharAt = str.charAt(i);
            if (zM67514du) {
                iCharAt = C14117yj.m67525k4(str.charAt(i), str.charAt(i + 1));
            }
            if (m13579k4(iCharAt)) {
                this.f9444x1.m26780k4(str.charAt(i));
                if (zM67514du) {
                    i++;
                    this.f9444x1.m26780k4(str.charAt(i));
                }
            } else if (z) {
                this.f9444x1.m26792k4(" ");
            }
            i++;
        }
        return this.f9444x1.toString();
    }

    /* JADX INFO: renamed from: kk */
    public final void m13589kk(String str) {
        this.f9443k4.mo21895dy(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13593x1(String str) {
        this.f9443k4.m65807up(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13583k4(AbstractC3150x6 abstractC3150x6) {
        C3152yj c3152yj = (C3152yj) C7019kk.m27452k4((Object) abstractC3150x6, C3152yj.class);
        if (c3152yj != null) {
            m13587k4(c3152yj.toArray(), 0, (int) abstractC3150x6.getLength());
        } else {
            m13587k4(C12565ks.m58632x1(abstractC3150x6), 0, (int) abstractC3150x6.getLength());
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m13590kk(String str, String str2) {
        this.f9443k4.m65806to(str, m13580du(str2));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13594x1(String str, String str2) {
        if (C12565ks.m58630x1(str2)) {
            m13586k4(str, str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13584k4(String str) {
        this.f9443k4.mo65747x1(true);
        m13593x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13585k4(String str, C14084qq c14084qq) {
        if (c14084qq.m67158yj() > 1) {
            m13586k4(str, C9574to.m46743k4(c14084qq.Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13586k4(String str, String str2) {
        m13593x1(str);
        m13591to(str2);
        m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13587k4(byte[] bArr, int i, int i2) {
        C3176kk c3176kk = new C3176kk(bArr, i, i2);
        while (!c3176kk.m13596x1()) {
            m13591to(c3176kk.m13595k4());
            this.f9443k4.mo21913m9(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m13579k4(int i) {
        if (i == 9 || i == 10 || i == 13) {
            return true;
        }
        if (i >= 32 && i <= 55295) {
            return true;
        }
        if (i < 57344 || i > 65533) {
            return i >= 65536 && i <= 1114111;
        }
        return true;
    }
}
