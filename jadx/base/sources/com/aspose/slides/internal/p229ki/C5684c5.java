package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C5684c5 extends AbstractC5729ri {

    /* JADX INFO: renamed from: du */
    private static final x1[][] f15689du = {new x1[]{new C5708jd(), null, null, null, null}, new x1[]{new C5745uz(), new C5690dq(), null, null, null}, new x1[]{new C5685c6(), new C5739ts(), new C5693e0(), null, null}, new x1[]{new C5683bz(), new C5725qm(), new C5697g8(), new C5687ck(), null}, new x1[]{new C5696fa(), new C5744up(), new C5767yj(), new C5713ks(), new C5731rv()}};

    /* JADX INFO: renamed from: h4 */
    private static final x1[][] f15690h4 = {new x1[]{new C5759x6(), null, null, null, null}, new x1[]{new C5721ne(), new C5705ix(), null, null, null}, new x1[]{new C5741u4(), new C5752wl(), new C5727qq(), null, null}, new x1[]{new C5678ar(), new C5743um(), new C5682bv(), new C5715lr(), null}, new x1[]{new C5765yd(), new C5680b3(), new C5754wy(), new C5677ak(), new C5760xk()}};

    /* JADX INFO: renamed from: k4 */
    private int f15691k4;

    /* JADX INFO: renamed from: to */
    private AbstractC5728qw f15692to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5728qw f15693x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ki.c5$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        private AbstractC5728qw f15694k4;

        /* JADX INFO: renamed from: x1 */
        private AbstractC10925du f15695x1;

        public k4() {
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m23209x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f15694k4 = this.f15694k4;
            k4Var.f15695x1 = this.f15695x1;
        }

        /* JADX INFO: renamed from: kk */
        public final String m23212kk() {
            return this.f15695x1.mo21843dy();
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m23214x1() {
            this.f15694k4.mo23138c5();
        }

        public k4(Object obj) {
            this.f15694k4 = (AbstractC5728qw) obj;
            this.f15695x1 = null;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m23209x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f15694k4, this.f15694k4) && C14067j2.m66728k4(k4Var.f15695x1, this.f15695x1);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m23211k4() {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15694k4.mo23142m9();
            this.f15695x1 = abstractC10925duMo23142m9;
            return abstractC10925duMo23142m9 != null;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ki.c5$x1 */
    public static abstract class x1 extends AbstractC14085qw {
        private x1() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo23150k4(int i, Object obj, Object obj2);

        public /* synthetic */ x1(C5708jd c5708jd) {
            this();
        }
    }

    public C5684c5(int i, AbstractC5728qw abstractC5728qw, AbstractC5728qw abstractC5728qw2) {
        this.f15691k4 = i;
        this.f15693x1 = abstractC5728qw;
        this.f15692to = abstractC5728qw2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ak */
    public static boolean m23152ak(int i, Object obj, Object obj2) {
        String strM23201x1 = m23201x1(obj);
        k4 k4Var = new k4(obj2);
        while (k4Var.m23211k4()) {
            if (m23173k4(i, strM23201x1, k4Var.m23212kk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static boolean m23154b3(int i, Object obj, Object obj2) {
        k4 k4Var = new k4(obj);
        String str = (String) obj2;
        while (k4Var.m23211k4()) {
            if (m23173k4(i, k4Var.m23212kk(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bz */
    public static boolean m23156bz(int i, Object obj, Object obj2) {
        return m23174k4(i, ((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue(), C5719my.m23308k4(((Double) C7019kk.m27464to(obj2, Double.TYPE)).doubleValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c6 */
    public static boolean m23158c6(int i, Object obj, Object obj2) {
        return m23202x1(i, new k4(obj).m23211k4() ? 1.0d : 0.0d, C5712kp.m23302k4(((Boolean) C7019kk.m27464to(obj2, Boolean.TYPE)).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dq */
    public static boolean m23160dq(int i, Object obj, Object obj2) {
        double dM23301k4 = C5712kp.m23301k4(m23201x1(obj));
        k4 k4Var = new k4(obj2);
        while (k4Var.m23211k4()) {
            if (m23202x1(i, dM23301k4, C5712kp.m23301k4(k4Var.m23212kk()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static boolean m23163e0(int i, Object obj, Object obj2) {
        Class cls = Boolean.TYPE;
        return m23202x1(i, C5712kp.m23302k4(((Boolean) C7019kk.m27464to(obj, cls)).booleanValue()), C5712kp.m23302k4(((Boolean) C7019kk.m27464to(obj2, cls)).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f9 */
    public static boolean m23164f9(int i, Object obj, Object obj2) {
        return m23173k4(i, (String) obj, (String) obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g8 */
    public static boolean m23166g8(int i, Object obj, Object obj2) {
        return m23174k4(i, ((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue(), C5719my.m23309k4((String) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gi */
    public static boolean m23167gi(int i, Object obj, Object obj2) {
        return m23171k4(i, C5712kp.m23301k4((String) obj), ((Double) C7019kk.m27464to(obj2, Double.TYPE)).doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kp */
    public static boolean m23176kp(int i, Object obj, Object obj2) {
        Class cls = Double.TYPE;
        return m23171k4(i, ((Double) C7019kk.m27464to(obj, cls)).doubleValue(), ((Double) C7019kk.m27464to(obj2, cls)).doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r6.m23214x1();
     */
    /* JADX INFO: renamed from: lr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m23178lr(int i, Object obj, Object obj2) {
        k4 k4Var = new k4(obj);
        k4 k4Var2 = new k4(obj2);
        while (k4Var.m23211k4() && k4Var2.m23211k4()) {
            double dM23301k4 = C5712kp.m23301k4(k4Var.m23212kk());
            while (!m23171k4(i, dM23301k4, C5712kp.m23301k4(k4Var2.m23212kk()))) {
                if (!k4Var2.m23211k4()) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: qm */
    public static boolean m23181qm(int i, Object obj, Object obj2) {
        return m23202x1(i, C5712kp.m23302k4(((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue()), ((Double) C7019kk.m27464to(obj2, Double.TYPE)).doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: qw */
    public static boolean m23183qw(int i, Object obj, Object obj2) {
        return m23202x1(i, C5712kp.m23301k4(m23201x1(obj)), C5712kp.m23301k4(m23201x1(obj2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s7 */
    public static boolean m23185s7(int i, Object obj, Object obj2) {
        return m23171k4(i, C5712kp.m23301k4(m23201x1(obj)), ((Double) C7019kk.m27464to(obj2, Double.TYPE)).doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ss */
    public static boolean m23186ss(int i, Object obj, Object obj2) {
        return m23202x1(i, C5712kp.m23301k4(m23201x1(obj)), C5712kp.m23302k4(((Boolean) C7019kk.m27464to(obj2, Boolean.TYPE)).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sv */
    public static boolean m23187sv(int i, Object obj, Object obj2) {
        return m23174k4(i, C5719my.m23309k4(m23201x1(obj)), ((Boolean) C7019kk.m27464to(obj2, Boolean.TYPE)).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t6 */
    public static boolean m23188t6(int i, Object obj, Object obj2) {
        return m23173k4(i, m23201x1(obj), (String) obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ts */
    public static boolean m23190ts(int i, Object obj, Object obj2) {
        Class cls = Boolean.TYPE;
        return m23174k4(i, ((Boolean) C7019kk.m27464to(obj, cls)).booleanValue(), ((Boolean) C7019kk.m27464to(obj2, cls)).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r5.m23214x1();
     */
    /* JADX INFO: renamed from: v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m23195v4(int i, Object obj, Object obj2) {
        boolean z = i == 3;
        k4 k4Var = new k4(obj);
        k4 k4Var2 = new k4(obj2);
        while (k4Var.m23211k4() && k4Var2.m23211k4()) {
            String strM23212kk = k4Var.m23212kk();
            while (C14113y2.m67363du(strM23212kk, k4Var2.m23212kk()) != z) {
                if (!k4Var2.m23211k4()) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: vh */
    public static boolean m23196vh(int i, Object obj, Object obj2) {
        return m23202x1(i, C5712kp.m23301k4(m23201x1(obj)), C5712kp.m23301k4((String) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: vj */
    public static boolean m23197vj(int i, Object obj, Object obj2) {
        return m23202x1(i, C5712kp.m23301k4((String) obj), C5712kp.m23301k4((String) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wp */
    public static boolean m23199wp(int i, Object obj, Object obj2) {
        return m23202x1(i, C5712kp.m23302k4(((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue()), C5712kp.m23301k4((String) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wy */
    public static boolean m23200wy(int i, Object obj, Object obj2) {
        k4 k4Var = new k4(obj);
        double dM23301k4 = C5712kp.m23301k4((String) obj2);
        while (k4Var.m23211k4()) {
            if (m23202x1(i, C5712kp.m23301k4(k4Var.m23212kk()), dM23301k4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m23201x1(Object obj) {
        return ((AbstractC10925du) obj).mo21843dy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: xk */
    public static boolean m23205xk(int i, Object obj, Object obj2) {
        return m23174k4(i, new k4(obj).m23211k4(), ((Boolean) C7019kk.m27464to(obj2, Boolean.TYPE)).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: xw */
    public static boolean m23206xw(int i, Object obj, Object obj2) {
        return m23173k4(i, m23201x1(obj), m23201x1(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: yd */
    public static boolean m23207yd(int i, Object obj, Object obj2) {
        k4 k4Var = new k4(obj);
        double dDoubleValue = ((Double) C7019kk.m27464to(obj2, Double.TYPE)).doubleValue();
        while (k4Var.m23211k4()) {
            if (m23171k4(i, C5712kp.m23301k4(k4Var.m23212kk()), dDoubleValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5684c5(this);
    }

    private C5684c5(C5684c5 c5684c5) {
        super(c5684c5);
        this.f15691k4 = c5684c5.f15691k4;
        this.f15693x1 = AbstractC5728qw.m23314k4(c5684c5.f15693x1);
        this.f15692to = AbstractC5728qw.m23314k4(c5684c5.f15692to);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m23202x1(int i, double d, double d2) {
        if (i == 5) {
            return d < d2;
        }
        if (i == 6) {
            return d <= d2;
        }
        if (i == 7) {
            return d > d2;
        }
        if (i == 8) {
            return d >= d2;
        }
        C6005k4.m24259k4("Unexpected Operator.op code in cmpNumberNumberO()");
        return false;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        int iM23324k4 = this.f15691k4;
        Object objMo23148k4 = this.f15693x1.mo23148k4(abstractC10929m9);
        Object objMo23148k42 = this.f15692to.mo23148k4(abstractC10929m9);
        int iM23318k4 = m23318k4(objMo23148k4);
        int iM23318k42 = m23318k4(objMo23148k42);
        if (iM23318k4 < iM23318k42) {
            iM23324k4 = C5736t6.m23324k4(iM23324k4);
            objMo23148k4 = objMo23148k42;
            objMo23148k42 = objMo23148k4;
            iM23318k42 = iM23318k4;
            iM23318k4 = iM23318k42;
        }
        return Boolean.valueOf(((iM23324k4 == 3 || iM23324k4 == 4) ? f15689du[iM23318k4][iM23318k42] : f15690h4[iM23318k4][iM23318k42]).mo23150k4(iM23324k4, objMo23148k4, objMo23148k42));
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        this.f15693x1.mo23149k4(abstractC7201m9);
        this.f15692to.mo23149k4(abstractC7201m9);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m23171k4(int i, double d, double d2) {
        switch (i) {
            case 3:
                return d == d2;
            case 4:
                return d != d2;
            case 5:
                return d < d2;
            case 6:
                return d <= d2;
            case 7:
                return d > d2;
            case 8:
                return d >= d2;
            default:
                C6005k4.m24259k4("Unexpected Operator.op code in cmpNumberNumber()");
                return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m23173k4(int i, String str, String str2) {
        return (i == 3) == C14113y2.m67363du(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m23174k4(int i, boolean z, boolean z2) {
        return (i == 3) == (z == z2);
    }
}
