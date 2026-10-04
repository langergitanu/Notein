package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13968ri;

/* JADX INFO: loaded from: classes3.dex */
public class XPathException extends SystemException {

    /* JADX INFO: renamed from: k4 */
    private String f4903k4;

    /* JADX INFO: renamed from: kk */
    private String f4904kk;

    /* JADX INFO: renamed from: x1 */
    private String[] f4905x1;

    public XPathException() {
        this(C14113y2.f47374k4, (RuntimeException) null);
    }

    public static XPathException create(String str) {
        return new XPathException(str, (String[]) C7019kk.m27458kk((Object) null, String[].class));
    }

    /* JADX INFO: renamed from: k4 */
    private static String m5746k4(String str, String[] strArr) {
        try {
            String strM65819k4 = C13968ri.m65819k4(str, strArr);
            return strM65819k4 == null ? C14113y2.m67408k4("UNKNOWN(", str, ")") : strM65819k4;
        } catch (MissingManifestResourceException unused) {
            return C14113y2.m67408k4("UNKNOWN(", str, ")");
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f4904kk;
        return str == null ? super.getMessage() : str;
    }

    public XPathException(String str) {
        this(str, (RuntimeException) null);
    }

    public static XPathException create(String str, String str2) {
        return new XPathException(str, new String[]{str2});
    }

    public XPathException(String str, RuntimeException runtimeException) {
        this("{0}", new String[]{str}, runtimeException);
    }

    public static XPathException create(String str, String str2, RuntimeException runtimeException) {
        return new XPathException(str, new String[]{str2}, runtimeException);
    }

    private XPathException(String str, String[] strArr) {
        this(str, strArr, null);
    }

    public static XPathException create(String str, String str2, String str3) {
        return new XPathException(str, new String[]{str2, str3});
    }

    private XPathException(String str, String[] strArr, RuntimeException runtimeException) {
        super(m5746k4(str, strArr), runtimeException);
        setHResult(-2146231997);
        this.f4903k4 = str;
        this.f4905x1 = strArr;
    }
}
