package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOoo.C27204OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.o0000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$getPenEventSetting$1", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26529o0000Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C27204OooO0O0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Integer> f91335OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f91336OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26529o0000Oo0(AbstractC24338OooO0o0.OooO00o<Integer> oooO00o, Continuation<? super C26529o0000Oo0> continuation) {
        super(2, continuation);
        this.f91335OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26529o0000Oo0 c26529o0000Oo0 = new C26529o0000Oo0(this.f91335OooOo, continuation);
        c26529o0000Oo0.f91336OooOo0o = ((Number) obj).intValue();
        return c26529o0000Oo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Integer num, Continuation<? super C27204OooO0O0> continuation) {
        return ((C26529o0000Oo0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new C27204OooO0O0(this.f91335OooOo.f81922OooO00o, this.f91336OooOo0o);
    }
}
