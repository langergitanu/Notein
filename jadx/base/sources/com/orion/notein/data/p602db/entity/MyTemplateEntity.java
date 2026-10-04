package com.orion.notein.data.p602db.entity;

import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/MyTemplateEntity;", "", "id", "", "paperThemeJson", "paperSpecJson", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPaperThemeJson", "setPaperThemeJson", "(Ljava/lang/String;)V", "getPaperSpecJson", "setPaperSpecJson", "getCreationTime", "()J", "getLastModificationTime", "getName", "setName", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MyTemplateEntity {
    private final long creationTime;
    private final String id;
    private final long lastModificationTime;
    private String name;
    private String paperSpecJson;
    private String paperThemeJson;

    public MyTemplateEntity(String id, String str, String str2, long j, long j2, String str3) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.paperThemeJson = str;
        this.paperSpecJson = str2;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.name = str3;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPaperSpecJson() {
        return this.paperSpecJson;
    }

    public final String getPaperThemeJson() {
        return this.paperThemeJson;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPaperSpecJson(String str) {
        this.paperSpecJson = str;
    }

    public final void setPaperThemeJson(String str) {
        this.paperThemeJson = str;
    }

    public /* synthetic */ MyTemplateEntity(String str, String str2, String str3, long j, long j2, String str4, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, j, j2, (i & 32) != 0 ? null : str4);
    }
}
