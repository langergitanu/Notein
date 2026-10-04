package o0000oOO;

import com.aspose.slides.OooOOO;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0000oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24334OooO0O0 extends AbstractC24338OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f81915OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24333OooO00o f81916OooO0O0;

    /* JADX INFO: renamed from: o0000oOO.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81917OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final CharSequence invoke(Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object> entry) {
            Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object> entry2 = entry;
            OooOOO0.OooO0oO(entry2, "entry");
            Object value = entry2.getValue();
            return OooOOO.OooO0O0(new StringBuilder("  "), entry2.getKey().f81922OooO00o, " = ", value instanceof byte[] ? oOo000Oo.OooOOO.Oooo00o((byte[]) value, ", ", null, 56) : String.valueOf(entry2.getValue()));
        }
    }

    public C24334OooO0O0() {
        this(false, 3);
    }

    @Override // o0000oOO.AbstractC24338OooO0o0
    public final Map<AbstractC24338OooO0o0.OooO00o<?>, Object> OooO00o() {
        C32443OooOOO c32443OooOOO;
        Set<Map.Entry> setEntrySet = this.f81915OooO00o.entrySet();
        int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(setEntrySet, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, size)");
                c32443OooOOO = new C32443OooOOO(key, bArrCopyOf);
            } else {
                c32443OooOOO = new C32443OooOOO(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
        }
        Map<AbstractC24338OooO0o0.OooO00o<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        OooOOO0.OooO0o(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    @Override // o0000oOO.AbstractC24338OooO0o0
    public final <T> boolean OooO0O0(AbstractC24338OooO0o0.OooO00o<T> key) {
        OooOOO0.OooO0oO(key, "key");
        return this.f81915OooO00o.containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0000oOO.AbstractC24338OooO0o0
    public final <T> T OooO0OO(AbstractC24338OooO0o0.OooO00o<T> key) {
        OooOOO0.OooO0oO(key, "key");
        T t = (T) this.f81915OooO00o.get(key);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        T t2 = (T) Arrays.copyOf(bArr, bArr.length);
        OooOOO0.OooO0o(t2, "copyOf(this, size)");
        return t2;
    }

    public final void OooO0o(AbstractC24338OooO0o0.OooO00o key) {
        OooOOO0.OooO0oO(key, "key");
        OooO0o0();
        this.f81915OooO00o.remove(key);
    }

    public final void OooO0o0() {
        if (((AtomicBoolean) this.f81916OooO0O0.f81914OooO00o).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final <T> void OooO0oO(AbstractC24338OooO0o0.OooO00o<T> key, T t) {
        OooOOO0.OooO0oO(key, "key");
        OooO0oo(key, t);
    }

    public final void OooO0oo(AbstractC24338OooO0o0.OooO00o<?> key, Object obj) {
        OooOOO0.OooO0oO(key, "key");
        OooO0o0();
        if (obj == null) {
            OooO0o(key);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f81915OooO00o;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(OooOo.o0OO00O((Set) obj));
            OooOOO0.OooO0o(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof C24334OooO0O0) {
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) obj;
            LinkedHashMap linkedHashMap = c24334OooO0O0.f81915OooO00o;
            LinkedHashMap linkedHashMap2 = this.f81915OooO00o;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = c24334OooO0O0.f81915OooO00o;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                boolean zOooO0O0 = value instanceof byte[] ? (obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2) : OooOOO0.OooO0O0(value, obj2);
                                if (!zOooO0O0) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f81915OooO00o.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return OooOo.o000oOoO(this.f81915OooO00o.entrySet(), ",\n", "{\n", "\n}", OooO00o.f81917OooOo0o, 24);
    }

    public /* synthetic */ C24334OooO0O0(boolean z, int i) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z);
    }

    public C24334OooO0O0(LinkedHashMap linkedHashMap, boolean z) {
        this.f81915OooO00o = linkedHashMap;
        this.f81916OooO0O0 = new C24333OooO00o(z);
    }
}
