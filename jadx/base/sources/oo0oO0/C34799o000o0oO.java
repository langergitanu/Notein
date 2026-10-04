package oo0oO0;

import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o000o0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34799o000o0oO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125218OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125219OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125220OooOoO0;

    public /* synthetic */ C34799o000o0oO(int i, Object obj, Object obj2) {
        this.f125219OooOo0o = i;
        this.f125218OooOo = obj;
        this.f125220OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f125219OooOo0o) {
            case 0:
                ((C34809o000ooO0) this.f125218OooOo).f125230OooO0OO.OoooOOO((InterfaceC24747OooO0O0) obj, (MyTemplateEntity[]) this.f125220OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            default:
                ArrayList<String> arrayList = (ArrayList) this.f125220OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f125218OooOo);
                try {
                    int i = 1;
                    for (String str : arrayList) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    Integer numValueOf = Integer.valueOf(interfaceC24749OooO0OoO0ooOOo.o00oO0o() ? (int) interfaceC24749OooO0OoO0ooOOo.getLong(0) : 0);
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return numValueOf;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
