package com.orion.notein.domain.models.cloudsync;

import OooO.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "", "mime", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMime", "()Ljava/lang/String;", "NOTE", "FOLDER", "TEMPLATE", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudMetaType {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ CloudMetaType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String mime;
    public static final CloudMetaType NOTE = new CloudMetaType("NOTE", 0, CloudMime.NOTE);
    public static final CloudMetaType FOLDER = new CloudMetaType("FOLDER", 1, CloudMime.FOLDER);
    public static final CloudMetaType TEMPLATE = new CloudMetaType("TEMPLATE", 2, CloudMime.TEMPLATE);

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudMetaType$Companion;", "", "<init>", "()V", "fromMime", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "mime", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CloudMetaType fromMime(String mime) {
            OooOOO0.OooO0oO(mime, "mime");
            for (CloudMetaType cloudMetaType : CloudMetaType.values()) {
                if (OooOOO0.OooO0O0(cloudMetaType.getMime(), mime)) {
                    return cloudMetaType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CloudMetaType[] $values() {
        return new CloudMetaType[]{NOTE, FOLDER, TEMPLATE};
    }

    static {
        CloudMetaType[] cloudMetaTypeArr$values = $values();
        $VALUES = cloudMetaTypeArr$values;
        $ENTRIES = OooO00o.OooO0O0(cloudMetaTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private CloudMetaType(String str, int i, String str2) {
        this.mime = str2;
    }

    public static InterfaceC34452OooO00o<CloudMetaType> getEntries() {
        return $ENTRIES;
    }

    public static CloudMetaType valueOf(String str) {
        return (CloudMetaType) Enum.valueOf(CloudMetaType.class, str);
    }

    public static CloudMetaType[] values() {
        return (CloudMetaType[]) $VALUES.clone();
    }

    public final String getMime() {
        return this.mime;
    }
}
