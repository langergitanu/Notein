package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
final class DaggerTransportRuntimeComponent {

    public static final class Builder implements TransportRuntimeComponent.Builder {
        private Context setApplicationContext;

        private Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public TransportRuntimeComponent build() {
            Preconditions.checkBuilderRequirement(this.setApplicationContext, Context.class);
            return new TransportRuntimeComponentImpl(this.setApplicationContext);
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public Builder setApplicationContext(Context context) {
            this.setApplicationContext = (Context) Preconditions.checkNotNull(context);
            return this;
        }
    }

    public static final class TransportRuntimeComponentImpl extends TransportRuntimeComponent {
        private InterfaceC32462OooO00o<SchedulerConfig> configProvider;
        private InterfaceC32462OooO00o creationContextFactoryProvider;
        private InterfaceC32462OooO00o<DefaultScheduler> defaultSchedulerProvider;
        private InterfaceC32462OooO00o<Executor> executorProvider;
        private InterfaceC32462OooO00o metadataBackendRegistryProvider;
        private InterfaceC32462OooO00o<String> packageNameProvider;
        private InterfaceC32462OooO00o<SQLiteEventStore> sQLiteEventStoreProvider;
        private InterfaceC32462OooO00o schemaManagerProvider;
        private InterfaceC32462OooO00o<Context> setApplicationContextProvider;
        private final TransportRuntimeComponentImpl transportRuntimeComponentImpl;
        private InterfaceC32462OooO00o<TransportRuntime> transportRuntimeProvider;
        private InterfaceC32462OooO00o<Uploader> uploaderProvider;
        private InterfaceC32462OooO00o<WorkInitializer> workInitializerProvider;
        private InterfaceC32462OooO00o<WorkScheduler> workSchedulerProvider;

        private void initialize(Context context) {
            this.executorProvider = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
            Factory factoryCreate = InstanceFactory.create(context);
            this.setApplicationContextProvider = factoryCreate;
            CreationContextFactory_Factory creationContextFactory_FactoryCreate = CreationContextFactory_Factory.create(factoryCreate, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
            this.creationContextFactoryProvider = creationContextFactory_FactoryCreate;
            this.metadataBackendRegistryProvider = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.setApplicationContextProvider, creationContextFactory_FactoryCreate));
            this.schemaManagerProvider = SchemaManager_Factory.create(this.setApplicationContextProvider, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
            this.packageNameProvider = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(this.setApplicationContextProvider));
            this.sQLiteEventStoreProvider = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), this.schemaManagerProvider, this.packageNameProvider));
            SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactoryCreate = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
            this.configProvider = schedulingConfigModule_ConfigFactoryCreate;
            SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactoryCreate = SchedulingModule_WorkSchedulerFactory.create(this.setApplicationContextProvider, this.sQLiteEventStoreProvider, schedulingConfigModule_ConfigFactoryCreate, TimeModule_UptimeClockFactory.create());
            this.workSchedulerProvider = schedulingModule_WorkSchedulerFactoryCreate;
            InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o = this.executorProvider;
            InterfaceC32462OooO00o interfaceC32462OooO00o2 = this.metadataBackendRegistryProvider;
            InterfaceC32462OooO00o<SQLiteEventStore> interfaceC32462OooO00o3 = this.sQLiteEventStoreProvider;
            this.defaultSchedulerProvider = DefaultScheduler_Factory.create(interfaceC32462OooO00o, interfaceC32462OooO00o2, schedulingModule_WorkSchedulerFactoryCreate, interfaceC32462OooO00o3, interfaceC32462OooO00o3);
            InterfaceC32462OooO00o<Context> interfaceC32462OooO00o4 = this.setApplicationContextProvider;
            InterfaceC32462OooO00o interfaceC32462OooO00o5 = this.metadataBackendRegistryProvider;
            InterfaceC32462OooO00o<SQLiteEventStore> interfaceC32462OooO00o6 = this.sQLiteEventStoreProvider;
            this.uploaderProvider = Uploader_Factory.create(interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, this.workSchedulerProvider, this.executorProvider, interfaceC32462OooO00o6, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.sQLiteEventStoreProvider);
            InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o7 = this.executorProvider;
            InterfaceC32462OooO00o<SQLiteEventStore> interfaceC32462OooO00o8 = this.sQLiteEventStoreProvider;
            this.workInitializerProvider = WorkInitializer_Factory.create(interfaceC32462OooO00o7, interfaceC32462OooO00o8, this.workSchedulerProvider, interfaceC32462OooO00o8);
            this.transportRuntimeProvider = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.defaultSchedulerProvider, this.uploaderProvider, this.workInitializerProvider));
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public EventStore getEventStore() {
            return this.sQLiteEventStoreProvider.get();
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public TransportRuntime getTransportRuntime() {
            return this.transportRuntimeProvider.get();
        }

        private TransportRuntimeComponentImpl(Context context) {
            this.transportRuntimeComponentImpl = this;
            initialize(context);
        }
    }

    private DaggerTransportRuntimeComponent() {
    }

    public static TransportRuntimeComponent.Builder builder() {
        return new Builder();
    }
}
