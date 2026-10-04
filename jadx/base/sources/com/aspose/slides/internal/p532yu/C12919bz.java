package com.aspose.slides.internal.p532yu;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.bz */
/* JADX INFO: loaded from: classes5.dex */
public class C12919bz extends C12904b3 {

    /* JADX INFO: renamed from: rv */
    private int f43479rv;

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f43478yj = C7019kk.m27443k4((Class<?>) C14084qq.class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f43477ks = C7019kk.m27443k4((Class<?>) C14084qq[].class);

    public C12919bz(int i) {
        this.f43479rv = i;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 18;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: ix */
    public int mo60021ix() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f43478yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44499m9.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        C13333zs c13333zs = new C13333zs();
        C13333zs[] c13333zsArr = {c13333zs};
        boolean zM61923k4 = C13333zs.m61923k4(str2, this.f43479rv, c13333zsArr);
        c13333zsArr[0].CloneTo(c13333zs);
        if (!zM61923k4) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str2, C14042ak.m66410k4(C13212t1.class, this.f43479rv)));
        }
        C14084qq c14084qqClone = C14084qq.f47299x1.Clone();
        try {
            C13333zs.m61918k4(c13333zs).CloneTo(c14084qqClone);
            RuntimeException runtimeExceptionMo60174x1 = AbstractC13279x6.f44499m9.mo60174x1(c14084qqClone.Clone(), (AbstractC12892ae) this);
            if (runtimeExceptionMo60174x1 != null) {
                return runtimeExceptionMo60174x1;
            }
            c14084qqClone.CloneTo((C14084qq) objArr[0]);
            return null;
        } catch (ArgumentException e) {
            return e;
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return AbstractC13279x6.f44499m9;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        C14084qq c14084qqClone = ((C14084qq) C7019kk.m27464to(obj, C14084qq.class)).Clone();
        C14084qq c14084qqClone2 = ((C14084qq) C7019kk.m27464to(obj2, C14084qq.class)).Clone();
        if (c14084qqClone.m67127du() != 0 && c14084qqClone2.m67127du() != 0) {
            c14084qqClone.m67151uz().CloneTo(c14084qqClone);
            c14084qqClone2 = c14084qqClone2.m67151uz();
        }
        return c14084qqClone.compareTo(c14084qqClone2.Clone());
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f43477ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        return C13099m8.m61160k4(c12943dd);
    }
}
