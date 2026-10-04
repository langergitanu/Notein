package com.microsoft.identity.common.internal.commands;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.commands.BaseCommand;
import com.microsoft.identity.common.java.commands.CommandCallback;
import com.microsoft.identity.common.java.commands.parameters.RemoveAccountCommandParameters;
import com.microsoft.identity.common.java.controllers.BaseController;
import com.microsoft.identity.common.java.controllers.IControllerFactory;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class RemoveCurrentAccountCommand extends BaseCommand<Boolean> {
    private static final String TAG = "RemoveCurrentAccountCommand";

    public RemoveCurrentAccountCommand(RemoveAccountCommandParameters removeAccountCommandParameters, IControllerFactory iControllerFactory, CommandCallback commandCallback, String str) {
        super(removeAccountCommandParameters, iControllerFactory, commandCallback, str);
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand
    public boolean canEqual(Object obj) {
        return obj instanceof RemoveCurrentAccountCommand;
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RemoveCurrentAccountCommand) && ((RemoveCurrentAccountCommand) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.microsoft.identity.common.java.commands.ICommand
    public boolean isEligibleForEstsTelemetry() {
        return true;
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand, com.microsoft.identity.common.java.commands.ICommand
    public Boolean execute() throws Exception {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":execute");
        for (BaseController baseController : getControllerFactory().getAllControllers()) {
            Logger.verbose(strOooO0OO, "Executing with controller: ".concat(baseController.getClass().getSimpleName()));
            if (baseController.removeCurrentAccount((RemoveAccountCommandParameters) getParameters())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
