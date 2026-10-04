package com.orion.notein.domain.models.page;

import OooO0o.C20424OooO0Oo;
import android.graphics.Point;
import android.graphics.RectF;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PageGrid;", "", "pageId", "", "bounds", "Landroid/graphics/RectF;", FirebaseAnalytics.Param.INDEX, "Landroid/graphics/Point;", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Point;)V", "getPageId", "()Ljava/lang/String;", "getBounds", "()Landroid/graphics/RectF;", "getIndex", "()Landroid/graphics/Point;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageGrid {
    private final RectF bounds;
    private final Point index;
    private final String pageId;

    public PageGrid(String pageId, RectF bounds, Point index) {
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(index, "index");
        this.pageId = pageId;
        this.bounds = bounds;
        this.index = index;
    }

    public static /* synthetic */ PageGrid copy$default(PageGrid pageGrid, String str, RectF rectF, Point point, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageGrid.pageId;
        }
        if ((i & 2) != 0) {
            rectF = pageGrid.bounds;
        }
        if ((i & 4) != 0) {
            point = pageGrid.index;
        }
        return pageGrid.copy(str, rectF, point);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Point getIndex() {
        return this.index;
    }

    public final PageGrid copy(String pageId, RectF bounds, Point index) {
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(index, "index");
        return new PageGrid(pageId, bounds, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageGrid)) {
            return false;
        }
        PageGrid pageGrid = (PageGrid) other;
        return OooOOO0.OooO0O0(this.pageId, pageGrid.pageId) && OooOOO0.OooO0O0(this.bounds, pageGrid.bounds) && OooOOO0.OooO0O0(this.index, pageGrid.index);
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    public final Point getIndex() {
        return this.index;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public int hashCode() {
        return this.index.hashCode() + C20424OooO0Oo.OooO0OO(this.bounds, this.pageId.hashCode() * 31, 31);
    }

    public String toString() {
        return "PageGrid(pageId=" + this.pageId + ", bounds=" + this.bounds + ", index=" + this.index + ")";
    }
}
