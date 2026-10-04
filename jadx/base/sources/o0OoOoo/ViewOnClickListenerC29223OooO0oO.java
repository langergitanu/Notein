package o0OoOoo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0oOOooO.C30887OooO0oo;

/* JADX INFO: renamed from: o0OoOoo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29223OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103618OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103619OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29223OooO0oO(Object obj, int i) {
        this.f103619OooOo0o = i;
        this.f103618OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103619OooOo0o) {
            case 0:
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = ((HyperLinkResizeEditor) this.f103618OooOo).f74506OooOo0o;
                if (oooO0OO == null) {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                oooO0OO.f74564OooOOO0 = null;
                oooO0OO.OooO0oo(OooO0OO.OooO00o.f74571OooOoo, null);
                return;
            case 1:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) this.f103618OooOo), new C24564OooO00o(R.id.action_globalSettingsFragment_to_globalSettingsLanguageFragment));
                return;
            default:
                View.OnClickListener onClickListener = ((C30887OooO0oo) this.f103618OooOo).f110381OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
