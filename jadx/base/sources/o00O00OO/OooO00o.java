package o00O00OO;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO f84091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f84092OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f84093OooOoO0;

    public OooO00o(OooO0O0 oooO0O0, FrameLayout frameLayout, OooO oooO) {
        this.f84093OooOoO0 = oooO0O0;
        this.f84092OooOo0o = frameLayout;
        this.f84091OooOo = oooO;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout frameLayout = this.f84092OooOo0o;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f84093OooOoO0.OooO0oo(this.f84091OooOo);
        }
    }
}
