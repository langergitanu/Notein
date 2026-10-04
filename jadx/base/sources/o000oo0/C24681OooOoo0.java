package o000oo0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o000oooO.InterfaceC24758OooO0Oo;
import o000oooO.InterfaceC24760OooO0o0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000oo0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24681OooOoo0 implements InterfaceC24760OooO0o0, InterfaceC24758OooO0Oo {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final TreeMap<Integer, C24681OooOoo0> f83632OooOooo = new TreeMap<>();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile String f83633OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f83634OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final double[] f83635OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long[] f83636OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String[] f83637OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int[] f83638OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[][] f83639OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f83640OooOooO;

    public C24681OooOoo0(int i) {
        this.f83634OooOo0o = i;
        int i2 = i + 1;
        this.f83638OooOoo = new int[i2];
        this.f83636OooOoO0 = new long[i2];
        this.f83635OooOoO = new double[i2];
        this.f83637OooOoOO = new String[i2];
        this.f83639OooOoo0 = new byte[i2][];
    }

    public static final C24681OooOoo0 OooOOO0(int i, String query) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(query, "query");
        TreeMap<Integer, C24681OooOoo0> treeMap = f83632OooOooo;
        synchronized (treeMap) {
            Map.Entry<Integer, C24681OooOoo0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                C24681OooOoo0 c24681OooOoo0 = new C24681OooOoo0(i);
                c24681OooOoo0.f83633OooOo = query;
                c24681OooOoo0.f83640OooOooO = i;
                return c24681OooOoo0;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C24681OooOoo0 value = entryCeilingEntry.getValue();
            value.getClass();
            value.f83633OooOo = query;
            value.f83640OooOooO = i;
            return value;
        }
    }

    @Override // o000oooO.InterfaceC24760OooO0o0
    public final String OooO00o() {
        String str = this.f83633OooOo;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // o000oooO.InterfaceC24760OooO0o0
    public final void OooO0OO(InterfaceC24758OooO0Oo interfaceC24758OooO0Oo) {
        int i = this.f83640OooOooO;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f83638OooOoo[i2];
            if (i3 == 1) {
                interfaceC24758OooO0Oo.OooO0oO(i2);
            } else if (i3 == 2) {
                interfaceC24758OooO0Oo.OooO0o(i2, this.f83636OooOoO0[i2]);
            } else if (i3 == 3) {
                interfaceC24758OooO0Oo.OooOOOO(this.f83635OooOoO[i2], i2);
            } else if (i3 == 4) {
                String str = this.f83637OooOoOO[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC24758OooO0Oo.OoooOO0(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f83639OooOoo0[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC24758OooO0Oo.OooooO0(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooO0o(int i, long j) {
        this.f83638OooOoo[i] = 2;
        this.f83636OooOoO0[i] = j;
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooO0oO(int i) {
        this.f83638OooOoo[i] = 1;
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooOOOO(double d, int i) {
        this.f83638OooOoo[i] = 3;
        this.f83635OooOoO[i] = d;
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OoooOO0(int i, String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f83638OooOoo[i] = 4;
        this.f83637OooOoOO[i] = value;
    }

    @Override // o000oooO.InterfaceC24758OooO0Oo
    public final void OooooO0(int i, byte[] bArr) {
        this.f83638OooOoo[i] = 5;
        this.f83639OooOoo0[i] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void release() {
        TreeMap<Integer, C24681OooOoo0> treeMap = f83632OooOooo;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f83634OooOo0o), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.OooOOO0.OooO0o(it, "iterator(...)");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }
}
