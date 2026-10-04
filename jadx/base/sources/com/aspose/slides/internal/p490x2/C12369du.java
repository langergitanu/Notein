package com.aspose.slides.internal.p490x2;

import android.graphics.Bitmap;
import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p066cl.InterfaceC2623jd;
import com.aspose.slides.internal.p066cl.InterfaceC2625kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.du */
/* JADX INFO: loaded from: classes5.dex */
class C12369du implements InterfaceC2623jd {

    /* JADX INFO: renamed from: k4 */
    private Bitmap f41347k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2625kk f41348x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.x2.du$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ int[] f41349k4;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f41349k4 = iArr;
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41349k4[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41349k4[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41349k4[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41349k4[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41349k4[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C12369du(Bitmap bitmap) {
        InterfaceC2625kk c12375to;
        this.f41347k4 = bitmap;
        switch (AnonymousClass1.f41349k4[bitmap.getConfig().ordinal()]) {
            case 1:
                c12375to = new C12375to(bitmap);
                break;
            case 2:
            case 3:
            case 4:
                c12375to = new C12373kk(bitmap);
                break;
            case 5:
                c12375to = new C12373kk(bitmap);
                break;
            case 6:
                throw new ArgumentException("HARDWARE Bitmap.Config is not supported");
            default:
                throw new ArgumentException(C14113y2.m67402k4("Unknown Bitmap.Config: {0}", bitmap.getConfig()));
        }
        this.f41348x1 = c12375to;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2623jd
    /* JADX INFO: renamed from: k4 */
    public int mo11967k4() {
        switch (AnonymousClass1.f41349k4[this.f41347k4.getConfig().ordinal()]) {
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 4;
            case 5:
                return 8;
            case 6:
                throw new ArgumentException("HARDWARE Bitmap.Config is not supported");
            default:
                throw new ArgumentException(C14113y2.m67402k4("Unknown Bitmap.Config: {0}", this.f41347k4.getConfig()));
        }
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2623jd
    /* JADX INFO: renamed from: kk */
    public Object mo11971kk() {
        switch (AnonymousClass1.f41349k4[this.f41347k4.getConfig().ordinal()]) {
            case 1:
                return new short[mo11967k4()];
            case 2:
            case 3:
            case 4:
                return new byte[mo11967k4()];
            case 5:
                return new byte[mo11967k4()];
            case 6:
                throw new ArgumentException("HARDWARE Bitmap.Config is not supported");
            default:
                throw new ArgumentException(C14113y2.m67402k4("Unknown Bitmap.Config: {0}", this.f41347k4.getConfig()));
        }
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2623jd
    /* JADX INFO: renamed from: x1 */
    public InterfaceC2625kk mo11972x1() {
        return this.f41348x1;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2623jd
    /* JADX INFO: renamed from: k4 */
    public int mo11968k4(int i, int i2, int i3) {
        int i4;
        if (i3 < 0 || i3 > 3) {
            throw new ArgumentOutOfRangeException("bound should be in range [0, 3]");
        }
        int pixel = this.f41347k4.getPixel(i, i2);
        if (i3 == 0) {
            i4 = pixel >> 24;
        } else if (i3 == 1) {
            i4 = pixel >> 16;
        } else {
            if (i3 != 2) {
                return pixel & 255;
            }
            i4 = pixel >> 8;
        }
        return i4 & 255;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2623jd
    /* JADX INFO: renamed from: k4 */
    public void mo11969k4(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (i3 < 0 || i3 > 3) {
            throw new ArgumentOutOfRangeException("bound should be in range [0, 3]");
        }
        int pixel = this.f41347k4.getPixel(i, i2);
        if (i3 == 0) {
            i6 = (i4 & 255) << 24;
            i7 = 16777215;
        } else if (i3 == 1) {
            i6 = (i4 & 255) << 16;
            i7 = -16711681;
        } else {
            if (i3 != 2) {
                i5 = (i4 & 255) | InputDeviceCompat.SOURCE_ANY;
                this.f41347k4.setPixel(i, i2, i5 & pixel);
            }
            i6 = (i4 & 255) << 8;
            i7 = -65281;
        }
        i5 = i6 | i7;
        this.f41347k4.setPixel(i, i2, i5 & pixel);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2623jd
    /* JADX INFO: renamed from: k4 */
    public void mo11970k4(int i, int i2, Object obj) {
        switch (AnonymousClass1.f41349k4[this.f41347k4.getConfig().ordinal()]) {
            case 1:
                ((C12375to) this.f41348x1).m57965kk()[(this.f41347k4.getWidth() * i2) + i] = ((short[]) obj)[0];
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                byte[] bArrMo11998kk = ((C12373kk) this.f41348x1).mo11998kk();
                int iMo11967k4 = mo11967k4();
                System.arraycopy((byte[]) obj, 0, bArrMo11998kk, ((this.f41347k4.getWidth() * i2) + i) * iMo11967k4, iMo11967k4);
                return;
            case 6:
                throw new ArgumentException("HARDWARE Bitmap.Config is not supported");
            default:
                throw new ArgumentException(C14113y2.m67402k4("Unknown Bitmap.Config: {0}", this.f41347k4.getConfig()));
        }
    }
}
