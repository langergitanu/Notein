package com.aspose.slides.internal.p358qe;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.AmbiguousMatchException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p234ko.C5891k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.yj */
/* JADX INFO: loaded from: classes4.dex */
class C9855yj extends AbstractC14068j5 {

    /* JADX INFO: renamed from: c5 */
    private final int f35677c5;

    /* JADX INFO: renamed from: du */
    private final Class f35678du;

    /* JADX INFO: renamed from: dy */
    private final AbstractC14068j5 f35679dy;

    /* JADX INFO: renamed from: h4 */
    private final Class f35680h4;

    /* JADX INFO: renamed from: jd */
    private C9848ks f35681jd;

    /* JADX INFO: renamed from: m9 */
    private final AbstractC14068j5 f35682m9;

    public C9855yj(Class cls) {
        this.f35678du = cls;
        boolean zIsPrimitive = cls.isPrimitive();
        Class clsM23725k4 = zIsPrimitive ? C5891k4.m23725k4(cls) : cls;
        this.f35680h4 = clsM23725k4;
        this.f35682m9 = zIsPrimitive ? C7019kk.m27443k4((Class<?>) clsM23725k4) : this;
        this.f35677c5 = m48599g8();
        this.f35679dy = cls.getDeclaringClass() != null ? C7019kk.m27443k4(cls.getDeclaringClass()) : null;
    }

