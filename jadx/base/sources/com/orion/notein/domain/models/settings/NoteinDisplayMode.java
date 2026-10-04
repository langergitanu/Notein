package com.orion.notein.domain.models.settings;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/settings/NoteinDisplayMode;", "", "<init>", "()V", "FOLLOW_SYSTEM", "", "DAY", "NIGHT", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteinDisplayMode {
    public static final int DAY = 1;
    public static final int FOLLOW_SYSTEM = -1;
    public static final NoteinDisplayMode INSTANCE = new NoteinDisplayMode();
    public static final int NIGHT = 2;

    private NoteinDisplayMode() {
    }
}
