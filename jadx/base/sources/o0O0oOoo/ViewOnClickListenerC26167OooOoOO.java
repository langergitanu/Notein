package o0O0oOoo;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import com.orion.niui.components.button.SelectableTextButtonGroupView;
import com.orion.niui.components.button.SelectableTextButtonView;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import com.orion.penkit.models.QuoteInfo;
import java.util.List;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: renamed from: o0O0oOoo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26167OooOoOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f89311OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89312OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f89313OooOoO0;

    public /* synthetic */ ViewOnClickListenerC26167OooOoOO(ViewGroup viewGroup, Object obj, int i) {
        this.f89312OooOo0o = i;
        this.f89311OooOo = viewGroup;
        this.f89313OooOoO0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        List<String> list;
        Object obj = this.f89313OooOoO0;
        ViewGroup viewGroup = this.f89311OooOo;
        switch (this.f89312OooOo0o) {
            case 0:
                int i = SelectableTextButtonGroupView.f69474OooOoo0;
                SelectableTextButtonGroupView selectableTextButtonGroupView = (SelectableTextButtonGroupView) viewGroup;
                selectableTextButtonGroupView.getClass();
                SelectableTextButtonGroupView.OooO0OO((SelectableTextButtonView) obj);
                int iOrdinal = selectableTextButtonGroupView.f69476OooOo0o.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    throw new C32442OooOO0o();
                }
                throw null;
            default:
                TextAnnoTextEditor textAnnoTextEditor = (TextAnnoTextEditor) viewGroup;
                TextAnnoTextEditor.OooO00o oooO00o = textAnnoTextEditor.f76414Oooo0oo;
                if (oooO00o == null || (text = oooO00o.f76417OooO00o.getText()) == null) {
                    return;
                }
                QuoteInfo quoteInfo = (QuoteInfo) ((o0o000OO.OooOO0O) obj).f105543OooOOo.getValue();
                List<String> annoItemIdList = quoteInfo != null ? quoteInfo.getAnnoItemIdList() : null;
                if (text.length() <= 0 && ((list = annoItemIdList) == null || list.isEmpty())) {
                    return;
                }
                textAnnoTextEditor.OooO0Oo();
                textAnnoTextEditor.OooO0OO();
                return;
        }
    }
}
