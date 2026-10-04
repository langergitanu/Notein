package com.microsoft.identity.common.java.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m80612d2 = {"Lcom/microsoft/identity/common/java/logging/LogSession;", "", "()V", "Companion", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class LogSession {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m80612d2 = {"Lcom/microsoft/identity/common/java/logging/LogSession$Companion;", "", "<init>", "()V", "", "tag", "correlationId", "methodName", "LoO00ooO/OooOooO;", "logMethodCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final void logMethodCall(String tag, String correlationId, String methodName) {
            OooOOO0.OooO0oO(tag, "tag");
            OooOOO0.OooO0oO(methodName, "methodName");
            Logger.info(tag, correlationId, methodName);
        }

        private Companion() {
        }
    }
}
