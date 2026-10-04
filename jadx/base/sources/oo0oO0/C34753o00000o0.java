package oo0oO0;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.penkit.models.LayerInfo;
import java.io.Serializable;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34753o00000o0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125123OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Serializable f125124OooOoO0;

    public /* synthetic */ C34753o00000o0(Object obj, Serializable serializable, int i) {
        this.f125123OooOo0o = i;
        this.f125122OooOo = obj;
        this.f125124OooOoO0 = serializable;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        switch (this.f125123OooOo0o) {
            case 0:
                ((o0000O0) this.f125122OooOo).f125132OooO0OO.OoooOOO((InterfaceC24747OooO0O0) obj, (FolderEntity[]) this.f125124OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            default:
                C34897o00o0OO c34897o00o0OO = (C34897o00o0OO) this.f125122OooOo;
                c34897o00o0OO.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PageEntity where id = ?");
                String str = (String) this.f125124OooOoO0;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_spec");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_orientation");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, LayerInfo.PAPER_THEME_LAYER_ID);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_color");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_padding");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_style_json");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_title");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_index");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "history_page_id_list");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation_direction_index");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        pageEntity = new PageEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), C34897o00o0OO.OooOOO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12)) != 0, (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo15) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo15), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo16), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo17)) != 0, c34897o00o0OO.f125434OooO0OO.stringToChildren(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo18) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo18)), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo19));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return pageEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
