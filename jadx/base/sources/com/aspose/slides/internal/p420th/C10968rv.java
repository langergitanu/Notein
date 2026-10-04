package com.aspose.slides.internal.p420th;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C10968rv {

    /* JADX INFO: renamed from: du */
    private byte[] f38228du;

    /* JADX INFO: renamed from: k4 */
    private float[] f38229k4;

    /* JADX INFO: renamed from: kk */
    private float[] f38230kk;

    /* JADX INFO: renamed from: to */
    private x1[] f38231to;

    /* JADX INFO: renamed from: x1 */
    private float[] f38232x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.th.rv$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private List<Float> f38234k4 = new List<>();

        /* JADX INFO: renamed from: x1 */
        private List<Float> f38237x1 = new List<>();

        /* JADX INFO: renamed from: kk */
        private List<Float> f38235kk = new List<>();

        /* JADX INFO: renamed from: to */
        private List<x1> f38236to = new List<>();

        /* JADX INFO: renamed from: du */
        private List<Byte> f38233du = new List<>();

        /* JADX INFO: renamed from: du */
        public final List<Byte> m53033du() {
            return this.f38233du;
        }

        /* JADX INFO: renamed from: h4 */
        public final C10968rv m53034h4() {
            return new C10968rv(this);
        }

        /* JADX INFO: renamed from: k4 */
        public final List<x1> m53035k4() {
            return this.f38236to;
        }

        /* JADX INFO: renamed from: kk */
        public final List<Float> m53038kk() {
            return this.f38237x1;
        }

        /* JADX INFO: renamed from: to */
        public final List<Float> m53039to() {
            return this.f38235kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final List<Float> m53040x1() {
            return this.f38234k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m53036k4(float f) {
            m53037k4(null, f, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m53037k4(x1 x1Var, float f, float f2, float f3) {
            byte b;
            if (f > 0.0f) {
                this.f38234k4.addItem(Float.valueOf(f));
                b = (byte) 1;
            } else {
                b = 0;
            }
            if (f2 != 0.0f) {
                this.f38237x1.addItem(Float.valueOf(f2));
                b = (byte) ((b & 255) | 2);
            }
            if (f3 != 0.0f) {
                this.f38235kk.addItem(Float.valueOf(f3));
                b = (byte) ((b & 255) | 4);
            }
            if (x1Var != null) {
                this.f38236to.addItem(x1Var);
                b = (byte) ((b & 255) | 8);
            }
            this.f38233du.addItem(Byte.valueOf(b));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.th.rv$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private int f38238k4 = 1;

        /* JADX INFO: renamed from: x1 */
        private int f38239x1 = 1;
    }

    public C10968rv() {
    }

    /* JADX INFO: renamed from: k4 */
    private float[] m53031k4(List<Float> list) {
        int size = list.size();
        float[] fArr = new float[size];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) list.toArray(new Float[size])), AbstractC14092to.m67208k4(fArr), size);
        return fArr;
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m53032x1(List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) list.toArray(new Byte[size])), AbstractC14092to.m67208k4((Object) bArr), size);
        return bArr;
    }

    private C10968rv(k4 k4Var) {
        this.f38229k4 = m53031k4(k4Var.m53040x1());
        this.f38232x1 = m53031k4(k4Var.m53038kk());
        this.f38230kk = m53031k4(k4Var.m53039to());
        this.f38231to = k4Var.m53035k4().toArray(new x1[0]);
        this.f38228du = m53032x1(k4Var.m53033du());
    }
}
