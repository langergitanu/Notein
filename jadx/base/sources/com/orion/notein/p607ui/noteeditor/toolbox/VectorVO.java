package com.orion.notein.p607ui.noteeditor.toolbox;

import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/VectorVO;", "", C18437z2.f56754h, "", "selected", "", "<init>", "(IZ)V", "getType", "()I", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class VectorVO {
    private final boolean selected;
    private final int type;

    public VectorVO(int i, boolean z) {
        this.type = i;
        this.selected = z;
    }

    public static /* synthetic */ VectorVO copy$default(VectorVO vectorVO, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vectorVO.type;
        }
        if ((i2 & 2) != 0) {
            z = vectorVO.selected;
        }
        return vectorVO.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final VectorVO copy(int type, boolean selected) {
        return new VectorVO(type, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VectorVO)) {
            return false;
        }
        VectorVO vectorVO = (VectorVO) other;
        return this.type == vectorVO.type && this.selected == vectorVO.selected;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + (Integer.hashCode(this.type) * 31);
    }

    public String toString() {
        return "VectorVO(type=" + this.type + ", selected=" + this.selected + ")";
    }
}
