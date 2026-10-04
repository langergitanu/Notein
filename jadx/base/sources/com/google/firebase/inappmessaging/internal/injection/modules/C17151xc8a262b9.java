package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17151xc8a262b9 implements Factory<ProgramaticContextualTriggers> {
    private final ProgrammaticContextualTriggerFlowableModule module;

    public C17151xc8a262b9(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        this.module = programmaticContextualTriggerFlowableModule;
    }

    public static C17151xc8a262b9 create(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        return new C17151xc8a262b9(programmaticContextualTriggerFlowableModule);
    }

    public static ProgramaticContextualTriggers providesProgramaticContextualTriggers(ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule) {
        return (ProgramaticContextualTriggers) Preconditions.checkNotNullFromProvides(programmaticContextualTriggerFlowableModule.providesProgramaticContextualTriggers());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ProgramaticContextualTriggers get() {
        return providesProgramaticContextualTriggers(this.module);
    }
}
