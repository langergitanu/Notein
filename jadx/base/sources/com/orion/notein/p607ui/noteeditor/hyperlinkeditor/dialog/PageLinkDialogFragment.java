package com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog;

import android.os.Bundle;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o0o.ViewOnClickListenerC28224OooO00o;
import o0OoO.OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/dialog/PageLinkDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageLinkDialogFragment extends Hilt_PageLinkDialogFragment {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f74665Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f74666Oooo00O;

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_set_page_link_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        this.f74665Oooo000 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28224OooO00o(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_confirm);
        this.f74666Oooo00O = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new OooO0O0(this, 1));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
