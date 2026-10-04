package oO0oooOO;

import androidx.datastore.preferences.protobuf.o000oOoO;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.WeakHashMap;
import o00O0oo0.C24961OooO00o;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOoOo.InterfaceC34201OooO0Oo;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oooOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34304OooO0oo extends AbstractC34303OooO0oO {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO00o[] f123154Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO00o f123155Oooo00o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f123156OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C34302OooO0o0 f123157OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34306OooOO0O f123158OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f123159OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final WeakHashMap f123160OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f123161OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f123162OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final InterfaceC34201OooO0Oo f123163OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f123164Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C34296OooO f123165Oooo00O;

    /* JADX INFO: renamed from: oO0oooOO.OooO0oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f123166OooO00o;

        public OooO00o(int i) {
            this.f123166OooO00o = i;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof OooO00o) && ((OooO00o) obj).f123166OooO00o == this.f123166OooO00o;
        }

        public final int hashCode() {
            return this.f123166OooO00o;
        }
    }

    static {
        OooO00o oooO00o = new OooO00o(1);
        f123155Oooo00o = oooO00o;
        OooO00o[] oooO00oArr = new OooO00o[129];
        f123154Oooo0 = oooO00oArr;
        oooO00oArr[1] = oooO00o;
        int i = 2;
        while (true) {
            OooO00o[] oooO00oArr2 = f123154Oooo0;
            if (i >= oooO00oArr2.length) {
                return;
            }
            oooO00oArr2[i] = new OooO00o(i);
            i++;
        }
    }

    public C34304OooO0oo(C34306OooOO0O c34306OooOO0O, C34302OooO0o0 c34302OooO0o0, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(2);
        this.f123158OooOoO0 = c34306OooOO0O;
        this.f123157OooOoO = c34302OooO0o0;
        this.f123164Oooo000 = i;
        this.f123156OooOo = C34332OooO00o.OooO00o(bArr);
        this.f123159OooOoOO = i2;
        this.f123161OooOoo0 = C34332OooO00o.OooO00o(bArr2);
        this.f123162OooOooO = 1 << (c34306OooOO0O.f123173OooO0O0 + 1);
        this.f123160OooOoo = new WeakHashMap();
        this.f123163OooOooo = C34298OooO0O0.OooO00o(c34306OooOO0O.f123174OooO0OO);
    }

    public static C34304OooO0oo OooO0o(Object obj) throws Throwable {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof C34304OooO0oo) {
            return (C34304OooO0oo) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return OooO0o(oOO00.OooO00o.OooO00o((InputStream) obj));
                }
                throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "cannot parse "));
            }
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                C34304OooO0oo c34304OooO0ooOooO0o = OooO0o(dataInputStream);
                dataInputStream.close();
                return c34304OooO0ooOooO0o;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 == null) {
                    throw th;
                }
                dataInputStream2.close();
                throw th;
            }
        }
        DataInputStream dataInputStream3 = (DataInputStream) obj;
        if (dataInputStream3.readInt() != 0) {
            throw new IllegalStateException("expected version 0 lms private key");
        }
        C34306OooOO0O c34306OooOO0O = C34306OooOO0O.f123171OooO0Oo.get(Integer.valueOf(dataInputStream3.readInt()));
        C34302OooO0o0 c34302OooO0o0 = C34302OooO0o0.f123149OooO0o0.get(Integer.valueOf(dataInputStream3.readInt()));
        byte[] bArr = new byte[16];
        dataInputStream3.readFully(bArr);
        int i = dataInputStream3.readInt();
        int i2 = dataInputStream3.readInt();
        int i3 = dataInputStream3.readInt();
        if (i3 < 0) {
            throw new IllegalStateException("secret length less than zero");
        }
        if (i3 <= dataInputStream3.available()) {
            byte[] bArr2 = new byte[i3];
            dataInputStream3.readFully(bArr2);
            return new C34304OooO0oo(c34306OooOO0O, c34302OooO0o0, i, bArr, i2, bArr2);
        }
        throw new IOException("secret length exceeded " + dataInputStream3.available());
    }

    public final byte[] OooO0Oo(int i) {
        byte[] bArrOooO0Oo;
        byte[] bArrOooO0Oo2;
        int i2 = 1 << this.f123158OooOoO0.f123173OooO0O0;
        byte[] bArr = this.f123156OooOo;
        InterfaceC34201OooO0Oo interfaceC34201OooO0Oo = this.f123163OooOooo;
        if (i < i2) {
            int i3 = i * 2;
            OooO00o[] oooO00oArr = f123154Oooo0;
            int i4 = this.f123162OooOooO;
            if (i3 < i4) {
                bArrOooO0Oo = OooO0o0(i3 < 129 ? oooO00oArr[i3] : new OooO00o(i3));
            } else {
                bArrOooO0Oo = OooO0Oo(i3);
            }
            int i5 = i3 + 1;
            if (i5 < i4) {
                bArrOooO0Oo2 = OooO0o0(i5 < 129 ? oooO00oArr[i5] : new OooO00o(i5));
            } else {
                bArrOooO0Oo2 = OooO0Oo(i5);
            }
            byte[] bArrOooO00o = C34332OooO00o.OooO00o(bArr);
            interfaceC34201OooO0Oo.update(bArrOooO00o, 0, bArrOooO00o.length);
            C24961OooO00o.OooO0OO(i, interfaceC34201OooO0Oo);
            interfaceC34201OooO0Oo.update((byte) 16777091);
            interfaceC34201OooO0Oo.update((byte) (-31869));
            interfaceC34201OooO0Oo.update(bArrOooO0Oo, 0, bArrOooO0Oo.length);
            interfaceC34201OooO0Oo.update(bArrOooO0Oo2, 0, bArrOooO0Oo2.length);
            byte[] bArr2 = new byte[interfaceC34201OooO0Oo.OooO0OO()];
            interfaceC34201OooO0Oo.doFinal(bArr2, 0);
            return bArr2;
        }
        byte[] bArrOooO00o2 = C34332OooO00o.OooO00o(bArr);
        interfaceC34201OooO0Oo.update(bArrOooO00o2, 0, bArrOooO00o2.length);
        C24961OooO00o.OooO0OO(i, interfaceC34201OooO0Oo);
        interfaceC34201OooO0Oo.update((byte) 16777090);
        interfaceC34201OooO0Oo.update((byte) (-32126));
        byte[] bArrOooO00o3 = C34332OooO00o.OooO00o(bArr);
        int i6 = i - i2;
        byte[] bArrOooO00o4 = C34332OooO00o.OooO00o(this.f123161OooOoo0);
        C34302OooO0o0 c34302OooO0o0 = this.f123157OooOoO;
        InterfaceC34201OooO0Oo interfaceC34201OooO0OoOooO00o = C34298OooO0O0.OooO00o(c34302OooO0o0.f123153OooO0Oo);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArrOooO00o3);
            byte b = (byte) (i6 >>> 24);
            byteArrayOutputStream.write(b);
            byte b2 = (byte) (i6 >>> 16);
            byteArrayOutputStream.write(b2);
            byte b3 = (byte) (i6 >>> 8);
            byteArrayOutputStream.write(b3);
            byte b4 = (byte) i6;
            byteArrayOutputStream.write(b4);
            byteArrayOutputStream.write((byte) 128);
            byteArrayOutputStream.write((byte) 32896);
            while (byteArrayOutputStream.size() < 22) {
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            interfaceC34201OooO0OoOooO00o.update(byteArray, 0, byteArray.length);
            C34032OooOo0O c34032OooOo0O = c34302OooO0o0.f123153OooO0Oo;
            InterfaceC34201OooO0Oo interfaceC34201OooO0OoOooO00o2 = C34298OooO0O0.OooO00o(c34032OooOo0O);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(bArrOooO00o3);
                byteArrayOutputStream2.write(b);
                byteArrayOutputStream2.write(b2);
                byteArrayOutputStream2.write(b3);
                byteArrayOutputStream2.write(b4);
                int iOooO0OO = interfaceC34201OooO0OoOooO00o2.OooO0OO() + 23;
                while (byteArrayOutputStream2.size() < iOooO0OO) {
                    byteArrayOutputStream2.write(0);
                }
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                InterfaceC34201OooO0Oo interfaceC34201OooO0OoOooO00o3 = C34298OooO0O0.OooO00o(c34032OooOo0O);
                int i7 = (1 << c34302OooO0o0.f123151OooO0O0) - 1;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    int i10 = c34302OooO0o0.f123152OooO0OO;
                    if (i8 >= i10) {
                        int iOooO0OO2 = interfaceC34201OooO0OoOooO00o.OooO0OO();
                        byte[] bArr3 = new byte[iOooO0OO2];
                        interfaceC34201OooO0OoOooO00o.doFinal(bArr3, 0);
                        interfaceC34201OooO0Oo.update(bArr3, 0, iOooO0OO2);
                        byte[] bArr4 = new byte[interfaceC34201OooO0Oo.OooO0OO()];
                        interfaceC34201OooO0Oo.doFinal(bArr4, 0);
                        return bArr4;
                    }
                    boolean z = i8 < i10 + (-1);
                    C34302OooO0o0 c34302OooO0o02 = c34302OooO0o0;
                    if (byteArray2.length < interfaceC34201OooO0OoOooO00o3.OooO0OO()) {
                        throw new IllegalArgumentException("target length is less than digest size.");
                    }
                    interfaceC34201OooO0OoOooO00o3.update(bArrOooO00o3, 0, bArrOooO00o3.length);
                    interfaceC34201OooO0OoOooO00o3.update(b);
                    interfaceC34201OooO0OoOooO00o3.update(b2);
                    interfaceC34201OooO0OoOooO00o3.update(b3);
                    interfaceC34201OooO0OoOooO00o3.update(b4);
                    int i11 = i9;
                    interfaceC34201OooO0OoOooO00o3.update((byte) (i11 >>> 8));
                    interfaceC34201OooO0OoOooO00o3.update((byte) i11);
                    interfaceC34201OooO0OoOooO00o3.update((byte) -1);
                    byte b5 = b4;
                    interfaceC34201OooO0OoOooO00o3.update(bArrOooO00o4, 0, bArrOooO00o4.length);
                    interfaceC34201OooO0OoOooO00o3.doFinal(byteArray2, 23);
                    int i12 = z ? i11 + 1 : i11;
                    short s = (short) i8;
                    byteArray2[20] = (byte) (s >>> 8);
                    byteArray2[21] = (byte) s;
                    int i13 = 0;
                    while (i13 < i7) {
                        byteArray2[22] = (byte) i13;
                        interfaceC34201OooO0OoOooO00o2.update(byteArray2, 0, byteArray2.length);
                        interfaceC34201OooO0OoOooO00o2.doFinal(byteArray2, 23);
                        i13++;
                        i12 = i12;
                    }
                    int i14 = i12;
                    interfaceC34201OooO0OoOooO00o.update(byteArray2, 23, 32);
                    i8++;
                    b4 = b5;
                    i9 = i14;
                    c34302OooO0o0 = c34302OooO0o02;
                }
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final byte[] OooO0o0(OooO00o oooO00o) {
        synchronized (this.f123160OooOoo) {
            try {
                byte[] bArr = (byte[]) this.f123160OooOoo.get(oooO00o);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArrOooO0Oo = OooO0Oo(oooO00o.f123166OooO00o);
                this.f123160OooOoo.put(oooO00o, bArrOooO0Oo);
                return bArrOooO0Oo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C34296OooO OooO0oO() {
        C34296OooO c34296OooO;
        synchronized (this) {
            try {
                if (this.f123165Oooo00O == null) {
                    this.f123165Oooo00O = new C34296OooO(this.f123158OooOoO0, this.f123157OooOoO, OooO0o0(f123155Oooo00o), this.f123156OooOo);
                }
                c34296OooO = this.f123165Oooo00O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34296OooO;
    }

    public final boolean equals(Object obj) {
        C34296OooO c34296OooO;
        if (this == obj) {
            return true;
        }
        if (obj == null || C34304OooO0oo.class != obj.getClass()) {
            return false;
        }
        C34304OooO0oo c34304OooO0oo = (C34304OooO0oo) obj;
        if (this.f123164Oooo000 != c34304OooO0oo.f123164Oooo000 || this.f123159OooOoOO != c34304OooO0oo.f123159OooOoOO || !Arrays.equals(this.f123156OooOo, c34304OooO0oo.f123156OooOo)) {
            return false;
        }
        C34306OooOO0O c34306OooOO0O = c34304OooO0oo.f123158OooOoO0;
        C34306OooOO0O c34306OooOO0O2 = this.f123158OooOoO0;
        if (c34306OooOO0O2 == null ? c34306OooOO0O != null : !c34306OooOO0O2.equals(c34306OooOO0O)) {
            return false;
        }
        C34302OooO0o0 c34302OooO0o0 = c34304OooO0oo.f123157OooOoO;
        C34302OooO0o0 c34302OooO0o02 = this.f123157OooOoO;
        if (c34302OooO0o02 == null ? c34302OooO0o0 != null : !c34302OooO0o02.equals(c34302OooO0o0)) {
            return false;
        }
        if (!Arrays.equals(this.f123161OooOoo0, c34304OooO0oo.f123161OooOoo0)) {
            return false;
        }
        C34296OooO c34296OooO2 = this.f123165Oooo00O;
        if (c34296OooO2 == null || (c34296OooO = c34304OooO0oo.f123165Oooo00O) == null) {
            return true;
        }
        return c34296OooO2.equals(c34296OooO);
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        C34297OooO00o c34297OooO00o = new C34297OooO00o();
        c34297OooO00o.OooO0OO(0);
        c34297OooO00o.OooO0OO(this.f123158OooOoO0.f123172OooO00o);
        c34297OooO00o.OooO0OO(this.f123157OooOoO.f123150OooO00o);
        c34297OooO00o.OooO0O0(this.f123156OooOo);
        c34297OooO00o.OooO0OO(this.f123164Oooo000);
        c34297OooO00o.OooO0OO(this.f123159OooOoOO);
        byte[] bArr = this.f123161OooOoo0;
        c34297OooO00o.OooO0OO(bArr.length);
        c34297OooO00o.OooO0O0(bArr);
        return c34297OooO00o.f123137OooO00o.toByteArray();
    }

    public final int hashCode() {
        int iOooO0o0 = (C34332OooO00o.OooO0o0(this.f123156OooOo) + (this.f123164Oooo000 * 31)) * 31;
        C34306OooOO0O c34306OooOO0O = this.f123158OooOoO0;
        int iHashCode = (iOooO0o0 + (c34306OooOO0O != null ? c34306OooOO0O.hashCode() : 0)) * 31;
        C34302OooO0o0 c34302OooO0o0 = this.f123157OooOoO;
        int iOooO0o02 = (C34332OooO00o.OooO0o0(this.f123161OooOoo0) + ((((iHashCode + (c34302OooO0o0 != null ? c34302OooO0o0.hashCode() : 0)) * 31) + this.f123159OooOoOO) * 31)) * 31;
        C34296OooO c34296OooO = this.f123165Oooo00O;
        return iOooO0o02 + (c34296OooO != null ? c34296OooO.hashCode() : 0);
    }
}
