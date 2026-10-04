package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13968ri;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ou */
/* JADX INFO: loaded from: classes5.dex */
public class C13143ou extends AbstractC12942dc {

    /* JADX INFO: renamed from: k4 */
    private static final char[] f44190k4 = {'+', '-'};

    /* JADX INFO: renamed from: kk */
    private C14046bv f44191kk;

    /* JADX INFO: renamed from: x1 */
    private C14046bv f44192x1 = new C14046bv();

    public C13143ou(C14046bv c14046bv, C14046bv c14046bv2) {
        C14046bv c14046bv3 = new C14046bv();
        this.f44191kk = c14046bv3;
        c14046bv.CloneTo(c14046bv3);
        c14046bv2.CloneTo(this.f44192x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final Exception m61351k4(C14046bv c14046bv, int i, int i2, boolean z, boolean z2) {
        C14046bv c14046bvClone = C14046bv.m66490to(AbstractC12942dc.m60161k4(10, i), C7019kk.m27440jd(1, 9)).Clone();
        int i3 = 0;
        if (C14046bv.m66448ck(c14046bv, C7019kk.m27440jd(0, 9))) {
            C14046bv.m66479kk(c14046bv.Clone()).CloneTo(c14046bv);
        }
        while (C14046bv.m66484m9(C14046bv.m66446c5(c14046bv.Clone()), c14046bv)) {
            C14046bv.m66451du(c14046bv, C7019kk.m27440jd(10, 9)).CloneTo(c14046bv);
            i3++;
        }
        if (z && (C14046bv.m66447c5(c14046bv, c14046bvClone) || i3 > i)) {
            return new XmlSchemaException("The TotalDigits constraint failed.", C14113y2.f47374k4);
        }
        if (!z2 || i3 <= i2) {
            return null;
        }
        return new XmlSchemaException("The FractionDigits constraint failed.", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: x1 */
    public RuntimeException mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        return mo60170k4(abstractC12892ae.mo60019dy().mo60537to(obj).Clone().Clone(), abstractC12892ae);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60168k4(int i, AbstractC12892ae abstractC12892ae) {
        return mo60170k4(C7019kk.m27440jd(Integer.valueOf(i), 9).Clone().Clone(), abstractC12892ae);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60169k4(long j, AbstractC12892ae abstractC12892ae) {
        return mo60170k4(C7019kk.m27440jd(Long.valueOf(j), 11).Clone().Clone(), abstractC12892ae);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60170k4(C14046bv c14046bv, AbstractC12892ae abstractC12892ae) {
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int i = c12909bgMo60033up != null ? c12909bgMo60033up.f43449up : 0;
        AbstractC12974ex abstractC12974exMo60019dy = abstractC12892ae.mo60019dy();
        if (C14046bv.m66447c5(c14046bv, this.f44192x1) || C14046bv.m66448ck(c14046bv, this.f44191kk)) {
            return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", c14046bv, abstractC12892ae.m60015ar()));
        }
        if (i == 0) {
            return null;
        }
        if ((i & 64) != 0 && C14046bv.m66447c5(c14046bv, abstractC12974exMo60019dy.mo60537to(c12909bgMo60033up.f43447m9))) {
            return new XmlSchemaException("The MaxInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 128) != 0 && C14046bv.m66460jd(c14046bv, abstractC12974exMo60019dy.mo60537to(c12909bgMo60033up.f43441dy))) {
            return new XmlSchemaException("The MaxExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 256) != 0 && C14046bv.m66448ck(c14046bv, abstractC12974exMo60019dy.mo60537to(c12909bgMo60033up.f43438c5))) {
            return new XmlSchemaException("The MinInclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 512) != 0 && C14046bv.m66455fa(c14046bv, abstractC12974exMo60019dy.mo60537to(c12909bgMo60033up.f43444jd))) {
            return new XmlSchemaException("The MinExclusive constraint failed.", C14113y2.f47374k4);
        }
        if ((i & 16) != 0 && !m61352k4(c14046bv.Clone(), c12909bgMo60033up.f43440du, abstractC12974exMo60019dy)) {
            return new XmlSchemaException("The Enumeration constraint failed.", C14113y2.f47374k4);
        }
        int i2 = i;
        return m61351k4(c14046bv.Clone(), c12909bgMo60033up.f43439ck, c12909bgMo60033up.f43442fa, (i2 & 1024) != 0, (i2 & 2048) != 0);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60172k4(short s, AbstractC12892ae abstractC12892ae) {
        return mo60170k4(C7019kk.m27440jd(Short.valueOf(s), 7).Clone().Clone(), abstractC12892ae);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61352k4(C14046bv c14046bv, ArrayList arrayList, AbstractC12974ex abstractC12974ex) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (C14046bv.m66453dy(c14046bv, abstractC12974ex.mo60537to(arrayList.get_Item(i)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12942dc
    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        return m61352k4(abstractC12892ae.mo60019dy().mo60537to(obj).Clone(), arrayList, abstractC12892ae.mo60019dy());
    }
}
