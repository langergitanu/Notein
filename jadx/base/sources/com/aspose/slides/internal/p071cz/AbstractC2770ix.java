package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.ix */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2770ix {

    /* JADX INFO: renamed from: k4 */
    private k4 f8628k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.cz.ix$k4 */
    public static class k4 implements InterfaceC2736g9, x1 {

        /* JADX INFO: renamed from: k4 */
        private final SortedList<String, Double> f8629k4 = new SortedList<>();

        /* JADX INFO: renamed from: x1 */
        private void m12333x1(String str) {
            if (!this.f8629k4.containsKey(str)) {
                throw new C2866q3(C14113y2.m67408k4("The shape has no adjust value with name '", str, "'."));
            }
        }

        @Override // com.aspose.slides.internal.p071cz.InterfaceC2736g9
        /* JADX INFO: renamed from: k4 */
        public final double mo12282k4(String str) {
            m12333x1(str);
            return this.f8629k4.get_Item(str).doubleValue();
        }

        @Override // com.aspose.slides.internal.p071cz.InterfaceC2736g9
        /* JADX INFO: renamed from: k4 */
        public final void mo12283k4(String str, double d) {
            m12333x1(str);
            this.f8629k4.set_Item(str, Double.valueOf(d));
        }

        @Override // com.aspose.slides.internal.p071cz.AbstractC2770ix.x1
        /* JADX INFO: renamed from: x1 */
        public final void mo12334x1(String str, double d) {
            this.f8629k4.addItem(str, Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.cz.ix$x1 */
    public interface x1 {
        /* JADX INFO: renamed from: x1 */
        void mo12334x1(String str, double d);
    }

    /* JADX INFO: renamed from: du */
    public static double m12319du(double d, double d2, double d3) {
        return d > 0.0d ? d2 : d3;
    }

    /* JADX INFO: renamed from: dy */
    public static double m12320dy(double d, double d2, double d3) {
        return C14116yg.m67495m9(C14116yg.m67498to(d3, d2)) * d;
    }

    /* JADX INFO: renamed from: h4 */
    public static double m12321h4(double d, double d2, double d3) {
        return C14116yg.m67470dy(C14116yg.m67498to(d3, d2)) * d;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m12322k4(double d, double d2) {
        return ((C14116yg.m67498to(d2, d) * 60000.0d) * 180.0d) / 3.141592653589793d;
    }

    /* JADX INFO: renamed from: kk */
    public static double m12324kk(double d, double d2) {
        return C14116yg.m67495m9((d2 * 3.141592653589793d) / 1.08E7d) * d;
    }

    /* JADX INFO: renamed from: m9 */
    public static double m12326m9(double d, double d2, double d3) {
        return C14116yg.m67496rv((d3 * d3) + (d2 * d2) + (d * d));
    }

    /* JADX INFO: renamed from: to */
    public static double m12327to(double d, double d2) {
        return C14116yg.m67466c5((d2 * 3.141592653589793d) / 1.08E7d) * d;
    }

    /* JADX INFO: renamed from: x1 */
    public static double m12329x1(double d, double d2) {
        return C14116yg.m67470dy((d2 * 3.141592653589793d) / 1.08E7d) * d;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m12323k4(double d, double d2, double d3) {
        return d2 < d ? d : d2 > d3 ? d3 : d2;
    }

    /* JADX INFO: renamed from: kk */
    public static double m12325kk(double d, double d2, double d3) {
        return (d + d2) - d3;
    }

    /* JADX INFO: renamed from: to */
    public static double m12328to(double d, double d2, double d3) {
        return (d + d2) / d3;
    }

    /* JADX INFO: renamed from: x1 */
    public static double m12330x1(double d, double d2, double d3) {
        return (d * d2) / d3;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo12113k4(x1 x1Var) {
    }

    /* JADX INFO: renamed from: kk */
    public final void m12331kk() {
        this.f8628k4 = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC2736g9 m12332x1() {
        if (this.f8628k4 == null) {
            k4 k4Var = new k4();
            this.f8628k4 = k4Var;
            mo12113k4(k4Var);
        }
        return this.f8628k4;
    }
}
