package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9762c6;
import com.aspose.slides.internal.p353q7.C9775k4;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p353q7.InterfaceC9759bv;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p475wh.C12001c5;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.u3 */
/* JADX INFO: loaded from: classes3.dex */
class C14614u3 {

    /* JADX INFO: renamed from: to */
    private static final List<String> f49235to;

    /* JADX INFO: renamed from: k4 */
    private String f49236k4;

    /* JADX INFO: renamed from: kk */
    private boolean f49237kk;

    /* JADX INFO: renamed from: x1 */
    private int f49238x1;

    static {
        List<String> list = new List<>();
        f49235to = list;
        list.addItem(" hairline");
        list.addItem(" ultralight");
        list.addItem(" extralight");
        list.addItem(" light");
        list.addItem(" normal");
        list.addItem(" medium");
        list.addItem(" demibold");
        list.addItem(" bold");
        list.addItem(" ultrabold");
        list.addItem(" extrabold");
        list.addItem(" heavy");
        list.addItem(" condensed");
        list.addItem(" semicondensed");
        list.addItem(" semibold");
        list.addItem(" semilight");
    }

    private C14614u3(String str, int i) {
        this.f49236k4 = str;
        this.f49238x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private C9790ts m71477k4(InterfaceC9759bv interfaceC9759bv, boolean z) {
        C9790ts c9790tsM71478k4;
        String strM67394k4;
        C9790ts c9790tsM71478k42;
        C9790ts c9790tsM71478k43 = m71478k4(interfaceC9759bv, z, this.f49236k4, this.f49238x1);
        if (c9790tsM71478k43 != null) {
            return c9790tsM71478k43;
        }
        if (C14113y2.m67359c5(this.f49236k4, " ")) {
            String[] strArr = {null};
            int i = 0;
            int[] iArr = {0};
            boolean zM71482k4 = m71482k4(this.f49236k4, strArr, iArr);
            String str = strArr[0];
            int i2 = iArr[0];
            if (zM71482k4) {
                String strM67396k4 = C14113y2.m67396k4(this.f49236k4, i2, str.length());
                int i3 = C14113y2.m67359c5(str, "bold") ? this.f49238x1 | 1 : this.f49238x1;
                C9790ts c9790tsM71478k44 = m71478k4(interfaceC9759bv, z, strM67396k4, i3);
                if (c9790tsM71478k44 != null) {
                    this.f49236k4 = strM67396k4;
                    this.f49238x1 = i3;
                    return c9790tsM71478k44;
                }
                int iM67418kk = C14113y2.m67418kk(strM67396k4, ControlChar.SPACE_CHAR);
                if (iM67418kk > -1 && C14057f9.m66590k4(C14113y2.m67422kk(strM67396k4, iM67418kk), new int[]{0}) && (c9790tsM71478k42 = m71478k4(interfaceC9759bv, z, (strM67394k4 = C14113y2.m67394k4(strM67396k4, iM67418kk)), i3)) != null) {
                    this.f49236k4 = strM67394k4;
                    this.f49238x1 = i3;
                    return c9790tsM71478k42;
                }
            } else {
                C6765kp c6765kp = new C6765kp();
                c6765kp.m26792k4(this.f49236k4);
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                c6765kp.m26792k4(AbstractC14106wy.getName((Class<?>) C12001c5.class, this.f49238x1));
                while (i < c6765kp.m26807x1()) {
                    if (c6765kp.m26806x1(i) == ',') {
                        c6765kp.m26809x1(i, 1);
                        i--;
                    }
                    i++;
                }
                String string = c6765kp.toString();
                C9790ts c9790tsM71478k45 = m71478k4(interfaceC9759bv, z, string, this.f49238x1);
                if (c9790tsM71478k45 != null) {
                    this.f49236k4 = string;
                    return c9790tsM71478k45;
                }
            }
        }
        if (C14113y2.m67424kk(C14113y2.m67368h4(this.f49236k4), "unicode") || (c9790tsM71478k4 = m71478k4(interfaceC9759bv, z, C14113y2.m67408k4(this.f49236k4, " Unicode"), this.f49238x1)) == null) {
            return null;
        }
        this.f49236k4 = C14113y2.m67400k4(this.f49236k4, " Unicode");
        return c9790tsM71478k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C9790ts m71478k4(InterfaceC9759bv interfaceC9759bv, boolean z, String str, int i) {
        return z ? C9762c6.m48021k4().m48025k4(str, i, (String) null) : interfaceC9759bv.mo3692k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    private C14251ot m71479k4(InterfaceC9759bv interfaceC9759bv, boolean z, float f, byte b, int i, boolean z2) {
        int i2 = this.f49238x1;
        String str = this.f49236k4;
        if (str == null) {
            this.f49236k4 = "";
        }
        C9790ts c9790tsM71477k4 = m71477k4(interfaceC9759bv, z2);
        if (c9790tsM71477k4 == null) {
            return null;
        }
        C5659x1 c5659x1 = new C5659x1((4.0f * f) / 3.0f, this.f49238x1, c9790tsM71477k4, z ? 2 : 1);
        if (!C7019kk.m27469x1(interfaceC9759bv, C0758ap.class)) {
            m71481k4(c9790tsM71477k4);
        }
        C12013m9 c12013m9Mo3693k4 = interfaceC9759bv.mo3693k4(c5659x1.m23123m9(), f, this.f49238x1);
        if (c12013m9Mo3693k4 == null) {
            c12013m9Mo3693k4 = interfaceC9759bv.mo3693k4(this.f49236k4, f, this.f49238x1);
        }
        C12013m9 c12013m9 = c12013m9Mo3693k4;
        if ((c12013m9 != null && (C7019kk.m27469x1(interfaceC9759bv, C9775k4.class) || c9790tsM71477k4.m48214k4(c12013m9.m56651x1().m56527du(), true))) || z2) {
            return new C14251ot(str, b, i, f, i2, z, !z2, c5659x1, c12013m9, this.f49237kk);
        }
        if (C7019kk.m27469x1(interfaceC9759bv, C9762c6.class) && C14113y2.m67424kk(C14113y2.m67368h4(c9790tsM71477k4.m48187h4()), ".otf") && !FontsLoader.m1532k4(c9790tsM71477k4.m48228to())) {
            try {
                byte[] bArrM13362m9 = C3131h4.m13362m9(c9790tsM71477k4.m48187h4());
                if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArrM13362m9, 0, 4))) {
                    FontsLoader.loadExternalFont(C11240k4.m54219k4(bArrM13362m9));
                }
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14251ot m71480k4(String str, int i, InterfaceC9759bv interfaceC9759bv, boolean z, float f, byte b, int i2, boolean z2) {
        return new C14614u3(str, i).m71479k4(interfaceC9759bv, z, f, b, i2, z2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71481k4(C9790ts c9790ts) {
        int iM48183dy = c9790ts.m48183dy();
        int i = this.f49238x1;
        if (((iM48183dy ^ i) & 1) == 1 && (i & 1) == 1) {
            this.f49237kk = true;
            this.f49238x1 = i & (-2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m71482k4(String str, String[] strArr, int[] iArr) {
        strArr[0] = null;
        iArr[0] = -1;
        String strM67368h4 = C14113y2.m67368h4(str);
        List.Enumerator<String> it = f49235to.iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                if (C14113y2.m67359c5(strM67368h4, next)) {
                    strArr[0] = next;
                    iArr[0] = C14113y2.m67364dy(strM67368h4, next);
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return false;
    }
}
