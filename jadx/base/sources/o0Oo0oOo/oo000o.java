package o0Oo0oOo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import com.orion.notein.p607ui.creative_library.MaterialActionsBottomSheetDialog;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oo000o implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ DownloadedMaterialListFragment f100612OooOo0o;

    public /* synthetic */ oo000o(DownloadedMaterialListFragment downloadedMaterialListFragment) {
        this.f100612OooOo0o = downloadedMaterialListFragment;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        final C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
        View anchorView = (View) obj2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
        kotlin.jvm.internal.OooOOO0.OooO0oO(anchorView, "anchorView");
        final DownloadedMaterialListFragment downloadedMaterialListFragment = this.f100612OooOo0o;
        Context contextRequireContext = downloadedMaterialListFragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        if (o0oo000O.OooOO0O.OooO00o(contextRequireContext)) {
            View viewInflate = downloadedMaterialListFragment.getLayoutInflater().inflate(R.layout.popup_window_material_actions, (ViewGroup) null, false);
            int i = R.id.delete_icon;
            if (((ImageView) C24217OooO0O0.OooO0O0(R.id.delete_icon, viewInflate)) != null) {
                i = R.id.item_delete;
                ConstraintLayout constraintLayout = (ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.item_delete, viewInflate);
                if (constraintLayout != null) {
                    final PopupWindow popupWindow = new PopupWindow(viewInflate, Oooo0.o000000O.OooO0o(180), -2, false);
                    popupWindow.setOutsideTouchable(true);
                    popupWindow.setElevation(10.0f);
                    constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0oOo.o0OOO0o
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            popupWindow.dismiss();
                            C23033OooOO0o.OooO00o oooO00o = item;
                            downloadedMaterialListFragment.OooOoOO(oooO00o.f71088OooO00o, oooO00o.f71089OooO0O0);
                        }
                    });
                    int[] iArr = new int[2];
                    anchorView.getLocationOnScreen(iArr);
                    popupWindow.showAtLocation(anchorView, 0, iArr[0], anchorView.getHeight() + iArr[1]);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
        String materialId = item.f71088OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
        String materialTitle = item.f71089OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialTitle, "materialTitle");
        MaterialActionsBottomSheetDialog materialActionsBottomSheetDialog = new MaterialActionsBottomSheetDialog();
        materialActionsBottomSheetDialog.setArguments(BundleKt.bundleOf(new C32443OooOOO("arg_material_id", materialId), new C32443OooOOO("arg_material_title", materialTitle)));
        materialActionsBottomSheetDialog.show(downloadedMaterialListFragment.getChildFragmentManager(), "MaterialActionsBottomSheetDialog");
        return Boolean.TRUE;
    }
}
