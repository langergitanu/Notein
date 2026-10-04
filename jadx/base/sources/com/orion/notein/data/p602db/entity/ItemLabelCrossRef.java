package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JE\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/ItemLabelCrossRef;", "", "labelId", "", "itemType", "", "itemId", "", "extraInfo", "createdTime", "modifiedTime", "<init>", "(JILjava/lang/String;Ljava/lang/String;JJ)V", "()V", "getLabelId", "()J", "setLabelId", "(J)V", "getItemType", "()I", "setItemType", "(I)V", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getExtraInfo", "setExtraInfo", "getCreatedTime", "setCreatedTime", "getModifiedTime", "setModifiedTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ItemLabelCrossRef {
    private long createdTime;
    private String extraInfo;
    private String itemId;
    private int itemType;
    private long labelId;
    private long modifiedTime;

    public ItemLabelCrossRef(long j, int i, String itemId, String extraInfo, long j2, long j3) {
        OooOOO0.OooO0oO(itemId, "itemId");
        OooOOO0.OooO0oO(extraInfo, "extraInfo");
        this.labelId = j;
        this.itemType = i;
        this.itemId = itemId;
        this.extraInfo = extraInfo;
        this.createdTime = j2;
        this.modifiedTime = j3;
    }

    public static /* synthetic */ ItemLabelCrossRef copy$default(ItemLabelCrossRef itemLabelCrossRef, long j, int i, String str, String str2, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = itemLabelCrossRef.labelId;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            i = itemLabelCrossRef.itemType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = itemLabelCrossRef.itemId;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = itemLabelCrossRef.extraInfo;
        }
        return itemLabelCrossRef.copy(j4, i3, str3, str2, (i2 & 16) != 0 ? itemLabelCrossRef.createdTime : j2, (i2 & 32) != 0 ? itemLabelCrossRef.modifiedTime : j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLabelId() {
        return this.labelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final ItemLabelCrossRef copy(long labelId, int itemType, String itemId, String extraInfo, long createdTime, long modifiedTime) {
        OooOOO0.OooO0oO(itemId, "itemId");
        OooOOO0.OooO0oO(extraInfo, "extraInfo");
        return new ItemLabelCrossRef(labelId, itemType, itemId, extraInfo, createdTime, modifiedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemLabelCrossRef)) {
            return false;
        }
        ItemLabelCrossRef itemLabelCrossRef = (ItemLabelCrossRef) other;
        return this.labelId == itemLabelCrossRef.labelId && this.itemType == itemLabelCrossRef.itemType && OooOOO0.OooO0O0(this.itemId, itemLabelCrossRef.itemId) && OooOOO0.OooO0O0(this.extraInfo, itemLabelCrossRef.extraInfo) && this.createdTime == itemLabelCrossRef.createdTime && this.modifiedTime == itemLabelCrossRef.modifiedTime;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final long getLabelId() {
        return this.labelId;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public int hashCode() {
        return Long.hashCode(this.modifiedTime) + C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.itemType, Long.hashCode(this.labelId) * 31, 31), 31, this.itemId), 31, this.extraInfo), 31, this.createdTime);
    }

    public final void setCreatedTime(long j) {
        this.createdTime = j;
    }

    public final void setExtraInfo(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.extraInfo = str;
    }

    public final void setItemId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.itemId = str;
    }

    public final void setItemType(int i) {
        this.itemType = i;
    }

    public final void setLabelId(long j) {
        this.labelId = j;
    }

    public final void setModifiedTime(long j) {
        this.modifiedTime = j;
    }

    public String toString() {
        long j = this.labelId;
        int i = this.itemType;
        String str = this.itemId;
        String str2 = this.extraInfo;
        long j2 = this.createdTime;
        long j3 = this.modifiedTime;
        StringBuilder sb = new StringBuilder("ItemLabelCrossRef(labelId=");
        sb.append(j);
        sb.append(", itemType=");
        sb.append(i);
        OooO0OO.OooO0o0(sb, ", itemId=", str, ", extraInfo=", str2);
        C22205OooOOo.OooO0OO(j2, ", createdTime=", ", modifiedTime=", sb);
        return android.support.v4.media.session.OooO00o.OooO00o(j3, ")", sb);
    }

    public /* synthetic */ ItemLabelCrossRef(long j, int i, String str, String str2, long j2, long j3, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? 0L : j3);
    }

    public ItemLabelCrossRef() {
        this(0L, 0, "", "", 0L, 0L);
    }
}
