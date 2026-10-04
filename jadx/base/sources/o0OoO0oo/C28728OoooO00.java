package o0OoO0oo;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteViewModel$removeLockForNote$2", m80623f = "LockNoteViewModel.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class C28728OoooO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28729OoooO0O f101770OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101771OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101772OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28728OoooO00(C28729OoooO0O c28729OoooO0O, String str, Continuation<? super C28728OoooO00> continuation) {
        super(2, continuation);
        this.f101770OooOo = c28729OoooO0O;
        this.f101772OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28728OoooO00(this.f101770OooOo, this.f101772OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28728OoooO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101771OooOo0o;
        C28729OoooO0O c28729OoooO0O = this.f101770OooOo;
        String str = this.f101772OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f101771OooOo0o = 1;
            C27449o00O0OoO c27449o00O0OoO = c28729OoooO0O.f101775OooO0o0;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOo0o.o00OOO(c27449o00O0OoO, str, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        c28729OoooO0O.f101774OooO0o.OooO0Oo(str, true);
        return C32460OooOooO.f116667OooO00o;
    }
}
