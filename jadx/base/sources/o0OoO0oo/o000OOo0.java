package o0OoO0oo;

import kotlin.coroutines.Continuation;
import o0OOoO.C27704OooO0O0;
import o0OOoO.C27710OooO0oo;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$deleteComment$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {849}, m80625m = "invokeSuspend")
public final class o000OOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101957OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101958OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101959OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str, Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
        this.f101957OooOo = oooO0OO;
        this.f101959OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000OOo0(this.f101957OooOo, this.f101959OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000OOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101958OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f101957OooOo;
            String strOooOO0O = oooO0OO.OooOO0O();
            this.f101958OooOo0o = 1;
            C27710OooO0oo c27710OooO0oo = oooO0OO.f73356OooOO0O;
            c27710OooO0oo.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27704OooO0O0(c27710OooO0oo, this.f101959OooOoO0, strOooOO0O, null), this);
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
