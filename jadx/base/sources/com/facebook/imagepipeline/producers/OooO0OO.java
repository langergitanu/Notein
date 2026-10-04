package com.facebook.imagepipeline.producers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import o00o0Ooo.C25430OooO0oO;
import o00oo0O.EnumC25653OooO0OO;
import o00oo0Oo.InterfaceC25702OooOOoo;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class OooO0OO implements InterfaceC22288OoooO {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final C25430OooO0oO f67282Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final Object f67283Oooo0O0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f67284OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C25763OooO00o f67285OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Object f67286OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o000oOoO f67287OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C25763OooO00o.OooO0OO f67288OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f67289OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final HashMap f67290OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public EnumC25653OooO0OO f67291OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f67292OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f67293Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ArrayList f67294Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final InterfaceC25702OooOOoo f67295Oooo00o;

    static {
        int i = C25430OooO0oO.f86700OooOo0o;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, "id", "uri_source");
        f67282Oooo0 = new C25430OooO0oO(hashSet);
        f67283Oooo0O0 = new Object();
    }

    public OooO0OO(C25763OooO00o c25763OooO00o, String str, String str2, o000oOoO o000oooo2, Object obj, C25763OooO00o.OooO0OO oooO0OO, boolean z, boolean z2, EnumC25653OooO0OO enumC25653OooO0OO, InterfaceC25702OooOOoo interfaceC25702OooOOoo) {
        this.f67285OooOo0o = c25763OooO00o;
        this.f67284OooOo = str;
        HashMap map = new HashMap();
        this.f67290OooOoo0 = map;
        map.put("id", str);
        map.put("uri_source", c25763OooO00o == null ? "null-request" : c25763OooO00o.f87911OooO0O0);
        this.f67287OooOoO0 = o000oooo2;
        this.f67286OooOoO = obj == null ? f67283Oooo0O0 : obj;
        this.f67288OooOoOO = oooO0OO;
        this.f67289OooOoo = z;
        this.f67291OooOooO = enumC25653OooO0OO;
        this.f67292OooOooo = z2;
        this.f67293Oooo000 = false;
        this.f67294Oooo00O = new ArrayList();
        this.f67295Oooo00o = interfaceC25702OooOOoo;
    }

    public static void OooO0O0(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC22292OoooOO0) it.next()).OooO00o();
        }
    }

    public static void OooO0Oo(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC22292OoooOO0) it.next()).OooO0OO();
        }
    }

    public static void OooO0o(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC22292OoooOO0) it.next()).OooO0Oo();
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final Object OooO00o() {
        return this.f67286OooOoO;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final void OooO0OO(C22260OooO0Oo c22260OooO0Oo) {
        boolean z;
        synchronized (this) {
            this.f67294Oooo00O.add(c22260OooO0Oo);
            z = this.f67293Oooo000;
        }
        if (z) {
            c22260OooO0Oo.OooO0O0();
        }
    }

    public final void OooO0oO() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.f67293Oooo000) {
                arrayList = null;
            } else {
                this.f67293Oooo000 = true;
                arrayList = new ArrayList(this.f67294Oooo00O);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC22292OoooOO0) it.next()).OooO0O0();
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final InterfaceC25702OooOOoo OooOOO0() {
        return this.f67295Oooo00o;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final o000oOoO OooOOo0() {
        return this.f67287OooOoO0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final C25763OooO00o OooOOoo() {
        return this.f67285OooOo0o;
    }

    @Override // o00oOoO.InterfaceC25615OooO00o
    public final void OooOooo(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Oooo000(entry.getValue(), entry.getKey());
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final void Oooo0(String str) {
        Oooo00o(str, "default");
    }

    @Override // o00oOoO.InterfaceC25615OooO00o
    public final void Oooo000(Object obj, String str) {
        if (f67282Oooo0.contains(str)) {
            return;
        }
        this.f67290OooOoo0.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final void Oooo00o(String str, String str2) {
        HashMap map = this.f67290OooOoo0;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final synchronized boolean Oooo0OO() {
        return this.f67292OooOooo;
    }

    @Override // o00oOoO.InterfaceC25615OooO00o
    public final Map<String, Object> getExtras() {
        return this.f67290OooOoo0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final String getId() {
        return this.f67284OooOo;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final synchronized EnumC25653OooO0OO getPriority() {
        return this.f67291OooOooO;
    }

    @Override // o00oOoO.InterfaceC25615OooO00o
    public final <T> T o00Oo0(String str) {
        return (T) this.f67290OooOoo0.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final C25763OooO00o.OooO0OO o0Oo0oo() {
        return this.f67288OooOoOO;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22288OoooO
    public final synchronized boolean ooOO() {
        return this.f67289OooOoo;
    }
}
