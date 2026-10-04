package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.so */
/* JADX INFO: loaded from: classes4.dex */
public class C10639so extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f37370k4 = {4058, Integer.MAX_VALUE, 4026, 0, 4026, 1, 4026, 2};

    /* JADX INFO: renamed from: x1 */
    private C10624rs f37371x1;

    public C10639so() {
        m51409um().m51917k4(4057);
    }

    /* JADX INFO: renamed from: du */
    public final String m51686du() {
        return m51688k4((short) 1);
    }

    public boolean equals(Object obj) {
        C10639so c10639so = (C10639so) C7019kk.m27452k4(obj, C10639so.class);
        return c10639so == null ? super.equals(obj) : m51693x1().m51655x1() == c10639so.m51693x1().m51655x1() && m51693x1().m51651kk() == c10639so.m51693x1().m51651kk() && m51693x1().m51652m9() == c10639so.m51693x1().m51652m9() && m51693x1().m51654to() == c10639so.m51693x1().m51654to() && m51693x1().m51646du() == c10639so.m51693x1().m51646du() && m51693x1().m51647h4() == c10639so.m51693x1().m51647h4() && C14113y2.m67363du(m51687h4(), c10639so.m51687h4()) && C14113y2.m67363du(m51686du(), c10639so.m51686du()) && C14113y2.m67363du(m51692to(), c10639so.m51692to());
    }

    /* JADX INFO: renamed from: h4 */
    public final String m51687h4() {
        return m51688k4((short) 2);
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m51688k4(short s) {
        for (int i = 0; i < m50513yj().size(); i++) {
            if (C7019kk.m27469x1(m50513yj().get_Item(i), C10626rv.class) && ((C10626rv) m50513yj().get_Item(i)).m51409um().m51922kk() == s) {
                return ((C10626rv) m50513yj().get_Item(i)).m51659x1();
            }
        }
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51691kk(String str) {
        m51690k4((short) 2, str);
    }

    /* JADX INFO: renamed from: to */
    public final String m51692to() {
        return m51688k4((short) 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10624rs m51693x1() {
        C10624rs c10624rs = this.f37371x1;
        if (c10624rs != null) {
            return c10624rs;
        }
        C10624rs c10624rs2 = (C10624rs) m50508kk(4058);
        this.f37371x1 = c10624rs2;
        if (c10624rs2 == null && m50505fa()) {
            C10624rs c10624rs3 = new C10624rs();
            this.f37371x1 = c10624rs3;
            m50507k4(c10624rs3);
        }
        return this.f37371x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51689k4(String str) {
        m51690k4((short) 0, str);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37370k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51694x1(String str) {
        m51690k4((short) 1, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51690k4(short s, String str) {
        for (int i = 0; i < m50513yj().size(); i++) {
            if (C7019kk.m27469x1(m50513yj().get_Item(i), C10626rv.class) && ((C10626rv) m50513yj().get_Item(i)).m51409um().m51922kk() == s) {
                ((C10626rv) m50513yj().get_Item(i)).m51658k4(str);
                return;
            }
        }
        m50507k4(new C10626rv(str, s));
    }
}
