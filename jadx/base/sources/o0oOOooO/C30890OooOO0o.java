package o0oOOooO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0oOOooO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$isAddToStickerCollectionsEnable$1", m80623f = "StickerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30890OooOO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f110391OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ String f110392OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(String str, Boolean bool, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C30890OooOO0o c30890OooOO0o = new C30890OooOO0o(3, continuation);
        c30890OooOO0o.f110392OooOo0o = str;
        c30890OooOO0o.f110391OooOo = zBooleanValue;
        return c30890OooOO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(this.f110392OooOo0o.length() > 0 && !this.f110391OooOo);
    }
}
