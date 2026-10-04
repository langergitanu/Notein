package o0000OO0;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0000OO0.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lo0000OO0/Oooo0oO;", "Lo0000OO0/OooO0oo;", "", C18437z2.f56754h, "Landroid/os/Bundle;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "credentials_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class C24191Oooo0oO extends AbstractC24167OooO0oo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24191Oooo0oO(String type, Bundle data) {
        super(type, data);
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
