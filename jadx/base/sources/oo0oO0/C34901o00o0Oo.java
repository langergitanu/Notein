package oo0oO0;

import com.orion.notein.data.p602db.NoteCacheDatabase_Impl;
import com.orion.notein.data.p602db.entity.cache.PageGridModificationRecordEntity;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OoO0oo.C28956o00oOo00;
import o0OoO0oo.C28981oo000o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00o0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34901o00o0Oo implements InterfaceC34899o00o0OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteCacheDatabase_Impl f125442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34902o00o0Oo0 f125443OooO0O0 = new C34902o00o0Oo0();

    public C34901o00o0Oo(NoteCacheDatabase_Impl noteCacheDatabase_Impl) {
        this.f125442OooO00o = noteCacheDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34899o00o0OOO
    public final Object OooO00o(final String str, final int i, final int i2, o0OOO0OO.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125442OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o0OOo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i3 = i;
                int i4 = i2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PageGridModificationRecordEntity WHERE page_id = ? and page_grid_x = ? and page_grid_y = ?");
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
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        pageGridModificationRecordEntity = new PageGridModificationRecordEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return pageGridModificationRecordEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34899o00o0OOO
    public final Object OooO0O0(PageGridModificationRecordEntity[] pageGridModificationRecordEntityArr, C28956o00oOo00 c28956o00oOo00) {
        pageGridModificationRecordEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c28956o00oOo00, this.f125442OooO00o, new C28981oo000o(1, this, pageGridModificationRecordEntityArr), false, true);
    }
}
