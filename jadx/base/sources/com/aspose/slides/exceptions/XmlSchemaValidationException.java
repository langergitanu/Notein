package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.AbstractC13018hl;

/* JADX INFO: loaded from: classes3.dex */
public class XmlSchemaValidationException extends XmlSchemaException {

    /* JADX INFO: renamed from: k4 */
    private Object f4920k4;

    public XmlSchemaValidationException() {
        super(null);
    }

    public final Object getSourceObject() {
        return this.f4920k4;
    }

    public final void setSourceObject(Object obj) {
        this.f4920k4 = obj;
    }

    public XmlSchemaValidationException(String str) {
        super(str, (RuntimeException) null, 0, 0);
    }

    public XmlSchemaValidationException(String str, RuntimeException runtimeException) {
        super(str, runtimeException, 0, 0);
    }

    public XmlSchemaValidationException(String str, RuntimeException runtimeException, int i, int i2) {
        super(str, runtimeException, i, i2);
    }

    public XmlSchemaValidationException(String str, String str2) {
        super(str, new String[]{str2}, null, null, 0, 0, null);
    }

    public XmlSchemaValidationException(String str, String str2, int i, int i2) {
        super(str, (String[]) C7019kk.m27458kk((Object) null, String[].class), null, str2, i, i2, null);
    }

    public XmlSchemaValidationException(String str, String str2, String str3, int i, int i2) {
        super(str, new String[]{str2}, null, str3, i, i2, null);
    }

    public XmlSchemaValidationException(String str, String[] strArr) {
        super(str, strArr, null, null, 0, 0, null);
    }

    public XmlSchemaValidationException(String str, String[] strArr, Object obj) {
        super(str, strArr, null, null, 0, 0, null);
        this.f4920k4 = obj;
    }

    public XmlSchemaValidationException(String str, String[] strArr, RuntimeException runtimeException, String str2, int i, int i2) {
        super(str, strArr, runtimeException, str2, i, i2, null);
    }

    public XmlSchemaValidationException(String str, String[] strArr, String str2, int i, int i2) {
        super(str, strArr, null, str2, i, i2, null);
    }

    public XmlSchemaValidationException(String str, String[] strArr, String str2, int i, int i2, AbstractC13018hl abstractC13018hl, Object obj) {
        super(str, strArr, null, str2, i, i2, abstractC13018hl);
        this.f4920k4 = obj;
    }

    public XmlSchemaValidationException(String str, String[] strArr, String str2, Object obj) {
        super(str, strArr, null, str2, 0, 0, null);
        this.f4920k4 = obj;
    }
}
