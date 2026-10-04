package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.r9 */
/* JADX INFO: loaded from: classes3.dex */
class C2273r9 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.r9$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public byte f7826k4;

        /* JADX INFO: renamed from: x1 */
        public byte f7827x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m11339x1(k4 k4Var) {
            return k4Var.f7826k4 == this.f7826k4 && k4Var.f7827x1 == this.f7827x1;
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
                return m11339x1((k4) obj);
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
            k4Var.f7826k4 = this.f7826k4;
            k4Var.f7827x1 = this.f7827x1;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new InterfaceC7014c5<k4>() { // from class: com.aspose.slides.internal.ca.r9.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public k4 mo838x1() {
                return new k4();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m11336k4(C2135ix c2135ix) {
        byte b = 0;
        while (c2135ix.m10795x1()) {
            b = (byte) (b + 1);
        }
        return (b == 0 || c2135ix.m10795x1()) ? b : (byte) (b * (-1));
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m11337k4(C1995aa c1995aa, byte[] bArr, int i, int i2) {
        C2364x6 c2364x6 = new C2364x6(bArr);
        c2364x6.m11669h4();
        int iM11669h4 = c2364x6.m11669h4();
        c2364x6.m11674to();
        k4[] k4VarArr = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), C7019kk.m27457kk(Integer.valueOf(iM11669h4), 8)));
        for (int i3 = 0; i3 < C7019kk.m27457kk(Integer.valueOf(iM11669h4), 8); i3++) {
            k4 k4Var = new k4();
            k4VarArr[i3] = k4Var;
            k4Var.f7826k4 = c2364x6.m11668dy();
            k4VarArr[i3].f7827x1 = c2364x6.m11668dy();
        }
        C2135ix c2135ix = new C2135ix(bArr, true);
        c2135ix.m10793k4(c2364x6.m11670k4());
        int iM27462to = (C7019kk.m27462to(Integer.valueOf(i), 8) + 5) & (-4);
        int length = (k4VarArr.length * iM27462to) + 8;
        byte[] bArr2 = new byte[length];
        int i4 = 0;
        while (i4 < 8) {
            bArr2[i4] = bArr[i4];
            i4++;
        }
        for (k4 k4Var2 : k4VarArr) {
            bArr2[i4] = k4Var2.f7826k4;
            bArr2[i4 + 1] = k4Var2.f7827x1;
            int i5 = i4 + 2;
            for (int i6 = 0; i6 < C7019kk.m27457kk(Integer.valueOf(i), 8); i6++) {
                bArr2[i6 + i5] = (byte) (C7019kk.m27462to(Double.valueOf(((((C7019kk.m27433c5(Integer.valueOf(i2), 8) / 2.0d) + (C7019kk.m27433c5(Integer.valueOf(c1995aa.m10133k4(i6)), 8) * (C7019kk.m27433c5(Byte.valueOf(k4Var2.f7826k4), 6) * 64.0d))) / C7019kk.m27433c5(Integer.valueOf(i2), 8)) + 32.0d) / 64.0d), 14) + m11336k4(c2135ix));
            }
            i4 = i5 + (iM27462to - 2);
        }
        if (i4 == length) {
            return bArr2;
        }
        throw new InvalidOperationException("Incorrect length of output data in 'hdmx' decoder");
    }
}
