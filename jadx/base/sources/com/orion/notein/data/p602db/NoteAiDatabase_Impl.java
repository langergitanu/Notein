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
import o0OO000o.OooO0O0;
import oo0oO0.C34712OooOOoo;
import oo0oO0.C34867o00OoOoO;
import oo0oO0.InterfaceC34703OooO0OO;
import oo0oO0.InterfaceC34708OooOO0o;
import oo0oO0.InterfaceC34808o000ooO;
import oo0oO0.InterfaceC34994oOooo0o;
import oo0oO0.OooOO0O;
import oo0oO0.o0O0oo0o;
import oo0oO0.o0O0ooO;
import oo0oO0.o0oO0O0o;

/* JADX INFO: loaded from: classes9.dex */
public final class NoteAiDatabase_Impl extends NoteAiDatabase {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile o0O0oo0o f69782OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile OooOO0O f69783OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile o0O0ooO f69784OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile C34712OooOOoo f69785OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile C34867o00OoOoO f69786OooOOOo;

    @Override // o000oo0.AbstractC24673OooOo0O
    public final InterfaceC24677OooOoO OooO0o() {
        return new OooO0O0(this);
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final OooO0OO OooO0o0() {
        return new OooO0OO(this, new HashMap(0), new HashMap(0), "UploadRecordEntity", "NoteSummaryEntity", "NoteAiContentEntity", "AiOcrSessionEntity", "AiOcrTextPageEntity", "NoteinAiQuotaRecordEntity", "NoteinAiQuotaRecordEntityV2");
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
        map.put(o0oO0O0o.class, list);
        map.put(InterfaceC34808o000ooO.class, list);
        map.put(InterfaceC34703OooO0OO.class, list);
        map.put(InterfaceC34708OooOO0o.class, list);
        map.put(InterfaceC34994oOooo0o.class, list);
        return map;
    }

    @Override // com.orion.notein.data.p602db.NoteAiDatabase
    public final InterfaceC34994oOooo0o OooOo() {
        C34867o00OoOoO c34867o00OoOoO;
        if (this.f69786OooOOOo != null) {
            return this.f69786OooOOOo;
        }
        synchronized (this) {
            try {
                if (this.f69786OooOOOo == null) {
                    this.f69786OooOOOo = new C34867o00OoOoO(this);
                }
                c34867o00OoOoO = this.f69786OooOOOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34867o00OoOoO;
    }

    @Override // com.orion.notein.data.p602db.NoteAiDatabase
    public final InterfaceC34703OooO0OO OooOo0() {
        OooOO0O oooOO0O;
        if (this.f69783OooOOO != null) {
            return this.f69783OooOOO;
        }
        synchronized (this) {
            try {
                if (this.f69783OooOOO == null) {
                    this.f69783OooOOO = new OooOO0O(this);
                }
                oooOO0O = this.f69783OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooOO0O;
    }

    @Override // com.orion.notein.data.p602db.NoteAiDatabase
    public final InterfaceC34708OooOO0o OooOo0O() {
        C34712OooOOoo c34712OooOOoo;
        if (this.f69785OooOOOO != null) {
            return this.f69785OooOOOO;
        }
        synchronized (this) {
            try {
                if (this.f69785OooOOOO == null) {
                    this.f69785OooOOOO = new C34712OooOOoo(this);
                }
                c34712OooOOoo = this.f69785OooOOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34712OooOOoo;
    }

    @Override // com.orion.notein.data.p602db.NoteAiDatabase
    public final InterfaceC34808o000ooO OooOo0o() {
        o0O0ooO o0o0ooo;
        if (this.f69784OooOOO0 != null) {
            return this.f69784OooOOO0;
        }
        synchronized (this) {
            try {
                if (this.f69784OooOOO0 == null) {
                    this.f69784OooOOO0 = new o0O0ooO(this);
                }
                o0o0ooo = this.f69784OooOOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0o0ooo;
    }

    @Override // com.orion.notein.data.p602db.NoteAiDatabase
    public final o0oO0O0o OooOoO0() {
        o0O0oo0o o0o0oo0o;
        if (this.f69782OooOO0o != null) {
            return this.f69782OooOO0o;
        }
        synchronized (this) {
            try {
                if (this.f69782OooOO0o == null) {
                    this.f69782OooOO0o = new o0O0oo0o();
                }
                o0o0oo0o = this.f69782OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0o0oo0o;
    }
}
