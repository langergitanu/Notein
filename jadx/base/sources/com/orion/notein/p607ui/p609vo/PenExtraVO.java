package com.orion.notein.p607ui.p609vo;

import android.os.Bundle;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/ui/vo/PenExtraVO;", "", C18437z2.f56754h, "", "extra", "Landroid/os/Bundle;", "<init>", "(ILandroid/os/Bundle;)V", "getType", "()I", "getExtra", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PenExtraVO {
    private final Bundle extra;
    private final int type;

    public PenExtraVO(int i, Bundle extra) {
        OooOOO0.OooO0oO(extra, "extra");
        this.type = i;
        this.extra = extra;
    }

    public static /* synthetic */ PenExtraVO copy$default(PenExtraVO penExtraVO, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = penExtraVO.type;
        }
        if ((i2 & 2) != 0) {
            bundle = penExtraVO.extra;
        }
        return penExtraVO.copy(i, bundle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Bundle getExtra() {
        return this.extra;
    }

    public final PenExtraVO copy(int type, Bundle extra) {
        OooOOO0.OooO0oO(extra, "extra");
        return new PenExtraVO(type, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenExtraVO)) {
            return false;
        }
        PenExtraVO penExtraVO = (PenExtraVO) other;
        return this.type == penExtraVO.type && OooOOO0.OooO0O0(this.extra, penExtraVO.extra);
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.extra.hashCode() + (Integer.hashCode(this.type) * 31);
    }

    public String toString() {
        return "PenExtraVO(type=" + this.type + ", extra=" + this.extra + ")";
    }
}
