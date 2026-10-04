package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.net.URI;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.x5 */
/* JADX INFO: loaded from: classes5.dex */
public class C14109x5 {

    /* JADX INFO: renamed from: c5 */
    private C14062gk f47361c5;

    /* JADX INFO: renamed from: du */
    private String f47362du;

    /* JADX INFO: renamed from: dy */
    private String f47363dy;

    /* JADX INFO: renamed from: h4 */
    private String f47364h4;

    /* JADX INFO: renamed from: jd */
    private boolean f47365jd;

    /* JADX INFO: renamed from: k4 */
    private String f47366k4;

    /* JADX INFO: renamed from: kk */
    private int f47367kk;

    /* JADX INFO: renamed from: m9 */
    private String f47368m9;

    /* JADX INFO: renamed from: to */
    private String f47369to;

    /* JADX INFO: renamed from: x1 */
    private String f47370x1;

    public C14109x5() {
        String str = C14062gk.f47207du;
        String str2 = C14113y2.f47374k4;
        m67345k4(str, "localhost", -1, str2, str2);
    }

    /* JADX INFO: renamed from: du */
    public void m67346du(String str) {
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        int iM67429to = C14113y2.m67429to(str, ':');
        if (iM67429to != -1) {
            str = C14113y2.m67443x1(str, 0, iM67429to);
        }
        this.f47366k4 = C14113y2.m67368h4(str);
        this.f47365jd = true;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return m67352x1().equals(obj.toString());
    }

    public int hashCode() {
        return m67352x1().hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public URI m67347k4() {
        return C14062gk.m66672x1(m67352x1());
    }

    /* JADX INFO: renamed from: kk */
    public void m67350kk(String str) {
        this.f47369to = (str == null || str.length() == 0) ? "/" : C14062gk.m66639k4(str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX), C14062gk.f47219up);
        this.f47365jd = true;
    }

    /* JADX INFO: renamed from: to */
    public void m67351to(String str) {
        this.f47362du = (str == null || str.length() == 0) ? C14113y2.f47374k4 : C14113y2.m67408k4(MsalUtils.QUERY_STRING_SYMBOL, str);
        this.f47365jd = true;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(this.f47366k4);
        c6765kp.m26792k4(C14062gk.m66658m9(this.f47366k4));
        if (!C14113y2.m67363du(this.f47368m9, C14113y2.f47374k4)) {
            c6765kp.m26792k4(this.f47368m9);
            if (!C14113y2.m67363du(this.f47363dy, C14113y2.f47374k4)) {
                c6765kp.m26792k4(C14113y2.m67408k4(C18241k5.f55433h, this.f47363dy));
            }
            c6765kp.m26780k4('@');
        }
        if (this.f47370x1.length() > 0) {
            c6765kp.m26792k4(this.f47370x1);
            int i = this.f47367kk;
            if (i > 0) {
                c6765kp.m26792k4(C14113y2.m67408k4(C18241k5.f55433h, C14057f9.m66591x1(i)));
            }
        }
        if (!C14113y2.m67363du(this.f47369to, C14113y2.f47374k4) && c6765kp.m26806x1(c6765kp.m26807x1() - 1) != '/' && this.f47369to.length() > 0 && this.f47369to.charAt(0) != '/') {
            c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_UNIX);
        }
        c6765kp.m26792k4(this.f47369to);
        c6765kp.m26792k4(this.f47362du);
        c6765kp.m26792k4(this.f47364h4);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public C14062gk m67352x1() {
        if (!this.f47365jd) {
            return this.f47361c5;
        }
        C14062gk c14062gk = new C14062gk(toString());
        this.f47361c5 = c14062gk;
        this.f47370x1 = c14062gk.m66678du();
        this.f47369to = this.f47361c5.m66686k4();
        this.f47365jd = false;
        return this.f47361c5;
    }

    public C14109x5(String str) {
        if (str == null) {
            throw new ArgumentNullException("uriString");
        }
        C14062gk[] c14062gkArr = {null};
        boolean zM66650k4 = C14062gk.m66650k4(str, 1, c14062gkArr);
        C14062gk c14062gk = c14062gkArr[0];
        if (zM66650k4) {
            m67344k4(c14062gk);
        } else {
            if (C14113y2.m67359c5(str, C14062gk.f47213k4)) {
                throw new UriFormatException();
            }
            m67344k4(new C14062gk(C14113y2.m67408k4(C14062gk.f47207du, C14062gk.f47213k4, str)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m67348k4(int i) {
        if (i < -1) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f47367kk = i;
        this.f47365jd = true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m67353x1(String str) {
        if (C14113y2.m67411k4(str)) {
            str = C14113y2.f47374k4;
        } else if (C14113y2.m67429to(str, ':') != -1 && str.charAt(0) != '[') {
            str = C14113y2.m67408k4("[", str, "]");
        }
        this.f47370x1 = str;
        this.f47365jd = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m67344k4(C14062gk c14062gk) {
        m67345k4(c14062gk.m66689ks(), c14062gk.m66678du(), c14062gk.m66695up(), c14062gk.m66686k4(), C14113y2.f47374k4);
        this.f47364h4 = c14062gk.m66693to();
        this.f47362du = c14062gk.m66699yj();
        String strM66698x6 = c14062gk.m66698x6();
        this.f47368m9 = strM66698x6;
        int iM67429to = C14113y2.m67429to(strM66698x6, ':');
        if (iM67429to == -1) {
            this.f47363dy = C14113y2.f47374k4;
        } else {
            this.f47363dy = C14113y2.m67422kk(this.f47368m9, iM67429to + 1);
            this.f47368m9 = C14113y2.m67443x1(this.f47368m9, 0, iM67429to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m67349k4(String str) {
        String strM67408k4;
        this.f47364h4 = str;
        if (str != null) {
            if (str.length() > 0) {
                strM67408k4 = C14113y2.m67408k4("#", C14113y2.m67401k4(str, "%23", "#"));
            }
            this.f47365jd = true;
        }
        strM67408k4 = C14113y2.f47374k4;
        this.f47364h4 = strM67408k4;
        this.f47365jd = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m67345k4(String str, String str2, int i, String str3, String str4) {
        this.f47365jd = true;
        m67346du(str);
        m67353x1(str2);
        m67348k4(i);
        m67350kk(str3);
        String str5 = C14113y2.f47374k4;
        this.f47362du = str5;
        this.f47364h4 = str5;
        m67350kk(str3);
        String str6 = C14113y2.f47374k4;
        this.f47368m9 = str6;
        this.f47363dy = str6;
        if (C14113y2.m67411k4(str4)) {
            return;
        }
        if (str4.charAt(0) == '#') {
            m67349k4(C14113y2.m67396k4(str4, 0, 1));
        } else {
            if (str4.charAt(0) != '?') {
                throw new ArgumentException("extraValue");
            }
            m67351to(C14113y2.m67396k4(str4, 0, 1));
        }
    }
}
