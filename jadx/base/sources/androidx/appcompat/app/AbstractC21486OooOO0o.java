package androidx.appcompat.app;

import OooOO0o.AbstractC20443OooO00o;
import OooOo.OooO0O0;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.appcompat.app.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21486OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0OO f62445OooOo0o = new OooO0OO(new ExecutorC21487OooO0Oo());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static int f62444OooOo = -100;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static LocaleListCompat f62447OooOoO0 = null;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static LocaleListCompat f62446OooOoO = null;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static Boolean f62448OooOoOO = null;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static boolean f62450OooOoo0 = false;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooOo.OooO0O0<WeakReference<AbstractC21486OooOO0o>> f62449OooOoo = new OooOo.OooO0O0<>();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final Object f62451OooOooO = new Object();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final Object f62452OooOooo = new Object();

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOO0o$OooO00o */
    public static class OooO00o {
        public static LocaleList OooO00o(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOO0o$OooO0O0 */
    public static class OooO0O0 {
        public static LocaleList OooO00o(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void OooO0O0(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOO0o$OooO0OO */
    public static class OooO0OO implements Executor {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Runnable f62455OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final ExecutorC21487OooO0Oo f62456OooOoO0;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Object f62454OooOo0o = new Object();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ArrayDeque f62453OooOo = new ArrayDeque();

        public OooO0OO(ExecutorC21487OooO0Oo executorC21487OooO0Oo) {
            this.f62456OooOoO0 = executorC21487OooO0Oo;
        }

        public final void OooO00o() {
            synchronized (this.f62454OooOo0o) {
                try {
                    Runnable runnable = (Runnable) this.f62453OooOo.poll();
                    this.f62455OooOoO = runnable;
                    if (runnable != null) {
                        this.f62456OooOoO0.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            synchronized (this.f62454OooOo0o) {
                try {
                    this.f62453OooOo.add(new Runnable() { // from class: androidx.appcompat.app.OooOOO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable2 = runnable;
                            AbstractC21486OooOO0o.OooO0OO oooO0OO = this.f62458OooOo0o;
                            oooO0OO.getClass();
                            try {
                                runnable2.run();
                            } finally {
                                oooO0OO.OooO00o();
                            }
                        }
                    });
                    if (this.f62455OooOoO == null) {
                        OooO00o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOO0o$OooO0Oo, reason: case insensitive filesystem */
    public static class ExecutorC21487OooO0Oo implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static LocaleListCompat OooO0o() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objOooOO0 = OooOO0();
            if (objOooOO0 != null) {
                return LocaleListCompat.wrap(OooO0O0.OooO00o(objOooOO0));
            }
        } else {
            LocaleListCompat localeListCompat = f62447OooOoO0;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object OooOO0() {
        Context contextOooO0oO;
        OooOo.OooO0O0<WeakReference<AbstractC21486OooOO0o>> oooO0O0 = f62449OooOoo;
        oooO0O0.getClass();
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        while (oooO00o.hasNext()) {
            AbstractC21486OooOO0o abstractC21486OooOO0o = (AbstractC21486OooOO0o) ((WeakReference) oooO00o.next()).get();
            if (abstractC21486OooOO0o != null && (contextOooO0oO = abstractC21486OooOO0o.OooO0oO()) != null) {
                return contextOooO0oO.getSystemService(IDToken.LOCALE);
            }
        }
        return null;
    }

    public static boolean OooOOOO(Context context) {
        if (f62448OooOoOO == null) {
            try {
                int i = AppLocalesMetadataHolderService.f62423OooOo0o;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.OooO00o.OooO00o() | 128).metaData;
                if (bundle != null) {
                    f62448OooOoOO = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f62448OooOoOO = Boolean.FALSE;
            }
        }
        return f62448OooOoOO.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOo0o(AppCompatDelegateImpl appCompatDelegateImpl) {
        synchronized (f62451OooOooO) {
            try {
                OooOo.OooO0O0<WeakReference<AbstractC21486OooOO0o>> oooO0O0 = f62449OooOoo;
                oooO0O0.getClass();
                OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
                while (oooO00o.hasNext()) {
                    AbstractC21486OooOO0o abstractC21486OooOO0o = (AbstractC21486OooOO0o) ((WeakReference) oooO00o.next()).get();
                    if (abstractC21486OooOO0o == appCompatDelegateImpl || abstractC21486OooOO0o == null) {
                        oooO00o.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOoo0(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f62444OooOo != i) {
            f62444OooOo = i;
            synchronized (f62451OooOooO) {
                try {
                    OooOo.OooO0O0<WeakReference<AbstractC21486OooOO0o>> oooO0O0 = f62449OooOoo;
                    oooO0O0.getClass();
                    OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
                    while (oooO00o.hasNext()) {
                        AbstractC21486OooOO0o abstractC21486OooOO0o = (AbstractC21486OooOO0o) ((WeakReference) oooO00o.next()).get();
                        if (abstractC21486OooOO0o != null) {
                            abstractC21486OooOO0o.OooO0OO();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void Oooo00O(Context context) {
        if (OooOOOO(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f62450OooOoo0) {
                    return;
                }
                f62445OooOo0o.execute(new OooOO0(context, 0));
                return;
            }
            synchronized (f62452OooOooo) {
                try {
                    LocaleListCompat localeListCompat = f62447OooOoO0;
                    if (localeListCompat == null) {
                        if (f62446OooOoO == null) {
                            f62446OooOoO = LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
                        }
                        if (f62446OooOoO.isEmpty()) {
                        } else {
                            f62447OooOoO0 = f62446OooOoO;
                        }
                    } else if (!localeListCompat.equals(f62446OooOoO)) {
                        LocaleListCompat localeListCompat2 = f62447OooOoO0;
                        f62446OooOoO = localeListCompat2;
                        AppLocalesStorageHelper.persistLocales(context, localeListCompat2.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int OooO() {
        return -100;
    }

    public abstract void OooO00o(View view, ViewGroup.LayoutParams layoutParams);

    public void OooO0O0() {
    }

    public abstract boolean OooO0OO();

    public Context OooO0Oo(Context context) {
        return context;
    }

    public abstract <T extends View> T OooO0o0(int i);

    public Context OooO0oO() {
        return null;
    }

    public abstract AppCompatDelegateImpl.OooO0O0 OooO0oo();

    public abstract MenuInflater OooOO0O();

    public abstract androidx.appcompat.app.OooO00o OooOO0o();

    public abstract void OooOOO();

    public abstract void OooOOO0();

    public abstract void OooOOOo(Configuration configuration);

    public abstract void OooOOo();

    public abstract void OooOOo0();

    public abstract void OooOOoo();

    public abstract boolean OooOo(int i);

    public abstract void OooOo0();

    public abstract void OooOo00();

    public abstract void OooOo0O();

    public abstract void OooOoO(View view);

    public abstract void OooOoO0(int i);

    public abstract void OooOoOO(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void OooOoo(Toolbar toolbar);

    public void OooOooO(int i) {
    }

    public abstract void OooOooo(CharSequence charSequence);

    public abstract AbstractC20443OooO00o Oooo000(AbstractC20443OooO00o.InterfaceC18960OooO00o interfaceC18960OooO00o);
}
