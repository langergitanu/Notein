package o0OoOoo0;

import kotlin.coroutines.Continuation;
import o0OOoOo.C27788OooO0o;
import o0OOoOo.C27789OooO0o0;
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

/* JADX INFO: renamed from: o0OoOoo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteViewModel$deleteTheOthersLatestOpenedNotes$1", m80623f = "LatestOpenedNoteViewModel.kt", m80624l = {137}, m80625m = "invokeSuspend")
public final class C29246OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29250OooOoO0 f103713OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103714OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29246OooOo0(C29250OooOoO0 c29250OooOoO0, Continuation<? super C29246OooOo0> continuation) {
        super(2, continuation);
        this.f103713OooOo = c29250OooOoO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29246OooOo0(this.f103713OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29246OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103714OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C29250OooOoO0 c29250OooOoO0 = this.f103713OooOo;
            String str = (String) c29250OooOoO0.f103736OooO0oO.getValue();
            this.f103714OooOo0o = 1;
            C27788OooO0o c27788OooO0o = c29250OooOoO0.f103735OooO0o0;
            c27788OooO0o.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27789OooO0o0(c27788OooO0o, str, null), this);
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
        return C32460OooOooO.f116667OooO00o;
    }
}
