package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p199j5.InterfaceC5192du;
import com.aspose.slides.internal.p295na.C6792k4;
import com.aspose.slides.internal.p295na.C6793kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.uz */
/* JADX INFO: loaded from: classes.dex */
public class C5557uz extends AbstractC5558v4 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5535bv f15302k4;

    /* JADX INFO: renamed from: x1 */
    private C6793kk f15303x1;

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f15302k4 = null;
        this.f15303x1 = null;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, java.lang.Iterable
    public IGenericEnumerator<InterfaceC12777qq> iterator() {
        return new C5554u4(this.f15302k4.mo22660v4().mo22190x1(this.f15302k4, 1, this.f15303x1, false));
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public int mo20312k4() {
        int i = 0;
        InterfaceC5192du interfaceC5192duMo22190x1 = this.f15302k4.mo22660v4().mo22190x1(this.f15302k4, 1, this.f15303x1, false);
        while (interfaceC5192duMo22190x1.mo22183du() != null) {
            try {
                i++;
            } catch (Throwable th) {
                if (interfaceC5192duMo22190x1 != null) {
                    interfaceC5192duMo22190x1.dispose();
                }
                throw th;
            }
        }
        interfaceC5192duMo22190x1.dispose();
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5557uz m22836k4(AbstractC5535bv abstractC5535bv) {
        C5557uz c5557uz = new C5557uz();
        c5557uz.f15302k4 = abstractC5535bv;
        c5557uz.f15303x1 = null;
        return c5557uz;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5557uz m22837k4(AbstractC5535bv abstractC5535bv, IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> iGenericDictionary, int i) {
        C5557uz c5557uz = new C5557uz();
        c5557uz.f15302k4 = abstractC5535bv;
        c5557uz.f15303x1 = C6792k4.m26864k4(iGenericDictionary, i, abstractC5535bv.mo22660v4().m22796kk().mo65266k4(C18358t1.g.f56183c));
        return c5557uz;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5557uz m22838k4(AbstractC5535bv abstractC5535bv, IGenericEnumerable<String> iGenericEnumerable) {
        C5557uz c5557uz = new C5557uz();
        c5557uz.f15302k4 = abstractC5535bv;
        c5557uz.f15303x1 = C6793kk.m26865k4(iGenericEnumerable, abstractC5535bv.mo22660v4().m22796kk().mo65266k4(C18358t1.g.f56183c));
        return c5557uz;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5557uz m22839k4(AbstractC5535bv abstractC5535bv, String str) {
        C5557uz c5557uz = new C5557uz();
        c5557uz.f15302k4 = abstractC5535bv;
        c5557uz.f15303x1 = C6793kk.m26867k4(C14113y2.m67358c5(str), abstractC5535bv.mo22660v4().m22796kk().mo65266k4(C18358t1.g.f56183c));
        return c5557uz;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5557uz m22840k4(AbstractC5535bv abstractC5535bv, String str, String str2) {
        C5557uz c5557uz = new C5557uz();
        c5557uz.f15302k4 = abstractC5535bv;
        c5557uz.f15303x1 = C6793kk.m26868k4(str, str2, abstractC5535bv.mo22660v4().m22796kk().mo65266k4(C18358t1.g.f56183c));
        return c5557uz;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public InterfaceC12777qq mo20314k4(int i) {
        if (i < 0 || i > mo20312k4()) {
            return null;
        }
        InterfaceC5192du interfaceC5192duMo22190x1 = this.f15302k4.mo22660v4().mo22190x1(this.f15302k4, 1, this.f15303x1, false);
        while (true) {
            try {
                InterfaceC12777qq interfaceC12777qqMo22183du = interfaceC5192duMo22190x1.mo22183du();
                if (i == 0) {
                    interfaceC5192duMo22190x1.dispose();
                    return interfaceC12777qqMo22183du;
                }
                i--;
            } catch (Throwable th) {
                if (interfaceC5192duMo22190x1 != null) {
                    interfaceC5192duMo22190x1.dispose();
                }
                throw th;
            }
        }
    }
}
