package com.aspose.slides.internal.p449us;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p412t0.InterfaceC10804kk;
import com.aspose.slides.p559ms.System.C14113y2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.aspose.slides.internal.us.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11554k4 implements InterfaceC10804kk {

    /* JADX INFO: renamed from: k4 */
    private Object f39047k4;

    public C11554k4(String str) {
        try {
            this.f39047k4 = Class.forName("com.aspose.slides.externaltoolsproxyservice.ExternalToolsProxyServiceSoapClient").getDeclaredMethod("getObject", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private Object m54535k4(String str, Class[] clsArr, Object... objArr) {
        try {
            Method declaredMethod = this.f39047k4.getClass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(this.f39047k4, objArr);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return new Object();
        }
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: x1 */
    public final void mo52394x1(String str, String str2, int i, int i2, int i3, boolean z) {
        Class cls = Integer.TYPE;
        C3131h4.m13358k4(str2, (byte[]) m54535k4("convertPdf2Bmp", new Class[]{byte[].class, cls, cls, cls, Boolean.TYPE}, C3131h4.m13362m9(str), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z)));
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52389k4(String str) {
        m54535k4("verifyXpsConformance", new Class[]{byte[].class}, C3131h4.m13362m9(str));
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: x1 */
    public final boolean mo52395x1(String str) {
        return ((Boolean) m54535k4("checkPptPresentationByValidator", new Class[]{byte[].class}, C3131h4.m13362m9(str))).booleanValue();
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52390k4(String str, int i, String str2, int i2, boolean z) {
        Class cls = Integer.TYPE;
        C3131h4.m13358k4(str2, (byte[]) m54535k4("convertXps2Image", new Class[]{byte[].class, cls, cls, Boolean.TYPE}, C3131h4.m13362m9(str), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z)));
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52391k4(String str, String str2, int i, int i2, int i3) {
        byte[] bArrM13362m9 = C3131h4.m13362m9(str);
        Class cls = Integer.TYPE;
        C3131h4.m13358k4(str2, (byte[]) m54535k4("convertSwf2Image", new Class[]{byte[].class, cls, cls, cls}, bArrM13362m9, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52392k4(String str, String str2, int i, int i2, int i3, boolean z) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52393k4(String str, String str2, String str3) {
        Integer num = (Integer) m54535k4("verifyPdfCompliance", new Class[]{byte[].class, String.class, String.class}, C3131h4.m13362m9(str), str2, str3);
        if (num.intValue() != 0) {
            throw new InvalidOperationException(C14113y2.m67402k4("PDF file does not conform to {0}. \r\nFile: {1} \r\nValidator exit code: {2}. \r\nValidator message: {3}", str2, str, num, C14113y2.f47374k4));
        }
    }
}
