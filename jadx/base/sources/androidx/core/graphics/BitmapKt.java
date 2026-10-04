package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.inner.api.NetworkService;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n¢\u0006\u0004\b\n\u0010\u000b\u001a.\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0086\n¢\u0006\u0004\b\r\u0010\u000e\u001a.\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a>\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0087\b¢\u0006\u0004\b\u0017\u0010\u001c\u001a\u001c\u0010\u001f\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\n¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\u001f\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u001e\u001a\u00020!H\u0086\n¢\u0006\u0004\b\u001f\u0010\"¨\u0006#"}, m80612d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "LoO00ooO/OooOooO;", "block", "applyCanvas", "(Landroid/graphics/Bitmap;LoO0O000o/OooOO0o;)Landroid/graphics/Bitmap;", "", "x", "y", "get", "(Landroid/graphics/Bitmap;II)I", "color", "set", "(Landroid/graphics/Bitmap;III)V", "width", "height", "", "filter", "scale", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", NetworkService.Constants.CONFIG_SERVICE, "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;", "Landroid/graphics/Point;", ContextChain.TAG_PRODUCT, "contains", "(Landroid/graphics/Bitmap;Landroid/graphics/Point;)Z", "Landroid/graphics/PointF;", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)Z", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        interfaceC32507OooOO0o.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int i;
        int width = bitmap.getWidth();
        int i2 = point.x;
        return i2 >= 0 && i2 < width && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public static final int get(Bitmap bitmap, int i, int i2) {
        return bitmap.getPixel(i, i2);
    }

    public static final Bitmap scale(Bitmap bitmap, int i, int i2, boolean z) {
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static final void set(Bitmap bitmap, int i, int i2, int i3) {
        bitmap.setPixel(i, i2, i3);
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        float f = pointF.x;
        if (f < 0.0f || f >= bitmap.getWidth()) {
            return false;
        }
        float f2 = pointF.y;
        return f2 >= 0.0f && f2 < ((float) bitmap.getHeight());
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace) {
        return Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }
}
