package o0Oo0o0o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.ui.noteeditor.NoteEditorContainerFragment.OooOOOO;
import o0OoO0oo.C28982oo0o0Oo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0o0o.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28242OooOo0 implements InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100089OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100090OooOo0o;

    public /* synthetic */ C28242OooOo0(Fragment fragment, int i) {
        this.f100090OooOo0o = i;
        this.f100089OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public final void OooO0OO(Bundle bundle, String str) {
        String id;
        Fragment fragment = this.f100089OooOo;
        switch (this.f100090OooOo0o) {
            case 0:
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("key_bundle_for_text");
                if (string != null) {
                    ExportBottomSheetFragment exportBottomSheetFragment = (ExportBottomSheetFragment) fragment;
                    if (!C33599OooOo0O.Oooo0o0(string)) {
                        exportBottomSheetFragment.Oooo000().OooO0o(string);
                        exportBottomSheetFragment.Oooo000().OooO0o0(C23110OooO0oo.OooO00o.f71800OooOoOO);
                    } else {
                        com.orion.notein.p607ui.export.OooO0O0 oooO0O0Oooo000 = exportBottomSheetFragment.Oooo000();
                        String string2 = exportBottomSheetFragment.getString(R.string.app_name);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        oooO0O0Oooo000.OooO0o(string2);
                        exportBottomSheetFragment.Oooo000().OooO0o0(C23110OooO0oo.OooO00o.f71799OooOoO0);
                    }
                }
                break;
            case 1:
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) fragment;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                String string3 = bundle.getString(NoteMeta.PROPERTY_TITLE);
                String str2 = string3 == null ? "" : string3;
                String string4 = bundle.getString("page_id");
                String str3 = string4 == null ? "" : string4;
                NoteContent noteContent = (NoteContent) noteEditorContainerFragment.Oooo00O().f73396OoooOoO.f121747OooOo0o.getValue();
                String str4 = (noteContent == null || (id = noteContent.getId()) == null) ? "" : id;
                androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new OooOOOO(str4, str3, str2, null), 2);
                break;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                int i = bundle.getInt(C18437z2.f56754h);
                String string5 = bundle.getString("id");
                String str5 = string5 == null ? "" : string5;
                String string6 = bundle.getString("new_name");
                String str6 = string6 == null ? "" : string6;
                EditorPreviewFragment editorPreviewFragment = (EditorPreviewFragment) fragment;
                InterfaceC21987OooOoo viewLifecycleOwner = editorPreviewFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o2 = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new EditorPreviewFragment.OooO00o(str5, str6, editorPreviewFragment, i, null), 2);
                break;
        }
    }
}
