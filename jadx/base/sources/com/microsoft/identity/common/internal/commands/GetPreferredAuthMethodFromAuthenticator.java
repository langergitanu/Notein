package com.microsoft.identity.common.internal.commands;

import com.microsoft.identity.common.java.commands.BaseCommand;
import com.microsoft.identity.common.java.commands.CommandCallback;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import com.microsoft.identity.common.java.controllers.IControllerFactory;
import com.microsoft.identity.common.java.p591ui.PreferredAuthMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/commands/GetPreferredAuthMethodFromAuthenticator;", "Lcom/microsoft/identity/common/java/commands/BaseCommand;", "Lcom/microsoft/identity/common/java/ui/PreferredAuthMethod;", "parameters", "Lcom/microsoft/identity/common/java/commands/parameters/CommandParameters;", "controllerFactory", "Lcom/microsoft/identity/common/java/controllers/IControllerFactory;", "callback", "Lcom/microsoft/identity/common/java/commands/CommandCallback;", "publicApiId", "", "(Lcom/microsoft/identity/common/java/commands/parameters/CommandParameters;Lcom/microsoft/identity/common/java/controllers/IControllerFactory;Lcom/microsoft/identity/common/java/commands/CommandCallback;Ljava/lang/String;)V", "execute", "isEligibleForEstsTelemetry", "", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class GetPreferredAuthMethodFromAuthenticator extends BaseCommand<PreferredAuthMethod> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPreferredAuthMethodFromAuthenticator(CommandParameters parameters, IControllerFactory controllerFactory, CommandCallback<?, ?> callback, String publicApiId) {
        super(parameters, controllerFactory, callback, publicApiId);
        OooOOO0.OooO0oO(parameters, "parameters");
        OooOOO0.OooO0oO(controllerFactory, "controllerFactory");
        OooOOO0.OooO0oO(callback, "callback");
        OooOOO0.OooO0oO(publicApiId, "publicApiId");
    }

    @Override // com.microsoft.identity.common.java.commands.ICommand
    public boolean isEligibleForEstsTelemetry() {
        return false;
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand, com.microsoft.identity.common.java.commands.ICommand
    public PreferredAuthMethod execute() throws Exception {
        PreferredAuthMethod preferredAuthMethod = getControllerFactory().getDefaultController().getPreferredAuthMethod();
        OooOOO0.OooO0o(preferredAuthMethod, "controllerFactory.getDef…ler().preferredAuthMethod");
        return preferredAuthMethod;
    }
}
