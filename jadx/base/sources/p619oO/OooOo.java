package p619oO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import oOO000oO.C34332OooO00o;
import oOO000oO.InterfaceC34334OooO0OO;
import p619oO.OooOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo extends C31897OooOOOo implements InterfaceC34334OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f113685OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31903OooOo0o f113686OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final byte[] f113687OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final byte[] f113688OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f113689OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile p619oO.OooO00o f113690OooOooO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C31903OooOo0o f113691OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f113692OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f113693OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f113694OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public byte[] f113696OooO0o0 = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte[] f113695OooO0o = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public byte[] f113697OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public p619oO.OooO00o f113698OooO0oo = null;

        public OooO00o(C31903OooOo0o c31903OooOo0o) {
            this.f113691OooO00o = c31903OooOo0o;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOo(OooO00o oooO00o) {
        C31903OooOo0o c31903OooOo0o = oooO00o.f113691OooO00o;
        super(c31903OooOo0o.f113715OooO0o0);
        this.f113686OooOoO0 = c31903OooOo0o;
        int i = c31903OooOo0o.f113714OooO0o;
        byte[] bArr = oooO00o.f113694OooO0Oo;
        if (bArr == null) {
            this.f113685OooOoO = new byte[i];
        } else {
            if (bArr.length != i) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f113685OooOoO = bArr;
        }
        byte[] bArr2 = oooO00o.f113696OooO0o0;
        if (bArr2 == null) {
            this.f113687OooOoOO = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f113687OooOoOO = bArr2;
        }
        byte[] bArr3 = oooO00o.f113695OooO0o;
        if (bArr3 == null) {
            this.f113689OooOoo0 = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f113689OooOoo0 = bArr3;
        }
        byte[] bArr4 = oooO00o.f113697OooO0oO;
        if (bArr4 == null) {
            this.f113688OooOoo = new byte[i];
        } else {
            if (bArr4.length != i) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f113688OooOoo = bArr4;
        }
        p619oO.OooO00o oooO00o2 = oooO00o.f113698OooO0oo;
        if (oooO00o2 != null) {
            this.f113690OooOooO = oooO00o2;
        } else {
            int i2 = oooO00o.f113692OooO0O0;
            int i3 = 1 << c31903OooOo0o.f113711OooO0O0;
            if (i2 >= i3 - 2 || bArr3 == null || bArr == null) {
                p619oO.OooO00o oooO00o3 = new p619oO.OooO00o(new OooOO0O(c31903OooOo0o.f113716OooO0oO), c31903OooOo0o.f113711OooO0O0, c31903OooOo0o.f113712OooO0OO, i2);
                oooO00o3.f113615Oooo00O = i3 - 1;
                oooO00o3.f113613OooOooo = i2;
                oooO00o3.f113614Oooo000 = true;
                this.f113690OooOooO = oooO00o3;
            } else {
                OooOO0 oooOO02 = new OooOO0(new OooOO0.OooO00o());
                int i4 = oooO00o.f113692OooO0O0;
                OooOO0O oooOO0O = new OooOO0O(c31903OooOo0o.f113716OooO0oO);
                int i5 = c31903OooOo0o.f113711OooO0O0;
                oooO00o2 = new p619oO.OooO00o(oooOO0O, i5, c31903OooOo0o.f113712OooO0OO, (1 << i5) - 1);
                oooO00o2.OooO00o(bArr3, bArr, oooOO02);
                while (oooO00o2.f113613OooOooo < i4) {
                    oooO00o2.OooO0O0(bArr3, bArr, oooOO02);
                    oooO00o2.f113614Oooo000 = false;
                }
                this.f113690OooOooO = oooO00o2;
            }
        }
        int i6 = oooO00o.f113693OooO0OO;
        if (i6 >= 0 && i6 != this.f113690OooOooO.f113615Oooo00O) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] OooO0Oo() {
        byte[] bArrOooO0OO;
        synchronized (this) {
            try {
                int i = this.f113686OooOoO0.f113714OooO0o;
                int i2 = i + 4;
                int i3 = i2 + i;
                int i4 = i3 + i;
                byte[] bArr = new byte[i + i4];
                AbstractC20449OooO0Oo.OooOoo(this.f113690OooOooO.f113613OooOooo, 0, bArr);
                C31904OooOoO.OooO0Oo(4, bArr, this.f113685OooOoO);
                C31904OooOoO.OooO0Oo(i2, bArr, this.f113687OooOoOO);
                C31904OooOoO.OooO0Oo(i3, bArr, this.f113689OooOoo0);
                C31904OooOoO.OooO0Oo(i4, bArr, this.f113688OooOoo);
                try {
                    p619oO.OooO00o oooO00o = this.f113690OooOooO;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(oooO00o);
                    objectOutputStream.flush();
                    bArrOooO0OO = C34332OooO00o.OooO0OO(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new RuntimeException("error serializing bds state: " + e.getMessage());
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
