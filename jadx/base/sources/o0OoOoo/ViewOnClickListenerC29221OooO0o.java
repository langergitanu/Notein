package o0OoOoo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o00ooo.C30144OooO0OO;
import o0oOOooO.C30886OooO0oO;

/* JADX INFO: renamed from: o0OoOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29221OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103614OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103615OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29221OooO0o(Object obj, int i) {
        this.f103615OooOo0o = i;
        this.f103614OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103615OooOo0o) {
            case 0:
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = ((HyperLinkResizeEditor) this.f103614OooOo).f74506OooOo0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(OooO0OO.OooO00o.f74570OooOoOO, null);
                    return;
                } else {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
            case 1:
                FavoriteContainerFragment favoriteContainerFragment = (FavoriteContainerFragment) this.f103614OooOo;
                if (favoriteContainerFragment.f77473Oooo0 == null) {
                    NoteFilterBottomSheetDialog noteFilterBottomSheetDialog = new NoteFilterBottomSheetDialog();
                    favoriteContainerFragment.f77473Oooo0 = noteFilterBottomSheetDialog;
                    noteFilterBottomSheetDialog.f77824OooOoOO = new C30144OooO0OO(favoriteContainerFragment, 0);
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog2 = favoriteContainerFragment.f77473Oooo0;
                if (noteFilterBottomSheetDialog2 != null) {
                    noteFilterBottomSheetDialog2.OooOoO((List) favoriteContainerFragment.OooOoo0().f77155Oooo0o.getValue());
                }
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog3 = favoriteContainerFragment.f77473Oooo0;
                if (noteFilterBottomSheetDialog3 != null) {
                    noteFilterBottomSheetDialog3.show(favoriteContainerFragment.getChildFragmentManager(), "NoteTypeBottomSheetDialog");
                    return;
                }
                return;
            default:
                View.OnClickListener onClickListener = ((C30886OooO0oO) this.f103614OooOo).f110370OooO0o0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
