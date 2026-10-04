package o0000OO0;

import android.content.ComponentName;
import android.os.Bundle;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import o0000Oo0.C24223OooO00o;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0000OO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m80612d2 = {"Lo0000OO0/OooOOOo;", "", "", C18437z2.f56754h, "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getRequestData", "()Landroid/os/Bundle;", "getCandidateQueryData", "Z", "()Z", "Ljava/util/Set;", "getAllowedProviders", "()Ljava/util/Set;", "Companion", "OooO00o", "credentials_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class AbstractC24169OooOOOo {
    public static final String BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Set<ComponentName> allowedProviders;
    private final Bundle candidateQueryData;
    private final boolean isAutoSelectAllowed;
    private final boolean isSystemProviderRequired;
    private final Bundle requestData;
    private final String type;

    /* JADX INFO: renamed from: o0000OO0.OooOOOo$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public AbstractC24169OooOOOo(String type, Bundle requestData, Bundle candidateQueryData, boolean z, boolean z2, Set<ComponentName> allowedProviders) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestData, "requestData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(allowedProviders, "allowedProviders");
        this.type = type;
        this.requestData = requestData;
        this.candidateQueryData = candidateQueryData;
        this.isSystemProviderRequired = z;
        this.isAutoSelectAllowed = z2;
        this.allowedProviders = allowedProviders;
        requestData.putBoolean(BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED, z2);
        candidateQueryData.putBoolean(BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED, z2);
    }

    public static final AbstractC24169OooOOOo createFrom(String type, Bundle requestData, Bundle candidateQueryData, boolean z, Set<ComponentName> allowedProviders) {
        Bundle bundle;
        Bundle bundle2;
        Set<ComponentName> set;
        INSTANCE.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestData, "requestData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(allowedProviders, "allowedProviders");
        try {
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                ArrayList<String> stringArrayList = requestData.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
                try {
                    return new C24194OoooO0(stringArrayList != null ? oOo000Oo.OooOo.o0OO00O(stringArrayList) : C34438OooOoo0.f123458OooOo0o, requestData.getBoolean(BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED, false), allowedProviders, requestData, candidateQueryData);
                } catch (C24223OooO00o unused) {
                    set = allowedProviders;
                    bundle = requestData;
                    bundle2 = candidateQueryData;
                }
            } else {
                bundle = requestData;
                bundle2 = candidateQueryData;
                set = allowedProviders;
                try {
                    if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        throw new C24223OooO00o();
                    }
                    String string = bundle.getString("androidx.credentials.BUNDLE_KEY_SUBTYPE");
                    if (string == null || string.hashCode() != -613058807 || !string.equals("androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION")) {
                        throw new C24223OooO00o();
                    }
                    try {
                        String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                        bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(string2);
                        return new C24196OoooO0O(string2, set, bundle, bundle2);
                    } catch (Exception unused2) {
                        throw new C24223OooO00o();
                    }
                } catch (C24223OooO00o unused3) {
                }
            }
        } catch (C24223OooO00o unused4) {
            bundle = requestData;
            bundle2 = candidateQueryData;
            set = allowedProviders;
        }
        return new C24195OoooO00(type, bundle, bundle2, z, bundle.getBoolean(BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED, false), set);
    }

    public final Set<ComponentName> getAllowedProviders() {
        return this.allowedProviders;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final Bundle getRequestData() {
        return this.requestData;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isAutoSelectAllowed, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* JADX INFO: renamed from: isSystemProviderRequired, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }
}
