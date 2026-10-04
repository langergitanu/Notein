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
import o0OO000o.OooO00o;
import oo0ooO.C35014OooOO0;
import oo0ooO.C35022OooOOo0;
import oo0ooO.C35024OooOo;
import oo0ooO.InterfaceC35006OooO00o;
import oo0ooO.InterfaceC35015OooOO0O;
import oo0ooO.InterfaceC35021OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class CloudSyncDatabase_Impl extends CloudSyncDatabase {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile C35022OooOOo0 f69779OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile C35024OooOo f69780OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile C35014OooOO0 f69781OooOOO0;

    @Override // o000oo0.AbstractC24673OooOo0O
    public final InterfaceC24677OooOoO OooO0o() {
        return new OooO00o(this);
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final OooO0OO OooO0o0() {
        return new OooO0OO(this, new HashMap(0), new HashMap(0), "cloud_metas", "cloud_metas_local", "drive_snapshot_cache");
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
        map.put(InterfaceC35015OooOO0O.class, list);
        map.put(InterfaceC35006OooO00o.class, list);
        map.put(InterfaceC35021OooOOo.class, list);
        return map;
    }

    @Override // com.orion.notein.data.p602db.CloudSyncDatabase
    public final InterfaceC35006OooO00o OooOo0() {
        C35014OooOO0 c35014OooOO0;
        if (this.f69781OooOOO0 != null) {
            return this.f69781OooOOO0;
        }
        synchronized (this) {
            try {
                if (this.f69781OooOOO0 == null) {
                    this.f69781OooOOO0 = new C35014OooOO0(this);
                }
                c35014OooOO0 = this.f69781OooOOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c35014OooOO0;
    }

    @Override // com.orion.notein.data.p602db.CloudSyncDatabase
    public final InterfaceC35015OooOO0O OooOo0O() {
        C35022OooOOo0 c35022OooOOo0;
        if (this.f69779OooOO0o != null) {
            return this.f69779OooOO0o;
        }
        synchronized (this) {
            try {
                if (this.f69779OooOO0o == null) {
                    this.f69779OooOO0o = new C35022OooOOo0(this);
                }
                c35022OooOOo0 = this.f69779OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c35022OooOOo0;
    }

    @Override // com.orion.notein.data.p602db.CloudSyncDatabase
    public final InterfaceC35021OooOOo OooOo0o() {
        C35024OooOo c35024OooOo;
        if (this.f69780OooOOO != null) {
            return this.f69780OooOOO;
        }
        synchronized (this) {
            try {
                if (this.f69780OooOOO == null) {
                    this.f69780OooOOO = new C35024OooOo(this);
                }
                c35024OooOo = this.f69780OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c35024OooOo;
    }
}
