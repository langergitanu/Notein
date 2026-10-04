package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.OooO00o;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    private static final String TAG = "Toolbar";
    private OooOOOO.OooO00o mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private C21557Oooo0o mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private OooO0o mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    OooO.OooO00o mMenuBuilderCallback;
    final MenuHostHelper mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.InterfaceC21522OooO0o0 mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    InterfaceC21583OooO0oo mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private C21569OoooOoO mWrapper;

    public class OooO00o implements ActionMenuView.InterfaceC21522OooO0o0 {
        public OooO00o() {
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    public class OooO0OO implements OooO.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.OooO oooO, MenuItem menuItem) {
            OooO.OooO00o oooO00o = Toolbar.this.mMenuBuilderCallback;
            return oooO00o != null && oooO00o.onMenuItemSelected(oooO, menuItem);
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void onMenuModeChange(androidx.appcompat.view.menu.OooO oooO) {
            Toolbar toolbar = Toolbar.this;
            ActionMenuPresenter actionMenuPresenter = toolbar.mMenuView.f62802OooOoOO;
            if (actionMenuPresenter == null || !actionMenuPresenter.OooO0OO()) {
                toolbar.mMenuHostHelper.onPrepareMenu(oooO);
            }
            OooO.OooO00o oooO00o = toolbar.mMenuBuilderCallback;
            if (oooO00o != null) {
                oooO00o.onMenuModeChange(oooO);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$OooO0Oo, reason: case insensitive filesystem */
    public class ViewOnClickListenerC21580OooO0Oo implements View.OnClickListener {
        public ViewOnClickListenerC21580OooO0Oo() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    public class OooO0o implements androidx.appcompat.view.menu.OooOOOO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0O f63194OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO f63195OooOo0o;

        public OooO0o() {
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final boolean collapseItemActionView(androidx.appcompat.view.menu.OooO oooO, androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof OooOO0o.OooO0O0) {
                ((OooOO0o.OooO0O0) callback).OooO00o();
            }
            toolbar.removeView(toolbar.mExpandedActionView);
            toolbar.removeView(toolbar.mCollapseButtonView);
            toolbar.mExpandedActionView = null;
            toolbar.addChildrenForExpandedActionView();
            this.f63194OooOo = null;
            toolbar.requestLayout();
            oooOO0O.f62666OooOoo = false;
            oooOO0O.f62651OooOOO.onItemsChanged(false);
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final boolean expandItemActionView(androidx.appcompat.view.menu.OooO oooO, androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            Toolbar toolbar = Toolbar.this;
            toolbar.ensureCollapseButtonView();
            ViewParent parent = toolbar.mCollapseButtonView.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                toolbar.addView(toolbar.mCollapseButtonView);
            }
            View actionView = oooOO0O.getActionView();
            toolbar.mExpandedActionView = actionView;
            this.f63194OooOo = oooOO0O;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
                }
                C21582OooO0oO c21582OooO0oOGenerateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
                c21582OooO0oOGenerateDefaultLayoutParams.f62424OooO00o = (toolbar.mButtonGravity & 112) | GravityCompat.START;
                c21582OooO0oOGenerateDefaultLayoutParams.f63197OooO0O0 = 2;
                toolbar.mExpandedActionView.setLayoutParams(c21582OooO0oOGenerateDefaultLayoutParams);
                toolbar.addView(toolbar.mExpandedActionView);
            }
            toolbar.removeChildrenForExpandedActionView();
            toolbar.requestLayout();
            oooOO0O.f62666OooOoo = true;
            oooOO0O.f62651OooOOO.onItemsChanged(false);
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof OooOO0o.OooO0O0) {
                ((OooOO0o.OooO0O0) callback).OooO0O0();
            }
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final void initForMenu(Context context, androidx.appcompat.view.menu.OooO oooO) {
            androidx.appcompat.view.menu.OooOO0O oooOO0O;
            androidx.appcompat.view.menu.OooO oooO2 = this.f63195OooOo0o;
            if (oooO2 != null && (oooOO0O = this.f63194OooOo) != null) {
                oooO2.collapseItemActionView(oooOO0O);
            }
            this.f63195OooOo0o = oooO;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final void onCloseMenu(androidx.appcompat.view.menu.OooO oooO, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final boolean onSubMenuSelected(androidx.appcompat.view.menu.OooOo00 oooOo00) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO
        public final void updateMenuView(boolean z) {
            if (this.f63194OooOo != null) {
                androidx.appcompat.view.menu.OooO oooO = this.f63195OooOo0o;
                if (oooO != null) {
                    int size = oooO.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f63195OooOo0o.getItem(i) == this.f63194OooOo) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.f63195OooOo0o, this.f63194OooOo);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$OooO0o0, reason: case insensitive filesystem */
    public static class C21581OooO0o0 {
        public static OnBackInvokedDispatcher OooO00o(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback OooO0O0(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.OoooOOo
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void OooO0OO(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void OooO0Oo(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$OooO0oO, reason: case insensitive filesystem */
    public static class C21582OooO0oO extends OooO00o.C18993OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f63197OooO0O0;
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$OooO0oo, reason: case insensitive filesystem */
    public interface InterfaceC21583OooO0oo {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f63198OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f63199OooOo0o;

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
            this.f63199OooOo0o = parcel.readInt();
            this.f63198OooOo = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f63199OooOo0o);
            parcel.writeInt(this.f63198OooOo ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C21582OooO0oO c21582OooO0oO = (C21582OooO0oO) childAt.getLayoutParams();
                if (c21582OooO0oO.f63197OooO0O0 == 0 && shouldLayout(childAt) && getChildHorizontalGravity(c21582OooO0oO.f62424OooO00o) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C21582OooO0oO c21582OooO0oO2 = (C21582OooO0oO) childAt2.getLayoutParams();
            if (c21582OooO0oO2.f63197OooO0O0 == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(c21582OooO0oO2.f62424OooO00o) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C21582OooO0oO c21582OooO0oOGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C21582OooO0oO) layoutParams;
        c21582OooO0oOGenerateDefaultLayoutParams.f63197OooO0O0 = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, c21582OooO0oOGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(c21582OooO0oOGenerateDefaultLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            C21557Oooo0o c21557Oooo0o = new C21557Oooo0o();
            c21557Oooo0o.f63060OooO00o = 0;
            c21557Oooo0o.f63061OooO0O0 = 0;
            c21557Oooo0o.f63062OooO0OO = Integer.MIN_VALUE;
            c21557Oooo0o.f63063OooO0Oo = Integer.MIN_VALUE;
            c21557Oooo0o.f63065OooO0o0 = 0;
            c21557Oooo0o.f63064OooO0o = 0;
            c21557Oooo0o.f63066OooO0oO = false;
            c21557Oooo0o.f63067OooO0oo = false;
            this.mContentInsets = c21557Oooo0o;
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.f62799OooOo0o == null) {
            androidx.appcompat.view.menu.OooO oooO = (androidx.appcompat.view.menu.OooO) actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new OooO0o();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            oooO.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            ActionMenuView actionMenuView2 = this.mMenuView;
            OooOOOO.OooO00o oooO00o = this.mActionMenuPresenterCallback;
            OooO0OO oooO0OO = new OooO0OO();
            actionMenuView2.f62804OooOoo0 = oooO00o;
            actionMenuView2.f62803OooOoo = oooO0OO;
            C21582OooO0oO c21582OooO0oOGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c21582OooO0oOGenerateDefaultLayoutParams.f62424OooO00o = (this.mButtonGravity & 112) | GravityCompat.END;
            this.mMenuView.setLayoutParams(c21582OooO0oOGenerateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C21582OooO0oO c21582OooO0oOGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c21582OooO0oOGenerateDefaultLayoutParams.f62424OooO00o = (this.mButtonGravity & 112) | GravityCompat.START;
            this.mNavButtonView.setLayoutParams(c21582OooO0oOGenerateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        C21582OooO0oO c21582OooO0oO = (C21582OooO0oO) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(c21582OooO0oO.f62424OooO00o);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c21582OooO0oO).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    private MenuInflater getMenuInflater() {
        return new OooOO0o.OooO0o(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C21582OooO0oO c21582OooO0oO = (C21582OooO0oO) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += view.getMeasuredWidth() + iMax + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        C21582OooO0oO c21582OooO0oO = (C21582OooO0oO) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, childTop, iMax + measuredWidth, view.getMeasuredHeight() + childTop);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c21582OooO0oO).rightMargin + iMax;
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        C21582OooO0oO c21582OooO0oO = (C21582OooO0oO) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, childTop, iMax, view.getMeasuredHeight() + childTop);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c21582OooO0oO).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.f62800OooOoO;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C21582OooO0oO);
    }

    public void collapseActionView() {
        OooO0o oooO0o = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.OooOO0O oooOO0O = oooO0o == null ? null : oooO0o.f63194OooOo;
        if (oooOO0O != null) {
            oooOO0O.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f62802OooOoOO) == null) {
            return;
        }
        actionMenuPresenter.OooO0O0();
        ActionMenuPresenter.OooO00o oooO00o = actionMenuPresenter.f62786OoooO00;
        if (oooO00o == null || !oooO00o.OooO0O0()) {
            return;
        }
        oooO00o.f62680OooO.dismiss();
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C21582OooO0oO c21582OooO0oOGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c21582OooO0oOGenerateDefaultLayoutParams.f62424OooO00o = (this.mButtonGravity & 112) | GravityCompat.START;
            c21582OooO0oOGenerateDefaultLayoutParams.f63197OooO0O0 = 2;
            this.mCollapseButtonView.setLayoutParams(c21582OooO0oOGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC21580OooO0Oo());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C21557Oooo0o c21557Oooo0o = this.mContentInsets;
        if (c21557Oooo0o != null) {
            return c21557Oooo0o.f63066OooO0oO ? c21557Oooo0o.f63060OooO00o : c21557Oooo0o.f63061OooO0O0;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C21557Oooo0o c21557Oooo0o = this.mContentInsets;
        if (c21557Oooo0o != null) {
            return c21557Oooo0o.f63060OooO00o;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C21557Oooo0o c21557Oooo0o = this.mContentInsets;
        if (c21557Oooo0o != null) {
            return c21557Oooo0o.f63061OooO0O0;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C21557Oooo0o c21557Oooo0o = this.mContentInsets;
        if (c21557Oooo0o != null) {
            return c21557Oooo0o.f63066OooO0oO ? c21557Oooo0o.f63061OooO0O0 : c21557Oooo0o.f63060OooO00o;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.OooO oooO;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (oooO = actionMenuView.f62799OooOo0o) == null || !oooO.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public InterfaceC21541OooOoO0 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C21569OoooOoO(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        OooO0o oooO0o = this.mExpandedMenuPresenter;
        return (oooO0o == null || oooO0o.f63194OooOo == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f62802OooOoOO) == null || !actionMenuPresenter.OooO0O0()) ? false : true;
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f62802OooOoOO) == null) {
            return false;
        }
        return actionMenuPresenter.f62785OoooO0 != null || actionMenuPresenter.OooO0OO();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f62802OooOoOO) == null || !actionMenuPresenter.OooO0OO()) ? false : true;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0298 A[LOOP:0: B:104:0x0296->B:105:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b6 A[LOOP:1: B:107:0x02b4->B:108:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed A[LOOP:2: B:116:0x02eb->B:117:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iLayoutChildLeft;
        int iLayoutChildRight;
        int iMax;
        boolean zShouldLayout;
        boolean zShouldLayout2;
        boolean z2;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int size;
        int iLayoutChildLeft2;
        int i11;
        int size2;
        int i12;
        int i13;
        int size3;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i14 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!shouldLayout(this.mNavButtonView)) {
            iLayoutChildLeft = paddingLeft;
        } else {
            if (z3) {
                iLayoutChildRight = layoutChildRight(this.mNavButtonView, i14, iArr, iMin);
                iLayoutChildLeft = paddingLeft;
                if (shouldLayout(this.mCollapseButtonView)) {
                    if (z3) {
                        iLayoutChildRight = layoutChildRight(this.mCollapseButtonView, iLayoutChildRight, iArr, iMin);
                    } else {
                        iLayoutChildLeft = layoutChildLeft(this.mCollapseButtonView, iLayoutChildLeft, iArr, iMin);
                    }
                }
                if (shouldLayout(this.mMenuView)) {
                    if (z3) {
                        iLayoutChildLeft = layoutChildLeft(this.mMenuView, iLayoutChildLeft, iArr, iMin);
                    } else {
                        iLayoutChildRight = layoutChildRight(this.mMenuView, iLayoutChildRight, iArr, iMin);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iLayoutChildLeft);
                iArr[1] = Math.max(0, currentContentInsetRight - (i14 - iLayoutChildRight));
                iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft);
                int iMin2 = Math.min(iLayoutChildRight, i14 - currentContentInsetRight);
                if (shouldLayout(this.mExpandedActionView)) {
                    if (z3) {
                        iMin2 = layoutChildRight(this.mExpandedActionView, iMin2, iArr, iMin);
                    } else {
                        iMax = layoutChildLeft(this.mExpandedActionView, iMax, iArr, iMin);
                    }
                }
                if (shouldLayout(this.mLogoView)) {
                    if (z3) {
                        iMin2 = layoutChildRight(this.mLogoView, iMin2, iArr, iMin);
                    } else {
                        iMax = layoutChildLeft(this.mLogoView, iMax, iArr, iMin);
                    }
                }
                zShouldLayout = shouldLayout(this.mTitleTextView);
                zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
                if (zShouldLayout) {
                    z2 = z3;
                    measuredHeight = 0;
                } else {
                    C21582OooO0oO c21582OooO0oO = (C21582OooO0oO) this.mTitleTextView.getLayoutParams();
                    z2 = z3;
                    measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c21582OooO0oO).topMargin + ((ViewGroup.MarginLayoutParams) c21582OooO0oO).bottomMargin;
                }
                if (!zShouldLayout2) {
                    C21582OooO0oO c21582OooO0oO2 = (C21582OooO0oO) this.mSubtitleTextView.getLayoutParams();
                    measuredHeight = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c21582OooO0oO2).topMargin + ((ViewGroup.MarginLayoutParams) c21582OooO0oO2).bottomMargin + measuredHeight;
                }
                if (!zShouldLayout || zShouldLayout2) {
                    TextView textView = !zShouldLayout ? this.mTitleTextView : this.mSubtitleTextView;
                    TextView textView2 = !zShouldLayout2 ? this.mSubtitleTextView : this.mTitleTextView;
                    C21582OooO0oO c21582OooO0oO3 = (C21582OooO0oO) textView.getLayoutParams();
                    C21582OooO0oO c21582OooO0oO4 = (C21582OooO0oO) textView2.getLayoutParams();
                    int i15 = measuredHeight;
                    boolean z4 = (zShouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (zShouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i5 = this.mGravity & 112;
                    int i16 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c21582OooO0oO3).topMargin + this.mTitleMarginTop;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i15) / 2;
                        int i17 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO3).topMargin;
                        int i18 = this.mTitleMarginTop;
                        if (iMax2 < i17 + i18) {
                            iMax2 = i17 + i18;
                        } else {
                            int i19 = (((height - paddingBottom) - i15) - iMax2) - paddingTop2;
                            int i20 = ((ViewGroup.MarginLayoutParams) c21582OooO0oO3).bottomMargin;
                            int i21 = this.mTitleMarginBottom;
                            if (i19 < i20 + i21) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c21582OooO0oO4).bottomMargin + i21) - i19));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c21582OooO0oO4).bottomMargin) - this.mTitleMarginBottom) - i15;
                    }
                    if (z2) {
                        int i22 = (z4 ? this.mTitleMarginStart : 0) - iArr[1];
                        iMin2 -= Math.max(0, i22);
                        iArr[1] = Math.max(0, -i22);
                        if (zShouldLayout) {
                            C21582OooO0oO c21582OooO0oO5 = (C21582OooO0oO) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = iMin2 - this.mTitleTextView.getMeasuredWidth();
                            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i9 = measuredWidth - this.mTitleMarginEnd;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c21582OooO0oO5).bottomMargin;
                        } else {
                            i9 = iMin2;
                        }
                        if (zShouldLayout2) {
                            int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C21582OooO0oO) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i23, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i23);
                            i10 = iMin2 - this.mTitleMarginEnd;
                        } else {
                            i10 = iMin2;
                        }
                        if (z4) {
                            iMin2 = Math.min(i9, i10);
                        }
                        iMax = i16;
                        i6 = 0;
                    } else {
                        i6 = 0;
                        int i24 = (z4 ? this.mTitleMarginStart : 0) - iArr[0];
                        iMax = Math.max(0, i24) + i16;
                        iArr[0] = Math.max(0, -i24);
                        if (zShouldLayout) {
                            C21582OooO0oO c21582OooO0oO6 = (C21582OooO0oO) this.mTitleTextView.getLayoutParams();
                            int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i7 = measuredWidth2 + this.mTitleMarginEnd;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c21582OooO0oO6).bottomMargin;
                        } else {
                            i7 = iMax;
                        }
                        if (zShouldLayout2) {
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C21582OooO0oO) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                            this.mSubtitleTextView.layout(iMax, i25, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i25);
                            i8 = measuredWidth3 + this.mTitleMarginEnd;
                        } else {
                            i8 = iMax;
                        }
                        if (z4) {
                            iMax = Math.max(i7, i8);
                        }
                    }
                } else {
                    i6 = 0;
                }
                addCustomViewsWithGravity(this.mTempViews, 3);
                size = this.mTempViews.size();
                iLayoutChildLeft2 = iMax;
                for (i11 = i6; i11 < size; i11++) {
                    iLayoutChildLeft2 = layoutChildLeft(this.mTempViews.get(i11), iLayoutChildLeft2, iArr, iMin);
                }
                addCustomViewsWithGravity(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                for (i12 = i6; i12 < size2; i12++) {
                    iMin2 = layoutChildRight(this.mTempViews.get(i12), iMin2, iArr, iMin);
                }
                addCustomViewsWithGravity(this.mTempViews, 1);
                int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr);
                i13 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (viewListMeasuredWidth / 2);
                int i26 = viewListMeasuredWidth + i13;
                if (i13 >= iLayoutChildLeft2) {
                    iLayoutChildLeft2 = i26 > iMin2 ? i13 - (i26 - iMin2) : i13;
                }
                size3 = this.mTempViews.size();
                while (i6 < size3) {
                    iLayoutChildLeft2 = layoutChildLeft(this.mTempViews.get(i6), iLayoutChildLeft2, iArr, iMin);
                    i6++;
                }
                this.mTempViews.clear();
            }
            iLayoutChildLeft = layoutChildLeft(this.mNavButtonView, paddingLeft, iArr, iMin);
        }
        iLayoutChildRight = i14;
        if (shouldLayout(this.mCollapseButtonView)) {
        }
        if (shouldLayout(this.mMenuView)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iLayoutChildLeft);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i14 - iLayoutChildRight));
        iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft2);
        int iMin22 = Math.min(iLayoutChildRight, i14 - currentContentInsetRight2);
        if (shouldLayout(this.mExpandedActionView)) {
        }
        if (shouldLayout(this.mLogoView)) {
        }
        zShouldLayout = shouldLayout(this.mTitleTextView);
        zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (zShouldLayout) {
        }
        if (!zShouldLayout2) {
        }
        if (zShouldLayout) {
            if (!zShouldLayout) {
            }
            if (!zShouldLayout2) {
            }
            C21582OooO0oO c21582OooO0oO32 = (C21582OooO0oO) textView.getLayoutParams();
            C21582OooO0oO c21582OooO0oO42 = (C21582OooO0oO) textView2.getLayoutParams();
            int i152 = measuredHeight;
            if (zShouldLayout) {
                i5 = this.mGravity & 112;
                int i162 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            } else {
                i5 = this.mGravity & 112;
                int i1622 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            }
        }
        addCustomViewsWithGravity(this.mTempViews, 3);
        size = this.mTempViews.size();
        iLayoutChildLeft2 = iMax;
        while (i11 < size) {
        }
        addCustomViewsWithGravity(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i12 < size2) {
        }
        addCustomViewsWithGravity(this.mTempViews, 1);
        int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr);
        i13 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (viewListMeasuredWidth2 / 2);
        int i262 = viewListMeasuredWidth2 + i13;
        if (i13 >= iLayoutChildLeft2) {
        }
        size3 = this.mTempViews.size();
        while (i6 < size3) {
        }
        this.mTempViews.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int measuredHeight;
        int[] iArr2 = this.mTempMargins;
        boolean z = C21572Ooooo0o.f63118OooO00o;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[c] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (shouldLayout(this.mExpandedActionView)) {
            iArr = iArr2;
            iMax4 += measureChildCollapseMargins(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (shouldLayout(this.mLogoView)) {
            iMax4 += measureChildCollapseMargins(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((C21582OooO0oO) childAt.getLayoutParams()).f63197OooO0O0 == 0 && shouldLayout(childAt)) {
                iMax4 += measureChildCollapseMargins(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i4 = iMax4;
        int i5 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i6 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, i4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, measureChildCollapseMargins(this.mSubtitleTextView, i, i4 + i6, i2, i5 + measuredHeight, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(iMax, measuredHeight), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.OooO oooO = actionMenuView != null ? actionMenuView.f62799OooOo0o : null;
        int i = savedState.f63199OooOo0o;
        if (i != 0 && this.mExpandedMenuPresenter != null && oooO != null && (menuItemFindItem = oooO.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f63198OooOo) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ensureContentInsets();
        C21557Oooo0o c21557Oooo0o = this.mContentInsets;
        boolean z = i == 1;
        if (z == c21557Oooo0o.f63066OooO0oO) {
            return;
        }
        c21557Oooo0o.f63066OooO0oO = z;
        if (!c21557Oooo0o.f63067OooO0oo) {
            c21557Oooo0o.f63060OooO00o = c21557Oooo0o.f63065OooO0o0;
            c21557Oooo0o.f63061OooO0O0 = c21557Oooo0o.f63064OooO0o;
            return;
        }
        if (z) {
            int i2 = c21557Oooo0o.f63063OooO0Oo;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c21557Oooo0o.f63065OooO0o0;
            }
            c21557Oooo0o.f63060OooO00o = i2;
            int i3 = c21557Oooo0o.f63062OooO0OO;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c21557Oooo0o.f63064OooO0o;
            }
            c21557Oooo0o.f63061OooO0O0 = i3;
            return;
        }
        int i4 = c21557Oooo0o.f63062OooO0OO;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c21557Oooo0o.f63065OooO0o0;
        }
        c21557Oooo0o.f63060OooO00o = i4;
        int i5 = c21557Oooo0o.f63063OooO0Oo;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c21557Oooo0o.f63064OooO0o;
        }
        c21557Oooo0o.f63061OooO0O0 = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.OooOO0O oooOO0O;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        OooO0o oooO0o = this.mExpandedMenuPresenter;
        if (oooO0o != null && (oooOO0O = oooO0o.f63194OooOo) != null) {
            savedState.f63199OooOo0o = oooOO0O.f62640OooO00o;
        }
        savedState.f63198OooOo = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C21582OooO0oO) childAt.getLayoutParams()).f63197OooO0O0 != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(OooO.OooO00o.OooO0OO(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        C21557Oooo0o c21557Oooo0o = this.mContentInsets;
        c21557Oooo0o.f63067OooO0oo = false;
        if (i != Integer.MIN_VALUE) {
            c21557Oooo0o.f63065OooO0o0 = i;
            c21557Oooo0o.f63060OooO00o = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            c21557Oooo0o.f63064OooO0o = i2;
            c21557Oooo0o.f63061OooO0O0 = i2;
        }
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.OooO00o(i, i2);
    }

    public void setLogo(int i) {
        setLogo(OooO.OooO00o.OooO0OO(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setMenu(androidx.appcompat.view.menu.OooO oooO, ActionMenuPresenter actionMenuPresenter) {
        if (oooO == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.OooO oooO2 = this.mMenuView.f62799OooOo0o;
        if (oooO2 == oooO) {
            return;
        }
        if (oooO2 != null) {
            oooO2.removeMenuPresenter(this.mOuterActionMenuPresenter);
            oooO2.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new OooO0o();
        }
        actionMenuPresenter.f62782Oooo0oO = true;
        if (oooO != null) {
            oooO.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            oooO.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(OooOOOO.OooO00o oooO00o, OooO.OooO00o oooO00o2) {
        this.mActionMenuPresenterCallback = oooO00o;
        this.mMenuBuilderCallback = oooO00o2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.f62804OooOoo0 = oooO00o;
            actionMenuView.f62803OooOoo = oooO00o2;
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(OooO.OooO00o.OooO0OO(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC21583OooO0oo interfaceC21583OooO0oo) {
        this.mOnMenuItemClickListener = interfaceC21583OooO0oo;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f62802OooOoOO) == null || !actionMenuPresenter.OooO0Oo()) ? false : true;
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherOooO00o = C21581OooO0o0.OooO00o(this);
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherOooO00o != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = C21581OooO0o0.OooO0O0(new o000oOoO(this, 0));
                }
                C21581OooO0o0.OooO0OO(onBackInvokedDispatcherOooO00o, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherOooO00o;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            C21581OooO0o0.OooO0Oo(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, interfaceC21987OooOoo);
    }

    @Override // android.view.ViewGroup
    public C21582OooO0oO generateDefaultLayoutParams() {
        C21582OooO0oO c21582OooO0oO = new C21582OooO0oO(-2, -2);
        c21582OooO0oO.f63197OooO0O0 = 0;
        c21582OooO0oO.f62424OooO00o = 8388627;
        return c21582OooO0oO;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C21570OoooOoo.OooO00o(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.appcompat.widget.OoooOOO
            @Override // java.lang.Runnable
            public final void run() {
                this.f63095OooOo0o.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new OooO00o();
        this.mShowOverflowMenuRunnable = new OooO0O0();
        Context context2 = getContext();
        int[] iArr = C20441OooO00o.f58302OooOoO;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context2, attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, i, 0);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        this.mTitleTextAppearance = typedArray.getResourceId(28, 0);
        this.mSubtitleTextAppearance = typedArray.getResourceId(19, 0);
        this.mGravity = typedArray.getInteger(0, this.mGravity);
        this.mButtonGravity = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        ensureContentInsets();
        C21557Oooo0o c21557Oooo0o = this.mContentInsets;
        c21557Oooo0o.f63067OooO0oo = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c21557Oooo0o.f63065OooO0o0 = dimensionPixelSize;
            c21557Oooo0o.f63060OooO00o = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c21557Oooo0o.f63064OooO0o = dimensionPixelSize2;
            c21557Oooo0o.f63061OooO0O0 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c21557Oooo0o.OooO00o(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.mCollapseIcon = c21565OoooOO0OooO0o.OooO0O0(4);
        this.mCollapseDescription = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableOooO0O0 = c21565OoooOO0OooO0o.OooO0O0(16);
        if (drawableOooO0O0 != null) {
            setNavigationIcon(drawableOooO0O0);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableOooO0O02 = c21565OoooOO0OooO0o.OooO0O0(11);
        if (drawableOooO0O02 != null) {
            setLogo(drawableOooO0O02);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c21565OoooOO0OooO0o.OooO00o(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c21565OoooOO0OooO0o.OooO00o(20));
        }
        if (typedArray.hasValue(14)) {
            inflateMenu(typedArray.getResourceId(14, 0));
        }
        c21565OoooOO0OooO0o.OooO0oO();
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO0O0 oooO0O0) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, interfaceC21987OooOoo, oooO0O0);
    }

    @Override // android.view.ViewGroup
    public C21582OooO0oO generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C21582OooO0oO c21582OooO0oO = new C21582OooO0oO(context, attributeSet);
        c21582OooO0oO.f62424OooO00o = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58280OooO0O0);
        c21582OooO0oO.f62424OooO00o = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c21582OooO0oO.f63197OooO0O0 = 0;
        return c21582OooO0oO;
    }

    @Override // android.view.ViewGroup
    public C21582OooO0oO generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C21582OooO0oO) {
            C21582OooO0oO c21582OooO0oO = (C21582OooO0oO) layoutParams;
            C21582OooO0oO c21582OooO0oO2 = new C21582OooO0oO(c21582OooO0oO);
            c21582OooO0oO2.f63197OooO0O0 = 0;
            c21582OooO0oO2.f63197OooO0O0 = c21582OooO0oO.f63197OooO0O0;
            return c21582OooO0oO2;
        }
        if (layoutParams instanceof OooO00o.C18993OooO00o) {
            C21582OooO0oO c21582OooO0oO3 = new C21582OooO0oO((OooO00o.C18993OooO00o) layoutParams);
            c21582OooO0oO3.f63197OooO0O0 = 0;
            return c21582OooO0oO3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C21582OooO0oO c21582OooO0oO4 = new C21582OooO0oO(marginLayoutParams);
            c21582OooO0oO4.f63197OooO0O0 = 0;
            ((ViewGroup.MarginLayoutParams) c21582OooO0oO4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c21582OooO0oO4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c21582OooO0oO4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c21582OooO0oO4).bottomMargin = marginLayoutParams.bottomMargin;
            return c21582OooO0oO4;
        }
        C21582OooO0oO c21582OooO0oO5 = new C21582OooO0oO(layoutParams);
        c21582OooO0oO5.f63197OooO0O0 = 0;
        return c21582OooO0oO5;
    }
}
