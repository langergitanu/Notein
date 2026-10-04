package o0o0OO;

import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO.C26410OooOOOo;
import o0OOo0o.C27447o00O0Oo;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0OO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$special$$inlined$flatMapLatest$2", m80623f = "TiledPageViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30375OooOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteContent>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108414OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108415OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108416OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108417OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30375OooOo0(Continuation continuation, C30367OooO0o0 c30367OooO0o0) {
        super(3, continuation);
        this.f108416OooOoO = c30367OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super NoteContent> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C30375OooOo0 c30375OooOo0 = new C30375OooOo0(continuation, this.f108416OooOoO);
        c30375OooOo0.f108414OooOo = interfaceC33723OooO0oO;
        c30375OooOo0.f108417OooOoO0 = str;
        return c30375OooOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108415OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f108414OooOo;
            String noteId = (String) this.f108417OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = this.f108416OooOoO.f108328OooO0Oo;
            c27449o00O0OoO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            C26410OooOOOo c26410OooOOOoOooO00o = c27449o00O0OoO.f96035OooO00o.OooO00o(noteId);
            this.f108415OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = c26410OooOOOoOooO00o.collect(new C27447o00O0Oo(new C30368OooO0oO(interfaceC33723OooO0oO), c27449o00O0OoO), this);
            if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
