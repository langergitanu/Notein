package com.aspose.slides;

import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.lt */
/* JADX INFO: loaded from: classes3.dex */
class C13809lt {

    /* JADX INFO: renamed from: k4 */
    private boolean f46089k4;

    /* JADX INFO: renamed from: com.aspose.slides.lt$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract vbz mo64587k4(C12385to c12385to);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public vbz m64577k4(C12385to c12385to) {
        vbz vbzVar = new vbz();
        boolean z = false;
        C12385to c12385toM58005h4 = c12385to;
        while (c12385toM58005h4.mo58006to()) {
            String strOooO00o = OooOo.OooO00o(c12385toM58005h4, 1);
            if ("<p:sp>".equals(strOooO00o) || "<a:p>".equals(strOooO00o)) {
                if (m64586k4()) {
                    boolean zEquals = "<p:sp>".equals(strOooO00o);
                    if (c12385toM58005h4 != c12385to && ((!zEquals || "<p:sp>".equals(strOooO00o)) && z)) {
                        vbzVar.m72172k4().m26792k4(" ");
                    }
                }
                c12385toM58005h4 = c12385toM58005h4.m58005h4();
            } else {
                m64580k4(c12385toM58005h4.mo57994k4(), OooOo.OooO00o(c12385toM58005h4, 4), vbzVar);
                c12385toM58005h4 = c12385toM58005h4.m58005h4();
                z = true;
            }
        }
        return vbzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public vbz m64581x1(C12385to c12385to) {
        vbz vbzVar = new vbz();
        boolean zEquals = false;
        String strOooO00o = "";
        while (c12385to.mo58006to()) {
            String strOooO00o2 = OooOo.OooO00o(c12385to, 1);
            if ("<p:sp>".equals(strOooO00o2) || "<p:ph".equals(strOooO00o2)) {
                if (m64586k4()) {
                    zEquals = "<p:ph".equals(strOooO00o2);
                    if ("<p:sp>".equals(strOooO00o2) && !C14113y2.m67411k4(strOooO00o)) {
                        vbzVar.m72172k4().m26792k4(" ");
                    }
                    strOooO00o = "";
                }
            } else if (!zEquals) {
                strOooO00o = OooOo.OooO00o(c12385to, 5);
                m64580k4(c12385to.mo57994k4(), strOooO00o, vbzVar);
            }
            c12385to = c12385to.m58005h4();
        }
        return vbzVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final vbz m64583k4(String str) {
        return m64584k4(str, false);
    }

    /* JADX INFO: renamed from: k4 */
    private vbz m64579k4(String str, C12380dy c12380dy, k4 k4Var) {
        C12385to c12385toM57989x1 = c12380dy.m57989x1(str);
        if (c12385toM57989x1.mo58006to()) {
            return k4Var.mo64587k4(c12385toM57989x1);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final vbz m64584k4(String str, boolean z) {
        C12380dy c12380dy;
        k4 k4Var;
        if (z) {
            c12380dy = pe5.f48046x1;
            k4Var = new k4() { // from class: com.aspose.slides.lt.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.Util.Generator.ProcessExcludePlaceholders(System.Text.RegularExpressions.Match)";
                }

                @Override // com.aspose.slides.C13809lt.k4
                /* JADX INFO: renamed from: k4 */
                public vbz mo64587k4(C12385to c12385to) {
                    return C13809lt.this.m64581x1(c12385to);
                }
            };
        } else {
            c12380dy = pe5.f48043kk;
            k4Var = new k4() { // from class: com.aspose.slides.lt.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.Util.Generator.Process(System.Text.RegularExpressions.Match)";
                }

                @Override // com.aspose.slides.C13809lt.k4
                /* JADX INFO: renamed from: k4 */
                public vbz mo64587k4(C12385to c12385to) {
                    return C13809lt.this.m64577k4(c12385to);
                }
            };
        }
        return m64579k4(str, c12380dy, k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64580k4(int i, String str, vbz vbzVar) {
        vbzVar.m72172k4().m26792k4(str);
        vbzVar.m72173x1().addItem(new hzm(i, str.length()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64585k4(boolean z) {
        this.f46089k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64586k4() {
        return this.f46089k4;
    }
}
