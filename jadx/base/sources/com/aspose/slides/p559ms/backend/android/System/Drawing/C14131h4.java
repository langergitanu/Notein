package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.Bitmap;
import com.aspose.slides.internal.p024al.C1391k4;
import com.aspose.slides.internal.p024al.C1392kk;
import com.aspose.slides.internal.p024al.C1393to;
import com.aspose.slides.internal.p066cl.AbstractC2619c5;
import com.aspose.slides.internal.p066cl.AbstractC2621dy;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p072d2.C3004k4;
import com.aspose.slides.internal.p072d2.C3005kk;
import com.aspose.slides.internal.p072d2.C3006to;
import com.aspose.slides.internal.p490x2.C12372k4;
import com.aspose.slides.internal.p556zr.C13630k4;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.h4 */
/* JADX INFO: loaded from: classes5.dex */
class C14131h4 implements AbstractC14124to.kk<Bitmap> {
    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.kk
    /* JADX INFO: renamed from: k4 */
    public AbstractC2621dy mo67643k4(C14047bz c14047bz) {
        if (!C13630k4.f45264k4.equals(c14047bz) && !C13630k4.f45267m9.equals(c14047bz) && !C13630k4.f45278x1.equals(c14047bz)) {
            if (C13630k4.f45265kk.equals(c14047bz)) {
                return new C1392kk();
            }
            if (C13630k4.f45261h4.equals(c14047bz)) {
                return new C1393to();
            }
            C13630k4.f45259dy.equals(c14047bz);
            return null;
        }
        return new C1391k4();
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.kk
    /* JADX INFO: renamed from: x1 */
    public AbstractC2619c5 mo67646x1(C14047bz c14047bz) {
        if (!C13630k4.f45264k4.equals(c14047bz) && !C13630k4.f45267m9.equals(c14047bz) && !C13630k4.f45278x1.equals(c14047bz)) {
            if (C13630k4.f45265kk.equals(c14047bz)) {
                return new C3005kk();
            }
            if (C13630k4.f45261h4.equals(c14047bz)) {
                return new C3006to();
            }
            C13630k4.f45259dy.equals(c14047bz);
            return null;
        }
        return new C3004k4();
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.kk
    /* JADX INFO: renamed from: k4 */
    public InterfaceC2624k4 mo67644k4(int i, int i2, int i3) {
        return C12372k4.m57960kk(i, i2, i3);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.kk
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC2624k4 mo67645k4(Bitmap bitmap) {
        return C12372k4.m57957k4(bitmap);
    }
}
