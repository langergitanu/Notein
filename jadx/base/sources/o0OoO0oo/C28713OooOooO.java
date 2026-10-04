package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import kotlin.coroutines.Continuation;
import o0Oo0o0o.C28257Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$lockNoteDirectly$1", m80623f = "LockNoteFragment.kt", m80624l = {109}, m80625m = "invokeSuspend")
public final class C28713OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101728OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101729OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28257Oooo0o f101730OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28713OooOooO(LockNoteFragment lockNoteFragment, C28257Oooo0o c28257Oooo0o, Continuation continuation) {
        super(2, continuation);
        this.f101728OooOo = lockNoteFragment;
        this.f101730OooOoO0 = c28257Oooo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28713OooOooO(this.f101728OooOo, this.f101730OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28713OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101729OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28729OoooO0O c28729OoooO0OOooOoOO = this.f101728OooOo.OooOoOO();
            this.f101729OooOo0o = 1;
            if (c28729OoooO0OOooOoOO.OooO0o(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        this.f101730OooOoO0.invoke();
        return C32460OooOooO.f116667OooO00o;
    }
}
