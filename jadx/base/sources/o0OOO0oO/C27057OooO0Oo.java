package o0OOO0oO;

import androidx.lifecycle.C22003OoooO00;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOO0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.remoteconfig.FirebaseRemoteConfigDataSource$initSDK$1", m80623f = "FirebaseRemoteConfigDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27057OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27060OooO0oO f94196OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27057OooO0Oo(C27060OooO0oO c27060OooO0oO, Continuation<? super C27057OooO0Oo> continuation) {
        super(2, continuation);
        this.f94196OooOo0o = c27060OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27057OooO0Oo(this.f94196OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27057OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C22003OoooO00 c22003OoooO00 = C22003OoooO00.f65631OooOooo;
        C22003OoooO00.f65631OooOooo.f65638OooOoo0.OooO00o(this.f94196OooOo0o.f94200OooO0OO);
        return C32460OooOooO.f116667OooO00o;
    }
}
