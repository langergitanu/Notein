package oo0oO0;

import com.hihonor.honorid.core.data.ChildrenInfo;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.StickerCollectionConverter;
import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OOO0oo.C27064OooO0O0;
import o0OOO0oo.C27066OooO0Oo;
import o0OOO0oo.C27069OooO0oO;
import o0OoO0oo.C28919o00o0O0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o0O0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34977o0O0000o implements InterfaceC34975o00ooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125602OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StickerCollectionConverter f125604OooO0OO = new StickerCollectionConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0000O f125603OooO0O0 = new o0O0000O(this);

    public C34977o0O0000o(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125602OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34975o00ooooO
    public final C24718OooOO0o OooO00o(String str) {
        o00O0OO o00o0oo2 = new o00O0OO(this, str, 1);
        return C24720OooOOO0.OooO00o(this.f125602OooO00o, new String[]{"StickerCollectionEntity"}, o00o0oo2);
    }

    @Override // oo0oO0.InterfaceC34975o00ooooO
    public final Object OooO0O0(String str, C27064OooO0O0 c27064OooO0O0) {
        return C24734OooO0O0.OooO0oo(c27064OooO0O0, this.f125602OooO00o, new C28919o00o0O0(str, 1), false, true);
    }

    @Override // oo0oO0.InterfaceC34975o00ooooO
    public final Object OooO0OO(String str, C27066OooO0Oo c27066OooO0Oo) {
        return C24734OooO0O0.OooO0oo(c27066OooO0Oo, this.f125602OooO00o, new oo0o0O0(this, str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34975o00ooooO
    public final List OooO0Oo() {
        return (List) C24734OooO0O0.OooO0o(this.f125602OooO00o, true, false, new o00O0OOO(this, 1));
    }

    @Override // oo0oO0.InterfaceC34975o00ooooO
    public final Object OooO0o(final String str, final String str2, C27069OooO0oO c27069OooO0oO) {
        return C24734OooO0O0.OooO0oo(c27069OooO0oO, this.f125602OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooooo
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                C34977o0O0000o c34977o0O0000o = this.f125596OooOo0o;
                c34977o0O0000o.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from StickerCollectionEntity where id = ? and user_id = ?");
                String str3 = str;
                try {
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str3);
                    }
                    String str4 = str2;
                    if (str4 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str4);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, ChildrenInfo.TAG_CHILDREN_INFO);
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "built_in");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    StickerCollectionEntity stickerCollectionEntity = null;
                    String strO000OoO = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        }
                        stickerCollectionEntity = new StickerCollectionEntity(strO000OoO2, strO000OoO3, strO000OoO4, c34977o0O0000o.f125604OooO0OO.stringToStickers(strO000OoO), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return stickerCollectionEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34975o00ooooO
    public final Object OooO0o0(final StickerCollectionEntity[] stickerCollectionEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        stickerCollectionEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125602OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125097OooOo0o.f125603OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, stickerCollectionEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34975o00ooooO
    public final List<StickerCollectionEntity> OooO0oO() {
        return (List) C24734OooO0O0.OooO0o(this.f125602OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O00000
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                C34977o0O0000o c34977o0O0000o = this.f125600OooOo0o;
                c34977o0O0000o.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from StickerCollectionEntity");
                try {
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, ChildrenInfo.TAG_CHILDREN_INFO);
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "built_in");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        }
                        arrayList.add(new StickerCollectionEntity(strO000OoO2, strO000OoO3, strO000OoO4, c34977o0O0000o.f125604OooO0OO.stringToStickers(strO000OoO), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)));
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        });
    }
}
