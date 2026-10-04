package com.google.firebase.vertexai;

import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/vertexai/FirebaseVertexAIRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FirebaseVertexAIRegistrar implements ComponentRegistrar {
    private static final Companion Companion = new Companion(null);
    private static final String LIBRARY_NAME = "fire-vertex";
    private static final Qualified<InteropAppCheckTokenProvider> appCheckInterop;
    private static final Qualified<FirebaseApp> firebaseApp;
    private static final Qualified<InternalAuthProvider> internalAuthProvider;

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\n0\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/vertexai/FirebaseVertexAIRegistrar$Companion;", "", "()V", "LIBRARY_NAME", "", "appCheckInterop", "Lcom/google/firebase/components/Qualified;", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "kotlin.jvm.PlatformType", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "internalAuthProvider", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Qualified<FirebaseApp> qualifiedUnqualified = Qualified.unqualified(FirebaseApp.class);
        OooOOO0.OooO0o(qualifiedUnqualified, "unqualified(FirebaseApp::class.java)");
        firebaseApp = qualifiedUnqualified;
        Qualified<InteropAppCheckTokenProvider> qualifiedUnqualified2 = Qualified.unqualified(InteropAppCheckTokenProvider.class);
        OooOOO0.OooO0o(qualifiedUnqualified2, "unqualified(InteropAppCh…okenProvider::class.java)");
        appCheckInterop = qualifiedUnqualified2;
        Qualified<InternalAuthProvider> qualifiedUnqualified3 = Qualified.unqualified(InternalAuthProvider.class);
        OooOOO0.OooO0o(qualifiedUnqualified3, "unqualified(InternalAuthProvider::class.java)");
        internalAuthProvider = qualifiedUnqualified3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseVertexAIMultiResourceComponent getComponents$lambda$0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        OooOOO0.OooO0o(obj, "container[firebaseApp]");
        Provider provider = componentContainer.getProvider(appCheckInterop);
        OooOOO0.OooO0o(provider, "container.getProvider(appCheckInterop)");
        Provider provider2 = componentContainer.getProvider(internalAuthProvider);
        OooOOO0.OooO0o(provider2, "container.getProvider(internalAuthProvider)");
        return new FirebaseVertexAIMultiResourceComponent((FirebaseApp) obj, provider, provider2);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<? extends Object>> getComponents() {
        return C34429OooOOo0.OooOO0o(Component.builder(FirebaseVertexAIMultiResourceComponent.class).name(LIBRARY_NAME).add(Dependency.required(firebaseApp)).add(Dependency.optionalProvider(appCheckInterop)).add(Dependency.optionalProvider(internalAuthProvider)).factory(new OooO00o()).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
