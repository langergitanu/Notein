package com.google.firebase.functions;

import android.content.Context;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.functions.FunctionsComponent;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/functions/FunctionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "Companion", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FunctionsRegistrar implements ComponentRegistrar {
    private static final Companion Companion = new Companion(null);
    private static final String LIBRARY_NAME = "fire-fn";

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/functions/FunctionsRegistrar$Companion;", "", "<init>", "()V", "LIBRARY_NAME", "", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FunctionsMultiResourceComponent getComponents$lambda$0(Qualified qualified, Qualified qualified2, ComponentContainer c) {
        OooOOO0.OooO0oO(c, "c");
        FunctionsComponent.Builder builder = DaggerFunctionsComponent.builder();
        Object obj = c.get((Class<Object>) Context.class);
        OooOOO0.OooO0o(obj, "get(...)");
        FunctionsComponent.Builder applicationContext = builder.setApplicationContext((Context) obj);
        Object obj2 = c.get((Class<Object>) FirebaseOptions.class);
        OooOOO0.OooO0o(obj2, "get(...)");
        FunctionsComponent.Builder firebaseOptions = applicationContext.setFirebaseOptions((FirebaseOptions) obj2);
        Object obj3 = c.get((Qualified<Object>) qualified);
        OooOOO0.OooO0o(obj3, "get(...)");
        FunctionsComponent.Builder liteExecutor = firebaseOptions.setLiteExecutor((Executor) obj3);
        Object obj4 = c.get((Qualified<Object>) qualified2);
        OooOOO0.OooO0o(obj4, "get(...)");
        FunctionsComponent.Builder uiExecutor = liteExecutor.setUiExecutor((Executor) obj4);
        Provider<InternalAuthProvider> provider = c.getProvider(InternalAuthProvider.class);
        OooOOO0.OooO0o(provider, "getProvider(...)");
        FunctionsComponent.Builder auth = uiExecutor.setAuth(provider);
        Provider<FirebaseInstanceIdInternal> provider2 = c.getProvider(FirebaseInstanceIdInternal.class);
        OooOOO0.OooO0o(provider2, "getProvider(...)");
        FunctionsComponent.Builder iid = auth.setIid(provider2);
        Deferred<InteropAppCheckTokenProvider> deferred = c.getDeferred(InteropAppCheckTokenProvider.class);
        OooOOO0.OooO0o(deferred, "getDeferred(...)");
        return iid.setAppCheck(deferred).build().getMultiResourceComponent();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        final Qualified qualified = Qualified.qualified(Lightweight.class, Executor.class);
        OooOOO0.OooO0o(qualified, "qualified(...)");
        final Qualified qualified2 = Qualified.qualified(UiThread.class, Executor.class);
        OooOOO0.OooO0o(qualified2, "qualified(...)");
        return C34429OooOOo0.OooOO0o(Component.builder(FunctionsMultiResourceComponent.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) FirebaseOptions.class)).add(Dependency.optionalProvider((Class<?>) InternalAuthProvider.class)).add(Dependency.requiredProvider((Class<?>) FirebaseInstanceIdInternal.class)).add(Dependency.deferred((Class<?>) InteropAppCheckTokenProvider.class)).add(Dependency.required((Qualified<?>) qualified)).add(Dependency.required((Qualified<?>) qualified2)).factory(new ComponentFactory() { // from class: com.google.firebase.functions.OooO
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FunctionsRegistrar.getComponents$lambda$0(qualified, qualified2, componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, "22.0.0"));
    }
}
