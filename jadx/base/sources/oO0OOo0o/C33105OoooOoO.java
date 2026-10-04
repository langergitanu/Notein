package oO0OOo0o;

import java.util.Arrays;
import oO0OOo0o.C33065OooOOOo;

/* JADX INFO: renamed from: oO0OOo0o.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33105OoooOoO<K, V> implements InterfaceC33108Ooooo0o<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final K[] f119686OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final V[] f119687OooO0O0;

    public C33105OoooOoO(K[] kArr, V[] vArr) {
        this.f119686OooO00o = kArr;
        this.f119687OooO0O0 = vArr;
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final InterfaceC33108Ooooo0o OooO00o(C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo, oO00Ooo.OooOOOO oooOOOO, int i, int i2) {
        K[] kArr = this.f119686OooO00o;
        int i3 = 0;
        int iHashCode = kArr[0].hashCode();
        if (iHashCode != i) {
            return C33106OoooOoo.OooO0OO(new C33107Ooooo00(c33066OooO0Oo, oooOOOO), i, this, iHashCode, i2);
        }
        while (true) {
            if (i3 >= kArr.length) {
                i3 = -1;
                break;
            }
            if (kArr[i3] == c33066OooO0Oo) {
                break;
            }
            i3++;
        }
        V[] vArr = this.f119687OooO0O0;
        if (i3 != -1) {
            Object[] objArrCopyOf = Arrays.copyOf(kArr, kArr.length);
            Object[] objArrCopyOf2 = Arrays.copyOf(vArr, kArr.length);
            objArrCopyOf[i3] = c33066OooO0Oo;
            objArrCopyOf2[i3] = oooOOOO;
            return new C33105OoooOoO(objArrCopyOf, objArrCopyOf2);
        }
        Object[] objArrCopyOf3 = Arrays.copyOf(kArr, kArr.length + 1);
        Object[] objArrCopyOf4 = Arrays.copyOf(vArr, kArr.length + 1);
        objArrCopyOf3[kArr.length] = c33066OooO0Oo;
        objArrCopyOf4[kArr.length] = oooOOOO;
        return new C33105OoooOoO(objArrCopyOf3, objArrCopyOf4);
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final Object OooO0O0(C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo, int i, int i2) {
        int i3 = 0;
        while (true) {
            K[] kArr = this.f119686OooO00o;
            if (i3 >= kArr.length) {
                return null;
            }
            if (kArr[i3] == c33066OooO0Oo) {
                return this.f119687OooO0O0[i3];
            }
            i3++;
        }
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final int size() {
        return this.f119687OooO0O0.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        int i = 0;
        while (true) {
            V[] vArr = this.f119687OooO0O0;
            if (i >= vArr.length) {
                sb.append(")");
                return sb.toString();
            }
            sb.append("(key=");
            sb.append(this.f119686OooO00o[i]);
            sb.append(" value=");
            sb.append(vArr[i]);
            sb.append(") ");
            i++;
        }
    }
}
