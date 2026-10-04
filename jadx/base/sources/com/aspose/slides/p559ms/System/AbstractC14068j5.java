package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.TypeLoadException;
import com.aspose.slides.internal.p314oc.C7015du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p358qe.AbstractC9839c5;
import com.aspose.slides.internal.p358qe.AbstractC9847kk;
import com.aspose.slides.internal.p358qe.AbstractC9849m9;
import com.aspose.slides.internal.p358qe.AbstractC9853x1;
import com.aspose.slides.internal.p358qe.C9840ck;
import com.aspose.slides.internal.p358qe.C9844h4;
import com.aspose.slides.internal.p358qe.C9846k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.huawei.hms.network.embedded.C18416x7;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.j5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14068j5 extends AbstractC9849m9 {

    /* JADX INFO: renamed from: m9 */
    private static AbstractC9853x1 f47257m9;

    /* JADX INFO: renamed from: du */
    private static final AbstractC14068j5 f47253du = C7019kk.m27443k4((Class<?>) AbstractC14079na.class);

    /* JADX INFO: renamed from: h4 */
    private static final AbstractC14068j5 f47254h4 = C7019kk.m27443k4((Class<?>) AbstractC14106wy.class);

    /* JADX INFO: renamed from: k4 */
    public static char f47255k4 = FilenameUtils.EXTENSION_SEPARATOR;

    /* JADX INFO: renamed from: x1 */
    public static AbstractC14068j5[] f47259x1 = new AbstractC14068j5[0];

    /* JADX INFO: renamed from: kk */
    public static final Object f47256kk = C7019kk.m27443k4((Class<?>) Object.class);

    /* JADX INFO: renamed from: to */
    public static final Object f47258to = C7019kk.m27443k4((Class<?>) Class.class);

    /* JADX INFO: renamed from: bz */
    public static AbstractC9853x1 m66730bz() {
        if (f47257m9 == null) {
            f47257m9 = new C9844h4();
        }
        return f47257m9;
    }

    /* JADX INFO: renamed from: to */
    public static int m66733to(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            return 0;
        }
        return abstractC14068j5.m66743e0();
    }

    /* JADX INFO: renamed from: ak */
    public boolean m66737ak() {
        return !m66758v4();
    }

    /* JADX INFO: renamed from: ar */
    public boolean m66738ar() {
        return (m66755u4() & 7) == 5;
    }

    /* JADX INFO: renamed from: b3 */
    public boolean m66739b3() {
        return mo48615h4();
    }

    /* JADX INFO: renamed from: bv */
    public boolean m66740bv() {
        return (m66755u4() & 32) == 32;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract AbstractC14068j5 mo48611c5();

    /* JADX INFO: renamed from: c6 */
    public boolean m66741c6() {
        return mo48628up();
    }

    /* JADX INFO: renamed from: ck */
    public abstract int mo48612ck();

    /* JADX INFO: renamed from: dq */
    public boolean m66742dq() {
        return false;
    }

    /* JADX INFO: renamed from: dy */
    public AbstractC14068j5[] mo48613dy() {
        throw new NotSupportedException("Derived classes must provide an implementation.");
    }

    /* JADX INFO: renamed from: e0 */
    public int m66743e0() {
        Class clsMo48624ks = mo48624ks();
        if (clsMo48624ks.equals(Boolean.class) || clsMo48624ks.equals(Boolean.TYPE)) {
            return 3;
        }
        if (clsMo48624ks.equals(Character.class) || clsMo48624ks.equals(Character.TYPE)) {
            return 4;
        }
        if (clsMo48624ks.equals(Byte.class) || clsMo48624ks.equals(Byte.TYPE)) {
            return 6;
        }
        if (clsMo48624ks.equals(Short.class) || clsMo48624ks.equals(Short.TYPE)) {
            return 7;
        }
        if (clsMo48624ks.equals(Integer.class) || clsMo48624ks.equals(Integer.TYPE)) {
            return 9;
        }
        if (clsMo48624ks.equals(C14060gf.class)) {
            return 12;
        }
        if (clsMo48624ks.equals(Long.class) || clsMo48624ks.equals(Long.TYPE)) {
            return 11;
        }
        if (clsMo48624ks.equals(C14046bv.class)) {
            return 15;
        }
        if (clsMo48624ks.equals(Double.class) || clsMo48624ks.equals(Double.TYPE)) {
            return 14;
        }
        if (clsMo48624ks.equals(Float.class) || clsMo48624ks.equals(Float.TYPE)) {
            return 13;
        }
        if (clsMo48624ks.equals(C14084qq.class)) {
            return 16;
        }
        return clsMo48624ks.equals(String.class) ? 18 : 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC14068j5) && m66751kk((AbstractC14068j5) obj);
    }

    /* JADX INFO: renamed from: fa */
    public abstract boolean mo48614fa();

    /* JADX INFO: renamed from: h4 */
    public abstract boolean mo48615h4();

    public int hashCode() {
        AbstractC14068j5 abstractC14068j5Mo48616ix = mo48616ix();
        return abstractC14068j5Mo48616ix != this ? abstractC14068j5Mo48616ix.hashCode() : super.hashCode();
    }

    /* JADX INFO: renamed from: ix */
    public abstract AbstractC14068j5 mo48616ix();

    /* JADX INFO: renamed from: jd */
    public int mo48617jd() {
        throw new InvalidOperationException("Derived classes must provide an implementation.");
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC9839c5 mo48618k4(String str, int i, AbstractC9853x1 abstractC9853x1, int i2, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr);

    /* JADX INFO: renamed from: k4 */
    public AbstractC9839c5 m66744k4(String str, AbstractC14068j5[] abstractC14068j5Arr) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (abstractC14068j5Arr == null) {
            throw new ArgumentNullException("types");
        }
        for (AbstractC14068j5 abstractC14068j5 : abstractC14068j5Arr) {
            if (abstractC14068j5 == null) {
                throw new ArgumentNullException("types");
            }
        }
        return mo48618k4(str, 28, null, 3, abstractC14068j5Arr, null);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC9847kk mo48619k4(int i, AbstractC9853x1 abstractC9853x1, int i2, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC14068j5 mo48620k4();

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC14068j5 mo48621k4(String str, boolean z);

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo48622k4(String str, int i, AbstractC9853x1 abstractC9853x1, Object obj, Object[] objArr, C9840ck[] c9840ckArr, C11697x1 c11697x1, String[] strArr);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC9839c5[] mo48623k4(int i);

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo48569kk() {
        return this;
    }

    /* JADX INFO: renamed from: ks */
    public abstract Class mo48624ks();

    /* JADX INFO: renamed from: lr */
    public boolean m66752lr() {
        AbstractC14068j5 abstractC14068j5;
        mo48624ks();
        AbstractC14068j5 abstractC14068j52 = f47253du;
        return !(this == abstractC14068j52 || this == (abstractC14068j5 = f47254h4) || (!m66749k4(abstractC14068j52) && !m66749k4(abstractC14068j5))) || m66762xk();
    }

    /* JADX INFO: renamed from: m9 */
    public boolean mo48625m9() {
        return false;
    }

    /* JADX INFO: renamed from: ne */
    public abstract String mo48626ne();

    /* JADX INFO: renamed from: qq */
    public boolean m66753qq() {
        return (m66755u4() & 7) == 2;
    }

    /* JADX INFO: renamed from: rv */
    public abstract C9846k4 mo48627rv();

    public String toString() {
        return mo48629x6();
    }

    /* JADX INFO: renamed from: ts */
    public AbstractC14068j5 m66754ts() {
        throw new NotSupportedException("Derived classes must provide an implementation.");
    }

    /* JADX INFO: renamed from: u4 */
    public int m66755u4() {
        return mo48612ck();
    }

    /* JADX INFO: renamed from: um */
    public boolean m66756um() {
        return (m66755u4() & 32) == 0 && !m66758v4();
    }

    /* JADX INFO: renamed from: up */
    public abstract boolean mo48628up();

    /* JADX INFO: renamed from: uz */
    public boolean m66757uz() {
        return mo48543to() != null;
    }

    /* JADX INFO: renamed from: v4 */
    public boolean m66758v4() {
        return m66752lr();
    }

    /* JADX INFO: renamed from: wl */
    public boolean m66759wl() {
        return (m66755u4() & 7) == 1;
    }

    /* JADX INFO: renamed from: wy */
    public boolean m66760wy() {
        return false;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: x1 */
    public int mo48521x1() {
        return 32;
    }

    /* JADX INFO: renamed from: x6 */
    public abstract String mo48629x6();

    /* JADX INFO: renamed from: xk */
    public boolean m66762xk() {
        return mo48614fa();
    }

    /* JADX INFO: renamed from: yd */
    public boolean m66763yd() {
        return m66749k4(f47254h4);
    }

    /* JADX INFO: renamed from: yj */
    public abstract AbstractC14068j5[] mo48630yj();

    /* JADX INFO: renamed from: kk */
    public static AbstractC14068j5 m66732kk(String str) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC14068j5 m66735x1(String str) {
        return m66736x1(str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC9847kk m66745k4(int i, AbstractC9853x1 abstractC9853x1, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr) {
        if (abstractC14068j5Arr == null) {
            throw new ArgumentNullException("types");
        }
        for (AbstractC14068j5 abstractC14068j5 : abstractC14068j5Arr) {
            if (abstractC14068j5 == null) {
                throw new ArgumentNullException("types");
            }
        }
        return mo48619k4(i, abstractC9853x1, 3, abstractC14068j5Arr, c9840ckArr);
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: to */
    public AbstractC14068j5 mo48543to() {
        return this;
    }

    /* JADX INFO: renamed from: to */
    private static String m66734to(String str) {
        return str.equals("System.String") ? "java.lang.String" : str.equals("System.Boolean") ? "java.lang.Boolean" : (str.equals("System.Byte") || str.equals("System.SByte")) ? "java.lang.Byte" : str.equals("System.Char") ? "java.lang.Character" : str.equals("System.Double") ? "java.lang.Double" : str.equals("System.Single") ? "java.lang.Float" : str.equals("System.Int32") ? "java.lang.Integer" : str.equals("System.Int64") ? "java.lang.Long" : str.equals("System.Int16") ? "java.lang.Short" : str.equals("System.Object") ? "java.lang.Object" : str.startsWith("System.") ? "com.aspose.slides.ms.".concat(str) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static AbstractC14068j5 m66736x1(String str, boolean z) {
        try {
            return C7019kk.m27443k4(Class.forName(str));
        } catch (ClassNotFoundException unused) {
            try {
                String strM66734to = m66734to(C14113y2.m67414k4(str, ',')[0]);
                C7015du c7015du = new C7015du(null);
                return C7019kk.m27443k4((C14113y2.m67359c5(strM66734to, C18416x7.f56644n) && m66731k4(strM66734to, (C7015du<Class>) c7015du)) ? (Class) c7015du.f19072k4 : Class.forName(strM66734to));
            } catch (ClassNotFoundException unused2) {
                if (z) {
                    throw new TypeLoadException(C14113y2.m67402k4("Type '{0}' is not found", str));
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC9847kk m66746k4(AbstractC14068j5[] abstractC14068j5Arr) {
        return m66745k4(20, null, abstractC14068j5Arr, null);
    }

    /* JADX INFO: renamed from: kk */
    public boolean m66751kk(AbstractC14068j5 abstractC14068j5) {
        return mo48624ks().equals(abstractC14068j5.mo48624ks());
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 m66747k4(String str) {
        return mo48621k4(str, false);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m66761x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            return false;
        }
        if (abstractC14068j5.m66751kk(this) || abstractC14068j5.m66749k4(this)) {
            return true;
        }
        if (!m66740bv() || abstractC14068j5.m66747k4(mo48540du()) == null) {
            return abstractC14068j5.m66739b3() && m66739b3() && abstractC14068j5.mo48611c5().m66751kk(mo48611c5()) && abstractC14068j5.mo48617jd() == mo48617jd();
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public Object m66748k4(String str, int i, AbstractC9853x1 abstractC9853x1, Object obj, Object[] objArr) {
        return mo48622k4(str, i, abstractC9853x1, obj, objArr, null, null, null);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m66749k4(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException(C18437z2.f56754h);
        }
        for (AbstractC14068j5 abstractC14068j5Mo48620k4 = mo48620k4(); abstractC14068j5Mo48620k4 != null; abstractC14068j5Mo48620k4 = abstractC14068j5Mo48620k4.mo48620k4()) {
            if (abstractC14068j5Mo48620k4.m66751kk(abstractC14068j5)) {
                return true;
            }
        }
        return abstractC14068j5.m66751kk(C7019kk.m27443k4((Class<?>) Object.class)) && !abstractC14068j5.m66751kk(this);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m66750k4(Object obj) {
        AbstractC14068j5 abstractC14068j5M27443k4 = C7019kk.m27443k4(obj.getClass());
        if (m66756um()) {
            while (abstractC14068j5M27443k4 != null) {
                if (abstractC14068j5M27443k4.m66751kk(this)) {
                    return true;
                }
                abstractC14068j5M27443k4 = abstractC14068j5M27443k4.mo48620k4();
            }
        } else if (m66740bv() && abstractC14068j5M27443k4.m66747k4(mo48540du()) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static boolean m66731k4(String str, C7015du<Class> c7015du) {
        E e;
        if (C14113y2.m67363du(str, "byte[]")) {
            e = byte[].class;
        } else if (C14113y2.m67363du(str, "Byte[]")) {
            e = Byte[].class;
        } else if (C14113y2.m67363du(str, "boolean[]")) {
            e = boolean[].class;
        } else if (C14113y2.m67363du(str, "Boolean[]")) {
            e = Boolean[].class;
        } else if (C14113y2.m67363du(str, "char[]")) {
            e = char[].class;
        } else if (C14113y2.m67363du(str, "Character[]")) {
            e = Character[].class;
        } else if (C14113y2.m67363du(str, "short[]")) {
            e = short[].class;
        } else if (C14113y2.m67363du(str, "Short[]")) {
            e = Short[].class;
        } else if (C14113y2.m67363du(str, "int[]")) {
            e = int[].class;
        } else if (C14113y2.m67363du(str, "Integer[]")) {
            e = Integer[].class;
        } else if (C14113y2.m67363du(str, "long[]")) {
            e = long[].class;
        } else if (C14113y2.m67363du(str, "Long[]")) {
            e = Long[].class;
        } else if (C14113y2.m67363du(str, "float[]")) {
            e = float[].class;
        } else if (C14113y2.m67363du(str, "Float[]")) {
            e = Float[].class;
        } else if (C14113y2.m67363du(str, "double[]")) {
            e = double[].class;
        } else if (C14113y2.m67363du(str, "Double[]")) {
            e = Double[].class;
        } else {
            if (!C14113y2.m67363du(str, "Object[]")) {
                return false;
            }
            e = Object[].class;
        }
        c7015du.f19072k4 = e;
        return true;
    }
}
