package o0o0OO0;

import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31088OoooooO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OO0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$sessionVOList$1", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30404OooOo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends AiOcrSession>, AiOcrSession, Continuation<? super List<? extends C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AiOcrSession f108576OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f108577OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108578OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30404OooOo0o(Continuation continuation, C30394OooOOOO c30394OooOOOO) {
        super(3, continuation);
        this.f108578OooOoO0 = c30394OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends AiOcrSession> list, AiOcrSession aiOcrSession, Continuation<? super List<? extends C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>>>> continuation) {
        C30404OooOo0o c30404OooOo0o = new C30404OooOo0o(continuation, this.f108578OooOoO0);
        c30404OooOo0o.f108577OooOo0o = list;
        c30404OooOo0o.f108576OooOo = aiOcrSession;
        return c30404OooOo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f108577OooOo0o;
        AiOcrSession aiOcrSession = this.f108576OooOo;
        String id = aiOcrSession != null ? aiOcrSession.getId() : null;
        this.f108578OooOoO0.getClass();
        List<AiOcrSession> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (AiOcrSession aiOcrSession2 : list2) {
            arrayList.add(new C31088OoooooO(aiOcrSession2.getId(), aiOcrSession2.getTitle(), aiOcrSession2.getLastModificationTime(), kotlin.jvm.internal.OooOOO0.OooO0O0(aiOcrSession2.getId(), id)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C31088OoooooO) obj2).f110957OooO0Oo > System.currentTimeMillis() - C18385v2.f56338j) {
                arrayList2.add(obj2);
            }
        }
        List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList2, new C30387OooO0oO());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            C31088OoooooO c31088OoooooO = (C31088OoooooO) obj3;
            if (c31088OoooooO.f110957OooO0Oo > System.currentTimeMillis() - 604800000) {
                if (c31088OoooooO.f110957OooO0Oo <= System.currentTimeMillis() - C18385v2.f56338j) {
                    arrayList3.add(obj3);
                }
            }
        }
        List listO00O0O2 = oOo000Oo.OooOo.o00O0O(arrayList3, new C30388OooO0oo());
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList) {
            C31088OoooooO c31088OoooooO2 = (C31088OoooooO) obj4;
            if (c31088OoooooO2.f110957OooO0Oo > System.currentTimeMillis() - 2592000000L) {
                if (c31088OoooooO2.f110957OooO0Oo <= System.currentTimeMillis() - 604800000) {
                    arrayList4.add(obj4);
                }
            }
        }
        List listO00O0O3 = oOo000Oo.OooOo.o00O0O(arrayList4, new C30380OooO());
        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
        if (!listO00O0O.isEmpty()) {
            c32465OooO0O0OooO0Oo.add(new C32443OooOOO(C31088OoooooO.OooO00o.f110959OooOo0o, listO00O0O));
        }
        if (!listO00O0O2.isEmpty()) {
            c32465OooO0O0OooO0Oo.add(new C32443OooOOO(C31088OoooooO.OooO00o.f110958OooOo, listO00O0O2));
        }
        if (!listO00O0O3.isEmpty()) {
            c32465OooO0O0OooO0Oo.add(new C32443OooOOO(C31088OoooooO.OooO00o.f110961OooOoO0, listO00O0O3));
        }
        return com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
    }
}
