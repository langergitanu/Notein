package com.aspose.slides.internal.p060ca;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.du */
/* JADX INFO: loaded from: classes3.dex */
class C2055du {

    /* JADX INFO: renamed from: k4 */
    public k4[] f7091k4;

    /* JADX INFO: renamed from: kk */
    private int f7092kk;

    /* JADX INFO: renamed from: x1 */
    public short[] f7093x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.du$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        public int f7094du;

        /* JADX INFO: renamed from: k4 */
        public short f7095k4;

        /* JADX INFO: renamed from: kk */
        public short f7096kk;

        /* JADX INFO: renamed from: to */
        public short f7097to;

        /* JADX INFO: renamed from: x1 */
        public short f7098x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m10430x1(k4 k4Var) {
            return k4Var.f7095k4 == this.f7095k4 && k4Var.f7098x1 == this.f7098x1 && k4Var.f7096kk == this.f7096kk && k4Var.f7097to == this.f7097to && k4Var.f7094du == this.f7094du;
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
                return m10430x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            k4Var.f7095k4 = this.f7095k4;
            k4Var.f7098x1 = this.f7098x1;
            k4Var.f7096kk = this.f7096kk;
            k4Var.f7097to = this.f7097to;
            k4Var.f7094du = this.f7094du;
        }
    }

    public C2055du(int i) {
        this.f7092kk = i;
        int iM10426k4 = (i <= 256 || i >= 512) ? 0 : m10426k4(i - 257);
        this.f7093x1 = new short[i];
        int i2 = i * 2;
        this.f7091k4 = (k4[]) C22200OooO0o0.OooO00o(k4.class, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f7091k4[i3] = new k4();
        }
        for (int i4 = 2; i4 < i2; i4++) {
            k4 k4Var = this.f7091k4[i4];
            k4Var.f7095k4 = (short) (i4 / 2);
            k4Var.f7094du = 1;
        }
        for (int i5 = 1; i5 < i; i5++) {
            k4 k4Var2 = this.f7091k4[i5];
            int i6 = i5 * 2;
            k4Var2.f7098x1 = (short) i6;
            k4Var2.f7096kk = (short) (i6 + 1);
        }
        for (int i7 = 0; i7 < i; i7++) {
            k4[] k4VarArr = this.f7091k4;
            k4VarArr[i7].f7097to = (short) -1;
            int i8 = i + i7;
            k4 k4Var3 = k4VarArr[i8];
            k4Var3.f7097to = (short) i7;
            k4Var3.f7098x1 = (short) -1;
            k4Var3.f7096kk = (short) -1;
            this.f7093x1[i7] = (short) i8;
        }
        m10428kk(1);
        if (iM10426k4 == 0) {
            for (int i9 = 0; i9 < 2; i9++) {
                for (int i10 = 0; i10 < i; i10++) {
                    m10429x1(this.f7093x1[i10]);
                }
            }
            return;
        }
        m10429x1(this.f7093x1[256]);
        m10429x1(this.f7093x1[257]);
        for (int i11 = 0; i11 < 12; i11++) {
            m10429x1(this.f7093x1[i - 3]);
        }
        for (int i12 = 0; i12 < 6; i12++) {
            m10429x1(this.f7093x1[i - 2]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m10426k4(int i) {
        int i2 = 32;
        while (i2 > 1 && ((1 << (i2 - 1)) & i) == 0) {
            i2--;
        }
        return i2;
    }

    /* JADX INFO: renamed from: kk */
    private int m10428kk(int i) {
        k4 k4Var = this.f7091k4[i];
        if (k4Var.f7097to < 0) {
            k4Var.f7094du = m10428kk(k4Var.f7098x1) + m10428kk(this.f7091k4[i].f7096kk);
        }
        return this.f7091k4[i].f7094du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10429x1(int i) {
        while (true) {
            k4[] k4VarArr = this.f7091k4;
            if (i == 1) {
                k4VarArr[i].f7094du++;
                return;
            }
            int i2 = k4VarArr[i].f7094du;
            int i3 = i - 1;
            if (k4VarArr[i3].f7094du == i2) {
                while (true) {
                    int i4 = i3 - 1;
                    if (this.f7091k4[i4].f7094du != i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                if (i3 > 1) {
                    m10427k4(i, i3);
                    i = i3;
                }
            }
            k4 k4Var = this.f7091k4[i];
            k4Var.f7094du = i2 + 1;
            i = k4Var.f7095k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m10427k4(int i, int i2) {
        k4[] k4VarArr = this.f7091k4;
        k4 k4Var = k4VarArr[i];
        short s = k4Var.f7095k4;
        short s2 = k4VarArr[i2].f7095k4;
        k4 k4VarClone = k4Var.Clone();
        k4[] k4VarArr2 = this.f7091k4;
        k4VarArr2[i2].CloneTo(k4VarArr2[i]);
        k4VarClone.CloneTo(this.f7091k4[i2]);
        k4[] k4VarArr3 = this.f7091k4;
        k4 k4Var2 = k4VarArr3[i];
        k4Var2.f7095k4 = s;
        k4 k4Var3 = k4VarArr3[i2];
        k4Var3.f7095k4 = s2;
        short s3 = k4Var2.f7097to;
        if (s3 < 0) {
            short s4 = (short) i;
            k4VarArr3[k4Var2.f7098x1].f7095k4 = s4;
            k4VarArr3[k4Var2.f7096kk].f7095k4 = s4;
        } else {
            this.f7093x1[s3] = (short) i;
        }
        short s5 = k4Var3.f7097to;
        if (s5 >= 0) {
            this.f7093x1[s5] = (short) i2;
            return;
        }
        short s6 = (short) i2;
        k4VarArr3[k4Var3.f7098x1].f7095k4 = s6;
        k4VarArr3[k4Var3.f7096kk].f7095k4 = s6;
    }
}
