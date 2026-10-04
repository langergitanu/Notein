package com.aspose.slides.internal.p119f0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p353q7.AbstractC9768f9;
import com.aspose.slides.internal.p353q7.C9757ar;
import com.aspose.slides.internal.p353q7.C9777kp;
import com.aspose.slides.internal.p353q7.C9792um;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p353q7.C9799x1;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.f0.kk */
/* JADX INFO: loaded from: classes.dex */
public class C3839kk extends C3837h4 {

    /* JADX INFO: renamed from: k4 */
    private k4[] f10457k4;

    /* JADX INFO: renamed from: kk */
    private int[] f10458kk;

    /* JADX INFO: renamed from: to */
    private long f10459to;

    /* JADX INFO: renamed from: x1 */
    private int[] f10460x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.f0.kk$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        public long f10461du;

        /* JADX INFO: renamed from: k4 */
        public int f10462k4;

        /* JADX INFO: renamed from: kk */
        public short f10463kk;

        /* JADX INFO: renamed from: to */
        public int f10464to;

        /* JADX INFO: renamed from: x1 */
        public int f10465x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m15370x1(k4 k4Var) {
            return k4Var.f10462k4 == this.f10462k4 && k4Var.f10465x1 == this.f10465x1 && k4Var.f10463kk == this.f10463kk && k4Var.f10464to == this.f10464to && k4Var.f10461du == this.f10461du;
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
                return m15370x1((k4) obj);
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
            k4Var.f10462k4 = this.f10462k4;
            k4Var.f10465x1 = this.f10465x1;
            k4Var.f10463kk = this.f10463kk;
            k4Var.f10464to = this.f10464to;
            k4Var.f10461du = this.f10461du;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new InterfaceC7014c5<k4>() { // from class: com.aspose.slides.internal.f0.kk.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public k4 mo838x1() {
                return new k4();
            }
        });
    }

    public C3839kk(int i, int i2, AbstractC9768f9 abstractC9768f9) {
        super(i, i2, abstractC9768f9);
        this.f10460x1 = new int[256];
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public int mo15360k4(int i) {
        int i2;
        byte[] bArrM66778k4 = C14069jd.m66778k4((short) i);
        if (!m15366m9()) {
            bArrM66778k4 = m15368x1(i);
        }
        byte b = bArrM66778k4[0];
        if (bArrM66778k4.length > 1) {
            i2 = this.f10460x1[b & 255] / 8;
            if (i2 != 0) {
                b = bArrM66778k4[1];
            }
        } else {
            i2 = 0;
        }
        k4 k4VarClone = this.f10457k4[i2].Clone();
        int i3 = k4VarClone.f10462k4;
        int i4 = b & 255;
        if ((i3 & 65535) > i4 || i4 >= (i3 & 65535) + (k4VarClone.f10465x1 & 65535)) {
            return 0;
        }
        int i5 = (this.f10458kk[(int) ((((k4VarClone.f10461du + ((long) (k4VarClone.f10464to & 65535))) - this.f10459to) / 2) + ((long) (i4 - (i3 & 65535))))] & 65535) - 1;
        return i5 != 0 ? (i5 + k4VarClone.f10463kk) % 65536 : i5;
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public C9777kp mo15361k4(C9792um c9792um) {
        C9777kp c9777kp = new C9777kp(((C9799x1) m15367to()).m48299kk());
        for (char c = 0; c <= 65535; c = (char) (c + 1)) {
            int iMo15360k4 = mo15360k4(c);
            if (iMo15360k4 > 0) {
                C9757ar c9757arClone = c9792um.m48252k4(iMo15360k4).Clone();
                C9797wp c9797wp = new C9797wp(c, iMo15360k4, c9757arClone.f35245k4 & 65535, c9757arClone.f35246x1);
                c9777kp.m48103k4(c9797wp);
                if (c9797wp.m48287x1() == 0) {
                    c9777kp.m48108x1(c9797wp);
                }
            }
            if (c >= 65535) {
                break;
            }
        }
        return c9777kp;
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public void mo15362k4(C12564kk c12564kk) {
        c12564kk.m58600du();
        c12564kk.m58600du();
        Dictionary dictionary = new Dictionary();
        for (int i = 0; i < 256; i++) {
            this.f10460x1[i] = 65535 & c12564kk.m58600du();
            dictionary.set_Item(Integer.valueOf(this.f10460x1[i]), null);
        }
        this.f10457k4 = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), dictionary.size()));
        this.f10459to = c12564kk.m58602k4().getLength() - 1;
        int i2 = 0;
        long j = 0;
        while (true) {
            k4[] k4VarArr = this.f10457k4;
            if (i2 >= k4VarArr.length) {
                break;
            }
            k4VarArr[i2] = new k4();
            this.f10457k4[i2].f10462k4 = c12564kk.m58600du();
            this.f10457k4[i2].f10465x1 = c12564kk.m58600du();
            this.f10457k4[i2].f10463kk = c12564kk.m58605to();
            this.f10457k4[i2].f10464to = c12564kk.m58600du();
            this.f10457k4[i2].f10461du = c12564kk.m58602k4().getPosition();
            long position = c12564kk.m58602k4().getPosition() + ((long) (this.f10457k4[i2].f10464to & 65535));
            long position2 = c12564kk.m58602k4().getPosition();
            k4 k4Var = this.f10457k4[i2];
            long j2 = position2 + ((long) (k4Var.f10464to & 65535)) + ((long) ((k4Var.f10465x1 & 65535) * 2));
            if (position < this.f10459to) {
                this.f10459to = position;
            }
            if (j2 > j) {
                j = j2;
            }
            i2++;
        }
        this.f10458kk = new int[(int) ((j - this.f10459to) / 2)];
        c12564kk.m58602k4().seek(this.f10459to, 0);
        long j3 = 0;
        while (true) {
            int[] iArr = this.f10458kk;
            if (j3 >= iArr.length) {
                super.mo15362k4(c12564kk);
                return;
            } else {
                iArr[(int) j3] = c12564kk.m58600du();
                j3++;
            }
        }
    }
}
