package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: o0OoO0oo.o00OO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$13$1", m80623f = "NoteEditorFragment.kt", m80624l = {4063}, m80625m = "invokeSuspend")
public final class C28858o00OO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102214OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102215OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f102216OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f102217OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28858o00OO0oO(float f, float f2, NoteEditorFragment noteEditorFragment, Continuation continuation) {
        super(2, continuation);
        this.f102214OooOo = noteEditorFragment;
        this.f102217OooOoO0 = f;
        this.f102216OooOoO = f2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28858o00OO0oO(this.f102217OooOoO0, this.f102216OooOoO, this.f102214OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28858o00OO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102215OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo = this.f102214OooOo.f73057o0OOO0o;
            C32443OooOOO c32443OooOOO = new C32443OooOOO(new Float(this.f102217OooOoO0), new Float(this.f102216OooOoO));
            this.f102215OooOo0o = 1;
            if (c33772OooooOo.emit(c32443OooOOO, this) == enumC32485OooO00o) {
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
