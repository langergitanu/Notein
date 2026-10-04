package com.microsoft.identity.common.internal.fido;

import com.huawei.hms.network.embedded.C18437z2;
import o0oo0o00.InterfaceC31297OooOO0O;

/* JADX INFO: loaded from: classes9.dex */
public class PublicKeyCredentialDescriptor {

    /* JADX INFO: renamed from: id */
    @InterfaceC31297OooOO0O(name = "id")
    public final String f57066id;

    @InterfaceC31297OooOO0O(name = C18437z2.f56754h)
    public final String type;

    public PublicKeyCredentialDescriptor(String str, String str2) {
        this.type = str;
        this.f57066id = str2;
    }

    public String getId() {
        return this.f57066id;
    }

    public String getType() {
        return this.type;
    }
}
