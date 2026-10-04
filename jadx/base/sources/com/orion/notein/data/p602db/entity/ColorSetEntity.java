package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/ColorSetEntity;", "", "id", "", "name", "colors", "", "", "backgroundColor", "foregroundColor", C18437z2.f56754h, C17625c.f52155b, "", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIJI)V", "getId", "()Ljava/lang/String;", "getName", "getColors", "()Ljava/util/List;", "getBackgroundColor", "()I", "getForegroundColor", "getType", "getCreationTime", "()J", "getCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ColorSetEntity {
    private final int backgroundColor;
    private final int category;
    private final List<Integer> colors;
    private final long creationTime;
    private final int foregroundColor;
    private final String id;
    private final String name;
    private final int type;

    public ColorSetEntity(String id, String name, List<Integer> colors, int i, int i2, int i3, long j, int i4) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(colors, "colors");
        this.id = id;
        this.name = name;
        this.colors = colors;
        this.backgroundColor = i;
        this.foregroundColor = i2;
        this.type = i3;
        this.creationTime = j;
        this.category = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorSetEntity copy$default(ColorSetEntity colorSetEntity, String str, String str2, List list, int i, int i2, int i3, long j, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = colorSetEntity.id;
        }
        if ((i5 & 2) != 0) {
            str2 = colorSetEntity.name;
        }
        if ((i5 & 4) != 0) {
            list = colorSetEntity.colors;
        }
        if ((i5 & 8) != 0) {
            i = colorSetEntity.backgroundColor;
        }
        if ((i5 & 16) != 0) {
            i2 = colorSetEntity.foregroundColor;
        }
        if ((i5 & 32) != 0) {
            i3 = colorSetEntity.type;
        }
        if ((i5 & 64) != 0) {
            j = colorSetEntity.creationTime;
        }
        if ((i5 & 128) != 0) {
            i4 = colorSetEntity.category;
        }
        int i6 = i4;
        long j2 = j;
        int i7 = i2;
        int i8 = i3;
        return colorSetEntity.copy(str, str2, list, i, i7, i8, j2, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Integer> component3() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getForegroundColor() {
        return this.foregroundColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    public final ColorSetEntity copy(String id, String name, List<Integer> colors, int backgroundColor, int foregroundColor, int type, long creationTime, int category) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(colors, "colors");
        return new ColorSetEntity(id, name, colors, backgroundColor, foregroundColor, type, creationTime, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorSetEntity)) {
            return false;
        }
        ColorSetEntity colorSetEntity = (ColorSetEntity) other;
        return OooOOO0.OooO0O0(this.id, colorSetEntity.id) && OooOOO0.OooO0O0(this.name, colorSetEntity.name) && OooOOO0.OooO0O0(this.colors, colorSetEntity.colors) && this.backgroundColor == colorSetEntity.backgroundColor && this.foregroundColor == colorSetEntity.foregroundColor && this.type == colorSetEntity.type && this.creationTime == colorSetEntity.creationTime && this.category == colorSetEntity.category;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCategory() {
        return this.category;
    }

    public final List<Integer> getColors() {
        return this.colors;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final int getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.category) + C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.type, C20785Oooo00o.OooO00o(this.foregroundColor, C20785Oooo00o.OooO00o(this.backgroundColor, C21445Oooo.OooO00o(this.colors, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.name), 31), 31), 31), 31), 31, this.creationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        List<Integer> list = this.colors;
        int i = this.backgroundColor;
        int i2 = this.foregroundColor;
        int i3 = this.type;
        long j = this.creationTime;
        int i4 = this.category;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("ColorSetEntity(id=", str, ", name=", str2, ", colors=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", backgroundColor=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", foregroundColor=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", type=", ", creationTime=", i2, i3);
        sbOooO0O0.append(j);
        sbOooO0O0.append(", category=");
        sbOooO0O0.append(i4);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ ColorSetEntity(String str, String str2, List list, int i, int i2, int i3, long j, int i4, int i5, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, list, i, i2, i3, j, (i5 & 128) != 0 ? 0 : i4);
    }
}
