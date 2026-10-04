package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18392v9 extends AbstractC18202h8 {

    /* JADX INFO: renamed from: b */
    public final String f56485b;

    /* JADX INFO: renamed from: c */
    public final long f56486c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC18289nb f56487d;

    public C18392v9(String str, long j, InterfaceC18289nb interfaceC18289nb) {
        this.f56485b = str;
        this.f56486c = j;
        this.f56487d = interfaceC18289nb;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18202h8
    /* JADX INFO: renamed from: v */
    public long mo78124v() {
        return this.f56486c;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18202h8
    /* JADX INFO: renamed from: w */
    public C18442z7 mo78125w() {
        String str = this.f56485b;
        if (str != null) {
            return C18442z7.m80034b(str);
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18202h8
    /* JADX INFO: renamed from: x */
    public InterfaceC18289nb mo78126x() {
        return this.f56487d;
    }
}
