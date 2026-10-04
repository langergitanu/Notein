package com.orion.notein.data.p602db.entity;

import OooOo.C20485OooOoO;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.os.Bundle;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Jo\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/PenInfoEntity;", "", "id", "", C18437z2.f56754h, "", "colorIndex", "widthIndex", "colorList", "", "widthList", "", NoteMeta.PROPERTY_NOTE_ID, "selected", "", "extra", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;IIILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLandroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "getType", "()I", "getColorIndex", "getWidthIndex", "getColorList", "()Ljava/util/List;", "getWidthList", "getNoteId", "getSelected", "()Z", "getExtra", "()Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PenInfoEntity {
    private final int colorIndex;
    private final List<Integer> colorList;
    private final Bundle extra;
    private final String id;
    private final String noteId;
    private final boolean selected;
    private final int type;
    private final int widthIndex;
    private final List<Float> widthList;

    public PenInfoEntity(String id, int i, int i2, int i3, List<Integer> colorList, List<Float> widthList, String noteId, boolean z, Bundle extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(colorList, "colorList");
        OooOOO0.OooO0oO(widthList, "widthList");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(extra, "extra");
        this.id = id;
        this.type = i;
        this.colorIndex = i2;
        this.widthIndex = i3;
        this.colorList = colorList;
        this.widthList = widthList;
        this.noteId = noteId;
        this.selected = z;
        this.extra = extra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PenInfoEntity copy$default(PenInfoEntity penInfoEntity, String str, int i, int i2, int i3, List list, List list2, String str2, boolean z, Bundle bundle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = penInfoEntity.id;
        }
        if ((i4 & 2) != 0) {
            i = penInfoEntity.type;
        }
        if ((i4 & 4) != 0) {
            i2 = penInfoEntity.colorIndex;
        }
        if ((i4 & 8) != 0) {
            i3 = penInfoEntity.widthIndex;
        }
        if ((i4 & 16) != 0) {
            list = penInfoEntity.colorList;
        }
        if ((i4 & 32) != 0) {
            list2 = penInfoEntity.widthList;
        }
        if ((i4 & 64) != 0) {
            str2 = penInfoEntity.noteId;
        }
        if ((i4 & 128) != 0) {
            z = penInfoEntity.selected;
        }
        if ((i4 & 256) != 0) {
            bundle = penInfoEntity.extra;
        }
        boolean z2 = z;
        Bundle bundle2 = bundle;
        List list3 = list2;
        String str3 = str2;
        List list4 = list;
        int i5 = i2;
        return penInfoEntity.copy(str, i, i5, i3, list4, list3, str3, z2, bundle2);
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
    public final int getColorIndex() {
        return this.colorIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWidthIndex() {
        return this.widthIndex;
    }

    public final List<Integer> component5() {
        return this.colorList;
    }

    public final List<Float> component6() {
        return this.widthList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Bundle getExtra() {
        return this.extra;
    }

    public final PenInfoEntity copy(String id, int type, int colorIndex, int widthIndex, List<Integer> colorList, List<Float> widthList, String noteId, boolean selected, Bundle extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(colorList, "colorList");
        OooOOO0.OooO0oO(widthList, "widthList");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(extra, "extra");
        return new PenInfoEntity(id, type, colorIndex, widthIndex, colorList, widthList, noteId, selected, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenInfoEntity)) {
            return false;
        }
        PenInfoEntity penInfoEntity = (PenInfoEntity) other;
        return OooOOO0.OooO0O0(this.id, penInfoEntity.id) && this.type == penInfoEntity.type && this.colorIndex == penInfoEntity.colorIndex && this.widthIndex == penInfoEntity.widthIndex && OooOOO0.OooO0O0(this.colorList, penInfoEntity.colorList) && OooOOO0.OooO0O0(this.widthList, penInfoEntity.widthList) && OooOOO0.OooO0O0(this.noteId, penInfoEntity.noteId) && this.selected == penInfoEntity.selected && OooOOO0.OooO0O0(this.extra, penInfoEntity.extra);
    }

    public final int getColorIndex() {
        return this.colorIndex;
    }

    public final List<Integer> getColorList() {
        return this.colorList;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidthIndex() {
        return this.widthIndex;
    }

    public final List<Float> getWidthList() {
        return this.widthList;
    }

    public int hashCode() {
        return this.extra.hashCode() + o00000.OooO0O0(OooO00o.OooO0O0(C21445Oooo.OooO00o(this.widthList, C21445Oooo.OooO00o(this.colorList, C20785Oooo00o.OooO00o(this.widthIndex, C20785Oooo00o.OooO00o(this.colorIndex, C20785Oooo00o.OooO00o(this.type, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.noteId), 31, this.selected);
    }

    public String toString() {
        String str = this.id;
        int i = this.type;
        int i2 = this.colorIndex;
        int i3 = this.widthIndex;
        List<Integer> list = this.colorList;
        List<Float> list2 = this.widthList;
        String str2 = this.noteId;
        boolean z = this.selected;
        Bundle bundle = this.extra;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "PenInfoEntity(id=", str, ", type=", ", colorIndex=");
        C24472OooOoo.OooO0O0(sbOooO0OO, ", widthIndex=", ", colorList=", i2, i3);
        sbOooO0OO.append(list);
        sbOooO0OO.append(", widthList=");
        sbOooO0OO.append(list2);
        sbOooO0OO.append(", noteId=");
        sbOooO0OO.append(str2);
        sbOooO0OO.append(", selected=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", extra=");
        sbOooO0OO.append(bundle);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
