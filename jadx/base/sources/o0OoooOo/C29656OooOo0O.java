package o0OoooOo;

import com.orion.notein.domain.models.note.Comment;
import java.util.List;
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

/* JADX INFO: renamed from: o0OoooOo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentViewModel$special$$inlined$flatMapLatest$2", m80623f = "EditorCommentViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C29656OooOo0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Comment>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f105154OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105155OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29652OooOOoo f105156OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105157OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29656OooOo0O(Continuation continuation, C29652OooOOoo c29652OooOOoo) {
        super(3, continuation);
        this.f105156OooOoO = c29652OooOOoo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Comment>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C29656OooOo0O c29656OooOo0O = new C29656OooOo0O(continuation, this.f105156OooOoO);
        c29656OooOo0O.f105154OooOo = interfaceC33723OooO0oO;
        c29656OooOo0O.f105157OooOoO0 = str;
        return c29656OooOo0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105155OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f105154OooOo;
            InterfaceC33721OooO0o<List<Comment>> interfaceC33721OooO0oOooO0OO = this.f105156OooOoO.f105133OooO0o0.OooO0OO((String) this.f105157OooOoO0);
            this.f105155OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooO0OO, this) == enumC32485OooO00o) {
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
