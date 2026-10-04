package com.orion.notein.domain.models.material;

import OooO.OooO00o;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/Entitlement;", "", "<init>", "(Ljava/lang/String;I)V", "FREE", "VIP", "PAID", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class Entitlement {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ Entitlement[] $VALUES;
    public static final Entitlement FREE = new Entitlement("FREE", 0);
    public static final Entitlement VIP = new Entitlement("VIP", 1);
    public static final Entitlement PAID = new Entitlement("PAID", 2);

    private static final /* synthetic */ Entitlement[] $values() {
        return new Entitlement[]{FREE, VIP, PAID};
    }

    static {
        Entitlement[] entitlementArr$values = $values();
        $VALUES = entitlementArr$values;
        $ENTRIES = OooO00o.OooO0O0(entitlementArr$values);
    }

    private Entitlement(String str, int i) {
    }

    public static InterfaceC34452OooO00o<Entitlement> getEntries() {
        return $ENTRIES;
    }

    public static Entitlement valueOf(String str) {
        return (Entitlement) Enum.valueOf(Entitlement.class, str);
    }

    public static Entitlement[] values() {
        return (Entitlement[]) $VALUES.clone();
    }
}
