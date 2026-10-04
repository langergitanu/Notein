package com.google.firebase.analytics;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fJ#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\t\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m80612d2 = {"Lcom/google/firebase/analytics/ParametersBuilder;", "", "<init>", "()V", "", "key", "", "value", "LoO00ooO/OooOooO;", "param", "(Ljava/lang/String;D)V", "", "(Ljava/lang/String;J)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    /* JADX INFO: renamed from: getBundle, reason: from getter */
    public final Bundle getZza() {
        return this.zza;
    }

    public final void param(String key, double value) {
        OooOOO0.OooO0oO(key, "key");
        this.zza.putDouble(key, value);
    }

    public final void param(String key, long value) {
        OooOOO0.OooO0oO(key, "key");
        this.zza.putLong(key, value);
    }

    public final void param(String key, Bundle value) {
        OooOOO0.OooO0oO(key, "key");
        OooOOO0.OooO0oO(value, "value");
        this.zza.putBundle(key, value);
    }

    public final void param(String key, String value) {
        OooOOO0.OooO0oO(key, "key");
        OooOOO0.OooO0oO(value, "value");
        this.zza.putString(key, value);
    }

    public final void param(String key, Bundle[] value) {
        OooOOO0.OooO0oO(key, "key");
        OooOOO0.OooO0oO(value, "value");
        this.zza.putParcelableArray(key, value);
    }
}
