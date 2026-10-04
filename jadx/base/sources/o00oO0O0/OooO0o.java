package o00oO0O0;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o {
    public static final void OooO00o(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static final int OooO0O0(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO(Drawable drawable, Drawable.Callback callback, InterfaceC25568OooOoo interfaceC25568OooOoo) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        InterfaceC25569OooOoo0 interfaceC25569OooOoo0 = drawable instanceof InterfaceC25569OooOoo0 ? (InterfaceC25569OooOoo0) drawable : null;
        if (interfaceC25569OooOoo0 != null) {
            interfaceC25569OooOoo0.OooO0o(interfaceC25568OooOoo);
        }
    }
}
