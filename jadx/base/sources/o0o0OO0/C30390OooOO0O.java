package o0o0OO0;

import android.net.Uri;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOo0Oo.InterfaceC27288OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OO0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$createNewSession$2", m80623f = "AiOcrViewModel.kt", m80624l = {494, 500, 521, 537, 538}, m80625m = "invokeSuspend")
public final class C30390OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AiOcrSession>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f108464OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f108465OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AiOcrSessionInputSource f108466OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f108467OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f108468OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f108469OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108470OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ int f108471OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f108472OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f108473Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30390OooOO0O(C30394OooOOOO c30394OooOOOO, String str, int i, List<? extends Uri> list, String str2, Continuation<? super C30390OooOO0O> continuation) {
        super(2, continuation);
        this.f108470OooOoo0 = c30394OooOOOO;
        this.f108469OooOoo = str;
        this.f108471OooOooO = i;
        this.f108472OooOooo = list;
        this.f108473Oooo000 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30390OooOO0O(this.f108470OooOoo0, this.f108469OooOoo, this.f108471OooOooO, this.f108472OooOooo, this.f108473Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AiOcrSession> continuation) {
        return ((C30390OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[LOOP:0: B:28:0x008d->B:30:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef A[LOOP:2: B:38:0x00e9->B:40:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0O;
        String str;
        Object objOooO0oO;
        Iterator it;
        Set setO0OO00O;
        String str2;
        String str3;
        Iterator<T> it2;
        String str4;
        Object objOooO0Oo;
        String str5;
        AiOcrSessionInputSource aiOcrSessionInputSource;
        String str6;
        String str7;
        AiOcrSessionInputSource aiOcrSessionInputSource2;
        String str8;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108468OooOoOO;
        C30394OooOOOO c30394OooOOOO = this.f108470OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108468OooOoOO = 1;
            objOooOO0O = c30394OooOOOO.OooOO0O(this);
            if (objOooOO0O != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return obj;
                    }
                    str8 = this.f108465OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f108465OooOo0o = null;
                    this.f108468OooOoOO = 5;
                    Object objOooO0oO2 = C30394OooOOOO.OooO0oO(c30394OooOOOO, str8, this);
                    return objOooO0oO2 != enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO2;
                }
                aiOcrSessionInputSource = this.f108466OooOoO;
                String str9 = this.f108467OooOoO0;
                String str10 = this.f108464OooOo;
                String str11 = this.f108465OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str7 = str9;
                str6 = str10;
                str5 = str11;
                objOooO0Oo = obj;
                aiOcrSessionInputSource2 = (AiOcrSessionInputSource) objOooO0Oo;
                if (aiOcrSessionInputSource2 != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("AiOcrViewModel");
                    c20358OooO00o.OooO0OO("Failed to save input source. " + aiOcrSessionInputSource, new Object[0]);
                    return null;
                }
                AiOcrSession aiOcrSession = new AiOcrSession(str7, str5, str6, C34434OooOoO.f123453OooOo0o, aiOcrSessionInputSource2, System.currentTimeMillis(), System.currentTimeMillis());
                InterfaceC27288OooO0OO interfaceC27288OooO0OO = c30394OooOOOO.f108495OooO0o0;
                this.f108465OooOo0o = str7;
                this.f108464OooOo = null;
                this.f108467OooOoO0 = null;
                this.f108466OooOoO = null;
                this.f108468OooOoOO = 4;
                if (interfaceC27288OooO0OO.OooO0o(aiOcrSession, this) != enumC32485OooO00o) {
                    str8 = str7;
                    this.f108465OooOo0o = null;
                    this.f108468OooOoOO = 5;
                    Object objOooO0oO22 = C30394OooOOOO.OooO0oO(c30394OooOOOO, str8, this);
                    if (objOooO0oO22 != enumC32485OooO00o) {
                    }
                }
            }
            str = this.f108465OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0oO = obj;
            Iterable iterable = (Iterable) objOooO0oO;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((AiOcrSession) it.next()).getTitle());
            }
            setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
            str2 = this.f108469OooOoo;
            str3 = str2;
            for (int i2 = 1; setO0OO00O.contains(str3) && i2 < 100; i2++) {
                str3 = str2 + " (" + i2 + ")";
            }
            String strOooO00o = C24761OooO.OooO00o("toString(...)");
            String strOooO00o2 = C24761OooO.OooO00o("toString(...)");
            List<Uri> list = this.f108472OooOooo;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            it2 = list.iterator();
            while (it2.hasNext()) {
                String string = ((Uri) it2.next()).toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                arrayList2.add(string);
            }
            AiOcrSessionInputSource aiOcrSessionInputSource3 = new AiOcrSessionInputSource(strOooO00o2, this.f108471OooOooO, arrayList2, null, 8, null);
            str4 = this.f108473Oooo000;
            if (str4 != null) {
                aiOcrSessionInputSource3.setPdfPassword(str4);
            }
            InterfaceC27288OooO0OO interfaceC27288OooO0OO2 = c30394OooOOOO.f108495OooO0o0;
            this.f108465OooOo0o = str;
            this.f108464OooOo = str3;
            this.f108467OooOoO0 = strOooO00o;
            this.f108466OooOoO = aiOcrSessionInputSource3;
            this.f108468OooOoOO = 3;
            objOooO0Oo = interfaceC27288OooO0OO2.OooO0Oo(strOooO00o, aiOcrSessionInputSource3, this);
            if (objOooO0Oo != enumC32485OooO00o) {
                String str12 = str3;
                str5 = str;
                aiOcrSessionInputSource = aiOcrSessionInputSource3;
                str6 = str12;
                str7 = strOooO00o;
                aiOcrSessionInputSource2 = (AiOcrSessionInputSource) objOooO0Oo;
                if (aiOcrSessionInputSource2 != null) {
                }
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0O = obj;
        str = (String) objOooOO0O;
        if (str == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("AiOcrViewModel");
            c20358OooO00o2.OooO0OO("createNewSession failed. User not found.", new Object[0]);
            return null;
        }
        InterfaceC27288OooO0OO interfaceC27288OooO0OO3 = c30394OooOOOO.f108495OooO0o0;
        this.f108465OooOo0o = str;
        this.f108468OooOoOO = 2;
        objOooO0oO = interfaceC27288OooO0OO3.OooO0oO(str, this);
        if (objOooO0oO != enumC32485OooO00o) {
            Iterable iterable2 = (Iterable) objOooO0oO;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList3);
            str2 = this.f108469OooOoo;
            str3 = str2;
            while (setO0OO00O.contains(str3)) {
                str3 = str2 + " (" + i2 + ")";
            }
            String strOooO00o3 = C24761OooO.OooO00o("toString(...)");
            String strOooO00o22 = C24761OooO.OooO00o("toString(...)");
            List<Uri> list2 = this.f108472OooOooo;
            ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            it2 = list2.iterator();
            while (it2.hasNext()) {
            }
            AiOcrSessionInputSource aiOcrSessionInputSource32 = new AiOcrSessionInputSource(strOooO00o22, this.f108471OooOooO, arrayList22, null, 8, null);
            str4 = this.f108473Oooo000;
            if (str4 != null) {
            }
            InterfaceC27288OooO0OO interfaceC27288OooO0OO22 = c30394OooOOOO.f108495OooO0o0;
            this.f108465OooOo0o = str;
            this.f108464OooOo = str3;
            this.f108467OooOoO0 = strOooO00o3;
            this.f108466OooOoO = aiOcrSessionInputSource32;
            this.f108468OooOoOO = 3;
            objOooO0Oo = interfaceC27288OooO0OO22.OooO0Oo(strOooO00o3, aiOcrSessionInputSource32, this);
            if (objOooO0Oo != enumC32485OooO00o) {
            }
        }
    }
}
