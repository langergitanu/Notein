package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoO0oo.o00oO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$special$$inlined$flatMapLatest$2", m80623f = "NoteEditorViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C28946o00oO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteMeta>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f102553OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102554OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102555OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f102556OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28946o00oO0O0(C23344OooOOo c23344OooOOo, Continuation continuation) {
        super(3, continuation);
        this.f102555OooOoO = c23344OooOOo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super NoteMeta> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C28946o00oO0O0 c28946o00oO0O0 = new C28946o00oO0O0(this.f102555OooOoO, continuation);
        c28946o00oO0O0.f102553OooOo = interfaceC33723OooO0oO;
        c28946o00oO0O0.f102556OooOoO0 = str;
        return c28946o00oO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102554OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f102553OooOo;
            InterfaceC33721OooO0o<NoteMeta> interfaceC33721OooO0oOooOoO = this.f102555OooOoO.f73545OooO0Oo.OooOoO((String) this.f102556OooOoO0);
            this.f102554OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = ((o0O0oooO.o000O00) interfaceC33721OooO0oOooOoO).collect(new C28924o00o0OOO(interfaceC33723OooO0oO), this);
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
