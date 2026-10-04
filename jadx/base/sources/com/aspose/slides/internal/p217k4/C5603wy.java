package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.wy */
/* JADX INFO: loaded from: classes.dex */
public class C5603wy extends C5586ix {
    public C5603wy() {
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC5591lr m22993k4() {
        return this.f15424h4;
    }

    @Override // com.aspose.slides.internal.p217k4.C5586ix, java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer(", expected ");
        stringBuffer2.append(this.f15392k4);
        String string = stringBuffer2.toString();
        if (this.f15392k4 == 0) {
            string = "";
        }
        if (this.f15424h4 == null) {
            stringBuffer = new StringBuffer("UnwantedTokenException(found=null");
        } else {
            stringBuffer = new StringBuffer("UnwantedTokenException(found=");
            stringBuffer.append(this.f15424h4.mo22924x1());
        }
        stringBuffer.append(string);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public C5603wy(int i, InterfaceC5607yj interfaceC5607yj) {
        super(i, interfaceC5607yj);
    }
}
