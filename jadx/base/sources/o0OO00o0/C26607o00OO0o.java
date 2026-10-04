package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OO00o0.o00OO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LockNoteRepoImpl$reachedLimitToLockNoteLoop$1", m80623f = "LockNoteRepoImpl.kt", m80624l = {60, 60, 62}, m80625m = "invokeSuspend")
public final class C26607o00OO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super Boolean>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f91806OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33723OooO0oO f91807OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00OO f91808OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f91809OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26607o00OO0o(o00OO o00oo2, Continuation<? super C26607o00OO0o> continuation) {
        super(2, continuation);
        this.f91808OooOoO = o00oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26607o00OO0o c26607o00OO0o = new C26607o00OO0o(this.f91808OooOoO, continuation);
        c26607o00OO0o.f91809OooOoO0 = obj;
        return c26607o00OO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        ((C26607o00OO0o) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:13:0x003a). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91806OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f91809OooOoO0;
        } else {
            if (i == 1) {
                interfaceC33723OooO0oO = this.f91807OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f91809OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                this.f91809OooOoO0 = interfaceC33723OooO0oO2;
                this.f91807OooOo0o = null;
                this.f91806OooOo = 2;
                if (interfaceC33723OooO0oO.emit(obj, this) != enumC32485OooO00o) {
                    interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                    this.f91809OooOoO0 = interfaceC33723OooO0oO;
                    this.f91806OooOo = 3;
                    if (C33644OoooO0.OooO00o(2000L, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 2) {
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f91809OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                this.f91809OooOoO0 = interfaceC33723OooO0oO;
                this.f91806OooOo = 3;
                if (C33644OoooO0.OooO00o(2000L, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f91809OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        this.f91809OooOoO0 = interfaceC33723OooO0oO;
        this.f91807OooOo0o = interfaceC33723OooO0oO;
        this.f91806OooOo = 1;
        AbstractC24338OooO0o0.OooO00o<Long> oooO00o = o00OO.f91778OooO0O0;
        o00OO o00oo2 = this.f91808OooOoO;
        o00oo2.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new oo0O(o00oo2, null), this);
        if (obj != enumC32485OooO00o) {
            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
            this.f91809OooOoO0 = interfaceC33723OooO0oO2;
            this.f91807OooOo0o = null;
            this.f91806OooOo = 2;
            if (interfaceC33723OooO0oO.emit(obj, this) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
