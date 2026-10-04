package o0o0O0o;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.sortpopupwindow.SortBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0O0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30294OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107958OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View.OnClickListener f107959OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SortBottomSheetDialog f107960OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PopupWindow f107961OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C30293OooO0O0 f107962OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f107963OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public List<SortKeyVO> f107964OooO0oO = C34434OooOoO.f123453OooOo0o;

    public C30294OooO0OO(Context context, View.OnClickListener onClickListener) {
        this.f107958OooO00o = context;
        this.f107959OooO0O0 = onClickListener;
    }

    public static void OooO0O0(C30294OooO0OO c30294OooO0OO, View anchor, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c30294OooO0OO.getClass();
        OooOOO0.OooO0oO(anchor, "anchor");
        Context context = anchor.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        boolean zOooO0O0 = C28038OooO0Oo.OooO0O0(context);
        View.OnClickListener onClickListener = c30294OooO0OO.f107959OooO0O0;
        if (zOooO0O0) {
            FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(anchor).getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            SortBottomSheetDialog sortBottomSheetDialog = new SortBottomSheetDialog();
            sortBottomSheetDialog.f78052OooOoO = onClickListener;
            List<SortKeyVO> list = c30294OooO0OO.f107964OooO0oO;
            OooOOO0.OooO0oO(list, "list");
            sortBottomSheetDialog.f78053OooOoO0 = list;
            C30293OooO0O0 c30293OooO0O0 = sortBottomSheetDialog.f78054OooOoOO;
            if (c30293OooO0O0 != null) {
                c30293OooO0O0.f107957OooO00o.OooO0Oo(list);
            }
            c30294OooO0OO.f107960OooO0OO = sortBottomSheetDialog;
            sortBottomSheetDialog.show(childFragmentManager, "SortBottomSheetDialog");
            return;
        }
        c30294OooO0OO.f107960OooO0OO = null;
        if (!c30294OooO0OO.f107963OooO0o0) {
            Object systemService = c30294OooO0OO.f107958OooO00o.getSystemService("layout_inflater");
            OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_note_list_sort, (ViewGroup) null);
            OooOOO0.OooO0o(viewInflate, "inflate(...)");
            PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
            c30294OooO0OO.f107961OooO0Oo = popupWindow;
            popupWindow.setOutsideTouchable(true);
            PopupWindow popupWindow2 = c30294OooO0OO.f107961OooO0Oo;
            if (popupWindow2 == null) {
                OooOOO0.OooOOOO("popupWindow");
                throw null;
            }
            popupWindow2.setElevation(10.0f);
            c30294OooO0OO.f107962OooO0o = new C30293OooO0O0(viewInflate);
            c30294OooO0OO.f107963OooO0o0 = true;
        }
        C30293OooO0O0 c30293OooO0O02 = c30294OooO0OO.f107962OooO0o;
        if (c30293OooO0O02 != null) {
            c30293OooO0O02.f107957OooO00o.f107950OooO0Oo = onClickListener;
        }
        if (c30293OooO0O02 != null) {
            List<SortKeyVO> list2 = c30294OooO0OO.f107964OooO0oO;
            OooOOO0.OooO0oO(list2, "list");
            c30293OooO0O02.f107957OooO00o.OooO0Oo(list2);
        }
        PopupWindow popupWindow3 = c30294OooO0OO.f107961OooO0Oo;
        if (popupWindow3 != null) {
            popupWindow3.showAsDropDown(anchor, i, 0, GravityCompat.END);
        } else {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }

    public final void OooO00o() {
        SortBottomSheetDialog sortBottomSheetDialog = this.f107960OooO0OO;
        if (sortBottomSheetDialog != null) {
            sortBottomSheetDialog.dismissAllowingStateLoss();
            return;
        }
        if (this.f107963OooO0o0) {
            PopupWindow popupWindow = this.f107961OooO0Oo;
            if (popupWindow != null) {
                popupWindow.dismiss();
            } else {
                OooOOO0.OooOOOO("popupWindow");
                throw null;
            }
        }
    }

    public final void OooO0OO(List<SortKeyVO> list) {
        OooOOO0.OooO0oO(list, "list");
        this.f107964OooO0oO = list;
        SortBottomSheetDialog sortBottomSheetDialog = this.f107960OooO0OO;
        if (sortBottomSheetDialog == null) {
            C30293OooO0O0 c30293OooO0O0 = this.f107962OooO0o;
            if (c30293OooO0O0 != null) {
                c30293OooO0O0.f107957OooO00o.OooO0Oo(list);
                return;
            }
            return;
        }
        sortBottomSheetDialog.f78053OooOoO0 = list;
        C30293OooO0O0 c30293OooO0O02 = sortBottomSheetDialog.f78054OooOoOO;
        if (c30293OooO0O02 != null) {
            c30293OooO0O02.f107957OooO00o.OooO0Oo(list);
        }
    }
}
