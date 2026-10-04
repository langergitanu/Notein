package com.orion.notein.data.p602db.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/PageOffSet;", "", "offsetX", "", "offsetY", "<init>", "(FF)V", "getOffsetX", "()F", "getOffsetY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageOffSet {

    @SerializedName("offset_x")
    private final float offsetX;

    @SerializedName("offset_y")
    private final float offsetY;

    /* JADX WARN: Illegal instructions before constructor call */
    public PageOffSet() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ PageOffSet copy$default(PageOffSet pageOffSet, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pageOffSet.offsetX;
        }
        if ((i & 2) != 0) {
            f2 = pageOffSet.offsetY;
        }
        return pageOffSet.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    public final PageOffSet copy(float offsetX, float offsetY) {
        return new PageOffSet(offsetX, offsetY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageOffSet)) {
            return false;
        }
        PageOffSet pageOffSet = (PageOffSet) other;
        return Float.compare(this.offsetX, pageOffSet.offsetX) == 0 && Float.compare(this.offsetY, pageOffSet.offsetY) == 0;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public int hashCode() {
        return Float.hashCode(this.offsetY) + (Float.hashCode(this.offsetX) * 31);
    }

    public String toString() {
        return "PageOffSet(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ")";
    }

    public PageOffSet(float f, float f2) {
        this.offsetX = f;
        this.offsetY = f2;
    }

    public /* synthetic */ PageOffSet(float f, float f2, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
