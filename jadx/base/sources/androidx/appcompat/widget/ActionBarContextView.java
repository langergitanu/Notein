package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import OooOO0o.AbstractC20443OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.core.view.ViewCompat;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.OooO00o {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public CharSequence f62726OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f62727Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f62728Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public CharSequence f62729Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f62730Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f62731Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public LinearLayout f62732Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f62733Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f62734Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f62735Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f62736Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f62737Oooo0oo;

    public class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC20443OooO00o f62738OooOo0o;

        public OooO00o(AbstractC20443OooO00o abstractC20443OooO00o) {
            this.f62738OooOo0o = abstractC20443OooO00o;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f62738OooOo0o.OooO00o();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58282OooO0Oo, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : OooO.OooO00o.OooO0OO(context, resourceId));
        this.f62734Oooo0o = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f62736Oooo0oO = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f62884OooOoOO = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f62727Oooo = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooO0o(AbstractC20443OooO00o abstractC20443OooO00o) {
        View view = this.f62730Oooo00O;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f62727Oooo, (ViewGroup) this, false);
            this.f62730Oooo00O = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f62730Oooo00O);
        }
        View viewFindViewById = this.f62730Oooo00O.findViewById(R.id.action_mode_close_button);
        this.f62731Oooo00o = viewFindViewById;
        viewFindViewById.setOnClickListener(new OooO00o(abstractC20443OooO00o));
        androidx.appcompat.view.menu.OooO oooOOooO0OO = abstractC20443OooO00o.OooO0OO();
        ActionMenuPresenter actionMenuPresenter = this.f62882OooOoO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0O0();
            ActionMenuPresenter.OooO00o oooO00o = actionMenuPresenter.f62786OoooO00;
            if (oooO00o != null && oooO00o.OooO0O0()) {
                oooO00o.f62680OooO.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f62882OooOoO = actionMenuPresenter2;
        actionMenuPresenter2.f62774Oooo0 = true;
        actionMenuPresenter2.f62778Oooo0O0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oooOOooO0OO.addMenuPresenter(this.f62882OooOoO, this.f62880OooOo);
        ActionMenuPresenter actionMenuPresenter3 = this.f62882OooOoO;
        InterfaceC21512OooOOOo interfaceC21512OooOOOo = actionMenuPresenter3.f62582OooOooO;
        if (interfaceC21512OooOOOo == null) {
            InterfaceC21512OooOOOo interfaceC21512OooOOOo2 = (InterfaceC21512OooOOOo) actionMenuPresenter3.f62577OooOoO.inflate(actionMenuPresenter3.f62581OooOoo0, (ViewGroup) this, false);
            actionMenuPresenter3.f62582OooOooO = interfaceC21512OooOOOo2;
            interfaceC21512OooOOOo2.initialize(actionMenuPresenter3.f62578OooOoO0);
            actionMenuPresenter3.updateMenuView(true);
        }
        InterfaceC21512OooOOOo interfaceC21512OooOOOo3 = actionMenuPresenter3.f62582OooOooO;
        if (interfaceC21512OooOOOo != interfaceC21512OooOOOo3) {
            ((ActionMenuView) interfaceC21512OooOOOo3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC21512OooOOOo3;
        this.f62883OooOoO0 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f62883OooOoO0, layoutParams);
    }

    public final void OooO0oO() {
        if (this.f62732Oooo0O0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f62732Oooo0O0 = linearLayout;
            this.f62733Oooo0OO = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f62735Oooo0o0 = (TextView) this.f62732Oooo0O0.findViewById(R.id.action_bar_subtitle);
            int i = this.f62734Oooo0o;
            if (i != 0) {
                this.f62733Oooo0OO.setTextAppearance(getContext(), i);
            }
            int i2 = this.f62736Oooo0oO;
            if (i2 != 0) {
                this.f62735Oooo0o0.setTextAppearance(getContext(), i2);
            }
        }
        this.f62733Oooo0OO.setText(this.f62726OooOooo);
        this.f62735Oooo0o0.setText(this.f62729Oooo000);
        boolean zIsEmpty = TextUtils.isEmpty(this.f62726OooOooo);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f62729Oooo000);
        this.f62735Oooo0o0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f62732Oooo0O0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f62732Oooo0O0.getParent() == null) {
            addView(this.f62732Oooo0O0);
        }
    }

    public final void OooO0oo() {
        removeAllViews();
        this.f62728Oooo0 = null;
        this.f62883OooOoO0 = null;
        this.f62882OooOoO = null;
        View view = this.f62731Oooo00o;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.OooO00o
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.OooO00o
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f62729Oooo000;
    }

    public CharSequence getTitle() {
        return this.f62726OooOooo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f62882OooOoO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0O0();
            ActionMenuPresenter.OooO00o oooO00o = this.f62882OooOoO.f62786OoooO00;
            if (oooO00o == null || !oooO00o.OooO0O0()) {
                return;
            }
            oooO00o.f62680OooO.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = C21572Ooooo0o.f63118OooO00o;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f62730Oooo00O;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f62730Oooo00O.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iOooO0Oo = androidx.appcompat.widget.OooO00o.OooO0Oo(i7, paddingTop, paddingTop2, this.f62730Oooo00O, z3) + i7;
            paddingRight = z3 ? iOooO0Oo - i6 : iOooO0Oo + i6;
        }
        LinearLayout linearLayout = this.f62732Oooo0O0;
        if (linearLayout != null && this.f62728Oooo0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += androidx.appcompat.widget.OooO00o.OooO0Oo(paddingRight, paddingTop, paddingTop2, this.f62732Oooo0O0, z3);
        }
        View view2 = this.f62728Oooo0;
        if (view2 != null) {
            androidx.appcompat.widget.OooO00o.OooO0Oo(paddingRight, paddingTop, paddingTop2, view2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f62883OooOoO0;
        if (actionMenuView != null) {
            androidx.appcompat.widget.OooO00o.OooO0Oo(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f62884OooOoOO;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f62730Oooo00O;
        if (view != null) {
            int iOooO0OO = androidx.appcompat.widget.OooO00o.OooO0OO(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f62730Oooo00O.getLayoutParams();
            paddingLeft = iOooO0OO - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f62883OooOoO0;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = androidx.appcompat.widget.OooO00o.OooO0OO(this.f62883OooOoO0, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f62732Oooo0O0;
        if (linearLayout != null && this.f62728Oooo0 == null) {
            if (this.f62737Oooo0oo) {
                this.f62732Oooo0O0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f62732Oooo0O0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f62732Oooo0O0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = androidx.appcompat.widget.OooO00o.OooO0OO(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f62728Oooo0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f62728Oooo0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f62884OooOoOO > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // androidx.appcompat.widget.OooO00o
    public void setContentHeight(int i) {
        this.f62884OooOoOO = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f62728Oooo0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f62728Oooo0 = view;
        if (view != null && (linearLayout = this.f62732Oooo0O0) != null) {
            removeView(linearLayout);
            this.f62732Oooo0O0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f62729Oooo000 = charSequence;
        OooO0oO();
    }

    public void setTitle(CharSequence charSequence) {
        this.f62726OooOooo = charSequence;
        OooO0oO();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f62737Oooo0oo) {
            requestLayout();
        }
        this.f62737Oooo0oo = z;
    }

    @Override // androidx.appcompat.widget.OooO00o, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
