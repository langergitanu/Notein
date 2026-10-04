package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.OooOOO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.C21530OooOO0o;
import androidx.appcompat.widget.C21546OooOooo;
import androidx.appcompat.widget.InterfaceC21555Oooo0O0;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import com.orion.notein.global.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC21506OooO0o0 extends OooOOO0 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f62591OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f62592OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f62593OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f62594OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Handler f62596OooOoo0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f62599Oooo;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f62604Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f62605Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f62606Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f62607Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f62608Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f62609Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ViewTreeObserver f62610OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f62611OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooOOOO.OooO00o f62613OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooOOO.OooO00o f62614OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f62615o000oOoO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ArrayList f62595OooOoo = new ArrayList();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ArrayList f62597OooOooO = new ArrayList();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f62598OooOooo = new OooO00o();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO0O0 f62601Oooo000 = new OooO0O0();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooO0OO f62602Oooo00O = new OooO0OO();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f62603Oooo00o = 0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f62600Oooo0 = 0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f62612OoooO00 = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0o0$OooO00o */
    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC21506OooO0o0 viewOnKeyListenerC21506OooO0o0 = ViewOnKeyListenerC21506OooO0o0.this;
            if (viewOnKeyListenerC21506OooO0o0.OooO00o()) {
                ArrayList arrayList = viewOnKeyListenerC21506OooO0o0.f62597OooOooO;
                if (arrayList.size() <= 0 || ((C21507OooO0Oo) arrayList.get(0)).f62619OooO00o.f63033OoooOO0) {
                    return;
                }
                View view = viewOnKeyListenerC21506OooO0o0.f62605Oooo0OO;
                if (view == null || !view.isShown()) {
                    viewOnKeyListenerC21506OooO0o0.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C21507OooO0Oo) it.next()).f62619OooO00o.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0o0$OooO0O0 */
    public class OooO0O0 implements View.OnAttachStateChangeListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC21506OooO0o0 viewOnKeyListenerC21506OooO0o0 = ViewOnKeyListenerC21506OooO0o0.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC21506OooO0o0.f62610OoooO;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC21506OooO0o0.f62610OoooO = view.getViewTreeObserver();
                }
                viewOnKeyListenerC21506OooO0o0.f62610OoooO.removeGlobalOnLayoutListener(viewOnKeyListenerC21506OooO0o0.f62598OooOooo);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0o0$OooO0OO */
    public class OooO0OO implements InterfaceC21555Oooo0O0 {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.widget.InterfaceC21555Oooo0O0
        public final void OooO0oo(OooO oooO, OooOO0O oooOO0O) {
            ViewOnKeyListenerC21506OooO0o0 viewOnKeyListenerC21506OooO0o0 = ViewOnKeyListenerC21506OooO0o0.this;
            viewOnKeyListenerC21506OooO0o0.f62596OooOoo0.removeCallbacksAndMessages(null);
            ArrayList arrayList = viewOnKeyListenerC21506OooO0o0.f62597OooOooO;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (oooO == ((C21507OooO0Oo) arrayList.get(i)).f62620OooO0O0) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            viewOnKeyListenerC21506OooO0o0.f62596OooOoo0.postAtTime(new OooO0o(this, i2 < arrayList.size() ? (C21507OooO0Oo) arrayList.get(i2) : null, oooOO0O, oooO), oooO, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC21555Oooo0O0
        public final void OooOO0o(OooO oooO, OooOO0O oooOO0O) {
            ViewOnKeyListenerC21506OooO0o0.this.f62596OooOoo0.removeCallbacksAndMessages(oooO);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public static class C21507OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuPopupWindow f62619OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO f62620OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f62621OooO0OO;

        public C21507OooO0Oo(MenuPopupWindow menuPopupWindow, OooO oooO, int i) {
            this.f62619OooO00o = menuPopupWindow;
            this.f62620OooO0O0 = oooO;
            this.f62621OooO0OO = i;
        }
    }

    public ViewOnKeyListenerC21506OooO0o0(Context context, View view, int i, boolean z) {
        this.f62591OooOo = context;
        this.f62604Oooo0O0 = view;
        this.f62592OooOoO = i;
        this.f62594OooOoOO = z;
        this.f62607Oooo0o0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f62593OooOoO0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f62596OooOoo0 = new Handler();
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(PopupWindow.OnDismissListener onDismissListener) {
        this.f62614OoooOO0 = (OooOOO.OooO00o) onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final boolean OooO00o() {
        ArrayList arrayList = this.f62597OooOooO;
        return arrayList.size() > 0 && ((C21507OooO0Oo) arrayList.get(0)).f62619OooO00o.f63034o000oOoO.isShowing();
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0O0(OooO oooO) {
        oooO.addMenuPresenter(this, this.f62591OooOo);
        if (OooO00o()) {
            OooOO0o(oooO);
        } else {
            this.f62595OooOoo.add(oooO);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(View view) {
        if (this.f62604Oooo0O0 != view) {
            this.f62604Oooo0O0 = view;
            this.f62600Oooo0 = GravityCompat.getAbsoluteGravity(this.f62603Oooo00o, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final C21546OooOooo OooO0o() {
        ArrayList arrayList = this.f62597OooOooO;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C21507OooO0Oo) C21505OooO0Oo.OooO00o(1, arrayList)).f62619OooO00o.f63012OooOoO0;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0o0(boolean z) {
        this.f62612OoooO00 = z;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oO(int i) {
        if (this.f62603Oooo00o != i) {
            this.f62603Oooo00o = i;
            this.f62600Oooo0 = GravityCompat.getAbsoluteGravity(i, this.f62604Oooo0O0.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oo(int i) {
        this.f62606Oooo0o = true;
        this.f62609Oooo0oo = i;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooOO0(boolean z) {
        this.f62611OoooO0 = z;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooOO0O(int i) {
        this.f62608Oooo0oO = true;
        this.f62599Oooo = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0o(OooO oooO) {
        boolean z;
        int i;
        C21507OooO0Oo c21507OooO0Oo;
        View childAt;
        int i2;
        int i3;
        MenuItem item;
        C21509OooO0oo c21509OooO0oo;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f62591OooOo;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C21509OooO0oo c21509OooO0oo2 = new C21509OooO0oo(oooO, layoutInflaterFrom, this.f62594OooOoOO, R.layout.abc_cascading_menu_item_layout);
        if (!OooO00o() && this.f62612OoooO00) {
            c21509OooO0oo2.f62633OooOoO0 = true;
        } else if (OooO00o()) {
            int size = oooO.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = oooO.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            c21509OooO0oo2.f62633OooOoO0 = z;
        }
        int iOooO0OO = OooOOO0.OooO0OO(c21509OooO0oo2, context, this.f62593OooOoO0);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(context, null, this.f62592OooOoO);
        menuPopupWindow.f62873OoooOo0 = this.f62602Oooo00O;
        menuPopupWindow.f63026Oooo0o0 = this;
        menuPopupWindow.f63034o000oOoO.setOnDismissListener(this);
        menuPopupWindow.f63024Oooo0OO = this.f62604Oooo0O0;
        menuPopupWindow.f63022Oooo00o = this.f62600Oooo0;
        menuPopupWindow.f63033OoooOO0 = true;
        menuPopupWindow.f63034o000oOoO.setFocusable(true);
        menuPopupWindow.f63034o000oOoO.setInputMethodMode(2);
        menuPopupWindow.OooOOO0(c21509OooO0oo2);
        menuPopupWindow.OooOOOO(iOooO0OO);
        menuPopupWindow.f63022Oooo00o = this.f62600Oooo0;
        ArrayList arrayList = this.f62597OooOooO;
        if (arrayList.size() > 0) {
            c21507OooO0Oo = (C21507OooO0Oo) C21505OooO0Oo.OooO00o(1, arrayList);
            OooO oooO2 = c21507OooO0Oo.f62620OooO0O0;
            int size2 = oooO2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = oooO2.getItem(i5);
                if (item.hasSubMenu() && oooO == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
            } else {
                C21546OooOooo c21546OooOooo = c21507OooO0Oo.f62619OooO00o.f63012OooOoO0;
                ListAdapter adapter = c21546OooOooo.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c21509OooO0oo = (C21509OooO0oo) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c21509OooO0oo = (C21509OooO0oo) adapter;
                    headersCount = 0;
                }
                int count = c21509OooO0oo.getCount();
                i = 1;
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == c21509OooO0oo.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c21546OooOooo.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c21546OooOooo.getChildCount()) {
                    childAt = c21546OooOooo.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                int i7 = Build.VERSION.SDK_INT;
                C21530OooOO0o c21530OooOO0o = menuPopupWindow.f63034o000oOoO;
                if (i7 <= 28) {
                    Method method = MenuPopupWindow.f62872OoooOoO;
                    if (method != null) {
                        try {
                            method.invoke(c21530OooOO0o, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    MenuPopupWindow.OooO0O0.OooO00o(c21530OooOO0o, false);
                }
                MenuPopupWindow.OooO00o.OooO00o(menuPopupWindow.f63034o000oOoO, null);
                C21546OooOooo c21546OooOooo2 = ((C21507OooO0Oo) arrayList.get(arrayList.size() - 1)).f62619OooO00o.f63012OooOoO0;
                int[] iArr = new int[2];
                c21546OooOooo2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f62605Oooo0OO.getWindowVisibleDisplayFrame(rect);
                if (this.f62607Oooo0o0 == i) {
                    if (c21546OooOooo2.getWidth() + iArr[0] + iOooO0OO > rect.right) {
                        i3 = 0;
                        i2 = 1;
                    } else {
                        i2 = 1;
                        i3 = 1;
                    }
                } else if (iArr[0] - iOooO0OO < 0) {
                }
                boolean z2 = i3 == i2;
                this.f62607Oooo0o0 = i3;
                menuPopupWindow.f63024Oooo0OO = childAt;
                if ((this.f62600Oooo0 & 5) != 5) {
                    iOooO0OO = z2 ? childAt.getWidth() : 0 - iOooO0OO;
                } else if (!z2) {
                    iOooO0OO = 0 - childAt.getWidth();
                }
                menuPopupWindow.f63015OooOoo0 = iOooO0OO;
                menuPopupWindow.f63021Oooo00O = true;
                menuPopupWindow.f63020Oooo000 = true;
                menuPopupWindow.OooO0O0(0);
            } else {
                if (this.f62606Oooo0o) {
                    menuPopupWindow.f63015OooOoo0 = this.f62609Oooo0oo;
                }
                if (this.f62608Oooo0oO) {
                    menuPopupWindow.OooO0O0(this.f62599Oooo);
                }
                Rect rect2 = this.f62692OooOo0o;
                menuPopupWindow.f63029OoooO = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C21507OooO0Oo(menuPopupWindow, oooO, this.f62607Oooo0o0));
            menuPopupWindow.show();
            C21546OooOooo c21546OooOooo3 = menuPopupWindow.f63012OooOoO0;
            c21546OooOooo3.setOnKeyListener(this);
            if (c21507OooO0Oo == null || !this.f62611OoooO0 || oooO.getHeaderTitle() == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c21546OooOooo3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(oooO.getHeaderTitle());
            c21546OooOooo3.addHeaderView(frameLayout, null, false);
            menuPopupWindow.show();
            return;
        }
        i = 1;
        c21507OooO0Oo = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new C21507OooO0Oo(menuPopupWindow, oooO, this.f62607Oooo0o0));
        menuPopupWindow.show();
        C21546OooOooo c21546OooOooo32 = menuPopupWindow.f63012OooOoO0;
        c21546OooOooo32.setOnKeyListener(this);
        if (c21507OooO0Oo == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final void dismiss() {
        ArrayList arrayList = this.f62597OooOooO;
        int size = arrayList.size();
        if (size > 0) {
            C21507OooO0Oo[] c21507OooO0OoArr = (C21507OooO0Oo[]) arrayList.toArray(new C21507OooO0Oo[size]);
            for (int i = size - 1; i >= 0; i--) {
                C21507OooO0Oo c21507OooO0Oo = c21507OooO0OoArr[i];
                if (c21507OooO0Oo.f62619OooO00o.f63034o000oOoO.isShowing()) {
                    c21507OooO0Oo.f62619OooO00o.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void onCloseMenu(OooO oooO, boolean z) {
        ArrayList arrayList = this.f62597OooOooO;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (oooO == ((C21507OooO0Oo) arrayList.get(i)).f62620OooO0O0) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C21507OooO0Oo) arrayList.get(i2)).f62620OooO0O0.close(false);
        }
        C21507OooO0Oo c21507OooO0Oo = (C21507OooO0Oo) arrayList.remove(i);
        c21507OooO0Oo.f62620OooO0O0.removeMenuPresenter(this);
        boolean z2 = this.f62615o000oOoO;
        MenuPopupWindow menuPopupWindow = c21507OooO0Oo.f62619OooO00o;
        if (z2) {
            MenuPopupWindow.OooO00o.OooO0O0(menuPopupWindow.f63034o000oOoO, null);
            menuPopupWindow.f63034o000oOoO.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f62607Oooo0o0 = ((C21507OooO0Oo) arrayList.get(size2 - 1)).f62621OooO0OO;
        } else {
            this.f62607Oooo0o0 = this.f62604Oooo0O0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C21507OooO0Oo) arrayList.get(0)).f62620OooO0O0.close(false);
                return;
            }
            return;
        }
        dismiss();
        OooOOOO.OooO00o oooO00o = this.f62613OoooO0O;
        if (oooO00o != null) {
            oooO00o.onCloseMenu(oooO, true);
        }
        ViewTreeObserver viewTreeObserver = this.f62610OoooO;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f62610OoooO.removeGlobalOnLayoutListener(this.f62598OooOooo);
            }
            this.f62610OoooO = null;
        }
        this.f62605Oooo0OO.removeOnAttachStateChangeListener(this.f62601Oooo000);
        this.f62614OoooOO0.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C21507OooO0Oo c21507OooO0Oo;
        ArrayList arrayList = this.f62597OooOooO;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c21507OooO0Oo = null;
                break;
            }
            c21507OooO0Oo = (C21507OooO0Oo) arrayList.get(i);
            if (!c21507OooO0Oo.f62619OooO00o.f63034o000oOoO.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c21507OooO0Oo != null) {
            c21507OooO0Oo.f62620OooO0O0.close(false);
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
        for (C21507OooO0Oo c21507OooO0Oo : this.f62597OooOooO) {
            if (oooOo00 == c21507OooO0Oo.f62620OooO0O0) {
                c21507OooO0Oo.f62619OooO00o.f63012OooOoO0.requestFocus();
                return true;
            }
        }
        if (!oooOo00.hasVisibleItems()) {
            return false;
        }
        OooO0O0(oooOo00);
        OooOOOO.OooO00o oooO00o = this.f62613OoooO0O;
        if (oooO00o != null) {
            oooO00o.OooO00o(oooOo00);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void setCallback(OooOOOO.OooO00o oooO00o) {
        this.f62613OoooO0O = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final void show() {
        if (OooO00o()) {
            return;
        }
        ArrayList arrayList = this.f62595OooOoo;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooOO0o((OooO) it.next());
        }
        arrayList.clear();
        View view = this.f62604Oooo0O0;
        this.f62605Oooo0OO = view;
        if (view != null) {
            boolean z = this.f62610OoooO == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f62610OoooO = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f62598OooOooo);
            }
            this.f62605Oooo0OO.addOnAttachStateChangeListener(this.f62601Oooo000);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void updateMenuView(boolean z) {
        Iterator it = this.f62597OooOooO.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C21507OooO0Oo) it.next()).f62619OooO00o.f63012OooOoO0.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C21509OooO0oo) adapter).notifyDataSetChanged();
        }
    }
}