    /* JADX INFO: renamed from: g8 */
    private int m48599g8() {
        int modifiers = this.f35680h4.getModifiers();
        int i = this.f35680h4.isInterface() ? 32 : 0;
        if (Modifier.isAbstract(modifiers) && !this.f35680h4.isInterface()) {
            i |= 128;
        }
        if (Modifier.isFinal(modifiers)) {
            i |= 256;
        }
        return this.f35680h4.getDeclaringClass() != null ? Modifier.isPublic(modifiers) ? i | 2 : Modifier.isPrivate(modifiers) ? i | 3 : Modifier.isProtected(modifiers) ? i | 4 : i | 5 : Modifier.isPublic(modifiers) ? i | 1 : i;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m48600k4(boolean z, boolean z2, boolean z3) {
        int i = z ? 16 : 32;
        return z2 ? z3 ? i | 74 : i | 6 : z3 ? i | 8 : i | 4;
    }

    /* JADX INFO: renamed from: qm */
    private C9848ks m48609qm() {
        if (this.f35681jd == null) {
            this.f35681jd = new C9848ks(this.f35680h4);
        }
        return this.f35681jd;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC9839c5[] m48610x1(String str, int i, int i2, AbstractC14068j5[] abstractC14068j5Arr, boolean z) {
        String[] strArr = {str};
        boolean[] zArr = {false};
        boolean[] zArr2 = {false};
        int[] iArr = {0};
        m48601k4(i, strArr, z, zArr, zArr2, iArr);
        String str2 = strArr[0];
        boolean z2 = zArr[0];
        boolean z3 = zArr2[0];
        int i3 = iArr[0];
        List list = new List();
        List<C9852up> listM48576x1 = m48609qm().m48576x1(i3, str2);
        int i4 = i ^ 2;
        for (int i5 = 0; i5 < listM48576x1.size(); i5++) {
            C9852up c9852up = listM48576x1.get_Item(i5);
            if ((c9852up.m48595u4() & i4) == c9852up.m48595u4() && m48604k4(c9852up, i4, i2, abstractC14068j5Arr) && (!z2 || m48606k4(c9852up, str2, z3))) {
                list.addItem(c9852up);
            }
        }
        return (AbstractC9839c5[]) list.toArray(new AbstractC9839c5[0]);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: c5 */
    public AbstractC14068j5 mo48611c5() {
        if (this.f35680h4.isArray()) {
            return C7019kk.m27443k4(this.f35680h4.getComponentType());
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: ck */
    public int mo48612ck() {
        return this.f35677c5;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: du */
    public String mo48540du() {
        return mo48624ks().getSimpleName();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: dy */
    public AbstractC14068j5[] mo48613dy() {
        return super.mo48613dy();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: fa */
    public boolean mo48614fa() {
        return C5891k4.m23732x1(this.f35680h4) != null;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: h4 */
    public boolean mo48615h4() {
        return this.f35680h4.isArray() || AbstractC14092to.class.isAssignableFrom(this.f35680h4);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: ix */
    public AbstractC14068j5 mo48616ix() {
        return this.f35682m9;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: jd */
    public int mo48617jd() {
        if (!this.f35680h4.isArray()) {
            throw new ArgumentException();
        }
        int i = 0;
        for (Class<?> componentType = this.f35680h4; componentType.isArray(); componentType = componentType.getComponentType()) {
            i++;
        }
        return i;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5, com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo48569kk() {
        return mo48543to();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: ks */
    public Class mo48624ks() {
        return this.f35678du;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: m9 */
    public boolean mo48625m9() {
        return this.f35680h4.getTypeParameters().length > 0;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: ne */
    public String mo48626ne() {
        return mo48624ks().getPackage().getName();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: rv */
    public C9846k4 mo48627rv() {
        return C9846k4.m48566k4();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5, com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: to */
    public AbstractC14068j5 mo48543to() {
        return this.f35679dy;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: up */
    public boolean mo48628up() {
        if (super.m66739b3() || super.m66742dq()) {
            return true;
        }
        return super.m66737ak();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: x6 */
    public String mo48629x6() {
        return mo48624ks().getName();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: yj */
    public AbstractC14068j5[] mo48630yj() {
        List<C9855yj> listM48575kk = m48609qm().m48575kk(0, null);
        AbstractC14068j5[] abstractC14068j5Arr = new AbstractC14068j5[listM48575kk.size()];
        for (int i = 0; i < listM48575kk.size(); i++) {
            abstractC14068j5Arr[i] = listM48575kk.get_Item(i);
        }
        return abstractC14068j5Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC9839c5 mo48618k4(String str, int i, AbstractC9853x1 abstractC9853x1, int i2, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr) {
        AbstractC9842dy abstractC9842dyM48548k4;
        AbstractC9839c5[] abstractC9839c5ArrM48610x1 = m48610x1(str, i, i2, abstractC14068j5Arr, false);
        if (abstractC9839c5ArrM48610x1.length == 0) {
            return null;
        }
        if (abstractC14068j5Arr == null || abstractC14068j5Arr.length == 0) {
            if (abstractC9839c5ArrM48610x1.length == 1) {
                return abstractC9839c5ArrM48610x1[0];
            }
            if (abstractC14068j5Arr == null) {
                for (int i3 = 1; i3 < abstractC9839c5ArrM48610x1.length; i3++) {
                    if (!C9844h4.m48550k4(abstractC9839c5ArrM48610x1[i3], abstractC9839c5ArrM48610x1[0])) {
                        throw new AmbiguousMatchException("Ambiguous match found.");
                    }
                }
                abstractC9842dyM48548k4 = C9844h4.m48548k4(abstractC9839c5ArrM48610x1, abstractC9839c5ArrM48610x1.length);
            } else {
                if (abstractC9853x1 == null) {
                    abstractC9853x1 = AbstractC14068j5.m66730bz();
                }
                abstractC9842dyM48548k4 = abstractC9853x1.mo48554k4(i, abstractC9839c5ArrM48610x1, abstractC14068j5Arr, c9840ckArr);
            }
        }
        return (AbstractC9839c5) C7019kk.m27452k4((Object) abstractC9842dyM48548k4, AbstractC9839c5.class);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: k4 */
    public AbstractC9847kk mo48619k4(int i, AbstractC9853x1 abstractC9853x1, int i2, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr) {
        C9845jd[] c9845jdArrMo48528h4;
        AbstractC9847kk[] abstractC9847kkArrM48608k4 = m48608k4((String) null, i, 3, abstractC14068j5Arr, false);
        if (abstractC9853x1 == null) {
            abstractC9853x1 = AbstractC14068j5.m66730bz();
        }
        if (abstractC9847kkArrM48608k4.length == 0) {
            return null;
        }
        if (abstractC14068j5Arr.length == 0 && abstractC9847kkArrM48608k4.length == 1 && ((c9845jdArrMo48528h4 = abstractC9847kkArrM48608k4[0].mo48528h4()) == null || c9845jdArrMo48528h4.length == 0)) {
            return abstractC9847kkArrM48608k4[0];
        }
        return (AbstractC9847kk) C7019kk.m27452k4((Object) ((65536 & i) != 0 ? C9844h4.m48549k4(abstractC9847kkArrM48608k4, abstractC14068j5Arr, c9840ckArr) : abstractC9853x1.mo48554k4(i, abstractC9847kkArrM48608k4, abstractC14068j5Arr, c9840ckArr)), AbstractC9847kk.class);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo48620k4() {
        if (this.f35680h4.getSuperclass() != null) {
            return C7019kk.m27443k4((Class<?>) this.f35680h4.getSuperclass());
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo48621k4(String str, boolean z) {
        if (str == null) {
            throw new ArgumentNullException();
        }
        int i = z ? 49 : 48;
        String[] strArr = {""};
        String[] strArr2 = {""};
        m48603k4(str, strArr, strArr2);
        String str2 = strArr2[0];
        int[] iArr = {0};
        m48602k4(i, strArr, new boolean[]{z}, iArr);
        String str3 = strArr[0];
        List<C9855yj> listM48575kk = m48609qm().m48575kk(iArr[0], str3);
        C9855yj c9855yj = null;
        for (int i2 = 0; i2 < listM48575kk.size(); i2++) {
            C9855yj c9855yj2 = listM48575kk.get_Item(i2);
            if (m48607k4((AbstractC14068j5) c9855yj2, i, str3, false, str2)) {
                if (c9855yj != null) {
                    throw new AmbiguousMatchException("Ambiguous match found.");
                }
                c9855yj = c9855yj2;
            }
        }
        return c9855yj;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: k4 */
    public Object mo48622k4(String str, int i, AbstractC9853x1 abstractC9853x1, Object obj, Object[] objArr, C9840ck[] c9840ckArr, C11697x1 c11697x1, String[] strArr) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m48601k4(int i, String[] strArr, boolean z, boolean[] zArr, boolean[] zArr2, int[] iArr) {
        zArr[0] = false;
        zArr2[0] = false;
        String str = strArr[0];
        if (str == null) {
            iArr[0] = 0;
            return;
        }
        if ((i & 1) != 0) {
            strArr[0] = C14113y2.m67398k4(str, C11697x1.m55250kk());
            zArr2[0] = true;
            iArr[0] = 2;
        } else {
            iArr[0] = 1;
        }
        if (z && C14113y2.m67449x1(strArr[0], C18358t1.g.f56183c, (short) 4)) {
            String str2 = strArr[0];
            strArr[0] = OooO0OO.OooO00o(1, 0, str2, str2);
            zArr[0] = true;
            iArr[0] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m48602k4(int i, String[] strArr, boolean[] zArr, int[] iArr) {
        m48601k4(i, strArr, false, new boolean[]{false}, zArr, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m48603k4(String str, String[] strArr, String[] strArr2) {
        strArr[0] = null;
        strArr2[0] = null;
        if (str != null) {
            int iM67420kk = C14113y2.m67420kk(str, ".", (short) 4);
            if (iM67420kk != -1) {
                strArr2[0] = C14113y2.m67443x1(str, 0, iM67420kk);
                int length = (str.length() - strArr2[0].length()) - 1;
                if (length != 0) {
                    strArr[0] = C14113y2.m67443x1(str, iM67420kk + 1, length);
                    return;
                } else {
                    strArr[0] = "";
                    return;
                }
            }
            strArr[0] = str;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48604k4(AbstractC9842dy abstractC9842dy, int i, int i2, AbstractC14068j5[] abstractC14068j5Arr) {
        if ((i2 & 3) == 0) {
            if ((i2 & 2) != 0 && (abstractC9842dy.mo48525ck() & 2) == 0) {
                return false;
            }
            if ((i2 & 1) != 0 && (abstractC9842dy.mo48525ck() & 1) == 0) {
                return false;
            }
        }
        if (abstractC14068j5Arr != null) {
            C9845jd[] c9845jdArrMo48528h4 = abstractC9842dy.mo48528h4();
            if (abstractC14068j5Arr.length != c9845jdArrMo48528h4.length) {
                if ((i & 13056) == 0) {
                    return false;
                }
                if (abstractC14068j5Arr.length <= c9845jdArrMo48528h4.length ? !((262144 & i) != 0 && c9845jdArrMo48528h4[abstractC14068j5Arr.length].m48563kk()) : (abstractC9842dy.mo48525ck() & 2) == 0) {
                    if (c9845jdArrMo48528h4.length == 0 || abstractC14068j5Arr.length < c9845jdArrMo48528h4.length - 1) {
                        return false;
                    }
                    c9845jdArrMo48528h4[c9845jdArrMo48528h4.length - 1].m48561k4().m66739b3();
                    return false;
                }
            } else if ((65536 & i) != 0 && (i & 256) == 0) {
                for (int i3 = 0; i3 < c9845jdArrMo48528h4.length; i3++) {
                    if (abstractC14068j5Arr[i3] != null && c9845jdArrMo48528h4[i3].m48561k4() != abstractC14068j5Arr[i3]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48605k4(AbstractC9849m9 abstractC9849m9, int i, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        if (z) {
            if ((i & 16) == 0) {
                return false;
            }
        } else if ((i & 32) == 0) {
            return false;
        }
        boolean z5 = abstractC9849m9.mo48543to() != abstractC9849m9.mo48569kk();
        int i2 = i & 2;
        if (i2 != 0 && z5) {
            return false;
        }
        if (abstractC9849m9.mo48521x1() != 32 && abstractC9849m9.mo48521x1() != 128) {
            if (z3) {
                if (((i & 64) == 0 && z5) || (i & 8) == 0) {
                    return false;
                }
            } else if ((i & 4) == 0) {
                return false;
            }
        }
        if (z4) {
            if (!m48606k4(abstractC9849m9, str, (i & 1) != 0)) {
                return false;
            }
        }
        if (i2 == 0 && z5 && z2 && (i & 32) != 0 && !z3 && (i & 4) != 0) {
            AbstractC9839c5 abstractC9839c5 = (AbstractC9839c5) C7019kk.m27452k4((Object) abstractC9849m9, AbstractC9839c5.class);
            if (abstractC9839c5 == null) {
                return false;
            }
            if (!abstractC9839c5.m48536yj() && !abstractC9839c5.m48532ks()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48606k4(AbstractC9849m9 abstractC9849m9, String str, boolean z) {
        String strMo48540du = abstractC9849m9.mo48540du();
        return z ? C14113y2.m67412k4(C14113y2.m67398k4(strMo48540du, C11697x1.m55250kk()), str, (short) 4) : C14113y2.m67412k4(strMo48540du, str, (short) 4);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48607k4(AbstractC14068j5 abstractC14068j5, int i, String str, boolean z, String str2) {
        if (m48605k4(abstractC14068j5, i, abstractC14068j5.m66753qq() || abstractC14068j5.m66759wl(), abstractC14068j5.m66738ar(), false, str, z)) {
            return str2 == null || abstractC14068j5.mo48626ne().equals(str2);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14068j5
    /* JADX INFO: renamed from: k4 */
    public AbstractC9839c5[] mo48623k4(int i) {
        return m48610x1(null, i, 3, null, false);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC9847kk[] m48608k4(String str, int i, int i2, AbstractC14068j5[] abstractC14068j5Arr, boolean z) {
        String[] strArr = {str};
        boolean[] zArr = {false};
        boolean[] zArr2 = {false};
        int[] iArr = {0};
        m48601k4(i, strArr, z, zArr, zArr2, iArr);
        String str2 = strArr[0];
        boolean z2 = zArr[0];
        boolean z3 = zArr2[0];
        int i3 = iArr[0];
        List list = new List();
        List<C9843fa> listM48574k4 = m48609qm().m48574k4(i3, str2);
        int i4 = i ^ 2;
        for (int i5 = 0; i5 < listM48574k4.size(); i5++) {
            C9843fa c9843fa = listM48574k4.get_Item(i5);
            if ((c9843fa.m48544x6() & i4) == c9843fa.m48544x6() && m48604k4(c9843fa, i4, i2, abstractC14068j5Arr) && (!z2 || m48606k4(c9843fa, str2, z3))) {
                list.addItem(c9843fa);
            }
        }
        return (AbstractC9847kk[]) list.toArray(new AbstractC9847kk[0]);
    }
}
