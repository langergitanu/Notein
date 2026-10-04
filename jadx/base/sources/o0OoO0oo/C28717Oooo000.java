package o0OoO0oo;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import kotlin.coroutines.Continuation;
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

/* JADX INFO: renamed from: o0OoO0oo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$removeLockForNote$1", m80623f = "LockNoteFragment.kt", m80624l = {73}, m80625m = "invokeSuspend")
public final class C28717Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101739OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LockNoteFragment f101740OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101741OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101742OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28717Oooo000(LockNoteFragment lockNoteFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f101742OooOoO0 = str;
        this.f101741OooOoO = lockNoteFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28717Oooo000(this.f101741OooOoO, this.f101742OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28717Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        LockNoteFragment lockNoteFragment;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101739OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = this.f101742OooOoO0;
            if (str != null) {
                LockNoteFragment lockNoteFragment2 = this.f101741OooOoO;
                C28729OoooO0O c28729OoooO0OOooOoOO = lockNoteFragment2.OooOoOO();
                this.f101740OooOo0o = lockNoteFragment2;
                this.f101739OooOo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28728OoooO00(c28729OoooO0OOooOoOO, str, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
                lockNoteFragment = lockNoteFragment2;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lockNoteFragment = this.f101740OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        lockNoteFragment.OooOoo0(R.string.remove_lock_success);
        return C32460OooOooO.f116667OooO00o;
    }
}
