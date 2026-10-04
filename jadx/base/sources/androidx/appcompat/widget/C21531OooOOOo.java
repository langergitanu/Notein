package androidx.appcompat.widget;

import androidx.appcompat.view.menu.InterfaceC21513OooOOo;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21531OooOOOo extends AbstractViewOnTouchListenerC21553Oooo00O {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.C21524OooO0o0 f62935Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f62936Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21531OooOOOo(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, AppCompatSpinner.C21524OooO0o0 c21524OooO0o0) {
        super(appCompatSpinner2);
        this.f62936Oooo00O = appCompatSpinner;
        this.f62935Oooo000 = c21524OooO0o0;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O
    public final InterfaceC21513OooOOo OooO0O0() {
        return this.f62935Oooo000;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O
    public final boolean OooO0OO() {
        AppCompatSpinner appCompatSpinner = this.f62936Oooo00O;
        if (appCompatSpinner.getInternalPopup().OooO00o()) {
            return true;
        }
        appCompatSpinner.f62836OooOoo0.OooO0Oo(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
