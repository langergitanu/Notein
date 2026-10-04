package com.aspose.slides.internal.p541z6;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;

/* JADX INFO: renamed from: com.aspose.slides.internal.z6.up */
/* JADX INFO: loaded from: classes5.dex */
public class C13451up extends Exception {
    public C13451up(String str, RuntimeException runtimeException) {
        super(str, runtimeException);
        if (runtimeException == null) {
            throw new ArgumentNullException("exception");
        }
    }

    @Override // com.aspose.slides.exceptions.Exception, java.lang.Throwable
    public String toString() {
        return getInnerException() != null ? getInnerException().toString() : super.toString();
    }
}
