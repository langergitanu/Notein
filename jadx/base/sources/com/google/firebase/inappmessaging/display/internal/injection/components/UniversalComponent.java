package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.dagger.Component;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule;
import java.util.Map;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Component(modules = {ApplicationModule.class, InflaterConfigModule.class})
public interface UniversalComponent {
    DisplayMetrics displayMetrics();

    FiamWindowManager fiamWindowManager();

    BindingWrapperFactory inflaterClient();

    Map<String, InterfaceC32462OooO00o<InAppMessageLayoutConfig>> myKeyStringMap();

    Application providesApplication();
}
