package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: renamed from: o0OO00o0.o00Ooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$clearStrokes$2", m80623f = "StrokeLocalDataSource.kt", m80624l = {72}, m80625m = "invokeSuspend")
public final class C26650o00Ooooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34993o0ooOoOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91975OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91976OooOo0o;

    public C26650o00Ooooo() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26650o00Ooooo c26650o00Ooooo = new C26650o00Ooooo(2, continuation);
        c26650o00Ooooo.f91975OooOo = obj;
        return c26650o00Ooooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34993o0ooOoOO abstractC34993o0ooOoOO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26650o00Ooooo) create(abstractC34993o0ooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91976OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34993o0ooOoOO abstractC34993o0ooOoOO = (AbstractC34993o0ooOoOO) this.f91975OooOo;
            this.f91976OooOo0o = 1;
            if (abstractC34993o0ooOoOO.OooO00o(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
