package com.aspose.slides.internal.p474wg;

import androidx.core.content.OooO0O0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C11925c5 {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f40183du = new C7017h4("path", "$path", "domain", "$domain", "expires", "$expires", "httponly", "secure");

    /* JADX INFO: renamed from: k4 */
    private int f40184k4;

    /* JADX INFO: renamed from: kk */
    private int f40185kk;

    /* JADX INFO: renamed from: to */
    private C11931dy f40186to;

    /* JADX INFO: renamed from: x1 */
    private int f40187x1;

    /* JADX INFO: renamed from: kk */
    private void m55888kk(String str) {
        C14084qq c14084qqClone = C14084qq.f47293kk.Clone();
        int i = 0;
        for (int i2 = 0; i2 < this.f40186to.size(); i2++) {
            C11955m9 c11955m9M55924k4 = this.f40186to.m55924k4(i2);
            if (C14084qq.m67110kk(c11955m9M55924k4.m56079yj(), c14084qqClone) && (str == null || C14113y2.m67363du(str, c11955m9M55924k4.m56071to()))) {
                c11955m9M55924k4.m56079yj().CloneTo(c14084qqClone);
                i = i2;
            }
        }
        this.f40186to.m55923k4().removeAt(i);
    }

    /* JADX INFO: renamed from: x1 */
    private int m55889x1(String str) {
        Iterator<T> it = this.f40186to.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (m55887k4(str, ((C11955m9) it.next()).m56071to(), true)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public String m55891k4(C14062gk c14062gk) {
        if (c14062gk == null) {
            throw new ArgumentNullException("uri");
        }
        C11931dy c11931dyM55893x1 = m55893x1(c14062gk);
        if (c11931dyM55893x1.size() == 0) {
            return "";
        }
        C6765kp c6765kp = new C6765kp();
        Iterator<T> it = c11931dyM55893x1.iterator();
        while (it.hasNext()) {
            c6765kp.m26792k4(((C11955m9) it.next()).m56076x1(c14062gk));
            c6765kp.m26792k4("; ");
        }
        if (c6765kp.m26807x1() > 0) {
            c6765kp.m26801k4(c6765kp.m26807x1() - 2);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m55882k4() {
        C11931dy c11931dy = this.f40186to;
        if (c11931dy == null) {
            return;
        }
        for (int size = c11931dy.size() - 1; size >= 0; size--) {
            if (this.f40186to.m55924k4(size).m56056h4()) {
                this.f40186to.m55923k4().removeAt(size);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public C11931dy m55893x1(C14062gk c14062gk) {
        String strM56057jd;
        if (c14062gk == null) {
            throw new ArgumentNullException("uri");
        }
        m55882k4();
        C11931dy c11931dy = new C11931dy();
        C11931dy<C11955m9> c11931dy2 = this.f40186to;
        if (c11931dy2 == null) {
            return c11931dy;
        }
        for (C11955m9 c11955m9 : c11931dy2) {
            String strM56071to = c11955m9.m56071to();
            if (c11955m9.m56070rv() == 1) {
                if (m55886k4(strM56071to, c14062gk.m66678du())) {
                    if (c11955m9.m56050ck().length() > 0 || c11955m9.m56054fa() == null || c14062gk.m66695up() == -1 || AbstractC14092to.m67252x1(AbstractC14092to.m67208k4((Object) c11955m9.m56054fa()), Integer.valueOf(c14062gk.m66695up())) != -1) {
                        strM56057jd = c11955m9.m56057jd();
                        String strM66686k4 = c14062gk.m66686k4();
                        if (!"".equals(strM56057jd) || "/".equals(strM56057jd) || C14113y2.m67363du(strM66686k4, strM56057jd) || (C14113y2.m67448x1(strM66686k4, strM56057jd) && (OooO0O0.OooO00o(1, strM56057jd) == '/' || strM66686k4.length() <= strM56057jd.length() || strM66686k4.charAt(strM56057jd.length()) == '/'))) {
                            if (c11955m9.m56074up() || AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(c14062gk.m66689ks())) {
                                c11931dy.m55925k4(c11955m9);
                            }
                        }
                    }
                }
            } else if (m55887k4(strM56071to, c14062gk.m66678du(), !c11955m9.m56052du())) {
                if (c11955m9.m56050ck().length() > 0) {
                }
                strM56057jd = c11955m9.m56057jd();
                String strM66686k42 = c14062gk.m66686k4();
                if (!"".equals(strM56057jd)) {
                }
                if (c11955m9.m56074up()) {
                }
                c11931dy.m55925k4(c11955m9);
            }
        }
        c11931dy.m55926x1();
        return c11931dy;
    }

    /* JADX INFO: renamed from: k4 */
    private void m55883k4(C11955m9 c11955m9) {
        if (c11955m9.m56071to().length() == 0) {
            throw new ArgumentException("Cookie domain not set.", "cookie.Domain");
        }
        if (c11955m9.m56068ks().length() > this.f40185kk) {
            throw new C11946jd("value is larger than MaxCookieSize.");
        }
        if (c11955m9.m56070rv() == 1 && c11955m9.m56071to().charAt(0) != '.') {
            throw new C11946jd(C14113y2.m67408k4("Invalid cookie domain: ", c11955m9.m56071to()));
        }
        if (c11955m9.m56052du() && !m55885k4(c11955m9.m56071to())) {
            throw new C11946jd(C14113y2.m67408k4("Invalid cookie domain: ", c11955m9.m56071to()));
        }
        if (this.f40186to == null) {
            this.f40186to = new C11931dy();
        }
        if (this.f40186to.size() >= this.f40184k4) {
            m55888kk(null);
        }
        if (this.f40186to.size() >= this.f40187x1 && m55889x1(c11955m9.m56071to()) >= this.f40187x1) {
            m55888kk(c11955m9.m56071to());
        }
        C11955m9 c11955m92 = new C11955m9(c11955m9.m56049c5(), c11955m9.m56068ks());
        c11955m92.m56072to(c11955m9.m56057jd());
        c11955m92.m56077x1(c11955m9.m56071to());
        c11955m92.m56078x1(c11955m9.m56052du());
        c11955m92.m56059k4(c11955m9.m56070rv());
        c11955m92.m56061k4(c11955m9.m56069m9().Clone());
        c11955m92.m56060k4(c11955m9.m56075x1());
        c11955m92.m56062k4(c11955m9.m56058k4());
        c11955m92.m56063k4(c11955m9.m56067kk());
        c11955m92.m56066kk(c11955m9.m56053dy());
        c11955m92.m56073to(c11955m9.m56074up());
        this.f40186to.m55925k4(c11955m92);
        m55882k4();
    }

    /* JADX INFO: renamed from: k4 */
    public void m55892k4(C14062gk c14062gk, C11955m9 c11955m9) {
        if (c14062gk == null) {
            throw new ArgumentNullException("uri");
        }
        if (c11955m9 == null) {
            throw new ArgumentNullException("cookie");
        }
        if (c11955m9.m56056h4()) {
            return;
        }
        m55890x1(c14062gk, c11955m9);
        m55883k4(c11955m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55884k4(C14062gk c14062gk, String str) {
        if (!m55885k4(str)) {
            return false;
        }
        C11972ts[] c11972tsArr = {null};
        boolean zM56134k4 = C11972ts.m56134k4(str, c11972tsArr);
        C11972ts c11972ts = c11972tsArr[0];
        if (!zM56134k4) {
            return m55887k4(str, c14062gk.m66678du(), false);
        }
        if (str.charAt(0) == '.') {
            return false;
        }
        for (C11972ts c11972ts2 : C11988x6.m56276kk(c14062gk.m66691ne())) {
            if (c11972ts.equals(c11972ts2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55885k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return true;
        }
        if (C11972ts.m56134k4(str, new C11972ts[]{null})) {
            return str.charAt(0) != '.';
        }
        if (str.charAt(0) == '.') {
            str = C14113y2.m67422kk(str, 1);
        }
        return C14113y2.m67432to(str, "localhost", (short) 3) || AbstractC14092to.m67208k4((Object) C14113y2.m67414k4(str, FilenameUtils.EXTENSION_SEPARATOR)).m67265du() >= 2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m55890x1(C14062gk c14062gk, C11955m9 c11955m9) {
        if (C14113y2.m67411k4(c11955m9.m56049c5())) {
            throw new C11946jd("Invalid cookie: name");
        }
        if (c11955m9.m56068ks() == null) {
            throw new C11946jd("Invalid cookie: value");
        }
        if (c14062gk != null) {
            if (c11955m9.m56071to().length() == 0) {
                c11955m9.m56077x1(c14062gk.m66678du());
                c11955m9.m56078x1(false);
            } else if (c11955m9.m56052du() && !m55884k4(c14062gk, c11955m9.m56071to())) {
                throw new C11946jd(C14113y2.m67408k4("Invalid cookie domain: ", c11955m9.m56071to()));
            }
        }
        if (c11955m9.m56070rv() == 0 && C14113y2.m67411k4(c11955m9.m56057jd())) {
            c11955m9.m56072to(c14062gk != null ? c14062gk.m66686k4() : "/");
        }
        if (c11955m9.m56070rv() != 1 || c11955m9.m56050ck().length() != 0 || c14062gk == null || c14062gk.m66690m9()) {
            return;
        }
        c11955m9.m56064k4(new int[]{c14062gk.m66695up()});
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55886k4(String str, String str2) {
        if (str.length() == 0) {
            return false;
        }
        if (str.charAt(0) == '.') {
            str = C14113y2.m67422kk(str, 1);
        }
        return C14113y2.m67360du(str2, str, (short) 3) == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55887k4(String str, String str2, boolean z) {
        if (str.length() == 0) {
            return false;
        }
        if (str.charAt(0) == '.') {
            str = C14113y2.m67422kk(str, 1);
        }
        if (z) {
            return C14113y2.m67360du(str2, str, (short) 3) == 0;
        }
        if (!C14113y2.m67449x1(str2, str, (short) 3)) {
            return false;
        }
        int length = (str2.length() - str.length()) - 1;
        return length < 0 || str2.charAt(length) == '.';
    }
}
