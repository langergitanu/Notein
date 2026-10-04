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
import o0o00oO0.C30006OooOooo;
import o0oOoOo.C31056OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/bottomsheet/InkPenGroupSettingsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lo0o00o0/OooO0o;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class InkPenGroupSettingsBottomSheetDialog extends PhoneBottomSheetDialog implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29936OooO0oO f76812OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31056OooOoo f76813OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30006OooOooo f76814OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f76815OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f76816OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f76817OooOooO;

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C30006OooOooo c30006OooOooo = this.f76814OooOoOO;
        if (c30006OooOooo != null) {
            c30006OooOooo.OooO00o();
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        OooOOO0.OooO0oO(list, "list");
        C30006OooOooo c30006OooOooo = this.f76814OooOoOO;
        if (c30006OooOooo != null) {
            c30006OooOooo.OooO0O0(list);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidthVO) {
        C30006OooOooo c30006OooOooo = this.f76814OooOoOO;
        if (c30006OooOooo != null) {
            c30006OooOooo.OooO0o0(penWidthVO);
        }
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
        this.f76815OooOoo = z;
        C30006OooOooo c30006OooOooo = this.f76814OooOoOO;
        if (c30006OooOooo != null) {
            c30006OooOooo.OooOOOo(z);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
        this.f76816OooOoo0 = z;
        C30006OooOooo c30006OooOooo = this.f76814OooOoOO;
        if (c30006OooOooo != null) {
            c30006OooOooo.OooOo00(z);
        }
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
        this.f76817OooOooO = i;
        C30006OooOooo c30006OooOooo = this.f76814OooOoOO;
        if (c30006OooOooo != null) {
            c30006OooOooo.OooOo0o(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_ink_pen_settings, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C30006OooOooo c30006OooOooo;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30006OooOooo c30006OooOooo2 = new C30006OooOooo(view);
        this.f76814OooOoOO = c30006OooOooo2;
        C31056OooOoo c31056OooOoo = this.f76813OooOoO0;
        c30006OooOooo2.OooO0oO(this.f76812OooOoO);
        if (c31056OooOoo != null && (c30006OooOooo = this.f76814OooOoOO) != null) {
            c30006OooOooo.OooO0o(c31056OooOoo);
        }
        C30006OooOooo c30006OooOooo3 = this.f76814OooOoOO;
        if (c30006OooOooo3 != null) {
            c30006OooOooo3.OooOo00(this.f76816OooOoo0);
        }
        C30006OooOooo c30006OooOooo4 = this.f76814OooOoOO;
        if (c30006OooOooo4 != null) {
            c30006OooOooo4.OooOOOo(this.f76815OooOoo);
        }
        C30006OooOooo c30006OooOooo5 = this.f76814OooOoOO;
        if (c30006OooOooo5 != null) {
            c30006OooOooo5.OooOo0o(this.f76817OooOooO);
        }
    }
}
