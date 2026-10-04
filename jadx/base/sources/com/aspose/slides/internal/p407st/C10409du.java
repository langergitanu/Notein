package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10409du extends AbstractC10376bv {
    public C10409du() {
        m51409um().m51916k4((byte) 15);
        m51409um().m51920k4((short) 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m50700k4(C10561ni c10561ni, C10693wk c10693wk) {
        if (c10561ni == null) {
            throw new ArgumentNullException("timeCondition");
        }
        if (c10693wk == null) {
            throw new ArgumentNullException("timeNodeAtom");
        }
        if (c10561ni.m51409um().m51922kk() == 1) {
            return true;
        }
        return c10561ni.m51409um().m51922kk() == 3 && c10693wk.m51900kk() == 1;
    }

    /* JADX INFO: renamed from: c5 */
    public final C10720xu[] m50702c5() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10720xu c10720xu = (C10720xu) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10720xu.class);
            if (c10720xu != null) {
                list.addItem(c10720xu);
            }
        }
        if (list.size() > 0) {
            return (C10720xu[]) list.toArray(new C10720xu[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ck */
    public final C10561ni[] m50703ck() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10561ni c10561ni = (C10561ni) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10561ni.class);
            if (c10561ni != null && m50701x1(c10561ni, m50710x1())) {
                list.addItem(c10561ni);
            }
        }
        if (list.size() > 0) {
            return (C10561ni[]) list.toArray(new C10561ni[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public final C10698ws m50704du() {
        return (C10698ws) m50508kk(61740);
    }

    /* JADX INFO: renamed from: dy */
    public final C10485ix m50705dy() {
        return (C10485ix) m50508kk(61756);
    }

    /* JADX INFO: renamed from: h4 */
    public final C10523ld m50706h4() {
        return (C10523ld) m50508kk(61745);
    }

    /* JADX INFO: renamed from: jd */
    public final C10561ni[] m50707jd() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10561ni c10561ni = (C10561ni) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10561ni.class);
            if (c10561ni != null && m50700k4(c10561ni, m50710x1())) {
                list.addItem(c10561ni);
            }
        }
        if (list.size() > 0) {
            return (C10561ni[]) list.toArray(new C10561ni[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final C10721xv m50708m9() {
        return (C10721xv) m50508kk(61746);
    }

    /* JADX INFO: renamed from: to */
    public final C10592pm m50709to() {
        return (C10592pm) m50508kk(61757);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10693wk m50710x1() {
        return (C10693wk) m50508kk(61735);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m50701x1(C10561ni c10561ni, C10693wk c10693wk) {
        if (c10561ni == null) {
            throw new ArgumentNullException("timeCondition");
        }
        if (c10693wk == null) {
            throw new ArgumentNullException("timeNodeAtom");
        }
        if (c10561ni.m51409um().m51922kk() == 2) {
            return true;
        }
        return c10561ni.m51409um().m51922kk() == 4 && c10693wk.m51900kk() == 1;
    }
}
