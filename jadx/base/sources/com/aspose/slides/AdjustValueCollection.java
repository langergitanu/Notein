package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustValueCollection extends DomObject<GeometryShape> implements IAdjustValueCollection {

    /* JADX INFO: renamed from: k4 */
    static final AdjustValueCollection f188k4 = new AdjustValueCollection(null);

    public AdjustValueCollection(GeometryShape geometryShape) {
        super(geometryShape);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        AbstractC14092to.m67208k4((Object) ((GeometryShape) this.f2127h4).m1591yj().m3334x1()).copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IAdjustValueCollection
    public final IAdjustValue get_Item(int i) {
        return new AdjustValue(((GeometryShape) this.f2127h4).m1591yj().m3334x1()[i]);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Iterable
    public final IEnumerator iterator() {
        return AbstractC14092to.m67208k4((Object) ((GeometryShape) this.f2127h4).m1591yj().m3334x1()).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C13791lr m232k4(int i) {
        return ((GeometryShape) this.f2127h4).m1591yj().m3334x1()[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return ((GeometryShape) this.f2127h4).m1591yj().m3334x1().length;
    }
}
