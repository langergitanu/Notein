package o0O0oooO;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0O0oooO.o0000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$needToShowDefaultNotesAppDialog$2", m80623f = "UserViewModel.kt", m80624l = {870}, m80625m = "invokeSuspend")
public final class C26319o0000Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90202OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90203OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26319o0000Oo0(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(2, continuation);
        this.f90202OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26319o0000Oo0(continuation, this.f90202OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C26319o0000Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90203OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26320o0000OoO c26320o0000OoO = this.f90202OooOo;
            if (c26320o0000OoO.f90208OooO0oO.f95374OooO00o.getValueAsBoolean("rconfig_enable_notes_role") && !c26320o0000OoO.f90254Ooooo0o) {
                InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = c26320o0000OoO.f90221OooOo0.getData();
                this.f90203OooOo0o = 1;
                obj = C25252OooO0Oo.OooOOo(data, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return Boolean.FALSE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(!(((Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95020OooOo0)) != null ? r5.booleanValue() : false));
    }
}
