package com.google.firebase.firestore.remote;

import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.BitSet;
import oO0OOo0o.C33094OoooO;

/* JADX INFO: loaded from: classes8.dex */
public class FirebaseClientGrpcMetadataProvider implements GrpcMetadataProvider {
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> GMP_APP_ID_HEADER;
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> HEART_BEAT_HEADER;
    private static final String HEART_BEAT_TAG = "fire-fst";
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> USER_AGENT_HEADER;
    private final FirebaseOptions firebaseOptions;
    private final Provider<HeartBeatInfo> heartBeatInfoProvider;
    private final Provider<UserAgentPublisher> userAgentPublisherProvider;

    static {
        C33094OoooO.OooO00o oooO00o = C33094OoooO.f119652OooO0Oo;
        BitSet bitSet = C33094OoooO.AbstractC33095OooO0Oo.f119657OooO0Oo;
        HEART_BEAT_HEADER = new C33094OoooO.OooO0O0("x-firebase-client-log-type", oooO00o);
        USER_AGENT_HEADER = new C33094OoooO.OooO0O0("x-firebase-client", oooO00o);
        GMP_APP_ID_HEADER = new C33094OoooO.OooO0O0("x-firebase-gmpid", oooO00o);
    }

    public FirebaseClientGrpcMetadataProvider(Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseOptions firebaseOptions) {
        this.userAgentPublisherProvider = provider;
        this.heartBeatInfoProvider = provider2;
        this.firebaseOptions = firebaseOptions;
    }

    private void maybeAddGmpAppId(C33094OoooO c33094OoooO) {
        FirebaseOptions firebaseOptions = this.firebaseOptions;
        if (firebaseOptions == null) {
            return;
        }
        String applicationId = firebaseOptions.getApplicationId();
        if (applicationId.length() != 0) {
            c33094OoooO.OooO0o(GMP_APP_ID_HEADER, applicationId);
        }
    }

    @Override // com.google.firebase.firestore.remote.GrpcMetadataProvider
    public void updateMetadata(C33094OoooO c33094OoooO) {
        if (this.heartBeatInfoProvider.get() == null || this.userAgentPublisherProvider.get() == null) {
            return;
        }
        int code = this.heartBeatInfoProvider.get().getHeartBeatCode(HEART_BEAT_TAG).getCode();
        if (code != 0) {
            c33094OoooO.OooO0o(HEART_BEAT_HEADER, Integer.toString(code));
        }
        c33094OoooO.OooO0o(USER_AGENT_HEADER, this.userAgentPublisherProvider.get().getUserAgent());
        maybeAddGmpAppId(c33094OoooO);
    }
}
