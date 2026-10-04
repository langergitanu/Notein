package o0OoO0oo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import kotlin.coroutines.Continuation;
import o0Oo0o00.C28201OooooO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o0000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$syncSingleNote$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {EditingLanguage.MALAY_BRUNEI_DARUSSALAM}, m80625m = "invokeSuspend")
public final class C28758o0000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101849OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101850OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101851OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28758o0000O(NoteEditorContainerFragment noteEditorContainerFragment, String str, Continuation<? super C28758o0000O> continuation) {
        super(2, continuation);
        this.f101849OooOo = noteEditorContainerFragment;
        this.f101851OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28758o0000O(this.f101849OooOo, this.f101851OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28758o0000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101850OooOo0o;
        String str = this.f101851OooOoO0;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101849OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            noteEditorContainerFragment.Oooo00O().Oooo0O0(str, true);
            C28201OooooO0 c28201OooooO0 = (C28201OooooO0) noteEditorContainerFragment.f72809OooOooO.getValue();
            this.f101850OooOo0o = 1;
            if (c28201OooooO0.OooOOO0(str, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            ((C32445OooOOOO) obj).getClass();
        }
        noteEditorContainerFragment.Oooo00O().Oooo0O0(str, false);
        return C32460OooOooO.f116667OooO00o;
    }
}
