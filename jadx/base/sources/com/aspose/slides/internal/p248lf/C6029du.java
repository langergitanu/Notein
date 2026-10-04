package com.aspose.slides.internal.p248lf;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p231kk.C5791k4;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5817yj;
import com.aspose.slides.internal.p237ks.C5904h4;
import com.aspose.slides.internal.p237ks.C5908m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p317og.C7039k4;
import com.aspose.slides.internal.p321on.C7125kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10314to;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p535yz.C13339du;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lf.du */
/* JADX INFO: loaded from: classes.dex */
public class C6029du {

    /* JADX INFO: renamed from: ar */
    private static final C7017h4 f17080ar = new C7017h4("serif", "sans-serif", "monospace");

    /* JADX INFO: renamed from: dy */
    public String f17084dy;

    /* JADX INFO: renamed from: h4 */
    public boolean f17086h4;

    /* JADX INFO: renamed from: k4 */
    public int f17089k4;

    /* JADX INFO: renamed from: ks */
    public boolean f17091ks;

    /* JADX INFO: renamed from: m9 */
    public int f17092m9;

    /* JADX INFO: renamed from: qq */
    private final C3783ck f17094qq;

    /* JADX INFO: renamed from: rv */
    public boolean f17095rv;

    /* JADX INFO: renamed from: u4 */
    private final C3786fa f17097u4;

    /* JADX INFO: renamed from: uz */
    private final C3787h4 f17099uz;

    /* JADX INFO: renamed from: wl */
    private final InterfaceC3793to f17100wl;

    /* JADX INFO: renamed from: x6 */
    public C3181c5 f17102x6;

    /* JADX INFO: renamed from: yj */
    public boolean f17103yj;

    /* JADX INFO: renamed from: ix */
    private final Dictionary<String, byte[]> f17087ix = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    public String f17101x1 = "Times New Roman";

    /* JADX INFO: renamed from: kk */
    public boolean f17090kk = false;

    /* JADX INFO: renamed from: to */
    public boolean f17096to = false;

    /* JADX INFO: renamed from: du */
    public float f17083du = 16.001f;

    /* JADX INFO: renamed from: c5 */
    public float f17081c5 = 0.0f;

    /* JADX INFO: renamed from: jd */
    public boolean f17088jd = false;

    /* JADX INFO: renamed from: ck */
    public float f17082ck = 0.0f;

    /* JADX INFO: renamed from: fa */
    public C12003du f17085fa = C12003du.m56460uz().Clone();

    /* JADX INFO: renamed from: up */
    public C12003du f17098up = C12003du.m56460uz().Clone();

    /* JADX INFO: renamed from: ne */
    public float f17093ne = 0.001f;

