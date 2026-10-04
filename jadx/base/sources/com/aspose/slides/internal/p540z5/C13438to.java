package com.aspose.slides.internal.p540z5;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p392s4.C10145to;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p540z5.AbstractC13439x1;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.z5.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13438to extends AbstractC13439x1 {

    /* JADX INFO: renamed from: du */
    private int f44977du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC13439x1.m9 f44978h4;

    /* JADX INFO: renamed from: k4 */
    private final boolean f44979k4;

    /* JADX INFO: renamed from: kk */
    private int f44980kk;

    /* JADX INFO: renamed from: m9 */
    private int f44981m9;

    /* JADX INFO: renamed from: to */
    private int f44982to;

    /* JADX INFO: renamed from: x1 */
    private k4 f44983x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.to$k4 */
    public static class k4 implements InterfaceC6906k4 {

        /* JADX INFO: renamed from: k4 */
        private final x1 f44984k4;

        /* JADX INFO: renamed from: kk */
        private int f44985kk;

        /* JADX INFO: renamed from: to */
        private int f44986to;

        /* JADX INFO: renamed from: x1 */
        private final int f44987x1;

        public k4(x1 x1Var, int i, int i2) {
            this.f44987x1 = i2;
            this.f44984k4 = x1Var;
            this.f44985kk = i;
            this.f44986to = i2;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27037k4() {
            mo27038k4(this.f44987x1);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27038k4(int i) {
            int i2 = this.f44986to - i;
            this.f44986to = i2;
            if (i2 == 0) {
                int iM67507x1 = C14116yg.m67507x1(this.f44987x1, this.f44985kk);
                this.f44984k4.m62535k4(iM67507x1);
                int i3 = this.f44985kk - iM67507x1;
                this.f44985kk = i3;
                if (i3 > 0) {
                    this.f44986to = C14116yg.m67507x1(this.f44987x1, i3);
                    this.f44984k4.m62534k4();
                }
            }
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6910x1
        /* JADX INFO: renamed from: k4 */
        public void mo27041k4(byte[] bArr, int i) {
            this.f44984k4.m62536k4(bArr, i);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.to$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: du */
        private C3152yj f44988du;

        /* JADX INFO: renamed from: h4 */
        private C10145to f44989h4;

        /* JADX INFO: renamed from: k4 */
        private final int f44990k4;

        /* JADX INFO: renamed from: kk */
        private final int f44991kk;

        /* JADX INFO: renamed from: to */
        private final boolean f44992to;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC6906k4 f44993x1;

        public x1(int i, InterfaceC6906k4 interfaceC6906k4, int i2, boolean z) {
            this.f44990k4 = i;
            this.f44993x1 = interfaceC6906k4;
            this.f44991kk = i2;
            this.f44992to = z;
        }

        /* JADX INFO: renamed from: k4 */
        public void m62534k4() {
            this.f44988du = new C3152yj();
            this.f44989h4 = new C10145to(this.f44988du, this.f44991kk, this.f44992to, false);
        }

        /* JADX INFO: renamed from: k4 */
        public void m62535k4(int i) {
            this.f44989h4.flush();
            this.f44989h4.dispose();
            byte[] array = this.f44988du.toArray();
            this.f44993x1.mo27041k4(array, array.length);
            this.f44993x1.mo27038k4(i);
        }

        /* JADX INFO: renamed from: k4 */
        public void m62536k4(byte[] bArr, int i) {
            this.f44989h4.write(bArr, 0, i);
        }
    }

    public C13438to(C6740x1 c6740x1, int i, int i2, boolean z) {
        super(c6740x1, i, i2);
        this.f44981m9 = 6;
        this.f44979k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m62531k4(int i) {
        this.f44980kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m62532kk(int i) {
        this.f44977du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m62533x1(int i) {
        this.f44982to = i;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10036kk
    /* JADX INFO: renamed from: k4 */
    public void mo49347k4(int[] iArr, C12014ne c12014ne, InterfaceC6906k4 interfaceC6906k4) {
        if (this.f44978h4 == null) {
            int iM49324du = m49324du();
            this.f44978h4 = AbstractC13439x1.m62537k4(m49327kk(), m49325k4(), m49329x1(), iM49324du);
            x1 x1Var = new x1(iM49324du, interfaceC6906k4, this.f44981m9, this.f44979k4);
            x1Var.m62534k4();
            this.f44983x1 = new k4(x1Var, m49329x1(), m49324du());
        }
        this.f44978h4.m62541k4(iArr, this.f44983x1);
    }
}
