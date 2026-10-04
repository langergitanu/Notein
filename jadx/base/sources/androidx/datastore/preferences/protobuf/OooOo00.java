package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import androidx.datastore.preferences.protobuf.C21808OooOoo;
import androidx.datastore.preferences.protobuf.OooOo00.OooO00o;
import androidx.datastore.preferences.protobuf.o0OoOo0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00<T extends OooO00o<T>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOo00<?> f64475OooO0Oo = new OooOo00<>(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21839Ooooooo f64476OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f64477OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f64478OooO0OO;

    public interface OooO00o<T extends OooO00o<T>> extends Comparable<T> {
        o00oO0O getLiteJavaType();
    }

    public OooOo00() {
        int i = o0OoOo0.f64590OooOoo0;
        this.f64476OooO00o = new C21839Ooooooo();
    }

    public static int OooO0O0(EnumC21841o00oO0o enumC21841o00oO0o, int i, Object obj) {
        int serializedSize;
        int iOooO;
        int iOooO0oo = AbstractC21794OooOO0o.OooO0oo(i);
        if (enumC21841o00oO0o == EnumC21841o00oO0o.f64576OooOoO) {
            iOooO0oo *= 2;
        }
        int iOooOO0 = 4;
        switch (enumC21841o00oO0o.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                iOooOO0 = 8;
                return iOooOO0 + iOooO0oo;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC21794OooOO0o.f64440OooO0O0;
                return iOooOO0 + iOooO0oo;
            case 2:
                iOooOO0 = AbstractC21794OooOO0o.OooOO0(((Long) obj).longValue());
                return iOooOO0 + iOooO0oo;
            case 3:
                iOooOO0 = AbstractC21794OooOO0o.OooOO0(((Long) obj).longValue());
                return iOooOO0 + iOooO0oo;
            case 4:
                iOooOO0 = AbstractC21794OooOO0o.OooOO0(((Integer) obj).intValue());
                return iOooOO0 + iOooO0oo;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC21794OooOO0o.f64440OooO0O0;
                iOooOO0 = 8;
                return iOooOO0 + iOooO0oo;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC21794OooOO0o.f64440OooO0O0;
                return iOooOO0 + iOooO0oo;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC21794OooOO0o.f64440OooO0O0;
                iOooOO0 = 1;
                return iOooOO0 + iOooO0oo;
            case 8:
                iOooOO0 = obj instanceof OooO ? AbstractC21794OooOO0o.OooO0OO((OooO) obj) : AbstractC21794OooOO0o.OooO0oO((String) obj);
                return iOooOO0 + iOooO0oo;
            case 9:
                Logger logger6 = AbstractC21794OooOO0o.f64440OooO0O0;
                iOooOO0 = ((InterfaceC21822OoooO0) obj).getSerializedSize();
                return iOooOO0 + iOooO0oo;
            case 10:
                if (obj instanceof C21808OooOoo) {
                    iOooOO0 = AbstractC21794OooOO0o.OooO0Oo((C21808OooOoo) obj);
                    return iOooOO0 + iOooO0oo;
                }
                Logger logger7 = AbstractC21794OooOO0o.f64440OooO0O0;
                serializedSize = ((InterfaceC21822OoooO0) obj).getSerializedSize();
                iOooO = AbstractC21794OooOO0o.OooO(serializedSize);
                iOooOO0 = iOooO + serializedSize;
                return iOooOO0 + iOooO0oo;
            case 11:
                if (obj instanceof OooO) {
                    iOooOO0 = AbstractC21794OooOO0o.OooO0OO((OooO) obj);
                    return iOooOO0 + iOooO0oo;
                }
                Logger logger8 = AbstractC21794OooOO0o.f64440OooO0O0;
                serializedSize = ((byte[]) obj).length;
                iOooO = AbstractC21794OooOO0o.OooO(serializedSize);
                iOooOO0 = iOooO + serializedSize;
                return iOooOO0 + iOooO0oo;
            case 12:
                iOooOO0 = AbstractC21794OooOO0o.OooO(((Integer) obj).intValue());
                return iOooOO0 + iOooO0oo;
            case 13:
                iOooOO0 = obj instanceof C21805OooOoO.OooO00o ? AbstractC21794OooOO0o.OooOO0(((C21805OooOoO.OooO00o) obj).getNumber()) : AbstractC21794OooOO0o.OooOO0(((Integer) obj).intValue());
                return iOooOO0 + iOooO0oo;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = AbstractC21794OooOO0o.f64440OooO0O0;
                return iOooOO0 + iOooO0oo;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = AbstractC21794OooOO0o.f64440OooO0O0;
                iOooOO0 = 8;
                return iOooOO0 + iOooO0oo;
            case 16:
                iOooOO0 = AbstractC21794OooOO0o.OooO0o0(((Integer) obj).intValue());
                return iOooOO0 + iOooO0oo;
            case 17:
                iOooOO0 = AbstractC21794OooOO0o.OooO0o(((Long) obj).longValue());
                return iOooOO0 + iOooO0oo;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int OooO0OO(OooO00o<?> oooO00o, Object obj) {
        oooO00o.getClass();
        return OooO0O0(null, 0, obj);
    }

    public static int OooO0Oo(Map.Entry entry) {
        OooO00o oooO00o = (OooO00o) entry.getKey();
        entry.getValue();
        oooO00o.getLiteJavaType();
        throw null;
    }

    public static <T extends OooO00o<T>> boolean OooO0o(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    public static void OooOO0O(AbstractC21794OooOO0o abstractC21794OooOO0o, EnumC21841o00oO0o enumC21841o00oO0o, int i, Object obj) throws IOException {
        if (enumC21841o00oO0o == EnumC21841o00oO0o.f64576OooOoO) {
            abstractC21794OooOO0o.OooOoo(i, 3);
            ((InterfaceC21822OoooO0) obj).OooO0O0(abstractC21794OooOO0o);
            abstractC21794OooOO0o.OooOoo(i, 4);
        }
        abstractC21794OooOO0o.OooOoo(i, enumC21841o00oO0o.f64580OooOo);
        switch (enumC21841o00oO0o.ordinal()) {
            case 0:
                abstractC21794OooOO0o.OooOo00(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC21794OooOO0o.OooOOo(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC21794OooOO0o.Oooo00O(((Long) obj).longValue());
                break;
            case 3:
                abstractC21794OooOO0o.Oooo00O(((Long) obj).longValue());
                break;
            case 4:
                abstractC21794OooOO0o.OooOo0O(((Integer) obj).intValue());
                break;
            case 5:
                abstractC21794OooOO0o.OooOo00(((Long) obj).longValue());
                break;
            case 6:
                abstractC21794OooOO0o.OooOOo(((Integer) obj).intValue());
                break;
            case 7:
                abstractC21794OooOO0o.OooOO0o(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof OooO)) {
                    abstractC21794OooOO0o.OooOoo0((String) obj);
                } else {
                    abstractC21794OooOO0o.OooOOOo((OooO) obj);
                }
                break;
            case 9:
                ((InterfaceC21822OoooO0) obj).OooO0O0(abstractC21794OooOO0o);
                break;
            case 10:
                abstractC21794OooOO0o.OooOo((InterfaceC21822OoooO0) obj);
                break;
            case 11:
                if (!(obj instanceof OooO)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC21794OooOO0o.OooOOO(bArr.length, bArr);
                } else {
                    abstractC21794OooOO0o.OooOOOo((OooO) obj);
                }
                break;
            case 12:
                abstractC21794OooOO0o.OooOooo(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof C21805OooOoO.OooO00o)) {
                    abstractC21794OooOO0o.OooOo0O(((Integer) obj).intValue());
                } else {
                    abstractC21794OooOO0o.OooOo0O(((C21805OooOoO.OooO00o) obj).getNumber());
                }
                break;
            case 14:
                abstractC21794OooOO0o.OooOOo(((Integer) obj).intValue());
                break;
            case 15:
                abstractC21794OooOO0o.OooOo00(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC21794OooOO0o.OooOooo((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC21794OooOO0o.Oooo00O((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void OooO(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        boolean z = entry.getValue() instanceof C21808OooOoo;
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final OooOo00<T> clone() {
        OooOo00<T> oooOo00 = new OooOo00<>();
        C21839Ooooooo c21839Ooooooo = this.f64476OooO00o;
        if (c21839Ooooooo.f64592OooOo0o.size() > 0) {
            Map.Entry<OooO00o<Object>, Object> entryOooO0Oo = c21839Ooooooo.OooO0Oo(0);
            oooOo00.OooOO0(entryOooO0Oo.getKey(), entryOooO0Oo.getValue());
            throw null;
        }
        Iterator it = c21839Ooooooo.OooO0o0().iterator();
        if (!it.hasNext()) {
            oooOo00.f64478OooO0OO = this.f64478OooO0OO;
            return oooOo00;
        }
        Map.Entry entry = (Map.Entry) it.next();
        oooOo00.OooOO0((OooO00o) entry.getKey(), entry.getValue());
        throw null;
    }

    public final boolean OooO0o0() {
        C21839Ooooooo c21839Ooooooo = this.f64476OooO00o;
        if (c21839Ooooooo.f64592OooOo0o.size() > 0) {
            OooO0o(c21839Ooooooo.OooO0Oo(0));
            throw null;
        }
        Iterator it = c21839Ooooooo.OooO0o0().iterator();
        if (!it.hasNext()) {
            return true;
        }
        OooO0o((Map.Entry) it.next());
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> OooO0oO() {
        C21839Ooooooo c21839Ooooooo = this.f64476OooO00o;
        if (c21839Ooooooo.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (!this.f64478OooO0OO) {
            return ((o0OoOo0.OooO0OO) c21839Ooooooo.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((o0OoOo0.OooO0OO) c21839Ooooooo.entrySet()).iterator();
        C21808OooOoo.OooO0O0 oooO0O0 = new C21808OooOoo.OooO0O0();
        oooO0O0.f64488OooOo0o = it;
        return oooO0O0;
    }

    public final void OooO0oo() {
        if (this.f64477OooO0O0) {
            return;
        }
        C21839Ooooooo c21839Ooooooo = this.f64476OooO00o;
        int size = c21839Ooooooo.f64592OooOo0o.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<OooO00o<Object>, Object> entryOooO0Oo = c21839Ooooooo.OooO0Oo(i);
            if (entryOooO0Oo.getValue() instanceof OooOo) {
                OooOo oooOo = (OooOo) entryOooO0Oo.getValue();
                oooOo.getClass();
                C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
                c21834OooooOO.getClass();
                c21834OooooOO.OooO00o(oooOo.getClass()).makeImmutable(oooOo);
                oooOo.OooOO0O();
            }
        }
        c21839Ooooooo.OooO0oO();
        this.f64477OooO0O0 = true;
    }

    public final void OooOO0(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = C21805OooOoO.f64482OooO00o;
        obj.getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOo00) {
            return this.f64476OooO00o.equals(((OooOo00) obj).f64476OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f64476OooO00o.hashCode();
    }

    public OooOo00(int i) {
        int i2 = o0OoOo0.f64590OooOoo0;
        this.f64476OooO00o = new C21839Ooooooo();
        OooO0oo();
        OooO0oo();
    }
}
