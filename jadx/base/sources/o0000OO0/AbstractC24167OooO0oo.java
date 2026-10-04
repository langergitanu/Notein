package o0000OO0;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import o0000Oo0.C24223OooO00o;

/* JADX INFO: renamed from: o0000OO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m80612d2 = {"Lo0000OO0/OooO0oo;", "", "", C18437z2.f56754h, "Landroid/os/Bundle;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getData", "()Landroid/os/Bundle;", "Companion", "OooO00o", "credentials_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class AbstractC24167OooO0oo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Bundle data;
    private final String type;

    /* JADX INFO: renamed from: o0000OO0.OooO0oo$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        public static AbstractC24167OooO0oo OooO00o(String type, Bundle data) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
            kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
            try {
                if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    try {
                        String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                        String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(string2);
                        return new C24193OoooO(string2, data);
                    } catch (Exception unused) {
                        throw new C24223OooO00o();
                    }
                }
                if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new C24223OooO00o();
                }
                try {
                    String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string3);
                    return new o000oOoO(string3, data);
                } catch (Exception unused2) {
                    throw new C24223OooO00o();
                }
            } catch (C24223OooO00o unused3) {
                return new C24191Oooo0oO(type, data);
            }
            return new C24191Oooo0oO(type, data);
        }
    }

    public AbstractC24167OooO0oo(String type, Bundle data) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        this.type = type;
        this.data = data;
    }

    public static final AbstractC24167OooO0oo createFrom(String str, Bundle bundle) {
        INSTANCE.getClass();
        return Companion.OooO00o(str, bundle);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }
}
