package o0OoO0oo;

import com.orion.notein.domain.models.note.Comment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0OoO0oo.o000OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$getCommentsByNote$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {842}, m80625m = "invokeSuspend")
public final class C28804o000OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Comment>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101991OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101992OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28804o000OooO(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, Continuation<? super C28804o000OooO> continuation) {
        super(2, continuation);
        this.f101991OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28804o000OooO(this.f101991OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Comment>> continuation) {
        return ((C28804o000OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101992OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f101991OooOo;
        InterfaceC33721OooO0o<List<Comment>> interfaceC33721OooO0oOooO0OO = oooO0OO.f73356OooOO0O.OooO0OO(oooO0OO.OooOO0O());
        this.f101992OooOo0o = 1;
        Object objOooOOo = C25252OooO0Oo.OooOOo(interfaceC33721OooO0oOooO0OO, this);
        return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
    }
}
