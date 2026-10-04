package com.aspose.slides.internal.p062cf;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p347px.AbstractC9576ak;
import com.aspose.slides.internal.p347px.C9578b3;
import com.aspose.slides.internal.p347px.C9601uz;
import com.aspose.slides.internal.p347px.C9603wl;
import com.aspose.slides.internal.p347px.C9604wy;
import com.aspose.slides.internal.p347px.C9605x1;
import com.aspose.slides.internal.p437u9.C11296k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.cf.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C2423kk extends C2421h4 {

    /* JADX INFO: renamed from: k4 */
    private k4[] f8383k4;

    /* JADX INFO: renamed from: kk */
    private int[] f8384kk;

    /* JADX INFO: renamed from: to */
    private long f8385to;

    /* JADX INFO: renamed from: x1 */
    private int[] f8386x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.cf.kk$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        public long f8387du;

        /* JADX INFO: renamed from: k4 */
        public int f8388k4;

        /* JADX INFO: renamed from: kk */
        public short f8389kk;

        /* JADX INFO: renamed from: to */
        public int f8390to;

        /* JADX INFO: renamed from: x1 */
        public int f8391x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m11850x1(k4 k4Var) {
            return k4Var.f8388k4 == this.f8388k4 && k4Var.f8391x1 == this.f8391x1 && k4Var.f8389kk == this.f8389kk && k4Var.f8390to == this.f8390to && k4Var.f8387du == this.f8387du;
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
                return m11850x1((k4) obj);
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
            k4Var.f8388k4 = this.f8388k4;
            k4Var.f8391x1 = this.f8391x1;
            k4Var.f8389kk = this.f8389kk;
            k4Var.f8390to = this.f8390to;
            k4Var.f8387du = this.f8387du;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new InterfaceC7014c5<k4>() { // from class: com.aspose.slides.internal.cf.kk.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public k4 mo838x1() {
                return new k4();
            }
        });
    }

    public C2423kk(int i, int i2, AbstractC9576ak abstractC9576ak) {
        super(i, i2, abstractC9576ak);
        this.f8386x1 = new int[256];
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public int mo11841k4(int i) {
        int i2;
        byte[] bArrM66778k4 = C14069jd.m66778k4((short) i);
        if (!m11846to()) {
            bArrM66778k4 = m11848x1(i);
        }
        byte b = bArrM66778k4[0];
        if (bArrM66778k4.length > 1) {
            i2 = this.f8386x1[b & 255] / 8;
            if (i2 != 0) {
                b = bArrM66778k4[1];
            }
        } else {
            i2 = 0;
        }
        k4 k4VarClone = this.f8383k4[i2].Clone();
        int i3 = k4VarClone.f8388k4;
        int i4 = b & 255;
        if ((i3 & 65535) > i4 || i4 >= (i3 & 65535) + (k4VarClone.f8391x1 & 65535)) {
            return 0;
        }
        int i5 = (this.f8384kk[(int) ((((k4VarClone.f8387du + ((long) (k4VarClone.f8390to & 65535))) - this.f8385to) / 2) + ((long) (i4 - (i3 & 65535))))] & 65535) - 1;
        return i5 != 0 ? (i5 + k4VarClone.f8389kk) % 65536 : i5;
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public C9604wy mo11842k4(C9603wl c9603wl) {
        C9604wy c9604wy = new C9604wy(((C9605x1) m11844k4()).m46916kk());
        for (char c = 0; c <= 65535; c = (char) (c + 1)) {
            int iMo11841k4 = mo11841k4(c);
            if (iMo11841k4 > 0) {
                C9601uz c9601uzClone = c9603wl.m46903k4(iMo11841k4).Clone();
                C9578b3 c9578b3 = new C9578b3(c, iMo11841k4, c9601uzClone.f34734k4 & 65535, c9601uzClone.f34735x1);
                c9604wy.m46908k4(c9578b3);
                if (c9578b3.m46757x1() == 0) {
                    c9604wy.m46911x1(c9578b3);
                }
            }
            if (c >= 65535) {
                break;
            }
        }
        return c9604wy;
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public void mo11843k4(C11296k4 c11296k4) {
        c11296k4.m54274du();
        c11296k4.m54274du();
        Dictionary dictionary = new Dictionary();
        for (int i = 0; i < 256; i++) {
            this.f8386x1[i] = 65535 & c11296k4.m54274du();
            dictionary.set_Item(Integer.valueOf(this.f8386x1[i]), null);
        }
        this.f8383k4 = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), dictionary.size()));
        this.f8385to = c11296k4.m54276k4().getLength() - 1;
        int i2 = 0;
        long j = 0;
        while (true) {
            k4[] k4VarArr = this.f8383k4;
            if (i2 >= k4VarArr.length) {
                break;
            }
            k4VarArr[i2] = new k4();
            this.f8383k4[i2].f8388k4 = c11296k4.m54274du();
            this.f8383k4[i2].f8391x1 = c11296k4.m54274du();
            this.f8383k4[i2].f8389kk = c11296k4.m54279to();
            this.f8383k4[i2].f8390to = c11296k4.m54274du();
            this.f8383k4[i2].f8387du = c11296k4.m54276k4().getPosition();
            long position = c11296k4.m54276k4().getPosition() + ((long) (this.f8383k4[i2].f8390to & 65535));
            long position2 = c11296k4.m54276k4().getPosition();
            k4 k4Var = this.f8383k4[i2];
            long j2 = position2 + ((long) (k4Var.f8390to & 65535)) + ((long) ((k4Var.f8391x1 & 65535) * 2));
            if (position < this.f8385to) {
                this.f8385to = position;
            }
            if (j2 > j) {
                j = j2;
            }
            i2++;
        }
        this.f8384kk = new int[(int) ((j - this.f8385to) / 2)];
        c11296k4.m54276k4().seek(this.f8385to, 0);
        long j3 = 0;
        while (true) {
            int[] iArr = this.f8384kk;
            if (j3 >= iArr.length) {
                super.mo11843k4(c11296k4);
                return;
            } else {
                iArr[(int) j3] = c11296k4.m54274du();
                j3++;
            }
        }
    }
}
