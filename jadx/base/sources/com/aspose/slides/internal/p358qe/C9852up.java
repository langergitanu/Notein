package com.aspose.slides.internal.p358qe;

import com.aspose.slides.exceptions.TargetInvocationException;
import com.aspose.slides.exceptions.TargetParameterCountException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7021to;
import com.aspose.slides.internal.p314oc.InterfaceC7022x1;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18115b5;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.up */
/* JADX INFO: loaded from: classes4.dex */
final class C9852up extends AbstractC9839c5 {

    /* JADX INFO: renamed from: c5 */
    boolean f35665c5;

    /* JADX INFO: renamed from: du */
    C9845jd f35667du;

    /* JADX INFO: renamed from: dy */
    boolean f35668dy;

    /* JADX INFO: renamed from: k4 */
    final Method f35671k4;

    /* JADX INFO: renamed from: m9 */
    boolean f35673m9;

    /* JADX INFO: renamed from: to */
    C9845jd[] f35674to;

    /* JADX INFO: renamed from: x1 */
    final int f35675x1;

    /* JADX INFO: renamed from: h4 */
    AbstractC9839c5 f35669h4 = null;

    /* JADX INFO: renamed from: jd */
    boolean f35670jd = false;

    /* JADX INFO: renamed from: ck */
    private String f35666ck = m48592qq();

    /* JADX INFO: renamed from: kk */
    final int f35672kk = m48590ar();

    public C9852up(Method method, int i) {
        this.f35671k4 = method;
        this.f35675x1 = i;
    }

    /* JADX INFO: renamed from: ar */
    private int m48590ar() {
        int modifiers = this.f35671k4.getModifiers();
        int i = Modifier.isPublic(modifiers) ? 6 : 0;
        if (Modifier.isPrivate(modifiers)) {
            i |= 1;
        }
        if (Modifier.isProtected(modifiers)) {
            i |= 4;
        }
        if (Modifier.isStatic(modifiers)) {
            i |= 16;
        }
        if (m48593um()) {
            i |= 2048;
        }
        if (Modifier.isFinal(modifiers)) {
            i |= 32;
        }
        return Modifier.isAbstract(modifiers) ? i | 1024 : i;
    }

    /* JADX INFO: renamed from: qq */
    private String m48592qq() {
        String name = this.f35671k4.getName();
        InterfaceC7021to interfaceC7021to = (InterfaceC7021to) this.f35671k4.getAnnotation(InterfaceC7021to.class);
        if (interfaceC7021to != null) {
            String strM27470k4 = interfaceC7021to.m27470k4();
            name = C14113y2.m67401k4(name, strM27470k4, C18115b5.CONNECTOR + strM27470k4);
        }
        InterfaceC7022x1 interfaceC7022x1 = (InterfaceC7022x1) this.f35671k4.getAnnotation(InterfaceC7022x1.class);
        if (interfaceC7022x1 == null) {
            return name;
        }
        return C14113y2.m67443x1(name, 0, 4) + interfaceC7022x1.m27471k4();
    }

    /* JADX INFO: renamed from: um */
    private boolean m48593um() {
        String strMo48540du = mo48540du();
        if (strMo48540du.length() < 5) {
            return false;
        }
        this.f35673m9 = C14113y2.m67448x1(strMo48540du, "get_");
        this.f35668dy = C14113y2.m67448x1(strMo48540du, "set_");
        this.f35665c5 = C14113y2.m67448x1(strMo48540du, "add_");
        boolean zM67448x1 = C14113y2.m67448x1(strMo48540du, "remove_");
        this.f35670jd = zM67448x1;
        return this.f35673m9 || this.f35668dy || this.f35665c5 || zM67448x1;
    }

