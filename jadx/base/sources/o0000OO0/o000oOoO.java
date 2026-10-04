package o0000OO0;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends AbstractC24167OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f81448OooO00o;

    public o000oOoO(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.f81448OooO00o = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
    }
}
