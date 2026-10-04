package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.BitArray;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p482wr.C12249c5;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class PatternFormat extends PVIObject implements IPatternFormat {

    /* JADX INFO: renamed from: x1 */
    static final Dictionary<Integer, C0562k4> f2976x1 = m2210k4("patterns.bin");

    /* JADX INFO: renamed from: du */
    private ColorFormat f2977du;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<zhi> f2978k4;

    /* JADX INFO: renamed from: kk */
    private zhi f2979kk;

    /* JADX INFO: renamed from: to */
    private ColorFormat f2980to;

    /* JADX INFO: renamed from: com.aspose.slides.PatternFormat$k4 */
    public static class C0562k4 {

        /* JADX INFO: renamed from: k4 */
        byte[][] f2985k4;

        /* JADX INFO: renamed from: x1 */
        int f2986x1;
    }

    public PatternFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2978k4 = new AbstractC7018k4<zhi>() { // from class: com.aspose.slides.PatternFormat.1
            {
                PatternFormat.this.f2979kk = new zhi() { // from class: com.aspose.slides.PatternFormat.1.1
                    @Override // com.aspose.slides.zhi
                    /* JADX INFO: renamed from: k4 */
                    public void mo1465k4() {
                        for (zhi zhiVar : ((AbstractC7018k4) C05591.this).f19081x1) {
                            if (zhiVar != null) {
                                zhiVar.mo1465k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c0, blocks: (B:5:0x0017, B:38:0x00aa, B:54:0x00ca, B:55:0x00cd, B:7:0x001e, B:8:0x0026, B:52:0x00c2, B:53:0x00c9, B:11:0x0037, B:12:0x003b, B:16:0x005c, B:21:0x0074, B:22:0x0077, B:23:0x0081, B:25:0x0087, B:27:0x008d, B:28:0x0092, B:29:0x0095, B:35:0x00a4), top: B:67:0x0017, outer: #3, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[Catch: all -> 0x0070, TRY_ENTER, TryCatch #0 {all -> 0x0070, blocks: (B:7:0x001e, B:8:0x0026, B:52:0x00c2, B:53:0x00c9, B:11:0x0037, B:12:0x003b, B:16:0x005c, B:21:0x0074, B:22:0x0077, B:23:0x0081, B:25:0x0087, B:27:0x008d, B:28:0x0092, B:29:0x0095, B:35:0x00a4), top: B:65:0x001e, outer: #1 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Dictionary<Integer, C0562k4> m2210k4(String str) {
        boolean z;
        Dictionary<Integer, C0562k4> dictionary = new Dictionary<>();
        AbstractC3150x6 abstractC3150x6M21997k4 = C5133k4.m21997k4("templates.zip");
        try {
            C12275wy c12275wyM57431k4 = C12275wy.m57431k4(abstractC3150x6M21997k4);
            try {
                C12249c5 c12249c5M57327bv = c12275wyM57431k4.m57505x1(str).m57327bv();
                try {
                    C3134k4 c3134k4 = new C3134k4(c12249c5M57327bv);
                    boolean z2 = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            try {
                                z = false;
                                BitArray bitArray = new BitArray(256, false);
                                try {
                                    if (c12249c5M57327bv.getPosition() >= c12249c5M57327bv.getLength() - 2) {
                                        break;
                                    }
                                    short sM13381rv = c3134k4.m13381rv();
                                    try {
                                        int iM13387yj = c3134k4.m13387yj() & 255;
                                        int iM13387yj2 = c3134k4.m13387yj() & 255;
                                        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iM13387yj2, iM13387yj);
                                        for (int i = 0; i < iM13387yj2; i++) {
                                            for (int i2 = 0; i2 < iM13387yj; i2++) {
                                                bArr[i][i2] = c3134k4.m13387yj();
                                                bitArray.set_Item(bArr[i][i2] & 255, true);
                                            }
                                        }
                                        C0562k4 c0562k4 = new C0562k4();
                                        c0562k4.f2985k4 = bArr;
                                        c0562k4.f2986x1 = 0;
                                        for (int i3 = 0; i3 < bitArray.size(); i3++) {
                                            if (bitArray.get_Item(i3)) {
                                                c0562k4.f2986x1++;
                                            }
                                        }
                                        dictionary.set_Item(Integer.valueOf(sM13381rv), c0562k4);
                                        z3 = false;
                                    } catch (EndOfStreamException e) {
                                        e = e;
                                        C3085sv.m13082k4(e);
                                        z2 = z;
                                        if (z2) {
                                        }
                                    }
                                } catch (EndOfStreamException e2) {
                                    z = true;
                                    e = e2;
                                }
                            } catch (Throwable th) {
                                c3134k4.dispose();
                                throw th;
                            }
                        } catch (EndOfStreamException e3) {
                            e = e3;
                            z = z3;
                        }
                    }
                    if (z2) {
                        throw new PptxException("Internal error: can't initialize pattern data.");
                    }
                    c3134k4.dispose();
                    c12275wyM57431k4.dispose();
                    return dictionary;
                } finally {
                    if (c12249c5M57327bv != null) {
                        c12249c5M57327bv.dispose();
                    }
                }
            } catch (Throwable th2) {
                if (c12275wyM57431k4 != null) {
                    c12275wyM57431k4.dispose();
                }
                throw th2;
            }
        } finally {
            if (abstractC3150x6M21997k4 != null) {
                abstractC3150x6M21997k4.dispose();
            }
        }
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new vo4(getParent_Immediate(), this.f2980to, this.f2977du);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2980to = new ColorFormat(this, 7);
        this.f2977du = new ColorFormat(this, 7);
        this.f2980to.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.PatternFormat.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PatternFormat.OnPatternFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                PatternFormat.this.m2213du();
            }
        });
        this.f2977du.f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.PatternFormat.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PatternFormat.OnPatternFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC14741wk
            /* JADX INFO: renamed from: k4 */
            public void mo243k4() {
                PatternFormat.this.m2213du();
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final void m2213du() {
        zhi zhiVar = this.f2979kk;
        if (zhiVar == null || this.f2978k4.m27430k4()) {
            return;
        }
        zhiVar.mo1465k4();
    }

    @Override // com.aspose.slides.IPatternFormat
    public final IColorFormat getBackColor() {
        m2146wl();
        return this.f2977du;
    }

    @Override // com.aspose.slides.IPatternFormat
    public final IColorFormat getForeColor() {
        m2146wl();
        return this.f2980to;
    }

    @Override // com.aspose.slides.IPatternFormat
    public final byte getPatternStyle() {
        if (m2138ix()) {
            return m2222x1().m72384k4();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IPatternFormat
    public final IImage getTile(Integer num) {
        return m2220x1(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IPatternFormat
    @Deprecated
    public final Bitmap getTileImage(Integer num) {
        return (Bitmap) C12009k4.m56588k4(m2214k4(C12003du.m56401k4(num)));
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2222x1().m72383h4();
        }
        return 1L;
    }

    @Override // com.aspose.slides.IPatternFormat
    public final void setPatternStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2222x1().m72387k4(b);
            m2213du();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m2219to() {
        m2218k4(true);
    }

    /* JADX INFO: renamed from: x1 */
    public IImage m2220x1(C12003du c12003du) {
        return new yyn(m2214k4(c12003du.Clone()));
    }

    @Override // com.aspose.slides.IPatternFormat
    public final IImage getTile(Integer num, Integer num2) {
        return m2221x1(C12003du.m56401k4(num), C12003du.m56401k4(num2));
    }

    @Override // com.aspose.slides.IPatternFormat
    @Deprecated
    public final Bitmap getTileImage(Integer num, Integer num2) {
        return (Bitmap) C12009k4.m56588k4(m2215k4(C12003du.m56401k4(num), C12003du.m56401k4(num2)));
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2214k4(C12003du c12003du) {
        if (m2138ix()) {
            return m2222x1().m72385k4(c12003du.Clone());
        }
        m2146wl();
        BaseSlide slide = getSlide();
        C14321pz c14321pz = new C14321pz(c12003du.Clone());
        return m2211k4(false, (byte) -1, this.f2977du.m1082kk(slide, c14321pz).Clone(), this.f2980to.m1082kk(slide, c14321pz).Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public IImage m2221x1(C12003du c12003du, C12003du c12003du2) {
        return new yyn(m2215k4(c12003du.Clone(), c12003du2.Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2215k4(C12003du c12003du, C12003du c12003du2) {
        return !m2138ix() ? m2211k4(false, (byte) -1, c12003du.Clone(), c12003du2.Clone()) : m2222x1().m72386k4(c12003du.Clone(), c12003du2.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final vo4 m2222x1() {
        return (vo4) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m2211k4(boolean z, byte b, C12003du c12003du, C12003du c12003du2) {
        C0562k4[] c0562k4Arr = {null};
        Dictionary<Integer, C0562k4> dictionary = f2976x1;
        boolean zTryGetValue = dictionary.tryGetValue(Integer.valueOf(b), c0562k4Arr);
        C0562k4 c0562k4 = c0562k4Arr[0];
        if (!zTryGetValue) {
            c0562k4 = dictionary.get_Item(1);
        }
        C12009k4 c12009k4 = new C12009k4(AbstractC14092to.m67209k4(c0562k4.f2985k4, 2).m67278to(1) + 1, AbstractC14092to.m67209k4(c0562k4.f2985k4, 2).m67278to(0) + 1, (c12003du.m56501c5() & 255) < 255 || (c12003du2.m56501c5() & 255) < 255 ? 2498570 : 137224);
        for (int i = 0; i <= AbstractC14092to.m67209k4(c0562k4.f2985k4, 2).m67278to(0); i++) {
            for (int i2 = 0; i2 <= AbstractC14092to.m67209k4(c0562k4.f2985k4, 2).m67278to(1); i2++) {
                float f = 1.0f - ((c0562k4.f2985k4[i][i2] & 255) / 255.0f);
                c12009k4.m56604k4(i2, i, C12003du.m56398k4(OooO.OooO00o(((c12003du.m56501c5() & 255) * f) + ((c12003du2.m56501c5() & 255) * r7), 14), OooO.OooO00o(((c12003du.m56507jd() & 255) * f) + ((c12003du2.m56507jd() & 255) * r7), 14), OooO.OooO00o(((c12003du.m56502ck() & 255) * f) + ((c12003du2.m56502ck() & 255) * r7), 14), OooO.OooO00o(((c12003du.m56505fa() & 255) * f) + ((c12003du2.m56505fa() & 255) * r7), 14)).Clone());
            }
        }
        c12009k4.m56332k4(72.0f, 72.0f);
        return c12009k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2223x1(PatternFormat patternFormat) {
        if (m2138ix() || patternFormat.m2138ix()) {
            m2145uz();
            if (patternFormat.m2138ix()) {
                m2222x1().m72389k4(patternFormat.m2222x1());
            } else {
                m2140k4((Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2216k4(IPatternFormatEffectiveData iPatternFormatEffectiveData) {
        m2145uz();
        m2222x1().m72388k4(iPatternFormatEffectiveData);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2217k4(PatternFormat patternFormat) {
        if (m2138ix() || patternFormat.m2138ix()) {
            m2145uz();
            if (patternFormat.m2138ix()) {
                m2222x1().m72393x1(patternFormat.m2222x1());
            } else {
                m2140k4((Object) null);
            }
            m2213du();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2218k4(boolean z) {
        if (m2138ix()) {
            m2145uz();
            m2140k4((Object) null);
            if (z) {
                m2213du();
            }
        }
    }
}
