package com.orion.penkit.models;

import Oooo0.C20856OooooOo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/penkit/models/IntPoint;", "Lcom/orion/penkit/models/AssistPoint;", "", "x", "y", "<init>", "(II)V", "getX", "()Ljava/lang/Integer;", "getY", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class IntPoint implements AssistPoint<Integer> {
    private final int x;
    private final int y;

    public IntPoint(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public static /* synthetic */ IntPoint copy$default(IntPoint intPoint, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = intPoint.x;
        }
        if ((i3 & 2) != 0) {
            i2 = intPoint.y;
        }
        return intPoint.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getY() {
        return this.y;
    }

    public final IntPoint copy(int x, int y) {
        return new IntPoint(x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntPoint)) {
            return false;
        }
        IntPoint intPoint = (IntPoint) other;
        return this.x == intPoint.x && this.y == intPoint.y;
    }

    @Override // com.orion.penkit.models.AssistPoint
    public Integer getX() {
        return Integer.valueOf(this.x);
    }

    @Override // com.orion.penkit.models.AssistPoint
    public Integer getY() {
        return Integer.valueOf(this.y);
    }

    public int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.x) * 31);
    }

    public String toString() {
        return C20856OooooOo.OooO0O0("IntPoint(x=", this.x, ", y=", ")", this.y);
    }
}
