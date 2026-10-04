package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C3051fa implements InterfaceC3096vh {

    /* JADX INFO: renamed from: k4 */
    private int f9067k4;

    /* JADX INFO: renamed from: x1 */
    private SortedList<Long, String> f9068x1 = new SortedList<>();

    public C3051fa() {
        this.f9067k4 = 1252;
        this.f9067k4 = 1200;
    }

    /* JADX INFO: renamed from: k4 */
    public final SortedList<Long, String> m12906k4() {
        return this.f9068x1;
    }

    @Override // com.aspose.slides.internal.p077d8.InterfaceC3096vh
    /* JADX INFO: renamed from: x1 */
    public final byte[] mo12907x1() {
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        c3149x1.m13447k4(((long) this.f9068x1.size()) & 4294967295L);
        IGenericEnumerator<KeyValuePair<Long, String>> it = this.f9068x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Long, String> next = it.next();
                c3149x1.m13447k4(next.getKey().longValue());
                String value = next.getValue();
                int length = value.length();
                int i = length + 1;
                c3149x1.m13447k4(((long) i) & 4294967295L);
                int i2 = this.f9067k4;
                if ((i2 & 65535) == 1200) {
                    if (i % 2 == 1) {
                        i = length + 2;
                    }
                    i += i;
                }
                byte[] bArr = new byte[i];
                byte[] bArrMo26677to = C12555c5.m58552k4(i2 & 65535).mo26677to(value);
                AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArrMo26677to), AbstractC14092to.m67208k4((Object) bArr), bArrMo26677to.length);
                c3149x1.m13450k4(bArr);
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
        int length2 = ((int) c3152yj.getLength()) % 4;
        if (length2 > 0) {
            c3149x1.m13450k4(new byte[length2]);
        }
        c3149x1.m13454x1();
        return c3152yj.toArray();
    }

    public C3051fa(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        this.f9067k4 = 1252;
        this.f9067k4 = i;
        int i5 = 0;
        int iM13253to = (int) C3110yd.m13253to(bArr, 0);
        int i6 = 0;
        int i7 = 4;
        while (i6 < iM13253to) {
            long jM13253to = C3110yd.m13253to(bArr, i7) & 4294967295L;
            long jM13253to2 = C3110yd.m13253to(bArr, i7 + 4);
            int i8 = i5;
            int i9 = iM13253to;
            long j = jM13253to2 & 4294967295L;
            i7 += 8;
            long j2 = jM13253to2 & 4294967295L;
            if (j2 < bArr.length) {
                int i10 = (int) j;
                C6765kp c6765kp = new C6765kp(i10);
                int i11 = i8;
                while (i11 < j2) {
                    int i12 = i & 65535;
                    if (i12 == 1200) {
                        c6765kp.m26780k4((char) C3110yd.m13257x1(bArr, (i11 * 2) + i7));
                        i3 = i8;
                        i4 = 1;
                    } else {
                        AbstractC6747ar abstractC6747arM58552k4 = C12555c5.m58552k4(i12);
                        i3 = i8;
                        i4 = 1;
                        byte[] bArr2 = new byte[1];
                        bArr2[i3] = bArr[i7 + i11];
                        c6765kp.m26798k4(abstractC6747arM58552k4.m26671k4(bArr2));
                    }
                    i11 += i4;
                    i8 = i3;
                }
                i2 = i8;
                while (c6765kp.m26806x1(c6765kp.m26807x1() - 1) == 0) {
                    c6765kp.m26801k4(c6765kp.m26807x1() - 1);
                }
                if ((i & 65535) == 1200) {
                    long j3 = (((j2 % 2) & 4294967295L) == 1 ? j + 1 : j) & 4294967295L;
                    i7 += (int) (j3 + j3);
                } else {
                    i7 += i10;
                }
                this.f9068x1.set_Item(Long.valueOf(jM13253to), c6765kp.toString());
            } else {
                i2 = i8;
            }
            i6++;
            iM13253to = i9;
            i5 = i2;
        }
    }
}
