package com.orion.notein.data.p602db.entity;

import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\"\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R\"\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b/\u0010'\"\u0004\b0\u0010)R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u00063"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/ImageEntity;", "", "id", "", "uri", "layer", "", "layerId", "boundsJson", "rotation", "", "pageId", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "left", "top", "right", "bottom", "fixed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FLjava/lang/String;JJLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Z)V", "getId", "()Ljava/lang/String;", "getUri", "getLayer", "()I", "getLayerId", "getBoundsJson", "setBoundsJson", "(Ljava/lang/String;)V", "getRotation", "()F", "getPageId", "getCreationTime", "()J", "getLastModificationTime", "getLeft", "()Ljava/lang/Float;", "setLeft", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "getFixed", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImageEntity {
    private Float bottom;
    private String boundsJson;
    private final long creationTime;
    private final boolean fixed;
    private final String id;
    private final long lastModificationTime;
    private final int layer;
    private final String layerId;
    private Float left;
    private final String pageId;
    private Float right;
    private final float rotation;
    private Float top;
    private final String uri;

    public ImageEntity(String id, String uri, int i, String layerId, String str, float f, String pageId, long j, long j2, Float f2, Float f3, Float f4, Float f5, boolean z) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(layerId, "layerId");
        OooOOO0.OooO0oO(pageId, "pageId");
        this.id = id;
        this.uri = uri;
        this.layer = i;
        this.layerId = layerId;
        this.boundsJson = str;
        this.rotation = f;
        this.pageId = pageId;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
        this.fixed = z;
    }

    public final Float getBottom() {
        return this.bottom;
    }

    public final String getBoundsJson() {
        return this.boundsJson;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getFixed() {
        return this.fixed;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final int getLayer() {
        return this.layer;
    }

    public final String getLayerId() {
        return this.layerId;
    }

    public final Float getLeft() {
        return this.left;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final Float getRight() {
        return this.right;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final Float getTop() {
        return this.top;
    }

    public final String getUri() {
        return this.uri;
    }

    public final void setBottom(Float f) {
        this.bottom = f;
    }

    public final void setBoundsJson(String str) {
        this.boundsJson = str;
    }

    public final void setLeft(Float f) {
        this.left = f;
    }

    public final void setRight(Float f) {
        this.right = f;
    }

    public final void setTop(Float f) {
        this.top = f;
    }

    public /* synthetic */ ImageEntity(String str, String str2, int i, String str3, String str4, float f, String str5, long j, long j2, Float f2, Float f3, Float f4, Float f5, boolean z, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? null : str4, f, str5, j, j2, (i2 & 512) != 0 ? null : f2, (i2 & 1024) != 0 ? null : f3, (i2 & 2048) != 0 ? null : f4, (i2 & 4096) != 0 ? null : f5, (i2 & 8192) != 0 ? false : z);
    }
}
