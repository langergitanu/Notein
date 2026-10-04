package com.google.firebase.inappmessaging.display.internal.injection.modules;

import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.dagger.Module;
import com.google.firebase.inappmessaging.display.dagger.Provides;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class HeadlessInAppMessagingModule {
    private final FirebaseInAppMessaging headless;

    public HeadlessInAppMessagingModule(FirebaseInAppMessaging firebaseInAppMessaging) {
        this.headless = firebaseInAppMessaging;
    }

    @Provides
    public FirebaseInAppMessaging providesHeadlesssSingleton() {
        return this.headless;
    }
}
