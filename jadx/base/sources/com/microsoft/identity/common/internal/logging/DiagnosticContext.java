package com.microsoft.identity.common.internal.logging;

import androidx.concurrent.futures.OooO00o;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class DiagnosticContext extends com.microsoft.identity.common.logging.DiagnosticContext {
    private static final String TAG = "DiagnosticContext";
    private static boolean sLogDeprecationWarning = true;

    public static void clear() {
        logDeprecationWarning();
        com.microsoft.identity.common.logging.DiagnosticContext.clear();
    }

    public static IRequestContext getRequestContext() {
        logDeprecationWarning();
        final com.microsoft.identity.common.java.logging.IRequestContext requestContext = com.microsoft.identity.common.java.logging.DiagnosticContext.INSTANCE.getRequestContext();
        return new IRequestContext() { // from class: com.microsoft.identity.common.internal.logging.DiagnosticContext.1
            @Override // java.util.Map
            public void clear() {
                requestContext.clear();
            }

            @Override // java.util.Map
            public boolean containsKey(Object obj) {
                return requestContext.containsKey(obj);
            }

            @Override // java.util.Map
            public boolean containsValue(Object obj) {
                return requestContext.containsValue(obj);
            }

            @Override // java.util.Map
            public Set<Map.Entry<String, String>> entrySet() {
                return requestContext.entrySet();
            }

            @Override // java.util.Map
            public boolean isEmpty() {
                return requestContext.isEmpty();
            }

            @Override // java.util.Map
            public Set<String> keySet() {
                return requestContext.keySet();
            }

            @Override // java.util.Map
            public void putAll(Map<? extends String, ? extends String> map) {
                requestContext.putAll(map);
            }

            @Override // java.util.Map
            public int size() {
                return requestContext.size();
            }

            @Override // com.microsoft.identity.common.java.logging.IRequestContext
            public String toJsonString() {
                return requestContext.toJsonString();
            }

            @Override // java.util.Map
            public Collection<String> values() {
                return requestContext.values();
            }

            @Override // java.util.Map
            public String get(Object obj) {
                return requestContext.get(obj);
            }

            @Override // java.util.Map
            public String put(String str, String str2) {
                return requestContext.put(str, str2);
            }

            @Override // java.util.Map
            public String remove(Object obj) {
                return requestContext.remove(obj);
            }
        };
    }

    private static void logDeprecationWarning() {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":logDeprecationWarning");
        if (sLogDeprecationWarning) {
            sLogDeprecationWarning = false;
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "This class is deprecated. Migrate usage to: com.microsoft.identity.common.logging.DiagnosticContext");
        }
    }

    public static void setRequestContext(IRequestContext iRequestContext) {
        com.microsoft.identity.common.logging.DiagnosticContext.setRequestContext(iRequestContext);
        logDeprecationWarning();
    }
}
