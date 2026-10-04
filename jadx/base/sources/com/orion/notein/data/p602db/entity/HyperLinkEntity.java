package com.orion.notein.data.p602db.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%¨\u0006-"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/HyperLinkEntity;", "", "id", "", "boundsJson", "pageId", C18437z2.f56754h, "", FirebaseAnalytics.Param.DESTINATION, "extras", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "left", "", "top", "right", "bottom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getId", "()Ljava/lang/String;", "getBoundsJson", "setBoundsJson", "(Ljava/lang/String;)V", "getPageId", "getType", "()I", "getDestination", "getExtras", "setExtras", "getCreationTime", "()J", "getLastModificationTime", "getLeft", "()Ljava/lang/Float;", "setLeft", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class HyperLinkEntity {
    private Float bottom;
    private String boundsJson;
    private final long creationTime;
    private final String destination;
    private String extras;
    private final String id;
    private final long lastModificationTime;
    private Float left;
    private final String pageId;
    private Float right;
    private Float top;
    private final int type;

    public HyperLinkEntity(String id, String str, String pageId, int i, String destination, String str2, long j, long j2, Float f, Float f2, Float f3, Float f4) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(destination, "destination");
        this.id = id;
        this.boundsJson = str;
        this.pageId = pageId;
        this.type = i;
        this.destination = destination;
        this.extras = str2;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
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

    public final String getDestination() {
        return this.destination;
    }

    public final String getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
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

    public final Float getTop() {
        return this.top;
    }

    public final int getType() {
        return this.type;
    }

    public final void setBottom(Float f) {
        this.bottom = f;
    }

    public final void setBoundsJson(String str) {
        this.boundsJson = str;
    }

    public final void setExtras(String str) {
        this.extras = str;
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

    public /* synthetic */ HyperLinkEntity(String str, String str2, String str3, int i, String str4, String str5, long j, long j2, Float f, Float f2, Float f3, Float f4, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, (i2 & 2) != 0 ? null : str2, str3, i, str4, (i2 & 32) != 0 ? null : str5, j, j2, (i2 & 256) != 0 ? null : f, (i2 & 512) != 0 ? null : f2, (i2 & 1024) != 0 ? null : f3, (i2 & 2048) != 0 ? null : f4);
    }
}
