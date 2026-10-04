package com.google.android.gms.internal.mlkit_translate;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
final class zzbd extends zzbh {
    public static final /* synthetic */ int zza = 0;
    private static final zzbb zzc;

    static {
        zzbb zzbbVar;
        Set<String> setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
        if (setSupportedFileAttributeViews.contains("posix")) {
            zzc = new zzbb() { // from class: com.google.android.gms.internal.mlkit_translate.zzaw
                @Override // com.google.android.gms.internal.mlkit_translate.zzbb
                public final FileAttribute zza() {
                    int i = zzbd.zza;
                    return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"));
                }
            };
            return;
        }
        if (!setSupportedFileAttributeViews.contains(RequestParameters.SUBRESOURCE_ACL)) {
            zzc = new zzbb() { // from class: com.google.android.gms.internal.mlkit_translate.zzax
                @Override // com.google.android.gms.internal.mlkit_translate.zzbb
                public final FileAttribute zza() throws IOException {
                    throw new IOException("unrecognized FileSystem type ".concat(String.valueOf(FileSystems.getDefault())));
                }
            };
            return;
        }
        try {
            UserPrincipalLookupService userPrincipalLookupService = FileSystems.getDefault().getUserPrincipalLookupService();
            String strZza = zzh.USER_NAME.zza();
            Objects.requireNonNull(strZza);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", new Class[0]);
                Method method2 = cls.getMethod("info", new Class[0]);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", new Class[0]).invoke(method2.invoke(method.invoke(null, new Object[0]), new Object[0]), new Object[0]), strZza);
                Objects.requireNonNull(objInvoke);
                strZza = (String) objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                int i = zzj.zza;
                if (cause == null) {
                    throw null;
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
            }
            final zzba zzbaVar = new zzba(zzt.zzi(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(userPrincipalLookupService.lookupPrincipalByName(strZza)).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build()));
            zzbbVar = new zzbb() { // from class: com.google.android.gms.internal.mlkit_translate.zzay
                @Override // com.google.android.gms.internal.mlkit_translate.zzbb
                public final FileAttribute zza() {
                    int i2 = zzbd.zza;
                    return zzbaVar;
                }
            };
        } catch (IOException e2) {
            zzbbVar = new zzbb() { // from class: com.google.android.gms.internal.mlkit_translate.zzaz
                @Override // com.google.android.gms.internal.mlkit_translate.zzbb
                public final FileAttribute zza() throws IOException {
                    throw new IOException("Could not find user", e2);
                }
            };
        }
        zzc = zzbbVar;
    }

    private zzbd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzbh
    public final File zza() {
        try {
            return Files.createTempDirectory(Paths.get(zzh.JAVA_IO_TMPDIR.zza(), new String[0]), null, zzc.zza()).toFile();
        } catch (IOException e) {
            throw new IllegalStateException("Failed to create directory", e);
        }
    }

    public /* synthetic */ zzbd(zzbc zzbcVar) {
        super(null);
    }
}
