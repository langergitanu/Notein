package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.huawei.agconnect.config.IDecrypt;
import com.huawei.hms.network.embedded.C18374u4;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.g */
/* JADX INFO: loaded from: classes8.dex */
public class C17582g implements AesDecrypt {

    /* JADX INFO: renamed from: a */
    private final Context f52016a;

    /* JADX INFO: renamed from: b */
    private final String f52017b;

    /* JADX INFO: renamed from: c */
    private IDecrypt f52018c;

    public C17582g(Context context, String str) {
        Log.d("AGC_FixedDecrypt", C18374u4.f56270c);
        this.f52016a = context;
        this.f52017b = str;
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public String decrypt(String str, String str2) {
        if (this.f52018c == null) {
            this.f52018c = decryptComponent();
        }
        return this.f52018c.decrypt(C17587l.m75381a(this.f52016a, this.f52017b, "agc_", str), str2);
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public IDecrypt decryptComponent() {
        return new C17581f(new C17579d(C17587l.m75381a(this.f52016a, this.f52017b, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), C17587l.m75381a(this.f52016a, this.f52017b, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), C17587l.m75381a(this.f52016a, this.f52017b, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), C17587l.m75381a(this.f52016a, this.f52017b, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
    }
}
