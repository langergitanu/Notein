package o0o0OO0;

import android.net.Uri;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* JADX INFO: renamed from: o0o0OO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$changeInputSource$2", m80623f = "AiOcrViewModel.kt", m80624l = {570, 583, 593, 595}, m80625m = "invokeSuspend")
public final class C30386OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AiOcrSession>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AiOcrSessionInputSource f108454OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AiOcrSession f108455OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108456OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f108457OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f108458OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f108459OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f108460OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f108461OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30386OooO0o0(C30394OooOOOO c30394OooOOOO, String str, int i, List<? extends Uri> list, String str2, Continuation<? super C30386OooO0o0> continuation) {
        super(2, continuation);
        this.f108456OooOoO = c30394OooOOOO;
        this.f108458OooOoOO = str;
        this.f108460OooOoo0 = i;
        this.f108459OooOoo = list;
        this.f108461OooOooO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30386OooO0o0(this.f108456OooOoO, this.f108458OooOoOO, this.f108460OooOoo0, this.f108459OooOoo, this.f108461OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AiOcrSession> continuation) {
        return ((C30386OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        AiOcrSessionInputSource aiOcrSessionInputSource;
        AiOcrSession aiOcrSessionCopy$default;
        Object objOooO0Oo;
        AiOcrSession aiOcrSession;
        InterfaceC27288OooO0OO interfaceC27288OooO0OO;
        AiOcrSessionInputSource aiOcrSessionInputSource2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108457OooOoO0;
        String str = this.f108458OooOoOO;
        C30394OooOOOO c30394OooOOOO = this.f108456OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27288OooO0OO interfaceC27288OooO0OO2 = c30394OooOOOO.f108495OooO0o0;
            this.f108457OooOoO0 = 1;
            objOooO0O0 = interfaceC27288OooO0OO2.OooO0O0(str, this);
            if (objOooO0O0 != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                C32446OooOOOo.OooO0O0(obj);
                this.f108457OooOoO0 = 4;
                Object objOooO0oO = C30394OooOOOO.OooO0oO(c30394OooOOOO, str, this);
                return objOooO0oO != enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
            }
            AiOcrSessionInputSource aiOcrSessionInputSource3 = this.f108454OooOo;
            AiOcrSession aiOcrSession2 = this.f108455OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            aiOcrSessionInputSource = aiOcrSessionInputSource3;
            aiOcrSession = aiOcrSession2;
            objOooO0Oo = obj;
            aiOcrSessionInputSource2 = (AiOcrSessionInputSource) objOooO0Oo;
            if (aiOcrSessionInputSource2 != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrViewModel");
                c20358OooO00o.OooO0OO("Failed to save input source. " + aiOcrSessionInputSource, new Object[0]);
                return null;
            }
            aiOcrSessionCopy$default = AiOcrSession.copy$default(aiOcrSession, null, null, null, null, aiOcrSessionInputSource2, 0L, 0L, 111, null);
            interfaceC27288OooO0OO = c30394OooOOOO.f108495OooO0o0;
            this.f108455OooOo0o = null;
            this.f108454OooOo = null;
            this.f108457OooOoO0 = 3;
            if (interfaceC27288OooO0OO.OooO0oo(aiOcrSessionCopy$default, this) != enumC32485OooO00o) {
                this.f108457OooOoO0 = 4;
                Object objOooO0oO2 = C30394OooOOOO.OooO0oO(c30394OooOOOO, str, this);
                if (objOooO0oO2 != enumC32485OooO00o) {
                }
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0O0 = obj;
        AiOcrSession aiOcrSession3 = (AiOcrSession) objOooO0O0;
        if (aiOcrSession3 == null) {
            return null;
        }
        String strOooO00o = C24761OooO.OooO00o("toString(...)");
        List<Uri> list = this.f108459OooOoo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            arrayList.add(string);
        }
        aiOcrSessionInputSource = new AiOcrSessionInputSource(strOooO00o, this.f108460OooOoo0, arrayList, null, 8, null);
        String str2 = this.f108461OooOooO;
        if (str2 != null) {
            aiOcrSessionInputSource.setPdfPassword(str2);
        }
        if (this.f108460OooOoo0 == 3) {
            aiOcrSessionCopy$default = AiOcrSession.copy$default(aiOcrSession3, null, null, null, null, aiOcrSessionInputSource, 0L, 0L, 111, null);
            interfaceC27288OooO0OO = c30394OooOOOO.f108495OooO0o0;
            this.f108455OooOo0o = null;
            this.f108454OooOo = null;
            this.f108457OooOoO0 = 3;
            if (interfaceC27288OooO0OO.OooO0oo(aiOcrSessionCopy$default, this) != enumC32485OooO00o) {
            }
        }
        InterfaceC27288OooO0OO interfaceC27288OooO0OO3 = c30394OooOOOO.f108495OooO0o0;
        this.f108455OooOo0o = aiOcrSession3;
        this.f108454OooOo = aiOcrSessionInputSource;
        this.f108457OooOoO0 = 2;
        objOooO0Oo = interfaceC27288OooO0OO3.OooO0Oo(str, aiOcrSessionInputSource, this);
        if (objOooO0Oo != enumC32485OooO00o) {
            aiOcrSession = aiOcrSession3;
            aiOcrSessionInputSource2 = (AiOcrSessionInputSource) objOooO0Oo;
            if (aiOcrSessionInputSource2 != null) {
            }
        }
    }
}
