package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import androidx.appcompat.view.menu.InterfaceC21513OooOOo;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import androidx.core.view.GravityCompat;
import com.orion.notein.global.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.OooO0O0 implements ActionProvider.SubUiVisibilityListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public C21520OooO0o0 f62773Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f62774Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C21519OooO0Oo f62775Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Drawable f62776Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f62777Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f62778Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f62779Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f62780Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f62781Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f62782Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final SparseBooleanArray f62783Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final OooO0o f62784OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO0OO f62785OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO00o f62786OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooO0O0 f62787OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f62788OoooOO0;

    public class OooO00o extends androidx.appcompat.view.menu.OooOOO {
        public OooO00o(Context context, androidx.appcompat.view.menu.OooOo00 oooOo00, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, oooOo00, false);
            if ((((androidx.appcompat.view.menu.OooOO0O) oooOo00.getItem()).f62658OooOo & 32) != 32) {
                View view2 = ActionMenuPresenter.this.f62775Oooo000;
                this.f62686OooO0o0 = view2 == null ? (View) ActionMenuPresenter.this.f62582OooOooO : view2;
            }
            OooO0o oooO0o = ActionMenuPresenter.this.f62784OoooO;
            this.f62688OooO0oo = oooO0o;
            androidx.appcompat.view.menu.OooOOO0 oooOOO0 = this.f62680OooO;
            if (oooOOO0 != null) {
                oooOOO0.setCallback(oooO0o);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final void OooO0OO() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f62786OoooO00 = null;
            actionMenuPresenter.f62788OoooOO0 = 0;
            super.OooO0OO();
        }
    }

    public class OooO0O0 extends ActionMenuItemView.OooO0O0 {
        public OooO0O0() {
        }
    }

    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C21520OooO0o0 f62792OooOo0o;

        public OooO0OO(C21520OooO0o0 c21520OooO0o0) {
            this.f62792OooOo0o = c21520OooO0o0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f62578OooOoO0;
            if (oooO != null) {
                oooO.changeMenuMode();
            }
            View view = (View) actionMenuPresenter.f62582OooOooO;
            if (view != null && view.getWindowToken() != null) {
                C21520OooO0o0 c21520OooO0o0 = this.f62792OooOo0o;
                if (c21520OooO0o0.OooO0O0()) {
                    actionMenuPresenter.f62773Oooo = c21520OooO0o0;
                } else if (c21520OooO0o0.f62686OooO0o0 != null) {
                    c21520OooO0o0.OooO0Oo(0, 0, false, false);
                    actionMenuPresenter.f62773Oooo = c21520OooO0o0;
                }
            }
            actionMenuPresenter.f62785OoooO0 = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$OooO0Oo, reason: case insensitive filesystem */
    public class C21519OooO0Oo extends AppCompatImageView implements ActionMenuView.OooO00o {

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$OooO0Oo$OooO00o */
        public class OooO00o extends AbstractViewOnTouchListenerC21553Oooo00O {
            public OooO00o(C21519OooO0Oo c21519OooO0Oo) {
                super(c21519OooO0Oo);
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O
            public final InterfaceC21513OooOOo OooO0O0() {
                C21520OooO0o0 c21520OooO0o0 = ActionMenuPresenter.this.f62773Oooo;
                if (c21520OooO0o0 == null) {
                    return null;
                }
                return c21520OooO0o0.OooO00o();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O
            public final boolean OooO0OO() {
                ActionMenuPresenter.this.OooO0Oo();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC21553Oooo00O
            public final boolean OooO0Oo() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f62785OoooO0 != null) {
                    return false;
                }
                actionMenuPresenter.OooO0O0();
                return true;
            }
        }

        public C21519OooO0Oo(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C21570OoooOoo.OooO00o(this, getContentDescription());
            setOnTouchListener(new OooO00o(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
        public final boolean OooO00o() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
        public final boolean OooO0O0() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.OooO0Oo();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.setHotspotBounds(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class OooO0o implements OooOOOO.OooO00o {
        public OooO0o() {
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final boolean OooO00o(androidx.appcompat.view.menu.OooO oooO) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (oooO == actionMenuPresenter.f62578OooOoO0) {
                return false;
            }
            actionMenuPresenter.f62788OoooOO0 = ((androidx.appcompat.view.menu.OooOo00) oooO).getItem().getItemId();
            OooOOOO.OooO00o oooO00o = actionMenuPresenter.f62579OooOoOO;
            if (oooO00o != null) {
                return oooO00o.OooO00o(oooO);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final void onCloseMenu(androidx.appcompat.view.menu.OooO oooO, boolean z) {
            if (oooO instanceof androidx.appcompat.view.menu.OooOo00) {
                oooO.getRootMenu().close(false);
            }
            OooOOOO.OooO00o oooO00o = ActionMenuPresenter.this.f62579OooOoOO;
            if (oooO00o != null) {
                oooO00o.onCloseMenu(oooO, z);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$OooO0o0, reason: case insensitive filesystem */
    public class C21520OooO0o0 extends androidx.appcompat.view.menu.OooOOO {
        public C21520OooO0o0(Context context, androidx.appcompat.view.menu.OooO oooO, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, oooO, true);
            this.f62685OooO0o = GravityCompat.END;
            OooO0o oooO0o = ActionMenuPresenter.this.f62784OoooO;
            this.f62688OooO0oo = oooO0o;
            androidx.appcompat.view.menu.OooOOO0 oooOOO0 = this.f62680OooO;
            if (oooOOO0 != null) {
                oooOOO0.setCallback(oooO0o);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final void OooO0OO() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f62578OooOoO0;
            if (oooO != null) {
                oooO.close();
            }
            actionMenuPresenter.f62773Oooo = null;
            super.OooO0OO();
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f62797OooOo0o;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f62797OooOo0o = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f62797OooOo0o);
        }
    }

    public ActionMenuPresenter(Context context) {
        this.f62576OooOo0o = context;
        this.f62577OooOoO = LayoutInflater.from(context);
        this.f62581OooOoo0 = R.layout.abc_action_menu_layout;
        this.f62580OooOoo = R.layout.abc_action_menu_item_layout;
        this.f62783Oooo0oo = new SparseBooleanArray();
        this.f62784OoooO = new OooO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO00o(androidx.appcompat.view.menu.OooOO0O oooOO0O, View view, ViewGroup viewGroup) {
        View actionView = oooOO0O.getActionView();
        if (actionView == null || oooOO0O.OooO0OO()) {
            InterfaceC21512OooOOOo.OooO00o oooO00o = view instanceof InterfaceC21512OooOOOo.OooO00o ? (InterfaceC21512OooOOOo.OooO00o) view : (InterfaceC21512OooOOOo.OooO00o) this.f62577OooOoO.inflate(this.f62580OooOoo, viewGroup, false);
            oooO00o.initialize(oooOO0O, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) oooO00o;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f62582OooOooO);
            if (this.f62787OoooO0O == null) {
                this.f62787OoooO0O = new OooO0O0();
            }
            actionMenuItemView.setPopupCallback(this.f62787OoooO0O);
            actionView = (View) oooO00o;
        }
        actionView.setVisibility(oooOO0O.f62666OooOoo ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.OooO0OO)) {
            actionView.setLayoutParams(ActionMenuView.OooO0o0(layoutParams));
        }
        return actionView;
    }

    public final boolean OooO0O0() {
        Object obj;
        OooO0OO oooO0OO = this.f62785OoooO0;
        if (oooO0OO != null && (obj = this.f62582OooOooO) != null) {
            ((View) obj).removeCallbacks(oooO0OO);
            this.f62785OoooO0 = null;
            return true;
        }
        C21520OooO0o0 c21520OooO0o0 = this.f62773Oooo;
        if (c21520OooO0o0 == null) {
            return false;
        }
        if (c21520OooO0o0.OooO0O0()) {
            c21520OooO0o0.f62680OooO.dismiss();
        }
        return true;
    }

    public final boolean OooO0OO() {
        C21520OooO0o0 c21520OooO0o0 = this.f62773Oooo;
        return c21520OooO0o0 != null && c21520OooO0o0.OooO0O0();
    }

    public final boolean OooO0Oo() {
        androidx.appcompat.view.menu.OooO oooO;
        if (!this.f62774Oooo0 || OooO0OO() || (oooO = this.f62578OooOoO0) == null || this.f62582OooOooO == null || this.f62785OoooO0 != null || oooO.getNonActionItems().isEmpty()) {
            return false;
        }
        OooO0OO oooO0OO = new OooO0OO(new C21520OooO0o0(this.f62575OooOo, this.f62578OooOoO0, this.f62775Oooo000));
        this.f62785OoooO0 = oooO0OO;
        ((View) this.f62582OooOooO).post(oooO0OO);
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean flagActionItems() {
        ArrayList<androidx.appcompat.view.menu.OooOO0O> visibleItems;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f62578OooOoO0;
        View view = null;
        boolean z5 = false;
        if (oooO != null) {
            visibleItems = oooO.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i = actionMenuPresenter.f62780Oooo0o;
        int i2 = actionMenuPresenter.f62781Oooo0o0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f62582OooOooO;
        int i3 = 0;
        boolean z6 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            androidx.appcompat.view.menu.OooOO0O oooOO0O = visibleItems.get(i3);
            if (oooOO0O.requiresActionButton()) {
                i4++;
                z4 = z6;
            } else if ((oooOO0O.f62664OooOoO0 & 1) == 1) {
                i5++;
                z4 = z6;
            } else {
                z4 = true;
            }
            if (actionMenuPresenter.f62782Oooo0oO && oooOO0O.f62666OooOoo) {
                i = 0;
            }
            i3++;
            z6 = z4;
        }
        if (actionMenuPresenter.f62774Oooo0 && (z6 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f62783Oooo0oo;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            androidx.appcompat.view.menu.OooOO0O oooOO0O2 = visibleItems.get(i7);
            boolean zRequiresActionButton = oooOO0O2.requiresActionButton();
            int i9 = oooOO0O2.f62641OooO0O0;
            if (zRequiresActionButton) {
                View viewOooO00o = actionMenuPresenter.OooO00o(oooOO0O2, view, viewGroup);
                viewOooO00o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewOooO00o.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                oooOO0O2.OooO0o0(z);
                z2 = z5;
                z3 = z ? 1 : 0;
            } else if ((oooOO0O2.f62664OooOoO0 & (z ? 1 : 0)) == z) {
                boolean z7 = sparseBooleanArray.get(i9);
                boolean z8 = ((i6 > 0 || z7) && i2 > 0) ? z ? 1 : 0 : z5;
                if (z8) {
                    View viewOooO00o2 = actionMenuPresenter.OooO00o(oooOO0O2, view, viewGroup);
                    viewOooO00o2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewOooO00o2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z8 = (z8 ? 1 : 0) & (i2 + i8 > 0 ? z ? 1 : 0 : false);
                }
                boolean z9 = z8;
                if (z9 && i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                } else if (z7) {
                    sparseBooleanArray.put(i9, false);
                    int i10 = 0;
                    while (i10 < i7) {
                        androidx.appcompat.view.menu.OooOO0O oooOO0O3 = visibleItems.get(i10);
                        boolean z10 = z ? 1 : 0;
                        if (oooOO0O3.f62641OooO0O0 == i9) {
                            if ((oooOO0O3.f62658OooOo & 32) == 32) {
                                i6++;
                            }
                            oooOO0O3.OooO0o0(false);
                        }
                        i10++;
                        z = z10 ? 1 : 0;
                    }
                }
                z3 = z;
                if (z9) {
                    i6--;
                }
                oooOO0O2.OooO0o0(z9);
                z2 = false;
            } else {
                z2 = z5;
                z3 = z ? 1 : 0;
                oooOO0O2.OooO0o0(z2);
            }
            i7++;
            z5 = z2;
            z = z3;
            view = null;
            actionMenuPresenter = this;
        }
        return z ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void initForMenu(Context context, androidx.appcompat.view.menu.OooO oooO) {
        this.f62575OooOo = context;
        LayoutInflater.from(context);
        this.f62578OooOoO0 = oooO;
        Resources resources = context.getResources();
        if (!this.f62778Oooo0O0) {
            this.f62774Oooo0 = true;
        }
        int i = 2;
        this.f62779Oooo0OO = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f62780Oooo0o = i;
        int measuredWidth = this.f62779Oooo0OO;
        if (this.f62774Oooo0) {
            if (this.f62775Oooo000 == null) {
                C21519OooO0Oo c21519OooO0Oo = new C21519OooO0Oo(this.f62576OooOo0o);
                this.f62775Oooo000 = c21519OooO0Oo;
                if (this.f62777Oooo00o) {
                    c21519OooO0Oo.setImageDrawable(this.f62776Oooo00O);
                    this.f62776Oooo00O = null;
                    this.f62777Oooo00o = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f62775Oooo000.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f62775Oooo000.getMeasuredWidth();
        } else {
            this.f62775Oooo000 = null;
        }
        this.f62781Oooo0o0 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void onCloseMenu(androidx.appcompat.view.menu.OooO oooO, boolean z) {
        OooO0O0();
        OooO00o oooO00o = this.f62786OoooO00;
        if (oooO00o != null && oooO00o.OooO0O0()) {
            oooO00o.f62680OooO.dismiss();
        }
        OooOOOO.OooO00o oooO00o2 = this.f62579OooOoOO;
        if (oooO00o2 != null) {
            oooO00o2.onCloseMenu(oooO, z);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f62797OooOo0o) > 0 && (menuItemFindItem = this.f62578OooOoO0.findItem(i)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.OooOo00) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f62797OooOo0o = this.f62788OoooOO0;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.OooOo00 oooOo00) {
        boolean z;
        if (oooOo00.hasVisibleItems()) {
            androidx.appcompat.view.menu.OooOo00 oooOo002 = oooOo00;
            while (oooOo002.getParentMenu() != this.f62578OooOoO0) {
                oooOo002 = (androidx.appcompat.view.menu.OooOo00) oooOo002.getParentMenu();
            }
            MenuItem item = oooOo002.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f62582OooOooO;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC21512OooOOOo.OooO00o) && ((InterfaceC21512OooOOOo.OooO00o) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.f62788OoooOO0 = oooOo00.getItem().getItemId();
                int size = oooOo00.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item2 = oooOo00.getItem(i2);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                OooO00o oooO00o = new OooO00o(this.f62575OooOo, oooOo00, view);
                this.f62786OoooO00 = oooO00o;
                oooO00o.f62687OooO0oO = z;
                androidx.appcompat.view.menu.OooOOO0 oooOOO0 = oooO00o.f62680OooO;
                if (oooOOO0 != null) {
                    oooOOO0.OooO0o0(z);
                }
                OooO00o oooO00o2 = this.f62786OoooO00;
                if (!oooO00o2.OooO0O0()) {
                    if (oooO00o2.f62686OooO0o0 == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    oooO00o2.OooO0Oo(0, 0, false, false);
                }
                OooOOOO.OooO00o oooO00o3 = this.f62579OooOoOO;
                if (oooO00o3 != null) {
                    oooO00o3.OooO00o(oooOo00);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public final void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            OooOOOO.OooO00o oooO00o = this.f62579OooOoOO;
            if (oooO00o != null) {
                oooO00o.OooO00o(this.f62578OooOoO0);
                return;
            }
            return;
        }
        androidx.appcompat.view.menu.OooO oooO = this.f62578OooOoO0;
        if (oooO != null) {
            oooO.close(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void updateMenuView(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f62582OooOooO;
        boolean z2 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.OooO oooO = this.f62578OooOoO0;
            if (oooO != null) {
                oooO.flagActionItems();
                ArrayList<androidx.appcompat.view.menu.OooOO0O> visibleItems = this.f62578OooOoO0.getVisibleItems();
                int size = visibleItems.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.appcompat.view.menu.OooOO0O oooOO0O = visibleItems.get(i2);
                    if ((oooOO0O.f62658OooOo & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        androidx.appcompat.view.menu.OooOO0O itemData = childAt instanceof InterfaceC21512OooOOOo.OooO00o ? ((InterfaceC21512OooOOOo.OooO00o) childAt).getItemData() : null;
                        View viewOooO00o = OooO00o(oooOO0O, childAt, viewGroup);
                        if (oooOO0O != itemData) {
                            viewOooO00o.setPressed(false);
                            viewOooO00o.jumpDrawablesToCurrentState();
                        }
                        if (viewOooO00o != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewOooO00o.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewOooO00o);
                            }
                            ((ViewGroup) this.f62582OooOooO).addView(viewOooO00o, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f62775Oooo000) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f62582OooOooO).requestLayout();
        androidx.appcompat.view.menu.OooO oooO2 = this.f62578OooOoO0;
        if (oooO2 != null) {
            ArrayList<androidx.appcompat.view.menu.OooOO0O> actionItems = oooO2.getActionItems();
            int size2 = actionItems.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProvider actionProvider = actionItems.get(i3).f62665OooOoOO;
                if (actionProvider != null) {
                    actionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        androidx.appcompat.view.menu.OooO oooO3 = this.f62578OooOoO0;
        ArrayList<androidx.appcompat.view.menu.OooOO0O> nonActionItems = oooO3 != null ? oooO3.getNonActionItems() : null;
        if (this.f62774Oooo0 && nonActionItems != null) {
            int size3 = nonActionItems.size();
            if (size3 == 1) {
                z2 = !nonActionItems.get(0).f62666OooOoo;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f62775Oooo000 == null) {
                this.f62775Oooo000 = new C21519OooO0Oo(this.f62576OooOo0o);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f62775Oooo000.getParent();
            if (viewGroup3 != this.f62582OooOooO) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f62775Oooo000);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f62582OooOooO;
                C21519OooO0Oo c21519OooO0Oo = this.f62775Oooo000;
                actionMenuView.getClass();
                ActionMenuView.OooO0OO OooO0Oo2 = ActionMenuView.OooO0Oo();
                OooO0Oo2.f62810OooO00o = true;
                actionMenuView.addView(c21519OooO0Oo, OooO0Oo2);
            }
        } else {
            C21519OooO0Oo c21519OooO0Oo2 = this.f62775Oooo000;
            if (c21519OooO0Oo2 != null) {
                Object parent = c21519OooO0Oo2.getParent();
                Object obj = this.f62582OooOooO;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f62775Oooo000);
                }
            }
        }
        ((ActionMenuView) this.f62582OooOooO).setOverflowReserved(this.f62774Oooo0);
    }
}
