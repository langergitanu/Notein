package oO0OOo0o;

import java.util.Arrays;
import oO0OOo0o.C33065OooOOOo;

/* JADX INFO: renamed from: oO0OOo0o.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33106OoooOoo<K, V> implements InterfaceC33108Ooooo0o<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f119688OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33108Ooooo0o<K, V>[] f119689OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f119690OooO0OO;

    public C33106OoooOoo(int i, InterfaceC33108Ooooo0o<K, V>[] interfaceC33108Ooooo0oArr, int i2) {
        this.f119688OooO00o = i;
        this.f119689OooO0O0 = interfaceC33108Ooooo0oArr;
        this.f119690OooO0OO = i2;
    }

    public static C33106OoooOoo OooO0OO(C33107Ooooo00 c33107Ooooo00, int i, InterfaceC33108Ooooo0o interfaceC33108Ooooo0o, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = 1 << i4;
        int i6 = (i2 >>> i3) & 31;
        int i7 = 1 << i6;
        InterfaceC33108Ooooo0o interfaceC33108Ooooo0o2 = c33107Ooooo00;
        InterfaceC33108Ooooo0o interfaceC33108Ooooo0o3 = interfaceC33108Ooooo0o;
        if (i5 == i7) {
            C33106OoooOoo c33106OoooOooOooO0OO = OooO0OO(c33107Ooooo00, i, interfaceC33108Ooooo0o, i2, i3 + 5);
            return new C33106OoooOoo(i5, new InterfaceC33108Ooooo0o[]{c33106OoooOooOooO0OO}, c33106OoooOooOooO0OO.f119690OooO0OO);
        }
        if (i4 > i6) {
            interfaceC33108Ooooo0o3 = c33107Ooooo00;
            interfaceC33108Ooooo0o2 = interfaceC33108Ooooo0o;
        }
        return new C33106OoooOoo(i5 | i7, new InterfaceC33108Ooooo0o[]{interfaceC33108Ooooo0o2, interfaceC33108Ooooo0o3}, interfaceC33108Ooooo0o3.size() + interfaceC33108Ooooo0o2.size());
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final InterfaceC33108Ooooo0o OooO00o(C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo, oO00Ooo.OooOOOO oooOOOO, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        int i4 = this.f119688OooO00o;
        int iBitCount = Integer.bitCount((i3 - 1) & i4);
        int i5 = i4 & i3;
        InterfaceC33108Ooooo0o<K, V>[] interfaceC33108Ooooo0oArr = this.f119689OooO0O0;
        int i6 = this.f119690OooO0OO;
        if (i5 != 0) {
            InterfaceC33108Ooooo0o[] interfaceC33108Ooooo0oArr2 = (InterfaceC33108Ooooo0o[]) Arrays.copyOf(interfaceC33108Ooooo0oArr, interfaceC33108Ooooo0oArr.length);
            InterfaceC33108Ooooo0o interfaceC33108Ooooo0oOooO00o = interfaceC33108Ooooo0oArr[iBitCount].OooO00o(c33066OooO0Oo, oooOOOO, i, i2 + 5);
            interfaceC33108Ooooo0oArr2[iBitCount] = interfaceC33108Ooooo0oOooO00o;
            return new C33106OoooOoo(i4, interfaceC33108Ooooo0oArr2, (interfaceC33108Ooooo0oOooO00o.size() + i6) - interfaceC33108Ooooo0oArr[iBitCount].size());
        }
        int i7 = i4 | i3;
        InterfaceC33108Ooooo0o[] interfaceC33108Ooooo0oArr3 = new InterfaceC33108Ooooo0o[interfaceC33108Ooooo0oArr.length + 1];
        System.arraycopy(interfaceC33108Ooooo0oArr, 0, interfaceC33108Ooooo0oArr3, 0, iBitCount);
        interfaceC33108Ooooo0oArr3[iBitCount] = new C33107Ooooo00(c33066OooO0Oo, oooOOOO);
        System.arraycopy(interfaceC33108Ooooo0oArr, iBitCount, interfaceC33108Ooooo0oArr3, iBitCount + 1, interfaceC33108Ooooo0oArr.length - iBitCount);
        return new C33106OoooOoo(i7, interfaceC33108Ooooo0oArr3, i6 + 1);
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final Object OooO0O0(C33065OooOOOo.C33066OooO0Oo c33066OooO0Oo, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        int i4 = this.f119688OooO00o;
        if ((i4 & i3) == 0) {
            return null;
        }
        return this.f119689OooO0O0[Integer.bitCount((i3 - 1) & i4)].OooO0O0(c33066OooO0Oo, i, i2 + 5);
    }

    @Override // oO0OOo0o.InterfaceC33108Ooooo0o
    public final int size() {
        return this.f119690OooO0OO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append("bitmap=" + Integer.toBinaryString(this.f119688OooO00o) + " ");
        for (InterfaceC33108Ooooo0o<K, V> interfaceC33108Ooooo0o : this.f119689OooO0O0) {
            sb.append(interfaceC33108Ooooo0o);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
