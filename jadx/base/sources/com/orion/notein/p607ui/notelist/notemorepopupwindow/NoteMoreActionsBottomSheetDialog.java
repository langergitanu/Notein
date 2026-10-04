package com.orion.notein.p607ui.notelist.notemorepopupwindow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/notemorepopupwindow/NoteMoreActionsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteMoreActionsBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public NoteVO f77826OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C30201OooOOO0 f77827OooOoO0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_note_more_actions, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30183OooO0oo c30183OooO0oo = new C30183OooO0oo(view);
        NoteVO noteVO = this.f77826OooOoO;
        C30201OooOOO0 c30201OooOOO0 = this.f77827OooOoO0;
        if (noteVO == null || c30201OooOOO0 == null) {
            return;
        }
        c30183OooO0oo.OooO00o(noteVO, c30201OooOOO0);
    }
}
