package com.aspose.slides.internal.p077d8;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.up */
/* JADX INFO: loaded from: classes3.dex */
class C3093up {

    /* JADX INFO: renamed from: du */
    public final String f9181du;

    /* JADX INFO: renamed from: dy */
    public int f9182dy;

    /* JADX INFO: renamed from: h4 */
    public final String f9184h4;

    /* JADX INFO: renamed from: k4 */
    public boolean f9186k4;

    /* JADX INFO: renamed from: kk */
    public boolean f9187kk;

    /* JADX INFO: renamed from: m9 */
    public int f9188m9;

    /* JADX INFO: renamed from: x1 */
    public C3116zj f9191x1;

    /* JADX INFO: renamed from: c5 */
    private k4[] f9179c5 = new k4[8];

    /* JADX INFO: renamed from: jd */
    private k4[] f9185jd = new k4[8];

    /* JADX INFO: renamed from: ck */
    private String[] f9180ck = new String[8];

    /* JADX INFO: renamed from: fa */
    private int f9183fa = 0;

    /* JADX INFO: renamed from: up */
    private int f9190up = 0;

    /* JADX INFO: renamed from: yj */
    private int f9192yj = 0;

    /* JADX INFO: renamed from: to */
    public int f9189to = 0;

    /* JADX INFO: renamed from: com.aspose.slides.internal.d8.up$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public String f9193k4;

        /* JADX INFO: renamed from: x1 */
        public String f9194x1;

        public k4() {
            this.f9193k4 = null;
            this.f9194x1 = null;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m13147x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f9193k4, this.f9193k4) && C14067j2.m66728k4(k4Var.f9194x1, this.f9194x1);
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
                return m13147x1((k4) obj);
            }
            return false;
        }

        public int hashCode() {
            return C12569rv.m58664k4(this.f9193k4, this.f9194x1);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        public k4(String str, String str2) {
            this.f9193k4 = str;
            this.f9194x1 = str2;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            k4Var.f9193k4 = this.f9193k4;
            k4Var.f9194x1 = this.f9194x1;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new InterfaceC7014c5<k4>() { // from class: com.aspose.slides.internal.d8.up.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public k4 mo838x1() {
                return new k4();
            }
        });
    }

    public C3093up(String str, String str2) {
        this.f9181du = str;
        this.f9184h4 = str2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m13137k4() {
        return this.f9192yj;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m13142kk(String str) {
        for (int i = 0; i < this.f9192yj; i++) {
            if (C14113y2.m67363du(str, this.f9180ck[i])) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return C14113y2.m67411k4(this.f9181du) ? this.f9184h4 : C14113y2.m67402k4("{0}:{1}", this.f9181du, this.f9184h4);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m13144x1(String str) {
        for (int i = 0; i < this.f9183fa; i++) {
            if (C14113y2.m67363du(this.f9179c5[i].f9193k4, str)) {
                return this.f9179c5[i].f9194x1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13138k4(int i) {
        return this.f9179c5[i].f9194x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m13143kk(String str, String str2) {
        String str3;
        for (int i = 0; i < this.f9190up; i++) {
            if (C14113y2.m67363du(str, this.f9185jd[i].f9193k4) && ((str3 = this.f9185jd[i].f9194x1) == null || C14113y2.m67363du(str3, str2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13145x1(String str, String str2) {
        int i = this.f9190up;
        k4[] k4VarArr = this.f9185jd;
        if (i >= k4VarArr.length) {
            k4[] k4VarArr2 = new k4[(k4VarArr.length / 2) + k4VarArr.length + 8];
            System.arraycopy(k4VarArr, 0, k4VarArr2, 0, k4VarArr.length);
            this.f9185jd = k4VarArr2;
        }
        if (C18358t1.g.f56183c.equals(str2)) {
            str2 = null;
        }
        k4[] k4VarArr3 = this.f9185jd;
        int i2 = this.f9190up;
        this.f9190up = i2 + 1;
        k4VarArr3[i2] = new k4(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13139k4(String str) {
        int i = this.f9192yj;
        String[] strArr = this.f9180ck;
        if (i >= strArr.length) {
            String[] strArr2 = new String[(strArr.length / 2) + strArr.length + 8];
            System.arraycopy(strArr, 0, strArr2, 0, this.f9179c5.length);
            this.f9180ck = strArr2;
        }
        String[] strArr3 = this.f9180ck;
        int i2 = this.f9192yj;
        this.f9192yj = i2 + 1;
        strArr3[i2] = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13140k4(String str, String str2) {
        int i = this.f9183fa;
        k4[] k4VarArr = this.f9179c5;
        if (i >= k4VarArr.length) {
            k4[] k4VarArr2 = new k4[(k4VarArr.length / 2) + k4VarArr.length + 8];
            System.arraycopy(k4VarArr, 0, k4VarArr2, 0, k4VarArr.length);
            this.f9179c5 = k4VarArr2;
        }
        k4[] k4VarArr3 = this.f9179c5;
        int i2 = this.f9183fa;
        this.f9183fa = i2 + 1;
        k4VarArr3[i2] = new k4(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13141k4(String str, int[] iArr) {
        for (int i = 0; i < this.f9183fa; i++) {
            if (C14113y2.m67363du(this.f9179c5[i].f9193k4, str)) {
                iArr[0] = i;
                return true;
            }
        }
        iArr[0] = Integer.MIN_VALUE;
        return false;
    }
}
