package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.huawei.agconnect.config.IDecrypt;
import com.huawei.hms.network.embedded.C18374u4;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.h */
/* JADX INFO: loaded from: classes8.dex */
public class C17583h implements AesDecrypt {

    /* JADX INFO: renamed from: a */
    private final Context f52019a;

    /* JADX INFO: renamed from: b */
    private final String f52020b;

    /* JADX INFO: renamed from: c */
    private IDecrypt f52021c;

    public C17583h(Context context, String str) {
        Log.d("AGC_FlexibleDecrypt", C18374u4.f56270c);
        this.f52019a = context;
        this.f52020b = str;
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public String decrypt(String str, String str2) {
        if (this.f52021c == null) {
            this.f52021c = decryptComponent();
        }
        if (this.f52021c == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            this.f52021c = new C17582g(this.f52019a, this.f52020b).decryptComponent();
        }
        return this.f52021c.decrypt(C17587l.m75381a(this.f52019a, this.f52020b, "agc_plugin_", str), str2);
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public IDecrypt decryptComponent() {
        String strM75381a = C17587l.m75381a(this.f52019a, this.f52020b, "agc_plugin_", "crypto_component");
        if (strM75381a == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Hex.decodeHexString(strM75381a), "utf-8"));
            return new C17581f(new C17579d(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e.getMessage());
            return null;
        }
    }
}
