package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ei */
/* JADX INFO: loaded from: classes5.dex */
public class C13890ei implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    public static final C13890ei f46456k4 = new C13890ei(C14113y2.f47374k4);

    /* JADX INFO: renamed from: x1 */
    private static k4 f46457x1;

    /* JADX INFO: renamed from: du */
    private int f46458du;

    /* JADX INFO: renamed from: kk */
    private String f46459kk;

    /* JADX INFO: renamed from: to */
    private String f46460to;

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ei$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract int mo65291k4(String str, int i, long j);

        public /* synthetic */ k4(C14038zf c14038zf) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13890ei() {
        String str = C14113y2.f47374k4;
        this(str, str);
    }

    /* JADX INFO: renamed from: m9 */
    private static k4 m65279m9() {
        return new C14038zf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static int m65280x1(String str, int i, long j) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: du */
    public final C13890ei m65282du() {
        return (C13890ei) m65283h4();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C13890ei c13890ei = (C13890ei) C7019kk.m27452k4(obj, C13890ei.class);
        return c13890ei != null && C14113y2.m67363du(m65289x1(), c13890ei.m65289x1()) && C14113y2.m67363du(m65284k4(), c13890ei.m65284k4());
    }

    /* JADX INFO: renamed from: h4 */
    public Object m65283h4() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public int hashCode() {
        if (this.f46458du == 0) {
            if (f46457x1 == null) {
                f46457x1 = m65279m9();
            }
            this.f46458du = f46457x1.mo65291k4(m65289x1(), m65289x1().length(), 0L);
        }
        return this.f46458du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m65287kk() {
        return m65289x1().length() == 0 && m65284k4().length() == 0;
    }

    /* JADX INFO: renamed from: to */
    public final void m65288to() {
        C13850af.m65120kk(this.f46459kk);
        if (this.f46460to.length() != 0) {
            C13850af.m65125qq(this.f46460to);
        }
    }

    public String toString() {
        return m65284k4().length() == 0 ? m65289x1() : C14113y2.m67408k4(m65284k4(), C18241k5.f55433h, m65289x1());
    }

    public C13890ei(String str) {
        this(str, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13890ei m65276k4(String str, InterfaceC13980t6 interfaceC13980t6, String[] strArr) {
        String[] strArr2 = {null};
        C13988u1.m66225k4(str, strArr, strArr2);
        String str2 = strArr2[0];
        String strMo13292k4 = interfaceC13980t6.mo13292k4(strArr[0]);
        if (strMo13292k4 == null) {
            if (strArr[0].length() != 0) {
                throw new XmlException("'{0}' is an undeclared prefix.", strArr[0]);
            }
            strMo13292k4 = C14113y2.f47374k4;
        }
        return new C13890ei(str2, strMo13292k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m65289x1() {
        return this.f46459kk;
    }

    public C13890ei(String str, String str2) {
        this.f46460to = str2 == null ? C14113y2.f47374k4 : str2;
        this.f46459kk = str == null ? C14113y2.f47374k4 : str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m65284k4() {
        return this.f46460to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65290x1(String str, String str2) {
        this.f46459kk = str;
        this.f46460to = str2;
        this.f46458du = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65277k4(String str, String str2) {
        return (str2 == null || str2.length() == 0) ? str : C14113y2.m67408k4(str2, C18241k5.f55433h, str);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m65281x1(C13890ei c13890ei, C13890ei c13890ei2) {
        return !m65278k4(c13890ei, c13890ei2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65285k4(AbstractC13883dt abstractC13883dt) {
        this.f46459kk = abstractC13883dt.mo65266k4(this.f46459kk);
        this.f46460to = abstractC13883dt.mo65266k4(this.f46460to);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65286k4(String str) {
        this.f46460to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m65278k4(C13890ei c13890ei, C13890ei c13890ei2) {
        if (c13890ei == c13890ei2) {
            return true;
        }
        return c13890ei != null && c13890ei2 != null && C14113y2.m67363du(c13890ei.m65289x1(), c13890ei2.m65289x1()) && C14113y2.m67363du(c13890ei.m65284k4(), c13890ei2.m65284k4());
    }
}
