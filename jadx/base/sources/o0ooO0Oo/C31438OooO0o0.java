package o0ooO0Oo;

import android.util.Log;
import com.huawei.hms.network.embedded.C18177fb;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31462OooO0oo;
import o0ooO0oo.C31492OooO0oo;
import o0ooOO0O.C31607OooO0O0;
import o0ooOO0O.C31608OooO0OO;
import o0oooOO0.C31835OooO00o;

/* JADX INFO: renamed from: o0ooO0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31438OooO0o0 extends AbstractC31434OooO0O0 implements Closeable {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C31436OooO0Oo f112230OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f112231OooOooO;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f112233Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C31462OooO0oo f112234Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f112235Oooo00o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f112225OooOo = 1.4f;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final HashMap f112227OooOoO0 = new HashMap();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final HashMap f112226OooOoO = new HashMap();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ArrayList f112228OooOoOO = new ArrayList();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f112229OooOoo = true;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f112232OooOooo = false;

    public C31438OooO0o0(C31462OooO0oo c31462OooO0oo) {
        this.f112234Oooo00O = c31462OooO0oo;
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        LinkedList linkedList;
        HashSet hashSet;
        Object obj;
        long j;
        TreeMap treeMap;
        int i;
        long j2;
        c31607OooO0O0.f112981OooOoO.write(("%PDF-" + this.f112225OooOo).getBytes(C31835OooO00o.f113459OooO0Oo));
        c31607OooO0O0.f112981OooOoO.OooO00o();
        c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112966OoooO00);
        c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112965OoooO0);
        c31607OooO0O0.f112981OooOoO.OooO00o();
        C31436OooO0Oo c31436OooO0Oo = this.f112230OooOoo0;
        AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31436OooO0Oo.Oooo0OO(C31441OooOO0.f112388o00O0Oo);
        AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO2 = c31436OooO0Oo.Oooo0OO(C31441OooOO0.f112328o000OOo0);
        AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO3 = c31436OooO0Oo.Oooo0OO(C31441OooOO0.f112322o000OO);
        if (abstractC31434OooO0O0Oooo0OO != null) {
            c31607OooO0O0.OooO00o(abstractC31434OooO0O0Oooo0OO);
        }
        if (abstractC31434OooO0O0Oooo0OO2 != null) {
            c31607OooO0O0.OooO00o(abstractC31434OooO0O0Oooo0OO2);
        }
        while (true) {
            linkedList = c31607OooO0O0.f112990Oooo00O;
            int size = linkedList.size();
            hashSet = c31607OooO0O0.f112989Oooo000;
            if (size <= 0) {
                break;
            }
            AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) linkedList.removeFirst();
            hashSet.remove(abstractC31434OooO0O0);
            c31607OooO0O0.OooO0OO(abstractC31434OooO0O0);
        }
        int i2 = 0;
        c31607OooO0O0.f112995Oooo0o0 = false;
        if (abstractC31434OooO0O0Oooo0OO3 != null) {
            c31607OooO0O0.OooO00o(abstractC31434OooO0O0Oooo0OO3);
        }
        while (linkedList.size() > 0) {
            AbstractC31434OooO0O0 abstractC31434OooO0O02 = (AbstractC31434OooO0O0) linkedList.removeFirst();
            hashSet.remove(abstractC31434OooO0O02);
            c31607OooO0O0.OooO0OO(abstractC31434OooO0O02);
        }
        C31436OooO0Oo c31436OooO0Oo2 = this.f112230OooOoo0;
        long j3 = -1;
        long jO000OO0o = c31436OooO0Oo2 != null ? c31436OooO0Oo2.o000OO0o(C31441OooOO0.f112429o00Oo00) : -1L;
        boolean z = this.f112233Oooo000;
        if (z) {
            if (z || jO000OO0o != -1) {
                C31448OooOOo c31448OooOOoOooOooo = OooOooo();
                TreeMap treeMap2 = new TreeMap();
                TreeSet treeSet = new TreeSet();
                for (C31608OooO0OO c31608OooO0OO : c31607OooO0O0.f112987OooOooo) {
                    treeSet.add(Long.valueOf(c31608OooO0OO.f113000OooOoO0.f112466OooOo0o));
                    if (c31608OooO0OO.f112999OooOoO) {
                        C31492OooO0oo.OooO00o oooO00o = new C31492OooO0oo.OooO00o();
                        C31444OooOOO c31444OooOOO = c31608OooO0OO.f113000OooOoO0;
                        oooO00o.f112665OooO00o = c31444OooOOO.f112465OooOo;
                        long j4 = c31444OooOOO.f112466OooOo0o;
                        oooO00o.f112666OooO0O0 = j4;
                        treeMap2.put(Long.valueOf(j4), oooO00o);
                        i = i2;
                        j2 = j3;
                    } else {
                        C31492OooO0oo.OooO0O0 oooO0O0 = new C31492OooO0oo.OooO0O0();
                        C31444OooOOO c31444OooOOO2 = c31608OooO0OO.f113000OooOoO0;
                        oooO0O0.f112667OooO00o = c31444OooOOO2.f112465OooOo;
                        i = i2;
                        j2 = j3;
                        oooO0O0.f112668OooO0O0 = c31608OooO0OO.f112998OooOo0o;
                        treeMap2.put(Long.valueOf(c31444OooOOO2.f112466OooOo0o), oooO0O0);
                    }
                    i2 = i;
                    j3 = j2;
                }
                int i3 = i2;
                j = j3;
                C31436OooO0Oo c31436OooO0Oo3 = this.f112230OooOoo0;
                c31436OooO0Oo3.o000OOoO(C31441OooOO0.f112382o00O0O0O);
                for (Map.Entry entry : c31436OooO0Oo3.f112222OooOoO0.entrySet()) {
                    C31441OooOO0 c31441OooOO0 = (C31441OooOO0) entry.getKey();
                    if (C31441OooOO0.f112328o000OOo0.equals(c31441OooOO0) || C31441OooOO0.f112388o00O0Oo.equals(c31441OooOO0) || C31441OooOO0.f112322o000OO.equals(c31441OooOO0) || C31441OooOO0.f112320o000O0oO.equals(c31441OooOO0) || C31441OooOO0.f112382o00O0O0O.equals(c31441OooOO0)) {
                        c31448OooOOoOooOooo.o000OoOO(c31441OooOO0, (AbstractC31434OooO0O0) entry.getValue());
                    }
                }
                long j5 = c31607OooO0O0.f112985OooOoo0 + 2;
                c31607OooO0O0.f112983OooOoOO = c31607OooO0O0.f112981OooOoO.f112960OooOo0o;
                c31448OooOOoOooOooo.o000OoOO(C31441OooOO0.f112403o00OO, C31441OooOO0.f112430o00Oo000);
                if (j5 == j) {
                    throw new IllegalArgumentException("size is not set in xrefstream");
                }
                c31448OooOOoOooOooo.o000Ooo0(C31441OooOO0.f112396o00O0o0o, j5);
                LinkedList linkedList2 = new LinkedList();
                TreeSet treeSet2 = new TreeSet();
                long j6 = 0;
                treeSet2.add(0L);
                treeSet2.addAll(treeSet);
                Iterator it = treeSet2.iterator();
                Long l = null;
                Long lValueOf = null;
                while (true) {
                    treeMap = treeMap2;
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Long l2 = (Long) it.next();
                    if (l == null) {
                        lValueOf = 1L;
                        l = l2;
                    }
                    if (lValueOf.longValue() + l.longValue() == l2.longValue()) {
                        lValueOf = Long.valueOf(lValueOf.longValue() + 1);
                    }
                    if (lValueOf.longValue() + l.longValue() < l2.longValue()) {
                        linkedList2.add(l);
                        linkedList2.add(lValueOf);
                        lValueOf = 1L;
                        l = l2;
                    }
                    treeMap2 = treeMap;
                }
                linkedList2.add(l);
                linkedList2.add(lValueOf);
                C31433OooO00o c31433OooO00o = new C31433OooO00o();
                Iterator it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    c31433OooO00o.OooOooo(C31432OooO.o0Oo0oo(((Long) it2.next()).longValue()));
                }
                c31448OooOOoOooOooo.o000OoOO(C31441OooOO0.f112326o000OOO, c31433OooO00o);
                int i4 = 3;
                long[] jArr = new long[3];
                Iterator it3 = treeMap.values().iterator();
                while (true) {
                    int i5 = i3;
                    boolean z2 = true;
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        if (next instanceof C31492OooO0oo.OooO00o) {
                            jArr[i5] = Math.max(jArr[i5], j6);
                            jArr[1] = Math.max(jArr[1], ((C31492OooO0oo.OooO00o) next).f112666OooO0O0);
                            jArr[2] = Math.max(jArr[2], r10.f112665OooO00o);
                        } else if (next instanceof C31492OooO0oo.OooO0O0) {
                            jArr[i5] = Math.max(jArr[i5], 1L);
                            jArr[1] = Math.max(jArr[1], ((C31492OooO0oo.OooO0O0) next).f112668OooO0O0);
                            jArr[2] = Math.max(jArr[2], r10.f112667OooO00o);
                        } else {
                            if (!(next instanceof C31492OooO0oo.OooO0OO)) {
                                throw new RuntimeException("unexpected reference type");
                            }
                            jArr[i5] = Math.max(jArr[i5], 2L);
                            long j7 = jArr[1];
                            ((C31492OooO0oo.OooO0OO) next).getClass();
                            jArr[1] = Math.max(j7, 0L);
                            jArr[2] = Math.max(jArr[2], 0L);
                        }
                        i3 = i5;
                        i4 = 3;
                        j6 = 0;
                    } else {
                        int[] iArr = new int[i4];
                        int i6 = i5;
                        while (i6 < i4) {
                            while (true) {
                                long j8 = jArr[i6];
                                if (j8 > 0) {
                                    iArr[i6] = iArr[i6] + 1;
                                    jArr[i6] = j8 >> 8;
                                }
                            }
                            i6++;
                            i4 = 3;
                        }
                        C31433OooO00o c31433OooO00o2 = new C31433OooO00o();
                        for (int i7 = i5; i7 < 3; i7++) {
                            c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(iArr[i7]));
                        }
                        c31448OooOOoOooOooo.o000OoOO(C31441OooOO0.f112452oOooo0o, c31433OooO00o2);
                        C31447OooOOOo c31447OooOOOoO000o00o = c31448OooOOoOooOooo.o000o00o(C31441OooOO0.f112301o0000o0O);
                        C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, 0L, iArr[i5]);
                        C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, 0L, iArr[1]);
                        C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, C18177fb.f54859s, iArr[2]);
                        for (Object obj2 : treeMap.values()) {
                            if (obj2 instanceof C31492OooO0oo.OooO00o) {
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, 0L, iArr[i5]);
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, ((C31492OooO0oo.OooO00o) obj2).f112666OooO0O0, iArr[1]);
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, r10.f112665OooO00o, iArr[2]);
                            } else if (obj2 instanceof C31492OooO0oo.OooO0O0) {
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, 1L, iArr[i5]);
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, ((C31492OooO0oo.OooO0O0) obj2).f112668OooO0O0, iArr[1]);
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, r10.f112667OooO00o, iArr[2]);
                            } else {
                                if (!(obj2 instanceof C31492OooO0oo.OooO0OO)) {
                                    throw new RuntimeException("unexpected reference type");
                                }
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, 2L, iArr[i5]);
                                ((C31492OooO0oo.OooO0OO) obj2).getClass();
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, 0L, iArr[1]);
                                C31492OooO0oo.OooO00o(c31447OooOOOoO000o00o, 0L, iArr[2]);
                            }
                        }
                        c31447OooOOOoO000o00o.flush();
                        c31447OooOOOoO000o00o.close();
                        for (C31441OooOO0 c31441OooOO02 : c31448OooOOoOooOooo.f112222OooOoO0.keySet()) {
                            if (!C31441OooOO0.f112388o00O0Oo.equals(c31441OooOO02) && !C31441OooOO0.f112328o000OOo0.equals(c31441OooOO02) && !C31441OooOO0.f112382o00O0O0O.equals(c31441OooOO02) && !C31441OooOO0.f112322o000OO.equals(c31441OooOO02)) {
                                boolean z3 = z2;
                                c31448OooOOoOooOooo.o0000O0O(c31441OooOO02).f112215OooOo0o = z3;
                                z2 = z3;
                            }
                        }
                        c31607OooO0O0.OooO0OO(c31448OooOOoOooOooo);
                    }
                }
            } else {
                j = -1;
                obj = null;
            }
            if (!this.f112233Oooo000 || jO000OO0o != j) {
                C31436OooO0Oo c31436OooO0Oo4 = this.f112230OooOoo0;
                c31436OooO0Oo4.o000Ooo0(C31441OooOO0.f112382o00O0O0O, this.f112231OooOooO);
                if (jO000OO0o != j) {
                    C31441OooOO0 c31441OooOO03 = C31441OooOO0.f112429o00Oo00;
                    c31436OooO0Oo4.o000OOoO(c31441OooOO03);
                    c31436OooO0Oo4.o000Ooo0(c31441OooOO03, c31607OooO0O0.f112983OooOoOO);
                }
                c31607OooO0O0.OooOOo0();
                c31607OooO0O0.OooOOO0(this);
            }
        } else {
            obj = null;
            c31607OooO0O0.OooOOo0();
            c31607OooO0O0.OooOOO0(this);
        }
        c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112971OoooOo0);
        c31607OooO0O0.f112981OooOoO.OooO00o();
        c31607OooO0O0.f112981OooOoO.write(String.valueOf(c31607OooO0O0.f112983OooOoOO).getBytes(C31835OooO00o.f113459OooO0Oo));
        c31607OooO0O0.f112981OooOoO.OooO00o();
        c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112967OoooO0O);
        c31607OooO0O0.f112981OooOoO.OooO00o();
        return obj;
    }

    public final C31448OooOOo OooOooo() {
        C31448OooOOo c31448OooOOo = new C31448OooOOo(this.f112234Oooo00O);
        this.f112228OooOoOO.add(c31448OooOOo);
        return c31448OooOOo;
    }

    public final C31445OooOOO0 Oooo00o(C31444OooOOO c31444OooOOO) throws IOException {
        HashMap map = this.f112227OooOoO0;
        C31445OooOOO0 c31445OooOOO0 = c31444OooOOO != null ? (C31445OooOOO0) map.get(c31444OooOOO) : null;
        if (c31445OooOOO0 == null) {
            c31445OooOOO0 = new C31445OooOOO0(null);
            if (c31444OooOOO != null) {
                c31445OooOOO0.f112469OooOoO0 = c31444OooOOO.f112466OooOo0o;
                c31445OooOOO0.f112468OooOoO = c31444OooOOO.f112465OooOo;
                map.put(c31444OooOOO, c31445OooOOO0);
            }
        }
        return c31445OooOOO0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f112232OooOooo) {
            return;
        }
        Iterator it = new ArrayList(this.f112227OooOoO0.values()).iterator();
        IOException iOExceptionOooO00o = null;
        while (it.hasNext()) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0 = ((C31445OooOOO0) it.next()).f112467OooOo;
            if (abstractC31434OooO0O0 instanceof C31448OooOOo) {
                iOExceptionOooO00o = C31455OooO00o.OooO00o((C31448OooOOo) abstractC31434OooO0O0, "COSStream", iOExceptionOooO00o);
            }
        }
        Iterator it2 = this.f112228OooOoOO.iterator();
        while (it2.hasNext()) {
            iOExceptionOooO00o = C31455OooO00o.OooO00o((C31448OooOOo) it2.next(), "COSStream", iOExceptionOooO00o);
        }
        C31462OooO0oo c31462OooO0oo = this.f112234Oooo00O;
        if (c31462OooO0oo != null) {
            iOExceptionOooO00o = C31455OooO00o.OooO00o(c31462OooO0oo, "ScratchFile", iOExceptionOooO00o);
        }
        this.f112232OooOooo = true;
        if (iOExceptionOooO00o != null) {
            throw iOExceptionOooO00o;
        }
    }

    public final void finalize() throws IOException {
        if (this.f112232OooOooo) {
            return;
        }
        if (this.f112229OooOoo) {
            Log.w("PdfBox-Android", "Warning: You did not close a PDF Document");
        }
        close();
    }
}
