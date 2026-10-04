package o000000O;

import java.util.Map;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f81165OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f81166OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f81167OooO0OO;

    public OooO0OO() {
        this(0);
    }

    public final int OooO00o(Object key, int i) {
        OooOOO0.OooO0oO(key, "key");
        int i2 = this.f81167OooO0OO;
        if (i2 == 0) {
            return -1;
        }
        int iOooO00o = OooO00o.OooO00o(this.f81165OooO00o, i2, i);
        if (iOooO00o < 0 || key.equals(this.f81166OooO0O0[iOooO00o << 1])) {
            return iOooO00o;
        }
        int i3 = iOooO00o + 1;
        while (i3 < i2 && this.f81165OooO00o[i3] == i) {
            if (key.equals(this.f81166OooO0O0[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iOooO00o - 1; i4 >= 0 && this.f81165OooO00o[i4] == i; i4--) {
            if (key.equals(this.f81166OooO0O0[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int OooO0O0() {
        int i = this.f81167OooO0OO;
        if (i == 0) {
            return -1;
        }
        int iOooO00o = OooO00o.OooO00o(this.f81165OooO00o, i, 0);
        if (iOooO00o < 0 || this.f81166OooO0O0[iOooO00o << 1] == null) {
            return iOooO00o;
        }
        int i2 = iOooO00o + 1;
        while (i2 < i && this.f81165OooO00o[i2] == 0) {
            if (this.f81166OooO0O0[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iOooO00o - 1; i3 >= 0 && this.f81165OooO00o[i3] == 0; i3--) {
            if (this.f81166OooO0O0[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (!(obj instanceof OooO0OO)) {
                if ((obj instanceof Map) && this.f81167OooO0OO == ((Map) obj).size()) {
                    int i2 = this.f81167OooO0OO;
                    for (0; i < i2; i + 1) {
                        Object[] objArr = this.f81166OooO0O0;
                        int i3 = i << 1;
                        Object obj2 = objArr[i3];
                        Object obj3 = objArr[i3 + 1];
                        Object obj4 = ((Map) obj).get(obj2);
                        if (obj3 == null) {
                            i = (obj4 == null && ((Map) obj).containsKey(obj2)) ? i + 1 : 0;
                        } else if (obj3.equals(obj4)) {
                        }
                    }
                }
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            int i4 = this.f81167OooO0OO;
            if (i4 == oooO0OO.f81167OooO0OO) {
                for (int i5 = 0; i5 < i4; i5++) {
                    Object[] objArr2 = this.f81166OooO0O0;
                    int i6 = i5 << 1;
                    Object obj5 = objArr2[i6];
                    Object obj6 = objArr2[i6 + 1];
                    int iOooO0O0 = obj5 == null ? oooO0OO.OooO0O0() : oooO0OO.OooO00o(obj5, obj5.hashCode());
                    Object obj7 = iOooO0O0 >= 0 ? oooO0OO.f81166OooO0O0[(iOooO0O0 << 1) + 1] : null;
                    if (obj6 == null) {
                        if (obj7 == null) {
                            if ((obj5 == null ? oooO0OO.OooO0O0() : oooO0OO.OooO00o(obj5, obj5.hashCode())) >= 0) {
                            }
                        }
                    } else if (obj6.equals(obj7)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f81165OooO00o;
        Object[] objArr = this.f81166OooO0O0;
        int i = this.f81167OooO0OO;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.f81167OooO0OO;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f81167OooO0OO;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = i3 << 1;
            Object obj = this.f81166OooO0O0[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f81166OooO0O0[i4 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        OooOOO0.OooO0o(string, "buffer.toString()");
        return string;
    }

    public OooO0OO(int i) {
        this.f81165OooO00o = OooO00o.f81157OooO00o;
        this.f81166OooO0O0 = OooO00o.f81158OooO0O0;
        this.f81167OooO0OO = 0;
    }
}
