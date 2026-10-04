package com.aspose.slides.internal.p389s0;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10124m9 extends SortedList<String, Object> {

    /* JADX INFO: renamed from: k4 */
    private C14047bz f36270k4;

    public C10124m9() {
        this(C14047bz.f47172k4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m49724k4(String str) {
        Object[] objArr = {null};
        tryGetValue(str, objArr);
        C3152yj c3152yj = (C3152yj) C7019kk.m27452k4(objArr[0], C3152yj.class);
        if (c3152yj != null) {
            c3152yj.setPosition(0L);
        }
        return c3152yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3152yj m49728x1(String str) {
        C3152yj c3152yjM49724k4 = m49724k4(str);
        if (c3152yjM49724k4 != null) {
            return c3152yjM49724k4;
        }
        throw new InvalidOperationException(C14113y2.m67402k4("Cannot find stream '{0}' in the storage.", str));
    }

    public C10124m9(C14047bz c14047bz) {
        super(new C10119dy());
        C14047bz c14047bzClone = C14047bz.f47172k4.Clone();
        this.f36270k4 = c14047bzClone;
        c14047bz.CloneTo(c14047bzClone);
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m49725k4() {
        return this.f36270k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49726k4(String str, C3152yj c3152yj) {
        addItem(str, c3152yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49727k4(String str, C10124m9 c10124m9) {
        addItem(str, c10124m9);
    }
}
