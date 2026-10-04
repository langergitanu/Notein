package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ba */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC18120ba {
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


    /* JADX INFO: renamed from: a */
    public final int f54329a;

    EnumC18120ba(int i) {
        this.f54329a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC18120ba m78016a(int i) {
        for (EnumC18120ba enumC18120ba : values()) {
            if (enumC18120ba.f54329a == i) {
                return enumC18120ba;
            }
        }
        return null;
    }
}
