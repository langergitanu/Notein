package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8488p1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartArtNodeCollection implements ISmartArtNodeCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<ISmartArtNode> f3442k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final SmartArtNode f3443x1;

    public SmartArtNodeCollection(SmartArtNode smartArtNode) {
        this.f3443x1 = smartArtNode;
    }

    /* JADX INFO: renamed from: x1 */
    private void m2808x1(ISmartArtNode iSmartArtNode) {
        IGenericEnumerator<ISmartArtNode> it = iSmartArtNode.getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                ISmartArtNode next = it.next();
                this.f3442k4.addItem(next);
                m2808x1(next);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.ISmartArtNodeCollection
    public final ISmartArtNode addNode() {
        gnb gnbVar = new gnb(this.f3443x1.m2794du().getPresentation(), InterruptionToken.getNone());
        SmartArtNode smartArtNodeM2806k4 = m2806k4(gnbVar);
        this.f3443x1.m2794du().m2786x1(gnbVar);
        return smartArtNodeM2806k4;
    }

    @Override // com.aspose.slides.ISmartArtNodeCollection
    public final ISmartArtNode addNodeByPosition(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Position can not be less than 0");
        }
        gnb gnbVar = new gnb(this.f3443x1.m2794du().getPresentation(), InterruptionToken.getNone());
        SmartArtNode smartArtNodeM2806k4 = m2806k4(gnbVar);
        int iIndexOf = this.f3442k4.indexOf(smartArtNodeM2806k4);
        if (iIndexOf != i && i < this.f3442k4.size()) {
            this.f3442k4.removeAt(iIndexOf);
            this.f3442k4.insertItem(i, smartArtNodeM2806k4);
        }
        this.f3443x1.m2794du().m2786x1(gnbVar);
        return smartArtNodeM2806k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3442k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ISmartArtNodeCollection
    public final ISmartArtNode get_Item(int i) {
        return this.f3442k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ISmartArtNode> iterator() {
        return this.f3442k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ISmartArtNode> iteratorJava() {
        return this.f3442k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m2809k4(ISmartArtNode iSmartArtNode) {
        return this.f3442k4.indexOf(iSmartArtNode);
    }

    @Override // com.aspose.slides.ISmartArtNodeCollection
    public final void removeNode(int i) {
        if (i < 0 || i > this.f3442k4.size() - 1) {
            throw new ArgumentOutOfRangeException("Index out of range.");
        }
        removeNode(this.f3442k4.get_Item(i));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3442k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    private SmartArtNode m2806k4(gnb gnbVar) {
        return m2810k4(new C14648us(m2807k4(1), this.f3443x1.m2794du(), gnbVar), new C14648us(m2807k4(5), this.f3443x1.m2794du(), gnbVar), new C14648us(m2807k4(6), this.f3443x1.m2794du(), gnbVar));
    }

    @Override // com.aspose.slides.ISmartArtNodeCollection
    public final void removeNode(ISmartArtNode iSmartArtNode) {
        SmartArtNode smartArtNode = (SmartArtNode) iSmartArtNode;
        SmartArtNodeCollection smartArtNodeCollection = (SmartArtNodeCollection) smartArtNode.getChildNodes();
        SmartArtNodeCollection smartArtNodeCollection2 = (SmartArtNodeCollection) smartArtNode.m2803to().getChildNodes();
        int iIndexOf = smartArtNodeCollection2.f3442k4.indexOf(smartArtNode);
        smartArtNodeCollection2.f3442k4.removeItem(smartArtNode);
        if (smartArtNodeCollection.size() > 0) {
            SmartArtNode smartArtNode2 = (SmartArtNode) smartArtNode.getChildNodes().get_Item(0);
            smartArtNode2.m2798k4(smartArtNode.m2803to());
            smartArtNodeCollection2.f3442k4.insertItem(iIndexOf, smartArtNode2);
            smartArtNodeCollection.f3442k4.removeAt(smartArtNodeCollection.f3442k4.indexOf(smartArtNode2));
            SmartArtNodeCollection smartArtNodeCollection3 = (SmartArtNodeCollection) smartArtNode2.getChildNodes();
            IGenericEnumerator<ISmartArtNode> it = smartArtNode.getChildNodes().iterator();
            while (it.hasNext()) {
                try {
                    SmartArtNode smartArtNode3 = (SmartArtNode) it.next();
                    if (smartArtNode3 != smartArtNode2) {
                        smartArtNode3.m2798k4(smartArtNode2);
                        smartArtNodeCollection3.f3442k4.addItem(smartArtNode3);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        this.f3443x1.m2794du().m2777ck();
    }

    /* JADX INFO: renamed from: k4 */
    public final SmartArtNode m2810k4(C14648us c14648us, C14648us c14648us2, C14648us c14648us3) {
        SmartArtNode smartArtNode = this.f3443x1;
        SmartArtNode smartArtNode2 = new SmartArtNode(smartArtNode, smartArtNode.m2794du());
        smartArtNode2.m2799k4(c14648us);
        smartArtNode2.m2805x1(c14648us2);
        smartArtNode2.m2802kk(c14648us3);
        ((SmartArtNodeCollection) this.f3443x1.getChildNodes()).f3442k4.addItem(smartArtNode2);
        return smartArtNode2;
    }

    /* JADX INFO: renamed from: k4 */
    private C8488p1 m2807k4(int i) {
        C8488p1 c8488p1 = new C8488p1();
        c8488p1.m38574k4(C14113y2.m67408k4("{", C14113y2.m67358c5(C14047bz.m66536x1().toString()), "}"));
        c8488p1.m38571k4(i);
        if (i == 1 || i == 2) {
            c8488p1.m38570k4();
        }
        c8488p1.m38578x1();
        return c8488p1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2811k4() {
        this.f3442k4.clear();
        m2808x1(this.f3443x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2812k4(ISmartArtNode iSmartArtNode, int i) {
        int iIndexOf = this.f3442k4.indexOf(iSmartArtNode);
        if (iIndexOf != -1 && iIndexOf != i) {
            this.f3442k4.removeAt(iIndexOf);
            this.f3442k4.insertItem(i, iSmartArtNode);
        }
        this.f3443x1.m2794du().m2777ck();
    }
}
