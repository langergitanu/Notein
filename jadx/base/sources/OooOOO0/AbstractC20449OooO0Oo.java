package OooOOO0;

import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.imagepipeline.producers.C22271OooOo0o;
import com.facebook.imagepipeline.producers.C22272OooOoO;
import com.facebook.imagepipeline.producers.C22289OoooO0;
import com.facebook.imagepipeline.producers.InterfaceC22288OoooO;
import com.facebook.imagepipeline.producers.OooO;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000000o.C24099OooOoO0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oo0oO0.C31349OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOO00o0.C34370OooO0o0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: OooOOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20449OooO0Oo {
    public static void OooO0o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                o00OOOo.OooO0OO.OooO0OO("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static o0O00O0o.OooO00o OooO0o0(Context context) {
        o0O00O0o.OooO00o oooO00o;
        synchronized (o0O00O0o.OooO00o.class) {
            try {
                if (o0O00O0o.OooO00o.f88146OooO00o == null) {
                    C34370OooO0o0.OooO0O0(context);
                    o0O00O0o.OooO00o.f88146OooO00o = new o0O00O0o.OooO00o();
                    o0O00O0o.OooO00o.OooO00o(context);
                }
                oooO00o = o0O00O0o.OooO00o.f88146OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooO00o;
    }

    public static int OooO0oo(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static void OooOOO0(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (i2 < Math.min(30, i)) {
                j |= (((long) iArr[i3]) & 4294967295L) << i2;
                i2 += 32;
                i3++;
            }
            iArr2[i4] = ((int) j) & 1073741823;
            j >>>= 30;
            i2 -= 30;
            i -= 30;
            i4++;
        }
    }

    public static String OooOo0(int i, int i2) {
        return o0Oo0oo.OooO0O0(i2, i != 64 ? i != 128 ? i != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", "]");
    }

    public static long OooOoO0(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        long j11 = (((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8);
        long j12 = (((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9);
        long j13 = (((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10);
        return (j11 & 1229782938247303441L) | (j12 & 2459565876494606882L) | (j13 & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    public static void OooOoo(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void OooOooO(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void Oooo0(long j, byte[] bArr, int i) {
        OooOoo((int) (j >>> 32), i, bArr);
        OooOoo((int) (j & 4294967295L), i + 4, bArr);
    }

    public static int Oooo000(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long Oooo00O(int i, byte[] bArr) {
        return ((((long) Oooo000(i + 4, bArr)) & 4294967295L) << 32) | (((long) Oooo000(i, bArr)) & 4294967295L);
    }

    public static void Oooo0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long jReverse = Long.reverse(j);
        long jReverse2 = Long.reverse(j2);
        long jReverse3 = Long.reverse(j3);
        long jReverse4 = Long.reverse(j4);
        long jReverse5 = Long.reverse(OooOoO0(jReverse, jReverse3));
        long jOooOoO0 = OooOoO0(j, j3) << 1;
        long jReverse6 = Long.reverse(OooOoO0(jReverse2, jReverse4));
        long jOooOoO02 = OooOoO0(j2, j4);
        long j5 = jOooOoO02 << 1;
        long jReverse7 = Long.reverse(OooOoO0(jReverse ^ jReverse2, jReverse3 ^ jReverse4));
        long jOooOoO03 = ((OooOoO0(j ^ j2, j3 ^ j4) << 1) ^ ((jReverse6 ^ jOooOoO0) ^ j5)) ^ ((jOooOoO02 << 63) ^ (jOooOoO02 << 58));
        jArr[0] = jReverse5 ^ ((jOooOoO03 >>> 7) ^ (((jOooOoO03 >>> 1) ^ jOooOoO03) ^ (jOooOoO03 >>> 2)));
        jArr[1] = ((jOooOoO03 << 57) ^ ((jOooOoO03 << 63) ^ (jOooOoO03 << 62))) ^ ((jReverse7 ^ ((jOooOoO0 ^ jReverse5) ^ jReverse6)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7)));
    }

    public static void Oooo0oO(int i, byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i2 + 2;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i2 + 3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 += 4;
        } while (i2 < 16);
    }

    public static void Oooo0oo(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    public abstract void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj);

    public abstract void OooO0oO(oO0O0OO.OooO0O0 oooO0O0);

    public abstract void OooOO0(oO0O0OO.OooO0O0 oooO0O0, oO0O0OO.OooO0O0 oooO0O02);

    public abstract C22272OooOoO.OooO00o OooOO0O(OooO oooO, InterfaceC22288OoooO interfaceC22288OoooO);

    public abstract String OooOO0o();

    public abstract void OooOOO(C22271OooOo0o c22271OooOo0o, C22289OoooO0.OooO00o oooO00o);

    public abstract InterfaceC33911OooO0OO OooOOOO(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, List list);

    public abstract HashMap OooOOOo(C22271OooOo0o c22271OooOo0o, int i);

    public abstract InterfaceC33910OooO0O0 OooOOo(String str, InterfaceC34595OooO0Oo interfaceC34595OooO0Oo);

    public abstract boolean OooOOo0();

    public void OooOo(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C31349OooOOOO) {
                List listOooOo0o = OooOo0o(arrayList, (C31349OooOOOO) obj);
                arrayList.clear();
                if (listOooOo0o != null) {
                    arrayList.addAll(listOooOo0o);
                }
            } else {
                arrayList.add((Number) obj);
            }
        }
    }

    public abstract InterfaceC33911OooO0OO OooOo00(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, Object obj);

    public abstract void OooOo0O(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

    public abstract List OooOo0o(ArrayList arrayList, C31349OooOOOO c31349OooOOOO);

    public void OooOoO(InterfaceC24747OooO0O0 connection, Iterable iterable) {
        OooOOO0.OooO0oO(connection, "connection");
        if (iterable == null) {
            return;
        }
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo(OooOO0o());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    OooO(interfaceC24749OooO0OoO0ooOOo, obj);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.reset();
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            C24099OooOoO0.OooO0o0(interfaceC24749OooO0OoO0ooOOo, null);
        } finally {
        }
    }

    public void OooOoOO(InterfaceC24747OooO0O0 connection, Object obj) throws Exception {
        OooOOO0.OooO0oO(connection, "connection");
        if (obj == null) {
            return;
        }
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo(OooOO0o());
        try {
            OooO(interfaceC24749OooO0OoO0ooOOo, obj);
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            interfaceC24749OooO0OoO0ooOOo.close();
        } finally {
        }
    }

    public void OooOoo0(InterfaceC24747OooO0O0 connection, Object[] objArr) {
        OooOOO0.OooO0oO(connection, "connection");
        if (objArr == null) {
            return;
        }
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo(OooOO0o());
        try {
            kotlin.jvm.internal.OooO0O0 OooO0O02 = kotlin.jvm.internal.OooO0OO.OooO0O0(objArr);
            while (OooO0O02.hasNext()) {
                Object next = OooO0O02.next();
                if (next != null) {
                    OooO(interfaceC24749OooO0OoO0ooOOo, next);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.reset();
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            C24099OooOoO0.OooO0o0(interfaceC24749OooO0OoO0ooOOo, null);
        } finally {
        }
    }

    public abstract void Oooo0OO(C22271OooOo0o c22271OooOo0o);

    public void Oooo0o(oO0O0OO.OooO0O0 member, Collection collection) {
        OooOOO0.OooO0oO(member, "member");
        member.Oooo0oO(collection);
    }

    public abstract AbstractC33320OooOoo Oooo0o0(InterfaceC33541OooO0oO interfaceC33541OooO0oO);
}
