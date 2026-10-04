package com.orion.notein.domain.mapper;

import com.huawei.cloud.base.util.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public class DateTimeMapper {
    public DateTime toDateTime(Long l) {
        return new DateTime(l.longValue());
    }

    public Long toTimeInMills(DateTime dateTime) {
        if (dateTime == null) {
            return 0L;
        }
        return Long.valueOf(dateTime.getValue());
    }

    public Long toTimeInMillsFromGoogleDateTime(com.google.api.client.util.DateTime dateTime) {
        if (dateTime == null) {
            return 0L;
        }
        return Long.valueOf(dateTime.getValue());
    }
}
