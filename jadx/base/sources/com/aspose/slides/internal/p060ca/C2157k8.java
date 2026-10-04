package com.aspose.slides.internal.p060ca;

import OooO0O0.OooO0OO;
import com.aspose.slides.C22208OooOo0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.k8 */
/* JADX INFO: loaded from: classes3.dex */
class C2157k8 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.k8$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public int f7468k4;

        /* JADX INFO: renamed from: kk */
        public byte f7469kk;

        /* JADX INFO: renamed from: to */
        public kk[] f7470to;

        /* JADX INFO: renamed from: x1 */
        public byte f7471x1;

        private k4() {
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.k8$kk */
    public static class kk extends AbstractC7020m9<kk> {

        /* JADX INFO: renamed from: k4 */
        public int f7472k4;

        /* JADX INFO: renamed from: kk */
        public short f7473kk;

        /* JADX INFO: renamed from: x1 */
        public short f7474x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m10915x1(kk kkVar) {
            return kkVar.f7472k4 == this.f7472k4 && kkVar.f7474x1 == this.f7474x1 && kkVar.f7473kk == this.f7473kk;
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
            if (obj instanceof kk) {
                return m10915x1((kk) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public kk Clone() {
            kk kkVar = new kk();
            CloneTo(kkVar);
            return kkVar;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(kk kkVar) {
            kkVar.f7472k4 = this.f7472k4;
            kkVar.f7474x1 = this.f7474x1;
            kkVar.f7473kk = this.f7473kk;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.k8$x1 */
    public static class x1 extends AbstractC7020m9<x1> {

        /* JADX INFO: renamed from: k4 */
        public byte f7475k4;

        /* JADX INFO: renamed from: kk */
        public byte f7476kk;

        /* JADX INFO: renamed from: to */
        public byte f7477to;

        /* JADX INFO: renamed from: x1 */
        public byte f7478x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m10918x1(x1 x1Var) {
            return x1Var.f7475k4 == this.f7475k4 && x1Var.f7478x1 == this.f7478x1 && x1Var.f7476kk == this.f7476kk && x1Var.f7477to == this.f7477to;
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
            if (obj instanceof x1) {
                return m10918x1((x1) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public x1 Clone() {
            x1 x1Var = new x1();
            CloneTo(x1Var);
            return x1Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(x1 x1Var) {
            x1Var.f7475k4 = this.f7475k4;
            x1Var.f7478x1 = this.f7478x1;
            x1Var.f7476kk = this.f7476kk;
            x1Var.f7477to = this.f7477to;
        }
    }

    static {
        C7019kk.m27454k4(x1.class, (InterfaceC7014c5) new InterfaceC7014c5<x1>() { // from class: com.aspose.slides.internal.ca.k8.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public x1 mo838x1() {
                return new x1();
            }
        });
        C7019kk.m27454k4(kk.class, (InterfaceC7014c5) new InterfaceC7014c5<kk>() { // from class: com.aspose.slides.internal.ca.k8.2
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public kk mo838x1() {
                return new kk();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m10910k4(C2135ix c2135ix) {
        byte b = 0;
        while (c2135ix.m10795x1()) {
            b = (byte) (b + 1);
        }
        return (b == 0 || c2135ix.m10795x1()) ? b : (byte) (b * (-1));
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m10911k4(int i, x1[] x1VarArr, int[] iArr, k4[] k4VarArr) {
        if (C7019kk.m27457kk(Integer.valueOf(i), 8) != 0 && C7019kk.m27457kk(Integer.valueOf(i), 8) != 1) {
            throw new ArgumentException("Version of 'VDMX' table is incorrect");
        }
        int length = (k4VarArr.length * 4) + (iArr.length * 2) + (x1VarArr.length * 4) + 6;
        for (k4 k4Var : k4VarArr) {
            length += k4Var.f7470to.length * 6;
        }
        byte[] bArr = new byte[length];
        C2214ne c2214ne = new C2214ne(bArr);
        c2214ne.m11173kk(i);
        c2214ne.m11173kk(C7019kk.m27457kk(Integer.valueOf(k4VarArr.length), 9));
        c2214ne.m11173kk(C7019kk.m27457kk(Integer.valueOf(x1VarArr.length), 9));
        for (x1 x1Var : x1VarArr) {
            x1 x1VarClone = x1Var.Clone();
            c2214ne.m11169k4(x1VarClone.f7475k4);
            c2214ne.m11169k4(x1VarClone.f7478x1);
            c2214ne.m11169k4(x1VarClone.f7476kk);
            c2214ne.m11169k4(x1VarClone.f7477to);
        }
        for (int i2 : iArr) {
            c2214ne.m11173kk(i2);
        }
        for (int i3 = 0; i3 < k4VarArr.length; i3++) {
            k4 k4Var2 = k4VarArr[i3];
            c2214ne.m11173kk(k4Var2.f7468k4);
            c2214ne.m11169k4(k4Var2.f7471x1);
            c2214ne.m11169k4(k4Var2.f7469kk);
            int i4 = 0;
            while (true) {
                kk[] kkVarArr = k4Var2.f7470to;
                if (i4 < kkVarArr.length) {
                    kk kkVarClone = kkVarArr[i3].Clone();
                    c2214ne.m11173kk(kkVarClone.f7472k4);
                    c2214ne.m11172k4(kkVarClone.f7474x1);
                    c2214ne.m11172k4(kkVarClone.f7473kk);
                    i4++;
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m10912k4(byte[] bArr) {
        C2364x6 c2364x6 = new C2364x6(bArr);
        int iM11669h4 = c2364x6.m11669h4();
        int iM11669h42 = c2364x6.m11669h4();
        int iM11669h43 = c2364x6.m11669h4();
        int i = 8;
        x1[] x1VarArr = (x1[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) x1.class), C7019kk.m27457kk(Integer.valueOf(iM11669h43), 8)));
        for (int i2 = 0; i2 < C7019kk.m27457kk(Integer.valueOf(iM11669h43), 8); i2++) {
            x1 x1Var = new x1();
            x1VarArr[i2] = x1Var;
            x1Var.f7475k4 = c2364x6.m11668dy();
            x1VarArr[i2].f7478x1 = c2364x6.m11668dy();
            x1VarArr[i2].f7476kk = c2364x6.m11668dy();
            x1VarArr[i2].f7477to = c2364x6.m11668dy();
        }
        int[] iArr = new int[C7019kk.m27457kk(Integer.valueOf(iM11669h43), 8)];
        for (int i3 = 0; i3 < C7019kk.m27457kk(Integer.valueOf(iM11669h43), 8); i3++) {
            iArr[i3] = c2364x6.m11669h4();
        }
        k4[] k4VarArr = new k4[C7019kk.m27457kk(Integer.valueOf(iM11669h42), 8)];
        C2135ix c2135ix = new C2135ix(bArr, true);
        int i4 = 0;
        while (i4 < C7019kk.m27457kk(Integer.valueOf(iM11669h42), i)) {
            k4 k4Var = new k4();
            k4Var.f7468k4 = c2364x6.m11669h4();
            k4VarArr[i4] = k4Var;
            short sM11673m9 = c2364x6.m11673m9();
            short sM11673m92 = c2364x6.m11673m9();
            c2135ix.m10793k4(c2364x6.m11670k4());
            k4Var.f7470to = (kk[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) kk.class), k4Var.f7468k4));
            int i5 = i;
            int i6 = 0;
            while (i6 < C7019kk.m27457kk(Integer.valueOf(k4Var.f7468k4), i)) {
                byte bM10910k4 = m10910k4(c2135ix);
                byte bM10910k42 = m10910k4(c2135ix);
                byte bM10910k43 = m10910k4(c2135ix);
                int i7 = bM10910k4 + i5;
                int[] iArr2 = iArr;
                double d = i7;
                int iM27462to = C7019kk.m27462to(Double.valueOf(OooO0OO.OooO00o(d, sM11673m9, 1024.0d, 2048.0d)), 14);
                C2135ix c2135ix2 = c2135ix;
                int i8 = i4;
                int iOooO00o = C22208OooOo0.OooO00o(-((((double) sM11673m92) * d) + 1024.0d), 2048.0d, 14);
                k4Var.f7470to[i6] = new kk();
                k4Var.f7470to[i6].f7472k4 = C7019kk.m27457kk(Integer.valueOf(i7), 9);
                kk kkVar = k4Var.f7470to[i6];
                kkVar.f7474x1 = (short) (iM27462to + bM10910k42);
                kkVar.f7473kk = (short) (iOooO00o + bM10910k43);
                if (i6 == 0) {
                    k4Var.f7471x1 = (byte) i7;
                }
                k4Var.f7469kk = (byte) i7;
                i5 = i7 + 1;
                i6++;
                c2135ix = c2135ix2;
                i4 = i8;
                iArr = iArr2;
                i = 8;
            }
            c2364x6.m11671k4(c2135ix.m10792k4());
            i4++;
            i = 8;
        }
        int[] iArr3 = iArr;
        if (c2364x6.m11670k4() == bArr.length) {
            return m10911k4(iM11669h4, x1VarArr, iArr3, k4VarArr);
        }
        throw new InvalidOperationException("Incorrect length of 'VDMX' table");
    }
}
