package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p431ty.C11240k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9775k4 extends C9774jd {

    /* JADX INFO: renamed from: x1 */
    private static final C9775k4 f35311x1 = new C9775k4();

    /* JADX INFO: renamed from: k4 */
    private final Object f35312k4;

    private C9775k4() {
        super(null, null);
        this.f35312k4 = new Object();
    }

    /* JADX INFO: renamed from: x1 */
    public static C9775k4 m48094x1() {
        return f35311x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48095k4() {
        synchronized (this.f35312k4) {
            m48062k4(new List<>());
            m48066x1(new List<>());
            mo48065to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48096k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("fontsFolder");
        }
        synchronized (this.f35312k4) {
            m48056c5().addItem(str);
            mo48065to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48097k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("fontData");
        }
        synchronized (this.f35312k4) {
            try {
                if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4))) {
                    m48061jd().addItem(C11240k4.m54219k4(bArr));
                } else {
                    m48061jd().addItem(bArr);
                }
                mo48065to();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
