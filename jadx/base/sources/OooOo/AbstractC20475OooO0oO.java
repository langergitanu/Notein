package OooOo;

/* JADX INFO: renamed from: OooOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20475OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int[] f58478OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f58479OooO0O0;

    public final int OooO00o(int i) {
        if (i >= 0 && i < this.f58479OooO0O0) {
            return this.f58478OooO00o[i];
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index ", " must be in 0..");
        sbOooO0OO.append(this.f58479OooO0O0 - 1);
        throw new IndexOutOfBoundsException(sbOooO0OO.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC20475OooO0oO) {
            AbstractC20475OooO0oO abstractC20475OooO0oO = (AbstractC20475OooO0oO) obj;
            int i = abstractC20475OooO0oO.f58479OooO0O0;
            int i2 = this.f58479OooO0O0;
            if (i == i2) {
                int[] iArr = this.f58478OooO00o;
                int[] iArr2 = abstractC20475OooO0oO.f58478OooO00o;
                oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, i2);
                int i3 = OooO2.f116812OooOo0o;
                int i4 = OooO2.f116811OooOo;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f58478OooO00o;
        int i = this.f58479OooO0O0;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f58478OooO00o;
        int i = this.f58479OooO0O0;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
