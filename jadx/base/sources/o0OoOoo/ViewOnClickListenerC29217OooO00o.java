package o0OoOoo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.notein.p607ui.settings.GlobalSettingsContainerFragment;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24586OooOoOO;

/* JADX INFO: renamed from: o0OoOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29217OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103605OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103606OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f103607OooOoO0;

    public /* synthetic */ ViewOnClickListenerC29217OooO00o(int i, Object obj, Object obj2) {
        this.f103606OooOo0o = i;
        this.f103605OooOo = obj;
        this.f103607OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103606OooOo0o) {
            case 0:
                CardView cardView = ((HyperLinkEditorPanel) this.f103605OooOo).pageLinkDialog;
                if (cardView == null) {
                    OooOOO0.OooOOOO("pageLinkDialog");
                    throw null;
                }
                cardView.setVisibility(8);
                ((com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO) this.f103607OooOoO0).OooO0oo(OooO0OO.OooO00o.f74574OooOooo, null);
                return;
            default:
                C24586OooOoOO c24586OooOoOO = (C24586OooOoOO) this.f103605OooOo;
                if (c24586OooOoOO == null || !c24586OooOoOO.OooOOOo()) {
                    C21030OooOO0o.OooO0OO((GlobalSettingsContainerFragment) this.f103607OooOoO0).OooOOo0();
                    return;
                }
                return;
        }
    }
}
