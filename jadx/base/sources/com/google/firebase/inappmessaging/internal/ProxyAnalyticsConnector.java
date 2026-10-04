package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class ProxyAnalyticsConnector implements AnalyticsConnector {
    private volatile Object instance;

    public static class ProxyAnalyticsConnectorHandle implements AnalyticsConnector.AnalyticsConnectorHandle {
        private static final Object UNREGISTERED = new Object();
        private Set<String> eventNames;
        private volatile Object instance;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener, Provider provider) {
            if (this.instance == UNREGISTERED) {
                return;
            }
            AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener = ((AnalyticsConnector) provider.get()).registerAnalyticsConnectorListener(str, analyticsConnectorListener);
            this.instance = analyticsConnectorHandleRegisterAnalyticsConnectorListener;
            synchronized (this) {
                try {
                    if (!this.eventNames.isEmpty()) {
                        analyticsConnectorHandleRegisterAnalyticsConnectorListener.registerEventNames(this.eventNames);
                        this.eventNames = new HashSet();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void registerEventNames(Set<String> set) {
            Object obj = this.instance;
            if (obj == UNREGISTERED) {
                return;
            }
            if (obj != null) {
                ((AnalyticsConnector.AnalyticsConnectorHandle) obj).registerEventNames(set);
            } else {
                synchronized (this) {
                    this.eventNames.addAll(set);
                }
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void unregister() {
            Object obj = this.instance;
            Object obj2 = UNREGISTERED;
            if (obj == obj2) {
                return;
            }
            if (obj != null) {
                ((AnalyticsConnector.AnalyticsConnectorHandle) obj).unregister();
            }
            this.instance = obj2;
            synchronized (this) {
                this.eventNames.clear();
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void unregisterEventNames() {
            Object obj = this.instance;
            if (obj == UNREGISTERED) {
                return;
            }
            if (obj != null) {
                ((AnalyticsConnector.AnalyticsConnectorHandle) obj).unregisterEventNames();
            } else {
                synchronized (this) {
                    this.eventNames.clear();
                }
            }
        }

        private ProxyAnalyticsConnectorHandle(final String str, final AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener, Deferred<AnalyticsConnector> deferred) {
            this.eventNames = new HashSet();
            deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.inappmessaging.internal.OoooO
                @Override // com.google.firebase.inject.Deferred.DeferredHandler
                public final void handle(Provider provider) {
                    this.f68542OooOo0o.lambda$new$0(str, analyticsConnectorListener, provider);
                }
            });
        }
    }

    public ProxyAnalyticsConnector(Deferred<AnalyticsConnector> deferred) {
        this.instance = deferred;
        deferred.whenAvailable(new androidx.ink.storage.OooO0O0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Provider provider) {
        this.instance = provider.get();
    }

    private AnalyticsConnector safeGet() {
        Object obj = this.instance;
        if (obj instanceof AnalyticsConnector) {
            return (AnalyticsConnector) obj;
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public int getMaxUserProperties(String str) {
        return 0;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public Map<String, Object> getUserProperties(boolean z) {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void logEvent(String str, String str2, Bundle bundle) {
        AnalyticsConnector analyticsConnectorSafeGet = safeGet();
        if (analyticsConnectorSafeGet != null) {
            analyticsConnectorSafeGet.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Object obj = this.instance;
        return obj instanceof AnalyticsConnector ? ((AnalyticsConnector) obj).registerAnalyticsConnectorListener(str, analyticsConnectorListener) : new ProxyAnalyticsConnectorHandle(str, analyticsConnectorListener, (Deferred) obj);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setUserProperty(String str, String str2, Object obj) {
        AnalyticsConnector analyticsConnectorSafeGet = safeGet();
        if (analyticsConnectorSafeGet != null) {
            analyticsConnectorSafeGet.setUserProperty(str, str2, obj);
        }
    }
}
