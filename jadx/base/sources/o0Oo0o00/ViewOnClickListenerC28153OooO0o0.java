package o0Oo0o00;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment.OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28153OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99774OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99775OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28153OooO0o0(Fragment fragment, int i) {
        this.f99775OooOo0o = i;
        this.f99774OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99775OooOo0o) {
            case 0:
                CloudSyncDetailsFragment cloudSyncDetailsFragment = (CloudSyncDetailsFragment) this.f99774OooOo;
                RecyclerView recyclerView = cloudSyncDetailsFragment.f71426Oooo0O0;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvUploadingQueue");
                    throw null;
                }
                boolean z = recyclerView.getVisibility() == 0;
                RecyclerView recyclerView2 = cloudSyncDetailsFragment.f71426Oooo0O0;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvUploadingQueue");
                    throw null;
                }
                recyclerView2.setVisibility(z ? 8 : 0);
                View view2 = cloudSyncDetailsFragment.f71422Oooo0;
                if (view2 != null) {
                    view2.setActivated(!z);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnUploadingQueueDetails");
                    throw null;
                }
            case 1:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f99774OooOo;
                baseToolbarChildFragment.Ooooo0o();
                baseToolbarChildFragment.OooooOO(3, null);
                return;
            case 2:
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f99774OooOo;
                if (myTemplateFragment.f78636OoooOOO == MyTemplateFragment.OooO00o.f78644OooOoO0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MyTemplateFragment");
                    c20358OooO00o.OooO00o("variant orientation click (books): PORTRAIT, selectorId=" + myTemplateFragment.OooOooo().f109034Oooo0o0.getValue() + ", tempColor=" + myTemplateFragment.OooOooo().f109026Oooo.getValue(), new Object[0]);
                    myTemplateFragment.OooOooo().OooOoO0(Orientation.PORTRAIT);
                    return;
                }
                return;
            default:
                StickerCollectionEditFragment stickerCollectionEditFragment = (StickerCollectionEditFragment) this.f99774OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = stickerCollectionEditFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, stickerCollectionEditFragment.new OooO0OO(null), 3);
                return;
        }
    }
}
