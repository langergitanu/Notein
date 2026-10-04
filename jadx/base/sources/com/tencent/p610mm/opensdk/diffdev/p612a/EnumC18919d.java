package com.tencent.p610mm.opensdk.diffdev.p612a;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.d */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC18919d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);


    /* JADX INFO: renamed from: a */
    private int f58123a;

    EnumC18919d(int i) {
        this.f58123a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m80577a() {
        return this.f58123a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f58123a;
    }
}
