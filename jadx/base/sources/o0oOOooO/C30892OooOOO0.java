package o0oOOooO;

import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0oOOooO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$isMultiSelectModeToSelectedSize$1", m80623f = "StickerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30892OooOOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, Set<? extends String>, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Integer>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Set f110396OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f110397OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Boolean bool, Set<? extends String> set, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Integer>> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C30892OooOOO0 c30892OooOOO0 = new C30892OooOOO0(3, continuation);
        c30892OooOOO0.f110397OooOo0o = zBooleanValue;
        c30892OooOOO0.f110396OooOo = set;
        return c30892OooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new C32443OooOOO(Boolean.valueOf(this.f110397OooOo0o), new Integer(this.f110396OooOo.size()));
    }
}
