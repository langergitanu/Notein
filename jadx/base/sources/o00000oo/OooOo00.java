package o00000oo;

import androidx.compose.p002ui.window.PopupLayout;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f81331OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(PopupLayout popupLayout) {
        super(0);
        this.f81331OooOo0o = popupLayout;
    }

    @Override // oO0O000o.OooO00o
    public final Boolean invoke() {
        PopupLayout popupLayout = this.f81331OooOo0o;
        return Boolean.valueOf((popupLayout.getParentLayoutCoordinates() == null || popupLayout.m80660getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
