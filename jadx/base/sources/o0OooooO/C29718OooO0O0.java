package o0OooooO;

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
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.popupwindow.PagePreviewActionsBottomSheetDialog;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0o0o.ViewOnClickListenerC28239OooOOo;

/* JADX INFO: renamed from: o0OooooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29718OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ViewOnClickListenerC28239OooOOo f105367OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PagePreviewActionsBottomSheetDialog f105368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C29717OooO00o f105369OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PopupWindow f105370OooO0Oo;

    public C29718OooO0O0(Context context, ViewOnClickListenerC28239OooOOo viewOnClickListenerC28239OooOOo) {
        this.f105367OooO00o = viewOnClickListenerC28239OooOOo;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_page_preview_more, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f105370OooO0Oo = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        this.f105369OooO0OO = new C29717OooO00o(viewInflate, viewOnClickListenerC28239OooOOo);
    }

    public final synchronized void OooO00o() {
        try {
            PagePreviewActionsBottomSheetDialog pagePreviewActionsBottomSheetDialog = this.f105368OooO0O0;
            if (pagePreviewActionsBottomSheetDialog == null) {
                this.f105370OooO0Oo.dismiss();
            } else if (pagePreviewActionsBottomSheetDialog != null) {
                pagePreviewActionsBottomSheetDialog.dismissAllowingStateLoss();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0O0(View anchor, PagePreviewVO pagePreviewVO) {
        try {
            OooOOO0.OooO0oO(anchor, "anchor");
            Context context = anchor.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            if (C28038OooO0Oo.OooO0O0(context)) {
                FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(anchor).getChildFragmentManager();
                OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                PagePreviewActionsBottomSheetDialog pagePreviewActionsBottomSheetDialog = new PagePreviewActionsBottomSheetDialog();
                pagePreviewActionsBottomSheetDialog.f76131OooOoO = this.f105367OooO00o;
                pagePreviewActionsBottomSheetDialog.f76132OooOoO0 = pagePreviewVO;
                this.f105368OooO0O0 = pagePreviewActionsBottomSheetDialog;
                pagePreviewActionsBottomSheetDialog.show(childFragmentManager, "PagePreviewActionsBottomSheetDialog");
            } else {
                this.f105368OooO0O0 = null;
                C29717OooO00o c29717OooO00o = this.f105369OooO0OO;
                if (c29717OooO00o != null) {
                    Iterator it = c29717OooO00o.f105365OooO0OO.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setTag(pagePreviewVO);
                    }
                }
                View contentView = this.f105370OooO0Oo.getContentView();
                View viewFindViewById = contentView.findViewById(R.id.item_delete);
                OooOOO0.OooO0Oo(viewFindViewById);
                viewFindViewById.setVisibility(pagePreviewVO.getRemovable() ? 0 : 8);
                View viewFindViewById2 = contentView.findViewById(R.id.item_copy);
                OooOOO0.OooO0Oo(viewFindViewById2);
                viewFindViewById2.setVisibility(pagePreviewVO.getCopyable() ? 0 : 8);
                int width = this.f105370OooO0Oo.getWidth();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
                int height = this.f105370OooO0Oo.getHeight();
                contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
                int i = -(contentView.getMeasuredWidth() + o000000O.OooO0o(10));
                if (anchor.getId() == R.id.btn_more) {
                    Rect rect = new Rect();
                    Object parent = anchor.getParent();
                    OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                    ((View) parent).getGlobalVisibleRect(rect);
                    this.f105370OooO0Oo.showAtLocation(anchor, 0, rect.left + i, rect.top);
                } else {
                    Rect rect2 = new Rect();
                    anchor.getGlobalVisibleRect(rect2);
                    this.f105370OooO0Oo.showAtLocation(anchor, 0, rect2.left + i, rect2.centerY());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
