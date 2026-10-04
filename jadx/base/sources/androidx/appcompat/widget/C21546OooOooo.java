package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import com.orion.notein.global.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21546OooOooo extends ListView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f62981OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Rect f62982OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f62983OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f62984OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f62985OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public C21547OooO0Oo f62986OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f62987OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f62988OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final boolean f62989OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f62990Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ListViewAutoScrollHelper f62991Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public OooO0o f62992Oooo00o;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooo$OooO00o */
    public static class OooO00o {
        public static void OooO00o(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Method f62993OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Method f62994OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Method f62995OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final boolean f62996OooO0Oo;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f62993OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f62994OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f62995OooO0OO = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f62996OooO0Oo = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooo$OooO0OO */
    public static class OooO0OO {
        public static boolean OooO00o(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void OooO0O0(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooo$OooO0Oo, reason: case insensitive filesystem */
    public static class C21547OooO0Oo extends OooOO0.OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f62997OooOo0o;

        @Override // OooOO0.OooO00o, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f62997OooOo0o) {
                super.draw(canvas);
            }
        }

        @Override // OooOO0.OooO00o, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f62997OooOo0o) {
                super.setHotspot(f, f2);
            }
        }

        @Override // OooOO0.OooO00o, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f62997OooOo0o) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // OooOO0.OooO00o, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f62997OooOo0o) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // OooOO0.OooO00o, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f62997OooOo0o) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooo$OooO0o */
    public class OooO0o implements Runnable {
        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C21546OooOooo c21546OooOooo = C21546OooOooo.this;
            c21546OooOooo.f62992Oooo00o = null;
            c21546OooOooo.drawableStateChanged();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOooo$OooO0o0, reason: case insensitive filesystem */
    public static class C21548OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Field f62999OooO00o;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f62999OooO00o = declaredField;
        }
    }

    public C21546OooOooo(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f62982OooOo0o = new Rect();
        this.f62981OooOo = 0;
        this.f62984OooOoO0 = 0;
        this.f62983OooOoO = 0;
        this.f62985OooOoOO = 0;
        this.f62989OooOooo = z;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z) {
        C21547OooO0Oo c21547OooO0Oo = this.f62986OooOoo;
        if (c21547OooO0Oo != null) {
            c21547OooO0Oo.f62997OooOo0o = z;
        }
    }

    public final int OooO00o(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0O0(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zOooO00o;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                z = actionMasked != 3;
                if (z || z3) {
                    this.f62990Oooo000 = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f62987OooOoo0 - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    ListViewAutoScrollHelper listViewAutoScrollHelper = this.f62991Oooo00O;
                    if (listViewAutoScrollHelper != null) {
                        listViewAutoScrollHelper.setEnabled(false);
                    }
                } else {
                    if (this.f62991Oooo00O == null) {
                        this.f62991Oooo00O = new ListViewAutoScrollHelper(this);
                    }
                    this.f62991Oooo00O.setEnabled(true);
                    this.f62991Oooo00O.onTouch(this, motionEvent);
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex >= 0) {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f62990Oooo000 = true;
                int i2 = Build.VERSION.SDK_INT;
                OooO00o.OooO00o(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f62987OooOoo0;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f62987OooOoo0 = iPointToPosition;
                OooO00o.OooO00o(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f62982OooOo0o;
                rect.set(left, top, right, bottom);
                rect.left -= this.f62981OooOo;
                rect.top -= this.f62984OooOoO0;
                rect.right += this.f62983OooOoO;
                rect.bottom += this.f62985OooOoOO;
                if (i2 >= 33) {
                    zOooO00o = OooO0OO.OooO00o(this);
                } else {
                    Field field = C21548OooO0o0.f62999OooO00o;
                    if (field != null) {
                        try {
                            zOooO00o = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zOooO00o = false;
                        }
                    } else {
                        zOooO00o = false;
                    }
                }
                if (childAt3.isEnabled() != zOooO00o) {
                    boolean z5 = !zOooO00o;
                    if (Build.VERSION.SDK_INT >= 33) {
                        OooO0OO.OooO0O0(this, z5);
                    } else {
                        Field field2 = C21548OooO0o0.f62999OooO00o;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    z2 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    DrawableCompat.setHotspot(selector, fExactCenterX, fExactCenterY);
                } else {
                    z2 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    DrawableCompat.setHotspot(selector2, f, f2);
                }
                setSelectorEnabled(z2);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z3 = false;
            }
        }
        if (z) {
            this.f62990Oooo000 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f62987OooOoo0 - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f62982OooOo0o;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f62992Oooo00o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f62990Oooo000 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f62989OooOooo || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f62989OooOooo || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f62989OooOooo || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f62989OooOooo && this.f62988OooOooO) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f62992Oooo00o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f62992Oooo00o == null) {
            OooO0o oooO0o = new OooO0o();
            this.f62992Oooo00o = oooO0o;
            post(oooO0o);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !OooO0O0.f62996OooO0Oo) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        OooO0O0.f62993OooO00o.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        OooO0O0.f62994OooO0O0.invoke(this, Integer.valueOf(iPointToPosition));
                        OooO0O0.f62995OooO0OO.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f62990Oooo000 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f62987OooOoo0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        OooO0o oooO0o = this.f62992Oooo00o;
        if (oooO0o != null) {
            C21546OooOooo c21546OooOooo = C21546OooOooo.this;
            c21546OooOooo.f62992Oooo00o = null;
            c21546OooOooo.removeCallbacks(oooO0o);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f62988OooOooO = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C21547OooO0Oo c21547OooO0Oo;
        if (drawable != null) {
            c21547OooO0Oo = new C21547OooO0Oo(drawable);
            c21547OooO0Oo.f62997OooOo0o = true;
        } else {
            c21547OooO0Oo = null;
        }
        this.f62986OooOoo = c21547OooO0Oo;
        super.setSelector(c21547OooO0Oo);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f62981OooOo = rect.left;
        this.f62984OooOoO0 = rect.top;
        this.f62983OooOoO = rect.right;
        this.f62985OooOoOO = rect.bottom;
    }
}
