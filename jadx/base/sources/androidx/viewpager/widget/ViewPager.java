package androidx.viewpager.widget;

import Oooo0oO.C21023OooO0Oo;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList<C22124OooO0o0> f66523OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f66524OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Rect f66525OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C22124OooO0o0 f66526OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00O00O.OooO00o f66527OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f66528OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f66529OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Parcelable f66530OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Scroller f66531OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f66532Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public Drawable f66533Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f66534Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public OooOO0 f66535Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f66536Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f66537Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f66538Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f66539Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f66540Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f66541Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f66542Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f66543OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f66544OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f66545OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f66546OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f66547OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int f66548OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f66549OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f66550OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f66551OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f66552OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f66553Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public VelocityTracker f66554Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final int f66555OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f66556OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final int f66557OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final EdgeEffect f66558Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final int f66559Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final EdgeEffect f66560OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f66561Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f66562o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public ArrayList f66563o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public OooO f66564o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public ArrayList f66565o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final OooO0OO f66566o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f66567o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f66568o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f66569ooOO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final int[] f66522oo000o = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final OooO00o f66521o00oO0o = new OooO00o();

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static final OooO0O0 f66520o00oO0O = new OooO0O0();

    public interface OooO {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public static class OooO00o implements Comparator<C22124OooO0o0> {
        @Override // java.util.Comparator
        public final int compare(C22124OooO0o0 c22124OooO0o0, C22124OooO0o0 c22124OooO0o02) {
            return c22124OooO0o0.f66575OooO00o - c22124OooO0o02.f66575OooO00o;
        }
    }

    public static class OooO0O0 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.OooOOOo();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$OooO0Oo, reason: case insensitive filesystem */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC22123OooO0Oo {
    }

    public static class OooO0o extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f66571OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66572OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f66573OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f66574OooO0Oo;

        public OooO0o() {
            super(-1, -1);
            this.f66573OooO0OO = 0.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$OooO0o0, reason: case insensitive filesystem */
    public static class C22124OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66575OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f66576OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f66577OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f66578OooO0Oo;
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$OooO0oO, reason: case insensitive filesystem */
    public class C22125OooO0oO extends AccessibilityDelegateCompat {
        public C22125OooO0oO() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            o00O00O.OooO00o oooO00o;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            o00O00O.OooO00o oooO00o2 = viewPager.f66527OooOoOO;
            if (oooO00o2 != null) {
                z = oooO00o2.OooO00o() > 1;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() != 4096 || (oooO00o = viewPager.f66527OooOoOO) == null) {
                return;
            }
            accessibilityEvent.setItemCount(oooO00o.OooO00o());
            accessibilityEvent.setFromIndex(viewPager.f66529OooOoo0);
            accessibilityEvent.setToIndex(viewPager.f66529OooOoo0);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            o00O00O.OooO00o oooO00o = viewPager.f66527OooOoOO;
            accessibilityNodeInfoCompat.setScrollable(oooO00o != null && oooO00o.OooO00o() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) throws Throwable {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f66529OooOoo0 + 1);
                return true;
            }
            if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f66529OooOoo0 - 1);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$OooO0oo, reason: case insensitive filesystem */
    public interface InterfaceC22126OooO0oo {
        void onAdapterChanged(ViewPager viewPager, o00O00O.OooO00o oooO00o, o00O00O.OooO00o oooO00o2);
    }

    public class OooOO0 extends DataSetObserver {
        public OooOO0() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() throws Throwable {
            ViewPager.this.OooO0o0();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() throws Throwable {
            ViewPager.this.OooO0o0();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Parcelable f66581OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f66582OooOo0o;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
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
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f66582OooOo0o = parcel.readInt();
            this.f66581OooOo = parcel.readParcelable(classLoader);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return C21023OooO0Oo.OooO0OO("}", this.f66582OooOo0o, sb);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f66582OooOo0o);
            parcel.writeParcelable(this.f66581OooOo, i);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66523OooOo = new ArrayList<>();
        this.f66526OooOoO0 = new C22124OooO0o0();
        this.f66525OooOoO = new Rect();
        this.f66528OooOoo = -1;
        this.f66530OooOooO = null;
        this.f66540Oooo0o0 = -3.4028235E38f;
        this.f66539Oooo0o = Float.MAX_VALUE;
        this.f66544OoooO0 = 1;
        this.f66553Ooooo00 = -1;
        this.f66561Ooooooo = true;
        this.f66566o00o0O = new OooO0OO();
        this.f66567o00ooo = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f66531OooOooo = new Scroller(context2, f66520o00oO0O);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f66548OoooOOO = viewConfiguration.getScaledPagingTouchSlop();
        this.f66555OooooO0 = (int) (400.0f * f);
        this.f66556OooooOO = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f66558Oooooo = new EdgeEffect(context2);
        this.f66560OoooooO = new EdgeEffect(context2);
        this.f66557OooooOo = (int) (25.0f * f);
        this.f66559Oooooo0 = (int) (2.0f * f);
        this.f66547OoooOO0 = (int) (f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new C22125OooO0oO());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new o00O00O.OooO0O0(this));
    }

    public static boolean OooO0OO(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && OooO0OO(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f66532Oooo != z) {
            this.f66532Oooo = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C22124OooO0o0 OooO() {
        C22124OooO0o0 c22124OooO0o0;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f66536Oooo00o / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        C22124OooO0o0 c22124OooO0o02 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
            if (i2 >= arrayList.size()) {
                break;
            }
            C22124OooO0o0 c22124OooO0o03 = arrayList.get(i2);
            if (z || c22124OooO0o03.f66575OooO00o == (i = i3 + 1)) {
                c22124OooO0o0 = c22124OooO0o03;
            } else {
                float f4 = f + f3 + f2;
                C22124OooO0o0 c22124OooO0o04 = this.f66526OooOoO0;
                c22124OooO0o04.f66578OooO0Oo = f4;
                c22124OooO0o04.f66575OooO00o = i;
                this.f66527OooOoOO.getClass();
                c22124OooO0o04.f66577OooO0OO = 1.0f;
                i2--;
                c22124OooO0o0 = c22124OooO0o04;
            }
            f = c22124OooO0o0.f66578OooO0Oo;
            float f5 = c22124OooO0o0.f66577OooO0OO + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i2 == arrayList.size() - 1) {
                break;
            }
            int i4 = c22124OooO0o0.f66575OooO00o;
            float f6 = c22124OooO0o0.f66577OooO0OO;
            i2++;
            C22124OooO0o0 c22124OooO0o05 = c22124OooO0o0;
            i3 = i4;
            f3 = f6;
            c22124OooO0o02 = c22124OooO0o05;
            z = false;
        }
        return c22124OooO0o0;
    }

    public final void OooO00o(int i) {
        new C22124OooO0o0().f66575OooO00o = i;
        this.f66527OooOoOO.getClass();
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0O0(int i) throws Throwable {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean z = true;
        boolean zOooOOO0 = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f66525OooOoO;
            if (i == 17) {
                int i2 = OooO0oO(rect, viewFindNextFocus).left;
                int i3 = OooO0oO(rect, viewFindFocus).left;
                if (viewFindFocus == null || i2 < i3) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i4 = this.f66529OooOoo0;
                    if (i4 > 0) {
                        this.f66545OoooO00 = false;
                        OooOo0(i4 - 1, 0, true, false);
                    }
                    zOooOOO0 = z;
                }
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || OooO0oO(rect, viewFindNextFocus).left > OooO0oO(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : OooOOO0();
            }
            zOooOOO0 = zRequestFocus;
        } else if (i == 17 || i == 1) {
            int i5 = this.f66529OooOoo0;
            if (i5 > 0) {
                this.f66545OoooO00 = false;
                OooOo0(i5 - 1, 0, true, false);
            } else {
                z = false;
            }
            zOooOOO0 = z;
        } else if (i == 66 || i == 2) {
            zOooOOO0 = OooOOO0();
        }
        if (zOooOOO0) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zOooOOO0;
    }

    public final void OooO0Oo(boolean z) throws Throwable {
        boolean z2 = this.f66567o00ooo == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f66531OooOooo.isFinished()) {
                this.f66531OooOooo.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f66531OooOooo.getCurrX();
                int currY = this.f66531OooOooo.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        OooOOO(currX);
                    }
                }
            }
        }
        this.f66545OoooO00 = false;
        int i = 0;
        while (true) {
            ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
            if (i >= arrayList.size()) {
                break;
            }
            C22124OooO0o0 c22124OooO0o0 = arrayList.get(i);
            if (c22124OooO0o0.f66576OooO0O0) {
                c22124OooO0o0.f66576OooO0O0 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            OooO0OO oooO0OO = this.f66566o00o0O;
            if (z) {
                ViewCompat.postOnAnimation(this, oooO0OO);
            } else {
                oooO0OO.run();
            }
        }
    }

    public final void OooO0o(int i) {
        OooO oooO = this.f66564o00Oo0;
        if (oooO != null) {
            oooO.onPageSelected(i);
        }
        ArrayList arrayList = this.f66563o00O0O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO oooO2 = (OooO) this.f66563o00O0O.get(i2);
                if (oooO2 != null) {
                    oooO2.onPageSelected(i);
                }
            }
        }
    }

    public final void OooO0o0() throws Throwable {
        int iOooO00o = this.f66527OooOoOO.OooO00o();
        this.f66524OooOo0o = iOooO00o;
        ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
        boolean z = arrayList.size() < (this.f66544OoooO0 * 2) + 1 && arrayList.size() < iOooO00o;
        int i = this.f66529OooOoo0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C22124OooO0o0 c22124OooO0o0 = arrayList.get(i2);
            o00O00O.OooO00o oooO00o = this.f66527OooOoOO;
            c22124OooO0o0.getClass();
            oooO00o.getClass();
        }
        Collections.sort(arrayList, f66521o00oO0o);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                OooO0o oooO0o = (OooO0o) getChildAt(i3).getLayoutParams();
                if (!oooO0o.f66571OooO00o) {
                    oooO0o.f66573OooO0OO = 0.0f;
                }
            }
            OooOo0(i, 0, false, true);
            requestLayout();
        }
    }

    public final Rect OooO0oO(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final C22124OooO0o0 OooO0oo(View view) {
        int i = 0;
        while (true) {
            ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
            if (i >= arrayList.size()) {
                return null;
            }
            C22124OooO0o0 c22124OooO0o0 = arrayList.get(i);
            o00O00O.OooO00o oooO00o = this.f66527OooOoOO;
            c22124OooO0o0.getClass();
            if (oooO00o.OooO0O0()) {
                return c22124OooO0o0;
            }
            i++;
        }
    }

    public final C22124OooO0o0 OooOO0(int i) {
        int i2 = 0;
        while (true) {
            ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C22124OooO0o0 c22124OooO0o0 = arrayList.get(i2);
            if (c22124OooO0o0.f66575OooO00o == i) {
                return c22124OooO0o0;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0O(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f66569ooOO > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.f66571OooO00o) {
                    int i4 = oooO0o.f66572OooO0O0 & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = width;
                }
            }
        }
        OooO oooO = this.f66564o00Oo0;
        if (oooO != null) {
            oooO.onPageScrolled(i, f, i2);
        }
        ArrayList arrayList = this.f66563o00O0O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                OooO oooO2 = (OooO) this.f66563o00O0O.get(i6);
                if (oooO2 != null) {
                    oooO2.onPageScrolled(i, f, i2);
                }
            }
        }
        this.f66568o0OoOo0 = true;
    }

    public final void OooOO0o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f66553Ooooo00) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f66549OoooOOo = motionEvent.getX(i);
            this.f66553Ooooo00 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f66554Ooooo0o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean OooOOO(int i) {
        if (this.f66523OooOo.size() == 0) {
            if (!this.f66561Ooooooo) {
                this.f66568o0OoOo0 = false;
                OooOO0O(0, 0.0f, 0);
                if (!this.f66568o0OoOo0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C22124OooO0o0 c22124OooO0o0OooO = OooO();
        int clientWidth = getClientWidth();
        int i2 = this.f66536Oooo00o;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = c22124OooO0o0OooO.f66575OooO00o;
        float f2 = ((i / f) - c22124OooO0o0OooO.f66578OooO0Oo) / (c22124OooO0o0OooO.f66577OooO0OO + (i2 / f));
        this.f66568o0OoOo0 = false;
        OooOO0O(i4, f2, (int) (i3 * f2));
        if (this.f66568o0OoOo0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean OooOOO0() throws Throwable {
        o00O00O.OooO00o oooO00o = this.f66527OooOoOO;
        if (oooO00o == null || this.f66529OooOoo0 >= oooO00o.OooO00o() - 1) {
            return false;
        }
        int i = this.f66529OooOoo0 + 1;
        this.f66545OoooO00 = false;
        OooOo0(i, 0, true, false);
        return true;
    }

    public final boolean OooOOOO(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f66549OoooOOo - f;
        this.f66549OoooOOo = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f66540Oooo0o0 * clientWidth;
        float f4 = this.f66539Oooo0o * clientWidth;
        ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
        boolean z3 = false;
        C22124OooO0o0 c22124OooO0o0 = arrayList.get(0);
        C22124OooO0o0 c22124OooO0o02 = (C22124OooO0o0) C21505OooO0Oo.OooO00o(1, arrayList);
        if (c22124OooO0o0.f66575OooO00o != 0) {
            f3 = c22124OooO0o0.f66578OooO0Oo * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c22124OooO0o02.f66575OooO00o != this.f66527OooOoOO.OooO00o() - 1) {
            f4 = c22124OooO0o02.f66578OooO0Oo * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f66558Oooooo.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f66560OoooooO.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f66549OoooOOo = (scrollX - i) + this.f66549OoooOOo;
        scrollTo(i, getScrollY());
        OooOOO(i);
        return z3;
    }

    public final void OooOOOo() throws Throwable {
        OooOOo0(this.f66529OooOoo0);
    }

    public final void OooOOo(int i, int i2, int i3, int i4) throws Throwable {
        if (i2 > 0 && !this.f66523OooOo.isEmpty()) {
            if (!this.f66531OooOooo.isFinished()) {
                this.f66531OooOooo.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C22124OooO0o0 c22124OooO0o0OooOO0 = OooOO0(this.f66529OooOoo0);
        int iMin = (int) ((c22124OooO0o0OooOO0 != null ? Math.min(c22124OooO0o0OooOO0.f66578OooO0Oo, this.f66539Oooo0o) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            OooO0Oo(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOo0(int i) throws Throwable {
        C22124OooO0o0 c22124OooO0o0OooOO0;
        String hexString;
        ArrayList<C22124OooO0o0> arrayList;
        C22124OooO0o0 c22124OooO0o0;
        Throwable th;
        float f;
        C22124OooO0o0 c22124OooO0o0OooO0oo;
        C22124OooO0o0 c22124OooO0o0OooO0oo2;
        float paddingLeft;
        int i2;
        int i3;
        C22124OooO0o0 c22124OooO0o02;
        C22124OooO0o0 c22124OooO0o03;
        float f2;
        int i4 = this.f66529OooOoo0;
        if (i4 != i) {
            c22124OooO0o0OooOO0 = OooOO0(i4);
            this.f66529OooOoo0 = i;
        } else {
            c22124OooO0o0OooOO0 = null;
        }
        if (this.f66527OooOoOO == null || this.f66545OoooO00 || getWindowToken() == null) {
            return;
        }
        this.f66527OooOoOO.getClass();
        int i5 = this.f66544OoooO0;
        int iMax = Math.max(0, this.f66529OooOoo0 - i5);
        int iOooO00o = this.f66527OooOoOO.OooO00o();
        int iMin = Math.min(iOooO00o - 1, this.f66529OooOoo0 + i5);
        if (iOooO00o != this.f66524OooOo0o) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            C24472OooOoo.OooO0O0(sb, ", found: ", " Pager id: ", this.f66524OooOo0o, iOooO00o);
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.f66527OooOoOO.getClass());
            throw new IllegalStateException(sb.toString());
        }
        int i6 = 0;
        while (true) {
            arrayList = this.f66523OooOo;
            if (i6 >= arrayList.size()) {
                break;
            }
            c22124OooO0o0 = arrayList.get(i6);
            int i7 = c22124OooO0o0.f66575OooO00o;
            int i8 = this.f66529OooOoo0;
            if (i7 >= i8) {
                if (i7 != i8) {
                    break;
                }
            } else {
                i6++;
            }
        }
        if (c22124OooO0o0 == null && iOooO00o > 0) {
            OooO00o(this.f66529OooOoo0);
            throw null;
        }
        if (c22124OooO0o0 != null) {
            int i9 = i6 - 1;
            C22124OooO0o0 c22124OooO0o04 = i9 >= 0 ? arrayList.get(i9) : null;
            int clientWidth = getClientWidth();
            if (clientWidth <= 0) {
                th = null;
                paddingLeft = 0.0f;
            } else {
                th = null;
                paddingLeft = (getPaddingLeft() / clientWidth) + (2.0f - c22124OooO0o0.f66577OooO0OO);
            }
            int i10 = this.f66529OooOoo0 - 1;
            int i11 = i9;
            float f3 = 0.0f;
            f = 0.0f;
            C22124OooO0o0 c22124OooO0o05 = c22124OooO0o04;
            while (i10 >= 0) {
                if (f3 < paddingLeft || i10 >= iMax) {
                    f2 = paddingLeft;
                    if (c22124OooO0o05 == 0 || i10 != c22124OooO0o05.f66575OooO00o) {
                        OooO00o(i10);
                        throw th;
                    }
                    f3 += c22124OooO0o05.f66577OooO0OO;
                    i11--;
                    c22124OooO0o05 = i11 >= 0 ? (C22124OooO0o0) arrayList.get(i11) : th;
                } else {
                    if (c22124OooO0o05 == 0) {
                        break;
                    }
                    f2 = paddingLeft;
                    if (i10 == c22124OooO0o05.f66575OooO00o && !c22124OooO0o05.f66576OooO0O0) {
                        arrayList.remove(i11);
                        this.f66527OooOoOO.getClass();
                        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
                    }
                }
                i10--;
                paddingLeft = f2;
                c22124OooO0o05 = c22124OooO0o05;
            }
            float f4 = c22124OooO0o0.f66577OooO0OO;
            int i12 = i6 + 1;
            if (f4 < 2.0f) {
                Object obj = i12 < arrayList.size() ? arrayList.get(i12) : th;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = this.f66529OooOoo0 + 1;
                int i14 = i12;
                C22124OooO0o0 c22124OooO0o06 = obj;
                while (i13 < iOooO00o) {
                    if (f4 < paddingRight || i13 <= iMin) {
                        if (c22124OooO0o06 == 0 || i13 != c22124OooO0o06.f66575OooO00o) {
                            OooO00o(i13);
                            throw th;
                        }
                        f4 += c22124OooO0o06.f66577OooO0OO;
                        i14++;
                        c22124OooO0o06 = i14 < arrayList.size() ? arrayList.get(i14) : th;
                    } else {
                        if (c22124OooO0o06 == 0) {
                            break;
                        }
                        if (i13 == c22124OooO0o06.f66575OooO00o && !c22124OooO0o06.f66576OooO0O0) {
                            arrayList.remove(i14);
                            this.f66527OooOoOO.getClass();
                            throw new UnsupportedOperationException("Required method destroyItem was not overridden");
                        }
                    }
                    i13++;
                    c22124OooO0o06 = c22124OooO0o06;
                }
            }
            int iOooO00o2 = this.f66527OooOoOO.OooO00o();
            int clientWidth2 = getClientWidth();
            float f5 = clientWidth2 > 0 ? this.f66536Oooo00o / clientWidth2 : 0.0f;
            if (c22124OooO0o0OooOO0 != null) {
                int i15 = c22124OooO0o0OooOO0.f66575OooO00o;
                int i16 = c22124OooO0o0.f66575OooO00o;
                if (i15 < i16) {
                    float f6 = c22124OooO0o0OooOO0.f66578OooO0Oo + c22124OooO0o0OooOO0.f66577OooO0OO + f5;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= c22124OooO0o0.f66575OooO00o && i18 < arrayList.size()) {
                        C22124OooO0o0 c22124OooO0o07 = arrayList.get(i18);
                        while (true) {
                            c22124OooO0o03 = c22124OooO0o07;
                            if (i17 <= c22124OooO0o03.f66575OooO00o || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            c22124OooO0o07 = arrayList.get(i18);
                        }
                        while (i17 < c22124OooO0o03.f66575OooO00o) {
                            this.f66527OooOoOO.getClass();
                            f6 += 1.0f + f5;
                            i17++;
                        }
                        c22124OooO0o03.f66578OooO0Oo = f6;
                        f6 += c22124OooO0o03.f66577OooO0OO + f5;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float f7 = c22124OooO0o0OooOO0.f66578OooO0Oo;
                    while (true) {
                        i15--;
                        if (i15 < c22124OooO0o0.f66575OooO00o || size < 0) {
                            break;
                        }
                        C22124OooO0o0 c22124OooO0o08 = arrayList.get(size);
                        while (true) {
                            c22124OooO0o02 = c22124OooO0o08;
                            if (i15 >= c22124OooO0o02.f66575OooO00o || size <= 0) {
                                break;
                            }
                            size--;
                            c22124OooO0o08 = arrayList.get(size);
                        }
                        while (i15 > c22124OooO0o02.f66575OooO00o) {
                            this.f66527OooOoOO.getClass();
                            f7 -= 1.0f + f5;
                            i15--;
                        }
                        f7 -= c22124OooO0o02.f66577OooO0OO + f5;
                        c22124OooO0o02.f66578OooO0Oo = f7;
                    }
                }
            }
            int size2 = arrayList.size();
            float f8 = c22124OooO0o0.f66578OooO0Oo;
            int i19 = c22124OooO0o0.f66575OooO00o;
            int i20 = i19 - 1;
            this.f66540Oooo0o0 = i19 == 0 ? f8 : -3.4028235E38f;
            int i21 = iOooO00o2 - 1;
            this.f66539Oooo0o = i19 == i21 ? (c22124OooO0o0.f66577OooO0OO + f8) - 1.0f : Float.MAX_VALUE;
            while (i9 >= 0) {
                C22124OooO0o0 c22124OooO0o09 = arrayList.get(i9);
                while (true) {
                    i3 = c22124OooO0o09.f66575OooO00o;
                    if (i20 <= i3) {
                        break;
                    }
                    i20--;
                    this.f66527OooOoOO.getClass();
                    f8 -= 1.0f + f5;
                }
                f8 -= c22124OooO0o09.f66577OooO0OO + f5;
                c22124OooO0o09.f66578OooO0Oo = f8;
                if (i3 == 0) {
                    this.f66540Oooo0o0 = f8;
                }
                i9--;
                i20--;
            }
            float f9 = c22124OooO0o0.f66578OooO0Oo + c22124OooO0o0.f66577OooO0OO + f5;
            int i22 = c22124OooO0o0.f66575OooO00o;
            while (true) {
                i22++;
                if (i12 >= size2) {
                    break;
                }
                C22124OooO0o0 c22124OooO0o010 = arrayList.get(i12);
                while (true) {
                    i2 = c22124OooO0o010.f66575OooO00o;
                    if (i22 >= i2) {
                        break;
                    }
                    i22++;
                    this.f66527OooOoOO.getClass();
                    f9 += 1.0f + f5;
                }
                if (i2 == i21) {
                    this.f66539Oooo0o = (c22124OooO0o010.f66577OooO0OO + f9) - 1.0f;
                }
                c22124OooO0o010.f66578OooO0Oo = f9;
                f9 += c22124OooO0o010.f66577OooO0OO + f5;
                i12++;
            }
            this.f66527OooOoOO.getClass();
        } else {
            th = null;
            f = 0.0f;
        }
        this.f66527OooOoOO.getClass();
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
            oooO0o.getClass();
            if (!oooO0o.f66571OooO00o && oooO0o.f66573OooO0OO == f && (c22124OooO0o0OooO0oo2 = OooO0oo(childAt)) != null) {
                oooO0o.f66573OooO0OO = c22124OooO0o0OooO0oo2.f66577OooO0OO;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                while (true) {
                    Object parent = viewFindFocus.getParent();
                    if (parent == this) {
                        c22124OooO0o0OooO0oo = OooO0oo(viewFindFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        viewFindFocus = (View) parent;
                    }
                }
                c22124OooO0o0OooO0oo = th;
            } else {
                c22124OooO0o0OooO0oo = th;
            }
            if (c22124OooO0o0OooO0oo == 0 || c22124OooO0o0OooO0oo.f66575OooO00o != this.f66529OooOoo0) {
                for (int i24 = 0; i24 < getChildCount(); i24++) {
                    View childAt2 = getChildAt(i24);
                    C22124OooO0o0 c22124OooO0o0OooO0oo3 = OooO0oo(childAt2);
                    if (c22124OooO0o0OooO0oo3 != null && c22124OooO0o0OooO0oo3.f66575OooO00o == this.f66529OooOoo0 && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean OooOOoo() {
        this.f66553Ooooo00 = -1;
        this.f66546OoooO0O = false;
        this.f66543OoooO = false;
        VelocityTracker velocityTracker = this.f66554Ooooo0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f66554Ooooo0o = null;
        }
        this.f66558Oooooo.onRelease();
        this.f66560OoooooO.onRelease();
        return this.f66558Oooooo.isFinished() || this.f66560OoooooO.isFinished();
    }

    public final void OooOo0(int i, int i2, boolean z, boolean z2) throws Throwable {
        o00O00O.OooO00o oooO00o = this.f66527OooOoOO;
        if (oooO00o == null || oooO00o.OooO00o() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
        if (!z2 && this.f66529OooOoo0 == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f66527OooOoOO.OooO00o()) {
            i = this.f66527OooOoOO.OooO00o() - 1;
        }
        int i3 = this.f66544OoooO0;
        int i4 = this.f66529OooOoo0;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                arrayList.get(i5).f66576OooO0O0 = true;
            }
        }
        boolean z3 = this.f66529OooOoo0 != i;
        if (!this.f66561Ooooooo) {
            OooOOo0(i);
            OooOo00(i, i2, z, z3);
        } else {
            this.f66529OooOoo0 = i;
            if (z3) {
                OooO0o(i);
            }
            requestLayout();
        }
    }

    public final void OooOo00(int i, int i2, boolean z, boolean z2) throws Throwable {
        int scrollX;
        int iAbs;
        C22124OooO0o0 c22124OooO0o0OooOO0 = OooOO0(i);
        int iMax = c22124OooO0o0OooOO0 != null ? (int) (Math.max(this.f66540Oooo0o0, Math.min(c22124OooO0o0OooOO0.f66578OooO0Oo, this.f66539Oooo0o)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                OooO0o(i);
            }
            OooO0Oo(false);
            scrollTo(iMax, 0);
            OooOOO(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f66531OooOooo;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f66534Oooo000 ? this.f66531OooOooo.getCurrX() : this.f66531OooOooo.getStartX();
                this.f66531OooOooo.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                OooO0Oo(false);
                OooOOOo();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f66527OooOoOO.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.f66536Oooo00o)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f66534Oooo000 = false;
                this.f66531OooOooo.startScroll(i3, scrollY, i4, i5, iMin);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
        if (z2) {
            OooO0o(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C22124OooO0o0 c22124OooO0o0OooO0oo;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c22124OooO0o0OooO0oo = OooO0oo(childAt)) != null && c22124OooO0o0OooO0oo.f66575OooO00o == this.f66529OooOoo0) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C22124OooO0o0 c22124OooO0o0OooO0oo;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c22124OooO0o0OooO0oo = OooO0oo(childAt)) != null && c22124OooO0o0OooO0oo.f66575OooO00o == this.f66529OooOoo0) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new OooO0o();
        }
        OooO0o oooO0o = (OooO0o) layoutParams;
        boolean z = oooO0o.f66571OooO00o | (view.getClass().getAnnotation(InterfaceC22123OooO0Oo.class) != null);
        oooO0o.f66571OooO00o = z;
        if (!this.f66542Oooo0oo) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            oooO0o.f66574OooO0Oo = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f66527OooOoOO == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f66540Oooo0o0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f66539Oooo0o));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OooO0o) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() throws Throwable {
        this.f66534Oooo000 = true;
        if (this.f66531OooOooo.isFinished() || !this.f66531OooOooo.computeScrollOffset()) {
            OooO0Oo(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f66531OooOooo.getCurrX();
        int currY = this.f66531OooOooo.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!OooOOO(currX)) {
                this.f66531OooOooo.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws Throwable {
        boolean zOooO0O0;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zOooO0O0 = false;
                if (!zOooO0O0) {
                    return false;
                }
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zOooO0O0 = keyEvent.hasModifiers(2) ? OooOOO0() : OooO0O0(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            zOooO0O0 = OooO0O0(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zOooO0O0 = OooO0O0(1);
                        }
                    }
                    if (!zOooO0O0) {
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.f66529OooOoo0;
                        if (i > 0) {
                            this.f66545OoooO00 = false;
                            OooOo0(i - 1, 0, true, false);
                            zOooO0O0 = true;
                        }
                    } else {
                        zOooO0O0 = OooO0O0(17);
                    }
                    if (!zOooO0O0) {
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C22124OooO0o0 c22124OooO0o0OooO0oo;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c22124OooO0o0OooO0oo = OooO0oo(childAt)) != null && c22124OooO0o0OooO0oo.f66575OooO00o == this.f66529OooOoo0 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o00O00O.OooO00o oooO00o;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (oooO00o = this.f66527OooOoOO) != null && oooO00o.OooO00o() > 1)) {
            if (!this.f66558Oooooo.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f66540Oooo0o0 * width);
                this.f66558Oooooo.setSize(height, width);
                zDraw = this.f66558Oooooo.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f66560OoooooO.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f66539Oooo0o + 1.0f)) * width2);
                this.f66560OoooooO.setSize(height2, width2);
                zDraw |= this.f66560OoooooO.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f66558Oooooo.finish();
            this.f66560OoooooO.finish();
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f66533Oooo0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooO0o();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooO0o();
    }

    public o00O00O.OooO00o getAdapter() {
        return this.f66527OooOoOO;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f66529OooOoo0;
    }

    public int getOffscreenPageLimit() {
        return this.f66544OoooO0;
    }

    public int getPageMargin() {
        return this.f66536Oooo00o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f66561Ooooooo = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f66566o00o0O);
        Scroller scroller = this.f66531OooOooo;
        if (scroller != null && !scroller.isFinished()) {
            this.f66531OooOooo.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ArrayList<C22124OooO0o0> arrayList;
        int i2;
        super.onDraw(canvas);
        if (this.f66536Oooo00o <= 0 || this.f66533Oooo0 == null) {
            return;
        }
        ArrayList<C22124OooO0o0> arrayList2 = this.f66523OooOo;
        if (arrayList2.size() <= 0 || this.f66527OooOoOO == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.f66536Oooo00o / width;
        int i3 = 0;
        C22124OooO0o0 c22124OooO0o0 = arrayList2.get(0);
        float f3 = c22124OooO0o0.f66578OooO0Oo;
        int size = arrayList2.size();
        int i4 = c22124OooO0o0.f66575OooO00o;
        int i5 = arrayList2.get(size - 1).f66575OooO00o;
        while (i4 < i5) {
            while (true) {
                i = c22124OooO0o0.f66575OooO00o;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                c22124OooO0o0 = arrayList2.get(i3);
            }
            if (i4 == i) {
                float f4 = c22124OooO0o0.f66578OooO0Oo;
                float f5 = c22124OooO0o0.f66577OooO0OO;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                this.f66527OooOoOO.getClass();
                f = (f3 + 1.0f) * width;
                f3 = 1.0f + f2 + f3;
            }
            if (this.f66536Oooo00o + f > scrollX) {
                arrayList = arrayList2;
                i2 = scrollX;
                this.f66533Oooo0.setBounds(Math.round(f), this.f66537Oooo0O0, Math.round(this.f66536Oooo00o + f), this.f66538Oooo0OO);
                this.f66533Oooo0.draw(canvas);
            } else {
                arrayList = arrayList2;
                i2 = scrollX;
            }
            if (f > i2 + r3) {
                return;
            }
            i4++;
            arrayList2 = arrayList;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Throwable {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            OooOOoo();
            return false;
        }
        if (action != 0) {
            if (this.f66546OoooO0O) {
                return true;
            }
            if (this.f66543OoooO) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f66551OoooOoO = x;
            this.f66549OoooOOo = x;
            float y = motionEvent.getY();
            this.f66552OoooOoo = y;
            this.f66550OoooOo0 = y;
            this.f66553Ooooo00 = motionEvent.getPointerId(0);
            this.f66543OoooO = false;
            this.f66534Oooo000 = true;
            this.f66531OooOooo.computeScrollOffset();
            if (this.f66567o00ooo != 2 || Math.abs(this.f66531OooOooo.getFinalX() - this.f66531OooOooo.getCurrX()) <= this.f66559Oooooo0) {
                OooO0Oo(false);
                this.f66546OoooO0O = false;
            } else {
                this.f66531OooOooo.abortAnimation();
                this.f66545OoooO00 = false;
                OooOOOo();
                this.f66546OoooO0O = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f66553Ooooo00;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f66549OoooOOo;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f66552OoooOoo);
                if (f != 0.0f) {
                    float f2 = this.f66549OoooOOo;
                    if ((f2 >= this.f66562o000oOoO || f <= 0.0f) && ((f2 <= getWidth() - this.f66562o000oOoO || f >= 0.0f) && OooO0OO((int) f, (int) x2, (int) y2, this, false))) {
                        this.f66549OoooOOo = x2;
                        this.f66550OoooOo0 = y2;
                        this.f66543OoooO = true;
                        return false;
                    }
                }
                float f3 = this.f66548OoooOOO;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f66546OoooO0O = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.f66551OoooOoO;
                    float f5 = this.f66548OoooOOO;
                    this.f66549OoooOOo = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f66550OoooOo0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.f66543OoooO = true;
                }
                if (this.f66546OoooO0O && OooOOOO(x2)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            OooOO0o(motionEvent);
        }
        if (this.f66554Ooooo0o == null) {
            this.f66554Ooooo0o = VelocityTracker.obtain();
        }
        this.f66554Ooooo0o.addMovement(motionEvent);
        return this.f66546OoooO0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        boolean z2;
        C22124OooO0o0 c22124OooO0o0OooO0oo;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.f66571OooO00o) {
                    int i9 = oooO0o.f66572OooO0O0;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 == 16) {
                            if (i11 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i122 = paddingLeft + scrollX;
                        childAt.layout(i122, paddingTop, childAt.getMeasuredWidth() + i122, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i14;
                    if (i11 == 16) {
                    }
                    int i132 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i132;
                    int i1222 = paddingLeft + scrollX;
                    childAt.layout(i1222, paddingTop, childAt.getMeasuredWidth() + i1222, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i15 = (i5 - paddingLeft) - paddingRight;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                OooO0o oooO0o2 = (OooO0o) childAt2.getLayoutParams();
                if (!oooO0o2.f66571OooO00o && (c22124OooO0o0OooO0oo = OooO0oo(childAt2)) != null) {
                    float f = i15;
                    int i17 = ((int) (c22124OooO0o0OooO0oo.f66578OooO0Oo * f)) + paddingLeft;
                    if (oooO0o2.f66574OooO0Oo) {
                        oooO0o2.f66574OooO0Oo = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * oooO0o2.f66573OooO0OO), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i17, paddingTop, childAt2.getMeasuredWidth() + i17, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f66537Oooo0O0 = paddingTop;
        this.f66538Oooo0OO = i6 - paddingBottom;
        this.f66569ooOO = i7;
        if (this.f66561Ooooooo) {
            z2 = false;
            OooOo00(this.f66529OooOoo0, 0, false, false);
        } else {
            z2 = false;
        }
        this.f66561Ooooooo = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) throws Throwable {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f66562o000oOoO = Math.min(measuredWidth / 10, this.f66547OoooOO0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (oooO0o2 = (OooO0o) childAt.getLayoutParams()) != null && oooO0o2.f66571OooO00o) {
                int i6 = oooO0o2.f66572OooO0O0;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) oooO0o2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) oooO0o2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f66541Oooo0oO = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f66542Oooo0oo = true;
        OooOOOo();
        this.f66542Oooo0oo = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((oooO0o = (OooO0o) childAt2.getLayoutParams()) == null || !oooO0o.f66571OooO00o)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * oooO0o.f66573OooO0OO), 1073741824), this.f66541Oooo0oO);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C22124OooO0o0 c22124OooO0o0OooO0oo;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c22124OooO0o0OooO0oo = OooO0oo(childAt)) != null && c22124OooO0o0OooO0oo.f66575OooO00o == this.f66529OooOoo0 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Throwable {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f66527OooOoOO != null) {
            OooOo0(savedState.f66582OooOo0o, 0, false, true);
        } else {
            this.f66528OooOoo = savedState.f66582OooOo0o;
            this.f66530OooOooO = savedState.f66581OooOo;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f66582OooOo0o = this.f66529OooOoo0;
        o00O00O.OooO00o oooO00o = this.f66527OooOoOO;
        if (oooO00o != null) {
            oooO00o.getClass();
            savedState.f66581OooOo = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) throws Throwable {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f66536Oooo00o;
            OooOOo(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Throwable {
        o00O00O.OooO00o oooO00o;
        boolean zOooOOoo = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (oooO00o = this.f66527OooOoOO) == null || oooO00o.OooO00o() == 0) {
            return false;
        }
        if (this.f66554Ooooo0o == null) {
            this.f66554Ooooo0o = VelocityTracker.obtain();
        }
        this.f66554Ooooo0o.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f66531OooOooo.abortAnimation();
            this.f66545OoooO00 = false;
            OooOOOo();
            float x = motionEvent.getX();
            this.f66551OoooOoO = x;
            this.f66549OoooOOo = x;
            float y = motionEvent.getY();
            this.f66552OoooOoo = y;
            this.f66550OoooOo0 = y;
            this.f66553Ooooo00 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f66549OoooOOo = motionEvent.getX(actionIndex);
                        this.f66553Ooooo00 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        OooOO0o(motionEvent);
                        this.f66549OoooOOo = motionEvent.getX(motionEvent.findPointerIndex(this.f66553Ooooo00));
                    }
                } else if (this.f66546OoooO0O) {
                    OooOo00(this.f66529OooOoo0, 0, true, false);
                    zOooOOoo = OooOOoo();
                }
            } else if (!this.f66546OoooO0O) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f66553Ooooo00);
                if (iFindPointerIndex == -1) {
                    zOooOOoo = OooOOoo();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f66549OoooOOo);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f66550OoooOo0);
                    if (fAbs > this.f66548OoooOOO && fAbs > fAbs2) {
                        this.f66546OoooO0O = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.f66551OoooOoO;
                        this.f66549OoooOOo = x2 - f > 0.0f ? f + this.f66548OoooOOO : f - this.f66548OoooOOO;
                        this.f66550OoooOo0 = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f66546OoooO0O) {
                    }
                }
            } else if (this.f66546OoooO0O) {
                zOooOOoo = OooOOOO(motionEvent.getX(motionEvent.findPointerIndex(this.f66553Ooooo00)));
            }
        } else if (this.f66546OoooO0O) {
            VelocityTracker velocityTracker = this.f66554Ooooo0o;
            velocityTracker.computeCurrentVelocity(1000, this.f66556OooooOO);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f66553Ooooo00);
            this.f66545OoooO00 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C22124OooO0o0 c22124OooO0o0OooO = OooO();
            float f2 = clientWidth;
            int iMax = c22124OooO0o0OooO.f66575OooO00o;
            float f3 = ((scrollX / f2) - c22124OooO0o0OooO.f66578OooO0Oo) / (c22124OooO0o0OooO.f66577OooO0OO + (this.f66536Oooo00o / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f66553Ooooo00)) - this.f66551OoooOoO)) <= this.f66557OooooOo || Math.abs(xVelocity) <= this.f66555OooooO0) {
                iMax += (int) (f3 + (iMax >= this.f66529OooOoo0 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
            if (arrayList.size() > 0) {
                iMax = Math.max(arrayList.get(0).f66575OooO00o, Math.min(iMax, ((C22124OooO0o0) C21505OooO0Oo.OooO00o(1, arrayList)).f66575OooO00o));
            }
            OooOo0(iMax, xVelocity, true, true);
            zOooOOoo = OooOOoo();
        }
        if (zOooOOoo) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f66542Oooo0oo) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(o00O00O.OooO00o oooO00o) throws Throwable {
        o00O00O.OooO00o oooO00o2 = this.f66527OooOoOO;
        if (oooO00o2 != null) {
            synchronized (oooO00o2) {
            }
            this.f66527OooOoOO.getClass();
            ArrayList<C22124OooO0o0> arrayList = this.f66523OooOo;
            if (arrayList.size() > 0) {
                C22124OooO0o0 c22124OooO0o0 = arrayList.get(0);
                o00O00O.OooO00o oooO00o3 = this.f66527OooOoOO;
                int i = c22124OooO0o0.f66575OooO00o;
                oooO00o3.getClass();
                throw new UnsupportedOperationException("Required method destroyItem was not overridden");
            }
            this.f66527OooOoOO.getClass();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((OooO0o) getChildAt(i2).getLayoutParams()).f66571OooO00o) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f66529OooOoo0 = 0;
            scrollTo(0, 0);
        }
        o00O00O.OooO00o oooO00o4 = this.f66527OooOoOO;
        this.f66527OooOoOO = oooO00o;
        this.f66524OooOo0o = 0;
        if (oooO00o != null) {
            if (this.f66535Oooo00O == null) {
                this.f66535Oooo00O = new OooOO0();
            }
            synchronized (this.f66527OooOoOO) {
            }
            this.f66545OoooO00 = false;
            boolean z = this.f66561Ooooooo;
            this.f66561Ooooooo = true;
            this.f66524OooOo0o = this.f66527OooOoOO.OooO00o();
            if (this.f66528OooOoo >= 0) {
                this.f66527OooOoOO.getClass();
                OooOo0(this.f66528OooOoo, 0, false, true);
                this.f66528OooOoo = -1;
                this.f66530OooOooO = null;
            } else if (z) {
                requestLayout();
            } else {
                OooOOOo();
            }
        }
        ArrayList arrayList2 = this.f66565o00Ooo;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f66565o00Ooo.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC22126OooO0oo) this.f66565o00Ooo.get(i3)).onAdapterChanged(this, oooO00o4, oooO00o);
        }
    }

    public void setCurrentItem(int i) throws Throwable {
        this.f66545OoooO00 = false;
        OooOo0(i, 0, !this.f66561Ooooooo, false);
    }

    public void setOffscreenPageLimit(int i) throws Throwable {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f66544OoooO0) {
            this.f66544OoooO0 = i;
            OooOOOo();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OooO oooO) {
        this.f66564o00Oo0 = oooO;
    }

    public void setPageMargin(int i) throws Throwable {
        int i2 = this.f66536Oooo00o;
        this.f66536Oooo00o = i;
        int width = getWidth();
        OooOOo(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f66533Oooo0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f66567o00ooo == i) {
            return;
        }
        this.f66567o00ooo = i;
        OooO oooO = this.f66564o00Oo0;
        if (oooO != null) {
            oooO.onPageScrollStateChanged(i);
        }
        ArrayList arrayList = this.f66563o00O0O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO oooO2 = (OooO) this.f66563o00O0O.get(i2);
                if (oooO2 != null) {
                    oooO2.onPageScrollStateChanged(i);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f66533Oooo0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        OooO0o oooO0o = new OooO0o(context, attributeSet);
        oooO0o.f66573OooO0OO = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66522oo000o);
        oooO0o.f66572OooO0O0 = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return oooO0o;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }
}
