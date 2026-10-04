package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class TypeLoadException extends SystemException {

    /* JADX INFO: renamed from: k4 */
    private String f4899k4;

    /* JADX INFO: renamed from: x1 */
    private String f4900x1;

    public TypeLoadException() {
        super("A type load exception has occurred.");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f4899k4 == null) {
            return super.getMessage();
        }
        String str = this.f4900x1;
        return (str == null || C14113y2.m67363du(str, C14113y2.f47374k4)) ? C14113y2.m67402k4("Could not load type '{0}'.", this.f4899k4) : C14113y2.m67402k4("Could not load type '{0}' from assembly '{1}'.", this.f4899k4, this.f4900x1);
    }

    public String getTypeName() {
        String str = this.f4899k4;
        return str == null ? C14113y2.f47374k4 : str;
    }

    public TypeLoadException(String str) {
        super(str);
    }

    public TypeLoadException(String str, Exception exception) {
        super(str, exception);
    }
}
