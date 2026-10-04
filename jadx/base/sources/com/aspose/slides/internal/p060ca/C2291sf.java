package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2291sf implements InterfaceC2375xt {

    /* JADX INFO: renamed from: k4 */
    private final C2137j0 f7897k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC2203mx f7898kk;

    /* JADX INFO: renamed from: x1 */
    private final int f7899x1;

    public C2291sf(C2137j0 c2137j0, int i, InterfaceC2203mx interfaceC2203mx) {
        if (c2137j0 == null) {
            throw new ArgumentNullException("FeatureList");
        }
        this.f7897k4 = c2137j0;
        this.f7899x1 = i;
        this.f7898kk = interfaceC2203mx;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2375xt
    /* JADX INFO: renamed from: k4 */
    public final void mo11416k4(int i, C2379xz c2379xz) {
        m11415k4(this.f7897k4.m10797k4(i), c2379xz);
    }

    /* JADX INFO: renamed from: k4 */
    private void m11415k4(C2078f3 c2078f3, C2379xz c2379xz) {
        if (c2078f3 == null) {
            throw new ArgumentNullException("Feature");
        }
        c2379xz.m11713k4(c2078f3);
        for (Integer num : c2078f3.m10511kk()) {
            try {
                this.f7898kk.mo11134k4(this.f7899x1, num.intValue() & 65535).mo10345k4(c2379xz);
            } catch (RuntimeException unused) {
            }
        }
    }
}
