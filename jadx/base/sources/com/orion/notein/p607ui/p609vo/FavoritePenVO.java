package com.orion.notein.p607ui.p609vo;

import OooOO0.OooO0O0;
import OooOo.C20485OooOoO;
import OooOoO.C20509OooO0oo;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.PenInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J[\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/ui/vo/FavoritePenVO;", "", "id", "", C18437z2.f56754h, "", "penSubType", "color", "width", "", "selected", "", "editable", "orientation", "<init>", "(Ljava/lang/String;ILjava/lang/String;IFZZI)V", "penInfo", "Lcom/orion/notein/domain/models/note/PenInfo;", "(Lcom/orion/notein/domain/models/note/PenInfo;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getType", "()I", "getPenSubType", "getColor", "getWidth", "()F", "getSelected", "()Z", "getEditable", "getOrientation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class FavoritePenVO {
    private final int color;
    private final boolean editable;
    private final String id;
    private final int orientation;
    private final String penSubType;
    private final boolean selected;
    private final int type;
    private final float width;

    public FavoritePenVO(String id, int i, String str, int i2, float f, boolean z, boolean z2, int i3) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.type = i;
        this.penSubType = str;
        this.color = i2;
        this.width = f;
        this.selected = z;
        this.editable = z2;
        this.orientation = i3;
    }

    public static /* synthetic */ FavoritePenVO copy$default(FavoritePenVO favoritePenVO, String str, int i, String str2, int i2, float f, boolean z, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = favoritePenVO.id;
        }
        if ((i4 & 2) != 0) {
            i = favoritePenVO.type;
        }
        if ((i4 & 4) != 0) {
            str2 = favoritePenVO.penSubType;
        }
        if ((i4 & 8) != 0) {
            i2 = favoritePenVO.color;
        }
        if ((i4 & 16) != 0) {
            f = favoritePenVO.width;
        }
        if ((i4 & 32) != 0) {
            z = favoritePenVO.selected;
        }
        if ((i4 & 64) != 0) {
            z2 = favoritePenVO.editable;
        }
        if ((i4 & 128) != 0) {
            i3 = favoritePenVO.orientation;
        }
        boolean z3 = z2;
        int i5 = i3;
        float f2 = f;
        boolean z4 = z;
        return favoritePenVO.copy(str, i, str2, i2, f2, z4, z3, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPenSubType() {
        return this.penSubType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    public final FavoritePenVO copy(String id, int type, String penSubType, int color, float width, boolean selected, boolean editable, int orientation) {
        OooOOO0.OooO0oO(id, "id");
        return new FavoritePenVO(id, type, penSubType, color, width, selected, editable, orientation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritePenVO)) {
            return false;
        }
        FavoritePenVO favoritePenVO = (FavoritePenVO) other;
        return OooOOO0.OooO0O0(this.id, favoritePenVO.id) && this.type == favoritePenVO.type && OooOOO0.OooO0O0(this.penSubType, favoritePenVO.penSubType) && this.color == favoritePenVO.color && Float.compare(this.width, favoritePenVO.width) == 0 && this.selected == favoritePenVO.selected && this.editable == favoritePenVO.editable && this.orientation == favoritePenVO.orientation;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getId() {
        return this.id;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final String getPenSubType() {
        return this.penSubType;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getType() {
        return this.type;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.type, this.id.hashCode() * 31, 31);
        String str = this.penSubType;
        return Integer.hashCode(this.orientation) + o00000.OooO0O0(o00000.OooO0O0(C20509OooO0oo.OooO0OO(this.width, C20785Oooo00o.OooO00o(this.color, (iOooO00o + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.selected), 31, this.editable);
    }

    public String toString() {
        String str = this.id;
        int i = this.type;
        String str2 = this.penSubType;
        int i2 = this.color;
        float f = this.width;
        boolean z = this.selected;
        boolean z2 = this.editable;
        int i3 = this.orientation;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "FavoritePenVO(id=", str, ", type=", ", penSubType=");
        OooO0O0.OooO0Oo(i2, str2, ", color=", ", width=", sbOooO0OO);
        sbOooO0OO.append(f);
        sbOooO0OO.append(", selected=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", editable=");
        sbOooO0OO.append(z2);
        sbOooO0OO.append(", orientation=");
        sbOooO0OO.append(i3);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FavoritePenVO(PenInfo penInfo, String str, int i) {
        this(penInfo.getId(), penInfo.getType(), str, penInfo.getColor(), penInfo.getWidth(), penInfo.getSelected(), false, i);
        OooOOO0.OooO0oO(penInfo, "penInfo");
    }
}
