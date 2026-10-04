package com.orion.notein.p607ui.p609vo;

import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/ui/vo/PageSpecVO;", "", "paperSpec", "Lcom/orion/notein/domain/models/page/PaperSpec;", "icon", "", "isSelected", "", "<init>", "(Lcom/orion/notein/domain/models/page/PaperSpec;IZ)V", "getPaperSpec", "()Lcom/orion/notein/domain/models/page/PaperSpec;", "getIcon", "()I", "()Z", "getName", "", "getInfo", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageSpecVO {
    private final int icon;
    private final boolean isSelected;
    private final PaperSpec paperSpec;

    public PageSpecVO(PaperSpec paperSpec, int i, boolean z) {
        OooOOO0.OooO0oO(paperSpec, "paperSpec");
        this.paperSpec = paperSpec;
        this.icon = i;
        this.isSelected = z;
    }

    public static /* synthetic */ PageSpecVO copy$default(PageSpecVO pageSpecVO, PaperSpec paperSpec, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paperSpec = pageSpecVO.paperSpec;
        }
        if ((i2 & 2) != 0) {
            i = pageSpecVO.icon;
        }
        if ((i2 & 4) != 0) {
            z = pageSpecVO.isSelected;
        }
        return pageSpecVO.copy(paperSpec, i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperSpec getPaperSpec() {
        return this.paperSpec;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final PageSpecVO copy(PaperSpec paperSpec, int icon, boolean isSelected) {
        OooOOO0.OooO0oO(paperSpec, "paperSpec");
        return new PageSpecVO(paperSpec, icon, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageSpecVO)) {
            return false;
        }
        PageSpecVO pageSpecVO = (PageSpecVO) other;
        return OooOOO0.OooO0O0(this.paperSpec, pageSpecVO.paperSpec) && this.icon == pageSpecVO.icon && this.isSelected == pageSpecVO.isSelected;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getInfo() {
        return this.paperSpec.getInfo();
    }

    public final String getName() {
        return this.paperSpec.getName();
    }

    public final PaperSpec getPaperSpec() {
        return this.paperSpec;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + C20785Oooo00o.OooO00o(this.icon, this.paperSpec.hashCode() * 31, 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        PaperSpec paperSpec = this.paperSpec;
        int i = this.icon;
        boolean z = this.isSelected;
        StringBuilder sb = new StringBuilder("PageSpecVO(paperSpec=");
        sb.append(paperSpec);
        sb.append(", icon=");
        sb.append(i);
        sb.append(", isSelected=");
        return OooOOO.OooO00o(sb, ")", z);
    }

    public /* synthetic */ PageSpecVO(PaperSpec paperSpec, int i, boolean z, int i2, C24018OooO0oo c24018OooO0oo) {
        this(paperSpec, (i2 & 2) != 0 ? R.drawable.ic_page_spec_a4_v : i, (i2 & 4) != 0 ? false : z);
    }
}
