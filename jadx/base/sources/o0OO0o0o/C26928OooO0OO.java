package o0OO0o0o;

import com.google.gson.stream.JsonReader;
import com.orion.notein.domain.models.CountryCode;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OO0o0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26928OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f93494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<CountryCode> f93495OooO0O0;

    public C26928OooO0OO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f93494OooO00o = abstractApplicationC26277OooOoOO;
    }

    public final List OooO00o() throws IOException {
        List<CountryCode> list = this.f93495OooO0O0;
        if (list != null) {
            return list;
        }
        InputStream inputStreamOpen = this.f93494OooO00o.getResources().getAssets().open("regioncode/countryCode.json");
        OooOOO0.OooO0o(inputStreamOpen, "open(...)");
        Object objFromJson = C28028OooO0o.OooO00o().fromJson(new JsonReader(new InputStreamReader(inputStreamOpen)), new C26926OooO00o().getType());
        OooOOO0.OooO0o(objFromJson, "fromJson(...)");
        List<CountryCode> listO0ooOO0 = OooOo.o0ooOO0((Iterable) objFromJson);
        this.f93495OooO0O0 = listO0ooOO0;
        return listO0ooOO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C26927OooO0O0 c26927OooO0O0;
        if (abstractC32479OooO0OO instanceof C26927OooO0O0) {
            c26927OooO0O0 = (C26927OooO0O0) abstractC32479OooO0OO;
            int i = c26927OooO0O0.f93492OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26927OooO0O0.f93492OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26927OooO0O0 = new C26927OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26927OooO0O0.f93490OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26927OooO0O0.f93492OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26927OooO0O0.f93491OooOo0o = str;
            c26927OooO0O0.f93492OooOoO = 1;
            objOooO00o = OooO00o();
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c26927OooO0O0.f93491OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objOooO00o) {
            CountryCode countryCode = (CountryCode) obj;
            if (C33599OooOo0O.OooOoOO(countryCode.getCode(), str, false) || C33599OooOo0O.OooOoOO(countryCode.getEnName(), str, false) || C33599OooOo0O.OooOoOO(countryCode.getZhName(), str, false) || C33599OooOo0O.OooOoOO(countryCode.getPinyinName(), str, false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
