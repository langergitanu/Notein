package o0o0O0oo;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.trashbin.popupwindow.TrashMoreActionsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0OoO000.ViewOnClickListenerC28566Ooooo0o;

/* JADX INFO: renamed from: o0o0O0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30360OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f108293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28566Ooooo0o f108294OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TrashMoreActionsBottomSheetDialog f108295OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C30361OooO0O0 f108296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f108297OooO0o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PopupWindow f108298OooO0o0;

    public C30360OooO00o(Context context, ViewOnClickListenerC28566Ooooo0o viewOnClickListenerC28566Ooooo0o) {
        this.f108293OooO00o = context;
        this.f108294OooO0O0 = viewOnClickListenerC28566Ooooo0o;
    }

    public final synchronized void OooO00o() {
        try {
            TrashMoreActionsBottomSheetDialog trashMoreActionsBottomSheetDialog = this.f108295OooO0OO;
            if (trashMoreActionsBottomSheetDialog == null) {
                PopupWindow popupWindow = this.f108298OooO0o0;
                if (popupWindow == null) {
                    return;
                }
                if (popupWindow == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow.dismiss();
            } else if (trashMoreActionsBottomSheetDialog != null) {
                trashMoreActionsBottomSheetDialog.dismissAllowingStateLoss();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0O0() {
        Object systemService = this.f108293OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_trash_bin_more, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f108298OooO0o0 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f108298OooO0o0;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        this.f108296OooO0Oo = new C30361OooO0O0(viewInflate, this.f108294OooO0O0);
    }

    public final synchronized void OooO0OO(View view, NoteVO noteVO) {
        try {
            Context context = view.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            if (C28038OooO0Oo.OooO0O0(context)) {
                FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager();
                OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                TrashMoreActionsBottomSheetDialog trashMoreActionsBottomSheetDialog = new TrashMoreActionsBottomSheetDialog();
                trashMoreActionsBottomSheetDialog.f78141OooOoO = this.f108294OooO0O0;
                trashMoreActionsBottomSheetDialog.f78142OooOoO0 = noteVO;
                this.f108295OooO0OO = trashMoreActionsBottomSheetDialog;
                trashMoreActionsBottomSheetDialog.show(childFragmentManager, "TrashMoreActionsBottomSheetDialog");
            } else {
                if (this.f108297OooO0o.compareAndSet(false, true)) {
                    OooO0O0();
                }
                this.f108295OooO0OO = null;
                C30361OooO0O0 c30361OooO0O0 = this.f108296OooO0Oo;
                if (c30361OooO0O0 != null) {
                    Iterator it = c30361OooO0O0.f108301OooO0OO.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setTag(noteVO);
                    }
                }
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                if (view.getId() == R.id.more) {
                    Object parent = view.getParent();
                    OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                    View viewFindViewById = ((View) parent).findViewById(R.id.more);
                    Rect rect2 = new Rect();
                    viewFindViewById.getGlobalVisibleRect(rect2);
                    PopupWindow popupWindow = this.f108298OooO0o0;
                    if (popupWindow == null) {
                        OooOOO0.OooOOOO("popupWindow");
                        throw null;
                    }
                    popupWindow.showAtLocation(view, 0, rect2.left - o000000O.OooO0o(80), rect.bottom);
                } else {
                    PopupWindow popupWindow2 = this.f108298OooO0o0;
                    if (popupWindow2 == null) {
                        OooOOO0.OooOOOO("popupWindow");
                        throw null;
                    }
                    popupWindow2.showAtLocation(view, 0, rect.centerX(), rect.centerY());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
