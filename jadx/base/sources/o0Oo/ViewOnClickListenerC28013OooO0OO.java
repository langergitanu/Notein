package o0Oo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.LocaleCountryCode;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.countrycode.CountryCodeSelectDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabNoteTypeFragment;
import com.orion.notein.p607ui.notelist.recover.RecoverNoteFromCloudDialogFragment;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o0OoO0oo.C28775o0000o0o;
import o0o0O00.C30207OooOo;
import o0oOoOoO.C31099OooO0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28013OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99349OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99350OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28013OooO0OO(Fragment fragment, int i) {
        this.f99350OooOo0o = i;
        this.f99349OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99350OooOo0o) {
            case 0:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.domain.models.LocaleCountryCode");
                String code = ((LocaleCountryCode) tag).getCode();
                if (code.length() == 0) {
                    return;
                }
                CountryCodeSelectDialogFragment countryCodeSelectDialogFragment = (CountryCodeSelectDialogFragment) this.f99349OooOo;
                C33781o00o0O c33781o00o0O = ((C28022OooOOO0) countryCodeSelectDialogFragment.f72135OooOooO.getValue()).f99370OooO0o0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, code);
                C21030OooOO0o.OooO0OO(countryCodeSelectDialogFragment).OooOOo0();
                return;
            case 1:
                Context contextRequireContext = ((FirebaseUserAuthFragment) this.f99349OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return;
            case 2:
                NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f99349OooOo;
                C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(noteEditorFragment);
                C24583OooOo0o c24583OooOo0oOooO0oO = c24572OooOO0oOooO0OO.OooO0oO();
                if (c24583OooOo0oOooO0oO == null || c24583OooOo0oOooO0oO.f83302OooOooO != R.id.noteEditorContainerFragment) {
                    return;
                }
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView != null) {
                    c24572OooOO0oOooO0OO.OooOOOO(new C28775o0000o0o(pDFView.getPageCount()));
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
            case 3:
                C30207OooOo.OooO00o oooO00o = ((FabNoteTypeFragment) this.f99349OooOo).f77468OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO0o0();
                    return;
                }
                return;
            default:
                ((RecoverNoteFromCloudDialogFragment) this.f99349OooOo).OooOoo0().f109507OooOOo0.OooOO0(null, Boolean.valueOf(!((Boolean) r4.getValue()).booleanValue()));
                return;
        }
    }
}
