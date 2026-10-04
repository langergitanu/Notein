package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.PptReadException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18177fb;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.qw */
/* JADX INFO: loaded from: classes3.dex */
public class C3080qw {

    /* JADX INFO: renamed from: k4 */
    private final SortedList<Long, InterfaceC3096vh> f9138k4;

    /* JADX INFO: renamed from: kk */
    private C3051fa f9139kk;

    /* JADX INFO: renamed from: to */
    private C3060ix f9140to;

    /* JADX INFO: renamed from: x1 */
    private int f9141x1;

    public C3080qw() {
        SortedList<Long, InterfaceC3096vh> sortedList = new SortedList<>();
        this.f9138k4 = sortedList;
        this.f9141x1 = 1252;
        this.f9139kk = new C3051fa();
        sortedList.set_Item(0L, this.f9139kk);
        this.f9141x1 = 1200;
        sortedList.set_Item(1L, new C3114yo((short) this.f9141x1));
        this.f9139kk.m12906k4().set_Item(2L, "_PID_HLINKS");
        this.f9140to = new C3060ix();
        sortedList.set_Item(2L, this.f9140to);
    }

    /* JADX INFO: renamed from: h4 */
    private int m13027h4() {
        InterfaceC3096vh[] interfaceC3096vhArr = {null};
        this.f9138k4.tryGetValue(1L, interfaceC3096vhArr);
        InterfaceC3096vh interfaceC3096vh = interfaceC3096vhArr[0];
        if (interfaceC3096vh == null || !C7019kk.m27469x1(interfaceC3096vh, C3114yo.class)) {
            return 1252;
        }
        short[] sArr = {0};
        boolean zM13289k4 = ((C3114yo) interfaceC3096vh).m13289k4(sArr);
        short s = sArr[0];
        if (zM13289k4) {
            return 65535 & s;
        }
        return 1252;
    }

