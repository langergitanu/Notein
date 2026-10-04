package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.annotation.SharedPreference;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.g */
/* JADX INFO: loaded from: classes8.dex */
public class C17629g {

    /* JADX INFO: renamed from: a */
    private static final String f52163a = "AesComponent";

    /* JADX INFO: renamed from: b */
    private static final int f52164b = 32;

    @SharedPreference(fileName = "com.huawei.appgallery.datastore", key = "fish")
    String fish;

    @SharedPreference(fileName = "com.huawei.agconnect.internal", key = "jerry")
    String jerry;

    /* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C17629g f52165a = new C17629g();

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C17629g m75554a() {
        return a.f52165a;
    }

    /* JADX INFO: renamed from: a */
    private static String m75555a(String str, String str2, String str3) {
        return C17636n.m75584a(C17636n.m75583a(C17636n.m75584a(C17636n.m75583a(str, -4), str2), 6), str3);
    }

    /* JADX INFO: renamed from: a */
    public SecretKey m75557a(String str, int i) {
        if (TextUtils.isEmpty(this.jerry) || TextUtils.isEmpty(this.fish)) {
            C17630h.m75558a().m75567f(this);
            C17630h.m75558a().m75566e(this);
            if (m75556a(this.jerry) || m75556a(this.fish)) {
                this.jerry = C17636n.m75582a(32);
                this.fish = C17636n.m75582a(32);
                C17630h.m75558a().m75561b(this);
                C17630h.m75558a().m75563c(this);
            }
        }
        try {
            return C17636n.m75585a(m75555a(C17607ai.m75470d(), this.jerry, "767d9b01105c2acd25fb7955a5394f78"), this.fish, str, i);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Logger.m75327e(f52163a, "Exception when reading the 'T&J&C&F' for 'KeyManager'.");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m75556a(String str) {
        return TextUtils.isEmpty(str) || str.length() != 32;
    }
}
