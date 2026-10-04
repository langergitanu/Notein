package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.l0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2171l0 extends C2347wg {

    /* JADX INFO: renamed from: k4 */
    private k4[] f7539k4;

    /* JADX INFO: renamed from: kk */
    private int[] f7540kk;

    /* JADX INFO: renamed from: to */
    private long f7541to;

    /* JADX INFO: renamed from: x1 */
    private int[] f7542x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.l0$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        public long f7543du;

        /* JADX INFO: renamed from: k4 */
        public int f7544k4;

        /* JADX INFO: renamed from: kk */
        public short f7545kk;

        /* JADX INFO: renamed from: to */
        public int f7546to;

        /* JADX INFO: renamed from: x1 */
        public int f7547x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m10994x1(k4 k4Var) {
            return k4Var.f7544k4 == this.f7544k4 && k4Var.f7547x1 == this.f7547x1 && k4Var.f7545kk == this.f7545kk && k4Var.f7546to == this.f7546to && k4Var.f7543du == this.f7543du;
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
                return m10994x1((k4) obj);
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
            k4Var.f7544k4 = this.f7544k4;
            k4Var.f7547x1 = this.f7547x1;
            k4Var.f7545kk = this.f7545kk;
            k4Var.f7546to = this.f7546to;
            k4Var.f7543du = this.f7543du;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new InterfaceC7014c5<k4>() { // from class: com.aspose.slides.internal.ca.l0.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public k4 mo838x1() {
                return new k4();
            }
        });
    }

    public C2171l0(int i, int i2, C2064eb c2064eb) {
        super(i, i2, c2064eb);
        this.f7542x1 = new int[256];
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        int i2;
        byte[] bArrM66778k4 = C14069jd.m66778k4((short) i);
        if (!m11598du()) {
            bArrM66778k4 = m11602x1(i);
        }
        byte b = bArrM66778k4[0];
        if (bArrM66778k4.length > 1) {
            i2 = this.f7542x1[b & 255] / 8;
            if (i2 != 0) {
                b = bArrM66778k4[1];
            }
        } else {
            i2 = 0;
        }
        k4 k4VarClone = this.f7539k4[i2].Clone();
        int i3 = k4VarClone.f7544k4;
        int i4 = b & 255;
        if ((i3 & 65535) > i4 || i4 >= (i3 & 65535) + (k4VarClone.f7547x1 & 65535)) {
            return 0;
        }
        int i5 = (this.f7540kk[(int) ((((k4VarClone.f7543du + ((long) (k4VarClone.f7546to & 65535))) - this.f7541to) / 2) + ((long) (i4 - (i3 & 65535))))] & 65535) - 1;
        return i5 != 0 ? (i5 + k4VarClone.f7545kk) % 65536 : i5;
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
        c2212n9.m11151fa();
        c2212n9.m11151fa();
        Dictionary dictionary = new Dictionary();
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f7542x1[i2] = 65535 & c2212n9.m11151fa();
            dictionary.set_Item(Integer.valueOf(this.f7542x1[i2]), 0);
        }
        this.f7539k4 = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), dictionary.size()));
        this.f7541to = c2212n9.m11165x1() - 1;
        long j = 0;
        long j2 = 0;
        while (true) {
            k4[] k4VarArr = this.f7539k4;
            if (i >= k4VarArr.length) {
                break;
            }
            k4VarArr[i] = new k4();
            this.f7539k4[i].f7544k4 = c2212n9.m11151fa();
            this.f7539k4[i].f7547x1 = c2212n9.m11151fa();
            this.f7539k4[i].f7545kk = c2212n9.m11147c5();
            this.f7539k4[i].f7546to = c2212n9.m11151fa();
            this.f7539k4[i].f7543du = c2212n9.m11154k4();
            long jM11154k4 = c2212n9.m11154k4() + ((long) (this.f7539k4[i].f7546to & 65535));
            long jM11154k42 = c2212n9.m11154k4();
            k4 k4Var = this.f7539k4[i];
            long j3 = jM11154k42 + ((long) (k4Var.f7546to & 65535)) + ((long) ((k4Var.f7547x1 & 65535) * 2));
            if (jM11154k4 < this.f7541to) {
                this.f7541to = jM11154k4;
            }
            if (j3 > j2) {
                j2 = j3;
            }
            i++;
        }
        long j4 = this.f7541to;
        this.f7540kk = new int[(int) ((j2 - j4) / 2)];
        c2212n9.m11159k4(j4);
        while (true) {
            int[] iArr = this.f7540kk;
            if (j >= iArr.length) {
                super.mo10361k4(c2212n9);
                return;
            } else {
                iArr[(int) j] = c2212n9.m11151fa();
                j++;
            }
        }
    }
}
