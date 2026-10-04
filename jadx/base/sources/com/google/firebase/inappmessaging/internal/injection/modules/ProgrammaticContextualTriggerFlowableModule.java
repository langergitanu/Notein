package com.google.firebase.inappmessaging.internal.injection.modules;

import androidx.core.view.C21714Oooo00O;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.C22758OoooOO0;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger;
import oO00o0oO.C32389OooO0Oo;
import oO0OOOOo.C32979OooOOoo;
import oO0OOOOo.OooO0OO;
import oO0OOoOO.AbstractC33127OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33490OooO0o;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class ProgrammaticContextualTriggerFlowableModule {
    private ProgramaticContextualTriggers triggers;

    public ProgrammaticContextualTriggerFlowableModule(ProgramaticContextualTriggers programaticContextualTriggers) {
        this.triggers = programaticContextualTriggers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$providesProgramaticContextualTriggerStream$1(InterfaceC33490OooO0o interfaceC33490OooO0o) throws Exception {
        this.triggers.setListener(new C21714Oooo00O(interfaceC33490OooO0o, 2));
    }

    @Provides
    @ProgrammaticTrigger
    public AbstractC33127OooO00o<String> providesProgramaticContextualTriggerStream() {
        C22758OoooOO0 c22758OoooOO0 = new C22758OoooOO0(this);
        int i = AbstractC33491OooO0o0.f120996OooOo0o;
        C32979OooOOoo c32979OooOOooOooO0O0 = new OooO0OO(c22758OoooOO0).OooO0O0();
        c32979OooOOooOooO0O0.OooO0o0(new C32389OooO0Oo());
        return c32979OooOOooOooO0O0;
    }

    @Provides
    @ProgrammaticTrigger
    public ProgramaticContextualTriggers providesProgramaticContextualTriggers() {
        return this.triggers;
    }
}
