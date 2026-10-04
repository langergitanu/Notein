package o0OoO0oo;

import com.aspose.words.StyleIdentifier;
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

/* JADX INFO: renamed from: o0OoO0oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$authenticate$3$1", m80623f = "LockNoteFragment.kt", m80624l = {StyleIdentifier.LIGHT_GRID_ACCENT_6}, m80625m = "invokeSuspend")
public final class C28712OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101725OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101726OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f101727OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28712OooOoo0(LockNoteFragment lockNoteFragment, oO0O000o.OooO00o<C32460OooOooO> oooO00o, Continuation<? super C28712OooOoo0> continuation) {
        super(2, continuation);
        this.f101725OooOo = lockNoteFragment;
        this.f101727OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28712OooOoo0(this.f101725OooOo, this.f101727OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28712OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101726OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28729OoooO0O c28729OoooO0OOooOoOO = this.f101725OooOo.OooOoOO();
            this.f101726OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28715Oooo(c28729OoooO0OOooOoOO, null), this);
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
        this.f101727OooOoO0.invoke();
        return C32460OooOooO.f116667OooO00o;
    }
}
