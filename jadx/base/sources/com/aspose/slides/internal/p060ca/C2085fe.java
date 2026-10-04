package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.fe */
/* JADX INFO: loaded from: classes3.dex */
public class C2085fe extends C2347wg {

    /* JADX INFO: renamed from: k4 */
    private k4[] f7204k4;

    /* JADX INFO: renamed from: x1 */
    private SortedList<Integer, Integer> f7205x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.fe$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public long f7206k4;

        /* JADX INFO: renamed from: kk */
        public long f7207kk;

        /* JADX INFO: renamed from: x1 */
        public long f7208x1;

        public k4() {
        }

        public k4(long j, long j2, long j3) {
            this.f7206k4 = j;
            this.f7208x1 = j2;
            this.f7207kk = j3;
        }
    }

    public C2085fe(int i, int i2, C2064eb c2064eb) {
        super(i, i2, c2064eb);
        this.f7205x1 = new SortedList<>();
    }

    /* JADX INFO: renamed from: h4 */
    private void m10524h4() {
        long j;
        C14093tq c14093tq;
        C14093tq c14093tq2 = new C14093tq();
        C14093tq c14093tq3 = new C14093tq();
        C14093tq c14093tq4 = new C14093tq();
        C14093tq c14093tq5 = new C14093tq();
        k4[] k4VarArr = this.f7204k4;
        List list = k4VarArr == null ? new List() : new List(AbstractC14092to.m67204k4((Object[]) k4VarArr));
        IGenericEnumerator<KeyValuePair<Integer, Integer>> it = this.f7205x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Integer, Integer> next = it.next();
                long jIntValue = ((long) next.getKey().intValue()) & 4294967295L;
                long jIntValue2 = ((long) next.getValue().intValue()) & 4294967295L;
                if (C14093tq.m67295k4(c14093tq2, null)) {
                    c14093tq2 = new C14093tq(Long.valueOf(jIntValue));
                    c14093tq3 = new C14093tq(Long.valueOf(jIntValue));
                    c14093tq4 = new C14093tq(Long.valueOf(jIntValue2));
                    c14093tq5 = new C14093tq(Long.valueOf(jIntValue2));
                } else {
                    boolean zM67302x1 = c14093tq3.m67302x1();
                    Class<?> cls = Long.TYPE;
                    if (zM67302x1) {
                        j = 4294967295L;
                        c14093tq = new C14093tq(Long.valueOf((((Long) c14093tq3.m67298k4(cls)).longValue() & 4294967295L) + 1));
                    } else {
                        j = 4294967295L;
                        c14093tq = new C14093tq();
                    }
                    C14093tq c14093tqClone = c14093tq.Clone();
                    C14093tq c14093tqClone2 = (c14093tq5.m67302x1() ? new C14093tq(Long.valueOf((((Long) c14093tq5.m67298k4(cls)).longValue() & j) + 1)) : new C14093tq()).Clone();
                    if (C14093tq.m67295k4(new C14093tq(Long.valueOf(jIntValue)), c14093tqClone) && C14093tq.m67295k4(new C14093tq(Long.valueOf(jIntValue2)), c14093tqClone2)) {
                        c14093tq3 = new C14093tq(Long.valueOf(jIntValue));
                        c14093tq5 = new C14093tq(Long.valueOf(jIntValue2));
                    } else {
                        list.addItem(new k4(((Long) c14093tq2.m67297k4()).longValue() & j, ((Long) c14093tq3.m67297k4()).longValue() & j, ((Long) c14093tq4.m67297k4()).longValue() & j));
                        c14093tq2 = new C14093tq(Long.valueOf(jIntValue));
                        c14093tq3 = new C14093tq(Long.valueOf(jIntValue));
                        c14093tq4 = new C14093tq(Long.valueOf(jIntValue2));
                        c14093tq5 = new C14093tq(Long.valueOf(jIntValue2));
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (C14093tq.m67296x1(c14093tq2, null)) {
            list.addItem(new k4(((Long) c14093tq2.m67297k4()).longValue() & 4294967295L, ((Long) c14093tq3.m67297k4()).longValue() & 4294967295L, ((Long) c14093tq4.m67297k4()).longValue() & 4294967295L));
        }
        this.f7204k4 = (k4[]) list.toArray(new k4[0]);
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        int i2 = 0;
        while (true) {
            k4[] k4VarArr = this.f7204k4;
            if (i2 >= k4VarArr.length) {
                break;
            }
            long j = i;
            k4 k4Var = k4VarArr[i2];
            long j2 = k4Var.f7206k4;
            if (j >= (j2 & 4294967295L) && j <= (k4Var.f7208x1 & 4294967295L)) {
                return (int) ((((k4Var.f7207kk & 4294967295L) + j) & 4294967295L) - (j2 & 4294967295L));
            }
            if (j < (k4Var.f7208x1 & 4294967295L) && j < (j2 & 4294967295L)) {
                break;
            }
            i2++;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10525k4(int i, int i2) {
        if (this.f7205x1.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.f7205x1.addItem(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10526k4(SortedList<Long, Long> sortedList) {
        int i = 0;
        while (true) {
            k4[] k4VarArr = this.f7204k4;
            if (i >= k4VarArr.length) {
                return;
            }
            sortedList.addItem(Long.valueOf(k4VarArr[i].f7206k4), Long.valueOf(this.f7204k4[i].f7208x1));
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
        c2212n9.m11164up();
        c2212n9.m11164up();
        long jM11164up = c2212n9.m11164up();
        this.f7204k4 = new k4[(int) jM11164up];
        for (int i = 0; i < (4294967295L & jM11164up); i++) {
            this.f7204k4[i] = new k4(c2212n9.m11164up(), c2212n9.m11164up(), c2212n9.m11164up());
        }
        super.mo10361k4(c2212n9);
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10527k4(byte[][] bArr, long[] jArr) {
        m10524h4();
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                c2362x4.m11647k4(12);
                c2362x4.m11647k4(0);
                c2362x4.m11660kk(0L);
                c2362x4.m11660kk(0L);
                c2362x4.m11660kk(((long) this.f7204k4.length) & 4294967295L);
                for (k4 k4Var : this.f7204k4) {
                    c2362x4.m11660kk(k4Var.f7206k4);
                    c2362x4.m11660kk(k4Var.f7208x1);
                    c2362x4.m11660kk(k4Var.f7207kk);
                }
                jArr[0] = c3152yj.getPosition() & 4294967295L;
                c2362x4.m11656k4(4L);
                c2362x4.m11660kk(jArr[0]);
                c2362x4.dispose();
                c3152yj.close();
                bArr[0] = c3152yj.toArray();
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final long[] m10528k4() {
        List list = new List();
        for (k4 k4Var : this.f7204k4) {
            for (long j = k4Var.f7206k4; (j & 4294967295L) <= (4294967295L & k4Var.f7208x1); j++) {
                list.addItem(Long.valueOf(j));
            }
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) list.get_Item(i)).longValue();
        }
        return jArr;
    }
}
