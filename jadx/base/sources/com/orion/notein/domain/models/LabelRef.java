package com.orion.notein.domain.models;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JE\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u0006-"}, m80612d2 = {"Lcom/orion/notein/domain/models/LabelRef;", "", "labelId", "", "itemType", "Lcom/orion/notein/domain/models/LabelType;", "itemId", "", "extraInfo", "createdTime", "modifiedTime", "<init>", "(JLcom/orion/notein/domain/models/LabelType;Ljava/lang/String;Ljava/lang/String;JJ)V", "()V", "getLabelId", "()J", "setLabelId", "(J)V", "getItemType", "()Lcom/orion/notein/domain/models/LabelType;", "setItemType", "(Lcom/orion/notein/domain/models/LabelType;)V", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getExtraInfo", "setExtraInfo", "getCreatedTime", "setCreatedTime", "getModifiedTime", "setModifiedTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LabelRef {
    private long createdTime;
    private String extraInfo;
    private String itemId;
    private LabelType itemType;
    private long labelId;
    private long modifiedTime;

    public LabelRef(long j, LabelType itemType, String itemId, String extraInfo, long j2, long j3) {
        OooOOO0.OooO0oO(itemType, "itemType");
        OooOOO0.OooO0oO(itemId, "itemId");
        OooOOO0.OooO0oO(extraInfo, "extraInfo");
        this.labelId = j;
        this.itemType = itemType;
        this.itemId = itemId;
        this.extraInfo = extraInfo;
        this.createdTime = j2;
        this.modifiedTime = j3;
    }

    public static /* synthetic */ LabelRef copy$default(LabelRef labelRef, long j, LabelType labelType, String str, String str2, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = labelRef.labelId;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            labelType = labelRef.itemType;
        }
        LabelType labelType2 = labelType;
        if ((i & 4) != 0) {
            str = labelRef.itemId;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = labelRef.extraInfo;
        }
        return labelRef.copy(j4, labelType2, str3, str2, (i & 16) != 0 ? labelRef.createdTime : j2, (i & 32) != 0 ? labelRef.modifiedTime : j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLabelId() {
        return this.labelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LabelType getItemType() {
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

    public final LabelRef copy(long labelId, LabelType itemType, String itemId, String extraInfo, long createdTime, long modifiedTime) {
        OooOOO0.OooO0oO(itemType, "itemType");
        OooOOO0.OooO0oO(itemId, "itemId");
        OooOOO0.OooO0oO(extraInfo, "extraInfo");
        return new LabelRef(labelId, itemType, itemId, extraInfo, createdTime, modifiedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelRef)) {
            return false;
        }
        LabelRef labelRef = (LabelRef) other;
        return this.labelId == labelRef.labelId && this.itemType == labelRef.itemType && OooOOO0.OooO0O0(this.itemId, labelRef.itemId) && OooOOO0.OooO0O0(this.extraInfo, labelRef.extraInfo) && this.createdTime == labelRef.createdTime && this.modifiedTime == labelRef.modifiedTime;
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

    public final LabelType getItemType() {
        return this.itemType;
    }

    public final long getLabelId() {
        return this.labelId;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public int hashCode() {
        return Long.hashCode(this.modifiedTime) + C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0((this.itemType.hashCode() + (Long.hashCode(this.labelId) * 31)) * 31, 31, this.itemId), 31, this.extraInfo), 31, this.createdTime);
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

    public final void setItemType(LabelType labelType) {
        OooOOO0.OooO0oO(labelType, "<set-?>");
        this.itemType = labelType;
    }

    public final void setLabelId(long j) {
        this.labelId = j;
    }

    public final void setModifiedTime(long j) {
        this.modifiedTime = j;
    }

    public String toString() {
        long j = this.labelId;
        LabelType labelType = this.itemType;
        String str = this.itemId;
        String str2 = this.extraInfo;
        long j2 = this.createdTime;
        long j3 = this.modifiedTime;
        StringBuilder sb = new StringBuilder("LabelRef(labelId=");
        sb.append(j);
        sb.append(", itemType=");
        sb.append(labelType);
        OooO0OO.OooO0o0(sb, ", itemId=", str, ", extraInfo=", str2);
        C22205OooOOo.OooO0OO(j2, ", createdTime=", ", modifiedTime=", sb);
        return android.support.v4.media.session.OooO00o.OooO00o(j3, ")", sb);
    }

    public /* synthetic */ LabelRef(long j, LabelType labelType, String str, String str2, long j2, long j3, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? LabelType.NOTE : labelType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? 0L : j3);
    }

    public LabelRef() {
        this(0L, LabelType.NOTE, "", "", 0L, 0L);
    }
}
