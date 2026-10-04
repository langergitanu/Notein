package com.orion.notein.p607ui.noteeditor.pagepadding;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0oOOO0o.C30825OooO0OO;
import o0oOOO0o.InterfaceC30836OooOOOO;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/pagepadding/PagePaddingDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "Lo0oOOO0o/OooOOOO;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PagePaddingDialogFragment extends Hilt_PagePaddingDialogFragment implements InterfaceC30836OooOOOO {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f74913Oooo000 = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30825OooO0OO.class), new OooO00o());

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PagePaddingDialogFragment pagePaddingDialogFragment = PagePaddingDialogFragment.this;
            Bundle arguments = pagePaddingDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + pagePaddingDialogFragment + " has null arguments");
        }
    }

    @Override // o0oOOO0o.InterfaceC30836OooOOOO
    public final void OooOOo(String noteId, String pageId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        getParentFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("note_id", noteId), new C32443OooOOO("page_id", pageId)), "key_result_page_padding");
        dismissAllowingStateLoss();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.page_padding_fragment_container);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_page_padding_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().OooOooO(R.id.page_padding_fragment_container) == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
            C24568OooO0oO c24568OooO0oO = this.f74913Oooo000;
            String str = ((C30825OooO0OO) c24568OooO0oO.getValue()).f110172OooO00o;
            String str2 = ((C30825OooO0OO) c24568OooO0oO.getValue()).f110173OooO0O0;
            PagePaddingFragment pagePaddingFragment = new PagePaddingFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("arg_note_id", str);
            bundle2.putString("arg_page_id", str2);
            pagePaddingFragment.setArguments(bundle2);
            oooO00o.OooO0o0(pagePaddingFragment, R.id.page_padding_fragment_container);
            oooO00o.OooO0oo();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }
}
