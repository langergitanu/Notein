package o0OoO0oo;

import android.widget.TextView;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoEditorPanel;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00Oo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$insertEditorTextAnno$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28880o00Oo0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102332OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28880o00Oo0oO(NoteEditorFragment noteEditorFragment, Continuation<? super C28880o00Oo0oO> continuation) {
        super(2, continuation);
        this.f102332OooOo0o = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28880o00Oo0oO(this.f102332OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28880o00Oo0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        TextAnnoEditorPanel textAnnoEditorPanelOoooOOo = this.f102332OooOo0o.OoooOOo();
        if (textAnnoEditorPanelOoooOOo == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        if (textAnnoEditorPanelOoooOOo.getVisibility() == 0) {
            textAnnoEditorPanelOoooOOo.OooO0O0(true);
        } else {
            textAnnoEditorPanelOoooOOo.setVisibility(0);
            TextView textView = textAnnoEditorPanelOoooOOo.f76393OooOoO0;
            if (textView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("insertTips");
                throw null;
            }
            textView.setVisibility(0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
