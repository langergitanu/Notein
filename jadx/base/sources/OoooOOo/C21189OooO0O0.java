package OoooOOo;

import OooOo.C20486OooOoO0;
import OooOo.C20492Oooo00O;
import Oooo.C20812OooO0Oo;
import Oooo0oO.o000000O;
import OoooOOo.AbstractC21195OooO0oo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: OoooOOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21189OooO0O0 extends AbstractC21194OooO0oO {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f61456OooOOO = new int[0];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList f61457OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<Object, C32460OooOooO> f61458OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<Object, C32460OooOooO> f61459OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f61460OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C20486OooOoO0<InterfaceC21222Oooo0O0> f61461OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C21196OooOO0 f61462OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int[] f61463OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f61464OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f61465OooOOO0;

    public C21189OooO0O0(int i, C21196OooOO0 c21196OooOO0, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o2) {
        super(i, c21196OooOO0);
        this.f61459OooO0o0 = interfaceC32507OooOO0o;
        this.f61458OooO0o = interfaceC32507OooOO0o2;
        this.f61462OooOO0 = C21196OooOO0.f61478OooOoOO;
        this.f61463OooOO0O = f61456OooOOO;
        this.f61464OooOO0o = 1;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public InterfaceC32507OooOO0o<Object, C32460OooOooO> OooO() {
        return this.f61458OooO0o;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final void OooO0O0() {
        C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0Oo(OooO0Oo()).OooO0O0(this.f61462OooOO0);
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public void OooO0OO() {
        if (this.f61475OooO0OO) {
            return;
        }
        super.OooO0OO();
        OooOO0o();
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public boolean OooO0oO() {
        return false;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public int OooO0oo() {
        return this.f61460OooO0oO;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public void OooOO0O() {
        this.f61464OooOO0o++;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    @Override // OoooOOo.AbstractC21194OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OooOO0o() {
        int i = this.f61464OooOO0o;
        if (!(i > 0)) {
            o000000O.OooO0O0("no pending nested snapshots");
            throw null;
        }
        int i2 = i - 1;
        this.f61464OooOO0o = i2;
        if (i2 != 0 || this.f61465OooOOO0) {
            return;
        }
        C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0OooOo0o = OooOo0o();
        if (c20486OooOoO0OooOo0o != null) {
            if (this.f61465OooOOO0) {
                o000000O.OooO0OO("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            OooOoOO(null);
            int iOooO0Oo = OooO0Oo();
            Object[] objArr = c20486OooOoO0OooOo0o.f58542OooO0O0;
            long[] jArr = c20486OooOoO0OooOo0o.f58541OooO00o;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                for (AbstractC21225Oooo0o0 abstractC21225Oooo0o0OooO0o0 = ((InterfaceC21222Oooo0O0) objArr[(i3 << 3) + i5]).OooO0o0(); abstractC21225Oooo0o0OooO0o0 != null; abstractC21225Oooo0o0OooO0o0 = abstractC21225Oooo0o0OooO0o0.f61575OooO0O0) {
                                    int i6 = abstractC21225Oooo0o0OooO0o0.f61574OooO00o;
                                    if (i6 == iOooO0Oo || oOo000Oo.OooOo.Oooo00o(this.f61462OooOO0, Integer.valueOf(i6))) {
                                        abstractC21225Oooo0o0OooO0o0.f61574OooO00o = 0;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        OooO00o();
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public void OooOOO(InterfaceC21222Oooo0O0 interfaceC21222Oooo0O0) {
        C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0OooOo0o = OooOo0o();
        if (c20486OooOoO0OooOo0o == null) {
            int i = C20492Oooo00O.f58547OooO00o;
            c20486OooOoO0OooOo0o = new C20486OooOoO0<>((Object) null);
            OooOoOO(c20486OooOoO0OooOo0o);
        }
        c20486OooOoO0OooOo0o.OooO0Oo(interfaceC21222Oooo0O0);
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public void OooOOO0() {
        if (this.f61465OooOOO0 || this.f61475OooO0OO) {
            return;
        }
        OooOo0();
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public final void OooOOOO() {
        int length = this.f61463OooOO0O.length;
        for (int i = 0; i < length; i++) {
            C21200OooOOO0.OooOo0(this.f61463OooOO0O[i]);
        }
        int i2 = this.f61476OooO0Oo;
        if (i2 >= 0) {
            C21200OooOOO0.OooOo0(i2);
            this.f61476OooO0Oo = -1;
        }
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public void OooOOoo(int i) {
        this.f61460OooO0oO = i;
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    /* JADX INFO: renamed from: OooOo, reason: merged with bridge method [inline-methods] */
    public InterfaceC32507OooOO0o<Object, C32460OooOooO> OooO0o() {
        return this.f61459OooO0o0;
    }

    public final void OooOo0() {
        OooOoO(OooO0Oo());
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        if (this.f61465OooOOO0 || this.f61475OooO0OO) {
            return;
        }
        int iOooO0Oo = OooO0Oo();
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            int i = C21200OooOOO0.f61499OooO0o0;
            C21200OooOOO0.f61499OooO0o0 = i + 1;
            OooOOo0(i);
            C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0oO(OooO0Oo());
        }
        OooOOo(C21200OooOOO0.OooO0o0(OooO0o0(), iOooO0Oo + 1, OooO0Oo()));
    }

    @Override // OoooOOo.AbstractC21194OooO0oO
    public AbstractC21194OooO0oO OooOo00(InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o) {
        C21191OooO0Oo c21191OooO0Oo;
        if (this.f61475OooO0OO) {
            o000000O.OooO0O0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f61465OooOOO0 && this.f61476OooO0Oo < 0) {
            o000000O.OooO0OO("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int iOooO0Oo = OooO0Oo();
        OooOoO(OooO0Oo());
        Object obj = C21200OooOOO0.f61496OooO0OO;
        synchronized (obj) {
            int i = C21200OooOOO0.f61499OooO0o0;
            C21200OooOOO0.f61499OooO0o0 = i + 1;
            C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0oO(i);
            c21191OooO0Oo = new C21191OooO0Oo(i, C21200OooOOO0.OooO0o0(OooO0o0(), iOooO0Oo + 1, i), C21200OooOOO0.OooOO0o(interfaceC32507OooOO0o, OooO0o(), true), this);
        }
        if (this.f61465OooOOO0 || this.f61475OooO0OO) {
            return c21191OooO0Oo;
        }
        int iOooO0Oo2 = OooO0Oo();
        synchronized (obj) {
            int i2 = C21200OooOOO0.f61499OooO0o0;
            C21200OooOOO0.f61499OooO0o0 = i2 + 1;
            OooOOo0(i2);
            C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0oO(OooO0Oo());
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        OooOOo(C21200OooOOO0.OooO0o0(OooO0o0(), iOooO0Oo2 + 1, OooO0Oo()));
        return c21191OooO0Oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a A[Catch: all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ec, B:50:0x00f8, B:52:0x0102, B:54:0x0108, B:57:0x0117, B:64:0x012a, B:67:0x0134, B:69:0x013e, B:71:0x0148, B:73:0x014e, B:74:0x0158, B:77:0x0160, B:78:0x0163, B:80:0x0167, B:82:0x016e, B:83:0x017a, B:60:0x011f), top: B:91:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167 A[Catch: all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ec, B:50:0x00f8, B:52:0x0102, B:54:0x0108, B:57:0x0117, B:64:0x012a, B:67:0x0134, B:69:0x013e, B:71:0x0148, B:73:0x014e, B:74:0x0158, B:77:0x0160, B:78:0x0163, B:80:0x0167, B:82:0x016e, B:83:0x017a, B:60:0x011f), top: B:91:0x00ce }] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC21195OooO0oo OooOo0O() {
        HashMap mapOooO0OO;
        C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0;
        ?? r5;
        long j;
        long j2;
        ArrayList arrayList;
        C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0OooOo0o = OooOo0o();
        if (c20486OooOoO0OooOo0o != null) {
            AtomicReference<C21188OooO00o> atomicReference = C21200OooOOO0.f61502OooOO0;
            mapOooO0OO = C21200OooOOO0.OooO0OO(atomicReference.get(), this, C21200OooOOO0.f61497OooO0Oo.OooO0Oo(atomicReference.get().f61474OooO0O0));
        } else {
            mapOooO0OO = null;
        }
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            try {
                C21200OooOOO0.OooO0Oo(this);
                if (c20486OooOoO0OooOo0o == null || c20486OooOoO0OooOo0o.f58544OooO0Oo == 0) {
                    OooO0O0();
                    C21188OooO00o c21188OooO00o = C21200OooOOO0.f61502OooOO0.get();
                    C21200OooOOO0.OooOo0O(c21188OooO00o, C21200OooOOO0.f61494OooO00o);
                    c20486OooOoO0 = c21188OooO00o.f61461OooO0oo;
                    if (c20486OooOoO0 == null || !c20486OooOoO0.OooO0OO()) {
                        c20486OooOoO0 = null;
                        r5 = c34434OooOoO;
                    } else {
                        r5 = C21200OooOOO0.f61501OooO0oo;
                    }
                } else {
                    C21188OooO00o c21188OooO00o2 = C21200OooOOO0.f61502OooOO0.get();
                    AbstractC21195OooO0oo abstractC21195OooO0ooOooOoO0 = OooOoO0(C21200OooOOO0.f61499OooO0o0, mapOooO0OO, C21200OooOOO0.f61497OooO0Oo.OooO0Oo(c21188OooO00o2.f61474OooO0O0));
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC21195OooO0ooOooOoO0, AbstractC21195OooO0oo.OooO0O0.f61477OooO00o)) {
                        return abstractC21195OooO0ooOooOoO0;
                    }
                    OooO0O0();
                    C21200OooOOO0.OooOo0O(c21188OooO00o2, C21200OooOOO0.f61494OooO00o);
                    c20486OooOoO0 = c21188OooO00o2.f61461OooO0oo;
                    OooOoOO(null);
                    c21188OooO00o2.f61461OooO0oo = null;
                    r5 = C21200OooOOO0.f61501OooO0oo;
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                this.f61465OooOOO0 = true;
                if (c20486OooOoO0 != null) {
                    C20812OooO0Oo c20812OooO0Oo = new C20812OooO0Oo(c20486OooOoO0);
                    if (!c20486OooOoO0.OooO0O0()) {
                        int size = r5.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC32508OooOOOo) r5.get(i)).invoke(c20812OooO0Oo, this);
                        }
                    }
                }
                if (c20486OooOoO0OooOo0o != null && c20486OooOoO0OooOo0o.OooO0OO()) {
                    C20812OooO0Oo c20812OooO0Oo2 = new C20812OooO0Oo(c20486OooOoO0OooOo0o);
                    int size2 = r5.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC32508OooOOOo) r5.get(i2)).invoke(c20812OooO0Oo2, this);
                    }
                }
                synchronized (C21200OooOOO0.f61496OooO0OO) {
                    try {
                        OooOOOO();
                        C21200OooOOO0.OooO0oO();
                        if (c20486OooOoO0 != null) {
                            Object[] objArr = c20486OooOoO0.f58542OooO0O0;
                            long[] jArr = c20486OooOoO0.f58541OooO00o;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j3 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j3 & 255) < 128) {
                                                C21200OooOOO0.OooOOo0((InterfaceC21222Oooo0O0) objArr[(i3 << 3) + i5]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                            if (c20486OooOoO0OooOo0o != null) {
                                Object[] objArr2 = c20486OooOoO0OooOo0o.f58542OooO0O0;
                                long[] jArr2 = c20486OooOoO0OooOo0o.f58541OooO00o;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j4 = jArr2[i6];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                            for (int i8 = 0; i8 < i7; i8++) {
                                                if ((j4 & j2) < j) {
                                                    C21200OooOOO0.OooOOo0((InterfaceC21222Oooo0O0) objArr2[(i6 << 3) + i8]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i7 != 8) {
                                                break;
                                            }
                                            if (i6 == length2) {
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                            }
                            arrayList = this.f61457OooO;
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    C21200OooOOO0.OooOOo0((InterfaceC21222Oooo0O0) arrayList.get(i9));
                                }
                            }
                            this.f61457OooO = null;
                            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                        }
                        j = 128;
                        j2 = 255;
                        if (c20486OooOoO0OooOo0o != null) {
                        }
                        arrayList = this.f61457OooO;
                        if (arrayList != null) {
                        }
                        this.f61457OooO = null;
                        C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return AbstractC21195OooO0oo.OooO0O0.f61477OooO00o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C20486OooOoO0<InterfaceC21222Oooo0O0> OooOo0o() {
        return this.f61461OooO0oo;
    }

    public final void OooOoO(int i) {
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            this.f61462OooOO0 = this.f61462OooOO0.OooO0oO(i);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC21195OooO0oo OooOoO0(int i, HashMap map, C21196OooOO0 c21196OooOO0) {
        ArrayList arrayList;
        ArrayList arrayListOooooOO;
        ArrayList arrayList2;
        C21196OooOO0 c21196OooOO02;
        Object[] objArr;
        long[] jArr;
        C21196OooOO0 c21196OooOO03;
        Object[] objArr2;
        long[] jArr2;
        int i2;
        AbstractC21225Oooo0o0 abstractC21225Oooo0o0OooOOoo;
        AbstractC21225Oooo0o0 abstractC21225Oooo0o0OooO0o;
        C21196OooOO0 c21196OooOO0OooO0o = OooO0o0().OooO0oO(OooO0Oo()).OooO0o(this.f61462OooOO0);
        C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0OooOo0o = OooOo0o();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c20486OooOoO0OooOo0o);
        Object[] objArr3 = c20486OooOoO0OooOo0o.f58542OooO0O0;
        long[] jArr3 = c20486OooOoO0OooOo0o.f58541OooO00o;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            arrayList2 = null;
            arrayListOooooOO = null;
            while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            i2 = i4;
                            InterfaceC21222Oooo0O0 interfaceC21222Oooo0O0 = (InterfaceC21222Oooo0O0) objArr3[(i3 << 3) + i6];
                            AbstractC21225Oooo0o0 abstractC21225Oooo0o0OooO0o0 = interfaceC21222Oooo0O0.OooO0o0();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList2;
                            AbstractC21225Oooo0o0 abstractC21225Oooo0o0OooOOoo2 = C21200OooOOO0.OooOOoo(abstractC21225Oooo0o0OooO0o0, i, c21196OooOO0);
                            if (abstractC21225Oooo0o0OooOOoo2 == null || (abstractC21225Oooo0o0OooOOoo = C21200OooOOO0.OooOOoo(abstractC21225Oooo0o0OooO0o0, OooO0Oo(), c21196OooOO0OooO0o)) == null) {
                                c21196OooOO03 = c21196OooOO0OooO0o;
                            } else {
                                c21196OooOO03 = c21196OooOO0OooO0o;
                                if (abstractC21225Oooo0o0OooOOoo.f61574OooO00o != 1 && !abstractC21225Oooo0o0OooOOoo2.equals(abstractC21225Oooo0o0OooOOoo)) {
                                    AbstractC21225Oooo0o0 abstractC21225Oooo0o0OooOOoo3 = C21200OooOOO0.OooOOoo(abstractC21225Oooo0o0OooO0o0, OooO0Oo(), OooO0o0());
                                    if (abstractC21225Oooo0o0OooOOoo3 == null) {
                                        C21200OooOOO0.OooOOo();
                                        throw null;
                                    }
                                    if (map == null || (abstractC21225Oooo0o0OooO0o = (AbstractC21225Oooo0o0) map.get(abstractC21225Oooo0o0OooOOoo2)) == null) {
                                        abstractC21225Oooo0o0OooO0o = interfaceC21222Oooo0O0.OooO0o(abstractC21225Oooo0o0OooOOoo, abstractC21225Oooo0o0OooOOoo2, abstractC21225Oooo0o0OooOOoo3);
                                    }
                                    if (abstractC21225Oooo0o0OooO0o == null) {
                                        return new AbstractC21195OooO0oo.OooO00o();
                                    }
                                    if (!abstractC21225Oooo0o0OooO0o.equals(abstractC21225Oooo0o0OooOOoo3)) {
                                        if (abstractC21225Oooo0o0OooO0o.equals(abstractC21225Oooo0o0OooOOoo2)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(new C32443OooOOO(interfaceC21222Oooo0O0, abstractC21225Oooo0o0OooOOoo2.OooO0O0()));
                                            if (arrayListOooooOO == null) {
                                                arrayListOooooOO = new ArrayList();
                                            }
                                            arrayListOooooOO.add(interfaceC21222Oooo0O0);
                                            arrayList2 = arrayList4;
                                        } else {
                                            arrayList2 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList2.add(!abstractC21225Oooo0o0OooO0o.equals(abstractC21225Oooo0o0OooOOoo) ? new C32443OooOOO(interfaceC21222Oooo0O0, abstractC21225Oooo0o0OooO0o) : new C32443OooOOO(interfaceC21222Oooo0O0, abstractC21225Oooo0o0OooOOoo.OooO0O0()));
                                        }
                                    }
                                }
                            }
                            arrayList2 = arrayList3;
                        } else {
                            c21196OooOO03 = c21196OooOO0OooO0o;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i2 = i4;
                        }
                        j >>= i2;
                        i6++;
                        i4 = i2;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        c21196OooOO0OooO0o = c21196OooOO03;
                    }
                    c21196OooOO02 = c21196OooOO0OooO0o;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    c21196OooOO02 = c21196OooOO0OooO0o;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i3++;
                objArr3 = objArr;
                jArr3 = jArr;
                c21196OooOO0OooO0o = c21196OooOO02;
            }
        } else {
            arrayList = null;
            arrayListOooooOO = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            OooOo0();
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                C32443OooOOO c32443OooOOO = (C32443OooOOO) arrayList2.get(i7);
                InterfaceC21222Oooo0O0 interfaceC21222Oooo0O02 = (InterfaceC21222Oooo0O0) c32443OooOOO.f116638OooOo0o;
                AbstractC21225Oooo0o0 abstractC21225Oooo0o0 = (AbstractC21225Oooo0o0) c32443OooOOO.f116637OooOo;
                abstractC21225Oooo0o0.f61574OooO00o = OooO0Oo();
                synchronized (C21200OooOOO0.f61496OooO0OO) {
                    abstractC21225Oooo0o0.f61575OooO0O0 = interfaceC21222Oooo0O02.OooO0o0();
                    interfaceC21222Oooo0O02.OooO0Oo(abstractC21225Oooo0o0);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
            }
        }
        if (arrayListOooooOO != null) {
            int size2 = arrayListOooooOO.size();
            for (int i8 = 0; i8 < size2; i8++) {
                c20486OooOoO0OooOo0o.OooOO0((InterfaceC21222Oooo0O0) arrayListOooooOO.get(i8));
            }
            ArrayList arrayList5 = this.f61457OooO;
            if (arrayList5 != null) {
                arrayListOooooOO = oOo000Oo.OooOo.OooooOO(arrayList5, arrayListOooooOO);
            }
            this.f61457OooO = arrayListOooooOO;
        }
        return AbstractC21195OooO0oo.OooO0O0.f61477OooO00o;
    }

    public void OooOoOO(C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0) {
        this.f61461OooO0oo = c20486OooOoO0;
    }

    public C21189OooO0O0 OooOoo0(InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o2) throws Throwable {
        if (this.f61475OooO0OO) {
            o000000O.OooO0O0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f61465OooOOO0 && this.f61476OooO0Oo < 0) {
            o000000O.OooO0OO("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        OooOoO(OooO0Oo());
        Object obj = C21200OooOOO0.f61496OooO0OO;
        synchronized (obj) {
            try {
                int i = C21200OooOOO0.f61499OooO0o0;
                C21200OooOOO0.f61499OooO0o0 = i + 1;
                C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0oO(i);
                C21196OooOO0 c21196OooOO0OooO0o0 = OooO0o0();
                OooOOo(c21196OooOO0OooO0o0.OooO0oO(i));
                try {
                    C21190OooO0OO c21190OooO0OO = new C21190OooO0OO(i, C21200OooOOO0.OooO0o0(c21196OooOO0OooO0o0, OooO0Oo() + 1, i), C21200OooOOO0.OooOO0o(interfaceC32507OooOO0o, OooO0o(), true), C21200OooOOO0.OooO0O0(interfaceC32507OooOO0o2, OooO()), this);
                    if (this.f61465OooOOO0 || this.f61475OooO0OO) {
                        return c21190OooO0OO;
                    }
                    int iOooO0Oo = OooO0Oo();
                    synchronized (obj) {
                        int i2 = C21200OooOOO0.f61499OooO0o0;
                        C21200OooOOO0.f61499OooO0o0 = i2 + 1;
                        OooOOo0(i2);
                        C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0oO(OooO0Oo());
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    OooOOo(C21200OooOOO0.OooO0o0(OooO0o0(), iOooO0Oo + 1, OooO0Oo()));
                    return c21190OooO0OO;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
