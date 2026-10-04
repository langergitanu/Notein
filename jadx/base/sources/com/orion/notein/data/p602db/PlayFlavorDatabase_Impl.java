package com.orion.notein.data.p602db;

import androidx.room.OooO0OO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o000oo0.InterfaceC24677OooOoO;
import o0OO000o.OooO;
import oo0oO0.C34852o00Oo0Oo;
import oo0oO0.C34856o00Oo0oo;
import oo0oO0.C34866o00OoOo0;
import oo0oO0.C34955o00ooO00;
import oo0oO0.InterfaceC34848o00Oo000;
import oo0oO0.InterfaceC34854o00Oo0o0;
import oo0oO0.InterfaceC34952o00oo0oO;
import oo0oO0.o0oOO;

/* JADX INFO: loaded from: classes9.dex */
public final class PlayFlavorDatabase_Impl extends PlayFlavorDatabase {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile C34955o00ooO00 f69826OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile C34866o00OoOo0 f69827OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile C34852o00Oo0Oo f69828OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile C34856o00Oo0oo f69829OooOOOO;

    @Override // o000oo0.AbstractC24673OooOo0O
    public final InterfaceC24677OooOoO OooO0o() {
        return new OooO(this);
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final OooO0OO OooO0o0() {
        return new OooO0OO(this, new HashMap(0), new HashMap(0), "PlayPurchaseServerEntity", "NoteinFirebaseUserEntity", "NoteinGoogleSubscriptionPurchaseEntity", "NoteinGoogleInAppPurchaseEntity", "NoteinGoogleDeveloperOfferEntity");
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final List OooO0oo(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final Set<Class<Object>> OooOO0o() {
        return new HashSet();
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final Map<Class<?>, List<Class<?>>> OooOOO0() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(InterfaceC34952o00oo0oO.class, list);
        map.put(InterfaceC34848o00Oo000.class, list);
        map.put(o0oOO.class, list);
        map.put(InterfaceC34854o00Oo0o0.class, list);
        return map;
    }

    @Override // com.orion.notein.data.p602db.PlayFlavorDatabase
    public final InterfaceC34952o00oo0oO OooOo() {
        C34955o00ooO00 c34955o00ooO00;
        if (this.f69826OooOO0o != null) {
            return this.f69826OooOO0o;
        }
        synchronized (this) {
            try {
                if (this.f69826OooOO0o == null) {
                    this.f69826OooOO0o = new C34955o00ooO00(this);
                }
                c34955o00ooO00 = this.f69826OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34955o00ooO00;
    }

    @Override // com.orion.notein.data.p602db.PlayFlavorDatabase
    public final InterfaceC34848o00Oo000 OooOo0() {
        C34852o00Oo0Oo c34852o00Oo0Oo;
        if (this.f69828OooOOO0 != null) {
            return this.f69828OooOOO0;
        }
        synchronized (this) {
            try {
                if (this.f69828OooOOO0 == null) {
                    this.f69828OooOOO0 = new C34852o00Oo0Oo(this);
                }
                c34852o00Oo0Oo = this.f69828OooOOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34852o00Oo0Oo;
    }

    @Override // com.orion.notein.data.p602db.PlayFlavorDatabase
    public final InterfaceC34854o00Oo0o0 OooOo0O() {
        C34856o00Oo0oo c34856o00Oo0oo;
        if (this.f69829OooOOOO != null) {
            return this.f69829OooOOOO;
        }
        synchronized (this) {
            try {
                if (this.f69829OooOOOO == null) {
                    this.f69829OooOOOO = new C34856o00Oo0oo(this);
                }
                c34856o00Oo0oo = this.f69829OooOOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34856o00Oo0oo;
    }

    @Override // com.orion.notein.data.p602db.PlayFlavorDatabase
    public final o0oOO OooOo0o() {
        C34866o00OoOo0 c34866o00OoOo0;
        if (this.f69827OooOOO != null) {
            return this.f69827OooOOO;
        }
        synchronized (this) {
            try {
                if (this.f69827OooOOO == null) {
                    this.f69827OooOOO = new C34866o00OoOo0(this);
                }
                c34866o00OoOo0 = this.f69827OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34866o00OoOo0;
    }
}
