package com.orion.penkit.models;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/penkit/models/VerticalLine;", "Lcom/orion/penkit/models/AnchorAssistLine;", "", "a", "Lcom/orion/penkit/models/IntPoint;", "b", "<init>", "(Lcom/orion/penkit/models/IntPoint;Lcom/orion/penkit/models/IntPoint;)V", "getA", "()Lcom/orion/penkit/models/IntPoint;", "getB", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class VerticalLine implements AnchorAssistLine<Integer> {
    private final IntPoint a;
    private final IntPoint b;

    public VerticalLine(IntPoint a, IntPoint b) {
        OooOOO0.OooO0oO(a, "a");
        OooOOO0.OooO0oO(b, "b");
        this.a = a;
        this.b = b;
    }

    public static /* synthetic */ VerticalLine copy$default(VerticalLine verticalLine, IntPoint intPoint, IntPoint intPoint2, int i, Object obj) {
        if ((i & 1) != 0) {
            intPoint = verticalLine.a;
        }
        if ((i & 2) != 0) {
            intPoint2 = verticalLine.b;
        }
        return verticalLine.copy(intPoint, intPoint2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IntPoint getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IntPoint getB() {
        return this.b;
    }

    public final VerticalLine copy(IntPoint a, IntPoint b) {
        OooOOO0.OooO0oO(a, "a");
        OooOOO0.OooO0oO(b, "b");
        return new VerticalLine(a, b);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalLine)) {
            return false;
        }
        VerticalLine verticalLine = (VerticalLine) other;
        return OooOOO0.OooO0O0(this.a, verticalLine.a) && OooOOO0.OooO0O0(this.b, verticalLine.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "VerticalLine(a=" + this.a + ", b=" + this.b + ")";
    }

    @Override // com.orion.penkit.models.AnchorAssistLine
    public IntPoint getA() {
        return this.a;
    }

    @Override // com.orion.penkit.models.AnchorAssistLine
    public IntPoint getB() {
        return this.b;
    }
}
