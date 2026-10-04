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
import o0o00oO0.C30022OoooOOo;
import o0oOoOo.C31056OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/bottomsheet/TapeSettingsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lo0o00o0/OooO0o;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TapeSettingsBottomSheetDialog extends PhoneBottomSheetDialog implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29936OooO0oO f76827OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31056OooOoo f76828OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30022OoooOOo f76829OooOoOO;

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C30022OoooOOo c30022OoooOOo = this.f76829OooOoOO;
        if (c30022OoooOOo != null) {
            c30022OoooOOo.OooO00o();
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        OooOOO0.OooO0oO(list, "list");
        C30022OoooOOo c30022OoooOOo = this.f76829OooOoOO;
        if (c30022OoooOOo != null) {
            c30022OoooOOo.OooO0O0(list);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidthVO) {
        C30022OoooOOo c30022OoooOOo = this.f76829OooOoOO;
        if (c30022OoooOOo != null) {
            c30022OoooOOo.OooOOOO(penWidthVO);
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
        return inflater.inflate(R.layout.dialog_bottom_sheet_tape_pen_settings, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30022OoooOOo c30022OoooOOo = new C30022OoooOOo(view);
        this.f76829OooOoOO = c30022OoooOOo;
        c30022OoooOOo.f106713OooOooO = this.f76827OooOoO;
        C31056OooOoo c31056OooOoo = this.f76828OooOoO0;
        if (c31056OooOoo != null) {
            c30022OoooOOo.OooO0OO(c31056OooOoo);
        }
    }
}
