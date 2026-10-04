package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.up */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3145up {

    /* JADX INFO: renamed from: to */
    private static C14084qq f9316to = new C14084qq(1601, 1, 1);

    /* JADX INFO: renamed from: x1 */
    protected String f9319x1;

    /* JADX INFO: renamed from: kk */
    boolean f9318kk = false;

    /* JADX INFO: renamed from: k4 */
    protected String f9317k4 = null;

    /* JADX INFO: renamed from: h4 */
    public String m13430h4() {
        return this.f9317k4;
    }

    /* JADX INFO: renamed from: kk */
    public void m13431kk(String str) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("An empty file name is not valid.");
        }
    }

    /* JADX INFO: renamed from: m9 */
    public String m13432m9() {
        return C3141rv.m13397du(mo13336x1());
    }

    /* JADX INFO: renamed from: x1 */
    public abstract String mo13336x1();
}
