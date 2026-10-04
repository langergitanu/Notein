package oo0oO0;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.ColorSetConverter;
import com.orion.notein.data.p602db.entity.ColorSetEntity;
import java.util.ArrayList;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO0o0O.C26920OooO00o;
import o0OO0o0O.C26921OooO0O0;
import o0OO0o0O.C26923OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34738OoooOOo implements InterfaceC34723Oooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125072OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ColorSetConverter f125074OooO0OO = new ColorSetConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34801o000oOoO f125073OooO0O0 = new C34801o000oOoO(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34737OoooOOO f125075OooO0Oo = new C34737OoooOOO(this);

    public C34738OoooOOo(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125072OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34723Oooo
    public final Object OooO00o(ColorSetEntity colorSetEntity, C26923OooO0o0 c26923OooO0o0) {
        return C24734OooO0O0.OooO0oo(c26923OooO0o0, this.f125072OooO00o, new C34735OoooO0O(0, this, colorSetEntity), false, true);
    }

    @Override // oo0oO0.InterfaceC34723Oooo
    public final Object OooO0O0(final ColorSetEntity colorSetEntity, C26920OooO00o c26920OooO00o) {
        return C24734OooO0O0.OooO0oo(c26920OooO00o, this.f125072OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OoooO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125063OooOo0o.f125073OooO0O0.OooOoOO((InterfaceC24747OooO0O0) obj, colorSetEntity);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34723Oooo
    public final Object OooO0OO(final String str, o0OO0o0O.OooO0OO oooO0OO) {
        return C24734OooO0O0.OooO0oo(oooO0OO, this.f125072OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OoooO00
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
                C34738OoooOOo c34738OoooOOo = this.f125065OooOo0o;
                c34738OoooOOo.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from ColorSetEntity where id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "colors");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bg_color");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "fg_color");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "category");
                    ColorSetEntity colorSetEntity = null;
                    String strO000OoO = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        }
                        colorSetEntity = new ColorSetEntity(strO000OoO2, strO000OoO3, c34738OoooOOo.f125074OooO0OO.stringToColors(strO000OoO), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return colorSetEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34723Oooo
    public final C24718OooOO0o OooO0Oo(final int i) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.OoooOO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                C34738OoooOOo c34738OoooOOo = this.f125070OooOo0o;
                c34738OoooOOo.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from ColorSetEntity where category = ? order by creation_time desc");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, i2);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "colors");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bg_color");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "fg_color");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "category");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        }
                        int i3 = iOooO0Oo;
                        arrayList.add(new ColorSetEntity(strO000OoO2, strO000OoO3, c34738OoooOOo.f125074OooO0OO.stringToColors(strO000OoO), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)));
                        iOooO0Oo = i3;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125072OooO00o, new String[]{"ColorSetEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34723Oooo
    public final Object OooO0o0(String str, C26921OooO0O0 c26921OooO0O0) {
        return C24734OooO0O0.OooO0oo(c26921OooO0O0, this.f125072OooO00o, new C34732OoooO(str, 0), false, true);
    }
}
