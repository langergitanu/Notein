package androidx.appcompat.view.menu;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C21570OoooOoo;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC21512OooOOOo.OooO00o, View.OnClickListener, ActionMenuView.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public CharSequence f62528OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOO0O f62529OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO.OooO0O0 f62530OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Drawable f62531OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooO00o f62532OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f62533OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO0O0 f62534OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f62535OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int f62536OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f62537Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f62538Oooo00O;

    public class OooO00o extends AbstractViewOnTouchListenerC21553Oooo00O {
        public OooO00o() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O
        public final InterfaceC21513OooOOo OooO0O0() {
            ActionMenuPresenter.OooO00o oooO00o;
            OooO0O0 oooO0O0 = ActionMenuItemView.this.f62534OooOoo0;
            if (oooO0O0 == null || (oooO00o = ActionMenuPresenter.this.f62786OoooO00) == null) {
                return null;
            }
            return oooO00o.OooO00o();
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O
        public final boolean OooO0OO() {
            InterfaceC21513OooOOo interfaceC21513OooOOoOooO0O0;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            OooO.OooO0O0 oooO0O0 = actionMenuItemView.f62530OooOoO;
            return oooO0O0 != null && oooO0O0.OooO0OO(actionMenuItemView.f62529OooOo0o) && (interfaceC21513OooOOoOooO0O0 = OooO0O0()) != null && interfaceC21513OooOOoOooO0O0.OooO00o();
        }
    }

    public static abstract class OooO0O0 {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f62533OooOoo = OooO0OO();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58281OooO0OO, 0, 0);
        this.f62536OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f62538Oooo00O = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f62537Oooo000 = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public final boolean OooO00o() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public final boolean OooO0O0() {
        return !TextUtils.isEmpty(getText()) && this.f62529OooOo0o.getIcon() == null;
    }

    public final boolean OooO0OO() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void OooO0Oo() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f62528OooOo);
        if (this.f62531OooOoO0 != null && ((this.f62529OooOo0o.f62664OooOoO0 & 4) != 4 || (!this.f62533OooOoo && !this.f62535OooOooO))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f62528OooOo : null);
        CharSequence charSequence = this.f62529OooOo0o.f62656OooOOo0;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f62529OooOo0o.f62645OooO0o0);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f62529OooOo0o.f62655OooOOo;
        if (TextUtils.isEmpty(charSequence2)) {
            C21570OoooOoo.OooO00o(this, z3 ? null : this.f62529OooOo0o.f62645OooO0o0);
        } else {
            C21570OoooOoo.OooO00o(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21512OooOOOo.OooO00o
    public OooOO0O getItemData() {
        return this.f62529OooOo0o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21512OooOOOo.OooO00o
    public final void initialize(OooOO0O oooOO0O, int i) {
        this.f62529OooOo0o = oooOO0O;
        setIcon(oooOO0O.getIcon());
        setTitle(oooOO0O.getTitleCondensed());
        setId(oooOO0O.f62640OooO00o);
        setVisibility(oooOO0O.isVisible() ? 0 : 8);
        setEnabled(oooOO0O.isEnabled());
        if (oooOO0O.hasSubMenu() && this.f62532OooOoOO == null) {
            this.f62532OooOoOO = new OooO00o();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooO.OooO0O0 oooO0O0 = this.f62530OooOoO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(this.f62529OooOo0o);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f62533OooOoo = OooO0OO();
        OooO0Oo();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f62537Oooo000) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f62536OooOooo;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f62531OooOoO0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f62531OooOoO0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        OooO00o oooO00o;
        if (this.f62529OooOo0o.hasSubMenu() && (oooO00o = this.f62532OooOoOO) != null && oooO00o.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f62535OooOooO != z) {
            this.f62535OooOooO = z;
            OooOO0O oooOO0O = this.f62529OooOo0o;
            if (oooOO0O != null) {
                oooOO0O.f62651OooOOO.onItemActionRequestChanged(oooOO0O);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f62531OooOoO0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f62538Oooo00O;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        OooO0Oo();
    }

    public void setItemInvoker(OooO.OooO0O0 oooO0O0) {
        this.f62530OooOoO = oooO0O0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f62537Oooo000 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(OooO0O0 oooO0O0) {
        this.f62534OooOoo0 = oooO0O0;
    }

    public void setTitle(CharSequence charSequence) {
        this.f62528OooOo = charSequence;
        OooO0Oo();
    }
}
