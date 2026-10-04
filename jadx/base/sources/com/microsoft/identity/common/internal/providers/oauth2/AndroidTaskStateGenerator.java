package com.microsoft.identity.common.internal.providers.oauth2;

import com.microsoft.identity.common.java.providers.oauth2.DefaultStateGenerator;
import com.microsoft.identity.common.logging.Logger;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidTaskStateGenerator extends DefaultStateGenerator {
    private static final String SPLITTER = ":";
    private static final String TAG = "AndroidTaskStateGenerator";
    private int taskId;

    public AndroidTaskStateGenerator(int i) {
        this.taskId = i;
    }

    public static int getTaskFromState(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length >= 2) {
            try {
                return Integer.parseInt(strArrSplit[0]);
            } catch (NumberFormatException e) {
                Logger.error("AndroidTaskStateGenerator:getTaskFromState", "Unable to parse state", e);
            }
        }
        return 0;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.DefaultStateGenerator, com.microsoft.identity.common.java.providers.oauth2.IStateGenerator
    public String generate() {
        String strGenerate = super.generate();
        Locale locale = Locale.US;
        return this.taskId + ":" + strGenerate;
    }

    public int getTaskId() {
        return this.taskId;
    }
}
