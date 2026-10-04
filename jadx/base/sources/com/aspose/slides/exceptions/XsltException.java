package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p241kx.C5998k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
public class XsltException extends SystemException {

    /* JADX INFO: renamed from: du */
    private String f4921du;

    /* JADX INFO: renamed from: k4 */
    private String f4922k4;

    /* JADX INFO: renamed from: kk */
    private int f4923kk;

    /* JADX INFO: renamed from: to */
    private int f4924to;

    /* JADX INFO: renamed from: x1 */
    private String f4925x1;

    public XsltException() {
        this(C14113y2.f47374k4, null);
    }

    public static XsltException create(String str, String... strArr) {
        return new XsltException(str, strArr, null, 0, 0, null);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m5749k4(String str, String... strArr) {
        String strM24229k4 = C5998k4.m24229k4(str);
        return (strM24229k4 == null || strArr == null) ? strM24229k4 : C14113y2.m67391k4(C11697x1.m55250kk(), strM24229k4, strArr);
    }

    public int getLineNumber() {
        return this.f4923kk;
    }

    public int getLinePosition() {
        return this.f4924to;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f4921du;
        return str == null ? super.getMessage() : str;
    }

    public String getSourceUri() {
        return this.f4925x1;
    }

    public XsltException(String str) {
        this(str, null);
    }

    public static XsltException create(String str, String[] strArr, Exception exception) {
        return new XsltException(str, strArr, null, 0, 0, exception);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m5750k4(String str, String[] strArr, String str2, int i, int i2) {
        try {
            String strM5749k4 = m5749k4(str, strArr);
            return ("XSLT compile error at {0}({1},{2}). See InnerException for details.".equals(str) || i == 0) ? strM5749k4 : C14113y2.m67400k4(strM5749k4, C14113y2.m67408k4(" ", m5749k4("An error occurred at {0}({1},{2}).", str2, C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()), C14057f9.m66586k4(i2, (InterfaceC14073kp) C11697x1.m55250kk()))));
        } catch (MissingManifestResourceException unused) {
            return C14113y2.m67408k4("UNKNOWN(", str, ")");
        }
    }

    public XsltException(String str, RuntimeException runtimeException) {
        this("{0}", new String[]{str}, null, 0, 0, runtimeException);
    }

    public XsltException(String str, String[] strArr, String str2, int i, int i2, RuntimeException runtimeException) {
        super(m5750k4(str, strArr, str2, i, i2), runtimeException);
        setHResult(-2146231998);
        this.f4922k4 = str;
        this.f4925x1 = str2;
        this.f4923kk = i;
        this.f4924to = i2;
    }
}
