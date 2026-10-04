package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ak */
/* JADX INFO: loaded from: classes5.dex */
public class C12895ak extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f43415yj = C7019kk.m27443k4((Class<?>) byte[].class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f43414ks = C7019kk.m27443k4((Class<?>) byte[][].class);

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 27;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: ix */
    public int mo60021ix() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f43415yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44484h4.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        try {
            byte[] bArrM66934jd = C14080ne.m66934jd(str2);
            RuntimeException runtimeExceptionMo60132x1 = AbstractC13279x6.f44484h4.mo60132x1(bArrM66934jd, (AbstractC12892ae) this);
            if (runtimeExceptionMo60132x1 != null) {
                return runtimeExceptionMo60132x1;
            }
            objArr[0] = bArrM66934jd;
            return null;
        } catch (ArgumentException e) {
            return e;
        } catch (FormatException e2) {
            return e2;
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return AbstractC13279x6.f44484h4;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return 63;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: x1 */
    public int mo60034x1(Object obj, Object obj2) {
        return m61683k4((byte[]) C7019kk.m27458kk(obj, byte[].class), (byte[]) C7019kk.m27458kk(obj2, byte[].class));
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f43414ks;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        return C13069kn.m61061k4(c12943dd);
    }
}
