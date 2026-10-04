package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.C22054OooOoo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Rect f66604OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Rect f66605OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f66606OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final androidx.viewpager2.widget.OooO0OO f66607OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f66608OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22131OooO0Oo f66609OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o f66610OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f66611OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Parcelable f66612OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0o f66613Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final androidx.viewpager2.widget.OooO0OO f66614Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public RecyclerView f66615Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22134OooO0oo f66616Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final androidx.viewpager2.widget.OooO0o f66617Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C22127OooO0Oo f66618Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C22128OooO0o0 f66619Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f66620Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public RecyclerView.AbstractC22064OooOO0o f66621Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f66622Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f66623Oooo0oo;

    public class OooO extends RecyclerView {
        public OooO(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f66613Oooo.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f66606OooOoO);
            accessibilityEvent.setToIndex(viewPager2.f66606OooOoO);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f66622Oooo0oO && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f66622Oooo0oO && super.onTouchEvent(motionEvent);
        }
    }

    public class OooO00o extends OooO0OO {
        public OooO00o() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OooO0OO, androidx.recyclerview.widget.RecyclerView.OooO
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f66608OooOoOO = true;
            viewPager2.f66617Oooo00o.f66598OooOO0o = true;
        }
    }

    public abstract class OooO0O0 {
    }

    public static abstract class OooO0OO extends RecyclerView.OooO {
        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$OooO0Oo, reason: case insensitive filesystem */
    public class C22131OooO0Oo extends LinearLayoutManager {
        public C22131OooO0Oo(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.C22075OooOoOO c22075OooOoOO, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(c22075OooOoOO, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(c22071OooOo0O, c22075OooOoOO, accessibilityNodeInfoCompat);
            ViewPager2.this.f66613Oooo.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
        public final boolean performAccessibilityAction(RecyclerView.C22071OooOo0O c22071OooOo0O, RecyclerView.C22075OooOoOO c22075OooOoOO, int i, Bundle bundle) {
            ViewPager2.this.f66613Oooo.getClass();
            return super.performAccessibilityAction(c22071OooOo0O, c22075OooOoOO, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOOO
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    public class OooO0o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f66627OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0 f66628OooO0O0 = new OooO0O0();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooOO0O f66629OooO0OO;

        public class OooO00o implements AccessibilityViewCommand {
            public OooO00o() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f66622Oooo0oO) {
                    viewPager2.OooO0Oo(currentItem, true);
                }
                return true;
            }
        }

        public class OooO0O0 implements AccessibilityViewCommand {
            public OooO0O0() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f66622Oooo0oO) {
                    viewPager2.OooO0Oo(currentItem, true);
                }
                return true;
            }
        }

        public OooO0o() {
        }

        public final void OooO00o() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageLeft);
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageRight);
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageUp);
            ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageDown);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f66622Oooo0oO) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            OooO0O0 oooO0O0 = this.f66628OooO0O0;
            OooO00o oooO00o = this.f66627OooO00o;
            if (orientation != 0) {
                if (viewPager2.f66606OooOoO < itemCount - 1) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, null), null, oooO00o);
                }
                if (viewPager2.f66606OooOoO > 0) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, null), null, oooO0O0);
                    return;
                }
                return;
            }
            boolean z = viewPager2.f66609OooOoo.getLayoutDirection() == 1;
            int i2 = z ? 16908360 : 16908361;
            if (z) {
                i = 16908361;
            }
            if (viewPager2.f66606OooOoO < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, null), null, oooO00o);
            }
            if (viewPager2.f66606OooOoO > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, null), null, oooO0O0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC22132OooO0o0 {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC22133OooO0oO {
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$OooO0oo, reason: case insensitive filesystem */
    public class C22134OooO0oo extends C22054OooOoo {
        public C22134OooO0oo() {
        }

        @Override // androidx.recyclerview.widget.C22054OooOoo, androidx.recyclerview.widget.AbstractC22058Oooo00O
        public final View findSnapView(RecyclerView.OooOOOO oooOOOO) {
            androidx.viewpager2.widget.OooO0o oooO0o = ViewPager2.this.f66618Oooo0O0.f66586OooO00o;
            return super.findSnapView(oooOOOO);
        }
    }

    public static class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final RecyclerView f66634OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f66635OooOo0o;

        public OooOO0(RecyclerView recyclerView, int i) {
            this.f66635OooOo0o = i;
            this.f66634OooOo = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f66634OooOo.smoothScrollToPosition(this.f66635OooOo0o);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66605OooOo0o = new Rect();
        this.f66604OooOo = new Rect();
        androidx.viewpager2.widget.OooO0OO oooO0OO = new androidx.viewpager2.widget.OooO0OO();
        this.f66607OooOoO0 = oooO0OO;
        this.f66608OooOoOO = false;
        this.f66610OooOoo0 = new OooO00o();
        this.f66611OooOooO = -1;
        this.f66621Oooo0o0 = null;
        this.f66620Oooo0o = false;
        this.f66622Oooo0oO = true;
        this.f66623Oooo0oo = -1;
        this.f66613Oooo = new OooO0o();
        OooO oooO = new OooO(context);
        this.f66615Oooo000 = oooO;
        oooO.setId(ViewCompat.generateViewId());
        this.f66615Oooo000.setDescendantFocusability(131072);
        C22131OooO0Oo c22131OooO0Oo = new C22131OooO0Oo(context);
        this.f66609OooOoo = c22131OooO0Oo;
        this.f66615Oooo000.setLayoutManager(c22131OooO0Oo);
        this.f66615Oooo000.setScrollingTouchSlop(1);
        int[] iArr = oOO00O.OooO00o.f123277OooO00o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f66615Oooo000.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f66615Oooo000.addOnChildAttachStateChangeListener(new androidx.viewpager2.widget.OooOO0());
            androidx.viewpager2.widget.OooO0o oooO0o = new androidx.viewpager2.widget.OooO0o(this);
            this.f66617Oooo00o = oooO0o;
            this.f66618Oooo0O0 = new C22127OooO0Oo(oooO0o);
            C22134OooO0oo c22134OooO0oo = new C22134OooO0oo();
            this.f66616Oooo00O = c22134OooO0oo;
            c22134OooO0oo.attachToRecyclerView(this.f66615Oooo000);
            this.f66615Oooo000.addOnScrollListener(this.f66617Oooo00o);
            androidx.viewpager2.widget.OooO0OO oooO0OO2 = new androidx.viewpager2.widget.OooO0OO();
            this.f66614Oooo0 = oooO0OO2;
            this.f66617Oooo00o.f66588OooO00o = oooO0OO2;
            C22130OooO0oo c22130OooO0oo = new C22130OooO0oo(this);
            androidx.viewpager2.widget.OooO oooO2 = new androidx.viewpager2.widget.OooO(this);
            this.f66614Oooo0.f66585OooO00o.add(c22130OooO0oo);
            this.f66614Oooo0.f66585OooO00o.add(oooO2);
            OooO0o oooO0o2 = this.f66613Oooo;
            RecyclerView recyclerView = this.f66615Oooo000;
            oooO0o2.getClass();
            ViewCompat.setImportantForAccessibility(recyclerView, 2);
            oooO0o2.f66629OooO0OO = new OooOO0O(oooO0o2);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (ViewCompat.getImportantForAccessibility(viewPager2) == 0) {
                ViewCompat.setImportantForAccessibility(viewPager2, 1);
            }
            this.f66614Oooo0.f66585OooO00o.add(oooO0OO);
            C22128OooO0o0 c22128OooO0o0 = new C22128OooO0o0();
            this.f66619Oooo0OO = c22128OooO0o0;
            this.f66614Oooo0.f66585OooO00o.add(c22128OooO0o0);
            RecyclerView recyclerView2 = this.f66615Oooo000;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void OooO00o(AbstractC22132OooO0o0 abstractC22132OooO0o0) {
        this.f66607OooOoO0.f66585OooO00o.add(abstractC22132OooO0o0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0() {
        RecyclerView.AbstractC22062OooO0oO adapter;
        if (this.f66611OooOooO == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f66612OooOooo;
        if (parcelable != null) {
            if (adapter instanceof o00O00OO.OooOO0) {
                ((o00O00OO.OooOO0) adapter).OooO0O0(parcelable);
            }
            this.f66612OooOooo = null;
        }
        int iMax = Math.max(0, Math.min(this.f66611OooOooO, adapter.getItemCount() - 1));
        this.f66606OooOoO = iMax;
        this.f66611OooOooO = -1;
        this.f66615Oooo000.scrollToPosition(iMax);
        this.f66613Oooo.OooO00o();
    }

    public final void OooO0OO(int i, boolean z) {
        androidx.viewpager2.widget.OooO0o oooO0o = this.f66618Oooo0O0.f66586OooO00o;
        OooO0Oo(i, z);
    }

    public final void OooO0Oo(int i, boolean z) {
        androidx.viewpager2.widget.OooO0OO oooO0OO;
        RecyclerView.AbstractC22062OooO0oO adapter = getAdapter();
        if (adapter == null) {
            if (this.f66611OooOooO != -1) {
                this.f66611OooOooO = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i2 = this.f66606OooOoO;
        if (iMin == i2 && this.f66617Oooo00o.f66592OooO0o == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.f66606OooOoO = iMin;
        this.f66613Oooo.OooO00o();
        androidx.viewpager2.widget.OooO0o oooO0o = this.f66617Oooo00o;
        if (oooO0o.f66592OooO0o != 0) {
            oooO0o.OooO0OO();
            OooO0o.OooO00o oooO00o = oooO0o.f66594OooO0oO;
            d = ((double) oooO00o.f66599OooO00o) + ((double) oooO00o.f66600OooO0O0);
        }
        androidx.viewpager2.widget.OooO0o oooO0o2 = this.f66617Oooo00o;
        oooO0o2.getClass();
        oooO0o2.f66593OooO0o0 = z ? 2 : 3;
        boolean z2 = oooO0o2.f66587OooO != iMin;
        oooO0o2.f66587OooO = iMin;
        oooO0o2.OooO00o(2);
        if (z2 && (oooO0OO = oooO0o2.f66588OooO00o) != null) {
            oooO0OO.onPageSelected(iMin);
        }
        if (!z) {
            this.f66615Oooo000.scrollToPosition(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.f66615Oooo000.smoothScrollToPosition(iMin);
            return;
        }
        this.f66615Oooo000.scrollToPosition(d2 > d ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f66615Oooo000;
        recyclerView.post(new OooOO0(recyclerView, iMin));
    }

    public final void OooO0o0() {
        C22134OooO0oo c22134OooO0oo = this.f66616Oooo00O;
        if (c22134OooO0oo == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = c22134OooO0oo.findSnapView(this.f66609OooOoo);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f66609OooOoo.getPosition(viewFindSnapView);
        if (position != this.f66606OooOoO && getScrollState() == 0) {
            this.f66614Oooo0.onPageSelected(position);
        }
        this.f66608OooOoOO = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f66615Oooo000.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f66615Oooo000.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f66637OooOo0o;
            sparseArray.put(this.f66615Oooo000.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        OooO0O0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f66613Oooo.getClass();
        this.f66613Oooo.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.AbstractC22062OooO0oO getAdapter() {
        return this.f66615Oooo000.getAdapter();
    }

    public int getCurrentItem() {
        return this.f66606OooOoO;
    }

    public int getItemDecorationCount() {
        return this.f66615Oooo000.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f66623Oooo0oo;
    }

    public int getOrientation() {
        return this.f66609OooOoo.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f66615Oooo000;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f66617Oooo00o.f66592OooO0o;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 0;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 0;
        }
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(itemCount, itemCount2, false, 0));
        RecyclerView.AbstractC22062OooO0oO adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.f66622Oooo0oO) {
            return;
        }
        if (viewPager2.f66606OooOoO > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f66606OooOoO < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f66615Oooo000.getMeasuredWidth();
        int measuredHeight = this.f66615Oooo000.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f66605OooOo0o;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f66604OooOo;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f66615Oooo000.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f66608OooOoOO) {
            OooO0o0();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f66615Oooo000, i, i2);
        int measuredWidth = this.f66615Oooo000.getMeasuredWidth();
        int measuredHeight = this.f66615Oooo000.getMeasuredHeight();
        int measuredState = this.f66615Oooo000.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f66611OooOooO = savedState.f66636OooOo;
        this.f66612OooOooo = savedState.f66638OooOoO0;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f66637OooOo0o = this.f66615Oooo000.getId();
        int i = this.f66611OooOooO;
        if (i == -1) {
            i = this.f66606OooOoO;
        }
        savedState.f66636OooOo = i;
        Parcelable parcelable = this.f66612OooOooo;
        if (parcelable != null) {
            savedState.f66638OooOoO0 = parcelable;
            return savedState;
        }
        Object adapter = this.f66615Oooo000.getAdapter();
        if (adapter instanceof o00O00OO.OooOO0) {
            savedState.f66638OooOoO0 = ((o00O00OO.OooOO0) adapter).OooO00o();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f66613Oooo.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        OooO0o oooO0o = this.f66613Oooo;
        oooO0o.getClass();
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f66622Oooo0oO) {
            viewPager2.OooO0Oo(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.AbstractC22062OooO0oO abstractC22062OooO0oO) {
        RecyclerView.AbstractC22062OooO0oO adapter = this.f66615Oooo000.getAdapter();
        OooO0o oooO0o = this.f66613Oooo;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(oooO0o.f66629OooO0OO);
        } else {
            oooO0o.getClass();
        }
        OooO00o oooO00o = this.f66610OooOoo0;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(oooO00o);
        }
        this.f66615Oooo000.setAdapter(abstractC22062OooO0oO);
        this.f66606OooOoO = 0;
        OooO0O0();
        OooO0o oooO0o2 = this.f66613Oooo;
        oooO0o2.OooO00o();
        if (abstractC22062OooO0oO != null) {
            abstractC22062OooO0oO.registerAdapterDataObserver(oooO0o2.f66629OooO0OO);
        }
        if (abstractC22062OooO0oO != null) {
            abstractC22062OooO0oO.registerAdapterDataObserver(oooO00o);
        }
    }

    public void setCurrentItem(int i) {
        OooO0OO(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f66613Oooo.OooO00o();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f66623Oooo0oo = i;
        this.f66615Oooo000.requestLayout();
    }

    public void setOrientation(int i) {
        this.f66609OooOoo.setOrientation(i);
        this.f66613Oooo.OooO00o();
    }

    public void setPageTransformer(InterfaceC22133OooO0oO interfaceC22133OooO0oO) {
        if (interfaceC22133OooO0oO != null) {
            if (!this.f66620Oooo0o) {
                this.f66621Oooo0o0 = this.f66615Oooo000.getItemAnimator();
                this.f66620Oooo0o = true;
            }
            this.f66615Oooo000.setItemAnimator(null);
        } else if (this.f66620Oooo0o) {
            this.f66615Oooo000.setItemAnimator(this.f66621Oooo0o0);
            this.f66621Oooo0o0 = null;
            this.f66620Oooo0o = false;
        }
        this.f66619Oooo0OO.getClass();
        if (interfaceC22133OooO0oO == null) {
            return;
        }
        this.f66619Oooo0OO.getClass();
        this.f66619Oooo0OO.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.f66622Oooo0oO = z;
        this.f66613Oooo.OooO00o();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f66636OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f66637OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Parcelable f66638OooOoO0;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f66637OooOo0o);
            parcel.writeInt(this.f66636OooOo);
            parcel.writeParcelable(this.f66638OooOoO0, i);
        }

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.f66637OooOo0o = parcel.readInt();
                savedState.f66636OooOo = parcel.readInt();
                savedState.f66638OooOoO0 = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.f66637OooOo0o = parcel.readInt();
                savedState.f66636OooOo = parcel.readInt();
                savedState.f66638OooOoO0 = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }
}
