package com.orion.notein.domain.models.foundation;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/foundation/RatioPointF;", "", "horizontal", "", "vertical", "<init>", "(FF)V", "getHorizontal", "()F", "getVertical", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class RatioPointF {
    private final float horizontal;
    private final float vertical;

    public RatioPointF(float f, float f2) {
        this.horizontal = f;
        this.vertical = f2;
    }

    public static /* synthetic */ RatioPointF copy$default(RatioPointF ratioPointF, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ratioPointF.horizontal;
        }
        if ((i & 2) != 0) {
            f2 = ratioPointF.vertical;
        }
        return ratioPointF.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHorizontal() {
        return this.horizontal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getVertical() {
        return this.vertical;
    }

    public final RatioPointF copy(float horizontal, float vertical) {
        return new RatioPointF(horizontal, vertical);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatioPointF)) {
            return false;
        }
        RatioPointF ratioPointF = (RatioPointF) other;
        return Float.compare(this.horizontal, ratioPointF.horizontal) == 0 && Float.compare(this.vertical, ratioPointF.vertical) == 0;
    }

    public final float getHorizontal() {
        return this.horizontal;
    }

    public final float getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return Float.hashCode(this.vertical) + (Float.hashCode(this.horizontal) * 31);
    }

    public String toString() {
        return "RatioPointF(horizontal=" + this.horizontal + ", vertical=" + this.vertical + ")";
    }
}
