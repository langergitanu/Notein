package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class XmlSyntaxException extends SystemException {
    public XmlSyntaxException() {
    }

    public XmlSyntaxException(int i) {
        super(C14113y2.m67402k4("Invalid syntax on line {0}.", Integer.valueOf(i)));
    }

    public XmlSyntaxException(int i, String str) {
        super(C14113y2.m67402k4("Invalid syntax on line {0} - {1}.", Integer.valueOf(i), str));
    }

    public XmlSyntaxException(String str) {
        super(str);
    }

    public XmlSyntaxException(String str, Exception exception) {
        super(str, exception);
    }
}
