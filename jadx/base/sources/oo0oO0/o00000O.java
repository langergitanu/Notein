package oo0oO0;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00000O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f125112OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125113OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125114OooOoO0;

    public /* synthetic */ o00000O(String str, String str2) {
        this.f125112OooOo = str;
        this.f125114OooOoO0 = str2;
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
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo;
        switch (this.f125113OooOo0o) {
            case 0:
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from FolderEntity where parent_id = ? and user_id = ?");
                String str = this.f125112OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    String str2 = (String) this.f125114OooOoO0;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo2;
                        int i2 = iOooO0Oo3;
                        arrayList.add(new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12))));
                        iOooO0Oo3 = i2;
                        iOooO0Oo2 = i;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } finally {
                }
            default:
                C34897o00o0OO c34897o00o0OO = (C34897o00o0OO) this.f125114OooOoO0;
                c34897o00o0OO.getClass();
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PageEntity where id = ?");
                String str3 = this.f125112OooOo;
                try {
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str3);
                    }
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_spec");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_orientation");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, LayerInfo.PAPER_THEME_LAYER_ID);
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_color");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_padding");
                    int iOooO0Oo20 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_style_json");
                    int iOooO0Oo21 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo22 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo23 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo24 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded");
                    int iOooO0Oo25 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source");
                    int iOooO0Oo26 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_id");
                    int iOooO0Oo27 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_title");
                    int iOooO0Oo28 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_index");
                    int iOooO0Oo29 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo30 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "history_page_id_list");
                    int iOooO0Oo31 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation_direction_index");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        pageEntity = new PageEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo15) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo15), C34897o00o0OO.OooOOO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo16)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo17) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo17), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo18), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo19) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo19), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo20) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo20), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo21), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo22), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo23) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo23), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo24)) != 0, (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo25), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo26) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo26), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo27) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo27), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo28), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo29)) != 0, c34897o00o0OO.f125434OooO0OO.stringToChildren(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo30) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo30)), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo31));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return pageEntity;
                } finally {
                }
        }
    }

    public /* synthetic */ o00000O(C34897o00o0OO c34897o00o0OO, String str) {
        this.f125114OooOoO0 = c34897o00o0OO;
        this.f125112OooOo = str;
    }
}
