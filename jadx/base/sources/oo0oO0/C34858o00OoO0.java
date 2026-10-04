package oo0oO0;

import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00OoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34858o00OoO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f125364OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125365OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f125366OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f125367OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List f125368OooOoOO;

    public /* synthetic */ C34858o00OoO0(String str, List list, int i, String str2, int i2) {
        this.f125365OooOo0o = i2;
        this.f125364OooOo = str;
        this.f125368OooOoOO = list;
        this.f125367OooOoO0 = i;
        this.f125366OooOoO = str2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo;
        switch (this.f125365OooOo0o) {
            case 0:
                List<String> list = this.f125368OooOoOO;
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(this.f125364OooOo);
                try {
                    int i = 1;
                    for (String str : list) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    int i2 = this.f125367OooOoO0 + 1;
                    String str2 = this.f125366OooOoO;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } finally {
                }
            default:
                ArrayList<String> arrayList = (ArrayList) this.f125368OooOoOO;
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(this.f125364OooOo);
                try {
                    int i3 = 1;
                    for (String str3 : arrayList) {
                        if (str3 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i3);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i3, str3);
                        }
                        i3++;
                    }
                    int i4 = this.f125367OooOoO0 + 1;
                    String str4 = this.f125366OooOoO;
                    if (str4 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i4);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i4, str4);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } finally {
                }
        }
    }
}
