package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.es */
/* JADX INFO: loaded from: classes3.dex */
class C0962es implements IGenericCloneable<C0962es>, Cloneable {

    /* JADX INFO: renamed from: du */
    private C12003du f4862du;

    /* JADX INFO: renamed from: dy */
    private boolean f4863dy;

    /* JADX INFO: renamed from: h4 */
    private C12003du f4864h4;

    /* JADX INFO: renamed from: k4 */
    protected byte f4865k4;

    /* JADX INFO: renamed from: kk */
    protected IImageTransformOCollectionEffectiveData f4866kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f4867m9;

    /* JADX INFO: renamed from: to */
    protected ajz f4868to;

    /* JADX INFO: renamed from: x1 */
    protected C6921dy f4869x1;

    public C0962es() {
        this(C12003du.f40505to.Clone());
        this.f4865k4 = (byte) 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static b2l m5657k4(ajz ajzVar, IPatternFormat iPatternFormat, boolean z) {
        return new b2l(ajzVar, ((ColorFormat) iPatternFormat.getForeColor()).m1086x1(ajzVar.f3912du).m69339k4().Clone(), ((ColorFormat) iPatternFormat.getBackColor()).m1086x1(ajzVar.f3912du).m69339k4().Clone(), iPatternFormat.getPatternStyle(), z);
    }

    /* JADX INFO: renamed from: x1 */
    public static C0962es m5669x1(ajz ajzVar, FillFormat fillFormat) {
        return fillFormat == null ? new C0962es(ajzVar) : fillFormat.getFillType() != -1 ? m5659k4(ajzVar, fillFormat) : new C0962es(C12003du.m56385i5().Clone(), ajzVar);
    }

    /* JADX INFO: renamed from: c5 */
    public Object m5671c5() {
        try {
            C0962es c0962es = (C0962es) super.clone();
            C12003du c12003du = this.f4862du;
            if (c12003du != null) {
                c0962es.f4862du = c12003du.Clone();
            }
            C12003du c12003du2 = this.f4864h4;
            if (c12003du2 != null) {
                c0962es.f4864h4 = c12003du2.Clone();
            }
            return c0962es;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: du */
    public final C6921dy m5672du() {
        return this.f4869x1;
    }

    /* JADX INFO: renamed from: dy */
    public final C0962es m5673dy() {
        C0962es c0962es = (C0962es) m5671c5();
        c0962es.f4865k4 = (byte) 1;
        return c0962es;
    }

    /* JADX INFO: renamed from: h4 */
    public final ajz m5674h4() {
        return this.f4868to;
    }

    /* JADX INFO: renamed from: kk */
    public final IImageTransformOCollectionEffectiveData m5679kk() {
        return this.f4866kk;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public final C0962es cloneT() {
        return (C0962es) m5671c5();
    }

    /* JADX INFO: renamed from: to */
    public final byte m5681to() {
        byte b = this.f4865k4;
        if (b != -1) {
            return b;
        }
        return (byte) 0;
    }

    public C0962es(ajz ajzVar) {
        this("_default");
        this.f4868to = ajzVar;
    }

    /* JADX INFO: renamed from: x1 */
    public static C0962es m5670x1(ajz ajzVar, C14176nc c14176nc) {
        byte fillType = c14176nc.getFillType();
        if (fillType == -1) {
            return new C0962es(ajzVar);
        }
        if (fillType == 0) {
            return m5658k4(ajzVar);
        }
        if (fillType == 1) {
            return new C0962es(c14176nc.m67938m9().Clone(), ajzVar);
        }
        if (fillType == 2) {
            C13787ln c13787ln = (C13787ln) c14176nc.getGradientFormat();
            return c13787ln.getGradientStops().size() == 1 ? new C0962es(((GradientStopEffectiveData) c13787ln.getGradientStops().get_Item(0)).m1634k4().Clone(), ajzVar) : new C14478sy(ajzVar, c13787ln);
        }
        if (fillType != 3) {
            return fillType != 4 ? new C0962es(ajzVar) : new cxj(ajzVar, (qxi) c14176nc.getPictureFillFormat());
        }
        IPatternFormatEffectiveData patternFormat = c14176nc.getPatternFormat();
        n9i n9iVar = (n9i) patternFormat;
        return new b2l(ajzVar, n9iVar.m67907x1().Clone(), n9iVar.m67905kk().Clone(), patternFormat.getPatternStyle(), false);
    }

    /* JADX INFO: renamed from: k4 */
    public final C0962es m5675k4(IShapeFrame iShapeFrame) {
        return cloneT();
    }

    public C0962es(C12003du c12003du) {
        this("_default");
        this.f4867m9 = true;
        c12003du.CloneTo(this.f4862du);
        this.f4865k4 = (byte) 1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C0962es m5658k4(ajz ajzVar) {
        C0962es c0962es = new C0962es(ajzVar);
        c0962es.f4865k4 = (byte) 0;
        return c0962es;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m5682x1() {
        return this.f4863dy ? this.f4864h4 : C12003du.m56385i5().Clone();
    }

    private C0962es(C12003du c12003du, ajz ajzVar) {
        this(ajzVar);
        this.f4867m9 = true;
        c12003du.CloneTo(this.f4862du);
        this.f4865k4 = (byte) 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C0962es m5659k4(ajz ajzVar, FillFormat fillFormat) {
        byte fillType;
        if (fillFormat != null && (fillType = fillFormat.getFillType()) != -1) {
            if (fillType == 0) {
                return m5658k4(ajzVar);
            }
            if (fillType == 1) {
                return new C0962es(((ColorFormat) fillFormat.getSolidFillColor()).m1086x1(ajzVar.f3912du).m69339k4().Clone().Clone(), ajzVar);
            }
            if (fillType == 2) {
                GradientFormat gradientFormat = (GradientFormat) fillFormat.getGradientFormat();
                if (gradientFormat == null) {
                    return new C0962es(ajzVar);
                }
                return new C14478sy(ajzVar, gradientFormat, fillFormat.getRotateWithShape() == 0);
            }
            if (fillType == 3) {
                return m5657k4(ajzVar, fillFormat.getPatternFormat(), fillFormat.getRotateWithShape() == 0);
            }
            if (fillType != 4) {
                return new C0962es(ajzVar);
            }
            return new cxj(ajzVar, (PictureFillFormat) fillFormat.getPictureFillFormat(), fillFormat.getRotateWithShape() == 0);
        }
        return new C0962es(ajzVar);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5683x1(C12003du c12003du) {
        this.f4863dy = true;
        c12003du.CloneTo(this.f4864h4);
    }

    private C0962es(String str) {
        this.f4862du = new C12003du();
        this.f4864h4 = new C12003du();
        this.f4867m9 = false;
        this.f4863dy = false;
        this.f4865k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C0962es m5660k4(ajz ajzVar, IFillFormatEffectiveData iFillFormatEffectiveData, byte b, EffectFormat effectFormat) {
        if (b == 0) {
            throw new ArgumentException();
        }
        byte fillType = iFillFormatEffectiveData.getFillType();
        if (fillType == -1) {
            return new C0962es(ajzVar);
        }
        if (fillType == 0) {
            return m5658k4(ajzVar);
        }
        if (fillType == 1) {
            C12003du c12003duClone = ((C14176nc) iFillFormatEffectiveData).m67938m9().Clone();
            if (m5668k4(b)) {
                m5666k4(c12003duClone.Clone(), b).CloneTo(c12003duClone);
            }
            return new C0962es(c12003duClone.Clone(), ajzVar);
        }
        if (fillType == 2) {
            return new C14478sy(ajzVar, (C13787ln) iFillFormatEffectiveData.getGradientFormat(), b, !iFillFormatEffectiveData.getRotateWithShape());
        }
        if (fillType != 3) {
            return fillType != 4 ? new C0962es(ajzVar) : new cxj(ajzVar, (qxi) iFillFormatEffectiveData.getPictureFillFormat(), b, effectFormat, !iFillFormatEffectiveData.getRotateWithShape());
        }
        IPatternFormatEffectiveData patternFormat = iFillFormatEffectiveData.getPatternFormat();
        n9i n9iVar = (n9i) patternFormat;
        C12003du c12003duClone2 = n9iVar.m67907x1().Clone();
        C12003du c12003duClone3 = n9iVar.m67905kk().Clone();
        if (m5668k4(b)) {
            m5666k4(c12003duClone2.Clone(), b).CloneTo(c12003duClone2);
            m5666k4(c12003duClone3.Clone(), b).CloneTo(c12003duClone3);
        }
        return new b2l(ajzVar, c12003duClone2.Clone(), c12003duClone3.Clone(), patternFormat.getPatternStyle(), !iFillFormatEffectiveData.getRotateWithShape());
    }

    /* JADX INFO: renamed from: k4 */
    public static C0962es m5661k4(ajz ajzVar, IFillParamSource iFillParamSource) {
        if (C7019kk.m27469x1(iFillParamSource, FillFormat.class)) {
            return m5659k4(ajzVar, (FillFormat) iFillParamSource);
        }
        if (C7019kk.m27469x1(iFillParamSource, C0888da.class)) {
            return m5664k4(ajzVar, ((C0888da) iFillParamSource).f4563k4);
        }
        if (iFillParamSource == null) {
            return new C0962es(ajzVar);
        }
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: k4 */
    public static C0962es m5662k4(ajz ajzVar, LineFillFormat lineFillFormat) {
        byte fillType;
        if (lineFillFormat != null && (fillType = lineFillFormat.getFillType()) != -1) {
            if (fillType == 0) {
                return m5658k4(ajzVar);
            }
            if (fillType == 1) {
                return new C0962es(((ColorFormat) lineFillFormat.getSolidFillColor()).m1086x1(ajzVar.f3912du).m69339k4().Clone().Clone(), ajzVar);
            }
            if (fillType != 2) {
                return fillType != 3 ? new C0962es(ajzVar) : m5657k4(ajzVar, lineFillFormat.getPatternFormat(), false);
            }
            IGradientFormat gradientFormat = lineFillFormat.getGradientFormat();
            return gradientFormat.getGradientStops().size() < 2 ? new C0962es(((ColorFormat) lineFillFormat.getSolidFillColor()).m1084to().Clone(), ajzVar) : new C14478sy(ajzVar, gradientFormat);
        }
        return new C0962es(ajzVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static C0962es m5663k4(ajz ajzVar, erk erkVar) {
        byte fillType = erkVar.getFillType();
        if (fillType == -1) {
            return new C0962es(ajzVar);
        }
        if (fillType == 0) {
            return m5658k4(ajzVar);
        }
        if (fillType == 1) {
            return new C0962es(erkVar.m5654x1().Clone(), ajzVar);
        }
        if (fillType == 2) {
            C13787ln c13787ln = (C13787ln) erkVar.getGradientFormat();
            return c13787ln.getGradientStops().size() == 1 ? new C0962es(((GradientStopEffectiveData) c13787ln.getGradientStops().get_Item(0)).m1634k4().Clone(), ajzVar) : new C14478sy(ajzVar, c13787ln, 0);
        }
        if (fillType != 3) {
            return new C0962es(ajzVar);
        }
        IPatternFormatEffectiveData patternFormat = erkVar.getPatternFormat();
        n9i n9iVar = (n9i) patternFormat;
        return new b2l(ajzVar, n9iVar.m67907x1().Clone(), n9iVar.m67905kk().Clone(), patternFormat.getPatternStyle(), false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C0962es m5664k4(ajz ajzVar, C14176nc c14176nc) {
        qxi qxiVar;
        if (c14176nc == null) {
            return new C0962es(ajzVar);
        }
        byte fillType = c14176nc.getFillType();
        if (fillType == 0) {
            return m5658k4(ajzVar);
        }
        if (fillType == 1) {
            return new C0962es(c14176nc.m67938m9().Clone(), ajzVar);
        }
        if (fillType == 2) {
            C13787ln c13787ln = (C13787ln) c14176nc.getGradientFormat();
            return c13787ln == null ? new C0962es(ajzVar) : new C14478sy(ajzVar, c13787ln, !c14176nc.getRotateWithShape());
        }
        if (fillType == 3) {
            IPatternFormatEffectiveData patternFormat = c14176nc.getPatternFormat();
            n9i n9iVar = (n9i) patternFormat;
            return new b2l(ajzVar, n9iVar.m67907x1().Clone(), n9iVar.m67905kk().Clone(), patternFormat.getPatternStyle(), !c14176nc.getRotateWithShape());
        }
        if (fillType == 4 && (qxiVar = (qxi) c14176nc.getPictureFillFormat()) != null) {
            return new cxj(ajzVar, qxiVar, !c14176nc.getRotateWithShape());
        }
        return new C0962es(ajzVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11902kk m5665k4(SortedList<Float, C12003du> sortedList) {
        int i;
        int i2;
        if (sortedList == null) {
            return null;
        }
        int size = sortedList.size();
        if (sortedList.getKeys().get_Item(0).floatValue() > 0.0f) {
            i = size + 1;
            i2 = 1;
        } else {
            i = size;
            i2 = 0;
        }
        int i3 = size - 1;
        if (sortedList.getKeys().get_Item(i3).floatValue() < 1.0f) {
            i++;
        }
        C11902kk c11902kk = new C11902kk(i);
        if (i2 > 0) {
            c11902kk.m55669x1()[0] = 0.0f;
            sortedList.getValues().get_Item(0).CloneTo(c11902kk.m55668k4()[0]);
        }
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = i2 + i4;
            c11902kk.m55669x1()[i5] = sortedList.getKeys().get_Item(i4).floatValue();
            sortedList.getValues().get_Item(i4).CloneTo(c11902kk.m55668k4()[i5]);
        }
        int i6 = i2 + size;
        if (i6 < i) {
            c11902kk.m55669x1()[i6] = 1.0f;
            sortedList.getValues().get_Item(i3).CloneTo(c11902kk.m55668k4()[i6]);
        }
        return c11902kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m5676k4() {
        return this.f4867m9 ? this.f4862du : C12003du.m56385i5().Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m5666k4(C12003du c12003du, byte b) {
        int iM56501c5;
        int iM56507jd;
        int iM56502ck;
        int iM56505fa;
        int i;
        int iM56505fa2;
        if (b == 2) {
            iM56501c5 = c12003du.m56501c5() & 255;
            iM56507jd = 255 - (((255 - (c12003du.m56507jd() & 255)) * 6) / 10);
            iM56502ck = 255 - (((255 - (c12003du.m56502ck() & 255)) * 6) / 10);
            iM56505fa = (255 - (c12003du.m56505fa() & 255)) * 6;
        } else {
            if (b != 3) {
                if (b == 4) {
                    iM56501c5 = c12003du.m56501c5() & 255;
                    iM56507jd = ((c12003du.m56507jd() & 255) * 6) / 10;
                    iM56502ck = ((c12003du.m56502ck() & 255) * 6) / 10;
                    iM56505fa2 = (c12003du.m56505fa() & 255) * 6;
                } else {
                    if (b != 5) {
                        return c12003du;
                    }
                    iM56501c5 = c12003du.m56501c5() & 255;
                    iM56507jd = ((c12003du.m56507jd() & 255) * 8) / 10;
                    iM56502ck = ((c12003du.m56502ck() & 255) * 8) / 10;
                    iM56505fa2 = (c12003du.m56505fa() & 255) * 8;
                }
                i = iM56505fa2 / 10;
                return C12003du.m56398k4(iM56501c5, iM56507jd, iM56502ck, i);
            }
            iM56501c5 = c12003du.m56501c5() & 255;
            iM56507jd = 255 - (((255 - (c12003du.m56507jd() & 255)) * 8) / 10);
            iM56502ck = 255 - (((255 - (c12003du.m56502ck() & 255)) * 8) / 10);
            iM56505fa = (255 - (c12003du.m56505fa() & 255)) * 8;
        }
        i = 255 - (iM56505fa / 10);
        return C12003du.m56398k4(iM56501c5, iM56507jd, iM56502ck, i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [double, int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r4v0, types: [double, int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, java.lang.StringBuffer] */
    /* JADX INFO: renamed from: k4 */
    public static C12007ix m5667k4(C12007ix c12007ix) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12007ix.m56571to())), 14);
        float f = iM27462to;
        float fM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12007ix.m56554dy())), 14);
        return new C12007ix(f, fM27462to, ((float) StringBuffer.append((int) c12007ix.m56556h4())) - f, ((float) StringBuffer.append((int) c12007ix.m56558k4())) - fM27462to);
    }

    /* JADX INFO: renamed from: k4 */
    public final short m5677k4(float f) {
        short sM27468x1 = C7019kk.m27468x1(Float.valueOf(f + 90.0f), 13);
        return sM27468x1 < 0 ? (short) (sM27468x1 + 360) : sM27468x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5678k4(C12003du c12003du) {
        this.f4867m9 = true;
        c12003du.CloneTo(this.f4862du);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5668k4(byte b) {
        return b == 4 || b == 5 || b == 2 || b == 3;
    }
}
