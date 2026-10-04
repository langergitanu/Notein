package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.C4731ks;
import com.aspose.slides.internal.p196j0.C5140x1;
import com.aspose.slides.internal.p221k8.C5645k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C12832ne {

    /* JADX INFO: renamed from: du */
    private static TreeMap<String, String> f42684du = new TreeMap<>();

    /* JADX INFO: renamed from: k4 */
    static final Object f42685k4 = new Object();

    /* JADX INFO: renamed from: kk */
    private static String f42686kk = null;

    /* JADX INFO: renamed from: to */
    private static boolean f42687to = true;

    /* JADX INFO: renamed from: x1 */
    private static boolean f42688x1 = false;

    /* JADX INFO: renamed from: c5 */
    private String f42689c5;

    /* JADX INFO: renamed from: dy */
    private String f42690dy;

    /* JADX INFO: renamed from: h4 */
    private C4731ks f42691h4;

    /* JADX INFO: renamed from: m9 */
    private String f42692m9;

    public C12832ne(C4731ks c4731ks) {
        this(c4731ks, null, null);
    }

    /* JADX INFO: renamed from: c5 */
    private String m59653c5() {
        String string;
        if (this.f42689c5 == null) {
            if (m59654dy()) {
                string = "default";
            } else {
                String str = this.f42691h4.f13193k4;
                if (str == null || str.length() == 0) {
                    string = C14047bz.m66536x1().toString();
                } else {
                    string = new C14047bz(AbstractC4715g8.m19610du().m19588x1(AbstractC6747ar.m26635ix().mo26677to(this.f42691h4.f13193k4))).toString();
                }
            }
            this.f42689c5 = string;
        }
        return this.f42689c5;
    }

    /* JADX INFO: renamed from: dy */
    private boolean m59654dy() {
        return (this.f42691h4.m19669k4() & 2) == 2;
    }

    /* JADX INFO: renamed from: h4 */
    private static String m59655h4() {
        String str;
        synchronized (f42685k4) {
            try {
                if (f42687to && ((str = f42686kk) == null || !f42688x1)) {
                    if (str == null) {
                        f42686kk = C3141rv.m13402k4();
                    }
                    String strM13412x1 = C3141rv.m13412x1(f42686kk, "keypairs");
                    f42686kk = strM13412x1;
                    boolean zM13421kk = C3142to.m13421kk(strM13412x1);
                    f42688x1 = zM13421kk;
                    if (!zM13421kk) {
                        try {
                            C3142to.m13416k4(f42686kk);
                            f42688x1 = true;
                        } catch (RuntimeException e) {
                            throw new CryptographicException(C14113y2.m67402k4(C12825ix.m59623k4("Could not create user key store '{0}'."), f42686kk), e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f42686kk;
    }

    /* JADX INFO: renamed from: jd */
    private String m59656jd() {
        C6765kp c6765kp = new C6765kp();
        C6765kp.m26772k4(c6765kp, "<KeyPair>{0}\t<Properties>{0}\t\t<Provider ", C14052dq.f47188k4);
        String str = this.f42691h4.f13194kk;
        if (str != null && str.length() != 0) {
            C6765kp.m26772k4(c6765kp, "Name=\"{0}\" ", this.f42691h4.f13194kk);
        }
        C6765kp.m26772k4(c6765kp, "Type=\"{0}\" />{1}\t\t<Container ", Integer.valueOf(this.f42691h4.f13195to), C14052dq.f47188k4);
        C6765kp.m26772k4(c6765kp, "Name=\"{0}\" />{1}\t</Properties>{1}\t<KeyValue", m59653c5(), C14052dq.f47188k4);
        int i = this.f42691h4.f13196x1;
        if (i != -1) {
            C6765kp.m26772k4(c6765kp, " Id=\"{0}\" ", Integer.valueOf(i));
        }
        C6765kp.m26772k4(c6765kp, ">{1}\t\t{0}{1}\t</KeyValue>{1}</KeyPair>{1}", m59665x1(), C14052dq.f47188k4);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private C4731ks m59657k4(C4731ks c4731ks) {
        C4731ks c4731ks2 = new C4731ks(c4731ks.f13195to, c4731ks.f13194kk, c4731ks.f13193k4);
        c4731ks2.f13196x1 = c4731ks.f13196x1;
        c4731ks2.m19670k4(c4731ks.m19669k4());
        return c4731ks2;
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m59658m9() {
        return this.f42692m9 == null;
    }

    /* JADX INFO: renamed from: du */
    public void m59660du() {
        if (f42687to) {
            C3131h4.m13365x1(m59661k4());
        } else if (f42684du.containsKey(m59661k4())) {
            f42684du.remove(m59661k4());
        }
    }

    /* JADX INFO: renamed from: kk */
    public boolean m59663kk() {
        if (!f42687to) {
            boolean zContainsKey = f42684du.containsKey(m59661k4());
            if (zContainsKey) {
                m59659x1(f42684du.get(m59661k4()));
            }
            return zContainsKey;
        }
        boolean zM13361kk = C3131h4.m13361kk(m59661k4());
        if (!zM13361kk) {
            return zM13361kk;
        }
        C3148wl c3148wlM13347du = C3131h4.m13347du(m59661k4());
        try {
            m59659x1(c3148wlM13347du.mo13427dy());
            c3148wlM13347du.mo13059to();
            return zM13361kk;
        } catch (Throwable th) {
            if (c3148wlM13347du != null) {
                c3148wlM13347du.mo13059to();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: to */
    public void m59664to() {
        if (!f42687to) {
            f42684du.put(m59661k4(), m59656jd());
            return;
        }
        C3130fa c3130faM13351k4 = C3131h4.m13351k4(m59661k4(), 2);
        try {
            C3123ar c3123ar = new C3123ar(c3130faM13351k4, AbstractC6747ar.m26635ix());
            c3123ar.mo13304k4(m59656jd());
            c3123ar.mo13309to();
        } finally {
            if (c3130faM13351k4 != null) {
                c3130faM13351k4.close();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public String m59665x1() {
        return this.f42692m9;
    }

    public C12832ne(C4731ks c4731ks, String str, String str2) {
        if (c4731ks == null) {
            throw new ArgumentNullException("parameters");
        }
        this.f42691h4 = m59657k4(c4731ks);
        this.f42692m9 = str;
        f42686kk = str2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m59659x1(String str) {
        C5645k4 c5645k4 = new C5645k4();
        c5645k4.m23044k4(str);
        C5140x1 c5140x1M23042k4 = c5645k4.m23042k4();
        if ("KeyPair".equals(c5140x1M23042k4.m22020x1())) {
            C5140x1 c5140x1M22019m9 = c5140x1M23042k4.m22019m9("KeyValue");
            if (c5140x1M22019m9.m22015k4().size() > 0) {
                this.f42692m9 = c5140x1M22019m9.m22015k4().get_Item(0).toString();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public String m59661k4() {
        if (this.f42690dy == null) {
            this.f42690dy = C14113y2.m67391k4(C11697x1.m55250kk(), "[{0}][{1}][{2}].xml", Integer.valueOf(this.f42691h4.f13195to), m59653c5(), Integer.valueOf(this.f42691h4.f13196x1));
            if (f42687to) {
                this.f42690dy = C3141rv.m13412x1(m59655h4(), this.f42690dy);
            }
        }
        return this.f42690dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m59662k4(String str) {
        if (m59658m9()) {
            this.f42692m9 = str;
        }
    }
}
