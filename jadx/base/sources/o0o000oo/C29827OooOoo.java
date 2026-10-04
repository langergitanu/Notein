package o0o000oo;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnAnnotationBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1533}, m80625m = "invokeSuspend")
public final class C29827OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105818OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105819OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29827OooOoo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29827OooOoo> continuation) {
        super(2, continuation);
        this.f105818OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29827OooOoo(this.f105818OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29827OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105819OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105818OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f105819OooOo0o = 1;
            obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 33, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        NoteContent noteContent = (NoteContent) baseToolbarChildFragment.Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
        String id = noteContent != null ? noteContent.getId() : null;
        if (id == null || id.length() == 0) {
            return C32460OooOooO.f116667OooO00o;
        }
        baseToolbarChildFragment.OooooOO(28, null);
        return C32460OooOooO.f116667OooO00o;
    }
}