    /* JADX INFO: renamed from: x1 */
    private Object m48594x1(Object obj, Object[] objArr) {
        try {
            return this.f35671k4.invoke(obj, objArr);
        } catch (Exception e) {
            throw new TargetInvocationException(e.getMessage(), e);
        }
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: c5 */
    public Type mo48524c5() {
        return this.f35671k4.getGenericReturnType();
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: ck */
    public int mo48525ck() {
        return super.mo48525ck();
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: du */
    public String mo48540du() {
        return this.f35666ck;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: dy */
    public Type[] mo48526dy() {
        return this.f35671k4.getGenericParameterTypes();
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: h4 */
    public C9845jd[] mo48528h4() {
        m48596uz();
        return this.f35674to;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9839c5
    /* JADX INFO: renamed from: ix */
    public C9845jd mo48518ix() {
        m48597wl();
        return this.f35667du;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: jd */
    public int mo48529jd() {
        return this.f35672kk;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9839c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC9839c5 mo48519k4() {
        if (this.f35669h4 == null) {
            C9852up c9852up = this;
            for (AbstractC14068j5 abstractC14068j5Mo48620k4 = mo48543to().mo48620k4(); abstractC14068j5Mo48620k4 != null && !abstractC14068j5Mo48620k4.m66740bv(); abstractC14068j5Mo48620k4 = abstractC14068j5Mo48620k4.mo48620k4()) {
                Class<?>[] parameterTypes = this.f35671k4.getParameterTypes();
                int length = parameterTypes.length;
                AbstractC14068j5[] abstractC14068j5Arr = new AbstractC14068j5[length];
                for (int i = 0; i < length; i++) {
                    abstractC14068j5Arr[i] = C7019kk.m27443k4(parameterTypes[i]);
                }
                AbstractC9839c5 abstractC9839c5M66744k4 = abstractC14068j5Mo48620k4.m66744k4(mo48540du(), abstractC14068j5Arr);
                if (abstractC9839c5M66744k4 != null) {
                    c9852up = abstractC9839c5M66744k4;
                }
            }
            this.f35669h4 = c9852up;
        }
        return this.f35669h4;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo48569kk() {
        return null;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: m9 */
    public C9845jd[] mo48533m9() {
        m48596uz();
        C9845jd[] c9845jdArr = this.f35674to;
        if (c9845jdArr.length == 0) {
            return c9845jdArr;
        }
        C9845jd[] c9845jdArr2 = new C9845jd[c9845jdArr.length];
        AbstractC14092to.m67234k4(c9845jdArr, 0, c9845jdArr2, 0, c9845jdArr.length);
        return c9845jdArr2;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9839c5
    /* JADX INFO: renamed from: ne */
    public AbstractC14068j5 mo48520ne() {
        return mo48518ix().m48561k4();
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: to */
    public AbstractC14068j5 mo48543to() {
        return C7019kk.m27443k4(this.f35671k4.getDeclaringClass());
    }

    /* JADX INFO: renamed from: u4 */
    public int m48595u4() {
        return this.f35675x1;
    }

    /* JADX INFO: renamed from: uz */
    public C9845jd[] m48596uz() {
        if (this.f35674to == null) {
            this.f35674to = C9845jd.m48556k4(this, this);
        }
        return this.f35674to;
    }

    /* JADX INFO: renamed from: wl */
    public C9845jd m48597wl() {
        if (this.f35667du == null) {
            this.f35667du = C9845jd.m48558x1(this, this);
        }
        return this.f35667du;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9839c5
    /* JADX INFO: renamed from: x6 */
    public Method mo48522x6() {
        return this.f35671k4;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: k4 */
    public Object mo48530k4(Object obj, int i, AbstractC9853x1 abstractC9853x1, Object[] objArr, C11697x1 c11697x1) {
        int length = this.f35671k4.getParameterTypes().length;
        int length2 = objArr != null ? objArr.length : 0;
        if (length != length2) {
            throw new TargetParameterCountException("parameters do not match signature");
        }
        if (length2 <= 0) {
            return m48594x1(obj, null);
        }
        Object[] objArrM48591k4 = m48591k4(objArr, abstractC9853x1, i, c11697x1, this.f35671k4);
        Object objM48594x1 = m48594x1(obj, objArrM48591k4);
        System.arraycopy(objArrM48591k4, 0, objArr, 0, length2);
        return objM48594x1;
    }

    /* JADX INFO: renamed from: k4 */
    private Object[] m48591k4(Object[] objArr, AbstractC9853x1 abstractC9853x1, int i, C11697x1 c11697x1, Method method) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (objArr[i2] == null && C7019kk.m27443k4(parameterTypes[i2]).m66758v4()) {
                objArr[i2] = C7019kk.m27467x1((Class) parameterTypes[i2]);
            }
        }
        return objArr;
    }
}
