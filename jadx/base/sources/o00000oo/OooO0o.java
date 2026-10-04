package o00000oo;

import Oooo0oO.C21060OoooO;
import Oooo0oO.InterfaceC21063OoooO0O;
import androidx.compose.p002ui.window.PopupLayout;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21060OoooO, InterfaceC21063OoooO0O> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24138OooOoO0 f81306OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f81307OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(PopupLayout popupLayout, InterfaceC24138OooOoO0 interfaceC24138OooOoO0) {
        super(1);
        this.f81307OooOo0o = popupLayout;
        this.f81306OooOo = interfaceC24138OooOoO0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC21063OoooO0O invoke(C21060OoooO c21060OoooO) {
        C21060OoooO DisposableEffect = c21060OoooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect, "$this$DisposableEffect");
        PopupLayout popupLayout = this.f81307OooOo0o;
        popupLayout.setPositionProvider(this.f81306OooOo);
        popupLayout.OooOOO0();
        return new C24126OooO0o0();
    }
}
