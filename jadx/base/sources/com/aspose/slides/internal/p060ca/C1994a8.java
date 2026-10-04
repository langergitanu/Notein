package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.a8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1994a8 extends C2285s4 {

    /* JADX INFO: renamed from: k4 */
    private C2303tf f6954k4;

    public C1994a8(C2285s4 c2285s4) {
        super(c2285s4.m11223yd(), 0L, 0L, 0L);
    }

    @Override // com.aspose.slides.internal.p060ca.C2285s4
    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10130k4(int i) {
        if (this.f6954k4.m11435ix().m10655x1(i)) {
            return m11223yd().m11705x1().m10574m9().mo10130k4(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10131k4(C2303tf c2303tf) {
        this.f6954k4 = c2303tf;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.slides.internal.p060ca.C2285s4, com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) {
        C2212n9 c2212n9 = new C2212n9(m11223yd().mo11248k4());
        try {
            jArr[0] = 0;
            IGenericEnumerator<Integer> it = this.f6954k4.m11435ix().iterator();
            while (it.hasNext()) {
                try {
                    int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                    jArr[0] = ((jArr[0] & 4294967295L) + (((long) C14116yg.m67482k4(((int) m11221lr().m10550h4().mo11195k4().m11197k4(iIntValue + 1)) - ((int) m11221lr().m10550h4().mo11195k4().m11197k4(iIntValue)))) & 4294967295L)) & 4294967295L;
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
            C3152yj c3152yj = new C3152yj();
            try {
                C2362x4 c2362x4 = new C2362x4(c3152yj, true);
                try {
                    byte[] bArr2 = new byte[256];
                    for (int i = 0; i < m11221lr().m10550h4().mo11195k4().m11196k4(); i++) {
                        if (this.f6954k4.m11435ix().m10655x1(i)) {
                            long jM11197k4 = m11221lr().m10550h4().mo11195k4().m11197k4(i);
                            long jM11197k42 = m11221lr().m10550h4().mo11195k4().m11197k4(i + 1);
                            c2212n9.m11159k4(((m11221lr().m10574m9().m11222wy() & 4294967295L) + (jM11197k4 & 4294967295L)) & 4294967295L);
                            int iM67482k4 = C14116yg.m67482k4(((int) jM11197k42) - ((int) jM11197k4));
                            this.f6954k4.m10758x1().m10550h4().mo11195k4().m11197k4(i);
                            if (bArr2.length < iM67482k4) {
                                bArr2 = new byte[iM67482k4];
                            }
                            c2212n9.m11158k4(iM67482k4, bArr2, 0);
                            c2362x4.m11658k4(bArr2, iM67482k4);
                        }
                    }
                    m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                    c2362x4.dispose();
                    c2212n9.dispose();
                } catch (Throwable th2) {
                    c2362x4.dispose();
                    throw th2;
                }
            } finally {
                c3152yj.dispose();
            }
        } finally {
            c2212n9.dispose();
        }
    }
}
