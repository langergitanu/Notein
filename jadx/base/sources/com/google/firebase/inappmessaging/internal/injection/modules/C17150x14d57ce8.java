package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import oO0OOoOO.AbstractC33127OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17150x14d57ce8 implements Factory<AbstractC33127OooO00o<String>> {
    private final ProgrammaticContextualTriggerFlowableModule module;

    public C17150x14d57ce8(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        this.module = programmaticContextualTriggerFlowableModule;
    }

    public static C17150x14d57ce8 create(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        return new C17150x14d57ce8(programmaticContextualTriggerFlowableModule);
    }

    public static AbstractC33127OooO00o<String> providesProgramaticContextualTriggerStream(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        return (AbstractC33127OooO00o) Preconditions.checkNotNullFromProvides(programmaticContextualTriggerFlowableModule.providesProgramaticContextualTriggerStream());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public AbstractC33127OooO00o<String> get() {
        return providesProgramaticContextualTriggerStream(this.module);
    }
}
