package o0OoOoo0;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.pageeditor.PageOperationTipsDialogFragment;
import o0o00oO0.C29997OooOo0;

/* JADX INFO: renamed from: o0OoOoo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29234OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103662OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103663OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29234OooOO0(Object obj, int i) {
        this.f103663OooOo0o = i;
        this.f103662OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103663OooOo0o) {
            case 0:
                ((LatestOpenedNoteTabFragment) this.f103662OooOo).OooOoOO().Oooo00O(true);
                break;
            case 1:
                C29997OooOo0 c29997OooOo0 = (C29997OooOo0) this.f103662OooOo;
                C21030OooOO0o.OooO0o0(c29997OooOo0.f106571OooOo0o, c29997OooOo0.f106570OooOo);
                break;
            case 2:
                View.OnClickListener onClickListener = ((o0o0O.OooO0O0) this.f103662OooOo).f107404OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            default:
                C21030OooOO0o.OooO0OO((PageOperationTipsDialogFragment) this.f103662OooOo).OooOOo0();
                break;
        }
    }
}
