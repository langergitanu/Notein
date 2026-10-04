package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14052dq;

/* JADX INFO: loaded from: classes3.dex */
public class FileLoadException extends IOException {

    /* JADX INFO: renamed from: k4 */
    private String f4894k4;

    public FileLoadException() {
        super("Could not load the specified file.");
    }

    public String getFileName() {
        return this.f4894k4;
    }

    @Override // com.aspose.slides.exceptions.Exception, java.lang.Throwable
    public String toString() {
        C6765kp c6765kp = new C6765kp("com.aspose.slides.exceptions.FileLoadException");
        c6765kp.m26796k4(": {0}", getMessage());
        String str = this.f4894k4;
        if (str != null) {
            c6765kp.m26796k4(" : {0}", str);
        }
        if (getCause() != null) {
            c6765kp.m26796k4(" ----> {0}", getCause().getMessage());
        }
        if (getStackTrace() != null) {
            for (StackTraceElement stackTraceElement : getStackTrace()) {
                c6765kp.m26792k4(C14052dq.f47188k4);
                c6765kp.m26792k4(stackTraceElement.toString());
            }
        }
        return c6765kp.toString();
    }

    public FileLoadException(String str) {
        super(str);
    }

    public FileLoadException(String str, String str2) {
        super(str);
        this.f4894k4 = str2;
    }

    public FileLoadException(String str, String str2, Throwable th) {
        super(str, th);
        this.f4894k4 = str2;
    }

    public FileLoadException(String str, Throwable th) {
        super(str, th);
    }
}
