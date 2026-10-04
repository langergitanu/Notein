package o0000OO0;

import android.os.Bundle;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: o0000OO0.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24196OoooO0O extends AbstractC24169OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f81447OooO00o;

    public C24196OoooO0O() {
        throw null;
    }

    public C24196OoooO0O(String str, Set set, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, true, set);
        this.f81447OooO00o = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
