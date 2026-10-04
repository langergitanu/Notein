package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.aspose.words.WarningType;
import com.orion.notein.global.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o0000Oo.AbstractC24220OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements OooOO0o.OooO0O0 {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final OooOOOO f63121o00O0O;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final View f63122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SearchAutoComplete f63123OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final View f63124OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final View f63125OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ImageView f63126OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ImageView f63127OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ImageView f63128OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ImageView f63129OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final View f63130OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Intent f63131Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int[] f63132Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C21579OooOOOo f63133Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Rect f63134Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final Rect f63135Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int[] f63136Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final ImageView f63137Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f63138Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Drawable f63139Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f63140Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Intent f63141Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public View.OnClickListener f63142OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooOOO0 f63143OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final CharSequence f63144OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View.OnFocusChangeListener f63145OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f63146OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public AbstractC24220OooO00o f63147OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f63148OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public CharSequence f63149OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f63150OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f63151OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f63152Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f63153Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f63154OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public CharSequence f63155OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f63156OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public SearchableInfo f63157Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f63158Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public Bundle f63159OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final OooO0O0 f63160Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f63161o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final OooO0OO f63162o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f63163ooOO;

    public class OooO implements AdapterView.OnItemClickListener {
        public OooO() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.OooO0oo(i);
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f63123OooOo0o.getText();
            searchView.f63155OooooOO = text;
            boolean zIsEmpty = TextUtils.isEmpty(text);
            searchView.OooOOOo(!zIsEmpty);
            int i4 = 8;
            if (searchView.f63153Ooooo0o && !searchView.f63161o000oOoO && zIsEmpty) {
                searchView.f63128OooOoo0.setVisibility(8);
                i4 = 0;
            }
            searchView.f63129OooOooO.setVisibility(i4);
            searchView.OooOO0o();
            searchView.OooOOOO();
            if (searchView.f63143OoooO0 != null && !TextUtils.equals(charSequence, searchView.f63154OooooO0)) {
                searchView.f63143OoooO0.OooO00o(charSequence.toString());
            }
            searchView.f63154OooooO0 = charSequence.toString();
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.OooOOO0();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC24220OooO00o abstractC24220OooO00o = SearchView.this.f63147OoooOOO;
            if (abstractC24220OooO00o instanceof ViewOnClickListenerC21560Oooo0oo) {
                abstractC24220OooO00o.OooO0OO(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$OooO0Oo, reason: case insensitive filesystem */
    public final class ViewOnFocusChangeListenerC21574OooO0Oo implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC21574OooO0Oo() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f63145OoooO0O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class OooO0o implements View.OnClickListener {
        public OooO0o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f63126OooOoOO;
            SearchAutoComplete searchAutoComplete = searchView.f63123OooOo0o;
            if (view == imageView) {
                searchView.OooOOo0(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f63142OoooO;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.f63127OooOoo) {
                searchView.OooO0oO();
                return;
            }
            if (view == searchView.f63128OooOoo0) {
                searchView.OooOO0O();
                return;
            }
            if (view != searchView.f63129OooOooO) {
                if (view == searchAutoComplete) {
                    searchView.OooO0o();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f63157Oooooo;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.OooO0o0(searchView.f63131Oooo, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f63141Oooo0oo);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$OooO0o0, reason: case insensitive filesystem */
    public final class ViewOnLayoutChangeListenerC21575OooO0o0 implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC21575OooO0o0() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            View view2 = searchView.f63130OooOooo;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f63125OooOoO0.getPaddingLeft();
                Rect rect = new Rect();
                boolean z = C21572Ooooo0o.f63118OooO00o;
                boolean z2 = searchView.getLayoutDirection() == 1;
                int dimensionPixelSize = searchView.f63146OoooOO0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                SearchAutoComplete searchAutoComplete = searchView.f63123OooOo0o;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(z2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$OooO0oO, reason: case insensitive filesystem */
    public class ViewOnKeyListenerC21576OooO0oO implements View.OnKeyListener {
        public ViewOnKeyListenerC21576OooO0oO() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f63157Oooooo != null) {
                SearchAutoComplete searchAutoComplete = searchView.f63123OooOo0o;
                if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                    if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                        view.cancelLongPress();
                        searchView.getContext().startActivity(searchView.OooO0Oo(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                        return true;
                    }
                } else if (searchView.f63157Oooooo != null && searchView.f63147OoooOOO != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i == 66 || i == 84 || i == 61) {
                        searchView.OooO0oo(searchAutoComplete.getListSelection());
                        return true;
                    }
                    if (i == 21 || i == 22) {
                        searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
                        searchAutoComplete.setListSelection(0);
                        searchAutoComplete.clearListSelection();
                        searchAutoComplete.OooO00o();
                        return true;
                    }
                    if (i == 19) {
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$OooO0oo, reason: case insensitive filesystem */
    public class C21577OooO0oo implements TextView.OnEditorActionListener {
        public C21577OooO0oo() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.OooOO0O();
            return true;
        }
    }

    public class OooOO0 implements AdapterView.OnItemSelectedListener {
        public OooOO0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.OooO(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class OooOO0O {
        public static void OooO00o(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void OooO0O0(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$OooOO0o, reason: case insensitive filesystem */
    public interface InterfaceC21578OooOO0o {
    }

    public interface OooOOO {
    }

    public interface OooOOO0 {
        boolean OooO00o(String str);

        boolean OooO0O0();
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Method f63174OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Method f63175OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Method f63176OooO0OO;

        public static void OooO00o() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$OooOOOo, reason: case insensitive filesystem */
    public static class C21579OooOOOo extends TouchDelegate {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f63177OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Rect f63178OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Rect f63179OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Rect f63180OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f63181OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f63182OooO0o0;

        public C21579OooOOOo(View view, Rect rect, Rect rect2) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f63182OooO0o0 = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f63178OooO0O0 = rect3;
            Rect rect4 = new Rect();
            this.f63180OooO0Oo = rect4;
            Rect rect5 = new Rect();
            this.f63179OooO0OO = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.f63177OooO00o = view;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f63181OooO0o;
                    if (z2 && !this.f63180OooO0Oo.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f63181OooO0o;
                        this.f63181OooO0o = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f63178OooO0O0.contains(x, y)) {
                this.f63181OooO0o = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            Rect rect = this.f63179OooO0OO;
            View view = this.f63177OooO00o;
            if (!z || rect.contains(x, y)) {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f63183OooOo0o;

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
            this.f63183OooOo0o = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, "}", this.f63183OooOo0o);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f63183OooOo0o));
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public SearchView f63184OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f63185OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final OooO00o f63186OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f63187OooOoO0;

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f63187OooOoO0) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f63187OooOoO0 = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.f63186OooOoO = new OooO00o();
            this.f63185OooOo0o = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void OooO00o() {
            if (Build.VERSION.SDK_INT >= 29) {
                OooOO0O.OooO0O0(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            OooOOOO oooOOOO = SearchView.f63121o00O0O;
            oooOOOO.getClass();
            OooOOOO.OooO00o();
            Method method = oooOOOO.f63176OooO0OO;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f63185OooOo0o <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f63187OooOoO0) {
                OooO00o oooO00o = this.f63186OooOoO;
                removeCallbacks(oooO00o);
                post(oooO00o);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f63184OooOo;
            searchView.OooOOo0(searchView.f63161o000oOoO);
            searchView.post(searchView.f63160Ooooooo);
            if (searchView.f63123OooOo0o.hasFocus()) {
                searchView.OooO0o();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f63184OooOo.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f63184OooOo.hasFocus() && getVisibility() == 0) {
                this.f63187OooOoO0 = true;
                Context context = getContext();
                OooOOOO oooOOOO = SearchView.f63121o00O0O;
                if (context.getResources().getConfiguration().orientation == 2) {
                    OooO00o();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            OooO00o oooO00o = this.f63186OooOoO;
            if (!z) {
                this.f63187OooOoO0 = false;
                removeCallbacks(oooO00o);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f63187OooOoO0 = true;
                    return;
                }
                this.f63187OooOoO0 = false;
                removeCallbacks(oooO00o);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f63184OooOo = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f63185OooOo0o = i;
        }
    }

    static {
        OooOOOO oooOOOO = null;
        if (Build.VERSION.SDK_INT < 29) {
            OooOOOO oooOOOO2 = new OooOOOO();
            oooOOOO2.f63174OooO00o = null;
            oooOOOO2.f63175OooO0O0 = null;
            oooOOOO2.f63176OooO0OO = null;
            OooOOOO.OooO00o();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                oooOOOO2.f63174OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                oooOOOO2.f63175OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                oooOOOO2.f63176OooO0OO = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            oooOOOO = oooOOOO2;
        }
        f63121o00O0O = oooOOOO;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.searchViewStyle);
        this.f63134Oooo00O = new Rect();
        this.f63135Oooo00o = new Rect();
        this.f63132Oooo0 = new int[2];
        this.f63136Oooo0O0 = new int[2];
        this.f63160Ooooooo = new OooO0O0();
        this.f63162o0OoOo0 = new OooO0OO();
        this.f63163ooOO = new WeakHashMap<>();
        OooO0o oooO0o = new OooO0o();
        ViewOnKeyListenerC21576OooO0oO viewOnKeyListenerC21576OooO0oO = new ViewOnKeyListenerC21576OooO0oO();
        C21577OooO0oo c21577OooO0oo = new C21577OooO0oo();
        OooO oooO = new OooO();
        OooOO0 oooOO02 = new OooOO0();
        OooO00o oooO00o = new OooO00o();
        int[] iArr = C20441OooO00o.f58300OooOo0O;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, R.attr.searchViewStyle, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, R.attr.searchViewStyle, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        layoutInflaterFrom.inflate(typedArray.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f63123OooOo0o = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f63122OooOo = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f63125OooOoO0 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f63124OooOoO = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f63126OooOoOO = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f63128OooOoo0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f63127OooOoo = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f63129OooOooO = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f63137Oooo0OO = imageView5;
        ViewCompat.setBackground(viewFindViewById, c21565OoooOO0OooO0o.OooO0O0(20));
        ViewCompat.setBackground(viewFindViewById2, c21565OoooOO0OooO0o.OooO0O0(25));
        imageView.setImageDrawable(c21565OoooOO0OooO0o.OooO0O0(23));
        imageView2.setImageDrawable(c21565OoooOO0OooO0o.OooO0O0(15));
        imageView3.setImageDrawable(c21565OoooOO0OooO0o.OooO0O0(12));
        imageView4.setImageDrawable(c21565OoooOO0OooO0o.OooO0O0(28));
        imageView5.setImageDrawable(c21565OoooOO0OooO0o.OooO0O0(23));
        this.f63139Oooo0o0 = c21565OoooOO0OooO0o.OooO0O0(22);
        C21570OoooOoo.OooO00o(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f63138Oooo0o = typedArray.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f63140Oooo0oO = typedArray.getResourceId(13, 0);
        imageView.setOnClickListener(oooO0o);
        imageView3.setOnClickListener(oooO0o);
        imageView2.setOnClickListener(oooO0o);
        imageView4.setOnClickListener(oooO0o);
        searchAutoComplete.setOnClickListener(oooO0o);
        searchAutoComplete.addTextChangedListener(oooO00o);
        searchAutoComplete.setOnEditorActionListener(c21577OooO0oo);
        searchAutoComplete.setOnItemClickListener(oooO);
        searchAutoComplete.setOnItemSelectedListener(oooOO02);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC21576OooO0oO);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC21574OooO0Oo());
        setIconifiedByDefault(typedArray.getBoolean(18, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f63144OoooO00 = typedArray.getText(14);
        this.f63149OoooOo0 = typedArray.getText(21);
        int i = typedArray.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = typedArray.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(typedArray.getBoolean(1, true));
        c21565OoooOO0OooO0o.OooO0oO();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f63141Oooo0oo = intent;
        intent.addFlags(WarningType.HINT);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f63131Oooo = intent2;
        intent2.addFlags(WarningType.HINT);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f63130OooOooo = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21575OooO0o0());
        }
        OooOOo0(this.f63146OoooOO0);
        OooOOO();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void OooO(int i) {
        Editable text = this.f63123OooOo0o.getText();
        Cursor cursor = this.f63147OoooOOO.f81456OooOoO0;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strOooO0Oo = this.f63147OoooOOO.OooO0Oo(cursor);
        if (strOooO0Oo != null) {
            setQuery(strOooO0Oo);
        } else {
            setQuery(text);
        }
    }

    @Override // OooOO0o.OooO0O0
    public final void OooO00o() {
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f63155OooooOO = "";
        clearFocus();
        OooOOo0(true);
        searchAutoComplete.setImeOptions(this.f63158Oooooo0);
        this.f63156OooooOo = false;
    }

    @Override // OooOO0o.OooO0O0
    public final void OooO0O0() {
        if (this.f63156OooooOo) {
            return;
        }
        this.f63156OooooOo = true;
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f63158Oooooo0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    public final Intent OooO0Oo(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(WarningType.HINT);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f63155OooooOO);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f63159OoooooO;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f63157Oooooo.getSearchActivity());
        return intent;
    }

    public final void OooO0o() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        if (i >= 29) {
            OooOO0O.OooO00o(searchAutoComplete);
            return;
        }
        OooOOOO oooOOOO = f63121o00O0O;
        oooOOOO.getClass();
        OooOOOO.OooO00o();
        Method method = oooOOOO.f63174OooO00o;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oooOOOO.getClass();
        OooOOOO.OooO00o();
        Method method2 = oooOOOO.f63175OooO0O0;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final Intent OooO0o0(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f63159OoooooO;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void OooO0oO() {
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f63146OoooOO0) {
            clearFocus();
            OooOOo0(true);
        }
    }

    public final void OooO0oo(int i) {
        int position;
        String strOooO;
        Cursor cursor = this.f63147OoooOOO.f81456OooOoO0;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentOooO0Oo = null;
            try {
                int i2 = ViewOnClickListenerC21560Oooo0oo.f63068OoooO;
                String strOooO2 = ViewOnClickListenerC21560Oooo0oo.OooO(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strOooO2 == null) {
                    strOooO2 = this.f63157Oooooo.getSuggestIntentAction();
                }
                if (strOooO2 == null) {
                    strOooO2 = "android.intent.action.SEARCH";
                }
                String strOooO3 = ViewOnClickListenerC21560Oooo0oo.OooO(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strOooO3 == null) {
                    strOooO3 = this.f63157Oooooo.getSuggestIntentData();
                }
                if (strOooO3 != null && (strOooO = ViewOnClickListenerC21560Oooo0oo.OooO(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strOooO3 = strOooO3 + "/" + Uri.encode(strOooO);
                }
                intentOooO0Oo = OooO0Oo(strOooO3 == null ? null : Uri.parse(strOooO3), strOooO2, ViewOnClickListenerC21560Oooo0oo.OooO(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC21560Oooo0oo.OooO(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentOooO0Oo != null) {
                try {
                    getContext().startActivity(intentOooO0Oo);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentOooO0Oo, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void OooOO0(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void OooOO0O() {
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OooOOO0 oooOOO0 = this.f63143OoooO0;
        if (oooOOO0 != null) {
            text.toString();
            if (oooOOO0.OooO0O0()) {
                return;
            }
        }
        if (this.f63157Oooooo != null) {
            getContext().startActivity(OooO0Oo(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void OooOO0o() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f63123OooOo0o.getText());
        int i = (!zIsEmpty || (this.f63146OoooOO0 && !this.f63156OooooOo)) ? 0 : 8;
        ImageView imageView = this.f63127OooOoo;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOOO() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.f63146OoooOO0;
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        CharSequence charSequence2 = charSequence;
        if (z) {
            Drawable drawable = this.f63139Oooo0o0;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    public final void OooOOO0() {
        int[] iArr = this.f63123OooOo0o.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f63125OooOoO0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f63124OooOoO.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void OooOOOO() {
        this.f63124OooOoO.setVisibility(((this.f63148OoooOOo || this.f63153Ooooo0o) && !this.f63161o000oOoO && (this.f63128OooOoo0.getVisibility() == 0 || this.f63129OooOooO.getVisibility() == 0)) ? 0 : 8);
    }

    public final void OooOOOo(boolean z) {
        boolean z2 = this.f63148OoooOOo;
        this.f63128OooOoo0.setVisibility((!z2 || !(z2 || this.f63153Ooooo0o) || this.f63161o000oOoO || !hasFocus() || (!z && this.f63153Ooooo0o)) ? 8 : 0);
    }

    public final void OooOOo0(boolean z) {
        this.f63161o000oOoO = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f63123OooOo0o.getText());
        this.f63126OooOoOO.setVisibility(i2);
        OooOOOo(!zIsEmpty);
        this.f63122OooOo.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f63137Oooo0OO;
        imageView.setVisibility((imageView.getDrawable() == null || this.f63146OoooOO0) ? 8 : 0);
        OooOO0o();
        if (this.f63153Ooooo0o && !this.f63161o000oOoO && zIsEmpty) {
            this.f63128OooOoo0.setVisibility(8);
            i = 0;
        }
        this.f63129OooOooO.setVisibility(i);
        OooOOOO();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f63151OoooOoo = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f63151OoooOoo = false;
    }

    public int getImeOptions() {
        return this.f63123OooOo0o.getImeOptions();
    }

    public int getInputType() {
        return this.f63123OooOo0o.getInputType();
    }

    public int getMaxWidth() {
        return this.f63152Ooooo00;
    }

    public CharSequence getQuery() {
        return this.f63123OooOo0o.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f63149OoooOo0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f63157Oooooo;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f63144OoooO00 : getContext().getText(this.f63157Oooooo.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f63140Oooo0oO;
    }

    public int getSuggestionRowLayout() {
        return this.f63138Oooo0o;
    }

    public AbstractC24220OooO00o getSuggestionsAdapter() {
        return this.f63147OoooOOO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f63160Ooooooo);
        post(this.f63162o0OoOo0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int[] iArr = this.f63132Oooo0;
            SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f63136Oooo0O0;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f63134Oooo00O;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f63135Oooo00o;
            rect2.set(i7, 0, i8, i9);
            C21579OooOOOo c21579OooOOOo = this.f63133Oooo000;
            if (c21579OooOOOo == null) {
                C21579OooOOOo c21579OooOOOo2 = new C21579OooOOOo(searchAutoComplete, rect2, rect);
                this.f63133Oooo000 = c21579OooOOOo2;
                setTouchDelegate(c21579OooOOOo2);
            } else {
                c21579OooOOOo.f63178OooO0O0.set(rect2);
                Rect rect3 = c21579OooOOOo.f63180OooO0Oo;
                rect3.set(rect2);
                int i10 = -c21579OooOOOo.f63182OooO0o0;
                rect3.inset(i10, i10);
                c21579OooOOOo.f63179OooO0OO.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f63161o000oOoO) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f63152Ooooo00;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f63152Ooooo00;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f63152Ooooo00) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        OooOOo0(savedState.f63183OooOo0o);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f63183OooOo0o = this.f63161o000oOoO;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f63160Ooooooo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f63151OoooOoo || !isFocusable()) {
            return false;
        }
        if (this.f63161o000oOoO) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f63123OooOo0o.requestFocus(i, rect);
        if (zRequestFocus) {
            OooOOo0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f63159OoooooO = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            OooO0oO();
            return;
        }
        OooOOo0(false);
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f63142OoooO;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f63146OoooOO0 == z) {
            return;
        }
        this.f63146OoooOO0 = z;
        OooOOo0(z);
        OooOOO();
    }

    public void setImeOptions(int i) {
        this.f63123OooOo0o.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f63123OooOo0o.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f63152Ooooo00 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC21578OooOO0o interfaceC21578OooOO0o) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f63145OoooO0O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OooOOO0 oooOOO0) {
        this.f63143OoooO0 = oooOOO0;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f63142OoooO = onClickListener;
    }

    public void setOnSuggestionListener(OooOOO oooOOO) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f63149OoooOo0 = charSequence;
        OooOOO();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f63150OoooOoO = z;
        AbstractC24220OooO00o abstractC24220OooO00o = this.f63147OoooOOO;
        if (abstractC24220OooO00o instanceof ViewOnClickListenerC21560Oooo0oo) {
            ((ViewOnClickListenerC21560Oooo0oo) abstractC24220OooO00o).f63076Oooo0o0 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f63157Oooooo = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.f63123OooOo0o;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f63157Oooooo.getImeOptions());
            int inputType = this.f63157Oooooo.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f63157Oooooo.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AbstractC24220OooO00o abstractC24220OooO00o = this.f63147OoooOOO;
            if (abstractC24220OooO00o != null) {
                abstractC24220OooO00o.OooO0OO(null);
            }
            if (this.f63157Oooooo.getSuggestAuthority() != null) {
                ViewOnClickListenerC21560Oooo0oo viewOnClickListenerC21560Oooo0oo = new ViewOnClickListenerC21560Oooo0oo(getContext(), this, this.f63157Oooooo, this.f63163ooOO);
                this.f63147OoooOOO = viewOnClickListenerC21560Oooo0oo;
                searchAutoComplete.setAdapter(viewOnClickListenerC21560Oooo0oo);
                ((ViewOnClickListenerC21560Oooo0oo) this.f63147OoooOOO).f63076Oooo0o0 = this.f63150OoooOoO ? 2 : 1;
            }
            OooOOO();
        }
        SearchableInfo searchableInfo2 = this.f63157Oooooo;
        if (searchableInfo2 == null || !searchableInfo2.getVoiceSearchEnabled()) {
            z = false;
        } else {
            if (this.f63157Oooooo.getVoiceSearchLaunchWebSearch()) {
                intent = this.f63141Oooo0oo;
            } else if (this.f63157Oooooo.getVoiceSearchLaunchRecognizer()) {
                intent = this.f63131Oooo;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            }
        }
        this.f63153Ooooo0o = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        OooOOo0(this.f63161o000oOoO);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f63148OoooOOo = z;
        OooOOo0(this.f63161o000oOoO);
    }

    public void setSuggestionsAdapter(AbstractC24220OooO00o abstractC24220OooO00o) {
        this.f63147OoooOOO = abstractC24220OooO00o;
        this.f63123OooOo0o.setAdapter(abstractC24220OooO00o);
    }
}
