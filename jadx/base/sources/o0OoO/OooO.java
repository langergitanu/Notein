package o0OoO;

import android.view.View;
import com.facebook.soloader.OooOo;
import com.orion.editor.model.ClipboardData;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addimage.ImageCropEditor;
import com.orion.notein.p607ui.noteeditor.recognize.TextRecognizeDialogFragment;
import com.orion.penkit.models.TextBoxInfo;
import o00o00.C25206OooO0Oo;
import o0o0o00O.C30762OooO00o;
import o0ooOOoo.C31660OooO0o0;
import o0ooOOoo.InterfaceC31656OooO0O0;
import oO0OOooo.C33163OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101022OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101023OooOo0o;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f101023OooOo0o = i;
        this.f101022OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101023OooOo0o) {
            case 0:
                ImageCropEditor.OooO00o oooO00o = ((ImageCropEditor) this.f101022OooOo).eventListener;
                if (oooO00o != null) {
                    oooO00o.onCancel();
                }
                break;
            case 1:
                TextRecognizeDialogFragment textRecognizeDialogFragment = (TextRecognizeDialogFragment) this.f101022OooOo;
                C30762OooO00o c30762OooO00o = textRecognizeDialogFragment.f76167Oooo00o;
                if (c30762OooO00o != null) {
                    TextBoxInfo textBoxInfoOooOoo0 = textRecognizeDialogFragment.OooOoo0();
                    ClipboardData clipboardData = new ClipboardData();
                    clipboardData.f69321OooO00o = OooOo.OooO0oO(textBoxInfoOooOoo0);
                    c30762OooO00o.f110018OooO0O0.f73559OooOOoo.OooOOO(clipboardData);
                    C33163OooO0oO c33163OooO0oO = c30762OooO00o.f110019OooO0OO;
                    if (c33163OooO0oO != null) {
                        String string = c33163OooO0oO.getString(R.string.success_to_copy_to_clipboard);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(c33163OooO0oO, string);
                    }
                }
                break;
            default:
                InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = ((C31660OooO0o0) this.f101022OooOo).f113165OooO0O0;
                if (interfaceC31656OooO0O0 != null) {
                    interfaceC31656OooO0O0.OooO0o0();
                }
                break;
        }
    }
}
