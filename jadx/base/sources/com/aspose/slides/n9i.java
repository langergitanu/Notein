package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.PatternFormat;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
final class n9i extends AbstractC1137ga<PatternFormat, n9i> implements IPatternFormatEffectiveData {

    /* JADX INFO: renamed from: k4 */
    byte f47490k4;

    /* JADX INFO: renamed from: x1 */
    final C14811xp f47492x1 = new C14811xp();

    /* JADX INFO: renamed from: kk */
    final C14811xp f47491kk = new C14811xp();

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m67899k4(int i, byte b, C12003du c12003du, C12003du c12003du2) {
        Dictionary<Integer, PatternFormat.C0562k4> dictionary = PatternFormat.f2976x1;
        byte[][] bArr = dictionary.get_Item(Integer.valueOf(b)).f2985k4;
        if (bArr == null) {
            bArr = dictionary.get_Item(1).f2985k4;
        }
        C12009k4 c12009k4 = new C12009k4(AbstractC14092to.m67209k4(bArr, 2).m67278to(1) + 1, AbstractC14092to.m67209k4(bArr, 2).m67278to(0) + 1, i);
        for (int i2 = 0; i2 <= AbstractC14092to.m67209k4(bArr, 2).m67278to(0); i2++) {
            for (int i3 = 0; i3 <= AbstractC14092to.m67209k4(bArr, 2).m67278to(1); i3++) {
                float f = 1.0f - ((bArr[i2][i3] & 255) / 255.0f);
                c12009k4.m56604k4(i3, i2, C12003du.m56398k4(OooO.OooO00o(((c12003du.m56501c5() & 255) * f) + ((c12003du2.m56501c5() & 255) * r4), 14), OooO.OooO00o(((c12003du.m56507jd() & 255) * f) + ((c12003du2.m56507jd() & 255) * r4), 14), OooO.OooO00o(((c12003du.m56502ck() & 255) * f) + ((c12003du2.m56502ck() & 255) * r4), 14), OooO.OooO00o(((c12003du.m56505fa() & 255) * f) + ((c12003du2.m56505fa() & 255) * r4), 14)).Clone());
            }
        }
        return c12009k4;
    }

    @Override // com.aspose.slides.IPatternFormatEffectiveData
    public final Integer getBackColor() {
        return (Integer) C12003du.m56473x1(m67905kk());
    }

    @Override // com.aspose.slides.IPatternFormatEffectiveData
    public final Integer getForeColor() {
        return (Integer) C12003du.m56473x1(m67907x1());
    }

    @Override // com.aspose.slides.IPatternFormatEffectiveData
    public final byte getPatternStyle() {
        return this.f47490k4;
    }

    @Override // com.aspose.slides.IPatternFormatEffectiveData
    public final IImage getTileIImage(Integer num, Integer num2) {
        return m67906x1(C12003du.m56401k4(num), C12003du.m56401k4(num2));
    }

    @Override // com.aspose.slides.IPatternFormatEffectiveData
    @Deprecated
    public final Bitmap getTileImage(Integer num, Integer num2) {
        return (Bitmap) C12009k4.m56588k4(m67900k4(C12003du.m56401k4(num), C12003du.m56401k4(num2)));
    }

    /* JADX INFO: renamed from: kk */
    public C12003du m67905kk() {
        return this.f47491kk.m73522k4();
    }

    /* JADX INFO: renamed from: x1 */
    public IImage m67906x1(C12003du c12003du, C12003du c12003du2) {
        return new yyn(m67899k4(2498570, getPatternStyle(), c12003du.Clone(), c12003du2.Clone()));
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m67907x1() {
        return this.f47492x1.m73522k4();
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m67900k4(C12003du c12003du, C12003du c12003du2) {
        return m67899k4(2498570, getPatternStyle(), c12003du.Clone(), c12003du2.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67901k4() {
        this.f47492x1.m73529to();
        this.f47491kk.m73529to();
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f47492x1.m73524k4(iBaseSlide, dm6Var);
        this.f47491kk.m73524k4(iBaseSlide, dm6Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67902k4(PatternFormat patternFormat) {
        if (patternFormat.getPatternStyle() != -1) {
            this.f47490k4 = patternFormat.getPatternStyle();
        }
        if (patternFormat.getForeColor().getColorType() != -1) {
            this.f47492x1.m73523k4((ColorFormat) patternFormat.getForeColor());
        }
        if (patternFormat.getBackColor().getColorType() != -1) {
            this.f47491kk.m73523k4((ColorFormat) patternFormat.getBackColor());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67903k4(InterfaceC14672vc interfaceC14672vc) {
        n9i n9iVar = (n9i) interfaceC14672vc;
        this.f47490k4 = n9iVar.getPatternStyle();
        this.f47492x1.m73526k4(n9iVar.f47492x1);
        this.f47491kk.m73526k4(n9iVar.f47491kk);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, PatternFormat patternFormat) {
        m67903k4(interfaceC14672vc);
        m67902k4(patternFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(n9i n9iVar) {
        return n9iVar != null && this.f47490k4 == n9iVar.f47490k4 && this.f47492x1.equals(n9iVar.f47492x1) && this.f47491kk.equals(n9iVar.f47491kk);
    }
}
