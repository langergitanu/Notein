package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C22251OooO0oO;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o00OO0oO.C25004OooO0Oo;
import o00OooOO.C25156OooO0OO;
import o00OooOO.C25159OooO0oO;
import o00OooOO.C25160OooO0oo;
import o00OooOO.InterfaceC25155OooO0O0;
import o00OooOo.C25164OooO0Oo;
import o00OooOo.C25165OooO0o;
import o00OooOo.C25166OooO0o0;
import o00OooOo.C25167OooO0oO;
import o00o00Oo.C25259OooO0Oo;
import o00o00Oo.C25267OooOOO;
import o00o00o0.AbstractC25280OooO00o;
import o00o00o0.C25283OooO0Oo;
import o00o00o0.InterfaceC25281OooO0O0;
import o00o00oo.C25298OooO0o;
import o00o0O0.C25316OooOO0o;
import o0O00o0.ExecutorServiceC25844OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static volatile OooO0OO f67111OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static volatile boolean f67112OooOooo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25165OooO0o f67113OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f67114OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C25159OooO0oO f67115OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0o f67116OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C25267OooOOO f67117OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ArrayList f67118OooOoo = new ArrayList();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C25259OooO0Oo f67119OooOoo0;

    public OooO0OO(Context context, o00OooO.OooOOO0 oooOOO0, C25165OooO0o c25165OooO0o, InterfaceC25155OooO0O0 interfaceC25155OooO0O0, C25159OooO0oO c25159OooO0oO, C25267OooOOO c25267OooOOO, C25259OooO0Oo c25259OooO0Oo, int i, C25004OooO0Oo c25004OooO0Oo, OooOo.OooO00o oooO00o, List list, List list2, AbstractC25280OooO00o abstractC25280OooO00o, C22251OooO0oO c22251OooO0oO) {
        this.f67114OooOo0o = interfaceC25155OooO0O0;
        this.f67115OooOoO = c25159OooO0oO;
        this.f67113OooOo = c25165OooO0o;
        this.f67117OooOoOO = c25267OooOOO;
        this.f67119OooOoo0 = c25259OooO0Oo;
        this.f67116OooOoO0 = new OooO0o(context, c25159OooO0oO, new OooOO0(this, list2, abstractC25280OooO00o), new C25298OooO0o(), c25004OooO0Oo, oooO00o, list, oooOOO0, c22251OooO0oO, i);
    }

    public static OooO0OO OooO00o(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f67111OooOooO == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (OooO0OO.class) {
                if (f67111OooOooO == null) {
                    if (f67112OooOooo) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f67112OooOooo = true;
                    try {
                        OooO0OO(context, generatedAppGlideModule);
                        f67112OooOooo = false;
                    } catch (Throwable th) {
                        f67112OooOooo = false;
                        throw th;
                    }
                }
            }
        }
        return f67111OooOooO;
    }

    public static C25267OooOOO OooO0O0(Context context) {
        C21929Ooooo0o.OooO0OO(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return OooO00o(context).f67117OooOoOO;
    }

    public static void OooO0OO(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        C22251OooO0oO.OooO00o oooO00o2 = new C22251OooO0oO.OooO00o();
        C25004OooO0Oo c25004OooO0Oo = new C25004OooO0Oo();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.OooO0OO();
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(C25283OooO0Oo.OooO00o(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.OooO0Oo().isEmpty()) {
            Set<Class<?>> setOooO0Oo = generatedAppGlideModule.OooO0Oo();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC25281OooO0O0 interfaceC25281OooO0O0 = (InterfaceC25281OooO0O0) it.next();
                if (setOooO0Oo.contains(interfaceC25281OooO0O0.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC25281OooO0O0);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((InterfaceC25281OooO0O0) it2.next()).getClass());
            }
        }
        C25267OooOOO.OooO0O0 OooO0o02 = generatedAppGlideModule != null ? generatedAppGlideModule.OooO0o0() : null;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC25281OooO0O0) it3.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.OooO0O0();
        }
        ExecutorServiceC25844OooO00o.ThreadFactoryC19722OooO00o threadFactoryC19722OooO00o = new ExecutorServiceC25844OooO00o.ThreadFactoryC19722OooO00o();
        if (ExecutorServiceC25844OooO00o.f88182OooOoO0 == 0) {
            ExecutorServiceC25844OooO00o.f88182OooOoO0 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC25844OooO00o.f88182OooOoO0;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        ExecutorServiceC25844OooO00o executorServiceC25844OooO00o = new ExecutorServiceC25844OooO00o(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC25844OooO00o.OooO0O0(threadFactoryC19722OooO00o, "source", false)));
        int i2 = ExecutorServiceC25844OooO00o.f88182OooOoO0;
        ExecutorServiceC25844OooO00o.ThreadFactoryC19722OooO00o threadFactoryC19722OooO00o2 = new ExecutorServiceC25844OooO00o.ThreadFactoryC19722OooO00o();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC25844OooO00o executorServiceC25844OooO00o2 = new ExecutorServiceC25844OooO00o(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC25844OooO00o.OooO0O0(threadFactoryC19722OooO00o2, "disk-cache", true)));
        if (ExecutorServiceC25844OooO00o.f88182OooOoO0 == 0) {
            ExecutorServiceC25844OooO00o.f88182OooOoO0 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = ExecutorServiceC25844OooO00o.f88182OooOoO0 >= 4 ? 2 : 1;
        ExecutorServiceC25844OooO00o.ThreadFactoryC19722OooO00o threadFactoryC19722OooO00o3 = new ExecutorServiceC25844OooO00o.ThreadFactoryC19722OooO00o();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC25844OooO00o executorServiceC25844OooO00o3 = new ExecutorServiceC25844OooO00o(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC25844OooO00o.OooO0O0(threadFactoryC19722OooO00o3, "animation", true)));
        C25167OooO0oO c25167OooO0oO = new C25167OooO0oO(new C25167OooO0oO.OooO00o(applicationContext));
        C25259OooO0Oo c25259OooO0Oo = new C25259OooO0Oo();
        int i4 = c25167OooO0oO.f85670OooO00o;
        InterfaceC25155OooO0O0 c25160OooO0oo = i4 > 0 ? new C25160OooO0oo(i4) : new C25156OooO0OO();
        C25159OooO0oO c25159OooO0oO = new C25159OooO0oO(c25167OooO0oO.f85672OooO0OO);
        C25165OooO0o c25165OooO0o = new C25165OooO0o(c25167OooO0oO.f85671OooO0O0);
        OooO0OO oooO0OO = new OooO0OO(applicationContext, new o00OooO.OooOOO0(c25165OooO0o, new C25166OooO0o0(new C25164OooO0Oo(applicationContext)), executorServiceC25844OooO00o2, executorServiceC25844OooO00o, new ExecutorServiceC25844OooO00o(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC25844OooO00o.f88181OooOo, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ExecutorServiceC25844OooO00o.OooO0O0(new ExecutorServiceC25844OooO00o.ThreadFactoryC19722OooO00o(), "source-unlimited", false))), executorServiceC25844OooO00o3), c25165OooO0o, c25160OooO0oo, c25159OooO0oO, new C25267OooOOO(OooO0o02), c25259OooO0Oo, 4, c25004OooO0Oo, oooO00o, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C22251OooO0oO(oooO00o2));
        applicationContext.registerComponentCallbacks(oooO0OO);
        f67111OooOooO = oooO0OO;
    }

    public static OooOOO0 OooO0Oo(Context context) {
        return OooO0O0(context).OooO0OO(context);
    }

    public static OooOOO0 OooO0o0(View view) {
        C25267OooOOO c25267OooOOOOooO0O0 = OooO0O0(view.getContext());
        c25267OooOOOOooO0O0.getClass();
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c25267OooOOOOooO0O0.OooO0OO(view.getContext().getApplicationContext());
        }
        C21929Ooooo0o.OooO0OO(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityOooO00o = C25267OooOOO.OooO00o(view.getContext());
        if (activityOooO00o != null && (activityOooO00o instanceof ActivityC21897OooOo0)) {
            ActivityC21897OooOo0 activityC21897OooOo0 = (ActivityC21897OooOo0) activityOooO00o;
            OooOo.OooO00o<View, Fragment> oooO00o = c25267OooOOOOooO0O0.f86003OooOoO0;
            oooO00o.clear();
            C25267OooOOO.OooO0O0(activityC21897OooOo0.getSupportFragmentManager().f64800OooO0OO.OooO0o(), oooO00o);
            View viewFindViewById = activityC21897OooOo0.findViewById(R.id.content);
            Fragment fragment = null;
            while (!view.equals(viewFindViewById) && (fragment = oooO00o.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            oooO00o.clear();
            return fragment != null ? c25267OooOOOOooO0O0.OooO0Oo(fragment) : c25267OooOOOOooO0O0.OooO0o0(activityC21897OooOo0);
        }
        return c25267OooOOOOooO0O0.OooO0OO(view.getContext().getApplicationContext());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C25316OooOO0o.OooO00o();
        this.f67113OooOo.OooO0o0(0L);
        this.f67114OooOo0o.OooO0Oo();
        this.f67115OooOoO.OooO00o();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        C25316OooOO0o.OooO00o();
        synchronized (this.f67118OooOoo) {
            try {
                Iterator it = this.f67118OooOoo.iterator();
                while (it.hasNext()) {
                    ((OooOOO0) it.next()).getClass();
                }
            } finally {
            }
        }
        C25165OooO0o c25165OooO0o = this.f67113OooOo;
        c25165OooO0o.getClass();
        if (i >= 40) {
            c25165OooO0o.OooO0o0(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c25165OooO0o) {
                j = c25165OooO0o.f86133OooO0O0;
            }
            c25165OooO0o.OooO0o0(j / 2);
        }
        this.f67114OooOo0o.OooO0OO(i);
        C25159OooO0oO c25159OooO0oO = this.f67115OooOoO;
        synchronized (c25159OooO0oO) {
            try {
                if (i >= 40) {
                    c25159OooO0oO.OooO00o();
                } else if (i >= 20 || i == 15) {
                    c25159OooO0oO.OooO0OO(c25159OooO0oO.f85631OooO0o0 / 2);
                }
            } finally {
            }
        }
    }
}
