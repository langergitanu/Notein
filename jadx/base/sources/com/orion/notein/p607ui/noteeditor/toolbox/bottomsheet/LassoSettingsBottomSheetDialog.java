package com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29933OooO0Oo;
import o0o00oO0.C30012Oooo0o;
import o0oOoOo.C31056OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/bottomsheet/LassoSettingsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lo0o00o0/OooO0Oo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LassoSettingsBottomSheetDialog extends PhoneBottomSheetDialog implements InterfaceC29933OooO0Oo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29936OooO0oO f76821OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31056OooOoo f76822OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30012Oooo0o f76823OooOoOO;

    @Override // o0o00o0.InterfaceC29933OooO0Oo
    public final void OooO00o() {
        C30012Oooo0o c30012Oooo0o = this.f76823OooOoOO;
        if (c30012Oooo0o != null) {
            c30012Oooo0o.OooO00o();
        }
    }

    @Override // o0o00o0.InterfaceC29933OooO0Oo
    public final void OooO0O0(List<PenColorVO> list) {
        OooOOO0.OooO0oO(list, "list");
        C30012Oooo0o c30012Oooo0o = this.f76823OooOoOO;
        if (c30012Oooo0o != null) {
            c30012Oooo0o.OooO0O0(list);
        }
    }

    @Override // o0o00o0.InterfaceC29933OooO0Oo
    public final void OooOo0(List<String> list) {
        C30012Oooo0o c30012Oooo0o = this.f76823OooOoOO;
        if (c30012Oooo0o != null) {
            c30012Oooo0o.OooOo0(list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_lasso_settings, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30012Oooo0o c30012Oooo0o = new C30012Oooo0o(view);
        this.f76823OooOoOO = c30012Oooo0o;
        C31056OooOoo c31056OooOoo = this.f76822OooOoO0;
        c30012Oooo0o.f106668Oooo0OO = this.f76821OooOoO;
        if (c31056OooOoo != null) {
            c30012Oooo0o.OooO0OO(c31056OooOoo);
        }
    }
}
