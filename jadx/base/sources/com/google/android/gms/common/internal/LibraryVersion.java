package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.IOUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    public static LibraryVersion getInstance() {
        return zzb;
    }

    @Deprecated
    public String getVersion(String str) throws Throwable {
        IOException e;
        String str2;
        InputStream resourceAsStream;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzc.containsKey(str)) {
            return (String) this.zzc.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = LibraryVersion.class.getResourceAsStream("/" + str + ".properties");
            } catch (IOException e2) {
                e = e2;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                property = properties.getProperty("version", null);
                zza.m74910v("LibraryVersion", str + " version is " + property);
            } else {
                zza.m74912w("LibraryVersion", "Failed to get app version for libraryName: " + str);
            }
        } catch (IOException e3) {
            e = e3;
            String str3 = property;
            inputStream = resourceAsStream;
            str2 = str3;
            zza.m74907e("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
            InputStream inputStream2 = inputStream;
            property = str2;
            resourceAsStream = inputStream2;
        } catch (Throwable th2) {
            th = th2;
            inputStream = resourceAsStream;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
            throw th;
        }
        if (resourceAsStream != null) {
            IOUtils.closeQuietly(resourceAsStream);
        }
        if (property == null) {
            zza.m74904d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            property = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        this.zzc.put(str, property);
        return property;
    }
}
