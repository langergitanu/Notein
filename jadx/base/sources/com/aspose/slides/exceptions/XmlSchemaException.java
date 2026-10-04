package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.AbstractC13018hl;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13968ri;

/* JADX INFO: loaded from: classes3.dex */
public class XmlSchemaException extends SystemException {

    /* JADX INFO: renamed from: du */
    private int f4913du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC13018hl f4914h4;

    /* JADX INFO: renamed from: k4 */
    private String f4915k4;

    /* JADX INFO: renamed from: kk */
    private String f4916kk;

    /* JADX INFO: renamed from: m9 */
    private String f4917m9;

    /* JADX INFO: renamed from: to */
    private int f4918to;

    /* JADX INFO: renamed from: x1 */
    private String[] f4919x1;

    public XmlSchemaException() {
        this(null);
    }

    public static String createMessage(String str, String[] strArr) {
        try {
            return C13968ri.m65819k4(str, strArr);
        } catch (MissingManifestResourceException unused) {
            return C14113y2.m67408k4("UNKNOWN(", str, ")");
        }
    }

    public final String[] getArgs() {
        return this.f4919x1;
    }

    public final String getGetRes() {
        return this.f4915k4;
    }

    public final int getLineNumber() {
        return this.f4918to;
    }

    public final int getLinePosition() {
        return this.f4913du;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.f4917m9;
        return str == null ? super.getMessage() : str;
    }

    public final AbstractC13018hl getSourceSchemaObject() {
        return this.f4914h4;
    }

    public final String getSourceUri() {
        return this.f4916kk;
    }

    public final void setResourceId(String str) {
        this.f4915k4 = str;
    }

    public final void setSchemaObject(AbstractC13018hl abstractC13018hl) {
        this.f4914h4 = abstractC13018hl;
    }

    public final void setSource(AbstractC13018hl abstractC13018hl) {
        this.f4914h4 = abstractC13018hl;
        this.f4916kk = abstractC13018hl.m60693xk();
        this.f4918to = abstractC13018hl.m60676ak();
        this.f4913du = abstractC13018hl.m60678dq();
    }

    public XmlSchemaException(String str) {
        this(str, (RuntimeException) null, 0, 0);
    }

    public final void setSource(String str, int i, int i2) {
        this.f4916kk = str;
        this.f4918to = i;
        this.f4913du = i2;
    }

    public XmlSchemaException(String str, AbstractC13018hl abstractC13018hl) {
        this(str, (String[]) C7019kk.m27458kk((Object) null, String[].class), abstractC13018hl);
    }

    public XmlSchemaException(String str, RuntimeException runtimeException) {
        this(str, runtimeException, 0, 0);
    }

    public XmlSchemaException(String str, RuntimeException runtimeException, int i, int i2) {
        this(str == null ? "A Schema error occurred." : "{0}", new String[]{str}, runtimeException, null, i, i2, null);
    }

    public XmlSchemaException(String str, String str2) {
        this(str, new String[]{str2}, null, null, 0, 0, null);
    }

    public XmlSchemaException(String str, String str2, int i, int i2) {
        this(str, (String[]) C7019kk.m27458kk((Object) null, String[].class), null, str2, i, i2, null);
    }

    public XmlSchemaException(String str, String str2, AbstractC13018hl abstractC13018hl) {
        this(str, new String[]{str2}, abstractC13018hl);
    }

    public XmlSchemaException(String str, String str2, String str3, int i, int i2) {
        this(str, new String[]{str2}, null, str3, i, i2, null);
    }

    public XmlSchemaException(String str, String[] strArr) {
        this(str, strArr, null, null, 0, 0, null);
    }

    public XmlSchemaException(String str, String[] strArr, AbstractC13018hl abstractC13018hl) {
        this(str, strArr, null, abstractC13018hl.m60693xk(), abstractC13018hl.m60676ak(), abstractC13018hl.m60678dq(), abstractC13018hl);
    }

    public XmlSchemaException(String str, String[] strArr, RuntimeException runtimeException, String str2, int i, int i2, AbstractC13018hl abstractC13018hl) {
        super(createMessage(str, strArr), runtimeException);
        setHResult(-2146232000);
        this.f4915k4 = str;
        this.f4919x1 = strArr;
        this.f4916kk = str2;
        this.f4918to = i;
        this.f4913du = i2;
        this.f4914h4 = abstractC13018hl;
    }

    public XmlSchemaException(String str, String[] strArr, String str2, int i, int i2) {
        this(str, strArr, null, str2, i, i2, null);
    }
}
