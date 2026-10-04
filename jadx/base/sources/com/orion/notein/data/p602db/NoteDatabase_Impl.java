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
import o0OO000o.C26468OooO0oo;
import oo0oO0.AbstractC34938o00oOoo;
import oo0oO0.C34702OooO0O0;
import oo0oO0.C34738OoooOOo;
import oo0oO0.C34778o000Oo;
import oo0oO0.C34790o000o000;
import oo0oO0.C34798o000o0o0;
import oo0oO0.C34809o000ooO0;
import oo0oO0.C34827o00O0o0O;
import oo0oO0.C34876o00OooOO;
import oo0oO0.C34950o00oo0o;
import oo0oO0.C34965o00ooo;
import oo0oO0.C34977o0O0000o;
import oo0oO0.C34978o0O000o;
import oo0oO0.C34987o0O0O0o;
import oo0oO0.InterfaceC34701OooO00o;
import oo0oO0.InterfaceC34723Oooo;
import oo0oO0.InterfaceC34783o000OoOO;
import oo0oO0.InterfaceC34789o000o00;
import oo0oO0.InterfaceC34791o000o00O;
import oo0oO0.InterfaceC34797o000o0o;
import oo0oO0.InterfaceC34824o00O0o;
import oo0oO0.InterfaceC34847o00Oo0;
import oo0oO0.InterfaceC34865o00OoOo;
import oo0oO0.InterfaceC34927o00oOOo;
import oo0oO0.InterfaceC34947o00oo0O0;
import oo0oO0.InterfaceC34975o00ooooO;
import oo0oO0.o00000O0;
import oo0oO0.o0000O0;
import oo0oO0.o000O0Oo;
import oo0oO0.o00O0;
import oo0oO0.o00O0O;
import oo0oO0.o00OO;
import oo0oO0.o00OOO0O;
import oo0oO0.o00OOOOo;
import oo0oO0.o0O000;
import oo0oO0.o0O00oO0;
import oo0oO0.o0O0O0O;
import oo0oO0.o0O0O0Oo;
import oo0oO0.o0OoOo0;
import oo0oO0.o0o0Oo;
import oo0oO0.oo00o;
import oo0oO0.oo0O;

/* JADX INFO: loaded from: classes9.dex */
public final class NoteDatabase_Impl extends NoteDatabase {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile oo0O f69806OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile C34950o00oo0o f69807OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile o0000O0 f69808OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile o0O0O0O f69809OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile C34987o0O0O0o f69810OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile C34738OoooOOo f69811OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile o00OOOOo f69812OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile C34809o000ooO0 f69813OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile C34702OooO0O0 f69814OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile o00O0O f69815OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile C34827o00O0o0O f69816OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public volatile C34876o00OooOO f69817OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile oo00o f69818OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile C34978o0O000o f69819OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile C34977o0O0000o f69820OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile C34778o000Oo f69821OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public volatile C34790o000o000 f69822OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile o00OOO0O f69823OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile C34798o000o0o0 f69824OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public volatile C34965o00ooo f69825OooOooo;

    @Override // o000oo0.AbstractC24673OooOo0O
    public final InterfaceC24677OooOoO OooO0o() {
        return new C26468OooO0oo(this);
    }

