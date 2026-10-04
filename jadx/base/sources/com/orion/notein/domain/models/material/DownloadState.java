package com.orion.notein.domain.models.material;

import OooO.OooO00o;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_DOWNLOADED", "QUEUED", "DOWNLOADING", "DOWNLOADED", MaterialPurchaseStatusResponse.STATUS_FAILED, "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DownloadState {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ DownloadState[] $VALUES;
    public static final DownloadState NOT_DOWNLOADED = new DownloadState("NOT_DOWNLOADED", 0);
    public static final DownloadState QUEUED = new DownloadState("QUEUED", 1);
    public static final DownloadState DOWNLOADING = new DownloadState("DOWNLOADING", 2);
    public static final DownloadState DOWNLOADED = new DownloadState("DOWNLOADED", 3);
    public static final DownloadState FAILED = new DownloadState(MaterialPurchaseStatusResponse.STATUS_FAILED, 4);

    private static final /* synthetic */ DownloadState[] $values() {
        return new DownloadState[]{NOT_DOWNLOADED, QUEUED, DOWNLOADING, DOWNLOADED, FAILED};
    }

    static {
        DownloadState[] downloadStateArr$values = $values();
        $VALUES = downloadStateArr$values;
        $ENTRIES = OooO00o.OooO0O0(downloadStateArr$values);
    }

    private DownloadState(String str, int i) {
    }

    public static InterfaceC34452OooO00o<DownloadState> getEntries() {
        return $ENTRIES;
    }

    public static DownloadState valueOf(String str) {
        return (DownloadState) Enum.valueOf(DownloadState.class, str);
    }

    public static DownloadState[] values() {
        return (DownloadState[]) $VALUES.clone();
    }
}
