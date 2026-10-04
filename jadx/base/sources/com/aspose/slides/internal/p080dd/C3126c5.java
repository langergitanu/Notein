package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.File;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.c5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3126c5 extends AbstractC3145up {
    public C3126c5(String str) {
        if (str == null) {
            throw new ArgumentNullException("fileName");
        }
        m13431kk(str);
        this.f9319x1 = str;
        this.f9317k4 = C3141rv.m13406kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    public C3126c5 m13331k4(String str) {
        return m13332k4(str, false);
    }

    /* JADX INFO: renamed from: kk */
    public long m13334kk() {
        if (m13333k4()) {
            return new File(this.f9317k4).length();
        }
        throw new FileNotFoundException(C14113y2.m67408k4("Could not find file \"", this.f9319x1, "\"."), this.f9319x1);
    }

    /* JADX INFO: renamed from: to */
    public void m13335to() {
        C3131h4.m13365x1(this.f9317k4);
    }

    public String toString() {
        return this.f9319x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3145up
    /* JADX INFO: renamed from: x1 */
    public String mo13336x1() {
        return C3141rv.m13403k4(this.f9317k4);
    }

    /* JADX INFO: renamed from: k4 */
    public C3126c5 m13332k4(String str, boolean z) throws Throwable {
        if (str == null) {
            throw new ArgumentNullException("destFileName");
        }
        if (str.length() == 0) {
            throw new ArgumentException("An empty file name is not valid.", "destFileName");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("An empty file name is not valid.");
        }
        String strM13406kk = C3141rv.m13406kk(str);
        if (z && C3131h4.m13361kk(strM13406kk)) {
            C3131h4.m13365x1(strM13406kk);
        }
        C3131h4.m13366x1(this.f9317k4, strM13406kk);
        return new C3126c5(strM13406kk);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m13333k4() {
        return new File(this.f9317k4).exists();
    }
}
