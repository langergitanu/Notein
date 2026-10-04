package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldType implements IFieldType {

    /* JADX INFO: renamed from: c5 */
    private static final FieldType f2240c5;

    /* JADX INFO: renamed from: ck */
    private static final FieldType f2241ck;

    /* JADX INFO: renamed from: du */
    private static final FieldType f2242du;

    /* JADX INFO: renamed from: dy */
    private static final FieldType f2243dy;

    /* JADX INFO: renamed from: fa */
    private static final FieldType f2244fa;

    /* JADX INFO: renamed from: h4 */
    private static final FieldType f2245h4;

    /* JADX INFO: renamed from: ix */
    private static final List<FieldType> f2246ix;

    /* JADX INFO: renamed from: jd */
    private static final FieldType f2247jd;

    /* JADX INFO: renamed from: ks */
    private static final FieldType f2249ks;

    /* JADX INFO: renamed from: m9 */
    private static final FieldType f2250m9;

    /* JADX INFO: renamed from: ne */
    private static final FieldType f2251ne;

    /* JADX INFO: renamed from: rv */
    private static final FieldType f2252rv;

    /* JADX INFO: renamed from: up */
    private static final FieldType f2254up;

    /* JADX INFO: renamed from: x6 */
    private static final FieldType f2256x6;

    /* JADX INFO: renamed from: yj */
    private static final FieldType f2257yj;

    /* JADX INFO: renamed from: k4 */
    private String f2258k4;

    /* JADX INFO: renamed from: x1 */
    private static final FieldType f2255x1 = new FieldType("slidenum");

    /* JADX INFO: renamed from: kk */
    private static final FieldType f2248kk = new FieldType("footer");

    /* JADX INFO: renamed from: to */
    private static final FieldType f2253to = new FieldType("header");

    static {
        FieldType fieldType = new FieldType("datetime");
        f2242du = fieldType;
        FieldType fieldType2 = new FieldType("datetime1");
        f2245h4 = fieldType2;
        FieldType fieldType3 = new FieldType("datetime2");
        f2250m9 = fieldType3;
        FieldType fieldType4 = new FieldType("datetime3");
        f2243dy = fieldType4;
        FieldType fieldType5 = new FieldType("datetime4");
        f2240c5 = fieldType5;
        FieldType fieldType6 = new FieldType("datetime5");
        f2247jd = fieldType6;
        FieldType fieldType7 = new FieldType("datetime6");
        f2241ck = fieldType7;
        FieldType fieldType8 = new FieldType("datetime7");
        f2244fa = fieldType8;
        FieldType fieldType9 = new FieldType("datetime8");
        f2254up = fieldType9;
        FieldType fieldType10 = new FieldType("datetime9");
        f2257yj = fieldType10;
        FieldType fieldType11 = new FieldType("datetime10");
        f2249ks = fieldType11;
        FieldType fieldType12 = new FieldType("datetime11");
        f2252rv = fieldType12;
        FieldType fieldType13 = new FieldType("datetime12");
        f2256x6 = fieldType13;
        FieldType fieldType14 = new FieldType("datetime13");
        f2251ne = fieldType14;
        List<FieldType> list = new List<>();
        f2246ix = list;
        list.addItem(fieldType);
        list.addItem(fieldType2);
        list.addItem(fieldType3);
        list.addItem(fieldType4);
        list.addItem(fieldType5);
        list.addItem(fieldType6);
        list.addItem(fieldType7);
        list.addItem(fieldType8);
        list.addItem(fieldType9);
        list.addItem(fieldType10);
        list.addItem(fieldType11);
        list.addItem(fieldType12);
        list.addItem(fieldType13);
        list.addItem(fieldType14);
    }

    public FieldType(String str) {
        this.f2258k4 = str;
    }

    public static FieldType getDateTime() {
        return f2242du;
    }

    public static FieldType getDateTime1() {
        return f2245h4;
    }

    public static FieldType getDateTime10() {
        return f2249ks;
    }

    public static FieldType getDateTime11() {
        return f2252rv;
    }

    public static FieldType getDateTime12() {
        return f2256x6;
    }

    public static FieldType getDateTime13() {
        return f2251ne;
    }

    public static FieldType getDateTime2() {
        return f2250m9;
    }

    public static FieldType getDateTime3() {
        return f2243dy;
    }

    public static FieldType getDateTime4() {
        return f2240c5;
    }

    public static FieldType getDateTime5() {
        return f2247jd;
    }

    public static FieldType getDateTime6() {
        return f2241ck;
    }

    public static FieldType getDateTime7() {
        return f2244fa;
    }

    public static FieldType getDateTime8() {
        return f2254up;
    }

    public static FieldType getDateTime9() {
        return f2257yj;
    }

    public static FieldType getFooter() {
        return f2248kk;
    }

    public static FieldType getHeader() {
        return f2253to;
    }

    public static FieldType getSlideNumber() {
        return f2255x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static List<FieldType> m1448k4() {
        return f2246ix;
    }

    public static boolean op_Equality(FieldType fieldType, FieldType fieldType2) {
        return C14067j2.m66729x1(fieldType, null) ? C14067j2.m66729x1(fieldType2, null) : fieldType.equals(fieldType2);
    }

    public static boolean op_Inequality(FieldType fieldType, FieldType fieldType2) {
        return C14067j2.m66729x1(fieldType, null) ? !C14067j2.m66729x1(fieldType2, null) : !fieldType.equals(fieldType2);
    }

    public boolean equals(Object obj) {
        if (obj == null || !C7019kk.m27469x1(obj, FieldType.class)) {
            return false;
        }
        return C14113y2.m67363du(this.f2258k4, ((FieldType) obj).f2258k4);
    }

    @Override // com.aspose.slides.IFieldType
    public final String getInternalString() {
        return this.f2258k4;
    }

    public int hashCode() {
        return this.f2258k4.hashCode();
    }

    @Override // com.aspose.slides.IFieldType
    public final void setInternalString(String str) {
        this.f2258k4 = str;
    }
}
