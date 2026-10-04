package com.aspose.slides;

import android.content.pm.PackageManager;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class im9 extends AbstractC7020m9<im9> {

    /* JADX INFO: renamed from: k4 */
    private static float f5735k4;

    /* JADX INFO: renamed from: k4 */
    private static double m7678k4(int i) {
        double d = ((double) i) / 255.0d;
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        if (d <= 1.0d) {
            return C14116yg.m67469du((d + 0.055d) / 1.055d, 2.4d);
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: kk */
    public static void m7717kk(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat, float f) {
        if (iEffectFormat == null || lineFormat == null) {
            return;
        }
        azo azoVarM7718x1 = m7718x1(c12003du.Clone(), lineFormat, c14365qy, (float) lineFormat.getEffective().getWidth());
        azoVarM7718x1.f4054h4 = m7685k4(c12003du.Clone(), (LineFillFormat) lineFormat.getFillFormat(), c14365qy, f, c11896dy);
        if (fillFormat == null) {
            m7722x1(c14365qy, c11896dy, (C0962es) null, azoVarM7718x1, iEffectFormat);
            return;
        }
        C0962es c0962esM7684k4 = m7684k4(c12003du2.Clone(), fillFormat, c14365qy, f, c11896dy);
        if (c0962esM7684k4.m5681to() == 0 || c0962esM7684k4.m5681to() == -1) {
            m7722x1(c14365qy, c11896dy, (C0962es) null, azoVarM7718x1, iEffectFormat);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static azo m7718x1(C12003du c12003du, LineFormat lineFormat, C14365qy c14365qy, float f) {
        return m7683k4(c12003du, lineFormat, c14365qy, f, (LineFormat) null);
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
        if (obj instanceof im9) {
            return m7723x1((im9) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m7679k4() {
        if (f5735k4 == 0.0f) {
            f5735k4 = C12567ne.m58657k4(new C12009k4(1, 1)) / 96.0f;
        }
        return f5735k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public im9 Clone() {
        im9 im9Var = new im9();
        CloneTo(im9Var);
        return im9Var;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m7680k4(IChart iChart) {
        double d;
        double d2;
        double width = ((C0874cy) iChart.getSlide().createThemeEffective().getFormatScheme()).m4887x1(C12003du.f40505to.Clone()).get_Item(0).getWidth();
        if (iChart.getStyle() <= 31) {
            if (iChart.getStyle() <= 23) {
                d = iChart.getStyle() <= 7 ? 3.0d : 7.0d;
                d2 = width * 5.0d;
            }
            d2 = width * d;
        } else {
            d2 = width * 5.0d;
        }
        return (float) d2;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m7719x1(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat, float f) {
        m7696k4(c12003du, c12003du2, c14365qy, c11896dy, lineFormat, fillFormat, iEffectFormat, f, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m7681k4(LineFormat lineFormat, LineFormat lineFormat2, float f) {
        double width;
        if (lineFormat != null && !C14044b3.m66437kk(lineFormat.getWidth())) {
            width = lineFormat.getWidth();
        } else {
            if (lineFormat2 == null || C14044b3.m66437kk(lineFormat2.getWidth())) {
                return f;
            }
            width = lineFormat2.getWidth();
        }
        return (float) width;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m7720x1(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C12007ix c12007ix, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat) {
        m7702k4(c12003du, c12003du2, c14365qy, c12007ix, lineFormat, fillFormat, iEffectFormat, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m7682k4(double d) {
        double dM67469du = 0.0d;
        if (d >= 0.0d) {
            if (d <= 0.0031308d) {
                dM67469du = 12.92d * d;
            } else {
                dM67469du = 1.0d;
                if (d < 1.0d) {
                    dM67469du = (C14116yg.m67469du(d, 0.4166666666666667d) * 1.055d) - 0.055d;
                }
            }
        }
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67478k4(dM67469du * 255.0d, 0, (short) 1)), 14);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m7721x1(C12003du c12003du, C14365qy c14365qy, C12007ix c12007ix, FillFormat fillFormat, IEffectFormat iEffectFormat) {
        if (iEffectFormat == null || iEffectFormat.isNoEffects()) {
            return;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        m7704k4(c12003du.Clone(), c14365qy, c11896dy, fillFormat, iEffectFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static azo m7683k4(C12003du c12003du, LineFormat lineFormat, C14365qy c14365qy, float f, LineFormat lineFormat2) {
        C12003du c12003duClone = c12003du.Clone();
        if (lineFormat != null || lineFormat2 != null) {
            f = m7681k4(lineFormat, lineFormat2, f);
            m7687k4(lineFormat, lineFormat2, c12003du.Clone(), c14365qy).CloneTo(c12003duClone);
        }
        azo azoVar = new azo(c12003duClone.Clone(), f);
        azoVar.f4053du = 72.0f;
        m7692k4(azoVar, lineFormat);
        return azoVar;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m7722x1(C14365qy c14365qy, C11896dy c11896dy, C0962es c0962es, azo azoVar, IEffectFormat iEffectFormat) {
        if (!c14365qy.m69847k4() || iEffectFormat == null || iEffectFormat.getGlowEffect() == null) {
            return;
        }
        new C14871z3(iEffectFormat.getGlowEffect()).m74297k4(c14365qy.m69870wy(), c11896dy, c0962es, azoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r11v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r11v7, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r13v11, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r13v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r13v7, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v13, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r9v20, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v21, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: k4 */
    public static C0962es m7684k4(C12003du c12003du, FillFormat fillFormat, C14365qy c14365qy, float f, C11896dy c11896dy) {
        if (fillFormat == null) {
            return new C0962es(C12003du.m56398k4(c12003du.m56501c5() & 255, PackageManager.getPackageInfo((String) (c12003du.m56507jd() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56502ck() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56505fa() & 255), (int) f)).Clone().Clone());
        }
        byte fillType = fillFormat.getFillType();
        if (fillType == 0) {
            return new C0962es();
        }
        if (fillType == 1) {
            C12003du c12003duClone = m7686k4((ColorFormat) fillFormat.getSolidFillColor(), c14365qy.m69834fa()).Clone();
            C12003du.m56398k4(c12003duClone.m56501c5() & 255, PackageManager.getPackageInfo((String) (c12003duClone.m56507jd() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003duClone.m56502ck() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003duClone.m56505fa() & 255), (int) f)).CloneTo(c12003duClone);
            return new C0962es(c12003duClone.Clone());
        }
        if (fillType != 2 && fillType != 3 && fillType != 4) {
            return new C0962es(C12003du.m56398k4(c12003du.m56501c5() & 255, PackageManager.getPackageInfo((String) (c12003du.m56507jd() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56502ck() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56505fa() & 255), (int) f)).Clone().Clone());
        }
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        return C0962es.m5659k4(new ajz(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f), new C4317dy(), null, c14365qy.m69834fa().getSlide(), null), fillFormat);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m7723x1(im9 im9Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r11v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r11v7, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r13v11, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r13v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r13v7, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v13, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r9v20, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v21, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: k4 */
    public static C0962es m7685k4(C12003du c12003du, LineFillFormat lineFillFormat, C14365qy c14365qy, float f, C11896dy c11896dy) {
        if (lineFillFormat == null) {
            return new C0962es(C12003du.m56398k4(c12003du.m56501c5() & 255, PackageManager.getPackageInfo((String) (c12003du.m56507jd() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56502ck() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56505fa() & 255), (int) f)).Clone().Clone());
        }
        byte fillType = lineFillFormat.getFillType();
        if (fillType == 0) {
            return new C0962es();
        }
        if (fillType == 1) {
            C12003du c12003duClone = m7686k4((ColorFormat) lineFillFormat.getSolidFillColor(), c14365qy.m69834fa()).Clone();
            C12003du.m56398k4(c12003duClone.m56501c5() & 255, PackageManager.getPackageInfo((String) (c12003duClone.m56507jd() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003duClone.m56502ck() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003duClone.m56505fa() & 255), (int) f)).CloneTo(c12003duClone);
            return new C0962es(c12003duClone.Clone());
        }
        if (fillType != 2 && fillType != 3 && fillType != 4) {
            return new C0962es(C12003du.m56398k4(c12003du.m56501c5() & 255, PackageManager.getPackageInfo((String) (c12003du.m56507jd() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56502ck() & 255), (int) f), PackageManager.getPackageInfo((String) (c12003du.m56505fa() & 255), (int) f)).Clone().Clone());
        }
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        return C0962es.m5662k4(new ajz(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f), new C4317dy(), null, c14365qy.m69834fa().getSlide(), null), lineFillFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m7686k4(ColorFormat colorFormat, Chart chart) {
        ColorFormat colorFormat2;
        if (colorFormat.getColorType() != 3) {
            return colorFormat.m1084to();
        }
        if (chart.m517up().m63294k4() && chart.getThemeManager().isOverrideThemeEnabled()) {
            colorFormat2 = new ColorFormat(chart, ((ColorFormat) chart.getThemeManager().getOverrideTheme().getColorScheme().getByColorSchemeIndex(chart.m517up().m63289k4(colorFormat.getSchemeColor()))).m1084to().Clone());
        } else {
            colorFormat2 = new ColorFormat(chart, ((BaseSlide) chart.getSlide()).m390k4(colorFormat.getSchemeColor()).m1084to().Clone());
        }
        ((ColorOperationCollection) colorFormat2.getColorTransform()).m1118k4((ColorOperationCollection) colorFormat.getColorTransform(), false);
        return colorFormat2.m1084to();
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du m7687k4(LineFormat lineFormat, LineFormat lineFormat2, C12003du c12003du, C14365qy c14365qy) {
        return (lineFormat == null || lineFormat.getFillFormat().getFillType() == -1) ? (lineFormat2 == null || lineFormat2.getFillFormat().getFillType() == -1) ? c12003du : m7688k4(lineFormat2, c12003du.Clone(), c14365qy) : m7688k4(lineFormat, c12003du.Clone(), c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du m7688k4(LineFormat lineFormat, C12003du c12003du, C14365qy c14365qy) {
        if (lineFormat == null) {
            throw new ArgumentNullException("format");
        }
        if (c14365qy == null) {
            throw new ArgumentNullException("chartRenderContext");
        }
        byte fillType = lineFormat.getFillFormat().getFillType();
        return fillType != 0 ? fillType != 1 ? c12003du : m7686k4((ColorFormat) lineFormat.getFillFormat().getSolidFillColor(), c14365qy.m69834fa()) : C12003du.f40505to;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x011e, code lost:
    
        if (r12 > 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12003du m7689k4(C12003du c12003du) {
        int iM63753k4;
        int iM5612x1;
        C0959ep c0959ep = new C0959ep("r", c12003du.m56507jd() & 255);
        C0959ep c0959ep2 = new C0959ep("g", c12003du.m56502ck() & 255);
        C0959ep c0959ep3 = new C0959ep("b", c12003du.m56505fa() & 255);
        if (c0959ep.m5612x1() != 0 && c0959ep2.m5612x1() != 0 && c0959ep3.m5612x1() != 0) {
            List list = new List();
            list.addItem(c0959ep);
            list.addItem(c0959ep2);
            list.addItem(c0959ep3);
            list.sort();
            C0959ep c0959ep4 = (C0959ep) list.get_Item(0);
            C0959ep c0959ep5 = (C0959ep) list.get_Item(1);
            C0959ep c0959ep6 = (C0959ep) list.get_Item(2);
            int iM5612x12 = c0959ep4.m5612x1();
            List.Enumerator it = list.iterator();
            while (it.hasNext()) {
                try {
                    C0959ep c0959ep7 = (C0959ep) it.next();
                    c0959ep7.m5613x1(iM5612x12 - c0959ep7.m5612x1());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            int iM5612x13 = c0959ep4.m5612x1() + c0959ep5.m5612x1() + c0959ep6.m5612x1();
            int iM5611kk = c0959ep4.m5611kk() + c0959ep5.m5611kk() + c0959ep6.m5611kk();
            int iM63759kk = kc0.m63759kk(iM5612x13 / 42);
            if (iM5612x13 > 30) {
                if (c0959ep6.m5611kk() == 0) {
                    iM63753k4 = kc0.m63753k4(((double) iM63759kk) / 3.0d);
                    c0959ep4.m5610k4(c0959ep4.m5612x1() - iM63753k4);
                    c0959ep5.m5610k4(c0959ep5.m5612x1() - iM63753k4);
                } else {
                    c0959ep4.m5610k4(c0959ep4.m5612x1() - 1);
                    int i = iM63759kk - 1;
                    if (c0959ep5.m5611kk() == 0) {
                        c0959ep5.m5610k4(c0959ep5.m5612x1() - 1);
                        int i2 = iM63759kk - 2;
                        if (i2 > 0) {
                            iM5612x1 = c0959ep6.m5612x1() - i2;
                        }
                        c0959ep6.m5610k4(iM5612x1);
                    } else {
                        int iM63753k42 = kc0.m63753k4((c0959ep5.m5611kk() / iM5611kk) * i);
                        c0959ep5.m5610k4(c0959ep5.m5612x1() - iM63753k42);
                        iM63753k4 = i - iM63753k42;
                    }
                    iM5612x1 = c0959ep6.m5612x1() - 1;
                    c0959ep6.m5610k4(iM5612x1);
                }
                c0959ep6.m5610k4(c0959ep6.m5612x1() - iM63753k4);
            }
        }
        return C12003du.m56397k4(c0959ep.m5612x1(), c0959ep2.m5612x1(), c0959ep3.m5612x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m7690k4(C12003du c12003du, double d) {
        int[] iArr = new int[3];
        iArr[0] = c12003du.m56507jd() & 255;
        iArr[1] = c12003du.m56502ck() & 255;
        iArr[2] = c12003du.m56505fa() & 255;
        for (int i = 0; i < 3; i++) {
            double dM7678k4 = m7678k4(iArr[i]);
            double d2 = 1.0d - d;
            double dOooO0O0 = (d2 + 1.0d) * dM7678k4;
            if (d > 0.0d) {
                dOooO0O0 = C21532OooOOo.OooO0O0(1.0d, d2, dM7678k4, d2);
            }
            iArr[i] = m7682k4(dOooO0O0);
        }
        return C12003du.m56397k4(iArr[0], iArr[1], iArr[2]);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12026yj m7691k4(C12003du c12003du, LineFormat lineFormat, C14365qy c14365qy, float f) {
        C12003du c12003duClone = c12003du.Clone();
        if (lineFormat != null) {
            if (!C14044b3.m66437kk(lineFormat.getWidth())) {
                f = (float) lineFormat.getWidth();
            }
            byte fillType = lineFormat.getFillFormat().getFillType();
            if (fillType == 0) {
                c12003du = C12003du.f40505to;
            } else if (fillType == 1) {
                c12003du = m7686k4((ColorFormat) lineFormat.getFillFormat().getSolidFillColor(), c14365qy.m69834fa());
            }
            c12003du.CloneTo(c12003duClone);
        }
        C12026yj c12026yj = new C12026yj(c12003duClone.Clone(), f);
        m7711k4(c12026yj, lineFormat);
        return c12026yj;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7692k4(azo azoVar, ILineFormat iLineFormat) {
        if (iLineFormat != null && C7019kk.m27469x1(((PVIObject) C7019kk.m27452k4((Object) iLineFormat, PVIObject.class)).getParent_ISlideComponent(), ChartSeries.class)) {
            azoVar.m3914kk((byte) 0);
        }
        if (iLineFormat == null) {
            return;
        }
        azoVar.m3929x1(iLineFormat.getDashStyle());
        if (iLineFormat.getDashStyle() == 11) {
            azoVar.m3912k4(iLineFormat.getCustomDashPattern());
        }
        if (iLineFormat.getCapStyle() != -1) {
            azoVar.m3914kk(iLineFormat.getCapStyle());
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(im9 im9Var) {
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7693k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, Format format) {
        m7694k4(c12003du.Clone(), c12003du2.Clone(), c14365qy, c11896dy, (LineFormat) format.getLine(), (FillFormat) format.getFill(), format.getEffect());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7694k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat) {
        m7695k4(c12003du.Clone(), c12003du2.Clone(), c14365qy, c11896dy, lineFormat, fillFormat, iEffectFormat, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7695k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat, float f) {
        azo azoVarM7718x1 = m7718x1(c12003du.Clone(), lineFormat, c14365qy, (float) lineFormat.getEffective().getWidth());
        azoVarM7718x1.f4054h4 = m7685k4(c12003du.Clone(), (LineFillFormat) lineFormat.getFillFormat(), c14365qy, f, c11896dy);
        C0962es c0962esM7684k4 = m7684k4(c12003du2.Clone(), fillFormat, c14365qy, f, c11896dy);
        m7722x1(c14365qy, c11896dy, c0962esM7684k4, azoVarM7718x1, iEffectFormat);
        c14365qy.m69870wy().mo64338k4(c11896dy, azoVarM7718x1, c0962esM7684k4);
        m7712k4(c14365qy, c11896dy, c0962esM7684k4, iEffectFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7696k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat, float f, boolean z) {
        if (iEffectFormat == null || iEffectFormat.isNoEffects()) {
            return;
        }
        azo azoVarM7718x1 = m7718x1(c12003du.Clone(), lineFormat, c14365qy, (float) lineFormat.getEffective().getWidth());
        azoVarM7718x1.f4054h4 = m7685k4(c12003du.Clone(), (LineFillFormat) lineFormat.getFillFormat(), c14365qy, f, c11896dy);
        m7714k4(c14365qy, c11896dy, m7684k4(c12003du2.Clone(), fillFormat, c14365qy, f, c11896dy), azoVarM7718x1, iEffectFormat, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7697k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, IEffectFormat iEffectFormat, float f) {
        azo azoVarM7718x1 = m7718x1(c12003du.Clone(), lineFormat, c14365qy, f);
        azoVarM7718x1.f4054h4 = m7685k4(c12003du.Clone(), (LineFillFormat) lineFormat.getFillFormat(), c14365qy, 1.0f, c11896dy);
        m7722x1(c14365qy, c11896dy, (C0962es) null, azoVarM7718x1, iEffectFormat);
        c14365qy.m69870wy().mo64338k4(c11896dy, azoVarM7718x1, (C0962es) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7698k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C12007ix c12007ix, Format format) {
        m7700k4(c12003du.Clone(), c12003du2.Clone(), c14365qy, c12007ix.Clone(), (LineFormat) format.getLine(), (FillFormat) format.getFill(), format.getEffect());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7699k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C12007ix c12007ix, Format format, boolean z) {
        m7702k4(c12003du.Clone(), c12003du2.Clone(), c14365qy, c12007ix.Clone(), (LineFormat) format.getLine(), (FillFormat) format.getFill(), format.getEffect(), z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7700k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C12007ix c12007ix, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        m7695k4(c12003du.Clone(), c12003du2.Clone(), c14365qy, c11896dy, lineFormat, fillFormat, iEffectFormat, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7701k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C12007ix c12007ix, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat, float f) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        m7717kk(c12003du.Clone(), c12003du2.Clone(), c14365qy, c11896dy, lineFormat, fillFormat, iEffectFormat, f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7702k4(C12003du c12003du, C12003du c12003du2, C14365qy c14365qy, C12007ix c12007ix, LineFormat lineFormat, FillFormat fillFormat, IEffectFormat iEffectFormat, boolean z) {
        if (iEffectFormat == null || iEffectFormat.isNoEffects()) {
            return;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        m7696k4(c12003du.Clone(), c12003du2.Clone(), c14365qy, c11896dy, lineFormat, fillFormat, iEffectFormat, 1.0f, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7703k4(C12003du c12003du, C14365qy c14365qy, C11896dy c11896dy, FillFormat fillFormat, float f, IEffectFormat iEffectFormat) {
        C0962es c0962esM7684k4 = m7684k4(c12003du.Clone(), fillFormat, c14365qy, f, c11896dy);
        m7722x1(c14365qy, c11896dy, c0962esM7684k4, (azo) null, iEffectFormat);
        c14365qy.m69870wy().mo64338k4(c11896dy, (azo) null, c0962esM7684k4);
        m7712k4(c14365qy, c11896dy, c0962esM7684k4, iEffectFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7704k4(C12003du c12003du, C14365qy c14365qy, C11896dy c11896dy, FillFormat fillFormat, IEffectFormat iEffectFormat) {
        if (iEffectFormat == null || iEffectFormat.isNoEffects()) {
            return;
        }
        m7713k4(c14365qy, c11896dy, m7684k4(c12003du.Clone(), fillFormat, c14365qy, 1.0f, c11896dy), (azo) null, iEffectFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7705k4(C12003du c12003du, C14365qy c14365qy, C11896dy c11896dy, LineFormat lineFormat, IEffectFormat iEffectFormat) {
        c14365qy.m69870wy().mo64338k4(c11896dy, m7718x1(c12003du.Clone(), lineFormat, c14365qy, 0.75f), (C0962es) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7706k4(C12003du c12003du, C14365qy c14365qy, C11896dy c11896dy, C11896dy c11896dy2, FillFormat fillFormat, float f) {
        C0962es c0962esM7684k4 = m7684k4(c12003du.Clone(), fillFormat, c14365qy, f, c11896dy2);
        c14365qy.m69870wy().mo64338k4(c11896dy, new azo(C12003du.f40505to.Clone(), 0.0f), c0962esM7684k4);
        if (C7019kk.m27469x1(c0962esM7684k4, C14478sy.class)) {
            ((C14478sy) C7019kk.m27452k4((Object) c0962esM7684k4, C14478sy.class)).m70888k4(1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7707k4(C12003du c12003du, C14365qy c14365qy, C12007ix c12007ix, FillFormat fillFormat, IEffectFormat iEffectFormat) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        m7703k4(c12003du.Clone(), c14365qy, c11896dy, fillFormat, 1.0f, iEffectFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7708k4(C12003du c12003du, C14365qy c14365qy, C12007ix c12007ix, LineFormat lineFormat, IEffectFormat iEffectFormat) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        m7705k4(c12003du.Clone(), c14365qy, c11896dy, lineFormat, iEffectFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7709k4(C12025x6 c12025x6, C12025x6 c12025x62, C12003du c12003du, LineFormat lineFormat, C14365qy c14365qy) {
        m7710k4(c12025x6, c12025x62, c12003du, lineFormat, c14365qy, (LineFormat) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7710k4(C12025x6 c12025x6, C12025x6 c12025x62, C12003du c12003du, LineFormat lineFormat, C14365qy c14365qy, LineFormat lineFormat2) {
        if (lineFormat.getFillFormat().getFillType() == 0) {
            return;
        }
        azo azoVarM7683k4 = m7683k4(c12003du.Clone(), lineFormat, c14365qy, 1.0f, lineFormat2);
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(c12025x6.Clone(), c12025x62.Clone());
            azoVarM7683k4.f4054h4 = m7685k4(c12003du.Clone(), (LineFillFormat) lineFormat.getFillFormat(), c14365qy, 1.0f, c11896dy);
            c14365qy.m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVarM7683k4, new C0962es(C12003du.f40505to.Clone()));
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7711k4(C12026yj c12026yj, ILineFormat iLineFormat) {
        if (iLineFormat == null) {
            return;
        }
        byte dashStyle = iLineFormat.getDashStyle();
        if (dashStyle != 0) {
            switch (dashStyle) {
                case 2:
                    c12026yj.m56927kk(5);
                    c12026yj.m56939x1(new float[]{4.0f, 3.0f});
                    break;
                case 3:
                    c12026yj.m56927kk(5);
                    c12026yj.m56939x1(new float[]{8.0f, 3.0f});
                    break;
                case 4:
                    c12026yj.m56927kk(5);
                    c12026yj.m56939x1(new float[]{4.0f, 3.0f, 1.0f, 3.0f});
                    break;
                case 5:
                    c12026yj.m56927kk(5);
                    c12026yj.m56939x1(new float[]{8.0f, 3.0f, 1.0f, 3.0f});
                    break;
                case 6:
                    c12026yj.m56927kk(5);
                    c12026yj.m56939x1(new float[]{8.0f, 3.0f, 1.0f, 3.0f, 1.0f, 3.0f});
                    break;
                case 7:
                    c12026yj.m56927kk(5);
                    c12026yj.m56939x1(new float[]{3.0f, 1.0f});
                    break;
                case 8:
                    c12026yj.m56927kk(2);
                    c12026yj.m56937x1(2);
                    break;
            }
        } else {
            c12026yj.m56927kk(0);
        }
        byte joinStyle = iLineFormat.getJoinStyle();
        if (joinStyle == 1) {
            c12026yj.m56914h4(1);
        } else if (joinStyle != 2) {
            c12026yj.m56914h4(2);
        } else {
            c12026yj.m56914h4(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7712k4(C14365qy c14365qy, C11896dy c11896dy, C0962es c0962es, IEffectFormat iEffectFormat) {
        if (iEffectFormat == null || iEffectFormat.getInnerShadowEffect() == null) {
            return;
        }
        new lho(iEffectFormat.getInnerShadowEffect()).m64396k4(c14365qy.m69870wy(), c11896dy, c0962es, null, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7713k4(C14365qy c14365qy, C11896dy c11896dy, C0962es c0962es, azo azoVar, IEffectFormat iEffectFormat) {
        m7714k4(c14365qy, c11896dy, c0962es, azoVar, iEffectFormat, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7714k4(C14365qy c14365qy, C11896dy c11896dy, C0962es c0962es, azo azoVar, IEffectFormat iEffectFormat, boolean z) {
        if (iEffectFormat == null || iEffectFormat.getOuterShadowEffect() == null) {
            return;
        }
        nv2 nv2Var = new nv2(iEffectFormat.getOuterShadowEffect());
        nv2Var.m68229k4(true);
        nv2Var.m68227k4(c14365qy.m69870wy(), c11896dy, c0962es, azoVar, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m7715k4(C11896dy c11896dy, C12007ix c12007ix, C14365qy c14365qy, IThreeDFormat iThreeDFormat, IFillFormat iFillFormat, ILineFormat iLineFormat, C12003du c12003du, C12003du c12003du2) throws Throwable {
        C11896dy c11896dy2;
        C0962es c0962esM7684k4;
        azo azoVarM7718x1;
        if (iThreeDFormat == null) {
            return false;
        }
        try {
            if (ChartTypeCharacterizer.is3DChart(c14365qy.m69834fa().getType())) {
                return false;
            }
            C11896dy c11896dy3 = (C11896dy) c11896dy.deepClone();
            try {
                c11896dy3.m55528h4();
                c0962esM7684k4 = m7684k4(c12003du.Clone(), (FillFormat) iFillFormat, c14365qy, 1.0f, c11896dy3);
                azoVarM7718x1 = m7718x1(c12003du2.Clone(), (LineFormat) iLineFormat, c14365qy, 0.75f);
                c11896dy2 = c11896dy3;
            } catch (Throwable th) {
                th = th;
                c11896dy2 = c11896dy3;
            }
            try {
                boolean zM63136k4 = new C13662iv(2.0f).m63136k4(c14365qy, iThreeDFormat, c12007ix.Clone(), c0962esM7684k4, azoVarM7718x1, c11896dy2);
                c11896dy2.dispose();
                return zM63136k4;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (c11896dy2 == null) {
                    throw th3;
                }
                c11896dy2.dispose();
                throw th3;
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m7716k4(C12007ix c12007ix, C12007ix c12007ix2, C14365qy c14365qy, IThreeDFormat iThreeDFormat, IFillFormat iFillFormat, ILineFormat iLineFormat, C12003du c12003du, C12003du c12003du2) {
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55578x1(c12007ix.Clone());
            return m7715k4(c11896dy, c12007ix2.Clone(), c14365qy, iThreeDFormat, iFillFormat, iLineFormat, c12003du.Clone(), c12003du2.Clone());
        } finally {
            c11896dy.dispose();
        }
    }
}
