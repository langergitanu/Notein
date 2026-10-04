package com.aspose.slides.internal.p317og;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p482wr.C12268ts;
import com.aspose.slides.internal.p505xn.C12557du;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.og.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7039k4 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.og.k4$k4 */
    public static class k4 implements Comparator<kk> {
        private k4() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compare(kk kkVar, kk kkVar2) {
            return C14114y9.m67454k4(kkVar.f19196k4, kkVar2.f19196k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.og.k4$kk */
    public static class kk {

        /* JADX INFO: renamed from: du */
        public long f19194du;

        /* JADX INFO: renamed from: h4 */
        public long f19195h4;

        /* JADX INFO: renamed from: k4 */
        public long f19196k4;

        /* JADX INFO: renamed from: kk */
        public long f19197kk;

        /* JADX INFO: renamed from: to */
        public long f19198to;

        /* JADX INFO: renamed from: x1 */
        public long f19199x1;

        private kk() {
        }

        /* JADX INFO: renamed from: k4 */
        public final void m27560k4(C12564kk c12564kk) {
            this.f19196k4 = c12564kk.m58604kk();
            this.f19199x1 = c12564kk.m58604kk();
            this.f19197kk = c12564kk.m58604kk();
            this.f19198to = c12564kk.m58604kk();
            this.f19194du = c12564kk.m58604kk();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.og.k4$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: c5 */
        public long f19200c5;

        /* JADX INFO: renamed from: ck */
        public long f19201ck;

        /* JADX INFO: renamed from: du */
        public long f19202du;

        /* JADX INFO: renamed from: dy */
        public long f19203dy;

        /* JADX INFO: renamed from: fa */
        public long f19204fa;

        /* JADX INFO: renamed from: h4 */
        public int f19205h4;

        /* JADX INFO: renamed from: jd */
        public long f19206jd;

        /* JADX INFO: renamed from: k4 */
        public long f19207k4;

        /* JADX INFO: renamed from: kk */
        public long f19208kk;

        /* JADX INFO: renamed from: m9 */
        public int f19209m9;

        /* JADX INFO: renamed from: to */
        public int f19210to;

        /* JADX INFO: renamed from: x1 */
        public long f19211x1;

        private x1() {
        }

        /* JADX INFO: renamed from: k4 */
        public final void m27561k4(C12564kk c12564kk) {
            long jM58604kk = c12564kk.m58604kk();
            this.f19207k4 = jM58604kk;
            if ((jM58604kk & 4294967295L) != 2001684038) {
                throw new NotSupportedException("Unsupported woff signature version.");
            }
            this.f19211x1 = c12564kk.m58604kk();
            this.f19208kk = c12564kk.m58604kk();
            this.f19210to = c12564kk.m58600du();
            c12564kk.m58600du();
            this.f19202du = c12564kk.m58604kk();
            this.f19205h4 = c12564kk.m58600du();
            this.f19209m9 = c12564kk.m58600du();
            this.f19203dy = c12564kk.m58604kk();
            this.f19200c5 = c12564kk.m58604kk();
            this.f19206jd = c12564kk.m58604kk();
            this.f19201ck = c12564kk.m58604kk();
            this.f19204fa = c12564kk.m58604kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m27555k4(int i) {
        return (i + 3) & (-4);
    }

    /* JADX INFO: renamed from: x1 */
    private static int m27557x1(int i) {
        int i2 = 0;
        while (C14116yg.m67469du(2.0d, i2) < i) {
            i2++;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27558k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        C12564kk c12564kk = new C12564kk(abstractC3150x6);
        C3149x1 c3149x1 = new C3149x1(abstractC3150x62);
        x1 x1Var = new x1();
        x1Var.m27561k4(c12564kk);
        int i = x1Var.f19210to;
        kk[] kkVarArr = new kk[i];
        for (int i2 = 0; i2 < i; i2++) {
            kk kkVar = new kk();
            kkVar.m27560k4(c12564kk);
            kkVarArr[i2] = kkVar;
        }
        AbstractC14092to.m67236k4((Object[]) kkVarArr, (Comparator) new k4());
        int i3 = ((x1Var.f19210to & 65535) * 16) + 12;
        for (int i4 = 0; i4 < i; i4++) {
            kk kkVar2 = kkVarArr[i4];
            int iM27555k4 = m27555k4(i3);
            kkVar2.f19195h4 = 4294967295L & ((long) iM27555k4);
            i3 = iM27555k4 + ((int) kkVar2.f19198to);
        }
        c3149x1.m13447k4(C12557du.m58574k4(x1Var.f19211x1));
        int i5 = x1Var.f19210to;
        c3149x1.m13446k4(C12557du.m58576x1(i5));
        int i6 = i5 & 65535;
        int iM27557x1 = m27557x1(i6);
        int i7 = iM27557x1 & 65535;
        int i8 = (iM27557x1 & 65535) * 16;
        c3149x1.m13446k4(C12557du.m58576x1(i8 & 65535));
        c3149x1.m13446k4(C12557du.m58576x1(i7));
        c3149x1.m13446k4(C12557du.m58576x1(((i6 * 16) - (i8 & 65535)) & 65535));
        for (int i9 = 0; i9 < i; i9++) {
            kk kkVar3 = kkVarArr[i9];
            c3149x1.m13447k4(C12557du.m58574k4(kkVar3.f19196k4));
            c3149x1.m13447k4(C12557du.m58574k4(kkVar3.f19194du));
            c3149x1.m13447k4(C12557du.m58574k4(kkVar3.f19195h4));
            c3149x1.m13447k4(C12557du.m58574k4(kkVar3.f19198to));
        }
        for (int i10 = 0; i10 < i; i10++) {
            kk kkVar4 = kkVarArr[i10];
            int position = (int) ((kkVar4.f19195h4 & 4294967295L) - c3149x1.m13442k4().getPosition());
            if (position > 0) {
                c3149x1.m13450k4(new byte[position]);
            }
            c3149x1.m13450k4(m27556k4(c12564kk, kkVar4));
        }
        abstractC3150x62.flush();
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m27556k4(C12564kk c12564kk, kk kkVar) {
        c12564kk.m58602k4().seek(kkVar.f19199x1 & 4294967295L, 0);
        byte[] bArrM58603k4 = c12564kk.m58603k4((int) kkVar.f19197kk);
        if ((kkVar.f19198to & 4294967295L) <= (kkVar.f19197kk & 4294967295L)) {
            return bArrM58603k4;
        }
        C12268ts c12268ts = new C12268ts(new C3152yj(bArrM58603k4), 1);
        int i = (int) kkVar.f19198to;
        byte[] bArr = new byte[i];
        c12268ts.read(bArr, 0, i);
        return bArr;
    }
}
