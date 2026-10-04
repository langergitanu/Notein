package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14064he;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class Control extends DomObject<ControlCollection> implements IControl {

    /* JADX INFO: renamed from: c5 */
    private byte[] f2053c5;

    /* JADX INFO: renamed from: ck */
    private boolean f2054ck;

    /* JADX INFO: renamed from: du */
    private IShapeFrame f2055du;

    /* JADX INFO: renamed from: dy */
    private C14047bz f2056dy;

    /* JADX INFO: renamed from: jd */
    private int f2057jd;

    /* JADX INFO: renamed from: k4 */
    private final C14739wi f2058k4;

    /* JADX INFO: renamed from: kk */
    private String f2059kk;

    /* JADX INFO: renamed from: m9 */
    private final ControlPropertiesCollection f2060m9;

    /* JADX INFO: renamed from: to */
    private final PictureFillFormat f2061to;

    /* JADX INFO: renamed from: x1 */
    private final C14872z4 f2062x1;

    public Control(ControlCollection controlCollection) {
        super(controlCollection);
        this.f2056dy = C14047bz.f47172k4.Clone();
        this.f2058k4 = new C14739wi();
        this.f2062x1 = new C14872z4();
        PictureFillFormat pictureFillFormat = new PictureFillFormat(this);
        this.f2061to = pictureFillFormat;
        pictureFillFormat.setPictureFillMode(1);
        this.f2060m9 = new ControlPropertiesCollection();
        m1250k4(false);
    }

    @Override // com.aspose.slides.IControl
    public final byte[] getActiveXControlBinary() {
        return this.f2053c5;
    }

    @Override // com.aspose.slides.IControl
    public final UUID getClassId() {
        return C14047bz.m66534k4(m1252kk());
    }

    @Override // com.aspose.slides.IControl
    public final IShapeFrame getFrame() {
        return this.f2055du;
    }

    @Override // com.aspose.slides.IControl
    public final String getName() {
        return this.f2059kk;
    }

    @Override // com.aspose.slides.IControl
    public final int getPersistence() {
        return this.f2057jd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return ((ControlCollection) this.f2127h4).f2063k4.getPresentation();
    }

    @Override // com.aspose.slides.IControl
    public final IControlPropertiesCollection getProperties() {
        if (getPersistence() == 0) {
            return this.f2060m9;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return ((ControlCollection) this.f2127h4).f2063k4;
    }

    @Override // com.aspose.slides.IControl
    public final IPictureFillFormat getSubstitutePictureFormat() {
        return this.f2061to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14739wi m1246k4() {
        return this.f2058k4;
    }

    /* JADX INFO: renamed from: kk */
    public C14047bz m1252kk() {
        return this.f2056dy;
    }

    public final void setClassId(UUID uuid) {
        m1248k4(C14047bz.m66533k4(uuid));
    }

    @Override // com.aspose.slides.IControl
    public final void setFrame(IShapeFrame iShapeFrame) {
        this.f2055du = iShapeFrame;
    }

    @Override // com.aspose.slides.IControl
    public final void setName(String str) {
        this.f2059kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m1253to() {
        return this.f2054ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14872z4 m1254x1() {
        return this.f2062x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1247k4(int i) {
        this.f2057jd = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m1248k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f2056dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1249k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var) {
        float f;
        if (C14064he.m66715kk(this.f2055du.getX()) || C14064he.m66715kk(this.f2055du.getY()) || C14064he.m66715kk(this.f2055du.getWidth()) || C14064he.m66715kk(this.f2055du.getHeight())) {
            return;
        }
        float f2 = 1.0f;
        if (this.f2055du.getFlipH() == 1) {
            f = 1.0f;
            f2 = -1.0f;
        } else {
            f = 1.0f;
        }
        C4317dy c4317dy = new C4317dy(f2, 0.0f, 0.0f, this.f2055du.getFlipV() == 1 ? -1.0f : f, this.f2055du.getFlipH() == 1 ? this.f2055du.getCenterX() * 2.0f : 0.0f, this.f2055du.getFlipV() == 1 ? this.f2055du.getCenterY() * 2.0f : 0.0f);
        if (!C14064he.m66715kk(this.f2055du.getRotation())) {
            c4317dy.m17339k4((this.f2055du.getFlipH() == 1) ^ (this.f2055du.getFlipV() == 1) ? -this.f2055du.getRotation() : this.f2055du.getRotation(), new C12025x6(this.f2055du.getCenterX(), this.f2055du.getCenterY()), 0);
        }
        abstractC14897zn.m74632x1(c4317dy);
        abstractC14897zn.mo68794k4(((ShapeFrame) this.f2055du).m2660k4().Clone().Clone(), (azo) null, new cxj(new ajz(this.f2055du.cloneT(), new C4317dy(), null, getSlide(), kg7Var), (PictureFillFormat) getSubstitutePictureFormat()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1250k4(boolean z) {
        this.f2054ck = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1251k4(byte[] bArr) {
        this.f2053c5 = bArr;
    }
}
