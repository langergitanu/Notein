package o0o0OO0O;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pageeditor.ChooseNoteDialogFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OO0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$onConfirmBtnClick$1", m80623f = "ChooseNoteDialogFragment.kt", m80624l = {134}, m80625m = "invokeSuspend")
public final class C30424OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ChooseNoteDialogFragment f108681OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108682OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30424OooO0O0(ChooseNoteDialogFragment chooseNoteDialogFragment, Continuation<? super C30424OooO0O0> continuation) {
        super(2, continuation);
        this.f108681OooOo = chooseNoteDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30424OooO0O0(this.f108681OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30424OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Context context;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108682OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108682OooOo0o = 1;
            if (C33644OoooO0.OooO00o(500L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        ChooseNoteDialogFragment chooseNoteDialogFragment = this.f108681OooOo;
        int i2 = ((C30425OooO0OO) chooseNoteDialogFragment.f78451OooOooo.getValue()).f108683OooO00o;
        if (i2 == 0) {
            Context context2 = chooseNoteDialogFragment.getContext();
            if (context2 != null) {
                String string = chooseNoteDialogFragment.getString(R.string.toast_guide_of_copy_page);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context2, string);
            }
        } else if (i2 == 1 && (context = chooseNoteDialogFragment.getContext()) != null) {
            String string2 = chooseNoteDialogFragment.getString(R.string.toast_guide_of_move_page);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
