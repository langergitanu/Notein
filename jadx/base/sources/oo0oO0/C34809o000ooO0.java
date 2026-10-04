package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o000ooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34809o000ooO0 implements InterfaceC34797o000o0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125228OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34807o000oo0o f125229OooO0O0 = new C34807o000oo0o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34803o000oo f125230OooO0OO = new C34803o000oo();

    public C34809o000ooO0(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125228OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34797o000o0o
    public final Object OooO00o(final List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM MyTemplateEntity where id in ("), list);
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125228OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000oo0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
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

    @Override // oo0oO0.InterfaceC34797o000o0o
    public final Object OooO0O0(o0OOOO00.OooOOO oooOOO) {
        return C24734OooO0O0.OooO0oo(oooOOO, this.f125228OooO00o, new C34800o000o0oo(), true, false);
    }

    @Override // oo0oO0.InterfaceC34797o000o0o
    public final Object OooO0OO(MyTemplateEntity[] myTemplateEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125228OooO00o, new C34799o000o0oO(0, this, myTemplateEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34797o000o0o
    public final Object OooO0Oo(final MyTemplateEntity[] myTemplateEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        myTemplateEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125228OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000oo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125223OooOo0o.f125229OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, myTemplateEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34797o000o0o
    public final Object OooO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125228OooO00o, new C34805o000oo00(str, 0), true, false);
    }

    @Override // oo0oO0.InterfaceC34797o000o0o
    public final C24718OooOO0o OooO0o0() {
        C34802o000oOoo c34802o000oOoo = new C34802o000oOoo();
        return C24720OooOOO0.OooO00o(this.f125228OooO00o, new String[]{"MyTemplateEntity"}, c34802o000oOoo);
    }
}
