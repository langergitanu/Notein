package com.orion.notein.p607ui.notelist.sortpopupwindow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o0O0o.C30292OooO00o;
import o0o0O0o.C30293OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/sortpopupwindow/SortBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SortBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View.OnClickListener f78052OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List<SortKeyVO> f78053OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30293OooO0O0 f78054OooOoOO;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_sort, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30293OooO0O0 c30293OooO0O0 = new C30293OooO0O0(view);
        this.f78054OooOoOO = c30293OooO0O0;
        List<SortKeyVO> list = this.f78053OooOoO0;
        View.OnClickListener onClickListener = this.f78052OooOoO;
        C30292OooO00o c30292OooO00o = c30293OooO0O0.f107957OooO00o;
        c30292OooO00o.f107950OooO0Oo = onClickListener;
        if (list != null) {
            c30292OooO00o.OooO0Oo(list);
        }
    }
}
