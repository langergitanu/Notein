package o0o00oo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.SessionRenameDialogFragment;
import com.orion.notein.p607ui.paperconfig.components.PaperConfigPreview;
import com.orion.notein.p607ui.settings.GlobalSettingsContainerDialogFragment;
import o0Oo00o.C28026OooO0OO;
import o0o0OOOo.EnumC30546OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o00oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30096OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107162OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107163OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30096OooO0OO(Object obj, int i) {
        this.f107163OooOo0o = i;
        this.f107162OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f107163OooOo0o) {
            case 0:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) this.f107162OooOo;
                Context context = noteListContainerFragment.getContext();
                if (context == null) {
                    return;
                }
                if (!o0oo000O.OooOO0O.OooO00o(context)) {
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(noteListContainerFragment), R.id.f57962xa2516e2e, null);
                    return;
                } else {
                    if (noteListContainerFragment.getChildFragmentManager().OooOooo("globalSettingsContainerDialogFragment") == null) {
                        new GlobalSettingsContainerDialogFragment().show(noteListContainerFragment.getChildFragmentManager(), "globalSettingsContainerDialogFragment");
                        return;
                    }
                    return;
                }
            case 1:
                InterfaceC32507OooOO0o<? super EnumC30546OooO0O0, C32460OooOooO> interfaceC32507OooOO0o = ((PaperConfigPreview) this.f107162OooOo).onPreviewTypeClickListener;
                if (interfaceC32507OooOO0o != null) {
                    interfaceC32507OooOO0o.invoke(EnumC30546OooO0O0.f109264OooOo0o);
                    return;
                }
                return;
            default:
                EditText editText = ((SessionRenameDialogFragment) this.f107162OooOo).f78404Oooo0OO;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
        }
    }
}
