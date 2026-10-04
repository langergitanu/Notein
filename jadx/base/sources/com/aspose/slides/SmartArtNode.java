package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C9229xr;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartArtNode implements ISmartArtNode {

    /* JADX INFO: renamed from: du */
    private C14648us f3435du;

    /* JADX INFO: renamed from: h4 */
    private C14648us f3436h4;

    /* JADX INFO: renamed from: k4 */
    private final SmartArt f3437k4;

    /* JADX INFO: renamed from: kk */
    private final SmartArtNodeCollection f3438kk;

    /* JADX INFO: renamed from: m9 */
    private final List<bay> f3439m9;

    /* JADX INFO: renamed from: to */
    private C14648us f3440to;

    /* JADX INFO: renamed from: x1 */
    private SmartArtNode f3441x1;

    public SmartArtNode(SmartArtNode smartArtNode, SmartArt smartArt) {
        if (smartArt == null) {
            throw new ArgumentNullException("target");
        }
        this.f3437k4 = smartArt;
        this.f3441x1 = smartArtNode;
        this.f3438kk = new SmartArtNodeCollection(this);
        this.f3439m9 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m2790k4(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: m9 */
    private void m2792m9() {
        TextFrame textFrameM71867k4 = this.f3440to.m71867k4();
        IGenericEnumerator<ISmartArtShape> it = getShapes().iterator();
        while (it.hasNext()) {
            try {
                SmartArtShape smartArtShape = (SmartArtShape) it.next();
                TextFrame textFrameM2820kk = smartArtShape.m2820kk();
                if (textFrameM2820kk == null) {
                    this.f3437k4.m2778k4().m69206to();
                    textFrameM2820kk = smartArtShape.m2820kk();
                }
                if (textFrameM2820kk != null) {
                    textFrameM71867k4.m2904du(textFrameM2820kk);
                }
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
    }

    /* JADX INFO: renamed from: x1 */
    private static int m2793x1(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 5 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: du */
    public final SmartArt m2794du() {
        return this.f3437k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r2 = r2.m4074dy().m74280x1();
     */
    @Override // com.aspose.slides.ISmartArtNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IFillFormat getBulletFillFormat() {
        SmartArtShape smartArtShapeM74280x1;
        List.Enumerator<bay> it = this.f3439m9.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    smartArtShapeM74280x1 = null;
                    break;
                }
                bay next = it.next();
                if (next.m4074dy().m74264ne()) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (smartArtShapeM74280x1 != null) {
            return smartArtShapeM74280x1.getFillFormat();
        }
        return null;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final ISmartArtNodeCollection getChildNodes() {
        return this.f3438kk;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final int getLevel() {
        SmartArtNode smartArtNode = this.f3441x1;
        if (smartArtNode == null) {
            return -1;
        }
        return smartArtNode.getLevel() + 1;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final int getOrganizationChartLayout() {
        C9229xr c9229xrM28386uz;
        List.Enumerator<bay> it = this.f3439m9.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (C7019kk.m27469x1(next.m4077jd(), C14288pj.class) && (c9229xrM28386uz = next.m5147up().m71873kk().m28386uz()) != null && c9229xrM28386uz.m44604dy() != null) {
                    return m2790k4(c9229xrM28386uz.m44604dy().m42591k4());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return 0;
        }
        it.dispose();
        return 0;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final int getPosition() {
        SmartArtNode smartArtNode = this.f3441x1;
        if (smartArtNode == null) {
            return 0;
        }
        return ((SmartArtNodeCollection) smartArtNode.getChildNodes()).m2809k4(this);
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final ISmartArtShapeCollection getShapes() {
        SmartArtShapeCollection smartArtShapeCollection = new SmartArtShapeCollection();
        List.Enumerator<bay> it = this.f3439m9.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (next.m4074dy().m74280x1() != null && (!next.m4074dy().m74287x6() || (next.m4073du().m5149yj() != 5 && next.m4073du().m5149yj() != 6))) {
                    smartArtShapeCollection.m2823k4(next.m4074dy().m74280x1());
                }
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
        return smartArtShapeCollection;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final ITextFrame getTextFrame() {
        m2792m9();
        return this.f3440to.m71867k4();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m2795h4() {
        C9229xr c9229xrM28386uz;
        return this.f3439m9.size() > 0 && (c9229xrM28386uz = this.f3439m9.get_Item(0).m5147up().m71873kk().m28386uz()) != null && c9229xrM28386uz.m44609m9() != null && c9229xrM28386uz.m44609m9().m30246k4() == 2;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final boolean isAssistant() {
        return this.f3440to.m71865du() == 2;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final boolean isHidden() {
        return this.f3439m9.size() == 0;
    }

    /* JADX INFO: renamed from: kk */
    public final C14648us m2801kk() {
        return this.f3436h4;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final boolean remove() {
        SmartArtNode smartArtNode = this.f3441x1;
        if (smartArtNode == null) {
            return false;
        }
        smartArtNode.getChildNodes().removeNode(this);
        return true;
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final void setAssistant(boolean z) {
        int i = z ? 2 : 1;
        if (this.f3440to.m71865du() != i) {
            this.f3440to.m71868k4(i);
            this.f3437k4.m2777ck();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r3.m44604dy() != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r3.m44611x1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        r3 = r2.m5147up().m71873kk().m28386uz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r3 = r2.m5147up().m71873kk().m28366k4();
     */
    @Override // com.aspose.slides.ISmartArtNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setOrganizationChartLayout(int i) {
        bay next;
        List.Enumerator<bay> it = this.f3439m9.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (C7019kk.m27469x1(next.m4077jd(), C14288pj.class)) {
                        break;
                    }
                }
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
        if (next != null) {
            next.m5147up().m71873kk().m28386uz().m44604dy().m42592k4(m2793x1(i));
            this.f3437k4.m2777ck();
        }
    }

    @Override // com.aspose.slides.ISmartArtNode
    public final void setPosition(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Position can not be less than 0");
        }
        SmartArtNode smartArtNode = this.f3441x1;
        if (smartArtNode != null) {
            SmartArtNodeCollection smartArtNodeCollection = (SmartArtNodeCollection) smartArtNode.getChildNodes();
            if (this.f3441x1.getChildNodes().size() <= i) {
                throw new ArgumentOutOfRangeException("Position can not be equal to or greater than siblings count");
            }
            smartArtNodeCollection.m2812k4(this, i);
        }
    }

    /* JADX INFO: renamed from: to */
    public final SmartArtNode m2803to() {
        return this.f3441x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14648us m2796k4() {
        return this.f3440to;
    }

    /* JADX INFO: renamed from: kk */
    public final void m2802kk(C14648us c14648us) {
        this.f3436h4 = c14648us;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14648us m2804x1() {
        return this.f3435du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2797k4(List<bay> list) {
        this.f3439m9.clear();
        List.Enumerator<bay> it = list.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (next.m4076h4().size() > 0) {
                    List.Enumerator<C14244on> it2 = next.m4076h4().iterator();
                    while (true) {
                        try {
                            if (!it2.hasNext()) {
                                break;
                            } else if (m2791k4(it2.next().m5144ks())) {
                                this.f3439m9.addItem(next);
                                break;
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                } else if (m2791k4(next.m4073du().m5144ks())) {
                    this.f3439m9.addItem(next);
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<ISmartArtNode> it3 = this.f3438kk.iterator();
        while (it3.hasNext()) {
            try {
                ((SmartArtNode) it3.next()).m2797k4(list);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2805x1(C14648us c14648us) {
        this.f3435du = c14648us;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2798k4(SmartArtNode smartArtNode) {
        this.f3441x1 = smartArtNode;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2799k4(C14648us c14648us) {
        this.f3440to = c14648us;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2800k4(boolean z) {
        if (this.f3439m9.size() > 0) {
            bay bayVar = this.f3439m9.get_Item(0);
            C9229xr c9229xrM28386uz = bayVar.m5147up().m71873kk().m28386uz();
            if (c9229xrM28386uz == null) {
                c9229xrM28386uz = bayVar.m5147up().m71873kk().m28366k4();
            }
            if (c9229xrM28386uz.m44609m9() == null) {
                c9229xrM28386uz.m44607k4();
            }
            c9229xrM28386uz.m44609m9().m30247k4(z ? 2 : 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m2791k4(String str) {
        if (C14113y2.m67363du(this.f3440to.m71876to(), str)) {
            return true;
        }
        C14648us c14648us = this.f3435du;
        if (c14648us != null && C14113y2.m67363du(c14648us.m71876to(), str)) {
            return true;
        }
        C14648us c14648us2 = this.f3436h4;
        return c14648us2 != null && C14113y2.m67363du(c14648us2.m71876to(), str);
    }
}
