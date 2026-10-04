package o0Oo0o0o;

import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.UrlLinkDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.NewCommentDialogFragment;

/* JADX INFO: renamed from: o0Oo0o0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28233OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f100071OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100072OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28233OooOO0O(DialogFragment dialogFragment, int i) {
        this.f100072OooOo0o = i;
        this.f100071OooOo = dialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100072OooOo0o) {
            case 0:
                ((ExportBottomSheetFragment) this.f100071OooOo).OooOooo().OooO0oo(2);
                return;
            case 1:
                EditText editText = ((UrlLinkDialogFragment) this.f100071OooOo).f74667Oooo0;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            default:
                EditText editText2 = ((NewCommentDialogFragment) this.f100071OooOo).f75789OooOooo;
                if (editText2 != null) {
                    editText2.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
        }
    }
}
