package p619oO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import oOO000oO.C34332OooO00o;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31900OooOOoo extends C31899OooOOo0 implements InterfaceC34334OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f113670OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31898OooOOo f113671OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final byte[] f113672OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final byte[] f113673OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f113674OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile long f113675OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public volatile OooO0O0 f113676OooOooo;

    /* JADX INFO: renamed from: oO.OooOOoo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C31898OooOOo f113677OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f113678OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f113679OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f113680OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public byte[] f113682OooO0o0 = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte[] f113681OooO0o = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public byte[] f113683OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooO0O0 f113684OooO0oo = null;

        public OooO00o(C31898OooOOo c31898OooOOo) {
            this.f113677OooO00o = c31898OooOOo;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31900OooOOoo(OooO00o oooO00o) {
        C31898OooOOo c31898OooOOo = oooO00o.f113677OooO00o;
        C31903OooOo0o c31903OooOo0o = c31898OooOOo.f113666OooO0O0;
        super(c31903OooOo0o.f113715OooO0o0);
        this.f113671OooOoO0 = c31898OooOOo;
        int i = c31903OooOo0o.f113714OooO0o;
        this.f113675OooOooO = oooO00o.f113678OooO0O0;
        byte[] bArr = oooO00o.f113680OooO0Oo;
        if (bArr == null) {
            this.f113670OooOoO = new byte[i];
        } else {
            if (bArr.length != i) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f113670OooOoO = bArr;
        }
        byte[] bArr2 = oooO00o.f113682OooO0o0;
        if (bArr2 == null) {
            this.f113672OooOoOO = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f113672OooOoOO = bArr2;
        }
        byte[] bArr3 = oooO00o.f113681OooO0o;
        if (bArr3 == null) {
            this.f113674OooOoo0 = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f113674OooOoo0 = bArr3;
        }
        byte[] bArr4 = oooO00o.f113683OooO0oO;
        if (bArr4 == null) {
            this.f113673OooOoo = new byte[i];
        } else {
            if (bArr4.length != i) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f113673OooOoo = bArr4;
        }
        OooO0O0 oooO0O0 = oooO00o.f113684OooO0oo;
        if (oooO0O0 == null) {
            oooO0O0 = (!C31904OooOoO.OooO0oO(c31898OooOOo.f113667OooO0OO, oooO00o.f113678OooO0O0) || bArr3 == null || bArr == null) ? new OooO0O0(oooO00o.f113679OooO0OO + 1) : new OooO0O0(c31898OooOOo, oooO00o.f113678OooO0O0, bArr3, bArr);
        }
        this.f113676OooOooo = oooO0O0;
        long j = oooO00o.f113679OooO0OO;
        if (j >= 0 && j != this.f113676OooOooo.f113616OooOo) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] OooO0Oo() {
        byte[] bArrOooO0OO;
        synchronized (this) {
            try {
                C31898OooOOo c31898OooOOo = this.f113671OooOoO0;
                int i = c31898OooOOo.f113666OooO0O0.f113714OooO0o;
                int i2 = (c31898OooOOo.f113667OooO0OO + 7) / 8;
                int i3 = i2 + i;
                int i4 = i3 + i;
                int i5 = i4 + i;
                byte[] bArr = new byte[i + i5];
                C31904OooOoO.OooO0Oo(0, bArr, C31904OooOoO.OooO0oo(i2, this.f113675OooOooO));
                C31904OooOoO.OooO0Oo(i2, bArr, this.f113670OooOoO);
                C31904OooOoO.OooO0Oo(i3, bArr, this.f113672OooOoOO);
                C31904OooOoO.OooO0Oo(i4, bArr, this.f113674OooOoo0);
                C31904OooOoO.OooO0Oo(i5, bArr, this.f113673OooOoo);
                try {
                    OooO0O0 oooO0O0 = this.f113676OooOooo;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(oooO0O0);
                    objectOutputStream.flush();
                    bArrOooO0OO = C34332OooO00o.OooO0OO(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrOooO0OO;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        byte[] bArrOooO0Oo;
        synchronized (this) {
            bArrOooO0Oo = OooO0Oo();
        }
        return bArrOooO0Oo;
    }
}
