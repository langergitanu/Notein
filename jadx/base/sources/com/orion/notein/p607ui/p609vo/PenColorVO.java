package com.orion.notein.p607ui.p609vo;

import OooO0Oo.C20398OooO0O0;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/ui/vo/PenColorVO;", "", FirebaseAnalytics.Param.INDEX, "", C18437z2.f56754h, "color", "selected", "", "enable", "<init>", "(IIIZZ)V", "getIndex", "()I", "getType", "getColor", "getSelected", "()Z", "getEnable", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PenColorVO {
    private final int color;
    private final boolean enable;
    private final int index;
    private final boolean selected;
    private final int type;

    public PenColorVO(int i, int i2, int i3, boolean z, boolean z2) {
        this.index = i;
        this.type = i2;
        this.color = i3;
        this.selected = z;
        this.enable = z2;
    }

    public static /* synthetic */ PenColorVO copy$default(PenColorVO penColorVO, int i, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = penColorVO.index;
        }
        if ((i4 & 2) != 0) {
            i2 = penColorVO.type;
        }
        if ((i4 & 4) != 0) {
            i3 = penColorVO.color;
        }
        if ((i4 & 8) != 0) {
            z = penColorVO.selected;
        }
        if ((i4 & 16) != 0) {
            z2 = penColorVO.enable;
        }
        boolean z3 = z2;
        int i5 = i3;
        return penColorVO.copy(i, i2, i5, z, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    public final PenColorVO copy(int index, int type, int color, boolean selected, boolean enable) {
        return new PenColorVO(index, type, color, selected, enable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenColorVO)) {
            return false;
        }
        PenColorVO penColorVO = (PenColorVO) other;
        return this.index == penColorVO.index && this.type == penColorVO.type && this.color == penColorVO.color && this.selected == penColorVO.selected && this.enable == penColorVO.enable;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enable) + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.color, C20785Oooo00o.OooO00o(this.type, Integer.hashCode(this.index) * 31, 31), 31), 31, this.selected);
    }

    public String toString() {
        int i = this.index;
        int i2 = this.type;
        int i3 = this.color;
        boolean z = this.selected;
        boolean z2 = this.enable;
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("PenColorVO(index=", i, ", type=", ", color=", i2);
        sbOooO0O0.append(i3);
        sbOooO0O0.append(", selected=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", enable=");
        return OooOOO.OooO00o(sbOooO0O0, ")", z2);
    }

    public /* synthetic */ PenColorVO(int i, int i2, int i3, boolean z, boolean z2, int i4, C24018OooO0oo c24018OooO0oo) {
        this(i, i2, i3, z, (i4 & 16) != 0 ? true : z2);
    }
}
