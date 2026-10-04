package o00o00oo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import o00o0.InterfaceC25205OooO0O0;

/* JADX INFO: renamed from: o00o00oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25299OooO0o0<Z> extends AbstractC25302OooOO0<ImageView, Z> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Animatable f86108OooOoO0;

    public abstract void OooO00o(Z z);

    @Override // o00o00oo.AbstractC25302OooOO0, o00o00oo.InterfaceC25293OooO
    public final void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f86108OooOoO0;
        if (animatable != null) {
            animatable.stop();
        }
        OooO00o(null);
        this.f86108OooOoO0 = null;
        this.f86112OooOo0o.setImageDrawable(drawable);
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void onLoadFailed(Drawable drawable) {
        OooO00o(null);
        this.f86108OooOoO0 = null;
        this.f86112OooOo0o.setImageDrawable(drawable);
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void onLoadStarted(Drawable drawable) {
        OooO00o(null);
        this.f86108OooOoO0 = null;
        this.f86112OooOo0o.setImageDrawable(drawable);
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void onResourceReady(Z z, InterfaceC25205OooO0O0<? super Z> interfaceC25205OooO0O0) {
        OooO00o(z);
        if (!(z instanceof Animatable)) {
            this.f86108OooOoO0 = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f86108OooOoO0 = animatable;
        animatable.start();
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onStart() {
        Animatable animatable = this.f86108OooOoO0;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onStop() {
        Animatable animatable = this.f86108OooOoO0;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
