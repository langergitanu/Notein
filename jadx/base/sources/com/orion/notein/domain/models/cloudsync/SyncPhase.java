package com.orion.notein.domain.models.cloudsync;

import OooO.OooO00o;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPhase;", "", "<init>", "(Ljava/lang/String;I)V", "DIRTY_LOCAL", "DIRTY_CLOUD", "CLEAN", "CONFLICT", "RESOLVING_CONFLICT", "DOWNLOADING", "UPLOADING", "PACKAGING", "RESTORING", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SyncPhase {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ SyncPhase[] $VALUES;
    public static final SyncPhase DIRTY_LOCAL = new SyncPhase("DIRTY_LOCAL", 0);
    public static final SyncPhase DIRTY_CLOUD = new SyncPhase("DIRTY_CLOUD", 1);
    public static final SyncPhase CLEAN = new SyncPhase("CLEAN", 2);
    public static final SyncPhase CONFLICT = new SyncPhase("CONFLICT", 3);
    public static final SyncPhase RESOLVING_CONFLICT = new SyncPhase("RESOLVING_CONFLICT", 4);
    public static final SyncPhase DOWNLOADING = new SyncPhase("DOWNLOADING", 5);
    public static final SyncPhase UPLOADING = new SyncPhase("UPLOADING", 6);
    public static final SyncPhase PACKAGING = new SyncPhase("PACKAGING", 7);
    public static final SyncPhase RESTORING = new SyncPhase("RESTORING", 8);

    private static final /* synthetic */ SyncPhase[] $values() {
        return new SyncPhase[]{DIRTY_LOCAL, DIRTY_CLOUD, CLEAN, CONFLICT, RESOLVING_CONFLICT, DOWNLOADING, UPLOADING, PACKAGING, RESTORING};
    }

    static {
        SyncPhase[] syncPhaseArr$values = $values();
        $VALUES = syncPhaseArr$values;
        $ENTRIES = OooO00o.OooO0O0(syncPhaseArr$values);
    }

    private SyncPhase(String str, int i) {
    }

    public static InterfaceC34452OooO00o<SyncPhase> getEntries() {
        return $ENTRIES;
    }

    public static SyncPhase valueOf(String str) {
        return (SyncPhase) Enum.valueOf(SyncPhase.class, str);
    }

    public static SyncPhase[] values() {
        return (SyncPhase[]) $VALUES.clone();
    }
}
