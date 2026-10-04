package oO0OO;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o00o00o.C25275OooO0O0;
import o0o0OoO0.ActionModeCallbackC30671OooO;
import o0o0OoO0.ActionModeCallbackC30680OooOO0;
import o0oOoOo.C31030OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends AbstractC22050OooOo0o<C31030OooO00o, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C25275OooO0O0 f117984OooO0O0;

    /* JADX INFO: renamed from: oO0OO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20261OooO00o extends OooOOO.AbstractC22036OooO0o0<C31030OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20261OooO00o f117985OooO00o = new C20261OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31030OooO00o c31030OooO00o, C31030OooO00o c31030OooO00o2) {
            return c31030OooO00o.equals(c31030OooO00o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31030OooO00o c31030OooO00o, C31030OooO00o c31030OooO00o2) {
            return OooOOO0.OooO0O0(c31030OooO00o.f110773OooO00o, c31030OooO00o2.f110773OooO00o);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31030OooO00o c31030OooO00o, C31030OooO00o c31030OooO00o2) {
            C31030OooO00o c31030OooO00o3 = c31030OooO00o;
            C31030OooO00o c31030OooO00o4 = c31030OooO00o2;
            Bundle bundle = new Bundle();
            int i = c31030OooO00o3.f110774OooO0O0;
            int i2 = c31030OooO00o4.f110774OooO0O0;
            if (i != i2) {
                bundle.putInt("page_index", i2);
            }
            String str = c31030OooO00o3.f110775OooO0OO;
            String str2 = c31030OooO00o4.f110775OooO0OO;
            if (!OooOOO0.OooO0O0(str, str2)) {
                bundle.putString("page_content", str2);
            }
            boolean z = c31030OooO00o3.f110776OooO0Oo;
            boolean z2 = c31030OooO00o4.f110776OooO0Oo;
            if (z != z2) {
                bundle.putBoolean("selected", z2);
            }
            return bundle;
        }
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AiOcrRichEditor f117986OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f117987OooO0O0;

        public OooO0O0(View view) {
            super(view);
            AiOcrRichEditor aiOcrRichEditor = (AiOcrRichEditor) view.findViewById(R.id.et_result);
            this.f117986OooO00o = aiOcrRichEditor;
            this.f117987OooO0O0 = view.findViewById(R.id.v_highlight_mask);
            aiOcrRichEditor.setPivotX(0.0f);
            aiOcrRichEditor.setPivotY(0.0f);
            aiOcrRichEditor.setCustomSelectionActionModeCallback(new ActionModeCallbackC30671OooO());
            aiOcrRichEditor.setCustomInsertionActionModeCallback(new ActionModeCallbackC30680OooOO0());
        }

        public final void OooO00o(final C31030OooO00o c31030OooO00o, Bundle bundle) {
            final OooO00o oooO00o = OooO00o.this;
            View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: oO0OO.OooO0O0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    C25275OooO0O0 c25275OooO0O0 = oooO00o.f117984OooO0O0;
                    if (c25275OooO0O0 != null) {
                        OooOOO0.OooO0Oo(view);
                        C31030OooO00o c31030OooO00o2 = c31030OooO00o;
                        AiOcrRichEditor aiOcrRichEditor = (AiOcrRichEditor) view;
                        TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) c25275OooO0O0.f86025OooO00o;
                        String pageId = c31030OooO00o2.f110773OooO00o;
                        if (!z) {
                            AiOcrEditorListContainer aiOcrEditorListContainer = textRecognizeFragment.f78179OoooO0;
                            if (aiOcrEditorListContainer != null) {
                                aiOcrEditorListContainer.OooO0Oo(pageId, aiOcrRichEditor);
                                return;
                            } else {
                                OooOOO0.OooOOOO("editorListContainer");
                                throw null;
                            }
                        }
                        AiOcrEditorListContainer aiOcrEditorListContainer2 = textRecognizeFragment.f78179OoooO0;
                        if (aiOcrEditorListContainer2 == null) {
                            OooOOO0.OooOOOO("editorListContainer");
                            throw null;
                        }
                        OooOOO0.OooO0oO(pageId, "pageId");
                        if (OooOOO0.OooO0O0(aiOcrEditorListContainer2.f78423OooOoO, pageId) && OooOOO0.OooO0O0(aiOcrEditorListContainer2.f78424OooOoO0, aiOcrRichEditor)) {
                            return;
                        }
                        aiOcrEditorListContainer2.OooO0Oo(pageId, aiOcrEditorListContainer2.f78424OooOoO0);
                        aiOcrEditorListContainer2.f78423OooOoO = pageId;
                        aiOcrEditorListContainer2.f78424OooOoO0 = aiOcrRichEditor;
                        AiOcrEditorListContainer.OooO0OO oooO0OO = aiOcrEditorListContainer2.f78441OoooO;
                        aiOcrRichEditor.setRTEditTextListener(oooO0OO);
                        AiOcrRichEditor aiOcrRichEditor2 = aiOcrEditorListContainer2.f78424OooOoO0;
                        if (aiOcrRichEditor2 != null) {
                            aiOcrRichEditor2.setOnKeyListener(aiOcrEditorListContainer2.f78445OoooOO0);
                        }
                        AiOcrRichEditor aiOcrRichEditor3 = aiOcrEditorListContainer2.f78424OooOoO0;
                        if (aiOcrRichEditor3 != null) {
                            int selectionStart = aiOcrRichEditor3.getSelectionStart();
                            int selectionEnd = aiOcrRichEditor3.getSelectionEnd();
                            if (selectionStart == -1 || selectionEnd == -1) {
                                return;
                            }
                            oooO0OO.onSelectionChanged(aiOcrRichEditor3, selectionStart, selectionEnd, 4);
                        }
                    }
                }
            };
            AiOcrRichEditor aiOcrRichEditor = this.f117986OooO00o;
            aiOcrRichEditor.setOnFocusChangeListener(onFocusChangeListener);
            String str = c31030OooO00o.f110775OooO0OO;
            if (bundle == null || bundle.isEmpty()) {
                aiOcrRichEditor.setRichTextEditing(true, str);
                OooO0O0(c31030OooO00o);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str2 : setKeySet) {
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 1191572123) {
                        if (iHashCode != 1446198985) {
                            if (iHashCode == 1620412194 && str2.equals("page_index")) {
                            }
                        } else if (str2.equals("page_content")) {
                            if (!aiOcrRichEditor.isFocused()) {
                                aiOcrRichEditor.setRichTextEditing(true, str);
                            }
                        }
                    } else if (str2.equals("selected")) {
                        OooO0O0(c31030OooO00o);
                    }
                }
                aiOcrRichEditor.setRichTextEditing(true, str);
                OooO0O0(c31030OooO00o);
            }
        }

        public final void OooO0O0(C31030OooO00o c31030OooO00o) {
            this.f117987OooO0O0.setVisibility(c31030OooO00o.f110776OooO0Oo ? 0 : 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31030OooO00o c31030OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31030OooO00oOooO0OO, "getItem(...)");
        holder.OooO00o(c31030OooO00oOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_text_editor_page, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        C31030OooO00o c31030OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31030OooO00oOooO0OO, "getItem(...)");
        holder.OooO00o(c31030OooO00oOooO0OO, (Bundle) obj);
    }
}
