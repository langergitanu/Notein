package com.aspose.slides.internal.p180ib;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p475wh.C12026yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ib.h4 */
/* JADX INFO: loaded from: classes.dex */
class C4805h4 {

    /* JADX INFO: renamed from: k4 */
    C11898h4 f13384k4;

    /* JADX INFO: renamed from: x1 */
    C11898h4 f13385x1;

    public C4805h4(C12026yj c12026yj) {
        if (c12026yj.m56912fa() == 255) {
            try {
                this.f13384k4 = c12026yj.m56929m9();
            } catch (ArgumentException unused) {
            }
        }
        if (c12026yj.m56934up() == 255) {
            try {
                this.f13385x1 = c12026yj.m56913h4();
            } catch (ArgumentException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m19883k4(C12026yj c12026yj) {
        if (this.f13384k4 != null && c12026yj.m56912fa() == 255) {
            c12026yj.m56938x1(this.f13384k4);
        }
        if (this.f13385x1 == null || c12026yj.m56934up() != 255) {
            return;
        }
        c12026yj.m56921k4(this.f13385x1);
    }
}
