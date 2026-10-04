package com.aspose.slides.internal.p490x2;

import android.graphics.Bitmap;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p066cl.InterfaceC2628x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.x1 */
/* JADX INFO: loaded from: classes5.dex */
class C12376x1 implements InterfaceC2628x1 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC2628x1 f41364k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.x2.x1$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ int[] f41365k4;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f41365k4 = iArr;
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41365k4[Bitmap.Config.ARGB_8888.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41365k4[Bitmap.Config.ALPHA_8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41365k4[Bitmap.Config.ARGB_4444.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41365k4[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41365k4[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C12376x1(Bitmap bitmap) {
        InterfaceC2628x1 c12374m9;
        int i = AnonymousClass1.f41365k4[bitmap.getConfig().ordinal()];
        if (i == 1) {
            c12374m9 = new C12374m9();
        } else {
            if (i != 2) {
                throw new ArgumentException(C14113y2.m67402k4("{0} Bitmap.Config is not supported", bitmap.getConfig()));
            }
            c12374m9 = new C12371h4();
        }
        this.f41364k4 = c12374m9;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2628x1
    /* JADX INFO: renamed from: k4 */
    public Object mo11999k4(int i, Object obj) {
        return this.f41364k4.mo11999k4(i, obj);
    }
}
