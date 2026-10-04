package o0OoO0oo;

import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
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

/* JADX INFO: renamed from: o0OoO0oo.o00o000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$getDualLinkRefById$2", m80623f = "NoteEditorViewModel.kt", m80624l = {895}, m80625m = "invokeSuspend")
public final class C28908o00o000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super DualLinkRef>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102423OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102424OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102425OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28908o00o000(C23344OooOOo c23344OooOOo, String str, Continuation<? super C28908o00o000> continuation) {
        super(2, continuation);
        this.f102423OooOo = c23344OooOOo;
        this.f102425OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28908o00o000(this.f102423OooOo, this.f102425OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super DualLinkRef> continuation) {
        return ((C28908o00o000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102424OooOo0o;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOo = this.f102423OooOo;
            C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
            String str = this.f102425OooOoO0;
            String str2 = (String) c23344OooOOo.f73589OoooOOo.getValue();
            this.f102424OooOo0o = 1;
            c27449o00O0OoO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOo0o.o00O0(str, str2, null, c27449o00O0OoO), this);
            return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        } catch (Exception unused) {
            return null;
        }
    }
}
