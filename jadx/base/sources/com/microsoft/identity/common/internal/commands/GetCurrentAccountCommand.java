package com.microsoft.identity.common.internal.commands;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.cache.ICacheRecord;
import com.microsoft.identity.common.java.commands.BaseCommand;
import com.microsoft.identity.common.java.commands.CommandCallback;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import com.microsoft.identity.common.java.controllers.BaseController;
import com.microsoft.identity.common.java.controllers.IControllerFactory;
import com.microsoft.identity.common.java.logging.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GetCurrentAccountCommand extends BaseCommand<List<ICacheRecord>> {
    private static final String TAG = "GetCurrentAccountCommand";

    public GetCurrentAccountCommand(CommandParameters commandParameters, IControllerFactory iControllerFactory, CommandCallback commandCallback, String str) {
        super(commandParameters, iControllerFactory, commandCallback, str);
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand
    public boolean canEqual(Object obj) {
        return obj instanceof GetCurrentAccountCommand;
    }

    @Override // com.microsoft.identity.common.java.commands.BaseCommand
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetCurrentAccountCommand) && ((GetCurrentAccountCommand) obj).canEqual(this) && super.equals(obj);
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
    public List<ICacheRecord> execute() throws Exception {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":execute");
        ArrayList arrayList = new ArrayList();
        List<BaseController> allControllers = getControllerFactory().getAllControllers();
        for (int i = 0; i < allControllers.size(); i++) {
            BaseController baseController = allControllers.get(i);
            Logger.verbose(strOooO0OO, "Executing with controller: ".concat(baseController.getClass().getSimpleName()));
            arrayList.addAll(baseController.getCurrentAccount(getParameters()));
        }
        return arrayList;
    }
}
