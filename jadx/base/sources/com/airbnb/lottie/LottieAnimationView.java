package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import o00O0oOO.C24946OooO0Oo;
import o00O0ooo.C24976OooO00o;
import o00O0ooo.C24977OooO0O0;
import o00O0ooo.C24979OooO0Oo;
import o00O0ooo.C24980OooO0o0;
import o00O0ooo.EnumC24978OooO0OO;
import o00OO00O.C24983OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f66749OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC22149OooOo0O<Throwable> f66750OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f66751OooOoO0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f66752OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f66753OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public String f66754OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f66755OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f66756OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f66757OooOoo0;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f66753OooOo0o = parcel.readString();
                savedState.f66752OooOo = parcel.readFloat();
                savedState.f66755OooOoO0 = parcel.readInt() == 1;
                savedState.f66754OooOoO = parcel.readString();
                savedState.f66756OooOoOO = parcel.readInt();
                savedState.f66757OooOoo0 = parcel.readInt();
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
            parcel.writeString(this.f66753OooOo0o);
            parcel.writeFloat(this.f66752OooOo);
            parcel.writeInt(this.f66755OooOoO0 ? 1 : 0);
            parcel.writeString(this.f66754OooOoO);
            parcel.writeInt(this.f66756OooOoOO);
            parcel.writeInt(this.f66757OooOoo0);
        }
    }

    private void setCompositionTask(C22152OooOoO0<C22142OooO0oo> c22152OooOoO0) {
        throw null;
    }

    public OooO00o getAsyncUpdates() {
        throw null;
    }

    public boolean getAsyncUpdatesEnabled() {
        throw null;
    }

    public boolean getClipToCompositionBounds() {
        throw null;
    }

    public C22142OooO0oo getComposition() {
        return null;
    }

    public long getDuration() {
        return 0L;
    }

    public int getFrame() {
        throw null;
    }

    public String getImageAssetsFolder() {
        throw null;
    }

    public boolean getMaintainOriginalImageBounds() {
        throw null;
    }

    public float getMaxFrame() {
        throw null;
    }

    public float getMinFrame() {
        throw null;
    }

    public C22153OooOoOO getPerformanceTracker() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public EnumC22155OooOoo0 getRenderMode() {
        throw null;
    }

    public int getRepeatCount() {
        throw null;
    }

    public int getRepeatMode() {
        throw null;
    }

    public float getSpeed() {
        throw null;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof OooOo00) {
            boolean z = ((OooOo00) drawable).f66805OooOoOO;
            EnumC22155OooOoo0 enumC22155OooOoo0 = EnumC22155OooOoo0.f66820OooOo;
            if ((z ? enumC22155OooOoo0 : EnumC22155OooOoo0.f66821OooOo0o) == enumC22155OooOoo0) {
                throw null;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (getDrawable() == null) {
            super.invalidateDrawable(null);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        isInEditMode();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f66749OooOo = savedState.f66753OooOo0o;
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState()).f66753OooOo0o = this.f66749OooOo;
        throw null;
    }

    public void setAnimation(final int i) {
        C22152OooOoO0<C22142OooO0oo> c22152OooOoO0OooO00o;
        final String str = null;
        this.f66749OooOo = null;
        if (isInEditMode()) {
            c22152OooOoO0OooO00o = new C22152OooOoO0<>(new Callable() { // from class: com.airbnb.lottie.OooO0oO
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f66768OooOo0o;
                    boolean z = lottieAnimationView.f66751OooOoO0;
                    int i2 = i;
                    if (!z) {
                        return C22146OooOOo0.OooO0o0(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return C22146OooOOo0.OooO0o0(context, i2, C22146OooOOo0.OooO(context, i2));
                }
            }, true);
        } else if (this.f66751OooOoO0) {
            Context context = getContext();
            final String strOooO = C22146OooOOo0.OooO(context, i);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            c22152OooOoO0OooO00o = C22146OooOOo0.OooO00o(strOooO, new Callable() { // from class: com.airbnb.lottie.OooOOOo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return C22146OooOOo0.OooO0o0(context2, i, strOooO);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = C22146OooOOo0.f66792OooO00o;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            c22152OooOoO0OooO00o = C22146OooOOo0.OooO00o(null, new Callable() { // from class: com.airbnb.lottie.OooOOOo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return C22146OooOOo0.OooO0o0(context22, i, str);
                }
            }, null);
        }
        setCompositionTask(c22152OooOoO0OooO00o);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(C22146OooOOo0.OooO00o(null, new Callable() { // from class: com.airbnb.lottie.OooOO0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C22146OooOOo0.OooO0OO(byteArrayInputStream, null);
            }
        }, new OooOO0O(byteArrayInputStream, 0)));
    }

    public void setAnimationFromUrl(final String str) {
        C22152OooOoO0<C22142OooO0oo> c22152OooOoO0OooO00o;
        final String str2 = null;
        if (this.f66751OooOoO0) {
            final Context context = getContext();
            HashMap map = C22146OooOOo0.f66792OooO00o;
            final String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("url_", str);
            c22152OooOoO0OooO00o = C22146OooOOo0.OooO00o(strOooO00o, new Callable() { // from class: com.airbnb.lottie.OooO
                /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    C22142OooO0oo c22142OooO0oo;
                    C22150OooOo0o<C22142OooO0oo> c22150OooOo0o;
                    C22150OooOo0o<C22142OooO0oo> c22150OooOo0o2;
                    C24976OooO00o c24976OooO00oOooO00o;
                    HttpURLConnection httpURLConnection;
                    C22142OooO0oo c22142OooO0oo2;
                    Pair pair;
                    File file;
                    EnumC24978OooO0OO enumC24978OooO0OO;
                    C24979OooO0Oo c24979OooO0Oo;
                    Context context2 = context;
                    String str3 = str;
                    String str4 = strOooO00o;
                    C24980OooO0o0 c24980OooO0o0 = C22140OooO0o0.f66765OooO00o;
                    if (c24980OooO0o0 == null) {
                        synchronized (C24980OooO0o0.class) {
                            try {
                                c24980OooO0o0 = C22140OooO0o0.f66765OooO00o;
                                if (c24980OooO0o0 == null) {
                                    Context applicationContext = context2.getApplicationContext();
                                    C24979OooO0Oo c24979OooO0Oo2 = C22140OooO0o0.f66766OooO0O0;
                                    if (c24979OooO0Oo2 == null) {
                                        synchronized (C24979OooO0Oo.class) {
                                            c24979OooO0Oo = C22140OooO0o0.f66766OooO0O0;
                                            if (c24979OooO0Oo == null) {
                                                c24979OooO0Oo = new C24979OooO0Oo(new C22139OooO0Oo(applicationContext));
                                                C22140OooO0o0.f66766OooO0O0 = c24979OooO0Oo;
                                            }
                                        }
                                        c24979OooO0Oo2 = c24979OooO0Oo;
                                    }
                                    c24980OooO0o0 = new C24980OooO0o0(c24979OooO0Oo2, new C24977OooO0O0());
                                    C22140OooO0o0.f66765OooO00o = c24980OooO0o0;
                                }
                            } catch (Throwable th) {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    EnumC24978OooO0OO enumC24978OooO0OO2 = EnumC24978OooO0OO.ZIP;
                    boolean z = false;
                    AutoCloseable autoCloseable = null;
                    if (str4 != null) {
                        C24979OooO0Oo c24979OooO0Oo3 = c24980OooO0o0.f84711OooO00o;
                        try {
                            File fileOooO0O0 = c24979OooO0Oo3.OooO0O0();
                            enumC24978OooO0OO = EnumC24978OooO0OO.JSON;
                            file = new File(fileOooO0O0, C24979OooO0Oo.OooO00o(str3, enumC24978OooO0OO, false));
                            if (!file.exists()) {
                                file = new File(c24979OooO0Oo3.OooO0O0(), C24979OooO0Oo.OooO00o(str3, enumC24978OooO0OO2, false));
                                if (!file.exists()) {
                                    file = null;
                                }
                            }
                        } catch (FileNotFoundException unused) {
                        }
                        if (file == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            if (file.getAbsolutePath().endsWith(".zip")) {
                                enumC24978OooO0OO = enumC24978OooO0OO2;
                            }
                            file.getAbsolutePath();
                            C24983OooO0Oo.OooO00o();
                            pair = new Pair(enumC24978OooO0OO, fileInputStream);
                        }
                        if (pair == null) {
                            c22142OooO0oo = null;
                        } else {
                            EnumC24978OooO0OO enumC24978OooO0OO3 = (EnumC24978OooO0OO) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            C22142OooO0oo c22142OooO0oo3 = (enumC24978OooO0OO3 == enumC24978OooO0OO2 ? C22146OooOOo0.OooO0o(context2, new ZipInputStream(inputStream), str4) : C22146OooOOo0.OooO0OO(inputStream, str4)).f66812OooO00o;
                            if (c22142OooO0oo3 != null) {
                                c22142OooO0oo = c22142OooO0oo3;
                            }
                        }
                    }
                    if (c22142OooO0oo != null) {
                        c22150OooOo0o2 = new C22150OooOo0o<>(c22142OooO0oo);
                    } else {
                        C24983OooO0Oo.OooO00o();
                        C24983OooO0Oo.OooO00o();
                        try {
                            try {
                                c24976OooO00oOooO00o = C24977OooO0O0.OooO00o(str3);
                                httpURLConnection = c24976OooO00oOooO00o.f84705OooOo0o;
                                try {
                                    if (httpURLConnection.getResponseCode() / 100 == 2) {
                                        z = true;
                                    }
                                } catch (IOException unused2) {
                                }
                            } catch (Exception e) {
                                c22150OooOo0o = new C22150OooOo0o<>(e);
                                if (0 != 0) {
                                    try {
                                        autoCloseable.close();
                                    } catch (IOException e2) {
                                        e = e2;
                                        C24983OooO0Oo.OooO0OO("LottieFetchResult close failed ", e);
                                    }
                                }
                            }
                            if (z) {
                                c22150OooOo0o = c24980OooO0o0.OooO00o(context2, str3, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str4);
                                C22142OooO0oo c22142OooO0oo4 = c22150OooOo0o.f66812OooO00o;
                                C24983OooO0Oo.OooO00o();
                                try {
                                    c24976OooO00oOooO00o.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    C24983OooO0Oo.OooO0OO("LottieFetchResult close failed ", e);
                                }
                                c22150OooOo0o2 = c22150OooOo0o;
                            } else {
                                c22150OooOo0o = new C22150OooOo0o<>(new IllegalArgumentException(c24976OooO00oOooO00o.OooO00o()));
                                try {
                                    c24976OooO00oOooO00o.close();
                                } catch (IOException e4) {
                                    e = e4;
                                    C24983OooO0Oo.OooO0OO("LottieFetchResult close failed ", e);
                                }
                                c22150OooOo0o2 = c22150OooOo0o;
                            }
                        } finally {
                        }
                    }
                    if (str4 != null && (c22142OooO0oo2 = c22150OooOo0o2.f66812OooO00o) != null) {
                        C24946OooO0Oo.f84644OooO0O0.f84645OooO00o.put(str4, c22142OooO0oo2);
                    }
                    return c22150OooOo0o2;
                }
            }, null);
        } else {
            final Context context2 = getContext();
            c22152OooOoO0OooO00o = C22146OooOOo0.OooO00o(null, new Callable() { // from class: com.airbnb.lottie.OooO
                /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    C22142OooO0oo c22142OooO0oo;
                    C22150OooOo0o<C22142OooO0oo> c22150OooOo0o;
                    C22150OooOo0o<C22142OooO0oo> c22150OooOo0o2;
                    C24976OooO00o c24976OooO00oOooO00o;
                    HttpURLConnection httpURLConnection;
                    C22142OooO0oo c22142OooO0oo2;
                    Pair pair;
                    File file;
                    EnumC24978OooO0OO enumC24978OooO0OO;
                    C24979OooO0Oo c24979OooO0Oo;
                    Context context22 = context2;
                    String str3 = str;
                    String str4 = str2;
                    C24980OooO0o0 c24980OooO0o0 = C22140OooO0o0.f66765OooO00o;
                    if (c24980OooO0o0 == null) {
                        synchronized (C24980OooO0o0.class) {
                            try {
                                c24980OooO0o0 = C22140OooO0o0.f66765OooO00o;
                                if (c24980OooO0o0 == null) {
                                    Context applicationContext = context22.getApplicationContext();
                                    C24979OooO0Oo c24979OooO0Oo2 = C22140OooO0o0.f66766OooO0O0;
                                    if (c24979OooO0Oo2 == null) {
                                        synchronized (C24979OooO0Oo.class) {
                                            c24979OooO0Oo = C22140OooO0o0.f66766OooO0O0;
                                            if (c24979OooO0Oo == null) {
                                                c24979OooO0Oo = new C24979OooO0Oo(new C22139OooO0Oo(applicationContext));
                                                C22140OooO0o0.f66766OooO0O0 = c24979OooO0Oo;
                                            }
                                        }
                                        c24979OooO0Oo2 = c24979OooO0Oo;
                                    }
                                    c24980OooO0o0 = new C24980OooO0o0(c24979OooO0Oo2, new C24977OooO0O0());
                                    C22140OooO0o0.f66765OooO00o = c24980OooO0o0;
                                }
                            } catch (Throwable th) {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    EnumC24978OooO0OO enumC24978OooO0OO2 = EnumC24978OooO0OO.ZIP;
                    boolean z = false;
                    AutoCloseable autoCloseable = null;
                    if (str4 != null) {
                        C24979OooO0Oo c24979OooO0Oo3 = c24980OooO0o0.f84711OooO00o;
                        try {
                            File fileOooO0O0 = c24979OooO0Oo3.OooO0O0();
                            enumC24978OooO0OO = EnumC24978OooO0OO.JSON;
                            file = new File(fileOooO0O0, C24979OooO0Oo.OooO00o(str3, enumC24978OooO0OO, false));
                            if (!file.exists()) {
                                file = new File(c24979OooO0Oo3.OooO0O0(), C24979OooO0Oo.OooO00o(str3, enumC24978OooO0OO2, false));
                                if (!file.exists()) {
                                    file = null;
                                }
                            }
                        } catch (FileNotFoundException unused) {
                        }
                        if (file == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            if (file.getAbsolutePath().endsWith(".zip")) {
                                enumC24978OooO0OO = enumC24978OooO0OO2;
                            }
                            file.getAbsolutePath();
                            C24983OooO0Oo.OooO00o();
                            pair = new Pair(enumC24978OooO0OO, fileInputStream);
                        }
                        if (pair == null) {
                            c22142OooO0oo = null;
                        } else {
                            EnumC24978OooO0OO enumC24978OooO0OO3 = (EnumC24978OooO0OO) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            C22142OooO0oo c22142OooO0oo3 = (enumC24978OooO0OO3 == enumC24978OooO0OO2 ? C22146OooOOo0.OooO0o(context22, new ZipInputStream(inputStream), str4) : C22146OooOOo0.OooO0OO(inputStream, str4)).f66812OooO00o;
                            if (c22142OooO0oo3 != null) {
                                c22142OooO0oo = c22142OooO0oo3;
                            }
                        }
                    }
                    if (c22142OooO0oo != null) {
                        c22150OooOo0o2 = new C22150OooOo0o<>(c22142OooO0oo);
                    } else {
                        C24983OooO0Oo.OooO00o();
                        C24983OooO0Oo.OooO00o();
                        try {
                            try {
                                c24976OooO00oOooO00o = C24977OooO0O0.OooO00o(str3);
                                httpURLConnection = c24976OooO00oOooO00o.f84705OooOo0o;
                                try {
                                    if (httpURLConnection.getResponseCode() / 100 == 2) {
                                        z = true;
                                    }
                                } catch (IOException unused2) {
                                }
                            } catch (Exception e) {
                                c22150OooOo0o = new C22150OooOo0o<>(e);
                                if (0 != 0) {
                                    try {
                                        autoCloseable.close();
                                    } catch (IOException e2) {
                                        e = e2;
                                        C24983OooO0Oo.OooO0OO("LottieFetchResult close failed ", e);
                                    }
                                }
                            }
                            if (z) {
                                c22150OooOo0o = c24980OooO0o0.OooO00o(context22, str3, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str4);
                                C22142OooO0oo c22142OooO0oo4 = c22150OooOo0o.f66812OooO00o;
                                C24983OooO0Oo.OooO00o();
                                try {
                                    c24976OooO00oOooO00o.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    C24983OooO0Oo.OooO0OO("LottieFetchResult close failed ", e);
                                }
                                c22150OooOo0o2 = c22150OooOo0o;
                            } else {
                                c22150OooOo0o = new C22150OooOo0o<>(new IllegalArgumentException(c24976OooO00oOooO00o.OooO00o()));
                                try {
                                    c24976OooO00oOooO00o.close();
                                } catch (IOException e4) {
                                    e = e4;
                                    C24983OooO0Oo.OooO0OO("LottieFetchResult close failed ", e);
                                }
                                c22150OooOo0o2 = c22150OooOo0o;
                            }
                        } finally {
                        }
                    }
                    if (str4 != null && (c22142OooO0oo2 = c22150OooOo0o2.f66812OooO00o) != null) {
                        C24946OooO0Oo.f84644OooO0O0.f84645OooO00o.put(str4, c22142OooO0oo2);
                    }
                    return c22150OooOo0o2;
                }
            }, null);
        }
        setCompositionTask(c22152OooOoO0OooO00o);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        throw null;
    }

    public void setAsyncUpdates(OooO00o oooO00o) {
        throw null;
    }

    public void setCacheComposition(boolean z) {
        this.f66751OooOoO0 = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        throw null;
    }

    public void setComposition(C22142OooO0oo c22142OooO0oo) {
        throw null;
    }

    public void setDefaultFontFileExtension(String str) {
        throw null;
    }

    public void setFailureListener(InterfaceC22149OooOo0O<Throwable> interfaceC22149OooOo0O) {
        this.f66750OooOo0o = interfaceC22149OooOo0O;
    }

    public void setFallbackResource(int i) {
    }

    public void setFontAssetDelegate(OooO0O0 oooO0O0) {
        throw null;
    }

    public void setFontMap(Map<String, Typeface> map) {
        throw null;
    }

    public void setFrame(int i) {
        throw null;
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        throw null;
    }

    public void setImageAssetDelegate(OooO0OO oooO0OO) {
        throw null;
    }

    public void setImageAssetsFolder(String str) {
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        throw null;
    }

    public void setMaxFrame(int i) {
        throw null;
    }

    public void setMaxProgress(float f) {
        throw null;
    }

    public void setMinAndMaxFrame(String str) {
        throw null;
    }

    public void setMinFrame(int i) {
        throw null;
    }

    public void setMinProgress(float f) {
        throw null;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        throw null;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    public void setRenderMode(EnumC22155OooOoo0 enumC22155OooOoo0) {
        throw null;
    }

    public void setRepeatCount(int i) {
        throw null;
    }

    public void setRepeatMode(int i) {
        throw null;
    }

    public void setSafeMode(boolean z) {
        throw null;
    }

    public void setSpeed(float f) {
        throw null;
    }

    public void setTextDelegate(C22154OooOoo c22154OooOoo) {
        throw null;
    }

    public void setUseCompositionFrameRate(boolean z) {
        throw null;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        drawable.getClass();
        if (drawable instanceof OooOo00) {
            OooOo00 oooOo00 = (OooOo00) drawable;
            o00OO00O.OooO0o oooO0o = oooOo00.f66802OooOo0o;
            if (oooO0o == null ? false : oooO0o.f84755OooOooO) {
                oooOo00.OooO00o();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        throw null;
    }

    public void setMinFrame(String str) {
        throw null;
    }

    public void setAnimation(final String str) {
        C22152OooOoO0<C22142OooO0oo> c22152OooOoO0OooO00o;
        this.f66749OooOo = str;
        if (isInEditMode()) {
            c22152OooOoO0OooO00o = new C22152OooOoO0<>(new Callable() { // from class: com.airbnb.lottie.OooO0o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f66764OooOo0o;
                    boolean z = lottieAnimationView.f66751OooOoO0;
                    String str2 = str;
                    if (!z) {
                        return C22146OooOOo0.OooO0O0(lottieAnimationView.getContext(), str2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    HashMap map = C22146OooOOo0.f66792OooO00o;
                    return C22146OooOOo0.OooO0O0(context, str2, "asset_" + str2);
                }
            }, true);
        } else {
            final String str2 = null;
            if (this.f66751OooOoO0) {
                Context context = getContext();
                HashMap map = C22146OooOOo0.f66792OooO00o;
                final String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("asset_", str);
                final Context applicationContext = context.getApplicationContext();
                c22152OooOoO0OooO00o = C22146OooOOo0.OooO00o(strOooO00o, new Callable() { // from class: com.airbnb.lottie.OooOO0o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C22146OooOOo0.OooO0O0(applicationContext, str, strOooO00o);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap map2 = C22146OooOOo0.f66792OooO00o;
                final Context applicationContext2 = context2.getApplicationContext();
                c22152OooOoO0OooO00o = C22146OooOOo0.OooO00o(null, new Callable() { // from class: com.airbnb.lottie.OooOO0o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C22146OooOOo0.OooO0O0(applicationContext2, str, str2);
                    }
                }, null);
            }
        }
        setCompositionTask(c22152OooOoO0OooO00o);
    }
}
