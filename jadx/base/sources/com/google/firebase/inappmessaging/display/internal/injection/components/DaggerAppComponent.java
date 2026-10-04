package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import com.bumptech.glide.OooOOO0;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay_Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator_Factory;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader_Factory;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer_Factory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.GlideModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.GlideModule_ProvidesGlideRequestManagerFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory;
import java.util.Map;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class DaggerAppComponent {

    public static final class AppComponentImpl implements AppComponent {
        private final AppComponentImpl appComponentImpl;
        private Provider<FiamAnimator> fiamAnimatorProvider;
        private Provider<FiamImageLoader> fiamImageLoaderProvider;
        private Provider<FiamWindowManager> fiamWindowManagerProvider;
        private Provider<FirebaseInAppMessagingDisplay> firebaseInAppMessagingDisplayProvider;
        private Provider<BindingWrapperFactory> inflaterClientProvider;
        private Provider myKeyStringMapProvider;
        private Provider<Application> providesApplicationProvider;
        private Provider<OooOOO0> providesGlideRequestManagerProvider;
        private Provider<FirebaseInAppMessaging> providesHeadlesssSingletonProvider;

        public static final class FiamWindowManagerProvider implements Provider<FiamWindowManager> {
            private final UniversalComponent universalComponent;

            public FiamWindowManagerProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public FiamWindowManager get() {
                return (FiamWindowManager) Preconditions.checkNotNullFromComponent(this.universalComponent.fiamWindowManager());
            }
        }

        public static final class InflaterClientProvider implements Provider<BindingWrapperFactory> {
            private final UniversalComponent universalComponent;

            public InflaterClientProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public BindingWrapperFactory get() {
                return (BindingWrapperFactory) Preconditions.checkNotNullFromComponent(this.universalComponent.inflaterClient());
            }
        }

        public static final class MyKeyStringMapProvider implements Provider<Map<String, InterfaceC32462OooO00o<InAppMessageLayoutConfig>>> {
            private final UniversalComponent universalComponent;

            public MyKeyStringMapProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Map<String, InterfaceC32462OooO00o<InAppMessageLayoutConfig>> get() {
                return (Map) Preconditions.checkNotNullFromComponent(this.universalComponent.myKeyStringMap());
            }
        }

        public static final class ProvidesApplicationProvider implements Provider<Application> {
            private final UniversalComponent universalComponent;

            public ProvidesApplicationProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Application get() {
                return (Application) Preconditions.checkNotNullFromComponent(this.universalComponent.providesApplication());
            }
        }

        private void initialize(HeadlessInAppMessagingModule headlessInAppMessagingModule, GlideModule glideModule, UniversalComponent universalComponent) {
            this.providesHeadlesssSingletonProvider = DoubleCheck.provider(HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory.create(headlessInAppMessagingModule));
            this.myKeyStringMapProvider = new MyKeyStringMapProvider(universalComponent);
            ProvidesApplicationProvider providesApplicationProvider = new ProvidesApplicationProvider(universalComponent);
            this.providesApplicationProvider = providesApplicationProvider;
            Provider<OooOOO0> provider = DoubleCheck.provider(GlideModule_ProvidesGlideRequestManagerFactory.create(glideModule, providesApplicationProvider));
            this.providesGlideRequestManagerProvider = provider;
            this.fiamImageLoaderProvider = DoubleCheck.provider(FiamImageLoader_Factory.create(provider));
            this.fiamWindowManagerProvider = new FiamWindowManagerProvider(universalComponent);
            this.inflaterClientProvider = new InflaterClientProvider(universalComponent);
            this.fiamAnimatorProvider = DoubleCheck.provider(FiamAnimator_Factory.create());
            this.firebaseInAppMessagingDisplayProvider = DoubleCheck.provider(FirebaseInAppMessagingDisplay_Factory.create(this.providesHeadlesssSingletonProvider, this.myKeyStringMapProvider, this.fiamImageLoaderProvider, RenewableTimer_Factory.create(), RenewableTimer_Factory.create(), this.fiamWindowManagerProvider, this.providesApplicationProvider, this.inflaterClientProvider, this.fiamAnimatorProvider));
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.AppComponent
        public FiamImageLoader fiamImageLoader() {
            return (FiamImageLoader) this.fiamImageLoaderProvider.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.AppComponent
        public FirebaseInAppMessagingDisplay providesFirebaseInAppMessagingUI() {
            return (FirebaseInAppMessagingDisplay) this.firebaseInAppMessagingDisplayProvider.get();
        }

        private AppComponentImpl(HeadlessInAppMessagingModule headlessInAppMessagingModule, GlideModule glideModule, UniversalComponent universalComponent) {
            this.appComponentImpl = this;
            initialize(headlessInAppMessagingModule, glideModule, universalComponent);
        }
    }

    public static final class Builder {
        private GlideModule glideModule;
        private HeadlessInAppMessagingModule headlessInAppMessagingModule;
        private UniversalComponent universalComponent;

        public AppComponent build() {
            Preconditions.checkBuilderRequirement(this.headlessInAppMessagingModule, HeadlessInAppMessagingModule.class);
            if (this.glideModule == null) {
                this.glideModule = new GlideModule();
            }
            Preconditions.checkBuilderRequirement(this.universalComponent, UniversalComponent.class);
            return new AppComponentImpl(this.headlessInAppMessagingModule, this.glideModule, this.universalComponent);
        }

        public Builder glideModule(GlideModule glideModule) {
            this.glideModule = (GlideModule) Preconditions.checkNotNull(glideModule);
            return this;
        }

        public Builder headlessInAppMessagingModule(HeadlessInAppMessagingModule headlessInAppMessagingModule) {
            this.headlessInAppMessagingModule = (HeadlessInAppMessagingModule) Preconditions.checkNotNull(headlessInAppMessagingModule);
            return this;
        }

        public Builder universalComponent(UniversalComponent universalComponent) {
            this.universalComponent = (UniversalComponent) Preconditions.checkNotNull(universalComponent);
            return this;
        }

        private Builder() {
        }
    }

    private DaggerAppComponent() {
    }

    public static Builder builder() {
        return new Builder();
    }
}
