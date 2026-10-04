package com.aspose.slides.internal.p144g6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p060ca.AbstractC2220nx;
import com.aspose.slides.internal.p060ca.AbstractC2313tw;
import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.C2182lv;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.internal.p060ca.InterfaceC2201mt;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.C3169ck;
import com.aspose.slides.internal.p085dk.C3172fa;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p353q7.AbstractC9784rv;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12571u4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.to */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4221to {

    /* JADX INFO: renamed from: k4 */
    private int f11518k4;

    /* JADX INFO: renamed from: to */
    private final String f11521to;

    /* JADX INFO: renamed from: x1 */
    private int f11522x1;

    /* JADX INFO: renamed from: kk */
    private final C6765kp f11519kk = new C6765kp();

    /* JADX INFO: renamed from: du */
    private final Dictionary<Integer, C4214jd> f11514du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private final Dictionary<Integer, byte[]> f11516h4 = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    private final C12571u4<InterfaceC2201mt> f11520m9 = new C12571u4<>();

    /* JADX INFO: renamed from: dy */
    private final Dictionary<AbstractC9784rv, String> f11515dy = new Dictionary<>();

    /* JADX INFO: renamed from: c5 */
    private final Dictionary<String, String> f11512c5 = new Dictionary<>();

    /* JADX INFO: renamed from: jd */
    private C3173h4 f11517jd = new C3173h4();

    /* JADX INFO: renamed from: ck */
    private List<C3172fa> f11513ck = new List<>();

    public AbstractC4221to(String str) {
        this.f11521to = str;
    }

    /* JADX INFO: renamed from: kk */
    private static int m16984kk(String str) {
        int length = str.length();
        int i = 352654597;
        int i2 = 352654597;
        int i3 = 0;
        while (length > 0) {
            int iCharAt = ((length > 1 ? str.charAt(i3 + 1) : (char) 0) << 16) + str.charAt(i3);
            int iCharAt2 = ((length > 3 ? str.charAt(i3 + 3) : (char) 0) << 16) + (length > 2 ? str.charAt(i3 + 2) : (char) 0);
            i = (((i << 5) + i) + (i >> 27)) ^ iCharAt;
            if (length <= 2) {
                break;
            }
            i2 = (((i2 << 5) + i2) + (i2 >> 27)) ^ iCharAt2;
            i3 += 4;
            length -= 4;
        }
        return (i2 * 1566083941) + i;
    }

    /* JADX INFO: renamed from: x1 */
    private int m16986x1() {
        int i = this.f11522x1 + 1;
        this.f11522x1 = i;
        return i;
    }

    /* JADX INFO: renamed from: du */
    public final C12571u4<InterfaceC2201mt> m16990du() {
        return this.f11520m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<Integer, C4214jd> m16991h4() {
        return this.f11514du;
    }

    /* JADX INFO: renamed from: k4 */
    public C4214jd mo16956k4(byte[] bArr, C6921dy c6921dy) throws Throwable {
        byte[] bArrM16983k4 = m16983k4(bArr);
        int iM27124k4 = C6921dy.m27124k4(bArrM16983k4, c6921dy);
        C4214jd[] c4214jdArr = {null};
        boolean zTryGetValue = this.f11514du.tryGetValue(Integer.valueOf(iM27124k4), c4214jdArr);
        C4214jd c4214jd = c4214jdArr[0];
        if (zTryGetValue) {
            return c4214jd;
        }
        if (c6921dy != null && c6921dy.m27132x1()) {
            C4127k4 c4127k4M27127k4 = c6921dy.m27127k4(bArrM16983k4);
            try {
                bArrM16983k4 = C4208ck.m16888k4(c4127k4M27127k4);
            } finally {
                if (c4127k4M27127k4 != null) {
                    c4127k4M27127k4.dispose();
                }
            }
        }
        C4214jd c4214jd2 = new C4214jd(m16989x1(bArrM16983k4), C12549du.m58492ix(bArrM16983k4), bArrM16983k4);
        this.f11514du.set_Item(Integer.valueOf(iM27124k4), c4214jd2);
        return c4214jd2;
    }

    /* JADX INFO: renamed from: to */
    public final C3173h4 m16996to() {
        return this.f11517jd;
    }

    /* JADX INFO: renamed from: kk */
    private String m16985kk(C9790ts c9790ts) {
        String[] strArr = {null};
        boolean zTryGetValue = this.f11515dy.tryGetValue(c9790ts.m48233um(), strArr);
        String str = strArr[0];
        if (zTryGetValue) {
            return str;
        }
        byte[] bArr = new byte[16];
        C12565ks.m58613k4(m16984kk(c9790ts.m48202k4()), bArr, 0);
        C12565ks.m58613k4(c9790ts.m48183dy(), bArr, 4);
        String strM16988x1 = m16988x1(C14113y2.m67402k4("{0}.{1}", new C14047bz(bArr).m66538k4("D"), "odttf"));
        this.f11515dy.addItem(c9790ts.m48233um(), strM16988x1);
        return strM16988x1;
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2201mt m16987x1(C9790ts c9790ts) {
        String strM16985kk = m16985kk(c9790ts);
        C2033cj c2033cj = null;
        InterfaceC2201mt[] interfaceC2201mtArr = {null};
        boolean zTryGetValue = this.f11520m9.tryGetValue(strM16985kk, interfaceC2201mtArr);
        InterfaceC2201mt interfaceC2201mt = interfaceC2201mtArr[0];
        if (zTryGetValue) {
            return interfaceC2201mt;
        }
        AbstractC3150x6 abstractC3150x6Mo47984x1 = c9790ts.m48233um().mo47984x1();
        try {
            byte[] bArrM58632x1 = C12565ks.m58632x1(abstractC3150x6Mo47984x1);
            try {
                for (C2033cj c2033cj2 : new C2182lv(new C2350wl(bArrM58632x1)).mo10154k4()) {
                    if (C14113y2.m67363du(c9790ts.m48228to(), c2033cj2.mo10137k4())) {
                        c2033cj = c2033cj2;
                    }
                }
            } catch (RuntimeException unused) {
                c2033cj = new C2033cj(0, new C2350wl(bArrM58632x1));
            }
            InterfaceC2201mt interfaceC2201mtMo10261fa = AbstractC2313tw.m11469k4(c2033cj).mo10261fa();
            this.f11520m9.set_Item(strM16985kk, interfaceC2201mtMo10261fa);
            return interfaceC2201mtMo10261fa;
        } finally {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public String mo16957k4(C9790ts c9790ts) {
        return m16985kk(c9790ts);
    }

    /* JADX INFO: renamed from: x1 */
    private String m16988x1(String str) {
        return C3169ck.m13541k4(this.f11521to, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m16992k4(C9790ts c9790ts, String str, AbstractC2220nx[][] abstractC2220nxArr) {
        InterfaceC2201mt interfaceC2201mtM16987x1 = m16987x1(c9790ts);
        this.f11519kk.m26801k4(0);
        AbstractC2220nx[] abstractC2220nxArrMo10751kk = interfaceC2201mtM16987x1.mo10751kk(str);
        for (int i = 0; i < abstractC2220nxArrMo10751kk.length; i++) {
            if (!interfaceC2201mtM16987x1.mo10802up().m11785x1(abstractC2220nxArrMo10751kk[i])) {
                interfaceC2201mtM16987x1.mo10802up().m11782k4(abstractC2220nxArrMo10751kk[i]);
            }
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) < 8234 || str.charAt(i2) > 8238) {
                this.f11519kk.m26780k4(str.charAt(i2));
            }
        }
        abstractC2220nxArr[0] = abstractC2220nxArrMo10751kk;
        return this.f11519kk.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private String m16989x1(byte[] bArr) {
        return m16988x1(C14113y2.m67402k4("image{0}.{1}", Integer.valueOf(m16986x1()), C12549du.m58497k4(C12549du.m58515x1(bArr))));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m16993k4(String str) {
        String[] strArr = {null};
        boolean zTryGetValue = this.f11512c5.tryGetValue(str, strArr);
        String str2 = strArr[0];
        if (zTryGetValue) {
            return str2;
        }
        int i = this.f11518k4;
        this.f11518k4 = i + 1;
        String strM67402k4 = C14113y2.m67402k4("bookmark_{0}", Integer.valueOf(i));
        this.f11512c5.set_Item(str, strM67402k4);
        return strM67402k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo16958k4() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16994k4(int i, String str) {
        this.f11513ck.addItem(new C3172fa(i, str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16995k4(C3173h4 c3173h4) {
        this.f11517jd = c3173h4;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m16983k4(byte[] bArr) {
        int iHashCode = AbstractC14092to.m67208k4((Object) bArr).hashCode();
        byte[][] bArr2 = {null};
        boolean zTryGetValue = this.f11516h4.tryGetValue(Integer.valueOf(iHashCode), bArr2);
        byte[] bArr3 = bArr2[0];
        if (zTryGetValue) {
            return bArr3;
        }
        byte[] bArrM16889k4 = C4208ck.m16889k4(bArr);
        this.f11516h4.set_Item(Integer.valueOf(iHashCode), bArrM16889k4);
        return bArrM16889k4;
    }
}
