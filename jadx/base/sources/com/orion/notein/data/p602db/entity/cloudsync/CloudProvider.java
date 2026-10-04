package com.orion.notein.data.p602db.entity.cloudsync;

import OooO.OooO00o;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/CloudProvider;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "XIAOMI", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudProvider {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ CloudProvider[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String id;
    public static final CloudProvider XIAOMI = new CloudProvider("XIAOMI", 0, "xiaomi");
    public static final CloudProvider UNKNOWN = new CloudProvider(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, "unknown");

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/CloudProvider$Companion;", "", "<init>", "()V", "fromId", "Lcom/orion/notein/data/db/entity/cloudsync/CloudProvider;", "id", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CloudProvider fromId(String id) {
            CloudProvider cloudProvider;
            CloudProvider[] cloudProviderArrValues = CloudProvider.values();
            int length = cloudProviderArrValues.length;
            int i = 0;
            while (true) {
                cloudProvider = null;
                String lowerCase = null;
                if (i >= length) {
                    break;
                }
                CloudProvider cloudProvider2 = cloudProviderArrValues[i];
                String id2 = cloudProvider2.getId();
                if (id != null) {
                    lowerCase = id.toLowerCase(Locale.ROOT);
                    OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                }
                if (OooOOO0.OooO0O0(id2, lowerCase)) {
                    cloudProvider = cloudProvider2;
                    break;
                }
                i++;
            }
            return cloudProvider == null ? CloudProvider.UNKNOWN : cloudProvider;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CloudProvider[] $values() {
        return new CloudProvider[]{XIAOMI, UNKNOWN};
    }

    static {
        CloudProvider[] cloudProviderArr$values = $values();
        $VALUES = cloudProviderArr$values;
        $ENTRIES = OooO00o.OooO0O0(cloudProviderArr$values);
        INSTANCE = new Companion(null);
    }

    private CloudProvider(String str, int i, String str2) {
        this.id = str2;
    }

    public static InterfaceC34452OooO00o<CloudProvider> getEntries() {
        return $ENTRIES;
    }

    public static CloudProvider valueOf(String str) {
        return (CloudProvider) Enum.valueOf(CloudProvider.class, str);
    }

    public static CloudProvider[] values() {
        return (CloudProvider[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
