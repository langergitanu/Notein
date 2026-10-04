package com.oplus.ocs.base.common.api;

import android.content.Context;
import com.oplus.ocs.base.common.AuthResult;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.CapabilityListener;
import com.oplus.ocs.base.internal.ClientSettings;
import com.oplus.ocs.base.utils.C18861a;
import com.oplus.ocs.base.utils.C18864d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CapabilityApiClient {
    private static final String TAG = "CapabilityApiClient";
    private static volatile Map<Api, CapabilityInfo> sApis = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static CapabilityInfo buildCapabilityInfo(Context context, int i) {
        return new CapabilityInfo(new ArrayList(), 100011, new AuthResult(context.getPackageName(), 0, 0, i, new byte[4]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void callback(Api[] apiArr, int[] iArr, CapabilityListener capabilityListener) {
        for (int i : iArr) {
            if (i == 0) {
                return;
            }
        }
        if (capabilityListener != null) {
            capabilityListener.onResult(apiArr, iArr);
        }
    }

    public static boolean checkCapability(Api api) {
        CapabilityInfo capabilityInfo;
        return sApis.containsKey(api) && (capabilityInfo = sApis.get(api)) != null && capabilityInfo.getAuthResult() != null && capabilityInfo.getAuthResult().getErrrorCode() == 1001;
    }

    public static void checkSelfCapabilities(Context context, Api[] apiArr, CapabilityListener capabilityListener) {
        final Context context2;
        final Api[] apiArr2;
        final CapabilityListener capabilityListener2;
        if (apiArr == null || apiArr.length == 0) {
            if (capabilityListener != null) {
                capabilityListener.onResult(new Api[0], new int[0]);
            }
            C18861a.m80545a(TAG, "capa apis is empty");
            return;
        }
        final int[] iArr = new int[apiArr.length];
        final int i = 0;
        while (i < apiArr.length) {
            final Api api = apiArr[i];
            if (sApis.containsKey(api)) {
                CapabilityInfo capabilityInfo = sApis.get(api);
                if (capabilityInfo == null || capabilityInfo.getAuthResult() == null) {
                    C18861a.m80545a(TAG, api.getName() + "sapis none");
                    iArr[i] = 7;
                } else {
                    iArr[i] = capabilityInfo.getAuthResult().getErrrorCode();
                }
                callback(apiArr, iArr, capabilityListener);
                context2 = context;
                apiArr2 = apiArr;
                capabilityListener2 = capabilityListener;
            } else if (api.isAuth()) {
                final C18835l c18835lM80507a = C18835l.m80507a(context);
                ClientSettings clientSettings = new ClientSettings(context.getPackageName());
                context2 = context;
                apiArr2 = apiArr;
                capabilityListener2 = capabilityListener;
                InterfaceC18832i interfaceC18832i = new InterfaceC18832i() { // from class: com.oplus.ocs.base.common.api.CapabilityApiClient.1
                    @Override // com.oplus.ocs.base.common.api.InterfaceC18832i
                    /* JADX INFO: renamed from: a */
                    public final void mo80476a(CapabilityInfo capabilityInfo2) {
                        if (capabilityInfo2 == null || capabilityInfo2.getAuthResult() == null) {
                            C18861a.m80545a(CapabilityApiClient.TAG, api.getName() + " fail, capability is null");
                            iArr[i] = 7;
                            capabilityInfo2 = CapabilityApiClient.buildCapabilityInfo(context2, 7);
                        } else {
                            iArr[i] = capabilityInfo2.getAuthResult().getErrrorCode();
                        }
                        CapabilityApiClient.sApis.put(api, capabilityInfo2);
                        CapabilityApiClient.callback(apiArr2, iArr, capabilityListener2);
                    }
                };
                C18864d.m80554a(api, "api not be null");
                C18864d.m80554a(clientSettings, "clientsettings not be null");
                if (!C18835l.f57532c.containsKey(api.getClientKey())) {
                    C18836m c18836m = new C18836m(c18835lM80507a.f57535a, api, null, clientSettings);
                    c18836m.setOnClearListener(new InterfaceC18833j() { // from class: com.oplus.ocs.base.common.api.l.3

                        /* JADX INFO: renamed from: a */
                        final /* synthetic */ Api f57542a;

                        public AnonymousClass3(final Api api2) {
                            api = api2;
                        }

                        @Override // com.oplus.ocs.base.common.api.InterfaceC18833j
                        /* JADX INFO: renamed from: a */
                        public final void mo80506a() {
                            C18835l.m80508a(api.getClientKey());
                        }
                    });
                    c18836m.setOnCapabilityAuthListener(interfaceC18832i);
                    C18835l.f57532c.put(api2.getClientKey(), c18836m);
                    c18835lM80507a.m80516a(api2);
                }
            } else {
                context2 = context;
                apiArr2 = apiArr;
                capabilityListener2 = capabilityListener;
                C18861a.m80545a(TAG, "current capa doesn't need to authenticate.");
                iArr[i] = 1001;
                sApis.put(api2, buildCapabilityInfo(context2, 1001));
                callback(apiArr2, iArr, capabilityListener2);
            }
            i++;
            context = context2;
            apiArr = apiArr2;
            capabilityListener = capabilityListener2;
        }
    }

    public static CapabilityInfo getCapabilityInfo(Api api) {
        return sApis.get(api);
    }
}
