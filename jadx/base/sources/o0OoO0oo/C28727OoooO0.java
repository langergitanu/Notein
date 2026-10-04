package o0OoO0oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteViewModel$removeMarkTimeToLockNote$1", m80623f = "LockNoteViewModel.kt", m80624l = {92}, m80625m = "invokeSuspend")
public final class C28727OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28729OoooO0O f101768OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101769OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28727OoooO0(C28729OoooO0O c28729OoooO0O, Continuation<? super C28727OoooO0> continuation) {
        super(2, continuation);
        this.f101768OooOo = c28729OoooO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28727OoooO0(this.f101768OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28727OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101769OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28729OoooO0O c28729OoooO0O = this.f101768OooOo;
            this.f101769OooOo0o = 1;
            if (c28729OoooO0O.f101773OooO0Oo.OooO0O0(this) == enumC32485OooO00o) {
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
