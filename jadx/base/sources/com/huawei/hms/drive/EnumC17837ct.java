package com.huawei.hms.drive;

/* JADX INFO: renamed from: com.huawei.hms.drive.ct */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC17837ct {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: l */
    public final int f53176l;

    EnumC17837ct(int i) {
        this.f53176l = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC17837ct m76526a(int i) {
        for (EnumC17837ct enumC17837ct : values()) {
            if (enumC17837ct.f53176l == i) {
                return enumC17837ct;
            }
        }
        return null;
    }
}
