package androidx.appcompat.app;

import OooO0oo.C20441OooO00o;
import OooOO0o.AbstractC20443OooO00o;
import OooOO0o.C20444OooO0Oo;
import OooOO0o.C20445OooO0o0;
import OooOO0o.WindowCallbackC20447OooO0oo;
import OooOo.C20493Oooo00o;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C21499OooOoo0;
import androidx.appcompat.app.C21502OooOooO;
import androidx.appcompat.view.menu.C21508OooO0oO;
import androidx.appcompat.view.menu.C21508OooO0oO.OooO00o;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C21528OooO0oO;
import androidx.appcompat.widget.C21556Oooo0OO;
import androidx.appcompat.widget.C21565OoooOO0;
import androidx.appcompat.widget.C21571Ooooo00;
import androidx.appcompat.widget.C21572Ooooo0o;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.PermissionChecker;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.material.internal.ViewUtils;
import com.huawei.hms.network.embedded.C18385v2;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatDelegateImpl extends AbstractC21486OooOO0o implements OooO.OooO00o, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooOOO0 f62334Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C21480OooO0oo f62335Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Object f62336Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Context f62337Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Window f62338Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Object f62339Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public androidx.appcompat.app.OooO00o f62340Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public CharSequence f62341Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public OooOO0o.OooO0o f62342Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public androidx.appcompat.widget.OooOo f62343Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO0OO f62344Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public RunnableC21490OooOOo0 f62345OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ActionBarContextView f62346OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public AbstractC20443OooO00o f62347OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public PopupWindow f62348OoooO0O;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f62350OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ViewGroup f62351OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public TextView f62352OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public View f62353OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f62354OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f62355Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f62356Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f62357OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f62358OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f62359OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f62360Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f62361Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public PanelFeatureState[] f62362OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public PanelFeatureState f62363Ooooooo;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public OnBackInvokedCallback f62364o000000;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public OnBackInvokedDispatcher f62365o000OOo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f62367o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f62368o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public Configuration f62369o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final int f62370o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public OooOO0O f62371o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean f62372o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f62373o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public C21497OooOoOO f62374o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public Rect f62375o0OO00O;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f62377o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f62378o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public OooO f62379o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f62380o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f62381o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f62382oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public Rect f62383oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f62384ooOO;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public static final C20493Oooo00o<String, Integer> f62332o000000O = new C20493Oooo00o<>();

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public static final int[] f62333o000000o = {R.attr.windowBackground};

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public static final boolean f62331o00000 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ViewPropertyAnimatorCompat f62349OoooOO0 = null;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final boolean f62366o000oOoO = true;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final OooO00o f62376o0OOO0o = new OooO00o();

    public class OooO extends OooOO0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final PowerManager f62385OooO0OO;

        public OooO(Context context) {
            super();
            this.f62385OooO0OO = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOO0
        public final IntentFilter OooO0O0() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOO0
        public final int OooO0OO() {
            return C21478OooO0o0.OooO00o(this.f62385OooO0OO) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOO0
        public final void OooO0Oo() {
            AppCompatDelegateImpl.this.Oooo00o(true, true);
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f62381o0ooOoO & 1) != 0) {
                appCompatDelegateImpl.Oooo(0);
            }
            if ((appCompatDelegateImpl.f62381o0ooOoO & 4096) != 0) {
                appCompatDelegateImpl.Oooo(108);
            }
            appCompatDelegateImpl.f62380o0ooOOo = false;
            appCompatDelegateImpl.f62381o0ooOoO = 0;
        }
    }

    public class OooO0O0 implements androidx.appcompat.app.OooO0O0 {
    }

    public final class OooO0OO implements OooOOOO.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final boolean OooO00o(androidx.appcompat.view.menu.OooO oooO) {
            Window.Callback callback = AppCompatDelegateImpl.this.f62338Oooo00o.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, oooO);
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final void onCloseMenu(androidx.appcompat.view.menu.OooO oooO, boolean z) {
            AppCompatDelegateImpl.this.Oooo0o0(oooO);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0Oo, reason: case insensitive filesystem */
    public class C21477OooO0Oo implements AbstractC20443OooO00o.InterfaceC18960OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC20443OooO00o.InterfaceC18960OooO00o f62389OooO00o;

        /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0Oo$OooO00o */
        public class OooO00o extends ViewPropertyAnimatorListenerAdapter {
            public OooO00o() {
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void onAnimationEnd(View view) {
                C21477OooO0Oo c21477OooO0Oo = C21477OooO0Oo.this;
                AppCompatDelegateImpl.this.f62346OoooO0.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f62348OoooO0O;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f62346OoooO0.getParent() instanceof View) {
                    ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.f62346OoooO0.getParent());
                }
                AppCompatDelegateImpl.this.f62346OoooO0.OooO0oo();
                AppCompatDelegateImpl.this.f62349OoooOO0.setListener(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f62349OoooOO0 = null;
                ViewCompat.requestApplyInsets(appCompatDelegateImpl2.f62351OoooOOo);
            }
        }

        public C21477OooO0Oo(AbstractC20443OooO00o.InterfaceC18960OooO00o interfaceC18960OooO00o) {
            this.f62389OooO00o = interfaceC18960OooO00o;
        }

        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final boolean OooO00o(AbstractC20443OooO00o abstractC20443OooO00o, MenuItem menuItem) {
            return this.f62389OooO00o.OooO00o(abstractC20443OooO00o, menuItem);
        }

        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final boolean OooO0O0(AbstractC20443OooO00o abstractC20443OooO00o, androidx.appcompat.view.menu.OooO oooO) {
            return this.f62389OooO00o.OooO0O0(abstractC20443OooO00o, oooO);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.app.OooO, java.lang.Object] */
        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final void OooO0OO(AbstractC20443OooO00o abstractC20443OooO00o) {
            this.f62389OooO00o.OooO0OO(abstractC20443OooO00o);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f62348OoooO0O != null) {
                appCompatDelegateImpl.f62338Oooo00o.getDecorView().removeCallbacks(appCompatDelegateImpl.f62345OoooO);
            }
            if (appCompatDelegateImpl.f62346OoooO0 != null) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.f62349OoooOO0;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.cancel();
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(appCompatDelegateImpl.f62346OoooO0).alpha(0.0f);
                appCompatDelegateImpl.f62349OoooOO0 = viewPropertyAnimatorCompatAlpha;
                viewPropertyAnimatorCompatAlpha.setListener(new OooO00o());
            }
            ?? r0 = appCompatDelegateImpl.f62339Oooo0O0;
            if (r0 != 0) {
                r0.onSupportActionModeFinished(appCompatDelegateImpl.f62347OoooO00);
            }
            appCompatDelegateImpl.f62347OoooO00 = null;
            ViewCompat.requestApplyInsets(appCompatDelegateImpl.f62351OoooOOo);
            appCompatDelegateImpl.Ooooo00();
        }

        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final boolean OooO0Oo(AbstractC20443OooO00o abstractC20443OooO00o, Menu menu) {
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.f62351OoooOOo);
            return this.f62389OooO00o.OooO0Oo(abstractC20443OooO00o, menu);
        }
    }

    public static class OooO0o {
        public static void OooO00o(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static LocaleListCompat OooO0O0(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }

        public static void OooO0OO(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }

        public static void OooO0Oo(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0o0, reason: case insensitive filesystem */
    public static class C21478OooO0o0 {
        public static boolean OooO00o(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String OooO0O0(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0oO, reason: case insensitive filesystem */
    public static class C21479OooO0oO {
        public static OnBackInvokedDispatcher OooO00o(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.OooOo] */
        public static OnBackInvokedCallback OooO0O0(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            ?? r0 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.OooOo
                public final void onBackInvoked() {
                    appCompatDelegateImpl.OoooOOO();
                }
            };
            OooOo00.OooO00o(obj).registerOnBackInvokedCallback(1000000, r0);
            return r0;
        }

        public static void OooO0OO(Object obj, Object obj2) {
            OooOo00.OooO00o(obj).unregisterOnBackInvokedCallback(C21491OooOOoo.OooO00o(obj2));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0oo, reason: case insensitive filesystem */
    public class C21480OooO0oo extends WindowCallbackC20447OooO0oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C21499OooOoo0.C21501OooO0o0 f62392OooOo;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f62393OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f62394OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f62395OooOoOO;

        public C21480OooO0oo(Window.Callback callback) {
            super(callback);
        }

        public final void OooO00o(Window.Callback callback) {
            try {
                this.f62394OooOoO0 = true;
                callback.onContentChanged();
            } finally {
                this.f62394OooOoO0 = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z = this.f62393OooOoO;
            Window.Callback callback = this.f58389OooOo0o;
            return z ? callback.dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.Oooo0oo(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.f58389OooOo0o.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.OoooOO0();
                androidx.appcompat.app.OooO00o oooO00o = appCompatDelegateImpl.f62340Oooo0OO;
                if (oooO00o == null || !oooO00o.OooO(keyCode, keyEvent)) {
                    PanelFeatureState panelFeatureState = appCompatDelegateImpl.f62363Ooooooo;
                    if (panelFeatureState == null || !appCompatDelegateImpl.OoooOo0(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                        if (appCompatDelegateImpl.f62363Ooooooo == null) {
                            PanelFeatureState panelFeatureStateOoooO = appCompatDelegateImpl.OoooO(0);
                            appCompatDelegateImpl.OoooOoO(panelFeatureStateOoooO, keyEvent);
                            boolean zOoooOo0 = appCompatDelegateImpl.OoooOo0(panelFeatureStateOoooO, keyEvent.getKeyCode(), keyEvent);
                            panelFeatureStateOoooO.f62414OooOO0O = false;
                            if (zOoooOo0) {
                            }
                        }
                        return false;
                    }
                    PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.f62363Ooooooo;
                    if (panelFeatureState2 != null) {
                        panelFeatureState2.f62415OooOO0o = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f62394OooOoO0) {
                this.f58389OooOo0o.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.OooO)) {
                return this.f58389OooOo0o.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            C21499OooOoo0.C21501OooO0o0 c21501OooO0o0 = this.f62392OooOo;
            if (c21501OooO0o0 != null) {
                View view = i == 0 ? new View(C21499OooOoo0.this.f62474OooO00o.f63100OooO00o.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f58389OooOo0o.onCreatePanelView(i);
        }

        @Override // OooOO0o.WindowCallbackC20447OooO0oo, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.OoooOO0();
                androidx.appcompat.app.OooO00o oooO00o = appCompatDelegateImpl.f62340Oooo0OO;
                if (oooO00o != null) {
                    oooO00o.OooO0OO(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        @Override // OooOO0o.WindowCallbackC20447OooO0oo, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.f62395OooOoOO) {
                this.f58389OooOo0o.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.OoooOO0();
                androidx.appcompat.app.OooO00o oooO00o = appCompatDelegateImpl.f62340Oooo0OO;
                if (oooO00o != null) {
                    oooO00o.OooO0OO(false);
                    return;
                }
                return;
            }
            if (i != 0) {
                appCompatDelegateImpl.getClass();
                return;
            }
            PanelFeatureState panelFeatureStateOoooO = appCompatDelegateImpl.OoooO(i);
            if (panelFeatureStateOoooO.f62417OooOOO0) {
                appCompatDelegateImpl.Oooo0o(panelFeatureStateOoooO, false);
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.OooO oooO = menu instanceof androidx.appcompat.view.menu.OooO ? (androidx.appcompat.view.menu.OooO) menu : null;
            if (i == 0 && oooO == null) {
                return false;
            }
            if (oooO != null) {
                oooO.setOverrideVisibleItems(true);
            }
            C21499OooOoo0.C21501OooO0o0 c21501OooO0o0 = this.f62392OooOo;
            if (c21501OooO0o0 != null && i == 0) {
                C21499OooOoo0 c21499OooOoo0 = C21499OooOoo0.this;
                if (!c21499OooOoo0.f62477OooO0Oo) {
                    c21499OooOoo0.f62474OooO00o.f63110OooOO0o = true;
                    c21499OooOoo0.f62477OooO0Oo = true;
                }
            }
            boolean zOnPreparePanel = this.f58389OooOo0o.onPreparePanel(i, view, menu);
            if (oooO != null) {
                oooO.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // OooOO0o.WindowCallbackC20447OooO0oo, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.OooO oooO = AppCompatDelegateImpl.this.OoooO(0).f62412OooO0oo;
            if (oooO != null) {
                super.onProvideKeyboardShortcuts(list, oooO, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f62366o000oOoO || i != 0) {
                return WindowCallbackC20447OooO0oo.OooO00o.OooO0O0(this.f58389OooOo0o, callback, i);
            }
            C20445OooO0o0.OooO00o oooO00o = new C20445OooO0o0.OooO00o(appCompatDelegateImpl.f62337Oooo00O, callback);
            AbstractC20443OooO00o abstractC20443OooO00oOooo000 = appCompatDelegateImpl.Oooo000(oooO00o);
            if (abstractC20443OooO00oOooo000 != null) {
                return oooO00o.OooO0o0(abstractC20443OooO00oOooo000);
            }
            return null;
        }
    }

    public abstract class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO00o f62397OooO00o;

        public class OooO00o extends BroadcastReceiver {
            public OooO00o() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                OooOO0.this.OooO0Oo();
            }
        }

        public OooOO0() {
        }

        public final void OooO00o() {
            OooO00o oooO00o = this.f62397OooO00o;
            if (oooO00o != null) {
                try {
                    AppCompatDelegateImpl.this.f62337Oooo00O.unregisterReceiver(oooO00o);
                } catch (IllegalArgumentException unused) {
                }
                this.f62397OooO00o = null;
            }
        }

        public abstract IntentFilter OooO0O0();

        public abstract int OooO0OO();

        public abstract void OooO0Oo();

        public final void OooO0o0() {
            OooO00o();
            IntentFilter intentFilterOooO0O0 = OooO0O0();
            if (intentFilterOooO0O0.countActions() == 0) {
                return;
            }
            if (this.f62397OooO00o == null) {
                this.f62397OooO00o = new OooO00o();
            }
            AppCompatDelegateImpl.this.f62337Oooo00O.registerReceiver(this.f62397OooO00o, intentFilterOooO0O0);
        }
    }

    public class OooOO0O extends OooOO0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C21502OooOooO f62400OooO0OO;

        public OooOO0O(C21502OooOooO c21502OooOooO) {
            super();
            this.f62400OooO0OO = c21502OooOooO;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOO0
        public final IntentFilter OooO0O0() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOO0
        public final int OooO0OO() {
            Location location;
            boolean z;
            long j;
            C21502OooOooO c21502OooOooO = this.f62400OooO0OO;
            C21502OooOooO.OooO00o oooO00o = c21502OooOooO.f62491OooO0OO;
            if (oooO00o.f62493OooO0O0 > System.currentTimeMillis()) {
                z = oooO00o.f62492OooO00o;
            } else {
                Context context = c21502OooOooO.f62489OooO00o;
                int iCheckSelfPermission = PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation = null;
                LocationManager locationManager = c21502OooOooO.f62490OooO0O0;
                if (iCheckSelfPermission == 0) {
                    try {
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    location = lastKnownLocation2;
                } else {
                    location = null;
                }
                if (PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                    location = lastKnownLocation;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C21498OooOoo.f62470OooO0Oo == null) {
                        C21498OooOoo.f62470OooO0Oo = new C21498OooOoo();
                    }
                    C21498OooOoo c21498OooOoo = C21498OooOoo.f62470OooO0Oo;
                    c21498OooOoo.OooO00o(jCurrentTimeMillis - C18385v2.f56338j, location.getLatitude(), location.getLongitude());
                    c21498OooOoo.OooO00o(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    z = c21498OooOoo.f62473OooO0OO == 1;
                    long j2 = c21498OooOoo.f62472OooO0O0;
                    long j3 = c21498OooOoo.f62471OooO00o;
                    c21498OooOoo.OooO00o(C18385v2.f56338j + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    long j4 = c21498OooOoo.f62472OooO0O0;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis <= j3) {
                            j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                        }
                        j = j4 + 60000;
                    }
                    oooO00o.f62492OooO00o = z;
                    oooO00o.f62493OooO0O0 = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z = true;
                    }
                }
            }
            return z ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOO0
        public final void OooO0Oo() {
            AppCompatDelegateImpl.this.Oooo00o(true, true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooOO0o, reason: case insensitive filesystem */
    public class C21481OooOO0o extends ContentFrameLayout {
        public C21481OooOO0o(OooOO0o.OooO0OO oooO0OO) {
            super(oooO0OO, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.Oooo0oo(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.Oooo0o(appCompatDelegateImpl.OoooO(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(OooO.OooO00o.OooO0OO(getContext(), i));
        }
    }

    public final class OooOOO0 implements OooOOOO.OooO00o {
        public OooOOO0() {
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final boolean OooO00o(androidx.appcompat.view.menu.OooO oooO) {
            Window.Callback callback;
            if (oooO != oooO.getRootMenu()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f62356Ooooo0o || (callback = appCompatDelegateImpl.f62338Oooo00o.getCallback()) == null || appCompatDelegateImpl.f62368o00Oo0) {
                return true;
            }
            callback.onMenuOpened(108, oooO);
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final void onCloseMenu(androidx.appcompat.view.menu.OooO oooO, boolean z) {
            PanelFeatureState panelFeatureState;
            androidx.appcompat.view.menu.OooO rootMenu = oooO.getRootMenu();
            int i = 0;
            boolean z2 = rootMenu != oooO;
            if (z2) {
                oooO = rootMenu;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.f62362OoooooO;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.f62412OooO0oo == oooO) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                if (!z2) {
                    appCompatDelegateImpl.Oooo0o(panelFeatureState, z);
                } else {
                    appCompatDelegateImpl.Oooo0OO(panelFeatureState.f62405OooO00o, panelFeatureState, rootMenu);
                    appCompatDelegateImpl.Oooo0o(panelFeatureState, true);
                }
            }
        }
    }

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public C21508OooO0oO f62404OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f62405OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f62406OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f62407OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f62408OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public View f62409OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public C21481OooOO0o f62410OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f62411OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO f62412OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public OooOO0o.OooO0OO f62413OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f62414OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f62415OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f62416OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f62417OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f62418OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Bundle f62419OooOOOo;

        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public boolean f62420OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f62421OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public Bundle f62422OooOoO0;

            public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.OooO00o(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.OooO00o(parcel, null);
                }
            }

            public static SavedState OooO00o(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f62421OooOo0o = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f62420OooOo = z;
                if (z) {
                    savedState.f62422OooOoO0 = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f62421OooOo0o);
                parcel.writeInt(this.f62420OooOo ? 1 : 0);
                if (this.f62420OooOo) {
                    parcel.writeBundle(this.f62422OooOoO0);
                }
            }
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.OooO oooO, Object obj) {
        C20493Oooo00o<String, Integer> c20493Oooo00o;
        Integer num;
        ActivityC21485OooO0oo activityC21485OooO0oo = null;
        this.f62370o00o0O = -100;
        this.f62337Oooo00O = context;
        this.f62339Oooo0O0 = oooO;
        this.f62336Oooo000 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof ActivityC21485OooO0oo)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        activityC21485OooO0oo = (ActivityC21485OooO0oo) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (activityC21485OooO0oo != null) {
                this.f62370o00o0O = activityC21485OooO0oo.getDelegate().OooO();
            }
        }
        if (this.f62370o00o0O == -100 && (num = (c20493Oooo00o = f62332o000000O).get(this.f62336Oooo000.getClass().getName())) != null) {
            this.f62370o00o0O = num.intValue();
            c20493Oooo00o.remove(this.f62336Oooo000.getClass().getName());
        }
        if (window != null) {
            Oooo0(window);
        }
        C21528OooO0oO.OooO0Oo();
    }

    public static LocaleListCompat Oooo0O0(Context context) {
        LocaleListCompat localeListCompat;
        LocaleListCompat localeListCompatCreate;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompat = AbstractC21486OooOO0o.f62447OooOoO0) == null) {
            return null;
        }
        LocaleListCompat localeListCompatOooO0O0 = OooO0o.OooO0O0(context.getApplicationContext().getResources().getConfiguration());
        if (localeListCompat.isEmpty()) {
            localeListCompatCreate = LocaleListCompat.getEmptyLocaleList();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < localeListCompatOooO0O0.size() + localeListCompat.size()) {
                Locale locale = i < localeListCompat.size() ? localeListCompat.get(i) : localeListCompatOooO0O0.get(i - localeListCompat.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            localeListCompatCreate = LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return localeListCompatCreate.isEmpty() ? localeListCompatOooO0O0 : localeListCompatCreate;
    }

    public static Configuration Oooo0oO(Context context, int i, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            OooO0o.OooO0Oo(configuration2, localeListCompat);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final int OooO() {
        return this.f62370o00o0O;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooO00o(View view, ViewGroup.LayoutParams layoutParams) {
        OoooO00();
        ((ViewGroup) this.f62351OoooOOo.findViewById(R.id.content)).addView(view, layoutParams);
        this.f62335Oooo0.OooO00o(this.f62338Oooo00o.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooO0O0() {
        LocaleListCompat localeListCompat;
        Context context = this.f62337Oooo00O;
        if (AbstractC21486OooOO0o.OooOOOO(context) && (localeListCompat = AbstractC21486OooOO0o.f62447OooOoO0) != null && !localeListCompat.equals(AbstractC21486OooOO0o.f62446OooOoO)) {
            AbstractC21486OooOO0o.f62445OooOo0o.execute(new androidx.appcompat.app.OooOO0O(context, 0));
        }
        Oooo00o(true, true);
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final boolean OooO0OO() {
        return Oooo00o(true, true);
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final Context OooO0Oo(Context context) {
        this.f62384ooOO = true;
        int i = this.f62370o00o0O;
        if (i == -100) {
            i = AbstractC21486OooOO0o.f62444OooOo;
        }
        int iO000oOoO = o000oOoO(context, i);
        if (AbstractC21486OooOO0o.OooOOOO(context)) {
            AbstractC21486OooOO0o.Oooo00O(context);
        }
        LocaleListCompat localeListCompatOooo0O0 = Oooo0O0(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(Oooo0oO(context, iO000oOoO, localeListCompatOooo0O0, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof OooOO0o.OooO0OO) {
            try {
                ((OooOO0o.OooO0OO) context).OooO00o(Oooo0oO(context, iO000oOoO, localeListCompatOooo0O0, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f62331o00000) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                OooO0o.OooO00o(configuration3, configuration4, configuration);
                int i6 = configuration3.touchscreen;
                int i7 = configuration4.touchscreen;
                if (i6 != i7) {
                    configuration.touchscreen = i7;
                }
                int i8 = configuration3.keyboard;
                int i9 = configuration4.keyboard;
                if (i8 != i9) {
                    configuration.keyboard = i9;
                }
                int i10 = configuration3.keyboardHidden;
                int i11 = configuration4.keyboardHidden;
                if (i10 != i11) {
                    configuration.keyboardHidden = i11;
                }
                int i12 = configuration3.navigation;
                int i13 = configuration4.navigation;
                if (i12 != i13) {
                    configuration.navigation = i13;
                }
                int i14 = configuration3.navigationHidden;
                int i15 = configuration4.navigationHidden;
                if (i14 != i15) {
                    configuration.navigationHidden = i15;
                }
                int i16 = configuration3.orientation;
                int i17 = configuration4.orientation;
                if (i16 != i17) {
                    configuration.orientation = i17;
                }
                int i18 = configuration3.screenLayout & 15;
                int i19 = configuration4.screenLayout & 15;
                if (i18 != i19) {
                    configuration.screenLayout |= i19;
                }
                int i20 = configuration3.screenLayout & 192;
                int i21 = configuration4.screenLayout & 192;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 48;
                int i23 = configuration4.screenLayout & 48;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                int i25 = configuration4.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                int i26 = configuration3.colorMode & 3;
                int i27 = configuration4.colorMode & 3;
                if (i26 != i27) {
                    configuration.colorMode |= i27;
                }
                int i28 = configuration3.colorMode & 12;
                int i29 = configuration4.colorMode & 12;
                if (i28 != i29) {
                    configuration.colorMode |= i29;
                }
                int i30 = configuration3.uiMode & 15;
                int i31 = configuration4.uiMode & 15;
                if (i30 != i31) {
                    configuration.uiMode |= i31;
                }
                int i32 = configuration3.uiMode & 48;
                int i33 = configuration4.uiMode & 48;
                if (i32 != i33) {
                    configuration.uiMode |= i33;
                }
                int i34 = configuration3.screenWidthDp;
                int i35 = configuration4.screenWidthDp;
                if (i34 != i35) {
                    configuration.screenWidthDp = i35;
                }
                int i36 = configuration3.screenHeightDp;
                int i37 = configuration4.screenHeightDp;
                if (i36 != i37) {
                    configuration.screenHeightDp = i37;
                }
                int i38 = configuration3.smallestScreenWidthDp;
                int i39 = configuration4.smallestScreenWidthDp;
                if (i38 != i39) {
                    configuration.smallestScreenWidthDp = i39;
                }
                int i40 = configuration3.densityDpi;
                int i41 = configuration4.densityDpi;
                if (i40 != i41) {
                    configuration.densityDpi = i41;
                }
            }
        }
        Configuration configurationOooo0oO = Oooo0oO(context, iO000oOoO, localeListCompatOooo0O0, configuration, true);
        OooOO0o.OooO0OO oooO0OO = new OooOO0o.OooO0OO(context, 2132017755);
        oooO0OO.OooO00o(configurationOooo0oO);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.rebase(oooO0OO.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return oooO0OO;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final <T extends View> T OooO0o0(int i) {
        OoooO00();
        return (T) this.f62338Oooo00o.findViewById(i);
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final Context OooO0oO() {
        return this.f62337Oooo00O;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final OooO0O0 OooO0oo() {
        return new OooO0O0();
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final MenuInflater OooOO0O() {
        if (this.f62342Oooo0o0 == null) {
            OoooOO0();
            androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
            this.f62342Oooo0o0 = new OooOO0o.OooO0o(oooO00o != null ? oooO00o.OooO0o0() : this.f62337Oooo00O);
        }
        return this.f62342Oooo0o0;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final androidx.appcompat.app.OooO00o OooOO0o() {
        OoooOO0();
        return this.f62340Oooo0OO;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOOO() {
        if (this.f62340Oooo0OO != null) {
            OoooOO0();
            if (this.f62340Oooo0OO.OooO0o()) {
                return;
            }
            this.f62381o0ooOoO |= 1;
            if (this.f62380o0ooOOo) {
                return;
            }
            ViewCompat.postOnAnimation(this.f62338Oooo00o.getDecorView(), this.f62376o0OOO0o);
            this.f62380o0ooOOo = true;
        }
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOOO0() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f62337Oooo00O);
        if (layoutInflaterFrom.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOOOo(Configuration configuration) {
        if (this.f62356Ooooo0o && this.f62350OoooOOO) {
            OoooOO0();
            androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
            if (oooO00o != null) {
                oooO00o.OooO0oO();
            }
        }
        C21528OooO0oO c21528OooO0oOOooO00o = C21528OooO0oO.OooO00o();
        Context context = this.f62337Oooo00O;
        synchronized (c21528OooO0oOOooO00o) {
            C21556Oooo0OO c21556Oooo0OO = c21528OooO0oOOooO00o.f62912OooO00o;
            synchronized (c21556Oooo0OO) {
                OooOo.OooOOO<WeakReference<Drawable.ConstantState>> oooOOO = c21556Oooo0OO.f63056OooO0O0.get(context);
                if (oooOOO != null) {
                    oooOOO.OooO00o();
                }
            }
        }
        this.f62369o00Ooo = new Configuration(this.f62337Oooo00O.getResources().getConfiguration());
        Oooo00o(false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOo() {
        if (this.f62336Oooo000 instanceof Activity) {
            synchronized (AbstractC21486OooOO0o.f62451OooOooO) {
                AbstractC21486OooOO0o.OooOo0o(this);
            }
        }
        if (this.f62380o0ooOOo) {
            this.f62338Oooo00o.getDecorView().removeCallbacks(this.f62376o0OOO0o);
        }
        this.f62368o00Oo0 = true;
        if (this.f62370o00o0O != -100) {
            Object obj = this.f62336Oooo000;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f62332o000000O.put(this.f62336Oooo000.getClass().getName(), Integer.valueOf(this.f62370o00o0O));
            } else {
                f62332o000000O.remove(this.f62336Oooo000.getClass().getName());
            }
        }
        androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
        if (oooO00o != null) {
            oooO00o.OooO0oo();
        }
        OooOO0O oooOO0O = this.f62371o00oO0O;
        if (oooOO0O != null) {
            oooOO0O.OooO00o();
        }
        OooO oooO = this.f62379o0ooOO0;
        if (oooO != null) {
            oooO.OooO00o();
        }
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOOo0() {
        String parentActivityName;
        this.f62384ooOO = true;
        Oooo00o(false, true);
        OoooO0();
        Object obj = this.f62336Oooo000;
        if (obj instanceof Activity) {
            try {
                parentActivityName = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                parentActivityName = null;
            }
            if (parentActivityName != null) {
                androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
                if (oooO00o == null) {
                    this.f62377o0Oo0oo = true;
                } else {
                    oooO00o.OooOO0o(true);
                }
            }
            synchronized (AbstractC21486OooOO0o.f62451OooOooO) {
                AbstractC21486OooOO0o.OooOo0o(this);
                AbstractC21486OooOO0o.f62449OooOoo.add(new WeakReference<>(this));
            }
        }
        this.f62369o00Ooo = new Configuration(this.f62337Oooo00O.getResources().getConfiguration());
        this.f62367o00O0O = true;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOOoo() {
        OoooO00();
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final boolean OooOo(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f62361Oooooo0 && i == 108) {
            return false;
        }
        if (this.f62356Ooooo0o && i == 1) {
            this.f62356Ooooo0o = false;
        }
        if (i == 1) {
            OoooOoo();
            this.f62361Oooooo0 = true;
            return true;
        }
        if (i == 2) {
            OoooOoo();
            this.f62354OoooOoo = true;
            return true;
        }
        if (i == 5) {
            OoooOoo();
            this.f62355Ooooo00 = true;
            return true;
        }
        if (i == 10) {
            OoooOoo();
            this.f62358OooooOO = true;
            return true;
        }
        if (i == 108) {
            OoooOoo();
            this.f62356Ooooo0o = true;
            return true;
        }
        if (i != 109) {
            return this.f62338Oooo00o.requestFeature(i);
        }
        OoooOoo();
        this.f62357OooooO0 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOo0() {
        Oooo00o(true, false);
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOo00() {
        OoooOO0();
        androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
        if (oooO00o != null) {
            oooO00o.OooOOO0(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOo0O() {
        OoooOO0();
        androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
        if (oooO00o != null) {
            oooO00o.OooOOO0(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOoO(View view) {
        OoooO00();
        ViewGroup viewGroup = (ViewGroup) this.f62351OoooOOo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f62335Oooo0.OooO00o(this.f62338Oooo00o.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOoO0(int i) {
        OoooO00();
        ViewGroup viewGroup = (ViewGroup) this.f62351OoooOOo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f62337Oooo00O).inflate(i, viewGroup);
        this.f62335Oooo0.OooO00o(this.f62338Oooo00o.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOoOO(View view, ViewGroup.LayoutParams layoutParams) {
        OoooO00();
        ViewGroup viewGroup = (ViewGroup) this.f62351OoooOOo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f62335Oooo0.OooO00o(this.f62338Oooo00o.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOoo(Toolbar toolbar) {
        Object obj = this.f62336Oooo000;
        if (obj instanceof Activity) {
            OoooOO0();
            androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
            if (oooO00o instanceof C21503OooOooo) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f62342Oooo0o0 = null;
            if (oooO00o != null) {
                oooO00o.OooO0oo();
            }
            this.f62340Oooo0OO = null;
            if (toolbar != null) {
                C21499OooOoo0 c21499OooOoo0 = new C21499OooOoo0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f62341Oooo0o, this.f62335Oooo0);
                this.f62340Oooo0OO = c21499OooOoo0;
                this.f62335Oooo0.f62392OooOo = c21499OooOoo0.f62476OooO0OO;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f62335Oooo0.f62392OooOo = null;
            }
            OooOOO();
        }
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOooO(int i) {
        this.f62373o00ooo = i;
    }

    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    public final void OooOooo(CharSequence charSequence) {
        this.f62341Oooo0o = charSequence;
        androidx.appcompat.widget.OooOo oooOo = this.f62343Oooo0oO;
        if (oooOo != null) {
            oooOo.setWindowTitle(charSequence);
            return;
        }
        androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
        if (oooO00o != null) {
            oooO00o.OooOOO(charSequence);
            return;
        }
        TextView textView = this.f62352OoooOo0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void Oooo(int i) {
        PanelFeatureState panelFeatureStateOoooO = OoooO(i);
        if (panelFeatureStateOoooO.f62412OooO0oo != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateOoooO.f62412OooO0oo.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateOoooO.f62419OooOOOo = bundle;
            }
            panelFeatureStateOoooO.f62412OooO0oo.stopDispatchingItemsChanged();
            panelFeatureStateOoooO.f62412OooO0oo.clear();
        }
        panelFeatureStateOoooO.f62418OooOOOO = true;
        panelFeatureStateOoooO.f62416OooOOO = true;
        if ((i == 108 || i == 0) && this.f62343Oooo0oO != null) {
            PanelFeatureState panelFeatureStateOoooO2 = OoooO(0);
            panelFeatureStateOoooO2.f62414OooOO0O = false;
            OoooOoO(panelFeatureStateOoooO2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f62338Oooo00o != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C21480OooO0oo) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C21480OooO0oo c21480OooO0oo = new C21480OooO0oo(callback);
        this.f62335Oooo0 = c21480OooO0oo;
        window.setCallback(c21480OooO0oo);
        C21565OoooOO0 c21565OoooOO0OooO0o0 = C21565OoooOO0.OooO0o0(this.f62337Oooo00O, null, f62333o000000o);
        Drawable drawableOooO0OO = c21565OoooOO0OooO0o0.OooO0OO(0);
        if (drawableOooO0OO != null) {
            window.setBackgroundDrawable(drawableOooO0OO);
        }
        c21565OoooOO0OooO0o0.OooO0oO();
        this.f62338Oooo00o = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f62365o000OOo) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f62364o000000) != null) {
            C21479OooO0oO.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f62364o000000 = null;
        }
        Object obj = this.f62336Oooo000;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f62365o000OOo = C21479OooO0oO.OooO00o(activity);
            } else {
                this.f62365o000OOo = null;
            }
        }
        Ooooo00();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.appcompat.app.OooO, java.lang.Object] */
    @Override // androidx.appcompat.app.AbstractC21486OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC20443OooO00o Oooo000(AbstractC20443OooO00o.InterfaceC18960OooO00o interfaceC18960OooO00o) {
        AbstractC20443OooO00o abstractC20443OooO00oOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC20443OooO00o abstractC20443OooO00o;
        if (interfaceC18960OooO00o == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC20443OooO00o abstractC20443OooO00o2 = this.f62347OoooO00;
        if (abstractC20443OooO00o2 != null) {
            abstractC20443OooO00o2.OooO00o();
        }
        C21477OooO0Oo c21477OooO0Oo = new C21477OooO0Oo(interfaceC18960OooO00o);
        OoooOO0();
        androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
        ?? r1 = this.f62339Oooo0O0;
        if (oooO00o != null) {
            AbstractC20443OooO00o abstractC20443OooO00oOooOOOO = oooO00o.OooOOOO(c21477OooO0Oo);
            this.f62347OoooO00 = abstractC20443OooO00oOooOOOO;
            if (abstractC20443OooO00oOooOOOO != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC20443OooO00oOooOOOO);
            }
        }
        if (this.f62347OoooO00 == null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f62349OoooOO0;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            AbstractC20443OooO00o abstractC20443OooO00o3 = this.f62347OoooO00;
            if (abstractC20443OooO00o3 != null) {
                abstractC20443OooO00o3.OooO00o();
            }
            if (r1 == 0 || this.f62368o00Oo0) {
                abstractC20443OooO00oOnWindowStartingSupportActionMode = null;
                if (abstractC20443OooO00oOnWindowStartingSupportActionMode == null) {
                    this.f62347OoooO00 = abstractC20443OooO00oOnWindowStartingSupportActionMode;
                } else {
                    if (this.f62346OoooO0 == null) {
                        boolean z = this.f62359OooooOo;
                        Context context = this.f62337Oooo00O;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.orion.notein.global.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                OooOO0o.OooO0OO oooO0OO = new OooOO0o.OooO0OO(context, 0);
                                oooO0OO.getTheme().setTo(themeNewTheme);
                                context = oooO0OO;
                            }
                            this.f62346OoooO0 = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.orion.notein.global.R.attr.actionModePopupWindowStyle);
                            this.f62348OoooO0O = popupWindow;
                            PopupWindowCompat.setWindowLayoutType(popupWindow, 2);
                            this.f62348OoooO0O.setContentView(this.f62346OoooO0);
                            this.f62348OoooO0O.setWidth(-1);
                            context.getTheme().resolveAttribute(com.orion.notein.global.R.attr.actionBarSize, typedValue, true);
                            this.f62346OoooO0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f62348OoooO0O.setHeight(-2);
                            this.f62345OoooO = new RunnableC21490OooOOo0(this);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f62351OoooOOo.findViewById(com.orion.notein.global.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                OoooOO0();
                                androidx.appcompat.app.OooO00o oooO00o2 = this.f62340Oooo0OO;
                                Context contextOooO0o0 = oooO00o2 != null ? oooO00o2.OooO0o0() : null;
                                if (contextOooO0o0 != null) {
                                    context = contextOooO0o0;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f62346OoooO0 = (ActionBarContextView) viewStubCompat.OooO00o();
                            }
                        }
                    }
                    if (this.f62346OoooO0 != null) {
                        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = this.f62349OoooOO0;
                        if (viewPropertyAnimatorCompat2 != null) {
                            viewPropertyAnimatorCompat2.cancel();
                        }
                        this.f62346OoooO0.OooO0oo();
                        Context context2 = this.f62346OoooO0.getContext();
                        ActionBarContextView actionBarContextView = this.f62346OoooO0;
                        C20444OooO0Oo c20444OooO0Oo = new C20444OooO0Oo();
                        c20444OooO0Oo.f58329OooOoO0 = context2;
                        c20444OooO0Oo.f58328OooOoO = actionBarContextView;
                        c20444OooO0Oo.f58330OooOoOO = c21477OooO0Oo;
                        androidx.appcompat.view.menu.OooO defaultShowAsAction = new androidx.appcompat.view.menu.OooO(actionBarContextView.getContext()).setDefaultShowAsAction(1);
                        c20444OooO0Oo.f58333OooOooO = defaultShowAsAction;
                        defaultShowAsAction.setCallback(c20444OooO0Oo);
                        if (c21477OooO0Oo.f62389OooO00o.OooO0O0(c20444OooO0Oo, defaultShowAsAction)) {
                            c20444OooO0Oo.OooO0oO();
                            this.f62346OoooO0.OooO0o(c20444OooO0Oo);
                            this.f62347OoooO00 = c20444OooO0Oo;
                            if (this.f62350OoooOOO && (viewGroup = this.f62351OoooOOo) != null && viewGroup.isLaidOut()) {
                                this.f62346OoooO0.setAlpha(0.0f);
                                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(this.f62346OoooO0).alpha(1.0f);
                                this.f62349OoooOO0 = viewPropertyAnimatorCompatAlpha;
                                viewPropertyAnimatorCompatAlpha.setListener(new C21489OooOOo(this));
                            } else {
                                this.f62346OoooO0.setAlpha(1.0f);
                                this.f62346OoooO0.setVisibility(0);
                                if (this.f62346OoooO0.getParent() instanceof View) {
                                    ViewCompat.requestApplyInsets((View) this.f62346OoooO0.getParent());
                                }
                            }
                            if (this.f62348OoooO0O != null) {
                                this.f62338Oooo00o.getDecorView().post(this.f62345OoooO);
                            }
                        } else {
                            this.f62347OoooO00 = null;
                        }
                    }
                }
                abstractC20443OooO00o = this.f62347OoooO00;
                if (abstractC20443OooO00o != null && r1 != 0) {
                    r1.onSupportActionModeStarted(abstractC20443OooO00o);
                }
                Ooooo00();
                this.f62347OoooO00 = this.f62347OoooO00;
            } else {
                try {
                    abstractC20443OooO00oOnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(c21477OooO0Oo);
                } catch (AbstractMethodError unused) {
                    abstractC20443OooO00oOnWindowStartingSupportActionMode = null;
                }
                if (abstractC20443OooO00oOnWindowStartingSupportActionMode == null) {
                }
                abstractC20443OooO00o = this.f62347OoooO00;
                if (abstractC20443OooO00o != null) {
                    r1.onSupportActionModeStarted(abstractC20443OooO00o);
                }
                Ooooo00();
                this.f62347OoooO00 = this.f62347OoooO00;
            }
        }
        Ooooo00();
        return this.f62347OoooO00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Oooo00o(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.f62368o00Oo0) {
            return false;
        }
        int i2 = this.f62370o00o0O;
        if (i2 == -100) {
            i2 = AbstractC21486OooOO0o.f62444OooOo;
        }
        int i3 = i2;
        Context context = this.f62337Oooo00O;
        int iO000oOoO = o000oOoO(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        LocaleListCompat localeListCompatOooo0O0 = i4 < 33 ? Oooo0O0(context) : null;
        if (!z2 && localeListCompatOooo0O0 != null) {
            localeListCompatOooo0O0 = OooO0o.OooO0O0(context.getResources().getConfiguration());
        }
        Configuration configurationOooo0oO = Oooo0oO(context, iO000oOoO, localeListCompatOooo0O0, null, false);
        boolean z4 = this.f62372o00oO0o;
        Object obj = this.f62336Oooo000;
        boolean z5 = true;
        if (z4 || !(obj instanceof Activity)) {
            this.f62372o00oO0o = true;
            i = this.f62382oo000o;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f62382oo000o = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f62382oo000o = 0;
                }
                this.f62372o00oO0o = true;
                i = this.f62382oo000o;
            }
        }
        Configuration configuration = this.f62369o00Ooo;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationOooo0oO.uiMode & 48;
        LocaleListCompat localeListCompatOooO0O0 = OooO0o.OooO0O0(configuration);
        LocaleListCompat localeListCompatOooO0O02 = localeListCompatOooo0O0 == null ? null : OooO0o.OooO0O0(configurationOooo0oO);
        int i7 = i5 != i6 ? 512 : 0;
        if (localeListCompatOooO0O02 != null && !localeListCompatOooO0O0.equals(localeListCompatOooO0O02)) {
            i7 |= 8196;
        }
        if (((~i) & i7) != 0 && z && this.f62384ooOO && ((f62331o00000 || this.f62367o00O0O) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (!activity.isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i7 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationOooo0oO.getLayoutDirection());
                }
                ActivityCompat.recreate(activity);
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i & i7) == i7;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (localeListCompatOooO0O02 != null) {
                OooO0o.OooO0Oo(configuration2, localeListCompatOooO0O02);
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = this.f62373o00ooo;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.f62373o00ooo, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC21987OooOoo) {
                    if (((InterfaceC21987OooOoo) activity2).getLifecycle().OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65540OooOoO0) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f62367o00O0O && !this.f62368o00Oo0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof ActivityC21485OooO0oo)) {
            if ((i7 & 512) != 0) {
                ((ActivityC21485OooO0oo) obj).onNightModeChanged(iO000oOoO);
            }
            if ((i7 & 4) != 0) {
                ((ActivityC21485OooO0oo) obj).onLocalesChanged(localeListCompatOooo0O0);
            }
        }
        if (localeListCompatOooO0O02 != null) {
            OooO0o.OooO0OO(OooO0o.OooO0O0(context.getResources().getConfiguration()));
        }
        if (i3 == 0) {
            OoooO0O(context).OooO0o0();
        } else {
            OooOO0O oooOO0O = this.f62371o00oO0O;
            if (oooOO0O != null) {
                oooOO0O.OooO00o();
            }
        }
        if (i3 == 3) {
            if (this.f62379o0ooOO0 == null) {
                this.f62379o0ooOO0 = new OooO(context);
            }
            this.f62379o0ooOO0.OooO0o0();
        } else {
            OooO oooO = this.f62379o0ooOO0;
            if (oooO != null) {
                oooO.OooO00o();
            }
        }
        return z5;
    }

    public final void Oooo0OO(int i, PanelFeatureState panelFeatureState, androidx.appcompat.view.menu.OooO oooO) {
        if (oooO == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f62362OoooooO;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                oooO = panelFeatureState.f62412OooO0oo;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f62417OooOOO0) && !this.f62368o00Oo0) {
            C21480OooO0oo c21480OooO0oo = this.f62335Oooo0;
            Window.Callback callback = this.f62338Oooo00o.getCallback();
            c21480OooO0oo.getClass();
            try {
                c21480OooO0oo.f62395OooOoOO = true;
                callback.onPanelClosed(i, oooO);
            } finally {
                c21480OooO0oo.f62395OooOoOO = false;
            }
        }
    }

    public final void Oooo0o(PanelFeatureState panelFeatureState, boolean z) {
        C21481OooOO0o c21481OooOO0o;
        androidx.appcompat.widget.OooOo oooOo;
        if (z && panelFeatureState.f62405OooO00o == 0 && (oooOo = this.f62343Oooo0oO) != null && oooOo.OooO0OO()) {
            Oooo0o0(panelFeatureState.f62412OooO0oo);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f62337Oooo00O.getSystemService("window");
        if (windowManager != null && panelFeatureState.f62417OooOOO0 && (c21481OooOO0o = panelFeatureState.f62410OooO0o0) != null) {
            windowManager.removeView(c21481OooOO0o);
            if (z) {
                Oooo0OO(panelFeatureState.f62405OooO00o, panelFeatureState, null);
            }
        }
        panelFeatureState.f62414OooOO0O = false;
        panelFeatureState.f62415OooOO0o = false;
        panelFeatureState.f62417OooOOO0 = false;
        panelFeatureState.f62409OooO0o = null;
        panelFeatureState.f62416OooOOO = true;
        if (this.f62363Ooooooo == panelFeatureState) {
            this.f62363Ooooooo = null;
        }
        if (panelFeatureState.f62405OooO00o == 0) {
            Ooooo00();
        }
    }

    public final void Oooo0o0(androidx.appcompat.view.menu.OooO oooO) {
        if (this.f62360Oooooo) {
            return;
        }
        this.f62360Oooooo = true;
        this.f62343Oooo0oO.OooO();
        Window.Callback callback = this.f62338Oooo00o.getCallback();
        if (callback != null && !this.f62368o00Oo0) {
            callback.onPanelClosed(108, oooO);
        }
        this.f62360Oooooo = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Oooo0oo(KeyEvent keyEvent) {
        View decorView;
        boolean zOooO0o0;
        boolean zOoooOoO;
        Object obj = this.f62336Oooo000;
        if ((!(obj instanceof KeyEventDispatcher.Component) && !(obj instanceof DialogC21495OooOoO)) || (decorView = this.f62338Oooo00o.getDecorView()) == null || !KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                C21480OooO0oo c21480OooO0oo = this.f62335Oooo0;
                Window.Callback callback = this.f62338Oooo00o.getCallback();
                c21480OooO0oo.getClass();
                try {
                    c21480OooO0oo.f62393OooOoO = true;
                    if (!callback.dispatchKeyEvent(keyEvent)) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode == 4) {
                                this.f62378o0OoOo0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    PanelFeatureState panelFeatureStateOoooO = OoooO(0);
                                    if (!panelFeatureStateOoooO.f62417OooOOO0) {
                                        OoooOoO(panelFeatureStateOoooO, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f62347OoooO00 == null) {
                                    PanelFeatureState panelFeatureStateOoooO2 = OoooO(0);
                                    androidx.appcompat.widget.OooOo oooOo = this.f62343Oooo0oO;
                                    Context context = this.f62337Oooo00O;
                                    if (oooOo == null || !oooOo.OooO00o() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        boolean z = panelFeatureStateOoooO2.f62417OooOOO0;
                                        if (z || panelFeatureStateOoooO2.f62415OooOO0o) {
                                            Oooo0o(panelFeatureStateOoooO2, true);
                                            zOooO0o0 = z;
                                        } else if (panelFeatureStateOoooO2.f62414OooOO0O) {
                                            if (panelFeatureStateOoooO2.f62418OooOOOO) {
                                                panelFeatureStateOoooO2.f62414OooOO0O = false;
                                                zOoooOoO = OoooOoO(panelFeatureStateOoooO2, keyEvent);
                                            } else {
                                                zOoooOoO = true;
                                            }
                                            if (zOoooOoO) {
                                                OoooOOo(panelFeatureStateOoooO2, keyEvent);
                                                zOooO0o0 = true;
                                            }
                                        } else {
                                            zOooO0o0 = false;
                                        }
                                        if (zOooO0o0) {
                                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                            if (audioManager != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                            return true;
                                        }
                                    } else {
                                        if (this.f62343Oooo0oO.OooO0OO()) {
                                            zOooO0o0 = this.f62343Oooo0oO.OooO0o0();
                                        } else if (!this.f62368o00Oo0 && OoooOoO(panelFeatureStateOoooO2, keyEvent)) {
                                            zOooO0o0 = this.f62343Oooo0oO.OooO0O0();
                                        }
                                        if (zOooO0o0) {
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        if (!OoooOOO()) {
                            return false;
                        }
                    }
                } finally {
                    c21480OooO0oo.f62393OooOoO = false;
                }
            }
        }
        return true;
    }

    public final PanelFeatureState OoooO(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.f62362OoooooO;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f62362OoooooO = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState();
        panelFeatureState2.f62405OooO00o = i;
        panelFeatureState2.f62416OooOOO = false;
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final void OoooO0() {
        if (this.f62338Oooo00o == null) {
            Object obj = this.f62336Oooo000;
            if (obj instanceof Activity) {
                Oooo0(((Activity) obj).getWindow());
            }
        }
        if (this.f62338Oooo00o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void OoooO00() {
        ViewGroup viewGroup;
        if (this.f62350OoooOOO) {
            return;
        }
        int[] iArr = C20441OooO00o.f58287OooOO0;
        Context context = this.f62337Oooo00O;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            OooOo(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            OooOo(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            OooOo(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            OooOo(10);
        }
        this.f62359OooooOo = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        OoooO0();
        this.f62338Oooo00o.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f62361Oooooo0) {
            viewGroup = this.f62358OooooOO ? (ViewGroup) layoutInflaterFrom.inflate(com.orion.notein.global.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.orion.notein.global.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f62359OooooOo) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.orion.notein.global.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f62357OooooO0 = false;
            this.f62356Ooooo0o = false;
        } else if (this.f62356Ooooo0o) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.orion.notein.global.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new OooOO0o.OooO0OO(context, typedValue.resourceId) : context).inflate(com.orion.notein.global.R.layout.abc_screen_toolbar, (ViewGroup) null);
            androidx.appcompat.widget.OooOo oooOo = (androidx.appcompat.widget.OooOo) viewGroup.findViewById(com.orion.notein.global.R.id.decor_content_parent);
            this.f62343Oooo0oO = oooOo;
            oooOo.setWindowCallback(this.f62338Oooo00o.getCallback());
            if (this.f62357OooooO0) {
                this.f62343Oooo0oO.OooO0oo(109);
            }
            if (this.f62354OoooOoo) {
                this.f62343Oooo0oO.OooO0oo(2);
            }
            if (this.f62355Ooooo00) {
                this.f62343Oooo0oO.OooO0oo(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f62356Ooooo0o);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f62357OooooO0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f62359OooooOo);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f62358OooooOO);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(OooOOO.OooO00o(sb, " }", this.f62361Oooooo0));
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OooOOOO(this));
        if (this.f62343Oooo0oO == null) {
            this.f62352OoooOo0 = (TextView) viewGroup.findViewById(com.orion.notein.global.R.id.title);
        }
        boolean z = C21572Ooooo0o.f63118OooO00o;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.orion.notein.global.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f62338Oooo00o.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f62338Oooo00o.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C21488OooOOOo(this));
        this.f62351OoooOOo = viewGroup;
        Object obj = this.f62336Oooo000;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f62341Oooo0o;
        if (!TextUtils.isEmpty(title)) {
            androidx.appcompat.widget.OooOo oooOo2 = this.f62343Oooo0oO;
            if (oooOo2 != null) {
                oooOo2.setWindowTitle(title);
            } else {
                androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
                if (oooO00o != null) {
                    oooO00o.OooOOO(title);
                } else {
                    TextView textView = this.f62352OoooOo0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f62351OoooOOo.findViewById(R.id.content);
        View decorView = this.f62338Oooo00o.getDecorView();
        contentFrameLayout2.f62869OooOoo.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f62350OoooOOO = true;
        PanelFeatureState panelFeatureStateOoooO = OoooO(0);
        if (this.f62368o00Oo0 || panelFeatureStateOoooO.f62412OooO0oo != null) {
            return;
        }
        this.f62381o0ooOoO |= 4096;
        if (this.f62380o0ooOOo) {
            return;
        }
        ViewCompat.postOnAnimation(this.f62338Oooo00o.getDecorView(), this.f62376o0OOO0o);
        this.f62380o0ooOOo = true;
    }

    public final OooOO0 OoooO0O(Context context) {
        if (this.f62371o00oO0O == null) {
            if (C21502OooOooO.f62488OooO0Oo == null) {
                Context applicationContext = context.getApplicationContext();
                C21502OooOooO.f62488OooO0Oo = new C21502OooOooO(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f62371o00oO0O = new OooOO0O(C21502OooOooO.f62488OooO0Oo);
        }
        return this.f62371o00oO0O;
    }

    public final void OoooOO0() {
        OoooO00();
        if (this.f62356Ooooo0o && this.f62340Oooo0OO == null) {
            Object obj = this.f62336Oooo000;
            if (obj instanceof Activity) {
                this.f62340Oooo0OO = new C21503OooOooo((Activity) obj, this.f62357OooooO0);
            } else if (obj instanceof Dialog) {
                this.f62340Oooo0OO = new C21503OooOooo((Dialog) obj);
            }
            androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
            if (oooO00o != null) {
                oooO00o.OooOO0o(this.f62377o0Oo0oo);
            }
        }
    }

    public final boolean OoooOOO() {
        boolean z = this.f62378o0OoOo0;
        this.f62378o0OoOo0 = false;
        PanelFeatureState panelFeatureStateOoooO = OoooO(0);
        if (!panelFeatureStateOoooO.f62417OooOOO0) {
            AbstractC20443OooO00o abstractC20443OooO00o = this.f62347OoooO00;
            if (abstractC20443OooO00o != null) {
                abstractC20443OooO00o.OooO00o();
                return true;
            }
            OoooOO0();
            androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
            if (oooO00o == null || !oooO00o.OooO0O0()) {
                return false;
            }
        } else if (!z) {
            Oooo0o(panelFeatureStateOoooO, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0173, code lost:
    
        if (r3.f62627OooOoo0.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OoooOOo(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f62417OooOOO0 || this.f62368o00Oo0) {
            return;
        }
        int i2 = panelFeatureState.f62405OooO00o;
        Context context = this.f62337Oooo00O;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f62338Oooo00o.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, panelFeatureState.f62412OooO0oo)) {
            Oooo0o(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !OoooOoO(panelFeatureState, keyEvent)) {
            return;
        }
        C21481OooOO0o c21481OooOO0o = panelFeatureState.f62410OooO0o0;
        if (c21481OooOO0o != null && !panelFeatureState.f62416OooOOO) {
            View view = panelFeatureState.f62411OooO0oO;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            panelFeatureState.f62415OooOO0o = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = panelFeatureState.f62407OooO0OO;
            layoutParams2.windowAnimations = panelFeatureState.f62408OooO0Oo;
            windowManager.addView(panelFeatureState.f62410OooO0o0, layoutParams2);
            panelFeatureState.f62417OooOOO0 = true;
            if (i2 != 0) {
                Ooooo00();
                return;
            }
            return;
        }
        if (c21481OooOO0o == null) {
            OoooOO0();
            androidx.appcompat.app.OooO00o oooO00o = this.f62340Oooo0OO;
            Context contextOooO0o0 = oooO00o != null ? oooO00o.OooO0o0() : null;
            if (contextOooO0o0 != null) {
                context = contextOooO0o0;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(com.orion.notein.global.R.attr.actionBarPopupTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            }
            themeNewTheme.resolveAttribute(com.orion.notein.global.R.attr.panelMenuListTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            } else {
                themeNewTheme.applyStyle(2132017743, true);
            }
            OooOO0o.OooO0OO oooO0OO = new OooOO0o.OooO0OO(context, 0);
            oooO0OO.getTheme().setTo(themeNewTheme);
            panelFeatureState.f62413OooOO0 = oooO0OO;
            TypedArray typedArrayObtainStyledAttributes = oooO0OO.obtainStyledAttributes(C20441OooO00o.f58287OooOO0);
            panelFeatureState.f62406OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            panelFeatureState.f62408OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            panelFeatureState.f62410OooO0o0 = new C21481OooOO0o(panelFeatureState.f62413OooOO0);
            panelFeatureState.f62407OooO0OO = 81;
        } else if (panelFeatureState.f62416OooOOO && c21481OooOO0o.getChildCount() > 0) {
            panelFeatureState.f62410OooO0o0.removeAllViews();
        }
        View view2 = panelFeatureState.f62411OooO0oO;
        if (view2 == null) {
            if (panelFeatureState.f62412OooO0oo != null) {
                if (this.f62334Oooo == null) {
                    this.f62334Oooo = new OooOOO0();
                }
                OooOOO0 oooOOO0 = this.f62334Oooo;
                if (panelFeatureState.f62404OooO == null) {
                    C21508OooO0oO c21508OooO0oO = new C21508OooO0oO(panelFeatureState.f62413OooOO0);
                    panelFeatureState.f62404OooO = c21508OooO0oO;
                    c21508OooO0oO.f62626OooOoOO = oooOOO0;
                    panelFeatureState.f62412OooO0oo.addMenuPresenter(c21508OooO0oO);
                }
                C21508OooO0oO c21508OooO0oO2 = panelFeatureState.f62404OooO;
                C21481OooOO0o c21481OooOO0o2 = panelFeatureState.f62410OooO0o0;
                if (c21508OooO0oO2.f62624OooOoO == null) {
                    c21508OooO0oO2.f62624OooOoO = (ExpandedMenuView) c21508OooO0oO2.f62622OooOo.inflate(com.orion.notein.global.R.layout.abc_expanded_menu_layout, (ViewGroup) c21481OooOO0o2, false);
                    if (c21508OooO0oO2.f62627OooOoo0 == null) {
                        c21508OooO0oO2.f62627OooOoo0 = c21508OooO0oO2.new OooO00o();
                    }
                    c21508OooO0oO2.f62624OooOoO.setAdapter((ListAdapter) c21508OooO0oO2.f62627OooOoo0);
                    c21508OooO0oO2.f62624OooOoO.setOnItemClickListener(c21508OooO0oO2);
                }
                ExpandedMenuView expandedMenuView = c21508OooO0oO2.f62624OooOoO;
                panelFeatureState.f62409OooO0o = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            panelFeatureState.f62416OooOOO = true;
            return;
        }
        panelFeatureState.f62409OooO0o = view2;
        if (panelFeatureState.f62409OooO0o != null) {
            if (panelFeatureState.f62411OooO0oO == null) {
                C21508OooO0oO c21508OooO0oO3 = panelFeatureState.f62404OooO;
                if (c21508OooO0oO3.f62627OooOoo0 == null) {
                    c21508OooO0oO3.f62627OooOoo0 = c21508OooO0oO3.new OooO00o();
                }
            }
            ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f62409OooO0o.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.f62410OooO0o0.setBackgroundResource(panelFeatureState.f62406OooO0O0);
            ViewParent parent = panelFeatureState.f62409OooO0o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.f62409OooO0o);
            }
            panelFeatureState.f62410OooO0o0.addView(panelFeatureState.f62409OooO0o, layoutParams3);
            if (!panelFeatureState.f62409OooO0o.hasFocus()) {
                panelFeatureState.f62409OooO0o.requestFocus();
            }
        }
        panelFeatureState.f62416OooOOO = true;
        return;
        i = -2;
        panelFeatureState.f62415OooOO0o = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = panelFeatureState.f62407OooO0OO;
        layoutParams22.windowAnimations = panelFeatureState.f62408OooO0Oo;
        windowManager.addView(panelFeatureState.f62410OooO0o0, layoutParams22);
        panelFeatureState.f62417OooOOO0 = true;
        if (i2 != 0) {
        }
    }

    public final boolean OoooOo0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.OooO oooO;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f62414OooOO0O || OoooOoO(panelFeatureState, keyEvent)) && (oooO = panelFeatureState.f62412OooO0oo) != null) {
            return oooO.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OoooOoO(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        androidx.appcompat.widget.OooOo oooOo;
        androidx.appcompat.widget.OooOo oooOo2;
        Resources.Theme themeNewTheme;
        androidx.appcompat.widget.OooOo oooOo3;
        androidx.appcompat.widget.OooOo oooOo4;
        if (!this.f62368o00Oo0) {
            if (panelFeatureState.f62414OooOO0O) {
                return true;
            }
            PanelFeatureState panelFeatureState2 = this.f62363Ooooooo;
            if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
                Oooo0o(panelFeatureState2, false);
            }
            Window.Callback callback = this.f62338Oooo00o.getCallback();
            int i = panelFeatureState.f62405OooO00o;
            if (callback != null) {
                panelFeatureState.f62411OooO0oO = callback.onCreatePanelView(i);
            }
            boolean z = i == 0 || i == 108;
            if (z && (oooOo4 = this.f62343Oooo0oO) != null) {
                oooOo4.OooO0o();
            }
            if (panelFeatureState.f62411OooO0oO == null && (!z || !(this.f62340Oooo0OO instanceof C21499OooOoo0))) {
                androidx.appcompat.view.menu.OooO oooO = panelFeatureState.f62412OooO0oo;
                if (oooO == null || panelFeatureState.f62418OooOOOO) {
                    if (oooO == null) {
                        Context context = this.f62337Oooo00O;
                        if ((i == 0 || i == 108) && this.f62343Oooo0oO != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.orion.notein.global.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.orion.notein.global.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.orion.notein.global.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                OooOO0o.OooO0OO oooO0OO = new OooOO0o.OooO0OO(context, 0);
                                oooO0OO.getTheme().setTo(themeNewTheme);
                                context = oooO0OO;
                            }
                        }
                        androidx.appcompat.view.menu.OooO oooO2 = new androidx.appcompat.view.menu.OooO(context);
                        oooO2.setCallback(this);
                        androidx.appcompat.view.menu.OooO oooO3 = panelFeatureState.f62412OooO0oo;
                        if (oooO2 != oooO3) {
                            if (oooO3 != null) {
                                oooO3.removeMenuPresenter(panelFeatureState.f62404OooO);
                            }
                            panelFeatureState.f62412OooO0oo = oooO2;
                            C21508OooO0oO c21508OooO0oO = panelFeatureState.f62404OooO;
                            if (c21508OooO0oO != null) {
                                oooO2.addMenuPresenter(c21508OooO0oO);
                            }
                        }
                        if (panelFeatureState.f62412OooO0oo != null) {
                            if (z && (oooOo2 = this.f62343Oooo0oO) != null) {
                                if (this.f62344Oooo0oo == null) {
                                    this.f62344Oooo0oo = new OooO0OO();
                                }
                                oooOo2.OooO0Oo(panelFeatureState.f62412OooO0oo, this.f62344Oooo0oo);
                            }
                            panelFeatureState.f62412OooO0oo.stopDispatchingItemsChanged();
                            if (callback.onCreatePanelMenu(i, panelFeatureState.f62412OooO0oo)) {
                                panelFeatureState.f62418OooOOOO = false;
                            } else {
                                androidx.appcompat.view.menu.OooO oooO4 = panelFeatureState.f62412OooO0oo;
                                if (oooO4 != null) {
                                    if (oooO4 != null) {
                                        oooO4.removeMenuPresenter(panelFeatureState.f62404OooO);
                                    }
                                    panelFeatureState.f62412OooO0oo = null;
                                }
                                if (z && (oooOo = this.f62343Oooo0oO) != null) {
                                    oooOo.OooO0Oo(null, this.f62344Oooo0oo);
                                }
                            }
                        }
                    }
                }
                panelFeatureState.f62412OooO0oo.stopDispatchingItemsChanged();
                Bundle bundle = panelFeatureState.f62419OooOOOo;
                if (bundle != null) {
                    panelFeatureState.f62412OooO0oo.restoreActionViewStates(bundle);
                    panelFeatureState.f62419OooOOOo = null;
                }
                if (!callback.onPreparePanel(0, panelFeatureState.f62411OooO0oO, panelFeatureState.f62412OooO0oo)) {
                    if (z && (oooOo3 = this.f62343Oooo0oO) != null) {
                        oooOo3.OooO0Oo(null, this.f62344Oooo0oo);
                    }
                    panelFeatureState.f62412OooO0oo.startDispatchingItemsChanged();
                    return false;
                }
                panelFeatureState.f62412OooO0oo.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                panelFeatureState.f62412OooO0oo.startDispatchingItemsChanged();
            }
            panelFeatureState.f62414OooOO0O = true;
            panelFeatureState.f62415OooOO0o = false;
            this.f62363Ooooooo = panelFeatureState;
            return true;
        }
        return false;
    }

    public final void OoooOoo() {
        if (this.f62350OoooOOO) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Ooooo00() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f62365o000OOo != null && (OoooO(0).f62417OooOOO0 || this.f62347OoooO00 != null)) {
                z = true;
            }
            if (z && this.f62364o000000 == null) {
                this.f62364o000000 = C21479OooO0oO.OooO0O0(this.f62365o000OOo, this);
            } else {
                if (z || (onBackInvokedCallback = this.f62364o000000) == null) {
                    return;
                }
                C21479OooO0oO.OooO0OO(this.f62365o000OOo, onBackInvokedCallback);
                this.f62364o000000 = null;
            }
        }
    }

    public final int o000oOoO(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f62379o0ooOO0 == null) {
                            this.f62379o0ooOO0 = new OooO(context);
                        }
                        return this.f62379o0ooOO0.OooO0OO();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return OoooO0O(context).OooO0OO();
                }
            }
            return i;
        }
        return -1;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f62374o0O0O00 == null) {
            int[] iArr = C20441OooO00o.f58287OooOO0;
            Context context2 = this.f62337Oooo00O;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f62374o0O0O00 = new C21497OooOoOO();
            } else {
                try {
                    this.f62374o0O0O00 = (C21497OooOoOO) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f62374o0O0O00 = new C21497OooOoOO();
                }
            }
        }
        C21497OooOoOO c21497OooOoOO = this.f62374o0O0O00;
        int i = C21571Ooooo00.f63117OooO00o;
        return c21497OooOoOO.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.OooO oooO, MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback callback = this.f62338Oooo00o.getCallback();
        if (callback != null && !this.f62368o00Oo0) {
            androidx.appcompat.view.menu.OooO rootMenu = oooO.getRootMenu();
            PanelFeatureState[] panelFeatureStateArr = this.f62362OoooooO;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.f62412OooO0oo == rootMenu) {
                        break;
                    }
                    i++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return callback.onMenuItemSelected(panelFeatureState.f62405OooO00o, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final void onMenuModeChange(androidx.appcompat.view.menu.OooO oooO) {
        androidx.appcompat.widget.OooOo oooOo = this.f62343Oooo0oO;
        if (oooOo == null || !oooOo.OooO00o() || (ViewConfiguration.get(this.f62337Oooo00O).hasPermanentMenuKey() && !this.f62343Oooo0oO.OooO0oO())) {
            PanelFeatureState panelFeatureStateOoooO = OoooO(0);
            panelFeatureStateOoooO.f62416OooOOO = true;
            Oooo0o(panelFeatureStateOoooO, false);
            OoooOOo(panelFeatureStateOoooO, null);
            return;
        }
        Window.Callback callback = this.f62338Oooo00o.getCallback();
        if (this.f62343Oooo0oO.OooO0OO()) {
            this.f62343Oooo0oO.OooO0o0();
            if (this.f62368o00Oo0) {
                return;
            }
            callback.onPanelClosed(108, OoooO(0).f62412OooO0oo);
            return;
        }
        if (callback == null || this.f62368o00Oo0) {
            return;
        }
        if (this.f62380o0ooOOo && (1 & this.f62381o0ooOoO) != 0) {
            View decorView = this.f62338Oooo00o.getDecorView();
            OooO00o oooO00o = this.f62376o0OOO0o;
            decorView.removeCallbacks(oooO00o);
            oooO00o.run();
        }
        PanelFeatureState panelFeatureStateOoooO2 = OoooO(0);
        androidx.appcompat.view.menu.OooO oooO2 = panelFeatureStateOoooO2.f62412OooO0oo;
        if (oooO2 == null || panelFeatureStateOoooO2.f62418OooOOOO || !callback.onPreparePanel(0, panelFeatureStateOoooO2.f62411OooO0oO, oooO2)) {
            return;
        }
        callback.onMenuOpened(108, panelFeatureStateOoooO2.f62412OooO0oo);
        this.f62343Oooo0oO.OooO0O0();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
