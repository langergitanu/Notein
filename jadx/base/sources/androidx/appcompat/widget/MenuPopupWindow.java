package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C21509OooO0oo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.ViewOnKeyListenerC21506OooO0o0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class MenuPopupWindow extends Oooo0 implements InterfaceC21555Oooo0O0 {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final Method f62872OoooOoO;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ViewOnKeyListenerC21506OooO0o0.OooO0OO f62873OoooOo0;

    public static class MenuDropDownListView extends C21546OooOooo {

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final int f62874Oooo0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public final int f62875Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public InterfaceC21555Oooo0O0 f62876Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0O f62877Oooo0o0;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f62874Oooo0 = 21;
                this.f62875Oooo0O0 = 22;
            } else {
                this.f62874Oooo0 = 22;
                this.f62875Oooo0O0 = 21;
            }
        }

        @Override // androidx.appcompat.widget.C21546OooOooo, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            C21509OooO0oo c21509OooO0oo;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f62876Oooo0OO != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c21509OooO0oo = (C21509OooO0oo) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c21509OooO0oo = (C21509OooO0oo) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.OooOO0O item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c21509OooO0oo.getCount()) ? null : c21509OooO0oo.getItem(i);
                androidx.appcompat.view.menu.OooOO0O oooOO0O = this.f62877Oooo0o0;
                if (oooOO0O != item) {
                    androidx.appcompat.view.menu.OooO oooO = c21509OooO0oo.f62631OooOo0o;
                    if (oooOO0O != null) {
                        this.f62876Oooo0OO.OooOO0o(oooO, oooOO0O);
                    }
                    this.f62877Oooo0o0 = item;
                    if (item != null) {
                        this.f62876Oooo0OO.OooO0oo(oooO, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f62874Oooo0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f62875Oooo0O0) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C21509OooO0oo) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C21509OooO0oo) adapter).f62631OooOo0o.close(false);
            return true;
        }

        public void setHoverListener(InterfaceC21555Oooo0O0 interfaceC21555Oooo0O0) {
            this.f62876Oooo0OO = interfaceC21555Oooo0O0;
        }

        @Override // androidx.appcompat.widget.C21546OooOooo, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public static class OooO00o {
        public static void OooO00o(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void OooO0O0(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class OooO0O0 {
        public static void OooO00o(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f62872OoooOoO = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC21555Oooo0O0
    public final void OooO0oo(androidx.appcompat.view.menu.OooO oooO, androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        ViewOnKeyListenerC21506OooO0o0.OooO0OO oooO0OO = this.f62873OoooOo0;
        if (oooO0OO != null) {
            oooO0OO.OooO0oo(oooO, oooOO0O);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC21555Oooo0O0
    public final void OooOO0o(androidx.appcompat.view.menu.OooO oooO, androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        ViewOnKeyListenerC21506OooO0o0.OooO0OO oooO0OO = this.f62873OoooOo0;
        if (oooO0OO != null) {
            oooO0OO.OooOO0o(oooO, oooOO0O);
        }
    }

    @Override // androidx.appcompat.widget.Oooo0
    public final C21546OooOooo OooOOO(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
