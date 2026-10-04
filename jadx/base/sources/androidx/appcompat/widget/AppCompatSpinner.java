package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.TintableBackgroundView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[] f62829OooOooo = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f62830OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21526OooO0Oo f62831OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public SpinnerAdapter f62832OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21531OooOOOo f62833OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f62834OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f62835OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO0o f62836OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Rect f62837OooOooO;

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().OooO00o()) {
                appCompatSpinner.f62836OooOoo0.OooO0Oo(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static final class OooO0O0 {
        public static void OooO00o(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (ObjectsCompat.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class OooO0OO implements OooO0o, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C21523OooO0Oo f62839OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public DialogInterfaceC21484OooO0oO f62840OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public CharSequence f62842OooOoO0;

        public OooO0OO() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooO(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final boolean OooO00o() {
            DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oO = this.f62840OooOo0o;
            if (dialogInterfaceC21484OooO0oO != null) {
                return dialogInterfaceC21484OooO0oO.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooO0O0(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooO0OO(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooO0Oo(int i, int i2) {
            if (this.f62839OooOo == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            DialogInterfaceC21484OooO0oO.OooO00o oooO00o = new DialogInterfaceC21484OooO0oO.OooO00o(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f62842OooOoO0;
            if (charSequence != null) {
                oooO00o.setTitle(charSequence);
            }
            DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = oooO00o.setSingleChoiceItems(this.f62839OooOo, appCompatSpinner.getSelectedItemPosition(), this).create();
            this.f62840OooOo0o = dialogInterfaceC21484OooO0oOCreate;
            AlertController.RecycleListView recycleListView = dialogInterfaceC21484OooO0oOCreate.f62437OooOo0o.f62252OooO0oO;
            recycleListView.setTextDirection(i);
            recycleListView.setTextAlignment(i2);
            this.f62840OooOo0o.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final int OooO0o0() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final int OooO0oO() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final CharSequence OooOO0() {
            return this.f62842OooOoO0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooOO0O(CharSequence charSequence) {
            this.f62842OooOoO0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooOOO0(ListAdapter listAdapter) {
            this.f62839OooOo = (C21523OooO0Oo) listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void dismiss() {
            DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oO = this.f62840OooOo0o;
            if (dialogInterfaceC21484OooO0oO != null) {
                dialogInterfaceC21484OooO0oO.dismiss();
                this.f62840OooOo0o = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final Drawable getBackground() {
            return null;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i, this.f62839OooOo.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$OooO0Oo, reason: case insensitive filesystem */
    public static class C21523OooO0Oo implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public ListAdapter f62843OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public SpinnerAdapter f62844OooOo0o;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f62843OooOo;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f62844OooOo0o;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f62844OooOo0o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f62844OooOo0o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f62844OooOo0o;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f62844OooOo0o;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f62843OooOo;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f62844OooOo0o;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f62844OooOo0o;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public interface OooO0o {
        void OooO(int i);

        boolean OooO00o();

        void OooO0O0(int i);

        void OooO0OO(int i);

        void OooO0Oo(int i, int i2);

        int OooO0o0();

        int OooO0oO();

        CharSequence OooOO0();

        void OooOO0O(CharSequence charSequence);

        void OooOOO0(ListAdapter listAdapter);

        void dismiss();

        Drawable getBackground();

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$OooO0o0, reason: case insensitive filesystem */
    public class C21524OooO0o0 extends Oooo0 implements OooO0o {

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public CharSequence f62845OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public ListAdapter f62846OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final Rect f62847OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public int f62848Ooooo00;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$OooO0o0$OooO00o */
        public class OooO00o implements AdapterView.OnItemClickListener {
            public OooO00o() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C21524OooO0o0 c21524OooO0o0 = C21524OooO0o0.this;
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i, c21524OooO0o0.f62846OoooOoO.getItemId(i));
                }
                c21524OooO0o0.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$OooO0o0$OooO0O0 */
        public class OooO0O0 implements ViewTreeObserver.OnGlobalLayoutListener {
            public OooO0O0() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C21524OooO0o0 c21524OooO0o0 = C21524OooO0o0.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                c21524OooO0o0.getClass();
                if (!appCompatSpinner.isAttachedToWindow() || !appCompatSpinner.getGlobalVisibleRect(c21524OooO0o0.f62847OoooOoo)) {
                    c21524OooO0o0.dismiss();
                } else {
                    c21524OooO0o0.OooOOOo();
                    c21524OooO0o0.show();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$OooO0o0$OooO0OO */
        public class OooO0OO implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0O0 f62853OooOo0o;

            public OooO0OO(OooO0O0 oooO0O0) {
                this.f62853OooOo0o = oooO0O0;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f62853OooOo0o);
                }
            }
        }

        public C21524OooO0o0(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f62847OoooOoo = new Rect();
            this.f63024Oooo0OO = AppCompatSpinner.this;
            this.f63033OoooOO0 = true;
            this.f63034o000oOoO.setFocusable(true);
            this.f63026Oooo0o0 = new OooO00o();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooO0OO(int i) {
            this.f62848Ooooo00 = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooO0Oo(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            C21530OooOO0o c21530OooOO0o = this.f63034o000oOoO;
            boolean zIsShowing = c21530OooOO0o.isShowing();
            OooOOOo();
            this.f63034o000oOoO.setInputMethodMode(2);
            show();
            C21546OooOooo c21546OooOooo = this.f63012OooOoO0;
            c21546OooOooo.setChoiceMode(1);
            c21546OooOooo.setTextDirection(i);
            c21546OooOooo.setTextAlignment(i2);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            C21546OooOooo c21546OooOooo2 = this.f63012OooOoO0;
            if (c21530OooOO0o.isShowing() && c21546OooOooo2 != null) {
                c21546OooOooo2.setListSelectionHidden(false);
                c21546OooOooo2.setSelection(selectedItemPosition);
                if (c21546OooOooo2.getChoiceMode() != 0) {
                    c21546OooOooo2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            viewTreeObserver.addOnGlobalLayoutListener(oooO0O0);
            this.f63034o000oOoO.setOnDismissListener(new OooO0OO(oooO0O0));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final CharSequence OooOO0() {
            return this.f62845OoooOo0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooOO0O(CharSequence charSequence) {
            this.f62845OoooOo0 = charSequence;
        }

        @Override // androidx.appcompat.widget.Oooo0, androidx.appcompat.widget.AppCompatSpinner.OooO0o
        public final void OooOOO0(ListAdapter listAdapter) {
            super.OooOOO0(listAdapter);
            this.f62846OoooOoO = listAdapter;
        }

        public final void OooOOOo() {
            int i;
            C21530OooOO0o c21530OooOO0o = this.f63034o000oOoO;
            Drawable background = c21530OooOO0o.getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f62837OooOooO);
                boolean z = C21572Ooooo0o.f63118OooO00o;
                int layoutDirection = appCompatSpinner.getLayoutDirection();
                Rect rect = appCompatSpinner.f62837OooOooO;
                i = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = appCompatSpinner.f62837OooOooO;
                rect2.right = 0;
                rect2.left = 0;
                i = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i2 = appCompatSpinner.f62835OooOoo;
            if (i2 == -2) {
                int iOooO00o = appCompatSpinner.OooO00o((SpinnerAdapter) this.f62846OoooOoO, c21530OooOO0o.getBackground());
                int i3 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = appCompatSpinner.f62837OooOooO;
                int i4 = (i3 - rect3.left) - rect3.right;
                if (iOooO00o > i4) {
                    iOooO00o = i4;
                }
                OooOOOO(Math.max(iOooO00o, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                OooOOOO((width - paddingLeft) - paddingRight);
            } else {
                OooOOOO(i2);
            }
            boolean z2 = C21572Ooooo0o.f63118OooO00o;
            this.f63015OooOoo0 = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f63013OooOoOO) - this.f62848Ooooo00) + i : paddingLeft + this.f62848Ooooo00 + i;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f62854OooOo0o;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f62854OooOo0o = parcel.readByte() != 0;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f62854OooOo0o ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f62837OooOooO = new Rect();
        C21549Oooo.OooO00o(getContext(), this);
        int[] iArr = C20441OooO00o.f58301OooOo0o;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, i, 0);
        this.f62831OooOo0o = new C21526OooO0Oo(this);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f62830OooOo = new OooOO0o.OooO0OO(context, resourceId);
        } else {
            this.f62830OooOo = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f62829OooOooo, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    c21565OoooOO0OooO0o.OooO0oO();
                    this.f62834OooOoOO = true;
                    spinnerAdapter = this.f62832OooOoO;
                    if (spinnerAdapter != null) {
                    }
                    this.f62831OooOo0o.OooO0Oo(attributeSet, i);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            OooO0OO oooO0OO = new OooO0OO();
            this.f62836OooOoo0 = oooO0OO;
            oooO0OO.f62842OooOoO0 = typedArray.getString(2);
        } else if (i2 == 1) {
            C21524OooO0o0 c21524OooO0o0 = new C21524OooO0o0(this.f62830OooOo, attributeSet, i);
            C21565OoooOO0 c21565OoooOO0OooO0o2 = C21565OoooOO0.OooO0o(this.f62830OooOo, attributeSet, iArr, i, 0);
            this.f62835OooOoo = c21565OoooOO0OooO0o2.f63093OooO0O0.getLayoutDimension(3, -2);
            c21524OooO0o0.setBackgroundDrawable(c21565OoooOO0OooO0o2.OooO0O0(1));
            c21524OooO0o0.f62845OoooOo0 = typedArray.getString(2);
            c21565OoooOO0OooO0o2.OooO0oO();
            this.f62836OooOoo0 = c21524OooO0o0;
            this.f62833OooOoO0 = new C21531OooOOOo(this, this, c21524OooO0o0);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.orion.notein.global.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c21565OoooOO0OooO0o.OooO0oO();
        this.f62834OooOoOO = true;
        spinnerAdapter = this.f62832OooOoO;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f62832OooOoO = null;
        }
        this.f62831OooOo0o.OooO0Oo(attributeSet, i);
    }

    public final int OooO00o(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f62837OooOooO;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21526OooO0Oo c21526OooO0Oo = this.f62831OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO00o();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        OooO0o oooO0o = this.f62836OooOoo0;
        return oooO0o != null ? oooO0o.OooO0oO() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        OooO0o oooO0o = this.f62836OooOoo0;
        return oooO0o != null ? oooO0o.OooO0o0() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f62836OooOoo0 != null ? this.f62835OooOoo : super.getDropDownWidth();
    }

    public final OooO0o getInternalPopup() {
        return this.f62836OooOoo0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        OooO0o oooO0o = this.f62836OooOoo0;
        return oooO0o != null ? oooO0o.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f62830OooOo;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        OooO0o oooO0o = this.f62836OooOoo0;
        return oooO0o != null ? oooO0o.OooOO0() : super.getPrompt();
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        C21526OooO0Oo c21526OooO0Oo = this.f62831OooOo0o;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0O0();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21526OooO0Oo c21526OooO0Oo = this.f62831OooOo0o;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0OO();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0o oooO0o = this.f62836OooOoo0;
        if (oooO0o == null || !oooO0o.OooO00o()) {
            return;
        }
        oooO0o.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f62836OooOoo0 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), OooO00o(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f62854OooOo0o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new OooO00o());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        OooO0o oooO0o = this.f62836OooOoo0;
        savedState.f62854OooOo0o = oooO0o != null && oooO0o.OooO00o();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21531OooOOOo c21531OooOOOo = this.f62833OooOoO0;
        if (c21531OooOOOo == null || !c21531OooOOOo.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        OooO0o oooO0o = this.f62836OooOoo0;
        if (oooO0o == null) {
            return super.performClick();
        }
        if (oooO0o.OooO00o()) {
            return true;
        }
        this.f62836OooOoo0.OooO0Oo(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21526OooO0Oo c21526OooO0Oo = this.f62831OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21526OooO0Oo c21526OooO0Oo = this.f62831OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        OooO0o oooO0o = this.f62836OooOoo0;
        if (oooO0o == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            oooO0o.OooO0OO(i);
            oooO0o.OooO(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        OooO0o oooO0o = this.f62836OooOoo0;
        if (oooO0o != null) {
            oooO0o.OooO0O0(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f62836OooOoo0 != null) {
            this.f62835OooOoo = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        OooO0o oooO0o = this.f62836OooOoo0;
        if (oooO0o != null) {
            oooO0o.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(OooO.OooO00o.OooO0OO(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        OooO0o oooO0o = this.f62836OooOoo0;
        if (oooO0o != null) {
            oooO0o.OooOO0O(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21526OooO0Oo c21526OooO0Oo = this.f62831OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0oo(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21526OooO0Oo c21526OooO0Oo = this.f62831OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f62834OooOoOO) {
            this.f62832OooOoO = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        OooO0o oooO0o = this.f62836OooOoo0;
        if (oooO0o != null) {
            Context context = this.f62830OooOo;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C21523OooO0Oo c21523OooO0Oo = new C21523OooO0Oo();
            c21523OooO0Oo.f62844OooOo0o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c21523OooO0Oo.f62843OooOo = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    OooO0O0.OooO00o((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC21563OoooO00) {
                    InterfaceC21563OoooO00 interfaceC21563OoooO00 = (InterfaceC21563OoooO00) spinnerAdapter;
                    if (interfaceC21563OoooO00.getDropDownViewTheme() == null) {
                        interfaceC21563OoooO00.OooO00o();
                    }
                }
            }
            oooO0o.OooOOO0(c21523OooO0Oo);
        }
    }
}
