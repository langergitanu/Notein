package o0OOo0o;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00Ooo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ResetGlobalSettingsUseCase$invoke$2", m80623f = "ResetGlobalSettingsUseCase.kt", m80624l = {29, 30, 31, 32, 33}, m80625m = "invokeSuspend")
public final class C27501o00Ooo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O00o0 f96378OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96379OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27501o00Ooo0O(o0O00o0 o0o00o02, Continuation<? super C27501o00Ooo0O> continuation) {
        super(2, continuation);
        this.f96378OooOo = o0o00o02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27501o00Ooo0O(this.f96378OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27501o00Ooo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (o0OOo0o.o0O00o0.OooO00o(r7, r8) != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96379OooOo0o;
        o0O00o0 o0o00o02 = this.f96378OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f96379OooOo0o = 1;
            if (o0O00o0.OooO0OO(o0o00o02, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                this.f96379OooOo0o = 3;
                if (o0O00o0.OooO0o0(o0o00o02, this) != enumC32485OooO00o) {
                    this.f96379OooOo0o = 4;
                    if (o0O00o0.OooO0O0(o0o00o02, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 3) {
                C32446OooOOOo.OooO0O0(obj);
                this.f96379OooOo0o = 4;
                if (o0O00o0.OooO0O0(o0o00o02, this) != enumC32485OooO00o) {
                    this.f96379OooOo0o = 5;
                }
                return enumC32485OooO00o;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f96379OooOo0o = 5;
        }
        this.f96379OooOo0o = 2;
        if (o0O00o0.OooO0Oo(o0o00o02, this) != enumC32485OooO00o) {
            this.f96379OooOo0o = 3;
            if (o0O00o0.OooO0o0(o0o00o02, this) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
