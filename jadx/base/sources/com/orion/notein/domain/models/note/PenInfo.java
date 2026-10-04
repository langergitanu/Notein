package com.orion.notein.domain.models.note;

import OooOo.C20485OooOoO;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.os.Bundle;
import androidx.core.internal.view.SupportMenu;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010!\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020\u000bJ\u0010\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0000J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0003H\u0002J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003Jq\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00102\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00066"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/PenInfo;", "", "id", "", C18437z2.f56754h, "", "colorIndex", "widthIndex", "colorList", "", "widthList", "", NoteMeta.PROPERTY_NOTE_ID, "selected", "", "extra", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;IIILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLandroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "getType", "()I", "getColorIndex", "getWidthIndex", "getColorList", "()Ljava/util/List;", "getWidthList", "getNoteId", "getSelected", "()Z", "getExtra", "()Landroid/os/Bundle;", "getColor", "getWidth", "hasSamePenSettings", "other", "compactGetFloatFromBundle", "bundle", "key", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PenInfo {
    public static final int DEFAULT_LASER_DISAPPEAR_DURATION = 3;
    public static final String LASER_DISAPPEAR_DURATION = "disappear_duration";
    private final int colorIndex;
    private final List<Integer> colorList;
    private final Bundle extra;
    private final String id;
    private final String noteId;
    private final boolean selected;
    private final int type;
    private final int widthIndex;
    private final List<Float> widthList;

    public PenInfo(String id, int i, int i2, int i3, List<Integer> colorList, List<Float> widthList, String str, boolean z, Bundle extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(colorList, "colorList");
        OooOOO0.OooO0oO(widthList, "widthList");
        OooOOO0.OooO0oO(extra, "extra");
        this.id = id;
        this.type = i;
        this.colorIndex = i2;
        this.widthIndex = i3;
        this.colorList = colorList;
        this.widthList = widthList;
        this.noteId = str;
        this.selected = z;
        this.extra = extra;
    }

    private final float compactGetFloatFromBundle(Bundle bundle, String key) {
        double d = bundle.getDouble(key, 0.0d);
        return Math.abs(d) < 1.0E-7d ? bundle.getFloat(key, 0.0f) : (float) d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PenInfo copy$default(PenInfo penInfo, String str, int i, int i2, int i3, List list, List list2, String str2, boolean z, Bundle bundle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = penInfo.id;
        }
        if ((i4 & 2) != 0) {
            i = penInfo.type;
        }
        if ((i4 & 4) != 0) {
            i2 = penInfo.colorIndex;
        }
        if ((i4 & 8) != 0) {
            i3 = penInfo.widthIndex;
        }
        if ((i4 & 16) != 0) {
            list = penInfo.colorList;
        }
        if ((i4 & 32) != 0) {
            list2 = penInfo.widthList;
        }
        if ((i4 & 64) != 0) {
            str2 = penInfo.noteId;
        }
        if ((i4 & 128) != 0) {
            z = penInfo.selected;
        }
        if ((i4 & 256) != 0) {
            bundle = penInfo.extra;
        }
        boolean z2 = z;
        Bundle bundle2 = bundle;
        List list3 = list2;
        String str3 = str2;
        List list4 = list;
        int i5 = i2;
        return penInfo.copy(str, i, i5, i3, list4, list3, str3, z2, bundle2);
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

    public final PenInfo copy(String id, int type, int colorIndex, int widthIndex, List<Integer> colorList, List<Float> widthList, String noteId, boolean selected, Bundle extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(colorList, "colorList");
        OooOOO0.OooO0oO(widthList, "widthList");
        OooOOO0.OooO0oO(extra, "extra");
        return new PenInfo(id, type, colorIndex, widthIndex, colorList, widthList, noteId, selected, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenInfo)) {
            return false;
        }
        PenInfo penInfo = (PenInfo) other;
        return OooOOO0.OooO0O0(this.id, penInfo.id) && this.type == penInfo.type && this.colorIndex == penInfo.colorIndex && this.widthIndex == penInfo.widthIndex && OooOOO0.OooO0O0(this.colorList, penInfo.colorList) && OooOOO0.OooO0O0(this.widthList, penInfo.widthList) && OooOOO0.OooO0O0(this.noteId, penInfo.noteId) && this.selected == penInfo.selected && OooOOO0.OooO0O0(this.extra, penInfo.extra);
    }

    public final int getColor() {
        Integer num = (Integer) OooOo.OoooO00(this.colorIndex, this.colorList);
        return num != null ? num.intValue() : SupportMenu.CATEGORY_MASK;
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

    public final float getWidth() {
        Float f = (Float) OooOo.OoooO00(this.widthIndex, this.widthList);
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final int getWidthIndex() {
        return this.widthIndex;
    }

    public final List<Float> getWidthList() {
        return this.widthList;
    }

    public final boolean hasSamePenSettings(PenInfo other) {
        if (other != null && this.type == other.type && getColor() == other.getColor() && getWidth() == other.getWidth()) {
            int i = this.type;
            if (i != 0) {
                return i != 11 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? i != 8 ? i != 9 || OooOOO0.OooO0O0(this.extra.getString("straight_line"), other.extra.getString("straight_line")) : OooOOO0.OooO0O0(this.extra.getString(C18437z2.f56754h), other.extra.getString(C18437z2.f56754h)) : OooOOO0.OooO0O0(this.extra.getString(C18437z2.f56754h), other.extra.getString(C18437z2.f56754h)) && ((int) this.extra.getDouble(LASER_DISAPPEAR_DURATION, 3.0d)) == ((int) other.extra.getDouble(LASER_DISAPPEAR_DURATION, 3.0d)) : OooOOO0.OooO0O0(this.extra.getString(C18437z2.f56754h), other.extra.getString(C18437z2.f56754h)) && OooOOO0.OooO0O0(this.extra.getString("filter"), other.extra.getString("filter")) : OooOOO0.OooO0O0(this.extra.getString(C18437z2.f56754h), other.extra.getString(C18437z2.f56754h)) : OooOOO0.OooO0O0(this.extra.getString("straight_line"), other.extra.getString("straight_line")) : OooOOO0.OooO0O0(this.extra.getString("draw_line_directly"), other.extra.getString("draw_line_directly"));
            }
            if (Math.abs(compactGetFloatFromBundle(this.extra, "pressure_correct") - compactGetFloatFromBundle(other.extra, "pressure_correct")) < 1.0E-5d && Math.abs(compactGetFloatFromBundle(this.extra, "speed_correct") - compactGetFloatFromBundle(other.extra, "speed_correct")) < 1.0E-5d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iOooO00o = C21445Oooo.OooO00o(this.widthList, C21445Oooo.OooO00o(this.colorList, C20785Oooo00o.OooO00o(this.widthIndex, C20785Oooo00o.OooO00o(this.colorIndex, C20785Oooo00o.OooO00o(this.type, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.noteId;
        return this.extra.hashCode() + o00000.OooO0O0((iOooO00o + (str == null ? 0 : str.hashCode())) * 31, 31, this.selected);
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
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "PenInfo(id=", str, ", type=", ", colorIndex=");
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

    public /* synthetic */ PenInfo(String str, int i, int i2, int i3, List list, List list2, String str2, boolean z, Bundle bundle, int i4, C24018OooO0oo c24018OooO0oo) {
        this(str, i, i2, i3, list, list2, (i4 & 64) != 0 ? null : str2, z, bundle);
    }
}
