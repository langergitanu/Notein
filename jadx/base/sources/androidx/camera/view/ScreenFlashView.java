package androidx.camera.view;

import OooOOo.InterfaceC20460OooO00o;
import OooOOoo.C20469OooO00o;
import OooOo00.OooO0o;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenFlashView extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0o f63296OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Window f63297OooOo0o;

    private float getBrightness() {
        Window window = this.f63297OooOo0o;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        Log.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    private void setBrightness(float f) {
        if (this.f63297OooOo0o == null) {
            Log.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            Log.e("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f63297OooOo0o.getAttributes();
        attributes.screenBrightness = f;
        this.f63297OooOo0o.setAttributes(attributes);
        Log.d("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(InterfaceC20460OooO00o interfaceC20460OooO00o) {
        Log.d("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public InterfaceC20460OooO00o getScreenFlash() {
        return this.f63296OooOo;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(OooOo00.OooO00o oooO00o) {
        C20469OooO00o.OooO00o();
    }

    public void setScreenFlashWindow(Window window) {
        C20469OooO00o.OooO00o();
        StringBuilder sb = new StringBuilder("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.f63297OooOo0o);
        Log.d("ScreenFlashView", sb.toString());
        if (this.f63297OooOo0o != window) {
            this.f63296OooOo = window == null ? null : new OooO0o();
        }
        this.f63297OooOo0o = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
