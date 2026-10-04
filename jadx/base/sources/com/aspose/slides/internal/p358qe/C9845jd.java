package com.aspose.slides.internal.p358qe;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C9845jd {

    /* JADX INFO: renamed from: du */
    private int f35641du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC14068j5 f35642k4;

    /* JADX INFO: renamed from: kk */
    private String f35643kk;

    /* JADX INFO: renamed from: to */
    private int f35644to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC9849m9 f35645x1;

    public C9845jd() {
    }

    /* JADX INFO: renamed from: k4 */
    public static C9845jd m48555k4(Type type, AbstractC9842dy abstractC9842dy, int i) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return new C9845jd(C7019kk.m27443k4((Class<?>) cls), abstractC9842dy, cls.getName(), i, 0);
        }
        try {
            return m48555k4(((ParameterizedType) type).getRawType(), abstractC9842dy, i);
        } catch (Exception unused) {
            throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: du */
    public int m48559du() {
        return this.f35644to;
    }

    /* JADX INFO: renamed from: h4 */
    public Annotation[] m48560h4() {
        AbstractC9849m9 abstractC9849m9M48564to = m48564to();
        int i = 0;
        if (abstractC9849m9M48564to instanceof AbstractC9839c5) {
            AbstractC9839c5 abstractC9839c5 = (AbstractC9839c5) abstractC9849m9M48564to;
            C9845jd[] c9845jdArrMo48533m9 = abstractC9839c5.mo48533m9();
            int length = c9845jdArrMo48533m9.length;
            int i2 = 0;
            while (i < length && !c9845jdArrMo48533m9[i].equals(this)) {
                i2++;
                i++;
            }
            return abstractC9839c5.mo48522x6().getParameterAnnotations()[i2];
        }
        if (!(abstractC9849m9M48564to instanceof AbstractC9847kk)) {
            return null;
        }
        AbstractC9847kk abstractC9847kk = (AbstractC9847kk) abstractC9849m9M48564to;
        C9845jd[] c9845jdArrMo48533m92 = abstractC9847kk.mo48533m9();
        int length2 = c9845jdArrMo48533m92.length;
        int i3 = 0;
        while (i < length2 && !c9845jdArrMo48533m92[i].equals(this)) {
            i3++;
            i++;
        }
        return abstractC9847kk.mo48542k4().getParameterAnnotations()[i3];
    }

    /* JADX INFO: renamed from: kk */
    public boolean m48563kk() {
        return (m48565x1() & 16) != 0;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC9849m9 m48564to() {
        return this.f35645x1;
    }

    /* JADX INFO: renamed from: x1 */
    public int m48565x1() {
        return this.f35641du;
    }

    public C9845jd(AbstractC14068j5 abstractC14068j5, AbstractC9849m9 abstractC9849m9, String str, int i, int i2) {
        this.f35642k4 = abstractC14068j5;
        this.f35645x1 = abstractC9849m9;
        this.f35643kk = str;
        this.f35644to = i;
        this.f35641du = i2;
    }

    /* JADX INFO: renamed from: x1 */
    public static C9845jd m48558x1(AbstractC9842dy abstractC9842dy, AbstractC9849m9 abstractC9849m9) {
        C9845jd[] c9845jdArr = {null};
        m48557k4(abstractC9842dy, c9845jdArr, true);
        return c9845jdArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 m48561k4() {
        return this.f35642k4;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m48562k4(AbstractC14068j5 abstractC14068j5, boolean z) {
        return C9851to.m48589x1(this, abstractC14068j5);
    }

    /* JADX INFO: renamed from: k4 */
    public static C9845jd[] m48556k4(AbstractC9842dy abstractC9842dy, AbstractC9849m9 abstractC9849m9) {
        return m48557k4(abstractC9842dy, new C9845jd[]{null}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9845jd[] m48557k4(AbstractC9842dy abstractC9842dy, C9845jd[] c9845jdArr, boolean z) {
        int i;
        C9845jd[] c9845jdArr2;
        Type[] typeArrMo48526dy = abstractC9842dy.mo48526dy();
        int i2 = 0;
        if (abstractC9842dy instanceof AbstractC9847kk) {
            AbstractC14068j5 abstractC14068j5Mo48543to = abstractC9842dy.mo48543to();
            i = (!abstractC14068j5Mo48543to.m66757uz() || Modifier.isStatic(abstractC14068j5Mo48543to.mo48624ks().getModifiers())) ? 0 : 1;
        }
        Type typeMo48524c5 = abstractC9842dy.mo48524c5();
        if (z) {
            c9845jdArr2 = null;
        } else {
            int length = typeArrMo48526dy.length;
            if (i != 0) {
                length--;
            }
            c9845jdArr2 = new C9845jd[length];
        }
        if (z) {
            c9845jdArr[0] = m48555k4(typeMo48524c5, abstractC9842dy, 0);
            return c9845jdArr2;
        }
        int length2 = typeArrMo48526dy.length;
        while (i < length2) {
            c9845jdArr2[i2] = m48555k4(typeArrMo48526dy[i], abstractC9842dy, i2);
            i++;
            i2++;
        }
        return c9845jdArr2;
    }
}
