package o0OoO0oo;

import com.orion.notein.App;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0OO00o0.C26569o000o0o0;
import o0OO00o0.C26577o000oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00oO00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$skipImageDimTipPermanently$1", m80623f = "NoteEditorViewModel.kt", m80624l = {1824}, m80625m = "invokeSuspend")
public final class C28943o00oO00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102545OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102546OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28943o00oO00O(C23344OooOOo c23344OooOOo, Continuation continuation) {
        super(2, continuation);
        this.f102545OooOo = c23344OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28943o00oO00O(this.f102545OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28943o00oO00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102546OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorViewModel");
            c20358OooO00o.OooO0o0("save ShowImageDimensionTips: false", new Object[0]);
            C23344OooOOo c23344OooOOo = this.f102545OooOo;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69584o00000o0;
            this.f102546OooOo0o = 1;
            C26577o000oo0O c26577o000oo0O = c23344OooOOo.f73556OooOOOo;
            c26577o000oo0O.getClass();
            Object objOooO00o = C24332OooO.OooO00o(c26577o000oo0O.f91598OooO00o, new C26569o000o0o0(oooO00o, null), this);
            if (objOooO00o != obj2) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
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
