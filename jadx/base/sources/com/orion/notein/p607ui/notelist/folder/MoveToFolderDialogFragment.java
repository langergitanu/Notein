package com.orion.notein.p607ui.notelist.folder;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0o0O000.InterfaceC30233OooOoo0;
import o0o0O000.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/folder/MoveToFolderDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "Lo0o0O000/OooOoo0;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MoveToFolderDialogFragment extends Hilt_MoveToFolderDialogFragment implements InterfaceC30233OooOoo0 {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f77656Oooo000 = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(OooOOO0.class), new OooO00o());

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            MoveToFolderDialogFragment moveToFolderDialogFragment = MoveToFolderDialogFragment.this;
            Bundle arguments = moveToFolderDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + moveToFolderDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.move_to_folder_fragment_container);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_move_to_folder_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().OooOooO(R.id.move_to_folder_fragment_container) == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
            ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr = ((OooOOO0) this.f77656Oooo000.getValue()).f107668OooO00o;
            MoveToFolderFragment moveToFolderFragment = new MoveToFolderFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArray("item_data_list", itemDataOfMovingToFolderArr);
            moveToFolderFragment.setArguments(bundle2);
            oooO00o.OooO0o0(moveToFolderFragment, R.id.move_to_folder_fragment_container);
            oooO00o.OooO0oo();
        }
    }
}
