package o00OooO;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooOO.C25159OooO0oO;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00OooO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25147OooOoO0 implements InterfaceC25116OooO0o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o00o0O0.OooO<Class<?>, byte[]> f85591OooOO0 = new o00o0O0.OooO<>(50);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC25123OooOOO0<?> f85592OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25159OooO0oO f85593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25116OooO0o f85594OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC25116OooO0o f85595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f85596OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f85597OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Class<?> f85598OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25111OooO f85599OooO0oo;

    public C25147OooOoO0(C25159OooO0oO c25159OooO0oO, InterfaceC25116OooO0o interfaceC25116OooO0o, InterfaceC25116OooO0o interfaceC25116OooO0o2, int i, int i2, InterfaceC25123OooOOO0 interfaceC25123OooOOO0, Class cls, C25111OooO c25111OooO) {
        this.f85593OooO0O0 = c25159OooO0oO;
        this.f85594OooO0OO = interfaceC25116OooO0o;
        this.f85595OooO0Oo = interfaceC25116OooO0o2;
        this.f85597OooO0o0 = i;
        this.f85596OooO0o = i2;
        this.f85592OooO = interfaceC25123OooOOO0;
        this.f85598OooO0oO = cls;
        this.f85599OooO0oo = c25111OooO;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        Object objOooO0o;
        C25159OooO0oO c25159OooO0oO = this.f85593OooO0O0;
        synchronized (c25159OooO0oO) {
            C25159OooO0oO.OooO0O0 oooO0O0 = c25159OooO0oO.f85627OooO0O0;
            o00OooOO.OooO OooO2 = (o00OooOO.OooO) ((ArrayDeque) oooO0O0.f84649OooOo).poll();
            if (OooO2 == null) {
                OooO2 = oooO0O0.OooO();
            }
            C25159OooO0oO.OooO00o oooO00o = (C25159OooO0oO.OooO00o) OooO2;
            oooO00o.f85633OooO0O0 = 8;
            oooO00o.f85634OooO0OO = byte[].class;
            objOooO0o = c25159OooO0oO.OooO0o(oooO00o, byte[].class);
        }
        byte[] bArr = (byte[]) objOooO0o;
        ByteBuffer.wrap(bArr).putInt(this.f85597OooO0o0).putInt(this.f85596OooO0o).array();
        this.f85595OooO0Oo.OooO00o(messageDigest);
        this.f85594OooO0OO.OooO00o(messageDigest);
        messageDigest.update(bArr);
        InterfaceC25123OooOOO0<?> interfaceC25123OooOOO0 = this.f85592OooO;
        if (interfaceC25123OooOOO0 != null) {
            interfaceC25123OooOOO0.OooO00o(messageDigest);
        }
        this.f85599OooO0oo.OooO00o(messageDigest);
        o00o0O0.OooO<Class<?>, byte[]> oooO = f85591OooOO0;
        Class<?> cls = this.f85598OooO0oO;
        byte[] bArrOooO00o = oooO.OooO00o(cls);
        if (bArrOooO00o == null) {
            bArrOooO00o = cls.getName().getBytes(InterfaceC25116OooO0o.f85383OooO00o);
            oooO.OooO0Oo(cls, bArrOooO00o);
        }
        messageDigest.update(bArrOooO00o);
        c25159OooO0oO.OooO0oo(bArr);
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof C25147OooOoO0) {
            C25147OooOoO0 c25147OooOoO0 = (C25147OooOoO0) obj;
            if (this.f85596OooO0o == c25147OooOoO0.f85596OooO0o && this.f85597OooO0o0 == c25147OooOoO0.f85597OooO0o0 && C25316OooOO0o.OooO0O0(this.f85592OooO, c25147OooOoO0.f85592OooO) && this.f85598OooO0oO.equals(c25147OooOoO0.f85598OooO0oO) && this.f85594OooO0OO.equals(c25147OooOoO0.f85594OooO0OO) && this.f85595OooO0Oo.equals(c25147OooOoO0.f85595OooO0Oo) && this.f85599OooO0oo.equals(c25147OooOoO0.f85599OooO0oo)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        int iHashCode = ((((this.f85595OooO0Oo.hashCode() + (this.f85594OooO0OO.hashCode() * 31)) * 31) + this.f85597OooO0o0) * 31) + this.f85596OooO0o;
        InterfaceC25123OooOOO0<?> interfaceC25123OooOOO0 = this.f85592OooO;
        if (interfaceC25123OooOOO0 != null) {
            iHashCode = (iHashCode * 31) + interfaceC25123OooOOO0.hashCode();
        }
        return this.f85599OooO0oo.f85368OooO0O0.hashCode() + ((this.f85598OooO0oO.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f85594OooO0OO + ", signature=" + this.f85595OooO0Oo + ", width=" + this.f85597OooO0o0 + ", height=" + this.f85596OooO0o + ", decodedResourceClass=" + this.f85598OooO0oO + ", transformation='" + this.f85592OooO + "', options=" + this.f85599OooO0oo + '}';
    }
}
