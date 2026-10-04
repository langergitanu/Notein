package o0OO0o0O;

import com.orion.notein.domain.models.note.ColorSet;
import java.io.Serializable;
import java.util.List;
import o000O0oO.OooOO0;
import o000oo0.C24664OooOO0O;
import o00OO0oO.C25003OooO0O0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33716OooO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.OooOo;
import oo0oO0.InterfaceC34723Oooo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25003OooO0O0 f93457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f93458OooO0O0;

    public OooO(C25003OooO0O0 c25003OooO0O0, OooOO0 oooOO02) {
        this.f93457OooO00o = c25003OooO0O0;
        this.f93458OooO0O0 = oooOO02;
    }

    public final Object OooO00o(ColorSet colorSet, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C25003OooO0O0 c25003OooO0O0 = this.f93457OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26920OooO00o(c25003OooO0O0, colorSet, null), abstractC32479OooO0OO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0O0(String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C25003OooO0O0 c25003OooO0O0 = this.f93457OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26921OooO0O0(c25003OooO0O0, str, null), abstractC32476OooO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26925OooO0oo c26925OooO0oo;
        OooO oooO;
        List list;
        if (abstractC32479OooO0OO instanceof C26925OooO0oo) {
            c26925OooO0oo = (C26925OooO0oo) abstractC32479OooO0OO;
            int i2 = c26925OooO0oo.f93489OooOoOO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26925OooO0oo.f93489OooOoOO = i2 - Integer.MIN_VALUE;
            } else {
                c26925OooO0oo = new C26925OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26925OooO0oo.f93488OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c26925OooO0oo.f93489OooOoOO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            C33716OooO c33716OooO = new C33716OooO((List) this.f93458OooO0O0.f82424OooO00o);
            c26925OooO0oo.f93486OooOo0o = this;
            c26925OooO0oo.f93485OooOo = i;
            c26925OooO0oo.f93489OooOoOO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(c33716OooO, c26925OooO0oo);
            if (objOooOOo != enumC32485OooO00o) {
                oooO = this;
            }
            return enumC32485OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c26925OooO0oo.f93486OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            return OooOo.OooooOO((List) objOooOOo, list);
        }
        i = c26925OooO0oo.f93485OooOo;
        oooO = (OooO) c26925OooO0oo.f93486OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        List list2 = (List) objOooOOo;
        C25003OooO0O0 c25003OooO0O0 = oooO.f93457OooO00o;
        C24664OooOO0O c24664OooOO0O = new C24664OooOO0O(((InterfaceC34723Oooo) c25003OooO0O0.f84821OooO00o).OooO0Oo(i), c25003OooO0O0, 1);
        c26925OooO0oo.f93486OooOo0o = list2;
        c26925OooO0oo.f93489OooOoOO = 2;
        Object objOooOOo2 = C25252OooO0Oo.OooOOo(c24664OooOO0O, c26925OooO0oo);
        if (objOooOOo2 != enumC32485OooO00o) {
            objOooOOo = objOooOOo2;
            list = list2;
            return OooOo.OooooOO((List) objOooOOo, list);
        }
        return enumC32485OooO00o;
    }
}
