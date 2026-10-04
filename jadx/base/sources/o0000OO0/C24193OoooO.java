package o0000OO0;

import android.os.Bundle;

/* JADX INFO: renamed from: o0000OO0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24193OoooO extends AbstractC24167OooO0oo {
    public C24193OoooO(String str, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }
}
