package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o00OooO.AbstractC25133OooOO0o;
import o00o00Oo.C25258OooO0OO;
import o00o00Oo.C25259OooO0Oo;
import o00o00Oo.C25268OooOOO0;
import o00o00Oo.C25270OooOOOo;
import o00o00Oo.C25273OooOOoo;
import o00o00Oo.InterfaceC25255OooO;
import o00o00Oo.InterfaceC25257OooO0O0;
import o00o00Oo.InterfaceC25265OooOO0O;
import o00o00Oo.InterfaceC25269OooOOOO;
import o00o00oO.C25291OooO0oO;
import o00o00oO.InterfaceC25288OooO0Oo;
import o00o00oO.InterfaceC25289OooO0o;
import o00o00oo.InterfaceC25293OooO;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public class OooOOO0 implements ComponentCallbacks2, InterfaceC25265OooOO0O {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final C25291OooO0oO f67156Oooo00O = new C25291OooO0oO().OooO0o(Bitmap.class).OooOOO0();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f67157OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0OO f67158OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C25270OooOOOo f67159OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC25255OooO f67160OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final InterfaceC25269OooOOOO f67161OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO00o f67162OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C25273OooOOoo f67163OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final InterfaceC25257OooO0O0 f67164OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC25289OooO0o<Object>> f67165OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C25291OooO0oO f67166Oooo000;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO0 oooOOO0 = OooOOO0.this;
            oooOOO0.f67160OooOoO0.OooO00o(oooOOO0);
        }
    }

    public class OooO0O0 implements InterfaceC25257OooO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25270OooOOOo f67168OooO00o;

        public OooO0O0(C25270OooOOOo c25270OooOOOo) {
            this.f67168OooO00o = c25270OooOOOo;
        }

        @Override // o00o00Oo.InterfaceC25257OooO0O0.OooO00o
        public final void OooO00o(boolean z) {
            if (z) {
                synchronized (OooOOO0.this) {
                    C25270OooOOOo c25270OooOOOo = this.f67168OooO00o;
                    for (InterfaceC25288OooO0Oo interfaceC25288OooO0Oo : C25316OooOO0o.OooO0o0(c25270OooOOOo.f86005OooO00o)) {
                        if (!interfaceC25288OooO0Oo.OooO0o0() && !interfaceC25288OooO0Oo.OooO0Oo()) {
                            interfaceC25288OooO0Oo.clear();
                            if (c25270OooOOOo.f86007OooO0OO) {
                                c25270OooOOOo.f86006OooO0O0.add(interfaceC25288OooO0Oo);
                            } else {
                                interfaceC25288OooO0Oo.OooO();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new C25291OooO0oO().OooO0o(o00o00.OooO0OO.class).OooOOO0();
        ((C25291OooO0oO) new C25291OooO0oO().OooO0oO(AbstractC25133OooOO0o.f85489OooO0O0).OooOo0o()).OooOoo(true);
    }

    public OooOOO0(OooO0OO oooO0OO, InterfaceC25255OooO interfaceC25255OooO, InterfaceC25269OooOOOO interfaceC25269OooOOOO, Context context) {
        C25291OooO0oO c25291OooO0oO;
        C25270OooOOOo c25270OooOOOo = new C25270OooOOOo();
        C25259OooO0Oo c25259OooO0Oo = oooO0OO.f67119OooOoo0;
        this.f67163OooOoo0 = new C25273OooOOoo();
        OooO00o oooO00o = new OooO00o();
        this.f67162OooOoo = oooO00o;
        this.f67158OooOo0o = oooO0OO;
        this.f67160OooOoO0 = interfaceC25255OooO;
        this.f67161OooOoOO = interfaceC25269OooOOOO;
        this.f67159OooOoO = c25270OooOOOo;
        this.f67157OooOo = context;
        Context applicationContext = context.getApplicationContext();
        OooO0O0 oooO0O0 = new OooO0O0(c25270OooOOOo);
        c25259OooO0Oo.getClass();
        boolean z = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC25257OooO0O0 c25258OooO0OO = z ? new C25258OooO0OO(applicationContext, oooO0O0) : new C25268OooOOO0();
        this.f67164OooOooO = c25258OooO0OO;
        synchronized (oooO0OO.f67118OooOoo) {
            if (oooO0OO.f67118OooOoo.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            oooO0OO.f67118OooOoo.add(this);
        }
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC25255OooO.OooO00o(this);
        } else {
            C25316OooOO0o.OooO0o().post(oooO00o);
        }
        interfaceC25255OooO.OooO00o(c25258OooO0OO);
        this.f67165OooOooo = new CopyOnWriteArrayList<>(oooO0OO.f67116OooOoO0.f67127OooO0o0);
        OooO0o oooO0o = oooO0OO.f67116OooOoO0;
        synchronized (oooO0o) {
            try {
                if (oooO0o.f67130OooOO0 == null) {
                    oooO0o.f67125OooO0Oo.getClass();
                    C25291OooO0oO c25291OooO0oO2 = new C25291OooO0oO();
                    c25291OooO0oO2.f86060Oooo0OO = true;
                    oooO0o.f67130OooOO0 = c25291OooO0oO2;
                }
                c25291OooO0oO = oooO0o.f67130OooOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        OooOOO(c25291OooO0oO);
    }

    public C22253OooOO0o<Drawable> OooO(Integer num) {
        return OooO0OO().OoooOOo(num);
    }

    public <ResourceType> C22253OooOO0o<ResourceType> OooO00o(Class<ResourceType> cls) {
        return new C22253OooOO0o<>(this.f67158OooOo0o, this, cls, this.f67157OooOo);
    }

    public C22253OooOO0o<Bitmap> OooO0O0() {
        return OooO00o(Bitmap.class).OooO00o(f67156Oooo00O);
    }

    public C22253OooOO0o<Drawable> OooO0OO() {
        return OooO00o(Drawable.class);
    }

    public final void OooO0Oo(InterfaceC25293OooO<?> interfaceC25293OooO) {
        if (interfaceC25293OooO == null) {
            return;
        }
        boolean zOooOOOO = OooOOOO(interfaceC25293OooO);
        InterfaceC25288OooO0Oo request = interfaceC25293OooO.getRequest();
        if (zOooOOOO) {
            return;
        }
        OooO0OO oooO0OO = this.f67158OooOo0o;
        synchronized (oooO0OO.f67118OooOoo) {
            try {
                Iterator it = oooO0OO.f67118OooOoo.iterator();
                while (it.hasNext()) {
                    if (((OooOOO0) it.next()).OooOOOO(interfaceC25293OooO)) {
                        return;
                    }
                }
                if (request != null) {
                    interfaceC25293OooO.setRequest(null);
                    request.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C22253OooOO0o<Drawable> OooO0o(Drawable drawable) {
        return OooO0OO().OoooOO0(drawable);
    }

    public final synchronized void OooO0o0() {
        try {
            Iterator it = C25316OooOO0o.OooO0o0(this.f67163OooOoo0.f86021OooOo0o).iterator();
            while (it.hasNext()) {
                OooO0Oo((InterfaceC25293OooO) it.next());
            }
            this.f67163OooOoo0.f86021OooOo0o.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C22253OooOO0o<Drawable> OooO0oO(Uri uri) {
        return OooO0OO().o000oOoO(uri);
    }

    public C22253OooOO0o<Drawable> OooO0oo(File file) {
        return OooO0OO().OoooOOO(file);
    }

    public C22253OooOO0o<Drawable> OooOO0(Object obj) {
        return OooO0OO().OoooOo0(obj);
    }

    public C22253OooOO0o<Drawable> OooOO0O(String str) {
        return OooO0OO().OoooOoO(str);
    }

    public final synchronized void OooOO0o() {
        C25270OooOOOo c25270OooOOOo = this.f67159OooOoO;
        c25270OooOOOo.f86007OooO0OO = true;
        for (InterfaceC25288OooO0Oo interfaceC25288OooO0Oo : C25316OooOO0o.OooO0o0(c25270OooOOOo.f86005OooO00o)) {
            if (interfaceC25288OooO0Oo.isRunning()) {
                interfaceC25288OooO0Oo.pause();
                c25270OooOOOo.f86006OooO0O0.add(interfaceC25288OooO0Oo);
            }
        }
    }

    public synchronized void OooOOO(C25291OooO0oO c25291OooO0oO) {
        this.f67166Oooo000 = c25291OooO0oO.clone().OooO0O0();
    }

    public final synchronized void OooOOO0() {
        C25270OooOOOo c25270OooOOOo = this.f67159OooOoO;
        c25270OooOOOo.f86007OooO0OO = false;
        for (InterfaceC25288OooO0Oo interfaceC25288OooO0Oo : C25316OooOO0o.OooO0o0(c25270OooOOOo.f86005OooO00o)) {
            if (!interfaceC25288OooO0Oo.OooO0o0() && !interfaceC25288OooO0Oo.isRunning()) {
                interfaceC25288OooO0Oo.OooO();
            }
        }
        c25270OooOOOo.f86006OooO0O0.clear();
    }

    public final synchronized boolean OooOOOO(InterfaceC25293OooO<?> interfaceC25293OooO) {
        InterfaceC25288OooO0Oo request = interfaceC25293OooO.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f67159OooOoO.OooO00o(request)) {
            return false;
        }
        this.f67163OooOoo0.f86021OooOo0o.remove(interfaceC25293OooO);
        interfaceC25293OooO.setRequest(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final synchronized void onDestroy() {
        this.f67163OooOoo0.onDestroy();
        OooO0o0();
        C25270OooOOOo c25270OooOOOo = this.f67159OooOoO;
        Iterator it = C25316OooOO0o.OooO0o0(c25270OooOOOo.f86005OooO00o).iterator();
        while (it.hasNext()) {
            c25270OooOOOo.OooO00o((InterfaceC25288OooO0Oo) it.next());
        }
        c25270OooOOOo.f86006OooO0O0.clear();
        this.f67160OooOoO0.OooO0O0(this);
        this.f67160OooOoO0.OooO0O0(this.f67164OooOooO);
        C25316OooOO0o.OooO0o().removeCallbacks(this.f67162OooOoo);
        OooO0OO oooO0OO = this.f67158OooOo0o;
        synchronized (oooO0OO.f67118OooOoo) {
            if (!oooO0OO.f67118OooOoo.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            oooO0OO.f67118OooOoo.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final synchronized void onStart() {
        OooOOO0();
        this.f67163OooOoo0.onStart();
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final synchronized void onStop() {
        this.f67163OooOoo0.onStop();
        OooOO0o();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f67159OooOoO + ", treeNode=" + this.f67161OooOoOO + "}";
    }
}
