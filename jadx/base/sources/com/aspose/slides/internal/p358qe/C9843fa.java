package com.aspose.slides.internal.p358qe;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.TargetException;
import com.aspose.slides.exceptions.TargetInvocationException;
import com.aspose.slides.exceptions.TargetParameterCountException;
import com.aspose.slides.internal.p234ko.C5891k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.fa */
/* JADX INFO: loaded from: classes4.dex */
final class C9843fa extends AbstractC9847kk {

    /* JADX INFO: renamed from: du */
    private C9845jd[] f35637du;

    /* JADX INFO: renamed from: h4 */
    private int f35638h4 = m48538ne();

    /* JADX INFO: renamed from: kk */
    private final Constructor f35639kk;

    /* JADX INFO: renamed from: to */
    private final int f35640to;

    public C9843fa(Constructor constructor, int i) {
        this.f35639kk = constructor;
        this.f35640to = i;
    }

    /* JADX INFO: renamed from: ne */
    private int m48538ne() {
        int modifiers = this.f35639kk.getModifiers();
        int i = Modifier.isPublic(modifiers) ? 6 : 0;
        if (Modifier.isPrivate(modifiers)) {
            i |= 1;
        }
        if (Modifier.isProtected(modifiers)) {
            i |= 4;
        }
        return i | 4096;
    }

    /* JADX INFO: renamed from: x1 */
    private Object m48539x1(Object[] objArr) {
        try {
            this.f35639kk.setAccessible(true);
            return this.f35639kk.newInstance(objArr);
        } catch (Exception e) {
            throw new TargetInvocationException(e);
        }
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: c5 */
    public Type mo48524c5() {
        return null;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: du */
    public String mo48540du() {
        return m48535up() ? AbstractC9847kk.f35648x1 : AbstractC9847kk.f35647k4;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: dy */
    public Type[] mo48526dy() {
        return this.f35639kk.getGenericParameterTypes();
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: h4 */
    public C9845jd[] mo48528h4() {
        if (this.f35637du == null) {
            this.f35637du = C9845jd.m48556k4(this, this);
        }
        return this.f35637du;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: jd */
    public int mo48529jd() {
        return this.f35638h4;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9847kk
    /* JADX INFO: renamed from: k4 */
    public Object mo48541k4(int i, AbstractC9853x1 abstractC9853x1, Object[] objArr, C11697x1 c11697x1) {
        int length = this.f35639kk.getParameterTypes().length;
        int length2 = objArr != null ? objArr.length : 0;
        if (length != length2) {
            throw new TargetParameterCountException("parameters do not match signature");
        }
        if (length2 <= 0) {
            return m48539x1(objArr);
        }
        Object[] objArrM48537k4 = m48537k4(objArr, abstractC9853x1, i, c11697x1, this.f35639kk);
        Object objM48539x1 = m48539x1(objArrM48537k4);
        System.arraycopy(objArrM48537k4, 0, objArr, 0, length2);
        return objM48539x1;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: m9 */
    public C9845jd[] mo48533m9() {
        C9845jd[] c9845jdArrMo48528h4 = mo48528h4();
        if (c9845jdArrMo48528h4.length == 0) {
            return c9845jdArrMo48528h4;
        }
        C9845jd[] c9845jdArr = new C9845jd[c9845jdArrMo48528h4.length];
        AbstractC14092to.m67234k4(c9845jdArrMo48528h4, 0, c9845jdArr, 0, c9845jdArrMo48528h4.length);
        return c9845jdArr;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9849m9
    /* JADX INFO: renamed from: to */
    public AbstractC14068j5 mo48543to() {
        return C7019kk.m27443k4((Class<?>) this.f35639kk.getDeclaringClass());
    }

    /* JADX INFO: renamed from: x6 */
    public int m48544x6() {
        return this.f35640to;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9842dy
    /* JADX INFO: renamed from: k4 */
    public Object mo48530k4(Object obj, int i, AbstractC9853x1 abstractC9853x1, Object[] objArr, C11697x1 c11697x1) {
        if (obj != null) {
            throw new TargetException();
        }
        int length = this.f35639kk.getParameterTypes().length;
        int length2 = objArr != null ? objArr.length : 0;
        if (length != length2) {
            throw new TargetParameterCountException("parameters do not match signature");
        }
        if (length2 <= 0) {
            return m48539x1(null);
        }
        Object[] objArrM48537k4 = m48537k4(objArr, abstractC9853x1, i, c11697x1, this.f35639kk);
        Object objM48539x1 = m48539x1(objArrM48537k4);
        System.arraycopy(objArrM48537k4, 0, objArr, 0, length2);
        return objM48539x1;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9847kk
    /* JADX INFO: renamed from: k4 */
    public Constructor mo48542k4() {
        return this.f35639kk;
    }

    /* JADX INFO: renamed from: k4 */
    private Object[] m48537k4(Object[] objArr, AbstractC9853x1 abstractC9853x1, int i, C11697x1 c11697x1, Constructor constructor) {
        if (C5891k4.m23727k4(constructor, objArr)) {
            return objArr;
        }
        throw new ArgumentException();
    }
}