    /* JADX INFO: renamed from: du */
    public final byte[] m13028du() {
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        c3149x1.m13447k4(0L);
        c3149x1.m13447k4(0L);
        int size = this.f9138k4.size();
        int i = size * 8;
        c3149x1.m13450k4(new byte[i]);
        int[] iArr = new int[size];
        IGenericEnumerator<KeyValuePair<Long, InterfaceC3096vh>> it = this.f9138k4.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            try {
                byte[] bArrMo12907x1 = it.next().getValue().mo12907x1();
                c3149x1.m13450k4(bArrMo12907x1);
                int i4 = i3 + 1;
                iArr[i3] = bArrMo12907x1.length;
                i3 = i4;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3152yj.seek(0L, 0);
        c3149x1.m13447k4(c3152yj.getLength() & 4294967295L);
        c3149x1.m13447k4(((long) size) & 4294967295L);
        int i5 = i + 8;
        it = this.f9138k4.iterator();
        while (it.hasNext()) {
            try {
                c3149x1.m13447k4(it.next().getKey().longValue());
                c3149x1.m13447k4(((long) i5) & 4294967295L);
                int i6 = i2 + 1;
                i5 += iArr[i2];
                i2 = i6;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3149x1.m13454x1();
        return c3152yj.toArray();
    }

    /* JADX INFO: renamed from: k4 */
    public final SortedList<Long, InterfaceC3096vh> m13029k4() {
        return this.f9138k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m13048kk() {
        return ((this.f9138k4.getKeys().get_Item(this.f9138k4.size() - 1).longValue() & 4294967295L) + 1) & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    public final void m13049to() {
        this.f9139kk = new C3051fa();
        this.f9138k4.set_Item(0L, this.f9139kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final C3051fa m13050x1() {
        return this.f9139kk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3080qw(AbstractC3150x6 abstractC3150x6, long j, int i) {
        C3051fa c3051fa;
        SortedList<Long, InterfaceC3096vh> sortedList;
        C3051fa c3051fa2;
        this.f9138k4 = new SortedList<>();
        this.f9141x1 = 1252;
        long j2 = j & 4294967295L;
        abstractC3150x6.seek(j2, 0);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long jM13384uz = c3134k4.m13384uz();
        long jM13384uz2 = c3134k4.m13384uz();
        long j3 = jM13384uz & 4294967295L;
        if ((jM13384uz & C18177fb.f54859s) == 0 && (jM13384uz & 4294901760L) != 0) {
            throw new PptReadException("Property set stored in BigEndian format (Size)");
        }
        long j4 = jM13384uz2 & 4294967295L;
        if ((C18177fb.f54859s & jM13384uz2) == 0 && (jM13384uz2 & 4294901760L) != 0) {
            throw new PptReadException("Property set stored in BigEndian format (Number)");
        }
        if (j3 > abstractC3150x6.getLength()) {
            throw new PptReadException("Property set is not valid");
        }
        SortedList sortedList2 = new SortedList();
        SortedList sortedList3 = new SortedList();
        for (int i2 = 0; i2 < j4; i2++) {
            sortedList2.set_Item(Long.valueOf(c3134k4.m13384uz()), Long.valueOf(c3134k4.m13384uz()));
        }
        int i3 = 0;
        while (i3 < sortedList2.size()) {
            Long l = (Long) sortedList2.getKeys().get_Item(i3);
            long jLongValue = l.longValue();
            Long l2 = (Long) sortedList2.get_Item(l);
            l2.longValue();
            i3++;
            sortedList3.set_Item(l2, Long.valueOf(i3 < sortedList2.size() ? ((((Long) sortedList2.getKeys().get_Item(i3)).longValue() & 4294967295L) - (jLongValue & 4294967295L)) & 4294967295L : (j3 - (jLongValue & 4294967295L)) & 4294967295L));
        }
        IGenericEnumerator<KeyValuePair<Long, String>> it = sortedList2.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                long jLongValue2 = ((Long) keyValuePair.getKey()).longValue();
                Long l3 = (Long) keyValuePair.getValue();
                long jLongValue3 = l3.longValue();
                long j5 = j2;
                long jLongValue4 = ((Long) sortedList3.get_Item(l3)).longValue();
                abstractC3150x6.seek((j5 + (jLongValue2 & 4294967295L)) & 4294967295L, 0);
                byte[] bArrM13372dy = c3134k4.m13372dy((int) jLongValue4);
                if ((jLongValue3 & 4294967295L) != 0) {
                    this.f9138k4.set_Item(l3, new C3114yo(bArrM13372dy));
                }
                j2 = j5;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        long j6 = j2;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        this.f9141x1 = m13027h4();
        IGenericEnumerator it2 = sortedList2.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair keyValuePair2 = (KeyValuePair) it2.next();
                Long l4 = (Long) keyValuePair2.getValue();
                if ((l4.longValue() & 4294967295L) == 0) {
                    long jLongValue5 = ((Long) keyValuePair2.getKey()).longValue();
                    long jLongValue6 = ((Long) sortedList3.get_Item(l4)).longValue();
                    abstractC3150x6.seek((j6 + (jLongValue5 & 4294967295L)) & 4294967295L, 0);
                    byte[] bArrM13372dy2 = c3134k4.m13372dy((int) jLongValue6);
                    if ((jLongValue6 & 4294967295L) >= 12) {
                        c3051fa2 = new C3051fa(bArrM13372dy2, this.f9141x1);
                        this.f9139kk = c3051fa2;
                        sortedList = this.f9138k4;
                    } else {
                        sortedList = this.f9138k4;
                        c3051fa2 = new C3051fa();
                    }
                    sortedList.set_Item(l4, c3051fa2);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        if (i != 1 || (c3051fa = this.f9139kk) == null) {
            return;
        }
        it = c3051fa.m12906k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Long, String> next = it.next();
                if ("_PID_HLINKS".equals(next.getValue())) {
                    Long key = next.getKey();
                    key.longValue();
                    C3060ix c3060ix = new C3060ix((C3114yo) this.f9138k4.get_Item(key));
                    this.f9138k4.set_Item(key, c3060ix);
                    C3060ix c3060ix2 = this.f9140to;
                    if (c3060ix2 != null) {
                        c3060ix2.m12956k4().addRange(c3060ix.m12956k4());
                    } else {
                        this.f9140to = c3060ix;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13030k4(String str) {
        C3051fa c3051fa = this.f9139kk;
        if (c3051fa == null || !c3051fa.m12906k4().containsValue(str)) {
            return;
        }
        Long l = this.f9139kk.m12906k4().getKeys().get_Item(this.f9139kk.m12906k4().indexOfValue(str));
        l.longValue();
        this.f9139kk.m12906k4().removeItemByKey(l);
        this.f9138k4.removeItemByKey(l);
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC3096vh m13051x1(long j) {
        InterfaceC3096vh[] interfaceC3096vhArr = {null};
        boolean zTryGetValue = this.f9138k4.tryGetValue(Long.valueOf(j), interfaceC3096vhArr);
        InterfaceC3096vh interfaceC3096vh = interfaceC3096vhArr[0];
        if (zTryGetValue) {
            return interfaceC3096vh;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13031k4(String str, InterfaceC3096vh interfaceC3096vh) {
        if (this.f9139kk == null) {
            m13049to();
        }
        if (this.f9139kk.m12906k4().containsValue(str)) {
            this.f9138k4.set_Item(this.f9139kk.m12906k4().getKeys().get_Item(this.f9139kk.m12906k4().indexOfValue(str)), interfaceC3096vh);
            return;
        }
        long j = 2;
        while (this.f9138k4.containsKey(Long.valueOf(j))) {
            j++;
        }
        this.f9139kk.m12906k4().addItem(Long.valueOf(j), str);
        this.f9138k4.addItem(Long.valueOf(j), interfaceC3096vh);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13032k4(long j) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 == null || !C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return false;
        }
        return ((C3114yo) interfaceC3096vhM13051x1).m13281k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13033k4(long j, double[] dArr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13282k4(dArr);
        }
        dArr[0] = 0.0d;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13034k4(long j, float[] fArr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13283k4(fArr);
        }
        fArr[0] = 0.0f;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13035k4(long j, int[] iArr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13284k4(iArr);
        }
        iArr[0] = 0;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13036k4(long j, long[] jArr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13285k4(jArr);
        }
        jArr[0] = 0;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13037k4(long j, C3072m9[] c3072m9Arr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13286k4(c3072m9Arr);
        }
        c3072m9Arr[0] = null;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13038k4(long j, C14084qq[] c14084qqArr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13287k4(c14084qqArr);
        }
        C14084qq.f47299x1.CloneTo(c14084qqArr[0]);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13039k4(long j, String[] strArr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13288k4(strArr, this.f9141x1 & 65535);
        }
        strArr[0] = C14113y2.f47374k4;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13040k4(long j, boolean[] zArr) {
        InterfaceC3096vh interfaceC3096vhM13051x1 = m13051x1(j);
        if (interfaceC3096vhM13051x1 != null && C7019kk.m27469x1(interfaceC3096vhM13051x1, C3114yo.class)) {
            return ((C3114yo) interfaceC3096vhM13051x1).m13290k4(zArr);
        }
        zArr[0] = false;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13041k4(String str, double[] dArr) {
        long[] jArr = {0};
        boolean zM13044k4 = m13044k4(str, jArr);
        long j = jArr[0];
        if (zM13044k4) {
            return m13033k4(j, dArr);
        }
        dArr[0] = 0.0d;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13042k4(String str, float[] fArr) {
        long[] jArr = {0};
        boolean zM13044k4 = m13044k4(str, jArr);
        long j = jArr[0];
        if (zM13044k4) {
            return m13034k4(j, fArr);
        }
        fArr[0] = 0.0f;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13043k4(String str, int[] iArr) {
        long[] jArr = {0};
        boolean zM13044k4 = m13044k4(str, jArr);
        long j = jArr[0];
        if (zM13044k4) {
            return m13035k4(j, iArr);
        }
        iArr[0] = 0;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13044k4(String str, long[] jArr) {
        C3051fa c3051fa = this.f9139kk;
        if (c3051fa == null || !c3051fa.m12906k4().containsValue(str)) {
            jArr[0] = 0;
            return false;
        }
        jArr[0] = this.f9139kk.m12906k4().getKeys().get_Item(this.f9139kk.m12906k4().indexOfValue(str)).longValue();
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13045k4(String str, C14084qq[] c14084qqArr) {
        long[] jArr = {0};
        boolean zM13044k4 = m13044k4(str, jArr);
        long j = jArr[0];
        if (zM13044k4) {
            return m13038k4(j, c14084qqArr);
        }
        C14084qq.m67081jd().CloneTo(c14084qqArr[0]);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13046k4(String str, String[] strArr) {
        long[] jArr = {0};
        boolean zM13044k4 = m13044k4(str, jArr);
        long j = jArr[0];
        if (zM13044k4) {
            return m13039k4(j, strArr);
        }
        strArr[0] = C14113y2.f47374k4;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13047k4(String str, boolean[] zArr) {
        long[] jArr = {0};
        boolean zM13044k4 = m13044k4(str, jArr);
        long j = jArr[0];
        if (zM13044k4) {
            return m13040k4(j, zArr);
        }
        zArr[0] = false;
        return false;
    }
}
