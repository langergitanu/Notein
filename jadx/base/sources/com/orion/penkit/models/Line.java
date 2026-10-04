package com.orion.penkit.models;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/penkit/models/Line;", "", "a", "Landroid/graphics/PointF;", "b", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "getA", "()Landroid/graphics/PointF;", "getB", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Line {
    private final PointF a;
    private final PointF b;

    public Line(PointF a, PointF b) {
        OooOOO0.OooO0oO(a, "a");
        OooOOO0.OooO0oO(b, "b");
        this.a = a;
        this.b = b;
    }

    public static /* synthetic */ Line copy$default(Line line, PointF pointF, PointF pointF2, int i, Object obj) {
        if ((i & 1) != 0) {
            pointF = line.a;
        }
        if ((i & 2) != 0) {
            pointF2 = line.b;
        }
        return line.copy(pointF, pointF2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PointF getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PointF getB() {
        return this.b;
    }

    public final Line copy(PointF a, PointF b) {
        OooOOO0.OooO0oO(a, "a");
        OooOOO0.OooO0oO(b, "b");
        return new Line(a, b);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Line)) {
            return false;
        }
        Line line = (Line) other;
        return OooOOO0.OooO0O0(this.a, line.a) && OooOOO0.OooO0O0(this.b, line.b);
    }

    public final PointF getA() {
        return this.a;
    }

    public final PointF getB() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "Line(a=" + this.a + ", b=" + this.b + ")";
    }
}
