package com.microsoft.identity.common.internal.commands;

import android.util.Log;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.commands.BaseCommand;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import com.microsoft.identity.common.java.commands.parameters.SilentTokenCommandParameters;
import com.microsoft.identity.common.java.controllers.BaseController;
import com.microsoft.identity.common.java.controllers.IControllerFactory;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ServiceException;
import com.microsoft.identity.common.java.providers.oauth2.TokenResult;
import com.microsoft.identity.common.java.result.VoidResult;
import com.microsoft.identity.common.logging.Logger;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class RefreshOnCommand extends BaseCommand<VoidResult> {
    private static final String TAG = "RefreshOnCommand";

    public RefreshOnCommand(CommandParameters commandParameters, IControllerFactory iControllerFactory, String str) {
        super(commandParameters, iControllerFactory, new RefreshOnCallback(), str);
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand, com.microsoft.identity.common.java.commands.ICommand
    public boolean isEligibleForCaching() {
        return false;
    }

    @Override // com.microsoft.identity.common.java.commands.ICommand
    public boolean isEligibleForEstsTelemetry() {
        return false;
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand, com.microsoft.identity.common.java.commands.ICommand
    public VoidResult execute() throws ServiceException, IOException, ClientException {
        StringBuilder sb = new StringBuilder();
        String str = TAG;
        String strOooO0OO = OooO00o.OooO0OO(sb, str, ":execute");
        BaseController defaultController = getControllerFactory().getDefaultController();
        Logger.verbose(strOooO0OO, "Executing with controller: ".concat(defaultController.getClass().getSimpleName()));
        TokenResult tokenResultRenewAccessToken = defaultController.renewAccessToken((SilentTokenCommandParameters) getParameters());
        if (!tokenResultRenewAccessToken.getSuccess()) {
            Log.e(str, tokenResultRenewAccessToken.getErrorResponse().getError());
        }
        return new VoidResult();
    }
}
