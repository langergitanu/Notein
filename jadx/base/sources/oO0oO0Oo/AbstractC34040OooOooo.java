package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22206OooOOo0;
import com.huawei.hms.network.embedded.C18416x7;
import java.io.IOException;
import java.util.Iterator;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34040OooOooo extends AbstractC34036OooOoOO implements Iterable {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f122374OooOoO0 = new OooO00o(AbstractC34040OooOooo.class);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f122375OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34019OooO0oO[] f122376OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOooo$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
            return abstractC34039OooOooO.OooOoO();
        }
    }

    public AbstractC34040OooOooo() {
        this.f122376OooOo0o = C34020OooO0oo.f122324OooO0Oo;
        this.f122375OooOo = true;
    }

    public static AbstractC34040OooOooo OooOOo(Object obj) {
        if (obj == null || (obj instanceof AbstractC34040OooOooo)) {
            return (AbstractC34040OooOooo) obj;
        }
        if (obj instanceof InterfaceC34019OooO0oO) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = ((InterfaceC34019OooO0oO) obj).OooO0o();
            if (abstractC34036OooOoOOOooO0o instanceof AbstractC34040OooOooo) {
                return (AbstractC34040OooOooo) abstractC34036OooOoOOOooO0o;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC34040OooOooo) f122374OooOoO0.OooO0O0((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct set from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in getInstance: "));
    }

    public static byte[] OooOOo0(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        try {
            return interfaceC34019OooO0oO.OooO0o().OooO0oO();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static boolean OooOOoo(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & (-33);
        int i2 = bArr2[0] & (-33);
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (abstractC34036OooOoOO instanceof AbstractC34040OooOooo) {
            AbstractC34040OooOooo abstractC34040OooOooo = (AbstractC34040OooOooo) abstractC34036OooOoOO;
            int length = this.f122376OooOo0o.length;
            if (abstractC34040OooOooo.f122376OooOo0o.length == length) {
                C34078o0ooOO0 c34078o0ooOO0 = (C34078o0ooOO0) OooOOOO();
                C34078o0ooOO0 c34078o0ooOO02 = (C34078o0ooOO0) abstractC34040OooOooo.OooOOOO();
                for (int i = 0; i < length; i++) {
                    AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = c34078o0ooOO0.f122376OooOo0o[i].OooO0o();
                    AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o2 = c34078o0ooOO02.f122376OooOo0o[i].OooO0o();
                    if (abstractC34036OooOoOOOooO0o == abstractC34036OooOoOOOooO0o2 || abstractC34036OooOoOOOooO0o.OooO0oo(abstractC34036OooOoOOOooO0o2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return true;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        int i;
        boolean z = this.f122375OooOo;
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122376OooOo0o;
        if (!z) {
            interfaceC34019OooO0oOArr = (InterfaceC34019OooO0oO[]) interfaceC34019OooO0oOArr.clone();
            int length = interfaceC34019OooO0oOArr.length;
            if (length >= 2) {
                InterfaceC34019OooO0oO interfaceC34019OooO0oO = interfaceC34019OooO0oOArr[0];
                InterfaceC34019OooO0oO interfaceC34019OooO0oO2 = interfaceC34019OooO0oOArr[1];
                byte[] bArrOooOOo0 = OooOOo0(interfaceC34019OooO0oO);
                byte[] bArrOooOOo02 = OooOOo0(interfaceC34019OooO0oO2);
                if (OooOOoo(bArrOooOOo02, bArrOooOOo0)) {
                    interfaceC34019OooO0oO2 = interfaceC34019OooO0oO;
                    interfaceC34019OooO0oO = interfaceC34019OooO0oO2;
                    bArrOooOOo02 = bArrOooOOo0;
                    bArrOooOOo0 = bArrOooOOo02;
                }
                for (int i2 = 2; i2 < length; i2++) {
                    InterfaceC34019OooO0oO interfaceC34019OooO0oO3 = interfaceC34019OooO0oOArr[i2];
                    byte[] bArrOooOOo03 = OooOOo0(interfaceC34019OooO0oO3);
                    if (OooOOoo(bArrOooOOo02, bArrOooOOo03)) {
                        interfaceC34019OooO0oOArr[i2 - 2] = interfaceC34019OooO0oO;
                        interfaceC34019OooO0oO = interfaceC34019OooO0oO2;
                        bArrOooOOo0 = bArrOooOOo02;
                        interfaceC34019OooO0oO2 = interfaceC34019OooO0oO3;
                        bArrOooOOo02 = bArrOooOOo03;
                    } else if (OooOOoo(bArrOooOOo0, bArrOooOOo03)) {
                        interfaceC34019OooO0oOArr[i2 - 2] = interfaceC34019OooO0oO;
                        interfaceC34019OooO0oO = interfaceC34019OooO0oO3;
                        bArrOooOOo0 = bArrOooOOo03;
                    } else {
                        int i3 = i2 - 1;
                        while (true) {
                            i = i3 - 1;
                            if (i <= 0) {
                                break;
                            }
                            InterfaceC34019OooO0oO interfaceC34019OooO0oO4 = interfaceC34019OooO0oOArr[i3 - 2];
                            if (OooOOoo(OooOOo0(interfaceC34019OooO0oO4), bArrOooOOo03)) {
                                break;
                            }
                            interfaceC34019OooO0oOArr[i] = interfaceC34019OooO0oO4;
                            i3 = i;
                        }
                        interfaceC34019OooO0oOArr[i] = interfaceC34019OooO0oO3;
                    }
                }
                interfaceC34019OooO0oOArr[length - 2] = interfaceC34019OooO0oO;
                interfaceC34019OooO0oOArr[length - 1] = interfaceC34019OooO0oO2;
            }
        }
        C34078o0ooOO0 c34078o0ooOO0 = new C34078o0ooOO0(true, interfaceC34019OooO0oOArr);
        c34078o0ooOO0.f122446OooOoO = -1;
        return c34078o0ooOO0;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        return new o00000OO(this.f122375OooOo, this.f122376OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122376OooOo0o;
        int length = interfaceC34019OooO0oOArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += interfaceC34019OooO0oOArr[length].OooO0o().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC34019OooO0oO> iterator() {
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122376OooOo0o;
        return new C34332OooO00o.C20351OooO00o(interfaceC34019OooO0oOArr.length < 1 ? C34020OooO0oo.f122324OooO0Oo : (InterfaceC34019OooO0oO[]) interfaceC34019OooO0oOArr.clone());
    }

    public final String toString() {
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122376OooOo0o;
        int length = interfaceC34019OooO0oOArr.length;
        if (length == 0) {
            return C18416x7.f56644n;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(interfaceC34019OooO0oOArr[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC34040OooOooo(C34020OooO0oo c34020OooO0oo) {
        if (c34020OooO0oo == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArrOooO0OO = c34020OooO0oo.OooO0OO();
        this.f122376OooOo0o = interfaceC34019OooO0oOArrOooO0OO;
        this.f122375OooOo = interfaceC34019OooO0oOArrOooO0OO.length < 2;
    }

    public AbstractC34040OooOooo(boolean z, InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr) {
        this.f122376OooOo0o = interfaceC34019OooO0oOArr;
        this.f122375OooOo = z || interfaceC34019OooO0oOArr.length < 2;
    }
}
