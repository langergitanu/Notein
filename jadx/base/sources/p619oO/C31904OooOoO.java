package p619oO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;

/* JADX INFO: renamed from: oO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31904OooOoO {

    /* JADX INFO: renamed from: oO.OooOoO$OooO00o */
    public static class OooO00o extends ObjectInputStream {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final HashSet f113717OooOoO0;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f113718OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Class f113719OooOo0o;

        static {
            HashSet hashSet = new HashSet();
            f113717OooOoO0 = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public OooO00o(Class cls, ByteArrayInputStream byteArrayInputStream) throws IOException {
            super(byteArrayInputStream);
            this.f113718OooOo = false;
            this.f113719OooOo0o = cls;
        }

        @Override // java.io.ObjectInputStream
        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (this.f113718OooOo) {
                if (!f113717OooOoO0.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.f113719OooOo0o.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.f113718OooOo = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static long OooO00o(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public static byte[] OooO0O0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[][] OooO0OO(byte[][] bArr) {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                }
            }
            byte[][] bArr3 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr4 = new byte[bArr[i].length];
                bArr3[i] = bArr4;
                byte[] bArr5 = bArr[i];
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            }
            return bArr3;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static void OooO0Oo(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    public static byte[] OooO0o(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public static Object OooO0o0(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        OooO00o oooO00o = new OooO00o(cls, new ByteArrayInputStream(bArr));
        Object object = oooO00o.readObject();
        if (oooO00o.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(object)) {
            return object;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static boolean OooO0oO(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static byte[] OooO0oo(int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }
}