    public C6029du(C3786fa c3786fa, C3787h4 c3787h4, InterfaceC3793to interfaceC3793to, C3783ck c3783ck) {
        this.f17097u4 = c3786fa;
        this.f17099uz = c3787h4;
        this.f17100wl = interfaceC3793to;
        this.f17094qq = c3783ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m24337k4(String str) {
        byte[] bArrM23692k4;
        C12004dy c12004dyM56524to;
        try {
            for (String str2 : C14113y2.m67417k4(C14113y2.m67440x1(str), new String[]{","}, 1)) {
                String strM67423kk = C14113y2.m67423kk(C14113y2.m67440x1(str2), '\"', '\'');
                int iM27428k4 = f17080ar.m27428k4(strM67423kk);
                if (iM27428k4 == 0) {
                    c12004dyM56524to = C12004dy.m56524to();
                } else if (iM27428k4 == 1) {
                    c12004dyM56524to = C12004dy.m56523kk();
                } else if (iM27428k4 != 2) {
                    for (C12004dy c12004dy : C12004dy.m56522k4()) {
                        if (C14113y2.m67432to(c12004dy.m56527du(), strM67423kk, (short) 5)) {
                            return c12004dy.m56527du();
                        }
                    }
                    if (this.f17094qq.m15115k4().containsKey(strM67423kk)) {
                        List<C6035x1> listM24362k4 = C6035x1.m24362k4(C6035x1.m24364x1(C6035x1.m24363k4(this.f17094qq.m15115k4().get_Item(strM67423kk), this.f17086h4), this.f17088jd), this.f17092m9);
                        if (listM24362k4.size() > 0) {
                            return listM24362k4.get_Item(0).m24367k4().m62010b3();
                        }
                    }
                } else {
                    c12004dyM56524to = C12004dy.m56525x1();
                }
                return c12004dyM56524to.m56527du();
            }
            C9790ts c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(str, m24342x1());
            if (c9790tsMo48031k4 != null) {
                return c9790tsMo48031k4.m48202k4();
            }
            C12013m9 c12013m9 = new C12013m9(str, 10.0f);
            if (C14113y2.m67367h4(c12013m9.m56648m9(), str, (short) 1) > -1) {
                return c12013m9.m56648m9();
            }
            if (!this.f17087ix.containsKey(str)) {
                if (this.f17099uz.m15134k4() == null) {
                    return "Times-Roman";
                }
                IGenericEnumerator<C5908m9> it = this.f17099uz.m15134k4().mo23390x1().iterator();
                while (it.hasNext()) {
                    try {
                        InterfaceC5797ne next = it.next();
                        if (next.mo23403k4() == 5) {
                            C5904h4 c5904h4M23774k4 = C5904h4.m23774k4((InterfaceC5817yj) C7019kk.m27452k4((Object) next, InterfaceC5817yj.class));
                            if (C14113y2.m67363du(c5904h4M23774k4.mo23764k4(), str)) {
                                it = c5904h4M23774k4.mo23765x1().iterator();
                                while (it.hasNext()) {
                                    try {
                                        C5908m9 next2 = it.next();
                                        try {
                                        } catch (RuntimeException e) {
                                            if (!C4113k4.f11284k4) {
                                                throw e;
                                            }
                                        }
                                        if (next2.m23798k4()) {
                                            C12013m9 c12013m92 = new C12013m9(next2.m23800x1(), 10.0f);
                                            if (C14113y2.m67367h4(c12013m92.m56648m9(), str, (short) 1) > -1) {
                                                String strM56648m9 = c12013m92.m56648m9();
                                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                                    it.dispose();
                                                }
                                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                                    it.dispose();
                                                }
                                                return strM56648m9;
                                            }
                                        } else {
                                            C5801ss c5801ssMo14413k4 = this.f17100wl.mo14413k4(this, new C5811wp(next2.m23800x1()));
                                            if ((C14113y2.m67411k4(next2.m23799kk()) || !C14113y2.m67432to(next2.m23799kk(), "woff", (short) 5)) && ((C14113y2.m67411k4(next2.m23800x1()) || !C14113y2.m67432to(C3141rv.m13397du(next2.m23800x1()), ".woff", (short) 5)) && (C14113y2.m67411k4(next2.m23800x1()) || !C14113y2.m67359c5(next2.m23800x1(), "x-font-woff")))) {
                                                bArrM23692k4 = c5801ssMo14413k4.m23692k4();
                                            } else {
                                                C7039k4 c7039k4 = new C7039k4();
                                                C3152yj c3152yj = new C3152yj();
                                                c7039k4.m27558k4(new C3152yj(c5801ssMo14413k4.m23692k4()), c3152yj);
                                                bArrM23692k4 = c3152yj.getBuffer();
                                            }
                                            this.f17087ix.addItem(str, bArrM23692k4);
                                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                                it.dispose();
                                            }
                                        }
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            it.dispose();
                                        }
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    return "Times-Roman";
                }
                it.dispose();
                return "Times-Roman";
            }
            return str;
        } catch (RuntimeException e2) {
            if (C4113k4.f11284k4) {
                return "Arial";
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<String, byte[]> m24341kk() {
        return this.f17087ix;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m24342x1() {
        int i = this.f17086h4 ? 2 : 0;
        return m24339k4() ? i | 1 : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0152 A[PHI: r7
      0x0152: PHI (r7v8 java.lang.String) = (r7v1 java.lang.String), (r7v2 java.lang.String) binds: [B:58:0x0150, B:64:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24338k4(C3181c5 c3181c5) {
        boolean z;
        boolean z2;
        C10314to c10314toM50289k4;
        C3786fa c3786fa;
        float f;
        C3187kk c3187kk = c3181c5.f9461x1;
        List<C5791k4> listM27650k4 = null;
        String[] strArr = {null};
        boolean zM13688k4 = c3187kk.m13688k4("style", strArr);
        String str = strArr[0];
        if (zM13688k4) {
            C3794up.m15167x1(str);
        } else {
            strArr[0] = str;
            boolean zM13688k42 = c3187kk.m13688k4("class", strArr);
            str = strArr[0];
            if (zM13688k42) {
                listM27650k4 = C7125kk.m27650k4(this.f17099uz.m15134k4(), str, (String) null);
            }
        }
        strArr[0] = str;
        boolean zM24336k4 = m24336k4(c3187kk, listM27650k4, "font-family", strArr);
        String str2 = strArr[0];
        if (zM24336k4) {
            this.f17101x1 = m24337k4(str2);
        }
        strArr[0] = str2;
        boolean zM24336k42 = m24336k4(c3187kk, listM27650k4, "font-size", strArr);
        String str3 = strArr[0];
        if (zM24336k42) {
            if (C10307du.m50262k4(str3, C10307du.m50263kk(0.0f)).m50269x1() == 3) {
                c3786fa = this.f17097u4;
                f = this.f17083du;
            } else {
                c3786fa = this.f17097u4;
                f = 10.0f;
            }
            this.f17083du = c3786fa.m15127k4(str3, c3181c5, f);
        }
        strArr[0] = str3;
        boolean zM24336k43 = m24336k4(c3187kk, listM27650k4, "font-style", strArr);
        String str4 = strArr[0];
        if (zM24336k43 && (C14113y2.m67363du(str4, "italic") || C14113y2.m67363du(str4, "oblique"))) {
            this.f17086h4 = true;
        }
        strArr[0] = str4;
        boolean zM24336k44 = m24336k4(c3187kk, listM27650k4, "font-weight", strArr);
        String str5 = strArr[0];
        if (zM24336k44) {
            this.f17092m9 = C13339du.m61993k4(str5);
        }
        strArr[0] = str5;
        boolean zM24336k45 = m24336k4(c3187kk, listM27650k4, "font-variant", strArr);
        String str6 = strArr[0];
        if (zM24336k45) {
            this.f17088jd = C14113y2.m67363du("small-caps", str6);
        }
        strArr[0] = str6;
        boolean zM24336k46 = m24336k4(c3187kk, listM27650k4, "letter-spacing", strArr);
        String str7 = strArr[0];
        if (zM24336k46) {
            this.f17082ck = this.f17097u4.m15128k4(str7, C14113y2.f47374k4, c3181c5);
        }
        strArr[0] = str7;
        boolean zM24336k47 = m24336k4(c3187kk, listM27650k4, "word-spacing", strArr);
        String str8 = strArr[0];
        if (zM24336k47) {
            this.f17093ne = this.f17097u4.m15128k4(str8, C14113y2.f47374k4, c3181c5);
        }
        strArr[0] = str8;
        boolean zM13688k43 = c3187kk.m13688k4("baseline-shift", strArr);
        String str9 = strArr[0];
        if (zM13688k43) {
            if (C14113y2.m67363du(str9, "sub")) {
                this.f17090kk = true;
            }
            if (C14113y2.m67363du(str9, "super")) {
                this.f17096to = true;
            }
        }
        strArr[0] = str9;
        boolean zM13688k44 = c3187kk.m13688k4("text-decoration", strArr);
        String str10 = strArr[0];
        if (zM13688k44) {
            this.f17102x6 = c3181c5;
            this.f17103yj = "underline".equals(str10);
            this.f17091ks = "overline".equals(str10);
            this.f17095rv = "line-through".equals(str10);
        }
        strArr[0] = str10;
        boolean zM13688k45 = c3187kk.m13688k4("textLength", strArr);
        String str11 = strArr[0];
        if (zM13688k45) {
            this.f17081c5 = this.f17097u4.m15128k4(str11, "textLength", c3181c5);
        }
        strArr[0] = str11;
        boolean z3 = c3187kk.m13688k4("stroke", strArr) && !"none".equals(strArr[0]);
        String str12 = strArr[0];
        if (z3) {
            C10314to.m50289k4(str12).m50292k4().CloneTo(this.f17085fa);
            z = true;
        } else {
            strArr[0] = str12;
            boolean zM24336k48 = m24336k4(c3187kk, listM27650k4, "stroke", strArr);
            str12 = strArr[0];
            if (zM24336k48) {
                if (!C14113y2.m67448x1(str12, "url")) {
                }
                z = true;
            } else {
                z = false;
            }
        }
        strArr[0] = str12;
        boolean z4 = c3187kk.m13688k4("fill", strArr) && !"none".equals(strArr[0]);
        String str13 = strArr[0];
        if (!z4) {
            strArr[0] = str13;
            boolean zM24336k49 = m24336k4(c3187kk, listM27650k4, "fill", strArr);
            String str14 = strArr[0];
            if (!zM24336k49) {
                z2 = false;
                if (!z2) {
                }
                if (!z2) {
                }
                if (z2) {
                    return;
                } else {
                    return;
                }
            }
            if (!C14113y2.m67448x1(str14, "url")) {
                c10314toM50289k4 = C10314to.m50289k4(str14);
            }
            z2 = true;
            if (!z2 && z) {
                this.f17089k4 = 0;
                return;
            }
            if (!z2 && !z) {
                this.f17089k4 = 1;
                return;
            } else {
                if (z2 || !z) {
                    return;
                }
                this.f17089k4 = 2;
                return;
            }
        }
        c10314toM50289k4 = C10314to.m50289k4(str13);
        c10314toM50289k4.m50292k4().CloneTo(this.f17098up);
        z2 = true;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z2) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24339k4() {
        return C13339du.m61995kk(this.f17092m9);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m24336k4(C3187kk c3187kk, List<C5791k4> list, String str, String[] strArr) {
        if (c3187kk.m13688k4(str, strArr)) {
            return true;
        }
        if (list == null || list.size() == 0) {
            strArr[0] = null;
            return false;
        }
        List.Enumerator<C5791k4> it = list.iterator();
        while (it.hasNext()) {
            try {
                String strMo23666k1 = it.next().mo23666k1(str);
                strArr[0] = strMo23666k1;
                if (!C14113y2.m67411k4(strMo23666k1)) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        strArr[0] = null;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24340k4(C6029du c6029du) {
        return C14113y2.m67363du(this.f17101x1, c6029du.f17101x1) && this.f17090kk == c6029du.f17090kk && this.f17096to == c6029du.f17096to && this.f17083du == c6029du.f17083du && this.f17086h4 == c6029du.f17086h4 && this.f17092m9 == c6029du.f17092m9 && m24339k4() == c6029du.m24339k4() && this.f17088jd == c6029du.f17088jd && this.f17082ck == c6029du.f17082ck && C12003du.m56403k4(this.f17085fa, c6029du.f17085fa) && C12003du.m56403k4(this.f17098up, c6029du.f17098up) && this.f17103yj == c6029du.f17103yj && this.f17091ks == c6029du.f17091ks && this.f17095rv == c6029du.f17095rv && this.f17102x6 == c6029du.f17102x6 && this.f17093ne == c6029du.f17093ne;
    }
}
