package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18177fb;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.mh */
/* JADX INFO: loaded from: classes3.dex */
public class C2195mh extends C2347wg {

    /* JADX INFO: renamed from: du */
    private int[] f7633du;

    /* JADX INFO: renamed from: h4 */
    private int[] f7634h4;

    /* JADX INFO: renamed from: k4 */
    private int f7635k4;

    /* JADX INFO: renamed from: kk */
    private int[] f7636kk;

    /* JADX INFO: renamed from: m9 */
    private SortedList<Integer, Integer> f7637m9;

    /* JADX INFO: renamed from: to */
    private short[] f7638to;

    /* JADX INFO: renamed from: x1 */
    private int[] f7639x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.mh$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public final int f7640k4;

        /* JADX INFO: renamed from: x1 */
        public final int f7641x1;

        public k4(int i, int i2) {
            this.f7640k4 = i;
            this.f7641x1 = i2;
        }
    }

    public C2195mh(int i, int i2, C2064eb c2064eb) {
        super(i, i2, c2064eb);
        this.f7637m9 = new SortedList<>();
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        int iIntValue;
        if (m11601x1().m11217b3()) {
            int i2 = i & 65535;
            if (this.f7637m9.containsKey(Integer.valueOf((char) i2))) {
                iIntValue = this.f7637m9.get_Item(Integer.valueOf(i2)).intValue();
                return iIntValue & 65535;
            }
            return 0;
        }
        int i3 = 0;
        while (true) {
            int i4 = this.f7635k4;
            if (i3 >= (i4 & 65535)) {
                break;
            }
            int i5 = this.f7639x1[i3];
            if (i <= (i5 & 65535)) {
                int i6 = this.f7636kk[i3];
                if ((i6 & 65535) <= i) {
                    int i7 = this.f7634h4[i3];
                    if ((i7 & 65535) <= 0) {
                        return (this.f7638to[i3] + i) % 65536;
                    }
                    int i8 = ((i - (i6 & 65535)) + ((i7 & 65535) / 2)) - ((i4 & 65535) - i3);
                    int[] iArr = this.f7633du;
                    if (i8 < iArr.length) {
                        iIntValue = iArr[i8];
                        break;
                    }
                }
                i3++;
            }
            if (i <= (i5 & 65535)) {
                break;
            }
            i3++;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    private void m11125k4() {
        boolean z;
        C14093tq c14093tq = new C14093tq();
        C14093tq c14093tq2 = new C14093tq();
        List list = new List();
        List list2 = new List();
        IGenericEnumerator<Integer> it = this.f7637m9.getKeys().iterator();
        while (it.hasNext()) {
            try {
                Integer next = it.next();
                Class<?> cls = Integer.TYPE;
                Integer num = (Integer) C7019kk.m27464to(next, cls);
                num.intValue();
                if (C14093tq.m67295k4(c14093tq, null)) {
                    c14093tq = new C14093tq(num);
                    c14093tq2 = new C14093tq(num);
                } else if (C14093tq.m67295k4(new C14093tq(num), (c14093tq2.m67302x1() ? new C14093tq(Integer.valueOf((((Integer) c14093tq2.m67298k4(cls)).intValue() & 65535) + 1)) : new C14093tq()).Clone())) {
                    c14093tq2 = new C14093tq(num);
                } else {
                    list.addItem(new k4(((Integer) c14093tq.m67297k4()).intValue() & 65535, ((Integer) c14093tq2.m67297k4()).intValue() & 65535));
                    c14093tq = new C14093tq(num);
                    c14093tq2 = new C14093tq(num);
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
        if (C14093tq.m67296x1(c14093tq, null)) {
            list.addItem(new k4(((Integer) c14093tq.m67297k4()).intValue() & 65535, ((Integer) c14093tq2.m67297k4()).intValue() & 65535));
        }
        this.f7635k4 = list.size() & 65535;
        this.f7636kk = new int[list.size()];
        this.f7639x1 = new int[list.size()];
        this.f7638to = new short[list.size()];
        this.f7634h4 = new int[list.size()];
        Dictionary dictionary = new Dictionary();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            k4 k4Var = (k4) list.get_Item(i2);
            int iIntValue = this.f7637m9.get_Item(Integer.valueOf(k4Var.f7640k4)).intValue();
            int i3 = k4Var.f7640k4;
            while (true) {
                if (i3 > (k4Var.f7641x1 & 65535)) {
                    z = true;
                    break;
                }
                if (((i3 & 65535) - (k4Var.f7640k4 & 65535)) + (iIntValue & 65535) != (this.f7637m9.get_Item(Integer.valueOf(i3)).intValue() & 65535)) {
                    z = false;
                    break;
                }
                i3++;
            }
            int[] iArr = this.f7636kk;
            int i4 = k4Var.f7640k4;
            iArr[i2] = i4;
            this.f7639x1[i2] = k4Var.f7641x1;
            if (z) {
                this.f7638to[i2] = (short) ((iIntValue & 65535) - (i4 & 65535));
                this.f7634h4[i2] = 0;
            } else {
                this.f7638to[i2] = 0;
                dictionary.set_Item(Integer.valueOf(i2), Integer.valueOf(list2.size() & 65535));
                for (int i5 = k4Var.f7640k4 & 65535; i5 <= (k4Var.f7641x1 & 65535); i5++) {
                    Integer num2 = this.f7637m9.get_Item(Integer.valueOf(i5 & 65535));
                    num2.intValue();
                    list2.addItem(num2);
                }
            }
        }
        Dictionary.Enumerator it2 = dictionary.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next2 = it2.next();
                this.f7634h4[((Integer) next2.getKey()).intValue()] = ((((this.f7635k4 & 65535) - ((Integer) next2.getKey()).intValue()) + (((Integer) next2.getValue()).intValue() & 65535)) * 2) & 65535;
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        this.f7633du = new int[list2.size()];
        while (true) {
            int[] iArr2 = this.f7633du;
            if (i >= iArr2.length) {
                return;
            }
            iArr2[i] = ((Integer) list2.get(i)).intValue();
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10525k4(int i, int i2) {
        if (i > 65535) {
            return;
        }
        int i3 = i & 65535;
        if (this.f7637m9.containsKey(Integer.valueOf(i3))) {
            return;
        }
        this.f7637m9.addItem(Integer.valueOf(i3), Integer.valueOf(i2 & 65535));
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
        int iM11151fa = c2212n9.m11151fa();
        c2212n9.m11151fa();
        this.f7635k4 = ((c2212n9.m11151fa() & 65535) / 2) & 65535;
        c2212n9.m11151fa();
        c2212n9.m11151fa();
        c2212n9.m11151fa();
        this.f7639x1 = new int[this.f7635k4 & 65535];
        int i = 0;
        while (true) {
            int[] iArr = this.f7639x1;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = c2212n9.m11151fa();
            i++;
        }
        c2212n9.m11151fa();
        int i2 = this.f7635k4;
        this.f7636kk = new int[i2 & 65535];
        this.f7638to = new short[i2 & 65535];
        this.f7634h4 = new int[i2 & 65535];
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f7636kk;
            if (i3 >= iArr2.length) {
                break;
            }
            iArr2[i3] = c2212n9.m11151fa();
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[] sArr = this.f7638to;
            if (i4 >= sArr.length) {
                break;
            }
            sArr[i4] = c2212n9.m11147c5();
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr3 = this.f7634h4;
            if (i5 >= iArr3.length) {
                break;
            }
            iArr3[i5] = c2212n9.m11151fa();
            i5++;
        }
        int i6 = this.f7635k4;
        int i7 = ((iM11151fa & 65535) - (((i6 & 65535) * 8) + 16)) / 2;
        if (i7 < 0) {
            i7 = i6 & 65535;
        }
        this.f7633du = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            this.f7633du[i8] = c2212n9.m11151fa();
        }
        for (int i9 = 0; i9 < this.f7636kk.length; i9++) {
            int i10 = 0;
            while (true) {
                int i11 = this.f7639x1[i9] & 65535;
                int i12 = this.f7636kk[i9];
                if (i10 <= i11 - (i12 & 65535)) {
                    this.f7637m9.addItem(Integer.valueOf(((i12 & 65535) + i10) & 65535), Integer.valueOf(mo10360k4((this.f7636kk[i9] & 65535) + i10) & 65535));
                    i10++;
                }
            }
        }
        super.mo10361k4(c2212n9);
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10527k4(byte[][] bArr, long[] jArr) {
        mo10525k4(65535, 0);
        m11125k4();
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                c2362x4.m11647k4(4);
                c2362x4.m11647k4(0);
                c2362x4.m11647k4(0);
                c2362x4.m11647k4(((this.f7635k4 & 65535) * 2) & 65535);
                int iM27457kk = C7019kk.m27457kk(Double.valueOf(C14116yg.m67469du(2.0d, C14116yg.m67490kk(C14116yg.m67476k4(this.f7635k4 & 65535, 2.0d))) * 2.0d), 14);
                c2362x4.m11647k4(iM27457kk);
                c2362x4.m11647k4(C7019kk.m27457kk(Double.valueOf(C14116yg.m67476k4(r4 / 2.0f, 2.0d)), 14));
                c2362x4.m11647k4((((this.f7635k4 & 65535) * 2) - (iM27457kk & 65535)) & 65535);
                c2362x4.m11652k4(this.f7639x1);
                c2362x4.m11647k4(0);
                c2362x4.m11652k4(this.f7636kk);
                c2362x4.m11653k4(this.f7638to);
                c2362x4.m11652k4(this.f7634h4);
                c2362x4.m11652k4(this.f7633du);
                jArr[0] = 65535 & ((int) c3152yj.getPosition());
                c2362x4.m11656k4(2L);
                c2362x4.m11647k4((int) (jArr[0] & C18177fb.f54859s));
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
}
