package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import Oooo00o.OooO0OO;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB\t\b\u0016¢\u0006\u0004\b\f\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003JE\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006/"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/LabelEntity;", "", "id", "", "name", "", "color", "", "createdTime", "modifiedTime", FirebaseAnalytics.Param.INDEX, "", "<init>", "(JLjava/lang/String;IJJF)V", "()V", "getId", "()J", "setId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getColor", "()I", "setColor", "(I)V", "getCreatedTime", "setCreatedTime", "getModifiedTime", "setModifiedTime", "getIndex", "()F", "setIndex", "(F)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LabelEntity {
    private int color;
    private long createdTime;
    private long id;
    private float index;
    private long modifiedTime;
    private String name;

    public LabelEntity(long j, String name, int i, long j2, long j3, float f) {
        OooOOO0.OooO0oO(name, "name");
        this.id = j;
        this.name = name;
        this.color = i;
        this.createdTime = j2;
        this.modifiedTime = j3;
        this.index = f;
    }

    public static /* synthetic */ LabelEntity copy$default(LabelEntity labelEntity, long j, String str, int i, long j2, long j3, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = labelEntity.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            str = labelEntity.name;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i = labelEntity.color;
        }
        return labelEntity.copy(j4, str2, i, (i2 & 8) != 0 ? labelEntity.createdTime : j2, (i2 & 16) != 0 ? labelEntity.modifiedTime : j3, (i2 & 32) != 0 ? labelEntity.index : f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getIndex() {
        return this.index;
    }

    public final LabelEntity copy(long id, String name, int color, long createdTime, long modifiedTime, float index) {
        OooOOO0.OooO0oO(name, "name");
        return new LabelEntity(id, name, color, createdTime, modifiedTime, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelEntity)) {
            return false;
        }
        LabelEntity labelEntity = (LabelEntity) other;
        return this.id == labelEntity.id && OooOOO0.OooO0O0(this.name, labelEntity.name) && this.color == labelEntity.color && this.createdTime == labelEntity.createdTime && this.modifiedTime == labelEntity.modifiedTime && Float.compare(this.index, labelEntity.index) == 0;
    }

    public final int getColor() {
        return this.color;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final long getId() {
        return this.id;
    }

    public final float getIndex() {
        return this.index;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Float.hashCode(this.index) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.color, OooO00o.OooO0O0(Long.hashCode(this.id) * 31, 31, this.name), 31), 31, this.createdTime), 31, this.modifiedTime);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setCreatedTime(long j) {
        this.createdTime = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setIndex(float f) {
        this.index = f;
    }

    public final void setModifiedTime(long j) {
        this.modifiedTime = j;
    }

    public final void setName(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        long j = this.id;
        String str = this.name;
        int i = this.color;
        long j2 = this.createdTime;
        long j3 = this.modifiedTime;
        float f = this.index;
        StringBuilder sb = new StringBuilder("LabelEntity(id=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        sb.append(", color=");
        sb.append(i);
        sb.append(", createdTime=");
        sb.append(j2);
        C22205OooOOo.OooO0OO(j3, ", modifiedTime=", ", index=", sb);
        return OooO0OO.OooO0OO(sb, f, ")");
    }

    public /* synthetic */ LabelEntity(long j, String str, int i, long j2, long j3, float f, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0L : j3, (i2 & 32) != 0 ? 1000.0f : f);
    }

    public LabelEntity() {
        this(0L, "", 0, 0L, 0L, 1000.0f);
    }
}
