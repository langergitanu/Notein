package com.orion.penkit.models.pencil;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/penkit/models/pencil/Circle;", "", "center", "Landroid/graphics/PointF;", "radius", "", "<init>", "(Landroid/graphics/PointF;F)V", "getCenter", "()Landroid/graphics/PointF;", "getRadius", "()F", "x", "getX", "y", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Circle {
    private final PointF center;
    private final float radius;

    public Circle(PointF center, float f) {
        OooOOO0.OooO0oO(center, "center");
        this.center = center;
        this.radius = f;
    }

    public static /* synthetic */ Circle copy$default(Circle circle, PointF pointF, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            pointF = circle.center;
        }
        if ((i & 2) != 0) {
            f = circle.radius;
        }
        return circle.copy(pointF, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PointF getCenter() {
        return this.center;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    public final Circle copy(PointF center, float radius) {
        OooOOO0.OooO0oO(center, "center");
        return new Circle(center, radius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) other;
        return OooOOO0.OooO0O0(this.center, circle.center) && Float.compare(this.radius, circle.radius) == 0;
    }

    public final PointF getCenter() {
        return this.center;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getX() {
        return this.center.x;
    }

    public final float getY() {
        return this.center.y;
    }

    public int hashCode() {
        return Float.hashCode(this.radius) + (this.center.hashCode() * 31);
    }

    public String toString() {
        return "Circle(center=" + this.center + ", radius=" + this.radius + ")";
    }
}
