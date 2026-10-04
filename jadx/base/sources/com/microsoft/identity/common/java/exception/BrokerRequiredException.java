package com.microsoft.identity.common.java.exception;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import o000oo0.C24684Oooo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lcom/microsoft/identity/common/java/exception/BrokerRequiredException;", "Lcom/microsoft/identity/common/java/exception/BaseException;", "brokerPackageName", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class BrokerRequiredException extends BaseException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_ERROR_MESSAGE = "Broker is required but not installed.";
    public static final String ERROR_CODE = "broker_required";

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m80612d2 = {"Lcom/microsoft/identity/common/java/exception/BrokerRequiredException$Companion;", "", "()V", "DEFAULT_ERROR_MESSAGE", "", "ERROR_CODE", "getErrorMessage", "brokerPackageName", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getErrorMessage(String brokerPackageName) {
            return brokerPackageName != null ? C24684Oooo.OooO00o(FilenameUtils.EXTENSION_SEPARATOR, "Broker is required but not installed. Please install ", brokerPackageName) : BrokerRequiredException.DEFAULT_ERROR_MESSAGE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrokerRequiredException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BrokerRequiredException(String str, Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public BrokerRequiredException(String str, Throwable th) {
        super(ERROR_CODE, INSTANCE.getErrorMessage(str), th);
    }
}
