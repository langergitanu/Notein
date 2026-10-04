package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C21786OooO0Oo;
import java.util.ArrayList;
import o0000ooO.C24357OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements androidx.customview.widget.OooO0OO {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final int[] f64605OoooOoO = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final int[] f64606OoooOoo = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final boolean f64607Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final boolean f64608Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final boolean f64609OooooO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f64610OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0OO f64611OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f64612OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f64613OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f64614OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C21786OooO0Oo f64615OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Paint f64616OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C21786OooO0Oo f64617OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C21852OooO0oO f64618OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ArrayList f64619Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f64620Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C21852OooO0oO f64621Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f64622Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f64623Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f64624Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f64625Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f64626Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f64627Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f64628Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public InterfaceC21850OooO0Oo f64629Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public WindowInsets f64630OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f64631OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f64632OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Drawable f64633OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f64634OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Rect f64635OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Matrix f64636OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final OooO00o f64637OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final ArrayList<View> f64638o000oOoO;

    public class OooO00o implements AccessibilityViewCommand {
        public OooO00o() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (!DrawerLayout.OooOOO(view) || drawerLayout.OooO(view) == 2) {
                return false;
            }
            drawerLayout.OooO0OO(view, true);
            return true;
        }
    }

    public class OooO0O0 extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f64640OooO00o = new Rect();

        public OooO0O0() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewOooO0oo = drawerLayout.OooO0oo();
            if (viewOooO0oo == null) {
                return true;
            }
            int iOooOO0 = drawerLayout.OooOO0(viewOooO0oo);
            drawerLayout.getClass();
            GravityCompat.getAbsoluteGravity(iOooOO0, ViewCompat.getLayoutDirection(drawerLayout));
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.f64607Ooooo00) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
                accessibilityNodeInfoCompat.setSource(view);
                Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
                }
                Rect rect = this.f64640OooO00o;
                accessibilityNodeInfoCompatObtain.getBoundsInScreen(rect);
                accessibilityNodeInfoCompat.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompatObtain.isVisibleToUser());
                accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompatObtain.getPackageName());
                accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompatObtain.getClassName());
                accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompatObtain.getContentDescription());
                accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompatObtain.isEnabled());
                accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompatObtain.isFocused());
                accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompatObtain.isAccessibilityFocused());
                accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompatObtain.isSelected());
                accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompatObtain.getActions());
                accessibilityNodeInfoCompatObtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.OooOO0o(childAt)) {
                        accessibilityNodeInfoCompat.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat.setFocusable(false);
            accessibilityNodeInfoCompat.setFocused(false);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f64607Ooooo00 || DrawerLayout.OooOO0o(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class OooO0OO extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (DrawerLayout.OooOO0o(view)) {
                return;
            }
            accessibilityNodeInfoCompat.setParent(null);
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC21850OooO0Oo {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    public static abstract class OooO0o implements InterfaceC21850OooO0Oo {
        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public void onDrawerClosed(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public void onDrawerOpened(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public void onDrawerSlide(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public void onDrawerStateChanged(int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0o0, reason: case insensitive filesystem */
    public static class C21851OooO0o0 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f64642OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f64643OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f64644OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f64645OooO0Oo;
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0oO, reason: case insensitive filesystem */
    public class C21852OooO0oO extends C21786OooO0Oo.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f64646OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C21786OooO0Oo f64647OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f64648OooO0OO = new OooO00o();

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$OooO0oO$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewOooO0o;
                int width;
                C21852OooO0oO c21852OooO0oO = C21852OooO0oO.this;
                int i = c21852OooO0oO.f64647OooO0O0.f64393OooOOOO;
                int i2 = c21852OooO0oO.f64646OooO00o;
                boolean z = i2 == 3;
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z) {
                    viewOooO0o = drawerLayout.OooO0o(3);
                    width = (viewOooO0o != null ? -viewOooO0o.getWidth() : 0) + i;
                } else {
                    viewOooO0o = drawerLayout.OooO0o(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (viewOooO0o != null) {
                    if (((!z || viewOooO0o.getLeft() >= width) && (z || viewOooO0o.getLeft() <= width)) || drawerLayout.OooO(viewOooO0o) != 0) {
                        return;
                    }
                    C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) viewOooO0o.getLayoutParams();
                    c21852OooO0oO.f64647OooO0O0.OooOo0O(viewOooO0o, width, viewOooO0o.getTop());
                    c21851OooO0o0.f64644OooO0OO = true;
                    drawerLayout.invalidate();
                    View viewOooO0o2 = drawerLayout.OooO0o(i2 == 3 ? 5 : 3);
                    if (viewOooO0o2 != null) {
                        drawerLayout.OooO0OO(viewOooO0o2, true);
                    }
                    if (drawerLayout.f64628Oooo0oO) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        drawerLayout.getChildAt(i3).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f64628Oooo0oO = true;
                }
            }
        }

        public C21852OooO0oO(int i) {
            this.f64646OooO00o = i;
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.OooO0O0(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.OooOOOO(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onEdgeDragStarted(int i, int i2) {
            int i3 = i & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewOooO0o = i3 == 1 ? drawerLayout.OooO0o(3) : drawerLayout.OooO0o(5);
            if (viewOooO0o == null || drawerLayout.OooO(viewOooO0o) != 0) {
                return;
            }
            this.f64647OooO0O0.OooO0OO(i2, viewOooO0o);
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final boolean onEdgeLock(int i) {
            return false;
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f64648OooO0OO, 160L);
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewCaptured(View view, int i) {
            ((C21851OooO0o0) view.getLayoutParams()).f64644OooO0OO = false;
            int i2 = this.f64646OooO00o == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewOooO0o = drawerLayout.OooO0o(i2);
            if (viewOooO0o != null) {
                drawerLayout.OooO0OO(viewOooO0o, true);
            }
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewDragStateChanged(int i) {
            DrawerLayout.this.OooOo0o(i, this.f64647OooO0O0.f64399OooOo00);
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.OooO0O0(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
            drawerLayout.OooOo00(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewReleased(View view, float f, float f2) {
            int i;
            DrawerLayout drawerLayout = DrawerLayout.this;
            int[] iArr = DrawerLayout.f64605OoooOoO;
            float f3 = ((C21851OooO0o0) view.getLayoutParams()).f64643OooO0O0;
            int width = view.getWidth();
            if (drawerLayout.OooO0O0(3, view)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f64647OooO0O0.OooOo00(i, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final boolean tryCaptureView(View view, int i) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            return DrawerLayout.OooOOOO(view) && drawerLayout.OooO0O0(this.f64646OooO00o, view) && drawerLayout.OooO(view) == 0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f64651OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f64652OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f64653OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f64654OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f64655OooOoOO;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f64652OooOo0o = 0;
            this.f64652OooOo0o = parcel.readInt();
            this.f64651OooOo = parcel.readInt();
            this.f64654OooOoO0 = parcel.readInt();
            this.f64653OooOoO = parcel.readInt();
            this.f64655OooOoOO = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f64652OooOo0o);
            parcel.writeInt(this.f64651OooOo);
            parcel.writeInt(this.f64654OooOoO0);
            parcel.writeInt(this.f64653OooOoO);
            parcel.writeInt(this.f64655OooOoOO);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f64607Ooooo00 = true;
        f64608Ooooo0o = true;
        f64609OooooO0 = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.orion.notein.global.R.attr.drawerLayoutStyle);
        this.f64611OooOo0o = new OooO0OO();
        this.f64612OooOoO = -1728053248;
        this.f64616OooOoo0 = new Paint();
        this.f64620Oooo0 = true;
        this.f64624Oooo0O0 = 3;
        this.f64625Oooo0OO = 3;
        this.f64627Oooo0o0 = 3;
        this.f64626Oooo0o = 3;
        this.f64637OoooOo0 = new OooO00o();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f64613OooOoO0 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C21852OooO0oO c21852OooO0oO = new C21852OooO0oO(3);
        this.f64618OooOooo = c21852OooO0oO;
        C21852OooO0oO c21852OooO0oO2 = new C21852OooO0oO(5);
        this.f64621Oooo000 = c21852OooO0oO2;
        C21786OooO0Oo c21786OooO0OoOooO = C21786OooO0Oo.OooO(this, 1.0f, c21852OooO0oO);
        this.f64615OooOoo = c21786OooO0OoOooO;
        c21786OooO0OoOooO.f64396OooOOo0 = 1;
        c21786OooO0OoOooO.f64391OooOOO = f2;
        c21852OooO0oO.f64647OooO0O0 = c21786OooO0OoOooO;
        C21786OooO0Oo c21786OooO0OoOooO2 = C21786OooO0Oo.OooO(this, 1.0f, c21852OooO0oO2);
        this.f64617OooOooO = c21786OooO0OoOooO2;
        c21786OooO0OoOooO2.f64396OooOOo0 = 2;
        c21786OooO0OoOooO2.f64391OooOOO = f2;
        c21852OooO0oO2.f64647OooO0O0 = c21786OooO0OoOooO2;
        setFocusableInTouchMode(true);
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewCompat.setAccessibilityDelegate(this, new OooO0O0());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.getFitsSystemWindows(this)) {
            setOnApplyWindowInsetsListener(new o000.OooO00o());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f64605OoooOoO);
            try {
                this.f64633OoooO0O = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C24357OooO00o.f82136OooO00o, com.orion.notein.global.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f64610OooOo = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f64610OooOo = getResources().getDimension(com.orion.notein.global.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f64638o000oOoO = new ArrayList<>();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String OooOO0O(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean OooOO0o(View view) {
        return (ViewCompat.getImportantForAccessibility(view) == 4 || ViewCompat.getImportantForAccessibility(view) == 2) ? false : true;
    }

    public static boolean OooOOO(View view) {
        if (OooOOOO(view)) {
            return (((C21851OooO0o0) view.getLayoutParams()).f64645OooO0Oo & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean OooOOO0(View view) {
        return ((C21851OooO0o0) view.getLayoutParams()).f64642OooO00o == 0;
    }

    public static boolean OooOOOO(View view) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(((C21851OooO0o0) view.getLayoutParams()).f64642OooO00o, ViewCompat.getLayoutDirection(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final int OooO(View view) {
        if (!OooOOOO(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((C21851OooO0o0) view.getLayoutParams()).f64642OooO00o;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        if (i == 3) {
            int i2 = this.f64624Oooo0O0;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.f64627Oooo0o0 : this.f64626Oooo0o;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.f64625Oooo0OO;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.f64626Oooo0o : this.f64627Oooo0o0;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.f64627Oooo0o0;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.f64624Oooo0O0 : this.f64625Oooo0OO;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.f64626Oooo0o;
        if (i8 != 3) {
            return i8;
        }
        int i9 = layoutDirection == 0 ? this.f64625Oooo0OO : this.f64624Oooo0O0;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    public final void OooO00o(InterfaceC21850OooO0Oo interfaceC21850OooO0Oo) {
        if (interfaceC21850OooO0Oo == null) {
            return;
        }
        if (this.f64619Oooo == null) {
            this.f64619Oooo = new ArrayList();
        }
        this.f64619Oooo.add(interfaceC21850OooO0Oo);
    }

    public final boolean OooO0O0(int i, View view) {
        return (OooOO0(view) & i) == i;
    }

    public final void OooO0OO(View view, boolean z) {
        if (!OooOOOO(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) view.getLayoutParams();
        if (this.f64620Oooo0) {
            c21851OooO0o0.f64643OooO0O0 = 0.0f;
            c21851OooO0o0.f64645OooO0Oo = 0;
        } else if (z) {
            c21851OooO0o0.f64645OooO0Oo |= 4;
            if (OooO0O0(3, view)) {
                this.f64615OooOoo.OooOo0O(view, -view.getWidth(), view.getTop());
            } else {
                this.f64617OooOooO.OooOo0O(view, getWidth(), view.getTop());
            }
        } else {
            float f = ((C21851OooO0o0) view.getLayoutParams()).f64643OooO0O0;
            float width = view.getWidth();
            int i = ((int) (width * 0.0f)) - ((int) (f * width));
            if (!OooO0O0(3, view)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            OooOo00(view, 0.0f);
            OooOo0o(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public final void OooO0Oo(boolean z) {
        View viewOooO0o = OooO0o(GravityCompat.START);
        if (viewOooO0o != null) {
            OooO0OO(viewOooO0o, z);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + OooOO0O(GravityCompat.START));
        }
    }

    public final View OooO0o(int i) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((OooOO0(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final void OooO0o0(boolean z) {
        int childCount = getChildCount();
        boolean zOooOo0O = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) childAt.getLayoutParams();
            if (OooOOOO(childAt) && (!z || c21851OooO0o0.f64644OooO0OO)) {
                zOooOo0O |= OooO0O0(3, childAt) ? this.f64615OooOoo.OooOo0O(childAt, -childAt.getWidth(), childAt.getTop()) : this.f64617OooOooO.OooOo0O(childAt, getWidth(), childAt.getTop());
                c21851OooO0o0.f64644OooO0OO = false;
            }
        }
        C21852OooO0oO c21852OooO0oO = this.f64618OooOooo;
        DrawerLayout.this.removeCallbacks(c21852OooO0oO.f64648OooO0OO);
        C21852OooO0oO c21852OooO0oO2 = this.f64621Oooo000;
        DrawerLayout.this.removeCallbacks(c21852OooO0oO2.f64648OooO0OO);
        if (zOooOo0O) {
            invalidate();
        }
    }

    public final View OooO0oO() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C21851OooO0o0) childAt.getLayoutParams()).f64645OooO0Oo & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View OooO0oo() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (OooOOOO(childAt)) {
                if (!OooOOOO(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C21851OooO0o0) childAt.getLayoutParams()).f64643OooO0O0 > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int OooOO0(View view) {
        return GravityCompat.getAbsoluteGravity(((C21851OooO0o0) view.getLayoutParams()).f64642OooO00o, ViewCompat.getLayoutDirection(this));
    }

    public final void OooOOOo() {
        View viewOooO0o = OooO0o(GravityCompat.START);
        if (viewOooO0o != null) {
            OooOOo0(viewOooO0o);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + OooOO0O(GravityCompat.START));
        }
    }

    public final void OooOOo(InterfaceC21850OooO0Oo interfaceC21850OooO0Oo) {
        ArrayList arrayList;
        if (interfaceC21850OooO0Oo == null || (arrayList = this.f64619Oooo) == null) {
            return;
        }
        arrayList.remove(interfaceC21850OooO0Oo);
    }

    public final void OooOOo0(View view) {
        if (!OooOOOO(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) view.getLayoutParams();
        if (this.f64620Oooo0) {
            c21851OooO0o0.f64643OooO0O0 = 1.0f;
            c21851OooO0o0.f64645OooO0Oo = 1;
            OooOo0O(view, true);
            OooOo0(view);
        } else {
            c21851OooO0o0.f64645OooO0Oo |= 2;
            if (OooO0O0(3, view)) {
                this.f64615OooOoo.OooOo0O(view, 0, view.getTop());
            } else {
                this.f64617OooOooO.OooOo0O(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void OooOOoo(int i, int i2) {
        View viewOooO0o;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i2, ViewCompat.getLayoutDirection(this));
        if (i2 == 3) {
            this.f64624Oooo0O0 = i;
        } else if (i2 == 5) {
            this.f64625Oooo0OO = i;
        } else if (i2 == 8388611) {
            this.f64627Oooo0o0 = i;
        } else if (i2 == 8388613) {
            this.f64626Oooo0o = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f64615OooOoo : this.f64617OooOooO).OooO0O0();
        }
        if (i != 1) {
            if (i == 2 && (viewOooO0o = OooO0o(absoluteGravity)) != null) {
                OooOOo0(viewOooO0o);
                return;
            }
            return;
        }
        View viewOooO0o2 = OooO0o(absoluteGravity);
        if (viewOooO0o2 != null) {
            OooO0OO(viewOooO0o2, true);
        }
    }

    public final void OooOo0(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS;
        ViewCompat.removeAccessibilityAction(view, accessibilityActionCompat.getId());
        if (!OooOOO(view) || OooO(view) == 2) {
            return;
        }
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, this.f64637OoooOo0);
    }

    public final void OooOo00(View view, float f) {
        C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) view.getLayoutParams();
        if (f == c21851OooO0o0.f64643OooO0O0) {
            return;
        }
        c21851OooO0o0.f64643OooO0O0 = f;
        ArrayList arrayList = this.f64619Oooo;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC21850OooO0Oo) this.f64619Oooo.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    public final void OooOo0O(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || OooOOOO(childAt)) && !(z && childAt == view)) {
                ViewCompat.setImportantForAccessibility(childAt, 4);
            } else {
                ViewCompat.setImportantForAccessibility(childAt, 1);
            }
        }
    }

    public final void OooOo0o(int i, View view) {
        int i2;
        View rootView;
        int i3 = this.f64615OooOoo.f64380OooO00o;
        int i4 = this.f64617OooOooO.f64380OooO00o;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C21851OooO0o0) view.getLayoutParams()).f64643OooO0O0;
            if (f == 0.0f) {
                C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) view.getLayoutParams();
                if ((c21851OooO0o0.f64645OooO0Oo & 1) == 1) {
                    c21851OooO0o0.f64645OooO0Oo = 0;
                    ArrayList arrayList = this.f64619Oooo;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC21850OooO0Oo) this.f64619Oooo.get(size)).onDrawerClosed(view);
                        }
                    }
                    OooOo0O(view, false);
                    OooOo0(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C21851OooO0o0 c21851OooO0o02 = (C21851OooO0o0) view.getLayoutParams();
                if ((c21851OooO0o02.f64645OooO0Oo & 1) == 0) {
                    c21851OooO0o02.f64645OooO0Oo = 1;
                    ArrayList arrayList2 = this.f64619Oooo;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC21850OooO0Oo) this.f64619Oooo.get(size2)).onDrawerOpened(view);
                        }
                    }
                    OooOo0O(view, true);
                    OooOo0(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f64622Oooo00O) {
            this.f64622Oooo00O = i2;
            ArrayList arrayList3 = this.f64619Oooo;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC21850OooO0Oo) this.f64619Oooo.get(size3)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.f64638o000oOoO;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!OooOOOO(childAt)) {
                arrayList2.add(childAt);
            } else if (OooOOO(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (OooO0oO() != null || OooOOOO(view)) {
            ViewCompat.setImportantForAccessibility(view, 4);
        } else {
            ViewCompat.setImportantForAccessibility(view, 1);
        }
        if (f64607Ooooo00) {
            return;
        }
        ViewCompat.setAccessibilityDelegate(view, this.f64611OooOo0o);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C21851OooO0o0) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.OooO0OO
    public final void close() {
        OooO0Oo(true);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C21851OooO0o0) getChildAt(i).getLayoutParams()).f64643OooO0O0);
        }
        this.f64614OooOoOO = fMax;
        boolean zOooO0oo = this.f64615OooOoo.OooO0oo();
        boolean zOooO0oo2 = this.f64617OooOooO.OooO0oo();
        if (zOooO0oo || zOooO0oo2) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f64614OooOoOO <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f64635OoooOOO == null) {
                this.f64635OoooOOO = new Rect();
            }
            childAt.getHitRect(this.f64635OoooOOO);
            if (this.f64635OoooOOO.contains((int) x, (int) y) && !OooOOO0(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f64636OoooOOo == null) {
                            this.f64636OoooOOo = new Matrix();
                        }
                        matrix.invert(this.f64636OoooOOo);
                        motionEventObtain.transform(this.f64636OoooOOo);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zOooOOO0 = OooOOO0(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zOooOOO0) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && OooOOOO(childAt) && childAt.getHeight() >= height) {
                    if (OooO0O0(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f64614OooOoOO;
        if (f > 0.0f && zOooOOO0) {
            int i4 = this.f64612OooOoO;
            Paint paint = this.f64616OooOoo0;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C21851OooO0o0 c21851OooO0o0 = new C21851OooO0o0(-1, -1);
        c21851OooO0o0.f64642OooO00o = 0;
        return c21851OooO0o0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C21851OooO0o0) {
            C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) layoutParams;
            C21851OooO0o0 c21851OooO0o02 = new C21851OooO0o0(c21851OooO0o0);
            c21851OooO0o02.f64642OooO00o = 0;
            c21851OooO0o02.f64642OooO00o = c21851OooO0o0.f64642OooO00o;
            return c21851OooO0o02;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C21851OooO0o0 c21851OooO0o03 = new C21851OooO0o0((ViewGroup.MarginLayoutParams) layoutParams);
            c21851OooO0o03.f64642OooO00o = 0;
            return c21851OooO0o03;
        }
        C21851OooO0o0 c21851OooO0o04 = new C21851OooO0o0(layoutParams);
        c21851OooO0o04.f64642OooO00o = 0;
        return c21851OooO0o04;
    }

    public float getDrawerElevation() {
        if (f64608Ooooo0o) {
            return this.f64610OooOo;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f64633OoooO0O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f64620Oooo0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f64620Oooo0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f64634OoooOO0 || this.f64633OoooO0O == null) {
            return;
        }
        WindowInsets windowInsets = this.f64630OoooO;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f64633OoooO0O.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f64633OoooO0O.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewOooOO0;
        int actionMasked = motionEvent.getActionMasked();
        C21786OooO0Oo c21786OooO0Oo = this.f64615OooOoo;
        boolean zOooOo0 = c21786OooO0Oo.OooOo0(motionEvent) | this.f64617OooOooO.OooOo0(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f64632OoooO00 = x;
            this.f64631OoooO0 = y;
            z = this.f64614OooOoOO > 0.0f && (viewOooOO0 = c21786OooO0Oo.OooOO0((int) x, (int) y)) != null && OooOOO0(viewOooOO0);
            this.f64628Oooo0oO = false;
        } else if (actionMasked == 1) {
            OooO0o0(true);
            this.f64628Oooo0oO = false;
            z = false;
        } else {
            if (actionMasked == 2) {
                int length = c21786OooO0Oo.f64383OooO0Oo.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if ((c21786OooO0Oo.f64389OooOO0O & (1 << i)) != 0) {
                        float f = c21786OooO0Oo.f64384OooO0o[i] - c21786OooO0Oo.f64383OooO0Oo[i];
                        float f2 = c21786OooO0Oo.f64386OooO0oO[i] - c21786OooO0Oo.f64385OooO0o0[i];
                        float f3 = (f2 * f2) + (f * f);
                        int i2 = c21786OooO0Oo.f64381OooO0O0;
                        if (f3 > i2 * i2) {
                            C21852OooO0oO c21852OooO0oO = this.f64618OooOooo;
                            DrawerLayout.this.removeCallbacks(c21852OooO0oO.f64648OooO0OO);
                            C21852OooO0oO c21852OooO0oO2 = this.f64621Oooo000;
                            DrawerLayout.this.removeCallbacks(c21852OooO0oO2.f64648OooO0OO);
                            break;
                        }
                    }
                    i++;
                }
            } else if (actionMasked == 3) {
            }
            z = false;
        }
        if (!zOooOo0 && !z) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    if (this.f64628Oooo0oO) {
                        break;
                    }
                    return false;
                }
                if (((C21851OooO0o0) getChildAt(i3).getLayoutParams()).f64644OooO0OO) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || OooO0oo() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewOooO0oo = OooO0oo();
        if (viewOooO0oo != null && OooO(viewOooO0oo) == 0) {
            OooO0o0(false);
        }
        return viewOooO0oo != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.f64623Oooo00o = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) childAt.getLayoutParams();
                if (OooOOO0(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c21851OooO0o0).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c21851OooO0o0).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c21851OooO0o0).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (OooO0O0(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c21851OooO0o0.f64643OooO0O0 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (c21851OooO0o0.f64643OooO0O0 * f3));
                    }
                    boolean z3 = f != c21851OooO0o0.f64643OooO0O0 ? z2 : false;
                    int i9 = c21851OooO0o0.f64642OooO00o & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) c21851OooO0o0).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = i10 - ((ViewGroup.MarginLayoutParams) c21851OooO0o0).bottomMargin;
                            if (i13 > i14) {
                                i11 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) c21851OooO0o0).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) c21851OooO0o0).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) c21851OooO0o0).bottomMargin);
                    }
                    if (z3) {
                        OooOo00(childAt, f);
                    }
                    int i17 = c21851OooO0o0.f64643OooO0O0 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (f64609OooooO0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            Insets systemGestureInsets = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets).getSystemGestureInsets();
            C21786OooO0Oo c21786OooO0Oo = this.f64615OooOoo;
            c21786OooO0Oo.f64393OooOOOO = Math.max(c21786OooO0Oo.f64394OooOOOo, systemGestureInsets.left);
            C21786OooO0Oo c21786OooO0Oo2 = this.f64617OooOooO;
            c21786OooO0Oo2.f64393OooOOOO = Math.max(c21786OooO0Oo2.f64394OooOOOo, systemGestureInsets.right);
        }
        this.f64623Oooo00o = false;
        this.f64620Oooo0 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.f64630OoooO != null && ViewCompat.getFitsSystemWindows(this);
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(c21851OooO0o0.f64642OooO00o, layoutDirection);
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = this.f64630OoooO;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = this.f64630OoooO;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c21851OooO0o0).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c21851OooO0o0).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c21851OooO0o0).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c21851OooO0o0).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (OooOOO0(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c21851OooO0o0).leftMargin) - ((ViewGroup.MarginLayoutParams) c21851OooO0o0).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c21851OooO0o0).topMargin) - ((ViewGroup.MarginLayoutParams) c21851OooO0o0).bottomMargin, 1073741824));
                } else {
                    if (!OooOOOO(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f64608Ooooo0o) {
                        float elevation = ViewCompat.getElevation(childAt);
                        float f = this.f64610OooOo;
                        if (elevation != f) {
                            ViewCompat.setElevation(childAt, f);
                        }
                    }
                    int iOooOO0 = OooOO0(childAt) & 7;
                    boolean z4 = iOooOO0 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + OooOO0O(iOooOO0) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f64613OooOoO0 + ((ViewGroup.MarginLayoutParams) c21851OooO0o0).leftMargin + ((ViewGroup.MarginLayoutParams) c21851OooO0o0).rightMargin, ((ViewGroup.MarginLayoutParams) c21851OooO0o0).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c21851OooO0o0).topMargin + ((ViewGroup.MarginLayoutParams) c21851OooO0o0).bottomMargin, ((ViewGroup.MarginLayoutParams) c21851OooO0o0).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewOooO0o;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f64652OooOo0o;
        if (i != 0 && (viewOooO0o = OooO0o(i)) != null) {
            OooOOo0(viewOooO0o);
        }
        int i2 = savedState.f64651OooOo;
        if (i2 != 3) {
            OooOOoo(i2, 3);
        }
        int i3 = savedState.f64654OooOoO0;
        if (i3 != 3) {
            OooOOoo(i3, 5);
        }
        int i4 = savedState.f64653OooOoO;
        if (i4 != 3) {
            OooOOoo(i4, GravityCompat.START);
        }
        int i5 = savedState.f64655OooOoOO;
        if (i5 != 3) {
            OooOOoo(i5, GravityCompat.END);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f64608Ooooo0o) {
            return;
        }
        ViewCompat.getLayoutDirection(this);
        ViewCompat.getLayoutDirection(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f64652OooOo0o = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C21851OooO0o0 c21851OooO0o0 = (C21851OooO0o0) getChildAt(i).getLayoutParams();
            int i2 = c21851OooO0o0.f64645OooO0Oo;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f64652OooOo0o = c21851OooO0o0.f64642OooO00o;
                break;
            }
        }
        savedState.f64651OooOo = this.f64624Oooo0O0;
        savedState.f64654OooOoO0 = this.f64625Oooo0OO;
        savedState.f64653OooOoO = this.f64627Oooo0o0;
        savedState.f64655OooOoOO = this.f64626Oooo0o;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View viewOooO0oO;
        C21786OooO0Oo c21786OooO0Oo = this.f64615OooOoo;
        c21786OooO0Oo.OooOOO(motionEvent);
        this.f64617OooOooO.OooOOO(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f64632OoooO00 = x;
            this.f64631OoooO0 = y;
            this.f64628Oooo0oO = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            OooO0o0(true);
            this.f64628Oooo0oO = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewOooOO0 = c21786OooO0Oo.OooOO0((int) x2, (int) y2);
        if (viewOooOO0 == null || !OooOOO0(viewOooOO0)) {
            z = true;
        } else {
            float f = x2 - this.f64632OoooO00;
            float f2 = y2 - this.f64631OoooO0;
            int i = c21786OooO0Oo.f64381OooO0O0;
            if ((f2 * f2) + (f * f) >= i * i || (viewOooO0oO = OooO0oO()) == null || OooO(viewOooO0oO) == 2) {
            }
        }
        OooO0o0(z);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            OooO0o0(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f64623Oooo00o) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f64610OooOo = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (OooOOOO(childAt)) {
                ViewCompat.setElevation(childAt, this.f64610OooOo);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC21850OooO0Oo interfaceC21850OooO0Oo) {
        InterfaceC21850OooO0Oo interfaceC21850OooO0Oo2 = this.f64629Oooo0oo;
        if (interfaceC21850OooO0Oo2 != null) {
            OooOOo(interfaceC21850OooO0Oo2);
        }
        if (interfaceC21850OooO0Oo != null) {
            OooO00o(interfaceC21850OooO0Oo);
        }
        this.f64629Oooo0oo = interfaceC21850OooO0Oo;
    }

    public void setDrawerLockMode(int i) {
        OooOOoo(i, 3);
        OooOOoo(i, 5);
    }

    public void setScrimColor(int i) {
        this.f64612OooOoO = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f64633OoooO0O = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f64633OoooO0O = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f64633OoooO0O = i != 0 ? ContextCompat.getDrawable(getContext(), i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C21851OooO0o0 c21851OooO0o0 = new C21851OooO0o0(context, attributeSet);
        c21851OooO0o0.f64642OooO00o = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f64606OoooOoo);
        c21851OooO0o0.f64642OooO00o = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return c21851OooO0o0;
    }
}