    @Override // o000oo0.AbstractC24673OooOo0O
    public final OooO0OO OooO0o0() {
        return new OooO0OO(this, new HashMap(0), new HashMap(0), "NoteMetaEntity", "FolderEntity", "PenInfoEntity", "ToolBoxInfoEntity", "UserEntity", "NotePlaceholderEntity", "ColorSetEntity", "MyTemplateEntity", "CouponEntity", "NoteinMessageEntity", "NoteFileEntity", "LocalNoteFileVersionEntity", "ads", "StickerCollectionEntity", "StickerEntity", "labels", "item_label_cross_ref", "NotePdfLostInfoEntity", "LatestOpenedNoteEntity", "NoteConflictEntity", "material_download_state", "downloaded_material");
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
        map.put(InterfaceC34824o00O0o.class, list);
        map.put(o00000O0.class, list);
        map.put(InterfaceC34947o00oo0O0.class, list);
        map.put(o0O00oO0.class, list);
        map.put(o0O0O0Oo.class, list);
        map.put(o0o0Oo.class, list);
        map.put(InterfaceC34723Oooo.class, list);
        map.put(InterfaceC34797o000o0o.class, list);
        map.put(InterfaceC34927o00oOOo.class, list);
        map.put(o0OoOo0.class, list);
        map.put(InterfaceC34865o00OoOo.class, list);
        map.put(AbstractC34938o00oOoo.class, list);
        map.put(InterfaceC34701OooO00o.class, list);
        map.put(InterfaceC34789o000o00.class, list);
        map.put(InterfaceC34975o00ooooO.class, list);
        map.put(o0O000.class, list);
        map.put(o000O0Oo.class, list);
        map.put(o00OO.class, list);
        map.put(o00O0.class, list);
        map.put(InterfaceC34783o000OoOO.class, list);
        map.put(InterfaceC34791o000o00O.class, list);
        map.put(InterfaceC34847o00Oo0.class, list);
        return map;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34847o00Oo0 OooOo() {
        C34965o00ooo c34965o00ooo;
        if (this.f69825OooOooo != null) {
            return this.f69825OooOooo;
        }
        synchronized (this) {
            try {
                if (this.f69825OooOooo == null) {
                    this.f69825OooOooo = new C34965o00ooo(this);
                }
                c34965o00ooo = this.f69825OooOooo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34965o00ooo;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34701OooO00o OooOo0() {
        C34702OooO0O0 c34702OooO0O0;
        if (this.f69814OooOo != null) {
            return this.f69814OooOo;
        }
        synchronized (this) {
            try {
                if (this.f69814OooOo == null) {
                    this.f69814OooOo = new C34702OooO0O0();
                }
                c34702OooO0O0 = this.f69814OooOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34702OooO0O0;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34723Oooo OooOo0O() {
        C34738OoooOOo c34738OoooOOo;
        if (this.f69811OooOOo != null) {
            return this.f69811OooOOo;
        }
        synchronized (this) {
            try {
                if (this.f69811OooOOo == null) {
                    this.f69811OooOOo = new C34738OoooOOo(this);
                }
                c34738OoooOOo = this.f69811OooOOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34738OoooOOo;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o0OoOo0 OooOo0o() {
        o00O0O o00o0o2;
        if (this.f69815OooOo0 != null) {
            return this.f69815OooOo0;
        }
        synchronized (this) {
            try {
                if (this.f69815OooOo0 == null) {
                    this.f69815OooOo0 = new o00O0O(this);
                }
                o00o0o2 = this.f69815OooOo0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o00o0o2;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o000O0Oo OooOoO() {
        C34778o000Oo c34778o000Oo;
        if (this.f69821OooOoOO != null) {
            return this.f69821OooOoOO;
        }
        synchronized (this) {
            try {
                if (this.f69821OooOoOO == null) {
                    this.f69821OooOoOO = new C34778o000Oo(this);
                }
                c34778o000Oo = this.f69821OooOoOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34778o000Oo;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o00000O0 OooOoO0() {
        o0000O0 o0000o0;
        if (this.f69808OooOOO0 != null) {
            return this.f69808OooOOO0;
        }
        synchronized (this) {
            try {
                if (this.f69808OooOOO0 == null) {
                    this.f69808OooOOO0 = new o0000O0(this);
                }
                o0000o0 = this.f69808OooOOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0000o0;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34783o000OoOO OooOoOO() {
        C34790o000o000 c34790o000o000;
        if (this.f69822OooOoo != null) {
            return this.f69822OooOoo;
        }
        synchronized (this) {
            try {
                if (this.f69822OooOoo == null) {
                    this.f69822OooOoo = new C34790o000o000(this);
                }
                c34790o000o000 = this.f69822OooOoo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34790o000o000;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34797o000o0o OooOoo() {
        C34809o000ooO0 c34809o000ooO0;
        if (this.f69813OooOOoo != null) {
            return this.f69813OooOOoo;
        }
        synchronized (this) {
            try {
                if (this.f69813OooOOoo == null) {
                    this.f69813OooOOoo = new C34809o000ooO0(this);
                }
                c34809o000ooO0 = this.f69813OooOOoo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34809o000ooO0;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34791o000o00O OooOoo0() {
        C34798o000o0o0 c34798o000o0o0;
        if (this.f69824OooOooO != null) {
            return this.f69824OooOooO;
        }
        synchronized (this) {
            try {
                if (this.f69824OooOooO == null) {
                    this.f69824OooOooO = new C34798o000o0o0(this);
                }
                c34798o000o0o0 = this.f69824OooOooO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34798o000o0o0;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final AbstractC34938o00oOoo OooOooO() {
        oo00o oo00oVar;
        if (this.f69818OooOo0o != null) {
            return this.f69818OooOo0o;
        }
        synchronized (this) {
            try {
                if (this.f69818OooOo0o == null) {
                    this.f69818OooOo0o = new oo00o(this);
                }
                oo00oVar = this.f69818OooOo0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oo00oVar;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34927o00oOOo OooOooo() {
        C34827o00O0o0O c34827o00O0o0O;
        if (this.f69816OooOo00 != null) {
            return this.f69816OooOo00;
        }
        synchronized (this) {
            try {
                if (this.f69816OooOo00 == null) {
                    this.f69816OooOo00 = new C34827o00O0o0O(this);
                }
                c34827o00O0o0O = this.f69816OooOo00;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34827o00O0o0O;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34865o00OoOo Oooo0() {
        C34876o00OooOO c34876o00OooOO;
        if (this.f69817OooOo0O != null) {
            return this.f69817OooOo0O;
        }
        synchronized (this) {
            try {
                if (this.f69817OooOo0O == null) {
                    this.f69817OooOo0O = new C34876o00OooOO(this);
                }
                c34876o00OooOO = this.f69817OooOo0O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34876o00OooOO;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34824o00O0o Oooo000() {
        oo0O oo0o;
        if (this.f69806OooOO0o != null) {
            return this.f69806OooOO0o;
        }
        synchronized (this) {
            try {
                if (this.f69806OooOO0o == null) {
                    this.f69806OooOO0o = new oo0O(this);
                }
                oo0o = this.f69806OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oo0o;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o00OO Oooo00O() {
        o00OOO0O o00ooo0o;
        if (this.f69823OooOoo0 != null) {
            return this.f69823OooOoo0;
        }
        synchronized (this) {
            try {
                if (this.f69823OooOoo0 == null) {
                    this.f69823OooOoo0 = new o00OOO0O(this);
                }
                o00ooo0o = this.f69823OooOoo0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o00ooo0o;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o0o0Oo Oooo00o() {
        o00OOOOo o00ooooo2;
        if (this.f69812OooOOo0 != null) {
            return this.f69812OooOOo0;
        }
        synchronized (this) {
            try {
                if (this.f69812OooOOo0 == null) {
                    this.f69812OooOOo0 = new o00OOOOo(this);
                }
                o00ooooo2 = this.f69812OooOOo0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o00ooooo2;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34947o00oo0O0 Oooo0O0() {
        C34950o00oo0o c34950o00oo0o;
        if (this.f69807OooOOO != null) {
            return this.f69807OooOOO;
        }
        synchronized (this) {
            try {
                if (this.f69807OooOOO == null) {
                    this.f69807OooOOO = new C34950o00oo0o(this);
                }
                c34950o00oo0o = this.f69807OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34950o00oo0o;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final InterfaceC34975o00ooooO Oooo0OO() {
        C34977o0O0000o c34977o0O0000o;
        if (this.f69820OooOoO0 != null) {
            return this.f69820OooOoO0;
        }
        synchronized (this) {
            try {
                if (this.f69820OooOoO0 == null) {
                    this.f69820OooOoO0 = new C34977o0O0000o(this);
                }
                c34977o0O0000o = this.f69820OooOoO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34977o0O0000o;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o0O00oO0 Oooo0o() {
        o0O0O0O o0o0o0o;
        if (this.f69809OooOOOO != null) {
            return this.f69809OooOOOO;
        }
        synchronized (this) {
            try {
                if (this.f69809OooOOOO == null) {
                    this.f69809OooOOOO = new o0O0O0O(this);
                }
                o0o0o0o = this.f69809OooOOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0o0o0o;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o0O000 Oooo0o0() {
        C34978o0O000o c34978o0O000o;
        if (this.f69819OooOoO != null) {
            return this.f69819OooOoO;
        }
        synchronized (this) {
            try {
                if (this.f69819OooOoO == null) {
                    this.f69819OooOoO = new C34978o0O000o(this);
                }
                c34978o0O000o = this.f69819OooOoO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34978o0O000o;
    }

    @Override // com.orion.notein.data.p602db.NoteDatabase
    public final o0O0O0Oo Oooo0oO() {
        C34987o0O0O0o c34987o0O0O0o;
        if (this.f69810OooOOOo != null) {
            return this.f69810OooOOOo;
        }
        synchronized (this) {
            try {
                if (this.f69810OooOOOo == null) {
                    this.f69810OooOOOo = new C34987o0O0O0o(this);
                }
                c34987o0O0O0o = this.f69810OooOOOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c34987o0O0O0o;
    }
}
