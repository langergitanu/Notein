package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidEnumArgumentException extends ArgumentException {
    public InvalidEnumArgumentException() {
        super("Exception of type System.ComponentModel.InvalidEnumArgumentException was thrown.");
    }

    public InvalidEnumArgumentException(String str) {
        super(str);
    }

    public InvalidEnumArgumentException(String str, int i, AbstractC14068j5 abstractC14068j5) {
        super(C14113y2.m67402k4("The value of argument '{0}' ({1}) is invalid for Enum '{2}'.", str, Integer.valueOf(i), abstractC14068j5.mo48540du()), str);
    }

    public InvalidEnumArgumentException(String str, Throwable th) {
        super(str, th);
    }
}
