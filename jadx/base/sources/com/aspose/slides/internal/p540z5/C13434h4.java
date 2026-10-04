package com.aspose.slides.internal.p540z5;

import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p392s4.C10146up;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p540z5.AbstractC13439x1;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.z5.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13434h4 extends AbstractC13439x1 {

    /* JADX INFO: renamed from: du */
    private int f44940du;

    /* JADX INFO: renamed from: h4 */
    private int f44941h4;

    /* JADX INFO: renamed from: k4 */
    private k4 f44942k4;

    /* JADX INFO: renamed from: kk */
    private int f44943kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC13439x1.m9 f44944m9;

    /* JADX INFO: renamed from: to */
    private int f44945to;

    /* JADX INFO: renamed from: x1 */
    private int f44946x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.h4$k4 */
    public static class k4 implements InterfaceC6906k4 {

        /* JADX INFO: renamed from: k4 */
        private final C10146up f44947k4;

        /* JADX INFO: renamed from: kk */
        private int f44948kk;

        /* JADX INFO: renamed from: to */
        private int f44949to;

        /* JADX INFO: renamed from: x1 */
        private final int f44950x1;

        public k4(C10146up c10146up, int i, int i2) {
            this.f44950x1 = i2;
            this.f44947k4 = c10146up;
            this.f44948kk = i;
            this.f44949to = i2;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27037k4() {
            mo27038k4(1);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27038k4(int i) {
            int i2 = this.f44949to - i;
            this.f44949to = i2;
            if (i2 == 0) {
                this.f44947k4.mo49794k4(C14116yg.m67507x1(this.f44950x1, this.f44948kk));
                int i3 = this.f44948kk;
                int i4 = this.f44950x1;
                int i5 = i3 - i4;
                this.f44948kk = i5;
                if (i5 > 0) {
                    this.f44949to = C14116yg.m67507x1(i4, i5);
                    this.f44947k4.m49796kk();
                }
            }
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6910x1
        /* JADX INFO: renamed from: k4 */
        public void mo27041k4(byte[] bArr, int i) {
            this.f44947k4.m49795k4(bArr, i);
        }
    }

    public C13434h4(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
    }

    /* JADX INFO: renamed from: du */
    public void m62515du(int i) {
        this.f44941h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m62516k4(int i) {
        this.f44946x1 = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m62517kk(int i) {
        this.f44945to = i;
    }

    /* JADX INFO: renamed from: to */
    public void m62518to(int i) {
        this.f44940du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m62519x1(int i) {
        this.f44943kk = i;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10036kk
    /* JADX INFO: renamed from: k4 */
    public void mo49347k4(int[] iArr, C12014ne c12014ne, InterfaceC6906k4 interfaceC6906k4) {
        if (this.f44944m9 == null) {
            this.f44944m9 = AbstractC13439x1.m62537k4(m49327kk(), m49325k4(), m49329x1(), m49324du());
            C10146up c10146up = new C10146up(interfaceC6906k4, this.f44943kk);
            c10146up.m49796kk();
            this.f44942k4 = new k4(c10146up, m49329x1(), m49324du());
        }
        this.f44944m9.m62541k4(iArr, this.f44942k4);
    }
}
