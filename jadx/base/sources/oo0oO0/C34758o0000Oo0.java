package oo0oO0;

import com.orion.notein.data.p602db.NoteCacheDatabase_Impl;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntity;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntityWithoutElementsJson;
import com.orion.notein.data.p602db.entity.cache.UpdateTextCacheCreationTimeEntity;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO0oo0.C26949OooO0o;
import o0OO0oo0.C26950OooO0o0;
import o0OOo0o.C27511o00o;
import o0Oo00o0.C28031OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o0000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34758o0000Oo0 implements o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteCacheDatabase_Impl f125139OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000OOO f125140OooO0O0 = new o0000OOO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34756o0000OOo f125141OooO0OO = new C34756o0000OOo();

    public C34758o0000Oo0(NoteCacheDatabase_Impl noteCacheDatabase_Impl) {
        this.f125139OooO00o = noteCacheDatabase_Impl;
    }

    @Override // oo0oO0.o0000O0O
    public final Object OooO00o(final UpdateTextCacheCreationTimeEntity updateTextCacheCreationTimeEntity, C28031OooO00o c28031OooO00o) {
        return C24734OooO0O0.OooO0oo(c28031OooO00o, this.f125139OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125129OooOo0o.f125141OooO0OO.o000oOoO((InterfaceC24747OooO0O0) obj, updateTextCacheCreationTimeEntity);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.o0000O0O
    public final Object OooO0O0(final String str, final int i, final int i2, C26950OooO0o0 c26950OooO0o0) {
        return C24734OooO0O0.OooO0oo(c26950OooO0o0, this.f125139OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000OO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i3 = i;
                int i4 = i2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM HandWritingTextCacheEntity WHERE page_id = ? and page_grid_x = ? and page_grid_y = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(2, i3);
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(3, i4);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_grid_x");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_grid_y");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "trajectory_hash");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "elements_json");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        handWritingTextCacheEntity = new HandWritingTextCacheEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return handWritingTextCacheEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.o0000O0O
    public final Object OooO0OO(final String str, final int i, final int i2, C26949OooO0o c26949OooO0o) {
        return C24734OooO0O0.OooO0oo(c26949OooO0o, this.f125139OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i3 = i;
                int i4 = i2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT page_id, page_grid_x, page_grid_y, trajectory_hash, creation_time, text FROM HandWritingTextCacheEntity WHERE page_id = ? and page_grid_x = ? and page_grid_y = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(2, i3);
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(3, i4);
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        handWritingTextCacheEntityWithoutElementsJson = new HandWritingTextCacheEntityWithoutElementsJson(interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(0), (int) interfaceC24749OooO0OoO0ooOOo.getLong(1), (int) interfaceC24749OooO0OoO0ooOOo.getLong(2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(3), interfaceC24749OooO0OoO0ooOOo.getLong(4), interfaceC24749OooO0OoO0ooOOo.isNull(5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(5));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return handWritingTextCacheEntityWithoutElementsJson;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.o0000O0O
    public final Object OooO0Oo(HandWritingTextCacheEntity[] handWritingTextCacheEntityArr, C27511o00o c27511o00o) {
        return C24734OooO0O0.OooO0oo(c27511o00o, this.f125139OooO00o, new o0000OO0(0, this, handWritingTextCacheEntityArr), false, true);
    }
}
