package com.aspose.slides.internal.p497xc;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p151gj.C4321k4;
import com.aspose.slides.internal.p151gj.C4325rv;
import com.aspose.slides.internal.p158gz.C4426kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xc.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12496h4 implements InterfaceC12500x1 {

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12500x1 f41811k4;

    /* JADX INFO: renamed from: x1 */
    private final C4325rv[] f41813x1 = (C4325rv[]) C22200OooO0o0.OooO00o(C4325rv.class, 256);

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Integer, Byte> f41812kk = new Dictionary<>();

    public C12496h4(InterfaceC12500x1 interfaceC12500x1) {
        this.f41811k4 = interfaceC12500x1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        r3 = r3 + 1;
     */
    @Override // com.aspose.slides.internal.p497xc.InterfaceC12500x1
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IGenericList<C4325rv> mo58049k4(IGenericList<C4321k4> iGenericList, byte[] bArr) {
        this.f41812kk.clear();
        IGenericEnumerator<C4321k4> it = iGenericList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                C4321k4 next = it.next();
                int iM17384x1 = next.m17384x1();
                Byte[] bArr2 = {(byte) 0};
                boolean zTryGetValue = this.f41812kk.tryGetValue(Integer.valueOf(iM17384x1), bArr2);
                byte bByteValue = bArr2[0].byteValue();
                if (!zTryGetValue) {
                    if (i >= 256) {
                        break;
                    }
                    bByteValue = (byte) this.f41812kk.size();
                    this.f41812kk.addItem(Integer.valueOf(iM17384x1), Byte.valueOf(bByteValue));
                    next.m17381k4().CloneTo(this.f41813x1[i]);
                    i++;
                }
                bArr[i2] = bByteValue;
                i2++;
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
        if (i <= 256) {
            return new C4426kk(this.f41813x1, 0, i);
        }
        InterfaceC12500x1 interfaceC12500x1 = this.f41811k4;
        if (interfaceC12500x1 != null) {
            return interfaceC12500x1.mo58049k4(iGenericList, bArr);
        }
        throw new NotSupportedException("Too many colors");
    }
}
