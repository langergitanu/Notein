package o0OoOO0o;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.aspose.slides.C22200OooO0o0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0OoO0oo.C28755o00000o0;
import o0OoooOo.C29635OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0OoOO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29034OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102856OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102857OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29034OooO00o(Object obj, int i) {
        this.f102857OooOo0o = i;
        this.f102856OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final NoteEditorContainerFragment noteEditorContainerFragment;
        ImportImagesFragment importImagesFragment;
        Object obj = this.f102856OooOo;
        switch (this.f102857OooOo0o) {
            case 0:
                EditText editText = ((TemplateRenameDialogFragment) obj).f73960Oooo0OO;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 1:
                ViewOnClickListenerC26295OoooO00 viewOnClickListenerC26295OoooO00 = ((C29635OooO00o) obj).f105080OooO0O0;
                if (viewOnClickListenerC26295OoooO00 != null) {
                    viewOnClickListenerC26295OoooO00.onClick(view);
                    return;
                }
                return;
            case 2:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) obj;
                baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                switch (view.getId()) {
                    case R.id.add_from_camera /* 2131296674 */:
                        C28755o00000o0 c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO;
                        if (c28755o00000o0 != null) {
                            c28755o00000o0.OooO0O0();
                            return;
                        }
                        return;
                    case R.id.add_from_gallery /* 2131296675 */:
                        C28755o00000o0 c28755o00000o02 = baseToolbarChildFragment.f76506o000oOoO;
                        if (c28755o00000o02 == null || (importImagesFragment = (noteEditorContainerFragment = c28755o00000o02.f101844OooO00o).f72825OoooO0O) == null) {
                            return;
                        }
                        importImagesFragment.OooOoOO(new InterfaceC32507OooOO0o() { // from class: o0OoO0oo.o00oO0O
                            @Override // oO0O000o.InterfaceC32507OooOO0o
                            public final Object invoke(Object obj2) {
                                List uris = (List) obj2;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(uris, "uris");
                                noteEditorContainerFragment.Oooo0OO(1, uris);
                                return C32460OooOooO.f116667OooO00o;
                            }
                        });
                        return;
                    default:
                        return;
                }
            case 3:
                com.orion.notein.p607ui.notelist.OooO00o oooO00o = (com.orion.notein.p607ui.notelist.OooO00o) obj;
                ItemData itemData = oooO00o.f77107OooO0Oo;
                if (itemData != null) {
                    oooO00o.f77105OooO0O0.OooO00o(itemData);
                    if (C32460OooOooO.f116667OooO00o != null) {
                        return;
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ItemLabelListPopupWindow");
                c20358OooO00o.OooO0OO("itemData is null", new Object[0]);
                return;
            default:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = DebugFragment.f79020Oooo0OO;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("text/xml");
                intent.putExtra("android.intent.extra.TITLE", C22200OooO0o0.OooO0O0(System.currentTimeMillis(), "report-", ".xml"));
                ((DebugFragment) obj).f79029Oooo00o.OooO00o(intent);
                return;
        }
    }
}
