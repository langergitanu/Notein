package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
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

/* JADX INFO: renamed from: o0OoO0oo.o00oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$special$$inlined$flatMapLatest$1", m80623f = "NoteEditorViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C28941o00oO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteContent>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f102537OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f102540OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28941o00oO0(C23344OooOOo c23344OooOOo, Continuation continuation) {
        super(3, continuation);
        this.f102539OooOoO = c23344OooOOo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super NoteContent> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C28941o00oO0 c28941o00oO0 = new C28941o00oO0(this.f102539OooOoO, continuation);
        c28941o00oO0.f102537OooOo = interfaceC33723OooO0oO;
        c28941o00oO0.f102540OooOoO0 = str;
        return c28941o00oO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102538OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f102537OooOo;
            InterfaceC33721OooO0o<NoteContent> interfaceC33721OooO0oOoooO00 = this.f102539OooOoO.f73545OooO0Oo.OoooO00((String) this.f102540OooOoO0);
            this.f102538OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = interfaceC33721OooO0oOoooO00.collect(new C28923o00o0OO0(interfaceC33723OooO0oO), this);
            if (objCollect != obj2) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != obj2) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == obj2) {
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
