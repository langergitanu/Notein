package com.google.android.material.navigation;

import OooO0Oo.OooO0OO;
import OooOO0o.OooO0o;
import OooooOo.C21387OooOOo;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.widget.C21565OoooOO0;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.C15966R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final DrawerLayout.InterfaceC21850OooO0Oo backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    private final int drawerLayoutCornerSizeBackAnimationMax;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = C15966R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.orion.notein.global.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private Drawable createDefaultItemBackground(C21565OoooOO0 c21565OoooOO0) {
        return createDefaultItemDrawable(c21565OoooOO0, MaterialResources.getColorStateList(getContext(), c21565OoooOO0, C15966R.styleable.NavigationView_itemShapeFillColor));
    }

    private Drawable createDefaultItemDrawable(C21565OoooOO0 c21565OoooOO0, ColorStateList colorStateList) {
        int resourceId = c21565OoooOO0.f63093OooO0O0.getResourceId(C15966R.styleable.NavigationView_itemShapeAppearance, 0);
        int i = C15966R.styleable.NavigationView_itemShapeAppearanceOverlay;
        TypedArray typedArray = c21565OoooOO0.f63093OooO0O0;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), resourceId, typedArray.getResourceId(i, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new OooO0o(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(C21565OoooOO0 c21565OoooOO0) {
        if (c21565OoooOO0.f63093OooO0O0.hasValue(C15966R.styleable.NavigationView_itemShapeAppearance)) {
            return true;
        }
        return c21565OoooOO0.f63093OooO0O0.hasValue(C15966R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.C21851OooO0o0)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z = GravityCompat.getAbsoluteGravity(((DrawerLayout.C21851OooO0o0) getLayoutParams()).f64642OooO00o, ViewCompat.getLayoutDirection(this)) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i, i2));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    private Pair<DrawerLayout, DrawerLayout.C21851OooO0o0> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.C21851OooO0o0)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.C21851OooO0o0) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onGlobalLayout() {
                boolean z;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z2 = true;
                boolean z3 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z3);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z3 && navigationView2.isTopInsetScrimEnabled());
                if (NavigationView.this.tmpLocation[0] != 0) {
                    z = NavigationView.this.getWidth() + NavigationView.this.tmpLocation[0] == 0;
                }
                NavigationView.this.setDrawLeftInsetForeground(z);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z4 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                    boolean z5 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z4 && z5 && navigationView3.isBottomInsetScrimEnabled());
                    if (currentWindowBounds.width() != NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.tmpLocation[0]) {
                        z2 = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z2);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new C21387OooOOo(this));
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.C21851OooO0o0> pairRequireDrawerLayoutParent = requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout) pairRequireDrawerLayoutParent.first;
        OooO0OO oooO0OOOnHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (oooO0OOOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.OooO0OO(this, true);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(oooO0OOOnHandleBackInvoked, ((DrawerLayout.C21851OooO0o0) pairRequireDrawerLayoutParent.second).f64642OooO00o, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    public View inflateHeaderView(int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.OooOOo(this.backDrawerListener);
            drawerLayout.OooO00o(this.backDrawerListener);
            if (DrawerLayout.OooOOO(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).OooOOo(this.backDrawerListener);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
        this.presenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((OooOO0O) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public void setDividerInsetStart(int i) {
        this.presenter.setDividerInsetStart(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public void setItemTextAppearance(int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setSubheaderInsetEnd(int i) {
        this.presenter.setSubheaderInsetEnd(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(OooO0OO oooO0OO) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(oooO0OO);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(OooO0OO oooO0OO) {
        this.sideContainerBackHelper.updateBackProgress(oooO0OO, ((DrawerLayout.C21851OooO0o0) requireDrawerLayoutParent().second).f64642OooO00o);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(oooO0OO.f58182OooO0OO));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C15966R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168 A[PHI: r15
      0x0168: PHI (r15v4 android.graphics.drawable.Drawable) = 
      (r15v3 android.graphics.drawable.Drawable)
      (r15v3 android.graphics.drawable.Drawable)
      (r15v6 android.graphics.drawable.Drawable)
     binds: [B:50:0x0141, B:52:0x0147, B:54:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListCreateDefaultColorStateList;
        C21565OoooOO0 c21565OoooOO0;
        int i2;
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i3), attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new DrawerLayout.OooO0o() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.drawerlayout.widget.DrawerLayout.OooO0o, androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
            public void onDrawerClosed(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.OooO0o, androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
            public void onDrawerOpened(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    final MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    Objects.requireNonNull(materialBackOrchestrator);
                    view.post(new Runnable() { // from class: com.google.android.material.navigation.OooO0O0
                        @Override // java.lang.Runnable
                        public final void run() {
                            materialBackOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
                        }
                    });
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        C21565OoooOO0 c21565OoooOO0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C15966R.styleable.NavigationView, i, i3, new int[0]);
        int i4 = C15966R.styleable.NavigationView_android_background;
        if (c21565OoooOO0ObtainTintedStyledAttributes.f63093OooO0O0.hasValue(i4)) {
            ViewCompat.setBackground(this, c21565OoooOO0ObtainTintedStyledAttributes.OooO0O0(i4));
        }
        int i5 = C15966R.styleable.NavigationView_drawerLayoutCornerSize;
        TypedArray typedArray = c21565OoooOO0ObtainTintedStyledAttributes.f63093OooO0O0;
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i5, 0);
        this.drawerLayoutCornerSize = dimensionPixelSize;
        this.drawerLayoutCornerSizeBackAnimationEnabled = dimensionPixelSize == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(C15966R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i3).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        if (typedArray.hasValue(C15966R.styleable.NavigationView_elevation)) {
            setElevation(typedArray.getDimensionPixelSize(r2, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(C15966R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_android_maxWidth, 0);
        int i6 = C15966R.styleable.NavigationView_subheaderColor;
        ColorStateList colorStateListOooO00o = typedArray.hasValue(i6) ? c21565OoooOO0ObtainTintedStyledAttributes.OooO00o(i6) : null;
        int i7 = C15966R.styleable.NavigationView_subheaderTextAppearance;
        int resourceId = typedArray.hasValue(i7) ? typedArray.getResourceId(i7, 0) : 0;
        if (resourceId == 0 && colorStateListOooO00o == null) {
            colorStateListOooO00o = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int i8 = C15966R.styleable.NavigationView_itemIconTint;
        if (typedArray.hasValue(i8)) {
            colorStateListCreateDefaultColorStateList = c21565OoooOO0ObtainTintedStyledAttributes.OooO00o(i8);
        } else {
            colorStateListCreateDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int i9 = C15966R.styleable.NavigationView_itemTextAppearance;
        int resourceId2 = typedArray.hasValue(i9) ? typedArray.getResourceId(i9, 0) : 0;
        boolean z = typedArray.getBoolean(C15966R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        int i10 = C15966R.styleable.NavigationView_itemIconSize;
        if (typedArray.hasValue(i10)) {
            setItemIconSize(typedArray.getDimensionPixelSize(i10, 0));
        }
        int i11 = C15966R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateListOooO00o2 = typedArray.hasValue(i11) ? c21565OoooOO0ObtainTintedStyledAttributes.OooO00o(i11) : null;
        if (resourceId2 == 0 && colorStateListOooO00o2 == null) {
            colorStateListOooO00o2 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableOooO0O0 = c21565OoooOO0ObtainTintedStyledAttributes.OooO0O0(C15966R.styleable.NavigationView_itemBackground);
        if (drawableOooO0O0 == null && hasShapeAppearance(c21565OoooOO0ObtainTintedStyledAttributes)) {
            drawableOooO0O0 = createDefaultItemBackground(c21565OoooOO0ObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, c21565OoooOO0ObtainTintedStyledAttributes, C15966R.styleable.NavigationView_itemRippleColor);
            if (colorStateList != null) {
                c21565OoooOO0 = c21565OoooOO0ObtainTintedStyledAttributes;
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(c21565OoooOO0ObtainTintedStyledAttributes, null)));
            }
        } else {
            c21565OoooOO0 = c21565OoooOO0ObtainTintedStyledAttributes;
        }
        int i12 = C15966R.styleable.NavigationView_itemHorizontalPadding;
        if (typedArray.hasValue(i12)) {
            i2 = 0;
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(i12, 0));
        } else {
            i2 = 0;
        }
        int i13 = C15966R.styleable.NavigationView_itemVerticalPadding;
        if (typedArray.hasValue(i13)) {
            setItemVerticalPadding(typedArray.getDimensionPixelSize(i13, i2));
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_dividerInsetStart, i2));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_dividerInsetEnd, i2));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_subheaderInsetStart, i2));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_subheaderInsetEnd, i2));
        setTopInsetScrimEnabled(typedArray.getBoolean(C15966R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(typedArray.getBoolean(C15966R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C15966R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(typedArray.getInt(C15966R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new OooO.OooO00o() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // androidx.appcompat.view.menu.OooO.OooO00o
            public boolean onMenuItemSelected(OooO oooO, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.OooO.OooO00o
            public void onMenuModeChange(OooO oooO) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(resourceId);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListOooO00o);
        navigationMenuPresenter.setItemIconTintList(colorStateListCreateDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (resourceId2 != 0) {
            navigationMenuPresenter.setItemTextAppearance(resourceId2);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z);
        navigationMenuPresenter.setItemTextColor(colorStateListOooO00o2);
        navigationMenuPresenter.setItemBackground(drawableOooO0O0);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize2);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i14 = C15966R.styleable.NavigationView_menu;
        if (typedArray.hasValue(i14)) {
            inflateMenu(typedArray.getResourceId(i14, 0));
        }
        int i15 = C15966R.styleable.NavigationView_headerLayout;
        if (typedArray.hasValue(i15)) {
            inflateHeaderView(typedArray.getResourceId(i15, 0));
        }
        c21565OoooOO0.OooO0oO();
        setupInsetScrimsListener();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((OooOO0O) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
