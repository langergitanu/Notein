package com.microsoft.identity.common.java.opentelemetry;

import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.crypto.ICryptoFactory;
import com.microsoft.identity.common.java.exception.IErrorInformation;
import com.microsoft.identity.common.java.util.ThrowableUtil;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.LongCounter;

/* JADX INFO: loaded from: classes9.dex */
public class CryptoFactoryTelemetryHelper {
    private static final LongCounter sFailedCryptoOperationCount = OTelUtility.createLongCounter("failed_crypto_operation_count", "Number of failed crypto operations");

    private static String getCryptoOperationEventName(CryptoObjectName cryptoObjectName, String str) {
        if (cryptoObjectName == null) {
            throw new NullPointerException("operationName is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("algorithm is marked non-null but is null");
        }
        return cryptoObjectName.name() + C18115b5.CONNECTOR + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T performCryptoOperationAndUploadTelemetry(CryptoObjectName cryptoObjectName, String str, ICryptoFactory iCryptoFactory, ICryptoOperation<T> iCryptoOperation) throws Exception {
        if (cryptoObjectName == null) {
            throw new NullPointerException("operationName is marked non-null but is null");
        }
        if (str == null) {
            throw new NullPointerException("algorithmName is marked non-null but is null");
        }
        if (iCryptoFactory == null) {
            throw new NullPointerException("cryptoFactory is marked non-null but is null");
        }
        if (iCryptoOperation == null) {
            throw new NullPointerException("cryptoOperation is marked non-null but is null");
        }
        try {
            return iCryptoOperation.perform();
        } catch (Exception e) {
            sFailedCryptoOperationCount.add(1L, Attributes.m80608of(AttributeKey.stringKey(AttributeName.crypto_controller.name()), iCryptoFactory.getTelemetryClassName().name(), AttributeKey.stringKey(AttributeName.crypto_operation.name()), getCryptoOperationEventName(cryptoObjectName, str), AttributeKey.stringKey(AttributeName.error_type.name()), e.getClass().getSimpleName(), AttributeKey.stringKey(AttributeName.error_code.name()), e instanceof IErrorInformation ? ((IErrorInformation) e).getErrorCode() : "N/A", AttributeKey.stringKey(AttributeName.crypto_exception_stack_trace.name()), ThrowableUtil.getStackTraceAsString(e)));
            throw e;
        }
    }
}
