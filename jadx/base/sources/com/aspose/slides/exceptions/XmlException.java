package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p205ji.C5459ks;
import com.aspose.slides.internal.p205ji.C5475yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.C14022y4;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9;

/* JADX INFO: loaded from: classes3.dex */
public class XmlException extends SystemException {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f4906m9 = new C7017h4("sourceUri", "version");

    /* JADX INFO: renamed from: du */
    private String f4907du;

    /* JADX INFO: renamed from: h4 */
    private String f4908h4;

    /* JADX INFO: renamed from: k4 */
    private String f4909k4;

    /* JADX INFO: renamed from: kk */
    private int f4910kk;

    /* JADX INFO: renamed from: to */
    private int f4911to;

    /* JADX INFO: renamed from: x1 */
    private String[] f4912x1;

    public XmlException() {
        this(null);
    }

    public static String[] buildCharExceptionArgs(char c, char c2) {
        String[] strArr = new String[2];
        if (C14022y4.m66321k4((int) c) && c2 != 0) {
            int iM66317k4 = C14022y4.m66317k4(c2, c);
            strArr[0] = C14113y2.m67405k4(new char[]{c, c2});
            strArr[1] = C14113y2.m67391k4(C11697x1.m55250kk(), "0x{0:X2}", Integer.valueOf(iM66317k4));
            return strArr;
        }
        if (c == 0) {
            strArr[0] = ".";
        } else {
            strArr[0] = C14117yj.m67528k4(c, (InterfaceC14073kp) C11697x1.m55250kk());
        }
        strArr[1] = C14113y2.m67391k4(C11697x1.m55250kk(), "0x{0:X2}", Integer.valueOf(c));
        return strArr;
    }

    public static boolean isCatchableException(RuntimeException runtimeException) {
        return (C7019kk.m27469x1(runtimeException, OverflowException.class) || C7019kk.m27469x1(runtimeException, OutOfMemoryException.class) || C7019kk.m27469x1(runtimeException, C5475yj.class) || C7019kk.m27469x1(runtimeException, C5459ks.class) || C7019kk.m27469x1(runtimeException, NullReferenceException.class) || C7019kk.m27469x1(runtimeException, AccessViolationException.class)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m5747k4(String str, int i, int i2) {
        return str == null ? m5748k4("An XML error has occurred.", null, i, i2) : (i == 0 && i2 == 0) ? str : m5748k4("{0}", new String[]{str}, i, i2);
    }

    public final int getLineNumber() {
        return this.f4910kk;
    }

    public final int getLinePosition() {
        return this.f4911to;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f4908h4;
        return str == null ? super.getMessage() : str;
    }

    public final String getResString() {
        return this.f4909k4;
    }

    public final String getSourceUri() {
        return this.f4907du;
    }

    public XmlException(String str) {
        this(str, (RuntimeException) null, 0, 0);
    }

    public static String[] buildCharExceptionArgs(String str, int i) {
        char cCharAt = str.charAt(i);
        int i2 = i + 1;
        return buildCharExceptionArgs(cCharAt, i2 < str.length() ? str.charAt(i2) : (char) 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m5748k4(String str, String[] strArr, int i, int i2) {
        try {
            if (i == 0) {
                return C13968ri.m65819k4(str, strArr);
            }
            return C13968ri.m65819k4("{0} Line {1}, position {2}.", C13968ri.m65819k4(str, strArr), C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()), C14057f9.m66586k4(i2, (InterfaceC14073kp) C11697x1.m55250kk()));
        } catch (MissingManifestResourceException unused) {
            return C14113y2.m67408k4("UNKNOWN(", str, ")");
        }
    }

    public XmlException(String str, int i, int i2) {
        this(str, (String[]) C7019kk.m27458kk((Object) null, String[].class), (RuntimeException) null, i, i2);
    }

    public static String[] buildCharExceptionArgs(char[] cArr, int i) {
        return buildCharExceptionArgs(cArr, cArr.length, i);
    }

    public XmlException(String str, RuntimeException runtimeException) {
        this(str, runtimeException, 0, 0);
    }

    public static String[] buildCharExceptionArgs(char[] cArr, int i, int i2) {
        char c = cArr[i2];
        int i3 = i2 + 1;
        return buildCharExceptionArgs(c, i3 < i ? cArr[i3] : (char) 0);
    }

    public XmlException(String str, RuntimeException runtimeException, int i, int i2) {
        this(str, runtimeException, i, i2, (String) null);
    }

    public XmlException(String str, RuntimeException runtimeException, int i, int i2, String str2) {
        super(m5747k4(str, i, i2), runtimeException);
        setHResult(-2146232000);
        this.f4909k4 = str == null ? "An XML error has occurred." : "{0}";
        this.f4912x1 = new String[]{str};
        this.f4907du = str2;
        this.f4910kk = i;
        this.f4911to = i2;
    }

    public XmlException(String str, String str2) {
        this(str, new String[]{str2}, null, 0, 0, null);
    }

    public XmlException(String str, String str2, int i, int i2) {
        this(str, new String[]{str2}, null, i, i2, null);
    }

    public XmlException(String str, String str2, int i, int i2, String str3) {
        this(str, new String[]{str2}, null, i, i2, str3);
    }

    public XmlException(String str, String str2, InterfaceC13896f9 interfaceC13896f9) {
        this(str, new String[]{str2}, interfaceC13896f9, (String) null);
    }

    public XmlException(String str, String str2, InterfaceC13896f9 interfaceC13896f9, String str3) {
        this(str, new String[]{str2}, interfaceC13896f9, str3);
    }

    public XmlException(String str, String str2, RuntimeException runtimeException, InterfaceC13896f9 interfaceC13896f9) {
        this(str, new String[]{str2}, runtimeException, interfaceC13896f9 == null ? 0 : interfaceC13896f9.ah_(), interfaceC13896f9 != null ? interfaceC13896f9.ai_() : 0, null);
    }

    public XmlException(String str, String str2, String str3) {
        this(str, new String[]{str2}, null, 0, 0, str3);
    }

    public XmlException(String str, String[] strArr) {
        this(str, strArr, null, 0, 0, null);
    }

    public XmlException(String str, String[] strArr, int i, int i2) {
        this(str, strArr, null, i, i2, null);
    }

    public XmlException(String str, String[] strArr, int i, int i2, String str2) {
        this(str, strArr, null, i, i2, str2);
    }

    public XmlException(String str, String[] strArr, InterfaceC13896f9 interfaceC13896f9) {
        this(str, strArr, interfaceC13896f9, (String) null);
    }

    public XmlException(String str, String[] strArr, InterfaceC13896f9 interfaceC13896f9, String str2) {
        this(str, strArr, null, interfaceC13896f9 == null ? 0 : interfaceC13896f9.ah_(), interfaceC13896f9 != null ? interfaceC13896f9.ai_() : 0, str2);
    }

    public XmlException(String str, String[] strArr, RuntimeException runtimeException, int i, int i2) {
        this(str, strArr, runtimeException, i, i2, null);
    }

    public XmlException(String str, String[] strArr, RuntimeException runtimeException, int i, int i2, String str2) {
        super(m5748k4(str, strArr, i, i2), runtimeException);
        setHResult(-2146232000);
        this.f4909k4 = str;
        this.f4912x1 = strArr;
        this.f4907du = str2;
        this.f4910kk = i;
        this.f4911to = i2;
    }

    public XmlException(String str, String[] strArr, String str2) {
        this(str, strArr, null, 0, 0, str2);
    }
}
