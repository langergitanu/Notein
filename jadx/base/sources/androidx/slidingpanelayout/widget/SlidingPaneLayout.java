package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C21786OooO0Oo;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOOO0;
import o00O00o.OooO;
import o00O00oO.C24823OooOOOo;
import o00O00oO.InterfaceC24815OooO0OO;
import o00O00oO.InterfaceC24820OooO0oo;
import o00O00oO.OooOO0O;
import o00O0O00.C24832OooO0oO;
import o0Oo00oO.C28037OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.o00000OO;
import oo00o.InterfaceC34660OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements androidx.customview.widget.OooO0OO {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final boolean f66244OoooOO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f66245OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f66246OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Drawable f66247OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Drawable f66248OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f66249OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f66250OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f66251OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f66252OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f66253OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ArrayList<OooO0OO> f66254Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f66255Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f66256Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f66257Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f66258Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final CopyOnWriteArrayList f66259Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public OooO0o f66260Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f66261Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final C21786OooO0Oo f66262Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f66263Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Rect f66264Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public androidx.slidingpanelayout.widget.OooO0O0 f66265OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public InterfaceC24815OooO0OO f66266OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f66267OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooO00o f66268OoooO0O;

    public class OooO00o {
        public OooO00o() {
        }
    }

    public class OooO0O0 extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f66270OooO00o = new Rect();

        public OooO0O0() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            Rect rect = this.f66270OooO00o;
            accessibilityNodeInfoCompatObtain.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompatObtain.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompatObtain.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompatObtain.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompatObtain.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompatObtain.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompatObtain.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompatObtain.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompatObtain.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompatObtain.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompatObtain.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompatObtain.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompatObtain.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompatObtain.getMovementGranularities());
            accessibilityNodeInfoCompatObtain.recycle();
            accessibilityNodeInfoCompat.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = slidingPaneLayout.getChildAt(i);
                if (!slidingPaneLayout.OooO0O0(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.OooO0O0(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class OooO0OO implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$OooO0Oo, reason: case insensitive filesystem */
    public class C22084OooO0Oo extends C21786OooO0Oo.OooO0OO {
        public C22084OooO0Oo() {
        }

        public final boolean OooO00o() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f66256Oooo000 || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (slidingPaneLayout.OooO0Oo() && slidingPaneLayout.getLockMode() == 1) {
                return false;
            }
            return slidingPaneLayout.OooO0Oo() || slidingPaneLayout.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            C22085OooO0o0 c22085OooO0o0 = (C22085OooO0o0) slidingPaneLayout.f66251OooOoo0.getLayoutParams();
            if (!slidingPaneLayout.OooO0OO()) {
                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c22085OooO0o0).leftMargin;
                return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.f66253OooOooo + paddingLeft);
            }
            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f66251OooOoo0.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c22085OooO0o0).rightMargin));
            return Math.max(Math.min(i, width), width - slidingPaneLayout.f66253OooOooo);
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f66253OooOooo;
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onEdgeDragStarted(int i, int i2) {
            if (OooO00o()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f66262Oooo0o0.OooO0OO(i2, slidingPaneLayout.f66251OooOoo0);
            }
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onEdgeTouched(int i, int i2) {
            if (OooO00o()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f66262Oooo0o0.OooO0OO(i2, slidingPaneLayout.f66251OooOoo0);
            }
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewCaptured(View view, int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = slidingPaneLayout.getChildAt(i2);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewDragStateChanged(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f66262Oooo0o0.f64380OooO00o == 0) {
                float f = slidingPaneLayout.f66250OooOoo;
                CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.f66259Oooo0O0;
                if (f != 1.0f) {
                    View view = slidingPaneLayout.f66251OooOoo0;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((OooO0o) it.next()).OooO0O0(view);
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.f66261Oooo0o = true;
                    return;
                }
                slidingPaneLayout.OooO0oO(slidingPaneLayout.f66251OooOoo0);
                View view2 = slidingPaneLayout.f66251OooOoo0;
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((OooO0o) it2.next()).OooO0OO(view2);
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f66261Oooo0o = false;
            }
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f66251OooOoo0 == null) {
                slidingPaneLayout.f66250OooOoo = 0.0f;
            } else {
                boolean zOooO0OO = slidingPaneLayout.OooO0OO();
                C22085OooO0o0 c22085OooO0o0 = (C22085OooO0o0) slidingPaneLayout.f66251OooOoo0.getLayoutParams();
                int width = slidingPaneLayout.f66251OooOoo0.getWidth();
                if (zOooO0OO) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((zOooO0OO ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zOooO0OO ? ((ViewGroup.MarginLayoutParams) c22085OooO0o0).rightMargin : ((ViewGroup.MarginLayoutParams) c22085OooO0o0).leftMargin))) / slidingPaneLayout.f66253OooOooo;
                slidingPaneLayout.f66250OooOoo = paddingRight;
                if (slidingPaneLayout.f66257Oooo00O != 0) {
                    slidingPaneLayout.OooO0o0(paddingRight);
                }
                View view2 = slidingPaneLayout.f66251OooOoo0;
                Iterator it = slidingPaneLayout.f66259Oooo0O0.iterator();
                while (it.hasNext()) {
                    ((OooO0o) it.next()).OooO00o(view2);
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            C22085OooO0o0 c22085OooO0o0 = (C22085OooO0o0) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.OooO0OO()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c22085OooO0o0).rightMargin;
                if (f < 0.0f || (f == 0.0f && slidingPaneLayout.f66250OooOoo > 0.5f)) {
                    paddingRight += slidingPaneLayout.f66253OooOooo;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f66251OooOoo0.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) c22085OooO0o0).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && slidingPaneLayout.f66250OooOoo > 0.5f)) {
                    paddingLeft += slidingPaneLayout.f66253OooOooo;
                }
            }
            slidingPaneLayout.f66262Oooo0o0.OooOo00(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.C21786OooO0Oo.OooO0OO
        public final boolean tryCaptureView(View view, int i) {
            if (OooO00o()) {
                return ((C22085OooO0o0) view.getLayoutParams()).f66275OooO0O0;
            }
            return false;
        }
    }

    public interface OooO0o {
        void OooO00o(View view);

        void OooO0O0(View view);

        void OooO0OO(View view);
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$OooO0o0, reason: case insensitive filesystem */
    public static class C22085OooO0o0 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final int[] f66273OooO0Oo = {R.attr.layout_weight};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f66274OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f66275OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f66276OooO0OO;

        public C22085OooO0o0() {
            super(-1, -1);
            this.f66274OooO00o = 0.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$OooO0oO, reason: case insensitive filesystem */
    public static class C22086OooO0oO extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f66277OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f66278OooOo0o;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f66278OooOo0o = parcel.readInt() != 0;
            this.f66277OooOo = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f66278OooOo0o ? 1 : 0);
            parcel.writeInt(this.f66277OooOo);
        }
    }

    static {
        f66244OoooOO0 = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingPaneLayout(Context context) {
        super(context, null, 0);
        SidecarCompat sidecarCompat = null;
        this.f66246OooOo0o = 0;
        this.f66250OooOoo = 1.0f;
        this.f66259Oooo0O0 = new CopyOnWriteArrayList();
        this.f66263Oooo0oO = true;
        this.f66264Oooo0oo = new Rect();
        this.f66254Oooo = new ArrayList<>();
        this.f66268OoooO0O = new OooO00o();
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new OooO0O0());
        ViewCompat.setImportantForAccessibility(this, 1);
        C21786OooO0Oo c21786OooO0OoOooO = C21786OooO0Oo.OooO(this, 0.5f, new C22084OooO0Oo());
        this.f66262Oooo0o0 = c21786OooO0OoOooO;
        c21786OooO0OoOooO.f64391OooOOO = f * 400.0f;
        InterfaceC24820OooO0oo.f84174OooO00o.getClass();
        InterfaceC34660OooO00o interfaceC34660OooO00o = (InterfaceC34660OooO00o) InterfaceC24820OooO0oo.OooO00o.f84176OooO0O0.getValue();
        if (interfaceC34660OooO00o == null) {
            C24832OooO0oO c24832OooO0oO = C24832OooO0oO.f84215OooO0OO;
            if (C24832OooO0oO.f84215OooO0OO == null) {
                ReentrantLock reentrantLock = C24832OooO0oO.f84216OooO0Oo;
                reentrantLock.lock();
                try {
                    if (C24832OooO0oO.f84215OooO0OO == null) {
                        try {
                            OooO oooOOooO0O0 = SidecarCompat.OooO00o.OooO0O0();
                            if (oooOOooO0O0 != null) {
                                OooO other = OooO.f84121OooOoo0;
                                OooOOO0.OooO0oO(other, "other");
                                Object value = oooOOooO0O0.f84126OooOoOO.getValue();
                                OooOOO0.OooO0o(value, "<get-bigInteger>(...)");
                                Object value2 = other.f84126OooOoOO.getValue();
                                OooOOO0.OooO0o(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    SidecarCompat sidecarCompat2 = new SidecarCompat(context);
                                    if (sidecarCompat2.OooO0o0()) {
                                        sidecarCompat = sidecarCompat2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        C24832OooO0oO.f84215OooO0OO = new C24832OooO0oO(sidecarCompat);
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            interfaceC34660OooO00o = C24832OooO0oO.f84215OooO0OO;
            OooOOO0.OooO0Oo(interfaceC34660OooO00o);
        }
        OooOO0O oooOO0O = new OooOO0O(C24823OooOOOo.f84189OooO00o, interfaceC34660OooO00o);
        InterfaceC24820OooO0oo.OooO00o.f84177OooO0OO.getClass();
        setFoldingFeatureObserver(new androidx.slidingpanelayout.widget.OooO0O0(oooOO0O, ContextCompat.getMainExecutor(context)));
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat rootWindowInsets;
        if (!f66244OoooOO0 || (rootWindowInsets = ViewCompat.getRootWindowInsets(this)) == null) {
            return null;
        }
        return rootWindowInsets.getSystemGestureInsets();
    }

    private void setFoldingFeatureObserver(androidx.slidingpanelayout.widget.OooO0O0 oooO0O0) {
        this.f66265OoooO = oooO0O0;
        OooO00o onFoldingFeatureChangeListener = this.f66268OoooO0O;
        oooO0O0.getClass();
        OooOOO0.OooO0oO(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        oooO0O0.f66243OooO0Oo = onFoldingFeatureChangeListener;
    }

    public final boolean OooO00o() {
        if (!this.f66249OooOoOO) {
            this.f66261Oooo0o = false;
        }
        if (!this.f66263Oooo0oO && !OooO0o(1.0f)) {
            return false;
        }
        this.f66261Oooo0o = false;
        return true;
    }

    public final boolean OooO0O0(View view) {
        if (view == null) {
            return false;
        }
        return this.f66249OooOoOO && ((C22085OooO0o0) view.getLayoutParams()).f66276OooO0OO && this.f66250OooOoo > 0.0f;
    }

    public final boolean OooO0OO() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final boolean OooO0Oo() {
        return !this.f66249OooOoOO || this.f66250OooOoo == 0.0f;
    }

    public final boolean OooO0o(float f) {
        int paddingLeft;
        if (this.f66249OooOoOO) {
            boolean zOooO0OO = OooO0OO();
            C22085OooO0o0 c22085OooO0o0 = (C22085OooO0o0) this.f66251OooOoo0.getLayoutParams();
            if (zOooO0OO) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) c22085OooO0o0).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.f66253OooOooo) + paddingRight) + this.f66251OooOoo0.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.f66253OooOooo) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c22085OooO0o0).leftMargin);
            }
            View view = this.f66251OooOoo0;
            if (this.f66262Oooo0o0.OooOo0O(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            }
        }
        return false;
    }

    public final void OooO0o0(float f) {
        boolean zOooO0OO = OooO0OO();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f66251OooOoo0) {
                float f2 = 1.0f - this.f66252OooOooO;
                int i2 = this.f66257Oooo00O;
                this.f66252OooOooO = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zOooO0OO) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    public final void OooO0oO(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z;
        View view2 = view;
        boolean zOooO0OO = OooO0OO();
        int width = zOooO0OO ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zOooO0OO ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = zOooO0OO;
            } else {
                z = zOooO0OO;
                childAt.setVisibility((Math.max(zOooO0OO ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zOooO0OO ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zOooO0OO = z;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i, layoutParams);
            return;
        }
        C22086OooO0oO c22086OooO0oO = new C22086OooO0oO(view.getContext());
        c22086OooO0oO.addView(view);
        super.addView(c22086OooO0oO, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C22085OooO0o0) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.OooO0OO
    public final void close() {
        OooO00o();
    }

    @Override // android.view.View
    public final void computeScroll() {
        C21786OooO0Oo c21786OooO0Oo = this.f66262Oooo0o0;
        if (c21786OooO0Oo.OooO0oo()) {
            if (this.f66249OooOoOO) {
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                c21786OooO0Oo.OooO00o();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = OooO0OO() ? this.f66247OooOoO : this.f66248OooOoO0;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (OooO0OO()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zOooO0OO = OooO0OO() ^ OooO0Oo();
        C21786OooO0Oo c21786OooO0Oo = this.f66262Oooo0o0;
        if (zOooO0OO) {
            c21786OooO0Oo.f64396OooOOo0 = 1;
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                c21786OooO0Oo.f64393OooOOOO = Math.max(c21786OooO0Oo.f64394OooOOOo, systemGestureInsets.left);
            }
        } else {
            c21786OooO0Oo.f64396OooOOo0 = 2;
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                c21786OooO0Oo.f64393OooOOOO = Math.max(c21786OooO0Oo.f64394OooOOOo, systemGestureInsets2.right);
            }
        }
        C22085OooO0o0 c22085OooO0o0 = (C22085OooO0o0) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f66249OooOoOO && !c22085OooO0o0.f66275OooO0O0 && this.f66251OooOoo0 != null) {
            Rect rect = this.f66264Oooo0oo;
            canvas.getClipBounds(rect);
            if (OooO0OO()) {
                rect.left = Math.max(rect.left, this.f66251OooOoo0.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f66251OooOoo0.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C22085OooO0o0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C22085OooO0o0 c22085OooO0o0 = new C22085OooO0o0((ViewGroup.MarginLayoutParams) layoutParams);
            c22085OooO0o0.f66274OooO00o = 0.0f;
            return c22085OooO0o0;
        }
        C22085OooO0o0 c22085OooO0o02 = new C22085OooO0o0(layoutParams);
        c22085OooO0o02.f66274OooO00o = 0.0f;
        return c22085OooO0o02;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f66245OooOo;
    }

    public final int getLockMode() {
        return this.f66267OoooO00;
    }

    public int getParallaxDistance() {
        return this.f66257Oooo00O;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f66246OooOo0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f66263Oooo0oO = true;
        if (this.f66265OoooO != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                androidx.slidingpanelayout.widget.OooO0O0 oooO0O0 = this.f66265OoooO;
                oooO0O0.getClass();
                o00000OO o00000oo2 = oooO0O0.f66242OooO0OO;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                oooO0O0.f66242OooO0OO = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(C28037OooO0OO.OooO0O0(oooO0O0.f66241OooO0O0)), null, null, new androidx.slidingpanelayout.widget.OooO00o(oooO0O0, activity, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o00000OO o00000oo2;
        super.onDetachedFromWindow();
        this.f66263Oooo0oO = true;
        androidx.slidingpanelayout.widget.OooO0O0 oooO0O0 = this.f66265OoooO;
        if (oooO0O0 != null && (o00000oo2 = oooO0O0.f66242OooO0OO) != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        ArrayList<OooO0OO> arrayList = this.f66254Oooo;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f66249OooOoOO;
        C21786OooO0Oo c21786OooO0Oo = this.f66262Oooo0o0;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            c21786OooO0Oo.getClass();
            this.f66261Oooo0o = C21786OooO0Oo.OooOOO0(childAt, x, y);
        }
        if (!this.f66249OooOoOO || (this.f66256Oooo000 && actionMasked != 0)) {
            c21786OooO0Oo.OooO0O0();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            c21786OooO0Oo.OooO0O0();
            return false;
        }
        if (actionMasked == 0) {
            this.f66256Oooo000 = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f66258Oooo00o = x2;
            this.f66255Oooo0 = y2;
            c21786OooO0Oo.getClass();
            if (C21786OooO0Oo.OooOOO0(this.f66251OooOoo0, (int) x2, (int) y2) && OooO0O0(this.f66251OooOoo0)) {
                z = true;
            }
            return !c21786OooO0Oo.OooOo0(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.f66258Oooo00o);
            float fAbs2 = Math.abs(y3 - this.f66255Oooo0);
            if (fAbs > c21786OooO0Oo.f64381OooO0O0 && fAbs2 > fAbs) {
                c21786OooO0Oo.OooO0O0();
                this.f66256Oooo000 = true;
                return false;
            }
        }
        z = false;
        if (c21786OooO0Oo.OooOo0(motionEvent)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean zOooO0OO = OooO0OO();
        int i10 = i3 - i;
        int paddingRight = zOooO0OO ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zOooO0OO ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f66263Oooo0oO) {
            this.f66250OooOoo = (this.f66249OooOoOO && this.f66261Oooo0o) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C22085OooO0o0 c22085OooO0o0 = (C22085OooO0o0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c22085OooO0o0.f66275OooO0O0) {
                    int i13 = i10 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i13) - i11) - (((ViewGroup.MarginLayoutParams) c22085OooO0o0).leftMargin + ((ViewGroup.MarginLayoutParams) c22085OooO0o0).rightMargin);
                    this.f66253OooOooo = iMin;
                    int i14 = zOooO0OO ? ((ViewGroup.MarginLayoutParams) c22085OooO0o0).rightMargin : ((ViewGroup.MarginLayoutParams) c22085OooO0o0).leftMargin;
                    c22085OooO0o0.f66276OooO0OO = (measuredWidth / 2) + ((i11 + i14) + iMin) > i13;
                    float f = iMin;
                    int i15 = (int) (this.f66250OooOoo * f);
                    i5 = i14 + i15 + i11;
                    this.f66250OooOoo = i15 / f;
                } else if (!this.f66249OooOoOO || (i6 = this.f66257Oooo00O) == 0) {
                    i5 = paddingRight;
                } else {
                    i7 = (int) ((1.0f - this.f66250OooOoo) * i6);
                    i5 = paddingRight;
                    if (zOooO0OO) {
                        i8 = i5 - i7;
                        i9 = i8 + measuredWidth;
                    } else {
                        i9 = (i10 - i5) + i7;
                        i8 = i9 - measuredWidth;
                    }
                    childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                    InterfaceC24815OooO0OO interfaceC24815OooO0OO = this.f66266OoooO0;
                    paddingRight = Math.abs((interfaceC24815OooO0OO == null && interfaceC24815OooO0OO.getOrientation() == InterfaceC24815OooO0OO.OooO00o.f84157OooO0O0 && this.f66266OoooO0.OooO00o()) ? this.f66266OoooO0.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
                    i11 = i5;
                }
                i7 = 0;
                if (zOooO0OO) {
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                InterfaceC24815OooO0OO interfaceC24815OooO0OO2 = this.f66266OoooO0;
                if (interfaceC24815OooO0OO2 == null) {
                    paddingRight = Math.abs((interfaceC24815OooO0OO2 == null && interfaceC24815OooO0OO2.getOrientation() == InterfaceC24815OooO0OO.OooO00o.f84157OooO0O0 && this.f66266OoooO0.OooO00o()) ? this.f66266OoooO0.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
                    i11 = i5;
                }
            }
        }
        if (this.f66263Oooo0oO) {
            if (this.f66249OooOoOO && this.f66257Oooo00O != 0) {
                OooO0o0(this.f66250OooOoo);
            }
            OooO0oO(this.f66251OooOoo0);
        }
        this.f66263Oooo0oO = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[PHI: r17
      0x0089: PHI (r17v2 float) = (r17v1 float), (r17v3 float) binds: [B:19:0x007f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int i4;
        int iMax;
        int iMakeMeasureSpec;
        int i5;
        ArrayList arrayList;
        int i6;
        int i7;
        int minimumWidth;
        int iMakeMeasureSpec2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r6 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax2 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f66251OooOoo0 = null;
        int i8 = 0;
        boolean z = false;
        int i9 = iMax2;
        float f = 0.0f;
        while (true) {
            i3 = 1;
            i4 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            C22085OooO0o0 c22085OooO0o0 = (C22085OooO0o0) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                c22085OooO0o0.f66276OooO0OO = r6;
            } else {
                float f2 = c22085OooO0o0.f66274OooO00o;
                if (f2 > 0.0f) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) c22085OooO0o0).width != 0) {
                        int iMax3 = Math.max(iMax2 - (((ViewGroup.MarginLayoutParams) c22085OooO0o0).leftMargin + ((ViewGroup.MarginLayoutParams) c22085OooO0o0).rightMargin), (int) r6);
                        int i10 = ((ViewGroup.MarginLayoutParams) c22085OooO0o0).width;
                        if (i10 == -2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax3, mode == 0 ? mode : Integer.MIN_VALUE);
                        } else {
                            iMakeMeasureSpec2 = i10 == -1 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c22085OooO0o0).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i9 -= measuredWidth;
                        if (i8 != 0) {
                            boolean z2 = i9 < 0;
                            c22085OooO0o0.f66275OooO0O0 = z2;
                            z |= z2;
                            if (z2) {
                                this.f66251OooOoo0 = childAt;
                            }
                        }
                    }
                }
            }
            i8++;
            r6 = 0;
        }
        if (z || f > 0.0f) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt2 = getChildAt(i11);
                if (childAt2.getVisibility() == i4) {
                    i5 = i11;
                } else {
                    C22085OooO0o0 c22085OooO0o02 = (C22085OooO0o0) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) c22085OooO0o02).width != 0 || c22085OooO0o02.f66274OooO00o <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z) {
                        iMax = iMax2 - (((ViewGroup.MarginLayoutParams) c22085OooO0o02).leftMargin + ((ViewGroup.MarginLayoutParams) c22085OooO0o02).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (c22085OooO0o02.f66274OooO00o > 0.0f) {
                        iMax = ((int) ((c22085OooO0o02.f66274OooO00o * Math.max(0, i9)) / f)) + measuredWidth2;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth2;
                        iMakeMeasureSpec = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    C22085OooO0o0 c22085OooO0o03 = (C22085OooO0o0) childAt2.getLayoutParams();
                    i5 = i11;
                    int iMakeMeasureSpec3 = (((ViewGroup.MarginLayoutParams) c22085OooO0o03).width != 0 || c22085OooO0o03.f66274OooO00o <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) c22085OooO0o03).height);
                    if (measuredWidth2 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i11 = i5 + 1;
                i4 = 8;
            }
        }
        InterfaceC24815OooO0OO interfaceC24815OooO0OO = this.f66266OoooO0;
        if (interfaceC24815OooO0OO == null || !interfaceC24815OooO0OO.OooO00o() || this.f66266OoooO0.getBounds().left == 0 || this.f66266OoooO0.getBounds().top != 0) {
            arrayList = null;
        } else {
            InterfaceC24815OooO0OO interfaceC24815OooO0OO2 = this.f66266OoooO0;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i12 = iArr[0];
            Rect rect = new Rect(i12, iArr[1], getWidth() + i12, getWidth() + iArr[1]);
            Rect rect2 = new Rect(interfaceC24815OooO0OO2.getBounds());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 != null) {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i13);
                    C22085OooO0o0 c22085OooO0o04 = (C22085OooO0o0) childAt3.getLayoutParams();
                    int i14 = ((ViewGroup.MarginLayoutParams) c22085OooO0o04).leftMargin + ((ViewGroup.MarginLayoutParams) c22085OooO0o04).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) != i3) {
                        boolean z3 = childAt3 instanceof C22086OooO0oO;
                        if (z3) {
                            i7 = 0;
                            minimumWidth = ViewCompat.getMinimumWidth(((C22086OooO0oO) childAt3).getChildAt(0));
                        } else {
                            i7 = 0;
                            minimumWidth = ViewCompat.getMinimumWidth(childAt3);
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z3 ? ViewCompat.getMinimumWidth(((C22086OooO0oO) childAt3).getChildAt(i7)) : ViewCompat.getMinimumWidth(childAt3))) {
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax2 - i14, 1073741824), iMakeMeasureSpec4);
                    if (i13 != 0) {
                        i6 = 1;
                        c22085OooO0o04.f66275OooO0O0 = true;
                        this.f66251OooOoo0 = childAt3;
                        z = true;
                    }
                    i13++;
                    i3 = i6;
                }
                i6 = 1;
                i13++;
                i3 = i6;
            }
        }
        boolean z4 = z;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.f66249OooOoOO = z4;
        C21786OooO0Oo c21786OooO0Oo = this.f66262Oooo0o0;
        if (c21786OooO0Oo.f64380OooO00o == 0 || z4) {
            return;
        }
        c21786OooO0Oo.OooO00o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f66278OooOo0o) {
            if (!this.f66249OooOoOO) {
                this.f66261Oooo0o = true;
            }
            if (this.f66263Oooo0oO || OooO0o(0.0f)) {
                this.f66261Oooo0o = true;
            }
        } else {
            OooO00o();
        }
        this.f66261Oooo0o = savedState.f66278OooOo0o;
        setLockMode(savedState.f66277OooOo);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f66278OooOo0o = this.f66249OooOoOO ? OooO0Oo() : this.f66261Oooo0o;
        savedState.f66277OooOo = this.f66267OoooO00;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f66263Oooo0oO = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f66249OooOoOO) {
            return super.onTouchEvent(motionEvent);
        }
        C21786OooO0Oo c21786OooO0Oo = this.f66262Oooo0o0;
        c21786OooO0Oo.OooOOO(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f66258Oooo00o = x;
            this.f66255Oooo0 = y;
            return true;
        }
        if (actionMasked == 1 && OooO0O0(this.f66251OooOoo0)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f66258Oooo00o;
            float f2 = y2 - this.f66255Oooo0;
            int i = c21786OooO0Oo.f64381OooO0O0;
            if ((f2 * f2) + (f * f) < i * i && C21786OooO0Oo.OooOOO0(this.f66251OooOoo0, (int) x2, (int) y2)) {
                OooO00o();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof C22086OooO0oO) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f66249OooOoOO) {
            return;
        }
        this.f66261Oooo0o = view == this.f66251OooOoo0;
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.f66245OooOo = i;
    }

    public final void setLockMode(int i) {
        this.f66267OoooO00 = i;
    }

    @Deprecated
    public void setPanelSlideListener(OooO0o oooO0o) {
        OooO0o oooO0o2 = this.f66260Oooo0OO;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f66259Oooo0O0;
        if (oooO0o2 != null) {
            copyOnWriteArrayList.remove(oooO0o2);
        }
        if (oooO0o != null) {
            copyOnWriteArrayList.add(oooO0o);
        }
        this.f66260Oooo0OO = oooO0o;
    }

    public void setParallaxDistance(int i) {
        this.f66257Oooo00O = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f66248OooOoO0 = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f66247OooOoO = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.f66246OooOo0o = i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C22085OooO0o0 c22085OooO0o0 = new C22085OooO0o0(context, attributeSet);
        c22085OooO0o0.f66274OooO00o = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C22085OooO0o0.f66273OooO0Oo);
        c22085OooO0o0.f66274OooO00o = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return c22085OooO0o0;
    }
}
