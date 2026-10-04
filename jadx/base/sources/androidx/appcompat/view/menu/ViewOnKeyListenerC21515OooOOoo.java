package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.OooOOO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.C21546OooOooo;
import androidx.appcompat.widget.MenuPopupWindow;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC21515OooOOoo extends OooOOO0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f62694OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C21509OooO0oo f62695OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO f62696OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f62697OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f62698OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f62699OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final MenuPopupWindow f62700OooOooO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f62702Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f62703Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public OooOOO.OooO00o f62705Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f62706Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public OooOOOO.OooO00o f62707Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ViewTreeObserver f62708Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f62709Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f62710Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f62711Oooo0oO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f62701OooOooo = new OooO00o();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO0O0 f62704Oooo000 = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f62712Oooo0oo = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOOoo$OooO00o */
    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC21515OooOOoo viewOnKeyListenerC21515OooOOoo = ViewOnKeyListenerC21515OooOOoo.this;
            if (viewOnKeyListenerC21515OooOOoo.OooO00o()) {
                MenuPopupWindow menuPopupWindow = viewOnKeyListenerC21515OooOOoo.f62700OooOooO;
                if (menuPopupWindow.f63033OoooOO0) {
                    return;
                }
                View view = viewOnKeyListenerC21515OooOOoo.f62703Oooo0;
                if (view == null || !view.isShown()) {
                    viewOnKeyListenerC21515OooOOoo.dismiss();
                } else {
                    menuPopupWindow.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOOoo$OooO0O0 */
    public class OooO0O0 implements View.OnAttachStateChangeListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC21515OooOOoo viewOnKeyListenerC21515OooOOoo = ViewOnKeyListenerC21515OooOOoo.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC21515OooOOoo.f62708Oooo0OO;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC21515OooOOoo.f62708Oooo0OO = view.getViewTreeObserver();
                }
                viewOnKeyListenerC21515OooOOoo.f62708Oooo0OO.removeGlobalOnLayoutListener(viewOnKeyListenerC21515OooOOoo.f62701OooOooo);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC21515OooOOoo(int i, Context context, View view, OooO oooO, boolean z) {
        this.f62694OooOo = context;
        this.f62696OooOoO0 = oooO;
        this.f62697OooOoOO = z;
        this.f62695OooOoO = new C21509OooO0oo(oooO, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f62698OooOoo = i;
        Resources resources = context.getResources();
        this.f62699OooOoo0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f62706Oooo00o = view;
        this.f62700OooOooO = new MenuPopupWindow(context, null, i);
        oooO.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(PopupWindow.OnDismissListener onDismissListener) {
        this.f62705Oooo00O = (OooOOO.OooO00o) onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final boolean OooO00o() {
        return !this.f62710Oooo0o0 && this.f62700OooOooO.f63034o000oOoO.isShowing();
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0O0(OooO oooO) {
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(View view) {
        this.f62706Oooo00o = view;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final C21546OooOooo OooO0o() {
        return this.f62700OooOooO.f63012OooOoO0;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0o0(boolean z) {
        this.f62695OooOoO.f62633OooOoO0 = z;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oO(int i) {
        this.f62712Oooo0oo = i;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oo(int i) {
        this.f62700OooOooO.f63015OooOoo0 = i;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooOO0(boolean z) {
        this.f62702Oooo = z;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooOO0O(int i) {
        this.f62700OooOooO.OooO0O0(i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final void dismiss() {
        if (OooO00o()) {
            this.f62700OooOooO.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void onCloseMenu(OooO oooO, boolean z) {
        if (oooO != this.f62696OooOoO0) {
            return;
        }
        dismiss();
        OooOOOO.OooO00o oooO00o = this.f62707Oooo0O0;
        if (oooO00o != null) {
            oooO00o.onCloseMenu(oooO, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f62710Oooo0o0 = true;
        this.f62696OooOoO0.close();
        ViewTreeObserver viewTreeObserver = this.f62708Oooo0OO;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f62708Oooo0OO = this.f62703Oooo0.getViewTreeObserver();
            }
            this.f62708Oooo0OO.removeGlobalOnLayoutListener(this.f62701OooOooo);
            this.f62708Oooo0OO = null;
        }
        this.f62703Oooo0.removeOnAttachStateChangeListener(this.f62704Oooo000);
        OooOOO.OooO00o oooO00o = this.f62705Oooo00O;
        if (oooO00o != null) {
            oooO00o.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean onSubMenuSelected(OooOo00 oooOo00) {
        boolean z;
        if (oooOo00.hasVisibleItems()) {
            OooOOO oooOOO = new OooOOO(this.f62698OooOoo, this.f62694OooOo, this.f62703Oooo0, oooOo00, this.f62697OooOoOO);
            OooOOOO.OooO00o oooO00o = this.f62707Oooo0O0;
            oooOOO.f62688OooO0oo = oooO00o;
            OooOOO0 oooOOO0 = oooOOO.f62680OooO;
            if (oooOOO0 != null) {
                oooOOO0.setCallback(oooO00o);
            }
            int size = oooOo00.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = oooOo00.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            oooOOO.f62687OooO0oO = z;
            OooOOO0 oooOOO02 = oooOOO.f62680OooO;
            if (oooOOO02 != null) {
                oooOOO02.OooO0o0(z);
            }
            oooOOO.f62689OooOO0 = this.f62705Oooo00O;
            this.f62705Oooo00O = null;
            this.f62696OooOoO0.close(false);
            MenuPopupWindow menuPopupWindow = this.f62700OooOooO;
            int width = menuPopupWindow.f63015OooOoo0;
            int iOooO0o0 = menuPopupWindow.OooO0o0();
            if ((Gravity.getAbsoluteGravity(this.f62712Oooo0oo, this.f62706Oooo00o.getLayoutDirection()) & 7) == 5) {
                width += this.f62706Oooo00o.getWidth();
            }
            if (!oooOOO.OooO0O0()) {
                if (oooOOO.f62686OooO0o0 != null) {
                    oooOOO.OooO0Oo(width, iOooO0o0, true, true);
                }
            }
            OooOOOO.OooO00o oooO00o2 = this.f62707Oooo0O0;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o(oooOo00);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void setCallback(OooOOOO.OooO00o oooO00o) {
        this.f62707Oooo0O0 = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final void show() {
        View view;
        if (OooO00o()) {
            return;
        }
        if (this.f62710Oooo0o0 || (view = this.f62706Oooo00o) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f62703Oooo0 = view;
        MenuPopupWindow menuPopupWindow = this.f62700OooOooO;
        menuPopupWindow.f63034o000oOoO.setOnDismissListener(this);
        menuPopupWindow.f63026Oooo0o0 = this;
        menuPopupWindow.f63033OoooOO0 = true;
        menuPopupWindow.f63034o000oOoO.setFocusable(true);
        View view2 = this.f62703Oooo0;
        boolean z = this.f62708Oooo0OO == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f62708Oooo0OO = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f62701OooOooo);
        }
        view2.addOnAttachStateChangeListener(this.f62704Oooo000);
        menuPopupWindow.f63024Oooo0OO = view2;
        menuPopupWindow.f63022Oooo00o = this.f62712Oooo0oo;
        boolean z2 = this.f62709Oooo0o;
        Context context = this.f62694OooOo;
        C21509OooO0oo c21509OooO0oo = this.f62695OooOoO;
        if (!z2) {
            this.f62711Oooo0oO = OooOOO0.OooO0OO(c21509OooO0oo, context, this.f62699OooOoo0);
            this.f62709Oooo0o = true;
        }
        menuPopupWindow.OooOOOO(this.f62711Oooo0oO);
        menuPopupWindow.f63034o000oOoO.setInputMethodMode(2);
        Rect rect = this.f62692OooOo0o;
        menuPopupWindow.f63029OoooO = rect != null ? new Rect(rect) : null;
        menuPopupWindow.show();
        C21546OooOooo c21546OooOooo = menuPopupWindow.f63012OooOoO0;
        c21546OooOooo.setOnKeyListener(this);
        if (this.f62702Oooo) {
            OooO oooO = this.f62696OooOoO0;
            if (oooO.getHeaderTitle() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c21546OooOooo, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(oooO.getHeaderTitle());
                }
                frameLayout.setEnabled(false);
                c21546OooOooo.addHeaderView(frameLayout, null, false);
            }
        }
        menuPopupWindow.OooOOO0(c21509OooO0oo);
        menuPopupWindow.show();
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void updateMenuView(boolean z) {
        this.f62709Oooo0o = false;
        C21509OooO0oo c21509OooO0oo = this.f62695OooOoO;
        if (c21509OooO0oo != null) {
            c21509OooO0oo.notifyDataSetChanged();
        }
    }
}
