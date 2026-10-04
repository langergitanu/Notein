package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
final class him extends AbstractC13680jc<PresetShadow, him> implements IPresetShadowEffectiveData {

    /* JADX INFO: renamed from: x1 */
    static final him f5510x1 = m7189to();

    /* JADX INFO: renamed from: h4 */
    private double f5511h4;

    /* JADX INFO: renamed from: k4 */
    C14811xp f5512k4;

    /* JADX INFO: renamed from: kk */
    private int f5513kk;

    /* JADX INFO: renamed from: m9 */
    private float f5514m9;

    public him(PresetShadow presetShadow) {
        super(presetShadow, PresetShadow.class, him.class);
        this.f5513kk = 0;
        this.f5511h4 = Double.NaN;
        this.f5514m9 = Float.NaN;
    }

    /* JADX INFO: renamed from: to */
    public static him m7189to() {
        him himVar = new him(null);
        himVar.m7190du().m73525k4(C12003du.m56460uz().Clone());
        himVar.f5513kk = 0;
        himVar.f5511h4 = 0.0d;
        himVar.f5514m9 = 0.0f;
        return himVar;
    }

    /* JADX INFO: renamed from: du */
    public final C14811xp m7190du() {
        if (this.f5512k4 == null) {
            this.f5512k4 = new C14811xp();
        }
        return this.f5512k4;
    }

    @Override // com.aspose.slides.IPresetShadowEffectiveData
    public final float getDirection() {
        return this.f5514m9;
    }

    @Override // com.aspose.slides.IPresetShadowEffectiveData
    public final double getDistance() {
        return this.f5511h4;
    }

    @Override // com.aspose.slides.IPresetShadowEffectiveData
    public final int getPreset() {
        return this.f5513kk;
    }

    @Override // com.aspose.slides.IPresetShadowEffectiveData
    public final Integer getShadowColor() {
        return (Integer) C12003du.m56473x1(m7192x1());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m7192x1() {
        return m7190du().m73522k4();
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        String strM66410k4 = C14042ak.m66410k4(PresetShadowType.class, this.f5513kk);
        String strM66425h4 = C14044b3.m66425h4(this.f5511h4);
        String strM66704h4 = C14064he.m66704h4(this.f5514m9);
        C14811xp c14811xp = this.f5512k4;
        return C14113y2.m67407k4(strMo3874k4, chValueOf, strM66410k4, chValueOf, strM66425h4, chValueOf, strM66704h4, chValueOf, c14811xp != null ? c14811xp.toString() : "");
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f5512k4.m73524k4(iBaseSlide, dm6Var);
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, PresetShadow presetShadow) {
        him himVar = (him) interfaceC14672vc;
        this.f5513kk = himVar.f5513kk;
        this.f5511h4 = himVar.f5511h4;
        this.f5514m9 = himVar.f5514m9;
        if (presetShadow.getPreset() != 0) {
            this.f5513kk = presetShadow.getPreset();
        }
        if (!C14067j2.m66728k4(Double.valueOf(presetShadow.getDistance()), Double.valueOf(Double.NaN))) {
            this.f5511h4 = presetShadow.getDistance();
        }
        if (!C14067j2.m66728k4(Float.valueOf(presetShadow.getDirection()), Float.valueOf(Float.NaN))) {
            this.f5514m9 = presetShadow.getDirection();
        }
        m7190du().m73527k4(himVar.m7190du(), (ColorFormat) presetShadow.getShadowColor());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(him himVar) {
        if (himVar == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, himVar)) {
            return true;
        }
        return getPreset() == himVar.getPreset() && getDistance() == himVar.getDistance() && getDirection() == himVar.getDirection() && m7190du().m73531x1(himVar.m7190du());
    }
}
