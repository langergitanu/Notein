package com.aspose.slides.internal.p075d5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p137ft.C4117k4;
import com.aspose.slides.internal.p137ft.C4118kk;
import com.aspose.slides.internal.p214k0.AbstractC5568kk;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d5.x1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3024x1 extends AbstractC11290x1 {

    /* JADX INFO: renamed from: k4 */
    private C3018du f8855k4 = new C3018du();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f8855k4 = null;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m12730k4((AbstractC3024x1) obj);
    }

    public int hashCode() {
        C3018du c3018du = this.f8855k4;
        if (c3018du != null) {
            return c3018du.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3018du m12729k4() {
        return this.f8855k4;
    }

    /* JADX INFO: renamed from: kk */
    public abstract C12014ne mo12731kk();

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: to */
    public C12009k4 mo12732to() {
        return AbstractC5568kk.m22887k4(this).mo22885to();
    }

    /* JADX INFO: renamed from: x1 */
    public abstract int mo12733x1();

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3024x1 m12727k4(AbstractC3150x6 abstractC3150x6) {
        C4117k4 c4117k4 = new C4117k4(abstractC3150x6);
        if (c4117k4.m16480x1()) {
            return c4117k4.m16479k4();
        }
        C4118kk c4118kk = new C4118kk(abstractC3150x6);
        if (c4118kk.m16482x1()) {
            return c4118kk.m16481k4();
        }
        throw new ArgumentException("Unable to read Metafile.");
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3024x1 m12728k4(String str) {
        C3130fa c3130fa = new C3130fa(str, 3);
        try {
            return m12727k4(c3130fa);
        } finally {
            c3130fa.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m12730k4(AbstractC3024x1 abstractC3024x1) {
        return C14067j2.m66728k4(this.f8855k4, abstractC3024x1.f8855k4);
    }
}
