package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3125bv;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.f9 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3610f9 {

    /* JADX INFO: renamed from: k4 */
    private String f10030k4;

    public AbstractC3610f9(String str) {
        this.f10030k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract String mo14724k4();

    /* JADX INFO: renamed from: k4 */
    public void m14725k4(C3125bv c3125bv) {
        c3125bv.mo13304k4(mo14724k4());
        c3125bv.mo13304k4("=");
        c3125bv.mo13304k4(m14726x1());
        c3125bv.mo13304k4(IOUtils.LINE_SEPARATOR_WINDOWS);
    }

    /* JADX INFO: renamed from: x1 */
    public String m14726x1() {
        return this.f10030k4;
    }
}
