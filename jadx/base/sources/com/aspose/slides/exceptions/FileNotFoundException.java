package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class FileNotFoundException extends IOException {

    /* JADX INFO: renamed from: k4 */
    private String f4895k4;

    public FileNotFoundException() {
        super("Unable to find the specified file.");
    }

    public String getFileName() {
        return this.f4895k4;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return (super.getMessage() != null || this.f4895k4 == null) ? super.getMessage() : C14113y2.m67391k4(C11697x1.m55252to(), C14113y2.m67408k4("Could not load file or assembly '{0}' or one of", " its dependencies. The system cannot find the", " file specified."), this.f4895k4);
    }

    @Override // com.aspose.slides.exceptions.Exception, java.lang.Throwable
    public String toString() {
        C6765kp c6765kp = new C6765kp("com.aspose.slides.exceptions.FileNotFoundException");
        c6765kp.m26796k4(": {0}", getMessage());
        String str = this.f4895k4;
        if (str != null && str.length() > 0) {
            c6765kp.m26792k4(C14052dq.f47188k4);
            c6765kp.m26796k4("File name: '{0}'", this.f4895k4);
        }
        if (getCause() != null) {
            c6765kp.m26796k4(" ---> {0}", getCause().getMessage());
        }
        if (getStackTrace() != null) {
            for (StackTraceElement stackTraceElement : getStackTrace()) {
                c6765kp.m26792k4(C14052dq.f47188k4);
                c6765kp.m26792k4(stackTraceElement.toString());
            }
        }
        return c6765kp.toString();
    }

    public FileNotFoundException(String str) {
        super(str);
    }

    public FileNotFoundException(String str, String str2) {
        super(str);
        this.f4895k4 = str2;
    }

    public FileNotFoundException(String str, String str2, Throwable th) {
        super(str, th);
        this.f4895k4 = str2;
    }

    public FileNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
