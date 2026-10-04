package com.orion.notein.p607ui.p609vo;

import OooO0Oo.C20398OooO0O0;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import androidx.appcompat.app.OooOOO;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.PenInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\""}, m80612d2 = {"Lcom/orion/notein/ui/vo/PenVO;", "", C18437z2.f56754h, "", "color", "selected", "", "extra", "Landroid/os/Bundle;", "isTapeTransparent", "<init>", "(IIZLandroid/os/Bundle;Z)V", "penInfo", "Lcom/orion/notein/domain/models/note/PenInfo;", "(Lcom/orion/notein/domain/models/note/PenInfo;)V", "(Lcom/orion/notein/domain/models/note/PenInfo;Z)V", "getType", "()I", "getColor", "getSelected", "()Z", "getExtra", "()Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PenVO {
    private final int color;
    private final Bundle extra;
    private final boolean isTapeTransparent;
    private final boolean selected;
    private final int type;

    public PenVO(int i, int i2, boolean z, Bundle extra, boolean z2) {
        OooOOO0.OooO0oO(extra, "extra");
        this.type = i;
        this.color = i2;
        this.selected = z;
        this.extra = extra;
        this.isTapeTransparent = z2;
    }

    public static /* synthetic */ PenVO copy$default(PenVO penVO, int i, int i2, boolean z, Bundle bundle, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = penVO.type;
        }
        if ((i3 & 2) != 0) {
            i2 = penVO.color;
        }
        if ((i3 & 4) != 0) {
            z = penVO.selected;
        }
        if ((i3 & 8) != 0) {
            bundle = penVO.extra;
        }
        if ((i3 & 16) != 0) {
            z2 = penVO.isTapeTransparent;
        }
        boolean z3 = z2;
        boolean z4 = z;
        return penVO.copy(i, i2, z4, bundle, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bundle getExtra() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsTapeTransparent() {
        return this.isTapeTransparent;
    }

    public final PenVO copy(int type, int color, boolean selected, Bundle extra, boolean isTapeTransparent) {
        OooOOO0.OooO0oO(extra, "extra");
        return new PenVO(type, color, selected, extra, isTapeTransparent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenVO)) {
            return false;
        }
        PenVO penVO = (PenVO) other;
        return this.type == penVO.type && this.color == penVO.color && this.selected == penVO.selected && OooOOO0.OooO0O0(this.extra, penVO.extra) && this.isTapeTransparent == penVO.isTapeTransparent;
    }

    public final int getColor() {
        return this.color;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTapeTransparent) + ((this.extra.hashCode() + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.color, Integer.hashCode(this.type) * 31, 31), 31, this.selected)) * 31);
    }

    public final boolean isTapeTransparent() {
        return this.isTapeTransparent;
    }

    public String toString() {
        int i = this.type;
        int i2 = this.color;
        boolean z = this.selected;
        Bundle bundle = this.extra;
        boolean z2 = this.isTapeTransparent;
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("PenVO(type=", i, ", color=", ", selected=", i2);
        sbOooO0O0.append(z);
        sbOooO0O0.append(", extra=");
        sbOooO0O0.append(bundle);
        sbOooO0O0.append(", isTapeTransparent=");
        return OooOOO.OooO00o(sbOooO0O0, ")", z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PenVO(PenInfo penInfo) {
        this(penInfo, false);
        OooOOO0.OooO0oO(penInfo, "penInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PenVO(PenInfo penInfo, boolean z) {
        this(penInfo.getType(), penInfo.getColor(), penInfo.getSelected(), penInfo.getExtra(), z);
        OooOOO0.OooO0oO(penInfo, "penInfo");
    }
}
