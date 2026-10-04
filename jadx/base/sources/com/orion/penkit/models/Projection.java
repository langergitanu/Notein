package com.orion.penkit.models;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/penkit/models/Projection;", "", "min", "", "max", "<init>", "(FF)V", "getMin", "()F", "getMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Projection {
    private final float max;
    private final float min;

    public Projection(float f, float f2) {
        this.min = f;
        this.max = f2;
    }

    public static /* synthetic */ Projection copy$default(Projection projection, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = projection.min;
        }
        if ((i & 2) != 0) {
            f2 = projection.max;
        }
        return projection.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    public final Projection copy(float min, float max) {
        return new Projection(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Projection)) {
            return false;
        }
        Projection projection = (Projection) other;
        return Float.compare(this.min, projection.min) == 0 && Float.compare(this.max, projection.max) == 0;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public int hashCode() {
        return Float.hashCode(this.max) + (Float.hashCode(this.min) * 31);
    }

    public String toString() {
        return "Projection(min=" + this.min + ", max=" + this.max + ")";
    }
}
