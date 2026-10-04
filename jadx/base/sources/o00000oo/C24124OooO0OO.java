package o00000oo;

import Oooo0oO.C21060OoooO;
import Oooo0oO.InterfaceC21063OoooO0O;
import androidx.compose.p002ui.window.PopupLayout;
import o0000Ooo.EnumC24238OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00000oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24124OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21060OoooO, InterfaceC21063OoooO0O> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f81296OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f81297OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f81298OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24137OooOoO f81299OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ EnumC24238OooOOO f81300OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24124OooO0OO(PopupLayout popupLayout, oO0O000o.OooO00o<C32460OooOooO> oooO00o, C24137OooOoO c24137OooOoO, String str, EnumC24238OooOOO enumC24238OooOOO) {
        super(1);
        this.f81297OooOo0o = popupLayout;
        this.f81296OooOo = oooO00o;
        this.f81299OooOoO0 = c24137OooOoO;
        this.f81298OooOoO = str;
        this.f81300OooOoOO = enumC24238OooOOO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC21063OoooO0O invoke(C21060OoooO c21060OoooO) {
        C21060OoooO DisposableEffect = c21060OoooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect, "$this$DisposableEffect");
        PopupLayout popupLayout = this.f81297OooOo0o;
        popupLayout.f63567Oooo0O0.addView(popupLayout, popupLayout.params);
        popupLayout.OooOO0(this.f81296OooOo, this.f81299OooOoO0, this.f81298OooOoO, this.f81300OooOoOO);
        return new C24123OooO0O0(popupLayout);
    }
}
