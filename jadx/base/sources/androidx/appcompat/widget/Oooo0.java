package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC21513OooOOo;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Oooo0 implements InterfaceC21513OooOOo {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final Method f63007OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final Method f63008OoooOOo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ListAdapter f63009OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f63010OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C21546OooOooo f63012OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f63014OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f63015OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f63017OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f63020Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f63021Oooo00O;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C21550OooO0Oo f63023Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f63024Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f63025Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public AdapterView.OnItemClickListener f63026Oooo0o0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Rect f63029OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Handler f63030OoooO0;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f63033OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C21530OooOO0o f63034o000oOoO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f63011OooOoO = -2;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f63013OooOoOO = -2;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f63016OooOooO = 1002;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f63022Oooo00o = 0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f63019Oooo0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final RunnableC21552OooO0oO f63027Oooo0oO = new RunnableC21552OooO0oO();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO0o f63028Oooo0oo = new OooO0o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C21551OooO0o0 f63018Oooo = new C21551OooO0o0();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO0OO f63031OoooO00 = new OooO0OO();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Rect f63032OoooO0O = new Rect();

    public static class OooO00o {
        public static int OooO00o(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    public static class OooO0O0 {
        public static void OooO00o(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void OooO0O0(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C21546OooOooo c21546OooOooo = Oooo0.this.f63012OooOoO0;
            if (c21546OooOooo != null) {
                c21546OooOooo.setListSelectionHidden(true);
                c21546OooOooo.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0$OooO0Oo, reason: case insensitive filesystem */
    public class C21550OooO0Oo extends DataSetObserver {
        public C21550OooO0Oo() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Oooo0 oooo0 = Oooo0.this;
            if (oooo0.f63034o000oOoO.isShowing()) {
                oooo0.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            Oooo0.this.dismiss();
        }
    }

    public class OooO0o implements View.OnTouchListener {
        public OooO0o() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C21530OooOO0o c21530OooOO0o;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Oooo0 oooo0 = Oooo0.this;
            if (action == 0 && (c21530OooOO0o = oooo0.f63034o000oOoO) != null && c21530OooOO0o.isShowing() && x >= 0 && x < oooo0.f63034o000oOoO.getWidth() && y >= 0 && y < oooo0.f63034o000oOoO.getHeight()) {
                oooo0.f63030OoooO0.postDelayed(oooo0.f63027Oooo0oO, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            oooo0.f63030OoooO0.removeCallbacks(oooo0.f63027Oooo0oO);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0$OooO0o0, reason: case insensitive filesystem */
    public class C21551OooO0o0 implements AbsListView.OnScrollListener {
        public C21551OooO0o0() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                Oooo0 oooo0 = Oooo0.this;
                if (oooo0.f63034o000oOoO.getInputMethodMode() == 2 || oooo0.f63034o000oOoO.getContentView() == null) {
                    return;
                }
                Handler handler = oooo0.f63030OoooO0;
                RunnableC21552OooO0oO runnableC21552OooO0oO = oooo0.f63027Oooo0oO;
                handler.removeCallbacks(runnableC21552OooO0oO);
                runnableC21552OooO0oO.run();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0$OooO0oO, reason: case insensitive filesystem */
    public class RunnableC21552OooO0oO implements Runnable {
        public RunnableC21552OooO0oO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Oooo0 oooo0 = Oooo0.this;
            C21546OooOooo c21546OooOooo = oooo0.f63012OooOoO0;
            if (c21546OooOooo == null || !c21546OooOooo.isAttachedToWindow() || oooo0.f63012OooOoO0.getCount() <= oooo0.f63012OooOoO0.getChildCount() || oooo0.f63012OooOoO0.getChildCount() > oooo0.f63019Oooo0) {
                return;
            }
            oooo0.f63034o000oOoO.setInputMethodMode(2);
            oooo0.show();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f63007OoooOOO = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f63008OoooOOo = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public Oooo0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f63010OooOo0o = context;
        this.f63030OoooO0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58293OooOOOo, i, 0);
        this.f63015OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f63014OooOoo = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f63017OooOooo = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C21530OooOO0o c21530OooOO0o = new C21530OooOO0o(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58299OooOo00, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            PopupWindowCompat.setOverlapAnchor(c21530OooOO0o, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c21530OooOO0o.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : OooO.OooO00o.OooO0OO(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f63034o000oOoO = c21530OooOO0o;
        c21530OooOO0o.setInputMethodMode(1);
    }

    public final void OooO(int i) {
        this.f63015OooOoo0 = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final boolean OooO00o() {
        return this.f63034o000oOoO.isShowing();
    }

    public final void OooO0O0(int i) {
        this.f63014OooOoo = i;
        this.f63017OooOooo = true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final C21546OooOooo OooO0o() {
        return this.f63012OooOoO0;
    }

    public final int OooO0o0() {
        if (this.f63017OooOooo) {
            return this.f63014OooOoo;
        }
        return 0;
    }

    public final int OooO0oO() {
        return this.f63015OooOoo0;
    }

    public C21546OooOooo OooOOO(Context context, boolean z) {
        return new C21546OooOooo(context, z);
    }

    public void OooOOO0(ListAdapter listAdapter) {
        C21550OooO0Oo c21550OooO0Oo = this.f63023Oooo0O0;
        if (c21550OooO0Oo == null) {
            this.f63023Oooo0O0 = new C21550OooO0Oo();
        } else {
            ListAdapter listAdapter2 = this.f63009OooOo;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c21550OooO0Oo);
            }
        }
        this.f63009OooOo = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f63023Oooo0O0);
        }
        C21546OooOooo c21546OooOooo = this.f63012OooOoO0;
        if (c21546OooOooo != null) {
            c21546OooOooo.setAdapter(this.f63009OooOo);
        }
    }

    public final void OooOOOO(int i) {
        Drawable background = this.f63034o000oOoO.getBackground();
        if (background == null) {
            this.f63013OooOoOO = i;
            return;
        }
        Rect rect = this.f63032OoooO0O;
        background.getPadding(rect);
        this.f63013OooOoOO = rect.left + rect.right + i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final void dismiss() {
        C21530OooOO0o c21530OooOO0o = this.f63034o000oOoO;
        c21530OooOO0o.dismiss();
        c21530OooOO0o.setContentView(null);
        this.f63012OooOoO0 = null;
        this.f63030OoooO0.removeCallbacks(this.f63027Oooo0oO);
    }

    public final Drawable getBackground() {
        return this.f63034o000oOoO.getBackground();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f63034o000oOoO.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21513OooOOo
    public final void show() {
        int i;
        int paddingBottom;
        C21546OooOooo c21546OooOooo;
        C21546OooOooo c21546OooOooo2 = this.f63012OooOoO0;
        C21530OooOO0o c21530OooOO0o = this.f63034o000oOoO;
        Context context = this.f63010OooOo0o;
        if (c21546OooOooo2 == null) {
            C21546OooOooo c21546OooOoooOooOOO = OooOOO(context, !this.f63033OoooOO0);
            this.f63012OooOoO0 = c21546OooOoooOooOOO;
            c21546OooOoooOooOOO.setAdapter(this.f63009OooOo);
            this.f63012OooOoO0.setOnItemClickListener(this.f63026Oooo0o0);
            this.f63012OooOoO0.setFocusable(true);
            this.f63012OooOoO0.setFocusableInTouchMode(true);
            this.f63012OooOoO0.setOnItemSelectedListener(new C21554Oooo00o(this));
            this.f63012OooOoO0.setOnScrollListener(this.f63018Oooo);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f63025Oooo0o;
            if (onItemSelectedListener != null) {
                this.f63012OooOoO0.setOnItemSelectedListener(onItemSelectedListener);
            }
            c21530OooOO0o.setContentView(this.f63012OooOoO0);
        }
        Drawable background = c21530OooOO0o.getBackground();
        Rect rect = this.f63032OoooO0O;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f63017OooOooo) {
                this.f63014OooOoo = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iOooO00o = OooO00o.OooO00o(c21530OooOO0o, this.f63024Oooo0OO, this.f63014OooOoo, c21530OooOO0o.getInputMethodMode() == 2);
        int i3 = this.f63011OooOoO;
        if (i3 == -1) {
            paddingBottom = iOooO00o + i;
        } else {
            int i4 = this.f63013OooOoOO;
            int iOooO00o2 = this.f63012OooOoO0.OooO00o(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iOooO00o);
            paddingBottom = iOooO00o2 + (iOooO00o2 > 0 ? this.f63012OooOoO0.getPaddingBottom() + this.f63012OooOoO0.getPaddingTop() + i : 0);
        }
        boolean z = this.f63034o000oOoO.getInputMethodMode() == 2;
        PopupWindowCompat.setWindowLayoutType(c21530OooOO0o, this.f63016OooOooO);
        if (c21530OooOO0o.isShowing()) {
            if (this.f63024Oooo0OO.isAttachedToWindow()) {
                int width = this.f63013OooOoOO;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f63024Oooo0OO.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c21530OooOO0o.setWidth(this.f63013OooOoOO == -1 ? -1 : 0);
                        c21530OooOO0o.setHeight(0);
                    } else {
                        c21530OooOO0o.setWidth(this.f63013OooOoOO == -1 ? -1 : 0);
                        c21530OooOO0o.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c21530OooOO0o.setOutsideTouchable(true);
                View view = this.f63024Oooo0OO;
                int i5 = this.f63015OooOoo0;
                int i6 = this.f63014OooOoo;
                if (width < 0) {
                    width = -1;
                }
                c21530OooOO0o.update(view, i5, i6, width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.f63013OooOoOO;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f63024Oooo0OO.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c21530OooOO0o.setWidth(width2);
        c21530OooOO0o.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f63007OoooOOO;
            if (method != null) {
                try {
                    method.invoke(c21530OooOO0o, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            OooO0O0.OooO0O0(c21530OooOO0o, true);
        }
        c21530OooOO0o.setOutsideTouchable(true);
        c21530OooOO0o.setTouchInterceptor(this.f63028Oooo0oo);
        if (this.f63021Oooo00O) {
            PopupWindowCompat.setOverlapAnchor(c21530OooOO0o, this.f63020Oooo000);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f63008OoooOOo;
            if (method2 != null) {
                try {
                    method2.invoke(c21530OooOO0o, this.f63029OoooO);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            OooO0O0.OooO00o(c21530OooOO0o, this.f63029OoooO);
        }
        PopupWindowCompat.showAsDropDown(c21530OooOO0o, this.f63024Oooo0OO, this.f63015OooOoo0, this.f63014OooOoo, this.f63022Oooo00o);
        this.f63012OooOoO0.setSelection(-1);
        if ((!this.f63033OoooOO0 || this.f63012OooOoO0.isInTouchMode()) && (c21546OooOooo = this.f63012OooOoO0) != null) {
            c21546OooOooo.setListSelectionHidden(true);
            c21546OooOooo.requestLayout();
        }
        if (this.f63033OoooOO0) {
            return;
        }
        this.f63030OoooO0.post(this.f63031OoooO00);
    }
}
