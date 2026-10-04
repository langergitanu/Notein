package com.orion.notein.data.p602db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o000oo0.InterfaceC24677OooOoO;
import o0OO000o.OooO0OO;
import oo0oO0.C34758o0000Oo0;
import oo0oO0.C34901o00o0Oo;
import oo0oO0.C34948o00oo0OO;
import oo0oO0.InterfaceC34899o00o0OOO;
import oo0oO0.InterfaceC34937o00oOoOo;
import oo0oO0.o0000O0O;

/* JADX INFO: loaded from: classes9.dex */
public final class NoteCacheDatabase_Impl extends NoteCacheDatabase {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile C34758o0000Oo0 f69787OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile C34901o00o0Oo f69788OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile C34948o00oo0OO f69789OooOOO0;

    @Override // o000oo0.AbstractC24673OooOo0O
    public final InterfaceC24677OooOoO OooO0o() {
        return new OooO0OO(this);
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final androidx.room.OooO0OO OooO0o0() {
        return new androidx.room.OooO0OO(this, new HashMap(0), new HashMap(0), "HandWritingTextCacheEntity", "PageGridModificationRecordEntity", "PdfTextCacheEntity");
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
        map.put(o0000O0O.class, list);
        map.put(InterfaceC34937o00oOoOo.class, list);
        map.put(InterfaceC34899o00o0OOO.class, list);
        return map;
    }

    @Override // com.orion.notein.data.p602db.NoteCacheDatabase
    public final o0000O0O OooOo0() {
        C34758o0000Oo0 c34758o0000Oo0;
        if (this.f69787OooOO0o != null) {
            return this.f69787OooOO0o;
        }
        synchronized (this) {
            try {
                if (this.f69787OooOO0o == null) {
                    this.f69787OooOO0o = new C34758o0000Oo0(this);
                }
                c34758o0000Oo0 = this.f69787OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34758o0000Oo0;
    }

    @Override // com.orion.notein.data.p602db.NoteCacheDatabase
    public final InterfaceC34899o00o0OOO OooOo0O() {
        C34901o00o0Oo c34901o00o0Oo;
        if (this.f69788OooOOO != null) {
            return this.f69788OooOOO;
        }
        synchronized (this) {
            try {
                if (this.f69788OooOOO == null) {
                    this.f69788OooOOO = new C34901o00o0Oo(this);
                }
                c34901o00o0Oo = this.f69788OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34901o00o0Oo;
    }

    @Override // com.orion.notein.data.p602db.NoteCacheDatabase
    public final InterfaceC34937o00oOoOo OooOo0o() {
        C34948o00oo0OO c34948o00oo0OO;
        if (this.f69789OooOOO0 != null) {
            return this.f69789OooOOO0;
        }
        synchronized (this) {
            try {
                if (this.f69789OooOOO0 == null) {
                    this.f69789OooOOO0 = new C34948o00oo0OO(this);
                }
                c34948o00oo0OO = this.f69789OooOOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34948o00oo0OO;
    }
}
