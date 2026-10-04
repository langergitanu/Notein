package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: loaded from: classes3.dex */
public class ControlCollection implements IControlCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    BaseSlide f2063k4;

    /* JADX INFO: renamed from: x1 */
    private final List<IControl> f2064x1 = new List<>();

    public ControlCollection(BaseSlide baseSlide) {
        this.f2063k4 = baseSlide;
    }

    /* JADX INFO: renamed from: x1 */
    private Control m1255x1() {
        Control control = new Control(this);
        control.m1248k4(new C14047bz("6BF52A52-394A-11D3-B153-00C04F79FAA6"));
        control.setName("WindowsMediaPlayer");
        control.getProperties().add("URL", "");
        control.getProperties().add("rate", "1");
        control.getProperties().add("balance", "0");
        control.getProperties().add("currentPosition", "0");
        control.getProperties().add("defaultFrame", "");
        control.getProperties().add("playCount", "1");
        control.getProperties().add("autoStart", "-1");
        control.getProperties().add("currentMarker", "0");
        control.getProperties().add("invokeURLs", "-1");
        control.getProperties().add("baseURL", "");
        control.getProperties().add("volume", "50");
        control.getProperties().add("mute", "0");
        control.getProperties().add("uiMode", "full");
        control.getProperties().add("stretchToFit", "0");
        control.getProperties().add("windowlessVideo", "0");
        control.getProperties().add("enabled", "-1");
        control.getProperties().add("enableContextMenu", "-1");
        control.getProperties().add("fullScreen", "0");
        control.getProperties().add("SAMIStyle", "");
        control.getProperties().add("SAMILang", "");
        control.getProperties().add("SAMIFilename", "");
        control.getProperties().add("captioningID", "");
        control.getProperties().add("enableErrorDialogs", "0");
        control.getProperties().add("_cx", "15663");
        control.getProperties().add("_cy", "11642");
        return control;
    }

    @Override // com.aspose.slides.IControlCollection
    public final IControl addControl(int i, float f, float f2, float f3, float f4) {
        if (i != 0) {
            throw new PptxException("Support of this control type is not implemented for PPTX yet.");
        }
        Control controlM1255x1 = m1255x1();
        if (controlM1255x1 != null) {
            controlM1255x1.setFrame(new ShapeFrame(f, f2, f3, f4, (byte) 0, (byte) 0, 0.0f));
            this.f2064x1.addItem(controlM1255x1);
        }
        return controlM1255x1;
    }

    @Override // com.aspose.slides.IControlCollection
    public final void clear() {
        this.f2064x1.clear();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2064x1.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2063k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IControlCollection
    public final IControl get_Item(int i) {
        return this.f2064x1.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IControl> iterator() {
        return this.f2064x1.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IControl> iteratorJava() {
        return this.f2064x1.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IControl m1256k4() {
        Control control = new Control(this);
        this.f2064x1.addItem(control);
        return control;
    }

    @Override // com.aspose.slides.IControlCollection
    public final void remove(IControl iControl) {
        this.f2064x1.removeItem(iControl);
    }

    @Override // com.aspose.slides.IControlCollection
    public final void removeAt(int i) {
        this.f2064x1.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2064x1.size();
    }
}
