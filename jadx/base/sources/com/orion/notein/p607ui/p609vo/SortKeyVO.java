package com.orion.notein.p607ui.p609vo;

import OooOoo0.o00000;
import android.content.Context;
import androidx.appcompat.app.OooOOO;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010\u0011¨\u0006!"}, m80612d2 = {"Lcom/orion/notein/ui/vo/SortKeyVO;", "", "Lcom/orion/notein/ui/vo/OooO00o;", "key", "", "selected", "isVipBadgeVisible", "<init>", "(Lcom/orion/notein/ui/vo/OooO00o;ZZ)V", "Landroid/content/Context;", "context", "", "getName", "(Landroid/content/Context;)Ljava/lang/String;", "component1", "()Lcom/orion/notein/ui/vo/OooO00o;", "component2", "()Z", "component3", "copy", "(Lcom/orion/notein/ui/vo/OooO00o;ZZ)Lcom/orion/notein/ui/vo/SortKeyVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/orion/notein/ui/vo/OooO00o;", "getKey", "Z", "getSelected", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SortKeyVO {
    private final boolean isVipBadgeVisible;
    private final OooO00o key;
    private final boolean selected;

    public SortKeyVO(OooO00o key, boolean z, boolean z2) {
        OooOOO0.OooO0oO(key, "key");
        this.key = key;
        this.selected = z;
        this.isVipBadgeVisible = z2;
    }

    public static /* synthetic */ SortKeyVO copy$default(SortKeyVO sortKeyVO, OooO00o oooO00o, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            oooO00o = sortKeyVO.key;
        }
        if ((i & 2) != 0) {
            z = sortKeyVO.selected;
        }
        if ((i & 4) != 0) {
            z2 = sortKeyVO.isVipBadgeVisible;
        }
        return sortKeyVO.copy(oooO00o, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OooO00o getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsVipBadgeVisible() {
        return this.isVipBadgeVisible;
    }

    public final SortKeyVO copy(OooO00o key, boolean selected, boolean isVipBadgeVisible) {
        OooOOO0.OooO0oO(key, "key");
        return new SortKeyVO(key, selected, isVipBadgeVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortKeyVO)) {
            return false;
        }
        SortKeyVO sortKeyVO = (SortKeyVO) other;
        return this.key == sortKeyVO.key && this.selected == sortKeyVO.selected && this.isVipBadgeVisible == sortKeyVO.isVipBadgeVisible;
    }

    public final OooO00o getKey() {
        return this.key;
    }

    public final String getName(Context context) {
        OooOOO0.OooO0oO(context, "context");
        String string = context.getResources().getString(this.key.f80100OooOo0o);
        OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVipBadgeVisible) + o00000.OooO0O0(this.key.hashCode() * 31, 31, this.selected);
    }

    public final boolean isVipBadgeVisible() {
        return this.isVipBadgeVisible;
    }

    public String toString() {
        OooO00o oooO00o = this.key;
        boolean z = this.selected;
        boolean z2 = this.isVipBadgeVisible;
        StringBuilder sb = new StringBuilder("SortKeyVO(key=");
        sb.append(oooO00o);
        sb.append(", selected=");
        sb.append(z);
        sb.append(", isVipBadgeVisible=");
        return OooOOO.OooO00o(sb, ")", z2);
    }
}
