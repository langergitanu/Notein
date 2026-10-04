package com.orion.notein.p607ui.noteeditor.pagelayereditor.popup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import o0OoooO0.C29631OooO0O0;
import o0oOOOoo.C30837OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/pagelayereditor/popup/LayerMoreActionsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LayerMoreActionsBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ViewOnClickListenerC26051OoooOOo f74894OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C30837OooO00o f74895OooOoO0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_layer_actions, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C29631OooO0O0 c29631OooO0O0 = new C29631OooO0O0(view, this.f74894OooOoO);
        C30837OooO00o c30837OooO00o = this.f74895OooOoO0;
        if (c30837OooO00o != null) {
            Iterator it = c29631OooO0O0.f105063OooO0OO.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setTag(c30837OooO00o);
            }
        }
    }
}
