package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.network.embedded.C18437z2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o000ooo0.OooO0OO;
import oO00ooO.C32443OooOOO;
import oO0o0Oo.InterfaceC33767OoooOoo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: androidx.lifecycle.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22008OoooOo0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Class<? extends Object>[] f65644OooO0o = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f65645OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap f65646OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f65647OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f65648OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO.OooO0O0 f65649OooO0o0;

    /* JADX INFO: renamed from: androidx.lifecycle.OoooOo0$OooO00o */
    public static final class OooO00o {
        public static C22008OoooOo0 OooO00o(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C22008OoooOo0();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.OooOOO0.OooO0o(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new C22008OoooOo0(map);
            }
            ClassLoader classLoader = C22008OoooOo0.class.getClassLoader();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C18437z2.f56756j);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new C22008OoooOo0(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.OoooOo0$OooO0O0 */
    public static final class OooO0O0<T> extends C21996Oooo0OO<T> {
    }

    public C22008OoooOo0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f65645OooO00o = linkedHashMap;
        this.f65646OooO0O0 = new LinkedHashMap();
        this.f65647OooO0OO = new LinkedHashMap();
        this.f65648OooO0Oo = new LinkedHashMap();
        this.f65649OooO0o0 = new OooO0OO.OooO0O0() { // from class: androidx.lifecycle.OoooOOo
            @Override // o000ooo0.OooO0OO.OooO0O0
            public final Bundle OooO00o() {
                return C22008OoooOo0.OooO00o(this.f65643OooO00o);
            }
        };
        linkedHashMap.putAll(map);
    }

    public static Bundle OooO00o(C22008OoooOo0 this$0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
        Iterator it = C34444Oooo0O0.OooOOO0(this$0.f65646OooO0O0).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f65645OooO00o;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return BundleKt.bundleOf(new C32443OooOOO(UserMetadata.KEYDATA_FILENAME, arrayList), new C32443OooOOO(C18437z2.f56756j, arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle bundleOooO00o = ((OooO0OO.OooO0O0) entry.getValue()).OooO00o();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            if (bundleOooO00o != null) {
                Class<? extends Object>[] clsArr = f65644OooO0o;
                for (int i = 0; i < 29; i++) {
                    Class<? extends Object> cls = clsArr[i];
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(cls);
                    if (!cls.isInstance(bundleOooO00o)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleOooO00o.getClass() + " into saved state");
            }
            Object obj = this$0.f65647OooO0OO.get(key);
            C21996Oooo0OO c21996Oooo0OO = obj instanceof C21996Oooo0OO ? (C21996Oooo0OO) obj : null;
            if (c21996Oooo0OO != null) {
                c21996Oooo0OO.OooOO0(bundleOooO00o);
            } else {
                linkedHashMap.put(key, bundleOooO00o);
            }
            InterfaceC33767OoooOoo interfaceC33767OoooOoo = (InterfaceC33767OoooOoo) this$0.f65648OooO0Oo.get(key);
            if (interfaceC33767OoooOoo != null) {
                interfaceC33767OoooOoo.setValue(bundleOooO00o);
            }
        }
    }

    public final <T> T OooO0O0(String str) {
        LinkedHashMap linkedHashMap = this.f65645OooO00o;
        try {
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            this.f65648OooO0Oo.remove(str);
            return null;
        }
    }

    public C22008OoooOo0() {
        this.f65645OooO00o = new LinkedHashMap();
        this.f65646OooO0O0 = new LinkedHashMap();
        this.f65647OooO0OO = new LinkedHashMap();
        this.f65648OooO0Oo = new LinkedHashMap();
        this.f65649OooO0o0 = new OooO0OO.OooO0O0() { // from class: androidx.lifecycle.OoooOOo
            @Override // o000ooo0.OooO0OO.OooO0O0
            public final Bundle OooO00o() {
                return C22008OoooOo0.OooO00o(this.f65643OooO00o);
            }
        };
    }
}
