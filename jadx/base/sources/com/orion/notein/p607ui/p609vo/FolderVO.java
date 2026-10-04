package com.orion.notein.p607ui.p609vo;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0OOoooO.C27996OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006%"}, m80612d2 = {"Lcom/orion/notein/ui/vo/FolderVO;", "", "id", "", "name", "isExpand", "", FirebaseAnalytics.Param.LEVEL, "", "isSelected", "hasChildren", "selectable", "coverColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZIZZZI)V", "getId", "()Ljava/lang/String;", "getName", "()Z", "getLevel", "()I", "getHasChildren", "getSelectable", "getCoverColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class FolderVO {
    private final int coverColor;
    private final boolean hasChildren;
    private final String id;
    private final boolean isExpand;
    private final boolean isSelected;
    private final int level;
    private final String name;
    private final boolean selectable;

    public FolderVO(String id, String name, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        this.id = id;
        this.name = name;
        this.isExpand = z;
        this.level = i;
        this.isSelected = z2;
        this.hasChildren = z3;
        this.selectable = z4;
        this.coverColor = i2;
    }

    public static /* synthetic */ FolderVO copy$default(FolderVO folderVO, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = folderVO.id;
        }
        if ((i3 & 2) != 0) {
            str2 = folderVO.name;
        }
        if ((i3 & 4) != 0) {
            z = folderVO.isExpand;
        }
        if ((i3 & 8) != 0) {
            i = folderVO.level;
        }
        if ((i3 & 16) != 0) {
            z2 = folderVO.isSelected;
        }
        if ((i3 & 32) != 0) {
            z3 = folderVO.hasChildren;
        }
        if ((i3 & 64) != 0) {
            z4 = folderVO.selectable;
        }
        if ((i3 & 128) != 0) {
            i2 = folderVO.coverColor;
        }
        boolean z5 = z4;
        int i4 = i2;
        boolean z6 = z2;
        boolean z7 = z3;
        return folderVO.copy(str, str2, z, i, z6, z7, z5, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsExpand() {
        return this.isExpand;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSelectable() {
        return this.selectable;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCoverColor() {
        return this.coverColor;
    }

    public final FolderVO copy(String id, String name, boolean isExpand, int level, boolean isSelected, boolean hasChildren, boolean selectable, int coverColor) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        return new FolderVO(id, name, isExpand, level, isSelected, hasChildren, selectable, coverColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FolderVO)) {
            return false;
        }
        FolderVO folderVO = (FolderVO) other;
        return OooOOO0.OooO0O0(this.id, folderVO.id) && OooOOO0.OooO0O0(this.name, folderVO.name) && this.isExpand == folderVO.isExpand && this.level == folderVO.level && this.isSelected == folderVO.isSelected && this.hasChildren == folderVO.hasChildren && this.selectable == folderVO.selectable && this.coverColor == folderVO.coverColor;
    }

    public final int getCoverColor() {
        return this.coverColor;
    }

    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelectable() {
        return this.selectable;
    }

    public int hashCode() {
        return Integer.hashCode(this.coverColor) + o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(C20785Oooo00o.OooO00o(this.level, o00000.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.name), 31, this.isExpand), 31), 31, this.isSelected), 31, this.hasChildren), 31, this.selectable);
    }

    public final boolean isExpand() {
        return this.isExpand;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        boolean z = this.isExpand;
        int i = this.level;
        boolean z2 = this.isSelected;
        boolean z3 = this.hasChildren;
        boolean z4 = this.selectable;
        int i2 = this.coverColor;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("FolderVO(id=", str, ", name=", str2, ", isExpand=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", level=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", isSelected=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", hasChildren=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", selectable=");
        sbOooO0O0.append(z4);
        sbOooO0O0.append(", coverColor=");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FolderVO(String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, C24018OooO0oo c24018OooO0oo) {
        int i4;
        if ((i3 & 128) != 0) {
            int i5 = C27996OooO00o.f99274OooO00o;
            i4 = C27996OooO00o.f99274OooO00o;
        } else {
            i4 = i2;
        }
        this(str, str2, z, i, z2, z3, z4, i4);
    }
}
