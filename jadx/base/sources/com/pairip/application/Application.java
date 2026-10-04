package com.pairip.application;

import android.content.Context;
import com.orion.notein.App;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends App {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.orion.notein.App, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
