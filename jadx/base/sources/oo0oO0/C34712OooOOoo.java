package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.p602db.NoteAiDatabase_Impl;
import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import com.orion.notein.data.p602db.entity.typeconvert.BundleConverter;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0o0OO0.C30397OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Oo.C33165OooO00o;

/* JADX INFO: renamed from: oo0oO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34712OooOOoo implements InterfaceC34708OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteAiDatabase_Impl f125014OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final BundleConverter f125016OooO0OO = new BundleConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34711OooOOo0 f125015OooO0O0 = new C34711OooOOo0(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34710OooOOo f125017OooO0Oo = new C34710OooOOo(this);

    public C34712OooOOoo(NoteAiDatabase_Impl noteAiDatabase_Impl) {
        this.f125014OooO00o = noteAiDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34708OooOO0o
    public final C24718OooOO0o OooO00o(final List list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("SELECT * FROM AiOcrTextPageEntity where id in ("), list);
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOOOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                C34712OooOOoo c34712OooOOoo = this.f125007OooOo0o;
                c34712OooOOoo.getClass();
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
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_type");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_uri");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.CONTENT);
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new AiOcrTextPageEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), c34712OooOOoo.f125016OooO0OO.stringToBundle(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7))));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125014OooO00o, new String[]{"AiOcrTextPageEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34708OooOO0o
    public final Object OooO0O0(final String str, C30397OooOOOo c30397OooOOOo) {
        return C24734OooO0O0.OooO0oo(c30397OooOOOo, this.f125014OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.OooOOO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from AiOcrTextPageEntity where id= ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
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

    @Override // oo0oO0.InterfaceC34708OooOO0o
    public final Object OooO0OO(AiOcrTextPageEntity[] aiOcrTextPageEntityArr, C33165OooO00o c33165OooO00o) {
        aiOcrTextPageEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c33165OooO00o, this.f125014OooO00o, new C34709OooOOOo(0, this, aiOcrTextPageEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34708OooOO0o
    public final Object OooO0Oo(AiOcrTextPageEntity aiOcrTextPageEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125014OooO00o, new OooOOO(0, this, aiOcrTextPageEntity), false, true);
    }
}
