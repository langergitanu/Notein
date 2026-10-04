package com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0o00oO0.C30017OoooO0;
import o0oOoOo.C31056OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/bottomsheet/PencilGroupSettingsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lo0o00o0/OooO0o;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PencilGroupSettingsBottomSheetDialog extends PhoneBottomSheetDialog implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29936OooO0oO f76824OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31056OooOoo f76825OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30017OoooO0 f76826OooOoOO;

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C30017OoooO0 c30017OoooO0 = this.f76826OooOoOO;
        if (c30017OoooO0 != null) {
            c30017OoooO0.OooO00o();
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        OooOOO0.OooO0oO(list, "list");
        C30017OoooO0 c30017OoooO0 = this.f76826OooOoOO;
        if (c30017OoooO0 != null) {
            c30017OoooO0.OooO0o0(list);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidthVO) {
        C30017OoooO0 c30017OoooO0 = this.f76826OooOoOO;
        if (c30017OoooO0 != null) {
            c30017OoooO0.OooOOOO(penWidthVO);
        }
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_rainbow_pen_settings, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30017OoooO0 c30017OoooO0 = new C30017OoooO0(view);
        this.f76826OooOoOO = c30017OoooO0;
        C31056OooOoo c31056OooOoo = this.f76825OooOoO0;
        c30017OoooO0.f106696Oooo00O = this.f76824OooOoO;
        if (c31056OooOoo != null) {
            c30017OoooO0.OooO0o(c31056OooOoo);
        }
    }
}
