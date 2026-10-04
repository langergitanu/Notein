package com.microsoft.identity.common.internal.commands;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.commands.BaseCommand;
import com.microsoft.identity.common.java.commands.CommandCallback;
import com.microsoft.identity.common.java.commands.parameters.RemoveAccountCommandParameters;
import com.microsoft.identity.common.java.controllers.BaseController;
import com.microsoft.identity.common.java.controllers.IControllerFactory;
import com.microsoft.identity.common.java.logging.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class RemoveAccountCommand extends BaseCommand<Boolean> {
    private static final String TAG = "RemoveAccountCommand";

    public RemoveAccountCommand(RemoveAccountCommandParameters removeAccountCommandParameters, IControllerFactory iControllerFactory, CommandCallback commandCallback, String str) {
        super(removeAccountCommandParameters, iControllerFactory, commandCallback, str);
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand
    public boolean canEqual(Object obj) {
        return obj instanceof RemoveAccountCommand;
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RemoveAccountCommand) && ((RemoveAccountCommand) obj).canEqual(this) && super.equals(obj);
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
        List<BaseController> allControllers = getControllerFactory().getAllControllers();
        boolean zRemoveAccount = false;
        for (int i = 0; i < allControllers.size(); i++) {
            BaseController baseController = allControllers.get(i);
            Logger.verbose(strOooO0OO, "Executing with controller: ".concat(baseController.getClass().getSimpleName()));
            zRemoveAccount = baseController.removeAccount((RemoveAccountCommandParameters) getParameters());
        }
        return Boolean.valueOf(zRemoveAccount);
    }
}
