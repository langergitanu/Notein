package com.aspose.slides.internal.p532yu;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.t6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13213t6 extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44391yj = C7019kk.m27443k4((Class<?>) Float.TYPE);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44390ks = C7019kk.m27443k4((Class<?>) float[].class);

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 15;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: ix */
    public int mo60021ix() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44391yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44474du.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        float[] fArr = {0.0f};
        Exception exceptionM65088k4 = C13850af.m65088k4(str2, fArr);
        float f = fArr[0];
        if (exceptionM65088k4 != null) {
            return exceptionM65088k4;
        }
        RuntimeException runtimeExceptionMo60167k4 = AbstractC13279x6.f44474du.mo60167k4(f, (AbstractC12892ae) this);
        if (runtimeExceptionMo60167k4 != null) {
            return runtimeExceptionMo60167k4;
        }
        objArr[0] = Float.valueOf(f);
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return AbstractC13279x6.f44474du;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return C14064he.m66710k4(((Float) C7019kk.m27464to(obj, Float.TYPE)).floatValue(), obj2);
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44390ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        return C12985fh.m60623k4(c12943dd);
    }
}
