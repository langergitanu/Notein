package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import o0000Oo.AbstractC24220OooO00o;
import o0000Oo.AbstractC24222OooO0OO;

/* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC21560Oooo0oo extends AbstractC24222OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final /* synthetic */ int f63068OoooO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f63069Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Context f63070Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final SearchView f63071Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final SearchableInfo f63072Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f63073Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int f63074Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ColorStateList f63075Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f63076Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f63077Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f63078Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f63079OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f63080OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f63081OoooO0O;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f63082OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f63083OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f63084OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f63085OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f63086OooO0o0;

        public OooO00o(View view) {
            this.f63082OooO00o = (TextView) view.findViewById(R.id.text1);
            this.f63083OooO0O0 = (TextView) view.findViewById(R.id.text2);
            this.f63084OooO0OO = (ImageView) view.findViewById(R.id.icon1);
            this.f63085OooO0Oo = (ImageView) view.findViewById(R.id.icon2);
            this.f63086OooO0o0 = (ImageView) view.findViewById(com.orion.notein.global.R.id.edit_query);
        }
    }

    public ViewOnClickListenerC21560Oooo0oo(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f81453OooOo = true;
        this.f81456OooOoO0 = null;
        this.f81454OooOo0o = false;
        this.f81455OooOoO = -1;
        this.f81457OooOoOO = new AbstractC24220OooO00o.C19606OooO00o(this);
        this.f81459OooOoo0 = new AbstractC24220OooO00o.OooO0O0(this);
        this.f81464OooOooo = suggestionRowLayout;
        this.f81463OooOooO = suggestionRowLayout;
        this.f81465Oooo000 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f63076Oooo0o0 = 1;
        this.f63077Oooo0oO = -1;
        this.f63078Oooo0oo = -1;
        this.f63069Oooo = -1;
        this.f63080OoooO00 = -1;
        this.f63079OoooO0 = -1;
        this.f63081OoooO0O = -1;
        this.f63071Oooo00O = searchView;
        this.f63072Oooo00o = searchableInfo;
        this.f63074Oooo0OO = searchView.getSuggestionCommitIconResId();
        this.f63070Oooo0 = context;
        this.f63073Oooo0O0 = weakHashMap;
    }

    public static String OooO(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    @Override // o0000Oo.AbstractC24220OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(View view, Cursor cursor) {
        int i;
        Drawable drawableOooO0oO;
        ActivityInfo activityInfo;
        int iconResource;
        CharSequence charSequenceOooO;
        OooO00o oooO00o = (OooO00o) view.getTag();
        int i2 = this.f63081OoooO0O;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = oooO00o.f63082OooO00o;
        if (textView != null) {
            String strOooO = OooO(cursor, this.f63077Oooo0oO);
            textView.setText(strOooO);
            if (TextUtils.isEmpty(strOooO)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f63070Oooo0;
        TextView textView2 = oooO00o.f63083OooO0O0;
        if (textView2 != null) {
            String strOooO2 = OooO(cursor, this.f63069Oooo);
            if (strOooO2 != null) {
                if (this.f63075Oooo0o == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(com.orion.notein.global.R.attr.textColorSearchUrl, typedValue, true);
                    this.f63075Oooo0o = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strOooO2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f63075Oooo0o, null), 0, strOooO2.length(), 33);
                charSequenceOooO = spannableString;
            } else {
                charSequenceOooO = OooO(cursor, this.f63078Oooo0oo);
            }
            if (TextUtils.isEmpty(charSequenceOooO)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceOooO);
            if (TextUtils.isEmpty(charSequenceOooO)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = oooO00o.f63084OooO0OO;
        if (imageView != null) {
            int i4 = this.f63080OoooO00;
            if (i4 == -1) {
                drawableOooO0oO = null;
            } else {
                drawableOooO0oO = OooO0oO(cursor.getString(i4));
                if (drawableOooO0oO == null) {
                    ComponentName searchActivity = this.f63072Oooo00o.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f63073Oooo0O0;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = weakHashMap.get(strFlattenToShortString);
                        drawableOooO0oO = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(iconResource, "Invalid icon resource ", " for ");
                                sbOooO0OO.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", sbOooO0OO.toString());
                                drawableOooO0oO = null;
                                weakHashMap.put(strFlattenToShortString, drawableOooO0oO == null ? null : drawableOooO0oO.getConstantState());
                            } else {
                                drawableOooO0oO = drawable;
                                weakHashMap.put(strFlattenToShortString, drawableOooO0oO == null ? null : drawableOooO0oO.getConstantState());
                            }
                        } else {
                            drawableOooO0oO = null;
                            weakHashMap.put(strFlattenToShortString, drawableOooO0oO == null ? null : drawableOooO0oO.getConstantState());
                        }
                    }
                    if (drawableOooO0oO == null) {
                        drawableOooO0oO = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableOooO0oO);
            if (drawableOooO0oO == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableOooO0oO.setVisible(false, false);
                drawableOooO0oO.setVisible(true, false);
            }
        }
        ImageView imageView2 = oooO00o.f63085OooO0Oo;
        if (imageView2 == null) {
            i = 1;
        } else {
            int i5 = this.f63079OoooO0;
            Drawable drawableOooO0oO2 = i5 == -1 ? null : OooO0oO(cursor.getString(i5));
            imageView2.setImageDrawable(drawableOooO0oO2);
            if (drawableOooO0oO2 == null) {
                imageView2.setVisibility(8);
                i = 1;
            } else {
                imageView2.setVisibility(0);
                drawableOooO0oO2.setVisible(false, false);
                i = 1;
                drawableOooO0oO2.setVisible(true, false);
            }
        }
        int i6 = this.f63076Oooo0o0;
        ImageView imageView3 = oooO00o.f63086OooO0o0;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // o0000Oo.AbstractC24220OooO00o
    public final void OooO0OO(Cursor cursor) {
        try {
            super.OooO0OO(cursor);
            if (cursor != null) {
                this.f63077Oooo0oO = cursor.getColumnIndex("suggest_text_1");
                this.f63078Oooo0oo = cursor.getColumnIndex("suggest_text_2");
                this.f63069Oooo = cursor.getColumnIndex("suggest_text_2_url");
                this.f63080OoooO00 = cursor.getColumnIndex("suggest_icon_1");
                this.f63079OoooO0 = cursor.getColumnIndex("suggest_icon_2");
                this.f63081OoooO0O = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // o0000Oo.AbstractC24220OooO00o
    public final String OooO0Oo(Cursor cursor) {
        String strOooO;
        String strOooO2;
        if (cursor == null) {
            return null;
        }
        String strOooO3 = OooO(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strOooO3 != null) {
            return strOooO3;
        }
        SearchableInfo searchableInfo = this.f63072Oooo00o;
        if (searchableInfo.shouldRewriteQueryFromData() && (strOooO2 = OooO(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strOooO2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strOooO = OooO(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strOooO;
    }

    public final Drawable OooO0o(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.f63070Oooo0.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "No package found for authority: "));
        }
    }

    @Override // o0000Oo.AbstractC24220OooO00o
    public final View OooO0o0(ViewGroup viewGroup) {
        View viewInflate = this.f81465Oooo000.inflate(this.f81463OooOooO, viewGroup, false);
        viewInflate.setTag(new OooO00o(viewInflate));
        ((ImageView) viewInflate.findViewById(com.orion.notein.global.R.id.edit_query)).setImageResource(this.f63074Oooo0OO);
        return viewInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable OooO0oO(String str) {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f63073Oooo0O0;
        Context context = this.f63070Oooo0;
        Drawable drawableOooO0o = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = ContextCompat.getDrawable(context, i);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableOooO0o = OooO0o(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableOooO0o = drawableCreateFromStream;
                        } finally {
                        }
                    }
                } catch (FileNotFoundException e2) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
                    if (drawableOooO0o != null) {
                        weakHashMap.put(str, drawableOooO0o.getConstantState());
                    }
                    return drawableOooO0o;
                }
                if (drawableOooO0o != null) {
                }
            }
        }
        return drawableOooO0o;
    }

    public final Cursor OooO0oo(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f63070Oooo0.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // o0000Oo.AbstractC24220OooO00o, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f81465Oooo000.inflate(this.f81464OooOooo, viewGroup, false);
            if (viewInflate != null) {
                ((OooO00o) viewInflate.getTag()).f63082OooO00o.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // o0000Oo.AbstractC24220OooO00o, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewOooO0o0 = OooO0o0(viewGroup);
            ((OooO00o) viewOooO0o0.getTag()).f63082OooO00o.setText(e.toString());
            return viewOooO0o0;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f81456OooOoO0;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f81456OooOoO0;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f63071Oooo00O.OooOO0((CharSequence) tag);
        }
    }
}
