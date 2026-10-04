package androidx.graphics.lowlatency;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.firestore.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m80612d2 = {"Landroidx/graphics/lowlatency/LowLatencyCanvasView;", "Landroid/view/ViewGroup;", "Landroidx/graphics/lowlatency/LowLatencyCanvasView$OooO00o;", "callback", "LoO00ooO/OooOooO;", "setRenderCallback", "(Landroidx/graphics/lowlatency/LowLatencyCanvasView$OooO00o;)V", "OooO00o", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class LowLatencyCanvasView extends ViewGroup {

    public interface OooO00o {
    }

    static {
        String FINGERPRINT = Build.FINGERPRINT;
        OooOOO0.OooO0o(FINGERPRINT, "FINGERPRINT");
        if (C33595OooOOo.OooOoO0(FINGERPRINT, "generic", false) || C33595OooOOo.OooOoO0(FINGERPRINT, "unknown", false) || C33599OooOo0O.OooOoOO(FINGERPRINT, BuildConfig.TARGET_BACKEND, false)) {
            return;
        }
        String MODEL = Build.MODEL;
        OooOOO0.OooO0o(MODEL, "MODEL");
        if (C33599OooOo0O.OooOoOO(MODEL, "google_sdk", false) || C33599OooOo0O.OooOoOO(MODEL, "sdk_gphone64", false) || C33599OooOo0O.OooOoOO(MODEL, "Emulator", false) || C33599OooOo0O.OooOoOO(MODEL, "Android SDK built for", false)) {
            return;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
        if (C33599OooOo0O.OooOoOO(MANUFACTURER, "Genymotion", false)) {
            return;
        }
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        if (C33595OooOOo.OooOoO0(BRAND, "generic", false)) {
            String DEVICE = Build.DEVICE;
            OooOOO0.OooO0o(DEVICE, "DEVICE");
            if (C33595OooOOo.OooOoO0(DEVICE, "generic", false)) {
                return;
            }
        }
        "google_sdk".equals(Build.PRODUCT);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (view != null) {
            throw new IllegalStateException("LowLatencyCanvasView does not accept arbitrary child Views");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Display display = getDisplay();
        if (display == null || !display.isWideColorGamut() || !(context instanceof Activity) || Build.VERSION.SDK_INT < 34) {
            return;
        }
        ((Activity) context).getWindow().setColorMode(1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw null;
    }

    public final void setRenderCallback(OooO00o callback) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (view == null) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("LowLatencyCanvasView does not accept arbitrary child Views");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (view == null) {
            super.addView(view, i, i2);
            return;
        }
        throw new IllegalStateException("LowLatencyCanvasView does not accept arbitrary child Views");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("LowLatencyCanvasView does not accept arbitrary child Views");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("LowLatencyCanvasView does not accept arbitrary child Views");
    }
}
