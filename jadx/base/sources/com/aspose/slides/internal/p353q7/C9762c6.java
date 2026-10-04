package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p131fi.C3997k4;
import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12022v4;
import com.aspose.slides.internal.p505xn.C12565ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9762c6 extends AbstractC9769fa {

    /* JADX INFO: renamed from: x1 */
    private static final C9762c6 f35273x1 = new C9762c6();

    /* JADX INFO: renamed from: k4 */
    private C9790ts f35274k4;

    private C9762c6() {
        super(m48022up(), null);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m48020k4(C12004dy c12004dy, int i) {
        if (!c12004dy.m56529h4(i)) {
            if (i == 1 || i == 2) {
                if (c12004dy.m56529h4(3)) {
                    return 3;
                }
            } else if (i == 3) {
                if (c12004dy.m56529h4(2)) {
                    return 2;
                }
                if (c12004dy.m56529h4(1)) {
                    return 1;
                }
            }
            if (c12004dy.m56529h4(0)) {
                return 0;
            }
            if (c12004dy.m56529h4(1)) {
                return 1;
            }
            if (c12004dy.m56529h4(2)) {
                return 2;
            }
            if (c12004dy.m56529h4(3)) {
                return 3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: up */
    private static String[] m48022up() {
        try {
            return C3997k4.m15793x1().mo15796k4();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: fa */
    public final C9790ts m48023fa() {
        if (this.f35274k4 == null) {
            C9790ts c9790tsM48115k4 = C9775k4.m48094x1().m48059dy().m48115k4(0);
            if (c9790tsM48115k4 == null) {
                c9790tsM48115k4 = C9775k4.m48094x1().m48059dy().m48114k4();
            }
            this.f35274k4 = c9790tsM48115k4;
        }
        return this.f35274k4;
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: kk */
    public C9773ix[] mo48027kk() {
        return m48059dy().m48119x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9790ts m48028x1() {
        if (this.f35274k4 == null) {
            C9790ts c9790tsM48115k4 = m48059dy().m48115k4(0);
            if (c9790tsM48115k4 == null) {
                c9790tsM48115k4 = m48059dy().m48116k4(C12022v4.m56852x1().m56651x1().m56527du(), 0, false);
            }
            if (c9790tsM48115k4 == null) {
                c9790tsM48115k4 = m48059dy().m48114k4();
            }
            this.f35274k4 = c9790tsM48115k4;
        }
        return this.f35274k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C9762c6 m48021k4() {
        return f35273x1;
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: x1 */
    public C9790ts mo48029x1(String str, int i) {
        return m48059dy().m48118x1(str, i, true);
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: k4 */
    public C9790ts mo48024k4(int i) {
        return m48059dy().m48115k4(i);
    }

    @Override // com.aspose.slides.internal.p353q7.InterfaceC9759bv
    /* JADX INFO: renamed from: k4 */
    public C9790ts mo3692k4(String str, int i) {
        return m48059dy().m48116k4(str, i, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48025k4(String str, int i, String str2) {
        C9790ts c9790tsM48116k4 = m48059dy().m48116k4(str, i, false);
        if (c9790tsM48116k4 == null) {
            if (C12565ks.m58630x1(str2)) {
                c9790tsM48116k4 = m48059dy().m48116k4(str2, i, false);
            }
            if (c9790tsM48116k4 == null && (c9790tsM48116k4 = m48059dy().m48115k4(i)) == null) {
                c9790tsM48116k4 = m48059dy().m48116k4(new C12013m9(str, 10.0f).m56648m9(), i, false);
                if (c9790tsM48116k4 == null) {
                    C9790ts c9790tsM48116k42 = C9775k4.m48094x1().m48059dy().m48116k4(str, i, false);
                    if (c9790tsM48116k42 == null) {
                        if (C12565ks.m58630x1(str2)) {
                            c9790tsM48116k42 = C9775k4.m48094x1().m48059dy().m48116k4(str2, i, false);
                        }
                        if (c9790tsM48116k42 == null && (c9790tsM48116k42 = m48028x1()) == null) {
                            C9790ts c9790tsM48023fa = m48023fa();
                            if (c9790tsM48023fa != null) {
                                return c9790tsM48023fa;
                            }
                            throw new InvalidOperationException("Cannot find any fonts installed on the system.");
                        }
                    }
                    return c9790tsM48116k42;
                }
            }
        }
        return c9790tsM48116k4;
    }

    @Override // com.aspose.slides.internal.p353q7.InterfaceC9759bv
    /* JADX INFO: renamed from: k4 */
    public C12013m9 mo3693k4(String str, float f, int i) {
        try {
            return C12013m9.m56632k4(str, f, i);
        } catch (ArgumentException unused) {
            C12004dy c12004dy = new C12004dy(str);
            return C12013m9.m56630k4(c12004dy, f, m48020k4(c12004dy, i));
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: k4 */
    public void mo48026k4(IGenericDictionary<String, String> iGenericDictionary) {
        Dictionary<String, String> dictionaryM17622k4 = C4375kk.m17622k4(iGenericDictionary);
        Dictionary.ValueCollection.Enumerator<String, String> it = dictionaryM17622k4.getValues().iterator();
        while (it.hasNext()) {
            String next = it.next();
            iGenericDictionary.set_Item(next, next);
            mo48067x1(next);
        }
        dictionaryM17622k4.clear();
    }
}
