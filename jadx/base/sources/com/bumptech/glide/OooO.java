package com.bumptech.glide;

import Oooo0oO.o0Oo0oo;
import androidx.core.util.Pools;
import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.load.data.InterfaceC22256OooO0o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00Ooo0o.InterfaceC25115OooO0Oo;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00Ooo0o.InterfaceC25122OooOO0o;
import o00OoooO.C25190OooOo0O;
import o00OoooO.InterfaceC25186OooOOo;
import o00OoooO.InterfaceC25188OooOOoo;
import o00OoooO.OooOo00;
import o00o00O0.InterfaceC25253OooO0o0;
import o00o00O0.OooO0o;
import o00o00o.C25274OooO00o;
import o00o00o.C25275OooO0O0;
import o00o00o.C25276OooO0OO;
import o00o00o.C25277OooO0Oo;
import o00o00o.C25278OooO0o;
import o00o00o.C25279OooO0o0;
import o00o0O0O.C25321OooO00o;
import o00o0O0O.C25324OooO0O0;
import o00o0O0O.C25325OooO0OO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f67102OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25274OooO00o f67103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25279OooO0o0 f67104OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25278OooO0o f67105OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00o00O0.OooO0o f67106OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.bumptech.glide.load.data.OooO0o f67107OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25275OooO0O0 f67108OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C25321OooO00o.OooO0OO f67110OooOO0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25277OooO0Oo f67109OooO0oo = new C25277OooO0Oo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C25276OooO0OO f67101OooO = new C25276OooO0OO();

    public static class OooO00o extends RuntimeException {
    }

    public static final class OooO0O0 extends OooO00o {
    }

    public static class OooO0OO extends OooO00o {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.OooO$OooO0Oo, reason: case insensitive filesystem */
    public static class C22247OooO0Oo extends OooO00o {
        public C22247OooO0Oo(Class<?> cls) {
            super(o0Oo0oo.OooO0OO("Failed to find result encoder for resource class: ", cls, ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.OooO$OooO0o0, reason: case insensitive filesystem */
    public static class C22248OooO0o0 extends OooO00o {
    }

    public OooO() {
        C25321OooO00o.OooO0OO oooO0OO = new C25321OooO00o.OooO0OO(new Pools.SynchronizedPool(20), new C25324OooO0O0(), new C25325OooO0OO());
        this.f67110OooOO0 = oooO0OO;
        this.f67102OooO00o = new OooOo00(oooO0OO);
        this.f67103OooO0O0 = new C25274OooO00o();
        this.f67104OooO0OO = new C25279OooO0o0();
        this.f67105OooO0Oo = new C25278OooO0o();
        this.f67107OooO0o0 = new com.bumptech.glide.load.data.OooO0o();
        this.f67106OooO0o = new o00o00O0.OooO0o();
        this.f67108OooO0oO = new C25275OooO0O0();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C25279OooO0o0 c25279OooO0o0 = this.f67104OooO0OO;
        synchronized (c25279OooO0o0) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(c25279OooO0o0.f86034OooO00o);
                c25279OooO0o0.f86034OooO00o.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c25279OooO0o0.f86034OooO00o.add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        c25279OooO0o0.f86034OooO00o.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO(String str, Class cls, Class cls2, InterfaceC25121OooOO0O interfaceC25121OooOO0O) {
        C25279OooO0o0 c25279OooO0o0 = this.f67104OooO0OO;
        synchronized (c25279OooO0o0) {
            c25279OooO0o0.OooO00o(str).add(0, new C25279OooO0o0.OooO00o<>(cls, cls2, interfaceC25121OooOO0O));
        }
    }

    public final void OooO00o(Class cls, Class cls2, InterfaceC25188OooOOoo interfaceC25188OooOOoo) {
        OooOo00 oooOo00 = this.f67102OooO00o;
        synchronized (oooOo00) {
            C25190OooOo0O c25190OooOo0O = oooOo00.f85748OooO00o;
            synchronized (c25190OooOo0O) {
                try {
                    C25190OooOo0O.OooO0O0 oooO0O0 = new C25190OooOo0O.OooO0O0(cls, cls2, interfaceC25188OooOOoo);
                    ArrayList arrayList = c25190OooOo0O.f85754OooO00o;
                    arrayList.add(arrayList.size(), oooO0O0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            oooOo00.f85749OooO0O0.f85750OooO00o.clear();
        }
    }

    public final void OooO0O0(Class cls, InterfaceC25115OooO0Oo interfaceC25115OooO0Oo) {
        C25274OooO00o c25274OooO00o = this.f67103OooO0O0;
        synchronized (c25274OooO00o) {
            c25274OooO00o.f86022OooO00o.add(new C25274OooO00o.C19691OooO00o(cls, interfaceC25115OooO0Oo));
        }
    }

    public final void OooO0OO(Class cls, InterfaceC25122OooOO0o interfaceC25122OooOO0o) {
        C25278OooO0o c25278OooO0o = this.f67105OooO0Oo;
        synchronized (c25278OooO0o) {
            c25278OooO0o.f86031OooO00o.add(new C25278OooO0o.OooO00o(cls, interfaceC25122OooOO0o));
        }
    }

    public final void OooO0Oo(String str, Class cls, Class cls2, InterfaceC25121OooOO0O interfaceC25121OooOO0O) {
        C25279OooO0o0 c25279OooO0o0 = this.f67104OooO0OO;
        synchronized (c25279OooO0o0) {
            c25279OooO0o0.OooO00o(str).add(new C25279OooO0o0.OooO00o<>(cls, cls2, interfaceC25121OooOO0O));
        }
    }

    public final <Model> List<InterfaceC25186OooOOo<Model, ?>> OooO0o(Model model) {
        List<InterfaceC25186OooOOo<Model, ?>> listUnmodifiableList;
        OooOo00 oooOo00 = this.f67102OooO00o;
        oooOo00.getClass();
        Class<?> cls = model.getClass();
        synchronized (oooOo00) {
            OooOo00.OooO00o.C19684OooO00o c19684OooO00o = (OooOo00.OooO00o.C19684OooO00o) oooOo00.f85749OooO0O0.f85750OooO00o.get(cls);
            listUnmodifiableList = c19684OooO00o == null ? null : c19684OooO00o.f85751OooO00o;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(oooOo00.f85748OooO00o.OooO00o(cls));
                if (((OooOo00.OooO00o.C19684OooO00o) oooOo00.f85749OooO0O0.f85750OooO00o.put(cls, new OooOo00.OooO00o.C19684OooO00o(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new OooO0OO("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = listUnmodifiableList.size();
        List<InterfaceC25186OooOOo<Model, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC25186OooOOo<Model, ?> interfaceC25186OooOOo = listUnmodifiableList.get(i);
            if (interfaceC25186OooOOo.OooO0O0(model)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(interfaceC25186OooOOo);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new OooO0OO("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + model);
    }

    public final ArrayList OooO0o0() {
        ArrayList arrayList;
        C25275OooO0O0 c25275OooO0O0 = this.f67108OooO0oO;
        synchronized (c25275OooO0O0) {
            arrayList = (ArrayList) c25275OooO0O0.f86025OooO00o;
        }
        if (arrayList.isEmpty()) {
            throw new OooO0O0("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final <X> InterfaceC22256OooO0o0<X> OooO0oO(X x) {
        InterfaceC22256OooO0o0<X> interfaceC22256OooO0o0OooO0O0;
        com.bumptech.glide.load.data.OooO0o oooO0o = this.f67107OooO0o0;
        synchronized (oooO0o) {
            try {
                C21929Ooooo0o.OooO0O0(x);
                InterfaceC22256OooO0o0.OooO00o oooO00o = (InterfaceC22256OooO0o0.OooO00o) oooO0o.f67202OooO00o.get(x.getClass());
                if (oooO00o == null) {
                    Iterator it = oooO0o.f67202OooO00o.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC22256OooO0o0.OooO00o oooO00o2 = (InterfaceC22256OooO0o0.OooO00o) it.next();
                        if (oooO00o2.OooO00o().isAssignableFrom(x.getClass())) {
                            oooO00o = oooO00o2;
                            break;
                        }
                    }
                }
                if (oooO00o == null) {
                    oooO00o = com.bumptech.glide.load.data.OooO0o.f67201OooO0O0;
                }
                interfaceC22256OooO0o0OooO0O0 = oooO00o.OooO0O0(x);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC22256OooO0o0OooO0O0;
    }

    public final void OooO0oo(io.ktor.utils.p616io.internal.OooOO0O oooOO0O) {
        C25278OooO0o c25278OooO0o = this.f67105OooO0Oo;
        synchronized (c25278OooO0o) {
            c25278OooO0o.f86031OooO00o.add(0, new C25278OooO0o.OooO00o(o00Ooo0O.OooOO0.class, oooOO0O));
        }
    }

    public final void OooOO0(InterfaceC22256OooO0o0.OooO00o oooO00o) {
        com.bumptech.glide.load.data.OooO0o oooO0o = this.f67107OooO0o0;
        synchronized (oooO0o) {
            oooO0o.f67202OooO00o.put(oooO00o.OooO00o(), oooO00o);
        }
    }

    public final void OooOO0O(Class cls, Class cls2, InterfaceC25253OooO0o0 interfaceC25253OooO0o0) {
        o00o00O0.OooO0o oooO0o = this.f67106OooO0o;
        synchronized (oooO0o) {
            oooO0o.f85980OooO00o.add(new OooO0o.OooO00o(cls, cls2, interfaceC25253OooO0o0));
        }
    }
}
