package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import Oooo0oO.C21023OooO0Oo;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J<\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0014R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u0012¨\u0006$"}, m80612d2 = {"Lcom/orion/penkit/models/LassoParams;", "", "", "Lo0oo0o/OooO0O0;", "selectedItems", "Landroid/graphics/RectF;", "border", "Landroid/graphics/PointF;", "polygonBorder", "<init>", "(Ljava/util/List;Landroid/graphics/RectF;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Point;", "getContextMenuPos", "()Landroid/graphics/Point;", "component1", "()Ljava/util/List;", "component2", "()Landroid/graphics/RectF;", "component3", "copy", "(Ljava/util/List;Landroid/graphics/RectF;Ljava/util/List;)Lcom/orion/penkit/models/LassoParams;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSelectedItems", "Landroid/graphics/RectF;", "getBorder", "getPolygonBorder", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LassoParams {
    private final RectF border;
    private final List<PointF> polygonBorder;
    private final List<InterfaceC31284OooO0O0> selectedItems;

    /* JADX WARN: Multi-variable type inference failed */
    public LassoParams(List<? extends InterfaceC31284OooO0O0> selectedItems, RectF border, List<? extends PointF> list) {
        OooOOO0.OooO0oO(selectedItems, "selectedItems");
        OooOOO0.OooO0oO(border, "border");
        this.selectedItems = selectedItems;
        this.border = border;
        this.polygonBorder = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LassoParams copy$default(LassoParams lassoParams, List list, RectF rectF, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lassoParams.selectedItems;
        }
        if ((i & 2) != 0) {
            rectF = lassoParams.border;
        }
        if ((i & 4) != 0) {
            list2 = lassoParams.polygonBorder;
        }
        return lassoParams.copy(list, rectF, list2);
    }

    public final List<InterfaceC31284OooO0O0> component1() {
        return this.selectedItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RectF getBorder() {
        return this.border;
    }

    public final List<PointF> component3() {
        return this.polygonBorder;
    }

    public final LassoParams copy(List<? extends InterfaceC31284OooO0O0> selectedItems, RectF border, List<? extends PointF> polygonBorder) {
        OooOOO0.OooO0oO(selectedItems, "selectedItems");
        OooOOO0.OooO0oO(border, "border");
        return new LassoParams(selectedItems, border, polygonBorder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LassoParams)) {
            return false;
        }
        LassoParams lassoParams = (LassoParams) other;
        return OooOOO0.OooO0O0(this.selectedItems, lassoParams.selectedItems) && OooOOO0.OooO0O0(this.border, lassoParams.border) && OooOOO0.OooO0O0(this.polygonBorder, lassoParams.polygonBorder);
    }

    public final RectF getBorder() {
        return this.border;
    }

    public final Point getContextMenuPos() {
        RectF rectF = this.border;
        return new Point((int) ((rectF.left + rectF.right) / 2), (int) rectF.top);
    }

    public final List<PointF> getPolygonBorder() {
        return this.polygonBorder;
    }

    public final List<InterfaceC31284OooO0O0> getSelectedItems() {
        return this.selectedItems;
    }

    public int hashCode() {
        int iOooO0OO = C20424OooO0Oo.OooO0OO(this.border, this.selectedItems.hashCode() * 31, 31);
        List<PointF> list = this.polygonBorder;
        return iOooO0OO + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        int size = this.selectedItems.size();
        RectF rectF = this.border;
        List<PointF> list = this.polygonBorder;
        int size2 = list != null ? list.size() : 0;
        StringBuilder sb = new StringBuilder("LassoParams(selected=");
        sb.append(size);
        sb.append(", border=");
        sb.append(rectF);
        sb.append(", polygon=");
        return C21023OooO0Oo.OooO0OO(")", size2, sb);
    }
}
