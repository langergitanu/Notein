package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.CommentEntity;
import com.orion.notein.data.p602db.entity.CommentSortKeyUpdateEntity;
import com.orion.notein.data.p602db.entity.CommentUpdateQuoteEntity;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OO00o0.C26475OooO0Oo;
import o0OO00o0.C26477OooO0oO;
import o0OO00o0.C26478OooO0oo;
import o0Oo0o00.C28213o00oO0O;
import o0Ooo000.C29337OooOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0o0O.C33858OooO00o;
import oO0o0o0O.C33860OooO0OO;

/* JADX INFO: renamed from: oo0oO0.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34750Ooooooo implements InterfaceC34739OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34746OooooOo f125092OooO0O0 = new C34746OooooOo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34748Oooooo0 f125093OooO0OO = new C34748Oooooo0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34747Oooooo f125094OooO0Oo = new C34747Oooooo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C34749OoooooO f125095OooO0o0 = new C34749OoooooO();

    public C34750Ooooooo(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125091OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooO(String str, C26475OooO0Oo c26475OooO0Oo) {
        return C24734OooO0O0.OooO0oo(c26475OooO0Oo, this.f125091OooO00o, new C28213o00oO0O(str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooO00o(final String str, final String str2, C26478OooO0oo c26478OooO0oo) {
        return C24734OooO0O0.OooO0oo(c26478OooO0oo, this.f125091OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.Ooooo00
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("update CommentEntity set title = ? where quote_id = ?");
                String str3 = str2;
                try {
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str3);
                    }
                    String str4 = str;
                    if (str4 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str4);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooO0O0(CommentUpdateQuoteEntity[] commentUpdateQuoteEntityArr, C26477OooO0oO c26477OooO0oO) {
        return C24734OooO0O0.OooO0oo(c26477OooO0oO, this.f125091OooO00o, new C29337OooOO0(1, this, commentUpdateQuoteEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooO0OO(final CommentEntity[] commentEntityArr, o0OO00o0.OooO oooO) {
        commentEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(oooO, this.f125091OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooooO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125088OooOo0o.f125093OooO0OO.OoooOOO((InterfaceC24747OooO0O0) obj, commentEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooO0Oo(CommentSortKeyUpdateEntity[] commentSortKeyUpdateEntityArr, o0OO00o0.OooOO0 oooOO02) {
        commentSortKeyUpdateEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(oooOO02, this.f125091OooO00o, new C34743Ooooo0o(0, this, commentSortKeyUpdateEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooO0o(String str, o0OO00o0.OooO0OO oooO0OO) {
        return C24734OooO0O0.OooO0oo(oooO0OO, this.f125091OooO00o, new C33858OooO00o(str, 1), false, true);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final C24718OooOO0o OooO0o0(String str) {
        C33860OooO0OO c33860OooO0OO = new C33860OooO0OO(str, 1);
        return C24720OooOOO0.OooO00o(this.f125091OooO00o, new String[]{"CommentEntity"}, c33860OooO0OO);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final List<CommentEntity> OooO0oO(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125091OooO00o, true, false, new C34745OooooOO(str, 0));
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooO0oo(String[] strArr, o0OO00o0.OooO0O0 oooO0O0) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("delete from CommentEntity where id in (");
        C25022OooO0O0.OooO0OO(strArr.length, sbOooO0OO);
        sbOooO0OO.append(")");
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125091OooO00o, new C34741OoooOoo(sbOooO0OO.toString(), strArr, 0), false, true);
    }

    @Override // oo0oO0.InterfaceC34739OoooOo0
    public final Object OooOO0(CommentEntity[] commentEntityArr, AbstractC32476OooO abstractC32476OooO) {
        commentEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125091OooO00o, new C34740OoooOoO(0, this, commentEntityArr), false, true);
    }
}
