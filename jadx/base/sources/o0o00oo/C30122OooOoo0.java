package o0o00oo;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import kotlin.coroutines.Continuation;
import o0o00oOo.C30059Oooo0o0;
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

/* JADX INFO: renamed from: o0o00oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$performCreateScratchForNotesRole$noteId$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1468}, m80625m = "invokeSuspend")
public final class C30122OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107249OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107250OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30122OooOoo0(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30122OooOoo0> continuation) {
        super(2, continuation);
        this.f107249OooOo = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30122OooOoo0(this.f107249OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C30122OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107250OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        NoteListContainerFragment noteListContainerFragment = this.f107249OooOo;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
        String string = noteListContainerFragment.getString(R.string.note_title_scratch);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        this.f107250OooOo0o = 1;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30059Oooo0o0(oooO0OOOooOoo, string, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
