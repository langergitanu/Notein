package o0OOOOoO;

import OooO0o.C20424OooO0Oo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import o0Oo00o.C28028OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OOOOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.textboxinfo.TextBoxInfoLocalDataSource$clearInvalidTextStyle$2", m80623f = "TextBoxInfoLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27162OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Map<Integer, Object> f94807OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f94808OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27162OooO0O0(Map<Integer, ? extends Object> map, Continuation<? super C27162OooO0O0> continuation) {
        super(2, continuation);
        this.f94807OooOo = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27162OooO0O0 c27162OooO0O0 = new C27162OooO0O0(this.f94807OooOo, continuation);
        c27162OooO0O0.f94808OooOo0o = obj;
        return c27162OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27162OooO0O0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f94808OooOo0o;
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(this.f94807OooOo);
        boolean z2 = true;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(linkedHashMapOooOOOO.get(new Integer(10)), "多种字体")) {
            linkedHashMapOooOOOO.put(new Integer(10), "");
            z = true;
        } else {
            z = false;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(C20424OooO0Oo.OooO0Oo(13, linkedHashMapOooOOOO), new Integer(-1))) {
            linkedHashMapOooOOOO.put(new Integer(13), new Integer(30));
        } else {
            z2 = z;
        }
        linkedHashMapOooOOOO.remove(new Integer(5));
        linkedHashMapOooOOOO.remove(new Integer(6));
        linkedHashMapOooOOOO.remove(new Integer(4));
        linkedHashMapOooOOOO.remove(new Integer(3));
        if (z2) {
            c24334OooO0O0.OooO0oO(OooOOO.f94840OooO0o0, C28028OooO0o.OooO00o().toJson(linkedHashMapOooOOOO));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
