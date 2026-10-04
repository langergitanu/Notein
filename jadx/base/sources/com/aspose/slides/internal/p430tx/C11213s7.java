package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13858b3;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.s7 */
/* JADX INFO: loaded from: classes4.dex */
public class C11213s7 {

    /* JADX INFO: renamed from: du */
    private int f38663du;

    /* JADX INFO: renamed from: k4 */
    private C13858b3 f38664k4 = new C13858b3(10);

    /* JADX INFO: renamed from: kk */
    private C11199kp f38665kk;

    /* JADX INFO: renamed from: to */
    private AbstractC13883dt f38666to;

    /* JADX INFO: renamed from: x1 */
    private String f38667x1;

    public C11213s7(AbstractC13883dt abstractC13883dt, C11199kp c11199kp) {
        this.f38666to = abstractC13883dt;
        this.f38665kk = c11199kp;
        this.f38667x1 = c11199kp.m53844k4();
        C11188gi c11188gi = (C11188gi) this.f38664k4.m65177k4();
        if (c11188gi == null) {
            c11188gi = new C11188gi();
            this.f38664k4.m65180k4(c11188gi);
        }
        String str = C14113y2.f47374k4;
        c11188gi.m53792k4(str, str, str, 0, str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m53989k4() {
        return this.f38667x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53995kk() {
        for (C11182e0 c11182e0M54022k4 = ((C11188gi) this.f38664k4.m65183x1()).m54022k4(); c11182e0M54022k4 != null; c11182e0M54022k4 = c11182e0M54022k4.m53711to()) {
            this.f38667x1 = c11182e0M54022k4.m53710kk();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C11188gi m53996x1() {
        return (C11188gi) this.f38664k4.m65181kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m53990k4(String str) {
        return m53991k4(str, new boolean[]{false});
    }

    /* JADX INFO: renamed from: x1 */
    public final String m53997x1(String str) {
        String strM67391k4;
        do {
            C11697x1 c11697x1M55250kk = C11697x1.m55250kk();
            int i = this.f38663du;
            this.f38663du = i + 1;
            strM67391k4 = C14113y2.m67391k4(c11697x1M55250kk, str, Integer.valueOf(i));
        } while (this.f38666to.mo65268x1(strM67391k4) != null);
        return this.f38666to.mo65266k4(strM67391k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m53991k4(String str, boolean[] zArr) {
        zArr[0] = true;
        if (str == null || str.length() == 0) {
            return this.f38667x1;
        }
        if (C13851ai.m65152k4(str, this.f38665kk.m53842du())) {
            return this.f38665kk.m53843h4();
        }
        if (C13851ai.m65152k4(str, this.f38665kk.m53847to())) {
            return this.f38665kk.m53846m9();
        }
        int iM65182to = this.f38664k4.m65182to() - 1;
        while (iM65182to >= 0) {
            String strM54024k4 = ((C11188gi) this.f38664k4.m65178k4(iM65182to)).m54024k4(str);
            if (strM54024k4 != null) {
                zArr[0] = iM65182to == this.f38664k4.m65182to() - 1;
                return strM54024k4;
            }
            iM65182to--;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53992k4(String str, String str2) {
        m53996x1().m54023k4(str, str2, this.f38667x1);
        if (str == null || str.length() == 0) {
            this.f38667x1 = str2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53993k4(String str, String str2, String str3) {
        C11188gi c11188giM53996x1 = m53996x1();
        C11188gi c11188gi = (C11188gi) this.f38664k4.m65177k4();
        if (c11188gi == null) {
            c11188gi = new C11188gi();
            this.f38664k4.m65180k4(c11188gi);
        }
        c11188gi.m53792k4(str, str2, str3, c11188giM53996x1.m53789du(), c11188giM53996x1.m53790h4(), c11188giM53996x1.m53796m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53994k4(String str, String[] strArr) {
        int iM65182to = this.f38664k4.m65182to() - 1;
        while (true) {
            if (iM65182to < 0) {
                break;
            }
            String[] strArr2 = {null};
            boolean zM53793k4 = ((C11188gi) this.f38664k4.m65178k4(iM65182to)).m53793k4(str, strArr2);
            String str2 = strArr2[0];
            if (zM53793k4) {
                String strM53990k4 = m53990k4(str2);
                if (strM53990k4 != null && C13851ai.m65152k4(strM53990k4, str)) {
                    strArr[0] = str2;
                    return true;
                }
            } else {
                iM65182to--;
            }
        }
        strArr[0] = null;
        return false;
    }
}
