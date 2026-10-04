package o0000OO0;

import android.content.ComponentName;
import android.os.Bundle;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0000OO0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m80612d2 = {"Lo0000OO0/OoooO00;", "Lo0000OO0/OooOOOo;", "", C18437z2.f56754h, "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "credentials_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class C24195OoooO00 extends AbstractC24169OooOOOo {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24195OoooO00(String type, Bundle requestData, Bundle candidateQueryData, boolean z) {
        this(type, requestData, candidateQueryData, z, false, null, 48, null);
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestData, "requestData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(candidateQueryData, "candidateQueryData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24195OoooO00(String type, Bundle requestData, Bundle candidateQueryData, boolean z, boolean z2) {
        this(type, requestData, candidateQueryData, z, z2, null, 32, null);
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestData, "requestData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(candidateQueryData, "candidateQueryData");
    }

    public /* synthetic */ C24195OoooO00(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, bundle, bundle2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? C34438OooOoo0.f123458OooOo0o : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24195OoooO00(String type, Bundle requestData, Bundle candidateQueryData, boolean z, boolean z2, Set<ComponentName> allowedProviders) {
        super(type, requestData, candidateQueryData, z, z2, allowedProviders);
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestData, "requestData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(allowedProviders, "allowedProviders");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
