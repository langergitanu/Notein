package oO0Oo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0o0OO0.C30389OooOO0;
import o0o0OO0.C30394OooOOOO;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: oO0Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$handleCopyButtonClicked$1", m80623f = "TextRecognizeFragment.kt", m80624l = {406}, m80625m = "invokeSuspend")
public final class C33176OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120059OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120060OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33176OooOOo0(TextRecognizeFragment textRecognizeFragment, Continuation<? super C33176OooOOo0> continuation) {
        super(2, continuation);
        this.f120059OooOo = textRecognizeFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33176OooOOo0(this.f120059OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33176OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Editable text;
        ClipData clipDataOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120060OooOo0o;
        TextRecognizeFragment textRecognizeFragment = this.f120059OooOo;
        boolean zBooleanValue = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AiOcrEditorListContainer aiOcrEditorListContainer = textRecognizeFragment.f78179OoooO0;
            if (aiOcrEditorListContainer == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
                throw null;
            }
            AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
            Editable text2 = aiOcrRichEditor != null ? aiOcrRichEditor.getText() : null;
            if (text2 != null && text2.length() != 0) {
                AiOcrEditorListContainer aiOcrEditorListContainer2 = textRecognizeFragment.f78179OoooO0;
                if (aiOcrEditorListContainer2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
                    throw null;
                }
                AiOcrRichEditor aiOcrRichEditor2 = aiOcrEditorListContainer2.f78424OooOoO0;
                if (aiOcrRichEditor2 == null || (text = aiOcrRichEditor2.getText()) == null || (clipDataOooO00o = aiOcrRichEditor2.OooO00o(0, text.length())) == null) {
                    zBooleanValue = false;
                } else {
                    aiOcrRichEditor2.OooO0OO(clipDataOooO00o);
                }
                if (zBooleanValue) {
                    Context context = textRecognizeFragment.getContext();
                    if (context != null) {
                        String string = textRecognizeFragment.getString(R.string.failed_to_copy_to_clipboard);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string);
                    }
                } else {
                    Context context2 = textRecognizeFragment.getContext();
                    if (context2 != null) {
                        String string2 = textRecognizeFragment.getString(R.string.success_to_copy_to_clipboard);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context2, string2);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            oO0OO.OooO00o oooO00o = textRecognizeFragment.f78178OoooO;
            if (oooO00o == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
                throw null;
            }
            if (oooO00o.getItemCount() > 100) {
                if (textRecognizeFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TextRecognizeFragment");
                    c20358OooO00o.OooO00o("handleCopyButtonClicked: TipsDialogFragment is already shown", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                String string3 = textRecognizeFragment.getString(R.string.title_dialog_copy_text_too_large);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                String string4 = textRecognizeFragment.getString(R.string.content_dialog_copy_text_too_large);
                kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                new TipsDialogFragment(string3, string4, null, null).show(textRecognizeFragment.getChildFragmentManager(), "TipsDialogFragment");
                return C32460OooOooO.f116667OooO00o;
            }
            C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
            Context contextRequireContext = textRecognizeFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            this.f120060OooOo0o = 1;
            Object systemService = contextRequireContext.getSystemService("clipboard");
            kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30389OooOO0(c30394OooOOOOOooo00O, (ClipboardManager) systemService, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
