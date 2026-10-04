package o0Oo0o0o;

import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.addimage.ImageSizeAndRotationEditor;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import o0ooOOoo.C31660OooO0o0;
import o0ooOOoo.InterfaceC31656OooO0O0;

/* JADX INFO: renamed from: o0Oo0o0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28240OooOOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100082OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100083OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28240OooOOo0(Object obj, int i) {
        this.f100083OooOo0o = i;
        this.f100082OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100083OooOo0o) {
            case 0:
                ActivityC21897OooOo0 activity = ((ExportBottomSheetFragment) this.f100082OooOo).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openMembershipPlans();
                    return;
                }
                return;
            case 1:
                ImageSizeAndRotationEditor.OooO00o oooO00o = ((ImageSizeAndRotationEditor) this.f100082OooOo).eventListener;
                if (oooO00o != null) {
                    oooO00o.onCancel();
                    return;
                }
                return;
            case 2:
                EditText editText = ((EditorPreviewFragment) this.f100082OooOo).f75903Oooo0;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
            default:
                InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = ((C31660OooO0o0) this.f100082OooOo).f113165OooO0O0;
                if (interfaceC31656OooO0O0 != null) {
                    interfaceC31656OooO0O0.OooO0Oo();
                    return;
                }
                return;
        }
    }
}
