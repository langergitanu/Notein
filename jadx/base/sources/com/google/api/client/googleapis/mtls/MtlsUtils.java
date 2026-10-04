package com.google.api.client.googleapis.mtls;

import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.util.SecurityUtils;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MtlsUtils {
    private static final MtlsProvider MTLS_PROVIDER = new DefaultMtlsProvider();

    public static class DefaultMtlsProvider implements MtlsProvider {
        private static final String DEFAULT_CONTEXT_AWARE_METADATA_PATH = System.getProperty("user.home") + "/.secureConnect/context_aware_metadata.json";
        public static final String GOOGLE_API_USE_CLIENT_CERTIFICATE = "GOOGLE_API_USE_CLIENT_CERTIFICATE";
        private EnvironmentProvider envProvider;
        private String metadataPath;

        public interface EnvironmentProvider {
            String getenv(String str);
        }

        public static class SystemEnvironmentProvider implements EnvironmentProvider {
            @Override // com.google.api.client.googleapis.mtls.MtlsUtils.DefaultMtlsProvider.EnvironmentProvider
            public String getenv(String str) {
                return System.getenv(str);
            }
        }

        public DefaultMtlsProvider() {
            this(new SystemEnvironmentProvider(), DEFAULT_CONTEXT_AWARE_METADATA_PATH);
        }

        public static List<String> extractCertificateProviderCommand(InputStream inputStream) throws IOException {
            return ((ContextAwareMetadataJson) Utils.getDefaultJsonFactory().createJsonParser(inputStream).parse(ContextAwareMetadataJson.class)).getCommands();
        }

        public static int runCertificateProviderCommand(Process process, long j) throws InterruptedException, IOException {
            long jCurrentTimeMillis = System.currentTimeMillis();
            do {
                try {
                    process.exitValue();
                    return process.exitValue();
                } catch (IllegalThreadStateException unused) {
                    if (j > 0) {
                        Thread.sleep(Math.min(1 + j, 100L));
                    }
                    j -= System.currentTimeMillis() - jCurrentTimeMillis;
                }
            } while (j > 0);
            process.destroy();
            throw new IOException("cert provider command timed out");
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public KeyStore getKeyStore() throws GeneralSecurityException, IOException {
            try {
                Process processStart = new ProcessBuilder(extractCertificateProviderCommand(new FileInputStream(this.metadataPath))).start();
                int iRunCertificateProviderCommand = runCertificateProviderCommand(processStart, 1000L);
                if (iRunCertificateProviderCommand == 0) {
                    return SecurityUtils.createMtlsKeyStore(processStart.getInputStream());
                }
                throw new IOException("Cert provider command failed with exit code: " + iRunCertificateProviderCommand);
            } catch (FileNotFoundException unused) {
                return null;
            } catch (InterruptedException e) {
                throw new IOException("Interrupted executing certificate provider command", e);
            }
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public String getKeyStorePassword() {
            return "";
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public boolean useMtlsClientCertificate() {
            return TelemetryEventStrings.Value.TRUE.equals(this.envProvider.getenv(GOOGLE_API_USE_CLIENT_CERTIFICATE));
        }

        public DefaultMtlsProvider(EnvironmentProvider environmentProvider, String str) {
            this.envProvider = environmentProvider;
            this.metadataPath = str;
        }
    }

    public static MtlsProvider getDefaultMtlsProvider() {
        return MTLS_PROVIDER;
    }
}
