package Oooo0oo;

import io.grpc.stub.OooO;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000000o.C24099OooOoO0;
import o000ooOO.C24741OooOO0o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00oO0o.AbstractC25573OooO0OO;
import o00oO0o.C25570OooO;
import o0Oo0oo.C28395OooOOo0;
import o0ooO000.InterfaceC31418OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OOo0o.o00Oo0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0oO00.o0Oo0oo;
import oO0oOOoo.C34133OooO00o;
import oO0oOOoo.C34134OooO0O0;
import oO0oOOoo.C34135OooO0OO;

/* JADX INFO: renamed from: Oooo0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21138OooO0oo implements OooO, InterfaceC31418OooO0O0, oO0oO000.OooO0OO, oO0oO000.OooO00o {
    public static boolean Oooo0O0(C34135OooO0OO c34135OooO0OO, C34135OooO0OO c34135OooO0OO2) {
        C34134OooO0O0[] c34134OooO0O0Arr = (C34134OooO0O0[]) c34135OooO0OO.f122672OooOoO.clone();
        C34134OooO0O0[] c34134OooO0O0Arr2 = (C34134OooO0O0[]) c34135OooO0OO2.f122672OooOoO.clone();
        if (c34134OooO0O0Arr.length == c34134OooO0O0Arr2.length) {
            boolean z = (c34134OooO0O0Arr[0].OooO0oo() == null || c34134OooO0O0Arr2[0].OooO0oo() == null) ? false : !c34134OooO0O0Arr[0].OooO0oo().f122667OooOo0o.OooOO0o(c34134OooO0O0Arr2[0].OooO0oo().f122667OooOo0o);
            for (int i = 0; i != c34134OooO0O0Arr.length; i++) {
                C34134OooO0O0 c34134OooO0O0 = c34134OooO0O0Arr[i];
                if (z) {
                    for (int length = c34134OooO0O0Arr2.length - 1; length >= 0; length--) {
                        C34134OooO0O0 c34134OooO0O02 = c34134OooO0O0Arr2[length];
                        if (c34134OooO0O02 != null && OooooOo(c34134OooO0O0, c34134OooO0O02)) {
                            c34134OooO0O0Arr2[length] = null;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 != c34134OooO0O0Arr2.length; i2++) {
                        C34134OooO0O0 c34134OooO0O03 = c34134OooO0O0Arr2[i2];
                        if (c34134OooO0O03 != null && OooooOo(c34134OooO0O0, c34134OooO0O03)) {
                            c34134OooO0O0Arr2[i2] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static long Oooo0o0(int i, long j, long j2) {
        long j3 = j2 & ((j >>> i) ^ j);
        return (j3 ^ (j3 << i)) ^ j;
    }

    public static String Oooo0oo(Object value, String message) {
        OooOOO0.OooO0oO(value, "value");
        OooOOO0.OooO0oO(message, "message");
        return message + " value: " + value;
    }

    public static int[] OoooO0(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 31) >> 5;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static boolean OooooOo(C34134OooO0O0 c34134OooO0O0, C34134OooO0O0 c34134OooO0O02) {
        if (c34134OooO0O0.f122668OooOo0o.f122376OooOo0o.length == c34134OooO0O02.f122668OooOo0o.f122376OooOo0o.length) {
            C34133OooO00o[] c34133OooO00oArrOooO = c34134OooO0O0.OooO();
            C34133OooO00o[] c34133OooO00oArrOooO2 = c34134OooO0O02.OooO();
            if (c34133OooO00oArrOooO.length == c34133OooO00oArrOooO2.length) {
                for (int i = 0; i != c34133OooO00oArrOooO.length; i++) {
                    C34133OooO00o c34133OooO00o = c34133OooO00oArrOooO[i];
                    C34133OooO00o c34133OooO00o2 = c34133OooO00oArrOooO2[i];
                    if (c34133OooO00o == c34133OooO00o2 || (c34133OooO00o != null && c34133OooO00o2 != null && c34133OooO00o.f122667OooOo0o.OooOO0o(c34133OooO00o2.f122667OooOo0o) && C28395OooOOo0.OooO0O0(c34133OooO00o.f122666OooOo).equals(C28395OooOOo0.OooO0O0(c34133OooO00o2.f122666OooOo)))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // oO0oO000.OooO00o
    public double OooO(o0Oo0oo descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooO0oO();
    }

    @Override // oO0oO000.OooO0OO
    public oO0oO000.OooO00o OooO00o(InterfaceC33531OooO0o0 descriptor) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return this;
    }

    @Override // oO0oO000.OooO00o
    public void OooO0O0(InterfaceC33531OooO0o0 descriptor) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
    }

    @Override // oO0oO000.OooO00o
    public float OooO0Oo(InterfaceC33531OooO0o0 descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooOoO0();
    }

    @Override // oO0oO000.OooO0OO
    public abstract short OooO0o();

    @Override // oO0oO000.OooO0OO
    public abstract long OooO0o0();

    @Override // oO0oO000.OooO0OO
    public double OooO0oO() {
        OoooO00();
        throw null;
    }

    @Override // oO0oO000.OooO0OO
    public char OooO0oo() {
        OoooO00();
        throw null;
    }

    @Override // oO0oO000.OooO0OO
    public String OooOO0() {
        OoooO00();
        throw null;
    }

    @Override // oO0oO000.OooO00o
    public short OooOO0o(o0Oo0oo descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooO0o();
    }

    @Override // oO0oO000.OooO00o
    public Object OooOOO(InterfaceC33531OooO0o0 descriptor, int i, InterfaceC33910OooO0O0 deserializer, Object obj) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOOO0.OooO0oO(deserializer, "deserializer");
        if (deserializer.getDescriptor().OooO0O0() || OooOoo0()) {
            return OooOooo(deserializer);
        }
        return null;
    }

    @Override // oO0oO000.OooO00o
    public Object OooOOO0(InterfaceC33531OooO0o0 descriptor, int i, InterfaceC33910OooO0O0 deserializer, Object obj) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOOO0.OooO0oO(deserializer, "deserializer");
        return OooOooo(deserializer);
    }

    @Override // o0ooO000.InterfaceC31418OooO0O0
    public ArrayList OooOOOO() {
        ArrayList arrayList = new ArrayList();
        for (String str : OoooOO0()) {
            File file = new File(str);
            try {
                if (file.exists() && file.canRead()) {
                    arrayList.add(file);
                }
            } catch (SecurityException unused) {
            }
        }
        return arrayList;
    }

    @Override // oO0oO000.OooO00o
    public boolean OooOOOo(InterfaceC33531OooO0o0 descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooOoO();
    }

    @Override // oO0oO000.OooO0OO
    public abstract int OooOOo();

    @Override // oO0oO000.OooO00o
    public oO0oO000.OooO0OO OooOOoo(o0Oo0oo descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooOo0O(descriptor.OooO0Oo(i));
    }

    @Override // oO0oO000.OooO00o
    public byte OooOo(o0Oo0oo descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return Oooo000();
    }

    @Override // oO0oO000.OooO00o
    public int OooOo0(InterfaceC33531OooO0o0 descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooOOo();
    }

    @Override // oO0oO000.OooO00o
    public long OooOo00(InterfaceC33531OooO0o0 descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooO0o0();
    }

    @Override // oO0oO000.OooO0OO
    public oO0oO000.OooO0OO OooOo0O(InterfaceC33531OooO0o0 descriptor) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return this;
    }

    @Override // oO0oO000.OooO0OO
    public boolean OooOoO() {
        OoooO00();
        throw null;
    }

    @Override // oO0oO000.OooO0OO
    public float OooOoO0() {
        OoooO00();
        throw null;
    }

    @Override // oO0oO000.OooO00o
    public char OooOoOO(o0Oo0oo descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooO0oo();
    }

    @Override // oO0oO000.OooO0OO
    public boolean OooOoo0() {
        return true;
    }

    @Override // oO0oO000.OooO0OO
    public Object OooOooo(InterfaceC33910OooO0O0 deserializer) {
        OooOOO0.OooO0oO(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    public abstract String Oooo();

    @Override // oO0oO000.OooO00o
    public String Oooo0(InterfaceC33531OooO0o0 descriptor, int i) {
        OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooOO0();
    }

    @Override // oO0oO000.OooO0OO
    public abstract byte Oooo000();

    @Override // oO0oO000.OooO0OO
    public int Oooo00o(InterfaceC33531OooO0o0 enumDescriptor) {
        OooOOO0.OooO0oO(enumDescriptor, "enumDescriptor");
        OoooO00();
        throw null;
    }

    public abstract void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj);

    public abstract Object Oooo0o();

    public abstract boolean Oooo0oO(AbstractC25573OooO0OO abstractC25573OooO0OO);

    public abstract int OoooO(int i);

    public void OoooO00() {
        throw new C33917OooOO0(C24035Oooo00o.f80943OooO00o.OooO0O0(getClass()) + " can't retrieve untyped values");
    }

    public abstract Object OoooO0O(C25570OooO c25570OooO);

    public abstract String[] OoooOO0();

    public void OoooOOO(InterfaceC24747OooO0O0 connection, Object[] objArr) {
        OooOOO0.OooO0oO(connection, "connection");
        if (objArr == null) {
            return;
        }
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo(Oooo());
        try {
            kotlin.jvm.internal.OooO0O0 OooO0O02 = kotlin.jvm.internal.OooO0OO.OooO0O0(objArr);
            while (OooO0O02.hasNext()) {
                Object next = OooO0O02.next();
                if (next != null) {
                    Oooo0OO(interfaceC24749OooO0OoO0ooOOo, next);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.reset();
                    C24741OooOO0o.OooO0OO(connection);
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            C24099OooOoO0.OooO0o0(interfaceC24749OooO0OoO0ooOOo, null);
        } finally {
        }
    }

    public void OoooOOo(int i) {
    }

    public void OoooOo0(int i, long j) {
    }

    public void OoooOoO(long j) {
    }

    public void OoooOoo(long j) {
    }

    public void Ooooo00(int i) {
    }

    public void Ooooo0o(int i, long j, long j2) {
    }

    public void OooooO0(long j) {
    }

    public void OooooOO(long j) {
    }

    public void Oooooo(o00Oo0 o00oo02) {
    }

    public abstract AbstractC21138OooO0oo Oooooo0(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o);

    public void o000oOoO(InterfaceC24747OooO0O0 connection, Object obj) throws Exception {
        OooOOO0.OooO0oO(connection, "connection");
        if (obj == null) {
            return;
        }
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo(Oooo());
        try {
            Oooo0OO(interfaceC24749OooO0OoO0ooOOo, obj);
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            interfaceC24749OooO0OoO0ooOOo.close();
            C24741OooOO0o.OooO0OO(connection);
        } finally {
        }
    }
}
