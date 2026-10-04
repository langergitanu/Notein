package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import OooOoo0.o00000;
import OoooooO.C21445Oooo;
import android.graphics.Point;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b3\b\u0086\b\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0018J\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&J-\u0010)\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b5\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b6\u00104J\u0010\u00107\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b>\u00108J\u0012\u0010?\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\b?\u0010&J\u0092\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0000HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020+HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u00100J\u001a\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u00102R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u00104\"\u0004\bN\u0010OR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010L\u001a\u0004\bP\u00104\"\u0004\bQ\u0010OR(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010L\u001a\u0004\bR\u00104\"\u0004\bS\u0010OR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010T\u001a\u0004\bU\u00108R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010T\u001a\u0004\bV\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010W\u001a\u0004\bX\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\b\u0017\u0010=R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bZ\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010[\u001a\u0004\b\\\u0010&¨\u0006^"}, m80612d2 = {"Lcom/orion/penkit/models/DrawResult;", "", "", "updateMode", "Lo0oo0o/OooO0O0;", "item", "", "newItemList", "removeItemList", "selectItemList", "", "needClear", "whenLassoCompleted", "Landroid/graphics/Point;", "contextMenuPos", "Landroid/graphics/RectF;", "dirtyRect", "fromPixelEraser", "floatingItem", "<init>", "(ILo0oo0o/OooO0O0;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLandroid/graphics/Point;Landroid/graphics/RectF;ZLcom/orion/penkit/models/DrawResult;)V", "", "scale", "getDirtyRect", "(F)Landroid/graphics/RectF;", "penWidthScale", "getBounds", "getSelectRecordsBounds", "getRemoveRecordsBounds", "dx", "dy", "LoO00ooO/OooOooO;", "setOffset", "(FF)V", "zoom", "setScale", "(FZ)V", "deepCopy", "()Lcom/orion/penkit/models/DrawResult;", "offsetX", "offsetY", "transform", "(FFFZ)V", "", "layerId", "updateItemLayer", "(Ljava/lang/String;)V", "component1", "()I", "component2", "()Lo0oo0o/OooO0O0;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Z", "component7", "component8", "()Landroid/graphics/Point;", "component9", "()Landroid/graphics/RectF;", "component10", "component11", "copy", "(ILo0oo0o/OooO0O0;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLandroid/graphics/Point;Landroid/graphics/RectF;ZLcom/orion/penkit/models/DrawResult;)Lcom/orion/penkit/models/DrawResult;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUpdateMode", "Lo0oo0o/OooO0O0;", "getItem", "Ljava/util/List;", "getNewItemList", "setNewItemList", "(Ljava/util/List;)V", "getRemoveItemList", "setRemoveItemList", "getSelectItemList", "setSelectItemList", "Z", "getNeedClear", "getWhenLassoCompleted", "Landroid/graphics/Point;", "getContextMenuPos", "Landroid/graphics/RectF;", "getFromPixelEraser", "Lcom/orion/penkit/models/DrawResult;", "getFloatingItem", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DrawResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Point contextMenuPos;
    private final RectF dirtyRect;
    private final DrawResult floatingItem;
    private final boolean fromPixelEraser;
    private final InterfaceC31284OooO0O0 item;
    private final boolean needClear;
    private List<? extends InterfaceC31284OooO0O0> newItemList;
    private List<? extends InterfaceC31284OooO0O0> removeItemList;
    private List<? extends InterfaceC31284OooO0O0> selectItemList;
    private final int updateMode;
    private final boolean whenLassoCompleted;

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/penkit/models/DrawResult$Companion;", "", "<init>", "()V", "empty", "Lcom/orion/penkit/models/DrawResult;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final DrawResult empty() {
            DummyDisplayItem companion = DummyDisplayItem.INSTANCE.getInstance();
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            return new DrawResult(0, companion, c34434OooOoO, c34434OooOoO, c34434OooOoO, false, false, new Point(0, 0), new RectF(), false, null);
        }

        private Companion() {
        }
    }

    public DrawResult(int i, InterfaceC31284OooO0O0 item, List<? extends InterfaceC31284OooO0O0> newItemList, List<? extends InterfaceC31284OooO0O0> removeItemList, List<? extends InterfaceC31284OooO0O0> selectItemList, boolean z, boolean z2, Point contextMenuPos, RectF dirtyRect, boolean z3, DrawResult drawResult) {
        OooOOO0.OooO0oO(item, "item");
        OooOOO0.OooO0oO(newItemList, "newItemList");
        OooOOO0.OooO0oO(removeItemList, "removeItemList");
        OooOOO0.OooO0oO(selectItemList, "selectItemList");
        OooOOO0.OooO0oO(contextMenuPos, "contextMenuPos");
        OooOOO0.OooO0oO(dirtyRect, "dirtyRect");
        this.updateMode = i;
        this.item = item;
        this.newItemList = newItemList;
        this.removeItemList = removeItemList;
        this.selectItemList = selectItemList;
        this.needClear = z;
        this.whenLassoCompleted = z2;
        this.contextMenuPos = contextMenuPos;
        this.dirtyRect = dirtyRect;
        this.fromPixelEraser = z3;
        this.floatingItem = drawResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawResult copy$default(DrawResult drawResult, int i, InterfaceC31284OooO0O0 interfaceC31284OooO0O0, List list, List list2, List list3, boolean z, boolean z2, Point point, RectF rectF, boolean z3, DrawResult drawResult2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = drawResult.updateMode;
        }
        if ((i2 & 2) != 0) {
            interfaceC31284OooO0O0 = drawResult.item;
        }
        if ((i2 & 4) != 0) {
            list = drawResult.newItemList;
        }
        if ((i2 & 8) != 0) {
            list2 = drawResult.removeItemList;
        }
        if ((i2 & 16) != 0) {
            list3 = drawResult.selectItemList;
        }
        if ((i2 & 32) != 0) {
            z = drawResult.needClear;
        }
        if ((i2 & 64) != 0) {
            z2 = drawResult.whenLassoCompleted;
        }
        if ((i2 & 128) != 0) {
            point = drawResult.contextMenuPos;
        }
        if ((i2 & 256) != 0) {
            rectF = drawResult.dirtyRect;
        }
        if ((i2 & 512) != 0) {
            z3 = drawResult.fromPixelEraser;
        }
        if ((i2 & 1024) != 0) {
            drawResult2 = drawResult.floatingItem;
        }
        boolean z4 = z3;
        DrawResult drawResult3 = drawResult2;
        Point point2 = point;
        RectF rectF2 = rectF;
        boolean z5 = z;
        boolean z6 = z2;
        List list4 = list3;
        List list5 = list;
        return drawResult.copy(i, interfaceC31284OooO0O0, list5, list2, list4, z5, z6, point2, rectF2, z4, drawResult3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUpdateMode() {
        return this.updateMode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getFromPixelEraser() {
        return this.fromPixelEraser;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DrawResult getFloatingItem() {
        return this.floatingItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InterfaceC31284OooO0O0 getItem() {
        return this.item;
    }

    public final List<InterfaceC31284OooO0O0> component3() {
        return this.newItemList;
    }

    public final List<InterfaceC31284OooO0O0> component4() {
        return this.removeItemList;
    }

    public final List<InterfaceC31284OooO0O0> component5() {
        return this.selectItemList;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNeedClear() {
        return this.needClear;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getWhenLassoCompleted() {
        return this.whenLassoCompleted;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Point getContextMenuPos() {
        return this.contextMenuPos;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RectF getDirtyRect() {
        return this.dirtyRect;
    }

    public final DrawResult copy(int updateMode, InterfaceC31284OooO0O0 item, List<? extends InterfaceC31284OooO0O0> newItemList, List<? extends InterfaceC31284OooO0O0> removeItemList, List<? extends InterfaceC31284OooO0O0> selectItemList, boolean needClear, boolean whenLassoCompleted, Point contextMenuPos, RectF dirtyRect, boolean fromPixelEraser, DrawResult floatingItem) {
        OooOOO0.OooO0oO(item, "item");
        OooOOO0.OooO0oO(newItemList, "newItemList");
        OooOOO0.OooO0oO(removeItemList, "removeItemList");
        OooOOO0.OooO0oO(selectItemList, "selectItemList");
        OooOOO0.OooO0oO(contextMenuPos, "contextMenuPos");
        OooOOO0.OooO0oO(dirtyRect, "dirtyRect");
        return new DrawResult(updateMode, item, newItemList, removeItemList, selectItemList, needClear, whenLassoCompleted, contextMenuPos, dirtyRect, fromPixelEraser, floatingItem);
    }

    public final DrawResult deepCopy() {
        List<? extends InterfaceC31284OooO0O0> list = this.newItemList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list) {
            arrayList.add(interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId()));
        }
        List<? extends InterfaceC31284OooO0O0> list2 = this.removeItemList;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O02 : list2) {
            arrayList2.add(interfaceC31284OooO0O02.deepCopy(interfaceC31284OooO0O02.getId()));
        }
        List<? extends InterfaceC31284OooO0O0> list3 = this.selectItemList;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O03 : list3) {
            arrayList3.add(interfaceC31284OooO0O03.deepCopy(interfaceC31284OooO0O03.getId()));
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O04 = this.item;
        return copy$default(this, 0, interfaceC31284OooO0O04.deepCopy(interfaceC31284OooO0O04.getId()), arrayList, arrayList2, arrayList3, false, false, null, null, false, null, 2017, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawResult)) {
            return false;
        }
        DrawResult drawResult = (DrawResult) other;
        return this.updateMode == drawResult.updateMode && OooOOO0.OooO0O0(this.item, drawResult.item) && OooOOO0.OooO0O0(this.newItemList, drawResult.newItemList) && OooOOO0.OooO0O0(this.removeItemList, drawResult.removeItemList) && OooOOO0.OooO0O0(this.selectItemList, drawResult.selectItemList) && this.needClear == drawResult.needClear && this.whenLassoCompleted == drawResult.whenLassoCompleted && OooOOO0.OooO0O0(this.contextMenuPos, drawResult.contextMenuPos) && OooOOO0.OooO0O0(this.dirtyRect, drawResult.dirtyRect) && this.fromPixelEraser == drawResult.fromPixelEraser && OooOOO0.OooO0O0(this.floatingItem, drawResult.floatingItem);
    }

    public final RectF getBounds(float penWidthScale) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        List<? extends InterfaceC31284OooO0O0> list = this.removeItemList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC31284OooO0O0) it.next()).getBoundingBox(penWidthScale));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                RectF rectF4 = (RectF) next;
                rectF4.union((RectF) it2.next());
                next = rectF4;
            }
            rectF = (RectF) next;
        } else {
            rectF = null;
        }
        List<? extends InterfaceC31284OooO0O0> list2 = this.newItemList;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((InterfaceC31284OooO0O0) it3.next()).getBoundingBox(penWidthScale));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it4.next();
            while (it4.hasNext()) {
                RectF rectF5 = (RectF) next2;
                rectF5.union((RectF) it4.next());
                next2 = rectF5;
            }
            rectF2 = (RectF) next2;
        } else {
            rectF2 = null;
        }
        List<? extends InterfaceC31284OooO0O0> list3 = this.selectItemList;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
        Iterator<T> it5 = list3.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((InterfaceC31284OooO0O0) it5.next()).getBoundingBox(penWidthScale));
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            if (!it6.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next3 = it6.next();
            while (it6.hasNext()) {
                RectF rectF6 = (RectF) next3;
                rectF6.union((RectF) it6.next());
                next3 = rectF6;
            }
            rectF3 = (RectF) next3;
        } else {
            rectF3 = null;
        }
        ArrayList arrayListOooOoO = OooOOO.OooOoO(new RectF[]{rectF, rectF2, rectF3});
        if (arrayListOooOoO.isEmpty()) {
            return null;
        }
        Iterator it7 = arrayListOooOoO.iterator();
        if (!it7.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next4 = it7.next();
        while (it7.hasNext()) {
            RectF rectF7 = (RectF) next4;
            rectF7.union((RectF) it7.next());
            next4 = rectF7;
        }
        return (RectF) next4;
    }

    public final Point getContextMenuPos() {
        return this.contextMenuPos;
    }

    public final RectF getDirtyRect() {
        return this.dirtyRect;
    }

    public final DrawResult getFloatingItem() {
        return this.floatingItem;
    }

    public final boolean getFromPixelEraser() {
        return this.fromPixelEraser;
    }

    public final InterfaceC31284OooO0O0 getItem() {
        return this.item;
    }

    public final boolean getNeedClear() {
        return this.needClear;
    }

    public final List<InterfaceC31284OooO0O0> getNewItemList() {
        return this.newItemList;
    }

    public final List<InterfaceC31284OooO0O0> getRemoveItemList() {
        return this.removeItemList;
    }

    public final RectF getRemoveRecordsBounds(float scale) {
        List<? extends InterfaceC31284OooO0O0> list = this.removeItemList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC31284OooO0O0) it.next()).getBoundingBox(scale));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            RectF rectF = (RectF) next;
            rectF.union((RectF) it2.next());
            next = rectF;
        }
        return (RectF) next;
    }

    public final List<InterfaceC31284OooO0O0> getSelectItemList() {
        return this.selectItemList;
    }

    public final RectF getSelectRecordsBounds(float scale) {
        List<? extends InterfaceC31284OooO0O0> list = this.selectItemList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC31284OooO0O0) it.next()).getBoundingBox(scale));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            RectF rectF = (RectF) next;
            rectF.union((RectF) it2.next());
            next = rectF;
        }
        return (RectF) next;
    }

    public final int getUpdateMode() {
        return this.updateMode;
    }

    public final boolean getWhenLassoCompleted() {
        return this.whenLassoCompleted;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(C20424OooO0Oo.OooO0OO(this.dirtyRect, (this.contextMenuPos.hashCode() + o00000.OooO0O0(o00000.OooO0O0(C21445Oooo.OooO00o(this.selectItemList, C21445Oooo.OooO00o(this.removeItemList, C21445Oooo.OooO00o(this.newItemList, (this.item.hashCode() + (Integer.hashCode(this.updateMode) * 31)) * 31, 31), 31), 31), 31, this.needClear), 31, this.whenLassoCompleted)) * 31, 31), 31, this.fromPixelEraser);
        DrawResult drawResult = this.floatingItem;
        return iOooO0O0 + (drawResult == null ? 0 : drawResult.hashCode());
    }

    public final void setNewItemList(List<? extends InterfaceC31284OooO0O0> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.newItemList = list;
    }

    public final void setOffset(float dx, float dy) {
        this.item.offset(dx, dy);
        Iterator<T> it = this.newItemList.iterator();
        while (it.hasNext()) {
            ((InterfaceC31284OooO0O0) it.next()).offset(dx, dy);
        }
        Iterator<T> it2 = this.removeItemList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC31284OooO0O0) it2.next()).offset(dx, dy);
        }
        Iterator<T> it3 = this.selectItemList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC31284OooO0O0) it3.next()).offset(dx, dy);
        }
    }

    public final void setRemoveItemList(List<? extends InterfaceC31284OooO0O0> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.removeItemList = list;
    }

    public final void setScale(float zoom, boolean penWidthScale) {
        this.item.scale(zoom, penWidthScale);
        Iterator<T> it = this.newItemList.iterator();
        while (it.hasNext()) {
            ((InterfaceC31284OooO0O0) it.next()).scale(zoom, penWidthScale);
        }
        Iterator<T> it2 = this.removeItemList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC31284OooO0O0) it2.next()).scale(zoom, penWidthScale);
        }
        Iterator<T> it3 = this.selectItemList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC31284OooO0O0) it3.next()).scale(zoom, penWidthScale);
        }
    }

    public final void setSelectItemList(List<? extends InterfaceC31284OooO0O0> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.selectItemList = list;
    }

    public String toString() {
        return "DrawResult(updateMode=" + this.updateMode + ", item=" + this.item + ", newItemList=" + this.newItemList + ", removeItemList=" + this.removeItemList + ", selectItemList=" + this.selectItemList + ", needClear=" + this.needClear + ", whenLassoCompleted=" + this.whenLassoCompleted + ", contextMenuPos=" + this.contextMenuPos + ", dirtyRect=" + this.dirtyRect + ", fromPixelEraser=" + this.fromPixelEraser + ", floatingItem=" + this.floatingItem + ")";
    }

    public final void transform(float offsetX, float offsetY, float zoom, boolean penWidthScale) {
        setOffset(offsetX, offsetY);
        setScale(zoom, penWidthScale);
    }

    public final void updateItemLayer(String layerId) {
        OooOOO0.OooO0oO(layerId, "layerId");
        List<? extends InterfaceC31284OooO0O0> list = this.newItemList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy : list) {
            if (interfaceC31284OooO0O0DeepCopy.doesSupportLayer()) {
                interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0DeepCopy.deepCopy(interfaceC31284OooO0O0DeepCopy.getId(), layerId);
            }
            arrayList.add(interfaceC31284OooO0O0DeepCopy);
        }
        this.newItemList = arrayList;
    }

    public final RectF getDirtyRect(float scale) {
        if (this.dirtyRect.isEmpty()) {
            return getBounds(scale);
        }
        RectF rectF = new RectF(this.dirtyRect);
        o00OO0O0.OooO0O0.OooOO0O(rectF, scale);
        return rectF;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DrawResult(int i, InterfaceC31284OooO0O0 interfaceC31284OooO0O0, List list, List list2, List list3, boolean z, boolean z2, Point point, RectF rectF, boolean z3, DrawResult drawResult, int i2, C24018OooO0oo c24018OooO0oo) {
        int i3 = i2 & 4;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this(i, interfaceC31284OooO0O0, i3 != 0 ? c34434OooOoO : list, (i2 & 8) != 0 ? c34434OooOoO : list2, (i2 & 16) != 0 ? c34434OooOoO : list3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? new Point(0, 0) : point, (i2 & 256) != 0 ? new RectF() : rectF, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? null : drawResult);
    }
}
