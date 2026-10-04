package com.microsoft.identity.common.java.util;

import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public interface IClockSkewManager {
    Date getAdjustedReferenceTime();

    Date getCurrentClientTime();

    long getSkewMillis();

    void onTimestampReceived(long j);

    Date toClientTime(long j);

    Date toReferenceTime(long j);
}
